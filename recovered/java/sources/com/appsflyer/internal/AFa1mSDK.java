            package com.appsflyer.internal;

            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            import android.os.Bundle;
            import com.appsflyer.AFLogger;
            import com.appsflyer.AppsFlyerConversionListener;
            import com.appsflyer.deeplink.DeepLink;
            import com.appsflyer.deeplink.DeepLinkListener;
            import com.appsflyer.deeplink.DeepLinkResult;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.UUID;
            import okhttp3.HttpUrl;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 100 */   public final class AFa1mSDK {
                public Intent AFAdRevenueData;
                public final AFd1zSDK areAllFieldsValid;
                public long component2;
                public String[] component3;
                public DeepLinkListener getCurrencyIso4217Code;
                public Map<String, String> getMediationNetwork;
                public String getMonetizationNetwork;
                public List<List<String>> getRevenue = new ArrayList();
                public final List<String> component1 = new ArrayList();

                public AFa1mSDK(AFd1zSDK aFd1zSDK) {
/* 18 */            this.areAllFieldsValid = aFd1zSDK;
                }

                /* JADX WARN: Code duplicated, block: B:25:0x0055  */
                /* JADX INFO: renamed from: h_ */
                private boolean m1752h_(Intent intent, AFa1jSDK aFa1jSDK) {
                    String string;
                    Uri uriM1753i_;
/* 3 */             Uri uri = null;
/* 21 */            Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
/* 22 */            Intent intent2 = this.AFAdRevenueData;
/* 41 */            Uri data2 = (intent2 == null || !"android.intent.action.VIEW".equals(intent2.getAction())) ? null : intent2.getData();
/* 42 */            if (intent != null) {
/* 51 */                Bundle extras = intent.getExtras();
/* 61 */                if (!this.getRevenue.isEmpty() && extras != null) {
/* 76 */                    for (List<String> list : this.getRevenue) {
/* 84 */                        if (list == null) {
/* 86 */                            uriM1753i_ = null;
                                } else {
/* 88 */                            Iterator<String> it = list.iterator();
/* 96 */                            if (it.hasNext() && (string = extras.getString(it.next())) != null) {
/* 112 */                               uriM1753i_ = m1753i_(string, it);
                                    } else {
/* 86 */                                uriM1753i_ = null;
                                    }
                                }
/* 116 */                       if (uriM1753i_ != null) {
/* 122 */                           StringBuilder sb = new StringBuilder("Found deeplink in push payload at ");
/* 129 */                           sb.append(list.toString());
/* 136 */                           AFLogger.afDebugLog(sb.toString());
/* 139 */                           List<List<String>> list2 = this.getRevenue;
/* 143 */                           Map<String, Object> mediationNetwork = AFa1ySDK.getMediationNetwork(aFa1jSDK.AFAdRevenueData);
/* 147 */                           mediationNetwork.getClass();
/* 152 */                           mediationNetwork.put("payloadKey", list2);
/* 155 */                           AFa1lSDK aFa1lSDK = aFa1jSDK.getMediationNetwork;
/* 157 */                           if (aFa1lSDK != null) {
/* 161 */                               aFa1lSDK.getMonetizationNetwork(aFa1jSDK.AFAdRevenueData);
                                    }
/* 164 */                           uri = uriM1753i_;
                                    break;
                                }
                            }
                        }
                    } else {
/* 46 */                AFLogger.afDebugLog("Could not extract deeplink from null intent");
                    }
/* 171 */           if (data != null) {
/* 175 */               AFj1gSDK aFj1gSDK = new AFj1gSDK(intent);
/* 182 */               if (!aFj1gSDK.getMediationNetwork("af_consumed")) {
/* 188 */                   aFj1gSDK.m1826I_("af_consumed", System.currentTimeMillis());
/* 191 */                   m1755g_(aFa1jSDK, data);
/* 167 */                   return true;
                        }
/* 199 */               StringBuilder sb2 = new StringBuilder("skipping re-use of previously consumed deep link: ");
/* 206 */               sb2.append(data.toString());
/* 209 */               sb2.append(" w/af_consumed");
/* 216 */               AFLogger.afInfoLog(sb2.toString());
/* 168 */               return false;
                    }
/* 220 */           if (data2 != null) {
/* 226 */               AFj1gSDK aFj1gSDK2 = new AFj1gSDK(this.AFAdRevenueData);
/* 233 */               if (!aFj1gSDK2.getMediationNetwork("af_consumed")) {
/* 239 */                   aFj1gSDK2.m1826I_("af_consumed", System.currentTimeMillis());
/* 242 */                   m1755g_(aFa1jSDK, data2);
/* 167 */                   return true;
                        }
/* 250 */               StringBuilder sb3 = new StringBuilder("skipping re-use of previously consumed trampoline deep link: ");
/* 257 */               sb3.append(data2.toString());
/* 260 */               sb3.append(" w/af_consumed");
/* 267 */               AFLogger.afInfoLog(sb3.toString());
/* 168 */               return false;
                    }
/* 271 */           if (uri == null) {
/* 322 */               AFLogger.afDebugLog("No deep link detected");
/* 168 */               return false;
                    }
/* 275 */           AFj1gSDK aFj1gSDK3 = new AFj1gSDK(intent);
/* 282 */           if (!aFj1gSDK3.getMediationNetwork("af_consumed")) {
/* 288 */               aFj1gSDK3.m1826I_("af_consumed", System.currentTimeMillis());
/* 291 */               m1755g_(aFa1jSDK, uri);
/* 167 */               return true;
                    }
/* 299 */           StringBuilder sb4 = new StringBuilder("skipping re-use of previously consumed deep link from push: ");
/* 306 */           sb4.append(uri.toString());
/* 309 */           sb4.append(" w/af_consumed");
/* 316 */           AFLogger.afInfoLog(sb4.toString());
/* 168 */           return false;
                }

                /* JADX INFO: renamed from: i_ */
                private Uri m1753i_(Object obj, Iterator<String> it) {
/* 4 */             while (obj != JSONObject.NULL) {
/* 11 */                if (!it.hasNext()) {
/* 17 */                    Uri uri = Uri.parse(obj.toString());
/* 21 */                    if (uri == null || uri.getScheme() == null || uri.getHost() == null) {
/* 3 */                         return null;
                            }
/* 35 */                    return uri;
                        }
                        try {
/* 52 */                    obj = new JSONObject(obj.toString()).get(it.next());
                        } catch (JSONException e) {
/* 60 */                    AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e);
/* 3 */                     return null;
                        }
                    }
/* 3 */             return null;
                }

                /* JADX INFO: renamed from: f_ */
                public final void m1754f_(AFa1jSDK aFa1jSDK, Intent intent, Context context) {
/* 3 */             AFc1bSDK aFc1bSDK = (AFc1bSDK) this.areAllFieldsValid;
/* 5 */             if (context != null) {
/* 13 */                aFc1bSDK.getCurrencyIso4217Code.getMonetizationNetwork = context.getApplicationContext();
                    }
/* 21 */            if (!m1752h_(intent, aFa1jSDK) && this.getCurrencyIso4217Code != null && this.areAllFieldsValid.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0) == 0 && !this.areAllFieldsValid.component4().getMediationNetwork("ddl_sent", false)) {
/* 58 */                AFa1rSDK aFa1rSDK = new AFa1rSDK();
/* 63 */                AFe1oSDK aFe1oSDKCopydefault = this.areAllFieldsValid.copydefault();
/* 81 */                aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(new AFe1oSDK.RunnableC02601(aFe1oSDKCopydefault, new AFf1xSDK(aFa1rSDK, this.areAllFieldsValid)));
                    }
