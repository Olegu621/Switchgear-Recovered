            package com.supercell.titan;

            import android.app.ActivityManager;
            import android.content.ActivityNotFoundException;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Debug;
            import android.provider.Settings;
            import android.util.DisplayMetrics;
            import androidx.core.app.NotificationCompat;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.instrumentation.file.C1501h;
            import java.io.BufferedReader;
            import java.util.Locale;
            import java.util.TimeZone;
            import java.util.concurrent.FutureTask;
            import java.util.regex.Pattern;
            import okhttp3.HttpUrl;
            import okio.Segment;
            import p000.AbstractC0886en;
            import p000.CallableC2139rc;
            import p000.RunnableC2176sc;
            import p000.RunnableC2213tc;
            import p000.dp0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ApplicationUtilBase {
                public static final String PREFERENCES_NEW = "storage_new";
                public static final String PREFERENCES_OLD = "storage";

                /* JADX INFO: renamed from: a */
                public static Debug.MemoryInfo f5712a = null;

                /* JADX INFO: renamed from: b */
                public static int f5713b = -267522035;

                /* JADX INFO: renamed from: c */
                public static String f5714c = null;

                public static boolean canOpenURL(String str) {
/* 5 */             PackageManager packageManager = GameApp.getInstance().getPackageManager();
/* 17 */            if (!str.startsWith("fb://")) {
                        return packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0).size() > 0;
                    }
                    try {
                        return packageManager.getPackageInfo("com.facebook.katana", 0).versionCode >= 3002850;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }

                public static void copyString(String str) {
/* 1 */             GameApp gameApp = GameApp.getInstance();
/* 11 */            gameApp.runOnUiThread(new dp0(3, gameApp, str));
                }

                public static String getAndroidID() {
/* 3 */             if (f5714c == null) {
/* 19 */                f5714c = Settings.Secure.getString(GameApp.getInstance().getContentResolver(), "android_id");
                    }
/* 21 */            return f5714c;
                }

                public static String getAppVersion() {
/* 1 */             GameApp gameApp = GameApp.getInstance();
                    try {
/* 19 */                return gameApp.getPackageManager().getPackageInfo(gameApp.getPackageName(), 64).versionName;
                    } catch (PackageManager.NameNotFoundException e) {
/* 23 */                GameApp.debuggerException(e);
                        return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }

                public static String getBundleID() {
/* 5 */             return GameApp.getInstance().getPackageName();
                }

                public static String getIMEI() {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }

                public static String getKeyValue(String str) {
/* 5 */             return GameApp.getInstance().getKeyValue(str);
                }

                public static String getLocaleCountry() {
/* 5 */             String country = Locale.getDefault().getCountry();
                    return Pattern.compile("[A-Z]{2}", 2).matcher(country).matches() ? country.toUpperCase(Locale.ROOT) : HttpUrl.FRAGMENT_ENCODE_SET;
                }

                public static String getOpenUDID() {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }

                public static String getPlatformDetail(int i) {
                    String strValueOf;
/* 1 */             GameApp gameApp = GameApp.getInstance();
                    switch (i) {
                        case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
/* 161 */                   strValueOf = Build.BOARD;
                            break;
                        case 257:
/* 158 */                   strValueOf = Build.BOOTLOADER;
                            break;
                        case 258:
/* 155 */                   strValueOf = Build.BRAND;
                            break;
                        case 259:
/* 152 */                   strValueOf = Build.CPU_ABI;
                            break;
                        case 260:
/* 149 */                   strValueOf = Build.CPU_ABI2;
                            break;
                        case 261:
/* 146 */                   strValueOf = Build.DEVICE;
                            break;
                        case 262:
/* 143 */                   strValueOf = Build.DISPLAY;
                            break;
                        case 263:
/* 140 */                   strValueOf = Build.FINGERPRINT;
                            break;
                        case 264:
/* 137 */                   strValueOf = Build.HARDWARE;
                            break;
                        case 265:
/* 134 */                   strValueOf = Build.MANUFACTURER;
                            break;
                        case 266:
/* 131 */                   strValueOf = Build.MODEL;
                            break;
                        case 267:
/* 128 */                   strValueOf = Build.PRODUCT;
                            break;
                        case 268:
/* 125 */                   strValueOf = Build.TAGS;
                            break;
                        case 269:
/* 122 */                   strValueOf = Build.TYPE;
                            break;
                        case 270:
/* 119 */                   strValueOf = Build.VERSION.RELEASE;
                            break;
                        case 271:
/* 98 */                    DisplayMetrics displayMetrics = new DisplayMetrics();
/* 109 */                   gameApp.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
/* 114 */                   strValueOf = String.valueOf(displayMetrics.xdpi);
                            break;
                        case 272:
/* 75 */                    DisplayMetrics displayMetrics2 = new DisplayMetrics();
/* 86 */                    gameApp.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
/* 91 */                    strValueOf = String.valueOf(displayMetrics2.ydpi);
                            break;
                        case 273:
/* 52 */                    DisplayMetrics displayMetrics3 = new DisplayMetrics();
/* 63 */                    gameApp.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics3);
/* 68 */                    strValueOf = String.valueOf(displayMetrics3.density);
                            break;
                        case 274:
/* 44 */                    strValueOf = String.valueOf(((long) getTotalMemory()) * 1048576);
                            break;
                        case 275:
/* 13 */                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
/* 24 */                    ((ActivityManager) gameApp.getSystemService("activity")).getMemoryInfo(memoryInfo);
/* 29 */                    strValueOf = String.valueOf(memoryInfo.availMem);
                            break;
                        default:
/* 8 */                     strValueOf = null;
                            break;
                    }
                    return strValueOf == null ? HttpUrl.FRAGMENT_ENCODE_SET : strValueOf;
                }

                public static String getPreferredLanguage() {
/* 1 */             Locale locale = Locale.getDefault();
/* 5 */             String language = locale.getLanguage();
/* 9 */             String country = locale.getCountry();
                    return !country.isEmpty() ? AbstractC0886en.m3508l(language, "-", country) : language;
                }

                public static int getResidentMemoryInMB() {
/* 3 */             if (f5712a == null) {
/* 10 */                f5712a = new Debug.MemoryInfo();
                    }
/* 14 */            Debug.getMemoryInfo(f5712a);
/* 23 */            return f5712a.getTotalPss() / Segment.SHARE_MINIMUM;
                }

                public static String getServerEnvironment() {
                    return GameApp.getInstance() != null ? (String) GameApp.getInstance().getBuildConfigFromGame("SERVER_ENVIRONMENT") : HttpUrl.FRAGMENT_ENCODE_SET;
                }

                public static String getTimeZoneID() {
/* 5 */             return TimeZone.getDefault().getID();
                }

                public static int getTotalMemory() {
/* 6 */             if (f5713b == -267522035) {
                        try {
/* 19 */                    BufferedReader bufferedReader = new BufferedReader(new C1501h("/proc/meminfo"), Segment.SIZE);
/* 41 */                    f5713b = Integer.parseInt(bufferedReader.readLine().split("\\s+")[1]) >> 10;
/* 43 */                    bufferedReader.close();
                        } catch (Exception e) {
/* 49 */                    f5713b = 0;
/* 51 */                    GameApp.debuggerException(e);
                        }
                    }
/* 54 */            return f5713b;
                }

                public static boolean isAmazonDeviceMessagingSupported() {
/* 1 */             return false;
                }

                public static boolean isLowLatencyDevice() {
/* 6 */             if (GameApp.getInstance() != null) {
                        return GameApp.getInstance().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency") || GameApp.getInstance().getPackageManager().hasSystemFeature("android.hardware.audio.pro");
                    }
/* 5 */             return false;
                }

                public static void openMarketURL() {
                    try {
/* 38 */                GameApp.getInstance().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + GameApp.getInstance().getPackageName())));
                    } catch (ActivityNotFoundException e) {
/* 43 */                GameApp.debuggerException(e);
                    }
                }

                public static void openURL(String str) {
/* 1 */             GameApp gameApp = GameApp.getInstance();
/* 13 */            if (str.startsWith("https://") || str.startsWith("http://") || str.startsWith("market://")) {
                        try {
/* 168 */                   gameApp.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str.replace("market://play.google.com/store/apps/details?id=", "market://details?id="))));
/* 171 */                   return;
                        } catch (ActivityNotFoundException e) {
/* 173 */                   GameApp.debuggerException(e);
/* 176 */                   return;
                        }
                    }
