            package p000;

            import android.animation.TimeInterpolator;
            import android.animation.ValueAnimator;
            import android.view.View;
            import androidx.recyclerview.widget.AbstractC0137o;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class j60 extends n12 {

                /* JADX INFO: renamed from: s */
                public static TimeInterpolator f12082s;

                /* JADX INFO: renamed from: g */
                public boolean f12083g;

                /* JADX INFO: renamed from: h */
                public ArrayList f12084h;

                /* JADX INFO: renamed from: i */
                public ArrayList f12085i;

                /* JADX INFO: renamed from: j */
                public ArrayList f12086j;

                /* JADX INFO: renamed from: k */
                public ArrayList f12087k;

                /* JADX INFO: renamed from: l */
                public ArrayList f12088l;

                /* JADX INFO: renamed from: m */
                public ArrayList f12089m;

                /* JADX INFO: renamed from: n */
                public ArrayList f12090n;

                /* JADX INFO: renamed from: o */
                public ArrayList f12091o;

                /* JADX INFO: renamed from: p */
                public ArrayList f12092p;

                /* JADX INFO: renamed from: q */
                public ArrayList f12093q;

                /* JADX INFO: renamed from: r */
                public ArrayList f12094r;

                /* JADX INFO: renamed from: h */
                public static void m5712h(ArrayList arrayList) {
/* 7 */             for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 21 */                ((AbstractC0137o) arrayList.get(size)).f1778a.animate().cancel();
                    }
                }

                @Override // p000.n12
                /* JADX INFO: renamed from: a */
                public final boolean mo5713a(AbstractC0137o abstractC0137o, AbstractC0137o abstractC0137o2, m12 m12Var, m12 m12Var2) {
                    int i;
                    int i2;
/* 1 */             int i3 = m12Var.f13545a;
/* 3 */             int i4 = m12Var.f13546b;
/* 9 */             if (abstractC0137o2.m1031o()) {
/* 11 */                int i5 = m12Var.f13545a;
/* 13 */                i2 = m12Var.f13546b;
/* 16 */                i = i5;
                    } else {
/* 18 */                i = m12Var2.f13545a;
/* 20 */                i2 = m12Var2.f13546b;
                    }
/* 24 */            if (abstractC0137o == abstractC0137o2) {
/* 28 */                return m5717g(abstractC0137o, i3, i4, i, i2);
                    }
/* 35 */            View view = abstractC0137o.f1778a;
/* 37 */            float translationX = view.getTranslationX();
/* 41 */            float translationY = view.getTranslationY();
/* 45 */            float alpha = view.getAlpha();
/* 49 */            m5721l(abstractC0137o);
/* 62 */            view.setTranslationX(translationX);
/* 65 */            view.setTranslationY(translationY);
/* 68 */            view.setAlpha(alpha);
/* 71 */            View view2 = abstractC0137o2.f1778a;
/* 73 */            m5721l(abstractC0137o2);
/* 78 */            view2.setTranslationX(-((int) ((i - i3) - translationX)));
/* 83 */            view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
/* 87 */            view2.setAlpha(0.0f);
/* 90 */            ArrayList arrayList = this.f12087k;
/* 94 */            h60 h60Var = new h60();
/* 97 */            h60Var.f8912a = abstractC0137o;
/* 99 */            h60Var.f8913b = abstractC0137o2;
/* 101 */           h60Var.f8914c = i3;
/* 103 */           h60Var.f8915d = i4;
/* 105 */           h60Var.f8916e = i;
/* 107 */           h60Var.f8917f = i2;
/* 109 */           arrayList.add(h60Var);
/* 112 */           return true;
                }

                @Override // p000.n12
                /* JADX INFO: renamed from: d */
                public final void mo5714d(AbstractC0137o abstractC0137o) {
/* 1 */             ArrayList arrayList = this.f12088l;
/* 3 */             ArrayList arrayList2 = this.f12089m;
/* 5 */             ArrayList arrayList3 = this.f12090n;
/* 7 */             View view = abstractC0137o.f1778a;
/* 13 */            view.animate().cancel();
/* 16 */            ArrayList arrayList4 = this.f12086j;
/* 18 */            int size = arrayList4.size();
                    while (true) {
/* 22 */                size--;
/* 25 */                if (size < 0) {
                            break;
                        }
/* 35 */                if (((i60) arrayList4.get(size)).f9460a == abstractC0137o) {
/* 37 */                    view.setTranslationY(0.0f);
/* 40 */                    view.setTranslationX(0.0f);
/* 43 */                    m6851c(abstractC0137o);
/* 46 */                    arrayList4.remove(size);
                        }
                    }
/* 54 */            m5719j(this.f12087k, abstractC0137o);
/* 65 */            if (this.f12084h.remove(abstractC0137o)) {
/* 67 */                view.setAlpha(1.0f);
/* 70 */                m6851c(abstractC0137o);
                    }
/* 79 */            if (this.f12085i.remove(abstractC0137o)) {
/* 81 */                view.setAlpha(1.0f);
/* 84 */                m6851c(abstractC0137o);
                    }
/* 93 */            for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
/* 99 */                ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
/* 101 */               m5719j(arrayList5, abstractC0137o);
/* 108 */               if (arrayList5.isEmpty()) {
/* 110 */                   arrayList3.remove(size2);
                        }
                    }
