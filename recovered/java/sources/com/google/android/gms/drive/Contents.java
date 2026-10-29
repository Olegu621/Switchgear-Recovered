            package com.google.android.gms.drive;

            import android.os.Parcel;
            import android.os.ParcelFileDescriptor;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.re3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class Contents extends AbstractSafeParcelable {
                public static final Parcelable.Creator<Contents> CREATOR = new re3(17);

                /* JADX INFO: renamed from: a */
                public final ParcelFileDescriptor f3631a;

                /* JADX INFO: renamed from: b */
                public final int f3632b;

                /* JADX INFO: renamed from: c */
                public final int f3633c;

                /* JADX INFO: renamed from: d */
                public final DriveId f3634d;

                /* JADX INFO: renamed from: e */
                public final boolean f3635e;

                /* JADX INFO: renamed from: f */
                public final String f3636f;

                public Contents(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, DriveId driveId, boolean z, String str) {
/* 4 */             this.f3631a = parcelFileDescriptor;
/* 6 */             this.f3632b = i;
/* 8 */             this.f3633c = i2;
/* 10 */            this.f3634d = driveId;
/* 12 */            this.f3635e = z;
/* 14 */            this.f3636f = str;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.f3631a, i, false);
/* 16 */            w11.m9420b0(parcel, 3, 4);
/* 21 */            parcel.writeInt(this.f3632b);
/* 24 */            w11.m9420b0(parcel, 4, 4);
/* 29 */            parcel.writeInt(this.f3633c);
/* 35 */            w11.m9409S(parcel, 5, this.f3634d, i, false);
/* 39 */            w11.m9420b0(parcel, 7, 4);
/* 44 */            parcel.writeInt(this.f3635e ? 1 : 0);
/* 51 */            w11.m9410T(parcel, 8, this.f3636f, false);
/* 54 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
