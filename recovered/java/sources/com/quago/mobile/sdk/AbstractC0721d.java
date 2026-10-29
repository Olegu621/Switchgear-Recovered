            package com.quago.mobile.sdk;

            import android.content.Context;
            import android.content.IntentFilter;
            import java.util.Locale;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 47 */    public abstract class AbstractC0721d {

                /* JADX INFO: renamed from: a */
                public static C0740j0 f5371a;

                /* JADX INFO: renamed from: b */
                public static C0718c f5372b;

                static {
/* 1 */             Locale locale = AbstractC0743k0.f5509a;
/* 10 */            f5371a = new C0740j0("BiometricBattery");
                }

                /* JADX INFO: renamed from: a */
                public static synchronized void m2553a(Context context, C0752o0 c0752o0) {
                    try {
/* 6 */                 if (f5372b != null) {
/* 9 */                     return;
                        }
/* 12 */                if (f5371a == null) {
/* 16 */                    Locale locale = AbstractC0743k0.f5509a;
/* 23 */                    f5371a = new C0740j0("BiometricBattery");
                        }
/* 30 */                C0718c c0718c = new C0718c(c0752o0);
/* 33 */                f5372b = c0718c;
/* 42 */                context.registerReceiver(c0718c, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    } catch (Throwable th) {
/* 48 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: a */
/* 48 */        public static synchronized void m2552a(Context context) {
/* 49 */            C0718c c0718c = f5372b;
                    if (c0718c == null) {
                        return;
                    }
                    try {
/* 50 */                context.unregisterReceiver(c0718c);
                    } catch (Exception e) {
/* 51 */                C0740j0 c0740j0 = f5371a;
                        if (c0740j0 != null) {
                            c0740j0.m2612a("disable", e);
                        }
                    }
/* 52 */            f5371a = null;
/* 53 */            f5372b = null;
                }
            }
