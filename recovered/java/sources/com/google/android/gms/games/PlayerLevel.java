            package com.google.android.gms.games;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.games.internal.zzh;
            import java.util.Arrays;
            import p000.cl3;
            import p000.de3;
            import p000.kb1;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class PlayerLevel extends zzh {
                public static final Parcelable.Creator<PlayerLevel> CREATOR = new cl3(28);

                /* JADX INFO: renamed from: a */
                public final int f3959a;

                /* JADX INFO: renamed from: b */
                public final long f3960b;

                /* JADX INFO: renamed from: c */
                public final long f3961c;

                public PlayerLevel(int i, long j, long j2) {
/* 17 */            kb1.m6063p("Min XP must be positive!", j >= 0);
/* 27 */            kb1.m6063p("Max XP must be more than min XP!", j2 > j);
/* 30 */            this.f3959a = i;
/* 32 */            this.f3960b = j;
/* 34 */            this.f3961c = j2;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof PlayerLevel)) {
/* 3 */                 return false;
                    }
/* 8 */             if (this == obj) {
/* 7 */                 return true;
                    }
/* 11 */            PlayerLevel playerLevel = (PlayerLevel) obj;
                    return de3.m3029k(Integer.valueOf(playerLevel.f3959a), Integer.valueOf(this.f3959a)) && de3.m3029k(Long.valueOf(playerLevel.f3960b), Long.valueOf(this.f3960b)) && de3.m3029k(Long.valueOf(playerLevel.f3961c), Long.valueOf(this.f3961c));
                }

                public final int hashCode() {
/* 23 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3959a), Long.valueOf(this.f3960b), Long.valueOf(this.f3961c)});
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 14 */            wc0Var.m9529d(Integer.valueOf(this.f3959a), "LevelNumber");
/* 25 */            wc0Var.m9529d(Long.valueOf(this.f3960b), "MinXp");
/* 36 */            wc0Var.m9529d(Long.valueOf(this.f3961c), "MaxXp");
/* 39 */            return wc0Var.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3959a);
/* 20 */            w11.m9420b0(parcel, 2, 8);
/* 25 */            parcel.writeLong(this.f3960b);
/* 29 */            w11.m9420b0(parcel, 3, 8);
/* 34 */            parcel.writeLong(this.f3961c);
/* 37 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
