            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dc2 extends d10 {

                /* JADX INFO: renamed from: a */
                public jc2 f7112a;

                /* JADX INFO: renamed from: b */
                public boolean f7113b;

                /* JADX INFO: renamed from: c */
                public /* synthetic */ Object f7114c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ jc2 f7115d;

                /* JADX INFO: renamed from: e */
                public int f7116e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public dc2(jc2 jc2Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f7115d = jc2Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             this.f7114c = obj;
/* 8 */             this.f7116e |= Integer.MIN_VALUE;
/* 13 */            Object objM5778d = this.f7115d.m5778d(null, this);
                    return objM5778d == z10.f19902a ? objM5778d : new o42(objM5778d);
                }
            }
