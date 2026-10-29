            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class f51 extends d10 {

                /* JADX INFO: renamed from: a */
                public g51 f8000a;

                /* JADX INFO: renamed from: b */
                public /* synthetic */ Object f8001b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ g51 f8002c;

                /* JADX INFO: renamed from: d */
                public int f8003d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f51(g51 g51Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f8002c = g51Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f8001b = obj;
/* 8 */             this.f8003d |= Integer.MIN_VALUE;
/* 17 */            Object objM3874a = this.f8002c.m3874a(null, null, null, false, this);
                    return objM3874a == z10.f19902a ? objM3874a : new o42(objM3874a);
                }
            }
