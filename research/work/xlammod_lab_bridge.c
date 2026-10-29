/* In-process diagnostics for the separately signed com.xlammod.client build.
 * No network or cross-process access. The caller supplies known FUSION RVAs.
 */
typedef unsigned long U;
typedef long J;
#define EXPORT __attribute__((visibility("default")))
static long sys3(long n,long a,long b,long c){
 register long r0 __asm__("x0")=a,r1 __asm__("x1")=b,r2 __asm__("x2")=c,r8 __asm__("x8")=n;
 __asm__ volatile("svc #0":"+r"(r0):"r"(r1),"r"(r2),"r"(r8):"memory","cc");return r0;
}
static int contains(const char*p,U n,const char*s){for(U i=0;i<n;i++){U j=0;while(i+j<n&&s[j]&&p[i+j]==s[j])j++;if(!s[j])return 1;}return 0;}
static U module_base(void){
 char buf[65536];long fd=sys3(56,-100,(long)"/proc/self/maps",0);if(fd<0)return 0;
 long size=0,got;while(size<(long)sizeof(buf)-1){got=sys3(63,fd,(long)(buf+size),sizeof(buf)-1-size);if(got<=0)break;size+=got;}sys3(57,fd,0,0);buf[size]=0;
 for(U pos=0;pos<(U)size;){U end=pos;while(end<(U)size&&buf[end]!='\n')end++;
  if(contains(buf+pos,end-pos,"/libFUSION.so")&&contains(buf+pos,end-pos,"com.xlammod.client-")){
   U address=0;for(U i=pos;i<end;i++){char c=buf[i];U v;if(c>='0'&&c<='9')v=c-'0';else if(c>='a'&&c<='f')v=c-'a'+10;else break;address=(address<<4)|v;}return address;
  }pos=end+1;
 }return 0;
}
EXPORT int JNI_OnLoad(void*a,void*b){return 0x10006;}
EXPORT J Java_com_xlammod_lab_NativeBootstrap_base(void*e,void*c){return module_base();}
EXPORT J Java_com_xlammod_lab_NativeBootstrap_read32(void*e,void*c,J off){U b=module_base();if(!b||off<0||off>0x900000)return -1;return *(volatile unsigned int*)(b+off);}
EXPORT void Java_com_xlammod_lab_NativeBootstrap_put32(void*e,void*c,J off,int value){U b=module_base();if(!b||off<0x844000||off>0x900000)return;*(volatile unsigned int*)(b+off)=value;}
EXPORT J Java_com_xlammod_lab_NativeBootstrap_call(void*e,void*c,J off,J a,J b){U base=module_base();if(!base||off<0x30000||off>=0x844000)return -1;return ((J(*)(J,J))(base+off))(a,b);}
static volatile U kept_count;
static U kept[131072];
static void retain_free(void*pointer){U n=__atomic_fetch_add(&kept_count,1,__ATOMIC_RELAXED);if(n<131072)kept[n]=(U)pointer;}
EXPORT J Java_com_xlammod_lab_NativeBootstrap_retainBuffers(void*e,void*c){
 U b=module_base();if(!b)return 0;kept_count=0;
 U a=b+0x69a554,page=a&~4095UL;
 if(sys3(226,page,4096,7)<0)return -1;
 *(volatile unsigned int*)a=0x58000050;*(volatile unsigned int*)(a+4)=0xd61f0200;
 *(volatile U*)(a+8)=(U)&retain_free;
 __asm__ volatile("dc cvau, %0\n\tdsb ish\n\tic ivau, %0\n\tdsb ish\n\tisb"::"r"(a):"memory");
 sys3(226,page,4096,5);
 /* Retain the source/bytecode fields at the observed script-context cleanup. */
 page=(b+0x46c59c)&~4095UL;
 if(sys3(226,page,4096,7)==0){
  U offsets[]={0x46c59c,0x46c5a4,0x46c5b8,0x46c5c0};
  for(U i=0;i<4;i++)*(volatile unsigned int*)(b+offsets[i])=0xd503201f;
  for(U p=page;p<page+4096;p+=64)__asm__ volatile("dc cvau, %0"::"r"(p):"memory");
  __asm__ volatile("dsb ish":::"memory");
  for(U p=page;p<page+4096;p+=64)__asm__ volatile("ic ivau, %0"::"r"(p):"memory");
  __asm__ volatile("dsb ish\n\tisb":::"memory");sys3(226,page,4096,5);
 }
 return (J)kept;
}
EXPORT J Java_com_xlammod_lab_NativeBootstrap_bufferCount(void*e,void*c){return kept_count;}
