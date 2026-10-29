            package com.appsflyer.internal;

            import android.content.SharedPreferences;
            import com.appsflyer.AFLogger;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function0;
            import p000.AbstractC0886en;
            import p000.b51;
            import p000.p51;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 19 */    public final class AFc1pSDK implements AFc1qSDK {
                private final p51 getMediationNetwork;
                private final AFc1gSDK<SharedPreferences> getMonetizationNetwork;

                /* JADX INFO: renamed from: com.appsflyer.internal.AFc1pSDK$4 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m6176d2 = {"Landroid/content/SharedPreferences;", "m_", "()Landroid/content/SharedPreferences;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02484 extends b51 implements Function0<SharedPreferences> {
                    public C02484() {
/* 4 */                 super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: m_, reason: merged with bridge method [inline-methods] */
                    public final SharedPreferences invoke() {
/* 13 */                return (SharedPreferences) AFc1pSDK.this.getMonetizationNetwork.getMonetizationNetwork.invoke();
                    }
                }

                public AFc1pSDK(AFc1gSDK<SharedPreferences> aFc1gSDK) {
/* 1 */             aFc1gSDK.getClass();
/* 7 */             this.getMonetizationNetwork = aFc1gSDK;
/* 18 */            this.getMediationNetwork = r51.m8065b(new C02484());
                }

                @Override // com.appsflyer.internal.AFc1qSDK
                public final void AFAdRevenueData(String str, boolean z) {
/* 17 */            ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putBoolean(str, z).apply();
                }

                @Override // com.appsflyer.internal.AFc1qSDK
                public final boolean getMediationNetwork(String str, boolean z) {
                    try {
/* 9 */                 return ((SharedPreferences) this.getMediationNetwork.getValue()).getBoolean(str, z);
                    } catch (ClassCastException e) {
/* 34 */                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, AbstractC0886en.m3507k("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
/* 37 */                return z;
                    }
                }

                @Override // com.appsflyer.internal.AFc1qSDK
                public final String getMonetizationNetwork(String str, String str2) {
                    try {
/* 9 */                 return ((SharedPreferences) this.getMediationNetwork.getValue()).getString(str, str2);
                    } catch (ClassCastException e) {
/* 34 */                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, AbstractC0886en.m3507k("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
/* 37 */                return str2;
                    }
                }

                @Override // com.appsflyer.internal.AFc1qSDK
                public final int getRevenue(String str, int i) {
                    try {
/* 9 */                 return ((SharedPreferences) this.getMediationNetwork.getValue()).getInt(str, i);
                    } catch (ClassCastException e) {
/* 34 */                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, AbstractC0886en.m3507k("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
/* 37 */                return i;
                    }
                }

                @Override // com.appsflyer.internal.AFc1qSDK
/* 20 */        public final void AFAdRevenueData(String str, long j) {
/* 22 */            ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putLong(str, j).apply();
                }

                @Override // com.appsflyer.internal.AFc1qSDK
/* 22 */        public final void AFAdRevenueData(String str) {
/* 24 */            ((SharedPreferences) this.getMediationNetwork.getValue()).edit().remove(str).apply();
                }

                @Override // com.appsflyer.internal.AFc1qSDK
/* 37 */        public final long getMonetizationNetwork(String str, long j) {
                    try {
/* 39 */                return ((SharedPreferences) this.getMediationNetwork.getValue()).getLong(str, j);
                    } catch (ClassCastException e) {
/* 42 */                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, AbstractC0886en.m3507k("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
                        return j;
                    }
                }

                @Override // com.appsflyer.internal.AFc1qSDK
/* 37 */        public final void getRevenue(String str, String str2) {
/* 39 */            ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putString(str, str2).apply();
                }

                @Override // com.appsflyer.internal.AFc1qSDK
/* 38 */        public final void getMediationNetwork(String str, int i) {
/* 40 */            ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putInt(str, i).apply();
                }

                @Override // com.appsflyer.internal.AFc1qSDK
/* 42 */        public final boolean getMonetizationNetwork(String str) {
/* 44 */            return ((SharedPreferences) this.getMediationNetwork.getValue()).contains(str);
                }
            }
