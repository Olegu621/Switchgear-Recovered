            package com.appsflyer;

            import com.appsflyer.internal.AFg1cSDK;
            import com.appsflyer.internal.AFh1ySDK;
            import java.util.Currency;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J8\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\rJ\u0010\u0010\u001e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b#\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0014"}, m6176d2 = {"Lcom/appsflyer/AFAdRevenueData;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "monetizationNetwork", "Lcom/appsflyer/MediationNetwork;", "mediationNetwork", "currencyIso4217Code", HttpUrl.FRAGMENT_ENCODE_SET, "revenue", "<init>", "(Ljava/lang/String;Lcom/appsflyer/MediationNetwork;Ljava/lang/String;D)V", HttpUrl.FRAGMENT_ENCODE_SET, "areAllFieldsValid", "()Z", "component1", "()Ljava/lang/String;", "component2", "()Lcom/appsflyer/MediationNetwork;", "component3", "component4", "()D", "copy", "(Ljava/lang/String;Lcom/appsflyer/MediationNetwork;Ljava/lang/String;D)Lcom/appsflyer/AFAdRevenueData;", "other", "equals", "(Ljava/lang/Object;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "()I", "AFAdRevenueData", "toString", "Ljava/lang/String;", "getCurrencyIso4217Code", "Lcom/appsflyer/MediationNetwork;", "getMediationNetwork", "getMonetizationNetwork", "D", "getRevenue"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final /* data */ class AFAdRevenueData {
                private final String currencyIso4217Code;
                private final MediationNetwork mediationNetwork;
                private final String monetizationNetwork;
                private final double revenue;

                public AFAdRevenueData(String str, MediationNetwork mediationNetwork, String str2, double d) {
/* 1 */             str.getClass();
/* 4 */             mediationNetwork.getClass();
/* 7 */             str2.getClass();
/* 13 */            this.monetizationNetwork = str;
/* 15 */            this.mediationNetwork = mediationNetwork;
/* 17 */            this.currencyIso4217Code = str2;
/* 19 */            this.revenue = d;
                }

                private final boolean AFAdRevenueData() {
                    try {
/* 3 */                 Currency.getInstance(this.currencyIso4217Code);
/* 6 */                 return true;
                    } catch (Throwable unused) {
/* 17 */                AFh1ySDK.w$default(AFLogger.INSTANCE, AFg1cSDK.AD_REVENUE, "Currency is not ISO 4217 currency code", false, 4, null);
/* 20 */                return false;
                    }
                }

                public static /* synthetic */ AFAdRevenueData copy$default(AFAdRevenueData aFAdRevenueData, String str, MediationNetwork mediationNetwork, String str2, double d, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = aFAdRevenueData.monetizationNetwork;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                mediationNetwork = aFAdRevenueData.mediationNetwork;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                str2 = aFAdRevenueData.currencyIso4217Code;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                d = aFAdRevenueData.revenue;
                    }
/* 27 */            String str3 = str2;
/* 30 */            return aFAdRevenueData.copy(str, mediationNetwork, str3, d);
                }

                public final boolean areAllFieldsValid() {
                    return !StringsKt.m6228D(this.monetizationNetwork) && AFAdRevenueData();
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getMonetizationNetwork() {
/* 1 */             return this.monetizationNetwork;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final MediationNetwork getMediationNetwork() {
/* 1 */             return this.mediationNetwork;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final String getCurrencyIso4217Code() {
/* 1 */             return this.currencyIso4217Code;
                }

                /* JADX INFO: renamed from: component4, reason: from getter */
                public final double getRevenue() {
/* 1 */             return this.revenue;
                }

                public final AFAdRevenueData copy(String monetizationNetwork, MediationNetwork mediationNetwork, String currencyIso4217Code, double revenue) {
/* 1 */             monetizationNetwork.getClass();
/* 4 */             mediationNetwork.getClass();
/* 7 */             currencyIso4217Code.getClass();
/* 12 */            return new AFAdRevenueData(monetizationNetwork, mediationNetwork, currencyIso4217Code, revenue);
                }

                public final boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof AFAdRevenueData)) {
/* 7 */                 return false;
                    }
/* 11 */            AFAdRevenueData aFAdRevenueData = (AFAdRevenueData) other;
                    return Intrinsics.m6216a(this.monetizationNetwork, aFAdRevenueData.monetizationNetwork) && this.mediationNetwork == aFAdRevenueData.mediationNetwork && Intrinsics.m6216a(this.currencyIso4217Code, aFAdRevenueData.currencyIso4217Code) && Double.compare(this.revenue, aFAdRevenueData.revenue) == 0;
                }

                public final String getCurrencyIso4217Code() {
/* 1 */             return this.currencyIso4217Code;
                }

                public final MediationNetwork getMediationNetwork() {
/* 1 */             return this.mediationNetwork;
                }

                public final String getMonetizationNetwork() {
/* 1 */             return this.monetizationNetwork;
                }

                public final double getRevenue() {
/* 1 */             return this.revenue;
                }

                public final int hashCode() {
/* 33 */            return Double.hashCode(this.revenue) + ((this.currencyIso4217Code.hashCode() + ((this.mediationNetwork.hashCode() + (this.monetizationNetwork.hashCode() * 31)) * 31)) * 31);
                }

                public final String toString() {
/* 48 */            return "AFAdRevenueData(monetizationNetwork=" + this.monetizationNetwork + ", mediationNetwork=" + this.mediationNetwork + ", currencyIso4217Code=" + this.currencyIso4217Code + ", revenue=" + this.revenue + ")";
                }
            }
