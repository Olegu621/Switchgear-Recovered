            package io.flutter.util;

            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final class Preconditions {
                private Preconditions() {
                }

                public static <T> T checkNotNull(T t) {
/* 1 */             t.getClass();
/* 4 */             return t;
                }

                public static void checkState(boolean z, Object obj) {
/* 1 */             if (!z) {
/* 13 */                throw new IllegalStateException(String.valueOf(obj));
                    }
                }

/* 13 */        public static void checkState(boolean z) {
                    if (z) {
                        return;
                    }
/* 14 */            f42.m3664t();
                }
            }
