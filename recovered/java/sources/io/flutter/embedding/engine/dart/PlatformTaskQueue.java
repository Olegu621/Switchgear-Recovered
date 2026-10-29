            package io.flutter.embedding.engine.dart;

            import android.os.Handler;
            import android.os.Looper;
            import io.flutter.util.HandlerCompat;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PlatformTaskQueue implements DartMessenger.DartMessengerTaskQueue {
                private final Handler handler = HandlerCompat.createAsyncHandler(Looper.getMainLooper());

                @Override // io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue
                public void dispatch(Runnable runnable) {
/* 3 */             this.handler.post(runnable);
                }
            }
