            package com.google.android.recaptcha.internal;

            import com.google.android.play.core.integrity.StandardIntegrityException;
            import com.google.android.play.core.integrity.StandardIntegrityManager;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.C1869kx;
            import p000.c10;
            import p000.h22;
            import p000.pg3;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbd extends tj2 implements Function2 {
                long zza;
                boolean zzb;
                int zzc;
                final /* synthetic */ zzbo zzd;
                final /* synthetic */ h22 zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbd(zzbo zzboVar, h22 h22Var, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzd = zzboVar;
/* 3 */             this.zze = h22Var;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new zzbd(this.zzd, this.zze, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzbd) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
                
                    if (r8 != r0) goto L16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
                
                    if (p000.w11.m9431h(r4, r7) != r0) goto L6;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0042 -> B:13:0x0022). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0075 -> B:6:0x0011). Please report as a decompilation issue!!! */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Exception {
                    long j;
                    boolean z;
                    boolean z2;
                    int errorCode;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zzc;
/* 7 */             if (i != 0) {
/* 9 */                 if (i != 1) {
/* 11 */                    z2 = this.zzb;
/* 13 */                    j = this.zza;
/* 15 */                    pg3.m7417A(obj);
/* 18 */                    z = z2;
/* 121 */                   j += j;
                        } else {
/* 21 */                    j = this.zza;
                            try {
/* 23 */                        pg3.m7417A(obj);
                            } catch (Exception e) {
/* 71 */                        this.zze.f8873a = e;
/* 104 */                       z2 = (e instanceof StandardIntegrityException) && ((errorCode = ((StandardIntegrityException) e).getErrorCode()) == -100 || errorCode == -18 || errorCode == -12 || errorCode == -8 || errorCode == -3);
/* 105 */                       if (!z2) {
/* 124 */                           throw e;
                                }
/* 107 */                       this.zza = j;
/* 109 */                       this.zzb = true;
/* 112 */                       this.zzc = 2;
                            }
                        }
/* 51 */                zzbo zzboVar = this.zzd;
/* 59 */                ((C1869kx) zzboVar.zzf()).m10238D((StandardIntegrityManager.StandardIntegrityTokenProvider) obj);
/* 1 */                 zzboVar.zzc = zzbp.zzc;
/* 67 */                z = false;
                    } else {
/* 29 */                pg3.m7417A(obj);
/* 32 */                j = 1000;
/* 34 */                z = true;
                    }
/* 35 */            if (!z) {
/* 125 */               return Unit.f12910a;
                    }
/* 37 */            zzbo zzboVar2 = this.zzd;
/* 39 */            this.zza = j;
/* 41 */            this.zzc = 1;
/* 1 */             obj = zzboVar2.zzl(this);
                }
            }
