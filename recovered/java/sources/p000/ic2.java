            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ic2 extends d10 {

                /* JADX INFO: renamed from: a */
                public jc2 f9544a;

                /* JADX INFO: renamed from: b */
                public String f9545b;

                /* JADX INFO: renamed from: c */
                public /* synthetic */ Object f9546c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ jc2 f9547d;

                /* JADX INFO: renamed from: e */
                public int f9548e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ic2(jc2 jc2Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f9547d = jc2Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             this.f9546c = obj;
/* 8 */             this.f9548e |= Integer.MIN_VALUE;
/* 13 */            Object objM5783i = this.f9547d.m5783i(null, null, this);
                    return objM5783i == z10.f19902a ? objM5783i : new o42(objM5783i);
                }
            }
