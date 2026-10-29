            package p000;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.Canvas;
            import android.graphics.ColorFilter;
            import android.graphics.Outline;
            import android.graphics.Paint;
            import android.graphics.Path;
            import android.graphics.PointF;
            import android.graphics.PorterDuff;
            import android.graphics.PorterDuffColorFilter;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.RippleDrawable;
            import android.graphics.drawable.ShapeDrawable;
            import android.graphics.drawable.shapes.OvalShape;
            import android.text.SpannableStringBuilder;
            import android.text.TextPaint;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import com.google.android.material.chip.Chip;
            import java.lang.ref.WeakReference;
            import java.util.Arrays;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: hu */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1004hu extends fd1 implements Drawable.Callback, fn2 {

                /* JADX INFO: renamed from: q1 */
                public static final int[] f9231q1 = {R.attr.state_enabled};

                /* JADX INFO: renamed from: r1 */
                public static final ShapeDrawable f9232r1 = new ShapeDrawable(new OvalShape());

                /* JADX INFO: renamed from: A0 */
                public SpannableStringBuilder f9233A0;

                /* JADX INFO: renamed from: B0 */
                public boolean f9234B0;

                /* JADX INFO: renamed from: C0 */
                public boolean f9235C0;

                /* JADX INFO: renamed from: D0 */
                public Drawable f9236D0;

                /* JADX INFO: renamed from: E0 */
                public ColorStateList f9237E0;

                /* JADX INFO: renamed from: F0 */
                public mk1 f9238F0;

                /* JADX INFO: renamed from: G0 */
                public mk1 f9239G0;

                /* JADX INFO: renamed from: H0 */
                public float f9240H0;

                /* JADX INFO: renamed from: I0 */
                public float f9241I0;

                /* JADX INFO: renamed from: J0 */
                public float f9242J0;

                /* JADX INFO: renamed from: K0 */
                public float f9243K0;

                /* JADX INFO: renamed from: L0 */
                public float f9244L0;

                /* JADX INFO: renamed from: M0 */
                public float f9245M0;

                /* JADX INFO: renamed from: N0 */
                public float f9246N0;

                /* JADX INFO: renamed from: O0 */
                public float f9247O0;

                /* JADX INFO: renamed from: P0 */
                public final Context f9248P0;

                /* JADX INFO: renamed from: Q0 */
                public final Paint f9249Q0;

                /* JADX INFO: renamed from: R0 */
                public final Paint.FontMetrics f9250R0;

                /* JADX INFO: renamed from: S0 */
                public final RectF f9251S0;

                /* JADX INFO: renamed from: T0 */
                public final PointF f9252T0;

                /* JADX INFO: renamed from: U0 */
                public final Path f9253U0;

                /* JADX INFO: renamed from: V0 */
                public final gn2 f9254V0;

                /* JADX INFO: renamed from: W0 */
                public int f9255W0;

                /* JADX INFO: renamed from: X0 */
                public int f9256X0;

                /* JADX INFO: renamed from: Y0 */
                public int f9257Y0;

                /* JADX INFO: renamed from: Z0 */
                public int f9258Z0;

                /* JADX INFO: renamed from: a1 */
                public int f9259a1;

                /* JADX INFO: renamed from: b1 */
                public int f9260b1;

                /* JADX INFO: renamed from: c1 */
                public boolean f9261c1;

                /* JADX INFO: renamed from: d1 */
                public int f9262d1;

                /* JADX INFO: renamed from: e1 */
                public int f9263e1;

                /* JADX INFO: renamed from: f1 */
                public ColorFilter f9264f1;

                /* JADX INFO: renamed from: g1 */
                public PorterDuffColorFilter f9265g1;

                /* JADX INFO: renamed from: h1 */
                public ColorStateList f9266h1;

                /* JADX INFO: renamed from: i0 */
                public ColorStateList f9267i0;

                /* JADX INFO: renamed from: i1 */
                public PorterDuff.Mode f9268i1;

                /* JADX INFO: renamed from: j0 */
                public ColorStateList f9269j0;

                /* JADX INFO: renamed from: j1 */
                public int[] f9270j1;

                /* JADX INFO: renamed from: k0 */
                public float f9271k0;

                /* JADX INFO: renamed from: k1 */
                public ColorStateList f9272k1;

                /* JADX INFO: renamed from: l0 */
                public float f9273l0;

                /* JADX INFO: renamed from: l1 */
                public WeakReference f9274l1;

                /* JADX INFO: renamed from: m0 */
                public ColorStateList f9275m0;

                /* JADX INFO: renamed from: m1 */
                public TextUtils.TruncateAt f9276m1;

                /* JADX INFO: renamed from: n0 */
                public float f9277n0;

                /* JADX INFO: renamed from: n1 */
                public boolean f9278n1;

                /* JADX INFO: renamed from: o0 */
                public ColorStateList f9279o0;

                /* JADX INFO: renamed from: o1 */
                public int f9280o1;

                /* JADX INFO: renamed from: p0 */
                public CharSequence f9281p0;

                /* JADX INFO: renamed from: p1 */
                public boolean f9282p1;

                /* JADX INFO: renamed from: q0 */
                public boolean f9283q0;

                /* JADX INFO: renamed from: r0 */
                public Drawable f9284r0;

                /* JADX INFO: renamed from: s0 */
                public ColorStateList f9285s0;

                /* JADX INFO: renamed from: t0 */
                public float f9286t0;

                /* JADX INFO: renamed from: u0 */
                public boolean f9287u0;

                /* JADX INFO: renamed from: v0 */
                public boolean f9288v0;

                /* JADX INFO: renamed from: w0 */
                public Drawable f9289w0;

                /* JADX INFO: renamed from: x0 */
                public RippleDrawable f9290x0;

                /* JADX INFO: renamed from: y0 */
                public ColorStateList f9291y0;

                /* JADX INFO: renamed from: z0 */
                public float f9292z0;

                public C1004hu(Context context, AttributeSet attributeSet, int i) {
/* 3 */             super(context, attributeSet, i, Chip.f4576l0);
/* 8 */             this.f9273l0 = -1.0f;
/* 16 */            this.f9249Q0 = new Paint(1);
/* 23 */            this.f9250R0 = new Paint.FontMetrics();
/* 30 */            this.f9251S0 = new RectF();
/* 37 */            this.f9252T0 = new PointF();
/* 44 */            this.f9253U0 = new Path();
/* 48 */            this.f9263e1 = 255;
/* 52 */            this.f9268i1 = PorterDuff.Mode.SRC_IN;
/* 60 */            this.f9274l1 = new WeakReference(null);
/* 62 */            m3739k(context);
/* 65 */            this.f9248P0 = context;
/* 69 */            gn2 gn2Var = new gn2(this);
/* 72 */            this.f9254V0 = gn2Var;
/* 76 */            this.f9281p0 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 90 */            gn2Var.f8747a.density = context.getResources().getDisplayMetrics().density;
/* 92 */            int[] iArr = f9231q1;
/* 94 */            setState(iArr);
/* 103 */           if (!Arrays.equals(this.f9270j1, iArr)) {
/* 105 */               this.f9270j1 = iArr;
/* 111 */               if (m4301b0()) {
/* 117 */                   m4278E(getState(), iArr);
                        }
                    }
/* 120 */           this.f9278n1 = true;
/* 122 */           int[] iArr2 = c52.f2721a;
/* 127 */           f9232r1.setTint(-1);
                }

                /* JADX INFO: renamed from: B */
                public static boolean m4273B(ColorStateList colorStateList) {
                    return colorStateList != null && colorStateList.isStateful();
                }

                /* JADX INFO: renamed from: C */
                public static boolean m4274C(Drawable drawable) {
                    return drawable != null && drawable.isStateful();
                }

                /* JADX INFO: renamed from: c0 */
                public static void m4275c0(Drawable drawable) {
/* 1 */             if (drawable != null) {
/* 4 */                 drawable.setCallback(null);
                    }
                }

                /* JADX INFO: renamed from: A */
                public final float m4276A() {
                    return this.f9282p1 ? m3737i() : this.f9273l0;
                }

                /* JADX INFO: renamed from: D */
                public final void m4277D() {
/* 7 */             Chip chip = (Chip) this.f9274l1.get();
/* 9 */             if (chip != null) {
/* 13 */                chip.m2280c(chip.f4588e0);
/* 16 */                chip.requestLayout();
/* 19 */                chip.invalidateOutline();
                    }
                }

                /* JADX INFO: renamed from: E */
                public final boolean m4278E(int[] iArr, int[] iArr2) {
                    boolean z;
                    boolean z2;
                    ColorStateList colorStateList;
/* 1 */             boolean zOnStateChange = super.onStateChange(iArr);
/* 5 */             ColorStateList colorStateList2 = this.f9267i0;
/* 18 */            int iM3731c = m3731c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f9255W0) : 0);
/* 24 */            boolean state = true;
/* 25 */            if (this.f9255W0 != iM3731c) {
/* 27 */                this.f9255W0 = iM3731c;
/* 29 */                zOnStateChange = true;
                    }
