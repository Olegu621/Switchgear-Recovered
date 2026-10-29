            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mk2 extends d10 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f13838a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ qk2 f13839b;

                /* JADX INFO: renamed from: c */
                public int f13840c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public mk2(qk2 qk2Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f13839b = qk2Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f13838a = obj;
/* 8 */             this.f13840c |= Integer.MIN_VALUE;
/* 13 */            Object objM7933r = this.f13839b.m7933r(null, this);
                    return objM7933r == z10.f19902a ? objM7933r : new o42(objM7933r);
                }
            }
