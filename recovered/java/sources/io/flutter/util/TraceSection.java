            package io.flutter.util;

            import android.os.Build;
            import android.os.Trace;
            import p000.j13;
            import p000.nq2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class TraceSection implements AutoCloseable {
                private TraceSection(String str) {
/* 4 */             begin(str);
                }

                public static void begin(String str) {
/* 9 */             Trace.beginSection(j13.m5636A(cropSectionName(str)));
                }

                public static void beginAsyncSection(String str, int i) {
/* 1 */             String strCropSectionName = cropSectionName(str);
/* 9 */             if (Build.VERSION.SDK_INT >= 29) {
/* 15 */                nq2.m7030a(j13.m5636A(strCropSectionName), i);
/* 18 */                return;
                    }
/* 19 */            String strM5636A = j13.m5636A(strCropSectionName);
                    try {
/* 27 */                if (j13.f12013w == null) {
/* 45 */                    j13.f12013w = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                        }
/* 64 */                j13.f12013w.invoke(null, Long.valueOf(j13.f12011u), strM5636A, Integer.valueOf(i));
                    } catch (Exception e) {
/* 69 */                j13.m5648j(e);
                    }
                }

                private static String cropSectionName(String str) {
                    return str.length() < 124 ? str : str.substring(0, 124).concat("...");
                }

                public static void end() throws RuntimeException {
/* 1 */             Trace.endSection();
                }

                public static void endAsyncSection(String str, int i) {
/* 1 */             String strCropSectionName = cropSectionName(str);
/* 9 */             if (Build.VERSION.SDK_INT >= 29) {
/* 15 */                nq2.m7031b(j13.m5636A(strCropSectionName), i);
/* 18 */                return;
                    }
/* 19 */            String strM5636A = j13.m5636A(strCropSectionName);
                    try {
/* 27 */                if (j13.f12014x == null) {
/* 45 */                    j13.f12014x = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
/* 64 */                j13.f12014x.invoke(null, Long.valueOf(j13.f12011u), strM5636A, Integer.valueOf(i));
                    } catch (Exception e) {
/* 69 */                j13.m5648j(e);
                    }
                }

                public static TraceSection scoped(String str) {
/* 3 */             return new TraceSection(str);
                }

                @Override // java.lang.AutoCloseable
                public void close() {
/* 1 */             end();
                }
            }
