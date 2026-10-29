            package com.google.android.recaptcha.internal;

            import kotlin.jvm.functions.Function1;
            import p000.c10;
            import p000.f42;
            import p000.g22;
            import p000.pg3;
            import p000.qj3;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzcx {
                public static final zzcx zza = new zzcx();

                private zzcx() {
                }

                public static final Object zzc(long j, int i, long j2, long j3, double d, Function1 function1, c10 c10Var) {
/* 19 */            return qj3.m7884Q(j, new zzcw(20, 100L, 1000L, 2.0d, function1, null), c10Var);
                }

                /* JADX WARN: Can't wrap try/catch for region: R(3:43|24|(0)(1:27)) */
                /* JADX WARN: Code duplicated, block: B:7:0x0015  */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
                
                    r14 = r3;
                    r3 = r13;
                    r13 = r10;
                    r9 = r8;
                    r8 = r12;
                    r1 = r11;
                    r11 = r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
                
                    if (p000.w11.m9431h(r4, r1) != r2) goto L18;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00bc -> B:18:0x0049). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object zza(int i, long j, long j2, double d, Function1 function1, c10 c10Var) {
                    zzcu zzcuVar;
                    g22 g22Var;
                    zzcu zzcuVar2;
                    int i2;
                    int i3;
                    long j3;
                    double d2;
                    Function1 function2;
                    Function1 function3;
                    g22 g22Var2;
                    long j4;
                    double d3;
                    int i4;
                    int i5;
/* 5 */             if (c10Var instanceof zzcu) {
/* 8 */                 zzcuVar = (zzcu) c10Var;
/* 10 */                int i6 = zzcuVar.zzh;
/* 16 */                if ((i6 & Integer.MIN_VALUE) != 0) {
/* 19 */                    zzcuVar.zzh = i6 - Integer.MIN_VALUE;
                        } else {
/* 26 */                    zzcuVar = new zzcu(this, c10Var);
                        }
                    } else {
/* 26 */                zzcuVar = new zzcu(this, c10Var);
                    }
/* 29 */            Object obj = zzcuVar.zzf;
/* 31 */            z10 z10Var = z10.f19902a;
/* 33 */            int i7 = zzcuVar.zzh;
/* 35 */            g22 g22Var3 = null;
/* 39 */            if (i7 != 0) {
/* 41 */                if (i7 == 1) {
/* 84 */                    i5 = zzcuVar.zze;
/* 86 */                    i4 = zzcuVar.zzd;
/* 88 */                    d3 = zzcuVar.zzb;
/* 90 */                    j4 = zzcuVar.zza;
/* 92 */                    g22Var2 = zzcuVar.zzi;
/* 96 */                    function3 = (Function1) zzcuVar.zzc;
                            try {
/* 98 */                        pg3.m7417A(obj);
/* 101 */                       return obj;
                            } catch (Exception unused) {
                            }
                        } else {
/* 43 */                    if (i7 != 2) {
/* 45 */                        if (i7 == 3) {
/* 47 */                            pg3.m7417A(obj);
/* 50 */                            return obj;
                                }
/* 53 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 35 */                        return null;
                            }
/* 57 */                    i5 = zzcuVar.zze;
/* 59 */                    i4 = zzcuVar.zzd;
/* 61 */                    d3 = zzcuVar.zzb;
/* 63 */                    j4 = zzcuVar.zza;
/* 65 */                    g22Var2 = zzcuVar.zzi;
/* 69 */                    function3 = (Function1) zzcuVar.zzc;
/* 71 */                    pg3.m7417A(obj);
/* 74 */                    long j5 = j4;
/* 75 */                    zzcuVar2 = zzcuVar;
/* 76 */                    j3 = j5;
/* 77 */                    int i8 = i5;
/* 78 */                    i2 = i4;
/* 79 */                    d2 = d3;
/* 80 */                    g22Var = g22Var2;
/* 81 */                    function2 = function3;
/* 192 */                   i3 = i8 + 1;
/* 194 */                   g22Var3 = null;
                        }
/* 163 */               long j6 = (long) (g22Var2.f8440a * d3);
/* 166 */               if (j6 > j4) {
/* 168 */                   j6 = j4;
                        }
/* 169 */               g22Var2.f8440a = j6;
/* 171 */               zzcuVar.zzc = function3;
/* 173 */               zzcuVar.zzi = g22Var2;
/* 175 */               zzcuVar.zza = j4;
/* 177 */               zzcuVar.zzb = d3;
/* 179 */               zzcuVar.zzd = i4;
/* 181 */               zzcuVar.zze = i5;
/* 183 */               zzcuVar.zzh = 2;
                    } else {
/* 102 */               pg3.m7417A(obj);
/* 107 */               g22 g22Var4 = new g22();
/* 112 */               g22Var4.f8440a = j;
/* 117 */               g22Var = g22Var4;
/* 118 */               zzcuVar2 = zzcuVar;
/* 114 */               i2 = i - 1;
/* 120 */               i3 = 0;
/* 121 */               j3 = j2;
/* 123 */               d2 = d;
/* 125 */               function2 = function1;
                    }
/* 127 */           if (i3 < i2) {
/* 129 */               zzcuVar2.zzc = function2;
/* 131 */               zzcuVar2.zzi = g22Var;
/* 133 */               zzcuVar2.zza = j3;
/* 135 */               zzcuVar2.zzb = d2;
/* 137 */               zzcuVar2.zzd = i2;
/* 139 */               zzcuVar2.zze = i3;
/* 141 */               zzcuVar2.zzh = 1;
/* 143 */               Object objInvoke = function2.invoke(zzcuVar2);
/* 147 */               if (objInvoke != z10Var) {
/* 150 */                   return objInvoke;
                        }
                    } else {
/* 197 */               g22 g22Var5 = g22Var3;
/* 198 */               zzcuVar2.zzc = g22Var5;
/* 200 */               zzcuVar2.zzi = g22Var5;
/* 203 */               zzcuVar2.zzh = 3;
/* 205 */               Object objInvoke2 = function2.invoke(zzcuVar2);
/* 209 */               if (objInvoke2 != z10Var) {
/* 211 */                   return objInvoke2;
                        }
                    }
/* 212 */           return z10Var;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:4|(1:6)(1:7))(1:7)|8|(3:(1:(2:12|13)(2:14|15))(4:16|40|17|18)|28|(3:30|(1:32)|33)(1:37))(1:21)|38|22|(1:36)(1:25)) */
                /* JADX WARN: Code duplicated, block: B:7:0x0015  */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
                
                    r14 = r12;
                    r12 = r1;
                    r1 = r14;
                    r14 = r10;
                    r10 = r8;
                    r8 = r14;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
                
                    if (p000.w11.m9431h(r6, r1) != r2) goto L13;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00aa -> B:13:0x003b). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object zzb(Function1 function1, long j, long j2, double d, Function1 function2, c10 c10Var) throws Exception {
                    zzcv zzcvVar;
                    long j3;
                    long j4;
                    double d2;
                    Function1 function3;
                    zzcv zzcvVar2;
                    Function1 function4;
                    Function1 function5;
                    long j5;
                    double d3;
                    Exception e;
/* 5 */             if (c10Var instanceof zzcv) {
/* 8 */                 zzcvVar = (zzcv) c10Var;
/* 10 */                int i = zzcvVar.zzh;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    zzcvVar.zzh = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    zzcvVar = new zzcv(this, c10Var);
                        }
                    } else {
/* 26 */                zzcvVar = new zzcv(this, c10Var);
                    }
