            package com.appsflyer.internal;

            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import androidx.core.app.NotificationCompat;
            import com.appsflyer.AFLogger;
            import com.google.firebase.analytics.FirebaseAnalytics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFg1wSDK implements AFg1uSDK {
                private static IntentFilter AFAdRevenueData = new IntentFilter("android.intent.action.BATTERY_CHANGED");

                @Override // com.appsflyer.internal.AFg1uSDK
                public final AFg1uSDK.AFa1zSDK getCurrencyIso4217Code(Context context) {
/* 1 */             String str = null;
/* 2 */             float f = 0.0f;
                    try {
/* 5 */                 Intent intentRegisterReceiver = context.registerReceiver(null, AFAdRevenueData);
/* 9 */                 if (intentRegisterReceiver != null) {
/* 19 */                    if (2 == intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1)) {
/* 23 */                        int intExtra = intentRegisterReceiver.getIntExtra("plugged", -1);
/* 28 */                        if (intExtra == 1) {
/* 46 */                            str = "ac";
                                } else if (intExtra != 2) {
/* 40 */                            str = intExtra != 4 ? "other" : "wireless";
                                } else {
/* 43 */                            str = "usb";
                                }
                            } else {
/* 49 */                        str = "no";
                            }
/* 53 */                    int intExtra2 = intentRegisterReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
/* 59 */                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
/* 63 */                    if (-1 != intExtra2 && -1 != intExtra3) {
/* 72 */                        f = (intExtra2 * 100.0f) / intExtra3;
                            }
                        }
                    } catch (Throwable th) {
/* 77 */                AFLogger.afErrorLogForExcManagerOnly("Device that failed to register receiver", th);
                    }
/* 82 */            return new AFg1uSDK.AFa1zSDK(f, str);
                }
            }
