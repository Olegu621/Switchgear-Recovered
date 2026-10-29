            package p000;
            
            /* JADX INFO: renamed from: l */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1872l extends d10 {

                /* JADX INFO: renamed from: a */
                public w52 f13056a;

                /* JADX INFO: renamed from: b */
                public /* synthetic */ Object f13057b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ts0 f13058c;

                /* JADX INFO: renamed from: d */
                public int f13059d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1872l(ts0 ts0Var, c10 c10Var) {
/* 3 */             super(c10Var);
/* 1 */             this.f13058c = ts0Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f13057b = obj;
/* 8 */             this.f13059d |= Integer.MIN_VALUE;
/* 13 */            return this.f13058c.collect(null, this);
                }
            }
