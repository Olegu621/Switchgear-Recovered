            package com.appsflyer.internal;

            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public class AFa1nSDK extends HashMap<Integer, String> {
                private static AFa1nSDK AFAdRevenueData;
                private final Object getMediationNetwork = new Object();

                private AFa1nSDK() {
                }

                public static synchronized AFa1nSDK afErrorLog() {
                    try {
/* 6 */                 if (AFAdRevenueData == null) {
/* 13 */                    AFAdRevenueData = new AFa1nSDK();
                        }
                    } catch (Throwable th) {
/* 23 */                throw th;
                    }
/* 18 */            return AFAdRevenueData;
                }

                @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                public String put(Integer num, String str) {
                    String str2;
                    synchronized (this.getMediationNetwork) {
/* 8 */                 str2 = (String) super.put(num, str);
                    }
/* 11 */            return str2;
                }

                @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                public String remove(Object obj) {
                    String str;
                    synchronized (this.getMediationNetwork) {
/* 8 */                 str = (String) super.remove(obj);
                    }
/* 11 */            return str;
                }

                @Override // java.util.HashMap, java.util.Map
/* 14 */        public boolean remove(Object obj, Object obj2) {
                    boolean zRemove;
                    synchronized (this.getMediationNetwork) {
/* 16 */                zRemove = super.remove(obj, obj2);
                    }
                    return zRemove;
                }
            }
