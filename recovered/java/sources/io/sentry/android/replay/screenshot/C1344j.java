            package io.sentry.android.replay.screenshot;

            import android.graphics.Bitmap;
            import android.graphics.BitmapShader;
            import android.graphics.BlendMode;
            import android.graphics.Canvas;
            import android.graphics.Color;
            import android.graphics.ColorFilter;
            import android.graphics.DrawFilter;
            import android.graphics.Matrix;
            import android.graphics.Mesh;
            import android.graphics.NinePatch;
            import android.graphics.Paint;
            import android.graphics.Path;
            import android.graphics.Picture;
            import android.graphics.PorterDuff;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.graphics.Region;
            import android.graphics.RenderNode;
            import android.graphics.Shader;
            import android.graphics.fonts.Font;
            import android.graphics.text.MeasuredText;
            import android.os.Build;
            import java.util.WeakHashMap;
            import kotlin.Pair;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.screenshot.j */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public final class C1344j extends Canvas {

                /* JADX INFO: renamed from: a */
                public Canvas f10631a;

                /* JADX INFO: renamed from: b */
                public final Paint f10632b = new Paint();

                /* JADX INFO: renamed from: c */
                public final Paint f10633c = new Paint();

                /* JADX INFO: renamed from: d */
                public final Rect f10634d = new Rect();

                /* JADX INFO: renamed from: e */
                public final Bitmap f10635e;

                /* JADX INFO: renamed from: f */
                public final Canvas f10636f;

                /* JADX INFO: renamed from: g */
                public final Rect f10637g;

                /* JADX INFO: renamed from: h */
                public final WeakHashMap f10638h;

                public C1344j() {
/* 28 */            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
/* 32 */            bitmapCreateBitmap.getClass();
/* 35 */            this.f10635e = bitmapCreateBitmap;
/* 42 */            this.f10636f = new Canvas(bitmapCreateBitmap);
/* 50 */            this.f10637g = new Rect(0, 0, 1, 1);
/* 57 */            this.f10638h = new WeakHashMap();
                }

                /* JADX INFO: renamed from: c */
                public static BitmapShader m5025c(Paint paint) {
/* 2 */             if (paint != null) {
/* 5 */                 Shader shader = paint.getShader();
/* 11 */                if (shader instanceof BitmapShader) {
/* 13 */                    paint.setShader(null);
/* 16 */                    return (BitmapShader) shader;
                        }
                    }
/* 1 */             return null;
                }

                /* JADX INFO: renamed from: a */
                public final void m5026a(float f, float f2, Paint paint) {
/* 1 */             ColorFilter colorFilter = paint.getColorFilter();
/* 5 */             Paint paint2 = this.f10633c;
/* 7 */             paint2.setColorFilter(colorFilter);
/* 10 */            int color = paint.getColor();
/* 32 */            paint2.setColor(Color.argb(100, Color.red(color), Color.green(color), Color.blue(color)));
/* 35 */            Rect rect = this.f10634d;
/* 62 */            drawRoundRect(rect.left + f, rect.top + f2, rect.right + f, rect.bottom + f2, 10.0f, 10.0f, paint2);
                }

                /* JADX INFO: renamed from: b */
                public final Canvas m5027b() {
/* 1 */             Canvas canvas = this.f10631a;
/* 3 */             if (canvas != null) {
/* 5 */                 return canvas;
                    }
/* 8 */             Intrinsics.m6220e("delegate");
/* 12 */            throw null;
                }

                @Override // android.graphics.Canvas
                public final boolean clipOutPath(Path path) {
/* 1 */             path.getClass();
/* 1 */             return m5027b().clipOutPath(path);
                }

                @Override // android.graphics.Canvas
                public final boolean clipOutRect(RectF rectF) {
/* 1 */             rectF.getClass();
/* 1 */             return m5027b().clipOutRect(rectF);
                }

                @Override // android.graphics.Canvas
                public final boolean clipPath(Path path, Region.Op op) {
/* 1 */             path.getClass();
/* 4 */             op.getClass();
/* 11 */            return m5027b().clipPath(path, op);
                }

                @Override // android.graphics.Canvas
                public final boolean clipRect(RectF rectF, Region.Op op) {
/* 1 */             rectF.getClass();
/* 4 */             op.getClass();
/* 11 */            return m5027b().clipRect(rectF, op);
                }

                @Override // android.graphics.Canvas
                public final void concat(Matrix matrix) {
/* 5 */             m5027b().concat(matrix);
                }

                /* JADX INFO: renamed from: d */
                public final int m5028d(Bitmap bitmap, Paint paint, Rect rect) {
/* 5 */             int pixel = -16777216;
/* 7 */             if (bitmap.isRecycled()) {
/* 5 */                 return -16777216;
                    }
/* 10 */            WeakHashMap weakHashMap = this.f10638h;
/* 16 */            Pair pair = (Pair) weakHashMap.get(bitmap);
/* 18 */            if (pair != null && ((Number) pair.f12908a).intValue() == bitmap.getGenerationId()) {
/* 38 */                return ((Number) pair.f12909b).intValue();
                    }
/* 43 */            Bitmap.Config config = bitmap.getConfig();
/* 1 */             Bitmap.Config config2 = Bitmap.Config.HARDWARE;
/* 51 */            Bitmap bitmap2 = this.f10635e;
/* 53 */            Rect rect2 = this.f10637g;
/* 55 */            Canvas canvas = this.f10636f;
/* 58 */            if (config == config2 && Build.VERSION.SDK_INT >= 31) {
/* 66 */                BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 74 */                canvas.drawBitmap(bitmap.asShared(), rect, rect2, paint);
/* 77 */                if (bitmapShaderM5025c != null && paint != null) {
/* 82 */                    paint.setShader(bitmapShaderM5025c);
                        }
/* 85 */                pixel = bitmap2.getPixel(0, 0);
                    } else if (bitmap.getConfig() != Bitmap.Config.HARDWARE) {
/* 100 */               BitmapShader bitmapShaderM5025c2 = m5025c(paint);
/* 104 */               canvas.drawBitmap(bitmap, rect, rect2, paint);
/* 107 */               if (bitmapShaderM5025c2 != null && paint != null) {
/* 112 */                   paint.setShader(bitmapShaderM5025c2);
                        }
/* 115 */               pixel = bitmap2.getPixel(0, 0);
                    }
/* 136 */           weakHashMap.put(bitmap, new Pair(Integer.valueOf(bitmap.getGenerationId()), Integer.valueOf(pixel)));
/* 139 */           return pixel;
                }

                @Override // android.graphics.Canvas
                public final void disableZ() {
/* 1 */             m5027b().disableZ();
                }

                @Override // android.graphics.Canvas
                public final void drawARGB(int i, int i2, int i3, int i4) {
/* 5 */             m5027b().drawARGB(i, i2, i3, i4);
                }

                @Override // android.graphics.Canvas
                public final void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
/* 1 */             rectF.getClass();
/* 4 */             paint.getClass();
/* 7 */             BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 15 */            m5027b().drawArc(rectF, f, f2, z, paint);
/* 18 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
                public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
/* 1 */             bitmap.getClass();
/* 4 */             matrix.getClass();
/* 8 */             int iM5028d = m5028d(bitmap, paint, null);
/* 12 */            Paint paint2 = this.f10632b;
/* 14 */            paint2.setColor(iM5028d);
/* 17 */            paint2.setColorFilter(null);
/* 24 */            int iSave = m5027b().save();
/* 32 */            m5027b().setMatrix(matrix);
/* 51 */            m5027b().drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), paint2);
/* 58 */            m5027b().restoreToCount(iSave);
                }

                @Override // android.graphics.Canvas
                public final void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
