            package com.google.android.material.textfield;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.os.Build;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import android.view.accessibility.AccessibilityManager;
            import android.widget.ArrayAdapter;
            import android.widget.Filterable;
            import android.widget.ListAdapter;
            import android.widget.PopupWindow;
            import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
            import androidx.appcompat.widget.ListPopupWindow;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$layout;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import java.util.Locale;
            import okhttp3.HttpUrl;
            import p000.C1787jb;
            import p000.hd1;
            import p000.rn2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

                /* JADX INFO: renamed from: e */
                public final ListPopupWindow f4996e;

                /* JADX INFO: renamed from: f */
                public final AccessibilityManager f4997f;

                /* JADX INFO: renamed from: i */
                public final Rect f4998i;

                /* JADX INFO: renamed from: v */
                public final int f4999v;

                public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
/* 6 */             super(hd1.m4176a(context, attributeSet, i, 0), attributeSet, i);
/* 14 */            this.f4998i = new Rect();
/* 16 */            Context context2 = getContext();
/* 28 */            TypedArray typedArrayM8213d = rn2.m8213d(context2, attributeSet, R$styleable.MaterialAutoCompleteTextView, i, R$style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
/* 38 */            if (typedArrayM8213d.hasValue(R$styleable.MaterialAutoCompleteTextView_android_inputType) && typedArrayM8213d.getInt(R$styleable.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
/* 49 */                setKeyListener(null);
                    }
/* 60 */            this.f4999v = typedArrayM8213d.getResourceId(R$styleable.MaterialAutoCompleteTextView_simpleItemLayout, R$layout.mtrl_auto_complete_simple_item);
/* 70 */            this.f4997f = (AccessibilityManager) context2.getSystemService("accessibility");
/* 74 */            ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
/* 77 */            this.f4996e = listPopupWindow;
/* 80 */            listPopupWindow.f590i0 = true;
/* 82 */            PopupWindow popupWindow = listPopupWindow.f591j0;
/* 84 */            popupWindow.setFocusable(true);
/* 87 */            listPopupWindow.f574Z = this;
/* 90 */            popupWindow.setInputMethodMode(2);
/* 97 */            listPopupWindow.mo373o(getAdapter());
/* 105 */           listPopupWindow.f576a0 = new C1787jb(this, 1);
/* 113 */           if (typedArrayM8213d.hasValue(R$styleable.MaterialAutoCompleteTextView_simpleItems)) {
/* 121 */               setSimpleItems(typedArrayM8213d.getResourceId(R$styleable.MaterialAutoCompleteTextView_simpleItems, 0));
                    }
/* 124 */           typedArrayM8213d.recycle();
                }

                /* JADX INFO: renamed from: a */
                public static void m2394a(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object obj) {
/* 6 */             materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(obj), false);
                }

                /* JADX INFO: renamed from: b */
                public final TextInputLayout m2395b() {
/* 5 */             for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
/* 9 */                 if (parent instanceof TextInputLayout) {
/* 11 */                    return (TextInputLayout) parent;
                        }
                    }
/* 19 */            return null;
                }

                @Override // android.widget.TextView
                public CharSequence getHint() {
/* 1 */             TextInputLayout textInputLayoutM2395b = m2395b();
                    return (textInputLayoutM2395b == null || !textInputLayoutM2395b.f5075s0) ? super.getHint() : textInputLayoutM2395b.getHint();
                }

                @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             TextInputLayout textInputLayoutM2395b = m2395b();
/* 8 */             if (textInputLayoutM2395b != null && textInputLayoutM2395b.f5075s0 && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
/* 38 */                setHint(HttpUrl.FRAGMENT_ENCODE_SET);
                    }
                }

                @Override // android.widget.TextView, android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             super.onMeasure(i, i2);
/* 10 */            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
/* 12 */                int measuredWidth = getMeasuredWidth();
/* 16 */                ListAdapter adapter = getAdapter();
/* 20 */                TextInputLayout textInputLayoutM2395b = m2395b();
/* 24 */                int measuredWidth2 = 0;
/* 25 */                if (adapter != null && textInputLayoutM2395b != null) {
/* 35 */                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
/* 43 */                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
/* 47 */                    ListPopupWindow listPopupWindow = this.f4996e;
/* 75 */                    int iMin = Math.min(adapter.getCount(), Math.max(0, !listPopupWindow.f591j0.isShowing() ? -1 : listPopupWindow.f579c.getSelectedItemPosition()) + 15);
/* 87 */                    View view = null;
/* 88 */                    int iMax = 0;
/* 89 */                    for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
/* 91 */                        int itemViewType = adapter.getItemViewType(iMax2);
/* 95 */                        if (itemViewType != measuredWidth2) {
/* 97 */                            view = null;
/* 98 */                            measuredWidth2 = itemViewType;
                                }
/* 99 */                        view = adapter.getView(iMax2, view, textInputLayoutM2395b);
/* 107 */                       if (view.getLayoutParams() == null) {
/* 115 */                           view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                                }
/* 118 */                       view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
/* 125 */                       iMax = Math.max(iMax, view.getMeasuredWidth());
                            }
/* 134 */                   Drawable background = listPopupWindow.f591j0.getBackground();
/* 138 */                   if (background != null) {
/* 140 */                       Rect rect = this.f4998i;
/* 142 */                       background.getPadding(rect);
/* 150 */                       iMax += rect.left + rect.right;
                            }
/* 159 */                   measuredWidth2 = textInputLayoutM2395b.getEndIconView().getMeasuredWidth() + iMax;
                        }
/* 177 */               setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
                    }
                }

                @Override // android.widget.AutoCompleteTextView
                public <T extends ListAdapter & Filterable> void setAdapter(T t) {
/* 1 */             super.setAdapter(t);
/* 10 */            this.f4996e.mo373o(getAdapter());
                }

                public void setSimpleItems(String[] strArr) {
/* 12 */            setAdapter(new ArrayAdapter(getContext(), this.f4999v, strArr));
                }

                @Override // android.widget.AutoCompleteTextView
                public final void showDropDown() {
/* 1 */             AccessibilityManager accessibilityManager = this.f4997f;
/* 3 */             if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
/* 17 */                super.showDropDown();
                    } else {
/* 13 */                this.f4996e.show();
                    }
                }

/* 15 */        public void setSimpleItems(int i) {
/* 16 */            setSimpleItems(getResources().getStringArray(i));
                }

/* 127 */       public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
/* 128 */           this(context, attributeSet, R$attr.autoCompleteTextViewStyle);
                }
            }