/* 91 */            this.areAllFieldsValid.component4().AFAdRevenueData("ddl_sent", true);
                }

                /* JADX INFO: renamed from: g_ */
                public final void m1755g_(AFa1jSDK aFa1jSDK, Uri uri) {
/* 5 */             AFf1zSDK aFf1zSDK = new AFf1zSDK(this, aFa1jSDK, uri, this.component1);
/* 10 */            AFe1oSDK aFe1oSDKCopydefault = this.areAllFieldsValid.copydefault();
/* 21 */            aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(new AFe1oSDK.RunnableC02601(aFe1oSDKCopydefault, aFf1zSDK));
/* 25 */            this.AFAdRevenueData = null;
                }

                public final void getMediationNetwork(Map<String, String> map) {
                    DeepLinkResult deepLinkResult;
/* 3 */             if (this.getCurrencyIso4217Code != null) {
                        try {
/* 6 */                     DeepLink monetizationNetwork = DeepLink.getMonetizationNetwork(map);
/* 15 */                    monetizationNetwork.AFAdRevenueData.put("is_deferred", false);
/* 20 */                    deepLinkResult = new DeepLinkResult(monetizationNetwork, null);
/* 26 */                    return;
                        } catch (JSONException e) {
/* 37 */                    AFLogger.INSTANCE.m1812e(AFg1cSDK.DDL, "Error occurred", e, true);
/* 44 */                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
/* 50 */                    return;
                        } finally {
/* 56 */                    getRevenue(new DeepLinkResult(null, null));
                        }
                    }
/* 64 */            AppsFlyerConversionListener appsFlyerConversionListener = AFa1ySDK.getRevenue().getRevenue;
/* 66 */            if (appsFlyerConversionListener != null) {
                        try {
/* 72 */                    StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
/* 79 */                    sb.append(map.toString());
/* 86 */                    AFLogger.afDebugLog(sb.toString());
/* 89 */                    appsFlyerConversionListener.onAppOpenAttribution(map);
                        } catch (Throwable th) {
/* 98 */                    AFLogger.afErrorLog(th.getLocalizedMessage(), th);
                        }
                    }
                }

                public final void getRevenue(DeepLinkResult deepLinkResult) {
/* 3 */             if (this.getCurrencyIso4217Code == null) {
/* 51 */                AFLogger.INSTANCE.m1810d(AFg1cSDK.DDL, "skipping, no callback registered");
/* 54 */                return;
                    }
/* 5 */             AFLogger aFLogger = AFLogger.INSTANCE;
/* 7 */             AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
/* 13 */            StringBuilder sb = new StringBuilder("Calling onDeepLinking with:\n");
/* 20 */            sb.append(deepLinkResult.toString());
/* 27 */            aFLogger.m1810d(aFg1cSDK, sb.toString());
                    try {
/* 32 */                this.getCurrencyIso4217Code.onDeepLinking(deepLinkResult);
                    } catch (Throwable th) {
/* 41 */                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
                    }
                }

                /* JADX INFO: renamed from: j_ */
                public final void m1756j_(AFa1jSDK aFa1jSDK, Uri uri, Uri uri2) {
/* 7 */             if (!aFa1jSDK.getMonetizationNetwork("af_deeplink")) {
/* 9 */                 String string = uri.toString();
/* 13 */                if (string == null) {
/* 15 */                    string = null;
                        } else if (string.matches("fb\\d*?://authorize.*") && string.contains("access_token")) {
/* 36 */                    int iIndexOf = string.indexOf(63);
/* 46 */                    String strSubstring = iIndexOf == -1 ? HttpUrl.FRAGMENT_ENCODE_SET : string.substring(iIndexOf);
/* 54 */                    if (strSubstring.length() != 0) {
/* 58 */                        ArrayList arrayList = new ArrayList();
/* 67 */                        if (strSubstring.contains("&")) {
/* 79 */                            arrayList = new ArrayList(Arrays.asList(strSubstring.split("&")));
                                } else {
/* 83 */                            arrayList.add(strSubstring);
                                }
/* 88 */                        StringBuilder sb = new StringBuilder();
/* 91 */                        Iterator it = arrayList.iterator();
/* 99 */                        while (it.hasNext()) {
/* 105 */                           String str = (String) it.next();
/* 111 */                           if (str.contains("access_token")) {
/* 113 */                               it.remove();
                                    } else {
/* 121 */                               if (sb.length() != 0) {
/* 123 */                                   sb.append("&");
                                        } else if (!str.startsWith("?")) {
/* 135 */                                   sb.append("?");
                                        }
/* 138 */                               sb.append(str);
                                    }
                                }
/* 146 */                       string = string.replace(strSubstring, sb.toString());
                            }
                        }
/* 150 */               String str2 = this.getMonetizationNetwork;
/* 152 */               if (str2 != null && this.getMediationNetwork != null && string.contains(str2)) {
/* 168 */                   Uri.Builder builderBuildUpon = Uri.parse(string).buildUpon();
/* 174 */                   Uri.Builder builderBuildUpon2 = Uri.EMPTY.buildUpon();
/* 192 */                   for (Map.Entry<String, String> entry : this.getMediationNetwork.entrySet()) {
/* 212 */                       builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
/* 227 */                       builderBuildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                            }
/* 235 */                   string = builderBuildUpon.build().toString();
/* 251 */                   aFa1jSDK.AFAdRevenueData.put("appended_query_params", builderBuildUpon2.build().getEncodedQuery());
/* 254 */                   AFa1lSDK aFa1lSDK = aFa1jSDK.getMediationNetwork;
/* 256 */                   if (aFa1lSDK != null) {
/* 260 */                       aFa1lSDK.getMonetizationNetwork(aFa1jSDK.AFAdRevenueData);
                            }
                        }
/* 265 */               aFa1jSDK.AFAdRevenueData.put("af_deeplink", string);
/* 268 */               AFa1lSDK aFa1lSDK2 = aFa1jSDK.getMediationNetwork;
/* 270 */               if (aFa1lSDK2 != null) {
/* 274 */                   aFa1lSDK2.getMonetizationNetwork(aFa1jSDK.AFAdRevenueData);
                        }
                    }
/* 279 */           final HashMap map = new HashMap();
/* 288 */           map.put("link", uri.toString());
/* 291 */           if (uri2 != null) {
/* 299 */               map.put("original_link", uri2.toString());
                    }
/* 312 */           AFj1kSDK.m1830M_(this.areAllFieldsValid.AFAdRevenueData().m1787n_(), map, uri);
/* 323 */           AFf1vSDK aFf1vSDK = new AFf1vSDK(this.areAllFieldsValid, UUID.randomUUID(), uri);
/* 330 */           if (aFf1vSDK.equals()) {
/* 338 */               aFa1jSDK.AFAdRevenueData.put("isBrandedDomain", Boolean.TRUE);
/* 341 */               AFa1lSDK aFa1lSDK3 = aFa1jSDK.getMediationNetwork;
/* 343 */               if (aFa1lSDK3 != null) {
/* 347 */                   aFa1lSDK3.getMonetizationNetwork(aFa1jSDK.AFAdRevenueData);
                        }
                    }
/* 354 */           if (!aFf1vSDK.copy()) {
/* 386 */               this.areAllFieldsValid.mo1781i().getMediationNetwork(map);
/* 389 */               return;
                    }
/* 361 */           aFf1vSDK.component2 = new AFf1vSDK.AFa1tSDK() { // from class: com.appsflyer.internal.AFa1mSDK.1
                        @Override // com.appsflyer.internal.AFf1vSDK.AFa1tSDK
                        public final void AFAdRevenueData(String str3) {
/* 5 */                     AFa1mSDK.this.getMediationNetwork(str3, DeepLinkResult.Error.NETWORK);
                        }

                        @Override // com.appsflyer.internal.AFf1vSDK.AFa1tSDK
                        public final void getCurrencyIso4217Code(Map<String, String> map2) {
/* 13 */                    for (String str3 : map2.keySet()) {
/* 29 */                        map.put(str3, map2.get(str3));
                            }
/* 37 */                    AFa1mSDK.this.getMediationNetwork(map);
                        }
                    };
/* 365 */           AFe1oSDK aFe1oSDKCopydefault = this.areAllFieldsValid.copydefault();
/* 376 */           aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(new AFe1oSDK.RunnableC02601(aFe1oSDKCopydefault, aFf1vSDK));
                }

/* 101 */       public final void getMediationNetwork(String str, DeepLinkResult.Error error) {
/* 102 */           if (this.getCurrencyIso4217Code != null) {
/* 103 */               AFLogger.INSTANCE.m1810d(AFg1cSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
/* 104 */               getRevenue(new DeepLinkResult(null, error));
                    } else {
/* 105 */               getMediationNetwork(str);
                    }
                }

/* 105 */       private static void getMediationNetwork(String str) {
/* 106 */           AppsFlyerConversionListener appsFlyerConversionListener = AFa1ySDK.getRevenue().getRevenue;
                    if (appsFlyerConversionListener != null) {
                        try {
/* 107 */                   AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
/* 108 */                   appsFlyerConversionListener.onAttributionFailure(str);
                        } catch (Throwable th) {
/* 109 */                   AFLogger.afErrorLog(th.getLocalizedMessage(), th);
                        }
                    }
                }
            }
