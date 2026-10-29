            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.ar2;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgo extends AbstractSafeParcelable implements ar2 {
                public static final Parcelable.Creator<zzgo> CREATOR = new zzgp();
                private final boolean zzbm;
                private final int zzbn;
                private final int zzgy;

                public zzgo(int i, int i2, boolean z) {
/* 4 */             this.zzgy = i;
/* 6 */             this.zzbn = i2;
/* 8 */             this.zzbm = z;
                }

                @Override // p000.ar2
                public final int getBatteryUsagePreference() {
/* 1 */             return this.zzbn;
                }

                @Override // p000.ar2
                public final int getNetworkPreference() {
/* 1 */             return this.zzgy;
                }

                @Override // p000.ar2
                public final boolean isRoamingAllowed() {
/* 1 */             return this.zzbm;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             int i2 = this.zzgy;
/* 11 */            w11.m9420b0(parcel, 2, 4);
/* 14 */            parcel.writeInt(i2);
/* 17 */            int i3 = this.zzbn;
/* 20 */            w11.m9420b0(parcel, 3, 4);
/* 23 */            parcel.writeInt(i3);
/* 26 */            boolean z = this.zzbm;
/* 28 */            w11.m9420b0(parcel, 4, 4);
/* 31 */            parcel.writeInt(z ? 1 : 0);
/* 34 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
