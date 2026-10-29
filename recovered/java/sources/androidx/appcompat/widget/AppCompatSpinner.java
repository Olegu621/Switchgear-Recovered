            package androidx.appcompat.widget;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.PorterDuff;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewTreeObserver;
            import android.widget.ArrayAdapter;
            import android.widget.ListAdapter;
            import android.widget.Spinner;
            import android.widget.SpinnerAdapter;
            import android.widget.ThemedSpinnerAdapter;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.R$layout;
            import androidx.appcompat.R$styleable;
            import p000.AbstractC0948gb;
            import p000.C0173ba;
            import p000.C0911fb;
            import p000.C1022ib;
            import p000.C1884lb;
            import p000.DialogInterfaceOnClickListenerC0985hb;
            import p000.InterfaceC1921mb;
            import p000.ViewTreeObserverOnGlobalLayoutListenerC1986o2;
            import p000.ac1;
            import p000.mn0;
            import p000.sn2;
            import p000.z00;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 214 */   public class AppCompatSpinner extends Spinner {

                /* JADX INFO: renamed from: w */
                public static final int[] f521w = {R.attr.spinnerMode};

                /* JADX INFO: renamed from: a */
                public final C0173ba f522a;

                /* JADX INFO: renamed from: b */
                public final Context f523b;

                /* JADX INFO: renamed from: c */
                public final C0911fb f524c;

                /* JADX INFO: renamed from: d */
                public SpinnerAdapter f525d;

                /* JADX INFO: renamed from: e */
                public final boolean f526e;

                /* JADX INFO: renamed from: f */
                public final InterfaceC1921mb f527f;

                /* JADX INFO: renamed from: i */
                public int f528i;

                /* JADX INFO: renamed from: v */
                public final Rect f529v;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends View.BaseSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0063c();

                    /* JADX INFO: renamed from: a */
                    public boolean f530a;

                    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 7 */                 parcel.writeByte(this.f530a ? (byte) 1 : (byte) 0);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:25:0x005f A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:27:0x0062  */
                /* JADX WARN: Code duplicated, block: B:28:0x009c  */
                /* JADX WARN: Code duplicated, block: B:31:0x00b3  */
                /* JADX WARN: Code duplicated, block: B:34:0x00cc  */
                public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) throws Throwable {
                    TypedArray typedArrayObtainStyledAttributes;
                    CharSequence[] textArray;
                    SpinnerAdapter spinnerAdapter;
/* 1 */             super(context, attributeSet, i);
/* 9 */             this.f529v = new Rect();
/* 15 */            sn2.m8583a(this, getContext());
/* 20 */            ac1 ac1VarM156H = ac1.m156H(context, attributeSet, R$styleable.Spinner, i);
/* 26 */            TypedArray typedArray = (TypedArray) ac1VarM156H.f178c;
/* 33 */            this.f522a = new C0173ba(this);
/* 38 */            int resourceId = typedArray.getResourceId(R$styleable.Spinner_popupTheme, 0);
/* 42 */            if (resourceId != 0) {
/* 49 */                this.f523b = new z00(context, resourceId);
                    } else {
/* 52 */                this.f523b = context;
                    }
/* 54 */            int i2 = -1;
/* 55 */            TypedArray typedArray2 = null;
                    try {
/* 58 */                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f521w, i, 0);
                        try {
/* 66 */                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
/* 68 */                        i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                            }
                        } catch (Exception unused) {
/* 90 */                    if (typedArrayObtainStyledAttributes != null) {
                            }
/* 94 */                    if (i2 != 0) {
/* 159 */                       DialogInterfaceOnClickListenerC0985hb dialogInterfaceOnClickListenerC0985hb = new DialogInterfaceOnClickListenerC0985hb(this);
/* 162 */                       this.f527f = dialogInterfaceOnClickListenerC0985hb;
/* 170 */                       dialogInterfaceOnClickListenerC0985hb.f8994c = typedArray.getString(R$styleable.Spinner_android_prompt);
                            } else if (i2 == 1) {
/* 103 */                       C1884lb c1884lb = new C1884lb(this, this.f523b, attributeSet, i);
/* 110 */                       ac1 ac1VarM156H2 = ac1.m156H(this.f523b, attributeSet, R$styleable.Spinner, i);
/* 125 */                       this.f528i = ((TypedArray) ac1VarM156H2.f178c).getLayoutDimension(R$styleable.Spinner_android_dropDownWidth, -2);
/* 133 */                       c1884lb.m369h(ac1VarM156H2.m184n(R$styleable.Spinner_android_popupBackground));
/* 142 */                       c1884lb.f13164m0 = typedArray.getString(R$styleable.Spinner_android_prompt);
/* 144 */                       ac1VarM156H2.m168J();
/* 147 */                       this.f527f = c1884lb;
/* 154 */                       this.f524c = new C0911fb(this, this, c1884lb);
                            }
/* 174 */                   textArray = typedArray.getTextArray(R$styleable.Spinner_android_entries);
/* 178 */                   if (textArray != null) {
/* 185 */                       ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
/* 190 */                       arrayAdapter.setDropDownViewResource(R$layout.support_simple_spinner_dropdown_item);
/* 193 */                       setAdapter((SpinnerAdapter) arrayAdapter);
                            }
/* 196 */                   ac1VarM156H.m168J();
/* 199 */                   this.f526e = true;
/* 201 */                   spinnerAdapter = this.f525d;
/* 203 */                   if (spinnerAdapter != null) {
/* 205 */                       setAdapter(spinnerAdapter);
/* 208 */                       this.f525d = null;
                            }
/* 212 */                   this.f522a.m1304d(attributeSet, i);
                        } catch (Throwable th) {
/* 73 */                    th = th;
/* 74 */                    typedArray2 = typedArrayObtainStyledAttributes;
/* 84 */                    if (typedArray2 != null) {
/* 86 */                        typedArray2.recycle();
                            }
/* 89 */                    throw th;
                        }
                    } catch (Exception unused2) {
/* 82 */                typedArrayObtainStyledAttributes = null;
                    } catch (Throwable th2) {
/* 80 */                th = th2;
                    }
