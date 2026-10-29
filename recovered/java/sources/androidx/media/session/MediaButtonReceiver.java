            package androidx.media.session;

            import android.content.BroadcastReceiver;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.content.pm.ResolveInfo;
            import android.content.pm.ServiceInfo;
            import android.os.Build;
            import android.support.v4.media.MediaBrowserCompat;
            import java.util.List;
            import java.util.Objects;
            import p000.AbstractC0886en;
            import p000.f42;
            import p000.ue1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class MediaButtonReceiver extends BroadcastReceiver {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int f1553a = 0;

                /* JADX INFO: renamed from: a */
                public static ComponentName m758a(Context context, String str) {
/* 1 */             PackageManager packageManager = context.getPackageManager();
/* 7 */             Intent intent = new Intent(str);
/* 14 */            intent.setPackage(context.getPackageName());
/* 18 */            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
/* 27 */            if (listQueryIntentServices.size() == 1) {
/* 37 */                ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
/* 43 */                return new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    }
/* 51 */            if (listQueryIntentServices.isEmpty()) {
/* 53 */                return null;
                    }
/* 61 */            StringBuilder sbM3513q = AbstractC0886en.m3513q("Expected 1 service that handles ", str, ", found ");
/* 69 */            sbM3513q.append(listQueryIntentServices.size());
/* 79 */            throw new IllegalStateException(sbM3513q.toString());
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
/* 1 */             if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
/* 86 */                Objects.toString(intent);
/* 89 */                return;
                    }
/* 24 */            ComponentName componentNameM758a = m758a(context, "android.intent.action.MEDIA_BUTTON");
/* 28 */            if (componentNameM758a != null) {
/* 30 */                intent.setComponent(componentNameM758a);
/* 37 */                if (Build.VERSION.SDK_INT >= 26) {
/* 1 */                     context.startForegroundService(intent);
/* 42 */                    return;
                        } else {
/* 43 */                    context.startService(intent);
/* 46 */                    return;
                        }
                    }
/* 49 */            ComponentName componentNameM758a2 = m758a(context, "android.media.browse.MediaBrowserService");
/* 53 */            if (componentNameM758a2 == null) {
/* 82 */                f42.m3656l("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
/* 85 */                return;
                    }
/* 55 */            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
/* 59 */            Context applicationContext = context.getApplicationContext();
/* 65 */            ue1 ue1Var = new ue1(applicationContext, intent, pendingResultGoAsync);
/* 71 */            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, componentNameM758a2, ue1Var, null);
/* 74 */            ue1Var.f17488d = mediaBrowserCompat;
/* 76 */            mediaBrowserCompat.connect();
                }
            }
