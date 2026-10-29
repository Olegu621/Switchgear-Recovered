            package io.sentry.android.replay;

            import android.os.Handler;
            import io.sentry.C1666s6;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.android.core.SentryAndroidOptions;
            import java.util.concurrent.atomic.AtomicBoolean;
            import p000.fm0;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.c0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RunnableC1298c0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final SentryAndroidOptions f10444a;

                /* JADX INFO: renamed from: b */
                public final C1666s6 f10445b;

                /* JADX INFO: renamed from: c */
                public ViewTreeObserverOnDrawListenerC1371w f10446c;

                /* JADX INFO: renamed from: d */
                public C1372x f10447d;

                /* JADX INFO: renamed from: e */
                public final AtomicBoolean f10448e;

                public RunnableC1298c0(SentryAndroidOptions sentryAndroidOptions, C1666s6 c1666s6) {
/* 1 */             c1666s6.getClass();
/* 7 */             this.f10444a = sentryAndroidOptions;
/* 9 */             this.f10445b = c1666s6;
/* 17 */            this.f10448e = new AtomicBoolean(true);
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 3 */             boolean z = this.f10448e.get();
/* 8 */             SentryAndroidOptions sentryAndroidOptions = this.f10444a;
/* 10 */            if (!z) {
/* 18 */                if (sentryAndroidOptions.getSessionReplay().f11536m) {
/* 30 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
/* 33 */                    return;
                        }
/* 153 */               return;
                    }
                    try {
/* 40 */                if (sentryAndroidOptions.getSessionReplay().f11536m) {
/* 52 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Capturing a frame.", new Object[0]);
                        }
/* 58 */                ViewTreeObserverOnDrawListenerC1371w viewTreeObserverOnDrawListenerC1371w = this.f10446c;
/* 60 */                if (viewTreeObserverOnDrawListenerC1371w != null) {
/* 62 */                    viewTreeObserverOnDrawListenerC1371w.m5054b();
                        }
                    } catch (Throwable th) {
/* 74 */                sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to capture a frame", th);
                    }
/* 84 */            if (sentryAndroidOptions.getSessionReplay().f11536m) {
/* 86 */                ILogger logger = sentryAndroidOptions.getLogger();
/* 90 */                EnumC1553m5 enumC1553m5 = EnumC1553m5.DEBUG;
/* 96 */                StringBuilder sb = new StringBuilder("Posting the capture runnable again, frame rate is ");
/* 99 */                C1372x c1372x = this.f10447d;
/* 115 */               logger.mo4672k(enumC1553m5, fm0.m3786l(sb, c1372x != null ? c1372x.f10707e : 1, " fps."), new Object[0]);
                    }
/* 118 */           C1372x c1372x2 = this.f10447d;
/* 138 */           if (((Handler) this.f10445b.f11662b).postDelayed(this, 1000 / ((long) (c1372x2 != null ? c1372x2.f10707e : 1)))) {
/* 153 */               return;
                    }
/* 150 */           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
                }
            }
