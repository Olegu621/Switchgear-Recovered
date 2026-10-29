            package com.google.android.gms.games.internal.game;

            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
            import java.util.Arrays;
            import p000.de3;
            import p000.md3;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class GameBadgeEntity extends GamesDowngradeableSafeParcel implements zza {
                public static final Parcelable.Creator<GameBadgeEntity> CREATOR = new md3(17);

                /* JADX INFO: renamed from: b */
                public int f4009b;

                /* JADX INFO: renamed from: c */
                public String f4010c;

                /* JADX INFO: renamed from: d */
                public String f4011d;

                /* JADX INFO: renamed from: e */
                public Uri f4012e;

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof zza)) {
/* 42 */                return false;
                    }
/* 6 */             if (this == obj) {
/* 40 */                return true;
                    }
/* 9 */             zza zzaVar = (zza) obj;
                    return de3.m3029k(Integer.valueOf(zzaVar.zza()), this.f4010c) && de3.m3029k(zzaVar.zzb(), this.f4012e);
                }

                public final int hashCode() {
/* 17 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4009b), this.f4010c, this.f4011d, this.f4012e});
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 14 */            wc0Var.m9529d(Integer.valueOf(this.f4009b), "Type");
/* 21 */            wc0Var.m9529d(this.f4010c, "Title");
/* 28 */            wc0Var.m9529d(this.f4011d, "Description");
/* 35 */            wc0Var.m9529d(this.f4012e, "IconImageUri");
/* 38 */            return wc0Var.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             int i2 = this.f4009b;
/* 11 */            w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 21 */            w11.m9410T(parcel, 2, this.f4010c, false);
/* 27 */            w11.m9410T(parcel, 3, this.f4011d, false);
/* 32 */            w11.m9409S(parcel, 4, this.f4012e, i, false);
/* 35 */            w11.m9428f0(iM9422c0, parcel);
                }

                @Override // com.google.android.gms.games.internal.game.zza
                public final int zza() {
/* 1 */             return this.f4009b;
                }

                @Override // com.google.android.gms.games.internal.game.zza
                public final String zzb() {
/* 1 */             return this.f4011d;
                }
            }
