            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vp0 extends d10 {

                /* JADX INFO: renamed from: a */
                public wp0 f18278a;

                /* JADX INFO: renamed from: b */
                public /* synthetic */ Object f18279b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ wp0 f18280c;

                /* JADX INFO: renamed from: d */
                public int f18281d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public vp0(wp0 wp0Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f18280c = wp0Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f18279b = obj;
/* 8 */             this.f18281d |= Integer.MIN_VALUE;
/* 12 */            Object objM9597b = this.f18280c.m9597b(this);
                    return objM9597b == z10.f19902a ? objM9597b : new o42(objM9597b);
                }
            }
