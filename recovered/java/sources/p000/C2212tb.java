            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.PorterDuff;
            import android.graphics.Typeface;
            import android.graphics.drawable.Drawable;
            import android.os.Build;
            import android.text.TextUtils;
            import android.text.method.PasswordTransformationMethod;
            import android.util.AttributeSet;
            import android.util.DisplayMetrics;
            import android.util.TypedValue;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            import android.widget.TextView;
            import androidx.appcompat.R$styleable;
            import java.lang.ref.WeakReference;
            import java.util.Arrays;
            
            /* JADX INFO: renamed from: tb */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2212tb {

                /* JADX INFO: renamed from: a */
                public final TextView f17013a;

                /* JADX INFO: renamed from: b */
                public vo2 f17014b;

                /* JADX INFO: renamed from: c */
                public vo2 f17015c;

                /* JADX INFO: renamed from: d */
                public vo2 f17016d;

                /* JADX INFO: renamed from: e */
                public vo2 f17017e;

                /* JADX INFO: renamed from: f */
                public vo2 f17018f;

                /* JADX INFO: renamed from: g */
                public vo2 f17019g;

                /* JADX INFO: renamed from: h */
                public vo2 f17020h;

                /* JADX INFO: renamed from: i */
                public final C0175bc f17021i;

                /* JADX INFO: renamed from: j */
                public int f17022j = 0;

                /* JADX INFO: renamed from: k */
                public int f17023k = -1;

                /* JADX INFO: renamed from: l */
                public Typeface f17024l;

                /* JADX INFO: renamed from: m */
                public boolean f17025m;

                public C2212tb(TextView textView) {
/* 10 */            this.f17013a = textView;
/* 17 */            this.f17021i = new C0175bc(textView);
                }

                /* JADX INFO: renamed from: c */
                public static vo2 m8758c(Context context, C2491ya c2491ya, int i) {
                    ColorStateList colorStateListM9700f;
                    synchronized (c2491ya) {
/* 4 */                 colorStateListM9700f = c2491ya.f19553a.m9700f(context, i);
                    }
/* 9 */             if (colorStateListM9700f == null) {
/* 22 */                return null;
                    }
/* 13 */            vo2 vo2Var = new vo2();
/* 17 */            vo2Var.f18264d = true;
/* 19 */            vo2Var.f18261a = colorStateListM9700f;
/* 21 */            return vo2Var;
                }

                /* JADX INFO: renamed from: h */
                public static void m8759h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
/* 1 */             int i = Build.VERSION.SDK_INT;
/* 5 */             if (i >= 30 || inputConnection == null) {
/* 194 */               return;
                    }
/* 9 */             CharSequence text = textView.getText();
/* 13 */            if (i >= 30) {
/* 15 */                a10.m19c(editorInfo, text);
/* 18 */                return;
                    }
/* 19 */            text.getClass();
/* 22 */            if (i >= 30) {
/* 24 */                a10.m19c(editorInfo, text);
/* 27 */                return;
                    }
/* 28 */            int i2 = editorInfo.initialSelStart;
/* 30 */            int i3 = editorInfo.initialSelEnd;
/* 36 */            int i4 = i2 > i3 ? i3 : i2;
/* 37 */            if (i2 <= i3) {
/* 40 */                i2 = i3;
                    }
/* 41 */            int length = text.length();
/* 47 */            if (i4 < 0 || i2 > length) {
/* 191 */               de3.m3018F(editorInfo, null, 0, 0);
/* 194 */               return;
                    }
/* 55 */            int i5 = editorInfo.inputType & 4095;
/* 59 */            if (i5 == 129 || i5 == 225 || i5 == 18) {
/* 187 */               de3.m3018F(editorInfo, null, 0, 0);
/* 190 */               return;
                    }
/* 73 */            if (length <= 2048) {
/* 75 */                de3.m3018F(editorInfo, text, i4, i2);
/* 78 */                return;
                    }
/* 79 */            int i6 = i2 - i4;
/* 87 */            int i7 = i6 > 1024 ? 0 : i6;
/* 93 */            int i8 = 2048 - i7;
/* 109 */           int iMin = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
/* 114 */           int iMin2 = Math.min(i4, i8 - iMin);
/* 118 */           int i9 = i4 - iMin2;
/* 127 */           if (Character.isLowSurrogate(text.charAt(i9))) {
/* 129 */               i9++;
/* 131 */               iMin2--;
                    }
/* 145 */           if (Character.isHighSurrogate(text.charAt((i2 + iMin) - 1))) {
/* 147 */               iMin--;
                    }
/* 149 */           int i10 = iMin2 + i7;
/* 183 */           de3.m3018F(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
                }

                /* JADX INFO: renamed from: a */
                public final void m8760a(Drawable drawable, vo2 vo2Var) {
/* 1 */             if (drawable == null || vo2Var == null) {
/* 14 */                return;
                    }
/* 11 */            C2491ya.m10135e(drawable, vo2Var, this.f17013a.getDrawableState());
                }

                /* JADX INFO: renamed from: b */
                public final void m8761b() {
/* 1 */             vo2 vo2Var = this.f17014b;
/* 5 */             TextView textView = this.f17013a;
/* 7 */             if (vo2Var != null || this.f17015c != null || this.f17016d != null || this.f17017e != null) {
/* 21 */                Drawable[] compoundDrawables = textView.getCompoundDrawables();
/* 29 */                m8760a(compoundDrawables[0], this.f17014b);
/* 37 */                m8760a(compoundDrawables[1], this.f17015c);
/* 44 */                m8760a(compoundDrawables[2], this.f17016d);
/* 52 */                m8760a(compoundDrawables[3], this.f17017e);
                    }
/* 57 */            if (this.f17018f == null && this.f17019g == null) {
/* 64 */                return;
                    }
/* 65 */            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
/* 73 */            m8760a(compoundDrawablesRelative[0], this.f17018f);
/* 80 */            m8760a(compoundDrawablesRelative[2], this.f17019g);
                }

                /* JADX INFO: renamed from: d */
                public final ColorStateList m8762d() {
/* 1 */             vo2 vo2Var = this.f17020h;
/* 3 */             if (vo2Var != null) {
/* 5 */                 return vo2Var.f18261a;
                    }
/* 8 */             return null;
                }

                /* JADX INFO: renamed from: e */
                public final PorterDuff.Mode m8763e() {
/* 1 */             vo2 vo2Var = this.f17020h;
/* 3 */             if (vo2Var != null) {
/* 5 */                 return vo2Var.f18262b;
                    }
/* 8 */             return null;
                }

                /* JADX WARN: Code duplicated, block: B:229:0x03d3  */
                /* JADX WARN: Code duplicated, block: B:231:0x03d8  */
                /* JADX WARN: Code duplicated, block: B:234:0x03df A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:235:0x03e1  */
                /* JADX WARN: Code duplicated, block: B:237:0x03e6  */
                /* JADX WARN: Code duplicated, block: B:239:0x03ec  */
                /* JADX WARN: Code duplicated, block: B:241:0x03f0  */
                /* JADX WARN: Code duplicated, block: B:244:? A[RETURN, SYNTHETIC] */
                /* JADX INFO: renamed from: f */
                public final void m8764f(AttributeSet attributeSet, int i) {
                    boolean z;
                    boolean z2;
                    String string;
                    String string2;
                    float f;
                    int i2;
                    int i3;
                    float dimensionPixelSize;
                    int i4;
                    ColorStateList colorStateList;
                    int resourceId;
                    int resourceId2;
/* 7 */             TextView textView = this.f17013a;
/* 9 */             Context context = textView.getContext();
/* 13 */            C2491ya c2491yaM10132a = C2491ya.m10132a();
/* 19 */            ac1 ac1VarM156H = ac1.m156H(context, attributeSet, R$styleable.AppCompatTextHelper, i);
/* 37 */            e33.m3317m(textView, textView.getContext(), R$styleable.AppCompatTextHelper, attributeSet, (TypedArray) ac1VarM156H.f178c, i);
/* 43 */            int i5 = R$styleable.AppCompatTextHelper_android_textAppearance;
/* 47 */            TypedArray typedArray = (TypedArray) ac1VarM156H.f178c;
/* 50 */            int resourceId3 = typedArray.getResourceId(i5, -1);
/* 61 */            if (typedArray.hasValue(R$styleable.AppCompatTextHelper_android_drawableLeft)) {
/* 73 */                this.f17014b = m8758c(context, c2491yaM10132a, typedArray.getResourceId(R$styleable.AppCompatTextHelper_android_drawableLeft, 0));
                    }
/* 81 */            if (typedArray.hasValue(R$styleable.AppCompatTextHelper_android_drawableTop)) {
/* 93 */                this.f17015c = m8758c(context, c2491yaM10132a, typedArray.getResourceId(R$styleable.AppCompatTextHelper_android_drawableTop, 0));
                    }
/* 101 */           if (typedArray.hasValue(R$styleable.AppCompatTextHelper_android_drawableRight)) {
/* 113 */               this.f17016d = m8758c(context, c2491yaM10132a, typedArray.getResourceId(R$styleable.AppCompatTextHelper_android_drawableRight, 0));
                    }
/* 121 */           if (typedArray.hasValue(R$styleable.AppCompatTextHelper_android_drawableBottom)) {
/* 133 */               this.f17017e = m8758c(context, c2491yaM10132a, typedArray.getResourceId(R$styleable.AppCompatTextHelper_android_drawableBottom, 0));
                    }
/* 141 */           if (typedArray.hasValue(R$styleable.AppCompatTextHelper_android_drawableStart)) {
/* 153 */               this.f17018f = m8758c(context, c2491yaM10132a, typedArray.getResourceId(R$styleable.AppCompatTextHelper_android_drawableStart, 0));
                    }
/* 161 */           if (typedArray.hasValue(R$styleable.AppCompatTextHelper_android_drawableEnd)) {
/* 173 */               this.f17019g = m8758c(context, c2491yaM10132a, typedArray.getResourceId(R$styleable.AppCompatTextHelper_android_drawableEnd, 0));
                    }
/* 175 */           ac1VarM156H.m168J();
/* 182 */           boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
/* 186 */           if (resourceId3 != -1) {
/* 192 */               TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, R$styleable.TextAppearance);
/* 196 */               ac1 ac1Var = new ac1(context, typedArrayObtainStyledAttributes);
/* 199 */               if (z3 || !typedArrayObtainStyledAttributes.hasValue(R$styleable.TextAppearance_textAllCaps)) {
/* 217 */                   z = false;
/* 218 */                   z2 = false;
                        } else {
/* 211 */                   z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TextAppearance_textAllCaps, false);
/* 215 */                   z2 = true;
                        }
/* 219 */               m8771n(context, ac1Var);
/* 237 */               string2 = typedArrayObtainStyledAttributes.hasValue(R$styleable.TextAppearance_textLocale) ? typedArrayObtainStyledAttributes.getString(R$styleable.TextAppearance_textLocale) : null;
/* 257 */               string = (Build.VERSION.SDK_INT < 26 || !typedArrayObtainStyledAttributes.hasValue(R$styleable.TextAppearance_fontVariationSettings)) ? null : typedArrayObtainStyledAttributes.getString(R$styleable.TextAppearance_fontVariationSettings);
/* 258 */               ac1Var.m168J();
                    } else {
/* 262 */               z = false;
/* 263 */               z2 = false;
/* 264 */               string = null;
/* 265 */               string2 = null;
                    }
