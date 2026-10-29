            package p000;

            import java.io.FileOutputStream;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class di0 extends d10 {

                /* JADX INFO: renamed from: a */
                public FileOutputStream f7218a;

                /* JADX INFO: renamed from: b */
                public FileOutputStream f7219b;

                /* JADX INFO: renamed from: c */
                public /* synthetic */ Object f7220c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ei0 f7221d;

                /* JADX INFO: renamed from: e */
                public int f7222e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public di0(ei0 ei0Var, d10 d10Var) {
/* 3 */             super(d10Var);
/* 1 */             this.f7221d = ei0Var;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.f7220c = obj;
/* 8 */             this.f7222e |= Integer.MIN_VALUE;
/* 13 */            return this.f7221d.m3445b(null, this);
                }
            }
