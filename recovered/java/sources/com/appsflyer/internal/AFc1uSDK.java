            package com.appsflyer.internal;

            import android.util.Base64;
            import com.appsflyer.AFLogger;
            import java.nio.charset.Charset;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Scanner;
            import kotlin.jvm.internal.Intrinsics;
            import org.json.JSONObject;
            import p000.C1982nz;
            import p000.od0;
            import p000.u92;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 276 */   public final class AFc1uSDK {
                public AFe1pSDK AFAdRevenueData;
                private byte[] component4;
                String getCurrencyIso4217Code;
                public String getMediationNetwork;
                public Map<String, String> getMonetizationNetwork;
                public String getRevenue;

                public AFc1uSDK(char[] cArr) {
                    Map<String, String> map;
/* 11 */            Scanner scanner = new Scanner(new String(cArr));
/* 18 */            while (scanner.hasNextLine()) {
                        try {
/* 20 */                    String strNextLine = scanner.nextLine();
/* 30 */                    if (strNextLine.startsWith("url=")) {
/* 41 */                        this.getRevenue = strNextLine.substring(4).trim();
                            } else if (strNextLine.startsWith("version=")) {
/* 65 */                        this.getCurrencyIso4217Code = strNextLine.substring(8).trim();
                            } else if (strNextLine.startsWith("headers=")) {
                                try {
/* 100 */                           JSONObject jSONObject = new JSONObject(new String(Base64.decode(strNextLine.substring(8).trim(), 2), Charset.defaultCharset()));
/* 107 */                           if (jSONObject.length() == 0) {
/* 109 */                               map = od0.f14715a;
/* 111 */                               map.getClass();
                                    } else {
/* 115 */                               Iterator<String> itKeys = jSONObject.keys();
/* 119 */                               itKeys.getClass();
/* 122 */                               C1982nz c1982nzM8981a = u92.m8981a(itKeys);
/* 128 */                               LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 139 */                               for (Object obj : c1982nzM8981a) {
/* 148 */                                   Object obj2 = jSONObject.get((String) obj);
/* 169 */                                   linkedHashMap.put(obj, Intrinsics.m6216a(obj2, JSONObject.NULL) ? "null" : obj2.toString());
                                        }
/* 173 */                               map = linkedHashMap;
                                    }
/* 174 */                           this.getMonetizationNetwork = map;
                                } catch (Exception e) {
/* 184 */                           AFLogger.INSTANCE.m1811e(AFg1cSDK.CACHE, "Error parsing headers", e);
/* 192 */                           this.getMonetizationNetwork = new HashMap();
                                }
                            } else if (strNextLine.startsWith("data=")) {
/* 217 */                       this.component4 = Base64.decode(strNextLine.substring(5).trim(), 2);
                            } else if (strNextLine.startsWith("type=")) {
/* 233 */                       String strTrim = strNextLine.substring(5).trim();
                                try {
/* 241 */                           this.AFAdRevenueData = AFe1pSDK.valueOf(strTrim);
                                } catch (Exception e2) {
/* 260 */                           AFLogger.INSTANCE.m1811e(AFg1cSDK.CACHE, "Unknown task type: ".concat(String.valueOf(strTrim)), e2);
                                }
                            }
                        } catch (Throwable th) {
                            try {
/* 269 */                       scanner.close();
                            } catch (Throwable th2) {
/* 274 */                       th.addSuppressed(th2);
                            }
/* 277 */                   throw th;
                        }
                    }
/* 265 */           scanner.close();
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && AFc1uSDK.class == obj.getClass()) {
/* 17 */                AFc1uSDK aFc1uSDK = (AFc1uSDK) obj;
/* 27 */                if (Objects.equals(this.getCurrencyIso4217Code, aFc1uSDK.getCurrencyIso4217Code) && Arrays.equals(this.component4, aFc1uSDK.component4) && Objects.equals(this.getRevenue, aFc1uSDK.getRevenue) && Objects.equals(this.getMediationNetwork, aFc1uSDK.getMediationNetwork) && Objects.equals(this.getMonetizationNetwork, aFc1uSDK.getMonetizationNetwork) && this.AFAdRevenueData == aFc1uSDK.AFAdRevenueData) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final byte[] getMediationNetwork() {
/* 1 */             return this.component4;
                }

                public final int hashCode() {
/* 1 */             String str = this.getCurrencyIso4217Code;
/* 21 */            int iHashCode = (Arrays.hashCode(this.component4) + ((str != null ? str.hashCode() : 0) * 31)) * 31;
/* 23 */            String str2 = this.getRevenue;
/* 34 */            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
/* 36 */            String str3 = this.getMediationNetwork;
/* 47 */            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
/* 49 */            AFe1pSDK aFe1pSDK = this.AFAdRevenueData;
/* 60 */            int iHashCode4 = (iHashCode3 + (aFe1pSDK != null ? aFe1pSDK.hashCode() : 0)) * 31;
/* 62 */            Map<String, String> map = this.getMonetizationNetwork;
/* 70 */            return iHashCode4 + (map != null ? map.hashCode() : 0);
                }

/* 277 */       public AFc1uSDK(String str, byte[] bArr, String str2, AFe1pSDK aFe1pSDK, Map<String, String> map) {
/* 279 */           this.getRevenue = str;
/* 280 */           this.component4 = bArr;
/* 281 */           this.getCurrencyIso4217Code = str2;
/* 282 */           this.AFAdRevenueData = aFe1pSDK;
/* 283 */           this.getMonetizationNetwork = map;
                }
            }
