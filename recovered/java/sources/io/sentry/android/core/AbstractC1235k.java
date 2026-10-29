            package io.sentry.android.core;

            import io.sentry.EnumC1553m5;
            
            /* JADX INFO: renamed from: io.sentry.android.core.k */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract /* synthetic */ class AbstractC1235k {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f10207a;

                static {
/* 6 */             int[] iArr = new int[EnumC1553m5.values().length];
/* 8 */             f10207a = iArr;
                    try {
/* 17 */                iArr[EnumC1553m5.INFO.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
/* 28 */                f10207a[EnumC1553m5.WARNING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
/* 39 */                f10207a[EnumC1553m5.ERROR.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
/* 50 */                f10207a[EnumC1553m5.FATAL.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
/* 61 */                f10207a[EnumC1553m5.DEBUG.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                }
            }
