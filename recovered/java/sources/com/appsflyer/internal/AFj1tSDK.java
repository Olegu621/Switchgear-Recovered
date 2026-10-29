            package com.appsflyer.internal;

            import android.content.Context;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.Observable;
            import java.util.Observer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AFj1tSDK extends Observable {
                public final String areAllFieldsValid;
                long component1;
                public final String component3;
                final Runnable getRevenue;
                public final Map<String, Object> getMediationNetwork = new HashMap();
                public AFa1tSDK component4 = AFa1tSDK.NOT_STARTED;

                /* JADX INFO: renamed from: com.appsflyer.internal.AFj1tSDK$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class C02871 implements Observer {
                    public C02871() {
                    }

                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
/* 5 */                 AFj1tSDK.this.getRevenue.run();
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum AFa1tSDK {
                    NOT_STARTED,
                    STARTED,
                    FINISHED
                }

                public AFj1tSDK(String str, String str2, Runnable runnable) {
/* 15 */            this.getRevenue = runnable;
/* 17 */            this.component3 = str2;
/* 19 */            this.areAllFieldsValid = str;
                }

                public void AFAdRevenueData() {
/* 16 */            this.getMediationNetwork.put("latency", Long.valueOf(System.currentTimeMillis() - this.component1));
                }

                public final void getMediationNetwork() {
/* 7 */             this.getMediationNetwork.put(FirebaseAnalytics.Param.SOURCE, this.component3);
/* 16 */            this.getMediationNetwork.put("type", this.areAllFieldsValid);
/* 19 */            AFAdRevenueData();
/* 24 */            this.component4 = AFa1tSDK.FINISHED;
/* 26 */            setChanged();
/* 29 */            notifyObservers();
                }

                public abstract void getMonetizationNetwork(Context context);
            }
