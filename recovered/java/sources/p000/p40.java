            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class p40 extends d10 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f14961a;

                /* JADX INFO: renamed from: b */
                public int f14962b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C2186sm f14963c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public p40(C2186sm c2186sm, c10 c10Var) {
/* 3 */             super(c10Var);
/* 1 */             this.f14963c = c2186sm;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f14961a = obj;
/* 8 */             this.f14962b |= Integer.MIN_VALUE;
/* 13 */            return this.f14963c.emit(null, this);
                }
            }
