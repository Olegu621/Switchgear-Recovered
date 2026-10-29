            package com.google.android.gms.games;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.games.internal.zzh;
            import java.util.Arrays;
            import p000.de3;
            import p000.dr3;
            import p000.kb1;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class PlayerLevelInfo extends zzh {
                public static final Parcelable.Creator<PlayerLevelInfo> CREATOR = new dr3(6);

                /* JADX INFO: renamed from: a */
                public final long f3962a;

                /* JADX INFO: renamed from: b */
                public final long f3963b;

                /* JADX INFO: renamed from: c */
                public final PlayerLevel f3964c;

                /* JADX INFO: renamed from: d */
                public final PlayerLevel f3965d;

                public PlayerLevelInfo(long j, long j2, PlayerLevel playerLevel, PlayerLevel playerLevel2) {
/* 13 */            kb1.m6065r(j != -1);
/* 16 */            kb1.m6061n(playerLevel);
/* 19 */            kb1.m6061n(playerLevel2);
/* 22 */            this.f3962a = j;
/* 24 */            this.f3963b = j2;
/* 26 */            this.f3964c = playerLevel;
/* 28 */            this.f3965d = playerLevel2;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof PlayerLevelInfo)) {
/* 3 */                 return false;
                    }
/* 8 */             if (obj == this) {
/* 7 */                 return true;
                    }
/* 11 */            PlayerLevelInfo playerLevelInfo = (PlayerLevelInfo) obj;
                    return de3.m3029k(Long.valueOf(this.f3962a), Long.valueOf(playerLevelInfo.f3962a)) && de3.m3029k(Long.valueOf(this.f3963b), Long.valueOf(playerLevelInfo.f3963b)) && de3.m3029k(this.f3964c, playerLevelInfo.f3964c) && de3.m3029k(this.f3965d, playerLevelInfo.f3965d);
                }

                public final int hashCode() {
/* 21 */            return Arrays.hashCode(new Object[]{Long.valueOf(this.f3962a), Long.valueOf(this.f3963b), this.f3964c, this.f3965d});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 10 */            w11.m9420b0(parcel, 1, 8);
/* 15 */            parcel.writeLong(this.f3962a);
/* 19 */            w11.m9420b0(parcel, 2, 8);
/* 24 */            parcel.writeLong(this.f3963b);
/* 31 */            w11.m9409S(parcel, 3, this.f3964c, i, false);
/* 37 */            w11.m9409S(parcel, 4, this.f3965d, i, false);
/* 40 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
