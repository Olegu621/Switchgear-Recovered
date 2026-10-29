            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.util.SparseArray;
            import android.util.SparseIntArray;
            import android.util.Xml;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.animation.AccelerateDecelerateInterpolator;
            import android.view.animation.AccelerateInterpolator;
            import android.view.animation.AnimationUtils;
            import android.view.animation.AnticipateInterpolator;
            import android.view.animation.BounceInterpolator;
            import android.view.animation.DecelerateInterpolator;
            import android.view.animation.Interpolator;
            import android.view.animation.OvershootInterpolator;
            import androidx.constraintlayout.motion.widget.MotionLayout;
            import androidx.constraintlayout.widget.Barrier;
            import androidx.constraintlayout.widget.C0076c;
            import androidx.constraintlayout.widget.C0077d;
            import androidx.constraintlayout.widget.ConstraintHelper;
            import androidx.constraintlayout.widget.ConstraintLayout;
            import androidx.constraintlayout.widget.R$id;
            import androidx.constraintlayout.widget.R$styleable;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import org.xmlpull.v1.XmlPullParserException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lk1 {

                /* JADX INFO: renamed from: a */
                public final MotionLayout f13341a;

                /* JADX INFO: renamed from: b */
                public final C1954n7 f13342b;

                /* JADX INFO: renamed from: c */
                public kk1 f13343c;

                /* JADX INFO: renamed from: d */
                public final ArrayList f13344d;

                /* JADX INFO: renamed from: e */
                public final kk1 f13345e;

                /* JADX INFO: renamed from: f */
                public final ArrayList f13346f;

                /* JADX INFO: renamed from: g */
                public final SparseArray f13347g;

                /* JADX INFO: renamed from: h */
                public final HashMap f13348h;

                /* JADX INFO: renamed from: i */
                public final SparseIntArray f13349i;

                /* JADX INFO: renamed from: j */
                public int f13350j;

                /* JADX INFO: renamed from: k */
                public int f13351k;

                /* JADX INFO: renamed from: l */
                public MotionEvent f13352l;

                /* JADX INFO: renamed from: m */
                public boolean f13353m;

                /* JADX INFO: renamed from: n */
                public boolean f13354n;

                /* JADX INFO: renamed from: o */
                public gr0 f13355o;

                /* JADX INFO: renamed from: p */
                public boolean f13356p;

                /* JADX INFO: renamed from: q */
                public final C0168b5 f13357q;

                /* JADX INFO: renamed from: r */
                public float f13358r;

                /* JADX INFO: renamed from: s */
                public float f13359s;

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                public lk1(Context context, MotionLayout motionLayout, int i) {
/* 5 */             this.f13342b = null;
/* 7 */             this.f13343c = null;
/* 11 */            ArrayList arrayList = new ArrayList();
/* 14 */            this.f13344d = arrayList;
/* 16 */            this.f13345e = null;
/* 23 */            this.f13346f = new ArrayList();
/* 30 */            this.f13347g = new SparseArray();
/* 37 */            this.f13348h = new HashMap();
/* 44 */            this.f13349i = new SparseIntArray();
/* 48 */            this.f13350j = 400;
/* 51 */            this.f13351k = 0;
/* 53 */            this.f13353m = false;
/* 55 */            this.f13354n = false;
/* 57 */            this.f13341a = motionLayout;
/* 64 */            this.f13357q = new C0168b5(motionLayout);
/* 70 */            XmlResourceParser xml = context.getResources().getXml(i);
                    try {
/* 78 */                kk1 kk1Var = null;
/* 80 */                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
/* 82 */                    if (eventType == 0) {
/* 365 */                       xml.getName();
                            } else if (eventType == 2) {
/* 89 */                        String name = xml.getName();
                                switch (name.hashCode()) {
                                    case -1349929691:
/* 359 */                               if (name.equals("ConstraintSet")) {
/* 361 */                                   m6474i(context, xml);
                                        }
                                        break;
                                    case -1239391468:
/* 338 */                               if (name.equals("KeyFrameSet")) {
/* 342 */                                   m31 m31Var = new m31(context, xml);
/* 345 */                                   if (kk1Var != null) {
/* 349 */                                       kk1Var.f12849k.add(m31Var);
                                            }
                                        }
                                        break;
                                    case -687739768:
/* 326 */                               if (name.equals("Include")) {
/* 328 */                                   m6476k(context, xml);
                                        }
                                        break;
                                    case 61998586:
/* 264 */                               if (name.equals("ViewTransition")) {
/* 268 */                                   e53 e53Var = new e53(context, xml);
/* 271 */                                   C0168b5 c0168b5 = this.f13357q;
/* 277 */                                   ((ArrayList) c0168b5.f2212c).add(e53Var);
/* 280 */                                   c0168b5.f2213d = null;
/* 282 */                                   int i2 = e53Var.f7527b;
/* 285 */                                   if (i2 == 4) {
/* 298 */                                       ConstraintLayout.getSharedValues().m7781a(e53Var.f7546u, new f53());
                                            } else if (i2 == 5) {
/* 316 */                                       ConstraintLayout.getSharedValues().m7781a(e53Var.f7546u, new f53());
                                            }
                                        }
                                        break;
                                    case 269306229:
/* 209 */                               if (name.equals("Transition")) {
/* 213 */                                   kk1Var = new kk1(this, context, xml);
/* 216 */                                   boolean z = kk1Var.f12840b;
/* 218 */                                   arrayList.add(kk1Var);
/* 223 */                                   if (this.f13343c == null && !z) {
/* 227 */                                       this.f13343c = kk1Var;
/* 229 */                                       mq2 mq2Var = kk1Var.f12850l;
/* 231 */                                       if (mq2Var != null) {
/* 235 */                                           mq2Var.m6788c(this.f13356p);
                                                }
                                            }
/* 238 */                                   if (z) {
/* 243 */                                       if (kk1Var.f12841c == -1) {
/* 245 */                                           this.f13345e = kk1Var;
                                                } else {
/* 250 */                                           this.f13346f.add(kk1Var);
                                                }
/* 253 */                                       arrayList.remove(kk1Var);
                                            }
                                        }
                                        break;
                                    case 312750793:
/* 187 */                               if (name.equals("OnClick") && kk1Var != null) {
/* 198 */                                   kk1Var.f12851m.add(new jk1(context, kk1Var, xml));
                                        }
                                        break;
                                    case 327855227:
/* 154 */                               if (name.equals("OnSwipe")) {
/* 156 */                                   if (kk1Var == null) {
/* 162 */                                       context.getResources().getResourceEntryName(i);
/* 165 */                                       xml.getLineNumber();
                                            }
/* 168 */                                   if (kk1Var != null) {
/* 177 */                                       kk1Var.f12850l = new mq2(context, this.f13341a, xml);
                                            }
                                        }
                                        break;
                                    case 793277014:
/* 141 */                               if (name.equals("MotionScene")) {
/* 143 */                                   m6477l(context, xml);
                                        }
                                        break;
                                    case 1382829617:
/* 124 */                               if (name.equals("StateSet")) {
/* 131 */                                   this.f13342b = new C1954n7(context, xml);
                                        }
                                        break;
                                    case 1942574248:
/* 108 */                               if (name.equals("include")) {
/* 328 */                                   m6476k(context, xml);
                                        }
                                        break;
                                }
                            }
                        }
                    } catch (IOException e) {
/* 374 */               e.printStackTrace();
                    } catch (XmlPullParserException e2) {
/* 378 */               e2.printStackTrace();
                    }
/* 390 */           this.f13347g.put(R$id.motion_base, new C0077d());
/* 403 */           this.f13348h.put("motion_base", Integer.valueOf(R$id.motion_base));
                }

                /* JADX INFO: renamed from: a */
                public final boolean m6466a(int i, MotionLayout motionLayout) {
                    kk1 kk1Var;
/* 3 */             if (this.f13355o != null) {
/* 150 */               return false;
                    }
/* 17 */            for (kk1 kk1Var2 : this.f13344d) {
/* 25 */                int i2 = kk1Var2.f12852n;
/* 27 */                if (i2 != 0 && ((kk1Var = this.f13343c) != kk1Var2 || (kk1Var.f12856r & 2) == 0)) {
/* 41 */                    int i3 = kk1Var2.f12842d;
/* 43 */                    hk1 hk1Var = hk1.f9122d;
/* 45 */                    hk1 hk1Var2 = hk1.f9121c;
/* 47 */                    hk1 hk1Var3 = hk1.f9120b;
/* 50 */                    if (i == i3 && (i2 == 4 || i2 == 2)) {
/* 57 */                        motionLayout.setState(hk1Var);
/* 60 */                        motionLayout.setTransition(kk1Var2);
/* 67 */                        if (kk1Var2.f12852n == 4) {
/* 69 */                            motionLayout.m473k(1.0f);
/* 73 */                            motionLayout.f913i1 = null;
/* 75 */                            motionLayout.setState(hk1Var3);
/* 78 */                            motionLayout.setState(hk1Var2);
/* 49 */                            return true;
                                }
/* 82 */                        motionLayout.setProgress(1.0f);
/* 85 */                        motionLayout.m475m(true);
/* 88 */                        motionLayout.setState(hk1Var3);
/* 91 */                        motionLayout.setState(hk1Var2);
/* 94 */                        motionLayout.setState(hk1Var);
/* 97 */                        motionLayout.m482t();
/* 49 */                        return true;
                            }
/* 103 */                   if (i == kk1Var2.f12841c && (i2 == 3 || i2 == 1)) {
/* 110 */                       motionLayout.setState(hk1Var);
/* 113 */                       motionLayout.setTransition(kk1Var2);
/* 119 */                       if (kk1Var2.f12852n == 3) {
/* 121 */                           motionLayout.m473k(0.0f);
/* 124 */                           motionLayout.setState(hk1Var3);
/* 127 */                           motionLayout.setState(hk1Var2);
/* 49 */                            return true;
                                }
/* 131 */                       motionLayout.setProgress(0.0f);
/* 134 */                       motionLayout.m475m(true);
/* 137 */                       motionLayout.setState(hk1Var3);
/* 140 */                       motionLayout.setState(hk1Var2);
/* 143 */                       motionLayout.setState(hk1Var);
/* 146 */                       motionLayout.m482t();
/* 49 */                        return true;
                            }
                        }
                    }
/* 150 */           return false;
                }

                /* JADX INFO: renamed from: b */
                public final C0077d m6467b(int i) {
                    int iM6909o;
/* 1 */             C1954n7 c1954n7 = this.f13342b;
/* 3 */             if (c1954n7 != null && (iM6909o = c1954n7.m6909o(i)) != -1) {
/* 12 */                i = iM6909o;
                    }
/* 13 */            SparseArray sparseArray = this.f13347g;
/* 19 */            if (sparseArray.get(i) != null) {
/* 71 */                return (C0077d) sparseArray.get(i);
                    }
/* 52 */            AbstractC1245n0.m4876d("MotionScene", "Warning could not find ConstraintSet id/" + de3.m3039u(this.f13341a.getContext(), i) + " In MotionScene");
/* 64 */            return (C0077d) sparseArray.get(sparseArray.keyAt(0));
                }

                /* JADX INFO: renamed from: c */
                public final int m6468c() {
/* 1 */             kk1 kk1Var = this.f13343c;
                    return kk1Var != null ? kk1Var.f12846h : this.f13350j;
                }

                /* JADX INFO: renamed from: d */
                public final int m6469d(Context context, String str) {
                    int identifier;
/* 9 */             if (str.contains("/")) {
/* 32 */                identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
                    } else {
/* 37 */                identifier = -1;
                    }
/* 38 */            if (identifier == -1) {
/* 44 */                if (str.length() > 1) {
/* 50 */                    return Integer.parseInt(str.substring(1));
                        }
/* 59 */                AbstractC1245n0.m4876d("MotionScene", "error in parsing id");
                    }
/* 62 */            return identifier;
                }

                /* JADX INFO: renamed from: e */
                public final Interpolator m6470e() {
/* 1 */             kk1 kk1Var = this.f13343c;
/* 3 */             int i = kk1Var.f12843e;
/* 6 */             if (i == -2) {
/* 88 */                return AnimationUtils.loadInterpolator(this.f13341a.getContext(), this.f13343c.f12845g);
                    }
/* 10 */            if (i == -1) {
/* 74 */                return new yj1(C2131r4.m8062c(kk1Var.f12844f), 1);
                    }
/* 12 */            if (i == 0) {
/* 62 */                return new AccelerateDecelerateInterpolator();
                    }
/* 14 */            if (i == 1) {
/* 56 */                return new AccelerateInterpolator();
                    }
/* 17 */            if (i == 2) {
/* 50 */                return new DecelerateInterpolator();
                    }
/* 20 */            if (i == 4) {
/* 44 */                return new BounceInterpolator();
                    }
/* 23 */            if (i == 5) {
/* 38 */                return new OvershootInterpolator();
                    }
/* 26 */            if (i != 6) {
/* 28 */                return null;
                    }
/* 32 */            return new AnticipateInterpolator();
                }

                /* JADX INFO: renamed from: f */
                public final void m6471f(zj1 zj1Var) {
/* 1 */             kk1 kk1Var = this.f13343c;
/* 3 */             if (kk1Var != null) {
/* 33 */                Iterator it = kk1Var.f12849k.iterator();
/* 41 */                while (it.hasNext()) {
/* 49 */                    ((m31) it.next()).m6594a(zj1Var);
                        }
                    } else {
/* 5 */                 kk1 kk1Var2 = this.f13345e;
/* 7 */                 if (kk1Var2 != null) {
/* 11 */                    Iterator it2 = kk1Var2.f12849k.iterator();
/* 19 */                    while (it2.hasNext()) {
/* 27 */                        ((m31) it2.next()).m6594a(zj1Var);
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public final float m6472g() {
                    mq2 mq2Var;
/* 1 */             kk1 kk1Var = this.f13343c;
/* 3 */             if (kk1Var == null || (mq2Var = kk1Var.f12850l) == null) {
/* 12 */                return 0.0f;
                    }
/* 9 */             return mq2Var.f13970t;
                }

                /* JADX INFO: renamed from: h */
                public final int m6473h() {
/* 1 */             kk1 kk1Var = this.f13343c;
/* 3 */             if (kk1Var == null) {
/* 5 */                 return -1;
                    }
/* 7 */             return kk1Var.f12842d;
                }

                /* JADX INFO: renamed from: i */
                public final int m6474i(Context context, XmlResourceParser xmlResourceParser) {
/* 3 */             C0077d c0077d = new C0077d();
/* 7 */             c0077d.f1191e = false;
/* 9 */             int attributeCount = xmlResourceParser.getAttributeCount();
/* 15 */            int iM6469d = -1;
/* 16 */            int iM6469d2 = -1;
/* 17 */            for (int i = 0; i < attributeCount; i++) {
/* 19 */                String attributeName = xmlResourceParser.getAttributeName(i);
/* 23 */                String attributeValue = xmlResourceParser.getAttributeValue(i);
/* 27 */                attributeName.getClass();
                        switch (attributeName) {
                            case "deriveConstraintsFrom":
/* 209 */                       iM6469d2 = m6469d(context, attributeValue);
                                break;
                            case "constraintRotate":
                                try {
/* 118 */                           c0077d.f1189c = Integer.parseInt(attributeValue);
                                    break;
                                } catch (NumberFormatException unused) {
/* 122 */                           attributeValue.getClass();
                                    switch (attributeValue) {
                                        case "x_left":
/* 206 */                                   c0077d.f1189c = 4;
                                            break;
                                        case "left":
/* 203 */                                   c0077d.f1189c = 2;
                                            break;
                                        case "none":
/* 200 */                                   c0077d.f1189c = 0;
                                            break;
                                        case "right":
/* 197 */                                   c0077d.f1189c = 1;
                                            break;
                                        case "x_right":
/* 194 */                                   c0077d.f1189c = 3;
                                            break;
                                    }
                                }
                                break;
                            case "id":
/* 78 */                        iM6469d = m6469d(context, attributeValue);
/* 84 */                        int iIndexOf = attributeValue.indexOf(47);
/* 88 */                        if (iIndexOf >= 0) {
/* 93 */                            attributeValue = attributeValue.substring(iIndexOf + 1);
                                }
/* 103 */                       this.f13348h.put(attributeValue, Integer.valueOf(iM6469d));
/* 110 */                       c0077d.f1187a = de3.m3039u(context, iM6469d);
                                break;
                        }
                    }
/* 217 */           if (iM6469d != -1) {
/* 221 */               int i2 = this.f13341a.f876A0;
/* 223 */               c0077d.m543k(context, xmlResourceParser);
/* 226 */               if (iM6469d2 != -1) {
/* 230 */                   this.f13349i.put(iM6469d, iM6469d2);
                        }
/* 235 */               this.f13347g.put(iM6469d, c0077d);
                    }
/* 238 */           return iM6469d;
                }

                /* JADX INFO: renamed from: j */
                public final int m6475j(Context context, int i) {
/* 5 */             XmlResourceParser xml = context.getResources().getXml(i);
                    try {
/* 14 */                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
/* 16 */                    String name = xml.getName();
/* 21 */                    if (2 == eventType && "ConstraintSet".equals(name)) {
/* 31 */                        return m6474i(context, xml);
                            }
                        }
/* 50 */                return -1;
                    } catch (IOException e) {
/* 42 */                e.printStackTrace();
/* 50 */                return -1;
                    } catch (XmlPullParserException e2) {
/* 47 */                e2.printStackTrace();
/* 50 */                return -1;
                    }
                }

                /* JADX INFO: renamed from: k */
                public final void m6476k(Context context, XmlResourceParser xmlResourceParser) {
/* 7 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.include);
/* 11 */            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 16 */            for (int i = 0; i < indexCount; i++) {
/* 18 */                int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 24 */                if (index == R$styleable.include_constraintSet) {
/* 31 */                    m6475j(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                        }
                    }
/* 37 */            typedArrayObtainStyledAttributes.recycle();
                }

                /* JADX INFO: renamed from: l */
                public final void m6477l(Context context, XmlResourceParser xmlResourceParser) {
/* 7 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.MotionScene);
/* 11 */            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 17 */            for (int i = 0; i < indexCount; i++) {
/* 19 */                int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 25 */                if (index == R$styleable.MotionScene_defaultDuration) {
/* 29 */                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f13350j);
/* 33 */                    this.f13350j = i2;
/* 37 */                    if (i2 < 8) {
/* 39 */                        this.f13350j = 8;
                            }
                        } else if (index == R$styleable.MotionScene_layoutDuringTransition) {
/* 50 */                    this.f13351k = typedArrayObtainStyledAttributes.getInteger(index, 0);
                        }
                    }
/* 55 */            typedArrayObtainStyledAttributes.recycle();
                }

                /* JADX INFO: renamed from: m */
                public final void m6478m(int i, MotionLayout motionLayout) {
/* 1 */             SparseArray sparseArray = this.f13347g;
/* 7 */             C0077d c0077d = (C0077d) sparseArray.get(i);
/* 9 */             String str = c0077d.f1187a;
/* 11 */            HashMap map = c0077d.f1192f;
/* 13 */            c0077d.f1188b = str;
/* 17 */            int i2 = this.f13349i.get(i);
/* 21 */            if (i2 > 0) {
/* 23 */                m6478m(i2, motionLayout);
/* 30 */                C0077d c0077d2 = (C0077d) sparseArray.get(i2);
/* 32 */                if (c0077d2 == null) {
/* 60 */                    AbstractC1245n0.m4876d("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + de3.m3039u(this.f13341a.getContext(), i2));
/* 63 */                    return;
                        }
/* 64 */                HashMap map2 = c0077d2.f1192f;
/* 86 */                c0077d.f1188b += "/" + c0077d2.f1188b;
/* 104 */               for (Integer num : map2.keySet()) {
/* 112 */                   num.getClass();
/* 119 */                   C0076c c0076c = (C0076c) map2.get(num);
/* 125 */                   if (!map.containsKey(num)) {
/* 132 */                       map.put(num, new C0076c());
                            }
/* 139 */                   C0076c c0076c2 = (C0076c) map.get(num);
/* 141 */                   if (c0076c2 != null) {
/* 144 */                       C2274uz c2274uz = c0076c2.f1180e;
/* 148 */                       if (!c2274uz.f17773b) {
/* 152 */                           c2274uz.m9148a(c0076c.f1180e);
                                }
/* 155 */                       C2349wz c2349wz = c0076c2.f1178c;
/* 159 */                       if (!c2349wz.f18870a) {
/* 161 */                           C2349wz c2349wz2 = c0076c.f1178c;
/* 165 */                           c2349wz.f18870a = c2349wz2.f18870a;
/* 169 */                           c2349wz.f18871b = c2349wz2.f18871b;
/* 173 */                           c2349wz.f18873d = c2349wz2.f18873d;
/* 177 */                           c2349wz.f18874e = c2349wz2.f18874e;
/* 181 */                           c2349wz.f18872c = c2349wz2.f18872c;
                                }
/* 183 */                       C2479xz c2479xz = c0076c2.f1181f;
/* 187 */                       if (!c2479xz.f19406a) {
/* 191 */                           c2479xz.m10047a(c0076c.f1181f);
                                }
/* 194 */                       C2312vz c2312vz = c0076c2.f1179d;
/* 198 */                       if (!c2312vz.f18389a) {
/* 202 */                           c2312vz.m9355a(c0076c.f1179d);
                                }
/* 219 */                       for (String str2 : c0076c.f1182g.keySet()) {
/* 233 */                           if (!c0076c2.f1182g.containsKey(str2)) {
/* 245 */                               c0076c2.f1182g.put(str2, (C2088pz) c0076c.f1182g.get(str2));
                                    }
                                }
                            }
                        }
                    } else {
/* 262 */               c0077d.f1188b = fm0.m3789o(new StringBuilder(), c0077d.f1188b, "  layout");
/* 264 */               int childCount = motionLayout.getChildCount();
/* 269 */               for (int i3 = 0; i3 < childCount; i3++) {
/* 271 */                   View childAt = motionLayout.getChildAt(i3);
/* 279 */                   ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
/* 281 */                   int id = childAt.getId();
/* 287 */                   if (c0077d.f1191e && id == -1) {
/* 295 */                       f42.m3663s("All children of ConstraintLayout must have ids to use ConstraintSet");
/* 298 */                       return;
                            }
/* 307 */                   if (!map.containsKey(Integer.valueOf(id))) {
/* 318 */                       map.put(Integer.valueOf(id), new C0076c());
                            }
/* 329 */                   C0076c c0076c3 = (C0076c) map.get(Integer.valueOf(id));
/* 331 */                   if (c0076c3 != null) {
/* 335 */                       C2349wz c2349wz3 = c0076c3.f1178c;
/* 337 */                       C2274uz c2274uz2 = c0076c3.f1180e;
/* 339 */                       C2479xz c2479xz2 = c0076c3.f1181f;
/* 344 */                       if (!c2274uz2.f17773b) {
/* 346 */                           c0076c3.m527c(id, layoutParams);
/* 351 */                           if (childAt instanceof ConstraintHelper) {
/* 360 */                               c2274uz2.f17790j0 = ((ConstraintHelper) childAt).getReferencedIds();
/* 364 */                               if (childAt instanceof Barrier) {
/* 367 */                                   Barrier barrier = (Barrier) childAt;
/* 373 */                                   c2274uz2.f17800o0 = barrier.getAllowsGoneWidget();
/* 379 */                                   c2274uz2.f17784g0 = barrier.getType();
/* 385 */                                   c2274uz2.f17786h0 = barrier.getMargin();
                                        }
                                    }
/* 387 */                           c2274uz2.f17773b = true;
                                }
/* 391 */                       if (!c2349wz3.f18870a) {
/* 397 */                           c2349wz3.f18871b = childAt.getVisibility();
/* 403 */                           c2349wz3.f18873d = childAt.getAlpha();
/* 405 */                           c2349wz3.f18870a = true;
                                }
/* 409 */                       if (!c2479xz2.f19406a) {
/* 411 */                           c2479xz2.f19406a = true;
/* 417 */                           c2479xz2.f19407b = childAt.getRotation();
/* 423 */                           c2479xz2.f19408c = childAt.getRotationX();
/* 429 */                           c2479xz2.f19409d = childAt.getRotationY();
/* 435 */                           c2479xz2.f19410e = childAt.getScaleX();
/* 441 */                           c2479xz2.f19411f = childAt.getScaleY();
/* 443 */                           float pivotX = childAt.getPivotX();
/* 447 */                           float pivotY = childAt.getPivotY();
/* 456 */                           if (pivotX != 0.0d || pivotY != 0.0d) {
/* 463 */                               c2479xz2.f19412g = pivotX;
/* 465 */                               c2479xz2.f19413h = pivotY;
                                    }
/* 471 */                           c2479xz2.f19415j = childAt.getTranslationX();
/* 477 */                           c2479xz2.f19416k = childAt.getTranslationY();
/* 483 */                           c2479xz2.f19417l = childAt.getTranslationZ();
/* 487 */                           if (c2479xz2.f19418m) {
/* 493 */                               c2479xz2.f19419n = childAt.getElevation();
                                    }
                                }
                            }
                        }
                    }
/* 511 */           for (C0076c c0076c4 : map.values()) {
/* 521 */               if (c0076c4.f1183h != null) {
/* 525 */                   if (c0076c4.f1177b != null) {
/* 531 */                       Iterator it = map.keySet().iterator();
/* 539 */                       while (it.hasNext()) {
/* 551 */                           C0076c c0076cM541i = c0077d.m541i(((Integer) it.next()).intValue());
/* 557 */                           String str3 = c0076cM541i.f1180e.f17794l0;
/* 559 */                           if (str3 != null && c0076c4.f1177b.matches(str3)) {
/* 571 */                               c0076c4.f1183h.m8930e(c0076cM541i);
/* 584 */                               c0076cM541i.f1182g.putAll((HashMap) c0076c4.f1182g.clone());
                                    }
                                }
                            } else {
/* 596 */                       c0076c4.f1183h.m8930e(c0077d.m541i(c0076c4.f1176a));
                            }
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:23:0x0031  */
                /* JADX WARN: Code duplicated, block: B:32:0x004b  */
                /* JADX WARN: Code duplicated, block: B:37:0x005f  */
                /* JADX WARN: Code duplicated, block: B:42:0x0076  */
                /* JADX WARN: Code duplicated, block: B:45:0x0051 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:53:0x0069 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:55:0x0059 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
                /* JADX INFO: renamed from: n */
                public final void m6479n(int i, int i2) {
                    int iM6909o;
                    int iM6909o2;
                    kk1 kk1Var;
                    ArrayList arrayList;
                    Iterator it;
                    kk1 kk1Var2;
                    kk1 kk1Var3;
                    kk1 kk1Var4;
                    int i3;
                    mq2 mq2Var;
/* 2 */             C1954n7 c1954n7 = this.f13342b;
/* 4 */             if (c1954n7 != null) {
/* 6 */                 iM6909o = c1954n7.m6909o(i);
/* 10 */                if (iM6909o == -1) {
/* 13 */                    iM6909o = i;
                        }
/* 14 */                iM6909o2 = c1954n7.m6909o(i2);
/* 18 */                if (iM6909o2 == -1) {
                        }
/* 25 */                kk1Var = this.f13343c;
/* 27 */                if (kk1Var == null && kk1Var.f12841c == i2 && kk1Var.f12842d == i) {
/* 81 */                    return;
                        }
/* 38 */                arrayList = this.f13344d;
/* 40 */                it = arrayList.iterator();
                        while (true) {
/* 48 */                    if (it.hasNext()) {
/* 88 */                        kk1Var2 = this.f13345e;
/* 94 */                        for (kk1 kk1Var5 : this.f13346f) {
/* 104 */                           if (kk1Var5.f12841c == i2) {
/* 106 */                               kk1Var2 = kk1Var5;
                                    }
                                }
/* 110 */                       kk1Var3 = new kk1(this, kk1Var2);
/* 113 */                       kk1Var3.f12842d = iM6909o;
/* 115 */                       kk1Var3.f12841c = iM6909o2;
/* 117 */                       if (iM6909o != -1) {
/* 119 */                           arrayList.add(kk1Var3);
                                }
/* 122 */                       this.f13343c = kk1Var3;
/* 124 */                       return;
                            }
/* 54 */                    kk1Var4 = (kk1) it.next();
/* 56 */                    i3 = kk1Var4.f12841c;
/* 58 */                    if ((i3 != iM6909o2 && kk1Var4.f12842d == iM6909o) || (i3 == i2 && kk1Var4.f12842d == i)) {
                                break;
                            }
                        }
/* 70 */                this.f13343c = kk1Var4;
/* 72 */                mq2Var = kk1Var4.f12850l;
/* 74 */                if (mq2Var != null) {
/* 78 */                    mq2Var.m6788c(this.f13356p);
                        }
                    }
/* 23 */            iM6909o = i;
/* 21 */            iM6909o2 = i2;
/* 25 */            kk1Var = this.f13343c;
/* 27 */            if (kk1Var == null) {
                    }
/* 38 */            arrayList = this.f13344d;
/* 40 */            it = arrayList.iterator();
                    while (true) {
/* 48 */                if (it.hasNext()) {
/* 88 */                    kk1Var2 = this.f13345e;
/* 94 */                    while (r9.hasNext()) {
/* 104 */                       if (kk1Var5.f12841c == i2) {
/* 106 */                           kk1Var2 = kk1Var5;
                                }
                            }
/* 110 */                   kk1Var3 = new kk1(this, kk1Var2);
/* 113 */                   kk1Var3.f12842d = iM6909o;
/* 115 */                   kk1Var3.f12841c = iM6909o2;
/* 117 */                   if (iM6909o != -1) {
/* 119 */                       arrayList.add(kk1Var3);
                            }
/* 122 */                   this.f13343c = kk1Var3;
/* 124 */                   return;
                        }
/* 54 */                kk1Var4 = (kk1) it.next();
/* 56 */                i3 = kk1Var4.f12841c;
/* 58 */                if (i3 != iM6909o2) {
                        }
                    }
/* 70 */            this.f13343c = kk1Var4;
/* 72 */            mq2Var = kk1Var4.f12850l;
/* 74 */            if (mq2Var != null) {
/* 78 */                mq2Var.m6788c(this.f13356p);
                    }
                }

                /* JADX INFO: renamed from: o */
                public final boolean m6480o() {
/* 3 */             Iterator it = this.f13344d.iterator();
/* 12 */            while (it.hasNext()) {
/* 22 */                if (((kk1) it.next()).f12850l != null) {
/* 11 */                    return true;
                        }
                    }
/* 25 */            kk1 kk1Var = this.f13343c;
                    return (kk1Var == null || kk1Var.f12850l == null) ? false : true;
                }
            }
