            package com.appsflyer.internal;

            import android.content.Context;
            import android.content.res.Resources;
            import android.util.DisplayMetrics;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFg1qSDK implements AFg1vSDK {
                private Map<String, String> getMonetizationNetwork = new LinkedHashMap();

                @Override // com.appsflyer.internal.AFg1vSDK
                public final Map<String, String> getMediationNetwork(Context context) {
/* 1 */             context.getClass();
/* 10 */            if (this.getMonetizationNetwork.isEmpty()) {
/* 12 */                Resources resources = context.getResources();
/* 16 */                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
/* 26 */                int i = resources.getConfiguration().screenLayout & 15;
/* 38 */                this.getMonetizationNetwork.put("xdp", String.valueOf(displayMetrics.xdpi));
/* 51 */                this.getMonetizationNetwork.put("ydp", String.valueOf(displayMetrics.ydpi));
/* 64 */                this.getMonetizationNetwork.put("x_px", String.valueOf(displayMetrics.widthPixels));
/* 77 */                this.getMonetizationNetwork.put("y_px", String.valueOf(displayMetrics.heightPixels));
/* 90 */                this.getMonetizationNetwork.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
/* 101 */               this.getMonetizationNetwork.put("size", String.valueOf(i));
                    }
/* 104 */           return this.getMonetizationNetwork;
                }
            }
