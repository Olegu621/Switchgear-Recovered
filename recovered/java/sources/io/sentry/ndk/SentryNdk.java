            package io.sentry.ndk;

            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class SentryNdk {
                private static volatile boolean nativeLibrariesLoaded;

                private SentryNdk() {
                }

                public static void close() {
/* 1 */             loadNativeLibraries();
/* 4 */             shutdown();
                }

                public static void init(NdkOptions ndkOptions) {
/* 1 */             loadNativeLibraries();
/* 4 */             int iInitSentryNative = initSentryNative(ndkOptions);
/* 8 */             if (iInitSentryNative > 0) {
/* 21 */                f42.m3656l("A sentry-native internal init error occurred, please check the logs for more details.");
                    } else {
/* 10 */                if (iInitSentryNative >= 0) {
/* 12 */                    return;
                        }
/* 15 */                f42.m3656l("A sentry-native setup failure occurred");
                    }
                }

                private static native int initSentryNative(NdkOptions ndkOptions);

                public static synchronized void loadNativeLibraries() {
/* 6 */             if (!nativeLibrariesLoaded) {
/* 10 */                System.loadLibrary("log");
/* 15 */                System.loadLibrary("sentry");
/* 20 */                System.loadLibrary("sentry-android");
/* 24 */                nativeLibrariesLoaded = true;
                    }
                }

                public static void preload() {
/* 1 */             loadNativeLibraries();
/* 4 */             preloadSentryNative();
                }

                private static native void preloadSentryNative();

                private static native void shutdown();
            }
