            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class g90 extends d10 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f8517a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ h90 f8518b;

                /* JADX INFO: renamed from: c */
                public int f8519c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g90(h90 h90Var, c10 c10Var) {
/* 3 */             super(c10Var);
/* 1 */             this.f8518b = h90Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f8517a = obj;
/* 8 */             this.f8519c |= Integer.MIN_VALUE;
/* 13 */            return this.f8518b.emit(null, this);
                }
            }
