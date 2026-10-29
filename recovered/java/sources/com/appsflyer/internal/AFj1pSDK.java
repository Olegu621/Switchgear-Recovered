            package com.appsflyer.internal;

            import android.content.Context;
            import android.hardware.Sensor;
            import android.hardware.SensorManager;
            import android.os.Handler;
            import android.os.HandlerThread;
            import com.appsflyer.AFLogger;
            import java.util.BitSet;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.ExecutorService;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public final class AFj1pSDK implements AFj1lSDK {
                private static final BitSet component2;
                boolean AFAdRevenueData;
                private final Map<AFj1nSDK, AFj1nSDK> areAllFieldsValid;
                private final SensorManager component1;
                private final Map<AFj1nSDK, Map<String, Object>> component3;
                private final ExecutorService component4;
                private boolean copy;
                private final Runnable equals;
                final Runnable getCurrencyIso4217Code;
                final Runnable getMediationNetwork;
                final Object getMonetizationNetwork;
                final Handler getRevenue;

                static {
/* 4 */             BitSet bitSet = new BitSet(6);
/* 7 */             component2 = bitSet;
/* 10 */            bitSet.set(1);
/* 14 */            bitSet.set(2);
/* 18 */            bitSet.set(4);
                }

                private AFj1pSDK(SensorManager sensorManager, Handler handler, ExecutorService executorService) {
/* 9 */             this.getMonetizationNetwork = new Object();
/* 13 */            BitSet bitSet = component2;
/* 22 */            this.areAllFieldsValid = new HashMap(bitSet.size());
/* 33 */            this.component3 = new ConcurrentHashMap(bitSet.size());
/* 40 */            this.getMediationNetwork = new Runnable() { // from class: com.appsflyer.internal.AFj1pSDK.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            synchronized (AFj1pSDK.this.getMonetizationNetwork) {
/* 8 */                         AFj1pSDK.this.getRevenue();
/* 11 */                        AFj1pSDK aFj1pSDK = AFj1pSDK.this;
/* 19 */                        aFj1pSDK.getRevenue.postDelayed(aFj1pSDK.getCurrencyIso4217Code, 150L);
/* 25 */                        AFj1pSDK.this.AFAdRevenueData = true;
                            }
                        }
                    };
/* 48 */            this.getCurrencyIso4217Code = new RunnableC0306r(this, 1);
/* 55 */            this.equals = new Runnable() { // from class: com.appsflyer.internal.AFj1pSDK.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            synchronized (AFj1pSDK.this.getMonetizationNetwork) {
                                try {
/* 6 */                             AFj1pSDK aFj1pSDK = AFj1pSDK.this;
/* 10 */                            if (aFj1pSDK.AFAdRevenueData) {
/* 16 */                                aFj1pSDK.getRevenue.removeCallbacks(aFj1pSDK.getMediationNetwork);
/* 19 */                                AFj1pSDK aFj1pSDK2 = AFj1pSDK.this;
/* 25 */                                aFj1pSDK2.getRevenue.removeCallbacks(aFj1pSDK2.getCurrencyIso4217Code);
/* 30 */                                AFj1pSDK.this.getCurrencyIso4217Code();
/* 36 */                                AFj1pSDK.this.AFAdRevenueData = false;
                                    }
                                } catch (Throwable th) {
/* 44 */                            throw th;
                                }
                            }
                        }
                    };
