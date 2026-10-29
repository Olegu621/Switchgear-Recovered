            package p000;

            import android.hardware.camera2.params.InputConfiguration;
            import android.media.MediaCodec;
            import android.util.Range;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Comparator;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class eb2 extends ab2 {

                /* JADX INFO: renamed from: i */
                public final nb2 f7605i = new nb2(2);

                /* JADX INFO: renamed from: j */
                public boolean f7606j = true;

                /* JADX INFO: renamed from: k */
                public boolean f7607k = false;

                /* JADX INFO: renamed from: l */
                public final ArrayList f7608l = new ArrayList();

                /* JADX INFO: renamed from: a */
                public final void m3357a(fb2 fb2Var) {
                    Object objMo7025e;
/* 1 */             C1803jr c1803jr = fb2Var.f8120g;
/* 3 */             int i = c1803jr.f12443c;
/* 5 */             nq1 nq1Var = c1803jr.f12442b;
/* 8 */             C1767ir c1767ir = this.f164b;
/* 10 */            if (i != -1) {
/* 13 */                this.f7607k = true;
/* 15 */                int i2 = c1767ir.f11908a;
/* 17 */                List list = fb2.f8113i;
/* 35 */                if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
/* 38 */                    i = i2;
                        }
/* 39 */                c1767ir.f11908a = i;
                    }
/* 41 */            C1888lf c1888lf = C1803jr.f12440j;
/* 43 */            Object objMo7025e2 = C2069pg.f15101f;
                    try {
/* 45 */                objMo7025e2 = nq1Var.mo7025e(c1888lf);
                    } catch (IllegalArgumentException unused) {
                    }
/* 49 */            Range range = (Range) objMo7025e2;
/* 51 */            Objects.requireNonNull(range);
/* 54 */            Range range2 = C2069pg.f15101f;
/* 63 */            if (!range.equals(range2)) {
/* 68 */                uk1 uk1Var = (uk1) c1767ir.f11911d;
/* 70 */                C1888lf c1888lf2 = C1803jr.f12440j;
/* 72 */                uk1Var.getClass();
                        try {
/* 75 */                    objMo7025e = uk1Var.mo7025e(c1888lf2);
                        } catch (IllegalArgumentException unused2) {
/* 80 */                    objMo7025e = range2;
                        }
/* 87 */                if (((Range) objMo7025e).equals(range2)) {
/* 95 */                    ((uk1) c1767ir.f11911d).m9037p(C1803jr.f12440j, range);
                        } else {
/* 101 */                   uk1 uk1Var2 = (uk1) c1767ir.f11911d;
/* 103 */                   C1888lf c1888lf3 = C1803jr.f12440j;
/* 105 */                   Object objMo7025e3 = C2069pg.f15101f;
/* 107 */                   uk1Var2.getClass();
                            try {
/* 110 */                       objMo7025e3 = uk1Var2.mo7025e(c1888lf3);
                            } catch (IllegalArgumentException unused3) {
                            }
/* 120 */                   if (!((Range) objMo7025e3).equals(range)) {
/* 122 */                       this.f7606j = false;
/* 124 */                       hu0.m4312F0("ValidatingBuilder");
                            }
                        }
                    }
/* 127 */           int iM5892a = c1803jr.m5892a();
/* 131 */           if (iM5892a != 0) {
/* 133 */               c1767ir.getClass();
/* 136 */               if (iM5892a != 0) {
/* 148 */                   ((uk1) c1767ir.f11911d).m9037p(zy2.f20393P, Integer.valueOf(iM5892a));
                        }
                    }
/* 151 */           int iM5893b = c1803jr.m5893b();
/* 155 */           if (iM5893b != 0) {
/* 157 */               c1767ir.getClass();
/* 160 */               if (iM5893b != 0) {
/* 172 */                   ((uk1) c1767ir.f11911d).m9037p(zy2.f20394Q, Integer.valueOf(iM5893b));
                        }
                    }
/* 175 */           nm2 nm2Var = c1803jr.f12446f;
/* 179 */           cl1 cl1Var = (cl1) c1767ir.f11913f;
/* 183 */           HashSet hashSet = (HashSet) c1767ir.f11910c;
/* 189 */           cl1Var.f14383a.putAll((Map) nm2Var.f14383a);
/* 196 */           this.f165c.addAll(fb2Var.f8116c);
/* 203 */           this.f166d.addAll(fb2Var.f8117d);
/* 208 */           c1767ir.m5543b(c1803jr.f12444d);
/* 215 */           this.f167e.addAll(fb2Var.f8118e);
/* 218 */           db2 db2Var = fb2Var.f8119f;
/* 220 */           if (db2Var != null) {
/* 224 */               this.f7608l.add(db2Var);
                    }
/* 227 */           InputConfiguration inputConfiguration = fb2Var.f8121h;
/* 229 */           if (inputConfiguration != null) {
/* 231 */               this.f169g = inputConfiguration;
                    }
/* 233 */           ArrayList arrayList = fb2Var.f8114a;
/* 235 */           LinkedHashSet<C1926mg> linkedHashSet = this.f163a;
/* 237 */           linkedHashSet.addAll(arrayList);
/* 246 */           hashSet.addAll(Collections.unmodifiableList(c1803jr.f12441a));
/* 251 */           ArrayList arrayList2 = new ArrayList();
/* 262 */           for (C1926mg c1926mg : linkedHashSet) {
/* 272 */               arrayList2.add(c1926mg.f13750a);
/* 277 */               Iterator it = c1926mg.f13751b.iterator();
/* 285 */               while (it.hasNext()) {
/* 293 */                   arrayList2.add((d70) it.next());
                        }
                    }
/* 301 */           if (!arrayList2.containsAll(hashSet)) {
/* 303 */               hu0.m4312F0("ValidatingBuilder");
/* 306 */               this.f7606j = false;
                    }
/* 308 */           C1926mg c1926mg2 = fb2Var.f8115b;
/* 310 */           if (c1926mg2 != null) {
/* 312 */               C1926mg c1926mg3 = this.f170h;
/* 314 */               if (c1926mg3 == c1926mg2 || c1926mg3 == null) {
/* 324 */                   this.f170h = c1926mg2;
                        } else {
/* 318 */                   hu0.m4312F0("ValidatingBuilder");
/* 321 */                   this.f7606j = false;
                        }
                    }
/* 326 */           c1767ir.m5545e(nq1Var);
                }

                /* JADX INFO: renamed from: b */
                public final fb2 m3358b() {
/* 4 */             if (!this.f7606j) {
/* 82 */                C1951n4.m6859j("Unsupported session configuration combination");
/* 3 */                 return null;
                    }
/* 10 */            ArrayList arrayList = new ArrayList(this.f163a);
/* 13 */            final nb2 nb2Var = this.f7605i;
/* 17 */            if (nb2Var.f14177a) {
/* 25 */                Collections.sort(arrayList, new Comparator() { // from class: sj2
                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                int i;
/* 3 */                         C1926mg c1926mg = (C1926mg) obj2;
/* 7 */                         nb2Var.getClass();
/* 12 */                        Class cls = ((C1926mg) obj).f13750a.f7035j;
/* 14 */                        int i2 = 1;
/* 21 */                        if (cls == MediaCodec.class) {
/* 23 */                            i = 2;
                                } else {
/* 29 */                            i = cls == vw1.class ? 0 : 1;
                                }
/* 32 */                        Class cls2 = c1926mg.f13750a.f7035j;
/* 34 */                        if (cls2 == MediaCodec.class) {
/* 36 */                            i2 = 2;
                                } else if (cls2 == vw1.class) {
/* 40 */                            i2 = 0;
                                }
/* 41 */                        return i - i2;
                            }
                        });
                    }
/* 76 */            return new fb2(arrayList, new ArrayList(this.f165c), new ArrayList(this.f166d), new ArrayList(this.f167e), this.f164b.m5546i(), this.f7608l.isEmpty() ? null : new kv0(this, 4), this.f169g, this.f170h);
                }
            }