/* 1 */             bitmap.getClass();
/* 4 */             fArr.getClass();
                }

                @Override // android.graphics.Canvas
                public final void drawCircle(float f, float f2, float f3, Paint paint) {
/* 1 */             paint.getClass();
/* 4 */             BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 12 */            m5027b().drawCircle(f, f2, f3, paint);
/* 15 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
                public final void drawColor(int i, PorterDuff.Mode mode) {
/* 1 */             mode.getClass();
/* 8 */             m5027b().drawColor(i, mode);
                }

                @Override // android.graphics.Canvas
                public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
/* 1 */             rectF.getClass();
/* 4 */             fArr.getClass();
/* 7 */             rectF2.getClass();
/* 10 */            fArr2.getClass();
/* 13 */            paint.getClass();
/* 16 */            BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 1 */             m5027b().drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
/* 27 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
                public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
/* 1 */             iArr.getClass();
/* 4 */             fArr.getClass();
/* 7 */             font.getClass();
/* 10 */            paint.getClass();
                }

                @Override // android.graphics.Canvas
                public final void drawLine(float f, float f2, float f3, float f4, Paint paint) {
/* 1 */             paint.getClass();
/* 4 */             BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 12 */            m5027b().drawLine(f, f2, f3, f4, paint);
/* 15 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
                public final void drawLines(float[] fArr, int i, int i2, Paint paint) {
/* 1 */             fArr.getClass();
/* 4 */             paint.getClass();
/* 7 */             BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 15 */            m5027b().drawLines(fArr, i, i2, paint);
/* 18 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
                public final void drawMesh(Mesh mesh, BlendMode blendMode, Paint paint) {
/* 1 */             mesh.getClass();
/* 4 */             paint.getClass();
                }

                @Override // android.graphics.Canvas
                public final void drawOval(RectF rectF, Paint paint) {
/* 1 */             rectF.getClass();
/* 4 */             paint.getClass();
/* 7 */             BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 15 */            m5027b().drawOval(rectF, paint);
/* 18 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
                public final void drawPaint(Paint paint) {
/* 1 */             paint.getClass();
/* 4 */             BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 12 */            m5027b().drawPaint(paint);
/* 15 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
                public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
/* 1 */             ninePatch.getClass();
/* 4 */             rect.getClass();
/* 7 */             BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 1 */             m5027b().drawPatch(ninePatch, rect, paint);
/* 18 */            if (paint == null) {
/* 20 */                return;
                    }
/* 21 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
                public final void drawPath(Path path, Paint paint) {
/* 1 */             path.getClass();
/* 4 */             paint.getClass();
/* 7 */             BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 15 */            m5027b().drawPath(path, paint);
/* 18 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
                public final void drawPicture(Picture picture) {
/* 1 */             picture.getClass();
/* 5 */             Paint paint = this.f10632b;
/* 7 */             paint.setColorFilter(null);
/* 12 */            paint.setColor(-16777216);
/* 31 */            m5027b().drawRect(0.0f, 0.0f, picture.getWidth(), picture.getHeight(), paint);
                }

                @Override // android.graphics.Canvas
                public final void drawPoint(float f, float f2, Paint paint) {
/* 1 */             paint.getClass();
/* 4 */             BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 12 */            m5027b().drawPoint(f, f2, paint);
/* 15 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
                public final void drawPoints(float[] fArr, Paint paint) {
/* 1 */             fArr.getClass();
/* 4 */             paint.getClass();
/* 7 */             BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 15 */            m5027b().drawPoints(fArr, paint);
/* 18 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
                public final void drawPosText(String str, float[] fArr, Paint paint) {
/* 1 */             str.getClass();
/* 4 */             fArr.getClass();
/* 7 */             paint.getClass();
                }

                @Override // android.graphics.Canvas
                public final void drawRGB(int i, int i2, int i3) {
/* 5 */             m5027b().drawRGB(i, i2, i3);
                }

                @Override // android.graphics.Canvas
                public final void drawRect(RectF rectF, Paint paint) {
/* 1 */             rectF.getClass();
/* 4 */             paint.getClass();
/* 7 */             BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 15 */            m5027b().drawRect(rectF, paint);
/* 18 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
                public final void drawRenderNode(RenderNode renderNode) {
/* 1 */             renderNode.getClass();
                }

                @Override // android.graphics.Canvas
                public final void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
