            package p000;

            import android.os.Looper;
            import androidx.lifecycle.DefaultLifecycleObserver;
            import java.lang.ref.WeakReference;
            import java.lang.reflect.Constructor;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class i71 extends v61 {

                /* JADX INFO: renamed from: a */
                public final boolean f9481a;

                /* JADX INFO: renamed from: b */
                public yg0 f9482b;

                /* JADX INFO: renamed from: c */
                public u61 f9483c;

                /* JADX INFO: renamed from: d */
                public final WeakReference f9484d;

                /* JADX INFO: renamed from: e */
                public int f9485e;

                /* JADX INFO: renamed from: f */
                public boolean f9486f;

                /* JADX INFO: renamed from: g */
                public boolean f9487g;

                /* JADX INFO: renamed from: h */
                public final ArrayList f9488h;

                /* JADX INFO: renamed from: i */
                public final rg2 f9489i;

                public i71(g71 g71Var) {
/* 1 */             g71Var.getClass();
/* 9 */             new AtomicReference();
/* 13 */            this.f9481a = true;
/* 20 */            this.f9482b = new yg0();
/* 22 */            u61 u61Var = u61.f17375b;
/* 24 */            this.f9483c = u61Var;
/* 31 */            this.f9488h = new ArrayList();
/* 38 */            this.f9484d = new WeakReference(g71Var);
/* 45 */            this.f9489i = new rg2(u61Var);
                }

                @Override // p000.v61
                /* JADX INFO: renamed from: a */
                public final void mo4483a(f71 f71Var) {
                    d71 l60Var;
                    Object obj;
                    g71 g71Var;
                    t61 t61Var;
/* 1 */             f71Var.getClass();
/* 6 */             m4486d("addObserver");
/* 9 */             u61 u61Var = this.f9483c;
/* 11 */            u61 u61Var2 = u61.f17374a;
/* 13 */            if (u61Var != u61Var2) {
/* 16 */                u61Var2 = u61.f17375b;
                    }
/* 20 */            h71 h71Var = new h71();
/* 23 */            HashMap map = k71.f12630a;
/* 25 */            boolean z = f71Var instanceof d71;
/* 27 */            boolean z2 = f71Var instanceof DefaultLifecycleObserver;
/* 32 */            int i = 1;
/* 33 */            if (z && z2) {
/* 45 */                l60Var = new l60((DefaultLifecycleObserver) f71Var, (d71) f71Var);
                    } else if (z2) {
/* 56 */                l60Var = new l60((DefaultLifecycleObserver) f71Var, (d71) null);
                    } else if (z) {
/* 63 */                l60Var = (d71) f71Var;
                    } else {
/* 66 */                Class<?> cls = f71Var.getClass();
/* 74 */                if (k71.m5998b(cls) == 2) {
/* 78 */                    Object obj2 = k71.f12631b.get(cls);
/* 82 */                    obj2.getClass();
/* 85 */                    List list = (List) obj2;
/* 91 */                    if (list.size() == 1) {
/* 123 */                       k71.m5997a((Constructor) list.get(0), f71Var);
/* 126 */                       throw null;
                            }
/* 93 */                    int size = list.size();
/* 97 */                    lq0[] lq0VarArr = new lq0[size];
/* 99 */                    if (size > 0) {
/* 113 */                       k71.m5997a((Constructor) list.get(0), f71Var);
/* 116 */                       throw null;
                            }
/* 103 */                   l60Var = new e12(lq0VarArr, i);
                        } else {
/* 129 */                   l60Var = new l60(f71Var);
                        }
                    }
/* 132 */           h71Var.f8947b = l60Var;
/* 134 */           h71Var.f8946a = u61Var2;
/* 136 */           yg0 yg0Var = this.f9482b;
/* 138 */           b62 b62VarMo3333a = yg0Var.mo3333a(f71Var);
/* 142 */           if (b62VarMo3333a != null) {
/* 144 */               obj = b62VarMo3333a.f2240b;
                    } else {
/* 147 */               HashMap map2 = yg0Var.f19603e;
/* 151 */               b62 b62Var = new b62(f71Var, h71Var);
/* 157 */               yg0Var.f7559d++;
/* 159 */               b62 b62Var2 = yg0Var.f7557b;
/* 161 */               if (b62Var2 == null) {
/* 163 */                   yg0Var.f7556a = b62Var;
/* 165 */                   yg0Var.f7557b = b62Var;
                        } else {
/* 168 */                   b62Var2.f2241c = b62Var;
/* 170 */                   b62Var.f2242d = b62Var2;
/* 172 */                   yg0Var.f7557b = b62Var;
                        }
/* 174 */               map2.put(f71Var, b62Var);
/* 177 */               obj = null;
                    }
/* 180 */           if (((h71) obj) == null && (g71Var = (g71) this.f9484d.get()) != null) {
/* 196 */               boolean z3 = this.f9485e != 0 || this.f9486f;
/* 203 */               u61 u61VarM4485c = m4485c(f71Var);
/* 210 */               this.f9485e++;
/* 218 */               while (h71Var.f8946a.compareTo(u61VarM4485c) < 0 && this.f9482b.f19603e.containsKey(f71Var)) {
/* 230 */                   u61 u61Var3 = h71Var.f8946a;
/* 232 */                   ArrayList arrayList = this.f9488h;
/* 234 */                   arrayList.add(u61Var3);
/* 237 */                   r61 r61Var = t61.Companion;
/* 239 */                   u61 u61Var4 = h71Var.f8946a;
/* 241 */                   r61Var.getClass();
/* 244 */                   u61Var4.getClass();
/* 247 */                   int iOrdinal = u61Var4.ordinal();
/* 251 */                   if (iOrdinal == 1) {
/* 266 */                       t61Var = t61.ON_CREATE;
                            } else if (iOrdinal != 2) {
/* 260 */                       t61Var = iOrdinal != 3 ? null : t61.ON_RESUME;
                            } else {
/* 263 */                       t61Var = t61.ON_START;
                            }
/* 268 */                   if (t61Var == null) {
/* 290 */                       ds0.m3206w(h71Var.f8946a, "no event up from ");
/* 293 */                       return;
                            } else {
/* 270 */                       h71Var.m4122a(g71Var, t61Var);
/* 278 */                       arrayList.remove(arrayList.size() - 1);
/* 281 */                       u61VarM4485c = m4485c(f71Var);
                            }
                        }
/* 294 */               if (!z3) {
/* 296 */                   m4490h();
                        }
/* 303 */               this.f9485e--;
                    }
                }

                @Override // p000.v61
                /* JADX INFO: renamed from: b */
                public final void mo4484b(f71 f71Var) {
/* 1 */             f71Var.getClass();
/* 6 */             m4486d("removeObserver");
/* 11 */            this.f9482b.mo3334b(f71Var);
                }

                /* JADX INFO: renamed from: c */
                public final u61 m4485c(f71 f71Var) {
                    h71 h71Var;
/* 3 */             HashMap map = this.f9482b.f19603e;
/* 21 */            b62 b62Var = map.containsKey(f71Var) ? ((b62) map.get(f71Var)).f2242d : null;
/* 33 */            u61 u61Var = (b62Var == null || (h71Var = (h71) b62Var.f2240b) == null) ? null : h71Var.f8946a;
/* 34 */            ArrayList arrayList = this.f9488h;
/* 53 */            u61 u61Var2 = arrayList.isEmpty() ? null : (u61) arrayList.get(arrayList.size() - 1);
/* 55 */            u61 u61Var3 = this.f9483c;
/* 57 */            u61Var3.getClass();
/* 60 */            if (u61Var == null || u61Var.compareTo(u61Var3) >= 0) {
/* 69 */                u61Var = u61Var3;
                    }
                    return (u61Var2 == null || u61Var2.compareTo(u61Var) >= 0) ? u61Var : u61Var2;
                }

                /* JADX INFO: renamed from: d */
                public final void m4486d(String str) {
/* 3 */             if (this.f9481a) {
/* 11 */                C2363xc.m9748y0().f19024k.getClass();
/* 26 */                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
/* 28 */                    return;
                        }
/* 37 */                ds0.m3190g(fm0.m3784j("Method ", str, " must be called on the main thread"));
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m4487e(t61 t61Var) {
/* 1 */             t61Var.getClass();
/* 6 */             m4486d("handleLifecycleEvent");
/* 13 */            m4488f(t61Var.m8704a());
                }

                /* JADX INFO: renamed from: f */
                public final void m4488f(u61 u61Var) {
/* 1 */             u61 u61Var2 = this.f9483c;
/* 3 */             if (u61Var2 == u61Var) {
/* 86 */                return;
                    }
/* 6 */             u61 u61Var3 = u61.f17375b;
/* 8 */             u61 u61Var4 = u61.f17374a;
/* 10 */            if (u61Var2 == u61Var3 && u61Var == u61Var4) {
/* 19 */                StringBuilder sb = new StringBuilder("no event down from ");
/* 24 */                sb.append(this.f9483c);
/* 29 */                Object obj = this.f9484d.get();
/* 35 */                sb.append(" in component ");
/* 38 */                sb.append(obj);
/* 54 */                throw new IllegalStateException(sb.toString().toString());
                    }
/* 55 */            this.f9483c = u61Var;
/* 60 */            if (this.f9486f || this.f9485e != 0) {
/* 87 */                this.f9487g = true;
/* 89 */                return;
                    }
/* 67 */            this.f9486f = true;
/* 69 */            m4490h();
/* 73 */            this.f9486f = false;
/* 77 */            if (this.f9483c == u61Var4) {
/* 84 */                this.f9482b = new yg0();
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m4489g(u61 u61Var) {
/* 3 */             m4486d("setCurrentState");
/* 6 */             m4488f(u61Var);
                }

                /* JADX INFO: renamed from: h */
                public final void m4490h() {
                    t61 t61Var;
                    t61 t61Var2;
/* 7 */             g71 g71Var = (g71) this.f9484d.get();
/* 9 */             if (g71Var == null) {
/* 380 */               f42.m3656l("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
/* 383 */               return;
                    }
                    while (true) {
/* 11 */                yg0 yg0Var = this.f9482b;
/* 17 */                if (yg0Var.f7559d != 0) {
/* 20 */                    b62 b62Var = yg0Var.f7556a;
/* 22 */                    b62Var.getClass();
/* 29 */                    u61 u61Var = ((h71) b62Var.f2240b).f8946a;
/* 33 */                    b62 b62Var2 = this.f9482b.f7557b;
/* 35 */                    b62Var2.getClass();
/* 42 */                    u61 u61Var2 = ((h71) b62Var2.f2240b).f8946a;
/* 44 */                    if (u61Var == u61Var2 && this.f9483c == u61Var2) {
                                break;
                            }
/* 67 */                    this.f9487g = false;
/* 69 */                    u61 u61Var3 = this.f9483c;
/* 73 */                    b62 b62Var3 = this.f9482b.f7556a;
/* 75 */                    b62Var3.getClass();
/* 84 */                    int iCompareTo = u61Var3.compareTo(((h71) b62Var3.f2240b).f8946a);
/* 91 */                    ArrayList arrayList = this.f9488h;
/* 93 */                    if (iCompareTo < 0) {
/* 95 */                        yg0 yg0Var2 = this.f9482b;
/* 103 */                       a62 a62Var = new a62(yg0Var2.f7557b, yg0Var2.f7556a, 1);
/* 110 */                       yg0Var2.f7558c.put(a62Var, Boolean.FALSE);
/* 117 */                       while (a62Var.hasNext() && !this.f9487g) {
/* 127 */                           Map.Entry entry = (Map.Entry) a62Var.next();
/* 129 */                           entry.getClass();
/* 136 */                           f71 f71Var = (f71) entry.getKey();
/* 142 */                           h71 h71Var = (h71) entry.getValue();
/* 152 */                           while (h71Var.f8946a.compareTo(this.f9483c) > 0 && !this.f9487g && this.f9482b.f19603e.containsKey(f71Var)) {
/* 168 */                               r61 r61Var = t61.Companion;
/* 170 */                               u61 u61Var4 = h71Var.f8946a;
/* 172 */                               r61Var.getClass();
/* 175 */                               u61Var4.getClass();
/* 178 */                               int iOrdinal = u61Var4.ordinal();
/* 182 */                               if (iOrdinal == 2) {
/* 197 */                                   t61Var2 = t61.ON_DESTROY;
                                        } else if (iOrdinal != 3) {
/* 191 */                                   t61Var2 = iOrdinal != 4 ? null : t61.ON_PAUSE;
                                        } else {
/* 194 */                                   t61Var2 = t61.ON_STOP;
                                        }
/* 199 */                               if (t61Var2 == null) {
/* 224 */                                   ds0.m3206w(h71Var.f8946a, "no event down from ");
/* 227 */                                   return;
                                        } else {
/* 205 */                                   arrayList.add(t61Var2.m8704a());
/* 208 */                                   h71Var.m4122a(g71Var, t61Var2);
/* 216 */                                   arrayList.remove(arrayList.size() - 1);
                                        }
                                    }
                                }
                            }
/* 230 */                   b62 b62Var4 = this.f9482b.f7557b;
/* 234 */                   if (!this.f9487g && b62Var4 != null && this.f9483c.compareTo(((h71) b62Var4.f2240b).f8946a) > 0) {
/* 252 */                       yg0 yg0Var3 = this.f9482b;
/* 254 */                       yg0Var3.getClass();
/* 259 */                       c62 c62Var = new c62(yg0Var3);
/* 266 */                       yg0Var3.f7558c.put(c62Var, Boolean.FALSE);
/* 273 */                       while (c62Var.hasNext() && !this.f9487g) {
/* 283 */                           Map.Entry entry2 = (Map.Entry) c62Var.next();
/* 289 */                           f71 f71Var2 = (f71) entry2.getKey();
/* 295 */                           h71 h71Var2 = (h71) entry2.getValue();
/* 305 */                           while (h71Var2.f8946a.compareTo(this.f9483c) < 0 && !this.f9487g && this.f9482b.f19603e.containsKey(f71Var2)) {
/* 323 */                               arrayList.add(h71Var2.f8946a);
/* 326 */                               r61 r61Var2 = t61.Companion;
/* 328 */                               u61 u61Var5 = h71Var2.f8946a;
/* 330 */                               r61Var2.getClass();
/* 333 */                               u61Var5.getClass();
/* 336 */                               int iOrdinal2 = u61Var5.ordinal();
/* 340 */                               if (iOrdinal2 == 1) {
/* 354 */                                   t61Var = t61.ON_CREATE;
                                        } else if (iOrdinal2 != 2) {
/* 348 */                                   t61Var = iOrdinal2 != 3 ? null : t61.ON_RESUME;
                                        } else {
/* 351 */                                   t61Var = t61.ON_START;
                                        }
/* 356 */                               if (t61Var == null) {
/* 374 */                                   ds0.m3206w(h71Var2.f8946a, "no event up from ");
/* 377 */                                   return;
                                        } else {
/* 358 */                                   h71Var2.m4122a(g71Var, t61Var);
/* 366 */                                   arrayList.remove(arrayList.size() - 1);
                                        }
                                    }
                                }
                            }
                        } else {
                            break;
                        }
                    }
/* 50 */            this.f9487g = false;
/* 52 */            Object obj = this.f9483c;
/* 54 */            rg2 rg2Var = this.f9489i;
/* 56 */            rg2Var.getClass();
/* 59 */            if (obj == null) {
/* 61 */                obj = jb1.f12171c;
                    }
/* 63 */            rg2Var.m8158b(null, obj);
                }
            }
