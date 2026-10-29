            package io.sentry.android.core;

            import android.app.Activity;
            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.os.Build;
            import android.os.Handler;
            import android.os.HandlerThread;
            import android.view.PixelCopy;
            import android.view.View;
            import android.view.Window;
            import io.sentry.C1154a;
            import io.sentry.C1393c5;
            import io.sentry.C1486i0;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1388c0;
            import io.sentry.android.core.internal.util.C1220g;
            import io.sentry.android.core.internal.util.PixelCopyOnPixelCopyFinishedListenerC1225l;
            import io.sentry.android.replay.util.C1351e;
            import io.sentry.android.replay.viewhierarchy.AbstractC1370h;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.protocol.C1600f0;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.thread.InterfaceC1718a;
            import java.lang.ref.WeakReference;
            import java.util.concurrent.CopyOnWriteArraySet;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicReference;
            import p000.RunnableC2301vo;
            import p000.bh0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ScreenshotEventProcessor implements InterfaceC1388c0 {

                /* JADX INFO: renamed from: a */
                public final SentryAndroidOptions f9872a;

                /* JADX INFO: renamed from: b */
                public final C1248o0 f9873b;

                /* JADX INFO: renamed from: d */
                public final boolean f9875d;

                /* JADX INFO: renamed from: e */
                public final AtomicBoolean f9876e = new AtomicBoolean(false);

                /* JADX INFO: renamed from: c */
                public final C1220g f9874c = new C1220g(3, 2000);

                public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, C1248o0 c1248o0, boolean z) {
/* 12 */            this.f9872a = sentryAndroidOptions;
/* 14 */            this.f9873b = c1248o0;
/* 26 */            this.f9875d = z;
/* 32 */            if (sentryAndroidOptions.isAttachScreenshot()) {
/* 36 */                AbstractC1704c.m5446a("Screenshot");
                    }
                }

                /* JADX INFO: renamed from: a */
                public final AbstractC1370h m4753a(Activity activity) {
/* 1 */             SentryAndroidOptions sentryAndroidOptions = this.f9872a;
                    try {
/* 49 */                View rootView = (activity.getWindow() == null || activity.getWindow().peekDecorView() == null || activity.getWindow().peekDecorView().getRootView() == null) ? null : activity.getWindow().peekDecorView().getRootView();
/* 50 */                if (rootView == null) {
/* 3 */                     return null;
                        }
/* 57 */                AbstractC1370h abstractC1370hM5171i = AbstractC1417a.m5171i(rootView, null, sentryAndroidOptions.getScreenshot());
/* 69 */                AbstractC1417a.m5182v(rootView, abstractC1370hM5171i, sentryAndroidOptions.getScreenshot(), sentryAndroidOptions.getLogger(), null);
/* 72 */                return abstractC1370hM5171i;
                    } catch (Throwable th) {
/* 81 */                sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to build view hierarchy", th);
/* 3 */                 return null;
                    }
                }

                /* JADX WARN: Bottom block not found for handler: all -> 0x0256 */
                /* JADX WARN: Code duplicated, block: B:161:0x0279  */
                /* JADX WARN: Code duplicated, block: B:165:0x0280 A[PHI: r10
  0x0280: PHI (r10v1 android.graphics.Bitmap) = (r10v0 android.graphics.Bitmap), (r10v0 android.graphics.Bitmap), (r10v3 android.graphics.Bitmap) binds: [B:92:0x019c, B:93:0x019e, B:163:0x027d] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:84:0x0168 A[PHI: r4 r8
  0x0168: PHI (r4v28 java.util.concurrent.TimeUnit) = (r4v26 java.util.concurrent.TimeUnit), (r4v30 java.util.concurrent.TimeUnit) binds: [B:82:0x0164, B:70:0x0137] A[DONT_GENERATE, DONT_INLINE]
  0x0168: PHI (r8v21 android.graphics.Bitmap) = (r8v20 android.graphics.Bitmap), (r8v24 android.graphics.Bitmap) binds: [B:82:0x0164, B:70:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:91:0x0190  */
                @Override // io.sentry.InterfaceC1388c0
                /* JADX INFO: renamed from: f */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final C1393c5 mo4754f(C1393c5 c1393c5, C1486i0 c1486i0) {
                    TimeUnit timeUnit;
                    Bitmap bitmap;
                    boolean z;
                    AbstractC1370h abstractC1370hM4753a;
                    Bitmap bitmap2;
                    Bitmap bitmapCopy;
                    Throwable th;
                    boolean z2;
                    Bitmap bitmap3;
                    Bitmap bitmap4;
                    boolean z3;
/* 9 */             if (c1393c5.m5110g()) {
/* 13 */                SentryAndroidOptions sentryAndroidOptions = this.f9872a;
/* 20 */                if (!sentryAndroidOptions.isAttachScreenshot()) {
/* 32 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "attachScreenshot is disabled.", new Object[0]);
/* 35 */                    return c1393c5;
                        }
/* 36 */                boolean z4 = this.f9875d;
/* 39 */                if (z4 || ((CopyOnWriteArraySet) sentryAndroidOptions.getScreenshot().f17000a).isEmpty()) {
/* 81 */                    WeakReference weakReference = (WeakReference) C1248o0.f10225b.f10226a;
/* 93 */                    Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
/* 94 */                    if (activity != null && !AbstractC1704c.m5455j(c1486i0)) {
/* 106 */                       boolean zM4844a = this.f9874c.m4844a();
/* 110 */                       sentryAndroidOptions.getBeforeScreenshotCaptureCallback();
/* 113 */                       if (!zM4844a) {
/* 117 */                           InterfaceC1718a threadChecker = sentryAndroidOptions.getThreadChecker();
/* 121 */                           ILogger logger = sentryAndroidOptions.getLogger();
/* 125 */                           C1248o0 c1248o0 = this.f9873b;
/* 127 */                           boolean zIsFinishing = activity.isFinishing();
/* 131 */                           TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
/* 133 */                           if (zIsFinishing || activity.isDestroyed()) {
/* 385 */                               timeUnit = timeUnit2;
/* 392 */                               logger.mo4672k(EnumC1553m5.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
                                    } else {
/* 141 */                               Window window = activity.getWindow();
/* 145 */                               if (window == null) {
/* 153 */                                   logger.mo4672k(EnumC1553m5.DEBUG, "Activity window is null, not taking screenshot.", new Object[0]);
                                        } else {
/* 160 */                                   View viewPeekDecorView = window.peekDecorView();
/* 164 */                                   if (viewPeekDecorView == null) {
/* 172 */                                       logger.mo4672k(EnumC1553m5.DEBUG, "DecorView is null, not taking screenshot.", new Object[0]);
                                            } else {
/* 176 */                                       View rootView = viewPeekDecorView.getRootView();
/* 180 */                                       if (rootView == null) {
/* 188 */                                           logger.mo4672k(EnumC1553m5.DEBUG, "Root view is null, not taking screenshot.", new Object[0]);
                                                } else if (rootView.getWidth() <= 0 || rootView.getHeight() <= 0) {
/* 204 */                                           timeUnit = timeUnit2;
/* 380 */                                           logger.mo4672k(EnumC1553m5.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
                                                } else {
                                                    try {
/* 217 */                                               Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
/* 223 */                                               CountDownLatch countDownLatch = new CountDownLatch(1);
/* 226 */                                               c1248o0.getClass();
/* 237 */                                               if (Build.VERSION.SDK_INT >= 26) {
/* 243 */                                                   HandlerThread handlerThread = new HandlerThread("SentryScreenshot");
/* 246 */                                                   handlerThread.start();
                                                            try {
/* 255 */                                                       Handler handler = new Handler(handlerThread.getLooper());
/* 260 */                                                       AtomicBoolean atomicBoolean = new AtomicBoolean(false);
/* 268 */                                                       bitmap4 = bitmapCreateBitmap;
                                                                try {
/* 1 */                                                             PixelCopy.request(window, bitmap4, new PixelCopyOnPixelCopyFinishedListenerC1225l(0, atomicBoolean, countDownLatch), handler);
/* 289 */                                                           z3 = countDownLatch.await(1000L, timeUnit2) && atomicBoolean.get();
/* 290 */                                                           handlerThread.quit();
                                                                } catch (Throwable th2) {
/* 287 */                                                           th = th2;
                                                                    try {
/* 304 */                                                               logger.mo4671d(EnumC1553m5.ERROR, "Taking screenshot using PixelCopy failed.", th);
/* 307 */                                                               handlerThread.quit();
/* 310 */                                                               z3 = false;
                                                                    } catch (Throwable th3) {
/* 317 */                                                               handlerThread.quit();
/* 320 */                                                               throw th3;
                                                                    }
                                                                }
                                                            } catch (Throwable th4) {
/* 297 */                                                       th = th4;
/* 298 */                                                       bitmap4 = bitmapCreateBitmap;
                                                            }
/* 311 */                                                   timeUnit = timeUnit2;
/* 312 */                                                   if (z3) {
/* 361 */                                                       bitmap = bitmap4;
                                                            }
                                                        } else {
/* 321 */                                                   bitmap4 = bitmapCreateBitmap;
/* 325 */                                                   Canvas canvas = new Canvas(bitmap4);
/* 332 */                                                   if (threadChecker.mo4842c()) {
/* 334 */                                                       rootView.draw(canvas);
/* 337 */                                                       countDownLatch.countDown();
/* 340 */                                                       timeUnit = timeUnit2;
                                                            } else {
/* 342 */                                                       timeUnit = timeUnit2;
                                                                try {
/* 350 */                                                           activity.runOnUiThread(new RunnableC2301vo(rootView, canvas, logger, countDownLatch, 6));
                                                                } catch (Throwable th5) {
/* 363 */                                                           th = th5;
/* 368 */                                                           logger.mo4671d(EnumC1553m5.ERROR, "Taking screenshot failed.", th);
                                                                }
                                                            }
/* 357 */                                                   if (countDownLatch.await(1000L, timeUnit)) {
/* 361 */                                                       bitmap = bitmap4;
                                                            }
                                                        }
                                                    } catch (Throwable th6) {
/* 294 */                                               th = th6;
/* 295 */                                               timeUnit = timeUnit2;
                                                    }
                                                }
/* 397 */                                       if (bitmap != null) {
/* 413 */                                           if (((CopyOnWriteArraySet) sentryAndroidOptions.getScreenshot().f17000a).isEmpty() && z4) {
/* 425 */                                               if (sentryAndroidOptions.getThreadChecker().mo4842c()) {
/* 427 */                                                   abstractC1370hM4753a = m4753a(activity);
/* 431 */                                                   z = false;
                                                        } else {
/* 436 */                                                   AtomicReference atomicReference = new AtomicReference(null);
/* 439 */                                                   TimeUnit timeUnit3 = timeUnit;
/* 443 */                                                   CountDownLatch countDownLatch2 = new CountDownLatch(1);
                                                            try {
/* 453 */                                                       activity.runOnUiThread(new RunnableC2301vo(this, atomicReference, activity, countDownLatch2, 4));
/* 462 */                                                       if (countDownLatch2.await(2000L, timeUnit3)) {
/* 485 */                                                           z = false;
/* 490 */                                                           abstractC1370hM4753a = (AbstractC1370h) atomicReference.get();
                                                                } else {
/* 472 */                                                           z = false;
                                                                    try {
/* 475 */                                                               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "Timed out waiting for view hierarchy capture on main thread", new Object[0]);
                                                                    } catch (Throwable th7) {
/* 480 */                                                               th = th7;
/* 501 */                                                               sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to capture view hierarchy", th);
                                                                    }
/* 478 */                                                           abstractC1370hM4753a = null;
                                                                }
                                                            } catch (Throwable th8) {
/* 482 */                                                       th = th8;
/* 483 */                                                       z = false;
                                                            }
                                                        }
/* 505 */                                               if (abstractC1370hM4753a == null) {
/* 507 */                                                   bitmap.recycle();
/* 510 */                                                   return c1393c5;
                                                        }
                                                        try {
/* 513 */                                                   C1351e c1351e = new C1351e();
                                                            try {
                                                                try {
                                                                    try {
/* 520 */                                                               if (bitmap.isMutable()) {
/* 558 */                                                                   bitmapCopy = bitmap;
                                                                        } else {
                                                                            try {
/* 525 */                                                                       bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
/* 529 */                                                                       if (bitmapCopy == null) {
                                                                                    try {
/* 531 */                                                                               bitmap.recycle();
                                                                                        try {
/* 534 */                                                                                   c1351e.close();
/* 537 */                                                                                   bitmap = null;
                                                                                        } catch (Throwable th9) {
/* 540 */                                                                                   th = th9;
/* 541 */                                                                                   bitmap2 = null;
/* 614 */                                                                                   sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to mask screenshot", th);
/* 617 */                                                                                   if (z) {
/* 625 */                                                                                       bitmapCopy.recycle();
                                                                                            }
/* 632 */                                                                                   if (!bitmap.isRecycled()) {
/* 634 */                                                                                       bitmap.recycle();
                                                                                            }
/* 637 */                                                                                   bitmap = bitmap2;
                                                                                        }
                                                                                    } catch (Throwable th10) {
/* 543 */                                                                               th = th10;
/* 544 */                                                                               z2 = z;
/* 545 */                                                                               bitmap2 = null;
/* 546 */                                                                               bitmap3 = bitmapCopy;
/* 547 */                                                                               th = th;
                                                                                        try {
/* 590 */                                                                                   c1351e.close();
/* 598 */                                                                                   throw th;
                                                                                        } catch (Throwable th11) {
/* 595 */                                                                                   th.addSuppressed(th11);
/* 598 */                                                                                   throw th;
                                                                                        }
                                                                                    }
                                                                                } else {
/* 549 */                                                                           z = true;
                                                                                }
/* 638 */                                                                       if (bitmap != null) {
/* 653 */                                                                           c1486i0.f11004d = new C1154a(new bh0(9, this, bitmap));
/* 657 */                                                                           c1486i0.m5275d(activity, "android:activity");
                                                                                }
                                                                            } catch (Throwable th12) {
/* 553 */                                                                       th = th12;
/* 554 */                                                                       z2 = z;
/* 555 */                                                                       bitmap3 = bitmap;
/* 556 */                                                                       bitmap2 = null;
/* 590 */                                                                       c1351e.close();
/* 598 */                                                                       throw th;
                                                                            }
                                                                        }
/* 578 */                                                               c1351e.close();
/* 581 */                                                               bitmap = bitmapCopy;
                                                                    } catch (Throwable th13) {
/* 583 */                                                               th = th13;
/* 614 */                                                               sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to mask screenshot", th);
/* 617 */                                                               if (z && !bitmapCopy.isRecycled()) {
/* 625 */                                                                   bitmapCopy.recycle();
                                                                        }
/* 632 */                                                               if (!bitmap.isRecycled()) {
/* 634 */                                                                   bitmap.recycle();
                                                                        }
/* 637 */                                                               bitmap = bitmap2;
                                                                    }
/* 560 */                                                           c1351e.m5036c(bitmapCopy, abstractC1370hM4753a, null);
/* 563 */                                                           if (z && !bitmap.isRecycled()) {
/* 571 */                                                               bitmap.recycle();
                                                                    }
/* 638 */                                                           if (bitmap != null) {
/* 653 */                                                               c1486i0.f11004d = new C1154a(new bh0(9, this, bitmap));
/* 657 */                                                               c1486i0.m5275d(activity, "android:activity");
                                                                    }
                                                                } catch (Throwable th14) {
/* 575 */                                                           th = th14;
/* 576 */                                                           z2 = z;
/* 546 */                                                           bitmap3 = bitmapCopy;
/* 547 */                                                           th = th;
/* 590 */                                                           c1351e.close();
/* 598 */                                                           throw th;
                                                                }
/* 550 */                                                       bitmap2 = null;
                                                            } catch (Throwable th15) {
/* 586 */                                                       bitmap2 = null;
/* 587 */                                                       th = th15;
/* 588 */                                                       z2 = z;
/* 589 */                                                       bitmap3 = bitmap;
                                                            }
                                                        } catch (Throwable th16) {
/* 603 */                                                   th = th16;
/* 604 */                                                   bitmap2 = null;
/* 605 */                                                   bitmapCopy = bitmap;
                                                        }
                                                    } else {
/* 653 */                                               c1486i0.f11004d = new C1154a(new bh0(9, this, bitmap));
/* 657 */                                               c1486i0.m5275d(activity, "android:activity");
                                                    }
                                                }
                                            }
                                        }
/* 156 */                               timeUnit = timeUnit2;
                                    }
/* 157 */                           bitmap = null;
/* 397 */                           if (bitmap != null) {
/* 413 */                               if (((CopyOnWriteArraySet) sentryAndroidOptions.getScreenshot().f17000a).isEmpty()) {
/* 653 */                                   c1486i0.f11004d = new C1154a(new bh0(9, this, bitmap));
/* 657 */                                   c1486i0.m5275d(activity, "android:activity");
                                        } else {
/* 653 */                                   c1486i0.f11004d = new C1154a(new bh0(9, this, bitmap));
/* 657 */                                   c1486i0.m5275d(activity, "android:activity");
                                        }
                                    }
                                }
                            }
                        } else if (!this.f9876e.getAndSet(true)) {
/* 73 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "Screenshot masking requires sentry-android-replay module", new Object[0]);
/* 76 */                    return c1393c5;
                        }
                    }
/* 660 */           return c1393c5;
                }

                @Override // io.sentry.InterfaceC1388c0
                /* JADX INFO: renamed from: g */
                public final C1600f0 mo4755g(C1600f0 c1600f0, C1486i0 c1486i0) {
/* 1 */             return c1600f0;
                }
            }