/* 1 */             rectF.getClass();
/* 4 */             paint.getClass();
/* 7 */             BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 15 */            m5027b().drawRoundRect(rectF, f, f2, paint);
/* 18 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
                public final void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
/* 1 */             charSequence.getClass();
/* 4 */             paint.getClass();
/* 18 */            paint.getTextBounds(charSequence.toString(), 0, charSequence.length(), this.f10634d);
/* 21 */            m5026a(f, f2, paint);
                }

                @Override // android.graphics.Canvas
                public final void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
/* 1 */             str.getClass();
/* 4 */             path.getClass();
/* 7 */             paint.getClass();
                }

                @Override // android.graphics.Canvas
                public final void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
/* 1 */             charSequence.getClass();
/* 4 */             paint.getClass();
/* 13 */            paint.getTextBounds(charSequence.toString(), i, i2, this.f10634d);
/* 16 */            m5026a(f, f2, paint);
                }

                @Override // android.graphics.Canvas
                public final void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
/* 1 */             vertexMode.getClass();
/* 4 */             fArr.getClass();
/* 7 */             paint.getClass();
                }

                @Override // android.graphics.Canvas
                public final void enableZ() {
/* 1 */             m5027b().enableZ();
                }

                @Override // android.graphics.Canvas
                public final boolean getClipBounds(Rect rect) {
/* 1 */             rect.getClass();
/* 8 */             return m5027b().getClipBounds(rect);
                }

                @Override // android.graphics.Canvas
                public final int getDensity() {
/* 5 */             return m5027b().getDensity();
                }

                @Override // android.graphics.Canvas
                public final DrawFilter getDrawFilter() {
/* 5 */             return m5027b().getDrawFilter();
                }

                @Override // android.graphics.Canvas
                public final int getHeight() {
/* 5 */             return m5027b().getHeight();
                }

                @Override // android.graphics.Canvas
                public final void getMatrix(Matrix matrix) {
/* 1 */             matrix.getClass();
/* 8 */             m5027b().getMatrix(matrix);
                }

                @Override // android.graphics.Canvas
                public final int getMaximumBitmapHeight() {
/* 5 */             return m5027b().getMaximumBitmapHeight();
                }

                @Override // android.graphics.Canvas
                public final int getMaximumBitmapWidth() {
/* 5 */             return m5027b().getMaximumBitmapWidth();
                }

                @Override // android.graphics.Canvas
                public final int getSaveCount() {
/* 5 */             return m5027b().getSaveCount();
                }

                @Override // android.graphics.Canvas
                public final int getWidth() {
/* 5 */             return m5027b().getWidth();
                }

                @Override // android.graphics.Canvas
                public final boolean isHardwareAccelerated() {
/* 1 */             return false;
                }

                @Override // android.graphics.Canvas
                public final boolean isOpaque() {
/* 5 */             return m5027b().isOpaque();
                }

                @Override // android.graphics.Canvas
                public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
