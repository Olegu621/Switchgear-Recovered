            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jk2 extends d10 {

                /* JADX INFO: renamed from: a */
                public qk2 f12340a;

                /* JADX INFO: renamed from: b */
                public /* synthetic */ Object f12341b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ qk2 f12342c;

                /* JADX INFO: renamed from: d */
                public int f12343d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public jk2(qk2 qk2Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f12342c = qk2Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f12341b = obj;
/* 8 */             this.f12343d |= Integer.MIN_VALUE;
/* 13 */            Object objM7920a = this.f12342c.m7920a(null, this);
                    return objM7920a == z10.f19902a ? objM7920a : new o42(objM7920a);
                }
            }