/* 30 */            ColorStateList colorStateList3 = this.f9269j0;
/* 42 */            int iM3731c2 = m3731c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f9256X0) : 0);
/* 48 */            if (this.f9256X0 != iM3731c2) {
/* 50 */                this.f9256X0 = iM3731c2;
/* 52 */                zOnStateChange = true;
                    }
/* 53 */            int iM1452d = AbstractC0196bx.m1452d(iM3731c2, iM3731c);
/* 74 */            if ((this.f9257Y0 != iM1452d) | (this.f8151a.f7637c == null)) {
/* 76 */                this.f9257Y0 = iM1452d;
/* 82 */                m3742n(ColorStateList.valueOf(iM1452d));
/* 85 */                zOnStateChange = true;
                    }
/* 86 */            ColorStateList colorStateList4 = this.f9275m0;
/* 97 */            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f9258Z0) : 0;
/* 100 */           if (this.f9258Z0 != colorForState) {
/* 102 */               this.f9258Z0 = colorForState;
/* 104 */               zOnStateChange = true;
                    }
/* 124 */           int colorForState2 = (this.f9272k1 == null || !c52.m1536c(iArr)) ? 0 : this.f9272k1.getColorForState(iArr, this.f9259a1);
/* 127 */           if (this.f9259a1 != colorForState2) {
/* 129 */               this.f9259a1 = colorForState2;
                    }
