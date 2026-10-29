            package com.appsflyer.lvl;

            import android.content.Context;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AppsFlyerLVL {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface resultListener {
                    void onLvlFailure(Exception exc);

                    void onLvlResult(String str, String str2);
                }

                public static void checkLicense(long j, Context context, resultListener resultlistener) {
                    try {
/* 6 */                 new AppsFlyerLVLImpl(j, context, resultlistener).getLVLResult();
                    } catch (Exception e) {
/* 11 */                resultlistener.onLvlFailure(e);
                    }
                }
            }
