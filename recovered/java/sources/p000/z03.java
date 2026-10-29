            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class z03 extends d10 {

                /* JADX INFO: renamed from: a */
                public a13 f19897a;

                /* JADX INFO: renamed from: b */
                public jc2 f19898b;

                /* JADX INFO: renamed from: c */
                public /* synthetic */ Object f19899c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ a13 f19900d;

                /* JADX INFO: renamed from: e */
                public int f19901e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public z03(a13 a13Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f19900d = a13Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f19899c = obj;
/* 8 */             this.f19901e |= Integer.MIN_VALUE;
/* 13 */            Object objM33n = this.f19900d.m33n(false, this);
                    return objM33n == z10.f19902a ? objM33n : new o42(objM33n);
                }
            }
