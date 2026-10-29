            package p000;
            
            /* JADX INFO: renamed from: xe */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2365xe {

                /* JADX INFO: renamed from: a */
                public int f19044a;

                /* JADX INFO: renamed from: b */
                public int f19045b;

                /* JADX INFO: renamed from: c */
                public float f19046c;

                /* JADX INFO: renamed from: d */
                public float f19047d;

                /* JADX INFO: renamed from: e */
                public long f19048e;

                /* JADX INFO: renamed from: f */
                public long f19049f;

                /* JADX INFO: renamed from: g */
                public long f19050g;

                /* JADX INFO: renamed from: h */
                public float f19051h;

                /* JADX INFO: renamed from: i */
                public int f19052i;

                /* JADX INFO: renamed from: a */
                public final float m9755a(long j) {
/* 1 */             long j2 = this.f19048e;
/* 6 */             if (j < j2) {
/* 5 */                 return 0.0f;
                    }
/* 9 */             long j3 = this.f19050g;
/* 17 */            if (j3 < 0 || j < j3) {
/* 53 */                return r81.m8081b((j - j2) / this.f19044a, 0.0f, 1.0f) * 0.5f;
                    }
/* 25 */            float f = this.f19051h;
/* 39 */            return (r81.m8081b((j - j3) / this.f19052i, 0.0f, 1.0f) * f) + (1.0f - f);
                }
            }
