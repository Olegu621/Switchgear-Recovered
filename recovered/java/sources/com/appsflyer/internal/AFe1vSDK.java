            package com.appsflyer.internal;

            import android.util.Base64;
            import com.appsflyer.AFLogger;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.util.Arrays;
            import java.util.List;
            import java.util.Locale;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.text.Charsets;
            import kotlin.text.Regex;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import p000.C2085pw;
            import p000.b51;
            import p000.ds0;
            import p000.fm0;
            import p000.p51;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0015\u0010\u000b\u001a\u00020\u000e8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0015\u0010\b\u001a\u00020\u000e8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0013"}, m6176d2 = {"Lcom/appsflyer/internal/AFe1vSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/appsflyer/internal/AFc1oSDK;", "p0", "Lcom/appsflyer/internal/AFc1qSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1oSDK;Lcom/appsflyer/internal/AFc1qSDK;)V", "getRevenue", "Lcom/appsflyer/internal/AFc1oSDK;", "getCurrencyIso4217Code", "getMediationNetwork", "Lcom/appsflyer/internal/AFc1qSDK;", "component2", HttpUrl.FRAGMENT_ENCODE_SET, "Lp51;", "AFAdRevenueData", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "()Ljava/lang/String;", "component3", "getMonetizationNetwork", "AFa1ySDK"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 2 */     public final class AFe1vSDK {
                private static AFe1ySDK component1;

                /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
                public final p51 getRevenue;

                /* JADX INFO: renamed from: component2, reason: from kotlin metadata */
                private final p51 getMediationNetwork;

                /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
                private final AFc1qSDK component2;

                /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
                private final AFc1oSDK getCurrencyIso4217Code;

                /* JADX INFO: renamed from: AFa1ySDK, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static String getMonetizationNetwork = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
                public static String getCurrencyIso4217Code = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
                private static final List<String> component4 = C2085pw.m7566e("googleplay", "playstore", "googleplaystore");

                /* JADX INFO: renamed from: com.appsflyer.internal.AFe1vSDK$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m6176d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "getRevenue", "()Ljava/lang/String;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02661 extends b51 implements Function0<String> {
                    public C02661() {
/* 4 */                 super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
/* 11 */                String packageName = AFe1vSDK.this.getCurrencyIso4217Code.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName();
/* 15 */                packageName.getClass();
/* 24 */                return AFe1vSDK.getMediationNetwork(packageName, AFe1vSDK.AFAdRevenueData(AFe1vSDK.this));
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.internal.AFe1vSDK$5 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m6176d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "getMediationNetwork", "()Ljava/lang/String;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02675 extends b51 implements Function0<String> {
                    public C02675() {
/* 4 */                 super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
/* 17 */                String strAFAdRevenueData = AFa1ySDK.AFAdRevenueData(AFe1vSDK.this.component2, AFe1vSDK.this.getCurrencyIso4217Code.component3());
/* 21 */                String str = HttpUrl.FRAGMENT_ENCODE_SET;
/* 23 */                if (strAFAdRevenueData != null && !StringsKt.m6228D(strAFAdRevenueData)) {
/* 36 */                    String string = StringsKt.m6239O(strAFAdRevenueData).toString();
/* 40 */                    List<String> monetizationNetwork = Companion.getMonetizationNetwork();
/* 44 */                    Locale locale = Locale.getDefault();
/* 48 */                    locale.getClass();
/* 51 */                    String lowerCase = string.toLowerCase(locale);
/* 55 */                    lowerCase.getClass();
/* 62 */                    if (monetizationNetwork.contains(lowerCase)) {
/* 86 */                        AFLogger.afWarnLog(String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{string}, 1)));
/* 89 */                        strAFAdRevenueData = HttpUrl.FRAGMENT_ENCODE_SET;
                            } else {
/* 66 */                        strAFAdRevenueData = "-".concat(string);
                            }
                        }
/* 90 */                if (strAFAdRevenueData != null) {
/* 93 */                    str = strAFAdRevenueData;
                        }
