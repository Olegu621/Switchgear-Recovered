            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ec2 extends d10 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f7622a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ jc2 f7623b;

                /* JADX INFO: renamed from: c */
                public int f7624c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ec2(jc2 jc2Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f7623b = jc2Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f7622a = obj;
/* 8 */             this.f7624c |= Integer.MIN_VALUE;
/* 12 */            Object objM5779e = this.f7623b.m5779e(this);
                    return objM5779e == z10.f19902a ? objM5779e : new o42(objM5779e);
                }
            }