/* 1 */             rectF.getClass();
/* 4 */             edgeType.getClass();
/* 11 */            return m5027b().quickReject(rectF, edgeType);
                }

                @Override // android.graphics.Canvas
                public final void restore() {
/* 5 */             m5027b().restore();
                }

                @Override // android.graphics.Canvas
                public final void restoreToCount(int i) {
/* 5 */             m5027b().restoreToCount(i);
                }

                @Override // android.graphics.Canvas
                public final void rotate(float f) {
/* 5 */             m5027b().rotate(f);
                }

                @Override // android.graphics.Canvas
                public final int save() {
/* 5 */             return m5027b().save();
                }

                @Override // android.graphics.Canvas
                public final int saveLayer(RectF rectF, Paint paint, int i) {
/* 1 */             BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 9 */             int iSaveLayer = m5027b().saveLayer(rectF, paint, i);
/* 13 */            if (paint == null) {
/* 15 */                return iSaveLayer;
                    }
/* 16 */            paint.setShader(bitmapShaderM5025c);
/* 19 */            return iSaveLayer;
                }

                @Override // android.graphics.Canvas
                public final int saveLayerAlpha(RectF rectF, int i, int i2) {
/* 5 */             return m5027b().saveLayerAlpha(rectF, i, i2);
                }

                @Override // android.graphics.Canvas
                public final void scale(float f, float f2) {
/* 5 */             m5027b().scale(f, f2);
                }

                @Override // android.graphics.Canvas
                public final void setBitmap(Bitmap bitmap) {
/* 5 */             m5027b().setBitmap(bitmap);
                }

                @Override // android.graphics.Canvas
                public final void setDensity(int i) {
/* 5 */             m5027b().setDensity(i);
                }

                @Override // android.graphics.Canvas
                public final void setDrawFilter(DrawFilter drawFilter) {
/* 5 */             m5027b().setDrawFilter(drawFilter);
                }

                @Override // android.graphics.Canvas
                public final void setMatrix(Matrix matrix) {
/* 5 */             m5027b().setMatrix(matrix);
                }

                @Override // android.graphics.Canvas
                public final void skew(float f, float f2) {
/* 5 */             m5027b().skew(f, f2);
                }

                @Override // android.graphics.Canvas
                public final void translate(float f, float f2) {
/* 5 */             m5027b().translate(f, f2);
                }

                @Override // android.graphics.Canvas
