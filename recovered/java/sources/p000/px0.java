            package p000;

            import android.animation.AnimatorSet;
            import android.animation.ObjectAnimator;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.Typeface;
            import android.text.TextUtils;
            import android.util.Property;
            import android.view.View;
            import android.widget.EditText;
            import android.widget.FrameLayout;
            import android.widget.LinearLayout;
            import android.widget.TextView;
            import androidx.appcompat.widget.AppCompatTextView;
            import com.google.android.material.R$dimen;
            import com.google.android.material.textfield.TextInputLayout;
            import java.util.ArrayList;
            import java.util.WeakHashMap;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class px0 {

                /* JADX INFO: renamed from: a */
                public final Context f15301a;

                /* JADX INFO: renamed from: b */
                public final TextInputLayout f15302b;

                /* JADX INFO: renamed from: c */
                public LinearLayout f15303c;

                /* JADX INFO: renamed from: d */
                public int f15304d;

                /* JADX INFO: renamed from: e */
                public FrameLayout f15305e;

                /* JADX INFO: renamed from: f */
                public AnimatorSet f15306f;

                /* JADX INFO: renamed from: g */
                public final float f15307g;

                /* JADX INFO: renamed from: h */
                public int f15308h;

                /* JADX INFO: renamed from: i */
                public int f15309i;

                /* JADX INFO: renamed from: j */
                public CharSequence f15310j;

                /* JADX INFO: renamed from: k */
                public boolean f15311k;

                /* JADX INFO: renamed from: l */
                public AppCompatTextView f15312l;

                /* JADX INFO: renamed from: m */
                public CharSequence f15313m;

                /* JADX INFO: renamed from: n */
                public int f15314n;

                /* JADX INFO: renamed from: o */
                public ColorStateList f15315o;

                /* JADX INFO: renamed from: p */
                public CharSequence f15316p;

                /* JADX INFO: renamed from: q */
                public boolean f15317q;

                /* JADX INFO: renamed from: r */
                public AppCompatTextView f15318r;

                /* JADX INFO: renamed from: s */
                public int f15319s;

                /* JADX INFO: renamed from: t */
                public ColorStateList f15320t;

                /* JADX INFO: renamed from: u */
                public Typeface f15321u;

                public px0(TextInputLayout textInputLayout) {
/* 4 */             Context context = textInputLayout.getContext();
/* 8 */             this.f15301a = context;
/* 10 */            this.f15302b = textInputLayout;
/* 23 */            this.f15307g = context.getResources().getDimensionPixelSize(R$dimen.design_textinput_caption_translate_y);
                }

                /* JADX INFO: renamed from: a */
                public final void m7573a(AppCompatTextView appCompatTextView, int i) {
/* 5 */             if (this.f15303c == null && this.f15305e == null) {
/* 13 */                Context context = this.f15301a;
/* 15 */                LinearLayout linearLayout = new LinearLayout(context);
/* 18 */                this.f15303c = linearLayout;
/* 20 */                linearLayout.setOrientation(0);
/* 23 */                LinearLayout linearLayout2 = this.f15303c;
/* 26 */                TextInputLayout textInputLayout = this.f15302b;
/* 28 */                textInputLayout.addView(linearLayout2, -1, -2);
/* 36 */                this.f15305e = new FrameLayout(context);
/* 49 */                this.f15303c.addView(this.f15305e, new LinearLayout.LayoutParams(0, -2, 1.0f));
/* 56 */                if (textInputLayout.getEditText() != null) {
/* 58 */                    m7574b();
                        }
                    }
/* 62 */            if (i == 0 || i == 1) {
/* 80 */                this.f15305e.setVisibility(0);
/* 85 */                this.f15305e.addView(appCompatTextView);
                    } else {
/* 74 */                this.f15303c.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
                    }
/* 90 */            this.f15303c.setVisibility(0);
/* 96 */            this.f15304d++;
                }

                /* JADX INFO: renamed from: b */
                public final void m7574b() {
/* 3 */             if (this.f15303c != null) {
/* 5 */                 TextInputLayout textInputLayout = this.f15302b;
/* 11 */                if (textInputLayout.getEditText() != null) {
/* 13 */                    EditText editText = textInputLayout.getEditText();
/* 17 */                    Context context = this.f15301a;
/* 19 */                    boolean zM3042x = de3.m3042x(context);
/* 23 */                    LinearLayout linearLayout = this.f15303c;
/* 25 */                    int i = R$dimen.material_helper_text_font_1_3_padding_horizontal;
/* 27 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 29 */                    int paddingStart = editText.getPaddingStart();
/* 33 */                    if (zM3042x) {
/* 39 */                        paddingStart = context.getResources().getDimensionPixelSize(i);
                            }
/* 43 */                    int i2 = R$dimen.material_helper_text_font_1_3_padding_top;
/* 51 */                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.material_helper_text_default_padding_top);
/* 55 */                    if (zM3042x) {
/* 61 */                        dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
                            }
/* 65 */                    int i3 = R$dimen.material_helper_text_font_1_3_padding_horizontal;
/* 67 */                    int paddingEnd = editText.getPaddingEnd();
/* 71 */                    if (zM3042x) {
/* 77 */                        paddingEnd = context.getResources().getDimensionPixelSize(i3);
                            }
/* 82 */                    linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m7575c() {
/* 1 */             AnimatorSet animatorSet = this.f15306f;
/* 3 */             if (animatorSet != null) {
/* 5 */                 animatorSet.cancel();
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m7576d(ArrayList arrayList, boolean z, AppCompatTextView appCompatTextView, int i, int i2, int i3) {
/* 1 */             if (appCompatTextView == null || !z) {
/* 73 */                return;
                    }
/* 6 */             if (i == i3 || i == i2) {
/* 25 */                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, i3 == i ? 1.0f : 0.0f);
/* 31 */                objectAnimatorOfFloat.setDuration(167L);
/* 36 */                objectAnimatorOfFloat.setInterpolator(AbstractC2246u8.f17410a);
/* 39 */                arrayList.add(objectAnimatorOfFloat);
/* 42 */                if (i3 == i) {
/* 56 */                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.f15307g, 0.0f);
/* 62 */                    objectAnimatorOfFloat2.setDuration(217L);
/* 67 */                    objectAnimatorOfFloat2.setInterpolator(AbstractC2246u8.f17413d);
/* 70 */                    arrayList.add(objectAnimatorOfFloat2);
                        }
                    }
                }

                /* JADX INFO: renamed from: e */
                public final boolean m7577e() {
                    return (this.f15309i != 1 || this.f15312l == null || TextUtils.isEmpty(this.f15310j)) ? false : true;
                }

                /* JADX INFO: renamed from: f */
                public final TextView m7578f(int i) {
/* 2 */             if (i == 1) {
/* 12 */                return this.f15312l;
                    }
/* 5 */             if (i != 2) {
/* 7 */                 return null;
                    }
/* 9 */             return this.f15318r;
                }

                /* JADX INFO: renamed from: g */
                public final void m7579g() {
/* 2 */             this.f15310j = null;
/* 4 */             m7575c();
/* 10 */            if (this.f15308h == 1) {
/* 14 */                if (!this.f15317q || TextUtils.isEmpty(this.f15316p)) {
/* 29 */                    this.f15309i = 0;
                        } else {
/* 25 */                    this.f15309i = 2;
                        }
                    }
/* 43 */            m7582j(this.f15308h, this.f15309i, m7581i(this.f15312l, HttpUrl.FRAGMENT_ENCODE_SET));
                }

                /* JADX INFO: renamed from: h */
                public final void m7580h(AppCompatTextView appCompatTextView, int i) {
                    FrameLayout frameLayout;
/* 1 */             LinearLayout linearLayout = this.f15303c;
/* 3 */             if (linearLayout == null) {
/* 36 */                return;
                    }
/* 7 */             if ((i == 0 || i == 1) && (frameLayout = this.f15305e) != null) {
/* 15 */                frameLayout.removeView(appCompatTextView);
                    } else {
/* 19 */                linearLayout.removeView(appCompatTextView);
                    }
/* 24 */            int i2 = this.f15304d - 1;
/* 25 */            this.f15304d = i2;
/* 27 */            LinearLayout linearLayout2 = this.f15303c;
/* 29 */            if (i2 == 0) {
/* 33 */                linearLayout2.setVisibility(8);
                    }
                }

                /* JADX INFO: renamed from: i */
                public final boolean m7581i(AppCompatTextView appCompatTextView, CharSequence charSequence) {
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 3 */             TextInputLayout textInputLayout = this.f15302b;
/* 9 */             if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
                        return (this.f15309i == this.f15308h && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
                    }
/* 37 */            return false;
                }

                /* JADX INFO: renamed from: j */
                public final void m7582j(int i, int i2, boolean z) {
                    TextView textViewM7578f;
                    TextView textViewM7578f2;
/* 1 */             if (i == i2) {
/* 3 */                 return;
                    }
/* 5 */             if (z) {
/* 9 */                 AnimatorSet animatorSet = new AnimatorSet();
/* 12 */                this.f15306f = animatorSet;
/* 16 */                ArrayList arrayList = new ArrayList();
/* 27 */                m7576d(arrayList, this.f15317q, this.f15318r, 2, i, i2);
/* 35 */                m7576d(arrayList, this.f15311k, this.f15312l, 1, i, i2);
/* 38 */                w11.m9455y(animatorSet, arrayList);
/* 58 */                animatorSet.addListener(new nx0(this, i2, m7578f(i), i, m7578f(i2)));
/* 61 */                animatorSet.start();
                    } else if (i != i2) {
/* 68 */                if (i2 != 0 && (textViewM7578f2 = m7578f(i2)) != null) {
/* 76 */                    textViewM7578f2.setVisibility(0);
/* 81 */                    textViewM7578f2.setAlpha(1.0f);
                        }
/* 84 */                if (i != 0 && (textViewM7578f = m7578f(i)) != null) {
/* 93 */                    textViewM7578f.setVisibility(4);
/* 97 */                    if (i == 1) {
/* 100 */                       textViewM7578f.setText((CharSequence) null);
                            }
                        }
/* 103 */               this.f15308h = i2;
                    }
/* 105 */           TextInputLayout textInputLayout = this.f15302b;
/* 107 */           textInputLayout.m2411p();
/* 110 */           textInputLayout.m2415t(z, false);
/* 113 */           textInputLayout.m2420y();
                }
            }
