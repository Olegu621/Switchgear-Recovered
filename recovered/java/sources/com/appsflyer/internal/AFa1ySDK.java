            package com.appsflyer.internal;

            import android.app.Activity;
            import android.app.Application;
            import android.content.Context;
            import android.content.Intent;
            import android.content.SharedPreferences;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.StrictMode;
            import android.text.TextUtils;
            import android.view.MotionEvent;
            import com.appsflyer.AFAdRevenueData;
            import com.appsflyer.AFInAppEventParameterName;
            import com.appsflyer.AFInAppEventType;
            import com.appsflyer.AFLogger;
            import com.appsflyer.AFPurchaseDetails;
            import com.appsflyer.AppsFlyerConsent;
            import com.appsflyer.AppsFlyerConversionListener;
            import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
            import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
            import com.appsflyer.AppsFlyerLib;
            import com.appsflyer.AppsFlyerProperties;
            import com.appsflyer.PurchaseHandler;
            import com.appsflyer.attribution.AppsFlyerRequestListener;
            import com.appsflyer.deeplink.DeepLinkListener;
            import com.appsflyer.deeplink.DeepLinkResult;
            import com.appsflyer.internal.AFe1oSDK.RunnableC02601;
            import com.appsflyer.internal.components.network.http.ResponseNetwork;
            import com.appsflyer.internal.platform_extension.PluginInfo;
            import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.io.UnsupportedEncodingException;
            import java.net.URI;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Objects;
            import java.util.TimeZone;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.TimeUnit;
            import kotlin.Unit;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            import p000.AbstractC0886en;
            import p000.RunnableC2558zo;
            import p000.pr0;
            import p000.qr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 28 */    public final class AFa1ySDK extends AppsFlyerLib {
                private static int $10 = 0;
                private static int $11 = 1;
                private static boolean AFInAppEventParameterName = false;
                private static boolean AFInAppEventType = false;
                private static int AFKeystoreWrapper = 0;
                private static char[] AFLogger = null;
                private static AFa1ySDK areAllFieldsValid = null;
                static AppsFlyerInAppPurchaseValidatorListener getCurrencyIso4217Code = null;
                public static final String getMediationNetwork;
                public static final String getMonetizationNetwork;

                /* JADX INFO: renamed from: i */
                private static int f3077i = 1;
                private static int registerClient;
                Application component2;
                private Map<Long, String> copydefault;
                private AFf1mSDK equals;
                private boolean hashCode;
                private volatile SharedPreferences toString;
                public volatile AppsFlyerConversionListener getRevenue = null;
                private long component3 = -1;
                long AFAdRevenueData = -1;
                private long component4 = 5000;
                boolean component1 = false;
                private final AFc1bSDK copy = new AFc1bSDK();

                /* JADX INFO: renamed from: com.appsflyer.internal.AFa1ySDK$3 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static /* synthetic */ class C02433 {
                    static final /* synthetic */ int[] getCurrencyIso4217Code;

                    static {
/* 6 */                 int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
/* 8 */                 getCurrencyIso4217Code = iArr;
                        try {
/* 17 */                    iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 28 */                    getCurrencyIso4217Code[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                    }
                }

                static {
/* 1 */             component2();
/* 6 */             getMonetizationNetwork = "372";
/* 10 */            getMediationNetwork = "6.17";
/* 13 */            getCurrencyIso4217Code = null;
/* 20 */            areAllFieldsValid = new AFa1ySDK();
/* 28 */            f3077i = (AFKeystoreWrapper + 87) % 128;
                }

                public AFa1ySDK() {
/* 35 */            getMonetizationNetwork().afInfoLog().getRevenue();
/* 46 */            getMonetizationNetwork().afInfoLog().getMonetizationNetwork();
/* 53 */            AFe1oSDK aFe1oSDKCopydefault = getMonetizationNetwork().copydefault();
/* 64 */            aFe1oSDKCopydefault.getMediationNetwork.add(new AFa1zSDK());
                }

                private static void AFAdRevenueData(JSONObject jSONObject) {
                    String str;
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             Iterator<String> itKeys = jSONObject.keys();
                    while (true) {
/* 15 */                if (!itKeys.hasNext()) {
                            break;
                        }
                        try {
/* 31 */                    JSONArray jSONArray = new JSONArray((String) jSONObject.get(itKeys.next()));
/* 38 */                    for (int i = 0; i < jSONArray.length(); i++) {
/* 48 */                        arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                            }
                        } catch (JSONException e) {
/* 57 */                    AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e);
                        }
                    }
/* 61 */            Collections.sort(arrayList);
/* 64 */            Iterator<String> itKeys2 = jSONObject.keys();
                    loop2: while (true) {
/* 69 */                str = null;
                        while (true) {
/* 74 */                    if (!itKeys2.hasNext()) {
                                break loop2;
                            }
/* 82 */                    f3077i = (AFKeystoreWrapper + 7) % 128;
/* 84 */                    if (str != null) {
                                break loop2;
                            }
/* 86 */                    String next = itKeys2.next();
                            try {
/* 100 */                       JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
/* 103 */                       int i2 = 0;
/* 108 */                       while (i2 < jSONArray2.length()) {
/* 126 */                           if (jSONArray2.getLong(i2) == ((Long) arrayList.get(0)).longValue() || jSONArray2.getLong(i2) == ((Long) arrayList.get(1)).longValue()) {
                                        break;
                                    }
/* 153 */                           AFKeystoreWrapper = (f3077i + 61) % 128;
/* 176 */                           if (jSONArray2.getLong(i2) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                        break;
                                    }
/* 179 */                           i2++;
/* 181 */                           str = next;
                                }
                            } catch (JSONException e2) {
/* 186 */                       AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e2);
                            }
                        }
                    }
/* 190 */           if (str != null) {
/* 198 */               AFKeystoreWrapper = (f3077i + 111) % 128;
/* 200 */               jSONObject.remove(str);
                    }
                }

                /* JADX INFO: renamed from: a */
                private static void m1758a(String str, int[] iArr, String str2, int i, Object[] objArr) throws UnsupportedEncodingException {
                    Object charArray = str2;
/* 1 */             if (str2 != null) {
/* 3 */                 charArray = str2.toCharArray();
                    }
/* 7 */             char[] cArr = (char[]) charArray;
                    Object bytes = str;
/* 10 */            if (str != null) {
/* 14 */                int i2 = $10 + 79;
/* 18 */                $11 = i2 % 128;
/* 24 */                if (i2 % 2 == 0) {
/* 32 */                    int i3 = 41 / 0;
/* 26 */                    bytes = str.getBytes("ISO-8859-1");
                        } else {
/* 34 */                    bytes = str.getBytes("ISO-8859-1");
                        }
                    }
/* 38 */            byte[] bArr = (byte[]) bytes;
/* 42 */            AFk1oSDK aFk1oSDK = new AFk1oSDK();
/* 45 */            char[] cArr2 = AFLogger;
/* 52 */            if (cArr2 != null) {
/* 60 */                $11 = ($10 + 29) % 128;
/* 62 */                int length = cArr2.length;
/* 63 */                char[] cArr3 = new char[length];
/* 66 */                for (int i4 = 0; i4 < length; i4++) {
/* 74 */                    cArr3[i4] = (char) (((long) cArr2[i4]) ^ 1825820251896122634L);
                        }
/* 79 */                cArr2 = cArr3;
                    }
/* 84 */            int i5 = (int) (1825820251896122634L ^ ((long) registerClient));
/* 87 */            if (AFInAppEventType) {
/* 89 */                int length2 = bArr.length;
/* 90 */                aFk1oSDK.getMonetizationNetwork = length2;
/* 92 */                char[] cArr4 = new char[length2];
/* 94 */                aFk1oSDK.AFAdRevenueData = 0;
/* 102 */               $11 = ($10 + 43) % 128;
                        while (true) {
/* 104 */                   int i6 = aFk1oSDK.AFAdRevenueData;
/* 106 */                   int i7 = aFk1oSDK.getMonetizationNetwork;
/* 108 */                   if (i6 >= i7) {
/* 132 */                       objArr[0] = new String(cArr4);
/* 134 */                       return;
                            } else {
/* 120 */                       cArr4[i6] = (char) (cArr2[bArr[(i7 - 1) - i6] + i] - i5);
/* 124 */                       aFk1oSDK.AFAdRevenueData = i6 + 1;
                            }
                        }
                    } else if (AFInAppEventParameterName) {
/* 139 */               int length3 = cArr.length;
/* 140 */               aFk1oSDK.getMonetizationNetwork = length3;
/* 142 */               char[] cArr5 = new char[length3];
/* 144 */               aFk1oSDK.AFAdRevenueData = 0;
                        while (true) {
/* 146 */                   int i8 = aFk1oSDK.AFAdRevenueData;
/* 148 */                   int i9 = aFk1oSDK.getMonetizationNetwork;
/* 150 */                   if (i8 >= i9) {
/* 174 */                       objArr[0] = new String(cArr5);
/* 176 */                       return;
                            } else {
/* 162 */                       cArr5[i8] = (char) (cArr2[cArr[(i9 - 1) - i8] - i] - i5);
/* 166 */                       aFk1oSDK.AFAdRevenueData = i8 + 1;
                            }
                        }
                    } else {
/* 177 */               int length4 = iArr.length;
/* 178 */               aFk1oSDK.getMonetizationNetwork = length4;
/* 180 */               char[] cArr6 = new char[length4];
/* 182 */               aFk1oSDK.AFAdRevenueData = 0;
                        while (true) {
/* 184 */                   int i10 = aFk1oSDK.AFAdRevenueData;
/* 186 */                   int i11 = aFk1oSDK.getMonetizationNetwork;
/* 188 */                   if (i10 >= i11) {
/* 212 */                       objArr[0] = new String(cArr6);
/* 214 */                       return;
                            } else {
/* 200 */                       cArr6[i10] = (char) (cArr2[iArr[(i11 - 1) - i10] - i] - i5);
/* 204 */                       aFk1oSDK.AFAdRevenueData = i10 + 1;
                            }
                        }
                    }
                }

                private void areAllFieldsValid() {
/* 7 */             f3077i = (AFKeystoreWrapper + 73) % 128;
                    try {
/* 13 */                final AFi1hSDK aFi1hSDKAfErrorLog = getMonetizationNetwork().afErrorLog();
/* 17 */                if (aFi1hSDKAfErrorLog == null) {
/* 80 */                    return;
                        }
/* 24 */                if (!aFi1hSDKAfErrorLog.getCurrencyIso4217Code()) {
/* 61 */                    if (aFi1hSDKAfErrorLog.AFAdRevenueData()) {
/* 80 */                        return;
                            }
/* 77 */                    getRevenue(new Object[]{this, aFi1hSDKAfErrorLog}, 608861720, -608861711, System.identityHashCode(this));
                        } else {
/* 28 */                    int i = f3077i + ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE;
/* 32 */                    AFKeystoreWrapper = i % 128;
/* 36 */                    if (i % 2 == 0) {
/* 43 */                        aFi1hSDKAfErrorLog.getMediationNetwork(new AFi1dSDK() { // from class: com.appsflyer.internal.a
                                    @Override // com.appsflyer.internal.AFi1dSDK
                                    public final void onRequestFinished() {
/* 1 */                                 this.f3096a.AFAdRevenueData(aFi1hSDKAfErrorLog);
                                    }
                                });
                            } else {
/* 52 */                        aFi1hSDKAfErrorLog.getMediationNetwork(new AFi1dSDK() { // from class: com.appsflyer.internal.a
                                    @Override // com.appsflyer.internal.AFi1dSDK
                                    public final void onRequestFinished() {
/* 1 */                                 this.f3096a.AFAdRevenueData(aFi1hSDKAfErrorLog);
                                    }
                                });
/* 56 */                        throw null;
                            }
                        }
                    } catch (Throwable th) {
/* 84 */                AFLogger.afErrorLogForExcManagerOnly("Error at attempt to request PIA token", th);
/* 97 */                AFLogger.afRDLog("Get PIA token failed with exception:".concat(String.valueOf(th)));
                    }
                }

                /* JADX INFO: renamed from: c_ */
                private static void m1761c_(Context context, PackageInfo packageInfo) {
                    try {
/* 1 */                 ApplicationInfo applicationInfo = packageInfo.applicationInfo;
/* 3 */                 if (applicationInfo == null || (applicationInfo.flags & 32768) == 0) {
/* 116 */                   return;
                        }
/* 20 */                if (Build.VERSION.SDK_INT < 31) {
/* 95 */                    if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
/* 103 */                       AFLogger.INSTANCE.mo1749i(AFg1cSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
/* 106 */                       return;
                            } else {
/* 113 */                       AFLogger.INSTANCE.mo1751w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
/* 116 */                       return;
                            }
                        }
/* 36 */                if (context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName()) == 0) {
/* 69 */                    AFLogger.INSTANCE.mo1751w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
/* 78 */                    AFKeystoreWrapper = (f3077i + 49) % 128;
                        } else {
/* 40 */                    int i = f3077i + 65;
/* 44 */                    AFKeystoreWrapper = i % 128;
/* 59 */                    (i % 2 != 0 ? AFLogger.INSTANCE : AFLogger.INSTANCE).mo1749i(AFg1cSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
                        }
                    } catch (Throwable th) {
/* 124 */               AFLogger.INSTANCE.m1811e(AFg1cSDK.GENERAL, "Exception while checking BackupRules: ", th);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:9:0x0025  */
                private static /* synthetic */ Object component1(Object[] objArr) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads;
/* 4 */             Context context = (Context) objArr[0];
/* 8 */             int i = f3077i + 9;
/* 12 */            AFKeystoreWrapper = i % 128;
/* 16 */            if (i % 2 != 0) {
/* 26 */                int i2 = 95 / 0;
/* 27 */                if (getRevenue().toString == null) {
/* 38 */                    threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
/* 56 */                        getRevenue().toString = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
/* 58 */                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            } catch (Throwable th) {
/* 63 */                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
/* 66 */                        throw th;
                            }
                        }
                    } else if (getRevenue().toString == null) {
/* 38 */                threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
/* 56 */                getRevenue().toString = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
/* 58 */                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
/* 71 */            SharedPreferences sharedPreferences = getRevenue().toString;
/* 75 */            int i3 = AFKeystoreWrapper + 7;
/* 79 */            f3077i = i3 % 128;
/* 83 */            if (i3 % 2 != 0) {
/* 85 */                return sharedPreferences;
                    }
/* 87 */            throw null;
                }

                private static /* synthetic */ Object component2(Object[] objArr) {
/* 4 */             String str = (String) objArr[0];
                    try {
/* 18 */                if (!new JSONObject(str).has("pid")) {
/* 46 */                    AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
/* 51 */                    int i = AFKeystoreWrapper + 113;
/* 55 */                    f3077i = i % 128;
/* 59 */                    if (i % 2 != 0) {
/* 6 */                         return null;
                            }
/* 62 */                    throw null;
                        }
/* 22 */                int i2 = f3077i + 97;
/* 26 */                AFKeystoreWrapper = i2 % 128;
/* 32 */                if (i2 % 2 == 0) {
/* 34 */                    getMediationNetwork("preInstallName", str);
/* 6 */                     return null;
                        }
/* 40 */                getMediationNetwork("preInstallName", str);
/* 43 */                throw null;
                    } catch (JSONException e) {
/* 65 */                AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
/* 6 */                 return null;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:11:0x0058  */
                /* JADX WARN: Code duplicated, block: B:12:0x0063  */
                /* JADX WARN: Code duplicated, block: B:9:0x0049 A[PHI: r1 r2
  0x0049: PHI (r1v4 com.appsflyer.internal.AFh1xSDK) = (r1v3 com.appsflyer.internal.AFh1xSDK), (r1v8 com.appsflyer.internal.AFh1xSDK) binds: [B:8:0x0047, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0049: PHI (r2v4 com.appsflyer.internal.AFh1vSDK) = (r2v3 com.appsflyer.internal.AFh1vSDK), (r2v5 com.appsflyer.internal.AFh1vSDK) binds: [B:8:0x0047, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
                private static /* synthetic */ Object component3(Object[] objArr) {
                    AFh1xSDK aFh1xSDKAreAllFieldsValid;
                    AFh1vSDK mediationNetwork;
                    int i;
                    Map<String, Object> map;
/* 4 */             AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
/* 9 */             Context context = (Context) objArr[1];
/* 14 */            AFh1tSDK aFh1tSDK = (AFh1tSDK) objArr[2];
/* 18 */            int i2 = AFKeystoreWrapper + 77;
/* 22 */            f3077i = i2 % 128;
/* 26 */            if (i2 % 2 == 0) {
/* 28 */                aFa1ySDK.AFAdRevenueData(context);
/* 35 */                aFh1xSDKAreAllFieldsValid = aFa1ySDK.getMonetizationNetwork().areAllFieldsValid();
/* 39 */                mediationNetwork = AFh1vSDK.getMediationNetwork(context);
/* 49 */                int i3 = 14 / 0;
/* 50 */                if (aFh1xSDKAreAllFieldsValid.AFAdRevenueData()) {
/* 76 */                    int i4 = AFKeystoreWrapper + 75;
/* 80 */                    f3077i = i4 % 128;
/* 82 */                    i = i4 % 2;
/* 83 */                    map = aFh1xSDKAreAllFieldsValid.AFAdRevenueData;
/* 87 */                    if (i != 0) {
/* 104 */                       map.put("api_name", aFh1tSDK.toString());
/* 107 */                       aFh1xSDKAreAllFieldsValid.getRevenue(mediationNetwork);
/* 110 */                       throw null;
                            }
/* 93 */                    map.put("api_name", aFh1tSDK.toString());
/* 96 */                    aFh1xSDKAreAllFieldsValid.getRevenue(mediationNetwork);
                        }
                    } else {
/* 53 */                aFa1ySDK.AFAdRevenueData(context);
/* 60 */                aFh1xSDKAreAllFieldsValid = aFa1ySDK.getMonetizationNetwork().areAllFieldsValid();
/* 64 */                mediationNetwork = AFh1vSDK.getMediationNetwork(context);
/* 72 */                if (aFh1xSDKAreAllFieldsValid.AFAdRevenueData()) {
/* 76 */                    int i5 = AFKeystoreWrapper + 75;
/* 80 */                    f3077i = i5 % 128;
/* 82 */                    i = i5 % 2;
/* 83 */                    map = aFh1xSDKAreAllFieldsValid.AFAdRevenueData;
/* 87 */                    if (i != 0) {
/* 104 */                       map.put("api_name", aFh1tSDK.toString());
/* 107 */                       aFh1xSDKAreAllFieldsValid.getRevenue(mediationNetwork);
/* 110 */                       throw null;
                            }
/* 93 */                    map.put("api_name", aFh1tSDK.toString());
/* 96 */                    aFh1xSDKAreAllFieldsValid.getRevenue(mediationNetwork);
                        }
                    }
/* 111 */           aFh1xSDKAreAllFieldsValid.getMonetizationNetwork();
/* 116 */           int i6 = AFKeystoreWrapper + 61;
/* 120 */           f3077i = i6 % 128;
/* 123 */           if (i6 % 2 == 0) {
/* 125 */               int i7 = 2 / 0;
                    }
/* 25 */            return null;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x005b A[Catch: all -> 0x003c, JSONException -> 0x003f, PHI: r3
  0x005b: PHI (r3v3 long) = (r3v2 long), (r3v14 long) binds: [B:14:0x0059, B:6:0x0039] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {JSONException -> 0x003f, all -> 0x003c, blocks: (B:5:0x002a, B:16:0x0066, B:18:0x0071, B:21:0x008a, B:25:0x009d, B:26:0x00a0, B:30:0x00b3, B:31:0x00b6, B:20:0x0085, B:15:0x005b, B:13:0x004d), top: B:37:0x001d }] */
                /* JADX WARN: Code duplicated, block: B:16:0x0066 A[Catch: all -> 0x003c, JSONException -> 0x003f, PHI: r3 r7
  0x0066: PHI (r3v12 long) = (r3v2 long), (r3v14 long) binds: [B:14:0x0059, B:6:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x0066: PHI (r7v3 java.lang.String) = (r7v0 java.lang.String), (r7v8 java.lang.String) binds: [B:14:0x0059, B:6:0x0039] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {JSONException -> 0x003f, all -> 0x003c, blocks: (B:5:0x002a, B:16:0x0066, B:18:0x0071, B:21:0x008a, B:25:0x009d, B:26:0x00a0, B:30:0x00b3, B:31:0x00b6, B:20:0x0085, B:15:0x005b, B:13:0x004d), top: B:37:0x001d }] */
                /* JADX WARN: Code duplicated, block: B:18:0x0071 A[Catch: all -> 0x003c, JSONException -> 0x003f, TRY_LEAVE, TryCatch #2 {JSONException -> 0x003f, all -> 0x003c, blocks: (B:5:0x002a, B:16:0x0066, B:18:0x0071, B:21:0x008a, B:25:0x009d, B:26:0x00a0, B:30:0x00b3, B:31:0x00b6, B:20:0x0085, B:15:0x005b, B:13:0x004d), top: B:37:0x001d }] */
                /* JADX WARN: Code duplicated, block: B:20:0x0085 A[Catch: all -> 0x003c, JSONException -> 0x003f, TRY_ENTER, TryCatch #2 {JSONException -> 0x003f, all -> 0x003c, blocks: (B:5:0x002a, B:16:0x0066, B:18:0x0071, B:21:0x008a, B:25:0x009d, B:26:0x00a0, B:30:0x00b3, B:31:0x00b6, B:20:0x0085, B:15:0x005b, B:13:0x004d), top: B:37:0x001d }] */
                private static /* synthetic */ Object component4(Object[] objArr) {
                    long jCurrentTimeMillis;
                    String monetizationNetwork;
                    JSONObject jSONObject;
                    JSONArray jSONArray;
/* 4 */             AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
/* 9 */             Context context = (Context) objArr[1];
/* 14 */            String str = (String) objArr[2];
/* 18 */            int i = AFKeystoreWrapper + 83;
/* 22 */            f3077i = i % 128;
                    try {
/* 30 */                if (i % 2 == 0) {
/* 40 */                    AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
/* 43 */                    jCurrentTimeMillis = System.currentTimeMillis();
/* 51 */                    monetizationNetwork = aFa1ySDK.getMonetizationNetwork(context).getMonetizationNetwork("extraReferrers", (String) null);
/* 57 */                    int i2 = 25 / 0;
/* 58 */                    if (monetizationNetwork == null) {
/* 94 */                        jSONObject = new JSONObject();
/* 99 */                        jSONArray = new JSONArray();
                            } else {
/* 105 */                       jSONObject = new JSONObject(monetizationNetwork);
/* 112 */                       if (jSONObject.has(str)) {
/* 122 */                           jSONArray = new JSONArray((String) jSONObject.get(str));
/* 131 */                           AFKeystoreWrapper = (f3077i + 123) % 128;
                                } else {
/* 136 */                           jSONArray = new JSONArray();
                                }
                            }
                        } else {
/* 75 */                    AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
/* 78 */                    jCurrentTimeMillis = System.currentTimeMillis();
/* 86 */                    monetizationNetwork = aFa1ySDK.getMonetizationNetwork(context).getMonetizationNetwork("extraReferrers", (String) null);
/* 90 */                    if (monetizationNetwork == null) {
/* 94 */                        jSONObject = new JSONObject();
/* 99 */                        jSONArray = new JSONArray();
                            } else {
/* 105 */                       jSONObject = new JSONObject(monetizationNetwork);
/* 112 */                       if (jSONObject.has(str)) {
/* 122 */                           jSONArray = new JSONArray((String) jSONObject.get(str));
/* 131 */                           AFKeystoreWrapper = (f3077i + 123) % 128;
                                } else {
/* 136 */                           jSONArray = new JSONArray();
                                }
                            }
                        }
/* 148 */               if (jSONArray.length() < 5) {
/* 156 */                   AFKeystoreWrapper = (f3077i + 75) % 128;
/* 158 */                   jSONArray.put(jCurrentTimeMillis);
                        }
/* 170 */               if (jSONObject.length() >= 4) {
/* 178 */                   f3077i = (AFKeystoreWrapper + 67) % 128;
/* 180 */                   AFAdRevenueData(jSONObject);
                        }
/* 187 */               jSONObject.put(str, jSONArray.toString());
/* 198 */               aFa1ySDK.getMonetizationNetwork(context).getRevenue("extraReferrers", jSONObject.toString());
/* 29 */                return null;
                    } catch (JSONException e) {
/* 227 */               AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e);
/* 29 */                return null;
                    } catch (Throwable th) {
/* 206 */               StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
/* 209 */               sb.append(str);
/* 214 */               sb.append(": ");
/* 221 */               AFLogger.afErrorLog(sb.toString(), th);
/* 29 */                return null;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void copy() {
/* 3 */             int i = f3077i + 121;
/* 7 */             AFKeystoreWrapper = i % 128;
/* 11 */            if (i % 2 != 0) {
/* 230 */               getMonetizationNetwork().afLogForce().AFAdRevenueData();
/* 234 */               throw null;
                    }
/* 25 */            if (getMonetizationNetwork().afLogForce().AFAdRevenueData()) {
/* 33 */                AFKeystoreWrapper = (f3077i + 21) % 128;
/* 43 */                getMonetizationNetwork().afLogForce().getMonetizationNetwork();
                    }
/* 50 */            AFi1pSDK aFi1pSDKMo1779d = getMonetizationNetwork().mo1779d();
/* 75 */            aFi1pSDKMo1779d.getMonetizationNetwork = Build.VERSION.SDK_INT >= 31 ? new AFi1mSDK(aFi1pSDKMo1779d.getMediationNetwork) : new AFi1tSDK(aFi1pSDKMo1779d.getMediationNetwork);
/* 93 */            getMonetizationNetwork().AFInAppEventType().getRevenue(getMonetizationNetwork().AFAdRevenueData());
/* 100 */           AFh1xSDK aFh1xSDKAreAllFieldsValid = getMonetizationNetwork().areAllFieldsValid();
/* 108 */           aFh1xSDKAreAllFieldsValid.areAllFieldsValid = System.currentTimeMillis();
/* 117 */           int revenue = aFh1xSDKAreAllFieldsValid.getCurrencyIso4217Code.getMediationNetwork.getRevenue("appsFlyerCount", 0);
/* 122 */           if (revenue == 1) {
/* 130 */               AFKeystoreWrapper = (f3077i + 89) % 128;
/* 140 */               if (aFh1xSDKAreAllFieldsValid.getMonetizationNetwork.getMonetizationNetwork("first_launch")) {
/* 148 */                   aFh1xSDKAreAllFieldsValid.AFAdRevenueData.putAll(aFh1xSDKAreAllFieldsValid.getCurrencyIso4217Code("first_launch"));
                        }
                    }
/* 151 */           if (revenue > 0 && aFh1xSDKAreAllFieldsValid.getMonetizationNetwork.getMonetizationNetwork("gcd")) {
/* 165 */               int i2 = AFKeystoreWrapper + 85;
/* 169 */               f3077i = i2 % 128;
/* 171 */               int i3 = i2 % 2;
/* 173 */               Map<String, Object> map = aFh1xSDKAreAllFieldsValid.getRevenue;
/* 175 */               if (i3 == 0) {
/* 181 */                   map.putAll(aFh1xSDKAreAllFieldsValid.getCurrencyIso4217Code("gcd"));
/* 186 */                   int i4 = 79 / 0;
                        } else {
/* 192 */                   map.putAll(aFh1xSDKAreAllFieldsValid.getCurrencyIso4217Code("gcd"));
                        }
                    }
/* 205 */           aFh1xSDKAreAllFieldsValid.copydefault = aFh1xSDKAreAllFieldsValid.getMonetizationNetwork.getMonetizationNetwork("prev_session_dur", 0L);
/* 207 */           areAllFieldsValid();
/* 218 */           getMonetizationNetwork().registerClient().getMediationNetwork();
                }

                private static /* synthetic */ Object copydefault(Object[] objArr) {
/* 7 */             f3077i = (AFKeystoreWrapper + 121) % 128;
/* 11 */            String currencyIso4217Code = getCurrencyIso4217Code(AppsFlyerProperties.APP_USER_ID);
/* 17 */            int i = f3077i + 115;
/* 21 */            AFKeystoreWrapper = i % 128;
/* 25 */            if (i % 2 == 0) {
/* 27 */                return currencyIso4217Code;
                    }
/* 29 */            throw null;
                }

                /* JADX INFO: renamed from: d_ */
                public static SharedPreferences m1763d_(Context context) {
/* 20 */            return (SharedPreferences) getRevenue(new Object[]{context}, 1916447333, -1916447320, (int) System.currentTimeMillis());
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code duplicated, block: B:16:0x005c  */
                /* JADX WARN: Code duplicated, block: B:7:0x0037  */
                /* JADX INFO: renamed from: e_ */
                public /* synthetic */ void m1765e_(Context context, Intent intent) {
                    Uri data;
                    boolean z;
/* 7 */             f3077i = (AFKeystoreWrapper + 69) % 128;
/* 9 */             AFAdRevenueData(context);
/* 16 */            AFa1mSDK aFa1mSDKMo1781i = getMonetizationNetwork().mo1781i();
/* 24 */            AFc1qSDK aFc1qSDKComponent4 = getMonetizationNetwork().component4();
/* 29 */            if (intent != null) {
/* 37 */                f3077i = (AFKeystoreWrapper + 95) % 128;
/* 49 */                if ("android.intent.action.VIEW".equals(intent.getAction())) {
/* 51 */                    data = intent.getData();
                        } else {
/* 56 */                    data = null;
                        }
                    } else {
/* 56 */                data = null;
                    }
/* 58 */            if (data != null) {
/* 66 */                AFKeystoreWrapper = (f3077i + 33) % 128;
/* 76 */                if (data.toString().isEmpty()) {
/* 93 */                    z = false;
                        } else {
/* 80 */                    int i = f3077i + 27;
/* 84 */                    AFKeystoreWrapper = i % 128;
/* 88 */                    if (i % 2 != 0) {
/* 93 */                        z = false;
                            } else {
/* 91 */                        z = true;
                            }
                        }
                    } else {
/* 93 */                z = false;
                    }
/* 100 */           if (!aFc1qSDKComponent4.getMediationNetwork("ddl_sent", false) || z) {
/* 120 */               aFa1mSDKMo1781i.m1754f_(AFa1jSDK.getMediationNetwork(aFa1mSDKMo1781i.areAllFieldsValid.afVerboseLog()), intent, context);
                    } else {
/* 106 */               aFa1mSDKMo1781i.getMediationNetwork("No direct deep link", null);
                    }
                }

                private static /* synthetic */ Object equals(Object[] objArr) {
/* 4 */             AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
/* 13 */            int i = AFKeystoreWrapper + 93;
/* 17 */            f3077i = i % 128;
/* 22 */            if (i % 2 != 0) {
/* 32 */                aFa1ySDK.getMonetizationNetwork().mo1782v().getMonetizationNetwork();
/* 21 */                return null;
                    }
/* 44 */            aFa1ySDK.getMonetizationNetwork().mo1782v().getMonetizationNetwork();
/* 47 */            throw null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Object getRevenue(Object[] objArr, int i, int i2, int i3) {
                    String strConcat;
/* 5 */             int i4 = (i2 * (-755)) + (i * (-755));
/* 9 */             int i5 = ~((~i) | (~i2));
/* 13 */            int i6 = i | i2;
/* 18 */            int i7 = ((~(i6 | i3)) | i5) * (-756);
/* 23 */            int i8 = (i6 | (~i3)) * 756;
/* 27 */            int i9 = 1;
                    switch (i8 + i7 + (i5 * 1512) + i4) {
                        case 1:
/* 777 */                   AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
/* 781 */                   String str = (String) objArr[1];
/* 785 */                   Map map = (Map) objArr[2];
/* 793 */                   f3077i = (AFKeystoreWrapper + 117) % 128;
/* 799 */                   AFc1eSDK aFc1eSDKForce = aFa1ySDK.getMonetizationNetwork().force();
/* 805 */                   if (aFc1eSDKForce.AFAdRevenueData == null) {
/* 812 */                       aFc1eSDKForce.AFAdRevenueData = new AFb1rSDK();
                            }
/* 814 */                   AFb1rSDK aFb1rSDK = aFc1eSDKForce.AFAdRevenueData;
/* 816 */                   if (str == null || str.isEmpty()) {
/* 950 */                       AFLogger.afWarnLog("Partner ID is missing or `null`");
/* 29 */                        return null;
                            }
/* 826 */                   if (map == null || map.isEmpty()) {
/* 925 */                       if (aFb1rSDK.getCurrencyIso4217Code.remove(str) == null) {
/* 933 */                           AFKeystoreWrapper = (f3077i + 39) % 128;
/* 935 */                           strConcat = "Partner data is missing or `null`";
                                } else {
/* 940 */                           strConcat = "Cleared partner data for ".concat(str);
                                }
/* 944 */                       AFLogger.afWarnLog(strConcat);
/* 29 */                        return null;
                            }
/* 839 */                   StringBuilder sb = new StringBuilder("Setting partner data for ");
/* 842 */                   sb.append(str);
/* 847 */                   sb.append(": ");
/* 850 */                   sb.append(map);
/* 857 */                   AFLogger.afDebugLog(sb.toString());
/* 869 */                   int length = new JSONObject(map).toString().length();
/* 875 */                   if (length <= 1000) {
/* 910 */                       aFb1rSDK.getCurrencyIso4217Code.put(str, map);
/* 915 */                       aFb1rSDK.getMonetizationNetwork.remove(str);
/* 29 */                        return null;
                            }
/* 879 */                   AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
/* 884 */                   HashMap map2 = new HashMap();
/* 899 */                   map2.put("error", "limit exceeded: ".concat(String.valueOf(length)));
/* 904 */                   aFb1rSDK.getMonetizationNetwork.put(str, map2);
/* 29 */                    return null;
                        case 2:
/* 770 */                   return getMonetizationNetwork(objArr);
                        case 3:
/* 744 */                   AFa1ySDK aFa1ySDK2 = (AFa1ySDK) objArr[0];
/* 748 */                   String[] strArr = (String[]) objArr[1];
/* 756 */                   f3077i = (AFKeystoreWrapper + 19) % 128;
/* 758 */                   aFa1ySDK2.setSharingFilterForPartners(strArr);
/* 767 */                   f3077i = (AFKeystoreWrapper + 21) % 128;
/* 29 */                    return null;
                        case 4:
/* 737 */                   return getCurrencyIso4217Code(objArr);
                        case 5:
/* 707 */                   AFa1ySDK aFa1ySDK3 = (AFa1ySDK) objArr[0];
/* 711 */                   Context context = (Context) objArr[1];
/* 715 */                   String str2 = (String) objArr[2];
/* 723 */                   f3077i = (AFKeystoreWrapper + 77) % 128;
/* 725 */                   aFa1ySDK3.start(context, str2, null);
/* 734 */                   AFKeystoreWrapper = (f3077i + 65) % 128;
/* 29 */                    return null;
                        case 6:
/* 700 */                   return getRevenue(objArr);
                        case 7:
/* 695 */                   return AFAdRevenueData(objArr);
                        case 8:
/* 628 */                   AFa1ySDK aFa1ySDK4 = (AFa1ySDK) objArr[0];
/* 632 */                   String str3 = (String) objArr[1];
/* 636 */                   int i10 = f3077i + 91;
/* 640 */                   AFKeystoreWrapper = i10 % 128;
/* 647 */                   if (i10 % 2 == 0) {
/* 684 */                       aFa1ySDK4.getMonetizationNetwork().copy().getRevenue("setCurrencyCode", str3);
/* 691 */                       AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str3);
/* 29 */                        return null;
                            }
/* 653 */                   AFd1oSDK aFd1oSDKCopy = aFa1ySDK4.getMonetizationNetwork().copy();
/* 657 */                   String[] strArr2 = new String[0];
/* 659 */                   strArr2[1] = str3;
/* 661 */                   aFd1oSDKCopy.getRevenue("setCurrencyCode", strArr2);
/* 668 */                   AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str3);
/* 29 */                    return null;
                        case 9:
/* 559 */                   AFa1ySDK aFa1ySDK5 = (AFa1ySDK) objArr[0];
/* 596 */                   AFe1aSDK aFe1aSDK = new AFe1aSDK((AFi1hSDK) objArr[1], aFa1ySDK5.getMonetizationNetwork().AFAdRevenueData(), aFa1ySDK5.getMonetizationNetwork(), aFa1ySDK5.getMonetizationNetwork().component3(), aFa1ySDK5.getMonetizationNetwork().AFInAppEventParameterName());
/* 603 */                   AFe1oSDK aFe1oSDKCopydefault = aFa1ySDK5.getMonetizationNetwork().copydefault();
/* 614 */                   aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new RunnableC02601(aFe1aSDK));
/* 623 */                   f3077i = (AFKeystoreWrapper + 77) % 128;
/* 29 */                    return null;
                        case 10:
/* 552 */                   return areAllFieldsValid(objArr);
                        case 11:
/* 547 */                   return component3(objArr);
                        case 12:
/* 479 */                   AFa1ySDK aFa1ySDK6 = (AFa1ySDK) objArr[0];
/* 485 */                   boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
/* 493 */                   aFa1ySDK6.AFAdRevenueData((Context) objArr[2]);
/* 496 */                   AFd1zSDK monetizationNetwork = aFa1ySDK6.getMonetizationNetwork();
/* 504 */                   monetizationNetwork.AFInAppEventType().getMonetizationNetwork(zBooleanValue);
/* 516 */                   monetizationNetwork.getMonetizationNetwork().submit(new RunnableC0294f(monetizationNetwork, i9));
/* 519 */                   if (zBooleanValue) {
/* 527 */                       AFKeystoreWrapper = (f3077i + 81) % 128;
/* 535 */                       monetizationNetwork.component4().AFAdRevenueData("is_stop_tracking_used", true);
/* 544 */                       f3077i = (AFKeystoreWrapper + 73) % 128;
                            }
/* 29 */                    return null;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 472 */                   return component1(objArr);
                        case 14:
/* 446 */                   AFd1zSDK aFd1zSDK = (AFd1zSDK) objArr[0];
/* 454 */                   AFKeystoreWrapper = (f3077i + 79) % 128;
/* 460 */                   aFd1zSDK.registerClient().getRevenue();
/* 469 */                   f3077i = (AFKeystoreWrapper + 121) % 128;
/* 29 */                    return null;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 439 */                   return component4(objArr);
                        case 16:
/* 434 */                   return component2(objArr);
                        case 17:
/* 393 */                   AFa1ySDK aFa1ySDK7 = (AFa1ySDK) objArr[0];
/* 397 */                   Context context2 = (Context) objArr[1];
/* 399 */                   int i11 = AFKeystoreWrapper;
/* 405 */                   f3077i = (i11 + 69) % 128;
/* 409 */                   if (context2 instanceof Activity) {
/* 423 */                       return new AFh1qSDK((Activity) context2, aFa1ySDK7.getMonetizationNetwork().mo1783w());
                            }
/* 431 */                   f3077i = (i11 + 105) % 128;
/* 29 */                    return null;
                        case 18:
/* 241 */                   AFa1ySDK aFa1ySDK8 = (AFa1ySDK) objArr[0];
/* 245 */                   Context context3 = (Context) objArr[1];
/* 249 */                   String str4 = (String) objArr[2];
/* 251 */                   aFa1ySDK8.AFAdRevenueData(context3);
/* 256 */                   AFg1sSDK aFg1sSDK = new AFg1sSDK(context3);
/* 259 */                   if (str4 == null || str4.trim().isEmpty()) {
/* 387 */                       AFLogger.INSTANCE.m1817w(AFg1cSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
/* 29 */                        return null;
                            }
/* 282 */                   AFLogger.INSTANCE.m1815i(AFg1cSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str4));
/* 285 */                   AFf1aSDK revenue = aFg1sSDK.getRevenue();
/* 289 */                   if (revenue == null || !str4.equals(revenue.getRevenue)) {
/* 299 */                       long jCurrentTimeMillis = System.currentTimeMillis();
/* 303 */                       if (revenue != null && jCurrentTimeMillis - revenue.getMonetizationNetwork <= 2000) {
/* 316 */                           i9 = 0;
                                }
/* 321 */                       AFf1aSDK aFf1aSDK = new AFf1aSDK(str4, jCurrentTimeMillis, i9 ^ 1);
/* 330 */                       aFg1sSDK.getCurrencyIso4217Code.getRevenue("afUninstallToken", aFf1aSDK.getRevenue);
/* 339 */                       aFg1sSDK.getCurrencyIso4217Code.AFAdRevenueData("afUninstallToken_received_time", aFf1aSDK.getMonetizationNetwork);
/* 348 */                       aFg1sSDK.getCurrencyIso4217Code.AFAdRevenueData("afUninstallToken_queued", aFf1aSDK.getMediationNetwork);
/* 351 */                       if (i9 != 0) {
/* 357 */                           AFd1zSDK monetizationNetwork2 = getRevenue().getMonetizationNetwork();
/* 363 */                           AFf1oSDK aFf1oSDK = new AFf1oSDK(str4, monetizationNetwork2);
/* 366 */                           AFe1oSDK aFe1oSDKCopydefault2 = monetizationNetwork2.copydefault();
/* 377 */                           aFe1oSDKCopydefault2.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault2.new RunnableC02601(aFf1oSDK));
/* 29 */                            return null;
                                }
                            }
/* 29 */                    return null;
                        case 19:
/* 234 */                   return copy(objArr);
                        case 20:
/* 88 */                    AFa1ySDK aFa1ySDK9 = (AFa1ySDK) objArr[0];
/* 92 */                    Context context4 = (Context) objArr[1];
/* 100 */                   AFj1gSDK aFj1gSDK = new AFj1gSDK((Intent) objArr[2]);
/* 109 */                   if (aFj1gSDK.AFAdRevenueData("appsflyer_preinstall") != null) {
/* 117 */                       AFKeystoreWrapper = (f3077i + 105) % 128;
/* 138 */                       getRevenue(new Object[]{aFj1gSDK.AFAdRevenueData("appsflyer_preinstall")}, -374487647, 374487663, (int) System.currentTimeMillis());
/* 147 */                       AFKeystoreWrapper = (f3077i + 29) % 128;
                            }
/* 151 */                   AFLogger.afInfoLog("****** onReceive called *******");
/* 154 */                   AppsFlyerProperties.getInstance();
/* 159 */                   String strAFAdRevenueData = aFj1gSDK.AFAdRevenueData("referrer");
/* 173 */                   AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(strAFAdRevenueData)));
/* 176 */                   if (strAFAdRevenueData != null) {
/* 182 */                       aFa1ySDK9.getMonetizationNetwork(context4).getRevenue("referrer", strAFAdRevenueData);
/* 185 */                       AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
/* 191 */                       appsFlyerProperties.set("AF_REFERRER", strAFAdRevenueData);
/* 194 */                       appsFlyerProperties.getRevenue = strAFAdRevenueData;
/* 204 */                       if (AppsFlyerProperties.getInstance().getMediationNetwork()) {
/* 208 */                           AFLogger.afInfoLog("onReceive: isLaunchCalled");
/* 227 */                           getRevenue(new Object[]{aFa1ySDK9, context4, AFh1tSDK.onReceive}, -268043806, 268043817, System.identityHashCode(aFa1ySDK9));
/* 230 */                           aFa1ySDK9.AFAdRevenueData(strAFAdRevenueData);
/* 29 */                            return null;
                                }
                            }
/* 29 */                    return null;
                        case io.flutter.Build.API_LEVELS.API_21 /* 21 */:
/* 55 */                    AFa1ySDK aFa1ySDK10 = (AFa1ySDK) objArr[0];
/* 59 */                    int i12 = AFKeystoreWrapper + 9;
/* 63 */                    f3077i = i12 % 128;
/* 68 */                    if (i12 % 2 == 0) {
/* 74 */                        aFa1ySDK10.setSharingFilterForPartners("all");
/* 29 */                        return null;
                            }
/* 82 */                    aFa1ySDK10.setSharingFilterForPartners("all");
/* 29 */                    return null;
                        case io.flutter.Build.API_LEVELS.API_22 /* 22 */:
/* 48 */                    return copydefault(objArr);
                        case io.flutter.Build.API_LEVELS.API_23 /* 23 */:
/* 43 */                    return hashCode(objArr);
                        case 24:
/* 38 */                    return equals(objArr);
                        default:
/* 33 */                    return getMediationNetwork(objArr);
                    }
                }

                private static /* synthetic */ Object hashCode(Object[] objArr) {
/* 4 */             AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
/* 11 */            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
/* 21 */            f3077i = (AFKeystoreWrapper + 93) % 128;
/* 41 */            aFa1ySDK.getMonetizationNetwork().copy().getRevenue("setCollectOaid", String.valueOf(zBooleanValue));
/* 50 */            getMediationNetwork(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(zBooleanValue));
/* 55 */            int i = f3077i + 89;
/* 59 */            AFKeystoreWrapper = i % 128;
/* 64 */            if (i % 2 == 0) {
/* 63 */                return null;
                    }
/* 67 */            throw null;
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void addPushNotificationDeepLinkPath(String... strArr) {
/* 3 */             int i = AFKeystoreWrapper + 83;
/* 7 */             f3077i = i % 128;
/* 12 */            if (i % 2 == 0) {
/* 65 */                getMonetizationNetwork().mo1781i().getRevenue.contains(Arrays.asList(strArr));
/* 68 */                throw null;
                    }
/* 14 */            List<String> listAsList = Arrays.asList(strArr);
/* 26 */            List<List<String>> list = getMonetizationNetwork().mo1781i().getRevenue;
/* 32 */            if (!list.contains(listAsList)) {
/* 34 */                list.add(listAsList);
                    }
/* 39 */            int i2 = AFKeystoreWrapper + 97;
/* 43 */            f3077i = i2 % 128;
/* 47 */            if (i2 % 2 == 0) {
/* 50 */                throw null;
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void anonymizeUser(boolean z) {
/* 3 */             int i = f3077i + 91;
/* 7 */             AFKeystoreWrapper = i % 128;
/* 15 */            if (i % 2 != 0) {
/* 21 */                AFd1oSDK aFd1oSDKCopy = getMonetizationNetwork().copy();
/* 26 */                String[] strArr = new String[0];
/* 33 */                strArr[1] = String.valueOf(z);
/* 35 */                aFd1oSDKCopy.getRevenue("anonymizeUser", strArr);
                    } else {
/* 62 */                getMonetizationNetwork().copy().getRevenue("anonymizeUser", String.valueOf(z));
                    }
/* 42 */            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
/* 68 */            int i2 = f3077i + 35;
/* 72 */            AFKeystoreWrapper = i2 % 128;
/* 76 */            if (i2 % 2 != 0) {
/* 80 */                throw null;
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
/* 3 */             int i = AFKeystoreWrapper + 53;
/* 7 */             f3077i = i % 128;
/* 11 */            if (i % 2 == 0) {
/* 17 */                AFa1mSDK aFa1mSDKMo1781i = getMonetizationNetwork().mo1781i();
/* 21 */                aFa1mSDKMo1781i.getMonetizationNetwork = str;
/* 23 */                aFa1mSDKMo1781i.getMediationNetwork = map;
/* 27 */                int i2 = 47 / 0;
                    } else {
/* 34 */                AFa1mSDK aFa1mSDKMo1781i2 = getMonetizationNetwork().mo1781i();
/* 38 */                aFa1mSDKMo1781i2.getMonetizationNetwork = str;
/* 40 */                aFa1mSDKMo1781i2.getMediationNetwork = map;
                    }
/* 48 */            AFKeystoreWrapper = (f3077i + 113) % 128;
                }

                /* JADX INFO: renamed from: b_ */
                public final void m1769b_(Context context, Intent intent) {
/* 15 */            getRevenue(new Object[]{this, context, intent}, -1498667330, 1498667350, System.identityHashCode(this));
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void disableAppSetId() {
/* 7 */             f3077i = (AFKeystoreWrapper + 87) % 128;
/* 18 */            getMonetizationNetwork().force().areAllFieldsValid = true;
/* 26 */            f3077i = (AFKeystoreWrapper + 111) % 128;
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void enableFacebookDeferredApplinks(boolean z) {
/* 7 */             f3077i = (AFKeystoreWrapper + 69) % 128;
/* 17 */            getMonetizationNetwork().mo1780e().getCurrencyIso4217Code(z);
/* 26 */            f3077i = (AFKeystoreWrapper + 75) % 128;
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void enableTCFDataCollection(boolean z) {
/* 3 */             int i = AFKeystoreWrapper + 43;
/* 7 */             f3077i = i % 128;
/* 13 */            if (i % 2 == 0) {
/* 19 */                getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z));
/* 23 */                int i2 = 6 / 0;
                    } else {
/* 30 */                getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z));
                    }
/* 39 */            AFKeystoreWrapper = (f3077i + 39) % 128;
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final String getAppsFlyerUID(Context context) {
/* 14 */            getMonetizationNetwork().copy().getRevenue("getAppsFlyerUID", new String[0]);
/* 18 */            if (context == null) {
/* 22 */                int i = AFKeystoreWrapper + 45;
/* 26 */                f3077i = i % 128;
/* 30 */                if (i % 2 == 0) {
/* 34 */                    int i2 = 58 / 0;
                        }
/* 17 */                return null;
                    }
/* 36 */            AFAdRevenueData(context);
/* 49 */            String currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(getMonetizationNetwork().AFAdRevenueData().getMediationNetwork);
/* 55 */            int i3 = f3077i + 117;
/* 59 */            AFKeystoreWrapper = i3 % 128;
/* 63 */            if (i3 % 2 == 0) {
/* 65 */                return currencyIso4217Code;
                    }
/* 66 */            throw null;
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final String getAttributionId(Context context) {
/* 7 */             AFKeystoreWrapper = (f3077i + 21) % 128;
/* 9 */             AFAdRevenueData(context);
/* 20 */            String strAFAdRevenueData = getMonetizationNetwork().AFAdRevenueData().AFAdRevenueData(context);
/* 26 */            int i = f3077i + 19;
/* 30 */            AFKeystoreWrapper = i % 128;
/* 34 */            if (i % 2 != 0) {
/* 38 */                int i2 = 45 / 0;
                    }
/* 40 */            return strAFAdRevenueData;
                }

                public final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK, AFh1qSDK aFh1qSDK) throws UnsupportedEncodingException {
/* 1 */             getMediationNetwork(aFh1mSDK, aFh1qSDK);
/* 16 */            if (getMonetizationNetwork().AFInAppEventType().getMediationNetwork() == null) {
/* 20 */                AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
/* 23 */                AppsFlyerRequestListener appsFlyerRequestListener = aFh1mSDK.getCurrencyIso4217Code;
/* 25 */                if (appsFlyerRequestListener != null) {
/* 33 */                    f3077i = (AFKeystoreWrapper + 5) % 128;
/* 39 */                    appsFlyerRequestListener.onError(41, "No dev key");
/* 42 */                    return;
                        }
/* 42 */                return;
                    }
/* 55 */            String referrer = AppsFlyerProperties.getInstance().getReferrer(getMonetizationNetwork().component4());
/* 59 */            if (referrer == null) {
/* 61 */                referrer = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
/* 70 */                f3077i = (AFKeystoreWrapper + 65) % 128;
                    }
/* 72 */            aFh1mSDK.component1 = referrer;
/* 74 */            AFAdRevenueData(aFh1mSDK);
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final String getHostName() {
/* 3 */             int i = f3077i + 29;
/* 7 */             AFKeystoreWrapper = i % 128;
/* 9 */             int i2 = i % 2;
/* 19 */            String strAFAdRevenueData = getMonetizationNetwork().AFKeystoreWrapper().AFAdRevenueData();
/* 23 */            if (i2 != 0) {
/* 27 */                int i3 = 24 / 0;
                    }
/* 29 */            return strAFAdRevenueData;
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final String getHostPrefix() {
/* 3 */             int i = f3077i + 17;
/* 7 */             AFKeystoreWrapper = i % 128;
/* 9 */             int i2 = i % 2;
/* 15 */            AFe1vSDK aFe1vSDKAFKeystoreWrapper = getMonetizationNetwork().AFKeystoreWrapper();
/* 19 */            if (i2 == 0) {
/* 21 */                return aFe1vSDKAFKeystoreWrapper.getCurrencyIso4217Code();
                    }
/* 26 */            aFe1vSDKAFKeystoreWrapper.getCurrencyIso4217Code();
/* 30 */            throw null;
                }

                public final void getMediationNetwork(AFh1mSDK aFh1mSDK) throws UnsupportedEncodingException {
/* 9 */             Context context = getMonetizationNetwork().AFInAppEventParameterName().getMonetizationNetwork;
/* 11 */            boolean z = true;
/* 12 */            if (context == null) {
/* 20 */                AFLogger.INSTANCE.mo1747d(AFg1cSDK.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", true);
/* 23 */                return;
                    }
/* 32 */            String mediationNetwork = getMonetizationNetwork().AFInAppEventType().getMediationNetwork();
/* 36 */            AppsFlyerRequestListener appsFlyerRequestListener = aFh1mSDK.getCurrencyIso4217Code;
/* 38 */            if (mediationNetwork != null) {
/* 42 */                int i = AFKeystoreWrapper + 49;
/* 46 */                f3077i = i % 128;
/* 50 */                if (i % 2 == 0) {
/* 296 */                   throw null;
                        }
/* 56 */                if (mediationNetwork.length() != 0) {
/* 60 */                    AFc1qSDK monetizationNetwork = getMonetizationNetwork(context);
/* 68 */                    AppsFlyerProperties.getInstance().saveProperties(monetizationNetwork);
/* 83 */                    if (!getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code()) {
/* 103 */                       AFLogger.INSTANCE.mo1749i(AFg1cSDK.GENERAL, "sendWithEvent from activity: ".concat(context.getClass().getName()), true);
                            }
/* 106 */                   boolean revenue = aFh1mSDK.getRevenue();
/* 110 */                   Map<String, ?> monetizationNetwork2 = getMonetizationNetwork(aFh1mSDK);
/* 126 */                   if (getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code()) {
/* 134 */                       AFKeystoreWrapper = (f3077i + 31) % 128;
/* 142 */                       AFLogger.INSTANCE.m1815i(AFg1cSDK.GENERAL, "AppsFlyerLib.sendWithEvent");
                            }
/* 146 */                   int currencyIso4217Code = getCurrencyIso4217Code(monetizationNetwork, false);
/* 150 */                   getRevenue(monetizationNetwork2);
/* 179 */                   AFa1tSDK aFa1tSDK = new AFa1tSDK(getMonetizationNetwork(), aFh1mSDK.AFAdRevenueData(monetizationNetwork2).AFAdRevenueData(currencyIso4217Code), getMonetizationNetwork().mo1780e().getMediationNetwork());
/* 182 */                   if (revenue) {
/* 189 */                       boolean z2 = false;
/* 190 */                       for (AFj1tSDK aFj1tSDK : component3()) {
/* 198 */                           if (aFj1tSDK.component4 == AFj1tSDK.AFa1tSDK.STARTED) {
/* 200 */                               AFLogger aFLogger = AFLogger.INSTANCE;
/* 202 */                               AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
/* 208 */                               StringBuilder sb = new StringBuilder("Failed to get ");
/* 213 */                               sb.append(aFj1tSDK.component3);
/* 218 */                               sb.append(" referrer, wait ...");
/* 225 */                               aFLogger.m1810d(aFg1cSDK, sb.toString());
/* 228 */                               z2 = true;
                                    }
                                }
/* 244 */                       if (getMonetizationNetwork().mo1780e().AFAdRevenueData()) {
/* 252 */                           AFLogger.INSTANCE.m1810d(AFg1cSDK.REFERRER, "fetching Facebook deferred AppLink data, wait ...");
/* 255 */                           z2 = true;
                                }
/* 268 */                       if (!getMonetizationNetwork().AFInAppEventType().getMonetizationNetwork()) {
/* 271 */                           z = z2;
                                }
                            } else {
/* 273 */                       z = false;
                            }
/* 291 */                   AFj1aSDK.getCurrencyIso4217Code(getMonetizationNetwork().getMediationNetwork(), aFa1tSDK, z ? 500L : 0L, TimeUnit.MILLISECONDS);
/* 294 */                   return;
                        }
                    }
/* 297 */           AFLogger aFLogger2 = AFLogger.INSTANCE;
/* 299 */           AFg1cSDK aFg1cSDK2 = AFg1cSDK.GENERAL;
/* 303 */           aFLogger2.mo1749i(aFg1cSDK2, "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ", true);
/* 308 */           aFLogger2.mo1749i(aFg1cSDK2, "AppsFlyer will not track this event.", true);
/* 311 */           if (appsFlyerRequestListener != null) {
/* 317 */               appsFlyerRequestListener.onError(41, "No dev key");
                    }
/* 326 */           AFKeystoreWrapper = (f3077i + 35) % 128;
                }

                public final Map<String, Object> getMonetizationNetwork(AFh1mSDK aFh1mSDK) throws UnsupportedEncodingException {
                    String str;
/* 9 */             Context context = getMonetizationNetwork().AFInAppEventParameterName().getMonetizationNetwork;
/* 11 */            AFc1qSDK monetizationNetwork = getMonetizationNetwork(context);
/* 19 */            AFg1nSDK aFg1nSDKComponent3 = getMonetizationNetwork().component3();
/* 31 */            boolean currencyIso4217Code = getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code();
/* 35 */            boolean revenue = aFh1mSDK.getRevenue();
/* 39 */            Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
/* 46 */            long time = new Date().getTime();
/* 54 */            boolean z = false;
/* 62 */            Object[] objArr = new Object[1];
/* 67 */            m1758a("\u0089\u0086\u0081\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, null, TextUtils.indexOf((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET, '0', 0, 0) + 128, objArr);
/* 82 */            map.put(((String) objArr[0]).intern(), Long.toString(time));
                    try {
/* 85 */                if (currencyIso4217Code) {
/* 89 */                    int i = f3077i + 63;
/* 93 */                    AFKeystoreWrapper = i % 128;
/* 99 */                    if (i % 2 != 0) {
/* 105 */                       AFLogger.INSTANCE.mo1749i(AFg1cSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", false);
                            } else {
/* 118 */                       AFLogger.INSTANCE.mo1749i(AFg1cSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", true);
                            }
                        } else {
/* 122 */                   AFLogger aFLogger = AFLogger.INSTANCE;
/* 124 */                   AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
/* 130 */                   StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
/* 133 */                   if (revenue) {
/* 137 */                       int i2 = f3077i + 105;
/* 141 */                       AFKeystoreWrapper = i2 % 128;
/* 145 */                       if (i2 % 2 != 0) {
/* 149 */                           int i3 = 15 / 0;
                                }
/* 150 */                       str = "Launch";
                            } else {
/* 153 */                       str = aFh1mSDK.areAllFieldsValid;
                            }
/* 155 */                   sb.append(str);
/* 162 */                   aFLogger.mo1749i(aFg1cSDK, sb.toString(), true);
/* 171 */                   f3077i = (AFKeystoreWrapper + 71) % 128;
                        }
/* 188 */               getRevenue(new Object[]{context}, 750744286, -750744267, (int) System.currentTimeMillis());
/* 191 */               int currencyIso4217Code2 = getCurrencyIso4217Code(monetizationNetwork, revenue);
/* 197 */               if (aFh1mSDK.areAllFieldsValid != null) {
/* 201 */                   int i4 = f3077i + 75;
/* 205 */                   AFKeystoreWrapper = i4 % 128;
/* 209 */                   if (i4 % 2 == 0) {
/* 212 */                       z = true;
                            }
                        }
/* 213 */               int revenue2 = getRevenue(monetizationNetwork, z);
/* 217 */               if (revenue && currencyIso4217Code2 == 1) {
/* 225 */                   AppsFlyerProperties.getInstance().getCurrencyIso4217Code = true;
                        }
/* 227 */               aFg1nSDKComponent3.getCurrencyIso4217Code(map, currencyIso4217Code2, revenue2);
/* 230 */               return map;
                    } catch (Throwable th) {
/* 240 */               AFLogger.INSTANCE.m1814e(AFg1cSDK.GENERAL, "Error while preparing to send event", th, true, true, true);
/* 243 */               return map;
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final String getOutOfStore(Context context) {
/* 7 */             String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
/* 12 */            if (string != null) {
/* 16 */                int i = AFKeystoreWrapper + 99;
/* 20 */                f3077i = i % 128;
/* 24 */                if (i % 2 != 0) {
/* 26 */                    return string;
                        }
/* 27 */                throw null;
                    }
/* 30 */            String currencyIso4217Code = getCurrencyIso4217Code(context, "AF_STORE");
/* 34 */            if (currencyIso4217Code != null) {
/* 42 */                f3077i = (AFKeystoreWrapper + 51) % 128;
/* 44 */                return currencyIso4217Code;
                    }
/* 47 */            AFLogger.afInfoLog("No out-of-store value set");
/* 11 */            return null;
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final String getSdkVersion() {
/* 3 */             int i = f3077i + 9;
/* 7 */             AFKeystoreWrapper = i % 128;
/* 13 */            if (i % 2 != 0) {
/* 26 */                getMonetizationNetwork().copy().getRevenue("getSdkVersion", new String[1]);
                    } else {
/* 45 */                getMonetizationNetwork().copy().getRevenue("getSdkVersion", new String[0]);
                    }
/* 29 */            String strComponent4 = AFc1oSDK.component4();
/* 55 */            AFKeystoreWrapper = (f3077i + 87) % 128;
/* 57 */            return strComponent4;
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
                    String str2;
/* 3 */             if (this.hashCode) {
/* 11 */                AFKeystoreWrapper = (f3077i + 123) % 128;
/* 13 */                return this;
                    }
/* 14 */            final int i = 1;
/* 15 */            this.hashCode = true;
/* 25 */            getMonetizationNetwork().AFInAppEventType().AFAdRevenueData(str);
/* 28 */            if (context != null) {
/* 30 */                AFAdRevenueData(context);
/* 33 */                Application applicationM1832O_ = AFj1kSDK.m1832O_(context);
/* 37 */                if (applicationM1832O_ == null) {
/* 291 */                   return this;
                        }
/* 39 */                int i2 = f3077i;
/* 41 */                int i3 = i2 + 77;
/* 45 */                AFKeystoreWrapper = i3 % 128;
/* 49 */                if (i3 % 2 != 0) {
/* 287 */                   this.component2 = applicationM1832O_;
/* 290 */                   throw null;
                        }
/* 51 */                this.component2 = applicationM1832O_;
/* 57 */                AFKeystoreWrapper = (i2 + 91) % 128;
/* 69 */                final int i4 = 0;
/* 73 */                getMonetizationNetwork().getMonetizationNetwork().execute(new Runnable(this) { // from class: com.appsflyer.internal.b

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ AFa1ySDK f3099b;

                            {
/* 3 */                         this.f3099b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() throws UnsupportedEncodingException {
/* 1 */                         int i5 = i4;
/* 3 */                         AFa1ySDK aFa1ySDK = this.f3099b;
                                switch (i5) {
                                    case 0:
/* 1 */                                 aFa1ySDK.copy();
                                        break;
                                    default:
/* 1 */                                 aFa1ySDK.equals();
                                        break;
                                }
                            }
                        });
/* 80 */                AFe1oSDK aFe1oSDKCopydefault = getMonetizationNetwork().copydefault();
/* 100 */               aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new RunnableC02601(new AFe1eSDK(getMonetizationNetwork())));
/* 116 */               getMonetizationNetwork().afErrorLogForExcManagerOnly().getMonetizationNetwork(new C0291c(this));
/* 131 */               getMonetizationNetwork().component1().AFAdRevenueData(AFAdRevenueData());
/* 138 */               AFj1sSDK aFj1sSDKAFLogger = getMonetizationNetwork().AFLogger();
/* 144 */               Runnable runnable = new Runnable(this) { // from class: com.appsflyer.internal.b

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ AFa1ySDK f3099b;

                            {
/* 3 */                         this.f3099b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() throws UnsupportedEncodingException {
/* 1 */                         int i5 = i;
/* 3 */                         AFa1ySDK aFa1ySDK = this.f3099b;
                                switch (i5) {
                                    case 0:
/* 1 */                                 aFa1ySDK.copy();
                                        break;
                                    default:
/* 1 */                                 aFa1ySDK.equals();
                                        break;
                                }
                            }
                        };
/* 147 */               AFi1aSDK currencyIso4217Code = aFj1sSDKAFLogger.getCurrencyIso4217Code(runnable);
/* 151 */               Runnable runnableAFAdRevenueData = aFj1sSDKAFLogger.AFAdRevenueData(currencyIso4217Code, runnable);
/* 157 */               aFj1sSDKAFLogger.getRevenue.add(currencyIso4217Code);
/* 173 */               aFj1sSDKAFLogger.getRevenue.add(new AFj1oSDK(aFj1sSDKAFLogger.getCurrencyIso4217Code.AFAdRevenueData(), runnableAFAdRevenueData));
/* 190 */               aFj1sSDKAFLogger.getRevenue.add(new AFj1wSDK(runnableAFAdRevenueData, aFj1sSDKAFLogger.getCurrencyIso4217Code, new AFj1xSDK()));
/* 202 */               aFj1sSDKAFLogger.getRevenue.add(new AFj1mSDK(runnableAFAdRevenueData, aFj1sSDKAFLogger.getCurrencyIso4217Code));
/* 224 */               aFj1sSDKAFLogger.getRevenue.add(new AFj1rSDK(aFj1sSDKAFLogger.getCurrencyIso4217Code.getMonetizationNetwork(), aFj1sSDKAFLogger.getCurrencyIso4217Code.AFAdRevenueData(), runnableAFAdRevenueData));
/* 227 */               aFj1sSDKAFLogger.getMediationNetwork(runnableAFAdRevenueData);
/* 238 */               AFj1tSDK[] aFj1tSDKArr = (AFj1tSDK[]) aFj1sSDKAFLogger.getRevenue.toArray(new AFj1tSDK[0]);
/* 240 */               int length = aFj1tSDKArr.length;
/* 241 */               while (i4 < length) {
/* 253 */                   aFj1tSDKArr[i4].getMonetizationNetwork(aFj1sSDKAFLogger.getCurrencyIso4217Code.AFInAppEventParameterName().getMonetizationNetwork);
/* 256 */                   i4++;
                        }
/* 263 */               if (!aFj1sSDKAFLogger.getCurrencyIso4217Code()) {
/* 271 */                   AFKeystoreWrapper = (f3077i + 67) % 128;
/* 283 */                   aFj1sSDKAFLogger.getRevenue(aFj1sSDKAFLogger.getCurrencyIso4217Code.AFInAppEventParameterName().getMonetizationNetwork, runnableAFAdRevenueData, aFj1sSDKAFLogger.getCurrencyIso4217Code);
                        }
                    } else {
/* 298 */               AFLogger.INSTANCE.m1817w(AFg1cSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
                    }
/* 305 */           AFd1oSDK aFd1oSDKCopy = getMonetizationNetwork().copy();
/* 309 */           if (appsFlyerConversionListener == null) {
/* 317 */               AFKeystoreWrapper = (f3077i + 87) % 128;
/* 319 */               str2 = "null";
                    } else {
/* 322 */               str2 = "conversionDataListener";
                    }
/* 330 */           aFd1oSDKCopy.getRevenue("init", str, str2);
/* 358 */           AFLogger.INSTANCE.force(AFg1cSDK.GENERAL, "Initializing AppsFlyer SDK: (v6.17.6." + getMonetizationNetwork + ")");
/* 361 */           this.getRevenue = appsFlyerConversionListener;
/* 363 */           return this;
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final boolean isPreInstalledApp(Context context) {
/* 3 */             int i = f3077i + 77;
/* 7 */             AFKeystoreWrapper = i % 128;
/* 11 */            if (i % 2 == 0) {
/* 13 */                AFAdRevenueData(context);
/* 24 */                return getMonetizationNetwork().AFAdRevenueData().getMonetizationNetwork(context);
                    }
/* 29 */            AFAdRevenueData(context);
/* 40 */            getMonetizationNetwork().AFAdRevenueData().getMonetizationNetwork(context);
/* 44 */            throw null;
                }

                @Override // com.appsflyer.AppsFlyerLib
                @Deprecated
                public final boolean isStopped() {
/* 3 */             int i = f3077i + 123;
/* 7 */             AFKeystoreWrapper = i % 128;
/* 9 */             int i2 = i % 2;
/* 19 */            boolean currencyIso4217Code = getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code();
/* 23 */            if (i2 != 0) {
/* 27 */                int i3 = 45 / 0;
                    }
/* 35 */            f3077i = (AFKeystoreWrapper + 55) % 128;
/* 37 */            return currencyIso4217Code;
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void logAdRevenue(AFAdRevenueData aFAdRevenueData, Map<String, Object> map) throws UnsupportedEncodingException {
/* 3 */             if (!this.hashCode) {
/* 7 */                 getRevenue("logAdRevenue");
/* 10 */                return;
                    }
/* 15 */            if (!aFAdRevenueData.areAllFieldsValid()) {
/* 23 */                f3077i = (AFKeystoreWrapper + 91) % 128;
/* 31 */                AFLogger.INSTANCE.m1817w(AFg1cSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
                    } else if (getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code()) {
/* 55 */                AFLogger.INSTANCE.m1817w(AFg1cSDK.AD_REVENUE, "SDK is stopped");
                    } else if (!AFk1wSDK.getMonetizationNetwork(getMonetizationNetwork().AFInAppEventType().getMediationNetwork())) {
/* 108 */               AFAdRevenueData(new AFh1lSDK(aFAdRevenueData, map));
                    } else {
/* 83 */                f3077i = (AFKeystoreWrapper + 23) % 128;
/* 99 */                getRevenue(new Object[0], -516060765, 516060769, (int) System.currentTimeMillis());
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) throws UnsupportedEncodingException {
/* 7 */             HashMap map2 = map == null ? null : new HashMap(map);
/* 11 */            AFAdRevenueData(context);
/* 16 */            AFh1hSDK aFh1hSDK = new AFh1hSDK();
/* 19 */            aFh1hSDK.areAllFieldsValid = str;
/* 21 */            aFh1hSDK.getCurrencyIso4217Code = appsFlyerRequestListener;
/* 23 */            if (map2 != null && map2.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
/* 35 */                HashMap map3 = new HashMap();
/* 38 */                Object obj = map2.get(AFInAppEventParameterName.TOUCH_OBJ);
/* 44 */                if (obj instanceof MotionEvent) {
/* 46 */                    MotionEvent motionEvent = (MotionEvent) obj;
/* 50 */                    HashMap map4 = new HashMap();
/* 63 */                    map4.put("x", Float.valueOf(motionEvent.getX()));
/* 76 */                    map4.put("y", Float.valueOf(motionEvent.getY()));
/* 81 */                    map3.put("loc", map4);
/* 94 */                    map3.put("pf", Float.valueOf(motionEvent.getPressure()));
/* 110 */                   map3.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
                        } else {
/* 118 */                   map3.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
/* 126 */                   AFLogger.INSTANCE.mo1751w(AFg1cSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
                        }
/* 131 */               Map<String, ?> mapSingletonMap = Collections.singletonMap("tch_data", map3);
/* 135 */               map2.remove(AFInAppEventParameterName.TOUCH_OBJ);
/* 138 */               aFh1hSDK.AFAdRevenueData(mapSingletonMap);
                    }
/* 141 */           aFh1hSDK.getRevenue = map2;
/* 147 */           AFd1oSDK aFd1oSDKCopy = getMonetizationNetwork().copy();
/* 153 */           Map map5 = aFh1hSDK.getRevenue;
/* 155 */           if (map5 == null) {
/* 159 */               map5 = new HashMap();
                    }
/* 175 */           aFd1oSDKCopy.getRevenue("logEvent", str, new JSONObject(map5).toString());
/* 178 */           if (str == null) {
/* 196 */               getRevenue(new Object[]{this, context, AFh1tSDK.logEvent}, -268043806, 268043817, System.identityHashCode(this));
                    }
/* 219 */           getCurrencyIso4217Code(aFh1hSDK, (AFh1qSDK) getRevenue(new Object[]{this, context}, 348348548, -348348531, System.identityHashCode(this)));
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void logLocation(Context context, double d, double d2) throws UnsupportedEncodingException {
/* 23 */            getMonetizationNetwork().copy().getRevenue("logLocation", String.valueOf(d), String.valueOf(d2));
/* 28 */            HashMap map = new HashMap();
/* 37 */            map.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d2));
/* 46 */            map.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
/* 51 */            AFAdRevenueData(context, AFInAppEventType.LOCATION_COORDINATES, map);
/* 60 */            AFKeystoreWrapper = (f3077i + 3) % 128;
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void logSession(Context context) throws UnsupportedEncodingException {
/* 7 */             f3077i = (AFKeystoreWrapper + 15) % 128;
/* 22 */            getMonetizationNetwork().copy().getRevenue("logSession", new String[0]);
/* 33 */            getMonetizationNetwork().copy().getCurrencyIso4217Code();
/* 52 */            getRevenue(new Object[]{this, context, AFh1tSDK.logSession}, -268043806, 268043817, System.identityHashCode(this));
/* 56 */            AFAdRevenueData(context, null, null);
/* 61 */            int i = AFKeystoreWrapper + 33;
/* 65 */            f3077i = i % 128;
/* 69 */            if (i % 2 == 0) {
/* 73 */                int i2 = 69 / 0;
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void onPause(Context context) {
/* 15 */            getRevenue(new Object[]{this, context}, 537134056, -537134032, System.identityHashCode(this));
                }

                @Override // com.appsflyer.AppsFlyerLib
                @Deprecated
                public final void performOnAppAttribution(Context context, URI uri) {
/* 3 */             if (uri != null) {
/* 11 */                AFKeystoreWrapper = (f3077i + 5) % 128;
/* 21 */                if (!uri.toString().isEmpty()) {
/* 24 */                    if (context == null) {
/* 30 */                        AFa1mSDK aFa1mSDKMo1781i = getMonetizationNetwork().mo1781i();
/* 38 */                        StringBuilder sb = new StringBuilder("Context is \"");
/* 41 */                        sb.append(context);
/* 44 */                        sb.append("\"");
/* 53 */                        aFa1mSDKMo1781i.getMediationNetwork(sb.toString(), DeepLinkResult.Error.NETWORK);
/* 56 */                        return;
                            }
/* 57 */                    AFAdRevenueData(context);
/* 88 */                    getMonetizationNetwork().mo1781i().m1755g_(AFa1jSDK.getMediationNetwork(getMonetizationNetwork().afVerboseLog()), Uri.parse(uri.toString()));
/* 93 */                    int i = f3077i + 73;
/* 97 */                    AFKeystoreWrapper = i % 128;
/* 101 */                   if (i % 2 != 0) {
/* 105 */                       throw null;
                            }
/* 103 */                   return;
                        }
                    }
/* 110 */           AFa1mSDK aFa1mSDKMo1781i2 = getMonetizationNetwork().mo1781i();
/* 118 */           StringBuilder sb2 = new StringBuilder("Link is \"");
/* 121 */           sb2.append(uri);
/* 124 */           sb2.append("\"");
/* 133 */           aFa1mSDKMo1781i2.getMediationNetwork(sb2.toString(), DeepLinkResult.Error.NETWORK);
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void performOnDeepLinking(Intent intent, Context context) {
/* 1 */             if (intent == null) {
/* 9 */                 AFKeystoreWrapper = (f3077i + 15) % 128;
/* 23 */                getMonetizationNetwork().mo1781i().getMediationNetwork("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
/* 26 */                return;
                    }
/* 28 */            if (context == null) {
/* 32 */                int i = f3077i + 115;
/* 36 */                AFKeystoreWrapper = i % 128;
/* 42 */                if (i % 2 == 0) {
/* 54 */                    getMonetizationNetwork().mo1781i().getMediationNetwork("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
/* 57 */                    return;
                        } else {
/* 68 */                    getMonetizationNetwork().mo1781i().getMediationNetwork("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
/* 71 */                    throw null;
                        }
                    }
/* 72 */            Context applicationContext = context.getApplicationContext();
/* 76 */            AFAdRevenueData(applicationContext);
/* 94 */            getMonetizationNetwork().getMonetizationNetwork().execute(new RunnableC2558zo(16, this, applicationContext, intent));
/* 99 */            int i2 = f3077i + 121;
/* 103 */           AFKeystoreWrapper = i2 % 128;
/* 107 */           if (i2 % 2 != 0) {
/* 110 */               throw null;
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
/* 7 */             AFKeystoreWrapper = (f3077i + 23) % 128;
/* 22 */            getMonetizationNetwork().copy().getRevenue("registerConversionListener", new String[0]);
/* 25 */            getRevenue(appsFlyerConversionListener);
/* 34 */            f3077i = (AFKeystoreWrapper + 77) % 128;
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
                
                    com.appsflyer.internal.AFa1ySDK.getCurrencyIso4217Code = r4;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
                
                    if (r4 == null) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
                
                    if (r4 == null) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
                
                    com.appsflyer.AFLogger.afDebugLog("registerValidatorListener null listener");
                    com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = (com.appsflyer.internal.AFa1ySDK.f3077i + 113) % 128;
                 */
                @Override // com.appsflyer.AppsFlyerLib
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
/* 3 */             int i = AFKeystoreWrapper + 7;
/* 7 */             f3077i = i % 128;
/* 15 */            if (i % 2 == 0) {
/* 28 */                getMonetizationNetwork().copy().getRevenue("registerValidatorListener", new String[1]);
/* 31 */                AFLogger.afDebugLog("registerValidatorListener called");
                    } else {
/* 48 */                getMonetizationNetwork().copy().getRevenue("registerValidatorListener", new String[0]);
/* 51 */                AFLogger.afDebugLog("registerValidatorListener called");
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
/* 15 */            getRevenue(new Object[]{this, context, map, purchaseValidationCallback}, 1567165248, -1567165246, System.identityHashCode(this));
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
/* 7 */             AFKeystoreWrapper = (f3077i + 63) % 128;
/* 9 */             AFAdRevenueData(context);
/* 16 */            PurchaseHandler purchaseHandlerComponent2 = getMonetizationNetwork().component2();
/* 30 */            if (purchaseHandlerComponent2.getRevenue(map, purchaseValidationCallback, "subscriptions")) {
/* 36 */                AFe1kSDK aFe1kSDK = new AFe1kSDK(map, purchaseValidationCallback, purchaseHandlerComponent2.AFAdRevenueData);
/* 39 */                AFe1oSDK aFe1oSDK = purchaseHandlerComponent2.getCurrencyIso4217Code;
/* 48 */                aFe1oSDK.getCurrencyIso4217Code.execute(aFe1oSDK.new RunnableC02601(aFe1kSDK));
/* 57 */                AFKeystoreWrapper = (f3077i + 43) % 128;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:46:0x016d  */
                @Override // com.appsflyer.AppsFlyerLib
                public final void sendPushNotificationData(Activity activity) {
                    long j;
                    long jLongValue;
/* 9 */             if (activity != null && activity.getIntent() != null) {
/* 21 */                AFd1oSDK aFd1oSDKCopy = getMonetizationNetwork().copy();
/* 25 */                String localClassName = activity.getLocalClassName();
/* 33 */                StringBuilder sb = new StringBuilder("activity_intent_");
/* 44 */                sb.append(activity.getIntent().toString());
/* 55 */                aFd1oSDKCopy.getRevenue("sendPushNotificationData", localClassName, sb.toString());
                    } else if (activity != null) {
/* 67 */                f3077i = (AFKeystoreWrapper + 55) % 128;
/* 87 */                getMonetizationNetwork().copy().getRevenue("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
                    } else {
/* 105 */               getMonetizationNetwork().copy().getRevenue("sendPushNotificationData", "activity_null");
/* 114 */               f3077i = (AFKeystoreWrapper + 119) % 128;
                    }
/* 120 */           AFc1eSDK aFc1eSDKForce = getMonetizationNetwork().force();
/* 124 */           String revenue = getRevenue(activity);
/* 128 */           aFc1eSDKForce.getMonetizationNetwork = revenue;
/* 130 */           if (revenue != null) {
/* 132 */               long jCurrentTimeMillis = System.currentTimeMillis();
/* 140 */               if (this.copydefault == null) {
/* 144 */                   AFLogger.afInfoLog("pushes: initializing pushes history..");
/* 152 */                   this.copydefault = new ConcurrentHashMap();
/* 154 */                   jLongValue = jCurrentTimeMillis;
/* 155 */                   j = jLongValue;
                        } else {
                            try {
/* 168 */                       long j2 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
/* 182 */                       jLongValue = jCurrentTimeMillis;
/* 187 */                       for (Long l : this.copydefault.keySet()) {
                                    try {
/* 199 */                               JSONObject jSONObject = new JSONObject(aFc1eSDKForce.getMonetizationNetwork);
/* 212 */                               JSONObject jSONObject2 = new JSONObject(this.copydefault.get(l));
/* 219 */                               j = jCurrentTimeMillis;
                                        try {
/* 229 */                                   if (jSONObject.opt("pid").equals(jSONObject2.opt("pid")) && jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
/* 249 */                                       StringBuilder sb2 = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ");
/* 252 */                                       sb2.append(jSONObject2);
/* 257 */                                       sb2.append(", new: ");
/* 260 */                                       sb2.append(jSONObject);
/* 263 */                                       sb2.append(")");
/* 270 */                                       AFLogger.afInfoLog(sb2.toString());
/* 274 */                                       aFc1eSDKForce.getMonetizationNetwork = null;
/* 276 */                                       return;
                                            }
/* 287 */                                   if (j - l.longValue() > j2) {
/* 295 */                                       AFKeystoreWrapper = (f3077i + 69) % 128;
/* 299 */                                       this.copydefault.remove(l);
                                            }
/* 308 */                                   if (l.longValue() <= jLongValue) {
/* 310 */                                       jLongValue = l.longValue();
                                            }
/* 314 */                                   jCurrentTimeMillis = j;
                                        } catch (Throwable th) {
/* 277 */                                   th = th;
/* 344 */                                   AFLogger.afErrorLog("Error while handling push notification measurement: ".concat(th.getClass().getSimpleName()), th);
/* 364 */                                   if (this.copydefault.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
/* 370 */                                       StringBuilder sb3 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
/* 373 */                                       sb3.append(jLongValue);
/* 376 */                                       sb3.append(")");
/* 383 */                                       AFLogger.afInfoLog(sb3.toString());
/* 392 */                                       this.copydefault.remove(Long.valueOf(jLongValue));
                                            }
/* 403 */                                   this.copydefault.put(Long.valueOf(j), aFc1eSDKForce.getMonetizationNetwork);
/* 406 */                                   start(activity);
                                        }
                                    } catch (Throwable th2) {
/* 318 */                               th = th2;
/* 319 */                               j = jCurrentTimeMillis;
                                    }
                                }
/* 322 */                       j = jCurrentTimeMillis;
                            } catch (Throwable th3) {
/* 325 */                       th = th3;
/* 326 */                       j = jCurrentTimeMillis;
/* 328 */                       jLongValue = j;
                            }
                        }
/* 364 */               if (this.copydefault.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
/* 370 */                   StringBuilder sb4 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
/* 373 */                   sb4.append(jLongValue);
/* 376 */                   sb4.append(")");
/* 383 */                   AFLogger.afInfoLog(sb4.toString());
/* 392 */                   this.copydefault.remove(Long.valueOf(jLongValue));
                        }
/* 403 */               this.copydefault.put(Long.valueOf(j), aFc1eSDKForce.getMonetizationNetwork);
/* 406 */               start(activity);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:8:0x0015  */
                @Override // com.appsflyer.AppsFlyerLib
                public final void setAdditionalData(Map<String, Object> map) {
/* 3 */             int i = f3077i + 81;
/* 7 */             AFKeystoreWrapper = i % 128;
/* 11 */            if (i % 2 != 0) {
/* 15 */                int i2 = 94 / 0;
/* 17 */                if (map != null) {
/* 40 */                    getMonetizationNetwork().copy().getRevenue("setAdditionalData", map.toString());
/* 56 */                    AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
                        }
                    } else if (map != null) {
/* 40 */                getMonetizationNetwork().copy().getRevenue("setAdditionalData", map.toString());
/* 56 */                AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
                    }
/* 65 */            AFKeystoreWrapper = (f3077i + 43) % 128;
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setAndroidIdData(String str) {
/* 7 */             f3077i = (AFKeystoreWrapper + 23) % 128;
/* 23 */            getMonetizationNetwork().copy().getRevenue("setAndroidIdData", str);
/* 34 */            getMonetizationNetwork().force().getCurrencyIso4217Code = str;
/* 42 */            AFKeystoreWrapper = (f3077i + 29) % 128;
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setAppId(String str) {
/* 3 */             int i = f3077i + 3;
/* 7 */             AFKeystoreWrapper = i % 128;
/* 15 */            if (i % 2 != 0) {
/* 29 */                getMonetizationNetwork().copy().getRevenue("setAppId", str);
                    } else {
/* 48 */                getMonetizationNetwork().copy().getRevenue("setAppId", str);
                    }
/* 32 */            getMediationNetwork(AppsFlyerProperties.APP_ID, str);
                }

                /* JADX WARN: Code duplicated, block: B:6:0x0038  */
                @Override // com.appsflyer.AppsFlyerLib
                public final void setAppInviteOneLink(String str) {
/* 15 */            getMonetizationNetwork().copy().getRevenue("setAppInviteOneLink", str);
/* 28 */            AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
/* 33 */            if (str != null) {
/* 41 */                f3077i = (AFKeystoreWrapper + 13) % 128;
/* 55 */                if (!str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
/* 63 */                    AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
/* 72 */                    AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
/* 81 */                    AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
/* 90 */                    AFKeystoreWrapper = (f3077i + ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE) % 128;
                        }
                    } else {
/* 63 */                AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
/* 72 */                AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
/* 81 */                AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
/* 90 */                AFKeystoreWrapper = (f3077i + ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE) % 128;
                    }
/* 92 */            getMediationNetwork(AppsFlyerProperties.ONELINK_ID, str);
/* 101 */           f3077i = (AFKeystoreWrapper + 9) % 128;
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setCollectAndroidID(boolean z) {
/* 7 */             AFKeystoreWrapper = (f3077i + 57) % 128;
/* 27 */            getMonetizationNetwork().copy().getRevenue("setCollectAndroidID", String.valueOf(z));
/* 36 */            getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
/* 45 */            getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
/* 54 */            f3077i = (AFKeystoreWrapper + 13) % 128;
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setCollectIMEI(boolean z) {
/* 19 */            getRevenue(new Object[]{this, Boolean.valueOf(z)}, -312979490, 312979496, System.identityHashCode(this));
                }

                @Override // com.appsflyer.AppsFlyerLib
                @Deprecated
                public final void setCollectOaid(boolean z) {
/* 19 */            getRevenue(new Object[]{this, Boolean.valueOf(z)}, -1241724786, 1241724809, System.identityHashCode(this));
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setConsentData(AppsFlyerConsent appsFlyerConsent) {
/* 3 */             int i = f3077i + 41;
/* 7 */             AFKeystoreWrapper = i % 128;
/* 11 */            if (i % 2 == 0) {
/* 13 */                Objects.requireNonNull(appsFlyerConsent);
/* 24 */                getMonetizationNetwork().force().component1 = appsFlyerConsent;
                    } else {
/* 27 */                Objects.requireNonNull(appsFlyerConsent);
/* 38 */                getMonetizationNetwork().force().component1 = appsFlyerConsent;
/* 41 */                throw null;
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setCurrencyCode(String str) {
/* 15 */            getRevenue(new Object[]{this, str}, -1717702056, 1717702064, System.identityHashCode(this));
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setCustomerIdAndLogSession(String str, Context context) throws UnsupportedEncodingException {
/* 5 */             int i = (AFKeystoreWrapper + 41) % 128;
/* 7 */             f3077i = i;
/* 9 */             if (context != null) {
/* 15 */                AFKeystoreWrapper = (i + 35) % 128;
/* 22 */                if (!getCurrencyIso4217Code()) {
/* 113 */                   setCustomerUserId(str);
/* 126 */                   AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
/* 129 */                   return;
                        }
/* 24 */                setCustomerUserId(str);
/* 31 */                StringBuilder sb = new StringBuilder("CustomerUserId set: ");
/* 34 */                sb.append(str);
/* 39 */                sb.append(" - Initializing AppsFlyer Tacking");
/* 46 */                AFLogger.afInfoLog(sb.toString(), true);
/* 61 */                String referrer = AppsFlyerProperties.getInstance().getReferrer(getMonetizationNetwork().component4());
/* 81 */                getRevenue(new Object[]{this, context, AFh1tSDK.setCustomerIdAndLogSession}, -268043806, 268043817, System.identityHashCode(this));
/* 92 */                getMonetizationNetwork().AFInAppEventType().getMediationNetwork();
/* 95 */                if (referrer == null) {
/* 97 */                    referrer = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 101 */               if (context instanceof Activity) {
/* 106 */                   ((Activity) context).getIntent();
                        }
/* 109 */               getRevenue(context, referrer);
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setCustomerUserId(String str) {
/* 7 */             f3077i = (AFKeystoreWrapper + 53) % 128;
/* 23 */            getMonetizationNetwork().copy().getRevenue("setCustomerUserId", str);
/* 36 */            AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
/* 41 */            getMediationNetwork(AppsFlyerProperties.APP_USER_ID, str);
/* 63 */            getRevenue(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, Boolean.FALSE}, -1569798316, 1569798326, (int) System.currentTimeMillis());
/* 68 */            int i = AFKeystoreWrapper + 117;
/* 72 */            f3077i = i % 128;
/* 76 */            if (i % 2 == 0) {
/* 80 */                throw null;
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setDebugLog(boolean z) {
/* 19 */            getRevenue(new Object[]{this, Boolean.valueOf(z)}, -451136324, 451136331, System.identityHashCode(this));
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setDisableAdvertisingIdentifiers(boolean z) {
                    boolean z2;
/* 11 */            AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
/* 14 */            if (z) {
/* 26 */                z2 = false;
                    } else {
/* 22 */                f3077i = (AFKeystoreWrapper + 39) % 128;
/* 24 */                z2 = true;
                    }
/* 31 */            AFb1lSDK.AFAdRevenueData = Boolean.valueOf(z2);
/* 33 */            AFd1zSDK monetizationNetwork = getMonetizationNetwork();
/* 41 */            monetizationNetwork.force().component2 = z;
/* 43 */            if (!z) {
/* 66 */                AFe1oSDK aFe1oSDKCopydefault = monetizationNetwork.copydefault();
/* 86 */                aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new RunnableC02601(new AFe1eSDK(getMonetizationNetwork())));
                    } else {
/* 50 */                monetizationNetwork.force().component3 = null;
/* 54 */                int i = AFKeystoreWrapper + 25;
/* 58 */                f3077i = i % 128;
/* 62 */                if (i % 2 == 0) {
/* 65 */                    throw null;
                        }
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setDisableNetworkData(boolean z) {
/* 7 */             f3077i = (AFKeystoreWrapper + 111) % 128;
/* 19 */            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
/* 43 */            getRevenue(new Object[]{AppsFlyerProperties.DISABLE_NETWORK_DATA, Boolean.valueOf(z)}, -1569798316, 1569798326, (int) System.currentTimeMillis());
/* 48 */            int i = f3077i + 103;
/* 52 */            AFKeystoreWrapper = i % 128;
/* 56 */            if (i % 2 != 0) {
/* 60 */                throw null;
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setExtension(String str) {
/* 7 */             AFKeystoreWrapper = (f3077i + 23) % 128;
/* 23 */            getMonetizationNetwork().copy().getRevenue("setExtension", str);
/* 32 */            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
/* 37 */            int i = AFKeystoreWrapper + 123;
/* 41 */            f3077i = i % 128;
/* 45 */            if (i % 2 == 0) {
/* 49 */                int i2 = 71 / 0;
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setHost(String str, String str2) {
                    String strTrim;
/* 5 */             if (AFk1wSDK.getCurrencyIso4217Code(str2)) {
/* 47 */                AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
/* 50 */                return;
                    }
/* 7 */             if (str != null) {
/* 9 */                 strTrim = str.trim();
/* 19 */                AFKeystoreWrapper = (f3077i + 21) % 128;
                    } else {
/* 22 */                strTrim = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 33 */            AFe1vSDK.getMonetizationNetwork(new AFe1ySDK(strTrim, str2.trim()));
/* 42 */            AFKeystoreWrapper = (f3077i + 63) % 128;
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setImeiData(String str) {
/* 3 */             int i = AFKeystoreWrapper + 57;
/* 7 */             f3077i = i % 128;
/* 19 */            if (i % 2 == 0) {
/* 33 */                getMonetizationNetwork().copy().getRevenue("setImeiData", str);
/* 40 */                AFf1eSDK aFf1eSDKAFInAppEventType = getMonetizationNetwork().AFInAppEventType();
/* 52 */                AFf1eSDK.getCurrencyIso4217Code(new Object[]{aFf1eSDKAFInAppEventType, str}, -1410448561, 1410448563, System.identityHashCode(aFf1eSDKAFInAppEventType));
                    } else {
/* 68 */                getMonetizationNetwork().copy().getRevenue("setImeiData", str);
/* 75 */                AFf1eSDK aFf1eSDKAFInAppEventType2 = getMonetizationNetwork().AFInAppEventType();
/* 87 */                AFf1eSDK.getCurrencyIso4217Code(new Object[]{aFf1eSDKAFInAppEventType2, str}, -1410448561, 1410448563, System.identityHashCode(aFf1eSDKAFInAppEventType2));
                    }
/* 96 */            f3077i = (AFKeystoreWrapper + 31) % 128;
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setInstallId(String str) {
/* 14 */            getMonetizationNetwork().copy().getRevenue("setInstallId", new String[0]);
/* 19 */            if (!this.hashCode) {
/* 27 */                f3077i = (AFKeystoreWrapper + 1) % 128;
/* 35 */                AFLogger.INSTANCE.m1810d(AFg1cSDK.GENERAL, "AppsFlyerLib.init() method should be called first");
/* 38 */                return;
                    }
/* 53 */            if (!getMonetizationNetwork().AFAdRevenueData().getMediationNetwork("APPSFLYER_ALLOW_CUSTOM_INSTALL_ID")) {
/* 61 */                f3077i = (AFKeystoreWrapper + 47) % 128;
/* 69 */                AFLogger.INSTANCE.m1810d(AFg1cSDK.GENERAL, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first");
/* 78 */                AFKeystoreWrapper = (f3077i + 109) % 128;
                    } else if (str == null) {
/* 89 */                AFLogger.INSTANCE.m1810d(AFg1cSDK.GENERAL, "AppsFlyer installId can't be null");
/* 98 */                AFKeystoreWrapper = (f3077i + 75) % 128;
                    } else {
/* 109 */               AFb1kSDK.getCurrencyIso4217Code(str, getMonetizationNetwork().component4());
/* 118 */               f3077i = (AFKeystoreWrapper + 41) % 128;
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setIsUpdate(boolean z) {
/* 7 */             AFKeystoreWrapper = (f3077i + 87) % 128;
/* 27 */            getMonetizationNetwork().copy().getRevenue("setIsUpdate", String.valueOf(z));
/* 36 */            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
/* 45 */            AFKeystoreWrapper = (f3077i + 57) % 128;
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setLogLevel(AFLogger.LogLevel logLevel) {
/* 11 */            boolean z = false;
/* 12 */            if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
/* 16 */                int i = f3077i + 79;
/* 20 */                AFKeystoreWrapper = i % 128;
/* 24 */                if (i % 2 == 0) {
/* 27 */                    z = true;
                        }
                    }
/* 46 */            getMonetizationNetwork().copy().getRevenue("log", String.valueOf(z));
/* 59 */            AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
/* 62 */            if (z) {
/* 109 */               getMonetizationNetwork().afInfoLog().areAllFieldsValid();
/* 112 */               return;
                    }
/* 66 */            int i2 = AFKeystoreWrapper + 27;
/* 70 */            f3077i = i2 % 128;
/* 74 */            if (i2 % 2 != 0) {
/* 84 */                getMonetizationNetwork().afInfoLog().getMonetizationNetwork();
                    } else {
/* 96 */                getMonetizationNetwork().afInfoLog().getMonetizationNetwork();
/* 100 */               throw null;
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setMinTimeBetweenSessions(int i) {
/* 3 */             int i2 = f3077i + 65;
/* 7 */             AFKeystoreWrapper = i2 % 128;
/* 9 */             int i3 = i2 % 2;
/* 12 */            TimeUnit timeUnit = TimeUnit.SECONDS;
/* 14 */            if (i3 != 0) {
/* 42 */                this.component4 = timeUnit.toMillis(i);
/* 44 */                throw null;
                    }
/* 21 */            this.component4 = timeUnit.toMillis(i);
/* 25 */            int i4 = AFKeystoreWrapper + 15;
/* 29 */            f3077i = i4 % 128;
/* 33 */            if (i4 % 2 == 0) {
/* 36 */                throw null;
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setOaidData(String str) {
/* 7 */             AFKeystoreWrapper = (f3077i + 77) % 128;
/* 23 */            getMonetizationNetwork().copy().getRevenue("setOaidData", str);
/* 26 */            AFb1lSDK.getMonetizationNetwork = str;
/* 30 */            int i = f3077i + 85;
/* 34 */            AFKeystoreWrapper = i % 128;
/* 38 */            if (i % 2 != 0) {
/* 42 */                throw null;
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setOneLinkCustomDomain(String... strArr) {
/* 7 */             f3077i = (AFKeystoreWrapper + 85) % 128;
/* 27 */            AFLogger.afDebugLog("setOneLinkCustomDomain " + Arrays.toString(strArr));
/* 38 */            getMonetizationNetwork().mo1781i().component3 = strArr;
/* 42 */            int i = AFKeystoreWrapper + 103;
/* 46 */            f3077i = i % 128;
/* 50 */            if (i % 2 == 0) {
/* 54 */                throw null;
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setOutOfStore(String str) {
/* 7 */             f3077i = (AFKeystoreWrapper + 19) % 128;
/* 10 */            if (str == null) {
/* 59 */                AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
/* 62 */                return;
                    }
/* 16 */            String lowerCase = str.toLowerCase(Locale.getDefault());
/* 26 */            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
/* 39 */            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
/* 44 */            int i = f3077i + 105;
/* 48 */            AFKeystoreWrapper = i % 128;
/* 52 */            if (i % 2 != 0) {
/* 56 */                throw null;
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setPartnerData(String str, Map<String, Object> map) {
/* 15 */            getRevenue(new Object[]{this, str, map}, 252063752, -252063751, System.identityHashCode(this));
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setPhoneNumber(String str) {
/* 3 */             int i = f3077i + 13;
/* 7 */             AFKeystoreWrapper = i % 128;
/* 11 */            if (i % 2 != 0) {
/* 25 */                getMonetizationNetwork().force().getMediationNetwork = AFj1dSDK.getCurrencyIso4217Code(str);
/* 29 */                int i2 = 11 / 0;
                    } else {
/* 44 */                getMonetizationNetwork().force().getMediationNetwork = AFj1dSDK.getCurrencyIso4217Code(str);
                    }
/* 52 */            AFKeystoreWrapper = (f3077i + 25) % 128;
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setPluginInfo(PluginInfo pluginInfo) {
/* 7 */             AFKeystoreWrapper = (f3077i + 3) % 128;
/* 9 */             Objects.requireNonNull(pluginInfo);
/* 20 */            getMonetizationNetwork().unregisterClient().getRevenue(pluginInfo);
/* 29 */            AFKeystoreWrapper = (f3077i + 115) % 128;
                }

                /* JADX WARN: Code duplicated, block: B:10:0x001e  */
                /* JADX WARN: Code duplicated, block: B:12:0x002c A[Catch: JSONException -> 0x001a, TRY_ENTER, TryCatch #0 {JSONException -> 0x001a, blocks: (B:5:0x0016, B:12:0x002c, B:13:0x0030, B:18:0x003f), top: B:27:0x0016 }] */
                /* JADX WARN: Code duplicated, block: B:13:0x0030 A[Catch: JSONException -> 0x001a, TRY_LEAVE, TryCatch #0 {JSONException -> 0x001a, blocks: (B:5:0x0016, B:12:0x002c, B:13:0x0030, B:18:0x003f), top: B:27:0x0016 }] */
                /* JADX WARN: Code duplicated, block: B:17:0x0037  */
                @Override // com.appsflyer.AppsFlyerLib
                public final void setPreinstallAttribution(String str, String str2, String str3) {
                    int i;
/* 3 */             AFLogger.afDebugLog("setPreinstallAttribution API called");
/* 8 */             JSONObject jSONObject = new JSONObject();
/* 13 */            if (str != null) {
/* 21 */                AFKeystoreWrapper = (f3077i + 115) % 128;
                        try {
/* 23 */                    jSONObject.put("pid", str);
/* 29 */                    if (str2 != null) {
/* 33 */                        i = AFKeystoreWrapper + 117;
/* 37 */                        f3077i = i % 128;
/* 43 */                        if (i % 2 != 0) {
/* 49 */                            jSONObject.put("c", str2);
/* 53 */                            throw null;
                                }
/* 45 */                        jSONObject.put("c", str2);
                            }
/* 54 */                    if (str3 != null) {
/* 62 */                        f3077i = (AFKeystoreWrapper + 93) % 128;
/* 66 */                        jSONObject.put("af_siteid", str3);
                            }
                        } catch (JSONException e) {
/* 74 */                    AFLogger.afErrorLog(e.getMessage(), e);
                        }
                    } else {
/* 29 */                if (str2 != null) {
/* 33 */                    i = AFKeystoreWrapper + 117;
/* 37 */                    f3077i = i % 128;
/* 43 */                    if (i % 2 != 0) {
/* 49 */                        jSONObject.put("c", str2);
/* 53 */                        throw null;
                            }
/* 45 */                    jSONObject.put("c", str2);
                        }
/* 54 */                if (str3 != null) {
/* 62 */                    f3077i = (AFKeystoreWrapper + 93) % 128;
/* 66 */                    jSONObject.put("af_siteid", str3);
                        }
                    }
/* 81 */            if (jSONObject.has("pid")) {
/* 89 */                getMediationNetwork("preInstallName", jSONObject.toString());
                    } else {
/* 95 */                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setResolveDeepLinkURLs(String... strArr) {
/* 7 */             AFKeystoreWrapper = (f3077i + 25) % 128;
/* 27 */            AFLogger.afDebugLog("setResolveDeepLinkURLs " + Arrays.toString(strArr));
/* 34 */            AFa1mSDK aFa1mSDKMo1781i = getMonetizationNetwork().mo1781i();
/* 40 */            aFa1mSDKMo1781i.component1.clear();
/* 49 */            aFa1mSDKMo1781i.component1.addAll(Arrays.asList(strArr));
/* 54 */            int i = AFKeystoreWrapper + 85;
/* 58 */            f3077i = i % 128;
/* 62 */            if (i % 2 == 0) {
/* 66 */                throw null;
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                @Deprecated
                public final void setSharingFilter(String... strArr) {
/* 15 */            getRevenue(new Object[]{this, strArr}, 1586087259, -1586087256, System.identityHashCode(this));
                }

                @Override // com.appsflyer.AppsFlyerLib
                @Deprecated
                public final void setSharingFilterForAllPartners() {
/* 15 */            getRevenue(new Object[]{this}, -1362959156, 1362959177, System.identityHashCode(this));
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setSharingFilterForPartners(String... strArr) {
/* 14 */            getMonetizationNetwork().force().getRevenue = new AFb1tSDK(strArr);
/* 22 */            AFKeystoreWrapper = (f3077i + 39) % 128;
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
/* 6 */             ArrayList arrayList = new ArrayList(strArr.length + 1);
/* 13 */            arrayList.add(emailsCryptType.toString());
/* 20 */            arrayList.addAll(Arrays.asList(strArr));
/* 44 */            getMonetizationNetwork().copy().getRevenue("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
/* 57 */            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
/* 62 */            HashMap map = new HashMap();
/* 67 */            ArrayList arrayList2 = new ArrayList();
/* 71 */            String str = null;
/* 73 */            for (String str2 : strArr) {
/* 81 */                f3077i = (AFKeystoreWrapper + 107) % 128;
/* 94 */                if (C02433.getCurrencyIso4217Code[emailsCryptType.ordinal()] != 2) {
/* 100 */                   arrayList2.add(AFj1dSDK.getCurrencyIso4217Code(str2));
/* 103 */                   str = "sha256_el_arr";
                        } else {
/* 106 */                   arrayList2.add(str2);
/* 115 */                   f3077i = (AFKeystoreWrapper + 103) % 128;
/* 117 */                   str = "plain_el_arr";
                        }
                    }
/* 122 */           map.put(str, arrayList2);
/* 138 */           AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(map).toString());
/* 147 */           AFKeystoreWrapper = (f3077i + 117) % 128;
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
                
                    if (r9.hashCode != false) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
                
                    getRevenue("start");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
                
                    if (r11 != null) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
                
                    if (r12 == null) goto L43;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
                
                    r12.onError(41, "No dev key");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
                
                    AFAdRevenueData(r10);
                    r0 = getMonetizationNetwork().areAllFieldsValid();
                    r0.getRevenue(com.appsflyer.internal.AFh1vSDK.getMediationNetwork(r10));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
                
                    if (r9.component2 != null) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
                
                    r5 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper + 53;
                    com.appsflyer.internal.AFa1ySDK.f3077i = r5 % 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
                
                    if ((r5 % 2) == 0) goto L30;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
                
                    r5 = com.appsflyer.internal.AFj1kSDK.m1832O_(r10);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
                
                    if (r5 == null) goto L29;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
                
                    r7 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper + 69;
                    com.appsflyer.internal.AFa1ySDK.f3077i = r7 % 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
                
                    if ((r7 % 2) == 0) goto L27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
                
                    r9.component2 = r5;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
                
                    r9.component2 = r5;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
                
                    com.appsflyer.internal.AFj1kSDK.m1832O_(r10);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
                
                    getMonetizationNetwork().copy().getRevenue("start", r11);
                    r4 = com.appsflyer.AFLogger.INSTANCE;
                    r5 = com.appsflyer.internal.AFg1cSDK.f3088v;
                    r6 = com.appsflyer.internal.AFa1ySDK.getMonetizationNetwork;
                    r4.m1815i(r5, "Starting AppsFlyer: (v6.17.6." + r6 + ")");
                    r7 = new java.lang.StringBuilder("Build Number: ");
                    r7.append(r6);
                    r4.m1815i(r5, r7.toString());
                    com.appsflyer.AppsFlyerProperties.getInstance().loadProperties(getMonetizationNetwork().component4());
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
                
                    if (android.text.TextUtils.isEmpty(r11) != false) goto L35;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x00db, code lost:
                
                    getMonetizationNetwork().AFInAppEventType().AFAdRevenueData(r11);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x00f7, code lost:
                
                    if (android.text.TextUtils.isEmpty(getMonetizationNetwork().AFInAppEventType().getMediationNetwork()) == false) goto L41;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x00f9, code lost:
                
                    getRevenue(new java.lang.Object[0], -516060765, 516060769, (int) java.lang.System.currentTimeMillis());
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x0109, code lost:
                
                    if (r12 == null) goto L44;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x010b, code lost:
                
                    com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = (com.appsflyer.internal.AFa1ySDK.f3077i + 49) % 128;
                    r12.onError(41, "No dev key");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x0116, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x0117, code lost:
                
                    getMonetizationNetwork().component1().AFAdRevenueData(AFAdRevenueData());
                    component1();
                    m1761c_(r9.component2.getBaseContext(), r9.copy.AFAdRevenueData().m1787n_());
                    getMonetizationNetwork().mo1780e().getMonetizationNetwork();
                    r9.copy.mo1782v().AFAdRevenueData(r10, new com.appsflyer.internal.AFa1ySDK.C02422(r9));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x0155, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
                
                    if (getMonetizationNetwork().mo1782v().getMediationNetwork() != false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
                
                    if (getMonetizationNetwork().mo1782v().getMediationNetwork() != false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
                
                    com.appsflyer.internal.AFa1ySDK.f3077i = (com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper + 31) % 128;
                 */
                @Override // com.appsflyer.AppsFlyerLib
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void start(Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
/* 3 */             int i = f3077i + 93;
/* 7 */             AFKeystoreWrapper = i % 128;
/* 12 */            if (i % 2 != 0) {
/* 27 */                int i2 = 4 / 0;
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void stop(boolean z, Context context) {
/* 19 */            getRevenue(new Object[]{this, Boolean.valueOf(z), context}, -1981102572, 1981102584, System.identityHashCode(this));
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j) {
/* 3 */             int i = AFKeystoreWrapper + 89;
/* 7 */             f3077i = i % 128;
/* 11 */            if (i % 2 != 0) {
/* 21 */                getMonetizationNetwork().mo1781i().getCurrencyIso4217Code = deepLinkListener;
/* 31 */                getMonetizationNetwork().mo1781i().component2 = j;
                    } else {
/* 42 */                getMonetizationNetwork().mo1781i().getCurrencyIso4217Code = deepLinkListener;
/* 52 */                getMonetizationNetwork().mo1781i().component2 = j;
/* 55 */                throw null;
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void unregisterConversionListener() {
/* 7 */             AFKeystoreWrapper = (f3077i + 91) % 128;
/* 22 */            getMonetizationNetwork().copy().getRevenue("unregisterConversionListener", new String[0]);
/* 26 */            this.getRevenue = null;
/* 30 */            int i = AFKeystoreWrapper + 21;
/* 34 */            f3077i = i % 128;
/* 38 */            if (i % 2 == 0) {
/* 42 */                int i2 = 12 / 0;
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void updateServerUninstallToken(Context context, String str) {
/* 15 */            getRevenue(new Object[]{this, context, str}, -38035383, 38035401, System.identityHashCode(this));
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
/* 32 */            getMonetizationNetwork().copy().getRevenue("validateAndTrackInAppPurchase", str, str2, str3, str4, str5, map == null ? HttpUrl.FRAGMENT_ENCODE_SET : map.toString());
/* 47 */            if (!getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code()) {
/* 49 */                AFLogger aFLogger = AFLogger.INSTANCE;
/* 51 */                AFg1cSDK aFg1cSDK = AFg1cSDK.PURCHASE_VALIDATION;
/* 57 */                StringBuilder sbM3514r = AbstractC0886en.m3514r("Validate in app called with parameters: ", str3, " ", str4, " ");
/* 61 */                sbM3514r.append(str5);
/* 68 */                aFLogger.m1815i(aFg1cSDK, sbM3514r.toString());
                    }
/* 72 */            if (str != null && str4 != null) {
/* 78 */                int i = f3077i + 105;
/* 80 */                int i2 = i % 128;
/* 82 */                AFKeystoreWrapper = i2;
/* 86 */                if (i % 2 != 0) {
/* 139 */                   throw null;
                        }
/* 88 */                if (str2 != null && str5 != null) {
/* 96 */                    f3077i = (i2 + 5) % 128;
/* 98 */                    if (str3 != null) {
/* 135 */                       new Thread(new com.appsflyer.internal.AFa1zSDK(context.getApplicationContext(), getMonetizationNetwork().AFInAppEventType().getMediationNetwork(), str, str2, str3, str4, str5, map)).start();
/* 138 */                       return;
                            }
                        }
                    }
/* 140 */           AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = getCurrencyIso4217Code;
/* 142 */           if (appsFlyerInAppPurchaseValidatorListener != null) {
/* 146 */               int i3 = AFKeystoreWrapper + 91;
/* 150 */               f3077i = i3 % 128;
/* 156 */               if (i3 % 2 != 0) {
/* 158 */                   appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                        } else {
/* 162 */                   appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
/* 165 */                   throw null;
                        }
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
                public final void waitForCustomerUserId(boolean z) {
/* 3 */             int i = f3077i + 67;
/* 7 */             AFKeystoreWrapper = i % 128;
/* 22 */            if (i % 2 != 0) {
/* 32 */                AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
/* 48 */                getRevenue(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, Boolean.valueOf(z)}, -1569798316, 1569798326, (int) System.currentTimeMillis());
                    } else {
/* 60 */                AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
/* 76 */                getRevenue(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, Boolean.valueOf(z)}, -1569798316, 1569798326, (int) System.currentTimeMillis());
                    }
                }

/* 29 */        private static void copydefault() {
/* 30 */            getRevenue(new Object[0], -516060765, 516060769, (int) System.currentTimeMillis());
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 47 */        public /* synthetic */ void equals() throws UnsupportedEncodingException {
/* 48 */            getMediationNetwork(new AFh1kSDK());
                    AFKeystoreWrapper = (f3077i + 81) % 128;
                }

                @Override // com.appsflyer.AppsFlyerLib
/* 55 */        public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
/* 56 */            f3077i = (AFKeystoreWrapper + 27) % 128;
/* 57 */            subscribeForDeepLink(deepLinkListener, 3000L);
/* 58 */            f3077i = (AFKeystoreWrapper + 45) % 128;
                }

/* 68 */        public static void component2() {
/* 69 */            AFLogger = new char[]{35848, 35853, 35850, 35871, 35840, 35844, 35852, 35870, 35867};
                    registerClient = 1912311211;
                    AFInAppEventParameterName = true;
                    AFInAppEventType = true;
                }

/* 77 */        public final boolean getCurrencyIso4217Code() {
/* 78 */            if (getMediationNetwork(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID) && ((String) getRevenue(new Object[0], 131288073, -131288051, (int) System.currentTimeMillis())) == null) {
                        f3077i = (AFKeystoreWrapper + 123) % 128;
                        return true;
                    }
                    f3077i = (AFKeystoreWrapper + 41) % 128;
                    return false;
                }

/* 78 */        private static String getCurrencyIso4217Code(String str) {
                    String string;
/* 79 */            int i = AFKeystoreWrapper + 59;
                    f3077i = i % 128;
                    if (i % 2 == 0) {
                        string = AppsFlyerProperties.getInstance().getString(str);
                        int i2 = 57 / 0;
                    } else {
                        string = AppsFlyerProperties.getInstance().getString(str);
                    }
                    f3077i = (AFKeystoreWrapper + 41) % 128;
                    return string;
                }

/* 79 */        private String getCurrencyIso4217Code(Context context, String str) {
/* 80 */            int i = AFKeystoreWrapper + 55;
                    f3077i = i % 128;
                    if (i % 2 == 0) {
                        throw null;
                    }
                    if (context == null) {
                        return null;
                    }
/* 81 */            AFAdRevenueData(context);
/* 82 */            String currencyIso4217Code = getMonetizationNetwork().AFAdRevenueData().getCurrencyIso4217Code(str);
/* 83 */            AFKeystoreWrapper = (f3077i + 89) % 128;
                    return currencyIso4217Code;
                }

/* 83 */        public static int getCurrencyIso4217Code(AFc1qSDK aFc1qSDK, boolean z) {
/* 84 */            int i = AFKeystoreWrapper + 65;
                    f3077i = i % 128;
                    if (i % 2 == 0) {
                        getMediationNetwork(aFc1qSDK, "appsFlyerCount", z);
                        throw null;
                    }
                    int mediationNetwork = getMediationNetwork(aFc1qSDK, "appsFlyerCount", z);
                    AFKeystoreWrapper = (f3077i + 71) % 128;
                    return mediationNetwork;
                }

/* 84 */        private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
/* 85 */            f3077i = (AFKeystoreWrapper + 123) % 128;
/* 86 */            AFLogger.INSTANCE.m1817w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
/* 87 */            int i = AFKeystoreWrapper + 113;
                    f3077i = i % 128;
                    if (i % 2 != 0) {
                        return null;
                    }
                    throw null;
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 87 */        public /* synthetic */ void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
/* 88 */            getRevenue(new Object[]{this, aFh1mSDK}, -316162006, 316162006, System.identityHashCode(this));
                }

/* 87 */        public final void component1() {
                    int i;
/* 88 */            if (AFe1bSDK.component3()) {
/* 89 */                i = AFKeystoreWrapper + 107;
                    } else {
/* 90 */                AFd1zSDK monetizationNetwork = getMonetizationNetwork();
/* 91 */                AFe1oSDK aFe1oSDKCopydefault = monetizationNetwork.copydefault();
/* 92 */                aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new RunnableC02601(new AFe1bSDK(monetizationNetwork)));
/* 93 */                i = AFKeystoreWrapper + 13;
                    }
                    f3077i = i % 128;
                }

/* 100 */       private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
                    String str = (String) objArr[0];
                    boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
/* 101 */           int i = AFKeystoreWrapper + 37;
                    f3077i = i % 128;
                    if (i % 2 != 0) {
/* 102 */               AppsFlyerProperties.getInstance().set(str, zBooleanValue);
                        return null;
                    }
                    AppsFlyerProperties.getInstance().set(str, zBooleanValue);
/* 103 */           throw null;
                }

/* 103 */       private static void areAllFieldsValid(Context context) {
/* 104 */           getRevenue(new Object[]{context}, 750744286, -750744267, (int) System.currentTimeMillis());
                }

/* 126 */       private AFj1tSDK[] component3() {
/* 127 */           int i = AFKeystoreWrapper + 71;
                    f3077i = i % 128;
                    int i2 = i % 2;
                    AFj1sSDK aFj1sSDKAFLogger = getMonetizationNetwork().AFLogger();
/* 128 */           AFj1tSDK[] aFj1tSDKArr = (AFj1tSDK[]) (i2 == 0 ? aFj1sSDKAFLogger.getRevenue.toArray(new AFj1tSDK[0]) : aFj1sSDKAFLogger.getRevenue.toArray(new AFj1tSDK[0]));
/* 129 */           f3077i = (AFKeystoreWrapper + 107) % 128;
                    return aFj1tSDKArr;
                }

                @Override // com.appsflyer.AppsFlyerLib
/* 149 */       public final void setUserEmails(String... strArr) {
/* 150 */           int i = f3077i + 61;
                    AFKeystoreWrapper = i % 128;
                    if (i % 2 != 0) {
/* 151 */               getMonetizationNetwork().copy().getRevenue("setUserEmails", strArr);
/* 152 */               setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
/* 153 */               int i2 = 44 / 0;
                    } else {
/* 154 */               getMonetizationNetwork().copy().getRevenue("setUserEmails", strArr);
/* 155 */               setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
                    }
/* 156 */           f3077i = (AFKeystoreWrapper + 71) % 128;
                }

                @Override // com.appsflyer.AppsFlyerLib
/* 166 */       public final void validateAndLogInAppPurchase(AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
/* 167 */           AFe1oSDK aFe1oSDKCopydefault = this.copy.copydefault();
/* 169 */           aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new RunnableC02601(new AFf1ySDK(this.copy, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
/* 170 */           int i = f3077i + 111;
                    AFKeystoreWrapper = i % 128;
                    if (i % 2 != 0) {
                        int i2 = 96 / 0;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 203 */       public /* synthetic */ void AFAdRevenueData(AFf1pSDK aFf1pSDK) {
/* 204 */           int i = AFKeystoreWrapper + 77;
                    f3077i = i % 128;
                    if (i % 2 != 0) {
/* 205 */               AFd1zSDK monetizationNetwork = getMonetizationNetwork();
/* 206 */               if (aFf1pSDK == AFf1pSDK.SUCCESS) {
/* 207 */                   monetizationNetwork.afErrorLogForExcManagerOnly().getMonetizationNetwork();
                        }
/* 208 */               if (!monetizationNetwork.copy().AFAdRevenueData()) {
/* 209 */                   f3077i = (AFKeystoreWrapper + 7) % 128;
/* 210 */                   monetizationNetwork.afInfoLog().getCurrencyIso4217Code();
/* 211 */                   int i2 = f3077i + 103;
                            AFKeystoreWrapper = i2 % 128;
                            if (i2 % 2 != 0) {
                                int i3 = 20 / 0;
                                return;
                            }
                            return;
                        }
/* 212 */               monetizationNetwork.afInfoLog().getRevenue();
                        return;
                    }
/* 213 */           getMonetizationNetwork();
/* 214 */           AFf1pSDK aFf1pSDK2 = AFf1pSDK.SUCCESS;
                    throw null;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001c A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:3:0x0001, B:16:0x0029, B:15:0x001c, B:11:0x0017, B:7:0x0011), top: B:23:0x0001, inners: #0 }] */
/* 214 */       public final synchronized AFf1mSDK AFAdRevenueData() {
                    try {
/* 215 */               int i = f3077i + 11;
                        int i2 = i % 128;
                        AFKeystoreWrapper = i2;
                        int i3 = i % 2;
/* 216 */               AFf1mSDK aFf1mSDK = this.equals;
                        if (i3 != 0) {
                            int i4 = 9 / 0;
                            if (aFf1mSDK == null) {
/* 218 */                       this.equals = new C0291c(this);
/* 219 */                       f3077i = (i2 + 81) % 128;
                            }
                        } else if (aFf1mSDK == null) {
/* 218 */                   this.equals = new C0291c(this);
/* 219 */                   f3077i = (i2 + 81) % 128;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
/* 220 */           return this.equals;
                }

/* 220 */       public final void AFAdRevenueData(Context context) {
/* 221 */           int i = (f3077i + 27) % 128;
                    AFKeystoreWrapper = i;
/* 222 */           AFc1bSDK aFc1bSDK = this.copy;
                    if (context != null) {
                        int i2 = i + ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE;
/* 223 */               f3077i = i2 % 128;
                        if (i2 % 2 != 0) {
/* 225 */                   aFc1bSDK.getCurrencyIso4217Code.getMonetizationNetwork = context.getApplicationContext();
                        } else {
/* 226 */                   AFc1hSDK aFc1hSDK = aFc1bSDK.getCurrencyIso4217Code;
/* 227 */                   throw null;
                        }
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
/* 222 */       public final void logEvent(Context context, String str, Map<String, Object> map) throws UnsupportedEncodingException {
/* 223 */           int i = f3077i + 87;
                    AFKeystoreWrapper = i % 128;
                    if (i % 2 == 0) {
/* 224 */               logEvent(context, str, map, null);
/* 225 */               int i2 = AFKeystoreWrapper + 27;
                        f3077i = i2 % 128;
                        if (i2 % 2 == 0) {
                            throw null;
                        }
                        return;
                    }
/* 226 */           logEvent(context, str, map, null);
/* 227 */           throw null;
                }

/* 227 */       private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
                    AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
                    boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
/* 228 */           int i = AFKeystoreWrapper + 5;
                    f3077i = i % 128;
                    if (i % 2 == 0) {
                        throw null;
                    }
/* 229 */           aFa1ySDK.setLogLevel(zBooleanValue ? AFLogger.LogLevel.DEBUG : AFLogger.LogLevel.NONE);
                    AFKeystoreWrapper = (f3077i + 117) % 128;
                    return null;
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 229 */       public /* synthetic */ void AFAdRevenueData(AFi1hSDK aFi1hSDK) {
/* 230 */           int i = AFKeystoreWrapper + 25;
                    f3077i = i % 128;
                    int i2 = i % 2;
                    Object[] objArr = {this, aFi1hSDK};
                    int iIdentityHashCode = System.identityHashCode(this);
                    if (i2 == 0) {
                        getRevenue(objArr, 608861720, -608861711, iIdentityHashCode);
                        throw null;
                    }
                    getRevenue(objArr, 608861720, -608861711, iIdentityHashCode);
                    AFKeystoreWrapper = (f3077i + 15) % 128;
                }

/* 230 */       private void AFAdRevenueData(Context context, String str, Map<String, Object> map) throws UnsupportedEncodingException {
/* 231 */           AFh1hSDK aFh1hSDK = new AFh1hSDK();
/* 232 */           aFh1hSDK.areAllFieldsValid = str;
/* 233 */           aFh1hSDK.getRevenue = map;
/* 235 */           getCurrencyIso4217Code(aFh1hSDK, (AFh1qSDK) getRevenue(new Object[]{this, context}, 348348548, -348348531, System.identityHashCode(this)));
/* 236 */           f3077i = (AFKeystoreWrapper + 125) % 128;
                }

/* 230 */       private boolean component4() {
/* 231 */           f3077i = (AFKeystoreWrapper + ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE) % 128;
                    if (this.component3 > 0) {
/* 234 */               long jCurrentTimeMillis = System.currentTimeMillis() - this.component3;
/* 235 */               SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
/* 236 */               String monetizationNetwork = getMonetizationNetwork(simpleDateFormat, this.component3);
/* 237 */               String monetizationNetwork2 = getMonetizationNetwork(simpleDateFormat, this.AFAdRevenueData);
                        if (jCurrentTimeMillis < this.component4 && !isStopped()) {
/* 239 */                   AFKeystoreWrapper = (f3077i + 25) % 128;
/* 240 */                   long j = this.component4;
/* 242 */                   StringBuilder sbM3514r = AbstractC0886en.m3514r("Last Launch attempt: ", monetizationNetwork, ";\nLast successful Launch event: ", monetizationNetwork2, ";\nThis launch is blocked: ");
/* 243 */                   sbM3514r.append(jCurrentTimeMillis);
/* 245 */                   sbM3514r.append(" ms < ");
                            sbM3514r.append(j);
/* 247 */                   sbM3514r.append(" ms");
                            AFLogger.afInfoLog(sbM3514r.toString());
                            return true;
                        }
/* 248 */               if (isStopped()) {
                            return false;
                        }
/* 250 */               StringBuilder sbM3514r2 = AbstractC0886en.m3514r("Last Launch attempt: ", monetizationNetwork, ";\nLast successful Launch event: ", monetizationNetwork2, ";\nSending launch (+");
/* 251 */               sbM3514r2.append(jCurrentTimeMillis);
/* 253 */               sbM3514r2.append(" ms)");
                        AFLogger.afInfoLog(sbM3514r2.toString());
                        return false;
                    }
/* 254 */           if (isStopped()) {
                        return false;
                    }
/* 255 */           f3077i = (AFKeystoreWrapper + 113) % 128;
/* 256 */           AFLogger.afInfoLog("Sending first launch for this session!");
/* 257 */           f3077i = (AFKeystoreWrapper + 121) % 128;
                    return false;
                }

/* 234 */       private static /* synthetic */ Object copy(Object[] objArr) {
                    Context context = (Context) objArr[0];
                    try {
/* 236 */               List listAsList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
/* 237 */               if (!listAsList.contains("android.permission.INTERNET")) {
/* 238 */                   int i = AFKeystoreWrapper + 73;
                            f3077i = i % 128;
                            if (i % 2 == 0) {
/* 239 */                       AFLogger.INSTANCE.m1817w(AFg1cSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
/* 240 */                       int i2 = 51 / 0;
                            } else {
/* 242 */                       AFLogger.INSTANCE.m1817w(AFg1cSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                            }
                        }
/* 243 */               if (!listAsList.contains("android.permission.ACCESS_NETWORK_STATE")) {
/* 244 */                   AFLogger.INSTANCE.m1817w(AFg1cSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
                        }
/* 245 */               if (Build.VERSION.SDK_INT > 32) {
/* 246 */                   f3077i = (AFKeystoreWrapper + 11) % 128;
/* 248 */                   if (!listAsList.contains("com.google.android.gms.permission.AD_ID")) {
/* 249 */                       AFLogger.INSTANCE.m1817w(AFg1cSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                            }
                        }
/* 250 */               AFKeystoreWrapper = (f3077i + 61) % 128;
                        return null;
                    } catch (Exception e) {
/* 251 */               AFLogger.INSTANCE.m1811e(AFg1cSDK.GENERAL, "Exception while validation permissions. ", e);
                        return null;
                    }
                }

/* 236 */       private void AFAdRevenueData(String str) {
/* 240 */           AFh1mSDK aFh1mSDKAFAdRevenueData = new AFh1nSDK().AFAdRevenueData(getMonetizationNetwork().AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0));
/* 241 */           aFh1mSDKAFAdRevenueData.component1 = str;
/* 242 */           if (str == null || str.length() <= 5 || !getMonetizationNetwork().AFLogger().getMediationNetwork(aFh1mSDKAFAdRevenueData)) {
                        return;
                    }
/* 244 */           int i = f3077i + 15;
                    AFKeystoreWrapper = i % 128;
                    int i2 = i % 2;
                    int i3 = 1;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    if (i2 == 0) {
/* 246 */               AFj1aSDK.getCurrencyIso4217Code(getMonetizationNetwork().getMediationNetwork(), new RunnableC0295g(i3, this, aFh1mSDKAFAdRevenueData), 5L, timeUnit);
/* 247 */               f3077i = (AFKeystoreWrapper + 21) % 128;
                    } else {
/* 249 */               AFj1aSDK.getCurrencyIso4217Code(getMonetizationNetwork().getMediationNetwork(), new RunnableC0295g(i3, this, aFh1mSDKAFAdRevenueData), 5L, timeUnit);
/* 250 */               throw null;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:9:0x004c A[PHI: r0
  0x004c: PHI (r0v5 com.appsflyer.PurchaseHandler) = (r0v4 com.appsflyer.PurchaseHandler), (r0v10 com.appsflyer.PurchaseHandler) binds: [B:8:0x004a, B:5:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
/* 243 */       private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
                    PurchaseHandler purchaseHandlerComponent2;
                    AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
                    Context context = (Context) objArr[1];
                    Map<String, Object> map = (Map) objArr[2];
                    PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback = (PurchaseHandler.PurchaseValidationCallback) objArr[3];
/* 244 */           int i = f3077i + 59;
                    AFKeystoreWrapper = i % 128;
                    if (i % 2 != 0) {
/* 245 */               aFa1ySDK.AFAdRevenueData(context);
/* 246 */               purchaseHandlerComponent2 = aFa1ySDK.getMonetizationNetwork().component2();
/* 247 */               String[] strArr = new String[1];
                        strArr[1] = "purchases";
                        if (purchaseHandlerComponent2.getRevenue(map, purchaseValidationCallback, strArr)) {
/* 251 */                   AFe1cSDK aFe1cSDK = new AFe1cSDK(map, purchaseValidationCallback, purchaseHandlerComponent2.AFAdRevenueData);
/* 252 */                   AFe1oSDK aFe1oSDK = purchaseHandlerComponent2.getCurrencyIso4217Code;
/* 253 */                   aFe1oSDK.getCurrencyIso4217Code.execute(aFe1oSDK.new RunnableC02601(aFe1cSDK));
                        }
                    } else {
/* 248 */               aFa1ySDK.AFAdRevenueData(context);
/* 249 */               purchaseHandlerComponent2 = aFa1ySDK.getMonetizationNetwork().component2();
/* 250 */               if (purchaseHandlerComponent2.getRevenue(map, purchaseValidationCallback, "purchases")) {
/* 251 */                   AFe1cSDK aFe1cSDK2 = new AFe1cSDK(map, purchaseValidationCallback, purchaseHandlerComponent2.AFAdRevenueData);
/* 252 */                   AFe1oSDK aFe1oSDK2 = purchaseHandlerComponent2.getCurrencyIso4217Code;
/* 253 */                   aFe1oSDK2.getCurrencyIso4217Code.execute(aFe1oSDK2.new RunnableC02601(aFe1cSDK2));
                        }
                    }
/* 254 */           int i2 = AFKeystoreWrapper + 63;
                    f3077i = i2 % 128;
                    if (i2 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }

/* 250 */       public static String AFAdRevenueData(AFc1qSDK aFc1qSDK, String str) {
/* 251 */           f3077i = (AFKeystoreWrapper + 71) % 128;
/* 252 */           String monetizationNetwork = aFc1qSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
                    if (monetizationNetwork != null) {
/* 253 */               int i = f3077i + 87;
                        AFKeystoreWrapper = i % 128;
                        if (i % 2 == 0) {
                            return monetizationNetwork;
                        }
/* 254 */               throw null;
                    }
/* 255 */           aFc1qSDK.getRevenue("CACHED_CHANNEL", str);
/* 256 */           f3077i = (AFKeystoreWrapper + 37) % 128;
                    return str;
                }

/* 254 */       public static String getMonetizationNetwork(SimpleDateFormat simpleDateFormat, long j) {
/* 255 */           simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
/* 256 */           String str = simpleDateFormat.format(new Date(j));
                    int i = f3077i + 3;
                    AFKeystoreWrapper = i % 128;
                    if (i % 2 != 0) {
                        int i2 = 88 / 0;
                    }
                    return str;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 256 */       public class AFa1zSDK implements AFe1qSDK {
                    public AFa1zSDK() {
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public /* synthetic */ Unit getMediationNetwork() throws UnsupportedEncodingException {
/* 8 */                 AFa1ySDK.this.getMediationNetwork(new AFh1kSDK());
/* 11 */                return Unit.f12910a;
                    }

                    @Override // com.appsflyer.internal.AFe1qSDK
                    public final void getCurrencyIso4217Code(AFe1mSDK<?> aFe1mSDK) {
                    }

                    @Override // com.appsflyer.internal.AFe1qSDK
                    public final void getRevenue(AFe1mSDK<?> aFe1mSDK, AFe1uSDK aFe1uSDK) {
                        JSONObject monetizationNetwork;
                        AFf1aSDK revenue;
/* 3 */                 if (!(aFe1mSDK instanceof AFf1sSDK)) {
/* 220 */                   if (!(aFe1mSDK instanceof AFg1kSDK) || aFe1uSDK == AFe1uSDK.SUCCESS) {
/* 257 */                       return;
                            }
/* 234 */                   AFg1pSDK aFg1pSDK = new AFg1pSDK(AFa1ySDK.this.getMonetizationNetwork());
/* 243 */                   AFe1oSDK aFe1oSDKCopydefault = AFa1ySDK.this.getMonetizationNetwork().copydefault();
/* 254 */                   aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new RunnableC02601(aFg1pSDK));
/* 257 */                   return;
                        }
/* 6 */                 AFf1sSDK aFf1sSDK = (AFf1sSDK) aFe1mSDK;
/* 8 */                 boolean z = aFe1mSDK instanceof AFf1rSDK;
/* 10 */                if (z && getRevenue()) {
/* 19 */                    AFf1rSDK aFf1rSDK = (AFf1rSDK) aFe1mSDK;
/* 25 */                    if (aFf1rSDK.getMonetizationNetwork == AFe1uSDK.SUCCESS || aFf1rSDK.getMediationNetwork == 1) {
/* 44 */                        AFg1kSDK aFg1kSDK = new AFg1kSDK(aFf1rSDK, AFa1ySDK.this.getMonetizationNetwork().component4());
/* 53 */                        AFe1oSDK aFe1oSDKCopydefault2 = AFa1ySDK.this.getMonetizationNetwork().copydefault();
/* 64 */                        aFe1oSDKCopydefault2.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault2.new RunnableC02601(aFg1kSDK));
                            }
                        }
/* 73 */                AFh1pSDK aFh1pSDKAfWarnLog = AFa1ySDK.this.getMonetizationNetwork().afWarnLog();
/* 77 */                int i = 0;
/* 78 */                if (aFh1pSDKAfWarnLog != null && z) {
/* 90 */                    aFh1pSDKAfWarnLog.getMonetizationNetwork((AFf1rSDK) aFe1mSDK, new C0292d(this, i));
                        }
/* 95 */                if (aFe1uSDK == AFe1uSDK.SUCCESS) {
/* 97 */                    AFa1ySDK aFa1ySDK = AFa1ySDK.this;
/* 109 */                   aFa1ySDK.getMonetizationNetwork(aFa1ySDK.component2).getRevenue("sentSuccessfully", "true");
/* 114 */                   if (!(aFe1mSDK instanceof AFf1oSDK) && (revenue = new AFg1sSDK(AFa1ySDK.this.component2).getRevenue()) != null && revenue.getMediationNetwork) {
/* 135 */                       String str = revenue.getRevenue;
/* 151 */                       AFLogger.INSTANCE.m1810d(AFg1cSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
/* 158 */                       AFd1zSDK monetizationNetwork2 = AFa1ySDK.getRevenue().getMonetizationNetwork();
/* 164 */                       AFf1oSDK aFf1oSDK = new AFf1oSDK(str, monetizationNetwork2);
/* 167 */                       AFe1oSDK aFe1oSDKCopydefault3 = monetizationNetwork2.copydefault();
/* 178 */                       aFe1oSDKCopydefault3.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault3.new RunnableC02601(aFf1oSDK));
                            }
/* 181 */                   ResponseNetwork responseNetwork = ((AFe1fSDK) aFf1sSDK).areAllFieldsValid;
/* 183 */                   if (responseNetwork != null && (monetizationNetwork = AFa1qSDK.getMonetizationNetwork((String) responseNetwork.getBody())) != null) {
/* 205 */                       AFa1ySDK.this.component1 = monetizationNetwork.optBoolean("send_background", false);
                            }
/* 207 */                   if (z) {
/* 215 */                       AFa1ySDK.this.AFAdRevenueData = System.currentTimeMillis();
                            }
                        }
                    }

/* 257 */           private boolean getRevenue() {
                        return AFa1ySDK.this.getRevenue != null;
                    }
                }

/* 256 */       private void AFAdRevenueData(AFh1mSDK aFh1mSDK) throws UnsupportedEncodingException {
                    boolean z;
/* 257 */           if (aFh1mSDK.areAllFieldsValid == null) {
/* 258 */               AFKeystoreWrapper = (f3077i + 73) % 128;
                        z = true;
                    } else {
                        z = false;
                    }
/* 259 */           if (getCurrencyIso4217Code()) {
/* 260 */               f3077i = (AFKeystoreWrapper + 33) % 128;
/* 261 */               AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
                        return;
                    }
                    if (z) {
/* 263 */               if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
/* 264 */                   f3077i = (AFKeystoreWrapper + 7) % 128;
/* 265 */                   if (component4()) {
/* 266 */                       AFKeystoreWrapper = (f3077i + 39) % 128;
/* 267 */                       AppsFlyerRequestListener appsFlyerRequestListener = aFh1mSDK.getCurrencyIso4217Code;
                                if (appsFlyerRequestListener != null) {
/* 268 */                           appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                                    return;
                                }
                                return;
                            }
                        } else {
/* 269 */                   AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
                        }
/* 270 */               this.component3 = System.currentTimeMillis();
                    }
/* 271 */           getMediationNetwork(aFh1mSDK);
                }

/* 256 */       public final AFd1zSDK getMonetizationNetwork() {
/* 257 */           int i = (f3077i + 91) % 128;
                    AFKeystoreWrapper = i;
                    AFc1bSDK aFc1bSDK = this.copy;
                    f3077i = (i + 109) % 128;
                    return aFc1bSDK;
                }

/* 257 */       public final AFc1qSDK getMonetizationNetwork(Context context) {
/* 258 */           f3077i = (AFKeystoreWrapper + 13) % 128;
/* 259 */           AFAdRevenueData(context);
/* 260 */           AFc1qSDK aFc1qSDKComponent4 = getMonetizationNetwork().component4();
                    int i = AFKeystoreWrapper + 85;
                    f3077i = i % 128;
                    if (i % 2 != 0) {
                        return aFc1qSDKComponent4;
                    }
                    throw null;
                }

/* 260 */       private static void getMonetizationNetwork(String str) {
/* 261 */           getRevenue(new Object[]{str}, -374487647, 374487663, (int) System.currentTimeMillis());
                }

/* 261 */       private void getMonetizationNetwork(AFi1hSDK aFi1hSDK) {
/* 262 */           getRevenue(new Object[]{this, aFi1hSDK}, 608861720, -608861711, System.identityHashCode(this));
                }

/* 271 */       private static void AFAdRevenueData(String str, boolean z) {
/* 272 */           getRevenue(new Object[]{str, Boolean.valueOf(z)}, -1569798316, 1569798326, (int) System.currentTimeMillis());
                }

/* 272 */       public final void AFAdRevenueData(Context context, String str) {
/* 273 */           getRevenue(new Object[]{this, context, str}, 1454368071, -1454368056, System.identityHashCode(this));
                }

/* 328 */       private static boolean getMediationNetwork(String str) {
/* 329 */           f3077i = (AFKeystoreWrapper + 51) % 128;
                    boolean z = AppsFlyerProperties.getInstance().getBoolean(str, false);
                    int i = AFKeystoreWrapper + 117;
                    f3077i = i % 128;
                    if (i % 2 != 0) {
                        return z;
                    }
                    throw null;
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 329 */       public /* synthetic */ void getMediationNetwork(boolean z) {
                    if (z) {
/* 330 */               int i = AFKeystoreWrapper + 67;
                        f3077i = i % 128;
                        if (i % 2 != 0) {
/* 331 */                   getMonetizationNetwork().afInfoLog().getMediationNetwork();
                            return;
                        } else {
                            getMonetizationNetwork().afInfoLog().getMediationNetwork();
                            throw null;
                        }
                    }
/* 332 */           getMonetizationNetwork().afInfoLog().AFAdRevenueData();
/* 333 */           AFKeystoreWrapper = (f3077i + 7) % 128;
                }

/* 333 */       private static void getMediationNetwork(AFh1mSDK aFh1mSDK, AFh1qSDK aFh1qSDK) {
/* 334 */           int i = (AFKeystoreWrapper + 61) % 128;
                    f3077i = i;
                    if (aFh1qSDK != null) {
/* 336 */               aFh1mSDK.getMonetizationNetwork = aFh1qSDK.getCurrencyIso4217Code;
/* 338 */               aFh1mSDK.copydefault = aFh1qSDK.AFAdRevenueData;
                    }
                    int i2 = i + 41;
/* 339 */           AFKeystoreWrapper = i2 % 128;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                }

/* 339 */       private static /* synthetic */ Object getMediationNetwork(Object[] objArr) throws UnsupportedEncodingException {
                    AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
                    AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
/* 340 */           AFKeystoreWrapper = (f3077i + 31) % 128;
                    aFa1ySDK.getMediationNetwork(aFh1mSDK);
                    int i = f3077i + 27;
                    AFKeystoreWrapper = i % 128;
                    if (i % 2 == 0) {
                        return null;
                    }
                    throw null;
                }

/* 340 */       private static void getMediationNetwork(String str, String str2) {
/* 341 */           int i = f3077i + 19;
                    AFKeystoreWrapper = i % 128;
                    if (i % 2 != 0) {
/* 342 */               AppsFlyerProperties.getInstance().set(str, str2);
/* 343 */               int i2 = 77 / 0;
                    } else {
/* 344 */               AppsFlyerProperties.getInstance().set(str, str2);
                    }
/* 345 */           int i3 = AFKeystoreWrapper + 73;
                    f3077i = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                }

                @Override // com.appsflyer.AppsFlyerLib
/* 342 */       public final void start(Context context) {
/* 343 */           int i = AFKeystoreWrapper + 39;
                    f3077i = i % 128;
                    if (i % 2 != 0) {
/* 344 */               start(context, null);
/* 345 */               int i2 = f3077i + 7;
                        AFKeystoreWrapper = i2 % 128;
                        if (i2 % 2 != 0) {
                            throw null;
                        }
                        return;
                    }
/* 346 */           start(context, null);
/* 347 */           throw null;
                }

                @Deprecated
/* 345 */       public static Map<String, Object> getMediationNetwork(Map<String, Object> map) {
/* 346 */           if (map.containsKey("meta")) {
/* 347 */               f3077i = (AFKeystoreWrapper + 115) % 128;
/* 348 */               Map<String, Object> map2 = (Map) map.get("meta");
/* 349 */               AFKeystoreWrapper = (f3077i + 81) % 128;
                        return map2;
                    }
/* 350 */           HashMap map3 = new HashMap();
/* 346 */           map.put("meta", map3);
                    return map3;
                }

                @Override // com.appsflyer.AppsFlyerLib
/* 347 */       public final void start(Context context, String str) {
/* 348 */           getRevenue(new Object[]{this, context, str}, -973034294, 973034299, System.identityHashCode(this));
                }

/* 350 */       private static int getMediationNetwork(AFc1qSDK aFc1qSDK, String str, boolean z) {
                    int revenue;
/* 351 */           int i = f3077i + 15;
                    AFKeystoreWrapper = i % 128;
                    if (i % 2 != 0) {
/* 352 */               revenue = aFc1qSDK.getRevenue(str, 0);
                        if (!z) {
                            return revenue;
                        }
                    } else {
                        revenue = aFc1qSDK.getRevenue(str, 0);
                        if (!z) {
                            return revenue;
                        }
                    }
/* 353 */           AFKeystoreWrapper = (f3077i + 13) % 128;
                    int i2 = revenue + 1;
/* 354 */           aFc1qSDK.getMediationNetwork(str, i2);
                    return i2;
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 354 */       public static /* synthetic */ void getMediationNetwork(AFd1zSDK aFd1zSDK) {
/* 355 */           getRevenue(new Object[]{aFd1zSDK}, 757923489, -757923475, (int) System.currentTimeMillis());
                }

/* 355 */       private AFh1qSDK getMediationNetwork(Context context) {
/* 356 */           return (AFh1qSDK) getRevenue(new Object[]{this, context}, 348348548, -348348531, System.identityHashCode(this));
                }

/* 356 */       private void getMediationNetwork(Context context, AFh1tSDK aFh1tSDK) {
/* 357 */           getRevenue(new Object[]{this, context, aFh1tSDK}, -268043806, 268043817, System.identityHashCode(this));
                }

/* 357 */       public static String getMediationNetwork() {
/* 358 */           return (String) getRevenue(new Object[0], 131288073, -131288051, (int) System.currentTimeMillis());
                }

/* 954 */       public static AFa1ySDK getRevenue() {
/* 955 */           int i = AFKeystoreWrapper;
                    AFa1ySDK aFa1ySDK = areAllFieldsValid;
                    int i2 = i + 9;
                    f3077i = i2 % 128;
                    if (i2 % 2 != 0) {
                        return aFa1ySDK;
                    }
                    throw null;
                }

/* 955 */       private static /* synthetic */ Object getRevenue(Object[] objArr) {
                    AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
                    boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
/* 956 */           AFKeystoreWrapper = (f3077i + 11) % 128;
/* 957 */           aFa1ySDK.getMonetizationNetwork().copy().getRevenue("setCollectIMEI", String.valueOf(zBooleanValue));
/* 958 */           getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(zBooleanValue));
/* 959 */           getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(zBooleanValue));
/* 960 */           int i = f3077i + 115;
                    AFKeystoreWrapper = i % 128;
                    if (i % 2 != 0) {
                        int i2 = 60 / 0;
                    }
                    return null;
                }

/* 960 */       private void getRevenue(AppsFlyerConversionListener appsFlyerConversionListener) {
/* 961 */           AFKeystoreWrapper = (f3077i + 53) % 128;
                    if (appsFlyerConversionListener == null) {
                        return;
                    }
/* 962 */           this.getRevenue = appsFlyerConversionListener;
/* 963 */           f3077i = (AFKeystoreWrapper + ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE) % 128;
                }

/* 963 */       private void getRevenue(Context context, String str) throws UnsupportedEncodingException {
/* 964 */           AFh1eSDK aFh1eSDK = new AFh1eSDK();
/* 965 */           AFAdRevenueData(context);
/* 966 */           aFh1eSDK.areAllFieldsValid = null;
/* 967 */           aFh1eSDK.getRevenue = null;
/* 968 */           aFh1eSDK.component1 = str;
/* 969 */           aFh1eSDK.getMonetizationNetwork = null;
/* 970 */           AFAdRevenueData(aFh1eSDK);
/* 971 */           f3077i = (AFKeystoreWrapper + 29) % 128;
                }

/* 971 */       private void getRevenue(Map<String, Object> map) {
/* 973 */           if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
                        return;
                    }
/* 974 */           AFKeystoreWrapper = (f3077i + 115) % 128;
/* 976 */           if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                        return;
                    }
/* 977 */           f3077i = (AFKeystoreWrapper + 115) % 128;
/* 979 */           if (map.get("advertiserId") != null) {
                        try {
/* 982 */                   if (AFk1wSDK.getMonetizationNetwork(getMonetizationNetwork().force().getCurrencyIso4217Code) && map.remove("android_id") != null) {
/* 984 */                       AFKeystoreWrapper = (f3077i + 65) % 128;
/* 985 */                       AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                            }
/* 986 */                   if (AFk1wSDK.getMonetizationNetwork(getMonetizationNetwork().AFInAppEventType().AFAdRevenueData())) {
/* 987 */                       f3077i = (AFKeystoreWrapper + 67) % 128;
/* 988 */                       if (map.remove("imei") != null) {
/* 989 */                           int i = f3077i + 33;
                                    AFKeystoreWrapper = i % 128;
                                    if (i % 2 == 0) {
/* 990 */                               AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                                        return;
                                    }
                                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                                    try {
/* 991 */                               throw null;
                                    } catch (Throwable th) {
/* 992 */                               throw th;
                                    }
                                }
                            }
                        } catch (Exception e) {
/* 993 */                   AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
                        }
                    }
                }

/* 993 */       private static String getRevenue(Activity activity) {
                    Intent intent;
/* 994 */           AFKeystoreWrapper = (f3077i + 117) % 128;
                    String str = null;
                    if (activity != null && (intent = activity.getIntent()) != null) {
                        try {
/* 996 */                   Bundle extras = intent.getExtras();
                            if (extras != null) {
/* 997 */                       int i = AFKeystoreWrapper + 75;
                                f3077i = i % 128;
                                if (i % 2 != 0) {
/* 998 */                           String string = extras.getString("af");
                                    if (string == null) {
                                        return string;
                                    }
/* 999 */                           AFLogger.INSTANCE.m1817w(AFg1cSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(String.valueOf(string)));
/* 1000 */                          extras.remove("af");
/* 1001 */                          activity.setIntent(intent.putExtras(extras));
/* 1002 */                          AFKeystoreWrapper = (f3077i + 45) % 128;
                                    return string;
                                }
/* 1003 */                      String string2 = extras.getString("af");
                                try {
/* 1004 */                          throw null;
                                } catch (Throwable th) {
                                    str = string2;
                                    th = th;
/* 1005 */                          AFLogger.INSTANCE.m1811e(AFg1cSDK.ENGAGEMENT, th.getMessage(), th);
                                    return str;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    return str;
                }

/* 1005 */      public static boolean getRevenue(Context context) {
/* 1006 */          f3077i = (AFKeystoreWrapper + 103) % 128;
                    try {
/* 1008 */              if (pr0.f15259d.m8004c(context, qr0.f15711a) == 0) {
/* 1009 */                  AFKeystoreWrapper = (f3077i + 83) % 128;
                            return true;
                        }
                    } catch (Throwable th) {
/* 1010 */              AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
                    }
                    try {
/* 1011 */              context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                        return true;
                    } catch (PackageManager.NameNotFoundException e) {
/* 1012 */              AFLogger.INSTANCE.m1811e(AFg1cSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e);
                        return false;
                    }
                }

/* 1012 */      private static int getRevenue(AFc1qSDK aFc1qSDK, boolean z) {
/* 1013 */          int i = AFKeystoreWrapper + 125;
                    f3077i = i % 128;
                    if (i % 2 == 0) {
                        getMediationNetwork(aFc1qSDK, "appsFlyerInAppEventCount", z);
                        throw null;
                    }
                    int mediationNetwork = getMediationNetwork(aFc1qSDK, "appsFlyerInAppEventCount", z);
                    f3077i = (AFKeystoreWrapper + 33) % 128;
                    return mediationNetwork;
                }

/* 1013 */      private static void getRevenue(String str) {
/* 1014 */          AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK = AFg1cSDK.SDK_LIFECYCLE;
                    StringBuilder sb = new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '");
                    sb.append(str);
                    sb.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
                    aFLogger.m1817w(aFg1cSDK, sb.toString());
/* 1015 */          int i = AFKeystoreWrapper + 99;
                    f3077i = i % 128;
                    if (i % 2 == 0) {
                        throw null;
                    }
                }
            }
