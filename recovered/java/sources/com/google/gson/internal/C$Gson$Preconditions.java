            package com.google.gson.internal;

            import p000.f42;
            
            /* JADX INFO: renamed from: com.google.gson.internal.$Gson$Preconditions, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C$Gson$Preconditions {
                private C$Gson$Preconditions() {
/* 9 */             throw new UnsupportedOperationException();
                }

                public static void checkArgument(boolean z) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 4 */             f42.m3649e();
                }

                @Deprecated
                public static <T> T checkNotNull(T t) {
/* 1 */             t.getClass();
/* 4 */             return t;
                }
            }
