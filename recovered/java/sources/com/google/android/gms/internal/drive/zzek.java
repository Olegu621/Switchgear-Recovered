            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.drive.DriveId;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzek extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzek> CREATOR = new zzel();
                private final DriveId zzdd;
                private final boolean zzha;

                public zzek(DriveId driveId, boolean z) {
/* 4 */             this.zzdd = driveId;
/* 6 */             this.zzha = z;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.zzdd, i, false);
/* 14 */            boolean z = this.zzha;
/* 18 */            w11.m9420b0(parcel, 3, 4);
/* 21 */            parcel.writeInt(z ? 1 : 0);
/* 24 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
