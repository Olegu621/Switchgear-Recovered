            package p000;

            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class co3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final long f3023a;

                /* JADX INFO: renamed from: b */
                public final long f3024b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ we2 f3025c;

                public co3(we2 we2Var, long j, long j2) {
/* 4 */             Objects.requireNonNull(we2Var);
/* 7 */             this.f3025c = we2Var;
/* 9 */             this.f3023a = j;
/* 11 */            this.f3024b = j2;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 11 */            bj3 bj3Var = ((ij3) ((lo3) this.f3025c.f18595b).f16749a).f9659i;
/* 13 */            ij3.m4555l(bj3Var);
/* 23 */            bj3Var.m1370I(new bb3(this, 10));
                }
            }
