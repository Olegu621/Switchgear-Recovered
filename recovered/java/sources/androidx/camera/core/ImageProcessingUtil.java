            package androidx.camera.core;

            import android.graphics.Bitmap;
            import android.media.Image;
            import android.media.ImageWriter;
            import android.util.Log;
            import android.view.Surface;
            import java.nio.ByteBuffer;
            import java.util.Locale;
            import p000.hu0;
            import p000.kw0;
            import p000.mw0;
            import p000.ow0;
            import p000.vv0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class ImageProcessingUtil {

                /* JADX INFO: renamed from: a */
                public static int f808a;

                static {
/* 3 */             System.loadLibrary("image_processing_util_jni");
                }

                /* JADX INFO: renamed from: a */
                public static void m445a(mw0 mw0Var) {
/* 7 */             if (!m448d(mw0Var)) {
/* 11 */                hu0.m4325T("ImageProcessingUtil", "Unsupported format for YUV to RGB");
/* 14 */                return;
                    }
/* 15 */            int width = mw0Var.getWidth();
/* 19 */            int height = mw0Var.getHeight();
/* 30 */            int iMo3991b = mw0Var.mo1726j()[0].mo3991b();
/* 41 */            int iMo3991b2 = mw0Var.mo1726j()[1].mo3991b();
/* 52 */            int iMo3991b3 = mw0Var.mo1726j()[2].mo3991b();
/* 62 */            int iMo3997j = mw0Var.mo1726j()[0].mo3997j();
/* 72 */            int iMo3997j2 = mw0Var.mo1726j()[1].mo3997j();
/* 113 */           if (nativeShiftPixel(mw0Var.mo1726j()[0].getBuffer(), iMo3991b, mw0Var.mo1726j()[1].getBuffer(), iMo3991b2, mw0Var.mo1726j()[2].getBuffer(), iMo3991b3, iMo3997j, iMo3997j2, width, height, iMo3997j, iMo3997j2, iMo3997j2) != 0) {
/* 117 */               hu0.m4325T("ImageProcessingUtil", "One pixel shift for YUV failure");
                    }
                }

                /* JADX INFO: renamed from: b */
                public static vv0 m446b(mw0 mw0Var, ow0 ow0Var, ByteBuffer byteBuffer, int i, boolean z) {
/* 11 */            if (!m448d(mw0Var)) {
/* 15 */                hu0.m4325T("ImageProcessingUtil", "Unsupported format for YUV to RGB");
/* 7 */                 return null;
                    }
/* 19 */            System.currentTimeMillis();
/* 22 */            if (i != 0 && i != 90 && i != 180 && i != 270) {
/* 39 */                hu0.m4325T("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
/* 7 */                 return null;
                    }
/* 43 */            Surface surface = ow0Var.getSurface();
/* 47 */            int width = mw0Var.getWidth();
/* 51 */            int height = mw0Var.getHeight();
/* 62 */            int iMo3991b = mw0Var.mo1726j()[0].mo3991b();
/* 74 */            int iMo3991b2 = mw0Var.mo1726j()[1].mo3991b();
/* 85 */            int iMo3991b3 = mw0Var.mo1726j()[2].mo3991b();
/* 95 */            int iMo3997j = mw0Var.mo1726j()[0].mo3997j();
/* 105 */           int iMo3997j2 = mw0Var.mo1726j()[1].mo3997j();
/* 170 */           if (nativeConvertAndroid420ToABGR(mw0Var.mo1726j()[0].getBuffer(), iMo3991b, mw0Var.mo1726j()[1].getBuffer(), iMo3991b2, mw0Var.mo1726j()[2].getBuffer(), iMo3991b3, iMo3997j, iMo3997j2, surface, byteBuffer, width, height, z ? iMo3997j : 0, z ? iMo3997j2 : 0, z ? iMo3997j2 : 0, i) != 0) {
/* 174 */               hu0.m4325T("ImageProcessingUtil", "YUV to RGB conversion failure");
/* 7 */                 return null;
                    }
/* 185 */           if (Log.isLoggable("MH", 3)) {
/* 187 */               Locale locale = Locale.US;
/* 189 */               System.currentTimeMillis();
/* 192 */               hu0.m4312F0("ImageProcessingUtil");
/* 199 */               f808a++;
                    }
/* 201 */           mw0 mw0VarAcquireLatestImage = ow0Var.acquireLatestImage();
/* 205 */           if (mw0VarAcquireLatestImage == null) {
/* 209 */               hu0.m4325T("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
/* 7 */                 return null;
                    }
/* 215 */           vv0 vv0Var = new vv0(mw0VarAcquireLatestImage);
/* 226 */           vv0Var.m1725c(new kw0(mw0VarAcquireLatestImage, mw0Var, 0));
/* 229 */           return vv0Var;
                }

                /* JADX INFO: renamed from: c */
                public static void m447c(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
/* 17 */            nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
                }

                /* JADX INFO: renamed from: d */
                public static boolean m448d(mw0 mw0Var) {
                    return mw0Var.getFormat() == 35 && mw0Var.mo1726j().length == 3;
                }

                /* JADX INFO: renamed from: e */
                public static vv0 m449e(mw0 mw0Var, ow0 ow0Var, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
                    String str;
/* 11 */            if (!m448d(mw0Var)) {
/* 15 */                hu0.m4325T("ImageProcessingUtil", "Unsupported format for rotate YUV");
/* 7 */                 return null;
                    }
/* 19 */            if (i != 0 && i != 90 && i != 180 && i != 270) {
/* 36 */                hu0.m4325T("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
/* 7 */                 return null;
                    }
/* 40 */            if (i > 0) {
/* 42 */                int width = mw0Var.getWidth();
/* 46 */                int height = mw0Var.getHeight();
/* 57 */                int iMo3991b = mw0Var.mo1726j()[0].mo3991b();
/* 68 */                int iMo3991b2 = mw0Var.mo1726j()[1].mo3991b();
/* 79 */                int iMo3991b3 = mw0Var.mo1726j()[2].mo3991b();
/* 89 */                int iMo3997j = mw0Var.mo1726j()[1].mo3997j();
/* 93 */                Image imageDequeueInputImage = imageWriter.dequeueInputImage();
/* 97 */                if (imageDequeueInputImage != null && nativeRotateYUV(mw0Var.mo1726j()[0].getBuffer(), iMo3991b, mw0Var.mo1726j()[1].getBuffer(), iMo3991b2, mw0Var.mo1726j()[2].getBuffer(), iMo3991b3, iMo3997j, imageDequeueInputImage.getPlanes()[0].getBuffer(), imageDequeueInputImage.getPlanes()[0].getRowStride(), imageDequeueInputImage.getPlanes()[0].getPixelStride(), imageDequeueInputImage.getPlanes()[1].getBuffer(), imageDequeueInputImage.getPlanes()[1].getRowStride(), imageDequeueInputImage.getPlanes()[1].getPixelStride(), imageDequeueInputImage.getPlanes()[2].getBuffer(), imageDequeueInputImage.getPlanes()[2].getRowStride(), imageDequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i) == 0) {
/* 263 */                   imageWriter.queueInputImage(imageDequeueInputImage);
/* 266 */                   mw0 mw0VarAcquireLatestImage = ow0Var.acquireLatestImage();
/* 270 */                   if (mw0VarAcquireLatestImage == null) {
/* 276 */                       hu0.m4325T("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
/* 7 */                         return null;
                            }
/* 282 */                   vv0 vv0Var = new vv0(mw0VarAcquireLatestImage);
/* 293 */                   vv0Var.m1725c(new kw0(mw0VarAcquireLatestImage, mw0Var, 1));
/* 296 */                   return vv0Var;
                        }
/* 9 */                 str = "ImageProcessingUtil";
                    } else {
/* 9 */                 str = "ImageProcessingUtil";
                    }
/* 299 */           hu0.m4325T(str, "rotate YUV failure");
/* 7 */             return null;
                }

                /* JADX INFO: renamed from: f */
                public static void m450f(byte[] bArr, Surface surface) {
/* 1 */             surface.getClass();
/* 8 */             if (nativeWriteJpegToSurface(bArr, surface) != 0) {
/* 14 */                hu0.m4325T("ImageProcessingUtil", "Failed to enqueue JPEG image.");
                    }
                }

                private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

                private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

                private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i10, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i11, int i12, int i13);

                private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

                private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
            }
