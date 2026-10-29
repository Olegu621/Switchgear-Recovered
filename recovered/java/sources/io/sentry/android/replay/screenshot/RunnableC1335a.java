            package io.sentry.android.replay.screenshot;

            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.Picture;
            import android.graphics.PorterDuff;
            import android.view.PixelCopy;
            import android.view.Surface;
            import io.sentry.EnumC1553m5;
            import io.sentry.android.replay.C1372x;
            import io.sentry.util.C1702a;
            import p000.fm0;
            import p000.xe2;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.screenshot.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC1335a implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10573a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1337c f10574b;

                public /* synthetic */ RunnableC1335a(C1337c c1337c, int i) {
/* 1 */             this.f10573a = i;
/* 3 */             this.f10574b = c1337c;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f10573a;
/* 3 */             final C1337c c1337c = this.f10574b;
                    switch (i) {
                        case 0:
/* 47 */                    if (c1337c.f10586k.get()) {
/* 61 */                        c1337c.f10578c.getLogger().mo4672k(EnumC1553m5.DEBUG, "Canvas Strategy already closed, skipping picture render", new Object[0]);
/* 213 */                       return;
                            }
/* 73 */                    Picture picture = (Picture) c1337c.f10581f.getAndSet(null);
/* 75 */                    if (picture == null) {
/* 213 */                       return;
                            }
                            try {
/* 81 */                        Canvas canvasLockHardwareCanvas = c1337c.f10588m.lockHardwareCanvas();
                                try {
/* 89 */                            canvasLockHardwareCanvas.drawColor(-16777216, PorterDuff.Mode.CLEAR);
/* 92 */                            picture.draw(canvasLockHardwareCanvas);
/* 97 */                            c1337c.f10588m.unlockCanvasAndPost(canvasLockHardwareCanvas);
/* 102 */                           if (c1337c.f10580e == null) {
/* 104 */                               C1702a c1702a = c1337c.f10582g;
/* 106 */                               c1702a.m5443c();
                                        try {
/* 111 */                                   if (c1337c.f10580e == null) {
/* 113 */                                       C1372x c1372x = c1337c.f10579d;
/* 125 */                                       c1337c.f10580e = Bitmap.createBitmap(c1372x.f10703a, c1372x.f10704b, Bitmap.Config.ARGB_8888);
                                            }
/* 130 */                                   xe2.m9770h(c1702a, null);
                                            break;
                                        } catch (Throwable th) {
                                            try {
/* 136 */                                       throw th;
                                            } catch (Throwable th2) {
/* 138 */                                       xe2.m9770h(c1702a, th);
/* 141 */                                       throw th2;
                                            }
                                        }
                                    }
/* 148 */                           if (c1337c.f10586k.get()) {
/* 162 */                               c1337c.f10578c.getLogger().mo4672k(EnumC1553m5.DEBUG, "Canvas Strategy already closed, skipping pixel copy request", new Object[0]);
/* 213 */                               return;
                                    }
/* 166 */                           Surface surface = c1337c.f10588m;
/* 168 */                           Bitmap bitmap = c1337c.f10580e;
/* 170 */                           bitmap.getClass();
/* 184 */                           PixelCopy.request(surface, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.b
                                        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                        public final void onPixelCopyFinished(int i2) throws Exception {
/* 1 */                                     C1337c c1337c2 = c1337c;
/* 10 */                                    if (c1337c2.f10586k.get()) {
/* 24 */                                        c1337c2.f10578c.getLogger().mo4672k(EnumC1553m5.DEBUG, "CanvasStrategy is closed, ignoring capture result", new Object[0]);
/* 27 */                                        return;
                                            }
/* 28 */                                    if (i2 != 0) {
/* 68 */                                        c1337c2.f10578c.getLogger().mo4672k(EnumC1553m5.ERROR, fm0.m3781g(i2, "Canvas Strategy: PixelCopy failed with code "), new Object[0]);
/* 73 */                                        c1337c2.f10584i.set(false);
/* 76 */                                        return;
                                            }
/* 33 */                                    c1337c2.f10584i.set(true);
/* 36 */                                    Bitmap bitmap2 = c1337c2.f10580e;
/* 38 */                                    if (bitmap2 == null || bitmap2.isRecycled()) {
/* 51 */                                        return;
                                            }
/* 48 */                                    c1337c2.f10577b.m4979q(bitmap2);
                                        }
                                    }, c1337c.f10576a.m5004g());
/* 213 */                           return;
                                } catch (Throwable th3) {
/* 191 */                           c1337c.f10588m.unlockCanvasAndPost(canvasLockHardwareCanvas);
/* 194 */                           throw th3;
                                }
                            } catch (Throwable th4) {
/* 205 */                       c1337c.f10578c.getLogger().mo4671d(EnumC1553m5.ERROR, "Canvas Strategy: picture render failed", th4);
/* 210 */                       c1337c.f10584i.set(false);
/* 213 */                       return;
                            }
                        default:
/* 8 */                     Bitmap bitmap2 = c1337c.f10580e;
/* 10 */                    if (bitmap2 != null) {
                                synchronized (bitmap2) {
/* 17 */                            if (!bitmap2.isRecycled()) {
/* 19 */                                bitmap2.recycle();
                                    }
                                    break;
                                }
                            }
/* 31 */                    c1337c.f10588m.release();
/* 36 */                    c1337c.f10587l.release();
/* 39 */                    return;
                    }
                }
            }
