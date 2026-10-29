            package androidx.transition;

            import android.animation.TimeInterpolator;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.util.AndroidRuntimeException;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import java.util.ArrayList;
            import java.util.Iterator;
            import p000.fm0;
            import p000.k50;
            import p000.kb1;
            import p000.mn0;
            import p000.or2;
            import p000.ra2;
            import p000.tg0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 45 */    public class TransitionSet extends Transition {

                /* JADX INFO: renamed from: j0 */
                public ArrayList f1908j0;

                /* JADX INFO: renamed from: k0 */
                public boolean f1909k0;

                /* JADX INFO: renamed from: l0 */
                public int f1910l0;

                /* JADX INFO: renamed from: m0 */
                public boolean f1911m0;

                /* JADX INFO: renamed from: n0 */
                public int f1912n0;

                public TransitionSet(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 9 */             this.f1908j0 = new ArrayList();
/* 12 */            this.f1909k0 = true;
/* 15 */            this.f1911m0 = false;
/* 17 */            this.f1912n0 = 0;
/* 21 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k50.f12594i);
/* 40 */            m1112K(k50.m5988y((XmlResourceParser) attributeSet, "transitionOrdering") ? typedArrayObtainStyledAttributes.getInt(0, 0) : 0);
/* 43 */            typedArrayObtainStyledAttributes.recycle();
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: A */
                public final void mo1083A(mn0 mn0Var) {
/* 1 */             this.f1902e0 = mn0Var;
/* 7 */             this.f1912n0 |= 8;
/* 11 */            int size = this.f1908j0.size();
/* 16 */            for (int i = 0; i < size; i++) {
/* 26 */                ((Transition) this.f1908j0.get(i)).mo1083A(mn0Var);
                    }
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: C */
                public final void mo1085C(PathMotion pathMotion) {
/* 1 */             super.mo1085C(pathMotion);
/* 8 */             this.f1912n0 |= 4;
/* 12 */            if (this.f1908j0 != null) {
/* 21 */                for (int i = 0; i < this.f1908j0.size(); i++) {
/* 31 */                    ((Transition) this.f1908j0.get(i)).mo1085C(pathMotion);
                        }
                    }
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: D */
                public final void mo1086D(kb1 kb1Var) {
/* 1 */             this.f1900d0 = kb1Var;
/* 7 */             this.f1912n0 |= 2;
/* 11 */            int size = this.f1908j0.size();
/* 16 */            for (int i = 0; i < size; i++) {
/* 26 */                ((Transition) this.f1908j0.get(i)).mo1086D(kb1Var);
                    }
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: E */
                public final void mo1087E(long j) {
/* 1 */             this.f1895b = j;
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: G */
                public final String mo1089G(String str) {
/* 1 */             String strMo1089G = super.mo1089G(str);
/* 12 */            for (int i = 0; i < this.f1908j0.size(); i++) {
/* 16 */                StringBuilder sbM3794t = fm0.m3794t(strMo1089G, "\n");
/* 38 */                sbM3794t.append(((Transition) this.f1908j0.get(i)).mo1089G(str.concat("  ")));
/* 41 */                strMo1089G = sbM3794t.toString();
                    }
/* 48 */            return strMo1089G;
                }

                /* JADX INFO: renamed from: H */
                public final void m1109H(Transition transition) {
/* 3 */             this.f1908j0.add(transition);
/* 6 */             transition.f1907w = this;
/* 8 */             long j = this.f1897c;
/* 14 */            if (j >= 0) {
/* 16 */                transition.mo1108z(j);
                    }
/* 23 */            if ((this.f1912n0 & 1) != 0) {
/* 27 */                transition.mo1084B(this.f1899d);
                    }
/* 34 */            if ((this.f1912n0 & 2) != 0) {
/* 38 */                transition.mo1086D(this.f1900d0);
                    }
/* 45 */            if ((this.f1912n0 & 4) != 0) {
/* 49 */                transition.mo1085C(this.f1904f0);
                    }
/* 56 */            if ((this.f1912n0 & 8) != 0) {
/* 60 */                transition.mo1083A(this.f1902e0);
                    }
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
                public final void mo1108z(long j) {
                    ArrayList arrayList;
/* 1 */             this.f1897c = j;
/* 7 */             if (j < 0 || (arrayList = this.f1908j0) == null) {
/* 34 */                return;
                    }
/* 13 */            int size = arrayList.size();
/* 18 */            for (int i = 0; i < size; i++) {
/* 28 */                ((Transition) this.f1908j0.get(i)).mo1108z(j);
                    }
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
                public final void mo1084B(TimeInterpolator timeInterpolator) {
/* 5 */             this.f1912n0 |= 1;
/* 7 */             ArrayList arrayList = this.f1908j0;
/* 9 */             if (arrayList != null) {
/* 11 */                int size = arrayList.size();
/* 16 */                for (int i = 0; i < size; i++) {
/* 26 */                    ((Transition) this.f1908j0.get(i)).mo1084B(timeInterpolator);
                        }
                    }
/* 32 */            this.f1899d = timeInterpolator;
                }

                /* JADX INFO: renamed from: K */
                public final void m1112K(int i) {
/* 2 */             if (i == 0) {
/* 22 */                this.f1909k0 = true;
                    } else {
/* 4 */                 if (i != 1) {
/* 21 */                    throw new AndroidRuntimeException(fm0.m3781g(i, "Invalid parameter for TransitionSet ordering: "));
                        }
/* 7 */                 this.f1909k0 = false;
                    }
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: b */
                public final void mo1091b(View view) {
/* 8 */             for (int i = 0; i < this.f1908j0.size(); i++) {
/* 18 */                ((Transition) this.f1908j0.get(i)).mo1091b(view);
                    }
/* 26 */            this.f1903f.add(view);
                }

                @Override // androidx.transition.Transition
                public final void cancel() {
/* 1 */             super.cancel();
/* 6 */             int size = this.f1908j0.size();
/* 11 */            for (int i = 0; i < size; i++) {
/* 21 */                ((Transition) this.f1908j0.get(i)).cancel();
                    }
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: d */
                public final void mo1065d(or2 or2Var) {
/* 1 */             View view = or2Var.f14873b;
/* 7 */             if (m1102s(view)) {
/* 19 */                for (Transition transition : this.f1908j0) {
/* 31 */                    if (transition.m1102s(view)) {
/* 33 */                        transition.mo1065d(or2Var);
/* 38 */                        or2Var.f14874c.add(transition);
                            }
                        }
                    }
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: f */
                public final void mo1093f(or2 or2Var) {
/* 1 */             super.mo1093f(or2Var);
/* 6 */             int size = this.f1908j0.size();
/* 11 */            for (int i = 0; i < size; i++) {
/* 21 */                ((Transition) this.f1908j0.get(i)).mo1093f(or2Var);
                    }
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: g */
                public final void mo1066g(or2 or2Var) {
/* 1 */             View view = or2Var.f14873b;
/* 7 */             if (m1102s(view)) {
/* 19 */                for (Transition transition : this.f1908j0) {
/* 31 */                    if (transition.m1102s(view)) {
/* 33 */                        transition.mo1066g(or2Var);
/* 38 */                        or2Var.f14874c.add(transition);
                            }
                        }
                    }
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
                public final Transition clone() {
/* 5 */             TransitionSet transitionSet = (TransitionSet) super.clone();
/* 12 */            transitionSet.f1908j0 = new ArrayList();
/* 16 */            int size = this.f1908j0.size();
/* 21 */            for (int i = 0; i < size; i++) {
/* 31 */                Transition transitionClone = ((Transition) this.f1908j0.get(i)).clone();
/* 37 */                transitionSet.f1908j0.add(transitionClone);
/* 40 */                transitionClone.f1907w = transitionSet;
                    }
/* 45 */            return transitionSet;
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: l */
                public final void mo1097l(ViewGroup viewGroup, ra2 ra2Var, ra2 ra2Var2, ArrayList arrayList, ArrayList arrayList2) {
/* 1 */             long j = this.f1895b;
/* 5 */             int size = this.f1908j0.size();
/* 10 */            for (int i = 0; i < size; i++) {
/* 19 */                Transition transition = (Transition) this.f1908j0.get(i);
/* 25 */                if (j > 0 && (this.f1909k0 || i == 0)) {
/* 41 */                    long j2 = transition.f1895b;
/* 45 */                    if (j2 > 0) {
/* 48 */                        transition.mo1087E(j2 + j);
                            } else {
/* 52 */                        transition.mo1087E(j);
                            }
                        }
/* 56 */                transition.mo1097l(viewGroup, ra2Var, ra2Var2, arrayList, arrayList2);
                    }
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: u */
                public final void mo1103u(View view) {
/* 1 */             super.mo1103u(view);
/* 6 */             int size = this.f1908j0.size();
/* 11 */            for (int i = 0; i < size; i++) {
/* 21 */                ((Transition) this.f1908j0.get(i)).mo1103u(view);
                    }
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: w */
                public final void mo1105w(View view) {
/* 8 */             for (int i = 0; i < this.f1908j0.size(); i++) {
/* 18 */                ((Transition) this.f1908j0.get(i)).mo1105w(view);
                    }
/* 26 */            this.f1903f.remove(view);
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: x */
                public final void mo1106x(View view) {
/* 1 */             super.mo1106x(view);
/* 6 */             int size = this.f1908j0.size();
/* 11 */            for (int i = 0; i < size; i++) {
/* 21 */                ((Transition) this.f1908j0.get(i)).mo1106x(view);
                    }
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: y */
                public final void mo1107y() {
                    ArrayList arrayList;
/* 7 */             if (this.f1908j0.isEmpty()) {
/* 9 */                 m1088F();
/* 12 */                m1098m();
/* 15 */                return;
                    }
/* 18 */            tg0 tg0Var = new tg0();
/* 21 */            tg0Var.f17086b = this;
/* 25 */            Iterator it = this.f1908j0.iterator();
/* 33 */            while (it.hasNext()) {
/* 41 */                ((Transition) it.next()).m1090a(tg0Var);
                    }
/* 51 */            this.f1910l0 = this.f1908j0.size();
/* 55 */            if (this.f1909k0) {
/* 111 */               Iterator it2 = this.f1908j0.iterator();
/* 119 */               while (it2.hasNext()) {
/* 127 */                   ((Transition) it2.next()).mo1107y();
                        }
/* 131 */               return;
                    }
/* 57 */            int i = 1;
/* 58 */            int i2 = 1;
                    while (true) {
/* 61 */                int size = this.f1908j0.size();
/* 65 */                arrayList = this.f1908j0;
/* 67 */                if (i2 >= size) {
                            break;
                        }
/* 90 */                ((Transition) arrayList.get(i2 - 1)).m1090a(new tg0((Transition) this.f1908j0.get(i2), i));
/* 93 */                i2++;
                    }
/* 101 */           Transition transition = (Transition) arrayList.get(0);
/* 103 */           if (transition != null) {
/* 105 */               transition.mo1107y();
                    }
                }

/* 46 */        public TransitionSet() {
/* 48 */            this.f1908j0 = new ArrayList();
/* 49 */            this.f1909k0 = true;
/* 50 */            this.f1911m0 = false;
/* 51 */            this.f1912n0 = 0;
                }
            }
