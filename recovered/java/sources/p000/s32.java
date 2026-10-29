            package p000;

            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.util.Rational;
            import android.util.Size;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class s32 {

                /* JADX INFO: renamed from: h */
                public static final double f16406h = Math.sqrt(2.3703703703703702d);

                /* JADX INFO: renamed from: a */
                public final Size f16407a;

                /* JADX INFO: renamed from: b */
                public final Rational f16408b;

                /* JADX INFO: renamed from: c */
                public final Rational f16409c;

                /* JADX INFO: renamed from: d */
                public final HashSet f16410d;

                /* JADX INFO: renamed from: e */
                public final ac1 f16411e;

                /* JADX INFO: renamed from: f */
                public final InterfaceC2469xp f16412f;

                /* JADX INFO: renamed from: g */
                public final HashMap f16413g;

                public s32(InterfaceC2559zp interfaceC2559zp, HashSet hashSet) {
/* 9 */             Size sizeM2874d = cr2.m2874d(interfaceC2559zp.mo8068e().mo5849b());
/* 13 */            InterfaceC2469xp interfaceC2469xpMo8073m = interfaceC2559zp.mo8073m();
/* 19 */            ac1 ac1Var = new ac1(interfaceC2469xpMo8073m, sizeM2874d);
/* 30 */            this.f16413g = new HashMap();
/* 32 */            this.f16407a = sizeM2874d;
/* 54 */            Rational rational = ((double) sizeM2874d.getWidth()) / ((double) sizeM2874d.getHeight()) > f16406h ? AbstractC2177sd.f16537c : AbstractC2177sd.f16535a;
/* 56 */            sizeM2874d.toString();
/* 59 */            Objects.toString(rational);
/* 64 */            hu0.m4312F0("ResolutionsMerger");
/* 67 */            this.f16408b = rational;
/* 69 */            Rational rational2 = AbstractC2177sd.f16535a;
/* 75 */            if (rational.equals(rational2)) {
/* 77 */                rational2 = AbstractC2177sd.f16537c;
                    } else if (!rational.equals(AbstractC2177sd.f16537c)) {
/* 99 */                s80.m8430k(rational, "Invalid sensor aspect-ratio: ");
/* 103 */               throw null;
                    }
/* 88 */            this.f16409c = rational2;
/* 90 */            this.f16412f = interfaceC2469xpMo8073m;
/* 92 */            this.f16410d = hashSet;
/* 94 */            this.f16411e = ac1Var;
                }

                /* JADX INFO: renamed from: a */
                public static Rect m8391a(Size size, Size size2) {
                    RectF rectF;
                    RectF rectF2;
/* 1 */             Rational rationalM8393g = m8393g(size2);
/* 5 */             int width = size.getWidth();
/* 9 */             int height = size.getHeight();
/* 13 */            Rational rationalM8393g2 = m8393g(size);
/* 28 */            if (rationalM8393g.floatValue() == rationalM8393g2.floatValue()) {
/* 34 */                rectF2 = new RectF(0.0f, 0.0f, width, height);
                    } else {
/* 50 */                if (rationalM8393g.floatValue() > rationalM8393g2.floatValue()) {
                            float f = width;
/* 57 */                    float fFloatValue = f / rationalM8393g.floatValue();
/* 61 */                    float f2 = (height - fFloatValue) / 2.0f;
/* 65 */                    rectF = new RectF(0.0f, f2, f, fFloatValue + f2);
                        } else {
                            float f3 = height;
/* 75 */                    float fFloatValue2 = rationalM8393g.floatValue() * f3;
/* 78 */                    float f4 = (width - fFloatValue2) / 2.0f;
/* 82 */                    rectF = new RectF(f4, 0.0f, fFloatValue2 + f4, f3);
                        }
/* 68 */                rectF2 = rectF;
                    }
/* 88 */            Rect rect = new Rect();
/* 91 */            rectF2.round(rect);
/* 94 */            return rect;
                }

                /* JADX INFO: renamed from: c */
                public static boolean m8392c(Size size, Size size2) {
                    return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
                }

                /* JADX INFO: renamed from: g */
                public static Rational m8393g(Size size) {
/* 11 */            return new Rational(size.getWidth(), size.getHeight());
                }

                /* JADX INFO: renamed from: b */
                public final List m8394b(zy2 zy2Var) {
                    Rational rationalM8393g;
/* 8 */             if (!this.f16410d.contains(zy2Var)) {
/* 157 */               s80.m8430k(zy2Var, "Invalid child config: ");
/* 7 */                 return null;
                    }
/* 10 */            HashMap map = this.f16413g;
/* 16 */            if (map.containsKey(zy2Var)) {
/* 22 */                List list = (List) map.get(zy2Var);
/* 24 */                Objects.requireNonNull(list);
/* 27 */                return list;
                    }
/* 30 */            ArrayList<Size> arrayListM191v = this.f16411e.m191v(zy2Var);
/* 36 */            HashMap map2 = new HashMap();
/* 41 */            ArrayList arrayList = new ArrayList();
/* 52 */            for (Size size : arrayListM191v) {
/* 64 */                Iterator it = map2.keySet().iterator();
/* 84 */                do {
/* 72 */                    if (!it.hasNext()) {
/* 87 */                        rationalM8393g = null;
                                break;
                            }
/* 78 */                    rationalM8393g = (Rational) it.next();
/* 84 */                } while (!AbstractC2177sd.m8480a(rationalM8393g, size));
/* 88 */                if (rationalM8393g != null) {
/* 94 */                    Size size2 = (Size) map2.get(rationalM8393g);
/* 96 */                    Objects.requireNonNull(size2);
/* 107 */                   if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                            }
                        } else {
/* 140 */                   rationalM8393g = m8393g(size);
                        }
/* 144 */               arrayList.add(size);
/* 147 */               map2.put(rationalM8393g, size);
                    }
/* 151 */           map.put(zy2Var, arrayList);
/* 154 */           return arrayList;
                }

                /* JADX INFO: renamed from: d */
                public final boolean m8395d(Rational rational, Size size) {
/* 1 */             Rational rational2 = this.f16408b;
/* 7 */             if (rational2.equals(rational) || AbstractC2177sd.m8480a(rational, size)) {
/* 70 */                return false;
                    }
/* 16 */            float fFloatValue = rational2.floatValue();
/* 20 */            float fFloatValue2 = rational.floatValue();
/* 24 */            Rational rationalM8393g = AbstractC2177sd.f16535a;
/* 30 */            if (!AbstractC2177sd.m8480a(rationalM8393g, size)) {
/* 33 */                rationalM8393g = AbstractC2177sd.f16537c;
/* 39 */                if (!AbstractC2177sd.m8480a(rationalM8393g, size)) {
/* 42 */                    rationalM8393g = m8393g(size);
                        }
                    }
/* 46 */            float fFloatValue3 = rationalM8393g.floatValue();
/* 52 */            if (fFloatValue == fFloatValue2 || fFloatValue2 == fFloatValue3) {
/* 70 */                return false;
                    }
/* 59 */            if (fFloatValue > fFloatValue2) {
                        return fFloatValue2 < fFloatValue3;
                    }
                    return fFloatValue2 > fFloatValue3;
                }

                /* JADX INFO: renamed from: e */
                public final ArrayList m8396e(List list, boolean z) {
                    List arrayList;
/* 3 */             HashMap map = new HashMap();
/* 6 */             Rational rational = AbstractC2177sd.f16535a;
/* 13 */            map.put(rational, new ArrayList());
/* 16 */            Rational rational2 = AbstractC2177sd.f16537c;
/* 23 */            map.put(rational2, new ArrayList());
/* 28 */            ArrayList arrayList2 = new ArrayList();
/* 31 */            arrayList2.add(rational);
/* 34 */            arrayList2.add(rational2);
/* 37 */            Iterator it = list.iterator();
/* 45 */            while (it.hasNext()) {
/* 51 */                Size size = (Size) it.next();
/* 57 */                if (size.getHeight() > 0) {
/* 60 */                    Iterator it2 = arrayList2.iterator();
                            while (true) {
/* 68 */                        if (!it2.hasNext()) {
/* 89 */                            arrayList = null;
                                    break;
                                }
/* 74 */                        Rational rational3 = (Rational) it2.next();
/* 80 */                        if (AbstractC2177sd.m8480a(rational3, size)) {
/* 86 */                            arrayList = (List) map.get(rational3);
                                    break;
                                }
                            }
/* 90 */                    if (arrayList == null) {
/* 94 */                        arrayList = new ArrayList();
/* 97 */                        Rational rationalM8393g = m8393g(size);
/* 101 */                       arrayList2.add(rationalM8393g);
/* 104 */                       map.put(rationalM8393g, arrayList);
                            }
/* 107 */                   arrayList.add(size);
                        }
                    }
/* 117 */           ArrayList<Rational> arrayList3 = new ArrayList(map.keySet());
/* 132 */           Collections.sort(arrayList3, new C0876ed(m8393g(this.f16407a), 2));
/* 137 */           ArrayList arrayList4 = new ArrayList();
/* 148 */           for (Rational rational4 : arrayList3) {
/* 162 */               if (!rational4.equals(AbstractC2177sd.f16537c) && !rational4.equals(AbstractC2177sd.f16535a)) {
/* 177 */                   List list2 = (List) map.get(rational4);
/* 179 */                   Objects.requireNonNull(list2);
/* 186 */                   arrayList4.addAll(m8397f(rational4, list2, z));
                        }
                    }
/* 190 */           return arrayList4;
                }

                /* JADX INFO: renamed from: f */
                public final ArrayList m8397f(Rational rational, List list, boolean z) {
                    ArrayList arrayList;
/* 3 */             ArrayList<Size> arrayList2 = new ArrayList();
/* 6 */             Iterator it = list.iterator();
/* 14 */            while (it.hasNext()) {
/* 20 */                Size size = (Size) it.next();
/* 26 */                if (AbstractC2177sd.m8480a(rational, size)) {
/* 28 */                    arrayList2.add(size);
                        }
                    }
/* 38 */            Collections.sort(arrayList2, new C1007hx(true));
/* 43 */            HashSet hashSet = new HashSet(arrayList2);
/* 48 */            Iterator it2 = this.f16410d.iterator();
/* 56 */            while (it2.hasNext()) {
/* 64 */                List<Size> listM8394b = m8394b((zy2) it2.next());
/* 68 */                if (!z) {
/* 72 */                    ArrayList arrayList3 = new ArrayList();
/* 83 */                    for (Size size2 : listM8394b) {
/* 95 */                        if (!m8395d(rational, size2)) {
/* 97 */                            arrayList3.add(size2);
                                }
                            }
/* 101 */                   listM8394b = arrayList3;
                        }
/* 106 */               if (listM8394b.isEmpty()) {
/* 110 */                   return new ArrayList();
                        }
/* 118 */               if (listM8394b.isEmpty() || arrayList2.isEmpty()) {
/* 178 */                   arrayList2 = new ArrayList();
                        } else {
/* 129 */                   ArrayList arrayList4 = new ArrayList();
/* 140 */                   for (Size size3 : arrayList2) {
/* 148 */                       Iterator it3 = listM8394b.iterator();
/* 156 */                       while (it3.hasNext()) {
/* 168 */                           if (!m8392c((Size) it3.next(), size3)) {
/* 170 */                               arrayList4.add(size3);
                                        break;
                                    }
                                }
                            }
/* 174 */                   arrayList2 = arrayList4;
                        }
/* 185 */               if (listM8394b.isEmpty() || arrayList2.isEmpty()) {
/* 277 */                   arrayList = new ArrayList();
                        } else {
/* 209 */                   ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
/* 214 */                   arrayList = new ArrayList();
/* 225 */                   for (Size size4 : arrayList5) {
/* 233 */                       Iterator it4 = listM8394b.iterator();
/* 253 */                       do {
/* 241 */                           if (!it4.hasNext()) {
/* 256 */                               arrayList.add(size4);
                                        break;
                                    }
/* 253 */                       } while (!m8392c((Size) it4.next(), size4));
                            }
/* 264 */                   if (!arrayList.isEmpty()) {
/* 271 */                       arrayList.remove(arrayList.size() - 1);
                            }
                        }
/* 280 */               hashSet.retainAll(arrayList);
                    }
/* 287 */           ArrayList arrayList6 = new ArrayList();
/* 298 */           for (Size size5 : arrayList2) {
/* 310 */               if (!hashSet.contains(size5)) {
/* 312 */                   arrayList6.add(size5);
                        }
                    }
/* 316 */           return arrayList6;
                }
            }
