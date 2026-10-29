            package com.google.android.gms.games.video;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.games.internal.zzh;
            import java.util.Arrays;
            import p000.de3;
            import p000.tc3;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class VideoCapabilities extends zzh {
                public static final Parcelable.Creator<VideoCapabilities> CREATOR = new tc3(11);

                /* JADX INFO: renamed from: a */
                public final boolean f4077a;

                /* JADX INFO: renamed from: b */
                public final boolean f4078b;

                /* JADX INFO: renamed from: c */
                public final boolean f4079c;

                /* JADX INFO: renamed from: d */
                public final boolean[] f4080d;

                /* JADX INFO: renamed from: e */
                public final boolean[] f4081e;

                public VideoCapabilities(boolean z, boolean z2, boolean z3, boolean[] zArr, boolean[] zArr2) {
/* 4 */             this.f4077a = z;
/* 6 */             this.f4078b = z2;
/* 8 */             this.f4079c = z3;
/* 10 */            this.f4080d = zArr;
/* 12 */            this.f4081e = zArr2;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof VideoCapabilities)) {
/* 3 */                 return false;
                    }
/* 8 */             if (this == obj) {
/* 7 */                 return true;
                    }
/* 11 */            VideoCapabilities videoCapabilities = (VideoCapabilities) obj;
                    return de3.m3029k(videoCapabilities.f4080d, this.f4080d) && de3.m3029k(videoCapabilities.f4081e, this.f4081e) && de3.m3029k(Boolean.valueOf(videoCapabilities.f4077a), Boolean.valueOf(this.f4077a)) && de3.m3029k(Boolean.valueOf(videoCapabilities.f4078b), Boolean.valueOf(this.f4078b)) && de3.m3029k(Boolean.valueOf(videoCapabilities.f4079c), Boolean.valueOf(this.f4079c));
                }

                public final int hashCode() {
/* 27 */            return Arrays.hashCode(new Object[]{this.f4080d, this.f4081e, Boolean.valueOf(this.f4077a), Boolean.valueOf(this.f4078b), Boolean.valueOf(this.f4079c)});
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 10 */            wc0Var.m9529d(this.f4080d, "SupportedCaptureModes");
/* 17 */            wc0Var.m9529d(this.f4081e, "SupportedQualityLevels");
/* 28 */            wc0Var.m9529d(Boolean.valueOf(this.f4077a), "CameraSupported");
/* 39 */            wc0Var.m9529d(Boolean.valueOf(this.f4078b), "MicSupported");
/* 50 */            wc0Var.m9529d(Boolean.valueOf(this.f4079c), "StorageWriteSupported");
/* 53 */            return wc0Var.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f4077a ? 1 : 0);
/* 18 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.f4078b ? 1 : 0);
/* 27 */            w11.m9420b0(parcel, 3, 4);
/* 32 */            parcel.writeInt(this.f4079c ? 1 : 0);
/* 38 */            w11.m9400J(parcel, 4, this.f4080d, false);
/* 44 */            w11.m9400J(parcel, 5, this.f4081e, false);
/* 47 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
