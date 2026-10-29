            package com.appsflyer.internal;

            import com.appsflyer.AFInAppEventParameterName;
            import com.appsflyer.AFInAppEventType;
            import java.util.List;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1851d;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import p000.C2085pw;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b&\u0018\u0000 \t2\u00020\u0001:\u0004\t\n\u000b\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, m6176d2 = {"Lcom/appsflyer/internal/AFe1rSDK;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "p0", "<init>", "(Ljava/lang/String;)V", "getRevenue", "Ljava/lang/String;", "getMediationNetwork", "AFa1ySDK", "AFa1tSDK", "AFa1zSDK", "AFa1uSDK"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 2 */     public abstract class AFe1rSDK {

                /* JADX INFO: renamed from: AFa1ySDK, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final List<String> getMediationNetwork = C2085pw.m7566e(AFInAppEventType.ACHIEVEMENT_UNLOCKED, AFInAppEventType.AD_CLICK, AFInAppEventType.AD_VIEW, AFInAppEventType.ADD_PAYMENT_INFO, AFInAppEventType.ADD_TO_CART, AFInAppEventType.ADD_TO_WISH_LIST, AFInAppEventType.COMPLETE_REGISTRATION, AFInAppEventType.CONTENT_VIEW, AFInAppEventType.INITIATED_CHECKOUT, AFInAppEventType.INVITE, AFInAppEventType.LEVEL_ACHIEVED, AFInAppEventType.LIST_VIEW, AFInAppEventType.LOGIN, AFInAppEventType.OPENED_FROM_PUSH_NOTIFICATION, AFInAppEventType.PURCHASE, AFInAppEventType.RATE, AFInAppEventType.RE_ENGAGE, AFInAppEventType.SEARCH, AFInAppEventType.SHARE, AFInAppEventType.SPENT_CREDIT, AFInAppEventType.START_TRIAL, AFInAppEventType.SUBSCRIBE, AFInAppEventType.TRAVEL_BOOKING, AFInAppEventType.TUTORIAL_COMPLETION, AFInAppEventType.UPDATE);

                /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
                public final String getMediationNetwork;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, m6176d2 = {"Lcom/appsflyer/internal/AFe1rSDK$AFa1tSDK;", "Lcom/appsflyer/internal/AFe1rSDK;", "<init>", "()V"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class AFa1tSDK extends AFe1rSDK {
                    public static final AFa1tSDK INSTANCE = new AFa1tSDK();

                    private AFa1tSDK() {
/* 3 */                 super("install");
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, m6176d2 = {"Lcom/appsflyer/internal/AFe1rSDK$AFa1uSDK;", "Lcom/appsflyer/internal/AFe1rSDK;", "<init>", "()V"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class AFa1uSDK extends AFe1rSDK {
                    public static final AFa1uSDK INSTANCE = new AFa1uSDK();

                    private AFa1uSDK() {
/* 3 */                 super("af_sandbox_revenue");
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class AFa1zSDK extends AFe1rSDK {
                    public final Integer AFAdRevenueData;
                    public final Float getCurrencyIso4217Code;
                    private final String getMediationNetwork;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AFa1zSDK(String str, Float f, Integer num) {
/* 4 */                 super(str);
/* 1 */                 str.getClass();
/* 7 */                 this.getMediationNetwork = str;
/* 9 */                 this.getCurrencyIso4217Code = f;
/* 11 */                this.AFAdRevenueData = num;
                    }

                    public final boolean equals(Object obj) {
/* 2 */                 if (this == obj) {
/* 1 */                     return true;
                        }
/* 8 */                 if (!(obj instanceof AFa1zSDK)) {
/* 7 */                     return false;
                        }
/* 11 */                AFa1zSDK aFa1zSDK = (AFa1zSDK) obj;
                        return Intrinsics.m6216a(this.getMediationNetwork, aFa1zSDK.getMediationNetwork) && Intrinsics.m6216a(this.getCurrencyIso4217Code, aFa1zSDK.getCurrencyIso4217Code) && Intrinsics.m6216a(this.AFAdRevenueData, aFa1zSDK.AFAdRevenueData);
                    }

                    public final int hashCode() {
/* 7 */                 int iHashCode = this.getMediationNetwork.hashCode() * 31;
/* 9 */                 Float f = this.getCurrencyIso4217Code;
/* 21 */                int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
/* 23 */                Integer num = this.AFAdRevenueData;
/* 32 */                return iHashCode2 + (num != null ? num.hashCode() : 0);
                    }

                    public final String toString() {
/* 38 */                return "PredefinedInAppEvent(name=" + this.getMediationNetwork + ", eventRevenue=" + this.getCurrencyIso4217Code + ", eventCounter=" + this.AFAdRevenueData + ")";
                    }
                }

                public AFe1rSDK(String str) {
/* 1 */             str.getClass();
/* 7 */             this.getMediationNetwork = str;
                }

                /* JADX INFO: renamed from: com.appsflyer.internal.AFe1rSDK$AFa1ySDK, reason: from kotlin metadata */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b"}, m6176d2 = {"Lcom/appsflyer/internal/AFe1rSDK$AFa1ySDK;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "Lcom/appsflyer/internal/AFh1mSDK;", "p0", "Lcom/appsflyer/internal/AFe1rSDK;", "getMediationNetwork", "(Lcom/appsflyer/internal/AFh1mSDK;)Lcom/appsflyer/internal/AFe1rSDK;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/util/List;", "getRevenue"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    private Companion() {
                    }

                    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
                    public static AFe1rSDK getMediationNetwork(AFh1mSDK p0) {
                        Float fValueOf;
                        String string;
                        Object obj;
                        String string2;
/* 1 */                 p0.getClass();
/* 10 */                if (p0.AFAdRevenueData() == AFe1pSDK.CONVERSION) {
/* 12 */                    return AFa1tSDK.INSTANCE;
                        }
/* 21 */                Integer intOrNull = null;
/* 22 */                if (p0.AFAdRevenueData() != AFe1pSDK.INAPP || !AFe1rSDK.getMediationNetwork.contains(p0.areAllFieldsValid)) {
/* 21 */                    return null;
                        }
/* 36 */                Map<String, Object> map = p0.getRevenue;
/* 38 */                if (map == null || (obj = map.get(AFInAppEventParameterName.REVENUE)) == null || (string2 = obj.toString()) == null) {
/* 69 */                    fValueOf = null;
                        } else {
                            try {
/* 58 */                        if (C1851d.m6255d(string2)) {
/* 64 */                            fValueOf = Float.valueOf(Float.parseFloat(string2));
                                } else {
/* 69 */                            fValueOf = null;
                                }
                            } catch (NumberFormatException unused) {
                            }
                        }
/* 74 */                Object obj2 = p0.AFAdRevenueData.get("iaecounter");
/* 78 */                if (obj2 != null && (string = obj2.toString()) != null) {
/* 86 */                    intOrNull = StringsKt.toIntOrNull(string);
                        }
/* 92 */                String str = p0.areAllFieldsValid;
/* 94 */                str.getClass();
/* 97 */                return new AFa1zSDK(str, fValueOf, intOrNull);
                    }

/* 4 */             public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 5 */                 this();
                    }
                }
            }