/* 270 */           TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.TextAppearance, i, 0);
/* 274 */           ac1 ac1Var2 = new ac1(context, typedArrayObtainStyledAttributes2);
/* 277 */           if (!z3 && typedArrayObtainStyledAttributes2.hasValue(R$styleable.TextAppearance_textAllCaps)) {
/* 289 */               z = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.TextAppearance_textAllCaps, false);
/* 293 */               z2 = true;
                    }
/* 300 */           if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.TextAppearance_textLocale)) {
/* 304 */               string2 = typedArrayObtainStyledAttributes2.getString(R$styleable.TextAppearance_textLocale);
                    }
/* 308 */           int i6 = Build.VERSION.SDK_INT;
/* 310 */           if (i6 >= 26 && typedArrayObtainStyledAttributes2.hasValue(R$styleable.TextAppearance_fontVariationSettings)) {
/* 322 */               string = typedArrayObtainStyledAttributes2.getString(R$styleable.TextAppearance_fontVariationSettings);
                    }
/* 328 */           if (i6 >= 28 && typedArrayObtainStyledAttributes2.hasValue(R$styleable.TextAppearance_android_textSize) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, -1) == 0) {
/* 348 */               textView.setTextSize(0, 0.0f);
                    }
/* 351 */           m8771n(context, ac1Var2);
/* 354 */           ac1Var2.m168J();
/* 357 */           if (!z3 && z2) {
/* 361 */               textView.setAllCaps(z);
                    }
