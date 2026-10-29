            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.C1951n4;
            import p000.ar2;
            import p000.ci0;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
/* 15 */    public final class zzei extends AbstractSafeParcelable implements ci0 {
                public static final Parcelable.Creator<zzei> CREATOR = new zzej();
                private int zzbn;
                private int zzgy;
                private boolean zzgz;

                public zzei(ar2 ar2Var) {
/* 13 */            this(ar2Var.getNetworkPreference(), ar2Var.getBatteryUsagePreference(), ar2Var.isRoamingAllowed());
                }

                private static boolean zzh(int i) {
                    return i == 1 || i == 2;
                }

                private static boolean zzi(int i) {
                    return i == 256 || i == 257;
                }

                @Override // p000.ci0
                public final int getBatteryUsagePreference() {
/* 7 */             if (zzi(this.zzbn)) {
/* 11 */                return this.zzbn;
                    }
/* 9 */             return 0;
                }

                @Override // p000.ci0
                public final int getNetworkTypePreference() {
/* 7 */             if (zzh(this.zzgy)) {
/* 11 */                return this.zzgy;
                    }
/* 9 */             return 0;
                }

                @Override // p000.ci0
                public final boolean isRoamingAllowed() {
/* 1 */             return this.zzgz;
                }

                public final void setBatteryUsagePreference(int i) {
/* 5 */             if (zzi(i)) {
/* 7 */                 this.zzbn = i;
                    } else {
/* 12 */                C1951n4.m6859j("Invalid battery usage preference value.");
                    }
                }

                public final void setNetworkTypePreference(int i) {
/* 5 */             if (zzh(i)) {
/* 7 */                 this.zzgy = i;
                    } else {
/* 12 */                C1951n4.m6859j("Invalid data connection preference value.");
                    }
                }

                public final void setRoamingAllowed(boolean z) {
/* 1 */             this.zzgz = z;
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
/* 26 */            boolean z = this.zzgz;
/* 28 */            w11.m9420b0(parcel, 4, 4);
/* 31 */            parcel.writeInt(z ? 1 : 0);
/* 34 */            w11.m9428f0(iM9422c0, parcel);
                }

/* 16 */        public zzei(int i, int i2, boolean z) {
/* 18 */            this.zzgy = i;
/* 19 */            this.zzbn = i2;
/* 20 */            this.zzgz = z;
                }
            }
