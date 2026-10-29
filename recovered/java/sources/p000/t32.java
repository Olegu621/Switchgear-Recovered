            package p000;

            import android.app.Activity;
            import android.app.ActivityOptions;
            import android.app.PendingIntent;
            import android.content.IntentSender;
            import android.os.Build;
            import android.os.Bundle;
            import com.google.android.gms.common.api.Status;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class t32 extends C1020i9 {
                /* JADX INFO: renamed from: a */
                public final void m8685a(Activity activity, int i) throws IntentSender.SendIntentException {
/* 1 */             Status status = getStatus();
/* 7 */             if (status.f3447c != null) {
/* 29 */                Bundle bundle = Build.VERSION.SDK_INT >= 34 ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null;
/* 31 */                PendingIntent pendingIntent = status.f3447c;
/* 33 */                kb1.m6061n(pendingIntent);
/* 46 */                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0, bundle);
                    }
                }
            }
