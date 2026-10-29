            package com.appsflyer.internal;

            import android.util.Base64;
            import java.nio.charset.Charset;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import kotlin.text.Charsets;
            import kotlin.text.StringsKt;
            import kotlin.text.StringsKt__StringsKt;
            import okhttp3.HttpUrl;
            import org.json.JSONException;
            import org.json.JSONObject;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018"}, m6176d2 = {"Lcom/appsflyer/internal/AFc1aSDK;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "p0", "p1", "p2", HttpUrl.FRAGMENT_ENCODE_SET, "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lorg/json/JSONObject;", "getRevenue", "()Lorg/json/JSONObject;", "getMonetizationNetwork", "()Ljava/lang/String;", "toString", "getMediationNetwork", "I", "AFAdRevenueData", "Ljava/lang/String;", "getCurrencyIso4217Code", "AFa1zSDK"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 2 */     public final /* data */ class AFc1aSDK {

                /* JADX INFO: renamed from: AFa1zSDK, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
                final String getRevenue;

                /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
                public String AFAdRevenueData;
                int getMediationNetwork;

                /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
                public String getMonetizationNetwork;

                public AFc1aSDK(String str, String str2, String str3, int i) {
/* 1 */             str.getClass();
/* 4 */             str2.getClass();
/* 7 */             str3.getClass();
/* 13 */            this.AFAdRevenueData = str;
/* 15 */            this.getRevenue = str2;
/* 17 */            this.getMonetizationNetwork = str3;
/* 19 */            this.getMediationNetwork = i;
                }

                public final boolean equals(Object p0) {
/* 2 */             if (this == p0) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(p0 instanceof AFc1aSDK)) {
/* 7 */                 return false;
                    }
