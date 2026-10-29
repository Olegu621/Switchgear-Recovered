            package com.appsflyer.internal;

            import android.content.Intent;
            import android.net.Uri;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFb1qSDK {
                /* JADX INFO: renamed from: k_ */
                public static Uri m1775k_(Intent intent) {
/* 2 */             if (intent == null) {
/* 1 */                 return null;
                    }
/* 7 */             AFj1gSDK aFj1gSDK = new AFj1gSDK(intent);
/* 16 */            Uri uri = (Uri) aFj1gSDK.m1825H_("android.intent.extra.REFERRER");
/* 18 */            if (uri != null) {
/* 20 */                return uri;
                    }
/* 23 */            String strAFAdRevenueData = aFj1gSDK.AFAdRevenueData("android.intent.extra.REFERRER_NAME");
/* 27 */            if (strAFAdRevenueData != null) {
/* 29 */                return Uri.parse(strAFAdRevenueData);
                    }
/* 1 */             return null;
                }
            }
