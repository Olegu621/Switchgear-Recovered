            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class x03 extends d10 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f18884a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ a13 f18885b;

                /* JADX INFO: renamed from: c */
                public int f18886c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public x03(a13 a13Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f18885b = a13Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f18884a = obj;
/* 8 */             this.f18886c |= Integer.MIN_VALUE;
/* 13 */            Object objM20e = a13.m20e(this.f18885b, null, this);
                    return objM20e == z10.f19902a ? objM20e : new o42(objM20e);
                }
            }
