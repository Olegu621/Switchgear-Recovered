            package io.sentry.android.replay.screenshot;

            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import android.graphics.Picture;
            import android.graphics.SurfaceTexture;
            import android.os.Handler;
            import android.view.Surface;
            import android.view.View;
            import io.sentry.EnumC1553m5;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.replay.C1318f0;
            import io.sentry.android.replay.C1372x;
            import io.sentry.android.replay.ReplayIntegration;
            import io.sentry.android.replay.util.RunnableC1354h;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1702a;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicReference;
            import p000.C0908f8;
            import p000.p51;
            import p000.r51;
            import p000.v51;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.screenshot.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1337c implements InterfaceC1343i {

                /* JADX INFO: renamed from: a */
                public final C1318f0 f10576a;

                /* JADX INFO: renamed from: b */
                public final ReplayIntegration f10577b;

                /* JADX INFO: renamed from: c */
                public final SentryAndroidOptions f10578c;

                /* JADX INFO: renamed from: d */
                public final C1372x f10579d;

                /* JADX INFO: renamed from: e */
                public volatile Bitmap f10580e;

                /* JADX INFO: renamed from: f */
                public final AtomicReference f10581f;

                /* JADX INFO: renamed from: g */
                public final C1702a f10582g;

                /* JADX INFO: renamed from: h */
                public final p51 f10583h;

                /* JADX INFO: renamed from: i */
                public final AtomicBoolean f10584i;

                /* JADX INFO: renamed from: j */
                public final C1344j f10585j;

                /* JADX INFO: renamed from: k */
                public final AtomicBoolean f10586k;

                /* JADX INFO: renamed from: l */
                public final SurfaceTexture f10587l;

                /* JADX INFO: renamed from: m */
                public final Surface f10588m;

                /* JADX INFO: renamed from: n */
                public final RunnableC1335a f10589n;

                public C1337c(SentryAndroidOptions sentryAndroidOptions, ReplayIntegration replayIntegration, C1372x c1372x, C1318f0 c1318f0) {
/* 1 */             c1318f0.getClass();
/* 7 */             this.f10576a = c1318f0;
/* 9 */             this.f10577b = replayIntegration;
/* 11 */            this.f10578c = sentryAndroidOptions;
/* 13 */            this.f10579d = c1372x;
/* 21 */            this.f10581f = new AtomicReference(null);
/* 28 */            this.f10582g = new C1702a();
/* 43 */            this.f10583h = r51.m8064a(v51.f17866b, new C0908f8(this, 23));
/* 51 */            this.f10584i = new AtomicBoolean(false);
/* 58 */            this.f10585j = new C1344j();
/* 65 */            this.f10586k = new AtomicBoolean(false);
/* 69 */            SurfaceTexture surfaceTexture = new SurfaceTexture(false);
/* 76 */            surfaceTexture.setDefaultBufferSize(c1372x.f10703a, c1372x.f10704b);
/* 79 */            this.f10587l = surfaceTexture;
/* 86 */            this.f10588m = new Surface(surfaceTexture);
/* 90 */            AbstractC1704c.m5446a("ReplayCanvasStrategy");
/* 98 */            this.f10589n = new RunnableC1335a(this, 0);
                }

                @Override // io.sentry.android.replay.screenshot.InterfaceC1343i
                /* JADX INFO: renamed from: a */
                public final boolean mo5019a() {
/* 3 */             return this.f10584i.get();
                }

                @Override // io.sentry.android.replay.screenshot.InterfaceC1343i
                /* JADX INFO: renamed from: b */
                public final void mo5020b(View view) {
/* 1 */             AtomicBoolean atomicBoolean = this.f10586k;
/* 7 */             if (atomicBoolean.get()) {
/* 81 */                return;
                    }
/* 12 */            Picture picture = new Picture();
/* 15 */            C1372x c1372x = this.f10579d;
/* 21 */            Canvas canvasBeginRecording = picture.beginRecording(c1372x.f10703a, c1372x.f10704b);
/* 25 */            canvasBeginRecording.getClass();
/* 28 */            C1344j c1344j = this.f10585j;
/* 30 */            c1344j.getClass();
/* 33 */            c1344j.f10631a = canvasBeginRecording;
/* 43 */            c1344j.setMatrix((Matrix) this.f10583h.getValue());
/* 46 */            view.draw(c1344j);
/* 49 */            picture.endRecording();
/* 56 */            if (atomicBoolean.get()) {
/* 81 */                return;
                    }
/* 60 */            this.f10581f.set(picture);
/* 78 */            m5022d(this.f10576a.m5004g(), new RunnableC1354h(this.f10589n, "screenshot_recorder.canvas"));
                }

                @Override // io.sentry.android.replay.screenshot.InterfaceC1343i
                /* JADX INFO: renamed from: c */
                public final void mo5021c() throws Exception {
                    Bitmap bitmap;
/* 7 */             if (!this.f10584i.get() || (bitmap = this.f10580e) == null || bitmap.isRecycled()) {
/* 24 */                return;
                    }
/* 21 */            this.f10577b.m4979q(bitmap);
                }

                @Override // io.sentry.android.replay.screenshot.InterfaceC1343i
                public final void close() {
/* 4 */             this.f10586k.set(true);
/* 25 */            m5022d(this.f10576a.m5004g(), new RunnableC1354h(new RunnableC1335a(this, 1), "CanvasStrategy.close"));
/* 31 */            this.f10581f.getAndSet(null);
                }

                /* JADX INFO: renamed from: d */
                public final void m5022d(Handler handler, RunnableC1354h runnableC1354h) {
                    try {
/* 1 */                 handler.post(runnableC1354h);
                    } catch (Throwable th) {
/* 22 */                this.f10578c.getLogger().mo4671d(EnumC1553m5.ERROR, "Canvas Strategy: failed to post runnable ".concat(runnableC1354h.f10663a), th);
                    }
                }

                @Override // io.sentry.android.replay.screenshot.InterfaceC1343i
                public final void onContentChanged() {
                }
            }
