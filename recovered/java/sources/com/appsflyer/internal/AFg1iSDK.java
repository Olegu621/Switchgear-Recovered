            package com.appsflyer.internal;

            import android.content.Context;
            import android.os.Build;
            import com.appsflyer.AFLogger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFg1iSDK {
                public static boolean getMonetizationNetwork(Context context) {
/* 5 */             if (Build.VERSION.SDK_INT >= 26) {
/* 1 */                 return context.getPackageManager().isInstantApp();
                    }
                    try {
/* 23 */                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
/* 16 */                return true;
                    } catch (ClassNotFoundException e) {
/* 30 */                AFLogger.afErrorLogForExcManagerOnly("InstantAppsRuntime not found", e, true);
/* 33 */                return false;
                    }
                }
            }