/* 133 */           dn2 dn2Var = this.f9254V0.f8752f;
/* 148 */           int colorForState3 = (dn2Var == null || (colorStateList = dn2Var.f7346j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f9260b1);
/* 151 */           if (this.f9260b1 != colorForState3) {
/* 153 */               this.f9260b1 = colorForState3;
/* 155 */               zOnStateChange = true;
                    }
/* 156 */           int[] state2 = getState();
/* 160 */           if (state2 != null) {
/* 163 */               int length = state2.length;
/* 164 */               int i = 0;
                        while (true) {
/* 165 */                   if (i < length) {
/* 172 */                       if (state2[i] != 16842912) {
/* 180 */                           i++;
                                } else if (this.f9234B0) {
/* 178 */                           z = true;
                                    break;
                                }
                            }
/* 183 */                   z = false;
                            break;
                        }
                    } else {
/* 183 */               z = false;
                        break;
                    }
/* 186 */           if (this.f9261c1 == z || this.f9236D0 == null) {
/* 212 */               z2 = false;
                    } else {
/* 192 */               float fM4304y = m4304y();
/* 196 */               this.f9261c1 = z;
/* 204 */               if (fM4304y != m4304y()) {
/* 206 */                   zOnStateChange = true;
/* 207 */                   z2 = true;
                        } else {
/* 209 */                   z2 = false;
/* 210 */                   zOnStateChange = true;
                        }
                    }
/* 213 */           ColorStateList colorStateList5 = this.f9266h1;
/* 224 */           int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f9262d1) : 0;
/* 227 */           if (this.f9262d1 != colorForState4) {
/* 229 */               this.f9262d1 = colorForState4;
/* 231 */               ColorStateList colorStateList6 = this.f9266h1;
/* 233 */               PorterDuff.Mode mode = this.f9268i1;
/* 255 */               this.f9265g1 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                    } else {
/* 258 */               state = zOnStateChange;
                    }
/* 265 */           if (m4274C(this.f9284r0)) {
/* 273 */               state |= this.f9284r0.setState(iArr);
                    }
/* 280 */           if (m4274C(this.f9236D0)) {
/* 288 */               state |= this.f9236D0.setState(iArr);
                    }
/* 295 */           if (m4274C(this.f9289w0)) {
/* 300 */               int[] iArr3 = new int[iArr.length + iArr2.length];
/* 303 */               System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
/* 308 */               System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
/* 317 */               state |= this.f9289w0.setState(iArr3);
                    }
/* 318 */           int[] iArr4 = c52.f2721a;
/* 326 */           if (m4274C(this.f9290x0)) {
/* 334 */               state |= this.f9290x0.setState(iArr2);
                    }
/* 335 */           if (state) {
/* 337 */               invalidateSelf();
                    }
/* 340 */           if (z2) {
/* 342 */               m4277D();
                    }
