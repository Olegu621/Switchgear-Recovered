            package p000;

            import java.util.Random;
            
            /* JADX INFO: renamed from: c0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC0199c0 extends n02 {
                @Override // p000.n02
                /* JADX INFO: renamed from: a */
                public final int mo1470a(int i) {
/* 15 */            return (mo1168d().nextInt() >>> (32 - i)) & ((-i) >> 31);
                }

                @Override // p000.n02
                /* JADX INFO: renamed from: b */
                public final int mo1471b() {
/* 5 */             return mo1168d().nextInt();
                }

                /* JADX INFO: renamed from: d */
                public abstract Random mo1168d();
            }
