            package com.google.android.recaptcha.internal;

            import java.util.List;
            import java.util.concurrent.TimeUnit;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzio extends tj2 implements Function2 {
                Object zza;
                Object zzb;
                int zzc;
                final /* synthetic */ zziz zzd;
                final /* synthetic */ zzip zze;
                final /* synthetic */ String zzf;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzio(zziz zzizVar, zzip zzipVar, String str, c10 c10Var) {
/* 8 */             super(2, c10Var);
/* 1 */             this.zzd = zzizVar;
/* 3 */             this.zze = zzipVar;
/* 5 */             this.zzf = str;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 9 */             return new zzio(this.zzd, this.zze, this.zzf, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzio) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
                
                    if (r1.zzh(r7, r2, r6) == r0) goto L19;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    zzzq zzzqVar;
                    zzmf zzmfVar;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zzc;
                    try {
/* 6 */                 if (i != 0) {
/* 8 */                     if (i != 1) {
/* 10 */                        pg3.m7417A(obj);
                            } else {
/* 16 */                        zzmfVar = (zzmf) this.zzb;
/* 20 */                        zzzqVar = (zzzq) this.zza;
/* 22 */                        pg3.m7417A(obj);
                            }
/* 126 */                   return Unit.f12910a;
                        }
/* 28 */                pg3.m7417A(obj);
/* 31 */                zziz zzizVar = this.zzd;
/* 38 */                zzizVar.zza = new zzcs();
/* 50 */                zzzq zzzqVarZzi = zzzq.zzi(zzpp.zzh().zzj(this.zzf));
/* 54 */                zzzqVarZzi.zzf();
/* 57 */                zzip zzipVar = this.zze;
/* 63 */                zzzo zzzoVarZza = zzipVar.zzc.zza(zzzqVarZzi);
/* 67 */                zzmf zzmfVarZzb = zzmf.zzb();
/* 71 */                List listZzi = zzzoVarZza.zzi();
/* 75 */                this.zza = zzzqVarZzi;
/* 77 */                this.zzb = zzmfVarZzb;
/* 79 */                this.zzc = 1;
/* 85 */                if (zzipVar.zzg(listZzi, zzizVar, this) != z10Var) {
/* 87 */                    zzzqVar = zzzqVarZzi;
/* 88 */                    zzmfVar = zzmfVarZzb;
                        }
/* 125 */               return z10Var;
/* 89 */                zzmfVar.zzf();
/* 100 */               new Long(zzmfVar.zza(TimeUnit.MICROSECONDS));
/* 103 */               zzzqVar.zzf();
                    } catch (Exception e) {
/* 107 */               zzip zzipVar2 = this.zze;
/* 109 */               zziz zzizVar2 = this.zzd;
/* 112 */               this.zza = null;
/* 114 */               this.zzb = null;
/* 117 */               this.zzc = 2;
                    }
/* 126 */           return Unit.f12910a;
                }
            }
