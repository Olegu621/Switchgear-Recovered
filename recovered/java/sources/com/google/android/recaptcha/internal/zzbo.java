            package com.google.android.recaptcha.internal;

            import com.google.android.play.core.integrity.StandardIntegrityManager;
            import p000.C1869kx;
            import p000.InterfaceC1809jx;
            import p000.c10;
            import p000.dl1;
            import p000.e70;
            import p000.f42;
            import p000.gl1;
            import p000.p51;
            import p000.pg3;
            import p000.r51;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 32 */    public final class zzbo {
                public InterfaceC1809jx zza;
                private final p51 zzb;
                private zzbp zzc;
                private final p51 zzd;
                private long zze;
                private final dl1 zzf;
                private boolean zzg;

                public zzbo(long j) {
/* 4 */             int i = zzby.zza;
/* 12 */            this.zzb = r51.m8065b(zzbk.zza);
/* 16 */            this.zzc = zzbp.zza;
/* 24 */            this.zzd = r51.m8065b(zzbl.zza);
/* 31 */            this.zzf = new gl1();
                }

                public static final /* synthetic */ zzcr zzb(zzbo zzboVar) {
/* 7 */             return (zzcr) zzboVar.zzb.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public final Object zzl(c10 c10Var) throws Exception {
                    zzbc zzbcVar;
/* 3 */             if (c10Var instanceof zzbc) {
/* 6 */                 zzbcVar = (zzbc) c10Var;
/* 8 */                 int i = zzbcVar.zzc;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    zzbcVar.zzc = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    zzbcVar = new zzbc(this, c10Var);
                        }
                    } else {
/* 22 */                zzbcVar = new zzbc(this, c10Var);
                    }
/* 25 */            Object obj = zzbcVar.zza;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = zzbcVar.zzc;
/* 32 */            if (i2 != 0) {
/* 34 */                if (i2 == 1) {
/* 36 */                    pg3.m7417A(obj);
/* 39 */                    return obj;
                        }
/* 42 */                f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 45 */                return null;
                    }
/* 47 */            pg3.m7417A(obj);
/* 76 */            e70 e70VarZza = zzdf.zza(((StandardIntegrityManager) this.zzd.getValue()).prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zze).build()));
/* 80 */            zzbcVar.zzc = 1;
/* 82 */            Object objAwait = e70VarZza.await(zzbcVar);
                    return objAwait == z10Var ? z10Var : objAwait;
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
                
                    if (r8 == r1) goto L23;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object zzm(String str, c10 c10Var) throws Exception {
                    zzbg zzbgVar;
/* 3 */             if (c10Var instanceof zzbg) {
/* 6 */                 zzbgVar = (zzbg) c10Var;
/* 8 */                 int i = zzbgVar.zzc;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    zzbgVar.zzc = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    zzbgVar = new zzbg(this, c10Var);
                        }
                    } else {
/* 22 */                zzbgVar = new zzbg(this, c10Var);
                    }
/* 25 */            Object objM10250i = zzbgVar.zza;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = zzbgVar.zzc;
/* 34 */            if (i2 == 0) {
/* 56 */                pg3.m7417A(objM10250i);
/* 59 */                InterfaceC1809jx interfaceC1809jxZzf = zzf();
/* 63 */                zzbgVar.zzd = str;
/* 65 */                zzbgVar.zzc = 1;
/* 69 */                objM10250i = ((C1869kx) interfaceC1809jxZzf).m10250i(zzbgVar);
/* 73 */                if (objM10250i != z10Var) {
                        }
/* 115 */               return z10Var;
                    }
/* 36 */            if (i2 == 1) {
/* 50 */                str = zzbgVar.zzd;
/* 52 */                pg3.m7417A(objM10250i);
                    } else {
/* 38 */                if (i2 != 2) {
/* 46 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 40 */                pg3.m7417A(objM10250i);
                    }
/* 110 */           return ((StandardIntegrityManager.StandardIntegrityToken) objM10250i).token();
/* 93 */            e70 e70VarZza = zzdf.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) objM10250i).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
/* 97 */            zzbgVar.zzd = null;
/* 99 */            zzbgVar.zzc = 2;
/* 101 */           objM10250i = e70VarZza.await(zzbgVar);
                }

                public final Object zze(c10 c10Var) {
/* 9 */             return new zzhg(new zzbn(this, null));
                }

                public final InterfaceC1809jx zzf() {
/* 1 */             InterfaceC1809jx interfaceC1809jx = this.zza;
/* 3 */             if (interfaceC1809jx != null) {
/* 5 */                 return interfaceC1809jx;
                    }
/* 6 */             return null;
                }

                public final void zzj(long j) {
/* 1 */             this.zze = j;
                }

/* 33 */        public zzbo() {
/* 34 */            this(28800000L);
                }
            }