/* 37 */            if (str.startsWith("mailto:")) {
                        try {
/* 48 */                    gameApp.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
/* 51 */                    return;
                        } catch (ActivityNotFoundException unused) {
/* 52 */                    Uri uri = Uri.parse(str);
/* 60 */                    Intent intent = new Intent("android.intent.action.SENDTO");
/* 63 */                    intent.setData(uri);
/* 72 */                    gameApp.startActivity(Intent.createChooser(intent, "Send email"));
/* 176 */                   return;
                        }
                    }
/* 82 */            if (str.startsWith("settings://")) {
                        try {
/* 99 */                    gameApp.startActivity(new Intent(str.substring(str.indexOf("settings://") + 11)));
/* 102 */                   return;
                        } catch (ActivityNotFoundException e2) {
/* 104 */                   GameApp.debuggerException(e2);
/* 176 */                   return;
                        }
                    }
/* 114 */           if (str.startsWith("fb://")) {
/* 125 */               gameApp.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
/* 128 */               return;
                    }
                    try {
/* 142 */               gameApp.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://".concat(str))));
                    } catch (ActivityNotFoundException e3) {
/* 147 */               GameApp.debuggerException(e3);
                    }
                }

                public static String pasteString() {
/* 1 */             GameApp gameApp = GameApp.getInstance();
/* 13 */            FutureTask futureTask = new FutureTask(new CallableC2139rc(gameApp, 0));
/* 16 */            gameApp.runOnUiThread(futureTask);
                    try {
/* 23 */                return (String) futureTask.get();
                    } catch (Exception e) {
/* 31 */                AbstractC1245n0.m4891s("ApplicationUtil", "Error getting paste string data", e);
                        return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }

                public static void removeKeyValue(String str) {
/* 3 */             storeKeyValue(str, HttpUrl.FRAGMENT_ENCODE_SET);
                }

                public static void setKeepScreenOn(boolean z) {
/* 1 */             GameApp gameApp = GameApp.getInstance();
/* 5 */             GL2JNISurfaceView view = gameApp.getView();
/* 9 */             if (view == null) {
/* 11 */                return;
                    }
/* 17 */            gameApp.runOnUiThread(new RunnableC2176sc(view, z));
                }

                public static void setRequestedOrientation() {
/* 1 */             GameApp gameApp = GameApp.getInstance();
/* 11 */            gameApp.runOnUiThread(new RunnableC2213tc(gameApp, 0));
                }

                public static void storeKeyValue(String str, String str2) {
/* 1 */             if (str2 == null) {
                        str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 5 */             GameApp gameApp = GameApp.getInstance();
/* 9 */             if (str == null || gameApp == null) {
/* 14 */                return;
                    }
/* 15 */            gameApp.storeKeyValue(str, str2);
                }
            }
