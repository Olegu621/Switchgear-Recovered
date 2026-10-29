            package io.flutter.embedding.android;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.ColorSpace;
            import android.graphics.Paint;
            import android.hardware.HardwareBuffer;
            import android.media.Image;
            import android.media.ImageReader;
            import android.os.Build;
            import android.util.AttributeSet;
            import android.view.Surface;
            import android.view.View;
            import io.flutter.Log;
            import io.flutter.embedding.engine.renderer.FlutterRenderer;
            import io.flutter.embedding.engine.renderer.RenderSurface;
            import java.nio.ByteBuffer;
            import java.util.Locale;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public class FlutterImageView extends View implements RenderSurface {
                private static final String TAG = "FlutterImageView";
                private Bitmap currentBitmap;
                private Image currentImage;
                private FlutterRenderer flutterRenderer;
                private ImageReader imageReader;
                private boolean isAttachedToFlutterRenderer;
                private SurfaceKind kind;

                /* JADX INFO: renamed from: io.flutter.embedding.android.FlutterImageView$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static /* synthetic */ class C10411 {

                    /* JADX INFO: renamed from: $SwitchMap$io$flutter$embedding$android$FlutterImageView$SurfaceKind */
                    static final /* synthetic */ int[] f9736x435d6649;

                    static {
/* 6 */                 int[] iArr = new int[SurfaceKind.values().length];
/* 8 */                 f9736x435d6649 = iArr;
                        try {
/* 17 */                    iArr[SurfaceKind.background.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 28 */                    f9736x435d6649[SurfaceKind.overlay.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum SurfaceKind {
                    background,
                    overlay
                }

                public FlutterImageView(Context context, ImageReader imageReader, SurfaceKind surfaceKind) {
/* 2 */             super(context, null);
/* 6 */             this.isAttachedToFlutterRenderer = false;
/* 8 */             this.imageReader = imageReader;
/* 10 */            this.kind = surfaceKind;
/* 12 */            init();
                }

                private void closeCurrentImage() {
/* 1 */             Image image = this.currentImage;
/* 3 */             if (image != null) {
/* 5 */                 image.close();
/* 9 */                 this.currentImage = null;
                    }
                }

                private static ImageReader createImageReader(int i, int i2) {
/* 2 */             if (i <= 0) {
/* 14 */                logW("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i));
/* 17 */                i = 1;
                    }
/* 18 */            if (i2 <= 0) {
/* 30 */                logW("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i2));
/* 33 */                i2 = 1;
                    }
                    return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i, i2, 1, 3, 768L) : ImageReader.newInstance(i, i2, 1, 3);
                }

                private void init() {
/* 2 */             setAlpha(0.0f);
                }

                private static void logW(String str, Object... objArr) {
/* 9 */             Log.m4591w(TAG, String.format(Locale.US, str, objArr));
                }

                private void updateCurrentBitmap() {
/* 1 */             int i = Build.VERSION.SDK_INT;
/* 3 */             Image image = this.currentImage;
/* 7 */             if (i >= 29) {
/* 1 */                 HardwareBuffer hardwareBuffer = image.getHardwareBuffer();
/* 1 */                 ColorSpace.Named unused = ColorSpace.Named.SRGB;
/* 24 */                this.currentBitmap = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
/* 1 */                 hardwareBuffer.close();
/* 29 */                return;
                    }
/* 30 */            Image.Plane[] planes = image.getPlanes();
/* 36 */            if (planes.length != 1) {
/* 38 */                return;
                    }
/* 40 */            Image.Plane plane = planes[0];
/* 50 */            int rowStride = plane.getRowStride() / plane.getPixelStride();
/* 53 */            int height = this.currentImage.getHeight();
/* 57 */            Bitmap bitmap = this.currentBitmap;
/* 59 */            if (bitmap == null || bitmap.getWidth() != rowStride || this.currentBitmap.getHeight() != height) {
/* 81 */                this.currentBitmap = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
/* 83 */            ByteBuffer buffer = plane.getBuffer();
/* 87 */            buffer.rewind();
/* 92 */            this.currentBitmap.copyPixelsFromBuffer(buffer);
                }

                public boolean acquireLatestImage() {
/* 4 */             if (!this.isAttachedToFlutterRenderer) {
/* 3 */                 return false;
                    }
/* 9 */             Image imageAcquireLatestImage = this.imageReader.acquireLatestImage();
/* 13 */            if (imageAcquireLatestImage != null) {
/* 15 */                closeCurrentImage();
/* 18 */                this.currentImage = imageAcquireLatestImage;
/* 20 */                invalidate();
                    }
                    return imageAcquireLatestImage != null;
                }

                @Override // io.flutter.embedding.engine.renderer.RenderSurface
                public void attachToRenderer(FlutterRenderer flutterRenderer) {
/* 12 */            if (C10411.f9736x435d6649[this.kind.ordinal()] == 1) {
/* 21 */                flutterRenderer.swapSurface(this.imageReader.getSurface());
                    }
/* 26 */            setAlpha(1.0f);
/* 29 */            this.flutterRenderer = flutterRenderer;
/* 31 */            this.isAttachedToFlutterRenderer = true;
                }

                public void closeImageReader() {
/* 3 */             this.imageReader.close();
                }

                @Override // io.flutter.embedding.engine.renderer.RenderSurface
                public void detachFromRenderer() {
/* 3 */             if (this.isAttachedToFlutterRenderer) {
/* 7 */                 setAlpha(0.0f);
/* 10 */                acquireLatestImage();
/* 14 */                this.currentBitmap = null;
/* 16 */                closeCurrentImage();
/* 19 */                invalidate();
/* 23 */                this.isAttachedToFlutterRenderer = false;
                    }
                }

                @Override // io.flutter.embedding.engine.renderer.RenderSurface
                public FlutterRenderer getAttachedRenderer() {
/* 1 */             return this.flutterRenderer;
                }

                public ImageReader getImageReader() {
/* 1 */             return this.imageReader;
                }

                public Surface getSurface() {
/* 3 */             return this.imageReader.getSurface();
                }

                @Override // android.view.View
                public void onDraw(Canvas canvas) {
/* 1 */             super.onDraw(canvas);
/* 6 */             if (this.currentImage != null) {
/* 8 */                 updateCurrentBitmap();
                    }
/* 11 */            Bitmap bitmap = this.currentBitmap;
/* 13 */            if (bitmap != null) {
/* 17 */                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    }
                }

                @Override // android.view.View
                public void onSizeChanged(int i, int i2, int i3, int i4) {
/* 7 */             if (!(i == this.imageReader.getWidth() && i2 == this.imageReader.getHeight()) && this.kind == SurfaceKind.background && this.isAttachedToFlutterRenderer) {
/* 28 */                resizeIfNeeded(i, i2);
/* 39 */                this.flutterRenderer.swapSurface(this.imageReader.getSurface());
                    }
                }

                @Override // io.flutter.embedding.engine.renderer.RenderSurface
                public void pause() {
                }

                public void resizeIfNeeded(int i, int i2) {
/* 3 */             if (this.flutterRenderer == null) {
/* 22 */                return;
                    }
/* 12 */            if (i == this.imageReader.getWidth() && i2 == this.imageReader.getHeight()) {
/* 22 */                return;
                    }
/* 23 */            closeCurrentImage();
/* 26 */            closeImageReader();
/* 33 */            this.imageReader = createImageReader(i, i2);
                }

                @Override // io.flutter.embedding.engine.renderer.RenderSurface
                public void resume() {
                }

/* 15 */        public FlutterImageView(Context context) {
/* 16 */            this(context, 1, 1, SurfaceKind.background);
                }

/* 16 */        public FlutterImageView(Context context, AttributeSet attributeSet) {
/* 17 */            this(context, 1, 1, SurfaceKind.background);
                }

/* 17 */        public FlutterImageView(Context context, int i, int i2, SurfaceKind surfaceKind) {
/* 18 */            this(context, createImageReader(i, i2), surfaceKind);
                }
            }
