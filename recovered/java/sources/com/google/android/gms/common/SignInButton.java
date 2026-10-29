            package com.google.android.gms.common;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.PorterDuff;
            import android.graphics.Typeface;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.View;
            import android.widget.FrameLayout;
            import com.google.android.gms.base.R$color;
            import com.google.android.gms.base.R$drawable;
            import com.google.android.gms.base.R$styleable;
            import com.google.android.gms.common.api.Scope;
            import com.google.android.gms.common.internal.zaaa;
            import io.sentry.android.core.AbstractC1245n0;
            import p000.d32;
            import p000.f42;
            import p000.fm0;
            import p000.gr0;
            import p000.i13;
            import p000.kb1;
            import p000.s90;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 49 */    public final class SignInButton extends FrameLayout implements View.OnClickListener {

                /* JADX INFO: renamed from: a */
                public int f3424a;

                /* JADX INFO: renamed from: b */
                public int f3425b;

                /* JADX INFO: renamed from: c */
                public View f3426c;

                /* JADX INFO: renamed from: d */
                public View.OnClickListener f3427d;

                public SignInButton(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 5 */             this.f3427d = null;
/* 14 */            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.SignInButton, 0, 0);
                    try {
/* 24 */                this.f3424a = typedArrayObtainStyledAttributes.getInt(R$styleable.SignInButton_buttonSize, 0);
/* 33 */                this.f3425b = typedArrayObtainStyledAttributes.getInt(R$styleable.SignInButton_colorScheme, 2);
/* 35 */                typedArrayObtainStyledAttributes.recycle();
/* 42 */                m2005a(this.f3424a, this.f3425b);
                    } catch (Throwable th) {
/* 47 */                typedArrayObtainStyledAttributes.recycle();
/* 50 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m2005a(int i, int i2) {
/* 1 */             this.f3424a = i;
/* 3 */             this.f3425b = i2;
/* 5 */             Context context = getContext();
/* 9 */             View view = this.f3426c;
/* 11 */            if (view != null) {
/* 13 */                removeView(view);
                    }
                    try {
/* 24 */                this.f3426c = gr0.m3989w(context, this.f3424a, this.f3425b);
                    } catch (d32 unused) {
/* 32 */                AbstractC1245n0.m4889q("SignInButton", "Sign in button not found, using placeholder instead");
/* 35 */                int i3 = this.f3424a;
/* 37 */                int i4 = this.f3425b;
/* 42 */                zaaa zaaaVar = new zaaa(context, null);
/* 45 */                Resources resources = context.getResources();
/* 51 */                zaaaVar.setTypeface(Typeface.DEFAULT_BOLD);
/* 56 */                zaaaVar.setTextSize(14.0f);
/* 71 */                int i5 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
/* 72 */                zaaaVar.setMinHeight(i5);
/* 75 */                zaaaVar.setMinWidth(i5);
/* 78 */                int i6 = R$drawable.common_google_signin_btn_icon_dark;
/* 80 */                int i7 = R$drawable.common_google_signin_btn_icon_light;
/* 82 */                int iM2022a = zaaa.m2022a(i4, i6, i7, i7);
/* 86 */                int i8 = R$drawable.common_google_signin_btn_text_dark;
/* 88 */                int i9 = R$drawable.common_google_signin_btn_text_light;
/* 90 */                int iM2022a2 = zaaa.m2022a(i4, i8, i9, i9);
/* 98 */                if (i3 == 0 || i3 == 1) {
/* 113 */                   iM2022a = iM2022a2;
                        } else if (i3 != 2) {
/* 109 */                   f42.m3656l(fm0.m3781g(i3, "Unknown button size: "));
/* 112 */                   return;
                        }
/* 114 */               Drawable drawable = resources.getDrawable(iM2022a);
/* 124 */               s90.m8448h(drawable, resources.getColorStateList(R$color.common_google_signin_btn_tint));
/* 129 */               s90.m8449i(drawable, PorterDuff.Mode.SRC_ATOP);
/* 132 */               zaaaVar.setBackgroundDrawable(drawable);
/* 135 */               int i10 = R$color.common_google_signin_btn_text_dark;
/* 137 */               int i11 = R$color.common_google_signin_btn_text_light;
/* 143 */               ColorStateList colorStateList = resources.getColorStateList(zaaa.m2022a(i4, i10, i11, i11));
/* 147 */               kb1.m6061n(colorStateList);
/* 150 */               zaaaVar.setTextColor(colorStateList);
/* 153 */               if (i3 == 0) {
/* 187 */                   zaaaVar.setText(resources.getString(com.google.android.gms.base.R$string.common_signin_button_text));
                        } else if (i3 == 1) {
/* 177 */                   zaaaVar.setText(resources.getString(com.google.android.gms.base.R$string.common_signin_button_text_long));
                        } else {
/* 157 */                   if (i3 != 2) {
/* 167 */                       f42.m3656l(fm0.m3781g(i3, "Unknown button size: "));
/* 170 */                       return;
                            }
/* 159 */                   zaaaVar.setText((CharSequence) null);
                        }
/* 190 */               zaaaVar.setTransformationMethod(null);
/* 201 */               if (i13.m4441u(zaaaVar.getContext())) {
/* 205 */                   zaaaVar.setGravity(19);
                        }
/* 208 */               this.f3426c = zaaaVar;
                    }
/* 212 */           addView(this.f3426c);
/* 221 */           this.f3426c.setEnabled(isEnabled());
/* 226 */           this.f3426c.setOnClickListener(this);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
/* 1 */             View.OnClickListener onClickListener = this.f3427d;
/* 3 */             if (onClickListener == null || view != this.f3426c) {
/* 12 */                return;
                    }
/* 9 */             onClickListener.onClick(this);
                }

                public void setColorScheme(int i) {
/* 3 */             m2005a(this.f3424a, i);
                }

                @Override // android.view.View
                public void setEnabled(boolean z) {
/* 1 */             super.setEnabled(z);
/* 6 */             this.f3426c.setEnabled(z);
                }

                @Override // android.view.View
                public void setOnClickListener(View.OnClickListener onClickListener) {
/* 1 */             this.f3427d = onClickListener;
/* 3 */             View view = this.f3426c;
/* 5 */             if (view != null) {
/* 7 */                 view.setOnClickListener(this);
                    }
                }

                @Deprecated
                public void setScopes(Scope[] scopeArr) {
/* 5 */             m2005a(this.f3424a, this.f3425b);
                }

                public void setSize(int i) {
/* 3 */             m2005a(i, this.f3425b);
                }

/* 50 */        public SignInButton(Context context, AttributeSet attributeSet) {
/* 51 */            this(context, attributeSet, 0);
                }
            }
