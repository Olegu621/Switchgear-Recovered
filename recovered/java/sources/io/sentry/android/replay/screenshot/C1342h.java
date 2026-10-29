            package io.sentry.android.replay.screenshot;

            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.os.Handler;
            import android.view.PixelCopy;
            import android.view.View;
            import android.view.Window;
            import io.sentry.C1666s6;
            import io.sentry.EnumC1553m5;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.core.internal.util.PixelCopyOnPixelCopyFinishedListenerC1225l;
            import io.sentry.android.replay.C1318f0;
            import io.sentry.android.replay.C1372x;
            import io.sentry.android.replay.ReplayIntegration;
            import io.sentry.android.replay.util.C1348b;
            import io.sentry.android.replay.util.C1351e;
            import io.sentry.android.replay.util.RunnableC1354h;
            import io.sentry.android.replay.viewhierarchy.AbstractC1370h;
            import io.sentry.config.AbstractC1417a;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicInteger;
            import p000.C0908f8;
            import p000.cd1;
            import p000.f72;
            import p000.p51;
            import p000.r51;
            import p000.v51;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.screenshot.h */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1342h implements InterfaceC1343i {

                /* JADX INFO: renamed from: a */
                public final ReplayIntegration f10612a;

                /* JADX INFO: renamed from: b */
                public final SentryAndroidOptions f10613b;

                /* JADX INFO: renamed from: c */
                public final C1372x f10614c;

                /* JADX INFO: renamed from: d */
                public final C0908f8 f10615d;

                /* JADX INFO: renamed from: e */
                public final ScheduledExecutorService f10616e;

                /* JADX INFO: renamed from: f */
                public final C1666s6 f10617f;

                /* JADX INFO: renamed from: g */
                public final Bitmap f10618g;

                /* JADX INFO: renamed from: h */
                public final p51 f10619h;

                /* JADX INFO: renamed from: i */
                public final AtomicBoolean f10620i;

                /* JADX INFO: renamed from: j */
                public final C1351e f10621j;

                /* JADX INFO: renamed from: k */
                public final AtomicBoolean f10622k;

                /* JADX INFO: renamed from: l */
                public final AtomicInteger f10623l;

                /* JADX INFO: renamed from: m */
                public final AtomicBoolean f10624m;

                /* JADX INFO: renamed from: n */
                public final p51 f10625n;

                /* JADX INFO: renamed from: o */
                public final p51 f10626o;

                /* JADX INFO: renamed from: p */
                public final Rect f10627p;

                /* JADX INFO: renamed from: q */
                public final RectF f10628q;

                /* JADX INFO: renamed from: r */
                public final int[] f10629r;

                /* JADX INFO: renamed from: s */
                public final int[] f10630s;

                public C1342h(C1318f0 c1318f0, ReplayIntegration replayIntegration, SentryAndroidOptions sentryAndroidOptions, C1372x c1372x, C1348b c1348b, C0908f8 c0908f8) {
/* 1 */             c1318f0.getClass();
/* 7 */             this.f10612a = replayIntegration;
/* 9 */             this.f10613b = sentryAndroidOptions;
/* 11 */            this.f10614c = c1372x;
/* 13 */            this.f10615d = c0908f8;
/* 17 */            this.f10616e = c1318f0.f10526e;
/* 21 */            this.f10617f = c1318f0.f10525d;
/* 29 */            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c1372x.f10703a, c1372x.f10704b, Bitmap.Config.ARGB_8888);
/* 33 */            bitmapCreateBitmap.getClass();
/* 36 */            this.f10618g = bitmapCreateBitmap;
/* 38 */            v51 v51Var = v51.f17866b;
/* 50 */            this.f10619h = r51.m8064a(v51Var, new C1341g(this, 0));
/* 57 */            this.f10620i = new AtomicBoolean(false);
/* 64 */            this.f10621j = new C1351e();
/* 71 */            this.f10622k = new AtomicBoolean(false);
/* 78 */            this.f10623l = new AtomicInteger(0);
/* 85 */            this.f10624m = new AtomicBoolean(false);
/* 93 */            this.f10625n = r51.m8064a(v51Var, C1340f.f10609a);
/* 105 */           this.f10626o = r51.m8064a(v51Var, new C1341g(this, 1));
/* 112 */           this.f10627p = new Rect();
/* 119 */           this.f10628q = new RectF();
/* 124 */           this.f10629r = new int[2];
/* 128 */           this.f10630s = new int[2];
                }

                /* JADX INFO: renamed from: e */
                public static final void m5023e(AtomicInteger atomicInteger, final C1342h c1342h, final View view, final cd1[] cd1VarArr, final AbstractC1370h abstractC1370h, final int i, final int i2, final boolean z) {
/* 5 */             if (atomicInteger.decrementAndGet() == 0) {
/* 29 */                c1342h.f10616e.submit(new RunnableC1354h(new Runnable() { // from class: io.sentry.android.replay.screenshot.e
                            /* JADX WARN: Code duplicated, block: B:14:0x0084  */
                            @Override // java.lang.Runnable
                            public final void run() {
/* 3 */                         C1342h c1342h2 = this.f10602a;
/* 7 */                         boolean z2 = c1342h2.f10624m.get();
/* 11 */                        cd1[] cd1VarArr2 = cd1VarArr;
/* 14 */                        if (z2 || c1342h2.f10618g.isRecycled()) {
/* 162 */                           c1342h2.f10613b.getLogger().mo4672k(EnumC1553m5.DEBUG, "PixelCopyStrategy is closed, skipping compositing", new Object[0]);
/* 166 */                           for (cd1 cd1Var : cd1VarArr2) {
/* 170 */                               if (cd1Var != null) {
/* 174 */                                   Bitmap bitmap = (Bitmap) cd1Var.f2847c;
/* 180 */                                   if (!bitmap.isRecycled()) {
/* 182 */                                       bitmap.recycle();
                                            }
                                        }
                                    }
/* 188 */                           return;
                                }
/* 27 */                        int i3 = 0;
/* 28 */                        for (int length = cd1VarArr2.length; i3 < length; length = length) {
/* 30 */                            cd1 cd1Var2 = cd1VarArr2[i3];
/* 32 */                            if (cd1Var2 != null) {
/* 36 */                                Bitmap bitmap2 = (Bitmap) cd1Var2.f2847c;
/* 42 */                                if (!bitmap2.isRecycled()) {
/* 50 */                                    Canvas canvas = (Canvas) c1342h2.f10626o.getValue();
/* 58 */                                    Paint paint = (Paint) c1342h2.f10625n.getValue();
/* 60 */                                    Rect rect = c1342h2.f10627p;
/* 62 */                                    RectF rectF = c1342h2.f10628q;
/* 64 */                                    int i4 = cd1Var2.f2845a;
/* 66 */                                    int i5 = cd1Var2.f2846b;
/* 68 */                                    C1372x c1372x = c1342h2.f10614c;
/* 70 */                                    float f = c1372x.f10705c;
/* 72 */                                    float f2 = c1372x.f10706d;
/* 74 */                                    canvas.getClass();
/* 77 */                                    paint.getClass();
/* 80 */                                    rect.getClass();
/* 83 */                                    rectF.getClass();
/* 90 */                                    float f3 = (i4 - i) * f;
/* 95 */                                    float f4 = (i5 - i2) * f2;
/* 106 */                                   rect.set(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
/* 123 */                                   rectF.set(f3, f4, (bitmap2.getWidth() * f) + f3, (bitmap2.getHeight() * f2) + f4);
/* 126 */                                   canvas.drawBitmap(bitmap2, rect, rectF, paint);
/* 129 */                                   bitmap2.recycle();
                                        }
                                    }
/* 135 */                           i3++;
                                }
/* 146 */                       c1342h2.m5024d(view, abstractC1370h, z);
                            }
                        }, "screenshot_recorder.composite"));
                    }
                }

                @Override // io.sentry.android.replay.screenshot.InterfaceC1343i
                /* JADX INFO: renamed from: a */
                public final boolean mo5019a() {
/* 3 */             return this.f10620i.get();
                }

                @Override // io.sentry.android.replay.screenshot.InterfaceC1343i
                /* JADX INFO: renamed from: b */
                public final void mo5020b(View view) throws IllegalAccessException {
/* 1 */             Window windowM5176n = AbstractC1417a.m5176n(view);
/* 5 */             SentryAndroidOptions sentryAndroidOptions = this.f10613b;
/* 8 */             if (windowM5176n == null) {
/* 20 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
/* 23 */                return;
                    }
/* 30 */            if (this.f10624m.get()) {
/* 42 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "PixelCopyStrategy is closed, not capturing screenshot", new Object[0]);
/* 45 */                return;
                    }
                    try {
/* 48 */                this.f10622k.set(false);
/* 1 */                 PixelCopy.request(windowM5176n, this.f10618g, new PixelCopyOnPixelCopyFinishedListenerC1225l(1, this, view), (Handler) this.f10617f.f11662b);
                    } catch (Throwable th) {
/* 78 */                sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.WARNING, "Failed to capture replay recording", th);
/* 83 */                this.f10623l.set(0);
/* 88 */                this.f10620i.set(false);
                    }
                }

                @Override // io.sentry.android.replay.screenshot.InterfaceC1343i
                /* JADX INFO: renamed from: c */
                public final void mo5021c() throws Exception {
/* 7 */             if (this.f10620i.get()) {
/* 9 */                 Bitmap bitmap = this.f10618g;
/* 15 */                if (bitmap.isRecycled()) {
/* 22 */                    return;
                        }
/* 19 */                this.f10612a.m4979q(bitmap);
                    }
                }

                @Override // io.sentry.android.replay.screenshot.InterfaceC1343i
                public final void close() {
/* 4 */             this.f10624m.set(true);
/* 10 */            this.f10623l.set(0);
/* 29 */            this.f10616e.submit(new RunnableC1354h(new f72(this, 28), "PixelCopyStrategy.close"));
                }

                /* JADX INFO: renamed from: d */
                public final void m5024d(View view, AbstractC1370h abstractC1370h, boolean z) {
/* 3 */             boolean z2 = this.f10624m.get();
/* 7 */             SentryAndroidOptions sentryAndroidOptions = this.f10613b;
/* 10 */            if (!z2) {
/* 12 */                Bitmap bitmap = this.f10618g;
/* 18 */                if (!bitmap.isRecycled()) {
/* 31 */                    this.f10621j.m5036c(bitmap, abstractC1370h, (Matrix) this.f10619h.getValue());
/* 38 */                    sentryAndroidOptions.getReplayController().getClass();
/* 43 */                    this.f10612a.m4979q(bitmap);
/* 49 */                    this.f10620i.set(true);
/* 54 */                    this.f10622k.set(false);
/* 57 */                    if (z) {
/* 61 */                        this.f10623l.set(0);
/* 64 */                        return;
                            }
/* 64 */                    return;
                        }
                    }
/* 75 */            sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "PixelCopyStrategy is closed, skipping masking", new Object[0]);
                }

                @Override // io.sentry.android.replay.screenshot.InterfaceC1343i
                public final void onContentChanged() {
/* 4 */             this.f10622k.set(true);
                }
            }