/* 9 */         public final int saveLayerAlpha(RectF rectF, int i) {
/* 10 */            return m5027b().saveLayerAlpha(rectF, i);
                }

                @Override // android.graphics.Canvas
/* 10 */        public final void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
/* 11 */            cArr.getClass();
                    fArr.getClass();
                    paint.getClass();
                }

                @Override // android.graphics.Canvas
/* 10 */        public final void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
/* 11 */            cArr.getClass();
                    path.getClass();
                    paint.getClass();
                }

                @Override // android.graphics.Canvas
/* 10 */        public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
/* 11 */            return m5027b().saveLayerAlpha(f, f2, f3, f4, i, i2);
                }

                @Override // android.graphics.Canvas
/* 11 */        public final void drawColor(long j) {
/* 1 */             m5027b().drawColor(j);
                }

                @Override // android.graphics.Canvas
/* 11 */        public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
/* 12 */            return m5027b().saveLayerAlpha(f, f2, f3, f4, i);
                }

                @Override // android.graphics.Canvas
/* 12 */        public final boolean clipOutRect(Rect rect) {
                    rect.getClass();
/* 1 */             return m5027b().clipOutRect(rect);
                }

                @Override // android.graphics.Canvas
/* 12 */        public final void drawColor(int i) {
/* 13 */            m5027b().drawColor(i);
                }

                @Override // android.graphics.Canvas
/* 13 */        public final boolean clipOutRect(float f, float f2, float f3, float f4) {
/* 1 */             return m5027b().clipOutRect(f, f2, f3, f4);
                }

                @Override // android.graphics.Canvas
/* 13 */        public final void drawColor(int i, BlendMode blendMode) {
                    blendMode.getClass();
/* 1 */             m5027b().drawColor(i, blendMode);
                }

                @Override // android.graphics.Canvas
/* 14 */        public final boolean clipOutRect(int i, int i2, int i3, int i4) {
/* 1 */             return m5027b().clipOutRect(i, i2, i3, i4);
                }

                @Override // android.graphics.Canvas
/* 14 */        public final void drawColor(long j, BlendMode blendMode) {
                    blendMode.getClass();
/* 1 */             m5027b().drawColor(j, blendMode);
                }

                @Override // android.graphics.Canvas
/* 15 */        public final boolean clipPath(Path path) {
                    path.getClass();
/* 16 */            return m5027b().clipPath(path);
                }

                @Override // android.graphics.Canvas
/* 15 */        public final boolean clipRect(Rect rect, Region.Op op) {
                    rect.getClass();
                    op.getClass();
/* 16 */            return m5027b().clipRect(rect, op);
                }

                @Override // android.graphics.Canvas
/* 15 */        public final boolean quickReject(RectF rectF) {
                    rectF.getClass();
/* 1 */             return m5027b().quickReject(rectF);
                }

                @Override // android.graphics.Canvas
/* 16 */        public final boolean clipRect(RectF rectF) {
                    rectF.getClass();
/* 17 */            return m5027b().clipRect(rectF);
                }

                @Override // android.graphics.Canvas
/* 16 */        public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
                    path.getClass();
                    edgeType.getClass();
/* 17 */            return m5027b().quickReject(path, edgeType);
                }

                @Override // android.graphics.Canvas
/* 17 */        public final boolean clipRect(Rect rect) {
                    rect.getClass();
/* 18 */            return m5027b().clipRect(rect);
                }

                @Override // android.graphics.Canvas