/* 11 */            AFc1aSDK aFc1aSDK = (AFc1aSDK) p0;
                    return Intrinsics.m6216a(this.AFAdRevenueData, aFc1aSDK.AFAdRevenueData) && Intrinsics.m6216a(this.getRevenue, aFc1aSDK.getRevenue) && Intrinsics.m6216a(this.getMonetizationNetwork, aFc1aSDK.getMonetizationNetwork) && this.getMediationNetwork == aFc1aSDK.getMediationNetwork;
                }

                public final String getMonetizationNetwork() {
/* 1 */             String str = this.AFAdRevenueData;
/* 3 */             str.getClass();
/* 6 */             Charset charset = Charsets.UTF_8;
/* 8 */             byte[] bytes = str.getBytes(charset);
/* 12 */            bytes.getClass();
/* 16 */            String strEncodeToString = Base64.encodeToString(bytes, 2);
/* 20 */            String str2 = this.getRevenue;
/* 22 */            str2.getClass();
/* 25 */            byte[] bytes2 = str2.getBytes(charset);
/* 29 */            bytes2.getClass();
/* 32 */            String strEncodeToString2 = Base64.encodeToString(bytes2, 2);
/* 36 */            String str3 = this.getMonetizationNetwork;
/* 38 */            str3.getClass();
/* 41 */            byte[] bytes3 = str3.getBytes(charset);
/* 45 */            bytes3.getClass();
/* 48 */            String strEncodeToString3 = Base64.encodeToString(bytes3, 2);
/* 52 */            int i = this.getMediationNetwork;
/* 60 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("label=", strEncodeToString, "\nhashName=", strEncodeToString2, "\nstackTrace=");
/* 64 */            sbM3514r.append(strEncodeToString3);
/* 69 */            sbM3514r.append("\nc=");
/* 72 */            sbM3514r.append(i);
/* 75 */            return sbM3514r.toString();
                }

                public final JSONObject getRevenue() throws JSONException {
/* 3 */             JSONObject jSONObject = new JSONObject();
/* 10 */            jSONObject.put("label", this.AFAdRevenueData);
/* 17 */            jSONObject.put("hash_name", this.getRevenue);
/* 24 */            jSONObject.put("st", this.getMonetizationNetwork);
/* 35 */            jSONObject.put("c", String.valueOf(this.getMediationNetwork));
/* 38 */            return jSONObject;
                }

                public final int hashCode() {
/* 33 */            return Integer.hashCode(this.getMediationNetwork) + ((this.getMonetizationNetwork.hashCode() + ((this.getRevenue.hashCode() + (this.AFAdRevenueData.hashCode() * 31)) * 31)) * 31);
                }

                public final String toString() {
/* 1 */             String str = this.AFAdRevenueData;
/* 3 */             String str2 = this.getRevenue;
/* 5 */             String str3 = this.getMonetizationNetwork;
/* 7 */             int i = this.getMediationNetwork;
/* 15 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("ExceptionInfo(label=", str, ", hashName=", str2, ", stackTrace=");
/* 19 */            sbM3514r.append(str3);
/* 24 */            sbM3514r.append(", counter=");
/* 27 */            sbM3514r.append(i);
/* 32 */            sbM3514r.append(")");
/* 35 */            return sbM3514r.toString();
                }

                /* JADX INFO: renamed from: com.appsflyer.internal.AFc1aSDK$AFa1zSDK, reason: from kotlin metadata */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, m6176d2 = {"Lcom/appsflyer/internal/AFc1aSDK$AFa1zSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "p0", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "p1", HttpUrl.FRAGMENT_ENCODE_SET, "AFAdRevenueData", "(Ljava/lang/Integer;[Ljava/lang/String;)Z", "Lcom/appsflyer/internal/AFc1aSDK;", "getMediationNetwork", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFc1aSDK;", "getRevenue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    private Companion() {
                    }

                    private static boolean AFAdRevenueData(Integer p0, String... p1) {
/* 7 */                 boolean z = p0 == null;
/* 8 */                 int length = p1.length;
/* 11 */                for (int i = 0; i < 3; i++) {
/* 13 */                    String str = p1[i];
/* 28 */                    z = z || str == null || str.length() == 0;
                        }
/* 32 */                return z;
                    }

                    public static AFc1aSDK getMediationNetwork(String p0) {
/* 1 */                 p0.getClass();
/* 7 */                 List<String> listSplit$default = StringsKt__StringsKt.split$default(p0, new String[]{"\n"}, false, 0, 6, null);
/* 22 */                if (listSplit$default.size() == 4) {
/* 29 */                    String revenue = null;
/* 30 */                    String revenue2 = null;
/* 31 */                    String revenue3 = null;
/* 32 */                    Integer numValueOf = null;
/* 37 */                    for (String str : listSplit$default) {
/* 51 */                        if (C1852e.m6263m(str, "label=", false)) {
/* 53 */                            revenue = getRevenue(str, "label=");
                                } else if (C1852e.m6263m(str, "hashName=", false)) {
/* 66 */                            revenue2 = getRevenue(str, "hashName=");
                                } else if (!C1852e.m6263m(str, "stackTrace=", false)) {
/* 90 */                            if (!C1852e.m6263m(str, "c=", false)) {
                                        break;
                                    }
/* 109 */                           numValueOf = Integer.valueOf(Integer.parseInt(StringsKt.m6239O(str.substring(2)).toString()));
                                } else {
/* 79 */                            revenue3 = getRevenue(str, "stackTrace=");
                                }
                            }
/* 122 */                   if (!AFAdRevenueData(numValueOf, revenue, revenue2, revenue3)) {
/* 127 */                       revenue.getClass();
/* 130 */                       revenue2.getClass();
/* 133 */                       revenue3.getClass();
/* 136 */                       numValueOf.getClass();
/* 143 */                       return new AFc1aSDK(revenue, revenue2, revenue3, numValueOf.intValue());
                            }
                        }
/* 21 */                return null;
                    }

                    private static String getRevenue(String str, String str2) {
/* 13 */                String string = StringsKt.m6239O(str.substring(str2.length())).toString();
/* 17 */                string.getClass();
/* 20 */                Charset charset = Charsets.UTF_8;
/* 22 */                byte[] bytes = string.getBytes(charset);
/* 26 */                bytes.getClass();
/* 29 */                bytes.getClass();
/* 33 */                byte[] bArrDecode = Base64.decode(bytes, 2);
/* 37 */                bArrDecode.getClass();
/* 42 */                return new String(bArrDecode, charset);
                    }

/* 4 */             public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 5 */                 this();
                    }
                }

/* 21 */        public /* synthetic */ AFc1aSDK(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 22 */            this(str, str2, str3, (i2 & 8) != 0 ? 1 : i);
                }
            }
