            package io.sentry.android.core.internal.util;

            import android.os.Build;
            import android.os.Handler;
            import android.os.Looper;
            import android.os.Process;
            import io.sentry.util.thread.InterfaceC1718a;
            import p000.RunnableC0981h7;
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.util.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1218e implements InterfaceC1718a {

                /* JADX INFO: renamed from: a */
                public static final C1218e f10157a;

                /* JADX INFO: renamed from: b */
                public static volatile long f10158b;

                static {
/* 3 */             C1218e c1218e = new C1218e();
/* 21 */            new Handler(Looper.getMainLooper()).post(new RunnableC0981h7(5));
/* 24 */            f10157a = c1218e;
/* 31 */            f10158b = Process.myTid();
                }

                /* JADX INFO: renamed from: d */
                public static long m4839d(Thread thread) {
                    return Build.VERSION.SDK_INT >= 36 ? thread.threadId() : thread.getId();
                }

                @Override // io.sentry.util.thread.InterfaceC1718a
                /* JADX INFO: renamed from: a */
                public final String mo4840a() {
                    return mo4842c() ? "main" : Thread.currentThread().getName();
                }

                @Override // io.sentry.util.thread.InterfaceC1718a
                /* JADX INFO: renamed from: b */
                public final long mo4841b() {
/* 5 */             return Process.myTid();
                }

                @Override // io.sentry.util.thread.InterfaceC1718a
                /* JADX INFO: renamed from: c */
                public final boolean mo4842c() {
                    return m4839d(Looper.getMainLooper().getThread()) == m4839d(Thread.currentThread());
                }
            }
