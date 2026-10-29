            package com.google.android.gms.internal.location;

            import com.google.android.gms.location.LocationResult;
            import p000.u81;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzap implements u81 {
                final /* synthetic */ LocationResult zza;

                public zzap(zzar zzarVar, LocationResult locationResult) {
/* 1 */             this.zza = locationResult;
                }

                @Override // p000.u81
                public final /* synthetic */ void notifyListener(Object obj) {
/* 1 */             obj.getClass();
/* 9 */             throw new ClassCastException();
                }

                @Override // p000.u81
                public final void onNotifyListenerFailed() {
                }
            }
