            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yk2 extends d10 {

                /* JADX INFO: renamed from: a */
                public fs0 f19672a;

                /* JADX INFO: renamed from: b */
                public /* synthetic */ Object f19673b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ fs0 f19674c;

                /* JADX INFO: renamed from: d */
                public int f19675d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public yk2(fs0 fs0Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f19674c = fs0Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f19673b = obj;
/* 8 */             this.f19675d |= Integer.MIN_VALUE;
/* 13 */            Object objM3819p = this.f19674c.m3819p(null, this);
                    return objM3819p == z10.f19902a ? objM3819p : new o42(objM3819p);
                }
            }