/* 345 */           return state;
                }

                /* JADX INFO: renamed from: F */
                public final void m4279F(boolean z) {
/* 3 */             if (this.f9234B0 != z) {
/* 5 */                 this.f9234B0 = z;
/* 7 */                 float fM4304y = m4304y();
/* 11 */                if (!z && this.f9261c1) {
/* 18 */                    this.f9261c1 = false;
                        }
/* 20 */                float fM4304y2 = m4304y();
/* 24 */                invalidateSelf();
/* 29 */                if (fM4304y != fM4304y2) {
/* 31 */                    m4277D();
                        }
                    }
                }

                /* JADX INFO: renamed from: G */
                public final void m4280G(Drawable drawable) {
/* 3 */             if (this.f9236D0 != drawable) {
/* 5 */                 float fM4304y = m4304y();
/* 9 */                 this.f9236D0 = drawable;
/* 11 */                float fM4304y2 = m4304y();
/* 17 */                m4275c0(this.f9236D0);
/* 22 */                m4302w(this.f9236D0);
/* 25 */                invalidateSelf();
/* 30 */                if (fM4304y != fM4304y2) {
/* 32 */                    m4277D();
                        }
                    }
                }

                /* JADX INFO: renamed from: H */
                public final void m4281H(ColorStateList colorStateList) {
                    Drawable drawable;
/* 3 */             if (this.f9237E0 != colorStateList) {
/* 5 */                 this.f9237E0 = colorStateList;
/* 9 */                 if (this.f9235C0 && (drawable = this.f9236D0) != null && this.f9234B0) {
/* 19 */                    s90.m8448h(drawable, colorStateList);
                        }
/* 26 */                onStateChange(getState());
                    }
                }

                /* JADX INFO: renamed from: I */
                public final void m4282I(boolean z) {
/* 3 */             if (this.f9235C0 != z) {
/* 5 */                 boolean zM4299Z = m4299Z();
/* 9 */                 this.f9235C0 = z;
/* 11 */                boolean zM4299Z2 = m4299Z();
/* 15 */                if (zM4299Z != zM4299Z2) {
/* 17 */                    Drawable drawable = this.f9236D0;
/* 19 */                    if (zM4299Z2) {
/* 21 */                        m4302w(drawable);
                            } else {
/* 25 */                        m4275c0(drawable);
                            }
/* 28 */                    invalidateSelf();
/* 31 */                    m4277D();
                        }
                    }
                }

                /* JADX INFO: renamed from: J */
                public final void m4283J(float f) {
/* 5 */             if (this.f9273l0 != f) {
/* 7 */                 this.f9273l0 = f;
/* 13 */                sc2 sc2VarM8779f = this.f8151a.f7635a.m8779f();
/* 17 */                sc2VarM8779f.m8479b(f);
/* 24 */                setShapeAppearanceModel(sc2VarM8779f.m8478a());
                    }
                }

                /* JADX INFO: renamed from: K */
                public final void m4284K(Drawable drawable) {
/* 1 */             Drawable drawable2 = this.f9284r0;
/* 4 */             if (drawable2 == null) {
/* 7 */                 drawable2 = null;
                    }
/* 8 */             if (drawable2 != drawable) {
/* 10 */                float fM4304y = m4304y();
/* 20 */                this.f9284r0 = drawable != null ? drawable.mutate() : null;
/* 22 */                float fM4304y2 = m4304y();
/* 26 */                m4275c0(drawable2);
/* 33 */                if (m4300a0()) {
/* 37 */                    m4302w(this.f9284r0);
                        }
/* 40 */                invalidateSelf();
/* 45 */                if (fM4304y != fM4304y2) {
/* 47 */                    m4277D();
                        }
                    }
                }

                /* JADX INFO: renamed from: L */
                public final void m4285L(float f) {
/* 5 */             if (this.f9286t0 != f) {
/* 7 */                 float fM4304y = m4304y();
/* 11 */                this.f9286t0 = f;
/* 13 */                float fM4304y2 = m4304y();
/* 17 */                invalidateSelf();
/* 22 */                if (fM4304y != fM4304y2) {
/* 24 */                    m4277D();
                        }
                    }
                }

                /* JADX INFO: renamed from: M */
                public final void m4286M(ColorStateList colorStateList) {
/* 2 */             this.f9287u0 = true;
/* 6 */             if (this.f9285s0 != colorStateList) {
/* 8 */                 this.f9285s0 = colorStateList;
/* 14 */                if (m4300a0()) {
/* 18 */                    s90.m8448h(this.f9284r0, colorStateList);
                        }
/* 25 */                onStateChange(getState());
                    }
                }

                /* JADX INFO: renamed from: N */
                public final void m4287N(boolean z) {
/* 3 */             if (this.f9283q0 != z) {
/* 5 */                 boolean zM4300a0 = m4300a0();
/* 9 */                 this.f9283q0 = z;
/* 11 */                boolean zM4300a1 = m4300a0();
/* 15 */                if (zM4300a0 != zM4300a1) {
/* 17 */                    Drawable drawable = this.f9284r0;
/* 19 */                    if (zM4300a1) {
/* 21 */                        m4302w(drawable);
                            } else {
/* 25 */                        m4275c0(drawable);
                            }
/* 28 */                    invalidateSelf();
/* 31 */                    m4277D();
                        }
                    }
                }

                /* JADX INFO: renamed from: O */
                public final void m4288O(ColorStateList colorStateList) {
/* 3 */             if (this.f9275m0 != colorStateList) {
/* 5 */                 this.f9275m0 = colorStateList;
/* 9 */                 if (this.f9282p1) {
/* 11 */                    m3747s(colorStateList);
                        }
/* 18 */                onStateChange(getState());
                    }
                }

                /* JADX INFO: renamed from: P */
                public final void m4289P(float f) {
/* 5 */             if (this.f9277n0 != f) {
/* 7 */                 this.f9277n0 = f;
/* 11 */                this.f9249Q0.setStrokeWidth(f);
/* 16 */                if (this.f9282p1) {
/* 20 */                    this.f8151a.f7644j = f;
/* 22 */                    invalidateSelf();
                        }
/* 25 */                invalidateSelf();
                    }
                }

                /* JADX INFO: renamed from: Q */
                public final void m4290Q(Drawable drawable) {
/* 1 */             Drawable drawable2 = this.f9289w0;
/* 4 */             if (drawable2 == null) {
/* 7 */                 drawable2 = null;
                    }
/* 8 */             if (drawable2 != drawable) {
/* 10 */                float fM4305z = m4305z();
/* 20 */                this.f9289w0 = drawable != null ? drawable.mutate() : null;
/* 22 */                int[] iArr = c52.f2721a;
/* 39 */                this.f9290x0 = new RippleDrawable(c52.m1535b(this.f9279o0), this.f9289w0, f9232r1);
/* 41 */                float fM4305z2 = m4305z();
/* 45 */                m4275c0(drawable2);
/* 52 */                if (m4301b0()) {
/* 56 */                    m4302w(this.f9289w0);
                        }
/* 59 */                invalidateSelf();
/* 64 */                if (fM4305z != fM4305z2) {
/* 66 */                    m4277D();
                        }
                    }
                }

                /* JADX INFO: renamed from: R */
                public final void m4291R(float f) {
/* 5 */             if (this.f9246N0 != f) {
/* 7 */                 this.f9246N0 = f;
/* 9 */                 invalidateSelf();
/* 16 */                if (m4301b0()) {
/* 18 */                    m4277D();
                        }
                    }
                }

                /* JADX INFO: renamed from: S */
                public final void m4292S(float f) {
/* 5 */             if (this.f9292z0 != f) {
/* 7 */                 this.f9292z0 = f;
/* 9 */                 invalidateSelf();
/* 16 */                if (m4301b0()) {
/* 18 */                    m4277D();
                        }
                    }
                }

                /* JADX INFO: renamed from: T */
                public final void m4293T(float f) {
/* 5 */             if (this.f9245M0 != f) {
/* 7 */                 this.f9245M0 = f;
/* 9 */                 invalidateSelf();
/* 16 */                if (m4301b0()) {
/* 18 */                    m4277D();
                        }
                    }
                }

                /* JADX INFO: renamed from: U */
                public final void m4294U(ColorStateList colorStateList) {
/* 3 */             if (this.f9291y0 != colorStateList) {
/* 5 */                 this.f9291y0 = colorStateList;
/* 11 */                if (m4301b0()) {
/* 15 */                    s90.m8448h(this.f9289w0, colorStateList);
                        }
/* 22 */                onStateChange(getState());
                    }
                }

                /* JADX INFO: renamed from: V */
                public final void m4295V(boolean z) {
/* 3 */             if (this.f9288v0 != z) {
/* 5 */                 boolean zM4301b0 = m4301b0();
/* 9 */                 this.f9288v0 = z;
/* 11 */                boolean zM4301b1 = m4301b0();
/* 15 */                if (zM4301b0 != zM4301b1) {
/* 17 */                    Drawable drawable = this.f9289w0;
/* 19 */                    if (zM4301b1) {
/* 21 */                        m4302w(drawable);
                            } else {
/* 25 */                        m4275c0(drawable);
                            }
/* 28 */                    invalidateSelf();
/* 31 */                    m4277D();
                        }
                    }
                }

                /* JADX INFO: renamed from: W */
                public final void m4296W(float f) {
/* 5 */             if (this.f9242J0 != f) {
/* 7 */                 float fM4304y = m4304y();
/* 11 */                this.f9242J0 = f;
/* 13 */                float fM4304y2 = m4304y();
/* 17 */                invalidateSelf();
/* 22 */                if (fM4304y != fM4304y2) {
/* 24 */                    m4277D();
                        }
                    }
                }

                /* JADX INFO: renamed from: X */
                public final void m4297X(float f) {
/* 5 */             if (this.f9241I0 != f) {
/* 7 */                 float fM4304y = m4304y();
/* 11 */                this.f9241I0 = f;
/* 13 */                float fM4304y2 = m4304y();
/* 17 */                invalidateSelf();
/* 22 */                if (fM4304y != fM4304y2) {
/* 24 */                    m4277D();
                        }
                    }
                }

                /* JADX INFO: renamed from: Y */
                public final void m4298Y(ColorStateList colorStateList) {
/* 3 */             if (this.f9279o0 != colorStateList) {
/* 5 */                 this.f9279o0 = colorStateList;
/* 8 */                 this.f9272k1 = null;
/* 14 */                onStateChange(getState());
                    }
                }

                /* JADX INFO: renamed from: Z */
                public final boolean m4299Z() {
                    return this.f9235C0 && this.f9236D0 != null && this.f9261c1;
                }

                @Override // p000.fd1, p000.fn2
                /* JADX INFO: renamed from: a */
                public final void mo3729a() {
/* 1 */             m4277D();
/* 4 */             invalidateSelf();
                }

                /* JADX INFO: renamed from: a0 */
                public final boolean m4300a0() {
                    return this.f9283q0 && this.f9284r0 != null;
                }

                /* JADX INFO: renamed from: b0 */
                public final boolean m4301b0() {
                    return this.f9288v0 && this.f9289w0 != null;
                }

                @Override // p000.fd1, android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
                    int i;
                    Canvas canvas2;
                    int iSaveLayerAlpha;
                    int i2;
