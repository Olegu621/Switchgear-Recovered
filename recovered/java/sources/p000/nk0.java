            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class nk0 extends d10 {

                /* JADX INFO: renamed from: a */
                public ok0 f14327a;

                /* JADX INFO: renamed from: b */
                public Object f14328b;

                /* JADX INFO: renamed from: c */
                public /* synthetic */ Object f14329c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ok0 f14330d;

                /* JADX INFO: renamed from: e */
                public int f14331e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public nk0(ok0 ok0Var, c10 c10Var) {
/* 3 */             super(c10Var);
/* 1 */             this.f14330d = ok0Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f14329c = obj;
/* 8 */             this.f14331e |= Integer.MIN_VALUE;
/* 13 */            return this.f14330d.emit(null, this);
                }
            }
