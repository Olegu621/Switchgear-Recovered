            package io.flutter;

            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class Log {
                public static int ASSERT = 7;
                public static int DEBUG = 3;
                public static int ERROR = 6;
                public static int INFO = 4;
                public static int VERBOSE = 2;
                public static int WARN = 5;
                private static int logLevel = 3;

                /* JADX INFO: renamed from: d */
                public static void m4583d(String str, String str2) {
                }

                /* JADX INFO: renamed from: e */
                public static void m4585e(String str, String str2) {
/* 1 */             AbstractC1245n0.m4876d(str, str2);
                }

                public static String getStackTraceString(Throwable th) {
/* 1 */             return android.util.Log.getStackTraceString(th);
                }

                /* JADX INFO: renamed from: i */
                public static void m4587i(String str, String str2) {
                }

                public static void println(int i, String str, String str2) {
                }

                public static void setLogLevel(int i) {
/* 1 */             logLevel = i;
                }

                /* JADX INFO: renamed from: v */
                public static void m4589v(String str, String str2) {
                }

                /* JADX INFO: renamed from: w */
                public static void m4591w(String str, String str2) {
/* 1 */             AbstractC1245n0.m4889q(str, str2);
                }

                public static void wtf(String str, String str2) {
/* 1 */             AbstractC1245n0.m4892t(str, str2);
                }

                /* JADX INFO: renamed from: d */
/* 1 */         public static void m4584d(String str, String str2, Throwable th) {
                }

                /* JADX INFO: renamed from: i */
/* 1 */         public static void m4588i(String str, String str2, Throwable th) {
                }

                /* JADX INFO: renamed from: v */
/* 1 */         public static void m4590v(String str, String str2, Throwable th) {
                }

                /* JADX INFO: renamed from: e */
/* 4 */         public static void m4586e(String str, String str2, Throwable th) {
/* 5 */             AbstractC1245n0.m4877e(str, str2, th);
                }

                /* JADX INFO: renamed from: w */
/* 4 */         public static void m4592w(String str, String str2, Throwable th) {
/* 5 */             AbstractC1245n0.m4891s(str, str2, th);
                }

/* 4 */         public static void wtf(String str, String str2, Throwable th) {
/* 5 */             AbstractC1245n0.m4893u(str, str2, th);
                }
            }