/* 122 */           for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
/* 128 */               ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
/* 136 */               for (int size4 = arrayList6.size() - 1; size4 >= 0; size4--) {
/* 146 */                   if (((i60) arrayList6.get(size4)).f9460a == abstractC0137o) {
/* 148 */                       view.setTranslationY(0.0f);
/* 151 */                       view.setTranslationX(0.0f);
/* 154 */                       m6851c(abstractC0137o);
/* 157 */                       arrayList6.remove(size4);
/* 164 */                       if (!arrayList6.isEmpty()) {
                                    break;
                                }
/* 166 */                       arrayList2.remove(size3);
                                break;
                            }
                        }
                    }
/* 182 */           for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
/* 188 */               ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
/* 194 */               if (arrayList7.remove(abstractC0137o)) {
/* 196 */                   view.setAlpha(1.0f);
/* 199 */                   m6851c(abstractC0137o);
/* 206 */                   if (arrayList7.isEmpty()) {
/* 208 */                       arrayList.remove(size5);
                            }
                        }
                    }
/* 216 */           this.f12093q.remove(abstractC0137o);
/* 221 */           this.f12091o.remove(abstractC0137o);
/* 226 */           this.f12094r.remove(abstractC0137o);
/* 231 */           this.f12092p.remove(abstractC0137o);
/* 234 */           m5718i();
                }

                @Override // p000.n12
                /* JADX INFO: renamed from: e */
                public final void mo5715e() {
/* 1 */             ArrayList arrayList = this.f12087k;
/* 3 */             ArrayList arrayList2 = this.f12090n;
/* 5 */             ArrayList arrayList3 = this.f12088l;
/* 7 */             ArrayList arrayList4 = this.f12089m;
/* 9 */             ArrayList arrayList5 = this.f12085i;
/* 11 */            ArrayList arrayList6 = this.f12084h;
/* 13 */            ArrayList arrayList7 = this.f12086j;
/* 15 */            int size = arrayList7.size();
                    while (true) {
/* 19 */                size--;
/* 22 */                if (size < 0) {
                            break;
                        }
/* 28 */                i60 i60Var = (i60) arrayList7.get(size);
/* 32 */                View view = i60Var.f9460a.f1778a;
/* 34 */                view.setTranslationY(0.0f);
/* 37 */                view.setTranslationX(0.0f);
/* 42 */                m6851c(i60Var.f9460a);
/* 45 */                arrayList7.remove(size);
                    }
/* 57 */            for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
/* 65 */                m6851c((AbstractC0137o) arrayList6.get(size2));
/* 68 */                arrayList6.remove(size2);
                    }
