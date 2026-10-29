            package com.google.android.gms.games.video;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.kb1;
            import p000.md3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class VideoConfiguration extends AbstractSafeParcelable {
                public static final Parcelable.Creator<VideoConfiguration> CREATOR = new md3(21);

                /* JADX INFO: renamed from: a */
                public final int f4082a;

                /* JADX INFO: renamed from: b */
                public final int f4083b;

                /* JADX INFO: renamed from: c */
                public final boolean f4084c;

                /* JADX INFO: renamed from: d */
                public final boolean f4085d;

                /* JADX INFO: renamed from: e */
                public final boolean f4086e;

                public VideoConfiguration(int i, int i2, boolean z, boolean z2, boolean z3) {
/* 4 */             boolean z4 = false;
/* 22 */            kb1.m6054g(i != -1 && (i == 0 || i == 1 || i == 2 || i == 3));
/* 25 */            if (i2 != -1 && (i2 == 0 || i2 == 1)) {
/* 32 */                z4 = true;
                    }
/* 33 */            kb1.m6054g(z4);
/* 36 */            this.f4082a = i;
/* 38 */            this.f4083b = i2;
/* 40 */            this.f4084c = z;
/* 42 */            this.f4085d = z2;
/* 44 */            this.f4086e = z3;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f4082a);
/* 18 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.f4083b);
/* 27 */            w11.m9420b0(parcel, 7, 4);
/* 32 */            parcel.writeInt(this.f4084c ? 1 : 0);
/* 37 */            w11.m9420b0(parcel, 8, 4);
/* 42 */            parcel.writeInt(this.f4085d ? 1 : 0);
/* 47 */            w11.m9420b0(parcel, 9, 4);
/* 52 */            parcel.writeInt(this.f4086e ? 1 : 0);
/* 55 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
