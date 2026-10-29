            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class a52 extends AbstractC1909m {

                /* JADX INFO: renamed from: c */
                public int f92c;

                /* JADX INFO: renamed from: d */
                public int f93d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ b52 f94e;

                public a52(b52 b52Var) {
/* 4 */             this.f94e = b52Var;
/* 10 */            this.f92c = b52Var.size();
/* 14 */            this.f93d = b52Var.f2230c;
                }

                @Override // p000.AbstractC1909m
                /* JADX INFO: renamed from: a */
                public final void mo66a() {
/* 1 */             int i = this.f92c;
/* 3 */             if (i == 0) {
/* 6 */                 this.f13539a = 2;
/* 8 */                 return;
                    }
/* 9 */             b52 b52Var = this.f94e;
/* 11 */            Object[] objArr = b52Var.f2228a;
/* 13 */            int i2 = this.f93d;
/* 17 */            this.f13540b = objArr[i2];
/* 20 */            this.f13539a = 1;
/* 26 */            this.f93d = (i2 + 1) % b52Var.f2229b;
/* 30 */            this.f92c = i - 1;
                }
            }
