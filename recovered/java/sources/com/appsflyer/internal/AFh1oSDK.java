            package com.appsflyer.internal;

            import android.content.Intent;
            import android.graphics.Color;
            import android.net.Uri;
            import android.os.SystemClock;
            import android.view.KeyEvent;
            import android.view.ViewConfiguration;
            import android.widget.ExpandableListView;
            import com.appsflyer.migration.internal.MigrationDataProvider;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.Method;
            import java.util.HashMap;
            import java.util.Map;
            import kotlin.Pair;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            import org.json.JSONObject;
            import p000.nc1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 23 */    public final class AFh1oSDK implements AFh1pSDK {
                private Long AFAdRevenueData;
                private boolean component1;
                private boolean component2;
                private JSONObject getCurrencyIso4217Code;
                private Long getMediationNetwork;
                private final AFc1oSDK getMonetizationNetwork;
                private final AFj1sSDK getRevenue;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public /* synthetic */ class AFa1uSDK {
                    public static final /* synthetic */ int[] AFAdRevenueData;

                    static {
/* 6 */                 int[] iArr = new int[AFe1pSDK.values().length];
                        try {
/* 15 */                    iArr[AFe1pSDK.LAUNCH.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 24 */                    iArr[AFe1pSDK.ATTR.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
/* 26 */                AFAdRevenueData = iArr;
                    }
                }

                public AFh1oSDK(AFc1oSDK aFc1oSDK, AFj1sSDK aFj1sSDK) {
/* 1 */             aFc1oSDK.getClass();
/* 4 */             aFj1sSDK.getClass();
/* 10 */            this.getMonetizationNetwork = aFc1oSDK;
/* 12 */            this.getRevenue = aFj1sSDK;
                }

                private final void AFAdRevenueData(String str, AFh1mSDK aFh1mSDK, JSONObject jSONObject) {
/* 3 */             HashMap map = new HashMap();
/* 6 */             map.put(str, jSONObject);
/* 11 */            HashMap map2 = new HashMap();
/* 16 */            map2.put("branch", map);
/* 21 */            HashMap map3 = new HashMap();
/* 26 */            map3.put("external", map2);
/* 29 */            aFh1mSDK.AFAdRevenueData(map3);
/* 32 */            Map<String, Object> map4 = aFh1mSDK.AFAdRevenueData;
/* 34 */            map4.getClass();
/* 37 */            AFe1pSDK aFe1pSDKAFAdRevenueData = aFh1mSDK.AFAdRevenueData();
/* 41 */            aFe1pSDKAFAdRevenueData.getClass();
/* 44 */            getMonetizationNetwork(map4, aFe1pSDKAFAdRevenueData);
                }

                private final JSONObject getCurrencyIso4217Code() {
/* 1 */             long jCurrentTimeMillis = System.currentTimeMillis();
/* 7 */             JSONObject jSONObjectWaitForAttributionData = MigrationDataProvider.waitForAttributionData(3000L);
/* 11 */            if (jSONObjectWaitForAttributionData != null) {
/* 22 */                this.getMediationNetwork = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                    }
/* 24 */            return jSONObjectWaitForAttributionData;
                }

                private final void getMonetizationNetwork(Map<String, Object> map, AFe1pSDK aFe1pSDK) {
                    Long l;
/* 7 */             int i = AFa1uSDK.AFAdRevenueData[aFe1pSDK.ordinal()];
/* 10 */            if (i != 1) {
/* 17 */                l = i != 2 ? null : this.getMediationNetwork;
                    } else {
/* 20 */                l = this.AFAdRevenueData;
                    }
/* 22 */            if (l != null) {
/* 24 */                long jLongValue = l.longValue();
/* 28 */                Map<String, Object> mediationNetwork = AFa1ySDK.getMediationNetwork(map);
/* 32 */                mediationNetwork.getClass();
/* 52 */                mediationNetwork.put("migration", nc1.m6963d(new Pair("delay", Long.valueOf(jLongValue))));
                    }
                }

                @Override // com.appsflyer.internal.AFh1pSDK
                public final void getMediationNetwork(AFh1mSDK aFh1mSDK) {
/* 1 */             aFh1mSDK.getClass();
/* 4 */             JSONObject jSONObject = this.getCurrencyIso4217Code;
/* 8 */             if (jSONObject != null) {
/* 10 */                jSONObject.getClass();
/* 13 */                AFAdRevenueData("attr", aFh1mSDK, jSONObject);
                    } else {
/* 17 */                JSONObject currencyIso4217Code = getCurrencyIso4217Code();
/* 21 */                if (currencyIso4217Code != null) {
/* 23 */                    AFAdRevenueData("attr", aFh1mSDK, currencyIso4217Code);
                        }
                    }
/* 26 */            MigrationDataProvider.clear();
                }

                @Override // com.appsflyer.internal.AFh1pSDK
                public final boolean getRevenue() {
/* 1 */             return this.component2;
                }

                @Override // com.appsflyer.internal.AFh1pSDK
                /* JADX INFO: renamed from: u_ */
                public final void mo1809u_(Intent intent, AFa1mSDK aFa1mSDK) throws Throwable {
/* 22 */            intent.getClass();
/* 25 */            aFa1mSDK.getClass();
/* 35 */            if (MigrationDataProvider.waitForDeepLinkingData(0L) != null) {
/* 37 */                this.component1 = true;
/* 39 */                return;
                    }
/* 40 */            Uri data = intent.getData();
/* 44 */            if (data == null) {
/* 46 */                return;
                    }
                    try {
/* 48 */                Object[] objArr = {data, aFa1mSDK};
/* 55 */                Map map = AFa1hSDK.f3072d;
/* 57 */                Object declaredConstructor = map.get(862139947);
/* 61 */                if (declaredConstructor == null) {
/* 101 */                   declaredConstructor = ((Class) AFa1hSDK.getRevenue((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (62049 - ExpandableListView.getPackedPositionGroup(0L)), 37 - (ViewConfiguration.getTouchSlop() >> 8))).getDeclaredConstructor(Uri.class, AFa1mSDK.class);
/* 105 */                   map.put(862139947, declaredConstructor);
                        }
/* 110 */               Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr);
/* 114 */               Object method = map.get(-180621578);
/* 119 */               if (method == null) {
/* 158 */                   method = ((Class) AFa1hSDK.getRevenue((-1) - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (62050 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36)).getMethod("getMediationNetwork", null);
/* 162 */                   map.put(-180621578, method);
                        }
/* 167 */               Object objInvoke = ((Method) method).invoke(objNewInstance, null);
/* 171 */               Object method2 = map.get(614194017);
/* 175 */               if (method2 == null) {
/* 209 */                   method2 = ((Class) AFa1hSDK.getRevenue(Color.blue(0) + 37, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 52 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).getMethod("AFAdRevenueData", null);
/* 213 */                   map.put(614194017, method2);
                        }
/* 229 */               this.component1 = !((Boolean) ((Method) method2).invoke(objInvoke, null)).booleanValue();
                    } catch (Throwable th) {
/* 233 */               Throwable cause = th.getCause();
/* 237 */               if (cause == null) {
/* 240 */                   throw th;
                        }
/* 239 */               throw cause;
                    }
                }

                @Override // com.appsflyer.internal.AFh1pSDK
/* 24 */        public final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
                    aFh1mSDK.getClass();
/* 25 */            JSONObject attributionData = MigrationDataProvider.getAttributionData();
                    if (attributionData != null) {
/* 26 */                AFAdRevenueData("attr", aFh1mSDK, attributionData);
/* 27 */                this.component2 = true;
                    }
/* 28 */            MigrationDataProvider.clear();
                }

                @Override // com.appsflyer.internal.AFh1pSDK
/* 47 */        public final void AFAdRevenueData() {
/* 48 */            this.component1 = false;
/* 49 */            MigrationDataProvider.clear();
                }

                @Override // com.appsflyer.internal.AFh1pSDK
/* 55 */        public final void getMonetizationNetwork(AFf1rSDK aFf1rSDK, Function0<Unit> function0) {
                    JSONObject currencyIso4217Code;
                    aFf1rSDK.getClass();
                    function0.getClass();
/* 57 */            if (this.getMonetizationNetwork.getMediationNetwork.getRevenue("appsFlyerCount", 0) == 1 && aFf1rSDK.getRevenue == AFe1pSDK.CONVERSION && this.getRevenue.getMediationNetwork() && !getRevenue() && (currencyIso4217Code = getCurrencyIso4217Code()) != null) {
/* 63 */                this.getCurrencyIso4217Code = currencyIso4217Code;
/* 64 */                function0.invoke();
                    }
                }

                @Override // com.appsflyer.internal.AFh1pSDK
/* 64 */        public final boolean getMonetizationNetwork() {
/* 65 */            return this.component1;
                }

                @Override // com.appsflyer.internal.AFh1pSDK
/* 65 */        public final void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
                    aFh1mSDK.getClass();
/* 66 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 67 */            JSONObject jSONObjectWaitForDeepLinkingData = MigrationDataProvider.waitForDeepLinkingData(3000L);
                    if (jSONObjectWaitForDeepLinkingData != null) {
/* 69 */                this.AFAdRevenueData = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
/* 71 */                AFAdRevenueData("dl", aFh1mSDK, jSONObjectWaitForDeepLinkingData);
                    }
/* 72 */            MigrationDataProvider.clear();
                }
            }
