            package p000;

            import android.animation.ObjectAnimator;
            import android.animation.ValueAnimator;
            import android.content.ContentResolver;
            import android.content.Context;
            import android.graphics.ColorFilter;
            import android.graphics.Paint;
            import android.graphics.drawable.Animatable;
            import android.graphics.drawable.Drawable;
            import android.provider.Settings;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class y90 extends Drawable implements Animatable {

                /* JADX INFO: renamed from: V */
                public static final C1938ms f19527V = new C1938ms("growFraction", Float.class, 10);

                /* JADX INFO: renamed from: U */
                public int f19528U;

                /* JADX INFO: renamed from: a */
                public final Context f19529a;

                /* JADX INFO: renamed from: b */
                public final AbstractC2002oi f19530b;

                /* JADX INFO: renamed from: d */
                public ObjectAnimator f19532d;

                /* JADX INFO: renamed from: e */
                public ObjectAnimator f19533e;

                /* JADX INFO: renamed from: f */
                public ArrayList f19534f;

                /* JADX INFO: renamed from: i */
                public boolean f19535i;

                /* JADX INFO: renamed from: v */
                public float f19536v;

                /* JADX INFO: renamed from: w */
                public final Paint f19537w = new Paint();

                /* JADX INFO: renamed from: c */
                public C2284v8 f19531c = new C2284v8();

                public y90(Context context, AbstractC2002oi abstractC2002oi) {
/* 11 */            this.f19529a = context;
/* 13 */            this.f19530b = abstractC2002oi;
/* 24 */            setAlpha(255);
                }

                /* JADX INFO: renamed from: b */
                public final float m10127b() {
/* 1 */             AbstractC2002oi abstractC2002oi = this.f19530b;
/* 5 */             if (abstractC2002oi.f14766e == 0 && abstractC2002oi.f14767f == 0) {
/* 15 */                return 1.0f;
                    }
/* 12 */            return this.f19536v;
                }

                /* JADX INFO: renamed from: c */
                public final boolean m10128c() {
/* 1 */             ObjectAnimator objectAnimator = this.f19533e;
                    return objectAnimator != null && objectAnimator.isRunning();
                }

                /* JADX INFO: renamed from: d */
                public final boolean m10129d() {
/* 1 */             ObjectAnimator objectAnimator = this.f19532d;
                    return objectAnimator != null && objectAnimator.isRunning();
                }

                /* JADX INFO: renamed from: e */
                public final boolean m10130e(boolean z, boolean z2, boolean z3) {
/* 1 */             C2284v8 c2284v8 = this.f19531c;
/* 5 */             ContentResolver contentResolver = this.f19529a.getContentResolver();
/* 9 */             c2284v8.getClass();
/* 30 */            return mo6572f(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
                }

                /* JADX INFO: renamed from: f */
                public boolean mo6572f(boolean z, boolean z2, boolean z3) {
/* 1 */             ObjectAnimator objectAnimator = this.f19532d;
/* 4 */             int i = 0;
/* 7 */             C1938ms c1938ms = f19527V;
/* 9 */             if (objectAnimator == null) {
/* 16 */                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, c1938ms, 0.0f, 1.0f);
/* 20 */                this.f19532d = objectAnimatorOfFloat;
/* 22 */                objectAnimatorOfFloat.setDuration(500L);
/* 29 */                this.f19532d.setInterpolator(AbstractC2246u8.f17411b);
/* 32 */                ObjectAnimator objectAnimator2 = this.f19532d;
/* 34 */                if (objectAnimator2 != null && objectAnimator2.isRunning()) {
/* 45 */                    C1951n4.m6859j("Cannot set showAnimator while the current showAnimator is running.");
/* 4 */                     return false;
                        }
/* 49 */                this.f19532d = objectAnimator2;
/* 56 */                objectAnimator2.addListener(new x90(this, i));
                    }
/* 61 */            int i2 = 1;
/* 62 */            if (this.f19533e == null) {
/* 69 */                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, c1938ms, 1.0f, 0.0f);
/* 73 */                this.f19533e = objectAnimatorOfFloat2;
/* 75 */                objectAnimatorOfFloat2.setDuration(500L);
/* 82 */                this.f19533e.setInterpolator(AbstractC2246u8.f17411b);
/* 85 */                ObjectAnimator objectAnimator3 = this.f19533e;
/* 87 */                if (objectAnimator3 != null && objectAnimator3.isRunning()) {
/* 98 */                    C1951n4.m6859j("Cannot set hideAnimator while the current hideAnimator is running.");
/* 4 */                     return false;
                        }
/* 102 */               this.f19533e = objectAnimator3;
/* 109 */               objectAnimator3.addListener(new x90(this, i2));
                    }
/* 116 */           if (isVisible() || z) {
/* 126 */               ObjectAnimator objectAnimator4 = z ? this.f19532d : this.f19533e;
/* 128 */               if (!z3) {
/* 134 */                   if (objectAnimator4.isRunning()) {
/* 136 */                       objectAnimator4.end();
                            } else {
/* 144 */                       boolean z4 = this.f19535i;
/* 146 */                       this.f19535i = true;
/* 150 */                       new ValueAnimator[]{objectAnimator4}[0].end();
/* 153 */                       this.f19535i = z4;
                            }
/* 155 */                   return super.setVisible(z, false);
                        }
/* 160 */               if (!z3 || !objectAnimator4.isRunning()) {
/* 180 */                   boolean z5 = !z || super.setVisible(z, false);
/* 181 */                   AbstractC2002oi abstractC2002oi = this.f19530b;
/* 183 */                   if (!z ? abstractC2002oi.f14767f != 0 : abstractC2002oi.f14766e != 0) {
/* 215 */                       boolean z6 = this.f19535i;
/* 217 */                       this.f19535i = true;
/* 221 */                       new ValueAnimator[]{objectAnimator4}[0].end();
/* 224 */                       this.f19535i = z6;
/* 226 */                       return z5;
                            }
/* 194 */                   if (z2 || !objectAnimator4.isPaused()) {
/* 207 */                       objectAnimator4.start();
/* 210 */                       return z5;
                            }
/* 203 */                   objectAnimator4.resume();
/* 206 */                   return z5;
                        }
                    }
/* 4 */             return false;
                }

                /* JADX INFO: renamed from: g */
                public final void m10131g(C1965ni c1965ni) {
/* 1 */             ArrayList arrayList = this.f19534f;
/* 3 */             if (arrayList == null || !arrayList.contains(c1965ni)) {
/* 27 */                return;
                    }
/* 13 */            this.f19534f.remove(c1965ni);
/* 22 */            if (this.f19534f.isEmpty()) {
/* 25 */                this.f19534f = null;
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public final int getAlpha() {
/* 1 */             return this.f19528U;
                }

                @Override // android.graphics.drawable.Drawable
                public final int getOpacity() {
/* 1 */             return -3;
                }

                @Override // android.graphics.drawable.Animatable
                public final boolean isRunning() {
                    return m10129d() || m10128c();
                }

                @Override // android.graphics.drawable.Drawable
                public final void setAlpha(int i) {
/* 1 */             this.f19528U = i;
/* 3 */             invalidateSelf();
                }

                @Override // android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
/* 3 */             this.f19537w.setColorFilter(colorFilter);
/* 6 */             invalidateSelf();
                }

                @Override // android.graphics.drawable.Drawable
                public final boolean setVisible(boolean z, boolean z2) {
/* 2 */             return m10130e(z, z2, true);
                }

                @Override // android.graphics.drawable.Animatable
                public final void start() {
/* 3 */             mo6572f(true, true, false);
                }

                @Override // android.graphics.drawable.Animatable
                public final void stop() {
/* 3 */             mo6572f(false, true, false);
                }
            }
