            package p000;

            import android.content.res.TypedArray;
            import android.media.MediaDrm;
            import android.media.MediaMetadataRetriever;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: renamed from: en */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract /* synthetic */ class AbstractC0886en implements InterfaceC2299vm {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f7803a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};

                /* JADX INFO: renamed from: b */
                public static final int[] f7804b = {2, 1, 4, 3};

                /* JADX INFO: renamed from: A */
                public static /* synthetic */ String m3492A(int i) {
                    switch (i) {
                        case 1:
/* 34 */                    return "RELEASED";
                        case 2:
/* 31 */                    return "RELEASING";
                        case 3:
/* 28 */                    return "INITIALIZED";
                        case 4:
/* 25 */                    return "PENDING_OPEN";
                        case 5:
/* 22 */                    return "CLOSING";
                        case 6:
/* 19 */                    return "REOPENING_QUIRK";
                        case 7:
/* 16 */                    return "REOPENING";
                        case 8:
/* 13 */                    return "OPENING";
                        case 9:
/* 10 */                    return "OPENED";
                        case 10:
/* 7 */                     return "CONFIGURED";
                        default:
/* 4 */                     return "null";
                    }
                }

                /* JADX INFO: renamed from: B */
                public static /* synthetic */ String m3493B(int i) {
/* 2 */             if (i == 1) {
/* 31 */                return "PENDING_OPEN";
                    }
/* 5 */             if (i == 2) {
/* 28 */                return "OPENING";
                    }
/* 8 */             if (i == 3) {
/* 25 */                return "OPEN";
                    }
/* 11 */            if (i != 4) {
                        return i != 5 ? "null" : "CLOSED";
                    }
/* 22 */            return "CLOSING";
                }

                /* JADX INFO: renamed from: C */
                public static /* synthetic */ String m3494C(int i) {
                    switch (i) {
                        case 1:
/* 28 */                    return "UNINITIALIZED";
                        case 2:
/* 25 */                    return "INITIALIZED";
                        case 3:
/* 22 */                    return "GET_SURFACE";
                        case 4:
/* 19 */                    return "OPENING";
                        case 5:
/* 16 */                    return "OPENED";
                        case 6:
/* 13 */                    return "CLOSED";
                        case 7:
/* 10 */                    return "RELEASING";
                        case 8:
/* 7 */                     return "RELEASED";
                        default:
/* 4 */                     return "null";
                    }
                }

                /* JADX INFO: renamed from: D */
                public static /* synthetic */ String m3495D(int i) {
                    switch (i) {
                        case 1:
/* 28 */                    return "UNKNOWN";
                        case 2:
/* 25 */                    return "HORIZONTAL_DIMENSION";
                        case 3:
/* 22 */                    return "VERTICAL_DIMENSION";
                        case 4:
/* 19 */                    return "LEFT";
                        case 5:
/* 16 */                    return "RIGHT";
                        case 6:
/* 13 */                    return "TOP";
                        case 7:
/* 10 */                    return "BOTTOM";
                        case 8:
/* 7 */                     return "BASELINE";
                        default:
/* 4 */                     return "null";
                    }
                }

                /* JADX INFO: renamed from: E */
                public static /* synthetic */ int[] m3496E(int i) {
/* 1 */             int[] iArr = new int[i];
/* 6 */             System.arraycopy(f7803a, 0, iArr, 0, i);
/* 9 */             return iArr;
                }

                /* JADX INFO: renamed from: a */
                public static boolean m3497a(int i, int i2, int i3) {
                    switch (i) {
                        case 1:
                            return ((i2 + i3) & 1) == 0;
                        case 2:
                            return (i2 & 1) == 0;
                        case 3:
                            return i3 % 3 == 0;
                        case 4:
                            return (i2 + i3) % 3 == 0;
                        case 5:
                            return (((i3 / 3) + (i2 / 2)) & 1) == 0;
                        case 6:
                            return (i2 * i3) % 6 == 0;
                        case 7:
                            return (i2 * i3) % 6 < 3;
                        default:
                            return ((((i2 * i3) % 3) + (i2 + i3)) & 1) == 0;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static /* synthetic */ int m3498b(int i, int i2) {
/* 1 */             if (i == 0 || i2 == 0) {
/* 8 */                 throw null;
                    }
/* 5 */             return i - i2;
                }

                /* JADX INFO: renamed from: c */
                public static /* synthetic */ boolean m3499c(int i, int i2) {
/* 1 */             if (i != 0) {
                        return i == i2;
                    }
/* 10 */            throw null;
                }

                /* JADX INFO: renamed from: d */
                public static /* synthetic */ int m3500d(int i) {
/* 2 */             if (i == 1) {
/* 1 */                 return 1;
                    }
/* 5 */             if (i == 2) {
/* 15 */                return 10;
                    }
/* 8 */             if (i == 3) {
/* 10 */                return 25;
                    }
/* 14 */            throw null;
                }

                /* JADX INFO: renamed from: e */
                public static /* synthetic */ long m3501e(int i) {
/* 2 */             if (i == 1) {
/* 30 */                return 0L;
                    }
/* 5 */             if (i == 2) {
/* 27 */                return 1L;
                    }
/* 8 */             if (i == 3) {
/* 24 */                return 2L;
                    }
/* 11 */            if (i == 4) {
/* 21 */                return 3L;
                    }
/* 14 */            if (i == 5) {
/* 16 */                return 4L;
                    }
/* 20 */            throw null;
                }

                /* JADX INFO: renamed from: f */
                public static /* synthetic */ String m3502f(int i) {
                    switch (i) {
                        case 1:
/* 27 */                    return "web";
                        case 2:
/* 24 */                    return "mob";
                        case 3:
/* 21 */                    return "pc";
                        case 4:
/* 18 */                    return "srv";
                        case 5:
/* 15 */                    return "app";
                        case 6:
/* 12 */                    return "tv";
                        case 7:
/* 9 */                     return "cnsl";
                        case 8:
/* 6 */                     return "iot";
                        default:
/* 5 */                     throw null;
                    }
                }

                /* JADX INFO: renamed from: g */
                public static float m3503g(float f, float f2, float f3, float f4) {
/* 3 */             return ((f - f2) * f3) + f4;
                }

                /* JADX INFO: renamed from: h */
                public static int m3504h(int i, int i2, boolean z) {
/* 6 */             return (Boolean.hashCode(z) + i) * i2;
                }

                /* JADX INFO: renamed from: i */
                public static String m3505i(int i, String str, String str2) {
/* 12 */            return str + i + str2;
                }

                /* JADX INFO: renamed from: j */
                public static String m3506j(String str, int i, int i2, String str2) {
/* 15 */            return str + i + str2 + i2;
                }

                /* JADX INFO: renamed from: k */
                public static String m3507k(String str, String str2) {
/* 9 */             return str + str2;
                }

                /* JADX INFO: renamed from: l */
                public static String m3508l(String str, String str2, String str3) {
/* 15 */            return str + str2 + str3;
                }

                /* JADX INFO: renamed from: m */
                public static String m3509m(String str, String str2, String str3, String str4) {
/* 15 */            return str + str2 + str3 + str4;
                }

                /* JADX INFO: renamed from: n */
                public static String m3510n(StringBuilder sb, int i, char c) {
/* 1 */             sb.append(i);
/* 4 */             sb.append(c);
/* 7 */             return sb.toString();
                }

                /* JADX INFO: renamed from: o */
                public static String m3511o(StringBuilder sb, boolean z, String str) {
/* 1 */             sb.append(z);
/* 4 */             sb.append(str);
/* 7 */             return sb.toString();
                }

                /* JADX INFO: renamed from: p */
                public static StringBuilder m3512p(String str) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             sb.append(str);
/* 9 */             return sb;
                }

                /* JADX INFO: renamed from: q */
                public static StringBuilder m3513q(String str, String str2, String str3) {
/* 3 */             StringBuilder sb = new StringBuilder(str);
/* 6 */             sb.append(str2);
/* 9 */             sb.append(str3);
/* 12 */            return sb;
                }

                /* JADX INFO: renamed from: r */
                public static StringBuilder m3514r(String str, String str2, String str3, String str4, String str5) {
/* 3 */             StringBuilder sb = new StringBuilder(str);
/* 6 */             sb.append(str2);
/* 9 */             sb.append(str3);
/* 12 */            sb.append(str4);
/* 15 */            sb.append(str5);
/* 18 */            return sb;
                }

                /* JADX INFO: renamed from: s */
                public static HashMap m3515s(Class cls, C2327wd c2327wd) {
/* 3 */             HashMap map = new HashMap();
/* 6 */             map.put(cls, c2327wd);
/* 9 */             return map;
                }

                /* JADX INFO: renamed from: t */
                public static Map m3516t(HashMap map) {
/* 6 */             return Collections.unmodifiableMap(new HashMap(map));
                }

                /* JADX INFO: renamed from: u */
                public static /* synthetic */ void m3517u(AutoCloseable autoCloseable) throws Exception {
                    boolean zIsTerminated;
/* 3 */             if (autoCloseable instanceof AutoCloseable) {
/* 5 */                 autoCloseable.close();
/* 8 */                 return;
                    }
/* 11 */            if (!(autoCloseable instanceof ExecutorService)) {
/* 62 */                if (autoCloseable instanceof TypedArray) {
/* 66 */                    ((TypedArray) autoCloseable).recycle();
/* 69 */                    return;
                        }
/* 72 */                if (autoCloseable instanceof MediaMetadataRetriever) {
/* 76 */                    ((MediaMetadataRetriever) autoCloseable).release();
/* 79 */                    return;
                        } else if (autoCloseable instanceof MediaDrm) {
/* 86 */                    ((MediaDrm) autoCloseable).release();
/* 89 */                    return;
                        } else {
/* 90 */                    f42.m3649e();
/* 93 */                    return;
                        }
                    }
/* 13 */            ExecutorService executorService = (ExecutorService) autoCloseable;
/* 19 */            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
/* 59 */                return;
                    }
/* 28 */            executorService.shutdown();
/* 31 */            boolean z = false;
/* 32 */            while (!zIsTerminated) {
                        try {
/* 38 */                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
/* 43 */                    if (!z) {
/* 45 */                        executorService.shutdownNow();
/* 48 */                        z = true;
                            }
                        }
                    }
/* 50 */            if (z) {
/* 56 */                Thread.currentThread().interrupt();
                    }
                }

                /* JADX INFO: renamed from: v */
                public static /* synthetic */ String m3518v(int i) {
                    switch (i) {
                        case 1:
/* 33 */                    return "RELEASED";
                        case 2:
/* 30 */                    return "RELEASING";
                        case 3:
/* 27 */                    return "INITIALIZED";
                        case 4:
/* 24 */                    return "PENDING_OPEN";
                        case 5:
/* 21 */                    return "CLOSING";
                        case 6:
/* 18 */                    return "REOPENING_QUIRK";
                        case 7:
/* 15 */                    return "REOPENING";
                        case 8:
/* 12 */                    return "OPENING";
                        case 9:
/* 9 */                     return "OPENED";
                        case 10:
/* 6 */                     return "CONFIGURED";
                        default:
/* 5 */                     throw null;
                    }
                }

                /* JADX INFO: renamed from: x */
                public static /* synthetic */ String m3519x(int i) {
                    switch (i) {
                        case 1:
/* 30 */                    return "NONE";
                        case 2:
/* 27 */                    return "LEFT";
                        case 3:
/* 24 */                    return "TOP";
                        case 4:
/* 21 */                    return "RIGHT";
                        case 5:
/* 18 */                    return "BOTTOM";
                        case 6:
/* 15 */                    return "BASELINE";
                        case 7:
/* 12 */                    return "CENTER";
                        case 8:
/* 9 */                     return "CENTER_X";
                        case 9:
/* 6 */                     return "CENTER_Y";
                        default:
/* 5 */                     throw null;
                    }
                }

                /* JADX INFO: renamed from: y */
                public static /* synthetic */ int m3520y(int i) {
/* 1 */             if (i != 0) {
/* 3 */                 return i - 1;
                    }
/* 7 */             throw null;
                }

                /* JADX INFO: renamed from: z */
                public static /* synthetic */ String m3521z(int i) {
/* 2 */             if (i == 1) {
/* 25 */                return "OK";
                    }
/* 5 */             if (i == 2) {
/* 22 */                return "TRANSIENT_ERROR";
                    }
/* 8 */             if (i != 3) {
                        return i != 4 ? "null" : "INVALID_PAYLOAD";
                    }
/* 19 */            return "FATAL_ERROR";
                }
            }
