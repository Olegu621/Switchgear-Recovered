            package dev.fluttercommunity.plus.share;

            import android.content.BroadcastReceiver;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.os.Build;
            import kotlin.Metadata;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m6176d2 = {"Ldev/fluttercommunity/plus/share/SharePlusPendingIntent;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "share_plus_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final class SharePlusPendingIntent extends BroadcastReceiver {

                /* JADX INFO: renamed from: a */
                public static String f7148a = "";

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
/* 1 */             context.getClass();
/* 4 */             intent.getClass();
/* 26 */            ComponentName componentName = Build.VERSION.SDK_INT >= 33 ? (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT", ComponentName.class) : (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
/* 28 */            if (componentName != null) {
/* 34 */                f7148a = componentName.flattenToString();
                    }
                }
            }