/* 17 */        public final boolean quickReject(Path path) {
                    path.getClass();
/* 1 */             return m5027b().quickReject(path);
                }

                @Override // android.graphics.Canvas
/* 18 */        public final boolean clipRect(float f, float f2, float f3, float f4, Region.Op op) {
                    op.getClass();
/* 19 */            return m5027b().clipRect(f, f2, f3, f4, op);
                }

                @Override // android.graphics.Canvas
/* 18 */        public final boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType edgeType) {
                    edgeType.getClass();
/* 19 */            return m5027b().quickReject(f, f2, f3, f4, edgeType);
                }

                @Override // android.graphics.Canvas
/* 19 */        public final boolean clipRect(float f, float f2, float f3, float f4) {
/* 20 */            return m5027b().clipRect(f, f2, f3, f4);
                }

                @Override // android.graphics.Canvas
/* 19 */        public final void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
                    cArr.getClass();
                    paint.getClass();
/* 20 */            paint.getTextBounds(cArr, 0, i + i2, this.f10634d);
/* 21 */            m5026a(f, f2, paint);
                }

                @Override // android.graphics.Canvas
/* 19 */        public final boolean quickReject(float f, float f2, float f3, float f4) {
/* 1 */             return m5027b().quickReject(f, f2, f3, f4);
                }

                @Override // android.graphics.Canvas
/* 19 */        public final int saveLayer(RectF rectF, Paint paint) {
/* 20 */            BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 21 */            int iSaveLayer = m5027b().saveLayer(rectF, paint);
                    if (paint == null) {
                        return iSaveLayer;
                    }
/* 22 */            paint.setShader(bitmapShaderM5025c);
                    return iSaveLayer;
                }

                @Override // android.graphics.Canvas
/* 20 */        public final boolean clipRect(int i, int i2, int i3, int i4) {
/* 21 */            return m5027b().clipRect(i, i2, i3, i4);
                }

                @Override // android.graphics.Canvas
/* 21 */        public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
                    paint.getClass();
/* 22 */            BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 23 */            m5027b().drawArc(f, f2, f3, f4, f5, f6, z, paint);
/* 24 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
/* 21 */        public final void drawLines(float[] fArr, Paint paint) {
                    fArr.getClass();
                    paint.getClass();
/* 22 */            BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 23 */            m5027b().drawLines(fArr, paint);
/* 24 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
/* 21 */        public final void drawOval(float f, float f2, float f3, float f4, Paint paint) {
                    paint.getClass();
/* 22 */            BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 23 */            m5027b().drawOval(f, f2, f3, f4, paint);
/* 24 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
/* 21 */        public final void drawPoints(float[] fArr, int i, int i2, Paint paint) {
                    paint.getClass();
/* 22 */            BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 23 */            m5027b().drawPoints(fArr, i, i2, paint);
/* 24 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
/* 21 */        public final void drawRect(Rect rect, Paint paint) {
                    rect.getClass();
                    paint.getClass();
/* 22 */            BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 23 */            m5027b().drawRect(rect, paint);
/* 24 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
/* 21 */        public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
                    paint.getClass();
/* 22 */            BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 23 */            m5027b().drawRoundRect(f, f2, f3, f4, f5, f6, paint);
/* 24 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
/* 21 */        public final void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
                    measuredText.getClass();
                    paint.getClass();
/* 1 */             paint.getTextBounds(measuredText.toString(), i, i2, this.f10634d);
/* 23 */            m5026a(f, f2, paint);
                }

                @Override // android.graphics.Canvas
/* 22 */        public final int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
/* 23 */            BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 24 */            int iSaveLayer = m5027b().saveLayer(f, f2, f3, f4, paint, i);
                    if (paint == null) {
                        return iSaveLayer;
                    }
/* 25 */            paint.setShader(bitmapShaderM5025c);
                    return iSaveLayer;
                }

                @Override // android.graphics.Canvas
/* 24 */        public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
                    ninePatch.getClass();
                    rectF.getClass();
/* 25 */            BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 1 */             m5027b().drawPatch(ninePatch, rectF, paint);
                    if (paint == null) {
                        return;
                    }
/* 27 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
/* 24 */        public final void drawRect(float f, float f2, float f3, float f4, Paint paint) {
                    paint.getClass();
/* 25 */            BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 26 */            m5027b().drawRect(f, f2, f3, f4, paint);
/* 27 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
/* 24 */        public final void drawText(String str, float f, float f2, Paint paint) {
                    str.getClass();
                    paint.getClass();
/* 25 */            paint.getTextBounds(str, 0, str.length(), this.f10634d);
/* 26 */            m5026a(f, f2, paint);
                }

                @Override // android.graphics.Canvas
/* 25 */        public final int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
/* 26 */            BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 27 */            int iSaveLayer = m5027b().saveLayer(f, f2, f3, f4, paint);
                    if (paint == null) {
                        return iSaveLayer;
                    }
/* 28 */            paint.setShader(bitmapShaderM5025c);
                    return iSaveLayer;
                }

                @Override // android.graphics.Canvas
/* 26 */        public final void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
                    str.getClass();
                    paint.getClass();
/* 27 */            paint.getTextBounds(str, i, i2, this.f10634d);
/* 28 */            m5026a(f, f2, paint);
                }

                @Override // android.graphics.Canvas
/* 28 */        public final void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
                    cArr.getClass();
                    paint.getClass();
/* 29 */            paint.getTextBounds(cArr, i, i2, this.f10634d);
/* 30 */            m5026a(f, f2, paint);
                }

                @Override // android.graphics.Canvas