/* 98 */                return StringsKt.m6239O(str).toString();
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public /* synthetic */ class AFa1uSDK {
                    public static final /* synthetic */ int[] AFAdRevenueData;

                    static {
/* 6 */                 int[] iArr = new int[AFe1tSDK.values().length];
                        try {
/* 15 */                    iArr[AFe1tSDK.DEFAULT.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 24 */                    iArr[AFe1tSDK.API.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
/* 33 */                    iArr[AFe1tSDK.RC.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
/* 35 */                AFAdRevenueData = iArr;
                    }
                }

                public AFe1vSDK(AFc1oSDK aFc1oSDK, AFc1qSDK aFc1qSDK) {
/* 1 */             aFc1oSDK.getClass();
/* 4 */             aFc1qSDK.getClass();
/* 10 */            this.getCurrencyIso4217Code = aFc1oSDK;
/* 12 */            this.component2 = aFc1qSDK;
/* 23 */            this.getMediationNetwork = r51.m8065b(new C02675());
/* 34 */            this.getRevenue = r51.m8065b(new C02661());
                }

                public static final /* synthetic */ String getMediationNetwork(String str, String str2) throws NoSuchAlgorithmException {
/* 1 */             String strM3783i = fm0.m3783i(str, str2);
/* 7 */             MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
/* 13 */            byte[] bytes = strM3783i.getBytes(Charsets.UTF_8);
/* 17 */            bytes.getClass();
/* 20 */            byte[] bArrDigest = messageDigest.digest(bytes);
/* 24 */            bArrDigest.getClass();
/* 28 */            String strEncodeToString = Base64.encodeToString(bArrDigest, 2);
/* 32 */            strEncodeToString.getClass();
/* 37 */            String lowerCase = strEncodeToString.toLowerCase(Locale.ROOT);
/* 41 */            lowerCase.getClass();
/* 65 */            return new Regex("[^\\w]+").replace(lowerCase, HttpUrl.FRAGMENT_ENCODE_SET).substring(0, 6).concat(".");
                }

                public static final void getMonetizationNetwork(AFe1ySDK aFe1ySDK) {
/* 1 */             Companion.getMonetizationNetwork(aFe1ySDK);
                }

                public final String AFAdRevenueData() {
/* 18 */            int i = AFa1uSDK.AFAdRevenueData[(getMediationNetwork() ? AFe1tSDK.DEFAULT : AFe1tSDK.API).ordinal()];
/* 21 */            if (i == 1) {
/* 47 */                return "appsflyersdk.com";
                    }
/* 27 */            if (i == 2) {
/* 37 */                AFe1ySDK aFe1ySDK = component1;
/* 41 */                String str = aFe1ySDK != null ? aFe1ySDK.getCurrencyIso4217Code : null;
                        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
                    }
/* 30 */            if (i == 3) {
/* 25 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 33 */            ds0.m3187b();
/* 24 */            return null;
                }

                public final String getCurrencyIso4217Code() {
/* 18 */            int i = AFa1uSDK.AFAdRevenueData[(getMediationNetwork() ? AFe1tSDK.DEFAULT : AFe1tSDK.API).ordinal()];
/* 21 */            if (i == 1) {
/* 53 */                return (String) this.getRevenue.getValue();
                    }
/* 27 */            if (i == 2) {
/* 37 */                AFe1ySDK aFe1ySDK = component1;
/* 41 */                String str = aFe1ySDK != null ? aFe1ySDK.getMonetizationNetwork : null;
                        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
                    }
/* 30 */            if (i == 3) {
/* 25 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 33 */            ds0.m3187b();
/* 24 */            return null;
                }

                /* JADX INFO: renamed from: com.appsflyer.internal.AFe1vSDK$AFa1ySDK, reason: from kotlin metadata */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\"\u0004\b\b\u0010\u0011"}, m6176d2 = {"Lcom/appsflyer/internal/AFe1vSDK$AFa1ySDK;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "component4", "Ljava/util/List;", "getMonetizationNetwork", "()Ljava/util/List;", "AFAdRevenueData", "Ljava/lang/String;", "getMediationNetwork", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFe1ySDK;", "component1", "Lcom/appsflyer/internal/AFe1ySDK;", "(Lcom/appsflyer/internal/AFe1ySDK;)V"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    private Companion() {
                    }

                    public static List<String> getMonetizationNetwork() {
/* 5 */                 return AFe1vSDK.component4;
                    }

/* 4 */             public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 5 */                 this();
                    }

/* 5 */             public static void getMonetizationNetwork(AFe1ySDK aFe1ySDK) {
/* 70 */                AFe1vSDK.component1 = aFe1ySDK;
                    }
                }

/* 49 */        public static final /* synthetic */ String AFAdRevenueData(AFe1vSDK aFe1vSDK) {
/* 50 */            return (String) aFe1vSDK.getMediationNetwork.getValue();
                }

/* 70 */        public static boolean getMediationNetwork() {
                    return component1 == null;
                }
            }
