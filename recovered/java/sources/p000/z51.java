            package p000;

            import android.net.Uri;
            import com.google.android.gms.common.data.DataHolder;
            import com.google.android.gms.games.GameRef;
            import java.util.ArrayList;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class z51 extends z30 implements w51 {

                /* JADX INFO: renamed from: d */
                public final int f19940d;

                /* JADX INFO: renamed from: e */
                public final GameRef f19941e;

                public z51(DataHolder dataHolder, int i, int i2) {
/* 1 */             super(dataHolder, i);
/* 4 */             this.f19940d = i2;
/* 11 */            this.f19941e = new GameRef(dataHolder, i);
                }

                @Override // p000.w51
                /* JADX INFO: renamed from: L */
                public final ArrayList mo9472L() {
/* 3 */             int i = this.f19940d;
/* 5 */             ArrayList arrayList = new ArrayList(i);
/* 9 */             for (int i2 = 0; i2 < i; i2++) {
/* 21 */                arrayList.add(new ee3(this.f19921a, this.f19922b + i2));
                    }
/* 27 */            return arrayList;
                }

                @Override // p000.w51
                /* JADX INFO: renamed from: S0 */
                public final String mo9473S0() {
/* 3 */             return m10270j("external_leaderboard_id");
                }

                @Override // p000.w51
                /* JADX INFO: renamed from: c */
                public final Uri mo9474c() {
/* 3 */             return m10273w("board_icon_image_uri");
                }

                @Override // p000.w51
                /* JADX INFO: renamed from: d0 */
                public final int mo9475d0() {
/* 3 */             return m10268d("score_order");
                }

                @Override // p000.z30
                public final boolean equals(Object obj) {
/* 1 */             return y51.m10105b(this, obj);
                }

                @Override // p000.w51
                /* JADX INFO: renamed from: f */
                public final String mo9476f() {
/* 3 */             return m10270j("name");
                }

                @Override // p000.un0
                public final /* synthetic */ Object freeze() {
/* 3 */             return new y51(this);
                }

                @Override // p000.w51
                public final String getIconImageUrl() {
/* 3 */             return m10270j("board_icon_image_url");
                }

                @Override // p000.z30
                public final int hashCode() {
/* 29 */            return Arrays.hashCode(new Object[]{mo9473S0(), mo9476f(), mo9474c(), Integer.valueOf(mo9475d0()), mo9472L()});
                }

                public final String toString() {
/* 1 */             return y51.m10104a(this);
                }
            }
