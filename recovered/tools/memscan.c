/* Read-only scanner for one explicitly supplied process and address list.
 * Freestanding Linux x86_64; outputs pattern names and addresses, never memory contents.
 */
typedef unsigned long U;
static unsigned char buf[1048576 + 64];
static char ranges[262144];
static U seen[9], scanned, regions;
static long sys4(long n,long a,long b,long c,long d){
 register long r10 __asm__("r10")=d; long result;
 __asm__ volatile("syscall":"=a"(result):"a"(n),"D"(a),"S"(b),"d"(c),"r"(r10):"rcx","r11","memory");
 return result;
}
static U len(const char*s){U n=0;while(s[n])n++;return n;}
static void text(const char*s){sys4(1,1,(long)s,len(s),0);}
static void number(U n){char b[32];U i=0;do{b[i++]="0123456789abcdef"[n&15];n>>=4;}while(n);text("0x");while(i)sys4(1,1,(long)&b[--i],1,0);}
static U hex(char**p){U v=0;while(**p==' '||**p=='\n')(*p)++;while(1){unsigned char c=**p;U d;if(c>='0'&&c<='9')d=c-'0';else if(c>='a'&&c<='f')d=c-'a'+10;else if(c>='A'&&c<='F')d=c-'A'+10;else break;v=(v<<4)|d;(*p)++;}return v;}
static int eq(unsigned char*p,const char*s){while(*s)if(*p++!=(unsigned char)*s++)return 0;return 1;}
static void hit(U kind,U addr){static const char*names[]={"DEX","ELF","JS_INTERCEPTOR","JS_MODULE","JS_NATIVEFUNCTION","JS_JAVA","JS_FUNCTION","LUA","JS_RPC"};if(seen[kind]++<400){text(names[kind]);text(" ");number(addr);text("\n");}}
void mainstart(U*stack){
 U argc=stack[0];char**argv=(char**)&stack[1];if(argc!=3){text("usage: memscan PID RANGES\n");return;}
 char path[80]="/proc/";U n=6;for(U j=0;argv[1][j]&&n<60;j++)path[n++]=argv[1][j];const char*s="/mem";while(*s)path[n++]=*s++;path[n]=0;
 long fd=sys4(2,(long)path,0,0,0),rf=sys4(2,(long)argv[2],0,0,0);if(fd<0||rf<0){text("open failed\n");return;}
 long count=sys4(0,rf,(long)ranges,sizeof(ranges)-1,0);if(count<0)return;ranges[count]=0;char*p=ranges;
 while(*p){U start=hex(&p),end=hex(&p);while(*p&&*p!='\n')p++;if(*p)p++;if(end<=start||end-start>536870912)continue;regions++;
  for(U pos=start;pos<end;){U size=end-pos;if(size>1048576)size=1048576;U extra=end-pos-size;if(extra>32)extra=32;
   long got=sys4(17,fd,(long)buf,size+extra,pos);if(got<=0){pos+=4096;continue;}scanned+=got;U stop=got<size?(U)got:size;
   for(U i=0;i<stop&&i+25<(U)got;i++){
    unsigned char*b=buf+i;switch(*b){
     case 'd':if(eq(b,"dex\n")&&b[4]>='0'&&b[4]<='9'&&b[7]==0)hit(0,pos+i);break;
     case 127:if(eq(b,"\177ELF")&&(b[4]==1||b[4]==2)&&b[5]==1)hit(1,pos+i);break;
     case 'I':if(eq(b,"Interceptor.attach")||eq(b,"Interceptor.replace"))hit(2,pos+i);break;
     case 'M':if(eq(b,"Module.findExportByName")||eq(b,"Module.getBaseAddress"))hit(3,pos+i);break;
     case 'n':if(eq(b,"new NativeFunction"))hit(4,pos+i);break;
     case 'J':if(eq(b,"Java.perform"))hit(5,pos+i);break;
     case 'f':if(eq(b,"function "))hit(6,pos+i);break;
     case 27:if(eq(b,"\033Lua"))hit(7,pos+i);break;
     case 'r':if(eq(b,"rpc.exports"))hit(8,pos+i);break;
    }
   }pos+=stop;if(!stop)break;
  }
 }
 text("SCANNED ");number(scanned);text(" REGIONS ");number(regions);text("\n");
 for(U i=0;i<9;i++){text("COUNT ");number(i);text(" ");number(seen[i]);text("\n");}
}
__asm__(".global _start\n_start:\nmov %rsp,%rdi\nandq $-16,%rsp\ncall mainstart\nmov $60,%rax\nxor %rdi,%rdi\nsyscall\n");
