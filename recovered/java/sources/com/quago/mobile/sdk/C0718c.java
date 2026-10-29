            package com.quago.mobile.sdk;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import com.google.firebase.analytics.FirebaseAnalytics;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0718c extends BroadcastReceiver {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C0752o0 f5366a;

                public C0718c(C0752o0 c0752o0) {
/* 1 */             this.f5366a = c0752o0;
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
/* 3 */             if (intent == null) {
/* 61 */                return;
                    }
                    try {
/* 9 */                 int intExtra = intent.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
/* 15 */                int intExtra2 = intent.getIntExtra("scale", -1);
/* 19 */                C0752o0 c0752o0 = this.f5366a;
/* 21 */                if (c0752o0 == null) {
/* 23 */                    C0740j0 c0740j0 = AbstractC0721d.f5371a;
/* 25 */                    if (c0740j0 != null) {
/* 32 */                        c0740j0.m2613b("enable", "quagoManager is null", new Object[0]);
/* 35 */                        return;
                            }
/* 61 */                    return;
                        }
/* 40 */                float f = intExtra / intExtra2;
/* 43 */                if (c0752o0.f5580a) {
/* 46 */                    C0736i c0736i = c0752o0.f5597r;
/* 50 */                    c0736i.m2604a(c0736i.f5475m, f);
                        }
                    } catch (Exception e) {
/* 54 */                C0740j0 c0740j1 = AbstractC0721d.f5371a;
/* 56 */                if (c0740j1 != null) {
/* 58 */                    c0740j1.m2612a("enable", e);
                        }
                    }
                }
            }
