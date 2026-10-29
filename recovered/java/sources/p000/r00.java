            package p000;

            import android.content.BroadcastReceiver;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.os.Handler;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class r00 {
                /* JADX INFO: renamed from: a */
                public static Intent m8035a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
                    return ((i & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1) : context.registerReceiver(broadcastReceiver, intentFilter, v00.obtainAndCheckReceiverPermission(context), handler);
                }

                /* JADX INFO: renamed from: b */
                public static ComponentName m8036b(Context context, Intent intent) {
/* 1 */             return context.startForegroundService(intent);
                }
            }
