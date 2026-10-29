            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class pk0 extends d10 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f15155a;

                /* JADX INFO: renamed from: b */
                public int f15156b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ wc0 f15157c;

                /* JADX INFO: renamed from: d */
                public h90 f15158d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public pk0(wc0 wc0Var, c10 c10Var) {
/* 3 */             super(c10Var);
/* 1 */             this.f15157c = wc0Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f15155a = obj;
/* 8 */             this.f15156b |= Integer.MIN_VALUE;
/* 13 */            return this.f15157c.collect(null, this);
                }
            }
