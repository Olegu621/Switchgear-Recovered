            package io.sentry.android.core.internal.util;

            import android.graphics.Bitmap;
            import android.os.Handler;
            import android.view.PixelCopy;
            import android.view.Surface;
            import android.view.SurfaceHolder;
            import android.view.SurfaceView;
            import android.view.View;
            import io.sentry.C1637q6;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.replay.screenshot.C1342h;
            import io.sentry.android.replay.util.RunnableC1354h;
            import io.sentry.android.replay.viewhierarchy.AbstractC1370h;
            import io.sentry.android.replay.viewhierarchy.C1368f;
            import io.sentry.config.AbstractC1417a;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicInteger;
            import p000.cd1;
            import p000.gp2;
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.util.l */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class PixelCopyOnPixelCopyFinishedListenerC1225l implements PixelCopy.OnPixelCopyFinishedListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10180a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f10181b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f10182c;

                public /* synthetic */ PixelCopyOnPixelCopyFinishedListenerC1225l(int i, Object obj, Object obj2) {
/* 1 */             this.f10180a = i;
/* 3 */             this.f10181b = obj;
/* 5 */             this.f10182c = obj2;
                }

                /* JADX WARN: Code duplicated, block: B:75:0x0188  */
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i) {
                    char c;
                    char c2;
                    AtomicInteger atomicInteger;
                    AbstractC1370h abstractC1370h;
                    boolean z;
                    final int i2;
                    final int i3;
                    final View view;
                    final Bitmap bitmapCreateBitmap;
                    SurfaceHolder holder;
/* 3 */             int i4 = this.f10180a;
/* 5 */             char c3 = 0;
/* 6 */             char c4 = 1;
/* 7 */             Object obj = this.f10182c;
/* 9 */             Object obj2 = this.f10181b;
                    switch (i4) {
                        case 0:
/* 456 */                   CountDownLatch countDownLatch = (CountDownLatch) obj;
/* 465 */                   ((AtomicBoolean) obj2).set(i == 0);
/* 468 */                   countDownLatch.countDown();
                            break;
                        default:
/* 15 */                    final C1342h c1342h = (C1342h) obj2;
/* 18 */                    View view2 = (View) obj;
/* 20 */                    AtomicBoolean atomicBoolean = c1342h.f10624m;
/* 22 */                    AtomicBoolean atomicBoolean2 = c1342h.f10620i;
/* 24 */                    AtomicInteger atomicInteger2 = c1342h.f10623l;
/* 26 */                    SentryAndroidOptions sentryAndroidOptions = c1342h.f10613b;
/* 32 */                    if (atomicBoolean.get()) {
/* 44 */                        sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "PixelCopyStrategy is closed, ignoring capture result", new Object[0]);
                            } else if (i == 0) {
/* 80 */                        boolean z2 = c1342h.f10622k.get();
/* 84 */                        if (z2 && atomicInteger2.incrementAndGet() <= 1) {
/* 102 */                           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
/* 105 */                           atomicBoolean2.set(false);
                                } else {
/* 110 */                           C1637q6 sessionReplay = sentryAndroidOptions.getSessionReplay();
/* 114 */                           sessionReplay.getClass();
/* 118 */                           AbstractC1370h abstractC1370hM5171i = AbstractC1417a.m5171i(view2, null, sessionReplay);
/* 136 */                           ArrayList arrayList = sentryAndroidOptions.getSessionReplay().f11538o ? new ArrayList() : null;
/* 137 */                           C1637q6 sessionReplay2 = sentryAndroidOptions.getSessionReplay();
/* 141 */                           sessionReplay2.getClass();
/* 144 */                           ILogger logger = sentryAndroidOptions.getLogger();
/* 148 */                           logger.getClass();
/* 151 */                           AbstractC1417a.m5182v(view2, abstractC1370hM5171i, sessionReplay2, logger, arrayList);
/* 154 */                           if (arrayList == null || arrayList.isEmpty()) {
/* 446 */                               c1342h.f10616e.submit(new RunnableC1354h(new gp2(c1342h, view2, abstractC1370hM5171i, z2), "screenshot_recorder.mask"));
                                    } else {
/* 167 */                               c1342h.f10615d.invoke();
/* 170 */                               boolean z3 = !z2;
/* 172 */                               int[] iArr = c1342h.f10630s;
/* 174 */                               int[] iArr2 = c1342h.f10629r;
/* 176 */                               view2.getLocationOnScreen(iArr2);
/* 179 */                               int i5 = iArr2[0];
/* 181 */                               int i6 = iArr2[1];
/* 187 */                               final cd1[] cd1VarArr = new cd1[arrayList.size()];
/* 189 */                               final boolean z4 = z3;
/* 197 */                               final AtomicInteger atomicInteger3 = new AtomicInteger(arrayList.size());
/* 200 */                               Iterator it = arrayList.iterator();
/* 204 */                               final AbstractC1370h abstractC1370h2 = abstractC1370hM5171i;
/* 205 */                               final int i7 = 0;
/* 210 */                               while (it.hasNext()) {
/* 212 */                                   int i8 = i7 + 1;
/* 226 */                                   SurfaceView surfaceView = (SurfaceView) ((C1368f) it.next()).f10686h.get();
/* 241 */                                   Surface surface = (surfaceView == null || (holder = surfaceView.getHolder()) == null) ? null : holder.getSurface();
/* 242 */                                   if (surfaceView == null || surface == null || !surface.isValid()) {
/* 252 */                                       c = c3;
/* 254 */                                       c2 = c4;
/* 256 */                                       sentryAndroidOptions = sentryAndroidOptions;
/* 257 */                                       iArr = iArr;
/* 258 */                                       atomicInteger = atomicInteger3;
/* 259 */                                       cd1VarArr = cd1VarArr;
/* 260 */                                       abstractC1370h = abstractC1370h2;
/* 261 */                                       z = z4;
/* 413 */                                       C1342h.m5023e(atomicInteger, c1342h, view2, cd1VarArr, abstractC1370h, i5, i6, z);
                                            } else {
                                                try {
/* 269 */                                           c = c3;
                                                    try {
/* 275 */                                               c2 = c4;
                                                        try {
/* 279 */                                                   bitmapCreateBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                                                            try {
/* 283 */                                                       surfaceView.getLocationOnScreen(iArr);
/* 286 */                                                       i2 = i5;
                                                                try {
/* 287 */                                                           final int i9 = iArr[c];
/* 289 */                                                           i3 = i6;
                                                                    try {
/* 291 */                                                               final int i10 = iArr[c2];
/* 293 */                                                               sentryAndroidOptions = sentryAndroidOptions;
                                                                        try {
/* 296 */                                                                   View view3 = view2;
/* 298 */                                                                   bitmapCreateBitmap = bitmapCreateBitmap;
/* 299 */                                                                   iArr = iArr;
/* 300 */                                                                   cd1VarArr = cd1VarArr;
/* 301 */                                                                   view = view3;
                                                                            try {
/* 307 */                                                                       atomicInteger = atomicInteger3;
                                                                                try {
/* 314 */                                                                           PixelCopy.request(surfaceView, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.d
                                                                                        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                                                                        public final void onPixelCopyFinished(int i11) {
/* 1 */                                                                                     C1342h c1342h2 = c1342h;
/* 5 */                                                                                     boolean z5 = c1342h2.f10624m.get();
/* 9 */                                                                                     Bitmap bitmap = bitmapCreateBitmap;
/* 11 */                                                                                    cd1[] cd1VarArr2 = cd1VarArr;
/* 14 */                                                                                    AtomicInteger atomicInteger4 = atomicInteger3;
/* 17 */                                                                                    View view4 = view;
/* 20 */                                                                                    AbstractC1370h abstractC1370h3 = abstractC1370h2;
/* 23 */                                                                                    int i12 = i2;
/* 26 */                                                                                    int i13 = i3;
/* 29 */                                                                                    boolean z6 = z4;
/* 31 */                                                                                    if (z5) {
/* 33 */                                                                                        bitmap.recycle();
/* 36 */                                                                                        C1342h.m5023e(atomicInteger4, c1342h2, view4, cd1VarArr2, abstractC1370h3, i12, i13, z6);
/* 39 */                                                                                        return;
                                                                                            }
/* 40 */                                                                                    if (i11 == 0) {
/* 53 */                                                                                        cd1VarArr2[i7] = new cd1(bitmap, i9, i10);
                                                                                            } else {
/* 56 */                                                                                        bitmap.recycle();
/* 77 */                                                                                        c1342h2.f10613b.getLogger().mo4672k(EnumC1553m5.INFO, "Failed to capture SurfaceView: %d", Integer.valueOf(i11));
                                                                                            }
/* 80 */                                                                                    C1342h.m5023e(atomicInteger4, c1342h2, view4, cd1VarArr2, abstractC1370h3, i12, i13, z6);
                                                                                        }
                                                                                    }, (Handler) c1342h.f10617f.f11662b);
/* 317 */                                                                           view2 = view;
                                                                                } catch (Throwable th) {
/* 320 */                                                                           th = th;
/* 388 */                                                                           sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.WARNING, "Failed to capture SurfaceView", th);
/* 391 */                                                                           if (bitmapCreateBitmap != null) {
/* 393 */                                                                               bitmapCreateBitmap.recycle();
                                                                                    }
/* 396 */                                                                           view2 = view;
/* 397 */                                                                           abstractC1370h = abstractC1370h2;
/* 398 */                                                                           i5 = i2;
/* 399 */                                                                           i6 = i3;
/* 401 */                                                                           z = z4;
/* 403 */                                                                           C1342h.m5023e(atomicInteger, c1342h, view2, cd1VarArr, abstractC1370h, i5, i6, z);
/* 406 */                                                                           abstractC1370h2 = abstractC1370h;
/* 407 */                                                                           i2 = i5;
/* 408 */                                                                           i3 = i6;
/* 410 */                                                                           z4 = z;
                                                                                }
                                                                            } catch (Throwable th2) {
/* 323 */                                                                       th = th2;
/* 324 */                                                                       atomicInteger = atomicInteger3;
/* 388 */                                                                       sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.WARNING, "Failed to capture SurfaceView", th);
/* 391 */                                                                       if (bitmapCreateBitmap != null) {
/* 393 */                                                                           bitmapCreateBitmap.recycle();
                                                                                }
/* 396 */                                                                       view2 = view;
/* 397 */                                                                       abstractC1370h = abstractC1370h2;
/* 398 */                                                                       i5 = i2;
/* 399 */                                                                       i6 = i3;
/* 401 */                                                                       z = z4;
/* 403 */                                                                       C1342h.m5023e(atomicInteger, c1342h, view2, cd1VarArr, abstractC1370h, i5, i6, z);
/* 406 */                                                                       abstractC1370h2 = abstractC1370h;
/* 407 */                                                                       i2 = i5;
/* 408 */                                                                       i3 = i6;
/* 410 */                                                                       z4 = z;
/* 417 */                                                                       atomicInteger3 = atomicInteger;
/* 418 */                                                                       cd1VarArr = cd1VarArr;
/* 419 */                                                                       i5 = i2;
/* 420 */                                                                       i6 = i3;
/* 422 */                                                                       i7 = i8;
/* 424 */                                                                       iArr = iArr;
/* 425 */                                                                       sentryAndroidOptions = sentryAndroidOptions;
/* 426 */                                                                       c3 = c;
/* 428 */                                                                       c4 = c2;
                                                                            }
                                                                        } catch (Throwable th3) {
/* 327 */                                                                   th = th3;
/* 328 */                                                                   View view4 = view2;
/* 329 */                                                                   bitmapCreateBitmap = bitmapCreateBitmap;
/* 330 */                                                                   iArr = iArr;
/* 331 */                                                                   cd1VarArr = cd1VarArr;
/* 332 */                                                                   view = view4;
                                                                        }
                                                                    } catch (Throwable th4) {
/* 334 */                                                               th = th4;
/* 335 */                                                               View view5 = view2;
/* 336 */                                                               bitmapCreateBitmap = bitmapCreateBitmap;
/* 337 */                                                               iArr = iArr;
/* 338 */                                                               cd1VarArr = cd1VarArr;
/* 339 */                                                               view = view5;
/* 340 */                                                               sentryAndroidOptions = sentryAndroidOptions;
                                                                    }
                                                                } catch (Throwable th5) {
/* 342 */                                                           th = th5;
/* 347 */                                                           view = view2;
/* 349 */                                                           i3 = i6;
/* 324 */                                                           atomicInteger = atomicInteger3;
/* 388 */                                                           sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.WARNING, "Failed to capture SurfaceView", th);
/* 391 */                                                           if (bitmapCreateBitmap != null) {
/* 393 */                                                               bitmapCreateBitmap.recycle();
                                                                    }
/* 396 */                                                           view2 = view;
/* 397 */                                                           abstractC1370h = abstractC1370h2;
/* 398 */                                                           i5 = i2;
/* 399 */                                                           i6 = i3;
/* 401 */                                                           z = z4;
/* 403 */                                                           C1342h.m5023e(atomicInteger, c1342h, view2, cd1VarArr, abstractC1370h, i5, i6, z);
/* 406 */                                                           abstractC1370h2 = abstractC1370h;
/* 407 */                                                           i2 = i5;
/* 408 */                                                           i3 = i6;
/* 410 */                                                           z4 = z;
/* 417 */                                                           atomicInteger3 = atomicInteger;
/* 418 */                                                           cd1VarArr = cd1VarArr;
/* 419 */                                                           i5 = i2;
/* 420 */                                                           i6 = i3;
/* 422 */                                                           i7 = i8;
/* 424 */                                                           iArr = iArr;
/* 425 */                                                           sentryAndroidOptions = sentryAndroidOptions;
/* 426 */                                                           c3 = c;
/* 428 */                                                           c4 = c2;
                                                                }
                                                            } catch (Throwable th6) {
/* 352 */                                                       th = th6;
/* 357 */                                                       view = view2;
/* 359 */                                                       i2 = i5;
                                                            }
                                                        } catch (Throwable th7) {
/* 361 */                                                   th = th7;
/* 362 */                                                   sentryAndroidOptions = sentryAndroidOptions;
/* 363 */                                                   iArr = iArr;
/* 364 */                                                   i2 = i5;
/* 365 */                                                   i3 = i6;
/* 367 */                                                   atomicInteger = atomicInteger3;
/* 368 */                                                   cd1VarArr = cd1VarArr;
/* 369 */                                                   view = view2;
/* 370 */                                                   bitmapCreateBitmap = null;
/* 388 */                                                   sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.WARNING, "Failed to capture SurfaceView", th);
/* 391 */                                                   if (bitmapCreateBitmap != null) {
/* 393 */                                                       bitmapCreateBitmap.recycle();
                                                            }
/* 396 */                                                   view2 = view;
/* 397 */                                                   abstractC1370h = abstractC1370h2;
/* 398 */                                                   i5 = i2;
/* 399 */                                                   i6 = i3;
/* 401 */                                                   z = z4;
/* 403 */                                                   C1342h.m5023e(atomicInteger, c1342h, view2, cd1VarArr, abstractC1370h, i5, i6, z);
/* 406 */                                                   abstractC1370h2 = abstractC1370h;
/* 407 */                                                   i2 = i5;
/* 408 */                                                   i3 = i6;
/* 410 */                                                   z4 = z;
/* 417 */                                                   atomicInteger3 = atomicInteger;
/* 418 */                                                   cd1VarArr = cd1VarArr;
/* 419 */                                                   i5 = i2;
/* 420 */                                                   i6 = i3;
/* 422 */                                                   i7 = i8;
/* 424 */                                                   iArr = iArr;
/* 425 */                                                   sentryAndroidOptions = sentryAndroidOptions;
/* 426 */                                                   c3 = c;
/* 428 */                                                   c4 = c2;
                                                        }
                                                    } catch (Throwable th8) {
/* 372 */                                               th = th8;
/* 373 */                                               c2 = c4;
/* 362 */                                               sentryAndroidOptions = sentryAndroidOptions;
/* 363 */                                               iArr = iArr;
/* 364 */                                               i2 = i5;
/* 365 */                                               i3 = i6;
/* 367 */                                               atomicInteger = atomicInteger3;
/* 368 */                                               cd1VarArr = cd1VarArr;
/* 369 */                                               view = view2;
/* 370 */                                               bitmapCreateBitmap = null;
/* 388 */                                               sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.WARNING, "Failed to capture SurfaceView", th);
/* 391 */                                               if (bitmapCreateBitmap != null) {
/* 393 */                                                   bitmapCreateBitmap.recycle();
                                                        }
/* 396 */                                               view2 = view;
/* 397 */                                               abstractC1370h = abstractC1370h2;
/* 398 */                                               i5 = i2;
/* 399 */                                               i6 = i3;
/* 401 */                                               z = z4;
/* 403 */                                               C1342h.m5023e(atomicInteger, c1342h, view2, cd1VarArr, abstractC1370h, i5, i6, z);
/* 406 */                                               abstractC1370h2 = abstractC1370h;
/* 407 */                                               i2 = i5;
/* 408 */                                               i3 = i6;
/* 410 */                                               z4 = z;
/* 417 */                                               atomicInteger3 = atomicInteger;
/* 418 */                                               cd1VarArr = cd1VarArr;
/* 419 */                                               i5 = i2;
/* 420 */                                               i6 = i3;
/* 422 */                                               i7 = i8;
/* 424 */                                               iArr = iArr;
/* 425 */                                               sentryAndroidOptions = sentryAndroidOptions;
/* 426 */                                               c3 = c;
/* 428 */                                               c4 = c2;
                                                    }
                                                } catch (Throwable th9) {
/* 376 */                                           th = th9;
/* 377 */                                           c = c3;
                                                }
