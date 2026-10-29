            package com.google.android.material.chip;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.ViewGroup;
            import android.view.accessibility.AccessibilityNodeInfo;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import com.google.android.material.internal.FlowLayout;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.WeakHashMap;
            import p000.C0828d1;
            import p000.C2306vt;
            import p000.InterfaceC1769iu;
            import p000.InterfaceC1806ju;
            import p000.ViewGroupOnHierarchyChangeListenerC1866ku;
            import p000.e33;
            import p000.gr0;
            import p000.hd1;
            import p000.qc3;
            import p000.rn2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public class ChipGroup extends FlowLayout {

                /* JADX INFO: renamed from: V */
                public static final int f4599V = R$style.Widget_MaterialComponents_ChipGroup;

                /* JADX INFO: renamed from: U */
                public final ViewGroupOnHierarchyChangeListenerC1866ku f4600U;

                /* JADX INFO: renamed from: e */
                public int f4601e;

                /* JADX INFO: renamed from: f */
                public int f4602f;

                /* JADX INFO: renamed from: i */
                public InterfaceC1806ju f4603i;

                /* JADX INFO: renamed from: v */
                public final C2306vt f4604v;

                /* JADX INFO: renamed from: w */
                public final int f4605w;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class LayoutParams extends ViewGroup.MarginLayoutParams {
                    public LayoutParams(Context context, AttributeSet attributeSet) {
/* 1 */                 super(context, attributeSet);
                    }
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public ChipGroup(Context context, AttributeSet attributeSet, int i) {
/* 1 */             int i2 = f4599V;
/* 7 */             super(hd1.m4176a(context, attributeSet, i, i2), attributeSet, i);
/* 12 */            C2306vt c2306vt = new C2306vt();
/* 15 */            this.f4604v = c2306vt;
/* 19 */            ViewGroupOnHierarchyChangeListenerC1866ku viewGroupOnHierarchyChangeListenerC1866ku = new ViewGroupOnHierarchyChangeListenerC1866ku(this);
/* 22 */            this.f4600U = viewGroupOnHierarchyChangeListenerC1866ku;
/* 35 */            TypedArray typedArrayM8213d = rn2.m8213d(getContext(), attributeSet, R$styleable.ChipGroup, i, i2, new int[0]);
/* 41 */            int dimensionPixelOffset = typedArrayM8213d.getDimensionPixelOffset(R$styleable.ChipGroup_chipSpacing, 0);
/* 51 */            setChipSpacingHorizontal(typedArrayM8213d.getDimensionPixelOffset(R$styleable.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
/* 60 */            setChipSpacingVertical(typedArrayM8213d.getDimensionPixelOffset(R$styleable.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
/* 69 */            setSingleLine(typedArrayM8213d.getBoolean(R$styleable.ChipGroup_singleLine, false));
/* 78 */            setSingleSelection(typedArrayM8213d.getBoolean(R$styleable.ChipGroup_singleSelection, false));
/* 87 */            setSelectionRequired(typedArrayM8213d.getBoolean(R$styleable.ChipGroup_selectionRequired, false));
/* 97 */            this.f4605w = typedArrayM8213d.getResourceId(R$styleable.ChipGroup_checkedChip, -1);
/* 99 */            typedArrayM8213d.recycle();
/* 107 */           c2306vt.f18352e = new gr0(this);
/* 109 */           super.setOnHierarchyChangeListener(viewGroupOnHierarchyChangeListenerC1866ku);
/* 112 */           WeakHashMap weakHashMap = e33.f7494a;
/* 115 */           setImportantForAccessibility(1);
                }

                private int getChipCount() {
/* 2 */             int i = 0;
/* 7 */             for (int i2 = 0; i2 < getChildCount(); i2++) {
/* 15 */                if (getChildAt(i2) instanceof Chip) {
/* 17 */                    i++;
                        }
                    }
/* 22 */            return i;
                }

                @Override // com.google.android.material.internal.FlowLayout
                /* JADX INFO: renamed from: a */
                public final boolean mo2286a() {
/* 1 */             return this.f4787c;
                }

                @Override // android.view.ViewGroup
                public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
                    return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
/* 4 */             return new LayoutParams(-2, -2);
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 7 */             return new LayoutParams(getContext(), attributeSet);
                }

                public int getCheckedChipId() {
/* 3 */             return this.f4604v.m9343c();
                }

                public List<Integer> getCheckedChipIds() {
/* 3 */             return this.f4604v.m9342b(this);
                }

                public int getChipSpacingHorizontal() {
/* 1 */             return this.f4601e;
                }

                public int getChipSpacingVertical() {
/* 1 */             return this.f4602f;
                }

                @Override // android.view.View
                public final void onFinishInflate() {
/* 1 */             super.onFinishInflate();
/* 5 */             int i = this.f4605w;
/* 7 */             if (i != -1) {
/* 9 */                 C2306vt c2306vt = this.f4604v;
/* 23 */                Chip chip = (Chip) ((HashMap) c2306vt.f18350c).get(Integer.valueOf(i));
/* 25 */                if (chip != null && c2306vt.m9341a(chip)) {
/* 34 */                    c2306vt.m9344d();
                        }
                    }
                }

                @Override // android.view.View
                public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
/* 35 */            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C0828d1.m2904b(getRowCount(), this.f4787c ? getChipCount() : -1, this.f4604v.f18348a ? 1 : 2).f6954a);
                }

                public void setChipSpacing(int i) {
/* 1 */             setChipSpacingHorizontal(i);
/* 4 */             setChipSpacingVertical(i);
                }

                public void setChipSpacingHorizontal(int i) {
/* 3 */             if (this.f4601e != i) {
/* 5 */                 this.f4601e = i;
/* 7 */                 setItemSpacing(i);
/* 10 */                requestLayout();
                    }
                }

                public void setChipSpacingHorizontalResource(int i) {
/* 9 */             setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
                }

                public void setChipSpacingResource(int i) {
/* 9 */             setChipSpacing(getResources().getDimensionPixelOffset(i));
                }

                public void setChipSpacingVertical(int i) {
/* 3 */             if (this.f4602f != i) {
/* 5 */                 this.f4602f = i;
/* 7 */                 setLineSpacing(i);
/* 10 */                requestLayout();
                    }
                }

                public void setChipSpacingVerticalResource(int i) {
/* 9 */             setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
                }

                @Deprecated
                public void setDividerDrawableHorizontal(Drawable drawable) {
/* 8 */             throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
                }

                @Deprecated
                public void setDividerDrawableVertical(Drawable drawable) {
/* 8 */             throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
                }

                @Deprecated
                public void setFlexWrap(int i) {
/* 8 */             throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
                }

                @Deprecated
                public void setOnCheckedChangeListener(InterfaceC1769iu interfaceC1769iu) {
/* 1 */             if (interfaceC1769iu == null) {
/* 4 */                 setOnCheckedStateChangeListener(null);
                    } else {
/* 15 */                setOnCheckedStateChangeListener(new qc3(this, 16));
                    }
                }

                public void setOnCheckedStateChangeListener(InterfaceC1806ju interfaceC1806ju) {
/* 1 */             this.f4603i = interfaceC1806ju;
                }

                @Override // android.view.ViewGroup
                public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
/* 3 */             this.f4600U.f13009a = onHierarchyChangeListener;
                }

                public void setSelectionRequired(boolean z) {
/* 3 */             this.f4604v.f18349b = z;
                }

                @Deprecated
                public void setShowDividerHorizontal(int i) {
/* 8 */             throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
                }

                @Deprecated
                public void setShowDividerVertical(int i) {
/* 8 */             throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
                }

                public void setSingleLine(int i) {
/* 9 */             setSingleLine(getResources().getBoolean(i));
                }

                public void setSingleSelection(boolean z) {
/* 1 */             C2306vt c2306vt = this.f4604v;
/* 5 */             if (c2306vt.f18348a != z) {
/* 7 */                 c2306vt.f18348a = z;
/* 13 */                boolean zIsEmpty = ((HashSet) c2306vt.f18351d).isEmpty();
/* 25 */                Iterator it = ((HashMap) c2306vt.f18350c).values().iterator();
/* 33 */                while (it.hasNext()) {
/* 42 */                    c2306vt.m9345e((Chip) it.next(), false);
                        }
/* 46 */                if (zIsEmpty) {
/* 51 */                    return;
                        }
/* 48 */                c2306vt.m9344d();
                    }
                }

                @Override // android.view.ViewGroup
/* 10 */        public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 12 */            return new LayoutParams(layoutParams);
                }

                @Override // com.google.android.material.internal.FlowLayout
/* 12 */        public void setSingleLine(boolean z) {
/* 13 */            super.setSingleLine(z);
                }

/* 51 */        public void setSingleSelection(int i) {
/* 52 */            setSingleSelection(getResources().getBoolean(i));
                }

/* 118 */       public ChipGroup(Context context, AttributeSet attributeSet) {
/* 119 */           this(context, attributeSet, R$attr.chipGroupStyle);
                }
            }
