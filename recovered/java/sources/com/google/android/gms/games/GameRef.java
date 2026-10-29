            package com.google.android.gms.games;

            import android.net.Uri;
            import android.os.Parcel;
            import p000.z30;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class GameRef extends z30 implements Game {
                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: A */
                public final String mo2063A() {
/* 3 */             return m10270j("primary_category");
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: O */
                public final String mo2064O() {
/* 3 */             return m10270j("developer_name");
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: Q */
                public final int mo2065Q() {
/* 3 */             return m10268d("leaderboard_count");
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: c */
                public final Uri mo2066c() {
/* 3 */             return m10273w("game_icon_image_uri");
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // p000.z30
                public final boolean equals(Object obj) {
/* 1 */             return GameEntity.m2078H1(this, obj);
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: f */
                public final String mo2067f() {
/* 3 */             return m10270j("display_name");
                }

                @Override // com.google.android.gms.games.Game
                public final String getDescription() {
/* 3 */             return m10270j("game_description");
                }

                @Override // com.google.android.gms.games.Game
                public final String getFeaturedImageUrl() {
/* 3 */             return m10270j("featured_image_url");
                }

                @Override // com.google.android.gms.games.Game
                public final String getHiResImageUrl() {
/* 3 */             return m10270j("game_hi_res_image_url");
                }

                @Override // com.google.android.gms.games.Game
                public final String getIconImageUrl() {
/* 3 */             return m10270j("game_icon_image_url");
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: h */
                public final Uri mo2068h() {
/* 3 */             return m10273w("game_hi_res_image_uri");
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: h0 */
                public final String mo2069h0() {
/* 3 */             return m10270j("theme_color");
                }

                @Override // p000.z30
                public final int hashCode() {
/* 1 */             return GameEntity.m2076F1(this);
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: k0 */
                public final boolean mo2070k0() {
                    return m10268d("snapshots_enabled") > 0;
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: l1 */
                public final boolean mo2071l1() {
                    return m10268d("gamepad_support") > 0;
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: q */
                public final String mo2072q() {
/* 3 */             return m10270j("external_game_id");
                }

                public final String toString() {
/* 1 */             return GameEntity.m2077G1(this);
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: w0 */
                public final int mo2073w0() {
/* 3 */             return m10268d("achievement_total_count");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 6 */             new GameEntity(this).writeToParcel(parcel, i);
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: y0 */
                public final String mo2074y0() {
/* 3 */             return m10270j("secondary_category");
                }

                @Override // com.google.android.gms.games.Game
                /* JADX INFO: renamed from: y1 */
                public final Uri mo2075y1() {
/* 3 */             return m10273w("featured_image_uri");
                }

                @Override // com.google.android.gms.games.Game
                public final String zza() {
/* 3 */             return m10270j("package_name");
                }

                @Override // com.google.android.gms.games.Game
                public final boolean zzb() {
/* 3 */             return m10266a("identity_sharing_confirmed");
                }

                @Override // com.google.android.gms.games.Game
                public final boolean zzc() {
                    return m10268d("installed") > 0;
                }

                @Override // com.google.android.gms.games.Game
                public final boolean zzd() {
/* 3 */             return m10266a("muted");
                }

                @Override // com.google.android.gms.games.Game
                public final boolean zze() {
/* 3 */             return m10266a("play_enabled_game");
                }

                @Override // com.google.android.gms.games.Game
                public final boolean zzf() {
                    return m10268d("real_time_support") > 0;
                }

                @Override // com.google.android.gms.games.Game
                public final boolean zzg() {
                    return m10268d("turn_based_support") > 0;
                }
            }
