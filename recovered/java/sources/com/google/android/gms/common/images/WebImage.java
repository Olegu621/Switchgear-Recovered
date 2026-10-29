            package com.google.android.gms.common.images;

            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import java.util.Locale;
            import p000.de3;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class WebImage extends AbstractSafeParcelable {
                public static final Parcelable.Creator<WebImage> CREATOR = new ub3(1);

                /* JADX INFO: renamed from: a */
                public final int f3472a;

                /* JADX INFO: renamed from: b */
                public final Uri f3473b;

                /* JADX INFO: renamed from: c */
                public final int f3474c;

                /* JADX INFO: renamed from: d */
                public final int f3475d;

                public WebImage(int i, Uri uri, int i2, int i3) {
/* 4 */             this.f3472a = i;
/* 6 */             this.f3473b = uri;
/* 8 */             this.f3474c = i2;
/* 10 */            this.f3475d = i3;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && (obj instanceof WebImage)) {
/* 13 */                WebImage webImage = (WebImage) obj;
/* 23 */                if (de3.m3029k(this.f3473b, webImage.f3473b) && this.f3474c == webImage.f3474c && this.f3475d == webImage.f3475d) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 19 */            return Arrays.hashCode(new Object[]{this.f3473b, Integer.valueOf(this.f3474c), Integer.valueOf(this.f3475d)});
                }

                public final String toString() {
/* 1 */             Locale locale = Locale.US;
/* 39 */            return "Image " + this.f3474c + "x" + this.f3475d + " " + this.f3473b.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3472a);
/* 21 */            w11.m9409S(parcel, 2, this.f3473b, i, false);
/* 25 */            w11.m9420b0(parcel, 3, 4);
/* 30 */            parcel.writeInt(this.f3474c);
/* 33 */            w11.m9420b0(parcel, 4, 4);
/* 38 */            parcel.writeInt(this.f3475d);
/* 41 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
