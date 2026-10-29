            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class kk0 extends d10 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f12834a;

                /* JADX INFO: renamed from: b */
                public int f12835b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ lk0 f12836c;

                /* JADX INFO: renamed from: d */
                public Object f12837d;

                /* JADX INFO: renamed from: e */
                public hk0 f12838e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public kk0(lk0 lk0Var, c10 c10Var) {
/* 3 */             super(c10Var);
/* 1 */             this.f12836c = lk0Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f12834a = obj;
/* 8 */             this.f12835b |= Integer.MIN_VALUE;
/* 13 */            return this.f12836c.collect(null, this);
                }
            }
