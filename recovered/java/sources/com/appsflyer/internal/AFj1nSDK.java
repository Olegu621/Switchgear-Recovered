            package com.appsflyer.internal;

            import android.hardware.Sensor;
            import android.hardware.SensorEvent;
            import android.hardware.SensorEventListener;
            import android.os.Looper;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 31 */    public final class AFj1nSDK implements SensorEventListener {
                private final String AFAdRevenueData;
                private long component1;
                private final Executor component3;
                private final int getCurrencyIso4217Code;
                private final int getMediationNetwork;
                private final String getMonetizationNetwork;
                private double getRevenue;
                private final float[][] areAllFieldsValid = new float[2][];
                private final long[] component4 = new long[2];

                public AFj1nSDK(Sensor sensor, ExecutorService executorService) {
/* 13 */            int type = sensor.getType();
/* 17 */            this.getMediationNetwork = type;
/* 19 */            String name = sensor.getName();
/* 23 */            String str = HttpUrl.FRAGMENT_ENCODE_SET;
/* 27 */            name = name == null ? HttpUrl.FRAGMENT_ENCODE_SET : name;
/* 28 */            this.AFAdRevenueData = name;
/* 30 */            String vendor = sensor.getVendor();
/* 34 */            str = vendor != null ? vendor : str;
/* 38 */            this.getMonetizationNetwork = str;
/* 56 */            this.getCurrencyIso4217Code = str.hashCode() + ((name.hashCode() + ((type + 31) * 31)) * 31);
/* 58 */            this.component3 = executorService;
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX INFO: renamed from: F_, reason: merged with bridge method [inline-methods] */
                public void m1836G_(SensorEvent sensorEvent) {
/* 1 */             long j = sensorEvent.timestamp;
/* 3 */             float[] fArr = sensorEvent.values;
/* 5 */             long jCurrentTimeMillis = System.currentTimeMillis();
/* 9 */             float[][] fArr2 = this.areAllFieldsValid;
/* 12 */            float[] fArr3 = fArr2[0];
/* 14 */            if (fArr3 == null) {
/* 21 */                fArr2[0] = Arrays.copyOf(fArr, fArr.length);
/* 25 */                this.component4[0] = jCurrentTimeMillis;
/* 27 */                return;
                    }
/* 29 */            float[] fArr4 = fArr2[1];
/* 31 */            if (fArr4 == null) {
/* 34 */                float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
/* 40 */                this.areAllFieldsValid[1] = fArrCopyOf;
/* 44 */                this.component4[1] = jCurrentTimeMillis;
/* 50 */                this.getRevenue = getRevenue(fArr3, fArrCopyOf);
/* 52 */                return;
                    }
/* 62 */            if (50000000 <= j - this.component1) {
/* 64 */                this.component1 = j;
/* 70 */                if (Arrays.equals(fArr4, fArr)) {
/* 74 */                    this.component4[1] = jCurrentTimeMillis;
/* 76 */                    return;
                        }
/* 77 */                double revenue = getRevenue(fArr3, fArr);
/* 85 */                if (revenue > this.getRevenue) {
/* 94 */                    this.areAllFieldsValid[1] = Arrays.copyOf(fArr, fArr.length);
/* 98 */                    this.component4[1] = jCurrentTimeMillis;
/* 100 */                   this.getRevenue = revenue;
                        }
                    }
                }

                private boolean getCurrencyIso4217Code(int i, String str, String str2) {
                    return this.getMediationNetwork == i && this.AFAdRevenueData.equals(str) && this.getMonetizationNetwork.equals(str2);
                }

                private Map<String, Object> getMediationNetwork() {
/* 4 */             ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
/* 15 */            concurrentHashMap.put("sT", Integer.valueOf(this.getMediationNetwork));
/* 22 */            concurrentHashMap.put("sN", this.AFAdRevenueData);
/* 29 */            concurrentHashMap.put("sV", this.getMonetizationNetwork);
/* 35 */            float[] fArr = this.areAllFieldsValid[0];
/* 37 */            if (fArr != null) {
/* 45 */                concurrentHashMap.put("sVS", getRevenue(fArr));
                    }
/* 51 */            float[] fArr2 = this.areAllFieldsValid[1];
/* 53 */            if (fArr2 != null) {
/* 61 */                concurrentHashMap.put("sVE", getRevenue(fArr2));
                    }
/* 64 */            return concurrentHashMap;
                }

                private boolean getMonetizationNetwork() {
                    return this.areAllFieldsValid[0] != null;
                }

                private static double getRevenue(float[] fArr, float[] fArr2) {
/* 3 */             int iMin = Math.min(fArr.length, fArr2.length);
/* 7 */             double dPow = 0.0d;
/* 10 */            for (int i = 0; i < iMin; i++) {
/* 24 */                dPow += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
                    }
/* 28 */            return Math.sqrt(dPow);
                }

                public final void AFAdRevenueData(Map<AFj1nSDK, Map<String, Object>> map, boolean z) {
/* 5 */             if (!getMonetizationNetwork()) {
/* 56 */                if (map.containsKey(this)) {
/* 65 */                    return;
                        }
/* 62 */                map.put(this, getMediationNetwork());
/* 65 */                return;
                    }
/* 11 */            map.put(this, getMediationNetwork());
/* 14 */            if (z) {
/* 18 */                int length = this.areAllFieldsValid.length;
/* 21 */                for (int i = 0; i < length; i++) {
/* 26 */                    this.areAllFieldsValid[i] = null;
                        }
/* 33 */                int length2 = this.component4.length;
/* 36 */                for (int i2 = 0; i2 < length2; i2++) {
/* 40 */                    this.component4[i2] = 0;
                        }
/* 47 */                this.getRevenue = 0.0d;
/* 49 */                this.component1 = 0L;
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (!(obj instanceof AFj1nSDK)) {
/* 22 */                return false;
                    }
/* 9 */             AFj1nSDK aFj1nSDK = (AFj1nSDK) obj;
/* 17 */            return getCurrencyIso4217Code(aFj1nSDK.getMediationNetwork, aFj1nSDK.AFAdRevenueData, aFj1nSDK.getMonetizationNetwork);
                }

                public final int hashCode() {
/* 1 */             return this.getCurrencyIso4217Code;
                }

                @Override // android.hardware.SensorEventListener
                public final void onAccuracyChanged(Sensor sensor, int i) {
                }

                @Override // android.hardware.SensorEventListener
                public final void onSensorChanged(SensorEvent sensorEvent) {
/* 9 */             if (Looper.myLooper() == Looper.getMainLooper()) {
/* 19 */                this.component3.execute(new RunnableC0295g(2, this, sensorEvent));
                    } else {
/* 23 */                m1836G_(sensorEvent);
                    }
                }

/* 32 */        private static List<Float> getRevenue(float[] fArr) {
/* 33 */            ArrayList arrayList = new ArrayList(fArr.length);
                    for (float f : fArr) {
/* 35 */                arrayList.add(Float.valueOf(f));
                    }
                    return arrayList;
                }
            }
