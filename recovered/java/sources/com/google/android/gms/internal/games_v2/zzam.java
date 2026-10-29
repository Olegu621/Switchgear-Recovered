            package com.google.android.gms.internal.games_v2;

            import android.os.Bundle;
            import android.os.IBinder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzam {
                public final int zzb;
                public int zzc = -1;
                public int zzd = 0;
                public int zze = 0;
                public int zzf = 0;
                public int zzg = 0;
                public IBinder zza = null;

                public zzam(int i, IBinder iBinder) {
/* 16 */            this.zzb = i;
                }

                public final Bundle zza() {
/* 3 */             Bundle bundle = new Bundle();
/* 10 */            bundle.putInt("popupLocationInfo.gravity", this.zzb);
/* 17 */            bundle.putInt("popupLocationInfo.displayId", this.zzc);
/* 24 */            bundle.putInt("popupLocationInfo.left", this.zzd);
/* 31 */            bundle.putInt("popupLocationInfo.top", this.zze);
/* 38 */            bundle.putInt("popupLocationInfo.right", this.zzf);
/* 45 */            bundle.putInt("popupLocationInfo.bottom", this.zzg);
/* 48 */            return bundle;
                }
            }
