            package p000;

            import android.content.ContentResolver;
            import android.content.Context;
            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.os.Looper;
            import android.provider.Settings;
            import android.util.AndroidRuntimeException;
            import android.view.Choreographer;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class z70 extends y90 {

                /* JADX INFO: renamed from: b0 */
                public static final y70 f19957b0 = new y70();

                /* JADX INFO: renamed from: W */
                public final ca0 f19958W;

                /* JADX INFO: renamed from: X */
                public final bg2 f19959X;

                /* JADX INFO: renamed from: Y */
                public final ag2 f19960Y;

                /* JADX INFO: renamed from: Z */
                public float f19961Z;

                /* JADX INFO: renamed from: a0 */
                public boolean f19962a0;

                public z70(Context context, AbstractC2002oi abstractC2002oi, ca0 ca0Var) {
/* 1 */             super(context, abstractC2002oi);
/* 5 */             this.f19962a0 = false;
/* 7 */             this.f19958W = ca0Var;
/* 9 */             ca0Var.f2788b = this;
/* 13 */            bg2 bg2Var = new bg2();
/* 16 */            this.f19959X = bg2Var;
/* 20 */            bg2Var.f2412b = 1.0d;
/* 22 */            bg2Var.f2413c = false;
/* 30 */            bg2Var.f2411a = Math.sqrt(50.0d);
/* 32 */            bg2Var.f2413c = false;
/* 36 */            ag2 ag2Var = new ag2(this);
/* 39 */            this.f19960Y = ag2Var;
/* 41 */            ag2Var.f245k = bg2Var;
/* 49 */            if (this.f19536v != 1.0f) {
/* 51 */                this.f19536v = 1.0f;
/* 53 */                invalidateSelf();
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
/* 3 */             Rect rect = new Rect();
/* 14 */            if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
/* 29 */                canvas.save();
/* 32 */                float fM10127b = m10127b();
/* 36 */                ca0 ca0Var = this.f19958W;
/* 40 */                ca0Var.f2787a.mo2348a();
/* 43 */                ca0Var.mo1555a(canvas, fM10127b);
/* 46 */                Paint paint = this.f19537w;
/* 48 */                ca0Var.mo1557c(canvas, paint);
/* 60 */                int iM9772j = xe2.m9772j(this.f19530b.f14764c[0], this.f19528U);
/* 70 */                this.f19958W.mo1556b(canvas, paint, 0.0f, this.f19961Z, iM9772j);
/* 73 */                canvas.restore();
                    }
                }

                @Override // p000.y90
                /* JADX INFO: renamed from: f */
                public final boolean mo6572f(boolean z, boolean z2, boolean z3) {
/* 1 */             boolean zMo6572f = super.mo6572f(z, z2, z3);
/* 5 */             C2284v8 c2284v8 = this.f19531c;
/* 9 */             ContentResolver contentResolver = this.f19529a.getContentResolver();
/* 13 */            c2284v8.getClass();
/* 20 */            float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
/* 27 */            if (f == 0.0f) {
/* 30 */                this.f19962a0 = true;
/* 32 */                return zMo6572f;
                    }
/* 34 */            this.f19962a0 = false;
/* 38 */            float f2 = 50.0f / f;
/* 39 */            bg2 bg2Var = this.f19959X;
/* 41 */            bg2Var.getClass();
/* 46 */            if (f2 <= 0.0f) {
/* 60 */                C1951n4.m6859j("Spring stiffness constant must be positive.");
/* 33 */                return false;
                    }
/* 53 */            bg2Var.f2411a = Math.sqrt(f2);
/* 55 */            bg2Var.f2413c = false;
/* 57 */            return zMo6572f;
                }

                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicHeight() {
/* 3 */             return this.f19958W.mo1558d();
                }

                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicWidth() {
/* 3 */             return this.f19958W.mo1559e();
                }

                @Override // android.graphics.drawable.Drawable
                public final void jumpToCurrentState() {
/* 3 */             this.f19960Y.m272b();
/* 15 */            this.f19961Z = getLevel() / 10000.0f;
/* 17 */            invalidateSelf();
                }

                @Override // android.graphics.drawable.Drawable
                public final boolean onLevelChange(int i) {
/* 1 */             boolean z = this.f19962a0;
/* 7 */             ag2 ag2Var = this.f19960Y;
/* 9 */             if (z) {
/* 11 */                ag2Var.m272b();
/* 16 */                this.f19961Z = i / 10000.0f;
/* 18 */                invalidateSelf();
/* 6 */                 return true;
                    }
/* 25 */            ag2Var.f236b = this.f19961Z * 10000.0f;
/* 27 */            ag2Var.f237c = true;
                    float f = i;
/* 32 */            if (ag2Var.f240f) {
/* 34 */                ag2Var.f246l = f;
/* 6 */                 return true;
                    }
/* 39 */            if (ag2Var.f245k == null) {
/* 46 */                ag2Var.f245k = new bg2(f);
                    }
/* 48 */            bg2 bg2Var = ag2Var.f245k;
                    double d = f;
/* 51 */            bg2Var.f2419i = d;
/* 53 */            double d2 = (float) d;
/* 63 */            if (d2 > 3.4028234663852886E38d) {
/* 233 */               C1951n4.m6866q("Final position of the spring cannot be greater than the max value.");
/* 62 */                return false;
                    }
/* 72 */            if (d2 < -3.4028234663852886E38d) {
/* 227 */               C1951n4.m6866q("Final position of the spring cannot be less than the min value.");
/* 62 */                return false;
                    }
/* 80 */            double dAbs = Math.abs(ag2Var.f242h * 0.75f);
/* 84 */            bg2Var.f2414d = dAbs;
/* 92 */            bg2Var.f2415e = dAbs * 62.5d;
/* 102 */           if (Looper.myLooper() != Looper.getMainLooper()) {
/* 224 */               throw new AndroidRuntimeException("Animations may only be started on the main thread");
                    }
/* 104 */           boolean z2 = ag2Var.f240f;
/* 106 */           if (!z2 && !z2) {
/* 110 */               ag2Var.f240f = true;
/* 114 */               if (!ag2Var.f237c) {
/* 116 */                   y70 y70Var = ag2Var.f239e;
/* 118 */                   z70 z70Var = ag2Var.f238d;
/* 120 */                   y70Var.getClass();
/* 126 */                   ag2Var.f236b = z70Var.f19961Z * 10000.0f;
                        }
/* 128 */               float f2 = ag2Var.f236b;
/* 135 */               if (f2 > Float.MAX_VALUE || f2 < -3.4028235E38f) {
/* 212 */                   C1951n4.m6859j("Starting value need to be in between min value and max value");
/* 62 */                    return false;
                        }
/* 144 */               ThreadLocal threadLocal = C2209t8.f16981f;
/* 150 */               if (threadLocal.get() == null) {
/* 157 */                   threadLocal.set(new C2209t8());
                        }
/* 164 */               C2209t8 c2209t8 = (C2209t8) threadLocal.get();
/* 166 */               ArrayList arrayList = c2209t8.f16983b;
/* 172 */               if (arrayList.size() == 0) {
/* 176 */                   if (c2209t8.f16985d == null) {
/* 185 */                       c2209t8.f16985d = new C0875ec(c2209t8.f16984c);
                            }
/* 187 */                   C0875ec c0875ec = c2209t8.f16985d;
/* 197 */                   ((Choreographer) c0875ec.f7614c).postFrameCallback((ChoreographerFrameCallbackC2172s8) c0875ec.f7615d);
                        }
/* 204 */               if (!arrayList.contains(ag2Var)) {
/* 206 */                   arrayList.add(ag2Var);
/* 6 */                     return true;
                        }
                    }
/* 6 */             return true;
                }
            }
