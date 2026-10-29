            package p000;

            import android.net.Uri;
            import com.google.android.gms.games.GameEntity;
            import com.google.android.gms.games.GameRef;
            import java.util.ArrayList;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class y51 implements w51 {

                /* JADX INFO: renamed from: a */
                public final String f19483a;

                /* JADX INFO: renamed from: b */
                public final String f19484b;

                /* JADX INFO: renamed from: c */
                public final Uri f19485c;

                /* JADX INFO: renamed from: d */
                public final int f19486d;

                /* JADX INFO: renamed from: e */
                public final ArrayList f19487e;

                /* JADX INFO: renamed from: f */
                public final String f19488f;

                public y51(z51 z51Var) {
/* 10 */            this.f19483a = z51Var.m10270j("external_leaderboard_id");
/* 18 */            this.f19484b = z51Var.m10270j("name");
/* 26 */            this.f19485c = z51Var.m10273w("board_icon_image_uri");
/* 34 */            this.f19488f = z51Var.m10270j("board_icon_image_url");
/* 42 */            this.f19486d = z51Var.m10268d("score_order");
/* 44 */            GameRef gameRef = z51Var.f19941e;
/* 46 */            if (gameRef != null) {
/* 51 */                new GameEntity(gameRef);
                    }
/* 54 */            ArrayList arrayListMo9472L = z51Var.mo9472L();
/* 58 */            int size = arrayListMo9472L.size();
/* 67 */            this.f19487e = new ArrayList(size);
/* 70 */            for (int i = 0; i < size; i++) {
/* 84 */                this.f19487e.add(((e61) arrayListMo9472L.get(i)).freeze());
                    }
                }

                /* JADX INFO: renamed from: a */
                public static String m10104a(w51 w51Var) {
/* 3 */             wc0 wc0Var = new wc0(w51Var);
/* 12 */            wc0Var.m9529d(w51Var.mo9473S0(), "LeaderboardId");
/* 21 */            wc0Var.m9529d(w51Var.mo9476f(), "DisplayName");
/* 30 */            wc0Var.m9529d(w51Var.mo9474c(), "IconImageUri");
/* 39 */            wc0Var.m9529d(w51Var.getIconImageUrl(), "IconImageUrl");
/* 52 */            wc0Var.m9529d(Integer.valueOf(w51Var.mo9475d0()), "ScoreOrder");
/* 61 */            wc0Var.m9529d(w51Var.mo9472L(), "Variants");
/* 64 */            return wc0Var.toString();
                }

                /* JADX INFO: renamed from: b */
                public static boolean m10105b(w51 w51Var, Object obj) {
/* 3 */             if (!(obj instanceof w51)) {
/* 91 */                return false;
                    }
/* 6 */             if (w51Var == obj) {
/* 89 */                return true;
                    }
/* 9 */             w51 w51Var2 = (w51) obj;
                    return de3.m3029k(w51Var2.mo9473S0(), w51Var.mo9473S0()) && de3.m3029k(w51Var2.mo9476f(), w51Var.mo9476f()) && de3.m3029k(w51Var2.mo9474c(), w51Var.mo9474c()) && de3.m3029k(Integer.valueOf(w51Var2.mo9475d0()), Integer.valueOf(w51Var.mo9475d0())) && de3.m3029k(w51Var2.mo9472L(), w51Var.mo9472L());
                }

                @Override // p000.w51
                /* JADX INFO: renamed from: L */
                public final ArrayList mo9472L() {
/* 5 */             return new ArrayList(this.f19487e);
                }

                @Override // p000.w51
                /* JADX INFO: renamed from: S0 */
                public final String mo9473S0() {
/* 1 */             return this.f19483a;
                }

                @Override // p000.w51
                /* JADX INFO: renamed from: c */
                public final Uri mo9474c() {
/* 1 */             return this.f19485c;
                }

                @Override // p000.w51
                /* JADX INFO: renamed from: d0 */
                public final int mo9475d0() {
/* 1 */             return this.f19486d;
                }

                public final boolean equals(Object obj) {
/* 1 */             return m10105b(this, obj);
                }

                @Override // p000.w51
                /* JADX INFO: renamed from: f */
                public final String mo9476f() {
/* 1 */             return this.f19484b;
                }

                @Override // p000.un0
                public final /* bridge */ /* synthetic */ Object freeze() {
/* 1 */             return this;
                }

                @Override // p000.w51
                public final String getIconImageUrl() {
/* 1 */             return this.f19488f;
                }

                public final int hashCode() {
/* 29 */            return Arrays.hashCode(new Object[]{mo9473S0(), mo9476f(), mo9474c(), Integer.valueOf(mo9475d0()), mo9472L()});
                }

                public final String toString() {
/* 1 */             return m10104a(this);
                }
            }
