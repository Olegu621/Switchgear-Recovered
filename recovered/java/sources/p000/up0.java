            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class up0 extends d10 {

                /* JADX INFO: renamed from: a */
                public wp0 f17616a;

                /* JADX INFO: renamed from: b */
                public String f17617b;

                /* JADX INFO: renamed from: c */
                public /* synthetic */ Object f17618c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ wp0 f17619d;

                /* JADX INFO: renamed from: e */
                public int f17620e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public up0(wp0 wp0Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f17619d = wp0Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             this.f17618c = obj;
/* 8 */             this.f17620e |= Integer.MIN_VALUE;
/* 13 */            Object objM9596a = this.f17619d.m9596a(null, this);
                    return objM9596a == z10.f19902a ? objM9596a : new o42(objM9596a);
                }
            }
