            package com.google.android.gms.games.achievement;

            import android.os.Parcel;
            import com.google.android.gms.games.Player;
            import com.google.android.gms.games.PlayerRef;
            import p000.kb1;
            import p000.z30;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AchievementRef extends z30 implements Achievement {
                @Override // com.google.android.gms.games.achievement.Achievement
                /* JADX INFO: renamed from: D0 */
                public final int mo2094D0() {
/* 12 */            kb1.m6064q(m10268d("type") == 1);
/* 17 */            return m10268d("current_steps");
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                /* JADX INFO: renamed from: U0 */
                public final long mo2095U0() {
/* 3 */             return m10269e("last_updated_timestamp");
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                /* JADX INFO: renamed from: W */
                public final long mo2096W() {
                    return (!m10271r("instance_xp_value") || m10272u("instance_xp_value")) ? m10269e("definition_xp_value") : m10269e("instance_xp_value");
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // p000.z30
                public final boolean equals(Object obj) {
/* 1 */             return AchievementEntity.m2101F1(this, obj);
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                /* JADX INFO: renamed from: f1 */
                public final int mo2097f1() {
/* 12 */            kb1.m6064q(m10268d("type") == 1);
/* 17 */            return m10268d("total_steps");
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                public final String getDescription() {
/* 3 */             return m10270j("description");
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                public final String getName() {
/* 3 */             return m10270j("name");
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                public final int getState() {
/* 3 */             return m10268d("state");
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                public final int getType() {
/* 3 */             return m10268d("type");
                }

                @Override // p000.z30
                public final int hashCode() {
/* 1 */             return AchievementEntity.m2099D1(this);
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                /* JADX INFO: renamed from: n0 */
                public final String mo2098n0() {
/* 3 */             return m10270j("external_achievement_id");
                }

                public final String toString() {
/* 1 */             return AchievementEntity.m2100E1(this);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 6 */             new AchievementEntity(this).writeToParcel(parcel, i);
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                public final float zza() {
/* 7 */             if (!m10271r("rarity_percent") || m10272u("rarity_percent")) {
/* 21 */                return -1.0f;
                    }
/* 16 */            return m10267b("rarity_percent");
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                public final Player zzb() {
/* 7 */             if (m10272u("external_player_id")) {
/* 9 */                 return null;
                    }
/* 17 */            return new PlayerRef(this.f19921a, this.f19922b);
                }

                @Override // com.google.android.gms.games.achievement.Achievement
                public final String zzc() {
/* 3 */             return m10270j("external_game_id");
                }
            }
