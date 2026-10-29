            package p000;

            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.widget.CompoundButton;
            import android.widget.TextView;
            import androidx.appcompat.R$styleable;
            import androidx.appcompat.widget.AppCompatCheckedTextView;
            
            /* JADX INFO: renamed from: da */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0837da {

                /* JADX INFO: renamed from: a */
                public ColorStateList f7070a = null;

                /* JADX INFO: renamed from: b */
                public PorterDuff.Mode f7071b = null;

                /* JADX INFO: renamed from: c */
                public boolean f7072c = false;

                /* JADX INFO: renamed from: d */
                public boolean f7073d = false;

                /* JADX INFO: renamed from: e */
                public boolean f7074e;

                /* JADX INFO: renamed from: f */
                public final TextView f7075f;

                public /* synthetic */ C0837da(TextView textView) {
/* 11 */            this.f7075f = textView;
                }

                /* JADX INFO: renamed from: a */
                public void m2978a() {
/* 3 */             CompoundButton compoundButton = (CompoundButton) this.f7075f;
/* 5 */             Drawable drawableM7068a = AbstractC1981ny.m7068a(compoundButton);
/* 9 */             if (drawableM7068a != null) {
/* 13 */                if (this.f7072c || this.f7073d) {
/* 19 */                    Drawable drawableMutate = drawableM7068a.mutate();
/* 25 */                    if (this.f7072c) {
/* 29 */                        s90.m8448h(drawableMutate, this.f7070a);
                            }
/* 34 */                    if (this.f7073d) {
/* 38 */                        s90.m8449i(drawableMutate, this.f7071b);
                            }
/* 45 */                    if (drawableMutate.isStateful()) {
/* 51 */                        drawableMutate.setState(compoundButton.getDrawableState());
                            }
/* 54 */                    compoundButton.setButtonDrawable(drawableMutate);
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public void m2979b() {
/* 3 */             AppCompatCheckedTextView appCompatCheckedTextView = (AppCompatCheckedTextView) this.f7075f;
/* 5 */             Drawable checkMarkDrawable = appCompatCheckedTextView.getCheckMarkDrawable();
/* 9 */             if (checkMarkDrawable != null) {
/* 13 */                if (this.f7072c || this.f7073d) {
/* 19 */                    Drawable drawableMutate = checkMarkDrawable.mutate();
/* 25 */                    if (this.f7072c) {
/* 29 */                        s90.m8448h(drawableMutate, this.f7070a);
                            }
/* 34 */                    if (this.f7073d) {
/* 38 */                        s90.m8449i(drawableMutate, this.f7071b);
                            }
/* 45 */                    if (drawableMutate.isStateful()) {
/* 51 */                        drawableMutate.setState(appCompatCheckedTextView.getDrawableState());
                            }
/* 54 */                    appCompatCheckedTextView.setCheckMarkDrawable(drawableMutate);
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public void m2980c(AttributeSet attributeSet, int i) {
                    int resourceId;
                    int resourceId2;
/* 4 */             CompoundButton compoundButton = (CompoundButton) this.f7075f;
/* 12 */            ac1 ac1VarM156H = ac1.m156H(compoundButton.getContext(), attributeSet, R$styleable.CompoundButton, i);
/* 19 */            TypedArray typedArray = (TypedArray) ac1VarM156H.f178c;
/* 34 */            e33.m3317m(compoundButton, compoundButton.getContext(), R$styleable.CompoundButton, attributeSet, (TypedArray) ac1VarM156H.f178c, i);
                    try {
/* 44 */                if (typedArray.hasValue(R$styleable.CompoundButton_buttonCompat) && (resourceId2 = typedArray.getResourceId(R$styleable.CompoundButton_buttonCompat, 0)) != 0) {
                            try {
/* 62 */                        compoundButton.setButtonDrawable(mn0.m6700p(compoundButton.getContext(), resourceId2));
                            } catch (Resources.NotFoundException unused) {
/* 75 */                        if (typedArray.hasValue(R$styleable.CompoundButton_android_button)) {
/* 93 */                            compoundButton.setButtonDrawable(mn0.m6700p(compoundButton.getContext(), resourceId));
                                }
                            }
                        } else if (typedArray.hasValue(R$styleable.CompoundButton_android_button) && (resourceId = typedArray.getResourceId(R$styleable.CompoundButton_android_button, 0)) != 0) {
/* 93 */                    compoundButton.setButtonDrawable(mn0.m6700p(compoundButton.getContext(), resourceId));
                        }
/* 102 */               if (typedArray.hasValue(R$styleable.CompoundButton_buttonTint)) {
/* 110 */                   AbstractC1944my.m6813c(compoundButton, ac1VarM156H.m183m(R$styleable.CompoundButton_buttonTint));
                        }
/* 119 */               if (typedArray.hasValue(R$styleable.CompoundButton_buttonTintMode)) {
/* 133 */                   AbstractC1944my.m6814d(compoundButton, w90.m9485c(typedArray.getInt(R$styleable.CompoundButton_buttonTintMode, -1), null));
                        }
                    } finally {
/* 140 */               ac1VarM156H.m168J();
                    }
                }
            }