/* 364 */           Typeface typeface = this.f17024l;
/* 366 */           if (typeface != null) {
/* 371 */               if (this.f17023k == -1) {
/* 375 */                   textView.setTypeface(typeface, this.f17022j);
                        } else {
/* 379 */                   textView.setTypeface(typeface);
                        }
                    }
/* 382 */           if (string != null) {
/* 384 */               AbstractC2138rb.m8125d(textView, string);
                    }
/* 387 */           if (string2 != null) {
/* 393 */               AbstractC2101qb.m7759b(textView, AbstractC2101qb.m7758a(string2));
                    }
/* 396 */           C0175bc c0175bc = this.f17021i;
/* 398 */           Context context2 = c0175bc.f2362j;
/* 402 */           TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, R$styleable.AppCompatTextView, i, 0);
/* 406 */           TextView textView2 = c0175bc.f2361i;
/* 414 */           e33.m3317m(textView2, textView2.getContext(), R$styleable.AppCompatTextView, attributeSet, typedArrayObtainStyledAttributes3, i);
/* 423 */           if (typedArrayObtainStyledAttributes3.hasValue(R$styleable.AppCompatTextView_autoSizeTextType)) {
/* 431 */               c0175bc.f2353a = typedArrayObtainStyledAttributes3.getInt(R$styleable.AppCompatTextView_autoSizeTextType, 0);
                    }
