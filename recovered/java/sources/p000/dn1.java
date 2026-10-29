            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dn1 extends d10 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f7334a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ en1 f7335b;

                /* JADX INFO: renamed from: c */
                public int f7336c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public dn1(en1 en1Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f7335b = en1Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f7334a = obj;
/* 8 */             this.f7336c |= Integer.MIN_VALUE;
/* 14 */            return this.f7335b.m3525h(false, null, this);
                }
            }