/* 417 */                                       atomicInteger3 = atomicInteger;
/* 418 */                                       cd1VarArr = cd1VarArr;
/* 419 */                                       i5 = i2;
/* 420 */                                       i6 = i3;
/* 422 */                                       i7 = i8;
/* 424 */                                       iArr = iArr;
/* 425 */                                       sentryAndroidOptions = sentryAndroidOptions;
/* 426 */                                       c3 = c;
/* 428 */                                       c4 = c2;
                                            }
/* 406 */                                   abstractC1370h2 = abstractC1370h;
/* 407 */                                   i2 = i5;
/* 408 */                                   i3 = i6;
/* 410 */                                   z4 = z;
/* 417 */                                   atomicInteger3 = atomicInteger;
/* 418 */                                   cd1VarArr = cd1VarArr;
/* 419 */                                   i5 = i2;
/* 420 */                                   i6 = i3;
/* 422 */                                   i7 = i8;
/* 424 */                                   iArr = iArr;
/* 425 */                                   sentryAndroidOptions = sentryAndroidOptions;
/* 426 */                                   c3 = c;
/* 428 */                                   c4 = c2;
                                        }
                                    }
                                }
                            } else {
/* 67 */                        sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i));
/* 70 */                        atomicInteger2.set(0);
/* 73 */                        atomicBoolean2.set(false);
                            }
                            break;
                    }
                }
            }
