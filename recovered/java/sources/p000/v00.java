            package p000;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.content.res.ColorStateList;
            import android.content.res.Configuration;
            import android.content.res.Resources;
            import android.graphics.drawable.Drawable;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Process;
            import android.text.TextUtils;
            import android.util.SparseArray;
            import android.util.TypedValue;
            import android.view.Display;
            import android.view.WindowManager;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.File;
            import java.util.WeakHashMap;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     public abstract class v00 {
                private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
                public static final int RECEIVER_EXPORTED = 2;
                public static final int RECEIVER_NOT_EXPORTED = 4;
                public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
                private static final String TAG = "ContextCompat";
                private static final Object sSync = new Object();

                public static int checkSelfPermission(Context context, String str) {
/* 2 */             if (str == null) {
/* 49 */                C1951n4.m6868s("permission must be non-null");
/* 1 */                 return 0;
                    }
/* 8 */             if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
/* 42 */                return context.checkPermission(str, Process.myPid(), Process.myUid());
                    }
                    return zo1.m10416a(new ap1(context).f2052a) ? 0 : -1;
                }

                public static Context createAttributionContext(Context context, String str) {
                    return Build.VERSION.SDK_INT >= 30 ? t00.m8668a(context, str) : context;
                }

                public static Context createDeviceProtectedStorageContext(Context context) {
/* 1 */             return q00.m7672a(context);
                }

                public static String getAttributionTag(Context context) {
/* 5 */             if (Build.VERSION.SDK_INT >= 30) {
/* 7 */                 return t00.m8669b(context);
                    }
/* 12 */            return null;
                }

                public static File getCodeCacheDir(Context context) {
/* 1 */             return o00.m7084a(context);
                }

                public static int getColor(Context context, int i) {
/* 1 */             return p00.m7286a(context, i);
                }

                public static ColorStateList getColorStateList(Context context, int i) {
                    ColorStateList colorStateListM1176a;
                    ColorStateList colorStateList;
                    a42 a42Var;
/* 1 */             Resources resources = context.getResources();
/* 5 */             Resources.Theme theme = context.getTheme();
/* 11 */            b42 b42Var = new b42(resources, theme);
                    synchronized (d42.f6980c) {
                        try {
/* 23 */                    SparseArray sparseArray = (SparseArray) d42.f6979b.get(b42Var);
/* 25 */                    colorStateListM1176a = null;
/* 26 */                    if (sparseArray == null || sparseArray.size() <= 0 || (a42Var = (a42) sparseArray.get(i)) == null) {
/* 82 */                        colorStateList = null;
                            } else {
/* 52 */                        if (a42Var.f80b.equals(resources.getConfiguration())) {
/* 54 */                            if (theme != null || a42Var.f81c != 0) {
/* 64 */                                if (theme == null || a42Var.f81c != theme.hashCode()) {
                                        }
                                    }
/* 74 */                            colorStateList = a42Var.f79a;
                                }
/* 78 */                        sparseArray.remove(i);
/* 82 */                        colorStateList = null;
                            }
                        } catch (Throwable th) {
/* 186 */                   throw th;
                        }
                    }
/* 83 */            if (colorStateList != null) {
/* 85 */                return colorStateList;
                    }
/* 86 */            ThreadLocal threadLocal = d42.f6978a;
/* 92 */            TypedValue typedValue = (TypedValue) threadLocal.get();
/* 94 */            if (typedValue == null) {
/* 98 */                typedValue = new TypedValue();
/* 101 */               threadLocal.set(typedValue);
                    }
/* 105 */           resources.getValue(i, typedValue, true);
/* 108 */           int i2 = typedValue.type;
/* 112 */           if (i2 < 28 || i2 > 31) {
                        try {
/* 123 */                   colorStateListM1176a = AbstractC0159ax.m1176a(resources, resources.getXml(i), theme);
                        } catch (Exception e) {
/* 133 */                   AbstractC1245n0.m4891s("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
                        }
                    }
/* 136 */           if (colorStateListM1176a == null) {
/* 180 */               return z32.m10275b(resources, i, theme);
                    }
                    synchronized (d42.f6980c) {
                        try {
/* 141 */                   WeakHashMap weakHashMap = d42.f6979b;
/* 147 */                   SparseArray sparseArray2 = (SparseArray) weakHashMap.get(b42Var);
/* 149 */                   if (sparseArray2 == null) {
/* 153 */                       sparseArray2 = new SparseArray();
/* 156 */                       weakHashMap.put(b42Var, sparseArray2);
                            }
/* 173 */                   sparseArray2.append(i, new a42(colorStateListM1176a, b42Var.f2208a.getConfiguration(), theme));
                        } catch (Throwable th2) {
/* 179 */                   throw th2;
                        }
                    }
/* 184 */           return colorStateListM1176a;
                }

                public static Context getContextForLanguage(Context context) {
                    h91 h91VarM4135a;
/* 1 */             int i = Build.VERSION.SDK_INT;
/* 5 */             if (i >= 33) {
/* 9 */                 Object systemService = context.getSystemService("locale");
/* 30 */                h91VarM4135a = systemService != null ? new h91(new i91(j91.m5726a(systemService))) : h91.f8972b;
                    } else {
/* 37 */                h91VarM4135a = h91.m4135a(w11.m9393C(context));
                    }
/* 43 */            if (i > 32 || h91VarM4135a.f8973a.f9500a.isEmpty()) {
/* 75 */                return context;
                    }
/* 65 */            Configuration configuration = new Configuration(context.getResources().getConfiguration());
/* 68 */            AbstractC2311vy.m9354b(configuration, h91VarM4135a);
/* 71 */            return context.createConfigurationContext(configuration);
                }

                public static File getDataDir(Context context) {
/* 1 */             return q00.m7673b(context);
                }

                public static Display getDisplayOrDefault(Context context) {
                    return Build.VERSION.SDK_INT >= 30 ? t00.m8670c(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                }

                public static Drawable getDrawable(Context context, int i) {
/* 1 */             return o00.m7085b(context, i);
                }

                public static File[] getExternalCacheDirs(Context context) {
/* 1 */             return context.getExternalCacheDirs();
                }

                public static File[] getExternalFilesDirs(Context context, String str) {
/* 1 */             return context.getExternalFilesDirs(str);
                }

                public static Executor getMainExecutor(Context context) {
                    return Build.VERSION.SDK_INT >= 28 ? s00.m8340a(context) : new ku0(new Handler(context.getMainLooper()), 1);
                }

                public static File getNoBackupFilesDir(Context context) {
/* 1 */             return o00.m7086c(context);
                }

                public static File[] getObbDirs(Context context) {
/* 1 */             return context.getObbDirs();
                }

                public static String getString(Context context, int i) {
/* 5 */             return getContextForLanguage(context).getString(i);
                }

                public static <T> T getSystemService(Context context, Class<T> cls) {
/* 1 */             return (T) p00.m7287b(context, cls);
                }

                public static String getSystemServiceName(Context context, Class<?> cls) {
/* 1 */             return p00.m7288c(context, cls);
                }

                public static boolean isDeviceProtectedStorage(Context context) {
/* 1 */             return q00.m7674c(context);
                }

                public static String obtainAndCheckReceiverPermission(Context context) {
/* 18 */            String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
/* 26 */            if (qj3.m7891b(context, str) == 0) {
/* 28 */                return str;
                    }
/* 37 */            f42.m3663s(fm0.m3784j("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
/* 40 */            return null;
                }

                public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
/* 1 */             int i2 = i & 1;
/* 3 */             if (i2 != 0 && (i & 4) != 0) {
/* 12 */                C1951n4.m6859j("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
/* 15 */                return null;
                    }
/* 17 */            if (i2 != 0) {
/* 19 */                i |= 2;
                    }
/* 21 */            int i3 = i;
/* 22 */            int i4 = i3 & 2;
/* 24 */            if (i4 == 0 && (i3 & 4) == 0) {
/* 33 */                C1951n4.m6859j("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
/* 36 */                return null;
                    }
/* 38 */            if (i4 != 0 && (i3 & 4) != 0) {
/* 47 */                C1951n4.m6859j("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
/* 50 */                return null;
                    }
/* 52 */            int i5 = Build.VERSION.SDK_INT;
/* 56 */            if (i5 >= 33) {
/* 63 */                return u00.m8931a(context, broadcastReceiver, intentFilter, str, handler, i3);
                    }
/* 75 */            if (i5 >= 26) {
/* 77 */                return r00.m8035a(context, broadcastReceiver, intentFilter, str, handler, i3);
                    }
                    return ((i3 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
                }

                public static boolean startActivities(Context context, Intent[] intentArr) {
/* 2 */             return startActivities(context, intentArr, null);
                }

                public static void startActivity(Context context, Intent intent, Bundle bundle) {
/* 1 */             context.startActivity(intent, bundle);
                }

                public static void startForegroundService(Context context, Intent intent) {
/* 5 */             if (Build.VERSION.SDK_INT >= 26) {
/* 7 */                 r00.m8036b(context, intent);
                    } else {
/* 11 */                context.startService(intent);
                    }
                }

/* 6 */         public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
/* 7 */             context.startActivities(intentArr, bundle);
                    return true;
                }

/* 101 */       public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
/* 102 */           return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i);
                }
            }
