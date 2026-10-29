            package io.flutter.util;

            import android.os.Build;
            import android.os.Handler;
            import android.os.Looper;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class HandlerCompat {
                public static Handler createAsyncHandler(Looper looper) {
                    return Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(looper) : new Handler(looper);
                }
            }
