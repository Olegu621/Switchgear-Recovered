            package com.appsflyer.internal;

            import com.appsflyer.migration.AppsFlyerMigrationHelper;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFh1sSDK {
                public static final boolean getMonetizationNetwork() {
                    try {
/* 1 */                 AppsFlyerMigrationHelper appsFlyerMigrationHelper = AppsFlyerMigrationHelper.INSTANCE;
/* 3 */                 return true;
                    } catch (Throwable unused) {
/* 5 */                 return false;
                    }
                }
            }
