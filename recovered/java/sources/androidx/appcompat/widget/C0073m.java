            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.drawable.Drawable;
            import android.text.TextUtils;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.R$string;
            import androidx.appcompat.R$styleable;
            import p000.ac1;
            import p000.e33;
            import p000.n50;
            import p000.yp2;
            
            /* JADX INFO: renamed from: androidx.appcompat.widget.m */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0073m implements n50 {

                /* JADX INFO: renamed from: a */
                public final Toolbar f762a;

                /* JADX INFO: renamed from: b */
                public int f763b;

                /* JADX INFO: renamed from: c */
                public final View f764c;

                /* JADX INFO: renamed from: d */
                public Drawable f765d;

                /* JADX INFO: renamed from: e */
                public Drawable f766e;

                /* JADX INFO: renamed from: f */
                public final Drawable f767f;

                /* JADX INFO: renamed from: g */
                public boolean f768g;

                /* JADX INFO: renamed from: h */
                public CharSequence f769h;

                /* JADX INFO: renamed from: i */
                public final CharSequence f770i;

                /* JADX INFO: renamed from: j */
                public final CharSequence f771j;

                /* JADX INFO: renamed from: k */
                public Window.Callback f772k;

                /* JADX INFO: renamed from: l */
                public boolean f773l;

                /* JADX INFO: renamed from: m */
                public C0062b f774m;

                /* JADX INFO: renamed from: n */
                public final int f775n;

                /* JADX INFO: renamed from: o */
                public final Drawable f776o;

                public C0073m(Toolbar toolbar, boolean z) {
                    int i;
                    Drawable drawable;
/* 1 */             int i2 = R$string.abc_action_bar_up_description;
/* 7 */             this.f775n = 0;
/* 9 */             this.f762a = toolbar;
/* 15 */            this.f769h = toolbar.getTitle();
/* 21 */            this.f770i = toolbar.getSubtitle();
/* 31 */            this.f768g = this.f769h != null;
/* 37 */            this.f767f = toolbar.getNavigationIcon();
/* 48 */            ac1 ac1VarM156H = ac1.m156H(toolbar.getContext(), null, R$styleable.ActionBar, R$attr.actionBarStyle);
/* 54 */            TypedArray typedArray = (TypedArray) ac1VarM156H.f178c;
/* 62 */            this.f776o = ac1VarM156H.m184n(R$styleable.ActionBar_homeAsUpIndicator);
/* 64 */            if (z) {
/* 68 */                CharSequence text = typedArray.getText(R$styleable.ActionBar_title);
/* 76 */                if (!TextUtils.isEmpty(text)) {
/* 78 */                    this.f768g = true;
/* 80 */                    this.f769h = text;
/* 86 */                    if ((this.f763b & 8) != 0) {
/* 88 */                        toolbar.setTitle(text);
/* 93 */                        if (this.f768g) {
/* 99 */                            e33.m3319o(toolbar.getRootView(), text);
                                }
                            }
                        }
/* 104 */               CharSequence text2 = typedArray.getText(R$styleable.ActionBar_subtitle);
/* 112 */               if (!TextUtils.isEmpty(text2)) {
/* 114 */                   this.f770i = text2;
/* 120 */                   if ((this.f763b & 8) != 0) {
/* 122 */                       toolbar.setSubtitle(text2);
                            }
                        }
/* 127 */               Drawable drawableM184n = ac1VarM156H.m184n(R$styleable.ActionBar_logo);
/* 131 */               if (drawableM184n != null) {
/* 133 */                   this.f766e = drawableM184n;
/* 135 */                   m437c();
                        }
/* 140 */               Drawable drawableM184n2 = ac1VarM156H.m184n(R$styleable.ActionBar_icon);
/* 144 */               if (drawableM184n2 != null) {
/* 146 */                   this.f765d = drawableM184n2;
/* 148 */                   m437c();
                        }
/* 153 */               if (this.f767f == null && (drawable = this.f776o) != null) {
/* 159 */                   this.f767f = drawable;
/* 165 */                   if ((this.f763b & 4) != 0) {
/* 167 */                       toolbar.setNavigationIcon(drawable);
                            } else {
/* 171 */                       toolbar.setNavigationIcon((Drawable) null);
                            }
                        }
/* 180 */               m435a(typedArray.getInt(R$styleable.ActionBar_displayOptions, 0));
/* 185 */               int resourceId = typedArray.getResourceId(R$styleable.ActionBar_customNavigationLayout, 0);
/* 189 */               if (resourceId != 0) {
/* 199 */                   View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
/* 203 */                   View view = this.f764c;
/* 205 */                   if (view != null && (this.f763b & 16) != 0) {
/* 213 */                       toolbar.removeView(view);
                            }
/* 216 */                   this.f764c = viewInflate;
/* 218 */                   if (viewInflate != null && (this.f763b & 16) != 0) {
/* 226 */                       toolbar.addView(viewInflate);
                            }
/* 233 */                   m435a(this.f763b | 16);
                        }
/* 238 */               int layoutDimension = typedArray.getLayoutDimension(R$styleable.ActionBar_height, 0);
/* 242 */               if (layoutDimension > 0) {
/* 244 */                   ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
/* 248 */                   layoutParams.height = layoutDimension;
/* 250 */                   toolbar.setLayoutParams(layoutParams);
                        }
/* 256 */               int dimensionPixelOffset = typedArray.getDimensionPixelOffset(R$styleable.ActionBar_contentInsetStart, -1);
/* 262 */               int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(R$styleable.ActionBar_contentInsetEnd, -1);
/* 266 */               if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
/* 270 */                   int iMax = Math.max(dimensionPixelOffset, 0);
/* 274 */                   int iMax2 = Math.max(dimensionPixelOffset2, 0);
/* 278 */                   toolbar.m402d();
/* 283 */                   toolbar.f709h0.m4474a(iMax, iMax2);
                        }
/* 288 */               int resourceId2 = typedArray.getResourceId(R$styleable.ActionBar_titleTextStyle, 0);
/* 292 */               if (resourceId2 != 0) {
/* 294 */                   Context context = toolbar.getContext();
/* 298 */                   toolbar.f695W = resourceId2;
/* 300 */                   AppCompatTextView appCompatTextView = toolbar.f698b;
/* 302 */                   if (appCompatTextView != null) {
/* 304 */                       appCompatTextView.setTextAppearance(context, resourceId2);
                            }
                        }
/* 309 */               int resourceId3 = typedArray.getResourceId(R$styleable.ActionBar_subtitleTextStyle, 0);
/* 313 */               if (resourceId3 != 0) {
/* 315 */                   Context context2 = toolbar.getContext();
/* 319 */                   toolbar.f697a0 = resourceId3;
/* 321 */                   AppCompatTextView appCompatTextView2 = toolbar.f700c;
/* 323 */                   if (appCompatTextView2 != null) {
/* 325 */                       appCompatTextView2.setTextAppearance(context2, resourceId3);
                            }
                        }
/* 330 */               int resourceId4 = typedArray.getResourceId(R$styleable.ActionBar_popupTheme, 0);
/* 334 */               if (resourceId4 != 0) {
/* 336 */                   toolbar.setPopupTheme(resourceId4);
                        }
                    } else {
/* 344 */               if (toolbar.getNavigationIcon() != null) {
/* 350 */                   this.f776o = toolbar.getNavigationIcon();
/* 352 */                   i = 15;
                        } else {
/* 355 */                   i = 11;
                        }
/* 357 */               this.f763b = i;
                    }
/* 359 */           ac1VarM156H.m168J();
/* 364 */           if (i2 != this.f775n) {
/* 367 */               this.f775n = i2;
/* 377 */               if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
/* 379 */                   int i3 = this.f775n;
/* 392 */                   this.f771j = i3 != 0 ? toolbar.getContext().getString(i3) : null;
/* 394 */                   m436b();
                        }
                    }
