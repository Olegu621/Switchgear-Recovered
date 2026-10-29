            package p000;

            import android.net.Uri;
            import com.google.android.gms.games.Player;
            import com.google.android.gms.games.PlayerEntity;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class c61 implements a61 {

                /* JADX INFO: renamed from: U */
                public final String f2734U;

                /* JADX INFO: renamed from: V */
                public final String f2735V;

                /* JADX INFO: renamed from: W */
                public final String f2736W;

                /* JADX INFO: renamed from: a */
                public final long f2737a;

                /* JADX INFO: renamed from: b */
                public final String f2738b;

                /* JADX INFO: renamed from: c */
                public final String f2739c;

                /* JADX INFO: renamed from: d */
                public final long f2740d;

                /* JADX INFO: renamed from: e */
                public final long f2741e;

                /* JADX INFO: renamed from: f */
                public final String f2742f;

                /* JADX INFO: renamed from: i */
                public final Uri f2743i;

                /* JADX INFO: renamed from: v */
                public final Uri f2744v;

                /* JADX INFO: renamed from: w */
                public final PlayerEntity f2745w;

                public c61(d61 d61Var) {
/* 10 */            this.f2737a = d61Var.m10269e("rank");
/* 14 */            String strM10270j = d61Var.m10270j("display_rank");
/* 18 */            kb1.m6061n(strM10270j);
/* 21 */            this.f2738b = strM10270j;
/* 25 */            String strM10270j2 = d61Var.m10270j("display_score");
/* 29 */            kb1.m6061n(strM10270j2);
/* 32 */            this.f2739c = strM10270j2;
/* 40 */            this.f2740d = d61Var.m10269e("raw_score");
/* 48 */            this.f2741e = d61Var.m10269e("achieved_timestamp");
/* 54 */            this.f2742f = d61Var.mo75N0();
/* 60 */            this.f2743i = d61Var.mo79V0();
/* 66 */            this.f2744v = d61Var.mo81g1();
/* 68 */            Player playerMo82m = d61Var.mo82m();
/* 82 */            this.f2745w = playerMo82m == null ? null : new PlayerEntity(playerMo82m);
/* 90 */            this.f2734U = d61Var.m10270j("score_tag");
/* 96 */            this.f2735V = d61Var.getScoreHolderIconImageUrl();
/* 102 */           this.f2736W = d61Var.getScoreHolderHiResImageUrl();
                }

                /* JADX INFO: renamed from: a */
                public static int m1542a(a61 a61Var) {
/* 53 */            return Arrays.hashCode(new Object[]{Long.valueOf(a61Var.mo78V()), a61Var.mo83o1(), Long.valueOf(a61Var.mo77U()), a61Var.mo80W0(), Long.valueOf(a61Var.mo76S()), a61Var.mo75N0(), a61Var.mo79V0(), a61Var.mo81g1(), a61Var.mo82m()});
                }

                /* JADX INFO: renamed from: b */
                public static String m1543b(a61 a61Var) {
/* 3 */             wc0 wc0Var = new wc0(a61Var);
/* 16 */            wc0Var.m9529d(Long.valueOf(a61Var.mo78V()), "Rank");
/* 25 */            wc0Var.m9529d(a61Var.mo83o1(), "DisplayRank");
/* 38 */            wc0Var.m9529d(Long.valueOf(a61Var.mo77U()), "Score");
/* 47 */            wc0Var.m9529d(a61Var.mo80W0(), "DisplayScore");
/* 60 */            wc0Var.m9529d(Long.valueOf(a61Var.mo76S()), "Timestamp");
/* 69 */            wc0Var.m9529d(a61Var.mo75N0(), "DisplayName");
/* 78 */            wc0Var.m9529d(a61Var.mo79V0(), "IconImageUri");
/* 87 */            wc0Var.m9529d(a61Var.getScoreHolderIconImageUrl(), "IconImageUrl");
/* 96 */            wc0Var.m9529d(a61Var.mo81g1(), "HiResImageUri");
/* 105 */           wc0Var.m9529d(a61Var.getScoreHolderHiResImageUrl(), "HiResImageUrl");
/* 122 */           wc0Var.m9529d(a61Var.mo82m() == null ? null : a61Var.mo82m(), "Player");
/* 131 */           wc0Var.m9529d(a61Var.mo74D(), "ScoreTag");
/* 134 */           return wc0Var.toString();
                }

                /* JADX INFO: renamed from: d */
                public static boolean m1544d(a61 a61Var, Object obj) {
/* 3 */             if (!(obj instanceof a61)) {
/* 179 */               return false;
                    }
/* 7 */             if (a61Var == obj) {
/* 177 */               return true;
                    }
/* 11 */            a61 a61Var2 = (a61) obj;
                    return de3.m3029k(Long.valueOf(a61Var2.mo78V()), Long.valueOf(a61Var.mo78V())) && de3.m3029k(a61Var2.mo83o1(), a61Var.mo83o1()) && de3.m3029k(Long.valueOf(a61Var2.mo77U()), Long.valueOf(a61Var.mo77U())) && de3.m3029k(a61Var2.mo80W0(), a61Var.mo80W0()) && de3.m3029k(Long.valueOf(a61Var2.mo76S()), Long.valueOf(a61Var.mo76S())) && de3.m3029k(a61Var2.mo75N0(), a61Var.mo75N0()) && de3.m3029k(a61Var2.mo79V0(), a61Var.mo79V0()) && de3.m3029k(a61Var2.mo81g1(), a61Var.mo81g1()) && de3.m3029k(a61Var2.mo82m(), a61Var.mo82m()) && de3.m3029k(a61Var2.mo74D(), a61Var.mo74D());
                }

                @Override // p000.a61
                /* JADX INFO: renamed from: D */
                public final String mo74D() {
/* 1 */             return this.f2734U;
                }

                @Override // p000.a61
                /* JADX INFO: renamed from: N0 */
                public final String mo75N0() {
/* 1 */             PlayerEntity playerEntity = this.f2745w;
                    return playerEntity == null ? this.f2742f : playerEntity.f3944c;
                }

                @Override // p000.a61
                /* JADX INFO: renamed from: S */
                public final long mo76S() {
/* 1 */             return this.f2741e;
                }

                @Override // p000.a61
                /* JADX INFO: renamed from: U */
                public final long mo77U() {
/* 1 */             return this.f2740d;
                }

                @Override // p000.a61
                /* JADX INFO: renamed from: V */
                public final long mo78V() {
/* 1 */             return this.f2737a;
                }

                @Override // p000.a61
                /* JADX INFO: renamed from: V0 */
                public final Uri mo79V0() {
/* 1 */             PlayerEntity playerEntity = this.f2745w;
                    return playerEntity == null ? this.f2743i : playerEntity.f3946d;
                }

                @Override // p000.a61
                /* JADX INFO: renamed from: W0 */
                public final String mo80W0() {
/* 1 */             return this.f2739c;
                }

                public final boolean equals(Object obj) {
/* 1 */             return m1544d(this, obj);
                }

                @Override // p000.a61
                /* JADX INFO: renamed from: g1 */
                public final Uri mo81g1() {
/* 1 */             PlayerEntity playerEntity = this.f2745w;
                    return playerEntity == null ? this.f2744v : playerEntity.f3948e;
                }

                @Override // p000.a61
                public final String getScoreHolderHiResImageUrl() {
/* 1 */             PlayerEntity playerEntity = this.f2745w;
                    return playerEntity == null ? this.f2736W : playerEntity.f3935U;
                }

                @Override // p000.a61
                public final String getScoreHolderIconImageUrl() {
/* 1 */             PlayerEntity playerEntity = this.f2745w;
                    return playerEntity == null ? this.f2735V : playerEntity.f3958w;
                }

                public final int hashCode() {
/* 1 */             return m1542a(this);
                }

                @Override // p000.a61
                /* JADX INFO: renamed from: m */
                public final Player mo82m() {
/* 1 */             return this.f2745w;
                }

                @Override // p000.a61
                /* JADX INFO: renamed from: o1 */
                public final String mo83o1() {
/* 1 */             return this.f2738b;
                }

                public final String toString() {
/* 1 */             return m1543b(this);
                }
            }