/* 74 */            int size3 = arrayList5.size();
                    while (true) {
/* 78 */                size3--;
/* 82 */                if (size3 < 0) {
                            break;
                        }
/* 88 */                AbstractC0137o abstractC0137o = (AbstractC0137o) arrayList5.get(size3);
/* 92 */                abstractC0137o.f1778a.setAlpha(1.0f);
/* 95 */                m6851c(abstractC0137o);
/* 98 */                arrayList5.remove(size3);
                    }
/* 110 */           for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
/* 116 */               h60 h60Var = (h60) arrayList.get(size4);
/* 118 */               AbstractC0137o abstractC0137o2 = h60Var.f8912a;
/* 120 */               if (abstractC0137o2 != null) {
/* 122 */                   m5720k(h60Var, abstractC0137o2);
                        }
/* 125 */               AbstractC0137o abstractC0137o3 = h60Var.f8913b;
/* 127 */               if (abstractC0137o3 != null) {
/* 129 */                   m5720k(h60Var, abstractC0137o3);
                        }
                    }
/* 135 */           arrayList.clear();
/* 142 */           if (mo5716f()) {
/* 151 */               for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
/* 157 */                   ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
/* 165 */                   for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
/* 171 */                       i60 i60Var2 = (i60) arrayList8.get(size6);
/* 175 */                       View view2 = i60Var2.f9460a.f1778a;
/* 177 */                       view2.setTranslationY(0.0f);
/* 180 */                       view2.setTranslationX(0.0f);
/* 185 */                       m6851c(i60Var2.f9460a);
/* 188 */                       arrayList8.remove(size6);
/* 195 */                       if (arrayList8.isEmpty()) {
/* 197 */                           arrayList4.remove(arrayList8);
                                }
                            }
                        }
/* 212 */               for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
/* 218 */                   ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
/* 226 */                   for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
/* 232 */                       AbstractC0137o abstractC0137o4 = (AbstractC0137o) arrayList9.get(size8);
/* 236 */                       abstractC0137o4.f1778a.setAlpha(1.0f);
/* 239 */                       m6851c(abstractC0137o4);
/* 242 */                       arrayList9.remove(size8);
/* 249 */                       if (arrayList9.isEmpty()) {
/* 251 */                           arrayList3.remove(arrayList9);
                                }
                            }
                        }
/* 266 */               for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
/* 272 */                   ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
/* 280 */                   for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
/* 286 */                       h60 h60Var2 = (h60) arrayList10.get(size10);
/* 288 */                       AbstractC0137o abstractC0137o5 = h60Var2.f8912a;
/* 290 */                       if (abstractC0137o5 != null) {
/* 292 */                           m5720k(h60Var2, abstractC0137o5);
                                }
/* 295 */                       AbstractC0137o abstractC0137o6 = h60Var2.f8913b;
/* 297 */                       if (abstractC0137o6 != null) {
/* 299 */                           m5720k(h60Var2, abstractC0137o6);
                                }
/* 306 */                       if (arrayList10.isEmpty()) {
/* 308 */                           arrayList2.remove(arrayList10);
                                }
                            }
                        }
/* 319 */               m5712h(this.f12093q);
/* 324 */               m5712h(this.f12092p);
/* 329 */               m5712h(this.f12091o);
/* 334 */               m5712h(this.f12094r);
/* 337 */               ArrayList arrayList11 = this.f14095b;
/* 343 */               if (arrayList11.size() > 0) {
/* 354 */                   throw pm2.m7486i(0, arrayList11);
                        }
