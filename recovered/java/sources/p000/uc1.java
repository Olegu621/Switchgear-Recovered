            package p000;

            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.InsetDrawable;
            import android.graphics.drawable.LayerDrawable;
            import android.graphics.drawable.RippleDrawable;
            import com.google.android.material.R$attr;
            import com.google.android.material.button.MaterialButton;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class uc1 {

                /* JADX INFO: renamed from: a */
                public final MaterialButton f17449a;

                /* JADX INFO: renamed from: b */
                public tc2 f17450b;

                /* JADX INFO: renamed from: c */
                public int f17451c;

                /* JADX INFO: renamed from: d */
                public int f17452d;

                /* JADX INFO: renamed from: e */
                public int f17453e;

                /* JADX INFO: renamed from: f */
                public int f17454f;

                /* JADX INFO: renamed from: g */
                public int f17455g;

                /* JADX INFO: renamed from: h */
                public int f17456h;

                /* JADX INFO: renamed from: i */
                public PorterDuff.Mode f17457i;

                /* JADX INFO: renamed from: j */
                public ColorStateList f17458j;

                /* JADX INFO: renamed from: k */
                public ColorStateList f17459k;

                /* JADX INFO: renamed from: l */
                public ColorStateList f17460l;

                /* JADX INFO: renamed from: m */
                public fd1 f17461m;

                /* JADX INFO: renamed from: n */
                public boolean f17462n = false;

                /* JADX INFO: renamed from: o */
                public boolean f17463o = false;

                /* JADX INFO: renamed from: p */
                public boolean f17464p = false;

                /* JADX INFO: renamed from: q */
                public boolean f17465q;

                /* JADX INFO: renamed from: r */
                public RippleDrawable f17466r;

                /* JADX INFO: renamed from: s */
                public int f17467s;

                public uc1(MaterialButton materialButton, tc2 tc2Var) {
/* 11 */            this.f17449a = materialButton;
/* 13 */            this.f17450b = tc2Var;
                }

                /* JADX INFO: renamed from: a */
                public final ed2 m8998a() {
/* 1 */             RippleDrawable rippleDrawable = this.f17466r;
/* 3 */             if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
/* 37 */                return null;
                    }
/* 14 */            int numberOfLayers = this.f17466r.getNumberOfLayers();
/* 18 */            RippleDrawable rippleDrawable2 = this.f17466r;
                    return numberOfLayers > 2 ? (ed2) rippleDrawable2.getDrawable(2) : (ed2) rippleDrawable2.getDrawable(1);
                }

                /* JADX INFO: renamed from: b */
                public final fd1 m8999b(boolean z) {
/* 1 */             RippleDrawable rippleDrawable = this.f17466r;
/* 3 */             if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
/* 35 */                return null;
                    }
/* 32 */            return (fd1) ((LayerDrawable) ((InsetDrawable) this.f17466r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
                }

                /* JADX INFO: renamed from: c */
                public final void m9000c(tc2 tc2Var) {
/* 1 */             this.f17450b = tc2Var;
/* 8 */             if (m8999b(false) != null) {
/* 14 */                m8999b(false).setShapeAppearanceModel(tc2Var);
                    }
/* 22 */            if (m8999b(true) != null) {
/* 28 */                m8999b(true).setShapeAppearanceModel(tc2Var);
                    }
/* 35 */            if (m8998a() != null) {
/* 41 */                m8998a().setShapeAppearanceModel(tc2Var);
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m9001d(int i, int i2) {
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 3 */             MaterialButton materialButton = this.f17449a;
/* 5 */             int paddingStart = materialButton.getPaddingStart();
/* 9 */             int paddingTop = materialButton.getPaddingTop();
/* 13 */            int paddingEnd = materialButton.getPaddingEnd();
/* 17 */            int paddingBottom = materialButton.getPaddingBottom();
/* 21 */            int i3 = this.f17453e;
/* 23 */            int i4 = this.f17454f;
/* 25 */            this.f17454f = i2;
/* 27 */            this.f17453e = i;
/* 31 */            if (!this.f17463o) {
/* 33 */                m9002e();
                    }
/* 40 */            materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
                }

                /* JADX INFO: renamed from: e */
                public final void m9002e() {
/* 5 */             fd1 fd1Var = new fd1(this.f17450b);
/* 8 */             MaterialButton materialButton = this.f17449a;
/* 14 */            fd1Var.m3739k(materialButton.getContext());
/* 19 */            s90.m8448h(fd1Var, this.f17458j);
/* 22 */            PorterDuff.Mode mode = this.f17457i;
/* 24 */            if (mode != null) {
/* 26 */                s90.m8449i(fd1Var, mode);
                    }
/* 29 */            float f = this.f17456h;
/* 32 */            ColorStateList colorStateList = this.f17459k;
/* 36 */            fd1Var.f8151a.f7644j = f;
/* 38 */            fd1Var.invalidateSelf();
/* 41 */            fd1Var.m3747s(colorStateList);
/* 48 */            fd1 fd1Var2 = new fd1(this.f17450b);
/* 52 */            fd1Var2.setTint(0);
/* 55 */            float f2 = this.f17456h;
/* 69 */            int iM9779q = this.f17462n ? xe2.m9779q(R$attr.colorSurface, materialButton) : 0;
/* 72 */            fd1Var2.f8151a.f7644j = f2;
/* 74 */            fd1Var2.invalidateSelf();
/* 81 */            fd1Var2.m3747s(ColorStateList.valueOf(iM9779q));
/* 88 */            fd1 fd1Var3 = new fd1(this.f17450b);
/* 91 */            this.f17461m = fd1Var3;
/* 94 */            s90.m8447g(fd1Var3, -1);
/* 133 */           RippleDrawable rippleDrawable = new RippleDrawable(c52.m1535b(this.f17460l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{fd1Var2, fd1Var}), this.f17451c, this.f17453e, this.f17452d, this.f17454f), this.f17461m);
/* 136 */           this.f17466r = rippleDrawable;
/* 138 */           materialButton.setInternalBackground(rippleDrawable);
/* 141 */           fd1 fd1VarM8999b = m8999b(false);
/* 145 */           if (fd1VarM8999b != null) {
/* 150 */               fd1VarM8999b.m3741m(this.f17467s);
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m9003f() {
/* 1 */             int iM9779q = 0;
/* 2 */             fd1 fd1VarM8999b = m8999b(false);
/* 7 */             fd1 fd1VarM8999b2 = m8999b(true);
/* 11 */            if (fd1VarM8999b != null) {
/* 13 */                float f = this.f17456h;
/* 16 */                ColorStateList colorStateList = this.f17459k;
/* 20 */                fd1VarM8999b.f8151a.f7644j = f;
/* 22 */                fd1VarM8999b.invalidateSelf();
/* 25 */                fd1VarM8999b.m3747s(colorStateList);
/* 28 */                if (fd1VarM8999b2 != null) {
/* 30 */                    float f2 = this.f17456h;
/* 35 */                    if (this.f17462n) {
/* 41 */                        iM9779q = xe2.m9779q(R$attr.colorSurface, this.f17449a);
                            }
/* 47 */                    fd1VarM8999b2.f8151a.f7644j = f2;
/* 49 */                    fd1VarM8999b2.invalidateSelf();
/* 56 */                    fd1VarM8999b2.m3747s(ColorStateList.valueOf(iM9779q));
                        }
                    }
                }
            }
