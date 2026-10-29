            package com.google.android.gms.games.internal.player;

            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.games.internal.zzh;
            import java.util.Arrays;
            import p000.de3;
            import p000.tf3;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class StockProfileImageEntity extends zzh implements StockProfileImage {
                public static final Parcelable.Creator<StockProfileImageEntity> CREATOR = new tf3(8);

                /* JADX INFO: renamed from: a */
                public final String f4036a;

                /* JADX INFO: renamed from: b */
                public final Uri f4037b;

                public StockProfileImageEntity(Uri uri, String str) {
/* 4 */             this.f4036a = str;
/* 6 */             this.f4037b = uri;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof StockProfileImage)) {
/* 37 */                return false;
                    }
/* 6 */             if (obj == this) {
/* 35 */                return true;
                    }
/* 9 */             StockProfileImage stockProfileImage = (StockProfileImage) obj;
                    return de3.m3029k(this.f4036a, stockProfileImage.mo2111i0()) && de3.m3029k(this.f4037b, stockProfileImage.zza());
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.f4036a, this.f4037b});
                }

                @Override // com.google.android.gms.games.internal.player.StockProfileImage
                /* JADX INFO: renamed from: i0 */
                public final String mo2111i0() {
/* 1 */             return this.f4036a;
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 10 */            wc0Var.m9529d(this.f4036a, "ImageId");
/* 17 */            wc0Var.m9529d(this.f4037b, "ImageUri");
/* 20 */            return wc0Var.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f4036a, false);
/* 17 */            w11.m9409S(parcel, 2, this.f4037b, i, false);
/* 20 */            w11.m9428f0(iM9422c0, parcel);
                }

                @Override // com.google.android.gms.games.internal.player.StockProfileImage
                public final Uri zza() {
/* 1 */             return this.f4037b;
                }
            }
