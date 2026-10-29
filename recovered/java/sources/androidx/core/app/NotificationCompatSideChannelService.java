            package androidx.core.app;

            import android.app.Service;
            import android.content.Intent;
            import android.os.IBinder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class NotificationCompatSideChannelService extends Service {
                @Override // android.app.Service
                public final IBinder onBind(Intent intent) {
/* 7 */             intent.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
/* 10 */            return null;
                }
            }
