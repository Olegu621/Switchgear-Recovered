            package io.sentry.util;
            
            /* JADX INFO: renamed from: io.sentry.util.k */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC1712k {

                /* JADX INFO: renamed from: a */
                public static final boolean f11736a;

                /* JADX INFO: renamed from: b */
                public static final boolean f11737b;

                static {
                    try {
/* 14 */                f11736a = "The Android Project".equals(System.getProperty("java.vendor"));
                    } catch (Throwable unused) {
/* 17 */                f11736a = false;
                    }
/* 21 */            if (f11736a) {
/* 23 */                f11737b = false;
/* 55 */                return;
                    }
                    try {
/* 28 */                String property = System.getProperty("java.specification.version");
/* 32 */                if (property != null) {
/* 47 */                    f11737b = Double.parseDouble(property) >= 9.0d;
                        } else {
/* 50 */                    f11737b = false;
                        }
                    } catch (Throwable unused2) {
/* 53 */                f11737b = false;
                    }
                }
            }
