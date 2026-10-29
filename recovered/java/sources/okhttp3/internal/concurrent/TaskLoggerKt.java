            package okhttp3.internal.concurrent;

            import java.util.Arrays;
            import java.util.logging.Level;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0002\u001a5\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a*\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, m6176d2 = {"formatDuration", HttpUrl.FRAGMENT_ENCODE_SET, "ns", HttpUrl.FRAGMENT_ENCODE_SET, "log", HttpUrl.FRAGMENT_ENCODE_SET, "task", "Lokhttp3/internal/concurrent/Task;", "queue", "Lokhttp3/internal/concurrent/TaskQueue;", "message", "logElapsed", "T", "block", "Lkotlin/Function0;", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "taskLog", "messageBlock", "okhttp"}, m6177k = 2, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class TaskLoggerKt {
                public static final String formatDuration(long j) {
                    String strM3787m;
/* 14 */            if (j <= -999500000) {
/* 24 */                strM3787m = fm0.m3787m(new StringBuilder(), (j - 500000000) / 1000000000, " s ");
                    } else if (j <= -999500) {
/* 52 */                strM3787m = fm0.m3787m(new StringBuilder(), (j - 500000) / 1000000, " ms");
                    } else if (j <= 0) {
/* 77 */                strM3787m = fm0.m3787m(new StringBuilder(), (j - 500) / 1000, " µs");
                    } else if (j < 999500) {
/* 97 */                strM3787m = fm0.m3787m(new StringBuilder(), (j + 500) / 1000, " µs");
                    } else {
/* 130 */               strM3787m = j < 999500000 ? fm0.m3787m(new StringBuilder(), (j + 500000) / 1000000, " ms") : fm0.m3787m(new StringBuilder(), (j + 500000000) / 1000000000, " s ");
                    }
/* 145 */           return String.format("%6s", Arrays.copyOf(new Object[]{strM3787m}, 1));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void log(Task task, TaskQueue taskQueue, String str) {
/* 58 */            TaskRunner.INSTANCE.getLogger().fine(taskQueue.getName() + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.getName());
                }

                public static final <T> T logElapsed(Task task, TaskQueue taskQueue, Function0<? extends T> function0) {
                    long jNanoTime;
/* 1 */             task.getClass();
/* 4 */             taskQueue.getClass();
/* 7 */             function0.getClass();
/* 18 */            boolean zIsLoggable = TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE);
/* 22 */            if (zIsLoggable) {
/* 32 */                jNanoTime = taskQueue.getTaskRunner().getBackend().nanoTime();
/* 1 */                 log(task, taskQueue, "starting");
                    } else {
/* 42 */                jNanoTime = -1;
                    }
                    try {
/* 44 */                T t = (T) function0.invoke();
/* 48 */                if (zIsLoggable) {
/* 69 */                    String strM6219d = Intrinsics.m6219d(formatDuration(taskQueue.getTaskRunner().getBackend().nanoTime() - jNanoTime), "finished run in ");
                        }
/* 76 */                return t;
                    } finally {
/* 78 */                if (zIsLoggable) {
/* 1 */                     log(task, taskQueue, Intrinsics.m6219d(formatDuration(taskQueue.getTaskRunner().getBackend().nanoTime() - jNanoTime), "failed a run in "));
                        }
                    }
                }

                public static final void taskLog(Task task, TaskQueue taskQueue, Function0<String> function0) {
/* 1 */             task.getClass();
/* 4 */             taskQueue.getClass();
/* 7 */             function0.getClass();
/* 22 */            if (TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE)) {
/* 1 */                 log(task, taskQueue, (String) function0.invoke());
                    }
                }
            }
