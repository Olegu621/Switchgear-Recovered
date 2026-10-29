            package com.appsflyer.internal;

            import android.net.Uri;
            import androidx.core.app.NotificationCompat;
            import com.appsflyer.AFLogger;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001;B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\nJ\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\nJ\u0017\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\u0014J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\nJ\r\u0010#\u001a\u00020\b¢\u0006\u0004\b#\u0010\nJ\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010\nJ\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010\nJ\r\u0010&\u001a\u00020\b¢\u0006\u0004\b&\u0010\nJ\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\nJ\r\u0010(\u001a\u00020\b¢\u0006\u0004\b(\u0010\nJ\r\u0010)\u001a\u00020\b¢\u0006\u0004\b)\u0010\nJ\u0017\u0010*\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b*\u0010\u001cJ\u000f\u0010+\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010\nJ\u000f\u0010,\u001a\u00020\bH\u0002¢\u0006\u0004\b,\u0010\nJ\u000f\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010\nJ\u000f\u0010.\u001a\u00020\bH\u0002¢\u0006\u0004\b.\u0010\nJ\u001d\u00101\u001a\u00020\b*\u00020\b2\b\b\u0002\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\u00020\b*\u00020\b2\b\b\u0002\u00103\u001a\u00020/H\u0002¢\u0006\u0004\b4\u00102J\u0013\u00105\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b5\u0010\u001cJ'\u00107\u001a\u000206*\u0002062\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:¨\u0006<"}, m6176d2 = {"Lcom/appsflyer/internal/util/EventUrlResolver;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/appsflyer/internal/components/IdProvider;", "idProvider", "Lcom/appsflyer/internal/util/ServerConfigUrlFormatter;", "serverConfigUrlFormatter", "<init>", "(Lcom/appsflyer/internal/components/IdProvider;Lcom/appsflyer/internal/util/ServerConfigUrlFormatter;)V", HttpUrl.FRAGMENT_ENCODE_SET, "getAdRevenueUrl", "()Ljava/lang/String;", "getAppsTrackingUrl", "getArsBilling4", "getArsBilling5", "getDdlUrl", "getEventsTrackingUrl", "getFirstLaunchUrl", "Lcom/appsflyer/internal/model/event/AFEvent;", NotificationCompat.CATEGORY_EVENT, "getLaunchUrl", "(Lcom/appsflyer/internal/model/event/AFEvent;)Ljava/lang/String;", "getManualValidateOneTimePurchaseUrl", "getManualValidateSubscriptionPurchaseUrl", "getPlayIntegrityUrl", "getReferrerTrackingUrl", "getRegisterUrl", "billingVersion", "getUrlForArs", "(Ljava/lang/String;)Ljava/lang/String;", "devKey", "timestamp", "getUrlForDdlEvent", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getUrlForEvent", "getUrlForManualOneTimePurchaseValidation", "getUrlForManualSubscriptionPurchaseValidation", "getUrlForPlayIntegrityReporting", "getUrlForPrivacySandbox", "getUrlForRdMonitor", "getUrlForRegister", "getUrlForValidatePurchase", "getUrlForValidatePurchaseWithWebHandler", "getUrlForViap", "getValidatePurchaseUrl", "getValidatePurchaseWithWebHandlerUrl", "getViapBilling4", "getViapBilling5", HttpUrl.FRAGMENT_ENCODE_SET, "isAdRevenueEvent", "appendBuildNumber", "(Ljava/lang/String;Z)Ljava/lang/String;", "isRegisterEvent", "appendConfiguredChannel", "appendPackageName", "Landroid/net/Uri$Builder;", "appendSigQueryParam", "(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;", "Lcom/appsflyer/internal/components/IdProvider;", "Lcom/appsflyer/internal/util/ServerConfigUrlFormatter;", "Companion", "SDK_prodRelease"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 2 */     public final class AFj1cSDK {
                public static final String AFAdRevenueData;
                public static final String areAllFieldsValid;
                public static final String component1;
                public static final String component2;
                public static final String component3;
                public static final String component4;
                private static final String equals;
                public static final AFa1ySDK getCurrencyIso4217Code = new AFa1ySDK(null);
                public static final String getMediationNetwork;
                public static final String getMonetizationNetwork;
                private final AFc1oSDK copydefault;
                public final AFk1zSDK getRevenue;

                static {
/* 13 */            String strM3783i = fm0.m3783i(com.appsflyer.internal.AFa1ySDK.getMediationNetwork, "/androidevent?app_id=");
/* 17 */            equals = strM3783i;
/* 25 */            getMediationNetwork = "https://%sattr.%s/api/v".concat(strM3783i);
/* 29 */            AFAdRevenueData = "https://%sadrevenue.%s/api/v2/generic/v6.17.6/android?app_id=";
/* 37 */            getMonetizationNetwork = AbstractC0886en.m3507k("https://%sconversions.%s/api/v", strM3783i);
/* 45 */            areAllFieldsValid = AbstractC0886en.m3507k("https://%slaunches.%s/api/v", strM3783i);
/* 53 */            component4 = AbstractC0886en.m3507k("https://%sinapps.%s/api/v", strM3783i);
/* 61 */            component2 = AbstractC0886en.m3507k("https://%sregister.%s/api/v", strM3783i);
/* 69 */            component1 = AbstractC0886en.m3507k("https://%svalidate.%s/api/v", strM3783i);
/* 73 */            component3 = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
                }

                private AFj1cSDK(AFc1oSDK aFc1oSDK, AFk1zSDK aFk1zSDK) {
/* 1 */             aFc1oSDK.getClass();
/* 4 */             aFk1zSDK.getClass();
/* 10 */            this.copydefault = aFc1oSDK;
/* 12 */            this.getRevenue = aFk1zSDK;
                }

                public static String getRevenue(String str, boolean z) {
/* 8 */             return fm0.m3783i(str, !z ? "&buildnumber=6.17.6" : HttpUrl.FRAGMENT_ENCODE_SET);
                }

                public final String getMediationNetwork(String str, boolean z) {
/* 1 */             if (z) {
/* 3 */                 return str;
                    }
/* 6 */             String strComponent3 = this.copydefault.component3();
/* 19 */            String strConcat = strComponent3 != null ? "&channel=".concat(strComponent3) : null;
/* 20 */            if (strConcat == null) {
/* 22 */                strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 24 */            return fm0.m3783i(str, strConcat);
                }

                public final String getMonetizationNetwork(String str, String str2) {
/* 7 */             String packageName = this.copydefault.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName();
/* 11 */            packageName.getClass();
/* 16 */            String strComponent3 = this.copydefault.component3();
/* 20 */            if (strComponent3 != null && !StringsKt.m6228D(strComponent3)) {
/* 39 */                strComponent3 = AbstractC0886en.m3507k("-", StringsKt.m6239O(strComponent3).toString());
                    }
/* 43 */            if (strComponent3 == null) {
/* 45 */                strComponent3 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 51 */            String string = StringsKt.m6239O(strComponent3).toString();
/* 86 */            Uri.Builder builderAppendPath = Uri.parse(this.getRevenue.getMediationNetwork("https://%sdlsdk.%s/v1.0/android/")).buildUpon().appendPath(packageName + string);
/* 90 */            builderAppendPath.getClass();
/* 93 */            if (str == null || str2 == null) {
/* 117 */               String str3 = str == null ? "devKey" : "timestamp";
/* 144 */               AFLogger.INSTANCE.mo1748e(AFg1cSDK.GENERAL, str3.concat(" is null at attempt to generate ddl event url"), new IllegalStateException(str3.concat(" is null")), true, false, false, true);
                    } else {
/* 108 */               builderAppendPath.appendQueryParameter("af_sig", AFj1dSDK.getMonetizationNetwork(str2.concat(str), str));
                    }
/* 159 */           String string2 = builderAppendPath.appendQueryParameter("sdk_version", com.appsflyer.internal.AFa1ySDK.getMediationNetwork).build().toString();
/* 163 */           string2.getClass();
/* 166 */           return string2;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006"}, m6176d2 = {"Lcom/appsflyer/internal/AFj1cSDK$AFa1ySDK;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "Ljava/lang/String;", "getCurrencyIso4217Code", "AFAdRevenueData", "getMonetizationNetwork", "component4", "getRevenue", "areAllFieldsValid", "getMediationNetwork", "component3", "component2", "component1"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 3 */         public static final class AFa1ySDK {
                    private AFa1ySDK() {
                    }

/* 4 */             public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
/* 5 */                 this();
                    }
                }

/* 14 */        public /* synthetic */ AFj1cSDK(AFc1oSDK aFc1oSDK, AFk1zSDK aFk1zSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 16 */            this(aFc1oSDK, (i & 2) != 0 ? new AFk1ySDK() : aFk1zSDK);
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
/* 16 */        public AFj1cSDK(AFc1oSDK aFc1oSDK) {
                    this(aFc1oSDK, null, 2, 0 == true ? 1 : 0);
/* 17 */            aFc1oSDK.getClass();
                }

/* 28 */        public final String getMediationNetwork(String str) {
/* 33 */            return fm0.m3783i(str, this.copydefault.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName());
                }

/* 34 */        public static String getMediationNetwork() {
/* 35 */            return "https://privacy-sandbox.appsflyersdk.com/api/trigger";
                }
            }
