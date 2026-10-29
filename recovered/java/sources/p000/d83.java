            package p000;

            import android.graphics.Rect;
            import android.os.Build;
            import android.view.View;
            import android.view.WindowInsets;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class d83 extends j83 {

                /* JADX INFO: renamed from: h */
                public static boolean f7054h;

                /* JADX INFO: renamed from: i */
                public static Method f7055i;

                /* JADX INFO: renamed from: j */
                public static Class f7056j;

                /* JADX INFO: renamed from: k */
                public static Field f7057k;

                /* JADX INFO: renamed from: l */
                public static Field f7058l;

                /* JADX INFO: renamed from: c */
                public final WindowInsets f7059c;

                /* JADX INFO: renamed from: d */
                public ly0[] f7060d;

                /* JADX INFO: renamed from: e */
                public ly0 f7061e;

                /* JADX INFO: renamed from: f */
                public m83 f7062f;

                /* JADX INFO: renamed from: g */
                public ly0 f7063g;

                public d83(m83 m83Var, WindowInsets windowInsets) {
/* 1 */             super(m83Var);
/* 5 */             this.f7061e = null;
/* 7 */             this.f7059c = windowInsets;
                }

                /* JADX INFO: renamed from: r */
                private ly0 m2965r(int i, boolean z) {
/* 1 */             ly0 ly0VarM6573a = ly0.f13527e;
/* 6 */             for (int i2 = 1; i2 <= 256; i2 <<= 1) {
/* 10 */                if ((i & i2) != 0) {
/* 13 */                    ly0 ly0VarM2976s = m2976s(i2, z);
/* 49 */                    ly0VarM6573a = ly0.m6573a(Math.max(ly0VarM6573a.f13528a, ly0VarM2976s.f13528a), Math.max(ly0VarM6573a.f13529b, ly0VarM2976s.f13529b), Math.max(ly0VarM6573a.f13530c, ly0VarM2976s.f13530c), Math.max(ly0VarM6573a.f13531d, ly0VarM2976s.f13531d));
                        }
                    }
/* 56 */            return ly0VarM6573a;
                }

                /* JADX INFO: renamed from: t */
                private ly0 m2966t() {
/* 1 */             m83 m83Var = this.f7062f;
                    return m83Var != null ? m83Var.f13660a.mo3341h() : ly0.f13527e;
                }

                /* JADX INFO: renamed from: u */
                private ly0 m2967u(View view) {
/* 8 */             if (Build.VERSION.SDK_INT >= 30) {
/* 102 */               C1951n4.m6866q("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
/* 7 */                 return null;
                    }
/* 12 */            if (!f7054h) {
/* 14 */                m2968v();
                    }
/* 17 */            Method method = f7055i;
/* 19 */            if (method != null && f7056j != null && f7057k != null) {
                        try {
/* 30 */                    Object objInvoke = method.invoke(view, null);
/* 34 */                    if (objInvoke == null) {
/* 43 */                        AbstractC1245n0.m4891s("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
/* 7 */                         return null;
                            }
/* 61 */                    Rect rect = (Rect) f7057k.get(f7058l.get(objInvoke));
/* 63 */                    if (rect != null) {
/* 73 */                        return ly0.m6573a(rect.left, rect.top, rect.right, rect.bottom);
                            }
                        } catch (ReflectiveOperationException e) {
/* 96 */                    AbstractC1245n0.m4877e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                        }
                    }
/* 7 */             return null;
                }

                /* JADX INFO: renamed from: v */
                private static void m2968v() {
                    try {
/* 11 */                f7055i = View.class.getDeclaredMethod("getViewRootImpl", null);
/* 15 */                Class<?> cls = Class.forName("android.view.View$AttachInfo");
/* 19 */                f7056j = cls;
/* 27 */                f7057k = cls.getDeclaredField("mVisibleInsets");
/* 41 */                f7058l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
/* 45 */                f7057k.setAccessible(true);
/* 50 */                f7058l.setAccessible(true);
                    } catch (ReflectiveOperationException e) {
/* 75 */                AbstractC1245n0.m4877e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                    }
/* 78 */            f7054h = true;
                }

                @Override // p000.j83
                /* JADX INFO: renamed from: d */
                public void mo2969d(View view) {
/* 1 */             ly0 ly0VarM2967u = m2967u(view);
/* 5 */             if (ly0VarM2967u == null) {
/* 7 */                 ly0VarM2967u = ly0.f13527e;
                    }
/* 9 */             m2977w(ly0VarM2967u);
                }

                @Override // p000.j83
                public boolean equals(Object obj) {
/* 5 */             if (super.equals(obj)) {
/* 15 */                return Objects.equals(this.f7063g, ((d83) obj).f7063g);
                    }
/* 7 */             return false;
                }

                @Override // p000.j83
                /* JADX INFO: renamed from: f */
                public ly0 mo2970f(int i) {
/* 2 */             return m2965r(i, false);
                }

                @Override // p000.j83
                /* JADX INFO: renamed from: j */
                public final ly0 mo2971j() {
/* 3 */             if (this.f7061e == null) {
/* 5 */                 WindowInsets windowInsets = this.f7059c;
/* 27 */                this.f7061e = ly0.m6573a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                    }
/* 29 */            return this.f7061e;
                }

                @Override // p000.j83
                /* JADX INFO: renamed from: l */
                public m83 mo2972l(int i, int i2, int i3, int i4) {
                    c83 a83Var;
/* 4 */             m83 m83VarM6620h = m83.m6620h(this.f7059c, null);
/* 8 */             int i5 = Build.VERSION.SDK_INT;
/* 12 */            if (i5 >= 30) {
/* 16 */                a83Var = new b83(m83VarM6620h);
                    } else {
/* 32 */                a83Var = i5 >= 29 ? new a83(m83VarM6620h) : new z73(m83VarM6620h);
                    }
/* 43 */            a83Var.mo108d(m83.m6619e(mo2971j(), i, i2, i3, i4));
/* 54 */            a83Var.mo107c(m83.m6619e(mo3341h(), i, i2, i3, i4));
/* 57 */            return a83Var.mo106b();
                }

                @Override // p000.j83
                /* JADX INFO: renamed from: n */
                public boolean mo2973n() {
/* 3 */             return this.f7059c.isRound();
                }

                @Override // p000.j83
                /* JADX INFO: renamed from: o */
                public void mo2974o(ly0[] ly0VarArr) {
/* 1 */             this.f7060d = ly0VarArr;
                }

                @Override // p000.j83
                /* JADX INFO: renamed from: p */
                public void mo2975p(m83 m83Var) {
/* 1 */             this.f7062f = m83Var;
                }

                /* JADX INFO: renamed from: s */
                public ly0 m2976s(int i, boolean z) {
                    ly0 ly0VarMo3341h;
                    int i2;
/* 3 */             if (i == 1) {
                        return z ? ly0.m6573a(0, Math.max(m2966t().f13529b, mo2971j().f13529b), 0, 0) : ly0.m6573a(0, mo2971j().f13529b, 0, 0);
                    }
/* 7 */             if (i == 2) {
/* 165 */               if (z) {
/* 167 */                   ly0 ly0VarM2966t = m2966t();
/* 171 */                   ly0 ly0VarMo3341h2 = mo3341h();
/* 199 */                   return ly0.m6573a(Math.max(ly0VarM2966t.f13528a, ly0VarMo3341h2.f13528a), 0, Math.max(ly0VarM2966t.f13530c, ly0VarMo3341h2.f13530c), Math.max(ly0VarM2966t.f13531d, ly0VarMo3341h2.f13531d));
                        }
/* 204 */               ly0 ly0VarMo2971j = mo2971j();
/* 208 */               m83 m83Var = this.f7062f;
/* 214 */               ly0VarMo3341h = m83Var != null ? m83Var.f13660a.mo3341h() : null;
/* 218 */               int iMin = ly0VarMo2971j.f13531d;
/* 220 */               if (ly0VarMo3341h != null) {
/* 224 */                   iMin = Math.min(iMin, ly0VarMo3341h.f13531d);
                        }
/* 232 */               return ly0.m6573a(ly0VarMo2971j.f13528a, 0, ly0VarMo2971j.f13530c, iMin);
                    }
/* 11 */            ly0 ly0Var = ly0.f13527e;
/* 13 */            if (i == 8) {
/* 112 */               ly0[] ly0VarArr = this.f7060d;
/* 117 */               ly0VarMo3341h = ly0VarArr != null ? ly0VarArr[3] : null;
/* 119 */               if (ly0VarMo3341h != null) {
/* 121 */                   return ly0VarMo3341h;
                        }
/* 122 */               ly0 ly0VarMo2971j2 = mo2971j();
/* 126 */               ly0 ly0VarM2966t2 = m2966t();
/* 130 */               int i3 = ly0VarMo2971j2.f13531d;
/* 134 */               if (i3 > ly0VarM2966t2.f13531d) {
/* 136 */                   return ly0.m6573a(0, 0, 0, i3);
                        }
/* 141 */               ly0 ly0Var2 = this.f7063g;
/* 143 */               if (ly0Var2 != null && !ly0Var2.equals(ly0Var) && (i2 = this.f7063g.f13531d) > ly0VarM2966t2.f13531d) {
/* 159 */                   return ly0.m6573a(0, 0, 0, i2);
                        }
                    } else {
/* 17 */                if (i == 16) {
/* 107 */                   return mo4133i();
                        }
/* 21 */                if (i == 32) {
/* 102 */                   return mo4132g();
                        }
/* 25 */                if (i == 64) {
/* 97 */                    return mo4134k();
                        }
/* 29 */                if (i == 128) {
/* 33 */                    m83 m83Var2 = this.f7062f;
/* 44 */                    b90 b90VarMo3678e = m83Var2 != null ? m83Var2.f13660a.mo3678e() : mo3678e();
/* 48 */                    if (b90VarMo3678e != null) {
/* 50 */                        int i4 = Build.VERSION.SDK_INT;
/* 92 */                        return ly0.m6573a(i4 >= 28 ? a90.m112d(b90VarMo3678e.f2329a) : 0, i4 >= 28 ? a90.m114f(b90VarMo3678e.f2329a) : 0, i4 >= 28 ? a90.m113e(b90VarMo3678e.f2329a) : 0, i4 >= 28 ? a90.m111c(b90VarMo3678e.f2329a) : 0);
                            }
                        }
                    }
/* 164 */           return ly0Var;
                }

                /* JADX INFO: renamed from: w */
                public void m2977w(ly0 ly0Var) {
/* 1 */             this.f7063g = ly0Var;
                }
            }
