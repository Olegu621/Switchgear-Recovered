            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            import com.appsflyer.attribution.AppsFlyerRequestListener;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u0002H\u0015¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0012\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0012\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010$\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u001c\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010("}, m6176d2 = {"Lcom/appsflyer/internal/AFe1aSDK;", "Lcom/appsflyer/internal/AFe1fSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/appsflyer/internal/AFi1hSDK;", "p0", "Lcom/appsflyer/internal/AFc1oSDK;", "p1", "Lcom/appsflyer/internal/AFd1zSDK;", "p2", "Lcom/appsflyer/internal/AFg1nSDK;", "p3", "Lcom/appsflyer/internal/AFc1hSDK;", "p4", "Lcom/appsflyer/internal/AFh1iSDK;", "p5", "<init>", "(Lcom/appsflyer/internal/AFi1hSDK;Lcom/appsflyer/internal/AFc1oSDK;Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFg1nSDK;Lcom/appsflyer/internal/AFc1hSDK;Lcom/appsflyer/internal/AFh1iSDK;)V", "Lcom/appsflyer/internal/AFd1hSDK;", "AFAdRevenueData", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1hSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "()J", "Lcom/appsflyer/attribution/AppsFlyerRequestListener;", "component2", "()Lcom/appsflyer/attribution/AppsFlyerRequestListener;", HttpUrl.FRAGMENT_ENCODE_SET, "copydefault", "()Z", "getMonetizationNetwork", "equals", "Lcom/appsflyer/internal/AFc1hSDK;", "getRevenue", "Lcom/appsflyer/internal/AFh1iSDK;", "getCurrencyIso4217Code", "toString", "Lcom/appsflyer/internal/AFg1nSDK;", "getMediationNetwork", "copy", "Lcom/appsflyer/internal/AFc1oSDK;", "hashCode", "Lcom/appsflyer/internal/AFi1hSDK;"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 46 */    public final class AFe1aSDK extends AFe1fSDK<String> {

                /* JADX INFO: renamed from: component2, reason: from kotlin metadata */
                public AFh1iSDK getCurrencyIso4217Code;

                /* JADX INFO: renamed from: copy, reason: from kotlin metadata */
                private final AFc1oSDK AFAdRevenueData;

                /* JADX INFO: renamed from: equals, reason: from kotlin metadata */
                private final AFc1hSDK getRevenue;

                /* JADX INFO: renamed from: hashCode, reason: from kotlin metadata */
                private final AFi1hSDK getMonetizationNetwork;

                /* JADX INFO: renamed from: toString, reason: from kotlin metadata */
                private final AFg1nSDK getMediationNetwork;

                /* JADX WARN: Illegal instructions before constructor call */
                private AFe1aSDK(AFi1hSDK aFi1hSDK, AFc1oSDK aFc1oSDK, AFd1zSDK aFd1zSDK, AFg1nSDK aFg1nSDK, AFc1hSDK aFc1hSDK, AFh1iSDK aFh1iSDK) {
/* 1 */             aFi1hSDK.getClass();
/* 4 */             aFc1oSDK.getClass();
/* 7 */             aFd1zSDK.getClass();
/* 10 */            aFg1nSDK.getClass();
/* 13 */            aFc1hSDK.getClass();
/* 16 */            aFh1iSDK.getClass();
/* 19 */            AFe1pSDK aFe1pSDK = AFe1pSDK.PLAY_INTEGRITY_API;
/* 21 */            AFe1pSDK aFe1pSDK2 = AFe1pSDK.CONVERSION;
/* 29 */            super(aFe1pSDK, new AFe1pSDK[]{aFe1pSDK2}, aFd1zSDK, "PIA");
/* 32 */            this.getMonetizationNetwork = aFi1hSDK;
/* 34 */            this.AFAdRevenueData = aFc1oSDK;
/* 36 */            this.getMediationNetwork = aFg1nSDK;
/* 38 */            this.getRevenue = aFc1hSDK;
/* 40 */            this.getCurrencyIso4217Code = aFh1iSDK;
/* 44 */            this.AFAdRevenueData.add(aFe1pSDK2);
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final AFd1hSDK<String> AFAdRevenueData(String p0) throws JSONException {
                    AFd1bSDK aFd1bSDK;
                    String str;
                    LinkedHashMap linkedHashMap;
/* 5 */             p0.getClass();
/* 8 */             AFh1iSDK aFh1iSDK = this.getCurrencyIso4217Code;
/* 10 */            Map<String, Object> map = aFh1iSDK.AFAdRevenueData;
/* 12 */            map.getClass();
/* 27 */            map.put("app_id", this.AFAdRevenueData.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName());
/* 36 */            map.put("sdk_version", AFc1oSDK.getMonetizationNetwork());
/* 49 */            map.put("app_version_name", this.AFAdRevenueData.m1787n_().versionName);
/* 54 */            this.getMediationNetwork.AFAdRevenueData(map);
                    try {
/* 59 */                AFi1jSDK mediationNetwork = this.getMonetizationNetwork.getMediationNetwork();
/* 63 */                if (mediationNetwork != null) {
/* 67 */                    linkedHashMap = new LinkedHashMap();
/* 72 */                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 83 */                    linkedHashMap2.put("pia_timestamp", Long.valueOf(mediationNetwork.getMediationNetwork));
/* 94 */                    linkedHashMap2.put("ttr_millis", Long.valueOf(mediationNetwork.getCurrencyIso4217Code));
/* 97 */                    String str2 = mediationNetwork.getRevenue;
/* 99 */                    if (str2 != null) {
/* 101 */                       linkedHashMap2.put("pia_token", str2);
                            }
/* 109 */                   String str3 = mediationNetwork.AFAdRevenueData;
/* 111 */                   if (str3 != null) {
/* 115 */                       linkedHashMap2.put("error_code", str3);
                            }
/* 118 */                   linkedHashMap.put("pia", linkedHashMap2);
                        } else {
/* 122 */                   linkedHashMap = null;
                        }
/* 123 */               if (linkedHashMap != null) {
/* 125 */                   aFh1iSDK.AFAdRevenueData(linkedHashMap);
                        }
/* 134 */               if (!this.getMonetizationNetwork.AFAdRevenueData()) {
/* 136 */                   Map<String, Object> map2 = aFh1iSDK.AFAdRevenueData;
/* 138 */                   map2.getClass();
/* 149 */                   AFj1aSDK.AFAdRevenueData(map2).put("pia_disabled", Boolean.TRUE);
                        }
                    } catch (Throwable th) {
/* 166 */               AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PLAY_INTEGRITY_API, "Error while adding PIA data to payload", th, true, false, false, false, 96, null);
                    }
/* 181 */           AFd1hSDK<String> currencyIso4217Code = ((AFe1fSDK) this).component4.getCurrencyIso4217Code(this.getCurrencyIso4217Code, ((AFe1fSDK) this).component1.getMediationNetwork(), this.getRevenue);
/* 187 */           Map<String, Object> map3 = this.getCurrencyIso4217Code.AFAdRevenueData;
/* 189 */           map3.getClass();
/* 192 */           if (currencyIso4217Code != null && (aFd1bSDK = currencyIso4217Code.getMonetizationNetwork) != null && (str = aFd1bSDK.getMediationNetwork) != null) {
/* 205 */               JSONObject jSONObject = new JSONObject(map3);
/* 212 */               if (jSONObject.has("pia")) {
/* 214 */                   JSONObject jSONObject2 = jSONObject.getJSONObject("pia");
/* 222 */                   if (jSONObject2.has("pia_token")) {
/* 232 */                       jSONObject2.put("pia_token", AFg1aSDK.getCurrencyIso4217Code(jSONObject2.getString("pia_token")));
                            }
                        }
/* 256 */               AFg1aSDK.getRevenue(toString() + ": preparing data: ", jSONObject);
/* 259 */               AFd1oSDK aFd1oSDK = this.component3;
/* 261 */               String string = jSONObject.toString();
/* 265 */               string.getClass();
/* 268 */               aFd1oSDK.getRevenue(str, string);
                    }
/* 271 */           return currencyIso4217Code;
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final AppsFlyerRequestListener component2() {
/* 1 */             return null;
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final boolean copydefault() {
/* 1 */             return false;
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
                public final boolean getMonetizationNetwork() {
/* 1 */             return false;
                }

/* 47 */        public /* synthetic */ AFe1aSDK(AFi1hSDK aFi1hSDK, AFc1oSDK aFc1oSDK, AFd1zSDK aFd1zSDK, AFg1nSDK aFg1nSDK, AFc1hSDK aFc1hSDK, AFh1iSDK aFh1iSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 49 */            this(aFi1hSDK, aFc1oSDK, aFd1zSDK, aFg1nSDK, aFc1hSDK, (i & 32) != 0 ? new AFh1iSDK() : aFh1iSDK);
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 49 */        public AFe1aSDK(AFi1hSDK aFi1hSDK, AFc1oSDK aFc1oSDK, AFd1zSDK aFd1zSDK, AFg1nSDK aFg1nSDK, AFc1hSDK aFc1hSDK) {
                    this(aFi1hSDK, aFc1oSDK, aFd1zSDK, aFg1nSDK, aFc1hSDK, null, 32, null);
/* 50 */            aFi1hSDK.getClass();
                    aFc1oSDK.getClass();
                    aFd1zSDK.getClass();
                    aFg1nSDK.getClass();
                    aFc1hSDK.getClass();
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
/* 271 */       public final long AFAdRevenueData() {
/* 272 */           return 60000L;
                }
            }