/* 345 */               arrayList11.clear();
                    }
                }

                @Override // p000.n12
                /* JADX INFO: renamed from: f */
                public final boolean mo5716f() {
                    return (this.f12085i.isEmpty() && this.f12087k.isEmpty() && this.f12086j.isEmpty() && this.f12084h.isEmpty() && this.f12092p.isEmpty() && this.f12093q.isEmpty() && this.f12091o.isEmpty() && this.f12094r.isEmpty() && this.f12089m.isEmpty() && this.f12088l.isEmpty() && this.f12090n.isEmpty()) ? false : true;
                }

                /* JADX INFO: renamed from: g */
                public final boolean m5717g(AbstractC0137o abstractC0137o, int i, int i2, int i3, int i4) {
/* 1 */             View view = abstractC0137o.f1778a;
/* 8 */             int translationX = i + ((int) view.getTranslationX());
/* 16 */            int translationY = i2 + ((int) abstractC0137o.f1778a.getTranslationY());
/* 17 */            m5721l(abstractC0137o);
/* 20 */            int i5 = i3 - translationX;
/* 22 */            int i6 = i4 - translationY;
/* 24 */            if (i5 == 0 && i6 == 0) {
/* 28 */                m6851c(abstractC0137o);
/* 31 */                return false;
                    }
/* 33 */            if (i5 != 0) {
/* 37 */                view.setTranslationX(-i5);
                    }
/* 40 */            if (i6 != 0) {
/* 44 */                view.setTranslationY(-i6);
                    }
/* 47 */            ArrayList arrayList = this.f12086j;
/* 51 */            i60 i60Var = new i60();
/* 54 */            i60Var.f9460a = abstractC0137o;
/* 56 */            i60Var.f9461b = translationX;
/* 58 */            i60Var.f9462c = translationY;
/* 60 */            i60Var.f9463d = i3;
/* 62 */            i60Var.f9464e = i4;
/* 64 */            arrayList.add(i60Var);
/* 67 */            return true;
                }

                /* JADX INFO: renamed from: i */
                public final void m5718i() {
/* 5 */             if (mo5716f()) {
/* 25 */                return;
                    }
/* 7 */             ArrayList arrayList = this.f14095b;
/* 13 */            if (arrayList.size() > 0) {
/* 24 */                throw pm2.m7486i(0, arrayList);
                    }
/* 15 */            arrayList.clear();
                }

                /* JADX INFO: renamed from: j */
                public final void m5719j(ArrayList arrayList, AbstractC0137o abstractC0137o) {
/* 7 */             for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 13 */                h60 h60Var = (h60) arrayList.get(size);
/* 19 */                if (m5720k(h60Var, abstractC0137o) && h60Var.f8912a == null && h60Var.f8913b == null) {
/* 29 */                    arrayList.remove(h60Var);
                        }
                    }
                }

                /* JADX INFO: renamed from: k */
                public final boolean m5720k(h60 h60Var, AbstractC0137o abstractC0137o) {
/* 4 */             if (h60Var.f8913b == abstractC0137o) {
/* 6 */                 h60Var.f8913b = null;
                    } else {
/* 11 */                if (h60Var.f8912a != abstractC0137o) {
/* 36 */                    return false;
                        }
/* 13 */                h60Var.f8912a = null;
                    }
/* 15 */            View view = abstractC0137o.f1778a;
/* 17 */            View view2 = abstractC0137o.f1778a;
/* 21 */            view.setAlpha(1.0f);
/* 25 */            view2.setTranslationX(0.0f);
/* 28 */            view2.setTranslationY(0.0f);
/* 31 */            m6851c(abstractC0137o);
/* 34 */            return true;
                }

                /* JADX INFO: renamed from: l */
                public final void m5721l(AbstractC0137o abstractC0137o) {
/* 3 */             if (f12082s == null) {
/* 14 */                f12082s = new ValueAnimator().getInterpolator();
                    }
/* 24 */            abstractC0137o.f1778a.animate().setInterpolator(f12082s);
/* 27 */            mo5714d(abstractC0137o);
                }
            }
