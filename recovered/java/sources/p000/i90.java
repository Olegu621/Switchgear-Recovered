            package p000;

            import kotlin.Unit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class i90 implements fk0 {

                /* JADX INFO: renamed from: a */
                public final wc0 f9499a;

                public i90(wc0 wc0Var) {
/* 4 */             this.f9499a = wc0Var;
                }

                @Override // p000.fk0
                public final Object collect(hk0 hk0Var, c10 c10Var) throws Throwable {
/* 3 */             h22 h22Var = new h22();
/* 8 */             h22Var.f8873a = jb1.f12171c;
/* 17 */            Object objCollect = this.f9499a.collect(new h90(this, h22Var, hk0Var), c10Var);
                    return objCollect == z10.f19902a ? objCollect : Unit.f12910a;
                }
            }
