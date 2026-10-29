            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gc2 extends d10 {

                /* JADX INFO: renamed from: a */
                public jc2 f8539a;

                /* JADX INFO: renamed from: b */
                public Object f8540b;

                /* JADX INFO: renamed from: c */
                public String f8541c;

                /* JADX INFO: renamed from: d */
                public /* synthetic */ Object f8542d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ jc2 f8543e;

                /* JADX INFO: renamed from: f */
                public int f8544f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public gc2(jc2 jc2Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f8543e = jc2Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             this.f8542d = obj;
/* 8 */             this.f8544f |= Integer.MIN_VALUE;
/* 13 */            Object objM5781g = this.f8543e.m5781g(null, null, this);
                    return objM5781g == z10.f19902a ? objM5781g : new o42(objM5781g);
                }
            }
