            package io.flutter.embedding.android;

            import com.google.android.play.core.splitcompat.SplitCompatApplication;
            import io.flutter.FlutterInjector;
            import io.flutter.embedding.engine.deferredcomponents.PlayStoreDeferredComponentManager;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FlutterPlayStoreSplitApplication extends SplitCompatApplication {
                /* JADX WARN: Multi-variable type inference failed */
                public void onCreate() {
/* 1 */             super.onCreate();
/* 23 */            FlutterInjector.setInstance(new FlutterInjector.Builder().setDeferredComponentManager(new PlayStoreDeferredComponentManager(this, null)).build());
                }
            }