/* 76 */            typedArrayObtainStyledAttributes.recycle();
/* 94 */            if (i2 != 0) {
/* 159 */               DialogInterfaceOnClickListenerC0985hb dialogInterfaceOnClickListenerC0985hb2 = new DialogInterfaceOnClickListenerC0985hb(this);
/* 162 */               this.f527f = dialogInterfaceOnClickListenerC0985hb2;
/* 170 */               dialogInterfaceOnClickListenerC0985hb2.f8994c = typedArray.getString(R$styleable.Spinner_android_prompt);
                    } else if (i2 == 1) {
/* 103 */               C1884lb c1884lb2 = new C1884lb(this, this.f523b, attributeSet, i);
/* 110 */               ac1 ac1VarM156H3 = ac1.m156H(this.f523b, attributeSet, R$styleable.Spinner, i);
/* 125 */               this.f528i = ((TypedArray) ac1VarM156H3.f178c).getLayoutDimension(R$styleable.Spinner_android_dropDownWidth, -2);
/* 133 */               c1884lb2.m369h(ac1VarM156H3.m184n(R$styleable.Spinner_android_popupBackground));
/* 142 */               c1884lb2.f13164m0 = typedArray.getString(R$styleable.Spinner_android_prompt);
/* 144 */               ac1VarM156H3.m168J();
/* 147 */               this.f527f = c1884lb2;
/* 154 */               this.f524c = new C0911fb(this, this, c1884lb2);
                    }
/* 174 */           textArray = typedArray.getTextArray(R$styleable.Spinner_android_entries);
/* 178 */           if (textArray != null) {
/* 185 */               ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
/* 190 */               arrayAdapter2.setDropDownViewResource(R$layout.support_simple_spinner_dropdown_item);
/* 193 */               setAdapter((SpinnerAdapter) arrayAdapter2);
                    }
/* 196 */           ac1VarM156H.m168J();
/* 199 */           this.f526e = true;
/* 201 */           spinnerAdapter = this.f525d;
/* 203 */           if (spinnerAdapter != null) {
/* 205 */               setAdapter(spinnerAdapter);
/* 208 */               this.f525d = null;
                    }
/* 212 */           this.f522a.m1304d(attributeSet, i);
                }

                /* JADX INFO: renamed from: a */
                public final int m358a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
/* 1 */             int i = 0;
/* 2 */             if (spinnerAdapter == null) {
/* 1 */                 return 0;
                    }
/* 9 */             int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
/* 17 */            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
/* 25 */            int iMax = Math.max(0, getSelectedItemPosition());
/* 35 */            int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
/* 50 */            View view = null;
/* 51 */            int iMax2 = 0;
/* 52 */            for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
/* 54 */                int itemViewType = spinnerAdapter.getItemViewType(iMax3);
/* 58 */                if (itemViewType != i) {
/* 60 */                    view = null;
/* 61 */                    i = itemViewType;
                        }
