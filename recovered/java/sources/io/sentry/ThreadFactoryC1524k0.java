            package io.sentry;

            import java.util.concurrent.ThreadFactory;
            
            /* JADX INFO: renamed from: io.sentry.k0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ThreadFactoryC1524k0 implements ThreadFactory {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11077a;

                /* JADX INFO: renamed from: b */
                public int f11078b;

                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    switch (this.f11077a) {
                        case 0:
/* 135 */                   StringBuilder sb = new StringBuilder("SentryHostnameCache-");
/* 138 */                   int i = this.f11078b;
/* 142 */                   this.f11078b = i + 1;
/* 144 */                   sb.append(i);
/* 151 */                   Thread thread = new Thread(runnable, sb.toString());
/* 154 */                   thread.setDaemon(true);
/* 157 */                   return thread;
                        case 1:
/* 106 */                   StringBuilder sb2 = new StringBuilder("SentryExecutorServiceThreadFactory-");
/* 109 */                   int i2 = this.f11078b;
/* 113 */                   this.f11078b = i2 + 1;
/* 115 */                   sb2.append(i2);
/* 122 */                   C1449f5 c1449f5 = new C1449f5(runnable, sb2.toString());
/* 125 */                   c1449f5.setDaemon(true);
/* 128 */                   return c1449f5;
                        case 2:
/* 68 */                    runnable.getClass();
/* 77 */                    StringBuilder sb3 = new StringBuilder("SentryReplayIntegration-");
/* 80 */                    int i3 = this.f11078b;
/* 84 */                    this.f11078b = i3 + 1;
/* 86 */                    sb3.append(i3);
/* 93 */                    Thread thread2 = new Thread(runnable, sb3.toString());
/* 96 */                    thread2.setDaemon(true);
/* 99 */                    return thread2;
                        case 3:
/* 36 */                    runnable.getClass();
/* 45 */                    StringBuilder sb4 = new StringBuilder("SentryReplayPersister-");
/* 48 */                    int i4 = this.f11078b;
/* 52 */                    this.f11078b = i4 + 1;
/* 54 */                    sb4.append(i4);
/* 61 */                    Thread thread3 = new Thread(runnable, sb4.toString());
/* 64 */                    thread3.setDaemon(true);
/* 67 */                    return thread3;
                        default:
/* 13 */                    StringBuilder sb5 = new StringBuilder("SentryAsyncConnection-");
/* 16 */                    int i5 = this.f11078b;
/* 20 */                    this.f11078b = i5 + 1;
/* 22 */                    sb5.append(i5);
/* 29 */                    Thread thread4 = new Thread(runnable, sb5.toString());
/* 32 */                    thread4.setDaemon(true);
/* 35 */                    return thread4;
                    }
                }
            }