/* 3 */             Rect bounds = getBounds();
/* 11 */            if (bounds.isEmpty() || (i = this.f9263e1) == 0) {
/* 707 */               return;
                    }
/* 22 */            if (i < 255) {
/* 36 */                canvas2 = canvas;
/* 38 */                iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
                    } else {
/* 44 */                canvas2 = canvas;
/* 46 */                iSaveLayerAlpha = 0;
                    }
/* 47 */            boolean z = this.f9282p1;
/* 50 */            Paint paint = this.f9249Q0;
/* 52 */            RectF rectF = this.f9251S0;
/* 54 */            if (!z) {
/* 58 */                paint.setColor(this.f9255W0);
/* 63 */                paint.setStyle(Paint.Style.FILL);
/* 66 */                rectF.set(bounds);
/* 77 */                canvas2.drawRoundRect(rectF, m4276A(), m4276A(), paint);
                    }
/* 82 */            if (!this.f9282p1) {
/* 86 */                paint.setColor(this.f9256X0);
/* 91 */                paint.setStyle(Paint.Style.FILL);
/* 94 */                ColorFilter colorFilter = this.f9264f1;
/* 96 */                if (colorFilter == null) {
/* 99 */                    colorFilter = this.f9265g1;
                        }
/* 101 */               paint.setColorFilter(colorFilter);
/* 104 */               rectF.set(bounds);
/* 115 */               canvas2.drawRoundRect(rectF, m4276A(), m4276A(), paint);
                    }
/* 120 */           if (this.f9282p1) {
/* 122 */               super.draw(canvas);
                    }
/* 132 */           if (this.f9277n0 > 0.0f && !this.f9282p1) {
/* 140 */               paint.setColor(this.f9258Z0);
/* 145 */               paint.setStyle(Paint.Style.STROKE);
/* 150 */               if (!this.f9282p1) {
/* 152 */                   ColorFilter colorFilter2 = this.f9264f1;
/* 154 */                   if (colorFilter2 == null) {
/* 157 */                       colorFilter2 = this.f9265g1;
                            }
/* 159 */                   paint.setColorFilter(colorFilter2);
                        }
/* 162 */               float f = bounds.left;
/* 167 */               float f2 = this.f9277n0 / 2.0f;
/* 181 */               rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
/* 189 */               float f3 = this.f9273l0 - (this.f9277n0 / 2.0f);
/* 190 */               canvas2.drawRoundRect(rectF, f3, f3, paint);
                    }
/* 195 */           paint.setColor(this.f9259a1);
/* 200 */           paint.setStyle(Paint.Style.FILL);
/* 203 */           rectF.set(bounds);
/* 208 */           if (this.f9282p1) {
/* 225 */               RectF rectF2 = new RectF(bounds);
/* 228 */               ed1 ed1Var = this.f8151a;
/* 230 */               tc2 tc2Var = ed1Var.f7635a;
/* 232 */               float f4 = ed1Var.f7643i;
/* 234 */               ts0 ts0Var = this.f8154b0;
/* 236 */               vc2 vc2Var = this.f8156c0;
/* 238 */               Path path = this.f9253U0;
/* 246 */               vc2Var.m9251a(tc2Var, f4, rectF2, ts0Var, path);
/* 259 */               m3733e(canvas2, paint, path, this.f8151a.f7635a, m3735g());
                    } else {
/* 218 */               canvas2.drawRoundRect(rectF, m4276A(), m4276A(), paint);
                    }