/* 57 */            this.component1 = sensorManager;
/* 59 */            this.getRevenue = handler;
/* 61 */            this.component4 = executorService;
                }

                private List<Map<String, Object>> areAllFieldsValid() {
                    synchronized (this.getMonetizationNetwork) {
                        try {
/* 10 */                    if (!this.areAllFieldsValid.isEmpty() && this.copy) {
/* 22 */                        Iterator<AFj1nSDK> it = this.areAllFieldsValid.values().iterator();
/* 30 */                        while (it.hasNext()) {
/* 41 */                            it.next().AFAdRevenueData(this.component3, false);
                                }
                            }
/* 53 */                    if (this.component3.isEmpty()) {
/* 59 */                        return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                            }
/* 72 */                    return new CopyOnWriteArrayList(this.component3.values());
                        } catch (Throwable th) {
/* 78 */                    throw th;
                        }
                    }
                }

                private List<Map<String, Object>> component1() {
                    synchronized (this.getMonetizationNetwork) {
                        try {
/* 10 */                    Iterator<AFj1nSDK> it = this.areAllFieldsValid.values().iterator();
/* 18 */                    while (it.hasNext()) {
/* 29 */                        it.next().AFAdRevenueData(this.component3, true);
                            }
/* 41 */                    if (this.component3.isEmpty()) {
/* 47 */                        return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                            }
/* 60 */                    return new CopyOnWriteArrayList(this.component3.values());
                        } catch (Throwable th) {
/* 66 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void component2() {
                    try {
/* 17 */                for (Sensor sensor : this.component1.getSensorList(-1)) {
/* 33 */                    if (getCurrencyIso4217Code(sensor.getType())) {
/* 39 */                        AFj1nSDK aFj1nSDK = new AFj1nSDK(sensor, this.component4);
/* 48 */                        if (!this.areAllFieldsValid.containsKey(aFj1nSDK)) {
/* 52 */                            this.areAllFieldsValid.put(aFj1nSDK, aFj1nSDK);
                                }
/* 70 */                        this.component1.registerListener(this.areAllFieldsValid.get(aFj1nSDK), sensor, 1, this.getRevenue);
                            }
                        }
                    } catch (Throwable th) {
/* 76 */                AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
                    }
/* 79 */            this.copy = true;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void component3() {
                    synchronized (this.getMonetizationNetwork) {
/* 12 */                this.getRevenue.post(new RunnableC0306r(this, 0));
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void component4() {
                    try {
/* 7 */                 if (!this.areAllFieldsValid.isEmpty()) {
/* 23 */                    for (AFj1nSDK aFj1nSDK : this.areAllFieldsValid.values()) {
/* 33 */                        this.component1.unregisterListener(aFj1nSDK);
/* 39 */                        aFj1nSDK.AFAdRevenueData(this.component3, true);
                            }
                        }
                    } catch (Throwable th) {
/* 46 */                AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
                    }
/* 50 */            this.copy = false;
                }

                private static boolean getCurrencyIso4217Code(int i) {
                    return i >= 0 && component2.get(i);
                }

                @Override // com.appsflyer.internal.AFj1lSDK
                public final void AFAdRevenueData() {
/* 5 */             this.getRevenue.post(this.equals);
/* 12 */            this.getRevenue.post(this.getMediationNetwork);
                }

                @Override // com.appsflyer.internal.AFj1lSDK
                public final Map<String, Object> getMediationNetwork() {
/* 3 */             ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
/* 6 */             List<Map<String, Object>> listAreAllFieldsValid = areAllFieldsValid();
/* 16 */            if (!listAreAllFieldsValid.isEmpty()) {
/* 18 */                concurrentHashMap.put("sensors", listAreAllFieldsValid);
/* 21 */                return concurrentHashMap;
                    }
/* 22 */            List<Map<String, Object>> listComponent1 = component1();
/* 30 */            if (!listComponent1.isEmpty()) {
/* 32 */                concurrentHashMap.put("sensors", listComponent1);
                    }
/* 35 */            return concurrentHashMap;
                }

                @Override // com.appsflyer.internal.AFj1lSDK
                public final synchronized void getMonetizationNetwork() {
/* 6 */             this.getRevenue.post(this.equals);
                }

                public final void getRevenue() {
/* 9 */             this.getRevenue.post(new RunnableC0306r(this, 2));
                }

/* 14 */        public final void getCurrencyIso4217Code() {
/* 15 */            this.getRevenue.post(new RunnableC0306r(this, 0));
                }

/* 63 */        public AFj1pSDK(Context context, ExecutorService executorService) {
/* 64 */            SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
/* 65 */            HandlerThread handlerThread = new HandlerThread("internal");
/* 66 */            handlerThread.start();
/* 68 */            this(sensorManager, new Handler(handlerThread.getLooper()), executorService);
                }
            }
