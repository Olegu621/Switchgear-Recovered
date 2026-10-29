            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ee3 extends z30 implements e61 {
                @Override // p000.e61
                /* JADX INFO: renamed from: M0 */
                public final long mo3325M0() {
/* 7 */             if (m10272u("player_rank")) {
/* 9 */                 return -1L;
                    }
/* 12 */            return m10269e("player_rank");
                }

                @Override // p000.e61
                /* JADX INFO: renamed from: T0 */
                public final int mo3326T0() {
/* 3 */             return m10268d("timespan");
                }

                @Override // p000.e61
                /* JADX INFO: renamed from: c1 */
                public final long mo3327c1() {
/* 7 */             if (m10272u("player_raw_score")) {
/* 9 */                 return -1L;
                    }
/* 12 */            return m10269e("player_raw_score");
                }

                @Override // p000.e61
                /* JADX INFO: renamed from: e1 */
                public final String mo3328e1() {
/* 3 */             return m10270j("player_display_rank");
                }

                @Override // p000.z30
                public final boolean equals(Object obj) {
/* 1 */             return f61.m3674d(this, obj);
                }

                @Override // p000.un0
                public final /* synthetic */ Object freeze() {
/* 3 */             return new f61(this);
                }

                @Override // p000.z30
                public final int hashCode() {
/* 1 */             return f61.m3672a(this);
                }

                @Override // p000.e61
                /* JADX INFO: renamed from: j0 */
                public final long mo3329j0() {
/* 7 */             if (m10272u("total_scores")) {
/* 9 */                 return -1L;
                    }
/* 12 */            return m10269e("total_scores");
                }

                @Override // p000.e61
                /* JADX INFO: renamed from: k */
                public final String mo3330k() {
/* 3 */             return m10270j("player_display_score");
                }

                @Override // p000.e61
                /* JADX INFO: renamed from: n */
                public final boolean mo3331n() {
                    return !m10272u("player_raw_score");
                }

                @Override // p000.e61
                /* JADX INFO: renamed from: r1 */
                public final int mo3332r1() {
/* 3 */             return m10268d("collection");
                }

                public final String toString() {
/* 1 */             return f61.m3673b(this);
                }

                @Override // p000.e61
                public final String zza() {
/* 3 */             return m10270j("top_page_token_next");
                }

                @Override // p000.e61
                public final String zzb() {
/* 3 */             return m10270j("window_page_token_next");
                }

                @Override // p000.e61
                public final String zzc() {
/* 3 */             return m10270j("window_page_token_prev");
                }
            }
