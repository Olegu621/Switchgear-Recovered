            package p000;

            import android.R;
            import android.animation.ValueAnimator;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.LayerDrawable;
            import android.graphics.drawable.RippleDrawable;
            import android.graphics.drawable.StateListDrawable;
            import android.view.accessibility.AccessibilityManager;
            import android.view.animation.LinearInterpolator;
            import android.widget.AutoCompleteTextView;
            import android.widget.EditText;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$drawable;
            import com.google.android.material.R$string;
            import com.google.android.material.textfield.TextInputLayout;
            import java.util.LinkedHashSet;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class za0 extends de0 {

                /* JADX INFO: renamed from: e */
                public final wa0 f20019e;

                /* JADX INFO: renamed from: f */
                public final ViewOnFocusChangeListenerC1904lv f20020f;

                /* JADX INFO: renamed from: g */
                public final xa0 f20021g;

                /* JADX INFO: renamed from: h */
                public final C1941mv f20022h;

                /* JADX INFO: renamed from: i */
                public final C1978nv f20023i;

                /* JADX INFO: renamed from: j */
                public final ViewOnAttachStateChangeListenerC2228tr f20024j;

                /* JADX INFO: renamed from: k */
                public final gr0 f20025k;

                /* JADX INFO: renamed from: l */
                public boolean f20026l;

                /* JADX INFO: renamed from: m */
                public boolean f20027m;

                /* JADX INFO: renamed from: n */
                public long f20028n;

                /* JADX INFO: renamed from: o */
                public StateListDrawable f20029o;

                /* JADX INFO: renamed from: p */
                public fd1 f20030p;

                /* JADX INFO: renamed from: q */
                public AccessibilityManager f20031q;

                /* JADX INFO: renamed from: r */
                public ValueAnimator f20032r;

                /* JADX INFO: renamed from: s */
                public ValueAnimator f20033s;

                public za0(TextInputLayout textInputLayout, int i) {
/* 1 */             super(textInputLayout, i);
/* 10 */            this.f20019e = new wa0(this, 0);
/* 14 */            int i2 = 1;
/* 18 */            this.f20020f = new ViewOnFocusChangeListenerC1904lv(this, i2);
/* 25 */            this.f20021g = new xa0(this, textInputLayout);
/* 32 */            this.f20022h = new C1941mv(this, i2);
/* 39 */            this.f20023i = new C1978nv(this, 1);
/* 46 */            this.f20024j = new ViewOnAttachStateChangeListenerC2228tr(this, i2);
/* 53 */            this.f20025k = new gr0(this);
/* 55 */            this.f20026l = false;
/* 57 */            this.f20027m = false;
/* 64 */            this.f20028n = Long.MAX_VALUE;
                }

                /* JADX INFO: renamed from: d */
                public static void m10293d(za0 za0Var, AutoCompleteTextView autoCompleteTextView) {
/* 1 */             if (autoCompleteTextView == null) {
/* 3 */                 return;
                    }
/* 10 */            long jCurrentTimeMillis = System.currentTimeMillis() - za0Var.f20028n;
/* 16 */            if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
/* 24 */                za0Var.f20026l = false;
                    }
/* 28 */            if (za0Var.f20026l) {
/* 52 */                za0Var.f20026l = false;
/* 54 */                return;
                    }
/* 34 */            za0Var.m10298i(!za0Var.f20027m);
/* 39 */            if (!za0Var.f20027m) {
/* 48 */                autoCompleteTextView.dismissDropDown();
                    } else {
/* 41 */                autoCompleteTextView.requestFocus();
/* 44 */                autoCompleteTextView.showDropDown();
                    }
                }

                /* JADX INFO: renamed from: h */
                public static boolean m10294h(EditText editText) {
                    return editText.getKeyListener() != null;
                }

                @Override // p000.de0
                /* JADX INFO: renamed from: a */
                public final void mo3010a() {
/* 1 */             Context context = this.f7138b;
/* 9 */             float dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.mtrl_shape_corner_size_small_component);
/* 20 */            float dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R$dimen.mtrl_exposed_dropdown_menu_popup_elevation);
/* 31 */            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R$dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
/* 35 */            fd1 fd1VarM10297g = m10297g(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
/* 40 */            fd1 fd1VarM10297g2 = m10297g(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
/* 44 */            this.f20030p = fd1VarM10297g;
/* 48 */            StateListDrawable stateListDrawable = new StateListDrawable();
/* 51 */            this.f20029o = stateListDrawable;
/* 60 */            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, fd1VarM10297g);
/* 68 */            this.f20029o.addState(new int[0], fd1VarM10297g2);
/* 71 */            int i = this.f7140d;
/* 73 */            if (i == 0) {
/* 75 */                i = R$drawable.mtrl_dropdown_arrow;
                    }
/* 77 */            TextInputLayout textInputLayout = this.f7137a;
/* 79 */            textInputLayout.setEndIconDrawable(i);
/* 92 */            textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R$string.exposed_dropdown_menu_content_description));
/* 101 */           textInputLayout.setEndIconOnClickListener(new ViewOnClickListenerC2239u1(this, 3));
/* 104 */           LinkedHashSet linkedHashSet = textInputLayout.f5015M0;
/* 106 */           C1941mv c1941mv = this.f20022h;
/* 108 */           linkedHashSet.add(c1941mv);
/* 113 */           if (textInputLayout.f5044e != null) {
/* 115 */               c1941mv.m6810a(textInputLayout);
                    }
