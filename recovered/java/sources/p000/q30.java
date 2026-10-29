            package p000;

            import android.os.StrictMode;
            import java.util.Locale;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ThreadFactory;
            import java.util.concurrent.atomic.AtomicLong;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class q30 implements ThreadFactory {

                /* JADX INFO: renamed from: e */
                public static final ThreadFactory f15375e = Executors.defaultThreadFactory();

                /* JADX INFO: renamed from: a */
                public final AtomicLong f15376a = new AtomicLong();

                /* JADX INFO: renamed from: b */
                public final String f15377b;

                /* JADX INFO: renamed from: c */
                public final int f15378c;

                /* JADX INFO: renamed from: d */
                public final StrictMode.ThreadPolicy f15379d;

                public q30(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
/* 11 */            this.f15377b = str;
/* 13 */            this.f15378c = i;
/* 15 */            this.f15379d = threadPolicy;
                }

                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
/* 10 */            Thread threadNewThread = f15375e.newThread(new RunnableC1784j8(12, this, runnable));
/* 14 */            Locale locale = Locale.ROOT;
/* 44 */            threadNewThread.setName(this.f15377b + " Thread #" + this.f15376a.getAndIncrement());
/* 47 */            return threadNewThread;
                }
            }
