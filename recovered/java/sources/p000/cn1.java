            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cn1 extends d10 {

                /* JADX INFO: renamed from: a */
                public en1 f3011a;

                /* JADX INFO: renamed from: b */
                public /* synthetic */ Object f3012b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ en1 f3013c;

                /* JADX INFO: renamed from: d */
                public int f3014d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public cn1(en1 en1Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f3013c = en1Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f3012b = obj;
/* 8 */             this.f3014d |= Integer.MIN_VALUE;
/* 14 */            return this.f3013c.m3524g(false, null, this);
                }
            }
