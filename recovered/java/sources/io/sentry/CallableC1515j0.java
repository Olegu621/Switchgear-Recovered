            package io.sentry;

            import io.sentry.android.core.internal.util.C1219f;
            import java.net.InetAddress;
            import java.util.ArrayList;
            import java.util.concurrent.Callable;
            
            /* JADX INFO: renamed from: io.sentry.j0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class CallableC1515j0 implements Callable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11064a;

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    switch (this.f11064a) {
                        case 0:
/* 21 */                    return InetAddress.getLocalHost();
                        case 1:
/* 19 */                    return null;
                        case 2:
/* 15 */                    return new ArrayList();
                        default:
/* 8 */                     return C1219f.f10159c.m4843a();
                    }
                }
            }
