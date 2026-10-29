            package com.appsflyer.internal;

            import android.graphics.PointF;
            import android.os.Build;
            import com.appsflyer.AFLogger;
            import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import kotlin.Pair;
            import kotlin.jvm.functions.Function0;
            import kotlin.text.Charsets;
            import kotlin.text.MatchGroup;
            import kotlin.text.Regex;
            import kotlin.text.StringsKt;
            import p000.RunnableC2558zo;
            import p000.b51;
            import p000.nc1;
            import p000.oc1;
            import p000.p51;
            import p000.r51;
            import p000.ra2;
            import p000.sc1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 46 */    public final class AFd1wSDK implements AFd1xSDK {
                private static int $10 = 0;
                private static int $11 = 1;
                private static int AFKeystoreWrapper = 1;
                private static char copy = 10357;
                private static int copydefault = 0;
                private static char equals = 787;
                private static char hashCode = 7956;
                private static char toString = 48673;
                private AFd1zSDK AFAdRevenueData;
                private final p51 areAllFieldsValid;
                private AFd1xSDK.AFa1vSDK component1;
                private final p51 component2;
                private final p51 component3;
                private final String component4;
                private final p51 getCurrencyIso4217Code;
                private final p51 getMediationNetwork;
                private final p51 getMonetizationNetwork;
                private final p51 getRevenue;

                /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m6176d2 = {"Lcom/appsflyer/internal/AFd1ySDK;", "AFAdRevenueData", "()Lcom/appsflyer/internal/AFd1ySDK;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02511 extends b51 implements Function0<AFd1ySDK> {
                    public C02511() {
/* 4 */                 super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
                    public final AFd1ySDK invoke() {
/* 9 */                 AFc1hSDK aFc1hSDKAFInAppEventParameterName = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFInAppEventParameterName();
/* 13 */                aFc1hSDKAFInAppEventParameterName.getClass();
/* 16 */                return new AFd1ySDK(aFc1hSDKAFInAppEventParameterName);
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$2 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m6176d2 = {"Lcom/appsflyer/internal/AFc1qSDK;", "getCurrencyIso4217Code", "()Lcom/appsflyer/internal/AFc1qSDK;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02522 extends b51 implements Function0<AFc1qSDK> {
                    public C02522() {
/* 4 */                 super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
                    public final AFc1qSDK invoke() {
/* 7 */                 AFc1qSDK aFc1qSDKComponent4 = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).component4();
/* 11 */                aFc1qSDKComponent4.getClass();
/* 14 */                return aFc1qSDKComponent4;
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$3 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m6176d2 = {"Lcom/appsflyer/internal/AFc1oSDK;", "getCurrencyIso4217Code", "()Lcom/appsflyer/internal/AFc1oSDK;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02533 extends b51 implements Function0<AFc1oSDK> {
                    public C02533() {
/* 4 */                 super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
                    public final AFc1oSDK invoke() {
/* 7 */                 AFc1oSDK aFc1oSDKAFAdRevenueData = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFAdRevenueData();
/* 11 */                aFc1oSDKAFAdRevenueData.getClass();
/* 14 */                return aFc1oSDKAFAdRevenueData;
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$4 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m6176d2 = {"Lcom/appsflyer/internal/AFf1kSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFf1kSDK;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02544 extends b51 implements Function0<AFf1kSDK> {
                    public C02544() {
/* 4 */                 super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
                    public final AFf1kSDK invoke() {
/* 7 */                 AFf1kSDK aFf1kSDKComponent1 = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).component1();
/* 11 */                aFf1kSDKComponent1.getClass();
/* 14 */                return aFf1kSDKComponent1;
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$5 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m6176d2 = {"Ljava/util/concurrent/ExecutorService;", "getMediationNetwork", "()Ljava/util/concurrent/ExecutorService;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02555 extends b51 implements Function0<ExecutorService> {
                    public C02555() {
/* 4 */                 super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
                    public final ExecutorService invoke() {
/* 7 */                 ExecutorService monetizationNetwork = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).getMonetizationNetwork();
/* 11 */                monetizationNetwork.getClass();
/* 14 */                return monetizationNetwork;
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$6 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m6176d2 = {"Lcom/appsflyer/internal/AFf1eSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFf1eSDK;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02566 extends b51 implements Function0<AFf1eSDK> {
                    public C02566() {
/* 4 */                 super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
                    public final AFf1eSDK invoke() {
/* 7 */                 AFf1eSDK aFf1eSDKAFInAppEventType = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFInAppEventType();
/* 11 */                aFf1eSDKAFInAppEventType.getClass();
/* 14 */                return aFf1eSDKAFInAppEventType;
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$7 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m6176d2 = {"Lcom/appsflyer/internal/AFd1vSDK;", "getMediationNetwork", "()Lcom/appsflyer/internal/AFd1vSDK;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02577 extends b51 implements Function0<AFd1vSDK> {
                    public C02577() {
/* 4 */                 super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
                    public final AFd1vSDK invoke() {
/* 9 */                 return new AFd1vSDK(AFd1wSDK.this.getRevenue());
                    }
                }

                public AFd1wSDK(AFd1zSDK aFd1zSDK) {
/* 1 */             aFd1zSDK.getClass();
/* 7 */             this.AFAdRevenueData = aFd1zSDK;
/* 18 */            this.getRevenue = r51.m8065b(new C02544());
/* 29 */            this.getMediationNetwork = r51.m8065b(new C02533());
/* 40 */            this.getMonetizationNetwork = r51.m8065b(new C02522());
/* 51 */            this.getCurrencyIso4217Code = r51.m8065b(new C02566());
/* 62 */            this.component2 = r51.m8065b(new C02555());
/* 66 */            this.component4 = "6.17.6";
/* 77 */            this.component3 = r51.m8065b(new C02511());
/* 88 */            this.areAllFieldsValid = r51.m8065b(new C02577());
                }

                private final boolean AFAdRevenueData(AFh1aSDK aFh1aSDK) {
/* 7 */             AFKeystoreWrapper = (copydefault + 29) % 128;
/* 9 */             long jCurrentTimeMillis = System.currentTimeMillis();
/* 37 */            long monetizationNetwork = ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L);
/* 50 */            if (aFh1aSDK.getMonetizationNetwork >= jCurrentTimeMillis / 1000 && monetizationNetwork != -1) {
/* 63 */                AFKeystoreWrapper = (copydefault + 123) % 128;
/* 67 */                if (monetizationNetwork >= jCurrentTimeMillis) {
/* 70 */                    return getMonetizationNetwork(aFh1aSDK);
                        }
                    }
/* 49 */            return false;
                }

                /* JADX INFO: renamed from: a */
                private static void m1793a(String str, int i, Object[] objArr) {
                    char[] charArray;
/* 1 */             if (str != null) {
/* 9 */                 $11 = ($10 + 51) % 128;
/* 11 */                charArray = str.toCharArray();
                    } else {
/* 16 */                charArray = str;
                    }
/* 18 */            char[] cArr = charArray;
/* 22 */            AFk1qSDK aFk1qSDK = new AFk1qSDK();
/* 26 */            char[] cArr2 = new char[cArr.length];
/* 29 */            aFk1qSDK.getRevenue = 0;
/* 32 */            char[] cArr3 = new char[2];
                    while (true) {
/* 34 */                int i2 = aFk1qSDK.getRevenue;
/* 37 */                if (i2 >= cArr.length) {
                            break;
                        }
/* 41 */                cArr3[0] = cArr[i2];
/* 48 */                cArr3[1] = cArr[i2 + 1];
/* 50 */                int i3 = 58224;
/* 56 */                for (int i4 = 0; i4 < 16; i4++) {
/* 58 */                    char c = cArr3[1];
/* 60 */                    char c2 = cArr3[0];
/* 90 */                    char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (((long) toString) ^ (-1199070254561146252L))))) ^ ((c2 >>> 5) + ((char) (((long) copy) ^ (-1199070254561146252L))))));
/* 91 */                    cArr3[1] = c3;
/* 117 */                   cArr3[0] = (char) (c2 - (((c3 >>> 5) + ((char) (((long) hashCode) ^ (-1199070254561146252L)))) ^ ((c3 + i3) ^ ((c3 << 4) + ((char) (((long) equals) ^ (-1199070254561146252L)))))));
/* 122 */                   i3 -= 40503;
                        }
/* 126 */               int i5 = aFk1qSDK.getRevenue;
/* 130 */               cArr2[i5] = cArr3[0];
/* 136 */               cArr2[i5 + 1] = cArr3[1];
/* 139 */               aFk1qSDK.getRevenue = i5 + 2;
                    }
/* 146 */           String str2 = new String(cArr2, 0, i);
/* 151 */           int i6 = $10 + 97;
/* 155 */           $11 = i6 % 128;
/* 158 */           if (i6 % 2 != 0) {
/* 165 */               objArr[0] = str2;
                    } else {
/* 161 */               int i7 = 2 / 0;
/* 162 */               objArr[0] = str2;
                    }
                }

                private final ExecutorService areAllFieldsValid() {
/* 7 */             copydefault = (AFKeystoreWrapper + 53) % 128;
/* 15 */            ExecutorService executorService = (ExecutorService) this.component2.getValue();
/* 23 */            AFKeystoreWrapper = (copydefault + 119) % 128;
/* 25 */            return executorService;
                }

                private final AFf1eSDK component1() {
/* 7 */             AFKeystoreWrapper = (copydefault + 109) % 128;
/* 15 */            AFf1eSDK aFf1eSDK = (AFf1eSDK) this.getCurrencyIso4217Code.getValue();
/* 23 */            copydefault = (AFKeystoreWrapper + 117) % 128;
/* 25 */            return aFf1eSDK;
                }

                private final AFc1qSDK component2() {
/* 19 */            return (AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this));
                }

                private AFd1uSDK component3() {
/* 7 */             copydefault = (AFKeystoreWrapper + 75) % 128;
/* 15 */            AFd1uSDK aFd1uSDK = (AFd1uSDK) this.areAllFieldsValid.getValue();
/* 19 */            int i = copydefault + 77;
/* 23 */            AFKeystoreWrapper = i % 128;
/* 27 */            if (i % 2 == 0) {
/* 31 */                int i2 = 15 / 0;
                    }
/* 33 */            return aFd1uSDK;
                }

                private final AFh1aSDK component4() {
/* 19 */            return (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
                
                    if (getMediationNetwork(r0) == false) goto L15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
                
                    com.appsflyer.internal.AFd1wSDK.copydefault = (com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 121) % 128;
                    r1 = component1().getMediationNetwork();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
                
                    if (r1 == null) goto L21;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
                
                    r0 = new org.json.JSONObject(getMonetizationNetwork(getRevenue(r0), getRevenue().getRevenue())).toString();
                    r0.getClass();
                    getMediationNetwork(new java.lang.Object[]{r9, r0, r1}, -1856843688, 1856843689, java.lang.System.identityHashCode(r9));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x007c, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x007d, code lost:
                
                    com.appsflyer.internal.AFh1ySDK.v$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.internal.AFg1cSDK.AFKeystoreWrapper, "skipping", false, 4, null);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0089, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x008a, code lost:
                
                    r9 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 3;
                    com.appsflyer.internal.AFd1wSDK.copydefault = r9 % 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0094, code lost:
                
                    if ((r9 % 2) == 0) goto L22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
                
                    r9 = 18 / 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x009a, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
                
                    if (r0 != null) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
                
                    if (r0 != null) goto L9;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final void copy() {
                    AFh1aSDK aFh1aSDK;
/* 3 */             int i = copydefault + 15;
/* 7 */             AFKeystoreWrapper = i % 128;
/* 17 */            if (i % 2 == 0) {
/* 31 */                aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
/* 35 */                int i2 = 33 / 0;
                    } else {
/* 52 */                aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                    }
                }

                /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
                /* JADX WARN: Code duplicated, block: B:69:0x0136 A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x001f, B:9:0x0027, B:11:0x0038, B:14:0x0060, B:16:0x0071, B:18:0x0078, B:20:0x008b, B:22:0x008f, B:24:0x009c, B:26:0x00a6, B:28:0x00aa, B:30:0x00b8, B:32:0x00be, B:34:0x00cc, B:36:0x00d0, B:38:0x00d6, B:40:0x00e1, B:45:0x00eb, B:47:0x00f6, B:49:0x00fa, B:51:0x0100, B:53:0x0106, B:55:0x0109, B:57:0x010f, B:59:0x011f, B:69:0x0136, B:71:0x013c, B:73:0x014c, B:75:0x0150, B:77:0x015b, B:78:0x0160, B:82:0x0167, B:87:0x0187, B:92:0x01ee, B:94:0x01f2, B:96:0x0202, B:97:0x0206, B:89:0x01a1, B:90:0x01b9, B:85:0x016f, B:67:0x0133, B:91:0x01d4, B:63:0x012e, B:79:0x0163, B:42:0x00e6), top: B:105:0x0001, inners: #0 }] */
                /* JADX WARN: Code duplicated, block: B:70:0x013b  */
                private final synchronized void copydefault() {
                    Integer numValueOf;
                    Pair<Integer, Integer> monetizationNetwork;
                    String str;
                    String str2;
                    int iIntValue;
                    int iIntValue2;
                    int iIntValue3;
                    String str3;
                    Integer intOrNull;
                    String str4;
                    Integer intOrNull2;
                    String str5;
                    try {
/* 8 */                 copydefault = (AFKeystoreWrapper + 13) % 128;
/* 28 */                AFh1aSDK aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
/* 55 */                if ((aFh1aSDK != null ? aFh1aSDK.getMonetizationNetwork : -1L) < System.currentTimeMillis() / 1000) {
/* 66 */                    AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
/* 85 */                    ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
/* 92 */                    getRevenue().getCurrencyIso4217Code();
/* 96 */                    return;
                        }
/* 109 */               AFh1aSDK aFh1aSDK2 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
/* 112 */               if (aFh1aSDK2 == null || !getMonetizationNetwork(aFh1aSDK2)) {
/* 485 */                   ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
/* 492 */                   getRevenue().getCurrencyIso4217Code();
                        } else {
/* 133 */                   AFh1aSDK aFh1aSDK3 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
/* 137 */                   Pair<Integer, Integer> pairAFAdRevenueData = null;
                            try {
/* 138 */                       if (aFh1aSDK3 == null || (str2 = aFh1aSDK3.getRevenue) == null) {
/* 271 */                           numValueOf = null;
                                } else {
/* 151 */                           ra2 ra2VarM6222a = new Regex("(\\d+).(\\d+).(\\d+).*").m6222a(str2);
/* 155 */                           if (ra2VarM6222a != null) {
/* 161 */                               MatchGroup matchGroupM8477a = ((sc1) ra2VarM6222a.f15957c).m8477a(1);
/* 165 */                               if (matchGroupM8477a == null || (str5 = matchGroupM8477a.f12935a) == null) {
/* 190 */                                   iIntValue2 = 0;
                                        } else {
/* 177 */                                   copydefault = (AFKeystoreWrapper + 109) % 128;
/* 179 */                                   Integer intOrNull3 = StringsKt.toIntOrNull(str5);
/* 183 */                                   if (intOrNull3 != null) {
/* 185 */                                       iIntValue2 = intOrNull3.intValue();
                                            } else {
/* 190 */                                       iIntValue2 = 0;
                                            }
                                        }
/* 194 */                               int i = iIntValue2 * 1000000;
/* 199 */                               MatchGroup matchGroupM8477a2 = ((sc1) ra2VarM6222a.f15957c).m8477a(2);
/* 203 */                               if (matchGroupM8477a2 == null || (str4 = matchGroupM8477a2.f12935a) == null || (intOrNull2 = StringsKt.toIntOrNull(str4)) == null) {
/* 232 */                                   iIntValue3 = 0;
                                        } else {
/* 217 */                                   int i2 = copydefault + 123;
/* 221 */                                   AFKeystoreWrapper = i2 % 128;
/* 224 */                                   if (i2 % 2 == 0) {
/* 231 */                                       throw null;
                                            }
/* 226 */                                   iIntValue3 = intOrNull2.intValue();
                                        }
/* 235 */                               int i3 = (iIntValue3 * 1000) + i;
/* 241 */                               MatchGroup matchGroupM8477a3 = ((sc1) ra2VarM6222a.f15957c).m8477a(3);
/* 263 */                               iIntValue = i3 + ((matchGroupM8477a3 == null || (str3 = matchGroupM8477a3.f12935a) == null || (intOrNull = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull.intValue());
                                    } else {
/* 265 */                               iIntValue = -1;
                                    }
/* 266 */                           numValueOf = Integer.valueOf(iIntValue);
                                }
/* 284 */                       AFh1aSDK aFh1aSDK4 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
/* 286 */                       if (aFh1aSDK4 != null) {
/* 290 */                           int i4 = copydefault + 15;
/* 294 */                           AFKeystoreWrapper = i4 % 128;
/* 296 */                           int i5 = i4 % 2;
/* 297 */                           String str6 = aFh1aSDK4.getRevenue;
/* 299 */                           if (i5 == 0) {
/* 303 */                               int i6 = 29 / 0;
/* 304 */                               if (str6 != null) {
/* 311 */                                   monetizationNetwork = AFd1rSDK.getMonetizationNetwork(str6);
                                        } else {
/* 316 */                                   monetizationNetwork = null;
                                        }
                                    } else if (str6 != null) {
/* 311 */                               monetizationNetwork = AFd1rSDK.getMonetizationNetwork(str6);
                                    } else {
/* 316 */                               monetizationNetwork = null;
                                    }
                                } else {
/* 316 */                           monetizationNetwork = null;
                                }
/* 329 */                       AFh1aSDK aFh1aSDK5 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
/* 331 */                       if (aFh1aSDK5 != null && (str = aFh1aSDK5.getRevenue) != null) {
/* 339 */                           int i7 = AFKeystoreWrapper + 99;
/* 343 */                           copydefault = i7 % 128;
/* 346 */                           if (i7 % 2 != 0) {
/* 353 */                               AFd1rSDK.AFAdRevenueData(str);
/* 356 */                               throw null;
                                    }
/* 348 */                           pairAFAdRevenueData = AFd1rSDK.AFAdRevenueData(str);
                                }
/* 357 */                       if ((numValueOf == null || numValueOf.intValue() != -1) && monetizationNetwork == null) {
/* 374 */                           AFKeystoreWrapper = (copydefault + 59) % 128;
/* 386 */                           getRevenue().getMonetizationNetwork(this.component4);
                                } else if (monetizationNetwork != null) {
/* 412 */                           getRevenue().getCurrencyIso4217Code(((Number) monetizationNetwork.f12908a).intValue(), ((Number) monetizationNetwork.f12909b).intValue());
                                } else if (pairAFAdRevenueData != null) {
/* 438 */                           getRevenue().getCurrencyIso4217Code(((Number) pairAFAdRevenueData.f12908a).intValue(), ((Number) pairAFAdRevenueData.f12909b).intValue());
                                } else {
/* 458 */                           ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
/* 465 */                           getRevenue().getCurrencyIso4217Code();
                                }
                            } catch (Throwable th) {
/* 308 */                       throw th;
                            }
                        }
/* 495 */               AFd1xSDK.AFa1vSDK aFa1vSDK = this.component1;
/* 497 */               if (aFa1vSDK != null) {
/* 511 */                   AFh1aSDK aFh1aSDK6 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
/* 519 */                   aFa1vSDK.onConfigurationChanged(aFh1aSDK6 != null ? AFAdRevenueData(aFh1aSDK6) : false);
                        }
                    } catch (Throwable th2) {
/* 527 */               throw th2;
                    }
                }

                private final synchronized void equals() {
                    boolean zAFAdRevenueData;
                    try {
/* 8 */                 copydefault = (AFKeystoreWrapper + 119) % 128;
/* 28 */                AFh1aSDK aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
/* 30 */                if (aFh1aSDK != null) {
/* 41 */                    if (aFh1aSDK.getMediationNetwork == -1) {
/* 59 */                        ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                            } else if (((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L) == -1) {
/* 97 */                        AFKeystoreWrapper = (copydefault + 21) % 128;
/* 99 */                        getCurrencyIso4217Code(aFh1aSDK);
                            }
/* 102 */                   zAFAdRevenueData = AFAdRevenueData(aFh1aSDK);
                        } else {
/* 107 */                   zAFAdRevenueData = false;
                        }
/* 108 */               AFd1xSDK.AFa1vSDK aFa1vSDK = this.component1;
/* 110 */               if (aFa1vSDK != null) {
/* 112 */                   aFa1vSDK.onConfigurationChanged(zAFAdRevenueData);
/* 117 */                   int i = AFKeystoreWrapper + 111;
/* 121 */                   copydefault = i % 128;
/* 125 */                   if (i % 2 == 0) {
                            } else {
/* 130 */                       throw null;
                            }
                        }
                    } catch (Throwable th) {
/* 136 */               throw th;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void getCurrencyIso4217Code(AFd1wSDK aFd1wSDK, Throwable th, String str) {
/* 1 */             aFd1wSDK.getClass();
/* 4 */             th.getClass();
/* 7 */             str.getClass();
/* 28 */            AFh1aSDK aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{aFd1wSDK}, -2108652204, 2108652208, System.identityHashCode(aFd1wSDK));
/* 30 */            if (aFh1aSDK != null) {
/* 34 */                int i = copydefault + 99;
/* 38 */                AFKeystoreWrapper = i % 128;
/* 42 */                if (i % 2 != 0 ? !aFd1wSDK.AFAdRevenueData(aFh1aSDK) : aFd1wSDK.AFAdRevenueData(aFh1aSDK)) {
/* 80 */                    AFKeystoreWrapper = (copydefault + 49) % 128;
                        } else {
/* 64 */                    AFKeystoreWrapper = (copydefault + 91) % 128;
/* 70 */                    aFd1wSDK.getRevenue().AFAdRevenueData(th, str);
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
                
                    if (r12 == (-1)) goto L28;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
                
                    if (r12 >= r10) goto L15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
                
                    r1 = ((com.appsflyer.internal.AFc1qSDK) getMediationNetwork(new java.lang.Object[]{r16}, 1891172040, -1891172038, java.lang.System.identityHashCode(r16))).getRevenue("af_send_exc_min", -1);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
                
                    if (r1 == (-1)) goto L27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
                
                    r2 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 31;
                    com.appsflyer.internal.AFd1wSDK.copydefault = r2 % 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
                
                    if ((r2 % 2) == 0) goto L22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
                
                    r3 = 95 / 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
                
                    if (getRevenue().getMediationNetwork() >= r1) goto L25;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
                
                    if (getRevenue().getMediationNetwork() >= r1) goto L25;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
                
                    return getMonetizationNetwork(r17);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:
                
                    return false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x00a7, code lost:
                
                    r0 = com.appsflyer.internal.AFd1wSDK.copydefault + 63;
                    com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper = r0 % 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x00b1, code lost:
                
                    if ((r0 % 2) == 0) goto L31;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
                
                    return false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
                
                    if (r17.getMonetizationNetwork < (r10 / 1000)) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:8:0x0059, code lost:
                
                    if (r17.getMonetizationNetwork < (r10 / 1000)) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
                
                    return false;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final boolean getMediationNetwork(AFh1aSDK aFh1aSDK) {
                    long jCurrentTimeMillis;
                    long monetizationNetwork;
/* 5 */             int i = copydefault + 19;
/* 9 */             AFKeystoreWrapper = i % 128;
/* 26 */            if (i % 2 == 0) {
/* 28 */                jCurrentTimeMillis = System.currentTimeMillis();
/* 46 */                monetizationNetwork = ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L);
/* 58 */                int i2 = 9 / 0;
                    } else {
/* 62 */                jCurrentTimeMillis = System.currentTimeMillis();
/* 80 */                monetizationNetwork = ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L);
                    }
                }

                private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
/* 4 */             AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
/* 8 */             int i = AFKeystoreWrapper + 77;
/* 12 */            copydefault = i % 128;
/* 14 */            int i2 = 2;
/* 16 */            if (i % 2 == 0) {
/* 43 */                aFd1wSDK.areAllFieldsValid().execute(new RunnableC0299k(aFd1wSDK, i2));
/* 46 */                return null;
                    }
/* 27 */            aFd1wSDK.areAllFieldsValid().execute(new RunnableC0299k(aFd1wSDK, i2));
/* 32 */            int i3 = 69 / 0;
/* 46 */            return null;
                }

                private final Map<String, String> getRevenue(AFh1aSDK aFh1aSDK) {
/* 11 */            Object[] objArr = new Object[1];
/* 15 */            m1793a("炜桪ꪴ鐅⠖ᰫ", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, objArr);
/* 132 */           Map<String, String> mapM7131e = oc1.m7131e(new Pair(((String) objArr[0]).intern(), Build.BRAND), new Pair("model", Build.MODEL), new Pair("app_id", getMediationNetwork().getCurrencyIso4217Code.getMonetizationNetwork.getPackageName()), new Pair("p_ex", new AFa1uSDK().AFAdRevenueData()), new Pair("api", String.valueOf(Build.VERSION.SDK_INT)), new Pair("sdk", this.component4), new Pair("uid", AFb1kSDK.getCurrencyIso4217Code(getMediationNetwork().getMediationNetwork)), new Pair("exc_config", aFh1aSDK.AFAdRevenueData()));
/* 138 */           int i = AFKeystoreWrapper + 111;
/* 142 */           copydefault = i % 128;
/* 146 */           if (i % 2 == 0) {
/* 148 */               return mapM7131e;
                    }
/* 150 */           throw null;
                }

                @Override // com.appsflyer.internal.AFd1xSDK
/* 47 */        public final void getMonetizationNetwork(AFd1xSDK.AFa1vSDK aFa1vSDK) {
/* 48 */            int i = AFKeystoreWrapper + 31;
                    copydefault = i % 128;
                    if (i % 2 == 0) {
/* 49 */                this.component1 = aFa1vSDK;
/* 50 */                areAllFieldsValid().execute(new RunnableC0299k(this, 0));
                    } else {
/* 51 */                this.component1 = aFa1vSDK;
/* 52 */                areAllFieldsValid().execute(new RunnableC0299k(this, 0));
/* 53 */                throw null;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 53 */        public static final void getMonetizationNetwork(AFd1wSDK aFd1wSDK) {
/* 54 */            int i = copydefault + 13;
                    AFKeystoreWrapper = i % 128;
                    if (i % 2 != 0) {
/* 55 */                aFd1wSDK.getClass();
/* 56 */                aFd1wSDK.copydefault();
                    } else {
/* 57 */                aFd1wSDK.getClass();
/* 58 */                aFd1wSDK.copydefault();
/* 59 */                throw null;
                    }
                }

/* 59 */        private static Map<String, Object> getMonetizationNetwork(Map<String, ? extends Object> map, List<AFc1aSDK> list) {
/* 60 */            AFKeystoreWrapper = (copydefault + 121) % 128;
/* 64 */            Map<String, Object> mapM7131e = oc1.m7131e(new Pair("deviceInfo", map), new Pair("excs", AFd1qSDK.getMediationNetwork(list)));
                    copydefault = (AFKeystoreWrapper + 15) % 128;
                    return mapM7131e;
                }

/* 64 */        private final boolean getMonetizationNetwork(AFh1aSDK aFh1aSDK) {
/* 65 */            new AFd1pSDK();
                    String str = this.component4;
/* 66 */            String str2 = aFh1aSDK.getRevenue;
/* 67 */            str2.getClass();
                    boolean currencyIso4217Code = AFd1pSDK.getCurrencyIso4217Code(str, str2);
                    int i = copydefault + 97;
                    AFKeystoreWrapper = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 79 / 0;
                    }
                    return currencyIso4217Code;
                }

                @Override // com.appsflyer.internal.AFd1xSDK
/* 67 */        public final void getMonetizationNetwork() {
/* 68 */            getMediationNetwork(new Object[]{this}, 452613973, -452613973, System.identityHashCode(this));
                }

                @Override // com.appsflyer.internal.AFd1xSDK
/* 68 */        public final void getMonetizationNetwork(Throwable th, String str) {
/* 69 */            getMediationNetwork(new Object[]{this, th, str}, -1045855402, 1045855405, System.identityHashCode(this));
                }

                @Override // com.appsflyer.internal.AFd1xSDK
/* 75 */        public final void AFAdRevenueData() {
/* 76 */            int i = AFKeystoreWrapper + 97;
                    copydefault = i % 128;
                    if (i % 2 != 0) {
/* 77 */                areAllFieldsValid().execute(new RunnableC0299k(this, 1));
/* 78 */                int i2 = 82 / 0;
                    } else {
/* 79 */                areAllFieldsValid().execute(new RunnableC0299k(this, 1));
                    }
/* 80 */            copydefault = (AFKeystoreWrapper + 119) % 128;
                }

/* 80 */        private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
                    AFi1zSDK aFi1zSDK;
                    AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
/* 81 */            AFKeystoreWrapper = (copydefault + 77) % 128;
/* 83 */            AFi1vSDK aFi1vSDK = aFd1wSDK.getCurrencyIso4217Code().AFAdRevenueData.getCurrencyIso4217Code;
                    if (aFi1vSDK == null || (aFi1zSDK = aFi1vSDK.getMonetizationNetwork) == null) {
                        return null;
                    }
/* 85 */            int i = AFKeystoreWrapper + 109;
                    copydefault = i % 128;
                    if (i % 2 == 0) {
/* 86 */                return aFi1zSDK.getCurrencyIso4217Code;
                    }
                    AFh1aSDK aFh1aSDK = aFi1zSDK.getCurrencyIso4217Code;
/* 87 */            throw null;
                }

/* 82 */        public static final /* synthetic */ AFd1zSDK getCurrencyIso4217Code(AFd1wSDK aFd1wSDK) {
/* 83 */            int i = copydefault + ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE;
                    AFKeystoreWrapper = i % 128;
                    int i2 = i % 2;
                    AFd1zSDK aFd1zSDK = aFd1wSDK.AFAdRevenueData;
                    if (i2 != 0) {
                        return aFd1zSDK;
                    }
                    throw null;
                }

/* 83 */        private final AFf1kSDK getCurrencyIso4217Code() {
/* 84 */            copydefault = (AFKeystoreWrapper + 1) % 128;
                    AFf1kSDK aFf1kSDK = (AFf1kSDK) this.getRevenue.getValue();
                    int i = AFKeystoreWrapper + 1;
                    copydefault = i % 128;
                    if (i % 2 == 0) {
                        return aFf1kSDK;
                    }
                    throw null;
                }

/* 84 */        private final void getCurrencyIso4217Code(AFh1aSDK aFh1aSDK) {
/* 85 */            copydefault = (AFKeystoreWrapper + 97) % 128;
/* 86 */            int i = aFh1aSDK.getCurrencyIso4217Code;
/* 88 */            long millis = TimeUnit.DAYS.toMillis(aFh1aSDK.getMediationNetwork) + System.currentTimeMillis();
/* 89 */            AFc1qSDK aFc1qSDK = (AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this));
/* 90 */            aFc1qSDK.AFAdRevenueData("af_send_exc_to_server_window", millis);
/* 91 */            aFc1qSDK.getMediationNetwork("af_send_exc_min", i);
/* 92 */            int i2 = AFKeystoreWrapper + 17;
                    copydefault = i2 % 128;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                }

/* 92 */        private static Object getCurrencyIso4217Code(Object[] objArr) {
                    AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
                    String str = (String) objArr[1];
                    String str2 = (String) objArr[2];
/* 93 */            copydefault = (AFKeystoreWrapper + 61) % 128;
/* 94 */            byte[] bytes = str.getBytes(Charsets.UTF_8);
                    bytes.getClass();
/* 99 */            aFd1wSDK.component3().getMonetizationNetwork(bytes, nc1.m6963d(new Pair("Authorization", AFj1dSDK.getMonetizationNetwork(str, str2))), 2000);
/* 100 */           int i = AFKeystoreWrapper + 69;
                    copydefault = i % 128;
                    if (i % 2 != 0) {
                        int i2 = 36 / 0;
                    }
                    return null;
                }

/* 150 */       public final AFc1cSDK getRevenue() {
/* 151 */           copydefault = (AFKeystoreWrapper + 93) % 128;
                    AFc1cSDK aFc1cSDK = (AFc1cSDK) this.component3.getValue();
                    int i = copydefault + 121;
                    AFKeystoreWrapper = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 3 / 0;
                    }
                    return aFc1cSDK;
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 151 */       public static final void getRevenue(AFd1wSDK aFd1wSDK) {
/* 152 */           int i = AFKeystoreWrapper + 61;
                    copydefault = i % 128;
                    if (i % 2 == 0) {
/* 153 */               aFd1wSDK.getClass();
/* 154 */               aFd1wSDK.equals();
/* 155 */               copydefault = (AFKeystoreWrapper + 99) % 128;
                    } else {
                        aFd1wSDK.getClass();
/* 156 */               aFd1wSDK.equals();
/* 157 */               throw null;
                    }
                }

/* 157 */       private static /* synthetic */ Object getRevenue(Object[] objArr) {
                    AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
/* 158 */           int i = copydefault + 25;
                    AFKeystoreWrapper = i % 128;
                    int i2 = i % 2;
                    AFc1qSDK aFc1qSDK = (AFc1qSDK) aFd1wSDK.getMonetizationNetwork.getValue();
                    if (i2 == 0) {
                        int i3 = 60 / 0;
                    }
                    AFKeystoreWrapper = (copydefault + 51) % 128;
                    return aFc1qSDK;
                }

/* 182 */       private final AFc1oSDK getMediationNetwork() {
/* 183 */           copydefault = (AFKeystoreWrapper + 9) % 128;
                    AFc1oSDK aFc1oSDK = (AFc1oSDK) this.getMediationNetwork.getValue();
                    copydefault = (AFKeystoreWrapper + 21) % 128;
                    return aFc1oSDK;
                }

/* 183 */       private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
                    AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
                    Throwable th = (Throwable) objArr[1];
                    String str = (String) objArr[2];
/* 184 */           AFKeystoreWrapper = (copydefault + 49) % 128;
/* 185 */           th.getClass();
                    str.getClass();
/* 186 */           aFd1wSDK.areAllFieldsValid().execute(new RunnableC2558zo(17, aFd1wSDK, th, str));
/* 187 */           int i = copydefault + 41;
                    AFKeystoreWrapper = i % 128;
                    if (i % 2 != 0) {
                        return null;
                    }
                    throw null;
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 187 */       public static final void getMediationNetwork(AFd1wSDK aFd1wSDK) {
/* 188 */           AFKeystoreWrapper = (copydefault + 83) % 128;
/* 189 */           aFd1wSDK.getClass();
/* 190 */           aFd1wSDK.copy();
/* 191 */           AFKeystoreWrapper = (copydefault + 45) % 128;
                }

/* 191 */       public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i, int i2, int i3) {
                    int i4 = ~((~i) | (~i2));
                    int i5 = ~i3;
                    int i6 = ((i | i2 | i3) * 220) + (((~(i5 | i2)) | i) * (-440)) + ((i4 | (~(i5 | i | i2))) * 220) + (i2 * (-219)) + (i * 221);
                    if (i6 == 1) {
                        return getCurrencyIso4217Code(objArr);
                    }
                    if (i6 == 2) {
                        return getRevenue(objArr);
                    }
                    if (i6 != 3) {
                        return i6 != 4 ? getMonetizationNetwork(objArr) : AFAdRevenueData(objArr);
                    }
                    return getMediationNetwork(objArr);
                }

/* 192 */       private final void getMediationNetwork(String str, String str2) {
/* 193 */           getMediationNetwork(new Object[]{this, str, str2}, -1856843688, 1856843689, System.identityHashCode(this));
                }
            }
