            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.drive.DriveId;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhd extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzhd> CREATOR = new zzhe();
                private final DriveId zzdd;

                public zzhd(DriveId driveId) {
/* 4 */             this.zzdd = driveId;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.zzdd, i, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
