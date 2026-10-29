            package com.appsflyer.internal;

            import android.net.TrafficStats;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Set;
            import java.util.concurrent.Callable;
            import java.util.concurrent.atomic.AtomicInteger;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AFe1mSDK<Result> implements Comparable<AFe1mSDK<?>>, Callable<AFe1uSDK> {
                private static final AtomicInteger component3 = new AtomicInteger();
                public final Set<AFe1pSDK> AFAdRevenueData;
                private long areAllFieldsValid;
                private Throwable component1;
                private final int component2;
                private final String component4;
                private boolean copy;
                public final Set<AFe1pSDK> getCurrencyIso4217Code;
                public volatile int getMediationNetwork;
                public AFe1uSDK getMonetizationNetwork;
                public final AFe1pSDK getRevenue;

                public AFe1mSDK(AFe1pSDK aFe1pSDK, AFe1pSDK[] aFe1pSDKArr, String str) {
/* 6 */             HashSet hashSet = new HashSet();
/* 9 */             this.AFAdRevenueData = hashSet;
/* 16 */            this.getCurrencyIso4217Code = new HashSet();
/* 20 */            int iIncrementAndGet = component3.incrementAndGet();
/* 24 */            this.component2 = iIncrementAndGet;
/* 27 */            this.copy = false;
/* 29 */            this.getMediationNetwork = 0;
/* 31 */            this.getRevenue = aFe1pSDK;
/* 33 */            Collections.addAll(hashSet, aFe1pSDKArr);
/* 36 */            if (str != null) {
/* 38 */                this.component4 = str;
                    } else {
/* 45 */                this.component4 = String.valueOf(iIncrementAndGet);
                    }
                }

                public abstract long AFAdRevenueData();

                public void AFAdRevenueData(Throwable th) {
                }

                public final boolean areAllFieldsValid() {
/* 1 */             return this.copy;
                }

                public final Throwable component1() {
/* 1 */             return this.component1;
                }

                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: component4, reason: merged with bridge method [inline-methods] */
                public final AFe1uSDK call() throws Exception {
/* 4 */             TrafficStats.setThreadStatsTag(82339054);
/* 8 */             this.getMonetizationNetwork = null;
/* 10 */            this.component1 = null;
/* 12 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 20 */            this.getMediationNetwork++;
                    try {
/* 22 */                AFe1uSDK revenue = getRevenue();
/* 26 */                this.getMonetizationNetwork = revenue;
/* 33 */                this.areAllFieldsValid = System.currentTimeMillis() - jCurrentTimeMillis;
/* 35 */                getCurrencyIso4217Code();
/* 38 */                return revenue;
                    } catch (Throwable th) {
                        try {
/* 40 */                    this.component1 = th;
/* 44 */                    this.getMonetizationNetwork = AFe1uSDK.FAILURE;
/* 46 */                    AFAdRevenueData(th);
/* 49 */                    throw th;
                        } catch (Throwable th2) {
/* 56 */                    this.areAllFieldsValid = System.currentTimeMillis() - jCurrentTimeMillis;
/* 58 */                    getCurrencyIso4217Code();
/* 61 */                    throw th2;
                        }
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 19 */            AFe1mSDK aFe1mSDK = (AFe1mSDK) obj;
/* 25 */            if (this.getRevenue != aFe1mSDK.getRevenue) {
/* 5 */                 return false;
                    }
/* 32 */            return this.component4.equals(aFe1mSDK.component4);
                }

                public void getCurrencyIso4217Code() {
                }

                public void getMediationNetwork() {
/* 2 */             this.copy = true;
                }

                public abstract boolean getMonetizationNetwork();

                @Override // java.lang.Comparable
                /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
                public final int compareTo(AFe1mSDK<?> aFe1mSDK) {
/* 9 */             int i = this.getRevenue.unregisterClient - aFe1mSDK.getRevenue.unregisterClient;
/* 10 */            if (i != 0) {
/* 30 */                return i;
                    }
/* 20 */            if (this.component4.equals(aFe1mSDK.component4)) {
/* 22 */                return 0;
                    }
/* 28 */            return this.component2 - aFe1mSDK.component2;
                }

                public abstract AFe1uSDK getRevenue() throws Exception;

                public final int hashCode() {
/* 15 */            return this.component4.hashCode() + (this.getRevenue.hashCode() * 31);
                }

                public String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append(this.getRevenue);
/* 13 */            sb.append("-");
/* 18 */            sb.append(this.component4);
/* 21 */            String string = sb.toString();
/* 37 */            if (String.valueOf(this.component2).equals(this.component4)) {
/* 53 */                return string;
                    }
/* 39 */            StringBuilder sbM3794t = fm0.m3794t(string, "-");
/* 45 */            sbM3794t.append(this.component2);
/* 48 */            return sbM3794t.toString();
                }
            }
