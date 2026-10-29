            package androidx.constraintlayout.widget;

            import android.content.Context;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.util.AttributeSet;
            import android.util.SparseArray;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.Arrays;
            import java.util.HashMap;
            import p000.C2274uz;
            import p000.C2569zz;
            import p000.cu0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 24 */    public abstract class ConstraintHelper extends View {

                /* JADX INFO: renamed from: a */
                public int[] f1044a;

                /* JADX INFO: renamed from: b */
                public int f1045b;

                /* JADX INFO: renamed from: c */
                public Context f1046c;

                /* JADX INFO: renamed from: d */
                public cu0 f1047d;

                /* JADX INFO: renamed from: e */
                public String f1048e;

                /* JADX INFO: renamed from: f */
                public String f1049f;

                /* JADX INFO: renamed from: i */
                public View[] f1050i;

                /* JADX INFO: renamed from: v */
                public HashMap f1051v;

                public ConstraintHelper(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 8 */             this.f1044a = new int[32];
/* 11 */            this.f1050i = null;
/* 18 */            this.f1051v = new HashMap();
/* 20 */            this.f1046c = context;
/* 22 */            mo454k(attributeSet);
                }

                /* JADX INFO: renamed from: b */
                public final void m503b(String str) {
/* 5 */             if (str.length() == 0 || this.f1046c == null) {
/* 12 */                return;
                    }
/* 13 */            String strTrim = str.trim();
/* 23 */            if (getParent() instanceof ConstraintLayout) {
                    }
/* 31 */            int iM509i = m509i(strTrim);
/* 35 */            if (iM509i != 0) {
/* 43 */                this.f1051v.put(Integer.valueOf(iM509i), strTrim);
/* 46 */                m504c(iM509i);
                    } else {
/* 71 */                AbstractC1245n0.m4889q("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m504c(int i) {
/* 5 */             if (i == getId()) {
/* 7 */                 return;
                    }
/* 10 */            int i2 = this.f1045b + 1;
/* 12 */            int[] iArr = this.f1044a;
/* 15 */            if (i2 > iArr.length) {
/* 24 */                this.f1044a = Arrays.copyOf(iArr, iArr.length * 2);
                    }
/* 26 */            int[] iArr2 = this.f1044a;
/* 28 */            int i3 = this.f1045b;
/* 30 */            iArr2[i3] = i;
/* 34 */            this.f1045b = i3 + 1;
                }

                /* JADX INFO: renamed from: d */
                public final void m505d(String str) {
/* 5 */             if (str.length() == 0 || this.f1046c == null) {
/* 121 */               return;
                    }
/* 14 */            String strTrim = str.trim();
/* 33 */            ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
/* 36 */            if (constraintLayout == null) {
/* 40 */                AbstractC1245n0.m4889q("ConstraintHelper", "Parent not a ConstraintLayout");
/* 43 */                return;
                    }
/* 44 */            int childCount = constraintLayout.getChildCount();
/* 49 */            for (int i = 0; i < childCount; i++) {
/* 51 */                View childAt = constraintLayout.getChildAt(i);
/* 55 */                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
/* 61 */                if ((layoutParams instanceof ConstraintLayout.LayoutParams) && strTrim.equals(((ConstraintLayout.LayoutParams) layoutParams).f1094Y)) {
/* 78 */                    if (childAt.getId() == -1) {
/* 107 */                       AbstractC1245n0.m4889q("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                            } else {
/* 115 */                       m504c(childAt.getId());
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m506e() {
/* 1 */             ViewParent parent = getParent();
/* 5 */             if (parent == null || !(parent instanceof ConstraintLayout)) {
/* 16 */                return;
                    }
/* 13 */            m507f((ConstraintLayout) parent);
                }

                /* JADX INFO: renamed from: f */
                public final void m507f(ConstraintLayout constraintLayout) {
/* 1 */             int visibility = getVisibility();
/* 5 */             float elevation = getElevation();
/* 12 */            for (int i = 0; i < this.f1045b; i++) {
/* 18 */                View viewM513b = constraintLayout.m513b(this.f1044a[i]);
/* 22 */                if (viewM513b != null) {
/* 24 */                    viewM513b.setVisibility(visibility);
/* 30 */                    if (elevation > 0.0f) {
/* 37 */                        viewM513b.setTranslationZ(viewM513b.getTranslationZ() + elevation);
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public void mo460g(ConstraintLayout constraintLayout) {
                }

                public int[] getReferencedIds() {
/* 5 */             return Arrays.copyOf(this.f1044a, this.f1045b);
                }

                /* JADX INFO: renamed from: h */
                public final int m508h(ConstraintLayout constraintLayout, String str) {
                    Resources resources;
                    String resourceEntryName;
/* 2 */             if (str != null && (resources = this.f1046c.getResources()) != null) {
/* 13 */                int childCount = constraintLayout.getChildCount();
/* 18 */                for (int i = 0; i < childCount; i++) {
/* 20 */                    View childAt = constraintLayout.getChildAt(i);
/* 29 */                    if (childAt.getId() != -1) {
                                try {
/* 35 */                            resourceEntryName = resources.getResourceEntryName(childAt.getId());
                                } catch (Resources.NotFoundException unused) {
/* 40 */                            resourceEntryName = null;
                                }
/* 45 */                        if (str.equals(resourceEntryName)) {
/* 47 */                            return childAt.getId();
                                }
                            }
                        }
                    }
/* 1 */             return 0;
                }

                /* JADX WARN: Code duplicated, block: B:19:0x003a  */
                /* JADX INFO: renamed from: i */
                public final int m509i(String str) {
                    int iM508h;
                    HashMap map;
/* 1 */             Context context = this.f1046c;
/* 19 */            ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
/* 24 */            if (!isInEditMode() || constraintLayout == null) {
/* 59 */                iM508h = 0;
                    } else {
/* 47 */                Object obj = (str == null || (map = constraintLayout.f1057a0) == null || !map.containsKey(str)) ? null : constraintLayout.f1057a0.get(str);
/* 50 */                if (obj instanceof Integer) {
/* 54 */                    iM508h = ((Integer) obj).intValue();
                        } else {
/* 59 */                    iM508h = 0;
                        }
                    }
/* 60 */            if (iM508h == 0 && constraintLayout != null) {
/* 64 */                iM508h = m508h(constraintLayout, str);
                    }
/* 68 */            if (iM508h == 0) {
                        try {
/* 76 */                    iM508h = R$id.class.getField(str).getInt(null);
                        } catch (Exception unused) {
                        }
                    }
                    return iM508h == 0 ? context.getResources().getIdentifier(str, "id", context.getPackageName()) : iM508h;
                }

                /* JADX INFO: renamed from: j */
                public final View[] m510j(ConstraintLayout constraintLayout) {
/* 1 */             View[] viewArr = this.f1050i;
/* 3 */             if (viewArr == null || viewArr.length != this.f1045b) {
/* 14 */                this.f1050i = new View[this.f1045b];
                    }
/* 19 */            for (int i = 0; i < this.f1045b; i++) {
/* 31 */                this.f1050i[i] = constraintLayout.m513b(this.f1044a[i]);
                    }
/* 36 */            return this.f1050i;
                }

                /* JADX INFO: renamed from: k */
                public void mo454k(AttributeSet attributeSet) {
/* 1 */             if (attributeSet != null) {
/* 9 */                 TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
/* 13 */                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 18 */                for (int i = 0; i < indexCount; i++) {
/* 20 */                    int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 26 */                    if (index == R$styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
/* 28 */                        String string = typedArrayObtainStyledAttributes.getString(index);
/* 32 */                        this.f1048e = string;
/* 34 */                        setIds(string);
                            } else if (index == R$styleable.ConstraintLayout_Layout_constraint_referenced_tags) {
/* 42 */                        String string2 = typedArrayObtainStyledAttributes.getString(index);
/* 46 */                        this.f1049f = string2;
/* 48 */                        setReferenceTags(string2);
                            }
                        }
/* 54 */                typedArrayObtainStyledAttributes.recycle();
                    }
                }

                /* JADX INFO: renamed from: l */
                public void mo457l(C0076c c0076c, cu0 cu0Var, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
/* 1 */             C2274uz c2274uz = c0076c.f1180e;
/* 3 */             int[] iArr = c2274uz.f17790j0;
/* 6 */             int i = 0;
/* 7 */             if (iArr != null) {
/* 9 */                 setReferencedIds(iArr);
                    } else {
/* 13 */                String str = c2274uz.f17792k0;
/* 15 */                if (str != null) {
/* 21 */                    if (str.length() > 0) {
/* 27 */                        String[] strArrSplit = c2274uz.f17792k0.split(",");
/* 31 */                        getContext();
/* 35 */                        int[] iArrCopyOf = new int[strArrSplit.length];
/* 38 */                        int i2 = 0;
/* 40 */                        for (String str2 : strArrSplit) {
/* 48 */                            int iM509i = m509i(str2.trim());
/* 52 */                            if (iM509i != 0) {
/* 56 */                                iArrCopyOf[i2] = iM509i;
/* 54 */                                i2++;
                                    }
                                }
/* 63 */                        if (i2 != strArrSplit.length) {
/* 65 */                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                                }
/* 69 */                        c2274uz.f17790j0 = iArrCopyOf;
                            } else {
/* 72 */                        c2274uz.f17790j0 = null;
                            }
                        }
                    }
/* 74 */            cu0Var.f6907v0 = 0;
/* 78 */            Arrays.fill(cu0Var.f6906u0, (Object) null);
/* 83 */            if (c2274uz.f17790j0 == null) {
/* 106 */               return;
                    }
                    while (true) {
/* 85 */                int[] iArr2 = c2274uz.f17790j0;
/* 88 */                if (i >= iArr2.length) {
/* 106 */                   return;
                        }
/* 96 */                C2569zz c2569zz = (C2569zz) sparseArray.get(iArr2[i]);
/* 98 */                if (c2569zz != null) {
/* 100 */                   cu0Var.m2888S(c2569zz);
                        }
/* 103 */               i++;
                    }
                }

                /* JADX INFO: renamed from: m */
                public void mo458m(C2569zz c2569zz, boolean z) {
                }

                /* JADX INFO: renamed from: n */
                public void mo461n() {
                }

                /* JADX INFO: renamed from: o */
                public void mo462o(ConstraintLayout constraintLayout) {
                }

                @Override // android.view.View
                public void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             String str = this.f1048e;
/* 6 */             if (str != null) {
/* 8 */                 setIds(str);
                    }
/* 11 */            String str2 = this.f1049f;
/* 13 */            if (str2 != null) {
/* 15 */                setReferenceTags(str2);
                    }
                }

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
                }

                @Override // android.view.View
                public void onMeasure(int i, int i2) {
/* 2 */             setMeasuredDimension(0, 0);
                }

                /* JADX INFO: renamed from: p */
                public void mo468p(cu0 cu0Var, SparseArray sparseArray) {
/* 2 */             cu0Var.f6907v0 = 0;
/* 7 */             Arrays.fill(cu0Var.f6906u0, (Object) null);
/* 12 */            for (int i = 0; i < this.f1045b; i++) {
/* 24 */                cu0Var.m2888S((C2569zz) sparseArray.get(this.f1044a[i]));
                    }
                }

                /* JADX INFO: renamed from: q */
                public final void m511q() {
/* 3 */             if (this.f1047d == null) {
/* 20 */                return;
                    }
/* 6 */             ViewGroup.LayoutParams layoutParams = getLayoutParams();
/* 12 */            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
/* 18 */                ((ConstraintLayout.LayoutParams) layoutParams).f1129q0 = this.f1047d;
                    }
                }

                public void setIds(String str) {
/* 1 */             this.f1048e = str;
/* 3 */             if (str == null) {
/* 5 */                 return;
                    }
/* 6 */             int i = 0;
/* 7 */             this.f1045b = 0;
                    while (true) {
/* 11 */                int iIndexOf = str.indexOf(44, i);
/* 16 */                if (iIndexOf == -1) {
/* 22 */                    m503b(str.substring(i));
/* 25 */                    return;
                        } else {
/* 30 */                    m503b(str.substring(i, iIndexOf));
/* 33 */                    i = iIndexOf + 1;
                        }
                    }
                }

                public void setReferenceTags(String str) {
/* 1 */             this.f1049f = str;
/* 3 */             if (str == null) {
/* 5 */                 return;
                    }
/* 6 */             int i = 0;
/* 7 */             this.f1045b = 0;
                    while (true) {
/* 11 */                int iIndexOf = str.indexOf(44, i);
/* 16 */                if (iIndexOf == -1) {
/* 22 */                    m505d(str.substring(i));
/* 25 */                    return;
                        } else {
/* 30 */                    m505d(str.substring(i, iIndexOf));
/* 33 */                    i = iIndexOf + 1;
                        }
                    }
                }

                public void setReferencedIds(int[] iArr) {
/* 2 */             this.f1048e = null;
/* 5 */             this.f1045b = 0;
/* 8 */             for (int i : iArr) {
/* 12 */                m504c(i);
                    }
                }

                @Override // android.view.View
                public final void setTag(int i, Object obj) {
/* 1 */             super.setTag(i, obj);
/* 4 */             if (obj == null && this.f1048e == null) {
/* 10 */                m504c(i);
                    }
                }

/* 25 */        public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
/* 26 */            super(context, attributeSet, i);
/* 27 */            this.f1044a = new int[32];
/* 28 */            this.f1050i = null;
/* 29 */            this.f1051v = new HashMap();
/* 30 */            this.f1046c = context;
/* 31 */            mo454k(attributeSet);
                }
            }