/* 62 */                view = spinnerAdapter.getView(iMax3, view, this);
/* 70 */                if (view.getLayoutParams() == null) {
/* 78 */                    view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        }
/* 81 */                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
/* 88 */                iMax2 = Math.max(iMax2, view.getMeasuredWidth());
                    }
/* 95 */            if (drawable == null) {
/* 109 */               return iMax2;
                    }
/* 97 */            Rect rect = this.f529v;
/* 99 */            drawable.getPadding(rect);
/* 107 */           return rect.left + rect.right + iMax2;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             C0173ba c0173ba = this.f522a;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1301a();
                    }
                }

                @Override // android.widget.Spinner
                public int getDropDownHorizontalOffset() {
/* 1 */             InterfaceC1921mb interfaceC1921mb = this.f527f;
                    return interfaceC1921mb != null ? interfaceC1921mb.mo4139b() : super.getDropDownHorizontalOffset();
                }

                @Override // android.widget.Spinner
                public int getDropDownVerticalOffset() {
/* 1 */             InterfaceC1921mb interfaceC1921mb = this.f527f;
                    return interfaceC1921mb != null ? interfaceC1921mb.mo4148n() : super.getDropDownVerticalOffset();
                }

                @Override // android.widget.Spinner
                public int getDropDownWidth() {
                    return this.f527f != null ? this.f528i : super.getDropDownWidth();
                }

                public final InterfaceC1921mb getInternalPopup() {
/* 1 */             return this.f527f;
                }

                @Override // android.widget.Spinner
                public Drawable getPopupBackground() {
/* 1 */             InterfaceC1921mb interfaceC1921mb = this.f527f;
                    return interfaceC1921mb != null ? interfaceC1921mb.mo4142f() : super.getPopupBackground();
                }

                @Override // android.widget.Spinner
                public Context getPopupContext() {
/* 1 */             return this.f523b;
                }

                @Override // android.widget.Spinner
                public CharSequence getPrompt() {
/* 1 */             InterfaceC1921mb interfaceC1921mb = this.f527f;
                    return interfaceC1921mb != null ? interfaceC1921mb.mo4141e() : super.getPrompt();
                }

                public ColorStateList getSupportBackgroundTintList() {
/* 1 */             C0173ba c0173ba = this.f522a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 return c0173ba.m1302b();
                    }
/* 10 */            return null;
                }

                public PorterDuff.Mode getSupportBackgroundTintMode() {
/* 1 */             C0173ba c0173ba = this.f522a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 return c0173ba.m1303c();
                    }
/* 10 */            return null;
                }

                @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 4 */             InterfaceC1921mb interfaceC1921mb = this.f527f;
/* 6 */             if (interfaceC1921mb == null || !interfaceC1921mb.mo4138a()) {
/* 17 */                return;
                    }
/* 14 */            interfaceC1921mb.dismiss();
                }

                @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             super.onMeasure(i, i2);
/* 6 */             if (this.f527f == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
/* 51 */                return;
                    }
/* 48 */            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m358a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
                }

                @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
                public final void onRestoreInstanceState(Parcelable parcelable) {
                    ViewTreeObserver viewTreeObserver;
/* 1 */             SavedState savedState = (SavedState) parcelable;
/* 7 */             super.onRestoreInstanceState(savedState.getSuperState());
/* 12 */            if (!savedState.f530a || (viewTreeObserver = getViewTreeObserver()) == null) {
/* 29 */                return;
                    }
/* 26 */            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1986o2(this, 1));
                }

                @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
                public final Parcelable onSaveInstanceState() {
/* 7 */             SavedState savedState = new SavedState(super.onSaveInstanceState());
/* 10 */            InterfaceC1921mb interfaceC1921mb = this.f527f;
/* 23 */            savedState.f530a = interfaceC1921mb != null && interfaceC1921mb.mo4138a();
/* 25 */            return savedState;
                }

                @Override // android.widget.Spinner, android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
/* 1 */             C0911fb c0911fb = this.f524c;
/* 3 */             if (c0911fb == null || !c0911fb.onTouch(this, motionEvent)) {
/* 13 */                return super.onTouchEvent(motionEvent);
                    }