/* 122 */           textInputLayout.f5019Q0.add(this.f20023i);
/* 131 */           ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
/* 135 */           LinearInterpolator linearInterpolator = AbstractC2246u8.f17410a;
/* 137 */           valueAnimatorOfFloat.setInterpolator(linearInterpolator);
/* 142 */           valueAnimatorOfFloat.setDuration(67L);
/* 150 */           valueAnimatorOfFloat.addUpdateListener(new C2184sk(this, 2));
/* 153 */           this.f20033s = valueAnimatorOfFloat;
/* 160 */           ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
/* 164 */           valueAnimatorOfFloat2.setInterpolator(linearInterpolator);
/* 169 */           valueAnimatorOfFloat2.setDuration(50L);
/* 177 */           valueAnimatorOfFloat2.addUpdateListener(new C2184sk(this, 2));
/* 180 */           this.f20032r = valueAnimatorOfFloat2;
/* 187 */           valueAnimatorOfFloat2.addListener(new C2315w1(this, 2));
/* 198 */           this.f20031q = (AccessibilityManager) context.getSystemService("accessibility");
/* 202 */           textInputLayout.addOnAttachStateChangeListener(this.f20024j);
/* 205 */           m10296f();
                }

                @Override // p000.de0
                /* JADX INFO: renamed from: b */
                public final boolean mo3011b(int i) {
                    return i != 0;
                }

                /* JADX INFO: renamed from: e */
                public final void m10295e(AutoCompleteTextView autoCompleteTextView) {
/* 5 */             if (m10294h(autoCompleteTextView)) {
/* 153 */               return;
                    }
/* 9 */             TextInputLayout textInputLayout = this.f7137a;
/* 11 */            int boxBackgroundMode = textInputLayout.getBoxBackgroundMode();
/* 15 */            fd1 boxBackground = textInputLayout.getBoxBackground();
/* 21 */            int iM9779q = xe2.m9779q(R$attr.colorControlHighlight, autoCompleteTextView);
/* 35 */            int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
/* 44 */            if (boxBackgroundMode != 2) {
/* 124 */               if (boxBackgroundMode == 1) {
/* 126 */                   int boxBackgroundColor = textInputLayout.getBoxBackgroundColor();
/* 145 */                   RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{xe2.m9757A(iM9779q, 0.1f, boxBackgroundColor), boxBackgroundColor}), boxBackground, boxBackground);
/* 148 */                   WeakHashMap weakHashMap = e33.f7494a;
/* 150 */                   autoCompleteTextView.setBackground(rippleDrawable);
/* 153 */                   return;
                        }
/* 153 */               return;
                    }
