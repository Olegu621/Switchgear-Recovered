            package com.google.android.gms.internal.games_v2;

            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public final class zzan extends com.google.android.gms.games.internal.zzh {
                public static final Parcelable.Creator<zzan> CREATOR = new zzao();
                private final Bundle zza;
                private final IBinder zzb;

                public zzan(zzam zzamVar) {
/* 8 */             this.zza = zzamVar.zza();
/* 12 */            this.zzb = zzamVar.zza;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9402L(parcel, 1, this.zza, false);
/* 17 */            w11.m9405O(parcel, 2, this.zzb);
/* 20 */            w11.m9428f0(iM9422c0, parcel);
                }

/* 14 */        public zzan(Bundle bundle, IBinder iBinder) {
/* 16 */            this.zza = bundle;
                    this.zzb = iBinder;
                }
            }
