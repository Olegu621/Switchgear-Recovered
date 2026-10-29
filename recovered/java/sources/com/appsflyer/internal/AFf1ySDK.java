            package com.appsflyer.internal;

            import com.appsflyer.AFPurchaseDetails;
            import com.appsflyer.AFPurchaseType;
            import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
            import com.appsflyer.AppsFlyerProperties;
            import com.appsflyer.internal.components.network.http.ResponseNetwork;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.Pair;
            import kotlin.Unit;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            import org.json.JSONException;
            import org.json.JSONObject;
            import p000.C2085pw;
            import p000.ds0;
            import p000.m42;
            import p000.n42;
            import p000.o42;
            import p000.oc1;
            import p000.od0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001*BK\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u0017\u001a\u000e\u0012\b\u0012\u0006*\u00020\t0\t\u0018\u00010\u00162\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u00020\t2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0019\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0019\u0010\u001eR\"\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, m6176d2 = {"Lcom/appsflyer/internal/AFf1ySDK;", "Lcom/appsflyer/internal/AFe1jSDK;", "Lcom/appsflyer/internal/AFd1zSDK;", "p0", "Lcom/appsflyer/AppsFlyerProperties;", "p1", "Lcom/appsflyer/AFPurchaseDetails;", "p2", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "p3", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "p4", "Lcom/appsflyer/internal/AFj1iSDK;", "p5", "<init>", "(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/AppsFlyerProperties;Lcom/appsflyer/AFPurchaseDetails;Ljava/util/Map;Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;Lcom/appsflyer/internal/AFj1iSDK;)V", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getMonetizationNetwork", "(Ljava/util/Map;Ljava/lang/String;)V", "Lcom/appsflyer/internal/AFd1hSDK;", "getRevenue", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1hSDK;", "getCurrencyIso4217Code", "(Ljava/util/Map;)Ljava/lang/String;", HttpUrl.FRAGMENT_ENCODE_SET, "getMediationNetwork", "(Ljava/lang/String;I)V", "()V", "hashCode", "Ljava/util/Map;", "AFAdRevenueData", "copydefault", "Lcom/appsflyer/internal/AFj1iSDK;", "equals", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "component2", "Lcom/appsflyer/AppsFlyerProperties;", "toString", "Lcom/appsflyer/AFPurchaseDetails;", "AFa1tSDK"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 50 */    public final class AFf1ySDK extends AFe1jSDK {

                /* JADX INFO: renamed from: component2, reason: from kotlin metadata */
                private final AppsFlyerProperties getRevenue;

                /* JADX INFO: renamed from: copydefault, reason: from kotlin metadata */
                private final AFj1iSDK getMonetizationNetwork;

                /* JADX INFO: renamed from: equals, reason: from kotlin metadata */
                private final AppsFlyerInAppPurchaseValidationCallback getMediationNetwork;

                /* JADX INFO: renamed from: hashCode, reason: from kotlin metadata */
                private final Map<String, String> AFAdRevenueData;

                /* JADX INFO: renamed from: toString, reason: from kotlin metadata */
                private final AFPurchaseDetails getCurrencyIso4217Code;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class AFa1tSDK extends RuntimeException {
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public /* synthetic */ class AFa1ySDK {
                    public static final /* synthetic */ int[] getRevenue;

                    static {
/* 6 */                 int[] iArr = new int[AFPurchaseType.values().length];
                        try {
/* 15 */                    iArr[AFPurchaseType.SUBSCRIPTION.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 24 */                    iArr[AFPurchaseType.ONE_TIME_PURCHASE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
/* 26 */                getRevenue = iArr;
                    }
                }

                /* JADX WARN: Illegal instructions before constructor call */
                private AFf1ySDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1iSDK aFj1iSDK) {
/* 1 */             aFd1zSDK.getClass();
/* 4 */             appsFlyerProperties.getClass();
/* 7 */             aFPurchaseDetails.getClass();
/* 10 */            aFj1iSDK.getClass();
/* 13 */            AFe1pSDK aFe1pSDK = AFe1pSDK.MANUAL_PURCHASE_VALIDATION;
/* 19 */            AFe1pSDK[] aFe1pSDKArr = {AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID};
/* 23 */            od0 od0Var = od0.f14715a;
/* 25 */            od0Var.getClass();
/* 31 */            super(aFe1pSDK, aFe1pSDKArr, aFd1zSDK, null, od0Var);
/* 34 */            this.getRevenue = appsFlyerProperties;
/* 36 */            this.getCurrencyIso4217Code = aFPurchaseDetails;
/* 38 */            this.AFAdRevenueData = map;
/* 40 */            this.getMediationNetwork = appsFlyerInAppPurchaseValidationCallback;
/* 42 */            this.getMonetizationNetwork = aFj1iSDK;
/* 48 */            this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
                }

                private final void getMediationNetwork(String p0, int p1) {
/* 1 */             AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.getMediationNetwork;
/* 3 */             if (appsFlyerInAppPurchaseValidationCallback != null) {
/* 31 */                appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(oc1.m7131e(new Pair("error_code", Integer.valueOf(p1)), new Pair("error_message", p0)));
                    }
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
                public final void getCurrencyIso4217Code() {
                    Object n42Var;
/* 1 */             super.getCurrencyIso4217Code();
/* 4 */             Throwable thComponent1 = component1();
/* 8 */             if (thComponent1 != null && !(thComponent1 instanceof AFe1iSDK)) {
/* 17 */                if (thComponent1 instanceof AFe1nSDK) {
/* 21 */                    getMediationNetwork("No dev key", -1);
                        } else if (thComponent1 instanceof AFa1tSDK) {
/* 31 */                    getMediationNetwork("One or more of provided arguments is empty", -1);
                        } else {
/* 37 */                    getMediationNetwork("Error while sending request to server", -1);
                        }
                    }
/* 40 */            ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
/* 42 */            if (responseNetwork != null) {
/* 50 */                if (responseNetwork.getStatusCode() != 200) {
/* 107 */                   AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.getMediationNetwork;
/* 109 */                   if (appsFlyerInAppPurchaseValidationCallback != null) {
/* 145 */                       appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(oc1.m7131e(new Pair("error_code", Integer.valueOf(responseNetwork.getStatusCode())), new Pair("error_message", responseNetwork.getBody())));
/* 148 */                       return;
                            }
/* 148 */                   return;
                        }
                        try {
/* 52 */                    m42 m42Var = o42.f14612b;
/* 54 */                    AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.getMediationNetwork;
/* 56 */                    if (appsFlyerInAppPurchaseValidationCallback2 != null) {
/* 73 */                        appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationFinished(AFj1bSDK.getMonetizationNetwork(new JSONObject((String) responseNetwork.getBody())));
/* 76 */                        n42Var = Unit.f12910a;
                            } else {
/* 81 */                        n42Var = null;
                            }
                        } catch (Throwable th) {
/* 83 */                    m42 m42Var2 = o42.f14612b;
/* 87 */                    n42Var = new n42(th);
                        }
/* 95 */                if (o42.m7099a(n42Var) != null) {
/* 103 */                   getMediationNetwork("Error while trying to parse JSON response", responseNetwork.getStatusCode());
                        }
                    }
                }

                @Override // com.appsflyer.internal.AFe1jSDK
                public final void getMonetizationNetwork(Map<String, Object> p0, String p1) throws JSONException {
                    Object monetizationNetwork;
/* 1 */             p0.getClass();
/* 4 */             super.getMonetizationNetwork(p0, p1);
/* 23 */            List listM7566e = C2085pw.m7566e(this.getCurrencyIso4217Code.getPurchaseToken(), this.getCurrencyIso4217Code.getProductId());
/* 27 */            if (listM7566e == null || !listM7566e.isEmpty()) {
/* 35 */                Iterator it = listM7566e.iterator();
/* 43 */                while (it.hasNext()) {
/* 55 */                    if (((String) it.next()).length() == 0) {
/* 63 */                        throw new AFa1tSDK();
                            }
                        }
                    }
/* 72 */            p0.put("purchase_token", this.getCurrencyIso4217Code.getPurchaseToken());
/* 83 */            p0.put("product_id", this.getCurrencyIso4217Code.getProductId());
/* 98 */            p0.put("purchase_type", this.getCurrencyIso4217Code.getPurchaseType().getValue());
/* 101 */           Map<String, String> map = this.AFAdRevenueData;
/* 103 */           if (map != null && !map.isEmpty()) {
/* 116 */               p0.put("purchase_additional_details", this.AFAdRevenueData);
                    }
/* 123 */           String string = this.getRevenue.getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
/* 127 */           if (string == null || string.length() == 0) {
/* 146 */               monetizationNetwork = od0.f14715a;
/* 148 */               monetizationNetwork.getClass();
                    } else {
/* 141 */               monetizationNetwork = AFj1bSDK.getMonetizationNetwork(new JSONObject(string));
                    }
/* 153 */           p0.put("custom_data", monetizationNetwork);
                }

                @Override // com.appsflyer.internal.AFe1jSDK
                public final AFd1hSDK<String> getRevenue(Map<String, Object> p0, String p1, String p2) {
/* 1 */             p0.getClass();
/* 4 */             p1.getClass();
/* 19 */            int i = AFa1ySDK.getRevenue[this.getCurrencyIso4217Code.getPurchaseType().ordinal()];
/* 22 */            if (i == 1) {
/* 41 */                return ((AFe1fSDK) this).component4.getCurrencyIso4217Code(p0, p1);
                    }
/* 25 */            if (i == 2) {
/* 29 */                return ((AFe1fSDK) this).component4.getMonetizationNetwork(p0, p1);
                    }
/* 34 */            ds0.m3187b();
/* 37 */            return null;
                }

/* 51 */        public /* synthetic */ AFf1ySDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1iSDK aFj1iSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 53 */            this(aFd1zSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i & 32) != 0 ? new AFj1hSDK() : aFj1iSDK);
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 53 */        public AFf1ySDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
                    this(aFd1zSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 32, null);
/* 54 */            aFd1zSDK.getClass();
                    appsFlyerProperties.getClass();
                    aFPurchaseDetails.getClass();
                }

                @Override // com.appsflyer.internal.AFe1jSDK
/* 148 */       public final String getCurrencyIso4217Code(Map<String, Object> p0) {
                    p0.getClass();
/* 149 */           return this.getMonetizationNetwork.getMediationNetwork();
                }
            }
