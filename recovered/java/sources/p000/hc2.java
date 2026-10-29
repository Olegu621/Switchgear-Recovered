            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hc2 extends d10 {

                /* JADX INFO: renamed from: a */
                public jc2 f9006a;

                /* JADX INFO: renamed from: b */
                public String f9007b;

                /* JADX INFO: renamed from: c */
                public /* synthetic */ Object f9008c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ jc2 f9009d;

                /* JADX INFO: renamed from: e */
                public int f9010e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public hc2(jc2 jc2Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f9009d = jc2Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f9008c = obj;
/* 8 */             this.f9010e |= Integer.MIN_VALUE;
/* 13 */            Object objM5782h = this.f9009d.m5782h(null, null, this);
                    return objM5782h == z10.f19902a ? objM5782h : new o42(objM5782h);
                }
            }
