            package io.sentry.android.replay;

            import android.view.View;
            import android.view.ViewTreeObserver;
            import io.sentry.EnumC1553m5;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.replay.screenshot.C1337c;
            import io.sentry.android.replay.screenshot.C1342h;
            import io.sentry.android.replay.screenshot.InterfaceC1343i;
            import io.sentry.android.replay.util.C1348b;
            import io.sentry.config.AbstractC1417a;
            import java.lang.ref.WeakReference;
            import java.util.concurrent.atomic.AtomicBoolean;
            import p000.C0908f8;
            import p000.ds0;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.w */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewTreeObserverOnDrawListenerC1371w implements ViewTreeObserver.OnDrawListener {

                /* JADX INFO: renamed from: a */
                public final SentryAndroidOptions f10698a;

                /* JADX INFO: renamed from: b */
                public WeakReference f10699b;

                /* JADX INFO: renamed from: c */
                public final AtomicBoolean f10700c;

                /* JADX INFO: renamed from: d */
                public final AtomicBoolean f10701d;

                /* JADX INFO: renamed from: e */
                public final InterfaceC1343i f10702e;

                public ViewTreeObserverOnDrawListenerC1371w(SentryAndroidOptions sentryAndroidOptions, ReplayIntegration replayIntegration, C1372x c1372x, C1318f0 c1318f0) {
                    InterfaceC1343i c1337c;
/* 1 */             c1318f0.getClass();
/* 7 */             this.f10698a = sentryAndroidOptions;
/* 15 */            this.f10700c = new AtomicBoolean(true);
/* 19 */            C1348b c1348b = new C1348b();
/* 28 */            this.f10701d = new AtomicBoolean(false);
/* 42 */            int i = AbstractC1359v.f10666a[sentryAndroidOptions.getSessionReplay().f11537n.ordinal()];
/* 44 */            if (i == 1) {
/* 77 */                c1337c = new C1337c(sentryAndroidOptions, replayIntegration, c1372x, c1318f0);
                    } else {
/* 47 */                if (i != 2) {
/* 66 */                    ds0.m3187b();
/* 70 */                    throw null;
                        }
/* 62 */                c1337c = new C1342h(c1318f0, replayIntegration, sentryAndroidOptions, c1372x, c1348b, new C0908f8(this, 22));
                    }
/* 80 */            this.f10702e = c1337c;
                }

                /* JADX INFO: renamed from: a */
                public final void m5053a(View view) {
/* 1 */             view.getClass();
/* 4 */             WeakReference weakReference = this.f10699b;
/* 16 */            m5055c(weakReference != null ? (View) weakReference.get() : null);
/* 19 */            WeakReference weakReference2 = this.f10699b;
/* 21 */            if (weakReference2 != null) {
/* 23 */                weakReference2.clear();
                    }
/* 31 */            this.f10699b = new WeakReference(view);
/* 37 */            if (view.getViewTreeObserver() != null && view.getViewTreeObserver().isAlive()) {
                        try {
/* 54 */                    view.getViewTreeObserver().addOnDrawListener(this);
                        } catch (IllegalStateException unused) {
                        }
                    }
/* 60 */            this.f10701d.set(true);
/* 65 */            this.f10702e.onContentChanged();
                }

                /* JADX INFO: renamed from: b */
                public final void m5054b() {
/* 1 */             SentryAndroidOptions sentryAndroidOptions = this.f10698a;
/* 7 */             boolean z = sentryAndroidOptions.getSessionReplay().f11536m;
/* 9 */             AtomicBoolean atomicBoolean = this.f10700c;
/* 11 */            if (z) {
/* 33 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(atomicBoolean.get()));
                    }
/* 41 */            if (!atomicBoolean.get()) {
/* 49 */                if (sentryAndroidOptions.getSessionReplay().f11536m) {
/* 61 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
/* 64 */                    return;
                        }
/* 64 */                return;
                    }
/* 69 */            boolean z2 = sentryAndroidOptions.getSessionReplay().f11536m;
/* 71 */            InterfaceC1343i interfaceC1343i = this.f10702e;
/* 73 */            AtomicBoolean atomicBoolean2 = this.f10701d;
/* 75 */            if (z2) {
/* 105 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(atomicBoolean2.get()), Boolean.valueOf(interfaceC1343i.mo5019a()));
                    }
/* 112 */           if (!atomicBoolean2.get()) {
/* 114 */               interfaceC1343i.mo5021c();
/* 117 */               return;
                    }
/* 118 */           WeakReference weakReference = this.f10699b;
/* 129 */           View view = weakReference != null ? (View) weakReference.get() : null;
/* 130 */           if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
/* 201 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
/* 204 */               return;
                    }
/* 155 */           if (AbstractC1417a.m5176n(view) == null) {
/* 167 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
/* 170 */               return;
                    }
                    try {
/* 171 */               atomicBoolean2.set(false);
/* 174 */               interfaceC1343i.mo5020b(view);
                    } catch (Throwable th) {
/* 187 */               sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.WARNING, "Failed to capture replay recording", th);
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m5055c(View view) {
/* 7 */             this.f10698a.getReplayController().getClass();
/* 10 */            if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
/* 36 */                return;
                    }
                    try {
/* 33 */                view.getViewTreeObserver().removeOnDrawListener(this);
                    } catch (IllegalStateException unused) {
                    }
                }

                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
/* 7 */             if (this.f10700c.get()) {
/* 10 */                WeakReference weakReference = this.f10699b;
/* 21 */                View view = weakReference != null ? (View) weakReference.get() : null;
/* 22 */                if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
/* 68 */                    this.f10698a.getLogger().mo4672k(EnumC1553m5.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
                        } else {
/* 46 */                    this.f10701d.set(true);
/* 51 */                    this.f10702e.onContentChanged();
                        }
                    }
                }
            }
