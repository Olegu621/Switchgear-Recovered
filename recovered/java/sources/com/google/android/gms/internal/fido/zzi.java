            package com.google.android.gms.internal.fido;

            import android.app.Activity;
            import android.app.PendingIntent;
            import android.content.IntentSender;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public final class zzi {
                private final PendingIntent zza;

                public zzi(PendingIntent pendingIntent) {
/* 4 */             this.zza = pendingIntent;
                }

                public final boolean hasPendingIntent() {
                    return this.zza != null;
                }

                public final void launchPendingIntent(Activity activity, int i) throws IntentSender.SendIntentException {
/* 1 */             PendingIntent pendingIntent = this.zza;
/* 3 */             if (pendingIntent != null) {
/* 15 */                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
                    } else {
/* 21 */                f42.m3656l("No PendingIntent available");
                    }
                }
            }
