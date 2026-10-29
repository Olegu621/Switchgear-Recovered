            package com.google.android.material.button;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.widget.LinearLayout;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import com.google.android.material.timepicker.C0385g;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Set;
            import java.util.TreeMap;
            import java.util.WeakHashMap;
            import p000.C0828d1;
            import p000.C0862e;
            import p000.C0876ed;
            import p000.C2343wt;
            import p000.e33;
            import p000.fs0;
            import p000.hd1;
            import p000.kb1;
            import p000.rn2;
            import p000.sc2;
            import p000.tc2;
            import p000.vc1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public class MaterialButtonToggleGroup extends LinearLayout {

                /* JADX INFO: renamed from: V */
                public static final int f4552V = R$style.Widget_MaterialComponents_MaterialButtonToggleGroup;

                /* JADX INFO: renamed from: U */
                public HashSet f4553U;

                /* JADX INFO: renamed from: a */
                public final ArrayList f4554a;

                /* JADX INFO: renamed from: b */
                public final fs0 f4555b;

                /* JADX INFO: renamed from: c */
                public final LinkedHashSet f4556c;

                /* JADX INFO: renamed from: d */
                public final C0876ed f4557d;

                /* JADX INFO: renamed from: e */
                public Integer[] f4558e;

                /* JADX INFO: renamed from: f */
                public boolean f4559f;

                /* JADX INFO: renamed from: i */
                public boolean f4560i;

                /* JADX INFO: renamed from: v */
                public boolean f4561v;

                /* JADX INFO: renamed from: w */
                public final int f4562w;

                /* JADX WARN: Illegal instructions before constructor call */
                public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
/* 1 */             int i2 = f4552V;
/* 7 */             super(hd1.m4176a(context, attributeSet, i, i2), attributeSet, i);
/* 15 */            this.f4554a = new ArrayList();
/* 23 */            this.f4555b = new fs0(this, 5);
/* 30 */            this.f4556c = new LinkedHashSet();
/* 38 */            this.f4557d = new C0876ed(this, 1);
/* 41 */            this.f4559f = false;
/* 48 */            this.f4553U = new HashSet();
/* 60 */            TypedArray typedArrayM8213d = rn2.m8213d(getContext(), attributeSet, R$styleable.MaterialButtonToggleGroup, i, i2, new int[0]);
/* 70 */            setSingleSelection(typedArrayM8213d.getBoolean(R$styleable.MaterialButtonToggleGroup_singleSelection, false));
/* 80 */            this.f4562w = typedArrayM8213d.getResourceId(R$styleable.MaterialButtonToggleGroup_checkedButton, -1);
/* 88 */            this.f4561v = typedArrayM8213d.getBoolean(R$styleable.MaterialButtonToggleGroup_selectionRequired, false);
/* 90 */            setChildrenDrawingOrderEnabled(true);
/* 93 */            typedArrayM8213d.recycle();
/* 96 */            WeakHashMap weakHashMap = e33.f7494a;
/* 98 */            setImportantForAccessibility(1);
                }

                private int getFirstVisibleChildIndex() {
/* 1 */             int childCount = getChildCount();
/* 6 */             for (int i = 0; i < childCount; i++) {
/* 12 */                if (m2274c(i)) {
/* 14 */                    return i;
                        }
                    }
/* 18 */            return -1;
                }

                private int getLastVisibleChildIndex() {
/* 7 */             for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
/* 13 */                if (m2274c(childCount)) {
/* 15 */                    return childCount;
                        }
                    }
/* 19 */            return -1;
                }

                private int getVisibleButtonCount() {
/* 2 */             int i = 0;
/* 7 */             for (int i2 = 0; i2 < getChildCount(); i2++) {
/* 15 */                if ((getChildAt(i2) instanceof MaterialButton) && m2274c(i2)) {
/* 23 */                    i++;
                        }
                    }
/* 28 */            return i;
                }

                private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
/* 6 */             if (materialButton.getId() == -1) {
/* 8 */                 WeakHashMap weakHashMap = e33.f7494a;
/* 14 */                materialButton.setId(View.generateViewId());
                    }
                }

                private void setupButtonChild(MaterialButton materialButton) {
/* 2 */             materialButton.setMaxLines(1);
/* 7 */             materialButton.setEllipsize(TextUtils.TruncateAt.END);
/* 10 */            materialButton.setCheckable(true);
/* 15 */            materialButton.setOnPressedChangeListenerInternal(this.f4555b);
/* 18 */            materialButton.setShouldDrawSurfaceColorStroke(true);
                }

                /* JADX INFO: renamed from: a */
                public final void m2272a() {
/* 1 */             int firstVisibleChildIndex = getFirstVisibleChildIndex();
/* 6 */             if (firstVisibleChildIndex == -1) {
/* 139 */               return;
                    }
/* 17 */            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
/* 23 */                MaterialButton materialButton = (MaterialButton) getChildAt(i);
/* 41 */                int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
/* 45 */                ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
/* 62 */                LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
/* 70 */                if (getOrientation() == 0) {
/* 72 */                    layoutParams2.setMarginEnd(0);
/* 76 */                    layoutParams2.setMarginStart(-iMin);
/* 79 */                    layoutParams2.topMargin = 0;
                        } else {
/* 82 */                    layoutParams2.bottomMargin = 0;
/* 85 */                    layoutParams2.topMargin = -iMin;
/* 87 */                    layoutParams2.setMarginStart(0);
                        }
/* 90 */                materialButton.setLayoutParams(layoutParams2);
                    }
