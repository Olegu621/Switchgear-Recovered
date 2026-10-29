            package com.google.firebase.iid;

            import android.content.Context;
            import android.content.Intent;
            import android.os.Bundle;
            import com.google.android.gms.cloudmessaging.CloudMessage;
            import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
            import com.google.android.gms.tasks.Tasks;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.concurrent.ExecutionException;
            import p000.C0210cb;
            import p000.b40;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
                @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
                /* JADX INFO: renamed from: a */
                public final int mo2000a(Context context, CloudMessage cloudMessage) {
                    try {
/* 19 */                return ((Integer) Tasks.await(new C0210cb(context, 1).m1572F(cloudMessage.f3410a))).intValue();
                    } catch (InterruptedException | ExecutionException e) {
/* 29 */                AbstractC1245n0.m4877e("FirebaseMessaging", "Failed to send message to service.", e);
/* 32 */                return 500;
                    }
                }

                @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
                /* JADX INFO: renamed from: b */
                public final void mo2001b(Bundle bundle) {
/* 8 */             Intent intentPutExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
/* 16 */            if (b40.m1212C(intentPutExtras)) {
/* 24 */                b40.m1241y("_nd", intentPutExtras.getExtras());
                    }
                }
            }
