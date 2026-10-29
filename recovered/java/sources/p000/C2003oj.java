            package p000;
            
            /* JADX INFO: renamed from: oj */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2003oj {
                public static final C1892lj Companion = new C1892lj();

                /* JADX INFO: renamed from: a */
                public final x80 f14774a;

                /* JADX INFO: renamed from: b */
                public final g80 f14775b;

                /* JADX INFO: renamed from: c */
                public final C0182bj f14776c;

                public C2003oj(x80 x80Var, g80 g80Var, C0182bj c0182bj) {
/* 1 */             x80Var.getClass();
/* 4 */             g80Var.getClass();
/* 7 */             c0182bj.getClass();
/* 13 */            this.f14774a = x80Var;
/* 15 */            this.f14775b = g80Var;
/* 17 */            this.f14776c = c0182bj;
                }

                /* JADX INFO: renamed from: a */
                public final void m7179a(String str, long j) {
                    try {
/* 3 */                 this.f14776c.m1362a(str);
/* 10 */                od2 od2Var = ((pz2) this.f14775b).f15354e;
/* 12 */                fh2[] fh2VarArr = fh2.f8216a;
/* 20 */                od2Var.m7138d("session_timestamp", String.valueOf(j));
                    } catch (Throwable unused) {
/* 35 */                this.f14774a.m9743b(new C1966nj(this, j, str, null));
                    }
                }
            }