/* 30 */        public final void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
                    rectF.getClass();
                    rectF2.getClass();
                    paint.getClass();
/* 31 */            BitmapShader bitmapShaderM5025c = m5025c(paint);
/* 1 */             m5027b().drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
/* 33 */            paint.setShader(bitmapShaderM5025c);
                }

                @Override // android.graphics.Canvas
/* 34 */        public final void drawPicture(Picture picture, RectF rectF) {
                    picture.getClass();
                    rectF.getClass();
/* 35 */            Paint paint = this.f10632b;
                    paint.setColorFilter(null);
/* 36 */            paint.setColor(-16777216);
/* 37 */            m5027b().drawRect(rectF, paint);
                }

                @Override // android.graphics.Canvas
/* 37 */        public final void drawPicture(Picture picture, Rect rect) {
                    picture.getClass();
                    rect.getClass();
/* 38 */            Paint paint = this.f10632b;
                    paint.setColorFilter(null);
/* 39 */            paint.setColor(-16777216);
/* 40 */            m5027b().drawRect(rect, paint);
                }

                @Override // android.graphics.Canvas
/* 61 */        public final void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
/* 62 */            iArr.getClass();
                }

                @Override // android.graphics.Canvas
/* 62 */        public final void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
                    bitmap.getClass();
/* 63 */            int iM5028d = m5028d(bitmap, paint, null);
/* 64 */            Paint paint2 = this.f10632b;
                    paint2.setColor(iM5028d);
/* 65 */            paint2.setColorFilter(null);
/* 66 */            m5027b().drawRect(f, f2, f + bitmap.getWidth(), f2 + bitmap.getHeight(), paint2);
                }

                @Override // android.graphics.Canvas
/* 66 */        public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
                    bitmap.getClass();
                    rectF.getClass();
/* 67 */            int iM5028d = m5028d(bitmap, paint, rect);
/* 68 */            Paint paint2 = this.f10632b;
                    paint2.setColor(iM5028d);
/* 69 */            paint2.setColorFilter(null);
/* 70 */            m5027b().drawRect(rectF, paint2);
                }

                @Override // android.graphics.Canvas
/* 70 */        public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
                    bitmap.getClass();
                    rect2.getClass();
/* 71 */            int iM5028d = m5028d(bitmap, paint, rect);
/* 72 */            Paint paint2 = this.f10632b;
                    paint2.setColor(iM5028d);
/* 73 */            paint2.setColorFilter(null);
/* 74 */            m5027b().drawRect(rect2, paint2);
                }

                @Override // android.graphics.Canvas
/* 74 */        public final void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
/* 75 */            iArr.getClass();
                }
            }