/* 439 */           float f2 = -1.0f;
/* 450 */           float dimension = typedArrayObtainStyledAttributes3.hasValue(R$styleable.AppCompatTextView_autoSizeStepGranularity) ? typedArrayObtainStyledAttributes3.getDimension(R$styleable.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
/* 466 */           float dimension2 = typedArrayObtainStyledAttributes3.hasValue(R$styleable.AppCompatTextView_autoSizeMinTextSize) ? typedArrayObtainStyledAttributes3.getDimension(R$styleable.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
/* 482 */           float dimension3 = typedArrayObtainStyledAttributes3.hasValue(R$styleable.AppCompatTextView_autoSizeMaxTextSize) ? typedArrayObtainStyledAttributes3.getDimension(R$styleable.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
/* 489 */           if (!typedArrayObtainStyledAttributes3.hasValue(R$styleable.AppCompatTextView_autoSizePresetSizes) || (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(R$styleable.AppCompatTextView_autoSizePresetSizes, 0)) <= 0) {
/* 550 */               f = -1.0f;
                    } else {
/* 503 */               TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
/* 507 */               int length = typedArrayObtainTypedArray.length();
/* 511 */               int[] iArr = new int[length];
/* 513 */               if (length > 0) {
/* 515 */                   int i7 = 0;
/* 516 */                   while (i7 < length) {
/* 525 */                       iArr[i7] = typedArrayObtainTypedArray.getDimensionPixelSize(i7, -1);
/* 527 */                       i7++;
/* 529 */                       f2 = f2;
                            }
/* 532 */                   f = f2;
/* 538 */                   c0175bc.f2358f = C0175bc.m1319b(iArr);
/* 540 */                   c0175bc.m1327i();
                        } else {
/* 544 */                   f = -1.0f;
                        }
/* 546 */               typedArrayObtainTypedArray.recycle();
                    }
/* 552 */           typedArrayObtainStyledAttributes3.recycle();
/* 560 */           if (!c0175bc.m1328j()) {
/* 612 */               c0175bc.f2353a = 0;
                    } else if (c0175bc.f2353a == 1) {
/* 569 */               if (!c0175bc.f2359g) {
/* 575 */                   DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
/* 581 */                   if (dimension2 == f) {
/* 585 */                       dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                            }
/* 591 */                   if (dimension3 == f) {
/* 595 */                       dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                            }
/* 601 */                   if (dimension == f) {
/* 603 */                       dimension = 1.0f;
                            }
/* 605 */                   c0175bc.m1329k(dimension2, dimension3, dimension);
                        }
/* 608 */               c0175bc.m1326h();
                    }
/* 616 */           if (m53.f13570c && c0175bc.f2353a != 0) {
/* 622 */               int[] iArr2 = c0175bc.f2358f;
/* 625 */               if (iArr2.length > 0) {
/* 634 */                   if (AbstractC2138rb.m8122a(textView) != f) {
/* 654 */                       AbstractC2138rb.m8123b(textView, Math.round(c0175bc.f2356d), Math.round(c0175bc.f2357e), Math.round(c0175bc.f2355c), 0);
                            } else {
/* 658 */                       AbstractC2138rb.m8124c(textView, iArr2, 0);
                            }
                        }
                    }
/* 663 */           TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, R$styleable.AppCompatTextView);
/* 670 */           int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(R$styleable.AppCompatTextView_drawableLeftCompat, -1);
/* 681 */           Drawable drawableM10136b = resourceId4 != -1 ? c2491yaM10132a.m10136b(context, resourceId4) : null;
/* 684 */           int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(R$styleable.AppCompatTextView_drawableTopCompat, -1);
/* 695 */           Drawable drawableM10136b2 = resourceId5 != -1 ? c2491yaM10132a.m10136b(context, resourceId5) : null;
/* 698 */           int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(R$styleable.AppCompatTextView_drawableRightCompat, -1);
/* 709 */           Drawable drawableM10136b3 = resourceId6 != -1 ? c2491yaM10132a.m10136b(context, resourceId6) : null;
/* 712 */           int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(R$styleable.AppCompatTextView_drawableBottomCompat, -1);
/* 723 */           Drawable drawableM10136b4 = resourceId7 != -1 ? c2491yaM10132a.m10136b(context, resourceId7) : null;
/* 726 */           int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(R$styleable.AppCompatTextView_drawableStartCompat, -1);
/* 737 */           Drawable drawableM10136b5 = resourceId8 != -1 ? c2491yaM10132a.m10136b(context, resourceId8) : null;
/* 740 */           int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(R$styleable.AppCompatTextView_drawableEndCompat, -1);
/* 751 */           Drawable drawableM10136b6 = resourceId9 != -1 ? c2491yaM10132a.m10136b(context, resourceId9) : null;
/* 753 */           if (drawableM10136b5 != null || drawableM10136b6 != null) {
/* 827 */               Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
/* 831 */               if (drawableM10136b5 == null) {
/* 834 */                   drawableM10136b5 = compoundDrawablesRelative[0];
                        }
/* 836 */               if (drawableM10136b2 == null) {
/* 841 */                   drawableM10136b2 = compoundDrawablesRelative[1];
                        }
/* 843 */               if (drawableM10136b6 == null) {
/* 846 */                   drawableM10136b6 = compoundDrawablesRelative[2];
                        }
/* 848 */               if (drawableM10136b4 == null) {
/* 851 */                   drawableM10136b4 = compoundDrawablesRelative[3];
                        }
/* 853 */               textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM10136b5, drawableM10136b2, drawableM10136b6, drawableM10136b4);
                    } else if (drawableM10136b != null || drawableM10136b2 != null || drawableM10136b3 != null || drawableM10136b4 != null) {
/* 766 */               Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
/* 770 */               Drawable drawable = compoundDrawablesRelative2[0];
/* 772 */               if (drawable == null && compoundDrawablesRelative2[2] == null) {
/* 779 */                   Drawable[] compoundDrawables = textView.getCompoundDrawables();
/* 783 */                   if (drawableM10136b == null) {
/* 786 */                       drawableM10136b = compoundDrawables[0];
                            }
/* 788 */                   if (drawableM10136b2 == null) {
/* 793 */                       drawableM10136b2 = compoundDrawables[1];
                            }
/* 795 */                   if (drawableM10136b3 == null) {
/* 798 */                       drawableM10136b3 = compoundDrawables[2];
                            }
/* 800 */                   if (drawableM10136b4 == null) {
/* 803 */                       drawableM10136b4 = compoundDrawables[3];
                            }
/* 805 */                   textView.setCompoundDrawablesWithIntrinsicBounds(drawableM10136b, drawableM10136b2, drawableM10136b3, drawableM10136b4);
                        } else {
/* 809 */                   if (drawableM10136b2 == null) {
/* 814 */                       drawableM10136b2 = compoundDrawablesRelative2[1];
                            }
/* 816 */                   if (drawableM10136b4 == null) {
/* 819 */                       drawableM10136b4 = compoundDrawablesRelative2[3];
                            }
/* 823 */                   textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM10136b2, compoundDrawablesRelative2[2], drawableM10136b4);
                        }
                    }