/* 48 */            int iM9779q2 = xe2.m9779q(R$attr.colorSurface, autoCompleteTextView);
/* 58 */            fd1 fd1Var = new fd1(boxBackground.f8151a.f7635a);
/* 61 */            int iM9757A = xe2.m9757A(iM9779q, 0.1f, iM9779q2);
/* 74 */            fd1Var.m3742n(new ColorStateList(iArr, new int[]{iM9757A, 0}));
/* 77 */            fd1Var.setTint(iM9779q2);
/* 86 */            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM9757A, iM9779q2});
/* 95 */            fd1 fd1Var2 = new fd1(boxBackground.f8151a.f7635a);
/* 99 */            fd1Var2.setTint(-1);
/* 115 */           LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, fd1Var, fd1Var2), boxBackground});
/* 118 */           WeakHashMap weakHashMap2 = e33.f7494a;
/* 120 */           autoCompleteTextView.setBackground(layerDrawable);
                }

                /* JADX INFO: renamed from: f */
                public final void m10296f() {
/* 3 */             if (this.f20031q != null) {
/* 5 */                 WeakHashMap weakHashMap = e33.f7494a;
/* 13 */                if (this.f7137a.isAttachedToWindow()) {
/* 24 */                    this.f20031q.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC2238u0(this.f20025k));
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public final fd1 m10297g(float f, float f2, float f3, int i) {
/* 3 */             g52 g52Var = new g52();
/* 8 */             g52 g52Var2 = new g52();
/* 13 */            g52 g52Var3 = new g52();
/* 18 */            g52 g52Var4 = new g52();
/* 24 */            dc0 dc0Var = new dc0(0);
/* 29 */            dc0 dc0Var2 = new dc0(0);
/* 34 */            dc0 dc0Var3 = new dc0(0);
/* 39 */            dc0 dc0Var4 = new dc0(0);
/* 44 */            C0862e c0862e = new C0862e(f);
/* 49 */            C0862e c0862e2 = new C0862e(f);
/* 54 */            C0862e c0862e3 = new C0862e(f2);
/* 59 */            C0862e c0862e4 = new C0862e(f2);
/* 64 */            tc2 tc2Var = new tc2();
/* 67 */            tc2Var.f17032a = g52Var;
/* 69 */            tc2Var.f17033b = g52Var2;
/* 71 */            tc2Var.f17034c = g52Var3;
/* 73 */            tc2Var.f17035d = g52Var4;
/* 75 */            tc2Var.f17036e = c0862e;
/* 77 */            tc2Var.f17037f = c0862e2;
/* 79 */            tc2Var.f17038g = c0862e4;
/* 81 */            tc2Var.f17039h = c0862e3;
/* 83 */            tc2Var.f17040i = dc0Var;
/* 85 */            tc2Var.f17041j = dc0Var2;
/* 87 */            tc2Var.f17042k = dc0Var3;
/* 89 */            tc2Var.f17043l = dc0Var4;
/* 91 */            Paint paint = fd1.f8144h0;
/* 93 */            int i2 = R$attr.colorSurface;
/* 97 */            String simpleName = fd1.class.getSimpleName();
/* 101 */           Context context = this.f7138b;
/* 103 */           int iM10198D = yy1.m10198D(context, simpleName, i2);
/* 109 */           fd1 fd1Var = new fd1();
/* 112 */           fd1Var.m3739k(context);
/* 119 */           fd1Var.m3742n(ColorStateList.valueOf(iM10198D));
/* 124 */           fd1Var.m3741m(f3);
/* 127 */           fd1Var.setShapeAppearanceModel(tc2Var);
/* 130 */           ed1 ed1Var = fd1Var.f8151a;
/* 134 */           if (ed1Var.f7641g == null) {
/* 141 */               ed1Var.f7641g = new Rect();
                    }
/* 149 */           fd1Var.f8151a.f7641g.set(0, i, 0, i);
/* 152 */           fd1Var.invalidateSelf();
/* 155 */           return fd1Var;
                }

                /* JADX INFO: renamed from: i */
                public final void m10298i(boolean z) {
/* 3 */             if (this.f20027m != z) {
/* 5 */                 this.f20027m = z;
/* 9 */                 this.f20033s.cancel();
/* 14 */                this.f20032r.start();
                    }
                }
            }
