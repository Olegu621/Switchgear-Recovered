            package com.appsflyer.internal;

            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            import p000.m42;
            import p000.n42;
            import p000.nd0;
            import p000.o42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 118 */   public final class AFi1zSDK {
                public final AFh1aSDK getCurrencyIso4217Code;
                public AFi1xSDK getMediationNetwork;
                public final AFi1uSDK getMonetizationNetwork;

                public AFi1zSDK(JSONObject jSONObject) {
/* 1 */             jSONObject.getClass();
/* 11 */            this.getMediationNetwork = AFAdRevenueData(jSONObject);
/* 17 */            this.getCurrencyIso4217Code = getMediationNetwork(jSONObject);
/* 23 */            this.getMonetizationNetwork = getRevenue(jSONObject);
                }

                private static AFi1xSDK AFAdRevenueData(JSONObject jSONObject) {
                    Object n42Var;
                    List arrayList;
                    try {
/* 4 */                 m42 m42Var = o42.f14612b;
/* 8 */                 JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "r_debugger");
/* 12 */                if (jSONObjectAFAdRevenueData != null) {
/* 16 */                    long j = jSONObjectAFAdRevenueData.getLong("ttl");
/* 22 */                    int i = jSONObjectAFAdRevenueData.getInt("counter");
/* 28 */                    String strOptString = jSONObjectAFAdRevenueData.optString("app_ver", HttpUrl.FRAGMENT_ENCODE_SET);
/* 34 */                    String strOptString2 = jSONObjectAFAdRevenueData.optString("sdk_ver", HttpUrl.FRAGMENT_ENCODE_SET);
/* 46 */                    float fOptDouble = (float) jSONObjectAFAdRevenueData.optDouble("ratio", 1.0d);
/* 49 */                    JSONArray jSONArrayOptJSONArray = jSONObjectAFAdRevenueData.optJSONArray("tags");
/* 53 */                    if (jSONArrayOptJSONArray != null) {
/* 57 */                        arrayList = new ArrayList();
/* 60 */                        int length = jSONArrayOptJSONArray.length();
/* 65 */                        for (int i2 = 0; i2 < length; i2++) {
/* 67 */                            String string = jSONArrayOptJSONArray.getString(i2);
/* 71 */                            string.getClass();
/* 74 */                            arrayList.add(string);
                                }
                            } else {
/* 85 */                        arrayList = nd0.f14189a;
                            }
/* 83 */                    List list = arrayList;
/* 90 */                    strOptString.getClass();
/* 93 */                    strOptString2.getClass();
/* 96 */                    n42Var = new AFi1xSDK(j, fOptDouble, list, i, strOptString, strOptString2);
                        } else {
/* 100 */                   n42Var = null;
                        }
                    } catch (Throwable th) {
/* 102 */               m42 m42Var2 = o42.f14612b;
/* 106 */               n42Var = new n42(th);
                    }
/* 109 */           m42 m42Var3 = o42.f14612b;
/* 117 */           return (AFi1xSDK) (n42Var instanceof n42 ? null : n42Var);
                }

                private static AFh1aSDK getMediationNetwork(JSONObject jSONObject) {
                    Object n42Var;
                    try {
/* 2 */                 m42 m42Var = o42.f14612b;
/* 6 */                 JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "exc_mngr");
/* 48 */                n42Var = jSONObjectAFAdRevenueData != null ? new AFh1aSDK(jSONObjectAFAdRevenueData.getString("sdk_ver"), jSONObjectAFAdRevenueData.optInt("min", -1), jSONObjectAFAdRevenueData.optInt("expire", -1), jSONObjectAFAdRevenueData.optLong("ttl", -1L)) : null;
                    } catch (Throwable th) {
/* 50 */                m42 m42Var2 = o42.f14612b;
/* 54 */                n42Var = new n42(th);
                    }
/* 63 */            return (AFh1aSDK) (n42Var instanceof n42 ? null : n42Var);
                }

                private static AFi1uSDK getRevenue(JSONObject jSONObject) {
                    Object n42Var;
                    try {
/* 2 */                 m42 m42Var = o42.f14612b;
/* 6 */                 JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "meta_data");
/* 28 */                n42Var = jSONObjectAFAdRevenueData != null ? new AFi1uSDK(jSONObjectAFAdRevenueData.optDouble("send_rate", 1.0d)) : null;
                    } catch (Throwable th) {
/* 30 */                m42 m42Var2 = o42.f14612b;
/* 34 */                n42Var = new n42(th);
                    }
/* 45 */            return (AFi1uSDK) (n42Var instanceof n42 ? null : n42Var);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 20 */            if (!AFi1zSDK.class.equals(obj != null ? obj.getClass() : null)) {
/* 19 */                return false;
                    }
/* 23 */            obj.getClass();
/* 26 */            AFi1zSDK aFi1zSDK = (AFi1zSDK) obj;
                    return Intrinsics.m6216a(this.getCurrencyIso4217Code, aFi1zSDK.getCurrencyIso4217Code) && Intrinsics.m6216a(this.getMonetizationNetwork, aFi1zSDK.getMonetizationNetwork) && Intrinsics.m6216a(this.getMediationNetwork, aFi1zSDK.getMediationNetwork);
                }

                public final int hashCode() {
/* 1 */             AFh1aSDK aFh1aSDK = this.getCurrencyIso4217Code;
/* 12 */            int iHashCode = (aFh1aSDK != null ? aFh1aSDK.hashCode() : 0) * 31;
/* 14 */            AFi1uSDK aFi1uSDK = this.getMonetizationNetwork;
/* 25 */            int iHashCode2 = (iHashCode + (aFi1uSDK != null ? aFi1uSDK.hashCode() : 0)) * 31;
/* 27 */            AFi1xSDK aFi1xSDK = this.getMediationNetwork;
/* 35 */            return iHashCode2 + (aFi1xSDK != null ? aFi1xSDK.hashCode() : 0);
                }

/* 119 */       private static JSONObject AFAdRevenueData(JSONObject jSONObject, String str) throws JSONException, NullPointerException {
                    JSONObject jSONObjectOptJSONObject;
/* 120 */           if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject(SharedDataContentProvider.BASE_PATH)) == null) {
                        return null;
                    }
/* 124 */           return jSONObjectOptJSONObject.optJSONObject("v1");
                }
            }
