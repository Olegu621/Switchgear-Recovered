            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class oo2 implements y42 {

                /* JADX INFO: renamed from: b */
                public final long f14851b;

                /* JADX INFO: renamed from: c */
                public final y42 f14852c;

                public oo2(long j, y42 y42Var) {
/* 15 */            de3.m3023e("Timeout must be non-negative.", j >= 0);
/* 18 */            this.f14851b = j;
/* 20 */            this.f14852c = y42Var;
                }

                @Override // p000.y42
                /* JADX INFO: renamed from: a */
                public final long mo4260a() {
/* 1 */             return this.f14851b;
                }

                @Override // p000.y42
                /* JADX INFO: renamed from: b */
                public final x42 mo4261b(C0176bd c0176bd) {
/* 3 */             x42 x42VarMo4261b = this.f14852c.mo4261b(c0176bd);
/* 9 */             long j = this.f14851b;
                    return (j <= 0 || c0176bd.f2371b < j - x42VarMo4261b.f18948a) ? x42VarMo4261b : x42.f18945d;
                }
            }
