            package io.sentry.cache;

            import io.sentry.InterfaceC1734w0;
            import io.sentry.android.core.SentryAndroidOptions;
            
            /* JADX INFO: renamed from: io.sentry.cache.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1400e implements InterfaceC1734w0 {

                /* JADX INFO: renamed from: a */
                public final SentryAndroidOptions f10807a;

                public C1400e(SentryAndroidOptions sentryAndroidOptions) {
/* 4 */             this.f10807a = sentryAndroidOptions;
                }

                /* JADX INFO: renamed from: a */
                public final void m5125a(String str) {
/* 5 */             AbstractC1396a.m5113a(this.f10807a, ".options-cache", str);
                }

                /* JADX INFO: renamed from: b */
                public final void m5126b(Object obj, String str) {
/* 5 */             AbstractC1396a.m5116d(this.f10807a, obj, ".options-cache", str);
                }
            }
