            package com.appsflyer.internal;

            import android.app.Activity;
            import android.app.Application;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.Signature;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Process;
            import com.appsflyer.AFLogger;
            import com.google.android.gms.appset.AppSet;
            import com.google.android.play.core.integrity.IntegrityManagerFactory;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import java.io.ByteArrayInputStream;
            import java.math.BigInteger;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.security.cert.CertificateException;
            import java.security.cert.CertificateFactory;
            import java.security.cert.X509Certificate;
            import java.text.SimpleDateFormat;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.Locale;
            import java.util.Map;
            import java.util.TimeZone;
            import kotlin.Pair;
            import okhttp3.HttpUrl;
            import p000.AbstractC0954gh;
            import p000.pr0;
            import p000.qr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 42 */    public final class AFj1kSDK {
                public static long AFAdRevenueData(Context context, String str) {
                    try {
/* 6 */                 PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
                        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
                    } catch (PackageManager.NameNotFoundException e) {
/* 30 */                AFLogger.afErrorLog(e.getMessage(), e);
/* 33 */                return 0L;
                    }
                }

                /* JADX INFO: renamed from: L_ */
                public static boolean m1829L_(Context context, Intent intent) {
                    return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
                }

                /* JADX WARN: Code duplicated, block: B:26:0x0059  */
                /* JADX INFO: renamed from: M_ */
                public static Map<String, String> m1830M_(PackageInfo packageInfo, Map<String, String> map, Uri uri) {
/* 7 */             Iterator<String> it = uri.getQueryParameterNames().iterator();
                    while (true) {
/* 15 */                String str = "media_source";
/* 19 */                if (!it.hasNext()) {
                            try {
/* 99 */                        if (!map.containsKey("install_time")) {
/* 107 */                           SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
/* 110 */                           long j = packageInfo.firstInstallTime;
/* 118 */                           simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
/* 130 */                           map.put("install_time", simpleDateFormat.format(new Date(j)));
                                }
                            } catch (Exception e) {
/* 137 */                       AFLogger.afErrorLog("Could not fetch install time. ", e);
                            }
/* 146 */                   if (map.containsKey("af_deeplink") && !map.containsKey("af_status")) {
/* 158 */                       map.put("af_status", "Non-organic");
                            }
/* 165 */                   if (map.containsKey("agency")) {
/* 167 */                       map.remove("media_source");
                            }
/* 170 */                   String path = uri.getPath();
/* 174 */                   if (path != null) {
/* 178 */                       map.put("path", path);
                            }
/* 181 */                   String scheme = uri.getScheme();
/* 185 */                   if (scheme != null) {
/* 189 */                       map.put("scheme", scheme);
                            }
/* 192 */                   String host = uri.getHost();
/* 196 */                   if (host != null) {
/* 200 */                       map.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, host);
                            }
/* 203 */                   return map;
                        }
/* 21 */                String next = it.next();
/* 27 */                String queryParameter = uri.getQueryParameter(next);
/* 35 */                if (!map.containsKey(next)) {
/* 37 */                    next.getClass();
                            switch (next) {
                                case "af_prt":
/* 17 */                            str = "agency";
                                    break;
                                case "c":
/* 85 */                            str = FirebaseAnalytics.Param.CAMPAIGN;
                                    break;
                                case "pid":
                                    break;
                                default:
/* 90 */                            str = next;
                                    break;
                            }
                        } else {
/* 90 */                    str = next;
                        }
/* 91 */                map.put(str, queryParameter);
                    }
                }

                /* JADX INFO: renamed from: N_ */
                public static String m1831N_(PackageManager packageManager, String str) throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException {
/* 7 */             Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
/* 9 */             if (signatureArr == null) {
/* 11 */                return null;
                    }
/* 35 */            X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
/* 39 */            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
/* 47 */            messageDigest.update(x509Certificate.getEncoded());
/* 66 */            return String.format("%032X", new BigInteger(1, messageDigest.digest()));
                }

                /* JADX INFO: renamed from: O_ */
                public static Application m1832O_(Context context) {
/* 3 */             if (context instanceof Application) {
/* 5 */                 return (Application) context;
                    }
/* 10 */            if (context instanceof Activity) {
/* 14 */                return ((Activity) context).getApplication();
                    }
                    try {
/* 23 */                return (Application) context.getApplicationContext();
                    } catch (ClassCastException unused) {
/* 34 */                AFLogger.afErrorLog("Application or Activity Context should be used", new IllegalStateException(), true, true);
/* 37 */                return null;
                    }
                }

                public static boolean getCurrencyIso4217Code(Context context) {
/* 1 */             if (context == null) {
/* 8 */                 return false;
                    }
                    try {
/* 3 */                 IntegrityManagerFactory.create(context);
/* 6 */                 return true;
                    } catch (Throwable unused) {
/* 8 */                 return false;
                    }
                }

                public static Pair<Long, String> getMediationNetwork(Context context, String str) {
                    try {
/* 6 */                 PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
/* 32 */                return new Pair<>(Long.valueOf(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode), packageInfo.versionName);
                    } catch (PackageManager.NameNotFoundException unused) {
/* 46 */                return new Pair<>(0L, HttpUrl.FRAGMENT_ENCODE_SET);
                    }
                }

                public static boolean getMonetizationNetwork(Context context, String str) {
/* 9 */             int iCheckPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
/* 17 */            StringBuilder sb = new StringBuilder("is Permission Available: ");
/* 20 */            sb.append(str);
/* 25 */            sb.append("; res: ");
/* 28 */            sb.append(iCheckPermission);
/* 35 */            AFLogger.afRDLog(sb.toString());
                    return iCheckPermission == 0;
                }

                public static boolean getRevenue(Context context) {
/* 2 */             if (context != null && Build.VERSION.SDK_INT >= 33) {
                        try {
/* 26 */                    if (AbstractC0954gh.m3928d(context.getApplicationContext().getSystemService(AbstractC0954gh.m3935k())) != null) {
/* 28 */                        return true;
                            }
                        } catch (Throwable th) {
/* 54 */                    AFLogger.INSTANCE.m1813e(AFg1cSDK.PRIVACY_SANDBOX, th.getMessage() != null ? th.getMessage() : HttpUrl.FRAGMENT_ENCODE_SET, th, false, false);
                        }
                    }
/* 1 */             return false;
                }

/* 43 */        public static boolean getMonetizationNetwork(Context context) {
                    if (context == null) {
                        return false;
                    }
                    try {
/* 44 */                AppSet.getClient(context);
                        return true;
                    } catch (Throwable unused) {
                        return false;
                    }
                }

/* 49 */        public static boolean getMediationNetwork(Context context) {
                    if (context != null) {
                        try {
/* 51 */                    if (pr0.f15259d.m8004c(context, qr0.f15711a) == 0) {
                                return true;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    return false;
                }

/* 57 */        public static boolean getRevenue() {
/* 58 */            return Build.BRAND.equals("OPPO");
                }

/* 58 */        public static String getRevenue(Context context, String str) {
                    try {
/* 59 */                return context.getPackageManager().getPackageInfo(str, 0).versionName;
                    } catch (PackageManager.NameNotFoundException e) {
/* 60 */                AFLogger.afErrorLog(e.getMessage(), e);
/* 61 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }
            }
