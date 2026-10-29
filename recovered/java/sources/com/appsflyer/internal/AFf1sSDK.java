            package com.appsflyer.internal;

            import android.view.View;
            import android.view.ViewConfiguration;
            import com.appsflyer.AFLogger;
            import com.appsflyer.attribution.AppsFlyerRequestListener;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import java.lang.reflect.Method;
            import java.util.Map;
            import java.util.Set;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 99 */    public class AFf1sSDK extends AFe1fSDK<String> {
                private static final AFe1pSDK[] registerClient = {AFe1pSDK.DLSDK, AFe1pSDK.ONELINK, AFe1pSDK.REGISTER};
                private final AFf1fSDK AFInAppEventType;
                private final AFc1hSDK AFKeystoreWrapper;
                protected final AFc1qSDK component2;
                private final AFh1mSDK copy;
                private final AFe1vSDK copydefault;
                private final AFc1oSDK equals;
                private final AFf1kSDK hashCode;
                protected final AFg1nSDK toString;

                public AFf1sSDK(AFh1mSDK aFh1mSDK, AFd1zSDK aFd1zSDK, String str) {
/* 13 */            super(aFh1mSDK.AFAdRevenueData(), new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, str);
/* 16 */            this.copy = aFh1mSDK;
/* 22 */            this.copydefault = aFd1zSDK.AFKeystoreWrapper();
/* 28 */            this.component2 = aFd1zSDK.component4();
/* 34 */            this.hashCode = aFd1zSDK.component1();
/* 40 */            this.AFKeystoreWrapper = aFd1zSDK.AFInAppEventParameterName();
/* 46 */            this.equals = aFd1zSDK.AFAdRevenueData();
/* 52 */            this.toString = aFd1zSDK.component3();
/* 58 */            this.AFInAppEventType = aFd1zSDK.afDebugLog();
/* 64 */            for (AFe1pSDK aFe1pSDK : registerClient) {
/* 70 */                if (this.getRevenue == aFe1pSDK) {
/* 92 */                    return;
                        }
                    }
/* 77 */            int i = this.copy.component4;
/* 79 */            AFe1pSDK aFe1pSDK2 = this.getRevenue;
/* 81 */            if (i > 0) {
/* 97 */                this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
                    } else {
/* 83 */                AFe1pSDK aFe1pSDK3 = AFe1pSDK.CONVERSION;
/* 85 */                if (aFe1pSDK2 != aFe1pSDK3) {
/* 89 */                    this.AFAdRevenueData.add(aFe1pSDK3);
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:64:0x011e  */
                /* JADX WARN: Code duplicated, block: B:67:0x0125  */
                /* JADX WARN: Code duplicated, block: B:72:0x0140  */
                /* JADX WARN: Code duplicated, block: B:75:0x0157  */
                @Override // com.appsflyer.internal.AFe1fSDK
                public final AFd1hSDK<String> AFAdRevenueData(String str) {
                    double d;
                    JSONObject jSONObject;
                    String string;
                    String str2;
                    Exception exc;
                    String strReplaceAll;
/* 18 */            String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 22 */            AFAdRevenueData(this.copy);
/* 35 */            if (this.copy.AFAdRevenueData.containsKey("meta")) {
                        try {
/* 47 */                    d = this.hashCode.AFAdRevenueData.getCurrencyIso4217Code.getMonetizationNetwork.getMonetizationNetwork.getMonetizationNetwork;
                        } catch (NullPointerException unused) {
/* 50 */                    d = 1.0d;
                        }
/* 56 */                if (AFh1mSDK.getRevenue(d)) {
/* 62 */                    this.copy.AFAdRevenueData.remove("meta");
                        }
                    }
/* 73 */            AFd1hSDK<String> currencyIso4217Code = ((AFe1fSDK) this).component4.getCurrencyIso4217Code(this.copy, str, this.AFKeystoreWrapper);
/* 79 */            Map<String, Object> map = this.copy.AFAdRevenueData;
                    try {
/* 84 */                jSONObject = new JSONObject(map);
                        try {
/* 87 */                    string = jSONObject.toString();
                            try {
/* 91 */                        if (string == null) {
/* 109 */                           throw new NullPointerException("JSON toString of eventParams map returns null");
                                }
/* 93 */                        strReplaceAll = string.replaceAll("\\p{C}", "*Non-printing character*");
/* 97 */                        str2 = strReplaceAll;
/* 284 */                       if (string != null) {
/* 287 */                           str3 = string;
                                }
/* 292 */                       if (str2.equals(str3)) {
/* 321 */                           str2 = str3;
                                } else {
/* 300 */                           AFLogger.INSTANCE.m1817w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
                                    try {
/* 305 */                               jSONObject = new JSONObject(str2);
                                    } catch (JSONException e) {
/* 317 */                               AFLogger.INSTANCE.m1811e(AFg1cSDK.GENERAL, "Couldn't parse the payload to a json object", e);
                                    }
                                }
/* 324 */                       StringBuilder sb = new StringBuilder();
/* 327 */                       sb.append(this);
/* 332 */                       sb.append(": preparing data: ");
/* 339 */                       AFg1aSDK.getRevenue(sb.toString(), jSONObject);
/* 350 */                       this.component3.getRevenue(currencyIso4217Code != null ? currencyIso4217Code.getMonetizationNetwork.getMediationNetwork : null, str2);
/* 353 */                       return currencyIso4217Code;
                            } catch (NullPointerException e2) {
/* 102 */                       e = e2;
/* 140 */                       AFLogger.INSTANCE.m1811e(AFg1cSDK.GENERAL, "JSONObject return null String object. Trying to create AFJsonObject.", e);
                                try {
/* 143 */                           Object[] objArr = {map};
/* 147 */                           Map map2 = AFa1hSDK.f3072d;
/* 149 */                           Object method = map2.get(-226252430);
/* 153 */                           if (method == null) {
/* 190 */                               method = ((Class) AFa1hSDK.getRevenue(198 - View.resolveSize(0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), View.resolveSizeAndState(0, 0, 0) + 37)).getMethod("getMonetizationNetwork", Map.class);
/* 194 */                               map2.put(-226252430, method);
                                    }
/* 204 */                           String str4 = (String) ((Method) method).invoke(null, objArr);
                                    try {
/* 206 */                               if (str4 == null) {
/* 230 */                                   throw new NullPointerException("JSON toString of eventParams map returns null");
                                        }
/* 208 */                               strReplaceAll = str4.replaceAll("\\p{C}", "*Non-printing character*");
/* 212 */                               string = str4;
                                    } catch (NullPointerException e3) {
/* 222 */                               e = e3;
/* 223 */                               string = str4;
/* 279 */                               AFLogger.INSTANCE.m1811e(AFg1cSDK.GENERAL, "AFJsonObject return null String object.", e);
/* 131 */                               str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    } catch (Exception e4) {
/* 218 */                               exc = e4;
/* 220 */                               string = str4;
/* 268 */                               AFLogger.INSTANCE.m1814e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
/* 131 */                               str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    } catch (Throwable th) {
/* 214 */                               th = th;
/* 215 */                               string = str4;
/* 252 */                               AFLogger.INSTANCE.m1811e(AFg1cSDK.GENERAL, "Unexpected error", th);
/* 131 */                               str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                } catch (Throwable th2) {
                                    try {
/* 232 */                               Throwable cause = th2.getCause();
/* 236 */                               if (cause != null) {
/* 238 */                                   throw cause;
                                        }
/* 247 */                               throw th2;
                                    } catch (NullPointerException e5) {
/* 245 */                               e = e5;
/* 279 */                               AFLogger.INSTANCE.m1811e(AFg1cSDK.GENERAL, "AFJsonObject return null String object.", e);
/* 131 */                               str2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 284 */                               if (string != null) {
/* 287 */                                   str3 = string;
                                        }
/* 292 */                               if (str2.equals(str3)) {
/* 300 */                                   AFLogger.INSTANCE.m1817w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
/* 305 */                                   jSONObject = new JSONObject(str2);
                                        } else {
/* 321 */                                   str2 = str3;
                                        }
/* 324 */                               StringBuilder sb2 = new StringBuilder();
/* 327 */                               sb2.append(this);
/* 332 */                               sb2.append(": preparing data: ");
/* 339 */                               AFg1aSDK.getRevenue(sb2.toString(), jSONObject);
/* 350 */                               this.component3.getRevenue(currencyIso4217Code != null ? currencyIso4217Code.getMonetizationNetwork.getMediationNetwork : null, str2);
/* 353 */                               return currencyIso4217Code;
                                    } catch (Exception e6) {
/* 242 */                               exc = e6;
/* 268 */                               AFLogger.INSTANCE.m1814e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
/* 131 */                               str2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 284 */                               if (string != null) {
/* 287 */                                   str3 = string;
                                        }
/* 292 */                               if (str2.equals(str3)) {
/* 300 */                                   AFLogger.INSTANCE.m1817w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
/* 305 */                                   jSONObject = new JSONObject(str2);
                                        } else {
/* 321 */                                   str2 = str3;
                                        }
/* 324 */                               StringBuilder sb3 = new StringBuilder();
/* 327 */                               sb3.append(this);
/* 332 */                               sb3.append(": preparing data: ");
/* 339 */                               AFg1aSDK.getRevenue(sb3.toString(), jSONObject);
/* 350 */                               this.component3.getRevenue(currencyIso4217Code != null ? currencyIso4217Code.getMonetizationNetwork.getMediationNetwork : null, str2);
/* 353 */                               return currencyIso4217Code;
                                    } catch (Throwable th3) {
/* 239 */                               th = th3;
/* 252 */                               AFLogger.INSTANCE.m1811e(AFg1cSDK.GENERAL, "Unexpected error", th);
/* 131 */                               str2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 284 */                               if (string != null) {
/* 287 */                                   str3 = string;
                                        }
/* 292 */                               if (str2.equals(str3)) {
/* 300 */                                   AFLogger.INSTANCE.m1817w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
/* 305 */                                   jSONObject = new JSONObject(str2);
                                        } else {
/* 321 */                                   str2 = str3;
                                        }
/* 324 */                               StringBuilder sb4 = new StringBuilder();
/* 327 */                               sb4.append(this);
/* 332 */                               sb4.append(": preparing data: ");
/* 339 */                               AFg1aSDK.getRevenue(sb4.toString(), jSONObject);
/* 350 */                               this.component3.getRevenue(currencyIso4217Code != null ? currencyIso4217Code.getMonetizationNetwork.getMediationNetwork : null, str2);
/* 353 */                               return currencyIso4217Code;
                                    }
                                }
                            } catch (Throwable th4) {
/* 100 */                       th = th4;
/* 128 */                       AFLogger.INSTANCE.m1811e(AFg1cSDK.GENERAL, "Unexpected error", th);
/* 131 */                       str2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 284 */                       if (string != null) {
/* 287 */                           str3 = string;
                                }
/* 292 */                       if (str2.equals(str3)) {
/* 300 */                           AFLogger.INSTANCE.m1817w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
/* 305 */                           jSONObject = new JSONObject(str2);
                                } else {
/* 321 */                           str2 = str3;
                                }
/* 324 */                       StringBuilder sb5 = new StringBuilder();
/* 327 */                       sb5.append(this);
/* 332 */                       sb5.append(": preparing data: ");
/* 339 */                       AFg1aSDK.getRevenue(sb5.toString(), jSONObject);
/* 350 */                       this.component3.getRevenue(currencyIso4217Code != null ? currencyIso4217Code.getMonetizationNetwork.getMediationNetwork : null, str2);
/* 353 */                       return currencyIso4217Code;
                            }
                        } catch (NullPointerException e7) {
/* 113 */                   e = e7;
/* 114 */                   string = null;
                        } catch (Throwable th5) {
/* 110 */                   th = th5;
/* 111 */                   string = null;
                        }
                    } catch (NullPointerException e8) {
/* 120 */               e = e8;
/* 121 */               jSONObject = null;
/* 122 */               string = null;
                    } catch (Throwable th6) {
/* 116 */               th = th6;
/* 117 */               jSONObject = null;
/* 118 */               string = null;
                    }
                }

                public void component1(AFh1mSDK aFh1mSDK) {
/* 3 */             this.toString.getMediationNetwork(aFh1mSDK);
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final AppsFlyerRequestListener component2() {
/* 3 */             return this.copy.getCurrencyIso4217Code;
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public boolean copydefault() {
/* 1 */             return true;
                }

                public void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
/* 3 */             this.toString.AFAdRevenueData(aFh1mSDK);
                }

                public void getMediationNetwork(AFh1mSDK aFh1mSDK) {
/* 5 */             this.toString.getMonetizationNetwork(aFh1mSDK.AFAdRevenueData);
                }

                public void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
/* 3 */             this.toString.getRevenue(aFh1mSDK);
                }

                public void getRevenue(AFh1mSDK aFh1mSDK) {
/* 3 */             this.toString.getCurrencyIso4217Code(aFh1mSDK);
                }

/* 100 */       public AFf1sSDK(AFh1mSDK aFh1mSDK, AFd1zSDK aFd1zSDK) {
/* 101 */           this(aFh1mSDK, aFd1zSDK, null);
                }

/* 353 */       public void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
                    AFe1tSDK aFe1tSDK;
                    try {
                        try {
/* 354 */                   getCurrencyIso4217Code(aFh1mSDK);
/* 355 */                   getMediationNetwork(aFh1mSDK);
/* 356 */                   getMonetizationNetwork(aFh1mSDK);
/* 357 */                   getRevenue(aFh1mSDK);
/* 358 */                   component1(aFh1mSDK);
                        } catch (Throwable th) {
/* 359 */                   AFLogger.INSTANCE.m1814e(AFg1cSDK.QUEUE, "Error while collecting payload params", th, true, true, false);
                        }
/* 360 */               if (aFh1mSDK.getMediationNetwork()) {
/* 363 */                   aFh1mSDK.AFAdRevenueData((Map<String, ?>) ((AFe1fSDK) this).component1.getRevenue(aFh1mSDK.AFAdRevenueData));
/* 366 */                   aFh1mSDK.AFAdRevenueData((Map<String, ?>) ((AFe1fSDK) this).component1.getMediationNetwork(aFh1mSDK.AFAdRevenueData));
                        }
/* 367 */               if (aFh1mSDK.component1()) {
/* 368 */                   aFh1mSDK.AFAdRevenueData((Map<String, ?>) ((AFe1fSDK) this).component1.getRevenue());
                        }
/* 369 */               Set<AFe1pSDK> set = this.AFAdRevenueData;
/* 370 */               boolean z = set.contains(AFe1pSDK.LAUNCH) || set.contains(AFe1pSDK.CONVERSION);
/* 371 */               if (areAllFieldsValid() && z) {
/* 372 */                   aFh1mSDK.AFAdRevenueData(this.component2.getRevenue("appsFlyerCount", 0));
                        }
/* 373 */               if (aFh1mSDK.areAllFieldsValid()) {
/* 375 */                   Map<String, Object> mapAFAdRevenueData = AFj1aSDK.AFAdRevenueData(aFh1mSDK.AFAdRevenueData);
                            AFe1vSDK aFe1vSDK = this.copydefault;
                            String strAFAdRevenueData = aFe1vSDK.AFAdRevenueData();
                            String currencyIso4217Code = aFe1vSDK.getCurrencyIso4217Code();
/* 378 */                   if (AFe1vSDK.getMediationNetwork()) {
/* 379 */                       aFe1tSDK = AFe1tSDK.DEFAULT;
                            } else {
/* 380 */                       aFe1tSDK = AFe1tSDK.API;
                            }
/* 381 */                   AFe1xSDK aFe1xSDK = new AFe1xSDK(strAFAdRevenueData, currencyIso4217Code, aFe1tSDK);
/* 382 */                   JSONObject jSONObject = new JSONObject();
/* 383 */                   jSONObject.put("name", aFe1xSDK.getCurrencyIso4217Code);
/* 384 */                   AFe1tSDK aFe1tSDK2 = aFe1xSDK.getMonetizationNetwork;
                            if (aFe1tSDK2 != AFe1tSDK.DEFAULT) {
/* 387 */                       jSONObject.put(FirebaseAnalytics.Param.METHOD, aFe1tSDK2.getMonetizationNetwork);
                            }
/* 388 */                   String str = aFe1xSDK.getRevenue;
                            if (str != null && !StringsKt.m6228D(str)) {
/* 389 */                       jSONObject.put("prefix", aFe1xSDK.getRevenue);
                            }
/* 390 */                   mapAFAdRevenueData.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, jSONObject);
                        }
/* 391 */               if (this.equals.getMediationNetwork("AF_PREINSTALL_DISABLED")) {
/* 394 */                   AFj1aSDK.AFAdRevenueData(aFh1mSDK.AFAdRevenueData).put("preinstall_disabled", Boolean.TRUE);
                        }
/* 398 */               this.AFInAppEventType.getCurrencyIso4217Code(aFh1mSDK.AFAdRevenueData, aFh1mSDK.AFAdRevenueData());
                    } catch (Throwable th2) {
/* 399 */               AFLogger.INSTANCE.m1814e(AFg1cSDK.QUEUE, "Error while preparing to send event", th2, true, true, false);
                    }
                }
            }
