            package com.google.android.recaptcha.internal;

            import p000.c10;
            import p000.f42;
            import p000.k50;
            import p000.p51;
            import p000.pg3;
            import p000.r51;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzif {
                private final p51 zza;

                public zzif() {
/* 4 */             int i = zzby.zza;
/* 12 */            this.zza = r51.m8065b(zzie.zza);
                }

                public static final /* synthetic */ zzhm zza(zzif zzifVar) {
/* 7 */             return (zzhm) zzifVar.zza.getValue();
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public static Object zzc(zzif zzifVar, zzcy zzcyVar, zzye zzyeVar, c10 c10Var) throws Throwable {
                    zzic zzicVar;
/* 3 */             if (c10Var instanceof zzic) {
/* 6 */                 zzicVar = (zzic) c10Var;
/* 8 */                 int i = zzicVar.zzc;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    zzicVar.zzc = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    zzicVar = new zzic(zzifVar, c10Var);
                        }
                    } else {
/* 22 */                zzicVar = new zzic(zzifVar, c10Var);
                    }
/* 25 */            Object obj = zzicVar.zza;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = zzicVar.zzc;
/* 33 */            if (i2 != 0) {
/* 35 */                if (i2 == 1) {
/* 37 */                    pg3.m7417A(obj);
/* 40 */                    return obj;
                        }
/* 43 */                f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                return null;
                    }
/* 47 */            pg3.m7417A(obj);
/* 52 */            zzid zzidVar = new zzid(zzifVar, zzcyVar, zzyeVar, null);
/* 55 */            zzicVar.zzc = 1;
/* 57 */            Object objM5966c = k50.m5966c(zzidVar, zzicVar);
                    return objM5966c == z10Var ? z10Var : objM5966c;
                }

                public final Object zzb(zzcy zzcyVar, zzye zzyeVar, c10 c10Var) {
/* 1 */             return zzc(this, zzcyVar, zzyeVar, c10Var);
                }
            }
