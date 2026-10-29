            package androidx.transition;

            import android.animation.Animator;
            import android.animation.TimeInterpolator;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.util.AttributeSet;
            import android.util.SparseArray;
            import android.util.SparseIntArray;
            import android.view.InflateException;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.animation.AnimationUtils;
            import android.widget.ListView;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.StringTokenizer;
            import java.util.WeakHashMap;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.C1024id;
            import p000.C1951n4;
            import p000.C2315w1;
            import p000.e33;
            import p000.fm0;
            import p000.gr2;
            import p000.hr2;
            import p000.ir2;
            import p000.k50;
            import p000.kb1;
            import p000.l53;
            import p000.mn0;
            import p000.n53;
            import p000.or2;
            import p000.py0;
            import p000.qg0;
            import p000.ra2;
            import p000.s23;
            import p000.ta1;
            import p000.u73;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 339 */   public abstract class Transition implements Cloneable {

                /* JADX INFO: renamed from: g0 */
                public static final int[] f1884g0 = {2, 1, 3, 4};

                /* JADX INFO: renamed from: h0 */
                public static final gr2 f1885h0 = new gr2();

                /* JADX INFO: renamed from: i0 */
                public static final ThreadLocal f1886i0 = new ThreadLocal();

                /* JADX INFO: renamed from: U */
                public final int[] f1887U;

                /* JADX INFO: renamed from: V */
                public ArrayList f1888V;

                /* JADX INFO: renamed from: W */
                public ArrayList f1889W;

                /* JADX INFO: renamed from: X */
                public final ArrayList f1890X;

                /* JADX INFO: renamed from: Y */
                public int f1891Y;

                /* JADX INFO: renamed from: Z */
                public boolean f1892Z;

                /* JADX INFO: renamed from: a */
                public final String f1893a;

                /* JADX INFO: renamed from: a0 */
                public boolean f1894a0;

                /* JADX INFO: renamed from: b */
                public long f1895b;

                /* JADX INFO: renamed from: b0 */
                public ArrayList f1896b0;

                /* JADX INFO: renamed from: c */
                public long f1897c;

                /* JADX INFO: renamed from: c0 */
                public ArrayList f1898c0;

                /* JADX INFO: renamed from: d */
                public TimeInterpolator f1899d;

                /* JADX INFO: renamed from: d0 */
                public kb1 f1900d0;

                /* JADX INFO: renamed from: e */
                public final ArrayList f1901e;

                /* JADX INFO: renamed from: e0 */
                public mn0 f1902e0;

                /* JADX INFO: renamed from: f */
                public final ArrayList f1903f;

                /* JADX INFO: renamed from: f0 */
                public PathMotion f1904f0;

                /* JADX INFO: renamed from: i */
                public ra2 f1905i;

                /* JADX INFO: renamed from: v */
                public ra2 f1906v;

                /* JADX INFO: renamed from: w */
                public TransitionSet f1907w;

                public Transition(Context context, AttributeSet attributeSet) {
/* 12 */            this.f1893a = getClass().getName();
/* 16 */            this.f1895b = -1L;
/* 18 */            this.f1897c = -1L;
/* 21 */            this.f1899d = null;
/* 28 */            this.f1901e = new ArrayList();
/* 35 */            this.f1903f = new ArrayList();
/* 44 */            this.f1905i = new ra2(22);
/* 51 */            this.f1906v = new ra2(22);
/* 53 */            this.f1907w = null;
/* 55 */            int[] iArr = f1884g0;
/* 57 */            this.f1887U = iArr;
/* 64 */            this.f1890X = new ArrayList();
/* 67 */            this.f1891Y = 0;
/* 69 */            this.f1892Z = false;
/* 71 */            this.f1894a0 = false;
/* 73 */            this.f1896b0 = null;
/* 80 */            this.f1898c0 = new ArrayList();
/* 84 */            this.f1904f0 = f1885h0;
/* 88 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k50.f12588c);
/* 92 */            XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
/* 106 */           long j = !k50.m5988y(xmlResourceParser, "duration") ? -1 : typedArrayObtainStyledAttributes.getInt(1, -1);
/* 115 */           if (j >= 0) {
/* 117 */               mo1108z(j);
                    }
/* 131 */           long j2 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startDelay") != null ? typedArrayObtainStyledAttributes.getInt(2, -1) : -1;
/* 138 */           if (j2 > 0) {
/* 140 */               mo1087E(j2);
                    }
/* 156 */           int resourceId = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? typedArrayObtainStyledAttributes.getResourceId(0, 0) : 0;
/* 157 */           if (resourceId > 0) {
/* 163 */               mo1084B(AnimationUtils.loadInterpolator(context, resourceId));
                    }
/* 177 */           String string = !k50.m5988y(xmlResourceParser, "matchOrder") ? null : typedArrayObtainStyledAttributes.getString(3);
/* 181 */           if (string != null) {
/* 187 */               StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
/* 194 */               int[] iArr2 = new int[stringTokenizer.countTokens()];
/* 196 */               int i = 0;
/* 202 */               while (stringTokenizer.hasMoreTokens()) {
/* 208 */                   String strTrim = stringTokenizer.nextToken().trim();
/* 218 */                   if ("id".equalsIgnoreCase(strTrim)) {
/* 220 */                       iArr2[i] = 3;
                            } else if ("instance".equalsIgnoreCase(strTrim)) {
/* 231 */                       iArr2[i] = 1;
                            } else if ("name".equalsIgnoreCase(strTrim)) {
/* 242 */                       iArr2[i] = 2;
                            } else if ("itemId".equalsIgnoreCase(strTrim)) {
/* 253 */                       iArr2[i] = 4;
                            } else {
/* 260 */                       if (!strTrim.isEmpty()) {
/* 287 */                           throw new InflateException(fm0.m3784j("Unknown match type in matchOrder: '", strTrim, "'"));
                                }
/* 264 */                       int[] iArr3 = new int[iArr2.length - 1];
/* 266 */                       System.arraycopy(iArr2, 0, iArr3, 0, i);
/* 269 */                       i--;
/* 271 */                       iArr2 = iArr3;
                            }
/* 272 */                   i++;
                        }
/* 289 */               if (iArr2.length == 0) {
/* 291 */                   this.f1887U = iArr;
                        } else {
/* 296 */                   for (int i2 = 0; i2 < iArr2.length; i2++) {
/* 298 */                       int i3 = iArr2[i2];
/* 300 */                       if (i3 < 1 || i3 > 4) {
/* 325 */                           C1951n4.m6859j("matches contains invalid value");
/* 328 */                           throw null;
                                }
/* 305 */                       for (int i4 = 0; i4 < i2; i4++) {
/* 309 */                           if (iArr2[i4] == i3) {
/* 316 */                               C1951n4.m6859j("matches contains a duplicate value");
/* 319 */                               throw null;
                                    }
                                }
                            }
/* 335 */                   this.f1887U = (int[]) iArr2.clone();
                        }
                    }
/* 337 */           typedArrayObtainStyledAttributes.recycle();
                }

                /* JADX INFO: renamed from: c */
                public static void m1080c(ra2 ra2Var, View view, or2 or2Var) {
/* 3 */             C1024id c1024id = (C1024id) ra2Var.f15955a;
/* 7 */             C1024id c1024id2 = (C1024id) ra2Var.f15958d;
/* 11 */            SparseArray sparseArray = (SparseArray) ra2Var.f15956b;
/* 15 */            ta1 ta1Var = (ta1) ra2Var.f15957c;
/* 17 */            c1024id.put(view, or2Var);
/* 20 */            int id = view.getId();
/* 25 */            if (id >= 0) {
/* 31 */                if (sparseArray.indexOfKey(id) >= 0) {
/* 33 */                    sparseArray.put(id, null);
                        } else {
/* 37 */                    sparseArray.put(id, view);
                        }
                    }
/* 40 */            WeakHashMap weakHashMap = e33.f7494a;
/* 42 */            String strM8373k = s23.m8373k(view);
/* 46 */            if (strM8373k != null) {
/* 52 */                if (c1024id2.containsKey(strM8373k)) {
/* 54 */                    c1024id2.put(strM8373k, null);
                        } else {
/* 58 */                    c1024id2.put(strM8373k, view);
                        }
                    }
/* 67 */            if (view.getParent() instanceof ListView) {
/* 73 */                ListView listView = (ListView) view.getParent();
/* 83 */                if (listView.getAdapter().hasStableIds()) {
/* 89 */                    long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
/* 95 */                    if (ta1Var.f17005a) {
/* 97 */                        ta1Var.m8753b();
                            }
/* 108 */                   if (py0.m7587J(ta1Var.f17006b, ta1Var.f17008d, itemIdAtPosition) < 0) {
/* 127 */                       view.setHasTransientState(true);
/* 130 */                       ta1Var.m8755d(view, itemIdAtPosition);
/* 133 */                       return;
                            }
/* 114 */                   View view2 = (View) ta1Var.m8754c(itemIdAtPosition);
/* 116 */                   if (view2 != null) {
/* 119 */                       view2.setHasTransientState(false);
/* 122 */                       ta1Var.m8755d(null, itemIdAtPosition);
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: o */
                public static C1024id m1081o() {
/* 1 */             ThreadLocal threadLocal = f1886i0;
/* 7 */             C1024id c1024id = (C1024id) threadLocal.get();
/* 9 */             if (c1024id != null) {
/* 19 */                return c1024id;
                    }
/* 13 */            C1024id c1024id2 = new C1024id();
/* 16 */            threadLocal.set(c1024id2);
/* 19 */            return c1024id2;
                }

                /* JADX INFO: renamed from: t */
                public static boolean m1082t(or2 or2Var, or2 or2Var2, String str) {
/* 3 */             Object obj = or2Var.f14872a.get(str);
/* 9 */             Object obj2 = or2Var2.f14872a.get(str);
/* 13 */            if (obj == null && obj2 == null) {
/* 17 */                return false;
                    }
/* 20 */            if (obj == null || obj2 == null) {
/* 19 */                return true;
                    }
/* 29 */            return !obj.equals(obj2);
                }

                /* JADX INFO: renamed from: A */
                public void mo1083A(mn0 mn0Var) {
/* 1 */             this.f1902e0 = mn0Var;
                }

                /* JADX INFO: renamed from: B */
                public void mo1084B(TimeInterpolator timeInterpolator) {
/* 1 */             this.f1899d = timeInterpolator;
                }

                /* JADX INFO: renamed from: C */
                public void mo1085C(PathMotion pathMotion) {
/* 1 */             if (pathMotion == null) {
/* 5 */                 this.f1904f0 = f1885h0;
                    } else {
/* 8 */                 this.f1904f0 = pathMotion;
                    }
                }

                /* JADX INFO: renamed from: D */
                public void mo1086D(kb1 kb1Var) {
/* 1 */             this.f1900d0 = kb1Var;
                }

                /* JADX INFO: renamed from: E */
                public void mo1087E(long j) {
/* 1 */             this.f1895b = j;
                }

                /* JADX INFO: renamed from: F */
                public final void m1088F() {
/* 3 */             if (this.f1891Y == 0) {
/* 5 */                 ArrayList arrayList = this.f1896b0;
/* 8 */                 if (arrayList != null && arrayList.size() > 0) {
/* 22 */                    ArrayList arrayList2 = (ArrayList) this.f1896b0.clone();
/* 24 */                    int size = arrayList2.size();
/* 29 */                    for (int i = 0; i < size; i++) {
/* 37 */                        ((ir2) arrayList2.get(i)).mo86a(this);
                            }
                        }
/* 43 */                this.f1894a0 = false;
                    }
/* 49 */            this.f1891Y++;
                }

                /* JADX INFO: renamed from: G */
                public String mo1089G(String str) {
/* 1 */             StringBuilder sbM3512p = AbstractC0886en.m3512p(str);
/* 13 */            sbM3512p.append(getClass().getSimpleName());
/* 18 */            sbM3512p.append("@");
/* 29 */            sbM3512p.append(Integer.toHexString(hashCode()));
/* 34 */            sbM3512p.append(": ");
/* 37 */            String string = sbM3512p.toString();
/* 49 */            if (this.f1897c != -1) {
/* 59 */                string = fm0.m3787m(fm0.m3794t(string, "dur("), this.f1897c, ") ");
                    }
/* 67 */            if (this.f1895b != -1) {
/* 77 */                string = fm0.m3787m(fm0.m3794t(string, "dly("), this.f1895b, ") ");
                    }
/* 83 */            if (this.f1899d != null) {
/* 87 */                StringBuilder sbM3794t = fm0.m3794t(string, "interp(");
/* 93 */                sbM3794t.append(this.f1899d);
/* 96 */                sbM3794t.append(") ");
/* 99 */                string = sbM3794t.toString();
                    }
/* 103 */           ArrayList arrayList = this.f1901e;
/* 105 */           int size = arrayList.size();
/* 109 */           ArrayList arrayList2 = this.f1903f;
/* 111 */           if (size <= 0 && arrayList2.size() <= 0) {
/* 120 */               return string;
                    }
/* 123 */           String strConcat = string.concat("tgts(");
/* 134 */           if (arrayList.size() > 0) {
/* 141 */               for (int i = 0; i < arrayList.size(); i++) {
/* 143 */                   if (i > 0) {
/* 145 */                       strConcat = strConcat.concat(", ");
                            }
/* 149 */                   StringBuilder sbM3512p2 = AbstractC0886en.m3512p(strConcat);
/* 157 */                   sbM3512p2.append(arrayList.get(i));
/* 160 */                   strConcat = sbM3512p2.toString();
                        }
                    }
/* 171 */           if (arrayList2.size() > 0) {
/* 177 */               for (int i2 = 0; i2 < arrayList2.size(); i2++) {
/* 179 */                   if (i2 > 0) {
/* 181 */                       strConcat = strConcat.concat(", ");
                            }
/* 185 */                   StringBuilder sbM3512p3 = AbstractC0886en.m3512p(strConcat);
/* 193 */                   sbM3512p3.append(arrayList2.get(i2));
/* 196 */                   strConcat = sbM3512p3.toString();
                        }
                    }
/* 205 */           return strConcat.concat(")");
                }

                /* JADX INFO: renamed from: a */
                public void m1090a(ir2 ir2Var) {
/* 3 */             if (this.f1896b0 == null) {
/* 10 */                this.f1896b0 = new ArrayList();
                    }
/* 14 */            this.f1896b0.add(ir2Var);
                }

                /* JADX INFO: renamed from: b */
                public void mo1091b(View view) {
/* 3 */             this.f1903f.add(view);
                }

                public void cancel() {
/* 1 */             ArrayList arrayList = this.f1890X;
/* 9 */             for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 17 */                ((Animator) arrayList.get(size)).cancel();
                    }
/* 23 */            ArrayList arrayList2 = this.f1896b0;
/* 25 */            if (arrayList2 == null || arrayList2.size() <= 0) {
/* 60 */                return;
                    }
/* 39 */            ArrayList arrayList3 = (ArrayList) this.f1896b0.clone();
/* 41 */            int size2 = arrayList3.size();
/* 46 */            for (int i = 0; i < size2; i++) {
/* 54 */                ((ir2) arrayList3.get(i)).mo89d(this);
                    }
                }

                /* JADX INFO: renamed from: d */
                public abstract void mo1065d(or2 or2Var);

                /* JADX INFO: renamed from: e */
                public final void m1092e(View view, boolean z) {
/* 1 */             if (view == null) {
/* 73 */                return;
                    }
/* 4 */             view.getId();
/* 13 */            if (view.getParent() instanceof ViewGroup) {
/* 17 */                or2 or2Var = new or2(view);
/* 20 */                if (z) {
/* 22 */                    mo1066g(or2Var);
                        } else {
/* 26 */                    mo1065d(or2Var);
                        }
/* 31 */                or2Var.f14874c.add(this);
/* 34 */                mo1093f(or2Var);
/* 37 */                if (z) {
/* 41 */                    m1080c(this.f1905i, view, or2Var);
                        } else {
/* 47 */                    m1080c(this.f1906v, view, or2Var);
                        }
                    }
/* 52 */            if (view instanceof ViewGroup) {
/* 54 */                ViewGroup viewGroup = (ViewGroup) view;
/* 61 */                for (int i = 0; i < viewGroup.getChildCount(); i++) {
/* 67 */                    m1092e(viewGroup.getChildAt(i), z);
                        }
                    }
                }

                /* JADX INFO: renamed from: f */
                public void mo1093f(or2 or2Var) {
/* 3 */             if (this.f1900d0 != null) {
/* 5 */                 HashMap map = or2Var.f14872a;
/* 11 */                if (map.isEmpty()) {
/* 120 */                   return;
                        }
/* 15 */                this.f1900d0.getClass();
/* 18 */                String[] strArr = kb1.f12672d;
/* 23 */                for (int i = 0; i < 2; i++) {
/* 31 */                    if (!map.containsKey(strArr[i])) {
/* 35 */                        this.f1900d0.getClass();
/* 38 */                        View view = or2Var.f14873b;
/* 46 */                        Integer numValueOf = (Integer) map.get("android:visibility:visibility");
/* 48 */                        if (numValueOf == null) {
/* 54 */                            numValueOf = Integer.valueOf(view.getVisibility());
                                }
/* 60 */                        map.put("android:visibilityPropagation:visibility", numValueOf);
/* 63 */                        int[] iArr = {iRound, 0};
/* 65 */                        view.getLocationOnScreen(iArr);
/* 78 */                        int iRound = Math.round(view.getTranslationX()) + iArr[0];
/* 87 */                        iArr[0] = (view.getWidth() / 2) + iRound;
/* 100 */                       int iRound2 = Math.round(view.getTranslationY()) + iArr[1];
/* 101 */                       iArr[1] = iRound2;
/* 109 */                       iArr[1] = (view.getHeight() / 2) + iRound2;
/* 113 */                       map.put("android:visibilityPropagation:center", iArr);
/* 116 */                       return;
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public abstract void mo1066g(or2 or2Var);

                /* JADX INFO: renamed from: h */
                public final void m1094h(ViewGroup viewGroup, boolean z) {
/* 1 */             m1095i(z);
/* 4 */             ArrayList arrayList = this.f1901e;
/* 6 */             int size = arrayList.size();
/* 10 */            ArrayList arrayList2 = this.f1903f;
/* 12 */            if (size <= 0 && arrayList2.size() <= 0) {
/* 21 */                m1092e(viewGroup, z);
/* 24 */                return;
                    }
/* 31 */            for (int i = 0; i < arrayList.size(); i++) {
/* 43 */                View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
/* 47 */                if (viewFindViewById != null) {
/* 51 */                    or2 or2Var = new or2(viewFindViewById);
/* 54 */                    if (z) {
/* 56 */                        mo1066g(or2Var);
                            } else {
/* 60 */                        mo1065d(or2Var);
                            }
/* 65 */                    or2Var.f14874c.add(this);
/* 68 */                    mo1093f(or2Var);
/* 71 */                    if (z) {
/* 75 */                        m1080c(this.f1905i, viewFindViewById, or2Var);
                            } else {
/* 81 */                        m1080c(this.f1906v, viewFindViewById, or2Var);
                            }
                        }
                    }
/* 91 */            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
/* 97 */                View view = (View) arrayList2.get(i2);
/* 101 */               or2 or2Var2 = new or2(view);
/* 104 */               if (z) {
/* 106 */                   mo1066g(or2Var2);
                        } else {
/* 110 */                   mo1065d(or2Var2);
                        }
/* 115 */               or2Var2.f14874c.add(this);
/* 118 */               mo1093f(or2Var2);
/* 121 */               if (z) {
/* 125 */                   m1080c(this.f1905i, view, or2Var2);
                        } else {
/* 131 */                   m1080c(this.f1906v, view, or2Var2);
                        }
                    }
                }

                /* JADX INFO: renamed from: i */
                public final void m1095i(boolean z) {
/* 1 */             if (z) {
/* 9 */                 ((C1024id) this.f1905i.f15955a).clear();
/* 18 */                ((SparseArray) this.f1905i.f15956b).clear();
/* 27 */                ((ta1) this.f1905i.f15957c).m8752a();
                    } else {
/* 37 */                ((C1024id) this.f1906v.f15955a).clear();
/* 46 */                ((SparseArray) this.f1906v.f15956b).clear();
/* 55 */                ((ta1) this.f1906v.f15957c).m8752a();
                    }
                }

                @Override // 
                /* JADX INFO: renamed from: j */
                public Transition clone() {
                    try {
/* 6 */                 Transition transition = (Transition) super.clone();
/* 13 */                transition.f1898c0 = new ArrayList();
/* 22 */                transition.f1905i = new ra2(22);
/* 29 */                transition.f1906v = new ra2(22);
/* 31 */                transition.f1888V = null;
/* 33 */                transition.f1889W = null;
/* 35 */                return transition;
                    } catch (CloneNotSupportedException unused) {
/* 1 */                 return null;
                    }
                }

                /* JADX INFO: renamed from: k */
                public Animator mo1067k(ViewGroup viewGroup, or2 or2Var, or2 or2Var2) {
/* 1 */             return null;
                }

                /* JADX INFO: renamed from: l */
                public void mo1097l(ViewGroup viewGroup, ra2 ra2Var, ra2 ra2Var2, ArrayList arrayList, ArrayList arrayList2) {
                    Animator animatorMo1067k;
                    int i;
                    View view;
                    or2 or2Var;
                    Animator animator;
                    or2 or2Var2;
/* 5 */             C1024id c1024idM1081o = m1081o();
/* 11 */            SparseIntArray sparseIntArray = new SparseIntArray();
/* 14 */            int size = arrayList.size();
/* 18 */            long jMin = Long.MAX_VALUE;
/* 23 */            int i2 = 0;
/* 24 */            while (i2 < size) {
/* 32 */                or2 or2Var3 = (or2) arrayList.get(i2);
/* 40 */                or2 or2Var4 = (or2) arrayList2.get(i2);
/* 42 */                if (or2Var3 != null && !or2Var3.f14874c.contains(this)) {
/* 52 */                    or2Var3 = null;
                        }
/* 53 */                if (or2Var4 != null && !or2Var4.f14874c.contains(this)) {
/* 63 */                    or2Var4 = null;
                        }
/* 64 */                if (!(or2Var3 == null && or2Var4 == null) && ((or2Var3 == null || or2Var4 == null || mo1101r(or2Var3, or2Var4)) && (animatorMo1067k = mo1067k(viewGroup, or2Var3, or2Var4)) != null)) {
/* 90 */                    String str = this.f1893a;
/* 92 */                    if (or2Var4 != null) {
/* 94 */                        view = or2Var4.f14873b;
/* 96 */                        String[] strArrMo1068p = mo1068p();
/* 102 */                       if (strArrMo1068p != null && strArrMo1068p.length > 0) {
/* 109 */                           or2Var2 = new or2(view);
/* 112 */                           i = i2;
/* 125 */                           or2 or2Var5 = (or2) ((C1024id) ra2Var2.f15955a).getOrDefault(view, null);
/* 127 */                           if (or2Var5 != null) {
/* 129 */                               int i3 = 0;
/* 131 */                               while (i3 < strArrMo1068p.length) {
/* 133 */                                   String str2 = strArrMo1068p[i3];
/* 147 */                                   or2Var2.f14872a.put(str2, or2Var5.f14872a.get(str2));
/* 150 */                                   i3++;
/* 152 */                                   or2Var5 = or2Var5;
                                        }
                                    }
/* 155 */                           int i4 = c1024idM1081o.f13213c;
/* 157 */                           int i5 = 0;
                                    while (true) {
/* 158 */                               if (i5 >= i4) {
/* 202 */                                   animator = animatorMo1067k;
                                            break;
                                        }
/* 171 */                               hr2 hr2Var = (hr2) c1024idM1081o.getOrDefault((Animator) c1024idM1081o.m6428h(i5), null);
/* 175 */                               if (hr2Var.f9214c != null && hr2Var.f9212a == view && hr2Var.f9213b.equals(str) && hr2Var.f9214c.equals(or2Var2)) {
/* 197 */                                   animator = null;
                                            break;
                                        }
/* 199 */                               i5++;
                                    }
                                } else {
/* 204 */                           i = i2;
/* 206 */                           animator = animatorMo1067k;
/* 207 */                           or2Var2 = null;
                                }
/* 208 */                       animatorMo1067k = animator;
/* 209 */                       or2Var = or2Var2;
                            } else {
/* 213 */                       i = i2;
/* 215 */                       view = or2Var3.f14873b;
/* 217 */                       or2Var = null;
                            }
/* 218 */                   if (animatorMo1067k != null) {
/* 220 */                       kb1 kb1Var = this.f1900d0;
/* 222 */                       if (kb1Var != null) {
/* 224 */                           long jMo6074H = kb1Var.mo6074H(viewGroup, this, or2Var3, or2Var4);
/* 235 */                           sparseIntArray.put(this.f1898c0.size(), (int) jMo6074H);
/* 238 */                           jMin = Math.min(jMo6074H, jMin);
                                }
/* 244 */                       n53 n53Var = l53.f13119a;
/* 248 */                       u73 u73Var = new u73(viewGroup);
/* 251 */                       hr2 hr2Var2 = new hr2();
/* 254 */                       hr2Var2.f9212a = view;
/* 256 */                       hr2Var2.f9213b = str;
/* 258 */                       hr2Var2.f9214c = or2Var;
/* 260 */                       hr2Var2.f9215d = u73Var;
/* 262 */                       hr2Var2.f9216e = this;
/* 264 */                       c1024idM1081o.put(animatorMo1067k, hr2Var2);
/* 269 */                       this.f1898c0.add(animatorMo1067k);
                            }
                        } else {
/* 68 */                    size = size;
/* 70 */                    i = i2;
                        }
/* 272 */               i2 = i + 1;
/* 274 */               size = size;
                    }
/* 282 */           if (sparseIntArray.size() != 0) {
/* 289 */               for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
/* 301 */                   Animator animator2 = (Animator) this.f1898c0.get(sparseIntArray.keyAt(i6));
/* 314 */                   animator2.setStartDelay(animator2.getStartDelay() + (((long) sparseIntArray.valueAt(i6)) - jMin));
                        }
                    }
                }

                /* JADX INFO: renamed from: m */
                public final void m1098m() {
/* 4 */             int i = this.f1891Y - 1;
/* 5 */             this.f1891Y = i;
/* 7 */             if (i == 0) {
/* 9 */                 ArrayList arrayList = this.f1896b0;
/* 12 */                if (arrayList != null && arrayList.size() > 0) {
/* 26 */                    ArrayList arrayList2 = (ArrayList) this.f1896b0.clone();
/* 28 */                    int size = arrayList2.size();
/* 33 */                    for (int i2 = 0; i2 < size; i2++) {
/* 41 */                        ((ir2) arrayList2.get(i2)).mo88c(this);
                            }
                        }
/* 58 */                for (int i3 = 0; i3 < ((ta1) this.f1905i.f15957c).m8756e(); i3++) {
/* 70 */                    View view = (View) ((ta1) this.f1905i.f15957c).m8757f(i3);
/* 72 */                    if (view != null) {
/* 74 */                        WeakHashMap weakHashMap = e33.f7494a;
/* 76 */                        view.setHasTransientState(false);
                            }
                        }
/* 93 */                for (int i4 = 0; i4 < ((ta1) this.f1906v.f15957c).m8756e(); i4++) {
/* 105 */                   View view2 = (View) ((ta1) this.f1906v.f15957c).m8757f(i4);
/* 107 */                   if (view2 != null) {
/* 109 */                       WeakHashMap weakHashMap2 = e33.f7494a;
/* 111 */                       view2.setHasTransientState(false);
                            }
                        }
/* 117 */               this.f1894a0 = true;
                    }
                }

                /* JADX INFO: renamed from: n */
                public final or2 m1099n(View view, boolean z) {
/* 1 */             TransitionSet transitionSet = this.f1907w;
/* 3 */             if (transitionSet != null) {
/* 5 */                 return transitionSet.m1099n(view, z);
                    }
/* 15 */            ArrayList arrayList = z ? this.f1888V : this.f1889W;
/* 17 */            if (arrayList == null) {
/* 61 */                return null;
                    }
/* 20 */            int size = arrayList.size();
/* 24 */            int i = 0;
                    while (true) {
/* 25 */                if (i >= size) {
/* 44 */                    i = -1;
                            break;
                        }
/* 31 */                or2 or2Var = (or2) arrayList.get(i);
/* 33 */                if (or2Var == null) {
/* 61 */                    return null;
                        }
/* 38 */                if (or2Var.f14873b == view) {
                            break;
                        }
/* 41 */                i++;
                    }
/* 45 */            if (i >= 0) {
/* 58 */                return (or2) (z ? this.f1889W : this.f1888V).get(i);
                    }
/* 61 */            return null;
                }

                /* JADX INFO: renamed from: p */
                public String[] mo1068p() {
/* 1 */             return null;
                }

                /* JADX INFO: renamed from: q */
                public final or2 m1100q(View view, boolean z) {
/* 1 */             TransitionSet transitionSet = this.f1907w;
/* 3 */             if (transitionSet != null) {
/* 5 */                 return transitionSet.m1100q(view, z);
                    }
/* 26 */            return (or2) ((C1024id) (z ? this.f1905i : this.f1906v).f15955a).getOrDefault(view, null);
                }

                /* JADX INFO: renamed from: r */
                public boolean mo1101r(or2 or2Var, or2 or2Var2) {
/* 2 */             if (or2Var != null && or2Var2 != null) {
/* 6 */                 String[] strArrMo1068p = mo1068p();
/* 10 */                if (strArrMo1068p != null) {
/* 14 */                    for (String str : strArrMo1068p) {
/* 22 */                        if (m1082t(or2Var, or2Var2, str)) {
/* 56 */                            return true;
                                }
                            }
                        } else {
/* 34 */                    Iterator it = or2Var.f14872a.keySet().iterator();
/* 42 */                    while (it.hasNext()) {
/* 54 */                        if (m1082t(or2Var, or2Var2, (String) it.next())) {
/* 56 */                            return true;
                                }
                            }
                        }
                    }
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: s */
                public final boolean m1102s(View view) {
/* 1 */             int id = view.getId();
/* 5 */             ArrayList arrayList = this.f1901e;
/* 7 */             int size = arrayList.size();
/* 11 */            ArrayList arrayList2 = this.f1903f;
                    return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
                }

                public final String toString() {
/* 3 */             return mo1089G(HttpUrl.FRAGMENT_ENCODE_SET);
                }

                /* JADX INFO: renamed from: u */
                public void mo1103u(View view) {
/* 3 */             if (this.f1894a0) {
/* 66 */                return;
                    }
/* 5 */             ArrayList arrayList = this.f1890X;
/* 13 */            for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 21 */                ((Animator) arrayList.get(size)).pause();
                    }
/* 27 */            ArrayList arrayList2 = this.f1896b0;
/* 29 */            if (arrayList2 != null && arrayList2.size() > 0) {
/* 43 */                ArrayList arrayList3 = (ArrayList) this.f1896b0.clone();
/* 45 */                int size2 = arrayList3.size();
/* 50 */                for (int i = 0; i < size2; i++) {
/* 58 */                    ((ir2) arrayList3.get(i)).mo87b(this);
                        }
                    }
/* 64 */            this.f1892Z = true;
                }

                /* JADX INFO: renamed from: v */
                public void m1104v(ir2 ir2Var) {
/* 1 */             ArrayList arrayList = this.f1896b0;
/* 3 */             if (arrayList == null) {
/* 20 */                return;
                    }
/* 6 */             arrayList.remove(ir2Var);
/* 15 */            if (this.f1896b0.size() == 0) {
/* 18 */                this.f1896b0 = null;
                    }
                }

                /* JADX INFO: renamed from: w */
                public void mo1105w(View view) {
/* 3 */             this.f1903f.remove(view);
                }

                /* JADX INFO: renamed from: x */
                public void mo1106x(View view) {
/* 3 */             if (this.f1892Z) {
/* 8 */                 if (!this.f1894a0) {
/* 10 */                    ArrayList arrayList = this.f1890X;
/* 18 */                    for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 26 */                        ((Animator) arrayList.get(size)).resume();
                            }
/* 32 */                    ArrayList arrayList2 = this.f1896b0;
/* 34 */                    if (arrayList2 != null && arrayList2.size() > 0) {
/* 48 */                        ArrayList arrayList3 = (ArrayList) this.f1896b0.clone();
/* 50 */                        int size2 = arrayList3.size();
/* 55 */                        for (int i = 0; i < size2; i++) {
/* 63 */                            ((ir2) arrayList3.get(i)).mo90e(this);
                                }
                            }
                        }
/* 69 */                this.f1892Z = false;
                    }
                }

                /* JADX INFO: renamed from: y */
                public void mo1107y() {
/* 1 */             m1088F();
/* 4 */             C1024id c1024idM1081o = m1081o();
/* 18 */            for (Animator animator : this.f1898c0) {
/* 30 */                if (c1024idM1081o.containsKey(animator)) {
/* 32 */                    m1088F();
/* 35 */                    if (animator != null) {
/* 42 */                        animator.addListener(new qg0(this, c1024idM1081o));
/* 45 */                        long j = this.f1897c;
/* 51 */                        if (j >= 0) {
/* 53 */                            animator.setDuration(j);
                                }
/* 56 */                        long j2 = this.f1895b;
/* 60 */                        if (j2 >= 0) {
/* 67 */                            animator.setStartDelay(animator.getStartDelay() + j2);
                                }
/* 70 */                        TimeInterpolator timeInterpolator = this.f1899d;
/* 72 */                        if (timeInterpolator != null) {
/* 74 */                            animator.setInterpolator(timeInterpolator);
                                }
/* 84 */                        animator.addListener(new C2315w1(this, 8));
/* 87 */                        animator.start();
                            }
                        }
                    }
/* 93 */            this.f1898c0.clear();
/* 96 */            m1098m();
                }

                /* JADX INFO: renamed from: z */
                public void mo1108z(long j) {
/* 1 */             this.f1897c = j;
                }

/* 340 */       public Transition() {
/* 342 */           this.f1893a = getClass().getName();
/* 343 */           this.f1895b = -1L;
/* 344 */           this.f1897c = -1L;
/* 345 */           this.f1899d = null;
/* 346 */           this.f1901e = new ArrayList();
/* 347 */           this.f1903f = new ArrayList();
/* 348 */           this.f1905i = new ra2(22);
/* 349 */           this.f1906v = new ra2(22);
/* 350 */           this.f1907w = null;
/* 351 */           this.f1887U = f1884g0;
/* 352 */           this.f1890X = new ArrayList();
/* 353 */           this.f1891Y = 0;
/* 354 */           this.f1892Z = false;
/* 355 */           this.f1894a0 = false;
/* 356 */           this.f1896b0 = null;
/* 357 */           this.f1898c0 = new ArrayList();
/* 358 */           this.f1904f0 = f1885h0;
                }
            }
