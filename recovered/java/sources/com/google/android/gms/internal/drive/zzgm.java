            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.drive.query.internal.FilterHolder;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgm extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzgm> CREATOR = new zzgn();
                private final String zzba;
                private final String[] zzbb;
                private final DriveId zzbd;
                private final FilterHolder zzbe;

                public zzgm(String str, String[] strArr, DriveId driveId, FilterHolder filterHolder) {
/* 4 */             this.zzba = str;
/* 6 */             this.zzbb = strArr;
/* 8 */             this.zzbd = driveId;
/* 10 */            this.zzbe = filterHolder;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 2, this.zzba, false);
/* 17 */            w11.m9411U(parcel, 3, this.zzbb, false);
/* 23 */            w11.m9409S(parcel, 4, this.zzbd, i, false);
/* 29 */            w11.m9409S(parcel, 5, this.zzbe, i, false);
/* 32 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
