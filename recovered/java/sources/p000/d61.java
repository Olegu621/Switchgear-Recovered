            package p000;

            import android.net.Uri;
            import com.google.android.gms.common.data.DataHolder;
            import com.google.android.gms.games.Player;
            import com.google.android.gms.games.PlayerRef;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class d61 extends z30 implements a61 {

                /* JADX INFO: renamed from: d */
                public final PlayerRef f7018d;

                public d61(DataHolder dataHolder, int i) {
/* 1 */             super(dataHolder, i);
/* 9 */             this.f7018d = new PlayerRef(dataHolder, i);
                }

                @Override // p000.a61
                /* JADX INFO: renamed from: D */
                public final String mo74D() {
/* 3 */             return m10270j("score_tag");
                }

                @Override // p000.a61
                /* JADX INFO: renamed from: N0 */
                public final String mo75N0() {
                    return m10272u("external_player_id") ? m10270j("default_display_name") : this.f7018d.mo2085f();
                }

                @Override // p000.a61
                /* JADX INFO: renamed from: S */
                public final long mo76S() {
/* 3 */             return m10269e("achieved_timestamp");
                }

                @Override // p000.a61
                /* JADX INFO: renamed from: U */
                public final long mo77U() {
/* 3 */             return m10269e("raw_score");
                }

                @Override // p000.a61
                /* JADX INFO: renamed from: V */
                public final long mo78V() {
/* 3 */             return m10269e("rank");
                }

                @Override // p000.a61
                /* JADX INFO: renamed from: V0 */
                public final Uri mo79V0() {
                    return m10272u("external_player_id") ? m10273w("default_display_image_uri") : this.f7018d.mo2084c();
                }

                @Override // p000.a61
                /* JADX INFO: renamed from: W0 */
                public final String mo80W0() {
/* 3 */             return m10270j("display_score");
                }

                @Override // p000.z30
                public final boolean equals(Object obj) {
/* 1 */             return c61.m1544d(this, obj);
                }

                @Override // p000.a61
                /* JADX INFO: renamed from: g1 */
                public final Uri mo81g1() {
/* 7 */             if (m10272u("external_player_id")) {
/* 9 */                 return null;
                    }
/* 13 */            return this.f7018d.mo2087h();
                }

                @Override // p000.a61
                public final String getScoreHolderHiResImageUrl() {
/* 7 */             if (m10272u("external_player_id")) {
/* 9 */                 return null;
                    }
/* 13 */            return this.f7018d.getHiResImageUrl();
                }

                @Override // p000.a61
                public final String getScoreHolderIconImageUrl() {
                    return m10272u("external_player_id") ? m10270j("default_display_image_url") : this.f7018d.getIconImageUrl();
                }

                @Override // p000.z30
                public final int hashCode() {
/* 1 */             return c61.m1542a(this);
                }

                @Override // p000.a61
                /* JADX INFO: renamed from: m */
                public final Player mo82m() {
/* 7 */             if (m10272u("external_player_id")) {
/* 9 */                 return null;
                    }
/* 11 */            return this.f7018d;
                }

                @Override // p000.a61
                /* JADX INFO: renamed from: o1 */
                public final String mo83o1() {
/* 3 */             return m10270j("display_rank");
                }

                public final String toString() {
/* 1 */             return c61.m1543b(this);
                }
            }
