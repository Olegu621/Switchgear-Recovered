            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class q72 {

                /* JADX INFO: renamed from: a */
                public final long f15435a;

                /* JADX INFO: renamed from: b */
                public final String f15436b;

                /* JADX INFO: renamed from: c */
                public final String f15437c;

                /* JADX INFO: renamed from: d */
                public final boolean f15438d;

                public q72(long j, String str, String str2, boolean z) {
/* 4 */             this.f15435a = j;
/* 6 */             this.f15436b = str;
/* 8 */             this.f15437c = str2;
/* 10 */            this.f15438d = z;
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 14 */            wc0Var.m9529d(Long.valueOf(this.f15435a), "RawScore");
/* 21 */            wc0Var.m9529d(this.f15436b, "FormattedScore");
/* 28 */            wc0Var.m9529d(this.f15437c, "ScoreTag");
/* 39 */            wc0Var.m9529d(Boolean.valueOf(this.f15438d), "NewBest");
/* 42 */            return wc0Var.toString();
                }
            }
