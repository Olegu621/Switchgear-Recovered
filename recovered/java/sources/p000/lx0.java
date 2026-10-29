            package p000;

            import android.content.ContentResolver;
            import android.content.Context;
            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.provider.Settings;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lx0 extends y90 {

                /* JADX INFO: renamed from: W */
                public final ca0 f13516W;

                /* JADX INFO: renamed from: X */
                public kx0 f13517X;

                public lx0(Context context, AbstractC2002oi abstractC2002oi, ca0 ca0Var, kx0 kx0Var) {
/* 1 */             super(context, abstractC2002oi);
/* 4 */             this.f13516W = ca0Var;
/* 6 */             ca0Var.f2788b = this;
/* 8 */             this.f13517X = kx0Var;
/* 10 */            kx0Var.f13033a = this;
                }

                @Override // android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
/* 3 */             Rect rect = new Rect();
/* 14 */            if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
/* 88 */                return;
                    }
/* 29 */            canvas.save();
/* 32 */            float fM10127b = m10127b();
/* 36 */            ca0 ca0Var = this.f13516W;
/* 40 */            ca0Var.f2787a.mo2348a();
/* 43 */            ca0Var.mo1555a(canvas, fM10127b);
/* 46 */            Paint paint = this.f19537w;
/* 48 */            ca0Var.mo1557c(canvas, paint);
/* 51 */            int i = 0;
                    while (true) {
/* 52 */                kx0 kx0Var = this.f13517X;
/* 56 */                int[] iArr = (int[]) kx0Var.f13035c;
/* 59 */                if (i >= iArr.length) {
/* 85 */                    canvas.restore();
/* 88 */                    return;
                        }
/* 63 */                float[] fArr = (float[]) kx0Var.f13034b;
/* 65 */                int i2 = i * 2;
/* 78 */                this.f13516W.mo1556b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
/* 81 */                i++;
                    }
                }

                @Override // p000.y90
                /* JADX INFO: renamed from: f */
                public final boolean mo6572f(boolean z, boolean z2, boolean z3) {
/* 1 */             boolean zMo6572f = super.mo6572f(z, z2, z3);
/* 9 */             if (!isRunning()) {
/* 13 */                this.f13517X.mo6292a();
                    }
/* 16 */            C2284v8 c2284v8 = this.f19531c;
/* 20 */            ContentResolver contentResolver = this.f19529a.getContentResolver();
/* 24 */            c2284v8.getClass();
/* 31 */            Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
/* 34 */            if (z && z3) {
/* 41 */                this.f13517X.mo6301u();
                    }
/* 44 */            return zMo6572f;
                }

                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicHeight() {
/* 3 */             return this.f13516W.mo1558d();
                }

                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicWidth() {
/* 3 */             return this.f13516W.mo1559e();
                }
            }
