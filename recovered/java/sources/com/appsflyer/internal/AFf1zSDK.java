            package com.appsflyer.internal;

            import android.net.Uri;
            import androidx.core.app.NotificationCompat;
            import com.appsflyer.AFLogger;
            import java.net.HttpURLConnection;
            import java.net.MalformedURLException;
            import java.net.URL;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFf1zSDK extends AFe1mSDK<Map<String, Object>> {
                private static final int component2 = 2000;
                private Map<String, Object> areAllFieldsValid;
                private final AFa1mSDK component1;
                private final AFa1jSDK component3;
                private final Uri component4;
                private final List<String> copy;

                public AFf1zSDK(AFa1mSDK aFa1mSDK, AFa1jSDK aFa1jSDK, Uri uri, List<String> list) {
/* 11 */            super(AFe1pSDK.RESOLVE_ESP, new AFe1pSDK[]{AFe1pSDK.RC_CDN}, "ResolveEsp");
/* 14 */            this.component1 = aFa1mSDK;
/* 16 */            this.component3 = aFa1jSDK;
/* 18 */            this.component4 = uri;
/* 20 */            this.copy = list;
                }

                private boolean getMediationNetwork(String str) {
/* 8 */             if (str.contains("af_tranid=")) {
/* 7 */                 return false;
                    }
/* 15 */            StringBuilder sbM3513q = AbstractC0886en.m3513q("Validate if link ", str, " belongs to ESP domains: ");
/* 21 */            sbM3513q.append(this.copy);
/* 28 */            AFLogger.afRDLog(sbM3513q.toString());
                    try {
/* 42 */                return this.copy.contains(new URL(str).getHost());
                    } catch (MalformedURLException e) {
/* 50 */                AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e);
/* 7 */                 return false;
                    }
                }

                /* JADX INFO: renamed from: r_ */
                private static Map<String, Object> m1803r_(Uri uri) {
/* 3 */             HashMap map = new HashMap();
                    try {
/* 10 */                StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
/* 17 */                sb.append(uri.toString());
/* 24 */                AFLogger.afDebugLog(sb.toString());
/* 40 */                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
/* 43 */                httpURLConnection.setInstanceFollowRedirects(false);
/* 46 */                int i = component2;
/* 48 */                httpURLConnection.setReadTimeout(i);
/* 51 */                httpURLConnection.setConnectTimeout(i);
/* 58 */                httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
/* 65 */                httpURLConnection.setRequestProperty("af-esp", "6.17.6");
/* 68 */                int responseCode = httpURLConnection.getResponseCode();
/* 78 */                map.put(NotificationCompat.CATEGORY_STATUS, Integer.valueOf(responseCode));
/* 83 */                if (300 <= responseCode && responseCode <= 305) {
/* 97 */                    map.put("res", httpURLConnection.getHeaderField("Location"));
                        }
/* 103 */               httpURLConnection.disconnect();
/* 108 */               AFLogger.afDebugLog("ESP deeplink resolving is finished");
/* 111 */               return map;
                    } catch (Throwable th) {
/* 118 */               map.put("error", th.getLocalizedMessage());
/* 125 */               AFLogger.afErrorLog(th.getMessage(), th);
/* 128 */               return map;
                    }
                }

                @Override // com.appsflyer.internal.AFe1mSDK
                public final long AFAdRevenueData() {
/* 1 */             return 60000L;
                }

                @Override // com.appsflyer.internal.AFe1mSDK
                public final boolean getMonetizationNetwork() {
/* 1 */             return false;
                }

                @Override // com.appsflyer.internal.AFe1mSDK
                public final AFe1uSDK getRevenue() throws Exception {
/* 11 */            Integer num = null;
/* 12 */            if (!getMediationNetwork(this.component4.toString())) {
/* 20 */                this.component1.m1756j_(this.component3, this.component4, null);
/* 23 */                return AFe1uSDK.SUCCESS;
                    }
/* 26 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 32 */            String string = this.component4.toString();
/* 38 */            ArrayList arrayList = new ArrayList();
/* 42 */            int i = 0;
/* 43 */            String str = null;
/* 45 */            while (i < 5) {
/* 51 */                Map<String, Object> mapM1803r_ = m1803r_(Uri.parse(string));
/* 61 */                String str2 = (String) mapM1803r_.get("res");
/* 69 */                Integer num2 = (Integer) mapM1803r_.get(NotificationCompat.CATEGORY_STATUS);
/* 77 */                String str3 = (String) mapM1803r_.get("error");
/* 79 */                if (str2 == null || !getMediationNetwork(str2)) {
/* 101 */                   str = str3;
/* 102 */                   string = str2;
/* 103 */                   num = num2;
                            break;
                        }
/* 88 */                if (i < 4) {
/* 90 */                    arrayList.add(str2);
                        }
/* 93 */                i++;
/* 96 */                str = str3;
/* 97 */                string = str2;
/* 98 */                num = num2;
                    }
/* 106 */           HashMap map = new HashMap();
/* 117 */           map.put("res", string != null ? string : HttpUrl.FRAGMENT_ENCODE_SET);
/* 134 */           map.put(NotificationCompat.CATEGORY_STATUS, Integer.valueOf(num != null ? num.intValue() : -1));
/* 137 */           if (str != null) {
/* 141 */               map.put("error", str);
                    }
/* 148 */           if (!arrayList.isEmpty()) {
/* 152 */               map.put("redirects", arrayList);
                    }
/* 166 */           map.put("latency", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                    synchronized (this.component3) {
/* 176 */               this.component3.getRevenue("af_deeplink_r", map);
/* 189 */               this.component3.getRevenue("af_deeplink", this.component4.toString());
                    }
/* 208 */           this.component1.m1756j_(this.component3, string != null ? Uri.parse(string) : this.component4, this.component4);
/* 211 */           this.areAllFieldsValid = map;
/* 213 */           return AFe1uSDK.SUCCESS;
                }
            }
