            package io.sentry.android.core;

            import android.os.Debug;
            import io.sentry.C1536l3;
            import io.sentry.InterfaceC1750y0;
            
            /* JADX INFO: renamed from: io.sentry.android.core.n */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1244n implements InterfaceC1750y0 {
                @Override // io.sentry.InterfaceC1750y0
                /* JADX INFO: renamed from: a */
                public final void mo4805a(C1536l3 c1536l3) {
/* 17 */            long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
/* 26 */            long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
/* 31 */            c1536l3.f11117b = Long.valueOf(jFreeMemory);
/* 37 */            c1536l3.f11118c = Long.valueOf(nativeHeapSize);
                }

                @Override // io.sentry.InterfaceC1750y0
                /* JADX INFO: renamed from: c */
                public final void mo4807c() {
                }
            }
