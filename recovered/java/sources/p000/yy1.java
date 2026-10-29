            package p000;

            import android.app.AppOpsManager;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.res.Resources;
            import android.hardware.camera2.CameraCharacteristics;
            import android.os.Build;
            import android.util.TypedValue;
            import android.view.View;
            import com.google.android.gms.common.R$string;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.C1697u2;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.config.AbstractC1417a;
            import java.io.BufferedReader;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.lang.reflect.Field;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.functions.Function1;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class yy1 {

                /* JADX INFO: renamed from: a */
                public static final C2332wi f19858a = new C2332wi();

                /* JADX INFO: renamed from: b */
                public static final c01 f19859b = new c01();

                /* JADX INFO: renamed from: c */
                public static final Object f19860c = new Object();

                /* JADX INFO: renamed from: d */
                public static g63 f19861d = null;

                /* JADX INFO: renamed from: e */
                public static Field f19862e = null;

                /* JADX INFO: renamed from: f */
                public static boolean f19863f = false;

                /* JADX INFO: renamed from: g */
                public static boolean f19864g = true;

                /* JADX INFO: renamed from: A */
                public static String m10195A(Context context, String str) throws Throwable {
                    BufferedReader bufferedReader;
                    IOException e;
                    InputStream inputStreamOpen;
/* 1 */             String string = HttpUrl.FRAGMENT_ENCODE_SET;
/* 3 */             if (context == null) {
/* 1 */                 return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 6 */             InputStream inputStream = null;
                    try {
/* 9 */                 StringBuilder sb = new StringBuilder();
/* 16 */                inputStreamOpen = context.getAssets().open(str);
                        try {
/* 27 */                    bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
                            while (true) {
                                try {
                                    try {
/* 30 */                                String line = bufferedReader.readLine();
/* 34 */                                if (line == null) {
                                            break;
                                        }
/* 36 */                                sb.append(line);
                                    } catch (IOException e2) {
/* 43 */                                e = e2;
/* 75 */                                AbstractC1245n0.m4877e("astsUtl", "Error in reading the file contents", e);
                                    }
                                } catch (Throwable th) {
/* 40 */                            th = th;
/* 41 */                            inputStream = inputStreamOpen;
/* 79 */                            b40.m1221e(inputStream);
/* 82 */                            b40.m1221e(bufferedReader);
/* 85 */                            throw th;
                                }
                            }
/* 45 */                    string = sb.toString();
                        } catch (IOException e3) {
/* 61 */                    e = e3;
/* 62 */                    bufferedReader = null;
                        } catch (Throwable th2) {
/* 56 */                    th = th2;
/* 57 */                    bufferedReader = null;
/* 41 */                    inputStream = inputStreamOpen;
/* 79 */                    b40.m1221e(inputStream);
/* 82 */                    b40.m1221e(bufferedReader);
/* 85 */                    throw th;
                        }
                    } catch (IOException e4) {
/* 68 */                bufferedReader = null;
/* 69 */                e = e4;
/* 70 */                inputStreamOpen = null;
                    } catch (Throwable th3) {
/* 64 */                th = th3;
/* 65 */                bufferedReader = null;
/* 79 */                b40.m1221e(inputStream);
/* 82 */                b40.m1221e(bufferedReader);
/* 85 */                throw th;
                    }
/* 49 */            b40.m1221e(inputStreamOpen);
/* 52 */            b40.m1221e(bufferedReader);
/* 55 */            return string;
                }

                /* JADX INFO: renamed from: B */
                public static String m10196B(String str) {
/* 3 */             FileInputStream fileInputStreamM5164b = null;
                    try {
/* 6 */                 File file = new File(str);
/* 14 */                fileInputStreamM5164b = AbstractC1417a.m5164b(file, new FileInputStream(file));
/* 22 */                int length = (int) file.length();
/* 23 */                byte[] bArr = new byte[length];
/* 26 */                fileInputStreamM5164b.read(bArr, 0, length);
/* 31 */                return new String(bArr);
                    } catch (Exception e) {
/* 47 */                xe2.m9777o("fileutil", "Error reading file: ".concat(str), e);
/* 53 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    } finally {
/* 56 */                b40.m1221e(fileInputStreamM5164b);
                    }
                }

                /* JADX INFO: renamed from: C */
                public static TypedValue m10197C(Context context, int i) {
/* 3 */             TypedValue typedValue = new TypedValue();
/* 15 */            if (context.getTheme().resolveAttribute(i, typedValue, true)) {
/* 17 */                return typedValue;
                    }
/* 18 */            return null;
                }

                /* JADX INFO: renamed from: D */
                public static int m10198D(Context context, String str, int i) {
/* 1 */             TypedValue typedValueM10197C = m10197C(context, i);
/* 5 */             if (typedValueM10197C != null) {
/* 7 */                 return typedValueM10197C.data;
                    }
/* 24 */            C1697u2.m5437m("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)});
/* 27 */            return 0;
                }

                /* JADX INFO: renamed from: E */
                public static HashMap m10199E(HashMap map) {
/* 3 */             HashMap map2 = new HashMap();
/* 6 */             Boolean bool = Boolean.FALSE;
/* 10 */            map2.put("enableLogging", bool);
/* 17 */            map2.put("notificationChannelId", HttpUrl.FRAGMENT_ENCODE_SET);
/* 27 */            map2.put("notificationSoundId", 0);
/* 32 */            map2.put("notificationIcon", 0);
/* 37 */            map2.put("notificationLargeIcon", 0);
/* 42 */            map2.put("manualLifecycleTracking", bool);
/* 49 */            map2.put("enableInAppNotification", Boolean.TRUE);
/* 52 */            map2.putAll(map);
/* 55 */            return map2;
                }

                /* JADX INFO: renamed from: G */
                public static void m10200G(int i, InterfaceC2462xi interfaceC2462xi, C2569zz c2569zz, boolean z) {
/* 1 */             float f = c2569zz.f20432f0;
/* 3 */             C2051oz c2051oz = c2569zz.f20404J;
/* 7 */             int iM7246d = c2051oz.f14929f.m7246d();
/* 11 */            C2051oz c2051oz2 = c2569zz.f20406L;
/* 15 */            int iM7246d2 = c2051oz2.f14929f.m7246d();
/* 23 */            int iM7247e = c2051oz.m7247e() + iM7246d;
/* 28 */            int iM7247e2 = iM7246d2 - c2051oz2.m7247e();
/* 32 */            if (iM7246d == iM7246d2) {
/* 34 */                f = 0.5f;
                    } else {
/* 36 */                iM7246d = iM7247e;
/* 37 */                iM7246d2 = iM7247e2;
                    }
/* 38 */            int iM10475r = c2569zz.m10475r();
/* 44 */            int i2 = (iM7246d2 - iM7246d) - iM10475r;
/* 45 */            if (iM7246d > iM7246d2) {
/* 49 */                i2 = (iM7246d - iM7246d2) - iM10475r;
                    }
/* 60 */            int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iM7246d;
/* 61 */            int i4 = i3 + iM10475r;
/* 63 */            if (iM7246d > iM7246d2) {
/* 65 */                i4 = i3 - iM10475r;
                    }
/* 67 */            c2569zz.m10459K(i3, i4);
/* 72 */            m10226v(i + 1, interfaceC2462xi, c2569zz, z);
                }

                /* JADX INFO: renamed from: H */
                public static void m10201H(int i, C2569zz c2569zz, InterfaceC2462xi interfaceC2462xi, C2569zz c2569zz2, boolean z) {
/* 1 */             float f = c2569zz2.f20432f0;
/* 3 */             C2051oz c2051oz = c2569zz2.f20404J;
/* 15 */            int iM7247e = c2051oz.m7247e() + c2051oz.f14929f.m7246d();
/* 16 */            C2051oz c2051oz2 = c2569zz2.f20406L;
/* 28 */            int iM7246d = c2051oz2.f14929f.m7246d() - c2051oz2.m7247e();
/* 29 */            if (iM7246d >= iM7247e) {
/* 31 */                int iM10475r = c2569zz2.m10475r();
/* 41 */                if (c2569zz2.f20438i0 != 8) {
/* 43 */                    int i2 = c2569zz2.f20455r;
/* 46 */                    if (i2 == 2) {
/* 68 */                        iM10475r = (int) (c2569zz2.f20432f0 * 0.5f * (c2569zz instanceof a00 ? c2569zz.m10475r() : c2569zz.f20416V.m10475r()));
                            } else if (i2 == 0) {
/* 72 */                        iM10475r = iM7246d - iM7247e;
                            }
/* 76 */                    iM10475r = Math.max(c2569zz2.f20461u, iM10475r);
/* 80 */                    int i3 = c2569zz2.f20462v;
/* 82 */                    if (i3 > 0) {
/* 84 */                        iM10475r = Math.min(i3, iM10475r);
                            }
                        }
/* 94 */                int i4 = iM7247e + ((int) ((f * ((iM7246d - iM7247e) - iM10475r)) + 0.5f));
/* 96 */                c2569zz2.m10459K(i4, iM10475r + i4);
/* 101 */               m10226v(i + 1, interfaceC2462xi, c2569zz2, z);
                    }
                }

                /* JADX INFO: renamed from: I */
                public static void m10202I(int i, InterfaceC2462xi interfaceC2462xi, C2569zz c2569zz) {
/* 1 */             float f = c2569zz.f20434g0;
/* 3 */             C2051oz c2051oz = c2569zz.f20405K;
/* 7 */             int iM7246d = c2051oz.f14929f.m7246d();
/* 11 */            C2051oz c2051oz2 = c2569zz.f20407M;
/* 15 */            int iM7246d2 = c2051oz2.f14929f.m7246d();
/* 23 */            int iM7247e = c2051oz.m7247e() + iM7246d;
/* 28 */            int iM7247e2 = iM7246d2 - c2051oz2.m7247e();
/* 32 */            if (iM7246d == iM7246d2) {
/* 34 */                f = 0.5f;
                    } else {
/* 36 */                iM7246d = iM7247e;
/* 37 */                iM7246d2 = iM7247e2;
                    }
/* 38 */            int iM10472l = c2569zz.m10472l();
/* 44 */            int i2 = (iM7246d2 - iM7246d) - iM10472l;
/* 45 */            if (iM7246d > iM7246d2) {
/* 49 */                i2 = (iM7246d - iM7246d2) - iM10472l;
                    }
/* 55 */            int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
/* 60 */            int i4 = iM7246d + i3;
/* 62 */            int i5 = i4 + iM10472l;
/* 64 */            if (iM7246d > iM7246d2) {
/* 66 */                i4 = iM7246d - i3;
/* 68 */                i5 = i4 - iM10472l;
                    }
/* 70 */            c2569zz.m10460L(i4, i5);
/* 75 */            m10207N(i + 1, interfaceC2462xi, c2569zz);
                }

                /* JADX INFO: renamed from: J */
                public static void m10203J(int i, C2569zz c2569zz, InterfaceC2462xi interfaceC2462xi, C2569zz c2569zz2) {
/* 1 */             float f = c2569zz2.f20434g0;
/* 3 */             C2051oz c2051oz = c2569zz2.f20405K;
/* 15 */            int iM7247e = c2051oz.m7247e() + c2051oz.f14929f.m7246d();
/* 16 */            C2051oz c2051oz2 = c2569zz2.f20407M;
/* 28 */            int iM7246d = c2051oz2.f14929f.m7246d() - c2051oz2.m7247e();
/* 29 */            if (iM7246d >= iM7247e) {
/* 31 */                int iM10472l = c2569zz2.m10472l();
/* 41 */                if (c2569zz2.f20438i0 != 8) {
/* 43 */                    int i2 = c2569zz2.f20457s;
/* 46 */                    if (i2 == 2) {
/* 67 */                        iM10472l = (int) (f * 0.5f * (c2569zz instanceof a00 ? c2569zz.m10472l() : c2569zz.f20416V.m10472l()));
                            } else if (i2 == 0) {
/* 71 */                        iM10472l = iM7246d - iM7247e;
                            }
/* 75 */                    iM10472l = Math.max(c2569zz2.f20464x, iM10472l);
/* 79 */                    int i3 = c2569zz2.f20465y;
/* 81 */                    if (i3 > 0) {
/* 83 */                        iM10472l = Math.min(i3, iM10472l);
                            }
                        }
/* 93 */                int i4 = iM7247e + ((int) ((f * ((iM7246d - iM7247e) - iM10472l)) + 0.5f));
/* 95 */                c2569zz2.m10460L(i4, iM10472l + i4);
/* 100 */               m10207N(i + 1, interfaceC2462xi, c2569zz2);
                    }
                }

                /* JADX INFO: renamed from: K */
                public static ComponentName m10204K(Context context, Intent intent) {
                    synchronized (f19860c) {
                        try {
/* 4 */                     m10213h(context);
/* 10 */                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
/* 17 */                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
/* 20 */                    ComponentName componentNameStartService = context.startService(intent);
/* 24 */                    if (componentNameStartService == null) {
/* 26 */                        return null;
                            }
/* 31 */                    if (!booleanExtra) {
/* 35 */                        f19861d.m3878a();
                            }
/* 39 */                    return componentNameStartService;
                        } catch (Throwable th) {
/* 41 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: L */
                public static boolean m10205L(Context context, String str, int i) {
/* 1 */             v30 v30VarM3898a = g93.m3898a(context);
/* 5 */             v30VarM3898a.getClass();
                    try {
/* 16 */                AppOpsManager appOpsManager = (AppOpsManager) v30VarM3898a.f17850a.getSystemService("appops");
/* 18 */                if (appOpsManager == null) {
/* 32 */                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                        }
/* 20 */                appOpsManager.checkPackage(i, str);
/* 23 */                return true;
                    } catch (SecurityException unused) {
/* 33 */                return false;
                    }
                }

                /* JADX INFO: renamed from: M */
                public static final boolean m10206M(String str, Function0 function0) {
                    try {
/* 9 */                 boolean zBooleanValue = ((Boolean) function0.invoke()).booleanValue();
/* 13 */                if (!zBooleanValue) {
/* 15 */                    AbstractC1245n0.m4876d("ReflectionGuard", str);
                        }
/* 18 */                return zBooleanValue;
                    } catch (ClassNotFoundException unused) {
/* 35 */                AbstractC1245n0.m4876d("ReflectionGuard", "ClassNotFound: ".concat(str));
/* 38 */                return false;
                    } catch (NoSuchMethodException unused2) {
/* 25 */                AbstractC1245n0.m4876d("ReflectionGuard", "NoSuchMethod: ".concat(str));
/* 38 */                return false;
                    }
                }

                /* JADX INFO: renamed from: N */
                public static void m10207N(int i, InterfaceC2462xi interfaceC2462xi, C2569zz c2569zz) {
                    boolean z;
                    C2051oz c2051oz;
                    C2051oz c2051oz2;
                    C2051oz c2051oz3;
                    C2051oz c2051oz4;
/* 7 */             if (c2569zz.f20447n) {
/* 271 */               return;
                    }
/* 13 */            if (!(c2569zz instanceof a00) && c2569zz.m10455A() && m10212d(c2569zz)) {
/* 32 */                a00.m2W(c2569zz, interfaceC2462xi, new C2332wi());
                    }
/* 36 */            C2051oz c2051ozMo1430j = c2569zz.mo1430j(3);
/* 41 */            C2051oz c2051ozMo1430j2 = c2569zz.mo1430j(5);
/* 45 */            int iM7246d = c2051ozMo1430j.m7246d();
/* 49 */            int iM7246d2 = c2051ozMo1430j2.m7246d();
/* 53 */            HashSet<C2051oz> hashSet = c2051ozMo1430j.f14924a;
/* 57 */            EnumC2516yz enumC2516yz = EnumC2516yz.f19867c;
/* 59 */            if (hashSet != null && c2051ozMo1430j.f14926c) {
/* 73 */                for (C2051oz c2051oz5 : hashSet) {
/* 81 */                    C2569zz c2569zz2 = c2051oz5.f14927d;
/* 83 */                    int i2 = i + 1;
/* 85 */                    boolean zM10212d = m10212d(c2569zz2);
/* 89 */                    C2051oz c2051oz6 = c2569zz2.f20405K;
/* 93 */                    C2051oz c2051oz7 = c2569zz2.f20407M;
/* 99 */                    if (c2569zz2.m10455A() && zM10212d) {
/* 108 */                       a00.m2W(c2569zz2, interfaceC2462xi, new C2332wi());
                            }
/* 135 */                   boolean z2 = (c2051oz5 == c2051oz6 && (c2051oz4 = c2051oz7.f14929f) != null && c2051oz4.f14926c) || (c2051oz5 == c2051oz7 && (c2051oz3 = c2051oz6.f14929f) != null && c2051oz3.f14926c);
/* 139 */                   EnumC2516yz enumC2516yz2 = c2569zz2.f20415U[1];
/* 141 */                   if (enumC2516yz2 != enumC2516yz || zM10212d) {
/* 196 */                       if (!c2569zz2.m10455A()) {
/* 200 */                           if (c2051oz5 == c2051oz6 && c2051oz7.f14929f == null) {
/* 210 */                               int iM7247e = c2051oz6.m7247e() + iM7246d;
/* 216 */                               c2569zz2.m10460L(iM7247e, c2569zz2.m10472l() + iM7247e);
/* 219 */                               m10207N(i2, interfaceC2462xi, c2569zz2);
                                    } else if (c2051oz5 == c2051oz7 && c2051oz6.f14929f == null) {
/* 234 */                               int iM7247e2 = iM7246d - c2051oz7.m7247e();
/* 242 */                               c2569zz2.m10460L(iM7247e2 - c2569zz2.m10472l(), iM7247e2);
/* 245 */                               m10207N(i2, interfaceC2462xi, c2569zz2);
                                    } else if (z2 && !c2569zz2.m10483z()) {
/* 258 */                               m10202I(i2, interfaceC2462xi, c2569zz2);
                                    }
                                }
                            } else if (enumC2516yz2 == enumC2516yz && c2569zz2.f20465y >= 0 && c2569zz2.f20464x >= 0 && (c2569zz2.f20438i0 == 8 || (c2569zz2.f20457s == 0 && c2569zz2.f20419Y == 0.0f))) {
/* 174 */                       if (!c2569zz2.m10483z() && !c2569zz2.f20401G && z2 && !c2569zz2.m10483z()) {
/* 188 */                           m10203J(i2, c2569zz, interfaceC2462xi, c2569zz2);
                                }
                            }
                        }
                    }
/* 265 */           boolean z3 = true;
/* 265 */           z3 = true;
/* 265 */           z3 = true;
/* 269 */           if (c2569zz instanceof bs0) {
/* 271 */               return;
                    }
/* 272 */           HashSet<C2051oz> hashSet2 = c2051ozMo1430j2.f14924a;
/* 274 */           if (hashSet2 != null && c2051ozMo1430j2.f14926c) {
/* 288 */               for (C2051oz c2051oz8 : hashSet2) {
/* 296 */                   C2569zz c2569zz3 = c2051oz8.f14927d;
/* 298 */                   int i3 = i + 1;
/* 300 */                   boolean zM10212d2 = m10212d(c2569zz3);
/* 304 */                   C2051oz c2051oz9 = c2569zz3.f20405K;
/* 306 */                   C2051oz c2051oz10 = c2569zz3.f20407M;
/* 312 */                   if (c2569zz3.m10455A() && zM10212d2) {
/* 321 */                       a00.m2W(c2569zz3, interfaceC2462xi, new C2332wi());
                            }
/* 347 */                   boolean z4 = (c2051oz8 == c2051oz9 && (c2051oz2 = c2051oz10.f14929f) != null && c2051oz2.f14926c) || (c2051oz8 == c2051oz10 && (c2051oz = c2051oz9.f14929f) != null && c2051oz.f14926c);
/* 350 */                   EnumC2516yz enumC2516yz3 = c2569zz3.f20415U[1];
/* 352 */                   if (enumC2516yz3 != enumC2516yz || zM10212d2) {
/* 407 */                       if (!c2569zz3.m10455A()) {
/* 410 */                           if (c2051oz8 == c2051oz9 && c2051oz10.f14929f == null) {
/* 420 */                               int iM7247e3 = c2051oz9.m7247e() + iM7246d2;
/* 426 */                               c2569zz3.m10460L(iM7247e3, c2569zz3.m10472l() + iM7247e3);
/* 429 */                               m10207N(i3, interfaceC2462xi, c2569zz3);
                                    } else if (c2051oz8 == c2051oz10 && c2051oz9.f14929f == null) {
/* 444 */                               int iM7247e4 = iM7246d2 - c2051oz10.m7247e();
/* 452 */                               c2569zz3.m10460L(iM7247e4 - c2569zz3.m10472l(), iM7247e4);
/* 455 */                               m10207N(i3, interfaceC2462xi, c2569zz3);
                                    } else if (z4 && !c2569zz3.m10483z()) {
/* 468 */                               m10202I(i3, interfaceC2462xi, c2569zz3);
                                    }
                                }
                            } else if (enumC2516yz3 == enumC2516yz && c2569zz3.f20465y >= 0 && c2569zz3.f20464x >= 0 && (c2569zz3.f20438i0 == 8 || (c2569zz3.f20457s == 0 && c2569zz3.f20419Y == 0.0f))) {
/* 385 */                       if (!c2569zz3.m10483z() && !c2569zz3.f20401G && z4 && !c2569zz3.m10483z()) {
/* 399 */                           m10203J(i3, c2569zz, interfaceC2462xi, c2569zz3);
                                }
                            }
                        }
                    }
/* 474 */           C2051oz c2051ozMo1430j3 = c2569zz.mo1430j(6);
/* 480 */           if (c2051ozMo1430j3.f14924a != null && c2051ozMo1430j3.f14926c) {
/* 486 */               int iM7246d3 = c2051ozMo1430j3.m7246d();
/* 500 */               for (C2051oz c2051oz11 : c2051ozMo1430j3.f14924a) {
/* 508 */                   C2569zz c2569zz4 = c2051oz11.f14927d;
/* 510 */                   int i4 = i + 1;
/* 512 */                   boolean zM10212d3 = m10212d(c2569zz4);
/* 516 */                   C2051oz c2051oz12 = c2569zz4.f20408N;
/* 522 */                   if (c2569zz4.m10455A() && zM10212d3) {
/* 531 */                       a00.m2W(c2569zz4, interfaceC2462xi, new C2332wi());
                            }
/* 538 */                   if (c2569zz4.f20415U[z3 ? 1 : 0] != enumC2516yz || zM10212d3) {
/* 550 */                       if (!c2569zz4.m10455A()) {
/* 553 */                           if (c2051oz11 == c2051oz12) {
/* 559 */                               int iM7247e5 = c2051oz11.m7247e() + iM7246d3;
/* 562 */                               if (c2569zz4.f20399E) {
/* 569 */                                   int i5 = iM7247e5 - c2569zz4.f20426c0;
/* 573 */                                   int i6 = c2569zz4.f20418X + i5;
/* 574 */                                   c2569zz4.f20424b0 = i5;
/* 578 */                                   c2569zz4.f20405K.m7254l(i5);
/* 583 */                                   c2569zz4.f20407M.m7254l(i6);
/* 586 */                                   c2051oz12.m7254l(iM7247e5);
/* 589 */                                   z = z3 ? 1 : 0;
/* 591 */                                   c2569zz4.f20443l = z;
                                        } else {
/* 564 */                                   z = z3 ? 1 : 0;
                                        }
/* 593 */                               m10207N(i4, interfaceC2462xi, c2569zz4);
                                    }
/* 596 */                           z3 = z;
                                }
                            }
/* 543 */                   z = z3 ? 1 : 0;
/* 596 */                   z3 = z;
                        }
                    }
/* 601 */           c2569zz.f20447n = z3;
                }

                /* JADX INFO: renamed from: O */
                public static String m10208O(Context context) {
                    try {
/* 7 */                 return context.getResources().getResourcePackageName(R$string.common_google_play_services_unknown_issue);
                    } catch (Resources.NotFoundException unused) {
/* 12 */                return context.getPackageName();
                    }
                }

                /* JADX WARN: Code duplicated, block: B:27:0x0069  */
                /* JADX WARN: Code duplicated, block: B:37:0x008f  */
                /* JADX WARN: Code duplicated, block: B:39:0x0092  */
                /* JADX WARN: Code duplicated, block: B:43:0x0091 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0063->B:45:?, LOOP_END, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0080 -> B:25:0x0063). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0083 -> B:25:0x0063). Please report as a decompilation issue!!! */
                /* JADX INFO: renamed from: a */
                public static final Object m10209a(List list, k40 k40Var, d10 d10Var) throws Throwable {
                    e40 e40Var;
                    List list2;
                    h22 h22Var;
                    Iterator it;
                    Throwable th;
                    Function1 function1;
/* 3 */             if (d10Var instanceof e40) {
/* 6 */                 e40Var = (e40) d10Var;
/* 8 */                 int i = e40Var.f7503d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    e40Var.f7503d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    e40Var = new e40(d10Var);
                        }
                    } else {
/* 22 */                e40Var = new e40(d10Var);
                    }
/* 25 */            Object obj = e40Var.f7502c;
/* 27 */            Object obj2 = z10.f19902a;
/* 29 */            int i2 = e40Var.f7503d;
/* 34 */            if (i2 != 0) {
/* 36 */                if (i2 == 1) {
/* 60 */                    list2 = (List) e40Var.f7500a;
/* 62 */                    pg3.m7417A(obj);
                        } else {
/* 38 */                    if (i2 != 2) {
/* 54 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                        return null;
                            }
/* 40 */                    it = e40Var.f7501b;
/* 44 */                    h22Var = (h22) e40Var.f7500a;
                            try {
/* 46 */                        pg3.m7417A(obj);
                            } catch (Throwable th2) {
/* 125 */                       Object obj3 = h22Var.f8873a;
/* 127 */                       if (obj3 == null) {
/* 129 */                           h22Var.f8873a = th2;
                                } else {
/* 134 */                           jf0.m5798a((Throwable) obj3, th2);
                                }
                            }
                        }
/* 104 */               while (it.hasNext()) {
/* 110 */                   function1 = (Function1) it.next();
/* 112 */                   e40Var.f7500a = h22Var;
/* 114 */                   e40Var.f7501b = it;
/* 116 */                   e40Var.f7503d = 2;
/* 122 */                   if (function1.invoke(e40Var) == obj2) {
/* 146 */                       return obj2;
                            }
                        }
/* 140 */               th = (Throwable) h22Var.f8873a;
/* 142 */               if (th == null) {
/* 144 */                   return Unit.f12910a;
                        }
/* 147 */               throw th;
                    }
/* 66 */            pg3.m7417A(obj);
/* 71 */            ArrayList arrayList = new ArrayList();
/* 76 */            g40 g40Var = new g40(list, arrayList, null);
/* 79 */            e40Var.f7500a = arrayList;
/* 81 */            e40Var.f7503d = 1;
/* 87 */            if (k40Var.m5947a(g40Var, e40Var) == obj2) {
/* 146 */               return obj2;
                    }
/* 90 */            list2 = arrayList;
/* 93 */            h22Var = new h22();
/* 96 */            it = list2.iterator();
/* 104 */           while (it.hasNext()) {
/* 110 */               function1 = (Function1) it.next();
/* 112 */               e40Var.f7500a = h22Var;
/* 114 */               e40Var.f7501b = it;
/* 116 */               e40Var.f7503d = 2;
/* 122 */               if (function1.invoke(e40Var) == obj2) {
/* 146 */                   return obj2;
                        }
                    }
/* 140 */           th = (Throwable) h22Var.f8873a;
/* 142 */           if (th == null) {
/* 144 */               return Unit.f12910a;
                    }
/* 147 */           throw th;
                }

                /* JADX INFO: renamed from: b */
                public static String m10210b(int i, int i2, String str) {
/* 1 */             if (i < 0) {
/* 13 */                return i13.m4444x("%s (%s) must not be negative", str, Integer.valueOf(i));
                    }
/* 18 */            if (i2 >= 0) {
/* 34 */                return i13.m4444x("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
                    }
/* 43 */            ds0.m3189f(26, "negative size: ", i2);
/* 46 */            return null;
                }

                /* JADX INFO: renamed from: c */
                public static C1837kn m10211c(HashMap map) {
/* 3 */             Object obj = map.get("firstEventId");
/* 10 */            if (obj instanceof String) {
/* 15 */                Object obj2 = map.get("firstEventTimestamp");
/* 21 */                if (obj2 instanceof String) {
/* 26 */                    Object obj3 = map.get("sessionId");
/* 32 */                    if (obj3 instanceof String) {
/* 37 */                        Object obj4 = map.get("previousSessionId");
/* 43 */                        if (!(obj4 instanceof String)) {
/* 45 */                            obj4 = null;
                                }
/* 54 */                        String str = obj4 instanceof String ? (String) obj4 : null;
/* 57 */                        Object obj5 = map.get("sessionIndex");
/* 63 */                        if (obj5 instanceof Integer) {
/* 68 */                            Object obj6 = map.get("userId");
/* 74 */                            if (obj6 instanceof String) {
/* 79 */                                Object obj7 = map.get("storageMechanism");
/* 85 */                                if (obj7 instanceof String) {
/* 112 */                                   return new C1837kn((String) obj, (String) obj2, (String) obj3, str, ((Number) obj5).intValue(), (String) obj6, (String) obj7);
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 9 */             return null;
                }

                /* JADX INFO: renamed from: d */
                public static boolean m10212d(C2569zz c2569zz) {
/* 1 */             EnumC2516yz[] enumC2516yzArr = c2569zz.f20415U;
/* 4 */             EnumC2516yz enumC2516yz = enumC2516yzArr[0];
/* 7 */             EnumC2516yz enumC2516yz2 = enumC2516yzArr[1];
/* 9 */             C2569zz c2569zz2 = c2569zz.f20416V;
/* 16 */            a00 a00Var = c2569zz2 != null ? (a00) c2569zz2 : null;
/* 17 */            EnumC2516yz enumC2516yz3 = EnumC2516yz.f19865a;
/* 19 */            if (a00Var != null) {
/* 23 */                EnumC2516yz enumC2516yz4 = a00Var.f20415U[0];
                    }
/* 25 */            if (a00Var != null) {
/* 29 */                EnumC2516yz enumC2516yz5 = a00Var.f20415U[1];
                    }
/* 31 */            EnumC2516yz enumC2516yz6 = EnumC2516yz.f19867c;
/* 33 */            EnumC2516yz enumC2516yz7 = EnumC2516yz.f19866b;
/* 83 */            boolean z = enumC2516yz == enumC2516yz3 || c2569zz.mo1422B() || enumC2516yz == enumC2516yz7 || (enumC2516yz == enumC2516yz6 && c2569zz.f20455r == 0 && c2569zz.f20419Y == 0.0f && c2569zz.m10478u(0)) || (enumC2516yz == enumC2516yz6 && c2569zz.f20455r == 1 && c2569zz.m10479v(0, c2569zz.m10475r()));
/* 131 */           boolean z2 = enumC2516yz2 == enumC2516yz3 || c2569zz.mo1423C() || enumC2516yz2 == enumC2516yz7 || (enumC2516yz2 == enumC2516yz6 && c2569zz.f20457s == 0 && c2569zz.f20419Y == 0.0f && c2569zz.m10478u(1)) || (enumC2516yz2 == enumC2516yz6 && c2569zz.f20457s == 1 && c2569zz.m10479v(1, c2569zz.m10472l()));
                    return (c2569zz.f20419Y > 0.0f && (z || z2)) || (z && z2);
                }

                /* JADX INFO: renamed from: h */
                public static void m10213h(Context context) {
/* 3 */             if (f19861d == null) {
/* 7 */                 g63 g63Var = new g63(context);
/* 10 */                f19861d = g63Var;
                        synchronized (g63Var.f8491a) {
/* 16 */                    g63Var.f8497g = true;
                        }
                    }
                }

                /* JADX INFO: renamed from: i */
                public static void m10214i(int i, int i2) {
                    String strM4444x;
/* 1 */             if (i < 0 || i >= i2) {
/* 11 */                if (i < 0) {
/* 52 */                    strM4444x = i13.m4444x("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
                        } else {
/* 13 */                    if (i2 < 0) {
/* 19 */                        ds0.m3189f(26, "negative size: ", i2);
/* 22 */                        return;
                            }
/* 37 */                    strM4444x = i13.m4444x("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
                        }
/* 59 */                throw new IndexOutOfBoundsException(strM4444x);
                    }
                }

                /* JADX INFO: renamed from: j */
                public static void m10215j(int i, int i2) {
/* 1 */             if (i < 0 || i > i2) {
/* 12 */                s80.m8425f(m10210b(i, i2, FirebaseAnalytics.Param.INDEX));
                    }
                }

                /* JADX INFO: renamed from: k */
                public static void m10216k(int i, int i2, int i3) {
                    String strM10210b;
/* 1 */             if (i < 0 || i2 < i || i2 > i3) {
/* 11 */                if (i < 0 || i > i3) {
/* 48 */                    strM10210b = m10210b(i, i3, "start index");
                        } else {
/* 41 */                    strM10210b = (i2 < 0 || i2 > i3) ? m10210b(i2, i3, "end index") : i13.m4444x("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
                        }
/* 55 */                throw new IndexOutOfBoundsException(strM10210b);
                    }
                }

                /* JADX INFO: renamed from: l */
                public static void m10217l(Intent intent) {
                    synchronized (f19860c) {
                        try {
/* 6 */                     if (f19861d != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
/* 19 */                        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
/* 24 */                        f19861d.m3880c();
                            }
                        } catch (Throwable th) {
/* 33 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: m */
                public static void m10218m(String str) {
/* 3 */             File file = new File(str);
/* 10 */            if (file.exists()) {
/* 13 */                File[] fileArrListFiles = file.listFiles();
/* 17 */                if (fileArrListFiles == null || fileArrListFiles.length == 0) {
/* 52 */                    file.delete();
/* 55 */                    return;
                        }
/* 25 */                for (File file2 : fileArrListFiles) {
/* 33 */                    if (file2.isDirectory()) {
/* 39 */                        m10218m(file2.getAbsolutePath());
                            }
/* 42 */                    file2.delete();
                        }
/* 48 */                file.delete();
                    }
                }

                /* JADX INFO: renamed from: n */
                public static final float m10219n(float f, Context context) {
/* 1 */             context.getClass();
/* 14 */            return f * context.getResources().getDisplayMetrics().density;
                }

                /* JADX INFO: renamed from: o */
                public static final int m10220o(Context context, int i) {
/* 1 */             context.getClass();
/* 9 */             return (int) m10219n(i, context);
                }

                /* JADX INFO: renamed from: p */
                public static final Collection m10221p(List list) {
/* 6 */             if (list.isEmpty()) {
/* 8 */                 return null;
                    }
/* 9 */             return list;
                }

                /* JADX INFO: renamed from: q */
                public static String m10222q(AbstractC2298vl abstractC2298vl) {
/* 7 */             StringBuilder sb = new StringBuilder(abstractC2298vl.size());
/* 15 */            for (int i = 0; i < abstractC2298vl.size(); i++) {
/* 17 */                byte bMo8194a = abstractC2298vl.mo8194a(i);
/* 23 */                if (bMo8194a == 34) {
/* 137 */                   sb.append("\\\"");
                        } else if (bMo8194a == 39) {
/* 131 */                   sb.append("\\'");
                        } else if (bMo8194a != 92) {
                            switch (bMo8194a) {
                                case 7:
/* 119 */                           sb.append("\\a");
                                    break;
                                case 8:
/* 113 */                           sb.append("\\b");
                                    break;
                                case 9:
/* 107 */                           sb.append("\\t");
                                    break;
                                case 10:
/* 101 */                           sb.append("\\n");
                                    break;
                                case 11:
/* 95 */                            sb.append("\\v");
                                    break;
                                case 12:
/* 89 */                            sb.append("\\f");
                                    break;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 83 */                            sb.append("\\r");
                                    break;
                                default:
/* 38 */                            if (bMo8194a < 32 || bMo8194a > 126) {
/* 49 */                                sb.append('\\');
/* 59 */                                sb.append((char) (((bMo8194a >>> 6) & 3) + 48));
/* 69 */                                sb.append((char) (((bMo8194a >>> 3) & 7) + 48));
/* 77 */                                sb.append((char) ((bMo8194a & 7) + 48));
                                    } else {
/* 45 */                                sb.append((char) bMo8194a);
                                    }
                                    break;
                            }
                        } else {
/* 125 */                   sb.append("\\\\");
                        }
                    }
/* 144 */           return sb.toString();
                }

                /* JADX INFO: renamed from: r */
                public static final ArrayList m10223r(Iterable iterable) {
/* 1 */             iterable.getClass();
/* 6 */             ArrayList arrayList = new ArrayList();
/* 9 */             Iterator it = iterable.iterator();
/* 17 */            while (it.hasNext()) {
/* 23 */                CharSequence charSequence = (CharSequence) it.next();
/* 29 */                if (!StringsKt.m6228D(charSequence)) {
/* 31 */                    arrayList.add(charSequence);
                        }
                    }
/* 35 */            return arrayList;
                }

                /* JADX INFO: renamed from: s */
                public static final Class m10224s(o21 o21Var) {
/* 1 */             o21Var.getClass();
/* 6 */             Class clsMo1447a = ((InterfaceC0194bv) o21Var).mo1447a();
/* 10 */            clsMo1447a.getClass();
/* 13 */            return clsMo1447a;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX INFO: renamed from: t */
                public static final Class m10225t(o21 o21Var) {
/* 1 */             o21Var.getClass();
/* 6 */             Class clsMo1447a = ((InterfaceC0194bv) o21Var).mo1447a();
/* 14 */            if (clsMo1447a.isPrimitive()) {
/* 18 */                String name = clsMo1447a.getName();
                        switch (name.hashCode()) {
                            case -1325958191:
/* 133 */                       if (name.equals("double")) {
/* 136 */                           return Double.class;
                                }
                                break;
                            case 104431:
/* 121 */                       if (name.equals("int")) {
/* 124 */                           return Integer.class;
                                }
                                break;
                            case 3039496:
/* 109 */                       if (name.equals("byte")) {
/* 112 */                           return Byte.class;
                                }
                                break;
                            case 3052374:
/* 97 */                        if (name.equals("char")) {
/* 100 */                           return Character.class;
                                }
                                break;
                            case 3327612:
/* 85 */                        if (name.equals("long")) {
/* 88 */                            return Long.class;
                                }
                                break;
                            case 3625364:
/* 73 */                        if (name.equals("void")) {
/* 76 */                            return Void.class;
                                }
                                break;
                            case 64711720:
/* 61 */                        if (name.equals("boolean")) {
/* 64 */                            return Boolean.class;
                                }
                                break;
                            case 97526364:
/* 49 */                        if (name.equals("float")) {
/* 52 */                            return Float.class;
                                }
                                break;
                            case 109413500:
/* 37 */                        if (name.equals("short")) {
/* 40 */                            return Short.class;
                                }
                                break;
                        }
                    }
/* 135 */           return clsMo1447a;
                }

                /* JADX INFO: renamed from: v */
                public static void m10226v(int i, InterfaceC2462xi interfaceC2462xi, C2569zz c2569zz, boolean z) {
                    C2051oz c2051oz;
                    C2051oz c2051oz2;
                    boolean z2;
                    C2051oz c2051oz3;
                    C2051oz c2051oz4;
/* 9 */             if (c2569zz.f20445m) {
/* 282 */               return;
                    }
/* 15 */            if (!(c2569zz instanceof a00) && c2569zz.m10455A() && m10212d(c2569zz)) {
/* 34 */                a00.m2W(c2569zz, interfaceC2462xi, new C2332wi());
                    }
/* 38 */            C2051oz c2051ozMo1430j = c2569zz.mo1430j(2);
/* 43 */            C2051oz c2051ozMo1430j2 = c2569zz.mo1430j(4);
/* 47 */            int iM7246d = c2051ozMo1430j.m7246d();
/* 51 */            int iM7246d2 = c2051ozMo1430j2.m7246d();
/* 55 */            HashSet<C2051oz> hashSet = c2051ozMo1430j.f14924a;
/* 57 */            EnumC2516yz enumC2516yz = EnumC2516yz.f19867c;
/* 59 */            if (hashSet != null && c2051ozMo1430j.f14926c) {
/* 73 */                for (C2051oz c2051oz5 : hashSet) {
/* 81 */                    C2569zz c2569zz2 = c2051oz5.f14927d;
/* 83 */                    int i2 = i + 1;
/* 85 */                    boolean zM10212d = m10212d(c2569zz2);
/* 91 */                    C2051oz c2051oz6 = c2569zz2.f20404J;
/* 95 */                    C2051oz c2051oz7 = c2569zz2.f20406L;
/* 101 */                   if (c2569zz2.m10455A() && zM10212d) {
/* 105 */                       z2 = true;
/* 112 */                       a00.m2W(c2569zz2, interfaceC2462xi, new C2332wi());
                            } else {
/* 116 */                       z2 = true;
                            }
/* 141 */                   boolean z3 = ((c2051oz5 == c2051oz6 && (c2051oz4 = c2051oz7.f14929f) != null && c2051oz4.f14926c) || (c2051oz5 == c2051oz7 && (c2051oz3 = c2051oz6.f14929f) != null && c2051oz3.f14926c)) ? z2 : false;
/* 145 */                   EnumC2516yz enumC2516yz2 = c2569zz2.f20415U[0];
/* 147 */                   if (enumC2516yz2 != enumC2516yz || zM10212d) {
/* 205 */                       if (!c2569zz2.m10455A()) {
/* 209 */                           if (c2051oz5 == c2051oz6 && c2051oz7.f14929f == null) {
/* 219 */                               int iM7247e = c2051oz6.m7247e() + iM7246d;
/* 225 */                               c2569zz2.m10459K(iM7247e, c2569zz2.m10475r() + iM7247e);
/* 228 */                               m10226v(i2, interfaceC2462xi, c2569zz2, z);
                                    } else if (c2051oz5 == c2051oz7 && c2051oz6.f14929f == null) {
/* 243 */                               int iM7247e2 = iM7246d - c2051oz7.m7247e();
/* 251 */                               c2569zz2.m10459K(iM7247e2 - c2569zz2.m10475r(), iM7247e2);
/* 254 */                               m10226v(i2, interfaceC2462xi, c2569zz2, z);
                                    } else if (z3 && !c2569zz2.m10482y()) {
/* 267 */                               m10200G(i2, interfaceC2462xi, c2569zz2, z);
                                    }
                                }
                            } else if (enumC2516yz2 == enumC2516yz && c2569zz2.f20462v >= 0 && c2569zz2.f20461u >= 0 && (c2569zz2.f20438i0 == 8 || (c2569zz2.f20455r == 0 && c2569zz2.f20419Y == 0.0f))) {
/* 182 */                       if (!c2569zz2.m10482y() && !c2569zz2.f20401G && z3 && !c2569zz2.m10482y()) {
/* 196 */                           m10201H(i2, c2569zz, interfaceC2462xi, c2569zz2, z);
                                }
                            }
                        }
                    }
/* 280 */           if (c2569zz instanceof bs0) {
/* 282 */               return;
                    }
/* 283 */           HashSet<C2051oz> hashSet2 = c2051ozMo1430j2.f14924a;
/* 285 */           if (hashSet2 != null && c2051ozMo1430j2.f14926c) {
/* 299 */               for (C2051oz c2051oz8 : hashSet2) {
/* 307 */                   C2569zz c2569zz3 = c2051oz8.f14927d;
/* 309 */                   int i3 = i + 1;
/* 311 */                   boolean zM10212d2 = m10212d(c2569zz3);
/* 315 */                   C2051oz c2051oz9 = c2569zz3.f20404J;
/* 317 */                   C2051oz c2051oz10 = c2569zz3.f20406L;
/* 323 */                   if (c2569zz3.m10455A() && zM10212d2) {
/* 332 */                       a00.m2W(c2569zz3, interfaceC2462xi, new C2332wi());
                            }
/* 358 */                   boolean z4 = (c2051oz8 == c2051oz9 && (c2051oz2 = c2051oz10.f14929f) != null && c2051oz2.f14926c) || (c2051oz8 == c2051oz10 && (c2051oz = c2051oz9.f14929f) != null && c2051oz.f14926c);
/* 362 */                   EnumC2516yz enumC2516yz3 = c2569zz3.f20415U[0];
/* 364 */                   if (enumC2516yz3 != enumC2516yz || zM10212d2) {
/* 426 */                       if (!c2569zz3.m10455A()) {
/* 430 */                           if (c2051oz8 == c2051oz9 && c2051oz10.f14929f == null) {
/* 440 */                               int iM7247e3 = c2051oz9.m7247e() + iM7246d2;
/* 446 */                               c2569zz3.m10459K(iM7247e3, c2569zz3.m10475r() + iM7247e3);
/* 449 */                               m10226v(i3, interfaceC2462xi, c2569zz3, z);
                                    } else if (c2051oz8 == c2051oz10 && c2051oz9.f14929f == null) {
/* 464 */                               int iM7247e4 = iM7246d2 - c2051oz10.m7247e();
/* 472 */                               c2569zz3.m10459K(iM7247e4 - c2569zz3.m10475r(), iM7247e4);
/* 475 */                               m10226v(i3, interfaceC2462xi, c2569zz3, z);
                                    } else if (z4 && !c2569zz3.m10482y()) {
/* 488 */                               m10200G(i3, interfaceC2462xi, c2569zz3, z);
                                    }
                                }
                            } else if (enumC2516yz3 == enumC2516yz && c2569zz3.f20462v >= 0 && c2569zz3.f20461u >= 0) {
/* 385 */                       if (c2569zz3.f20438i0 == 8 || (c2569zz3.f20455r == 0 && c2569zz3.f20419Y == 0.0f)) {
/* 401 */                           if (!c2569zz3.m10482y() && !c2569zz3.f20401G && z4 && !c2569zz3.m10482y()) {
/* 415 */                               m10201H(i3, c2569zz, interfaceC2462xi, c2569zz3, z);
                                    }
                                }
                            }
                        }
                    }
/* 495 */           c2569zz.f20445m = true;
                }

                /* JADX INFO: renamed from: w */
                public static boolean m10227w(C0816cq c0816cq, String str) throws ux0 {
/* 10 */            if ("robolectric".equals(Build.FINGERPRINT)) {
/* 9 */                 return true;
                    }
                    try {
/* 23 */                int[] iArr = (int[]) c0816cq.m2831b(str).m3981a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
/* 26 */                if (iArr != null) {
/* 30 */                    for (int i : iArr) {
/* 34 */                        if (i == 0) {
/* 9 */                             return true;
                                }
                            }
                        }
/* 25 */                return false;
                    } catch (C1897lo e) {
/* 52 */                throw new ux0(new C1936mq(e));
                    }
                }

                /* JADX INFO: renamed from: x */
                public static boolean m10228x(Context context, int i) {
/* 8 */             if (m10205L(context, "com.google.android.gms", i)) {
                        try {
/* 17 */                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
/* 21 */                    as0 as0VarM1153b = as0.m1153b(context);
/* 25 */                    as0VarM1153b.getClass();
/* 28 */                    if (packageInfo != null) {
/* 36 */                        if (!as0.m1154e(packageInfo, false)) {
/* 43 */                            if (as0.m1154e(packageInfo, true)) {
/* 53 */                                if (!wr0.m9606a((Context) as0VarM1153b.f2073a)) {
/* 60 */                                    AbstractC1245n0.m4889q("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                                        }
                                    }
                                }
/* 35 */                        return true;
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
/* 7 */             return false;
                }

                /* JADX INFO: renamed from: F */
                public void mo7103F(View view, float f) {
/* 3 */             if (f19864g) {
                        try {
/* 1 */                     view.setTransitionAlpha(f);
/* 8 */                     return;
                        } catch (NoSuchMethodError unused) {
/* 10 */                    f19864g = false;
                        }
                    }
/* 12 */            view.setAlpha(f);
                }

                /* JADX INFO: renamed from: e */
                public abstract boolean mo4409e(AbstractC1873l0 abstractC1873l0, C0974h0 c0974h0, C0974h0 c0974h1);

                /* JADX INFO: renamed from: f */
                public abstract boolean mo4410f(AbstractC1873l0 abstractC1873l0, Object obj, Object obj2);

                /* JADX INFO: renamed from: g */
                public abstract boolean mo4411g(AbstractC1873l0 abstractC1873l0, C1813k0 c1813k0, C1813k0 c1813k1);

                /* JADX INFO: renamed from: u */
                public float mo7104u(View view) {
/* 3 */             if (f19864g) {
                        try {
/* 1 */                     return view.getTransitionAlpha();
                        } catch (NoSuchMethodError unused) {
/* 11 */                    f19864g = false;
                        }
                    }
/* 13 */            return view.getAlpha();
                }

                /* JADX INFO: renamed from: y */
                public abstract void mo4412y(C1813k0 c1813k0, C1813k0 c1813k1);

                /* JADX INFO: renamed from: z */
                public abstract void mo4413z(C1813k0 c1813k0, Thread thread);
            }
