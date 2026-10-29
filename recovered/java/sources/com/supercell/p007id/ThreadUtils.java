            package com.supercell.p007id;

            import android.app.Activity;
            import java.util.concurrent.Callable;
            import java.util.concurrent.Future;
            import java.util.concurrent.FutureTask;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ThreadUtils {
                public static <T> Future<T> runOnUiThread(Activity activity, Callable<T> callable) {
/* 3 */             FutureTask futureTask = new FutureTask(callable);
/* 6 */             activity.runOnUiThread(futureTask);
/* 9 */             return futureTask;
                }
            }
