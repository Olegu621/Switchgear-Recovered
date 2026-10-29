            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zb2 extends d10 {

                /* JADX INFO: renamed from: a */
                public ac2 f20061a;

                /* JADX INFO: renamed from: b */
                public /* synthetic */ Object f20062b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ac2 f20063c;

                /* JADX INFO: renamed from: d */
                public int f20064d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zb2(ac2 ac2Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f20063c = ac2Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f20062b = obj;
/* 8 */             this.f20064d |= Integer.MIN_VALUE;
/* 13 */            Object objM194a = this.f20063c.m194a(null, this);
                    return objM194a == z10.f19902a ? objM194a : new o42(objM194a);
                }
            }