/* 267 */           if (m4300a0()) {
/* 269 */               m4303x(bounds, rectF);
/* 272 */               float f5 = rectF.left;
/* 274 */               float f6 = rectF.top;
/* 276 */               canvas2.translate(f5, f6);
/* 291 */               this.f9284r0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
/* 296 */               this.f9284r0.draw(canvas2);
/* 301 */               canvas2.translate(-f5, -f6);
                    }
/* 308 */           if (m4299Z()) {
/* 310 */               m4303x(bounds, rectF);
/* 313 */               float f7 = rectF.left;
/* 315 */               float f8 = rectF.top;
/* 317 */               canvas2.translate(f7, f8);
/* 332 */               this.f9236D0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
/* 337 */               this.f9236D0.draw(canvas2);
/* 342 */               canvas2.translate(-f7, -f8);
                    }
/* 347 */           if (this.f9278n1 && this.f9281p0 != null) {
/* 353 */               PointF pointF = this.f9252T0;
/* 355 */               pointF.set(0.0f, 0.0f);
/* 358 */               Paint.Align align = Paint.Align.LEFT;
/* 360 */               CharSequence charSequence = this.f9281p0;
/* 362 */               gn2 gn2Var = this.f9254V0;
/* 364 */               if (charSequence != null) {
/* 375 */                   float fM4304y = m4304y() + this.f9240H0 + this.f9243K0;
/* 380 */                   if (t90.m8738a(this) == 0) {
/* 386 */                       pointF.x = bounds.left + fM4304y;
                            } else {
/* 393 */                       pointF.x = bounds.right - fM4304y;
/* 395 */                       align = Paint.Align.RIGHT;
                            }
/* 397 */                   float fCenterY = bounds.centerY();
/* 402 */                   TextPaint textPaint = gn2Var.f8747a;
/* 404 */                   Paint.FontMetrics fontMetrics = this.f9250R0;
/* 406 */                   textPaint.getFontMetrics(fontMetrics);
/* 416 */                   pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                        }
/* 418 */               rectF.setEmpty();
/* 423 */               if (this.f9281p0 != null) {
/* 434 */                   float fM4304y2 = m4304y() + this.f9240H0 + this.f9243K0;
/* 444 */                   float fM4305z = m4305z() + this.f9247O0 + this.f9244L0;
/* 445 */                   int iM8738a = t90.m8738a(this);
/* 449 */                   int i3 = bounds.left;
/* 451 */                   if (iM8738a == 0) {
/* 455 */                       rectF.left = i3 + fM4304y2;
/* 461 */                       rectF.right = bounds.right - fM4305z;
                            } else {
/* 466 */                       rectF.left = i3 + fM4305z;
/* 472 */                       rectF.right = bounds.right - fM4304y2;
                            }
/* 477 */                   rectF.top = bounds.top;
/* 482 */                   rectF.bottom = bounds.bottom;
                        }
/* 484 */               dn2 dn2Var = gn2Var.f8752f;
/* 486 */               TextPaint textPaint2 = gn2Var.f8747a;
/* 488 */               if (dn2Var != null) {
/* 494 */                   textPaint2.drawableState = getState();
/* 502 */                   gn2Var.f8752f.m3162e(this.f9248P0, textPaint2, gn2Var.f8748b);
                        }
/* 505 */               textPaint2.setTextAlign(align);
/* 535 */               boolean z2 = Math.round(gn2Var.m3977a(this.f9281p0.toString())) > Math.round(rectF.width());
/* 536 */               if (z2) {
/* 538 */                   int iSave = canvas2.save();
/* 542 */                   canvas2.clipRect(rectF);
/* 545 */                   i2 = iSave;
                        } else {
/* 547 */                   i2 = 0;
                        }
/* 548 */               CharSequence charSequenceEllipsize = this.f9281p0;
/* 550 */               if (z2 && this.f9276m1 != null) {
/* 562 */                   charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f9276m1);
                        }
/* 578 */               canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
/* 581 */               canvas2 = canvas;
/* 582 */               if (z2) {
/* 584 */                   canvas2.restoreToCount(i2);
                        }
                    }
/* 591 */           if (m4301b0()) {
/* 593 */               rectF.setEmpty();
/* 600 */               if (m4301b0()) {
/* 606 */                   float f9 = this.f9247O0 + this.f9246N0;
/* 611 */                   if (t90.m8738a(this) == 0) {
/* 616 */                       float f10 = bounds.right - f9;
/* 617 */                       rectF.right = f10;
/* 622 */                       rectF.left = f10 - this.f9292z0;
                            } else {
/* 628 */                       float f11 = bounds.left + f9;
/* 629 */                       rectF.left = f11;
/* 634 */                       rectF.right = f11 + this.f9292z0;
                            }
/* 636 */                   float fExactCenterY = bounds.exactCenterY();
/* 640 */                   float f12 = this.f9292z0;
/* 644 */                   float f13 = fExactCenterY - (f12 / 2.0f);
/* 645 */                   rectF.top = f13;
/* 648 */                   rectF.bottom = f13 + f12;
                        }
/* 650 */               float f14 = rectF.left;
/* 652 */               float f15 = rectF.top;
/* 654 */               canvas2.translate(f14, f15);
/* 669 */               this.f9289w0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
/* 672 */               int[] iArr = c52.f2721a;
/* 682 */               this.f9290x0.setBounds(this.f9289w0.getBounds());
/* 687 */               this.f9290x0.jumpToCurrentState();
/* 692 */               this.f9290x0.draw(canvas2);
/* 697 */               canvas2.translate(-f14, -f15);
                    }
