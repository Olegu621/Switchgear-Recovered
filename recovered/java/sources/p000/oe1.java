            package p000;

            import android.content.Context;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Messenger;
            import android.service.media.MediaBrowserService;
            import android.support.v4.media.session.MediaSessionCompat;
            import androidx.media.MediaBrowserServiceCompat;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class oe1 extends MediaBrowserService {

                /* JADX INFO: renamed from: a */
                public final le1 f14721a;

                public oe1(Context context, le1 le1Var) {
/* 4 */             attachBaseContext(context);
/* 7 */             this.f14721a = le1Var;
                }

                @Override // android.service.media.MediaBrowserService
                public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
/* 1 */             MediaSessionCompat.ensureClassLoader(bundle);
/* 11 */            Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
/* 14 */            le1 le1Var = this.f14721a;
/* 16 */            MediaBrowserServiceCompat mediaBrowserServiceCompat = le1Var.f12715d;
/* 18 */            if (bundle2 != null && bundle2.getInt("extra_client_version", 0) != 0) {
/* 29 */                bundle2.remove("extra_client_version");
/* 37 */                le1Var.f12714c = new Messenger((Handler) null);
/* 41 */                Bundle bundle3 = new Bundle();
/* 47 */                bundle3.putInt("extra_service_version", 2);
/* 58 */                bundle3.putBinder("extra_messenger", le1Var.f12714c.getBinder());
/* 63 */                le1Var.f12712a.add(bundle3);
                    }
/* 68 */            new HashMap();
/* 75 */            if (Build.VERSION.SDK_INT >= 28) {
/* 78 */                sk0.m8530h(-1, i, str);
                    }
/* 81 */            mediaBrowserServiceCompat.m756a();
/* 4 */             return null;
                }

                @Override // android.service.media.MediaBrowserService
                public final void onLoadChildren(String str, MediaBrowserService.Result result) {
/* 1 */             le1 le1Var = this.f14721a;
/* 3 */             le1Var.getClass();
/* 8 */             le1Var.f12715d.m757b();
                }

                @Override // android.service.media.MediaBrowserService
                public final void onLoadItem(String str, MediaBrowserService.Result result) {
/* 4 */             fs0 fs0Var = new fs0(result, 6);
/* 9 */             MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f14721a.f13206e;
/* 16 */            ((MediaBrowserService.Result) fs0Var.f8339b).sendResult(null);
                }
            }
