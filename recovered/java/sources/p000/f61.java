            package p000;

            import com.google.android.gms.internal.games_v2.zzah;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class f61 implements e61 {

                /* JADX INFO: renamed from: U */
                public final String f8015U;

                /* JADX INFO: renamed from: V */
                public final String f8016V;

                /* JADX INFO: renamed from: a */
                public final int f8017a;

                /* JADX INFO: renamed from: b */
                public final int f8018b;

                /* JADX INFO: renamed from: c */
                public final boolean f8019c;

                /* JADX INFO: renamed from: d */
                public final long f8020d;

                /* JADX INFO: renamed from: e */
                public final String f8021e;

                /* JADX INFO: renamed from: f */
                public final long f8022f;

                /* JADX INFO: renamed from: i */
                public final String f8023i;

                /* JADX INFO: renamed from: v */
                public final long f8024v;

                /* JADX INFO: renamed from: w */
                public final String f8025w;

                public f61(ee3 ee3Var) {
/* 10 */            this.f8017a = ee3Var.m10268d("timespan");
/* 18 */            this.f8018b = ee3Var.m10268d("collection");
/* 24 */            this.f8019c = ee3Var.mo3331n();
/* 30 */            this.f8020d = ee3Var.mo3327c1();
/* 38 */            this.f8021e = ee3Var.m10270j("player_display_score");
/* 44 */            this.f8022f = ee3Var.mo3325M0();
/* 52 */            this.f8023i = ee3Var.m10270j("player_display_rank");
/* 56 */            ee3Var.m10270j("player_score_tag");
/* 63 */            this.f8024v = ee3Var.mo3329j0();
/* 71 */            this.f8025w = ee3Var.m10270j("top_page_token_next");
/* 79 */            this.f8015U = ee3Var.m10270j("window_page_token_prev");
/* 87 */            this.f8016V = ee3Var.m10270j("window_page_token_next");
                }

                /* JADX INFO: renamed from: a */
                public static int m3672a(e61 e61Var) {
/* 73 */            return Arrays.hashCode(new Object[]{Integer.valueOf(e61Var.mo3326T0()), Integer.valueOf(e61Var.mo3332r1()), Boolean.valueOf(e61Var.mo3331n()), Long.valueOf(e61Var.mo3327c1()), e61Var.mo3330k(), Long.valueOf(e61Var.mo3325M0()), e61Var.mo3328e1(), Long.valueOf(e61Var.mo3329j0()), e61Var.zza(), e61Var.zzb(), e61Var.zzc()});
                }

                /* JADX INFO: renamed from: b */
                public static String m3673b(e61 e61Var) {
                    String str;
/* 3 */             wc0 wc0Var = new wc0(e61Var);
/* 16 */            wc0Var.m9529d(zzah.zza(e61Var.mo3326T0()), "TimeSpan");
/* 19 */            int iMo3332r1 = e61Var.mo3332r1();
/* 24 */            if (iMo3332r1 == -1) {
/* 61 */                str = "UNKNOWN";
                    } else if (iMo3332r1 == 0) {
/* 58 */                str = "PUBLIC";
                    } else if (iMo3332r1 != 1) {
/* 32 */                str = "SOCIAL_1P";
/* 34 */                if (iMo3332r1 != 2) {
/* 37 */                    if (iMo3332r1 == 3) {
/* 52 */                        str = "FRIENDS";
                            } else if (iMo3332r1 != 4) {
/* 47 */                        ds0.m3189f(43, "Unknown leaderboard collection: ", iMo3332r1);
/* 50 */                        return null;
                            }
                        }
                    } else {
/* 55 */                str = "SOCIAL";
                    }
/* 65 */            wc0Var.m9529d(str, "Collection");
/* 88 */            wc0Var.m9529d(e61Var.mo3331n() ? Long.valueOf(e61Var.mo3327c1()) : "none", "RawPlayerScore");
/* 105 */           wc0Var.m9529d(e61Var.mo3331n() ? e61Var.mo3330k() : "none", "DisplayPlayerScore");
/* 126 */           wc0Var.m9529d(e61Var.mo3331n() ? Long.valueOf(e61Var.mo3325M0()) : "none", "PlayerRank");
/* 141 */           wc0Var.m9529d(e61Var.mo3331n() ? e61Var.mo3328e1() : "none", "DisplayPlayerRank");
/* 154 */           wc0Var.m9529d(Long.valueOf(e61Var.mo3329j0()), "NumScores");
/* 163 */           wc0Var.m9529d(e61Var.zza(), "TopPageNextToken");
/* 172 */           wc0Var.m9529d(e61Var.zzb(), "WindowPageNextToken");
/* 181 */           wc0Var.m9529d(e61Var.zzc(), "WindowPagePrevToken");
/* 184 */           return wc0Var.toString();
                }

                /* JADX INFO: renamed from: d */
                public static boolean m3674d(e61 e61Var, Object obj) {
/* 3 */             if (!(obj instanceof e61)) {
/* 217 */               return false;
                    }
/* 7 */             if (e61Var == obj) {
/* 215 */               return true;
                    }
/* 11 */            e61 e61Var2 = (e61) obj;
                    return de3.m3029k(Integer.valueOf(e61Var2.mo3326T0()), Integer.valueOf(e61Var.mo3326T0())) && de3.m3029k(Integer.valueOf(e61Var2.mo3332r1()), Integer.valueOf(e61Var.mo3332r1())) && de3.m3029k(Boolean.valueOf(e61Var2.mo3331n()), Boolean.valueOf(e61Var.mo3331n())) && de3.m3029k(Long.valueOf(e61Var2.mo3327c1()), Long.valueOf(e61Var.mo3327c1())) && de3.m3029k(e61Var2.mo3330k(), e61Var.mo3330k()) && de3.m3029k(Long.valueOf(e61Var2.mo3325M0()), Long.valueOf(e61Var.mo3325M0())) && de3.m3029k(e61Var2.mo3328e1(), e61Var.mo3328e1()) && de3.m3029k(Long.valueOf(e61Var2.mo3329j0()), Long.valueOf(e61Var.mo3329j0())) && de3.m3029k(e61Var2.zza(), e61Var.zza()) && de3.m3029k(e61Var2.zzb(), e61Var.zzb()) && de3.m3029k(e61Var2.zzc(), e61Var.zzc());
                }

                @Override // p000.e61
                /* JADX INFO: renamed from: M0 */
                public final long mo3325M0() {
/* 1 */             return this.f8022f;
                }

                @Override // p000.e61
                /* JADX INFO: renamed from: T0 */
                public final int mo3326T0() {
/* 1 */             return this.f8017a;
                }

                @Override // p000.e61
                /* JADX INFO: renamed from: c1 */
                public final long mo3327c1() {
/* 1 */             return this.f8020d;
                }

                @Override // p000.e61
                /* JADX INFO: renamed from: e1 */
                public final String mo3328e1() {
/* 1 */             return this.f8023i;
                }

                public final boolean equals(Object obj) {
/* 1 */             return m3674d(this, obj);
                }

                @Override // p000.un0
                public final /* bridge */ /* synthetic */ Object freeze() {
/* 1 */             return this;
                }

                public final int hashCode() {
/* 1 */             return m3672a(this);
                }

                @Override // p000.e61
                /* JADX INFO: renamed from: j0 */
                public final long mo3329j0() {
/* 1 */             return this.f8024v;
                }

                @Override // p000.e61
                /* JADX INFO: renamed from: k */
                public final String mo3330k() {
/* 1 */             return this.f8021e;
                }

                @Override // p000.e61
                /* JADX INFO: renamed from: n */
                public final boolean mo3331n() {
/* 1 */             return this.f8019c;
                }

                @Override // p000.e61
                /* JADX INFO: renamed from: r1 */
                public final int mo3332r1() {
/* 1 */             return this.f8018b;
                }

                public final String toString() {
/* 1 */             return m3673b(this);
                }

                @Override // p000.e61
                public final String zza() {
/* 1 */             return this.f8025w;
                }

                @Override // p000.e61
                public final String zzb() {
/* 1 */             return this.f8016V;
                }

                @Override // p000.e61
                public final String zzc() {
/* 1 */             return this.f8015U;
                }
            }
