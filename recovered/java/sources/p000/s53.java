            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.util.Pair;
            import android.util.Rational;
            import android.util.Size;
            import androidx.core.app.NotificationCompat;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.UUID;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class s53 implements vy2 {

                /* JADX INFO: renamed from: U */
                public final HashMap f16436U;

                /* JADX INFO: renamed from: V */
                public final s32 f16437V;

                /* JADX INFO: renamed from: W */
                public final s32 f16438W;

                /* JADX INFO: renamed from: a */
                public final HashSet f16439a;

                /* JADX INFO: renamed from: e */
                public final cz2 f16443e;

                /* JADX INFO: renamed from: f */
                public final InterfaceC2559zp f16444f;

                /* JADX INFO: renamed from: i */
                public final InterfaceC2559zp f16445i;

                /* JADX INFO: renamed from: w */
                public final HashSet f16447w;

                /* JADX INFO: renamed from: b */
                public final HashMap f16440b = new HashMap();

                /* JADX INFO: renamed from: c */
                public final HashMap f16441c = new HashMap();

                /* JADX INFO: renamed from: d */
                public final HashMap f16442d = new HashMap();

                /* JADX INFO: renamed from: v */
                public final ki1 f16446v = new ki1(this, 1);

                public s53(InterfaceC2559zp interfaceC2559zp, InterfaceC2559zp interfaceC2559zp2, HashSet hashSet, cz2 cz2Var, f42 f42Var) {
/* 33 */            this.f16444f = interfaceC2559zp;
/* 35 */            this.f16445i = interfaceC2559zp2;
/* 37 */            this.f16443e = cz2Var;
/* 39 */            this.f16439a = hashSet;
/* 43 */            HashMap map = new HashMap();
/* 46 */            Iterator it = hashSet.iterator();
/* 54 */            while (it.hasNext()) {
/* 60 */                wy2 wy2Var = (wy2) it.next();
/* 75 */                map.put(wy2Var, wy2Var.m9662l(interfaceC2559zp.mo8073m(), null, wy2Var.mo6439e(true, cz2Var)));
                    }
/* 79 */            this.f16436U = map;
/* 87 */            HashSet hashSet2 = new HashSet(map.values());
/* 90 */            this.f16447w = hashSet2;
/* 97 */            this.f16437V = new s32(interfaceC2559zp, hashSet2);
/* 101 */           if (this.f16445i != null) {
/* 110 */               this.f16438W = new s32(this.f16445i, hashSet2);
                    }
/* 112 */           Iterator it2 = hashSet.iterator();
/* 120 */           while (it2.hasNext()) {
/* 126 */               wy2 wy2Var2 = (wy2) it2.next();
/* 132 */               this.f16442d.put(wy2Var2, Boolean.FALSE);
/* 142 */               this.f16441c.put(wy2Var2, new r53(interfaceC2559zp, this, f42Var));
                    }
                }

                /* JADX INFO: renamed from: p */
                public static void m8409p(lj2 lj2Var, d70 d70Var, fb2 fb2Var) {
/* 1 */             lj2Var.m6464d();
                    try {
/* 4 */                 pg3.m7423a();
/* 7 */                 lj2Var.m6461a();
/* 10 */                kj2 kj2Var = lj2Var.f13329l;
/* 12 */                Objects.requireNonNull(kj2Var);
/* 21 */                kj2Var.m6121g(d70Var, new gj2(kj2Var, 0));
                    } catch (c70 unused) {
/* 25 */                db2 db2Var = fb2Var.f8119f;
/* 27 */                if (db2Var != null) {
/* 29 */                    db2Var.mo1608a(fb2Var);
                        }
                    }
                }

                /* JADX INFO: renamed from: q */
                public static d70 m8410q(wy2 wy2Var) {
/* 18 */            List listM3702b = wy2Var instanceof zv0 ? wy2Var.f18868m.m3702b() : Collections.unmodifiableList(wy2Var.f18868m.f8120g.f12441a);
/* 34 */            de3.m3028j(null, listM3702b.size() <= 1);
/* 41 */            if (listM3702b.size() == 1) {
/* 47 */                return (d70) listM3702b.get(0);
                    }
/* 33 */            return null;
                }

                @Override // p000.vy2
                /* JADX INFO: renamed from: b */
                public final void mo8066b(wy2 wy2Var) {
                    d70 d70VarM8410q;
/* 1 */             pg3.m7423a();
/* 10 */            lj2 lj2Var = (lj2) this.f16440b.get(wy2Var);
/* 12 */            Objects.requireNonNull(lj2Var);
/* 19 */            if (m8412r(wy2Var) && (d70VarM8410q = m8410q(wy2Var)) != null) {
/* 30 */                m8409p(lj2Var, d70VarM8410q, wy2Var.f18868m);
                    }
                }

                @Override // p000.vy2
                /* JADX INFO: renamed from: d */
                public final void mo8067d(wy2 wy2Var) {
/* 1 */             pg3.m7423a();
/* 8 */             if (m8412r(wy2Var)) {
/* 40 */                return;
                    }
/* 15 */            this.f16442d.put(wy2Var, Boolean.TRUE);
/* 18 */            d70 d70VarM8410q = m8410q(wy2Var);
/* 22 */            if (d70VarM8410q != null) {
/* 30 */                lj2 lj2Var = (lj2) this.f16440b.get(wy2Var);
/* 32 */                Objects.requireNonNull(lj2Var);
/* 37 */                m8409p(lj2Var, d70VarM8410q, wy2Var.f18868m);
                    }
                }

                @Override // p000.vy2
                /* JADX INFO: renamed from: g */
                public final void mo8069g(wy2 wy2Var) {
/* 1 */             pg3.m7423a();
/* 8 */             if (m8412r(wy2Var)) {
/* 17 */                lj2 lj2Var = (lj2) this.f16440b.get(wy2Var);
/* 19 */                Objects.requireNonNull(lj2Var);
/* 22 */                d70 d70VarM8410q = m8410q(wy2Var);
/* 26 */                if (d70VarM8410q != null) {
/* 30 */                    m8409p(lj2Var, d70VarM8410q, wy2Var.f18868m);
/* 33 */                    return;
                        }
/* 34 */                pg3.m7423a();
/* 37 */                lj2Var.m6461a();
/* 42 */                lj2Var.f13329l.mo2951a();
                    }
                }

                @Override // p000.vy2
                /* JADX INFO: renamed from: n */
                public final void mo8074n(wy2 wy2Var) {
/* 1 */             pg3.m7423a();
/* 8 */             if (m8412r(wy2Var)) {
/* 15 */                this.f16442d.put(wy2Var, Boolean.FALSE);
/* 24 */                lj2 lj2Var = (lj2) this.f16440b.get(wy2Var);
/* 26 */                Objects.requireNonNull(lj2Var);
/* 29 */                pg3.m7423a();
/* 32 */                lj2Var.m6461a();
/* 37 */                lj2Var.f13329l.mo2951a();
                    }
                }

                /* JADX INFO: renamed from: o */
                public final C0916fg m8411o(wy2 wy2Var, s32 s32Var, InterfaceC2559zp interfaceC2559zp, lj2 lj2Var, int i, boolean z) {
                    Size sizeM2874d;
                    int i2;
/* 15 */            int iMo313e = interfaceC2559zp.mo8073m().mo313e(i);
/* 19 */            Matrix matrix = lj2Var.f13319b;
/* 21 */            RectF rectF = cr2.f6893a;
/* 24 */            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
/* 29 */            matrix.mapVectors(fArr);
/* 33 */            float f = fArr[0];
/* 36 */            float f2 = fArr[1];
/* 39 */            float f3 = fArr[2];
/* 42 */            float f4 = fArr[3];
/* 48 */            float f5 = (f2 * f4) + (f * f3);
/* 53 */            float f6 = (f * f4) - (f2 * f3);
/* 66 */            float f7 = (f4 * f4) + (f3 * f3);
/* 67 */            boolean z2 = false;
/* 74 */            double dSqrt = Math.sqrt((f2 * f2) + (f * f)) * Math.sqrt(f7);
/* 94 */            boolean z3 = ((float) Math.toDegrees(Math.atan2(((double) f6) / dSqrt, ((double) f5) / dSqrt))) > 0.0f;
/* 101 */           zy2 zy2Var = (zy2) this.f16436U.get(wy2Var);
/* 103 */           Objects.requireNonNull(zy2Var);
/* 106 */           Rect rectM8391a = lj2Var.f13321d;
/* 112 */           float[] fArr2 = new float[9];
/* 114 */           lj2Var.f13319b.getValues(fArr2);
/* 138 */           int iM2876f = cr2.m2876f((int) Math.round(Math.atan2(fArr2[3], fArr2[0]) * 57.29577951308232d));
/* 142 */           s32Var.getClass();
/* 149 */           if (cr2.m2872b(iM2876f)) {
/* 161 */               rectM8391a = new Rect(rectM8391a.top, rectM8391a.left, rectM8391a.bottom, rectM8391a.right);
/* 165 */               z2 = true;
                    }
/* 166 */           if (z) {
/* 168 */               sizeM2874d = cr2.m2874d(rectM8391a);
/* 176 */               Iterator it = s32Var.m8394b(zy2Var).iterator();
/* 184 */               while (it.hasNext()) {
/* 196 */                   Size sizeM2874d2 = cr2.m2874d(s32.m8391a((Size) it.next(), sizeM2874d));
/* 204 */                   if (!s32.m8392c(sizeM2874d2, sizeM2874d)) {
/* 206 */                       sizeM2874d = sizeM2874d2;
                                break;
                            }
                        }
                    } else {
/* 208 */               Size sizeM2874d3 = cr2.m2874d(rectM8391a);
/* 212 */               List listM8394b = s32Var.m8394b(zy2Var);
/* 216 */               Iterator it2 = listM8394b.iterator();
                        while (true) {
/* 224 */                   if (!it2.hasNext()) {
/* 269 */                       Iterator it3 = listM8394b.iterator();
                                while (true) {
/* 277 */                           if (!it3.hasNext()) {
/* 293 */                               sizeM2874d = sizeM2874d3;
                                        break;
                                    }
/* 283 */                           Size size = (Size) it3.next();
/* 289 */                           if (!s32.m8392c(size, sizeM2874d3)) {
/* 291 */                               sizeM2874d = size;
                                        break;
                                    }
                                }
                            } else {
/* 230 */                       Size size2 = (Size) it2.next();
/* 232 */                       Rational rationalM8393g = AbstractC2177sd.f16535a;
/* 238 */                       if (!AbstractC2177sd.m8480a(rationalM8393g, sizeM2874d3)) {
/* 241 */                           rationalM8393g = AbstractC2177sd.f16537c;
/* 247 */                           if (!AbstractC2177sd.m8480a(rationalM8393g, sizeM2874d3)) {
/* 250 */                               rationalM8393g = s32.m8393g(sizeM2874d3);
                                    }
                                }
/* 258 */                       if (!s32Var.m8395d(rationalM8393g, size2) && !s32.m8392c(size2, sizeM2874d3)) {
/* 267 */                           sizeM2874d = size2;
                                    break;
                                }
                            }
                        }
/* 294 */               rectM8391a = s32.m8391a(sizeM2874d3, sizeM2874d);
                    }
/* 300 */           Pair pair = new Pair(rectM8391a, sizeM2874d);
/* 305 */           Rect rect = (Rect) pair.first;
/* 309 */           Size size3 = (Size) pair.second;
/* 311 */           if (z2) {
/* 323 */               Size size4 = new Size(size3.getHeight(), size3.getWidth());
/* 336 */               rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
/* 340 */               size3 = size4;
                    }
/* 343 */           Pair pair2 = new Pair(rect, size3);
/* 350 */           Rect rect2 = (Rect) pair2.first;
/* 354 */           Size size5 = (Size) pair2.second;
/* 370 */           int iMo313e2 = this.f16444f.mo8073m().mo313e(((jw0) wy2Var.f18861f).m5923s());
/* 380 */           r53 r53Var = (r53) this.f16441c.get(wy2Var);
/* 382 */           Objects.requireNonNull(r53Var);
/* 387 */           r53Var.f15884b.f17366c = iMo313e2;
/* 393 */           int iM2876f2 = cr2.m2876f((lj2Var.f13326i + iMo313e2) - iMo313e);
/* 399 */           if (wy2Var instanceof vw1) {
/* 401 */               i2 = 1;
                    } else {
/* 411 */               i2 = wy2Var instanceof zv0 ? 4 : 2;
                    }
/* 445 */           return new C0916fg(UUID.randomUUID(), i2, wy2Var instanceof zv0 ? NotificationCompat.FLAG_LOCAL_ONLY : 34, rect2, cr2.m2875e(size5, iM2876f2), iM2876f2, wy2Var.m9661k(interfaceC2559zp) ^ z3);
                }

                /* JADX INFO: renamed from: r */
                public final boolean m8412r(wy2 wy2Var) {
/* 7 */             Boolean bool = (Boolean) this.f16442d.get(wy2Var);
/* 9 */             Objects.requireNonNull(bool);
/* 12 */            return bool.booleanValue();
                }

                /* JADX INFO: renamed from: s */
                public final void m8413s(HashMap map) {
/* 1 */             HashMap map2 = this.f16440b;
/* 3 */             map2.clear();
/* 6 */             map2.putAll(map);
/* 21 */            for (Map.Entry entry : map2.entrySet()) {
/* 33 */                wy2 wy2Var = (wy2) entry.getKey();
/* 39 */                lj2 lj2Var = (lj2) entry.getValue();
/* 43 */                wy2Var.mo7564y(lj2Var.f13321d);
/* 48 */                wy2Var.mo7563x(lj2Var.f13319b);
/* 58 */                wy2Var.f18862g = wy2Var.mo6447v(lj2Var.f13324g, null);
/* 60 */                wy2Var.m9665o();
                    }
                }
            }
