            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class e51 extends d10 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f7512a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C2130r3 f7513b;

                /* JADX INFO: renamed from: c */
                public int f7514c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e51(C2130r3 c2130r3, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f7513b = c2130r3;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f7512a = obj;
/* 8 */             this.f7514c |= Integer.MIN_VALUE;
/* 13 */            return this.f7513b.m8060a(null, null, null, this);
                }
            }
