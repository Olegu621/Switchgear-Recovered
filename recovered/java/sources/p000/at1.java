            package p000;

            import java.util.Random;
            import java.util.concurrent.ThreadLocalRandom;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class at1 extends AbstractC0199c0 {
                @Override // p000.n02
                /* JADX INFO: renamed from: c */
                public final int mo1167c() {
/* 8 */             return ThreadLocalRandom.current().nextInt(0, 10000);
                }

                @Override // p000.AbstractC0199c0
                /* JADX INFO: renamed from: d */
                public final Random mo1168d() {
/* 1 */             ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
/* 5 */             threadLocalRandomCurrent.getClass();
/* 8 */             return threadLocalRandomCurrent;
                }
            }
