            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            import java.util.ArrayList;
            import java.util.Locale;
            import java.util.regex.Pattern;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFb1tSDK {
                public final String[] AFAdRevenueData;

                public AFb1tSDK(String... strArr) {
/* 5 */             if (strArr == null || strArr.length == 0) {
/* 104 */               this.AFAdRevenueData = null;
/* 106 */               return;
                    }
/* 13 */            Pattern patternCompile = Pattern.compile("[\\w]{1,45}");
/* 19 */            ArrayList arrayList = new ArrayList();
/* 25 */            for (String str : strArr) {
/* 29 */                if (str == null || !patternCompile.matcher(str).matches()) {
/* 63 */                    AFLogger.afWarnLog("Invalid partner name: ".concat(String.valueOf(str)));
                        } else {
/* 49 */                    arrayList.add(str.toLowerCase(Locale.getDefault()));
                        }
                    }
/* 75 */            if (arrayList.contains("all")) {
/* 81 */                this.AFAdRevenueData = new String[]{"all"};
                    } else if (arrayList.isEmpty()) {
/* 101 */               this.AFAdRevenueData = null;
                    } else {
/* 98 */                this.AFAdRevenueData = (String[]) arrayList.toArray(new String[0]);
                    }
                }
            }
