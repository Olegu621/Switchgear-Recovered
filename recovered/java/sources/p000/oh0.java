            package p000;

            import java.io.FileInputStream;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class oh0 extends d10 {

                /* JADX INFO: renamed from: a */
                public Object f14749a;

                /* JADX INFO: renamed from: b */
                public FileInputStream f14750b;

                /* JADX INFO: renamed from: c */
                public /* synthetic */ Object f14751c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ph0 f14752d;

                /* JADX INFO: renamed from: e */
                public int f14753e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public oh0(ph0 ph0Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f14752d = ph0Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f14751c = obj;
/* 8 */             this.f14753e |= Integer.MIN_VALUE;
/* 12 */            return ph0.m7447a(this.f14752d, this);
                }
            }
