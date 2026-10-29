            package com.google.android.gms.internal.measurement;

            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.Callable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzc {
                final zzf zza;
                zzg zzb;
                final zzab zzc;
                private final zzz zzd;

                public zzc() {
/* 3 */             zzf zzfVar = new zzf();
/* 9 */             this.zza = zzfVar;
/* 17 */            this.zzb = zzfVar.zzb.zzc();
/* 24 */            this.zzc = new zzab();
/* 31 */            this.zzd = new zzz();
/* 42 */            zzfVar.zzd.zza("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.zzb
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
/* 3 */                     return this.zza.zzg();
                        }
                    });
/* 54 */            zzfVar.zzd.zza("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.zza
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
/* 7 */                     return new zzk(this.zza.zzc);
                        }
                    });
                }

                public final void zza(String str, Callable callable) {
/* 5 */             this.zza.zzd.zza(str, callable);
                }

                public final boolean zzb(zzaa zzaaVar) throws zzd {
                    try {
/* 1 */                 zzab zzabVar = this.zzc;
/* 3 */                 zzabVar.zzb(zzaaVar);
/* 23 */                this.zza.zzc.zze("runtime.counter", new zzah(Double.valueOf(0.0d)));
/* 34 */                this.zzd.zzb(this.zzb.zzc(), zzabVar);
                        return zzc() || zzd();
                    } catch (Throwable th) {
/* 60 */                throw new zzd(th);
                    }
                }

                public final boolean zzc() {
/* 1 */             zzab zzabVar = this.zzc;
                    return !zzabVar.zzc().equals(zzabVar.zza());
                }

                public final boolean zzd() {
                    return !this.zzc.zzf().isEmpty();
                }

                public final zzab zze() {
/* 1 */             return this.zzc;
                }

                public final void zzf(zzja zzjaVar) throws zzd {
                    zzai zzaiVar;
                    try {
/* 1 */                 zzf zzfVar = this.zza;
/* 9 */                 this.zzb = zzfVar.zzb.zzc();
/* 32 */                if (zzfVar.zza(this.zzb, (zzje[]) zzjaVar.zza().toArray(new zzje[0])) instanceof zzag) {
/* 176 */                   throw new IllegalStateException("Program loading failed");
                        }
/* 50 */                for (zziy zziyVar : zzjaVar.zzb().zza()) {
/* 58 */                    List listZzb = zziyVar.zzb();
/* 62 */                    String strZza = zziyVar.zza();
/* 66 */                    Iterator it = listZzb.iterator();
/* 74 */                    while (it.hasNext()) {
/* 88 */                        zzao zzaoVarZza = zzfVar.zza(this.zzb, (zzje) it.next());
/* 94 */                        if (!(zzaoVarZza instanceof zzal)) {
/* 167 */                           throw new IllegalArgumentException("Invalid rule definition");
                                }
/* 98 */                        zzg zzgVar = this.zzb;
/* 106 */                       if (zzgVar.zzd(strZza)) {
/* 110 */                           zzao zzaoVarZzh = zzgVar.zzh(strZza);
/* 116 */                           if (!(zzaoVarZzh instanceof zzai)) {
/* 159 */                               throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strZza)));
                                    }
/* 118 */                           zzaiVar = (zzai) zzaoVarZzh;
                                } else {
/* 108 */                           zzaiVar = null;
                                }
/* 120 */                       if (zzaiVar == null) {
/* 145 */                           throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strZza)));
                                }
/* 128 */                       zzaiVar.zza(this.zzb, Collections.singletonList(zzaoVarZza));
                            }
                        }
                    } catch (Throwable th) {
/* 183 */               throw new zzd(th);
                    }
                }

                public final /* synthetic */ zzai zzg() {
/* 5 */             return new zzv(this.zzd);
                }
            }
