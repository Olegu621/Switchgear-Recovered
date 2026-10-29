            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.drive.DriveId;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public final class zzgs extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzgs> CREATOR = new zzgt();
                private final int zzda;
                private final com.google.android.gms.drive.events.zzt zzdc;
                private final DriveId zzk;

                public zzgs(DriveId driveId, int i, com.google.android.gms.drive.events.zzt zztVar) {
/* 4 */             this.zzk = driveId;
/* 6 */             this.zzda = i;
/* 8 */             this.zzdc = zztVar;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.zzk, i, false);
/* 14 */            int i2 = this.zzda;
/* 18 */            w11.m9420b0(parcel, 3, 4);
/* 21 */            parcel.writeInt(i2);
/* 26 */            w11.m9409S(parcel, 4, this.zzdc, i, false);
/* 29 */            w11.m9428f0(iM9422c0, parcel);
                }

/* 10 */        public zzgs(DriveId driveId, int i) {
/* 11 */            this(driveId, i, null);
                }
            }