/* 100 */           if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
/* 139 */               return;
                    }
/* 115 */           LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
/* 122 */           if (getOrientation() == 1) {
/* 124 */               layoutParams3.topMargin = 0;
/* 126 */               layoutParams3.bottomMargin = 0;
                    } else {
/* 129 */               layoutParams3.setMarginEnd(0);
/* 132 */               layoutParams3.setMarginStart(0);
/* 135 */               layoutParams3.leftMargin = 0;
/* 137 */               layoutParams3.rightMargin = 0;
                    }
                }

                @Override // android.view.ViewGroup
                public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
/* 3 */             if (!(view instanceof MaterialButton)) {
/* 9 */                 AbstractC1245n0.m4876d("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
/* 12 */                return;
                    }
/* 13 */            super.addView(view, i, layoutParams);
/* 16 */            MaterialButton materialButton = (MaterialButton) view;
/* 18 */            setGeneratedIdIfNeeded(materialButton);
/* 21 */            setupButtonChild(materialButton);
/* 30 */            m2273b(materialButton.getId(), materialButton.f4542b0);
/* 33 */            tc2 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
/* 52 */            this.f4554a.add(new vc1(shapeAppearanceModel.f17036e, shapeAppearanceModel.f17039h, shapeAppearanceModel.f17037f, shapeAppearanceModel.f17038g));
/* 61 */            e33.m3318n(materialButton, new C2343wt(this, 2));
                }

                /* JADX INFO: renamed from: b */
                public final void m2273b(int i, boolean z) {
/* 2 */             if (i == -1) {
/* 20 */                AbstractC1245n0.m4876d("MaterialButtonToggleGroup", "Button ID is not valid: " + i);
/* 23 */                return;
                    }
/* 28 */            HashSet hashSet = new HashSet(this.f4553U);
/* 31 */            if (z && !hashSet.contains(Integer.valueOf(i))) {
/* 45 */                if (this.f4560i && !hashSet.isEmpty()) {
/* 53 */                    hashSet.clear();
                        }
/* 60 */                hashSet.add(Integer.valueOf(i));
                    } else {
/* 64 */                if (z || !hashSet.contains(Integer.valueOf(i))) {
/* 97 */                    return;
                        }
/* 78 */                if (!this.f4561v || hashSet.size() > 1) {
/* 91 */                    hashSet.remove(Integer.valueOf(i));
                        }
                    }
/* 94 */            m2275d(hashSet);
                }

                /* JADX INFO: renamed from: c */
                public final boolean m2274c(int i) {
                    return getChildAt(i).getVisibility() != 8;
                }

                /* JADX INFO: renamed from: d */
                public final void m2275d(Set set) {
/* 1 */             HashSet hashSet = this.f4553U;
/* 8 */             this.f4553U = new HashSet(set);
/* 16 */            for (int i = 0; i < getChildCount(); i++) {
/* 24 */                int id = ((MaterialButton) getChildAt(i)).getId();
/* 32 */                boolean zContains = set.contains(Integer.valueOf(id));
/* 36 */                View viewFindViewById = findViewById(id);
/* 42 */                if (viewFindViewById instanceof MaterialButton) {
/* 45 */                    this.f4559f = true;
/* 49 */                    ((MaterialButton) viewFindViewById).setChecked(zContains);
/* 52 */                    this.f4559f = false;
                        }
/* 70 */                if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
/* 76 */                    set.contains(Integer.valueOf(id));
/* 81 */                    Iterator it = this.f4556c.iterator();
/* 89 */                    while (it.hasNext()) {
/* 97 */                        ((C0385g) it.next()).m2430a();
                            }
                        }
                    }
