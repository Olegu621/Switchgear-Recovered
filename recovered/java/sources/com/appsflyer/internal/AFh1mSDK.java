            package com.appsflyer.internal;

            import com.appsflyer.attribution.AppsFlyerRequestListener;
            import java.util.HashMap;
            import java.util.Map;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 2 */     public abstract class AFh1mSDK {
                public Map<String, Object> AFAdRevenueData;
                public String areAllFieldsValid;
                public String component1;
                public String component2;
                public String component3;
                public int component4;
                public String copydefault;
                public AppsFlyerRequestListener getCurrencyIso4217Code;
                public final Map<String, String> getMediationNetwork;
                public String getMonetizationNetwork;
                public Map<String, Object> getRevenue;
                private byte[] hashCode;
                private final boolean toString;

                public AFh1mSDK(String str, String str2, Boolean bool) {
/* 9 */             this.AFAdRevenueData = new HashMap();
/* 16 */            this.getMediationNetwork = new HashMap();
/* 18 */            this.areAllFieldsValid = str;
/* 20 */            this.component2 = str2;
/* 30 */            this.toString = bool != null ? bool.booleanValue() : true;
                }

                public static boolean getRevenue(double d) {
/* 6 */             if (d < 0.0d || d >= 1.0d) {
/* 5 */                 return false;
                    }
/* 18 */            if (d == 0.0d) {
/* 17 */                return true;
                    }
/* 23 */            int i = (int) (1.0d / d);
/* 26 */            if (i + 1 > 0) {
                        return ((int) ((Math.random() * ((double) i)) + 1.0d)) != i;
                    }
/* 42 */            C1951n4.m6859j("Unsupported max value");
/* 45 */            return false;
                }

                public abstract AFe1pSDK AFAdRevenueData();

                public final AFh1mSDK AFAdRevenueData(int i) {
/* 1 */             this.component4 = i;
                    synchronized (this.AFAdRevenueData) {
                        try {
/* 14 */                    if (this.AFAdRevenueData.containsKey("counter")) {
/* 24 */                        this.AFAdRevenueData.put("counter", Integer.toString(i));
                            }
/* 38 */                    if (this.AFAdRevenueData.containsKey("launch_counter")) {
/* 48 */                        this.AFAdRevenueData.put("launch_counter", Integer.toString(i));
                            }
                        } catch (Throwable th) {
/* 54 */                    throw th;
                        }
                    }
/* 52 */            return this;
                }

                public boolean areAllFieldsValid() {
/* 1 */             return false;
                }

                public boolean component1() {
/* 1 */             return true;
                }

                public boolean component4() {
/* 1 */             return true;
                }

                public final boolean getCurrencyIso4217Code() {
/* 1 */             return this.toString;
                }

                public final AFh1mSDK getMediationNetwork(byte[] bArr) {
/* 1 */             this.hashCode = bArr;
/* 3 */             return this;
                }

                public final AFh1mSDK getMonetizationNetwork(String str, Object obj) {
                    synchronized (this.AFAdRevenueData) {
/* 6 */                 this.AFAdRevenueData.put(str, obj);
                    }
/* 10 */            return this;
                }

/* 3 */         public boolean getMediationNetwork() {
/* 4 */             return true;
                }

/* 13 */        public final byte[] getMonetizationNetwork() {
/* 14 */            return this.hashCode;
                }

/* 32 */        public AFh1mSDK() {
/* 33 */            this(null, null, null);
                }

/* 47 */        public final boolean getRevenue() {
                    return this.areAllFieldsValid == null && this.component3 == null;
                }

/* 54 */        public final AFh1mSDK AFAdRevenueData(Map<String, ?> map) {
                    synchronized (map) {
/* 56 */                this.AFAdRevenueData.putAll(map);
                    }
                    return this;
                }
            }