/* 29 */            Object obj = zzcvVar.zzf;
/* 31 */            z10 z10Var = z10.f19902a;
/* 33 */            int i2 = zzcvVar.zzh;
/* 37 */            if (i2 != 0) {
/* 39 */                if (i2 == 1) {
/* 74 */                    j3 = zzcvVar.zzd;
/* 76 */                    d3 = zzcvVar.zze;
/* 78 */                    j5 = zzcvVar.zzc;
/* 82 */                    function3 = (Function1) zzcvVar.zzb;
/* 86 */                    function5 = (Function1) zzcvVar.zza;
                            try {
/* 88 */                        pg3.m7417A(obj);
/* 91 */                        return obj;
                            } catch (Exception e2) {
/* 92 */                        e = e2;
                            }
                        } else {
/* 41 */                    if (i2 != 2) {
/* 69 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 72 */                        return null;
                            }
/* 43 */                    j3 = zzcvVar.zzd;
/* 45 */                    d3 = zzcvVar.zze;
/* 47 */                    j5 = zzcvVar.zzc;
/* 51 */                    function3 = (Function1) zzcvVar.zzb;
/* 55 */                    function5 = (Function1) zzcvVar.zza;
/* 57 */                    pg3.m7417A(obj);
/* 60 */                    Function1 function6 = function5;
/* 61 */                    zzcvVar2 = zzcvVar;
/* 62 */                    function4 = function6;
/* 63 */                    long j6 = j5;
/* 64 */                    d2 = d3;
/* 65 */                    j4 = j6;
                        }
/* 145 */               if (!((Boolean) function5.invoke(e)).booleanValue()) {
/* 175 */                   throw e;
                        }
/* 149 */               j3 = (long) (j3 * d3);
/* 152 */               if (j3 > j5) {
/* 154 */                   j3 = j5;
                        }
/* 155 */               zzcvVar.zza = function5;
/* 157 */               zzcvVar.zzb = function3;
/* 159 */               zzcvVar.zzc = j5;
/* 161 */               zzcvVar.zze = d3;
/* 163 */               zzcvVar.zzd = j3;
/* 165 */               zzcvVar.zzh = 2;
                    } else {
/* 94 */                pg3.m7417A(obj);
/* 97 */                j3 = j;
/* 99 */                j4 = j2;
/* 101 */               d2 = d;
/* 103 */               function3 = function2;
/* 105 */               zzcvVar2 = zzcvVar;
/* 106 */               function4 = function1;
                    }
/* 108 */           zzcvVar2.zza = function4;
/* 110 */           zzcvVar2.zzb = function3;
/* 112 */           zzcvVar2.zzc = j4;
/* 114 */           zzcvVar2.zze = d2;
/* 116 */           zzcvVar2.zzd = j3;
/* 118 */           zzcvVar2.zzh = 1;
/* 120 */           Object objInvoke = function3.invoke(zzcvVar2);
                    return objInvoke == z10Var ? z10Var : objInvoke;
                }
            }