/* 104 */           invalidate();
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void dispatchDraw(Canvas canvas) {
/* 5 */             TreeMap treeMap = new TreeMap(this.f4557d);
/* 8 */             int childCount = getChildCount();
/* 14 */            for (int i = 0; i < childCount; i++) {
/* 26 */                treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
                    }
/* 44 */            this.f4558e = (Integer[]) treeMap.values().toArray(new Integer[0]);
/* 46 */            super.dispatchDraw(canvas);
                }

                /* JADX INFO: renamed from: e */
                public final void m2276e() {
                    vc1 vc1Var;
/* 1 */             int childCount = getChildCount();
/* 5 */             int firstVisibleChildIndex = getFirstVisibleChildIndex();
/* 9 */             int lastVisibleChildIndex = getLastVisibleChildIndex();
/* 15 */            for (int i = 0; i < childCount; i++) {
/* 21 */                MaterialButton materialButton = (MaterialButton) getChildAt(i);
/* 29 */                if (materialButton.getVisibility() != 8) {
/* 37 */                    sc2 sc2VarM8779f = materialButton.getShapeAppearanceModel().m8779f();
/* 47 */                    vc1 vc1Var2 = (vc1) this.f4554a.get(i);
/* 49 */                    if (firstVisibleChildIndex != lastVisibleChildIndex) {
/* 60 */                        boolean z = getOrientation() == 0;
/* 61 */                        C0862e c0862e = vc1.f17980e;
/* 63 */                        if (i == firstVisibleChildIndex) {
/* 100 */                           vc1Var = z ? kb1.m6036J(this) ? new vc1(c0862e, c0862e, vc1Var2.f17982b, vc1Var2.f17983c) : new vc1(vc1Var2.f17981a, vc1Var2.f17984d, c0862e, c0862e) : new vc1(vc1Var2.f17981a, c0862e, vc1Var2.f17982b, c0862e);
                                } else if (i != lastVisibleChildIndex) {
/* 144 */                           vc1Var2 = null;
                                } else if (z) {
/* 130 */                           vc1Var = kb1.m6036J(this) ? new vc1(vc1Var2.f17981a, vc1Var2.f17984d, c0862e, c0862e) : new vc1(c0862e, c0862e, vc1Var2.f17982b, vc1Var2.f17983c);
                                } else {
/* 140 */                           vc1Var = new vc1(c0862e, vc1Var2.f17984d, c0862e, vc1Var2.f17983c);
                                }
/* 82 */                        vc1Var2 = vc1Var;
                            }
/* 145 */                   if (vc1Var2 == null) {
/* 148 */                       sc2VarM8779f.m8479b(0.0f);
                            } else {
/* 154 */                       sc2VarM8779f.f16527e = vc1Var2.f17981a;
/* 158 */                       sc2VarM8779f.f16530h = vc1Var2.f17984d;
/* 162 */                       sc2VarM8779f.f16528f = vc1Var2.f17982b;
/* 166 */                       sc2VarM8779f.f16529g = vc1Var2.f17983c;
                            }
/* 172 */                   materialButton.setShapeAppearanceModel(sc2VarM8779f.m8478a());
                        }
                    }
                }

                public int getCheckedButtonId() {
/* 3 */             if (!this.f4560i || this.f4553U.isEmpty()) {
/* 30 */                return -1;
                    }
/* 25 */            return ((Integer) this.f4553U.iterator().next()).intValue();
                }

                public List<Integer> getCheckedButtonIds() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 11 */            for (int i = 0; i < getChildCount(); i++) {
/* 19 */                int id = ((MaterialButton) getChildAt(i)).getId();
/* 33 */                if (this.f4553U.contains(Integer.valueOf(id))) {
/* 39 */                    arrayList.add(Integer.valueOf(id));
                        }
                    }
/* 45 */            return arrayList;
                }

                @Override // android.view.ViewGroup
                public final int getChildDrawingOrder(int i, int i2) {
/* 1 */             Integer[] numArr = this.f4558e;
/* 3 */             if (numArr != null && i2 < numArr.length) {
/* 11 */                return numArr[i2].intValue();
                    }
/* 20 */            AbstractC1245n0.m4889q("MaterialButtonToggleGroup", "Child order wasn't updated");
/* 23 */            return i2;
                }

                @Override // android.view.View
                public final void onFinishInflate() {
/* 1 */             super.onFinishInflate();
/* 5 */             int i = this.f4562w;
/* 7 */             if (i != -1) {
/* 17 */                m2275d(Collections.singleton(Integer.valueOf(i)));
                    }
                }

                @Override // android.view.View
                public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
/* 24 */            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C0828d1.m2904b(1, getVisibleButtonCount(), this.f4560i ? 1 : 2).f6954a);
                }

                @Override // android.widget.LinearLayout, android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             m2276e();
/* 4 */             m2272a();
/* 7 */             super.onMeasure(i, i2);
                }

                @Override // android.view.ViewGroup
                public final void onViewRemoved(View view) {
/* 1 */             super.onViewRemoved(view);
/* 6 */             if (view instanceof MaterialButton) {
/* 12 */                ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
                    }
/* 15 */            int iIndexOfChild = indexOfChild(view);
/* 19 */            if (iIndexOfChild >= 0) {
/* 23 */                this.f4554a.remove(iIndexOfChild);
                    }
/* 26 */            m2276e();
/* 29 */            m2272a();
                }

                public void setSelectionRequired(boolean z) {
/* 1 */             this.f4561v = z;
                }

                public void setSingleSelection(boolean z) {
/* 3 */             if (this.f4560i != z) {
/* 5 */                 this.f4560i = z;
/* 12 */                m2275d(new HashSet());
                    }
                }

/* 15 */        public void setSingleSelection(int i) {
/* 16 */            setSingleSelection(getResources().getBoolean(i));
                }

/* 101 */       public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
/* 102 */           this(context, attributeSet, R$attr.materialButtonToggleGroupStyle);
                }
            }
