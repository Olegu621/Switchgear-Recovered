            package com.supercell.titan;

            import android.graphics.Bitmap;
            import android.os.Handler;
            import android.os.Looper;
            import android.view.PixelCopy;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AndroidScreenshotUtility {
                /* JADX INFO: renamed from: a */
                public static byte[] m2719a(final Bitmap.CompressFormat compressFormat, final int i, int i2) {
/* 5 */             final GL2JNISurfaceView view = GameApp.getInstance().getView();
/* 9 */             int width = view.getWidth();
/* 13 */            int height = view.getHeight();
/* 18 */            if (width <= 0 || height <= 0) {
/* 17 */                return null;
                    }
/* 23 */            int iMax = Math.max(width, height);
/* 28 */            if (i2 > 0 && iMax > i2) {
/* 34 */                double d = ((double) i2) / ((double) iMax);
/* 42 */                width = Math.max(1, (int) Math.round(((double) width) * d));
/* 53 */                height = Math.max(1, (int) Math.round(((double) height) * d));
                    }
/* 59 */            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
/* 65 */            final CountDownLatch countDownLatch = new CountDownLatch(1);
/* 68 */            final byte[][] bArr = new byte[1][];
/* 70 */            final boolean[] zArr = new boolean[1];
/* 88 */            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o8
                        @Override // java.lang.Runnable
                        public final void run() {
/* 3 */                     final Bitmap bitmap = bitmapCreateBitmap;
/* 5 */                     final Bitmap.CompressFormat compressFormat2 = compressFormat;
/* 7 */                     final int i3 = i;
/* 9 */                     final byte[][] bArr2 = bArr;
/* 11 */                    final boolean[] zArr2 = zArr;
/* 13 */                    final CountDownLatch countDownLatch2 = countDownLatch;
/* 29 */                    PixelCopy.request(view, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: p8
                                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                public final void onPixelCopyFinished(int i4) {
/* 1 */                             Bitmap bitmap2 = bitmap;
/* 3 */                             Bitmap.CompressFormat compressFormat3 = compressFormat2;
/* 5 */                             int i5 = i3;
/* 7 */                             byte[][] bArr3 = bArr2;
/* 10 */                            if (i4 == 0) {
                                        try {
/* 14 */                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            try {
/* 21 */                                        if (bitmap2.compress(compressFormat3, i5, byteArrayOutputStream)) {
/* 27 */                                            bArr3[0] = byteArrayOutputStream.toByteArray();
                                                }
/* 32 */                                        byteArrayOutputStream.close();
                                            } catch (Throwable th) {
                                                try {
/* 36 */                                            byteArrayOutputStream.close();
                                                } catch (Throwable th2) {
/* 41 */                                            th.addSuppressed(th2);
                                                }
/* 44 */                                        throw th;
                                            }
                                        } catch (IOException e) {
/* 46 */                                    ds0.m3199p(e);
/* 49 */                                    return;
                                        }
                                    }
/* 53 */                            zArr2[0] = true;
/* 57 */                            countDownLatch2.countDown();
                                }
                            }, new Handler(Looper.getMainLooper()));
                        }
                    });
                    try {
/* 95 */                countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                    }
/* 101 */           if (zArr[0]) {
/* 103 */               return bArr[0];
                    }
/* 17 */            return null;
                }

                public static byte[] takeScreenshotJPG(int i, int i2) {
/* 3 */             return m2719a(Bitmap.CompressFormat.JPEG, i2, i);
                }

                public static byte[] takeScreenshotPNG(int i, int i2) {
/* 3 */             return m2719a(Bitmap.CompressFormat.PNG, i2, i);
                }
            }
