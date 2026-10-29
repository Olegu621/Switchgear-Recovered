            package com.google.android.gms.games.stats;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.games.internal.zzh;
            import java.util.Arrays;
            import p000.de3;
            import p000.f42;
            import p000.tc3;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 151 */   public class PlayerStatsEntity extends zzh implements PlayerStats {
                public static final Parcelable.Creator<PlayerStatsEntity> CREATOR = new tc3(10);

                /* JADX INFO: renamed from: U */
                public final float f4065U;

                /* JADX INFO: renamed from: V */
                public final float f4066V;

                /* JADX INFO: renamed from: a */
                public final float f4067a;

                /* JADX INFO: renamed from: b */
                public final float f4068b;

                /* JADX INFO: renamed from: c */
                public final int f4069c;

                /* JADX INFO: renamed from: d */
                public final int f4070d;

                /* JADX INFO: renamed from: e */
                public final int f4071e;

                /* JADX INFO: renamed from: f */
                public final float f4072f;

                /* JADX INFO: renamed from: i */
                public final float f4073i;

                /* JADX INFO: renamed from: v */
                public final Bundle f4074v;

                /* JADX INFO: renamed from: w */
                public final float f4075w;

                public PlayerStatsEntity(zzb zzbVar) {
/* 10 */            this.f4067a = zzbVar.m10267b("ave_session_length_minutes");
/* 18 */            this.f4068b = zzbVar.m10267b("churn_probability");
/* 26 */            this.f4069c = zzbVar.m10268d("days_since_last_played");
/* 34 */            this.f4070d = zzbVar.m10268d("num_purchases");
/* 42 */            this.f4071e = zzbVar.m10268d("num_sessions");
/* 50 */            this.f4072f = zzbVar.m10267b("num_sessions_percentile");
/* 58 */            this.f4073i = zzbVar.m10267b("spend_percentile");
/* 64 */            this.f4075w = zzbVar.mo2148t0();
/* 70 */            this.f4065U = zzbVar.mo2144k1();
/* 76 */            this.f4066V = zzbVar.mo2142N();
/* 78 */            Bundle bundle = zzbVar.f4076d;
/* 80 */            if (bundle == null) {
/* 88 */                zzbVar.f4076d = new Bundle();
/* 92 */                String strM10270j = zzbVar.m10270j("unknown_raw_keys");
/* 98 */                String strM10270j2 = zzbVar.m10270j("unknown_raw_values");
/* 102 */               if (strM10270j != null && strM10270j2 != null) {
/* 108 */                   String[] strArrSplit = strM10270j.split(",");
/* 112 */                   String[] strArrSplit2 = strM10270j2.split(",");
/* 124 */                   if (!(strArrSplit.length <= strArrSplit2.length)) {
/* 143 */                       f42.m3656l("Invalid raw arguments!");
/* 147 */                       throw null;
                            }
/* 127 */                   for (int i = 0; i < strArrSplit.length; i++) {
/* 135 */                       zzbVar.f4076d.putString(strArrSplit[i], strArrSplit2[i]);
                            }
                        }
/* 148 */               bundle = zzbVar.f4076d;
                    }
/* 150 */           this.f4074v = bundle;
                }

                /* JADX INFO: renamed from: D1 */
                public static int m2151D1(PlayerStats playerStats) {
/* 85 */            return Arrays.hashCode(new Object[]{Float.valueOf(playerStats.mo2141A1()), Float.valueOf(playerStats.mo2143i()), Integer.valueOf(playerStats.mo2145m1()), Integer.valueOf(playerStats.mo2149u0()), Integer.valueOf(playerStats.mo2147t()), Float.valueOf(playerStats.mo2146p0()), Float.valueOf(playerStats.mo2150y()), Float.valueOf(playerStats.mo2148t0()), Float.valueOf(playerStats.mo2144k1()), Float.valueOf(playerStats.mo2142N())});
                }

                /* JADX INFO: renamed from: E1 */
                public static String m2152E1(PlayerStats playerStats) {
/* 3 */             wc0 wc0Var = new wc0(playerStats);
/* 16 */            wc0Var.m9529d(Float.valueOf(playerStats.mo2141A1()), "AverageSessionLength");
/* 29 */            wc0Var.m9529d(Float.valueOf(playerStats.mo2143i()), "ChurnProbability");
/* 42 */            wc0Var.m9529d(Integer.valueOf(playerStats.mo2145m1()), "DaysSinceLastPlayed");
/* 55 */            wc0Var.m9529d(Integer.valueOf(playerStats.mo2149u0()), "NumberOfPurchases");
/* 68 */            wc0Var.m9529d(Integer.valueOf(playerStats.mo2147t()), "NumberOfSessions");
/* 81 */            wc0Var.m9529d(Float.valueOf(playerStats.mo2146p0()), "SessionPercentile");
/* 94 */            wc0Var.m9529d(Float.valueOf(playerStats.mo2150y()), "SpendPercentile");
/* 107 */           wc0Var.m9529d(Float.valueOf(playerStats.mo2148t0()), "SpendProbability");
/* 120 */           wc0Var.m9529d(Float.valueOf(playerStats.mo2144k1()), "HighSpenderProbability");
/* 133 */           wc0Var.m9529d(Float.valueOf(playerStats.mo2142N()), "TotalSpendNext28Days");
/* 136 */           return wc0Var.toString();
                }

                /* JADX INFO: renamed from: F1 */
                public static boolean m2153F1(PlayerStats playerStats, Object obj) {
/* 3 */             if (!(obj instanceof PlayerStats)) {
/* 235 */               return false;
                    }
/* 7 */             if (playerStats == obj) {
/* 233 */               return true;
                    }
/* 11 */            PlayerStats playerStats2 = (PlayerStats) obj;
                    return de3.m3029k(Float.valueOf(playerStats2.mo2141A1()), Float.valueOf(playerStats.mo2141A1())) && de3.m3029k(Float.valueOf(playerStats2.mo2143i()), Float.valueOf(playerStats.mo2143i())) && de3.m3029k(Integer.valueOf(playerStats2.mo2145m1()), Integer.valueOf(playerStats.mo2145m1())) && de3.m3029k(Integer.valueOf(playerStats2.mo2149u0()), Integer.valueOf(playerStats.mo2149u0())) && de3.m3029k(Integer.valueOf(playerStats2.mo2147t()), Integer.valueOf(playerStats.mo2147t())) && de3.m3029k(Float.valueOf(playerStats2.mo2146p0()), Float.valueOf(playerStats.mo2146p0())) && de3.m3029k(Float.valueOf(playerStats2.mo2150y()), Float.valueOf(playerStats.mo2150y())) && de3.m3029k(Float.valueOf(playerStats2.mo2148t0()), Float.valueOf(playerStats.mo2148t0())) && de3.m3029k(Float.valueOf(playerStats2.mo2144k1()), Float.valueOf(playerStats.mo2144k1())) && de3.m3029k(Float.valueOf(playerStats2.mo2142N()), Float.valueOf(playerStats.mo2142N()));
                }

                @Override // com.google.android.gms.games.stats.PlayerStats
                /* JADX INFO: renamed from: A1 */
                public final float mo2141A1() {
/* 1 */             return this.f4067a;
                }

                @Override // com.google.android.gms.games.stats.PlayerStats
                /* JADX INFO: renamed from: N */
                public final float mo2142N() {
/* 1 */             return this.f4066V;
                }

                public final boolean equals(Object obj) {
/* 1 */             return m2153F1(this, obj);
                }

                public final int hashCode() {
/* 1 */             return m2151D1(this);
                }

                @Override // com.google.android.gms.games.stats.PlayerStats
                /* JADX INFO: renamed from: i */
                public final float mo2143i() {
/* 1 */             return this.f4068b;
                }

                @Override // com.google.android.gms.games.stats.PlayerStats
                /* JADX INFO: renamed from: k1 */
                public final float mo2144k1() {
/* 1 */             return this.f4065U;
                }

                @Override // com.google.android.gms.games.stats.PlayerStats
                /* JADX INFO: renamed from: m1 */
                public final int mo2145m1() {
/* 1 */             return this.f4069c;
                }

                @Override // com.google.android.gms.games.stats.PlayerStats
                /* JADX INFO: renamed from: p0 */
                public final float mo2146p0() {
/* 1 */             return this.f4072f;
                }

                @Override // com.google.android.gms.games.stats.PlayerStats
                /* JADX INFO: renamed from: t */
                public final int mo2147t() {
/* 1 */             return this.f4071e;
                }

                @Override // com.google.android.gms.games.stats.PlayerStats
                /* JADX INFO: renamed from: t0 */
                public final float mo2148t0() {
/* 1 */             return this.f4075w;
                }

                public final String toString() {
/* 1 */             return m2152E1(this);
                }

                @Override // com.google.android.gms.games.stats.PlayerStats
                /* JADX INFO: renamed from: u0 */
                public final int mo2149u0() {
/* 1 */             return this.f4070d;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             tc3.m8780a(this, parcel);
                }

                @Override // com.google.android.gms.games.stats.PlayerStats
                /* JADX INFO: renamed from: y */
                public final float mo2150y() {
/* 1 */             return this.f4073i;
                }

/* 152 */       public PlayerStatsEntity(float f, float f2, int i, int i2, int i3, float f3, float f4, Bundle bundle, float f5, float f6, float f7) {
/* 154 */           this.f4067a = f;
                    this.f4068b = f2;
                    this.f4069c = i;
                    this.f4070d = i2;
                    this.f4071e = i3;
                    this.f4072f = f3;
                    this.f4073i = f4;
                    this.f4074v = bundle;
                    this.f4075w = f5;
                    this.f4065U = f6;
                    this.f4066V = f7;
                }
            }
