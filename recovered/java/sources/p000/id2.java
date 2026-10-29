            package p000;

            import android.content.Intent;
            import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.plugin.common.PluginRegistry;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class id2 implements PluginRegistry.ActivityResultListener {

                /* JADX INFO: renamed from: a */
                public MethodChannel.Result f9554a;

                /* JADX INFO: renamed from: b */
                public AtomicBoolean f9555b;

                @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener, com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.ActivityResultListener
                public final boolean onActivityResult(int i, int i2, Intent intent) {
                    MethodChannel.Result result;
/* 4 */             if (i != 22643) {
/* 3 */                 return false;
                    }
/* 6 */             String str = SharePlusPendingIntent.f7148a;
/* 15 */            if (this.f9555b.compareAndSet(false, true) && (result = this.f9554a) != null) {
/* 21 */                result.success(str);
/* 25 */                this.f9554a = null;
                    }
/* 10 */            return true;
                }
            }