/* 401 */           this.f771j = toolbar.getNavigationContentDescription();
/* 408 */           toolbar.setNavigationOnClickListener(new yp2(this));
                }

                /* JADX INFO: renamed from: a */
                public final void m435a(int i) {
                    View view;
/* 3 */             int i2 = this.f763b ^ i;
/* 4 */             this.f763b = i;
/* 6 */             if (i2 != 0) {
/* 8 */                 int i3 = i2 & 4;
/* 11 */                Toolbar toolbar = this.f762a;
/* 13 */                if (i3 != 0) {
/* 17 */                    if ((i & 4) != 0) {
/* 19 */                        m436b();
                            }
/* 26 */                    if ((this.f763b & 4) != 0) {
/* 28 */                        Drawable drawable = this.f767f;
/* 30 */                        if (drawable == null) {
/* 33 */                            drawable = this.f776o;
                                }
/* 35 */                        toolbar.setNavigationIcon(drawable);
                            } else {
/* 39 */                        toolbar.setNavigationIcon((Drawable) null);
                            }
                        }
/* 44 */                if ((i2 & 3) != 0) {
/* 46 */                    m437c();
                        }
/* 51 */                if ((i2 & 8) != 0) {
/* 55 */                    if ((i & 8) != 0) {
/* 59 */                        toolbar.setTitle(this.f769h);
/* 64 */                        toolbar.setSubtitle(this.f770i);
                            } else {
/* 68 */                        toolbar.setTitle((CharSequence) null);
/* 71 */                        toolbar.setSubtitle((CharSequence) null);
                            }
                        }
/* 76 */                if ((i2 & 16) == 0 || (view = this.f764c) == null) {
/* 93 */                    return;
                        }
/* 84 */                if ((i & 16) != 0) {
/* 86 */                    toolbar.addView(view);
                        } else {
/* 90 */                    toolbar.removeView(view);
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m436b() {
/* 5 */             if ((this.f763b & 4) != 0) {
/* 7 */                 CharSequence charSequence = this.f771j;
/* 9 */                 boolean zIsEmpty = TextUtils.isEmpty(charSequence);
/* 13 */                Toolbar toolbar = this.f762a;
/* 15 */                if (zIsEmpty) {
/* 19 */                    toolbar.setNavigationContentDescription(this.f775n);
                        } else {
/* 23 */                    toolbar.setNavigationContentDescription(charSequence);
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m437c() {
                    Drawable drawable;
/* 1 */             int i = this.f763b;
/* 5 */             if ((i & 2) == 0) {
/* 22 */                drawable = null;
                    } else if ((i & 1) == 0 || (drawable = this.f766e) == null) {
/* 16 */                drawable = this.f765d;
                    }
/* 25 */            this.f762a.setLogo(drawable);
                }
            }