/* 862 */           if (typedArrayObtainStyledAttributes4.hasValue(R$styleable.AppCompatTextView_drawableTint)) {
/* 864 */               int i8 = R$styleable.AppCompatTextView_drawableTint;
/* 870 */               if (!typedArrayObtainStyledAttributes4.hasValue(i8) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(i8, 0)) == 0 || (colorStateList = v00.getColorStateList(context, resourceId)) == null) {
/* 885 */                   colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(i8);
                        }
/* 889 */               kn2.m6149f(textView, colorStateList);
                    }
/* 898 */           if (typedArrayObtainStyledAttributes4.hasValue(R$styleable.AppCompatTextView_drawableTintMode)) {
/* 902 */               i2 = -1;
/* 912 */               kn2.m6150g(textView, w90.m9485c(typedArrayObtainStyledAttributes4.getInt(R$styleable.AppCompatTextView_drawableTintMode, -1), null));
                    } else {
/* 916 */               i2 = -1;
                    }
/* 919 */           int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(R$styleable.AppCompatTextView_firstBaselineToTopHeight, i2);
/* 925 */           int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(R$styleable.AppCompatTextView_lastBaselineToBottomHeight, i2);
/* 935 */           if (typedArrayObtainStyledAttributes4.hasValue(R$styleable.AppCompatTextView_lineHeight)) {
/* 939 */               TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(R$styleable.AppCompatTextView_lineHeight);
/* 943 */               if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
/* 963 */                   i3 = -1;
/* 964 */                   dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(R$styleable.AppCompatTextView_lineHeight, -1);
                        } else {
/* 950 */                   int i9 = typedValuePeekValue.data;
/* 952 */                   int i10 = i9 & 15;
/* 954 */                   dimensionPixelSize = TypedValue.complexToFloat(i9);
/* 958 */                   i4 = i10;
/* 959 */                   i3 = -1;
                        }
