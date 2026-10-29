            package com.appsflyer;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.internal.AFc1kSDK;
            import com.appsflyer.internal.AFg1cSDK;
            import com.appsflyer.internal.AFh1ySDK;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.Set;
            import java.util.concurrent.ExecutorService;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.functions.Function1;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import p000.C2103qd;
            import p000.C2270uw;
            import p000.b51;
            import p000.f72;
            import p000.p51;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0013\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001:B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\nJ7\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\nJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0019J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0019J#\u0010\u0013\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u001dJ#\u0010\u001e\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ+\u0010\u001e\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010 J+\u0010\u0013\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010 J3\u0010\u0013\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010!J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0019J!\u0010$\u001a\u00020\b2\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\"\"\u00020\u0001¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\b2\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\"\"\u00020\u0001¢\u0006\u0004\b&\u0010%J'\u0010*\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010+JG\u0010.\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/J'\u00100\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010+J'\u00101\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010+J'\u00102\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u0010+J\u001f\u00103\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u00104R\u001b\u00106\u001a\b\u0012\u0004\u0012\u00020\u0001058BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b6\u00107R\u0015\u00109\u001a\u0002088BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b9\u00107"}, m6176d2 = {"Lcom/appsflyer/AFLogger;", "Lcom/appsflyer/internal/AFh1ySDK;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "logMessage", HttpUrl.FRAGMENT_ENCODE_SET, "shouldRemoteDebug", HttpUrl.FRAGMENT_ENCODE_SET, "afInfoLog", "(Ljava/lang/String;Z)V", "debugLogMessage", "afDebugLog", "message", HttpUrl.FRAGMENT_ENCODE_SET, "ex", "printMessage", "printThrowable", "shouldReportToExManager", "afErrorLog", "(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V", "warningLogMessage", "afWarnLog", "rdLogMessage", "afVerboseLog", "(Ljava/lang/String;)V", "afRDLog", "afLogForce", "errorLogMessage", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "afErrorLogForExcManagerOnly", "disableReporting", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V", HttpUrl.FRAGMENT_ENCODE_SET, "client", "registerClient", "([Lcom/appsflyer/internal/AFh1ySDK;)V", "unregisterClient", "Lcom/appsflyer/internal/AFg1cSDK;", "tag", NotificationCompat.CATEGORY_MESSAGE, "d", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Z)V", "throwable", "printMsg", "e", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "i", "w", "v", "force", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;)V", HttpUrl.FRAGMENT_ENCODE_SET, "getMediationNetwork", "Lp51;", "Ljava/util/concurrent/ExecutorService;", "getCurrencyIso4217Code", "LogLevel"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 11 */    public final class AFLogger extends AFh1ySDK {
                public static final AFLogger INSTANCE = new AFLogger();
                private static final p51 getMediationNetwork = r51.m8065b(C02357.getRevenue);
                private static final p51 getCurrencyIso4217Code = r51.m8065b(C02345.AFAdRevenueData);

                /* JADX INFO: renamed from: com.appsflyer.AFLogger$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m6176d2 = {"Lcom/appsflyer/internal/AFh1ySDK;", "p0", HttpUrl.FRAGMENT_ENCODE_SET, "AFAdRevenueData", "(Lcom/appsflyer/internal/AFh1ySDK;)V"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02291 extends b51 implements Function1<AFh1ySDK, Unit> {
                    private /* synthetic */ boolean $AFAdRevenueData;
                    private /* synthetic */ String $getCurrencyIso4217Code;
                    private /* synthetic */ AFg1cSDK $getMonetizationNetwork;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C02291(AFg1cSDK aFg1cSDK, String str, boolean z) {
/* 8 */                 super(1);
/* 1 */                 this.$getMonetizationNetwork = aFg1cSDK;
/* 3 */                 this.$getCurrencyIso4217Code = str;
/* 5 */                 this.$AFAdRevenueData = z;
                    }

                    public final void AFAdRevenueData(AFh1ySDK aFh1ySDK) {
/* 1 */                 aFh1ySDK.getClass();
/* 10 */                aFh1ySDK.mo1749i(this.$getMonetizationNetwork, this.$getCurrencyIso4217Code, this.$AFAdRevenueData);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Object invoke(Object obj) {
/* 3 */                 AFAdRevenueData((AFh1ySDK) obj);
/* 6 */                 return Unit.f12910a;
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.AFLogger$10 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m6176d2 = {"Lcom/appsflyer/internal/AFh1ySDK;", "p0", HttpUrl.FRAGMENT_ENCODE_SET, "getMediationNetwork", "(Lcom/appsflyer/internal/AFh1ySDK;)V"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C023010 extends b51 implements Function1<AFh1ySDK, Unit> {
                    private /* synthetic */ String $getCurrencyIso4217Code;
                    private /* synthetic */ AFg1cSDK $getMonetizationNetwork;
                    private /* synthetic */ boolean $getRevenue;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C023010(AFg1cSDK aFg1cSDK, String str, boolean z) {
/* 8 */                 super(1);
/* 1 */                 this.$getMonetizationNetwork = aFg1cSDK;
/* 3 */                 this.$getCurrencyIso4217Code = str;
/* 5 */                 this.$getRevenue = z;
                    }

                    public final void getMediationNetwork(AFh1ySDK aFh1ySDK) {
/* 1 */                 aFh1ySDK.getClass();
/* 10 */                aFh1ySDK.mo1750v(this.$getMonetizationNetwork, this.$getCurrencyIso4217Code, this.$getRevenue);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Object invoke(Object obj) {
/* 3 */                 getMediationNetwork((AFh1ySDK) obj);
/* 6 */                 return Unit.f12910a;
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.AFLogger$2 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m6176d2 = {"Lcom/appsflyer/internal/AFh1ySDK;", "p0", HttpUrl.FRAGMENT_ENCODE_SET, "getCurrencyIso4217Code", "(Lcom/appsflyer/internal/AFh1ySDK;)V"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02312 extends b51 implements Function1<AFh1ySDK, Unit> {
                    private /* synthetic */ boolean $getCurrencyIso4217Code;
                    private /* synthetic */ AFg1cSDK $getMonetizationNetwork;
                    private /* synthetic */ String $getRevenue;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C02312(AFg1cSDK aFg1cSDK, String str, boolean z) {
/* 8 */                 super(1);
/* 1 */                 this.$getMonetizationNetwork = aFg1cSDK;
/* 3 */                 this.$getRevenue = str;
/* 5 */                 this.$getCurrencyIso4217Code = z;
                    }

                    public final void getCurrencyIso4217Code(AFh1ySDK aFh1ySDK) {
/* 1 */                 aFh1ySDK.getClass();
/* 10 */                aFh1ySDK.mo1747d(this.$getMonetizationNetwork, this.$getRevenue, this.$getCurrencyIso4217Code);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Object invoke(Object obj) {
/* 3 */                 getCurrencyIso4217Code((AFh1ySDK) obj);
/* 6 */                 return Unit.f12910a;
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.AFLogger$3 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m6176d2 = {"Lcom/appsflyer/internal/AFh1ySDK;", "p0", HttpUrl.FRAGMENT_ENCODE_SET, "getRevenue", "(Lcom/appsflyer/internal/AFh1ySDK;)V"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02323 extends b51 implements Function1<AFh1ySDK, Unit> {
                    private /* synthetic */ String $AFAdRevenueData;
                    private /* synthetic */ boolean $areAllFieldsValid;
                    private /* synthetic */ boolean $component1;
                    private /* synthetic */ AFg1cSDK $getCurrencyIso4217Code;
                    private /* synthetic */ boolean $getMediationNetwork;
                    private /* synthetic */ Throwable $getMonetizationNetwork;
                    private /* synthetic */ boolean $getRevenue;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C02323(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
/* 16 */                super(1);
/* 1 */                 this.$getCurrencyIso4217Code = aFg1cSDK;
/* 3 */                 this.$AFAdRevenueData = str;
/* 5 */                 this.$getMonetizationNetwork = th;
/* 7 */                 this.$getMediationNetwork = z;
/* 9 */                 this.$getRevenue = z2;
/* 11 */                this.$component1 = z3;
/* 13 */                this.$areAllFieldsValid = z4;
                    }

                    public final void getRevenue(AFh1ySDK aFh1ySDK) {
/* 1 */                 aFh1ySDK.getClass();
/* 19 */                aFh1ySDK.mo1748e(this.$getCurrencyIso4217Code, this.$AFAdRevenueData, this.$getMonetizationNetwork, this.$getMediationNetwork, this.$getRevenue, this.$component1, this.$areAllFieldsValid);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Object invoke(Object obj) {
/* 3 */                 getRevenue((AFh1ySDK) obj);
/* 6 */                 return Unit.f12910a;
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.AFLogger$4 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m6176d2 = {"Lcom/appsflyer/internal/AFh1ySDK;", "p0", HttpUrl.FRAGMENT_ENCODE_SET, "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFh1ySDK;)V"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02334 extends b51 implements Function1<AFh1ySDK, Unit> {
                    private /* synthetic */ AFg1cSDK $getMonetizationNetwork;
                    private /* synthetic */ String $getRevenue;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C02334(AFg1cSDK aFg1cSDK, String str) {
/* 6 */                 super(1);
/* 1 */                 this.$getMonetizationNetwork = aFg1cSDK;
/* 3 */                 this.$getRevenue = str;
                    }

                    public final void getMonetizationNetwork(AFh1ySDK aFh1ySDK) {
/* 1 */                 aFh1ySDK.getClass();
/* 8 */                 aFh1ySDK.force(this.$getMonetizationNetwork, this.$getRevenue);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Object invoke(Object obj) {
/* 3 */                 getMonetizationNetwork((AFh1ySDK) obj);
/* 6 */                 return Unit.f12910a;
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.AFLogger$5 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m6176d2 = {"Ljava/util/concurrent/ExecutorService;", "AFAdRevenueData", "()Ljava/util/concurrent/ExecutorService;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02345 extends b51 implements Function0<ExecutorService> {
                    public static final C02345 AFAdRevenueData = new C02345();

                    public C02345() {
/* 2 */                 super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
                    public final ExecutorService invoke() {
/* 1 */                 return AFc1kSDK.getMediationNetwork();
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.AFLogger$7 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\f\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m6176d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/appsflyer/internal/AFh1ySDK;", "getMediationNetwork", "()Ljava/util/Set;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02357 extends b51 implements Function0<Set<AFh1ySDK>> {
                    public static final C02357 getRevenue = new C02357();

                    public C02357() {
/* 2 */                 super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
                    public final Set<AFh1ySDK> invoke() {
/* 3 */                 return new LinkedHashSet();
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.AFLogger$9 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m6176d2 = {"Lcom/appsflyer/internal/AFh1ySDK;", "p0", HttpUrl.FRAGMENT_ENCODE_SET, "AFAdRevenueData", "(Lcom/appsflyer/internal/AFh1ySDK;)V"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02369 extends b51 implements Function1<AFh1ySDK, Unit> {
                    private /* synthetic */ String $AFAdRevenueData;
                    private /* synthetic */ AFg1cSDK $getMediationNetwork;
                    private /* synthetic */ boolean $getMonetizationNetwork;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C02369(AFg1cSDK aFg1cSDK, String str, boolean z) {
/* 8 */                 super(1);
/* 1 */                 this.$getMediationNetwork = aFg1cSDK;
/* 3 */                 this.$AFAdRevenueData = str;
/* 5 */                 this.$getMonetizationNetwork = z;
                    }

                    public final void AFAdRevenueData(AFh1ySDK aFh1ySDK) {
/* 1 */                 aFh1ySDK.getClass();
/* 10 */                aFh1ySDK.mo1751w(this.$getMediationNetwork, this.$AFAdRevenueData, this.$getMonetizationNetwork);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Object invoke(Object obj) {
/* 3 */                 AFAdRevenueData((AFh1ySDK) obj);
/* 6 */                 return Unit.f12910a;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, m6176d2 = {"Lcom/appsflyer/AFLogger$LogLevel;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "p0", "<init>", "(Ljava/lang/String;II)V", FirebaseAnalytics.Param.LEVEL, "I", "getLevel", "()I", "NONE", "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
                public enum LogLevel {
                    NONE(0),
                    ERROR(1),
                    WARNING(2),
                    INFO(3),
                    DEBUG(4),
                    VERBOSE(5);

                    private final int level;

                    LogLevel(int i) {
/* 4 */                 this.level = i;
                    }

                    public final int getLevel() {
/* 1 */                 return this.level;
                    }
                }

                private AFLogger() {
                }

                public static final void afDebugLog(String debugLogMessage) {
/* 1 */             debugLogMessage.getClass();
/* 9 */             INSTANCE.mo1747d(AFg1cSDK.OTHER, debugLogMessage, true);
                }

                public static final void afErrorLog(String errorLogMessage, Throwable ex) {
/* 1 */             AFLogger aFLogger = INSTANCE;
/* 3 */             AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
/* 5 */             if (errorLogMessage == null || StringsKt.m6228D(errorLogMessage)) {
/* 16 */                errorLogMessage = "null";
                    }
/* 14 */            String str = errorLogMessage;
/* 19 */            if (ex == null) {
/* 25 */                ex = new NullPointerException("Invoked with null Throwable");
                    }
/* 36 */            AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, false, false, false, 120, null);
                }

                public static final void afErrorLogForExcManagerOnly(String errorLogMessage, Throwable ex, boolean disableReporting) {
/* 1 */             AFLogger aFLogger = INSTANCE;
/* 3 */             AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
/* 5 */             if (errorLogMessage == null || StringsKt.m6228D(errorLogMessage)) {
/* 16 */                errorLogMessage = "null";
                    }
/* 14 */            String str = errorLogMessage;
/* 19 */            if (ex == null) {
/* 25 */                ex = new NullPointerException("Invoked with null Throwable");
                    }
/* 37 */            AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, false, !disableReporting, false, 64, null);
                }

                public static final void afInfoLog(String logMessage) {
/* 1 */             logMessage.getClass();
/* 9 */             INSTANCE.mo1749i(AFg1cSDK.OTHER, logMessage, true);
                }

                public static final void afLogForce(String logMessage) {
/* 1 */             logMessage.getClass();
/* 8 */             INSTANCE.force(AFg1cSDK.OTHER, logMessage);
                }

                public static final void afRDLog(String rdLogMessage) {
/* 1 */             rdLogMessage.getClass();
/* 9 */             INSTANCE.mo1750v(AFg1cSDK.OTHER, rdLogMessage, true);
                }

                public static final void afVerboseLog(String rdLogMessage) {
/* 1 */             rdLogMessage.getClass();
/* 9 */             INSTANCE.mo1750v(AFg1cSDK.OTHER, rdLogMessage, false);
                }

                public static final void afWarnLog(String warningLogMessage) {
/* 1 */             warningLogMessage.getClass();
/* 12 */            AFh1ySDK.w$default(INSTANCE, AFg1cSDK.OTHER, warningLogMessage, false, 4, null);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void getCurrencyIso4217Code(AFh1ySDK[] aFh1ySDKArr) {
/* 1 */             aFh1ySDKArr.getClass();
/* 12 */            C2270uw.m9141l((Set) getMediationNetwork.getValue(), aFh1ySDKArr);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void getMediationNetwork(AFh1ySDK[] aFh1ySDKArr) {
/* 1 */             aFh1ySDKArr.getClass();
/* 16 */            ((Set) getMediationNetwork.getValue()).removeAll(C2103qd.m7780o(aFh1ySDKArr));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void getMonetizationNetwork(Function1 function1) {
/* 1 */             function1.getClass();
/* 12 */            Iterator it = ((Set) getMediationNetwork.getValue()).iterator();
/* 20 */            while (it.hasNext()) {
/* 28 */                function1.invoke((AFh1ySDK) it.next());
                    }
                }

                @Override // com.appsflyer.internal.AFh1ySDK
                /* JADX INFO: renamed from: d */
                public final void mo1747d(AFg1cSDK tag, String msg, boolean shouldRemoteDebug) {
/* 1 */             tag.getClass();
/* 4 */             msg.getClass();
/* 27 */            ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new f72(new C02312(tag, msg, shouldRemoteDebug), 14));
                }

                @Override // com.appsflyer.internal.AFh1ySDK
                /* JADX INFO: renamed from: e */
                public final void mo1748e(AFg1cSDK tag, String msg, Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
/* 1 */             tag.getClass();
/* 4 */             msg.getClass();
/* 7 */             throwable.getClass();
/* 30 */            ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new f72(new C02323(tag, msg, throwable, printMsg, printThrowable, shouldReportToExManager, shouldRemoteDebug), 14));
                }

                @Override // com.appsflyer.internal.AFh1ySDK
                public final void force(AFg1cSDK tag, String msg) {
/* 1 */             tag.getClass();
/* 4 */             msg.getClass();
/* 27 */            ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new f72(new C02334(tag, msg), 14));
                }

                @Override // com.appsflyer.internal.AFh1ySDK
                /* JADX INFO: renamed from: i */
                public final void mo1749i(AFg1cSDK tag, String msg, boolean shouldRemoteDebug) {
/* 1 */             tag.getClass();
/* 4 */             msg.getClass();
/* 27 */            ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new f72(new C02291(tag, msg, shouldRemoteDebug), 14));
                }

                public final void registerClient(AFh1ySDK... client) {
/* 1 */             client.getClass();
/* 18 */            ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new RunnableC0238a(client, 1));
                }

                public final void unregisterClient(AFh1ySDK... client) {
/* 1 */             client.getClass();
/* 18 */            ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new RunnableC0238a(client, 0));
                }

                @Override // com.appsflyer.internal.AFh1ySDK
                /* JADX INFO: renamed from: v */
                public final void mo1750v(AFg1cSDK tag, String msg, boolean shouldRemoteDebug) {
/* 1 */             tag.getClass();
/* 4 */             msg.getClass();
/* 27 */            ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new f72(new C023010(tag, msg, shouldRemoteDebug), 14));
                }

                @Override // com.appsflyer.internal.AFh1ySDK
                /* JADX INFO: renamed from: w */
                public final void mo1751w(AFg1cSDK tag, String msg, boolean shouldRemoteDebug) {
/* 1 */             tag.getClass();
/* 4 */             msg.getClass();
/* 27 */            ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new f72(new C02369(tag, msg, shouldRemoteDebug), 14));
                }

/* 12 */        public static final void afDebugLog(String debugLogMessage, boolean shouldRemoteDebug) {
                    debugLogMessage.getClass();
/* 13 */            INSTANCE.mo1747d(AFg1cSDK.OTHER, debugLogMessage, shouldRemoteDebug);
                }

/* 12 */        public static final void afInfoLog(String logMessage, boolean shouldRemoteDebug) {
                    logMessage.getClass();
/* 13 */            INSTANCE.mo1749i(AFg1cSDK.OTHER, logMessage, shouldRemoteDebug);
                }

/* 15 */        public static final void afWarnLog(String warningLogMessage, boolean shouldRemoteDebug) {
                    warningLogMessage.getClass();
/* 16 */            INSTANCE.mo1751w(AFg1cSDK.OTHER, warningLogMessage, shouldRemoteDebug);
                }

/* 39 */        public static final void afErrorLog(String message, Throwable ex, boolean printMessage, boolean printThrowable, boolean shouldReportToExManager) {
                    message.getClass();
                    ex.getClass();
/* 42 */            AFh1ySDK.e$default(INSTANCE, AFg1cSDK.OTHER, message, ex, printMessage, printThrowable, shouldReportToExManager, false, 64, null);
                }

/* 40 */        public static final void afErrorLogForExcManagerOnly(String errorLogMessage, Throwable ex) {
/* 41 */            AFLogger aFLogger = INSTANCE;
/* 42 */            AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
/* 43 */            if (errorLogMessage == null || StringsKt.m6228D(errorLogMessage)) {
                        errorLogMessage = "null";
                    }
                    String str = errorLogMessage;
                    if (ex == null) {
/* 44 */                ex = new NullPointerException("Invoked with null Throwable");
                    }
/* 45 */            AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, false, true, false, 64, null);
                }

/* 42 */        public static final void afErrorLog(String errorLogMessage, Throwable ex, boolean printThrowable) {
/* 43 */            AFLogger aFLogger = INSTANCE;
/* 44 */            AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
/* 45 */            if (errorLogMessage == null || StringsKt.m6228D(errorLogMessage)) {
                        errorLogMessage = "null";
                    }
                    String str = errorLogMessage;
                    if (ex == null) {
/* 46 */                ex = new NullPointerException("Invoked with null Throwable");
                    }
/* 47 */            AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, printThrowable, false, false, 104, null);
                }

/* 47 */        public static final void afErrorLog(String errorLogMessage, Throwable ex, boolean printThrowable, boolean shouldReportToExManager) {
/* 48 */            AFLogger aFLogger = INSTANCE;
/* 49 */            AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
/* 50 */            if (errorLogMessage == null || StringsKt.m6228D(errorLogMessage)) {
                        errorLogMessage = "null";
                    }
                    String str = errorLogMessage;
                    if (ex == null) {
/* 51 */                ex = new NullPointerException("Invoked with null Throwable");
                    }
/* 52 */            AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, printThrowable, shouldReportToExManager, false, 72, null);
                }
            }