/* 702 */           if (this.f9263e1 < 255) {
/* 704 */               canvas2.restoreToCount(iSaveLayerAlpha);
                    }
                }

                @Override // p000.fd1, android.graphics.drawable.Drawable
                public final int getAlpha() {
/* 1 */             return this.f9263e1;
                }

                @Override // android.graphics.drawable.Drawable
                public final ColorFilter getColorFilter() {
/* 1 */             return this.f9264f1;
                }

                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicHeight() {
/* 3 */             return (int) this.f9271k0;
                }

                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicWidth() {
/* 41 */            return Math.min(Math.round(m4305z() + this.f9254V0.m3977a(this.f9281p0.toString()) + m4304y() + this.f9240H0 + this.f9243K0 + this.f9244L0 + this.f9247O0), this.f9280o1);
                }

                @Override // p000.fd1, android.graphics.drawable.Drawable
                public final int getOpacity() {
/* 1 */             return -3;
                }

                @Override // p000.fd1, android.graphics.drawable.Drawable
                public final void getOutline(Outline outline) {
                    Outline outline2;
/* 3 */             if (this.f9282p1) {
/* 5 */                 super.getOutline(outline);
/* 8 */                 return;
                    }
/* 9 */             Rect bounds = getBounds();
/* 17 */            if (bounds.isEmpty()) {
/* 37 */                outline2 = outline;
/* 38 */                outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f9271k0, this.f9273l0);
                    } else {
/* 21 */                outline.setRoundRect(bounds, this.f9273l0);
/* 24 */                outline2 = outline;
                    }
/* 47 */            outline2.setAlpha(this.f9263e1 / 255.0f);
                }

                @Override // android.graphics.drawable.Drawable.Callback
                public final void invalidateDrawable(Drawable drawable) {
/* 1 */             Drawable.Callback callback = getCallback();
/* 5 */             if (callback != null) {
/* 7 */                 callback.invalidateDrawable(this);
                    }
                }

                @Override // p000.fd1, android.graphics.drawable.Drawable
                public final boolean isStateful() {
                    ColorStateList colorStateList;
/* 7 */             if (m4273B(this.f9267i0) || m4273B(this.f9269j0) || m4273B(this.f9275m0)) {
/* 82 */                return true;
                    }
/* 27 */            dn2 dn2Var = this.f9254V0.f8752f;
/* 29 */            if (dn2Var == null || (colorStateList = dn2Var.f7346j) == null || !colorStateList.isStateful()) {
                        return (this.f9235C0 && this.f9236D0 != null && this.f9234B0) || m4274C(this.f9284r0) || m4274C(this.f9236D0) || m4273B(this.f9266h1);
                    }
/* 82 */            return true;
                }

                @Override // android.graphics.drawable.Drawable
                public final boolean onLayoutDirectionChanged(int i) {
/* 1 */             boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
/* 9 */             if (m4300a0()) {
/* 17 */                zOnLayoutDirectionChanged |= t90.m8739b(this.f9284r0, i);
                    }
/* 22 */            if (m4299Z()) {
/* 30 */                zOnLayoutDirectionChanged |= t90.m8739b(this.f9236D0, i);
                    }
/* 35 */            if (m4301b0()) {
/* 43 */                zOnLayoutDirectionChanged |= t90.m8739b(this.f9289w0, i);
                    }
/* 44 */            if (!zOnLayoutDirectionChanged) {
/* 49 */                return true;
                    }
/* 46 */            invalidateSelf();
/* 49 */            return true;
                }

                @Override // android.graphics.drawable.Drawable
                public final boolean onLevelChange(int i) {
/* 1 */             boolean zOnLevelChange = super.onLevelChange(i);
/* 9 */             if (m4300a0()) {
/* 17 */                zOnLevelChange |= this.f9284r0.setLevel(i);
                    }
/* 22 */            if (m4299Z()) {
/* 30 */                zOnLevelChange |= this.f9236D0.setLevel(i);
                    }
/* 35 */            if (m4301b0()) {
/* 43 */                zOnLevelChange |= this.f9289w0.setLevel(i);
                    }
/* 44 */            if (zOnLevelChange) {
/* 46 */                invalidateSelf();
                    }
/* 49 */            return zOnLevelChange;
                }

                @Override // p000.fd1, android.graphics.drawable.Drawable
                public final boolean onStateChange(int[] iArr) {
/* 3 */             if (this.f9282p1) {
/* 5 */                 super.onStateChange(iArr);
                    }
/* 10 */            return m4278E(iArr, this.f9270j1);
                }

                @Override // android.graphics.drawable.Drawable.Callback
                public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
/* 1 */             Drawable.Callback callback = getCallback();
/* 5 */             if (callback != null) {
/* 7 */                 callback.scheduleDrawable(this, runnable, j);
                    }
                }

                @Override // p000.fd1, android.graphics.drawable.Drawable
                public final void setAlpha(int i) {
/* 3 */             if (this.f9263e1 != i) {
/* 5 */                 this.f9263e1 = i;
/* 7 */                 invalidateSelf();
                    }
                }

                @Override // p000.fd1, android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
