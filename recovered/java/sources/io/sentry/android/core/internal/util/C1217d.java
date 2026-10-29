            package io.sentry.android.core.internal.util;

            import android.os.SystemClock;
            import io.sentry.transport.InterfaceC1680f;
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.util.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1217d implements InterfaceC1680f {

                /* JADX INFO: renamed from: a */
                public static final C1217d f10156a = new C1217d();

                @Override // io.sentry.transport.InterfaceC1680f
                /* JADX INFO: renamed from: c */
                public long mo4838c() {
/* 1 */             return SystemClock.uptimeMillis();
                }
            }
