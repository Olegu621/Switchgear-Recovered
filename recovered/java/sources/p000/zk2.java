            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zk2 extends d10 {

                /* JADX INFO: renamed from: a */
                public fs0 f20226a;

                /* JADX INFO: renamed from: b */
                public /* synthetic */ Object f20227b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ fs0 f20228c;

                /* JADX INFO: renamed from: d */
                public int f20229d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zk2(fs0 fs0Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f20228c = fs0Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f20227b = obj;
/* 8 */             this.f20229d |= Integer.MIN_VALUE;
/* 12 */            Object objM3822s = this.f20228c.m3822s(this);
                    return objM3822s == z10.f19902a ? objM3822s : new o42(objM3822s);
                }
            }
