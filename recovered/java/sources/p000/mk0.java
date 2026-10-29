            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mk0 extends d10 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f13830a;

                /* JADX INFO: renamed from: b */
                public int f13831b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ wc0 f13832c;

                /* JADX INFO: renamed from: d */
                public wc0 f13833d;

                /* JADX INFO: renamed from: e */
                public hk0 f13834e;

                /* JADX INFO: renamed from: f */
                public w52 f13835f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public mk0(wc0 wc0Var, c10 c10Var) {
/* 3 */             super(c10Var);
/* 1 */             this.f13832c = wc0Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f13830a = obj;
/* 8 */             this.f13831b |= Integer.MIN_VALUE;
/* 13 */            return this.f13832c.collect(null, this);
                }
            }
