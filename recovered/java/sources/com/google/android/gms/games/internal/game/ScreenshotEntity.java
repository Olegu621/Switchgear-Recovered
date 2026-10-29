            package com.google.android.gms.games.internal.game;

            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.games.internal.zzh;
            import java.util.Arrays;
            import p000.de3;
            import p000.tf3;
            import p000.un0;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ScreenshotEntity extends zzh implements un0, Parcelable {
                public static final Parcelable.Creator<ScreenshotEntity> CREATOR = new tf3(2);

                /* JADX INFO: renamed from: a */
                public final Uri f4013a;

                /* JADX INFO: renamed from: b */
                public final int f4014b;

                /* JADX INFO: renamed from: c */
                public final int f4015c;

                public ScreenshotEntity(Uri uri, int i, int i2) {
/* 4 */             this.f4013a = uri;
/* 6 */             this.f4014b = i;
/* 8 */             this.f4015c = i2;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof ScreenshotEntity)) {
/* 3 */                 return false;
                    }
/* 8 */             if (this == obj) {
/* 7 */                 return true;
                    }
/* 11 */            ScreenshotEntity screenshotEntity = (ScreenshotEntity) obj;
                    return de3.m3029k(screenshotEntity.f4013a, this.f4013a) && de3.m3029k(Integer.valueOf(screenshotEntity.f4014b), Integer.valueOf(this.f4014b)) && de3.m3029k(Integer.valueOf(screenshotEntity.f4015c), Integer.valueOf(this.f4015c));
                }

                public final int hashCode() {
/* 19 */            return Arrays.hashCode(new Object[]{this.f4013a, Integer.valueOf(this.f4014b), Integer.valueOf(this.f4015c)});
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 10 */            wc0Var.m9529d(this.f4013a, "Uri");
/* 21 */            wc0Var.m9529d(Integer.valueOf(this.f4014b), "Width");
/* 32 */            wc0Var.m9529d(Integer.valueOf(this.f4015c), "Height");
/* 35 */            return wc0Var.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f4013a, i, false);
/* 16 */            w11.m9420b0(parcel, 2, 4);
/* 21 */            parcel.writeInt(this.f4014b);
/* 25 */            w11.m9420b0(parcel, 3, 4);
/* 30 */            parcel.writeInt(this.f4015c);
/* 33 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
