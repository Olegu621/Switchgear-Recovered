            package com.google.android.gms.games.stats;

            import android.os.Bundle;
            import android.os.Parcel;
            import p000.tc3;
            import p000.z30;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzb extends z30 implements PlayerStats {

                /* JADX INFO: renamed from: d */
                public Bundle f4076d;

                @Override // com.google.android.gms.games.stats.PlayerStats
                /* JADX INFO: renamed from: A1 */
                public final float mo2141A1() {
/* 3 */             return m10267b("ave_session_length_minutes");
                }

                @Override // com.google.android.gms.games.stats.PlayerStats
                /* JADX INFO: renamed from: N */
                public final float mo2142N() {
/* 7 */             if (m10271r("total_spend_next_28_days")) {
/* 12 */                return m10267b("total_spend_next_28_days");
                    }
/* 9 */             return -1.0f;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // p000.z30
                public final boolean equals(Object obj) {
/* 1 */             return PlayerStatsEntity.m2153F1(this, obj);
                }

                @Override // p000.z30
                public final int hashCode() {
/* 1 */             return PlayerStatsEntity.m2151D1(this);
                }

                @Override // com.google.android.gms.games.stats.PlayerStats
                /* JADX INFO: renamed from: i */
                public final float mo2143i() {
/* 3 */             return m10267b("churn_probability");
                }

                @Override // com.google.android.gms.games.stats.PlayerStats
                /* JADX INFO: renamed from: k1 */
                public final float mo2144k1() {
/* 7 */             if (m10271r("high_spender_probability")) {
/* 12 */                return m10267b("high_spender_probability");
                    }
/* 9 */             return -1.0f;
                }

                @Override // com.google.android.gms.games.stats.PlayerStats
                /* JADX INFO: renamed from: m1 */
                public final int mo2145m1() {
/* 3 */             return m10268d("days_since_last_played");
                }

                @Override // com.google.android.gms.games.stats.PlayerStats
                /* JADX INFO: renamed from: p0 */
                public final float mo2146p0() {
/* 3 */             return m10267b("num_sessions_percentile");
                }

                @Override // com.google.android.gms.games.stats.PlayerStats
                /* JADX INFO: renamed from: t */
                public final int mo2147t() {
/* 3 */             return m10268d("num_sessions");
                }

                @Override // com.google.android.gms.games.stats.PlayerStats
                /* JADX INFO: renamed from: t0 */
                public final float mo2148t0() {
/* 7 */             if (m10271r("spend_probability")) {
/* 12 */                return m10267b("spend_probability");
                    }
/* 9 */             return -1.0f;
                }

                public final String toString() {
/* 1 */             return PlayerStatsEntity.m2152E1(this);
                }

                @Override // com.google.android.gms.games.stats.PlayerStats
                /* JADX INFO: renamed from: u0 */
                public final int mo2149u0() {
/* 3 */             return m10268d("num_purchases");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 6 */             tc3.m8780a(new PlayerStatsEntity(this), parcel);
                }

                @Override // com.google.android.gms.games.stats.PlayerStats
                /* JADX INFO: renamed from: y */
                public final float mo2150y() {
/* 3 */             return m10267b("spend_percentile");
                }
            }