/* 3 */             if (this.f9264f1 != colorFilter) {
/* 5 */                 this.f9264f1 = colorFilter;
/* 7 */                 invalidateSelf();
                    }
                }

                @Override // p000.fd1, android.graphics.drawable.Drawable
                public final void setTintList(ColorStateList colorStateList) {
/* 3 */             if (this.f9266h1 != colorStateList) {
/* 5 */                 this.f9266h1 = colorStateList;
/* 11 */                onStateChange(getState());
                    }
                }

                @Override // p000.fd1, android.graphics.drawable.Drawable
                public final void setTintMode(PorterDuff.Mode mode) {
/* 3 */             if (this.f9268i1 != mode) {
/* 5 */                 this.f9268i1 = mode;
/* 7 */                 ColorStateList colorStateList = this.f9266h1;
/* 30 */                this.f9265g1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
/* 32 */                invalidateSelf();
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public final boolean setVisible(boolean z, boolean z2) {
/* 1 */             boolean visible = super.setVisible(z, z2);
/* 9 */             if (m4300a0()) {
/* 17 */                visible |= this.f9284r0.setVisible(z, z2);
                    }
/* 22 */            if (m4299Z()) {
/* 30 */                visible |= this.f9236D0.setVisible(z, z2);
                    }
/* 35 */            if (m4301b0()) {
/* 43 */                visible |= this.f9289w0.setVisible(z, z2);
                    }
/* 44 */            if (visible) {
/* 46 */                invalidateSelf();
                    }
/* 49 */            return visible;
                }

                @Override // android.graphics.drawable.Drawable.Callback
                public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
/* 1 */             Drawable.Callback callback = getCallback();
/* 5 */             if (callback != null) {
/* 7 */                 callback.unscheduleDrawable(this, runnable);
                    }
                }

                /* JADX INFO: renamed from: w */
                public final void m4302w(Drawable drawable) {
/* 1 */             if (drawable == null) {
/* 76 */                return;
                    }
/* 4 */             drawable.setCallback(this);
/* 11 */            t90.m8739b(drawable, t90.m8738a(this));
/* 18 */            drawable.setLevel(getLevel());
/* 26 */            drawable.setVisible(isVisible(), false);
/* 31 */            if (drawable == this.f9289w0) {
/* 37 */                if (drawable.isStateful()) {
/* 41 */                    drawable.setState(this.f9270j1);
                        }
/* 46 */                s90.m8448h(drawable, this.f9291y0);
/* 49 */                return;
                    }
/* 50 */            Drawable drawable2 = this.f9284r0;
/* 52 */            if (drawable == drawable2 && this.f9287u0) {
/* 60 */                s90.m8448h(drawable2, this.f9285s0);
                    }
/* 67 */            if (drawable.isStateful()) {
/* 73 */                drawable.setState(getState());
                    }
                }

                /* JADX INFO: renamed from: x */
                public final void m4303x(Rect rect, RectF rectF) {
/* 1 */             rectF.setEmpty();
/* 8 */             if (m4300a0() || m4299Z()) {
/* 22 */                float f = this.f9240H0 + this.f9241I0;
/* 30 */                Drawable drawable = this.f9261c1 ? this.f9236D0 : this.f9284r0;
/* 32 */                float intrinsicWidth = this.f9286t0;
/* 37 */                if (intrinsicWidth <= 0.0f && drawable != null) {
/* 41 */                    intrinsicWidth = drawable.getIntrinsicWidth();
                        }
/* 50 */                if (t90.m8738a(this) == 0) {
/* 55 */                    float f2 = rect.left + f;
/* 56 */                    rectF.left = f2;
/* 59 */                    rectF.right = f2 + intrinsicWidth;
                        } else {
/* 65 */                    float f3 = rect.right - f;
/* 66 */                    rectF.right = f3;
/* 69 */                    rectF.left = f3 - intrinsicWidth;
                        }
/* 78 */                Drawable drawable2 = this.f9261c1 ? this.f9236D0 : this.f9284r0;
/* 80 */                float fCeil = this.f9286t0;
/* 84 */                if (fCeil <= 0.0f && drawable2 != null) {
/* 101 */                   fCeil = (float) Math.ceil(kb1.m6028A(this.f9248P0, 24));
/* 109 */                   if (drawable2.getIntrinsicHeight() <= fCeil) {
/* 111 */                       fCeil = drawable2.getIntrinsicHeight();
                            }
                        }
/* 124 */               float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
/* 125 */               rectF.top = fExactCenterY;
/* 128 */               rectF.bottom = fExactCenterY + fCeil;
                    }
                }

                /* JADX INFO: renamed from: y */
                public final float m4304y() {
/* 6 */             if (!m4300a0() && !m4299Z()) {
/* 5 */                 return 0.0f;
                    }
/* 16 */            float f = this.f9241I0;
/* 25 */            Drawable drawable = this.f9261c1 ? this.f9236D0 : this.f9284r0;
/* 27 */            float intrinsicWidth = this.f9286t0;
/* 31 */            if (intrinsicWidth <= 0.0f && drawable != null) {
/* 35 */                intrinsicWidth = drawable.getIntrinsicWidth();
                    }
/* 43 */            return intrinsicWidth + f + this.f9242J0;
                }

                /* JADX INFO: renamed from: z */
                public final float m4305z() {
/* 5 */             if (m4301b0()) {
/* 14 */                return this.f9245M0 + this.f9292z0 + this.f9246N0;
                    }
/* 16 */            return 0.0f;
                }
            }
