            package com.google.android.gms.internal.location;

            import com.google.android.gms.location.LocationAvailability;
            import com.google.android.gms.location.LocationResult;
            import p000.v81;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzar extends com.google.android.gms.location.zzaz {
                private final v81 zza;

                public zzar(v81 v81Var) {
/* 3 */             super("com.google.android.gms.location.ILocationCallback");
/* 6 */             this.zza = v81Var;
                }

                public final synchronized void zzc() {
/* 2 */             v81 v81Var = this.zza;
/* 5 */             v81Var.f17915b = null;
/* 7 */             v81Var.f17916c = null;
                }

                @Override // com.google.android.gms.location.zzba
                public final void zzd(LocationResult locationResult) {
/* 8 */             this.zza.m9229a(new zzap(this, locationResult));
                }

                @Override // com.google.android.gms.location.zzba
                public final void zze(LocationAvailability locationAvailability) {
/* 8 */             this.zza.m9229a(new zzaq(this, locationAvailability));
                }
            }
