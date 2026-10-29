            package com.google.android.gms.location;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.re3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class LocationSettingsStates extends AbstractSafeParcelable {
                public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new re3(5);

                /* JADX INFO: renamed from: a */
                public final boolean f4140a;

                /* JADX INFO: renamed from: b */
                public final boolean f4141b;

                /* JADX INFO: renamed from: c */
                public final boolean f4142c;

                /* JADX INFO: renamed from: d */
                public final boolean f4143d;

                /* JADX INFO: renamed from: e */
                public final boolean f4144e;

                /* JADX INFO: renamed from: f */
                public final boolean f4145f;

                public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
/* 4 */             this.f4140a = z;
/* 6 */             this.f4141b = z2;
/* 8 */             this.f4142c = z3;
/* 10 */            this.f4143d = z4;
/* 12 */            this.f4144e = z5;
/* 14 */            this.f4145f = z6;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f4140a ? 1 : 0);
/* 18 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.f4141b ? 1 : 0);
/* 27 */            w11.m9420b0(parcel, 3, 4);
/* 32 */            parcel.writeInt(this.f4142c ? 1 : 0);
/* 35 */            w11.m9420b0(parcel, 4, 4);
/* 40 */            parcel.writeInt(this.f4143d ? 1 : 0);
/* 44 */            w11.m9420b0(parcel, 5, 4);
/* 49 */            parcel.writeInt(this.f4144e ? 1 : 0);
/* 53 */            w11.m9420b0(parcel, 6, 4);
/* 58 */            parcel.writeInt(this.f4145f ? 1 : 0);
/* 61 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
