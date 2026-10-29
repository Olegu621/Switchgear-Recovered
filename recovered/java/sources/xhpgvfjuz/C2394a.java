            package xhpgvfjuz;

            import android.os.ParcelFileDescriptor;
            import android.util.Log;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.io.BufferedReader;
            import java.io.InputStreamReader;
            import java.util.Objects;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import okio.Segment;
            
            /* JADX INFO: renamed from: xhpgvfjuz.a */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class C2394a {

                /* JADX INFO: renamed from: a */
                private static final String f19131a = "Report";

                /* JADX INFO: renamed from: b */
                private static int f19132b = -1;

                /* JADX INFO: renamed from: a */
                private static C2411aa m9863a(String str) {
                    if (str == null) {
                        return new C2404aJ("!");
                    }
                    if (str.length() < 2) {
                        return new C2404aJ("!" + str);
                    }
                    if (str.startsWith("!")) {
                        return new C2404aJ(str);
                    }
                    switch (Integer.parseInt(str.substring(0, 2), 16)) {
                        case 0:
                            return new C2407aM(str);
                        case 1:
                            return new C2437b(str);
                        case 2:
                            return new C2440e(str);
                        case 3:
                            return new C2406aL(str);
                        case 4:
                            return new C2458w(str);
                        case 5:
                            return new C2408aN(str);
                        case 6:
                            return new C2379K(str);
                        case 7:
                            return new C2400aF(str);
                        case 8:
                            return new C2434ax(str);
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
                        case 14:
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                        case 16:
                        case 17:
                        case Build.API_LEVELS.API_23 /* 23 */:
                        case Build.API_LEVELS.API_25 /* 25 */:
                            return new C2395aA(str);
                        case 18:
                        case 24:
                        case Build.API_LEVELS.API_30 /* 30 */:
                        default:
                            return new C2404aJ(str);
                        case 19:
                            return new C2428ar(str);
                        case 20:
                            return new C2396aB(str);
                        case Build.API_LEVELS.API_21 /* 21 */:
                            return new C2459x(str);
                        case Build.API_LEVELS.API_22 /* 22 */:
                            return new C2369A(str);
                        case Build.API_LEVELS.API_26 /* 26 */:
                            return new C2417ag(str);
                        case Build.API_LEVELS.API_27 /* 27 */:
                            return new C2397aC(str);
                        case Build.API_LEVELS.API_28 /* 28 */:
                            return new C2372D(str);
                        case Build.API_LEVELS.API_29 /* 29 */:
                            return new C2441f(str);
                        case Build.API_LEVELS.API_31 /* 31 */:
                            return new C2412ab(str);
                        case 32:
                            return new C2385Q(str);
                        case Build.API_LEVELS.API_33 /* 33 */:
                            return new C2418ah(str);
                        case Build.API_LEVELS.API_34 /* 34 */:
                            return new C2402aH(str);
                    }
                }

                /* JADX INFO: renamed from: a */
                public static void m9864a() {
                    new C2444i().start();
                }

                /* JADX INFO: renamed from: b */
                public static void m9866b(String str) {
                    C2411aa c2411aaM9863a = m9863a(str);
                    if (android.os.Build.VERSION.SDK_INT >= 26) {
                        Log.e(f19131a, "Exiting: ", c2411aaM9863a);
                    }
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                    Objects.requireNonNull(defaultUncaughtExceptionHandler);
                    defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), c2411aaM9863a);
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX INFO: renamed from: d */
                public static String m9868d() throws Throwable {
                    BufferedReader bufferedReader;
                    StringBuilder sb = new StringBuilder();
                    BufferedReader bufferedReader2 = null;
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(new ParcelFileDescriptor.AutoCloseInputStream(ParcelFileDescriptor.adoptFd(f19132b))));
                        try {
                            char[] cArr = new char[Segment.SHARE_MINIMUM];
                            while (true) {
                                int i = bufferedReader.read(cArr, 0, Segment.SHARE_MINIMUM);
                                if (i <= 0) {
                                    break;
                                }
                                sb.append(cArr, 0, i);
                                if (sb.toString().endsWith("?")) {
                                    sb.setLength(sb.length() - 1);
                                    break;
                                }
                            }
                            try {
                                bufferedReader.close();
                            } catch (Exception unused) {
                            }
                            if (sb.length() <= 0) {
                                return null;
                            }
                            return sb.toString();
                        } catch (Exception unused2) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused3) {
                                }
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (Exception unused4) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception unused5) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