/* 975 */               typedArrayObtainStyledAttributes4.recycle();
/* 978 */               if (dimensionPixelSize2 != i3) {
/* 980 */                   he3.m4191n(textView, dimensionPixelSize2);
                        }
/* 983 */               if (dimensionPixelSize3 != i3) {
/* 985 */                   he3.m4192o(textView, dimensionPixelSize3);
                        }
/* 990 */               if (dimensionPixelSize != f) {
/* 992 */                   if (i4 == i3) {
/* 995 */                       he3.m4194q(textView, (int) dimensionPixelSize);
                            } else if (Build.VERSION.SDK_INT >= 34) {
/* 1005 */                      nn2.m7015a(textView, i4, dimensionPixelSize);
                            } else {
/* 1025 */                      he3.m4194q(textView, Math.round(TypedValue.applyDimension(i4, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                            }
                        }
                    }
/* 971 */           i3 = -1;
/* 972 */           dimensionPixelSize = f;
/* 969 */           i4 = i3;
/* 975 */           typedArrayObtainStyledAttributes4.recycle();
/* 978 */           if (dimensionPixelSize2 != i3) {
/* 980 */               he3.m4191n(textView, dimensionPixelSize2);
                    }
/* 983 */           if (dimensionPixelSize3 != i3) {
/* 985 */               he3.m4192o(textView, dimensionPixelSize3);
                    }
/* 990 */           if (dimensionPixelSize != f) {
/* 992 */               if (i4 == i3) {
/* 995 */                   he3.m4194q(textView, (int) dimensionPixelSize);
                        } else if (Build.VERSION.SDK_INT >= 34) {
/* 1005 */                  nn2.m7015a(textView, i4, dimensionPixelSize);
                        } else {
/* 1025 */                  he3.m4194q(textView, Math.round(TypedValue.applyDimension(i4, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m8765g(Context context, int i) {
                    String string;
/* 5 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.TextAppearance);
/* 9 */             ac1 ac1Var = new ac1(context, typedArrayObtainStyledAttributes);
/* 14 */            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R$styleable.TextAppearance_textAllCaps);
/* 19 */            TextView textView = this.f17013a;
/* 21 */            if (zHasValue) {
/* 29 */                textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(R$styleable.TextAppearance_textAllCaps, false));
                    }
/* 38 */            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.TextAppearance_android_textSize) && typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, -1) == 0) {
/* 50 */                textView.setTextSize(0, 0.0f);
                    }
/* 53 */            m8771n(context, ac1Var);
/* 60 */            if (Build.VERSION.SDK_INT >= 26 && typedArrayObtainStyledAttributes.hasValue(R$styleable.TextAppearance_fontVariationSettings) && (string = typedArrayObtainStyledAttributes.getString(R$styleable.TextAppearance_fontVariationSettings)) != null) {
/* 78 */                AbstractC2138rb.m8125d(textView, string);
                    }
/* 81 */            ac1Var.m168J();
/* 84 */            Typeface typeface = this.f17024l;
/* 86 */            if (typeface != null) {
/* 90 */                textView.setTypeface(typeface, this.f17022j);
                    }
                }

                /* JADX INFO: renamed from: i */
                public final void m8766i(int i, int i2, int i3, int i4) {
/* 1 */             C0175bc c0175bc = this.f17021i;
/* 7 */             if (c0175bc.m1328j()) {
/* 15 */                DisplayMetrics displayMetrics = c0175bc.f2362j.getResources().getDisplayMetrics();
/* 34 */                c0175bc.m1329k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
/* 41 */                if (c0175bc.m1326h()) {
/* 43 */                    c0175bc.m1322a();
                        }
                    }
                }

                /* JADX INFO: renamed from: j */
                public final void m8767j(int[] iArr, int i) {
/* 1 */             C0175bc c0175bc = this.f17021i;
/* 7 */             if (c0175bc.m1328j()) {
/* 9 */                 int length = iArr.length;
/* 11 */                if (length > 0) {
/* 13 */                    int[] iArrCopyOf = new int[length];
/* 15 */                    if (i == 0) {
/* 17 */                        iArrCopyOf = Arrays.copyOf(iArr, length);
                            } else {
/* 28 */                        DisplayMetrics displayMetrics = c0175bc.f2362j.getResources().getDisplayMetrics();
/* 32 */                        for (int i2 = 0; i2 < length; i2++) {
/* 45 */                            iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                                }
                            }
/* 54 */                    c0175bc.f2358f = C0175bc.m1319b(iArrCopyOf);
/* 60 */                    if (!c0175bc.m1327i()) {
/* 69 */                        C1951n4.m6865p(Arrays.toString(iArr), "None of the preset sizes is valid: ");
/* 72 */                        return;
                            }
                        } else {
/* 73 */                    c0175bc.f2359g = false;
                        }
/* 79 */                if (c0175bc.m1326h()) {
/* 81 */                    c0175bc.m1322a();
                        }
                    }
                }

                /* JADX INFO: renamed from: k */
                public final void m8768k(int i) {
/* 1 */             C0175bc c0175bc = this.f17021i;
/* 7 */             if (c0175bc.m1328j()) {
/* 9 */                 if (i == 0) {
/* 63 */                    c0175bc.f2353a = 0;
/* 67 */                    c0175bc.f2356d = -1.0f;
/* 69 */                    c0175bc.f2357e = -1.0f;
/* 71 */                    c0175bc.f2355c = -1.0f;
/* 75 */                    c0175bc.f2358f = new int[0];
/* 77 */                    c0175bc.f2354b = false;
/* 79 */                    return;
                        }
/* 12 */                if (i != 1) {
/* 58 */                    C1951n4.m6859j(fm0.m3781g(i, "Unknown auto-size text type: "));
/* 61 */                    return;
                        }
/* 20 */                DisplayMetrics displayMetrics = c0175bc.f2362j.getResources().getDisplayMetrics();
/* 39 */                c0175bc.m1329k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
/* 46 */                if (c0175bc.m1326h()) {
/* 48 */                    c0175bc.m1322a();
                        }
                    }
                }

                /* JADX INFO: renamed from: l */
                public final void m8769l(ColorStateList colorStateList) {
/* 3 */             if (this.f17020h == null) {
/* 10 */                this.f17020h = new vo2();
                    }
/* 12 */            vo2 vo2Var = this.f17020h;
/* 14 */            vo2Var.f18261a = colorStateList;
/* 21 */            vo2Var.f18264d = colorStateList != null;
/* 23 */            this.f17014b = vo2Var;
/* 25 */            this.f17015c = vo2Var;
/* 27 */            this.f17016d = vo2Var;
/* 29 */            this.f17017e = vo2Var;
/* 31 */            this.f17018f = vo2Var;
/* 33 */            this.f17019g = vo2Var;
                }

                /* JADX INFO: renamed from: m */
                public final void m8770m(PorterDuff.Mode mode) {
/* 3 */             if (this.f17020h == null) {
/* 10 */                this.f17020h = new vo2();
                    }
/* 12 */            vo2 vo2Var = this.f17020h;
/* 14 */            vo2Var.f18262b = mode;
/* 21 */            vo2Var.f18263c = mode != null;
/* 23 */            this.f17014b = vo2Var;
/* 25 */            this.f17015c = vo2Var;
/* 27 */            this.f17016d = vo2Var;
/* 29 */            this.f17017e = vo2Var;
/* 31 */            this.f17018f = vo2Var;
/* 33 */            this.f17019g = vo2Var;
                }

                /* JADX INFO: renamed from: n */
                public final void m8771n(Context context, ac1 ac1Var) {
                    String string;
/* 1 */             int i = R$styleable.TextAppearance_android_textStyle;
/* 3 */             int i2 = this.f17022j;
/* 7 */             TypedArray typedArray = (TypedArray) ac1Var.f178c;
/* 13 */            this.f17022j = typedArray.getInt(i, i2);
/* 15 */            int i3 = Build.VERSION.SDK_INT;
/* 21 */            if (i3 >= 28) {
/* 25 */                int i4 = typedArray.getInt(R$styleable.TextAppearance_android_textFontWeight, -1);
/* 29 */                this.f17023k = i4;
/* 31 */                if (i4 != -1) {
/* 36 */                    this.f17022j &= 2;
                        }
                    }
/* 46 */            if (!typedArray.hasValue(R$styleable.TextAppearance_android_fontFamily) && !typedArray.hasValue(R$styleable.TextAppearance_fontFamily)) {
/* 63 */                if (typedArray.hasValue(R$styleable.TextAppearance_android_typeface)) {
/* 65 */                    this.f17025m = false;
/* 69 */                    int i5 = typedArray.getInt(R$styleable.TextAppearance_android_typeface, 1);
/* 73 */                    if (i5 == 1) {
/* 94 */                        this.f17024l = Typeface.SANS_SERIF;
/* 96 */                        return;
                            } else if (i5 == 2) {
/* 89 */                        this.f17024l = Typeface.SERIF;
/* 91 */                        return;
                            } else {
/* 78 */                        if (i5 != 3) {
/* 227 */                           return;
                                }
/* 84 */                        this.f17024l = Typeface.MONOSPACE;
/* 86 */                        return;
                            }
                        }
/* 227 */               return;
                    }
/* 98 */            this.f17024l = null;
/* 111 */           int i6 = typedArray.hasValue(R$styleable.TextAppearance_fontFamily) ? R$styleable.TextAppearance_fontFamily : R$styleable.TextAppearance_android_fontFamily;
/* 113 */           int i7 = this.f17023k;
/* 115 */           int i8 = this.f17022j;
/* 121 */           if (!context.isRestricted()) {
                        try {
/* 137 */                   Typeface typefaceM186p = ac1Var.m186p(i6, this.f17022j, new C1995ob(this, i7, i8, new WeakReference(this.f17013a)));
/* 141 */                   if (typefaceM186p != null) {
/* 143 */                       if (i3 < 28 || this.f17023k == -1) {
/* 170 */                           this.f17024l = typefaceM186p;
                                } else {
/* 167 */                           this.f17024l = AbstractC2175sb.m8460a(Typeface.create(typefaceM186p, 0), this.f17023k, (this.f17022j & 2) != 0);
                                }
                            }
/* 179 */                   this.f17025m = this.f17024l == null;
                        } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                        }
                    }
/* 183 */           if (this.f17024l != null || (string = typedArray.getString(i6)) == null) {
/* 227 */               return;
                    }
/* 193 */           if (Build.VERSION.SDK_INT < 28 || this.f17023k == -1) {
/* 225 */               this.f17024l = Typeface.create(string, this.f17022j);
                    } else {
/* 216 */               this.f17024l = AbstractC2175sb.m8460a(Typeface.create(string, 0), this.f17023k, (this.f17022j & 2) != 0);
                    }
                }
            }
