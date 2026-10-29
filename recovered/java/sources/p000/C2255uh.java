            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import io.flutter.plugin.common.EventChannel;
            import java.util.Map;
            
            /* JADX INFO: renamed from: uh */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2255uh implements EventChannel.StreamHandler {

                /* JADX INFO: renamed from: a */
                public EventChannel.EventSink f17526a;

                /* JADX INFO: renamed from: a */
                public final void m9012a(Map map) {
/* 16 */            new Handler(Looper.getMainLooper()).post(new RunnableC1784j8(2, this, map));
                }

                @Override // io.flutter.plugin.common.EventChannel.StreamHandler
                public final void onCancel(Object obj) {
/* 2 */             this.f17526a = null;
                }

                @Override // io.flutter.plugin.common.EventChannel.StreamHandler
                public final void onListen(Object obj, EventChannel.EventSink eventSink) {
/* 1 */             this.f17526a = eventSink;
                }
            }
