            package com.appsflyer.internal;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014"}, m6176d2 = {"Lcom/appsflyer/internal/AFe1xSDK;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "p0", "p1", "Lcom/appsflyer/internal/AFe1tSDK;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/internal/AFe1tSDK;)V", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "()I", "toString", "()Ljava/lang/String;", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFe1tSDK;", "getMonetizationNetwork", "Ljava/lang/String;", "getRevenue"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final /* data */ class AFe1xSDK {

                /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
                public final AFe1tSDK getMonetizationNetwork;

                /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
                public final String getCurrencyIso4217Code;
                public final String getRevenue;

                public AFe1xSDK(String str, String str2, AFe1tSDK aFe1tSDK) {
/* 1 */             str.getClass();
/* 4 */             aFe1tSDK.getClass();
/* 10 */            this.getCurrencyIso4217Code = str;
/* 12 */            this.getRevenue = str2;
/* 14 */            this.getMonetizationNetwork = aFe1tSDK;
                }

                public final boolean equals(Object p0) {
/* 2 */             if (this == p0) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(p0 instanceof AFe1xSDK)) {
/* 7 */                 return false;
                    }
/* 11 */            AFe1xSDK aFe1xSDK = (AFe1xSDK) p0;
                    return Intrinsics.m6216a(this.getCurrencyIso4217Code, aFe1xSDK.getCurrencyIso4217Code) && Intrinsics.m6216a(this.getRevenue, aFe1xSDK.getRevenue) && this.getMonetizationNetwork == aFe1xSDK.getMonetizationNetwork;
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.getCurrencyIso4217Code.hashCode() * 31;
/* 9 */             String str = this.getRevenue;
/* 28 */            return this.getMonetizationNetwork.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final String toString() {
/* 1 */             String str = this.getCurrencyIso4217Code;
/* 3 */             String str2 = this.getRevenue;
/* 5 */             AFe1tSDK aFe1tSDK = this.getMonetizationNetwork;
/* 13 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("HostMeta(name=", str, ", prefix=", str2, ", method=");
/* 17 */            sbM3514r.append(aFe1tSDK);
/* 22 */            sbM3514r.append(")");
/* 25 */            return sbM3514r.toString();
                }
            }
