            package io.sentry.android.replay.util;

            import android.graphics.Canvas;
            import android.graphics.Color;
            import android.graphics.ColorFilter;
            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import java.util.List;
            import p000.nd0;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.util.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1348b extends Drawable {

                /* JADX INFO: renamed from: d */
                public static final int f10645d = Color.argb(32, 255, 20, 20);

                /* JADX INFO: renamed from: e */
                public static final int f10646e = Color.argb(128, 255, 20, 20);

                /* JADX INFO: renamed from: a */
                public final Paint f10647a = new Paint(1);

                /* JADX INFO: renamed from: b */
                public final Rect f10648b = new Rect();

                /* JADX INFO: renamed from: c */
                public final List f10649c = nd0.f14189a;

                @Override // android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
/* 1 */             canvas.getClass();
/* 6 */             Paint paint = this.f10647a;
/* 8 */             paint.setTextSize(32.0f);
/* 13 */            paint.setColor(-16777216);
/* 18 */            paint.setStrokeWidth(6.0f);
/* 31 */            for (Rect rect : this.f10649c) {
/* 41 */                paint.setColor(f10645d);
/* 44 */                Paint.Style style = Paint.Style.FILL;
/* 46 */                paint.setStyle(style);
/* 49 */                canvas.drawRect(rect, paint);
/* 54 */                paint.setColor(f10646e);
/* 57 */                Paint.Style style2 = Paint.Style.STROKE;
/* 59 */                paint.setStyle(style2);
/* 62 */                canvas.drawRect(rect, paint);
/* 67 */                StringBuilder sb = new StringBuilder();
/* 72 */                sb.append(rect.left);
/* 77 */                sb.append('/');
/* 82 */                sb.append(rect.top);
/* 85 */                String string = sb.toString();
/* 89 */                int length = string.length();
/* 94 */                Rect rect2 = this.f10648b;
/* 96 */                paint.getTextBounds(string, 0, length, rect2);
/* 99 */                float f = rect.left;
/* 102 */               float f2 = rect.top;
/* 106 */               paint.setColor(-1);
/* 109 */               paint.setStyle(style2);
/* 112 */               canvas.drawText(string, f, f2, paint);
/* 115 */               paint.setColor(-16777216);
/* 118 */               paint.setStyle(style);
/* 121 */               canvas.drawText(string, f, f2, paint);
/* 126 */               StringBuilder sb2 = new StringBuilder();
/* 131 */               sb2.append(rect.right);
/* 134 */               sb2.append('/');
/* 139 */               sb2.append(rect.bottom);
/* 142 */               String string2 = sb2.toString();
/* 150 */               paint.getTextBounds(string2, 0, string2.length(), rect2);
/* 161 */               float fWidth = rect.right - rect2.width();
/* 170 */               float fHeight = rect.bottom + rect2.height();
/* 171 */               paint.setColor(-1);
/* 174 */               paint.setStyle(style2);
/* 177 */               canvas.drawText(string2, fWidth, fHeight, paint);
/* 180 */               paint.setColor(-16777216);
/* 183 */               paint.setStyle(style);
/* 186 */               canvas.drawText(string2, fWidth, fHeight, paint);
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public final int getOpacity() {
/* 1 */             return -3;
                }

                @Override // android.graphics.drawable.Drawable
                public final void setAlpha(int i) {
                }

                @Override // android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
                }
            }