/* 11 */            return true;
                }

                @Override // android.widget.Spinner, android.view.View
                public final boolean performClick() {
/* 1 */             InterfaceC1921mb interfaceC1921mb = this.f527f;
/* 3 */             if (interfaceC1921mb == null) {
/* 24 */                return super.performClick();
                    }
/* 9 */             if (interfaceC1921mb.mo4138a()) {
/* 22 */                return true;
                    }
/* 19 */            interfaceC1921mb.mo4147m(getTextDirection(), getTextAlignment());
/* 22 */            return true;
                }

                @Override // android.widget.AdapterView
                public void setAdapter(SpinnerAdapter spinnerAdapter) {
/* 3 */             if (!this.f526e) {
/* 5 */                 this.f525d = spinnerAdapter;
/* 7 */                 return;
                    }
/* 8 */             super.setAdapter(spinnerAdapter);
/* 11 */            InterfaceC1921mb interfaceC1921mb = this.f527f;
/* 13 */            if (interfaceC1921mb != null) {
/* 15 */                Context context = this.f523b;
/* 17 */                if (context == null) {
/* 19 */                    context = getContext();
                        }
/* 25 */                Resources.Theme theme = context.getTheme();
/* 29 */                C1022ib c1022ib = new C1022ib();
/* 32 */                c1022ib.f9517a = spinnerAdapter;
/* 36 */                if (spinnerAdapter instanceof ListAdapter) {
/* 41 */                    c1022ib.f9518b = (ListAdapter) spinnerAdapter;
                        }
/* 43 */                if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
/* 51 */                    AbstractC0948gb.m3902a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                        }
/* 54 */                interfaceC1921mb.mo373o(c1022ib);
                    }
                }

                @Override // android.view.View
                public void setBackgroundDrawable(Drawable drawable) {
/* 1 */             super.setBackgroundDrawable(drawable);
/* 4 */             C0173ba c0173ba = this.f522a;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1305e();
                    }
                }

                @Override // android.view.View
                public void setBackgroundResource(int i) {
/* 1 */             super.setBackgroundResource(i);
/* 4 */             C0173ba c0173ba = this.f522a;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1306f(i);
                    }
                }

                @Override // android.widget.Spinner
                public void setDropDownHorizontalOffset(int i) {
/* 1 */             InterfaceC1921mb interfaceC1921mb = this.f527f;
/* 3 */             if (interfaceC1921mb == null) {
/* 12 */                super.setDropDownHorizontalOffset(i);
                    } else {
/* 5 */                 interfaceC1921mb.mo4146l(i);
/* 8 */                 interfaceC1921mb.mo4140d(i);
                    }
                }

                @Override // android.widget.Spinner
                public void setDropDownVerticalOffset(int i) {
/* 1 */             InterfaceC1921mb interfaceC1921mb = this.f527f;
/* 3 */             if (interfaceC1921mb != null) {
/* 5 */                 interfaceC1921mb.mo4145k(i);
                    } else {
/* 9 */                 super.setDropDownVerticalOffset(i);
                    }
                }

                @Override // android.widget.Spinner
                public void setDropDownWidth(int i) {
/* 3 */             if (this.f527f != null) {
/* 5 */                 this.f528i = i;
                    } else {
/* 8 */                 super.setDropDownWidth(i);
                    }
                }

                @Override // android.widget.Spinner
                public void setPopupBackgroundDrawable(Drawable drawable) {
/* 1 */             InterfaceC1921mb interfaceC1921mb = this.f527f;
/* 3 */             if (interfaceC1921mb != null) {
/* 5 */                 interfaceC1921mb.mo4144h(drawable);
                    } else {
/* 9 */                 super.setPopupBackgroundDrawable(drawable);
                    }
                }

                @Override // android.widget.Spinner
                public void setPopupBackgroundResource(int i) {
/* 9 */             setPopupBackgroundDrawable(mn0.m6700p(getPopupContext(), i));
                }

                @Override // android.widget.Spinner
                public void setPrompt(CharSequence charSequence) {
/* 1 */             InterfaceC1921mb interfaceC1921mb = this.f527f;
/* 3 */             if (interfaceC1921mb != null) {
/* 5 */                 interfaceC1921mb.mo4143g(charSequence);
                    } else {
/* 9 */                 super.setPrompt(charSequence);
                    }
                }

                public void setSupportBackgroundTintList(ColorStateList colorStateList) {
/* 1 */             C0173ba c0173ba = this.f522a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 c0173ba.m1308h(colorStateList);
                    }
                }

                public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
/* 1 */             C0173ba c0173ba = this.f522a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 c0173ba.m1309i(mode);
                    }
                }

/* 215 */       public AppCompatSpinner(Context context, AttributeSet attributeSet) {
/* 216 */           this(context, attributeSet, R$attr.spinnerStyle);
                }
            }
