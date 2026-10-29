            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class qk0 extends d10 {

                /* JADX INFO: renamed from: a */
                public h90 f15593a;

                /* JADX INFO: renamed from: b */
                public /* synthetic */ Object f15594b;

                /* JADX INFO: renamed from: c */
                public int f15595c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ h90 f15596d;

                /* JADX INFO: renamed from: e */
                public Object f15597e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public qk0(h90 h90Var, c10 c10Var) {
/* 3 */             super(c10Var);
/* 1 */             this.f15596d = h90Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f15594b = obj;
/* 8 */             this.f15595c |= Integer.MIN_VALUE;
/* 13 */            return this.f15596d.emit(null, this);
                }
            }
