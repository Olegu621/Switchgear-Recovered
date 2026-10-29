            package com.google.android.gms.cloudmessaging;

            import android.app.PendingIntent;
            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.os.Bundle;
            import com.google.android.gms.internal.cloudmessaging.zze;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.ref.SoftReference;
            import java.util.Objects;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import p000.ft0;
            import p000.hl1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class CloudMessagingReceiver extends BroadcastReceiver {

                /* JADX INFO: renamed from: a */
                public static SoftReference f3411a;

                /* JADX INFO: renamed from: b */
                public static SoftReference f3412b;

                /* JADX INFO: renamed from: a */
                public abstract int mo2000a(Context context, CloudMessage cloudMessage);

                /* JADX INFO: renamed from: b */
                public void mo2001b(Bundle bundle) {
                }

                /* JADX INFO: renamed from: c */
                public final int m2002c(Context context, Intent intent) {
/* 7 */             PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
/* 11 */            if (pendingIntent != null) {
                        try {
/* 13 */                    pendingIntent.send();
                        } catch (PendingIntent.CanceledException unused) {
/* 19 */                    AbstractC1245n0.m4876d("CloudMessagingReceiver", "Notification pending intent canceled");
                        }
                    }
/* 22 */            Bundle extras = intent.getExtras();
/* 26 */            if (extras != null) {
/* 28 */                extras.remove("pending_intent");
                    } else {
/* 34 */                extras = new Bundle();
                    }
/* 47 */            if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
/* 49 */                mo2001b(extras);
/* 52 */                return -1;
                    }
/* 56 */            AbstractC1245n0.m4876d("CloudMessagingReceiver", "Unknown notification action");
/* 59 */            return 500;
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    ExecutorService executorService;
/* 1 */             if (intent == null) {
/* 3 */                 return;
                    }
/* 4 */             boolean zIsOrderedBroadcast = isOrderedBroadcast();
/* 8 */             BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                    synchronized (CloudMessagingReceiver.class) {
                        try {
/* 15 */                    SoftReference softReference = f3411a;
/* 29 */                    ExecutorService executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
/* 30 */                    if (executorServiceUnconfigurableExecutorService == null) {
/* 32 */                        zze.zza();
/* 46 */                        executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new hl1("firebase-iid-executor")));
/* 55 */                        f3411a = new SoftReference(executorServiceUnconfigurableExecutorService);
                            }
/* 57 */                    executorService = executorServiceUnconfigurableExecutorService;
                        } catch (Throwable th) {
/* 72 */                    throw th;
                        }
                    }
/* 67 */            executorService.execute(new ft0(this, intent, context, zIsOrderedBroadcast, pendingResultGoAsync));
                }
            }
