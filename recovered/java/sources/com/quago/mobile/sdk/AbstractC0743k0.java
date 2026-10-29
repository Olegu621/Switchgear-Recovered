            package com.quago.mobile.sdk;

            import com.quago.mobile.sdk.utils.IQuagoLog;
            import java.util.Locale;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.k0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public abstract class AbstractC0743k0 {

                /* JADX INFO: renamed from: a */
                public static final Locale f5509a = Locale.US;

                /* JADX INFO: renamed from: b */
                public static int f5510b = QuagoSettings.LogLevel.VERBOSE.priority;

                /* JADX INFO: renamed from: c */
                public static IQuagoLog f5511c;

                /* JADX INFO: renamed from: a */
                public static void m2620a(QuagoSettings.LogLevel logLevel) {
/* 1 */             if (logLevel == null) {
/* 5 */                 m2620a(QuagoSettings.LogLevel.INFO);
                    } else {
/* 11 */                f5510b = logLevel.priority;
                    }
                }

                /* JADX INFO: renamed from: a */
/* 13 */        public static C0740j0 m2619a(String str) {
/* 14 */            return new C0740j0(str);
                }

                /* JADX INFO: renamed from: a */
/* 14 */        public static boolean m2621a(int i) {
                    return i >= f5510b;
                }
            }
