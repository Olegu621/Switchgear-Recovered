            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.os.Build;
            import android.view.InflateException;
            import android.view.Menu;
            import android.view.MenuItem;
            import android.view.View;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.Constructor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xi2 {

                /* JADX INFO: renamed from: A */
                public CharSequence f19169A;

                /* JADX INFO: renamed from: B */
                public CharSequence f19170B;

                /* JADX INFO: renamed from: E */
                public final /* synthetic */ yi2 f19173E;

                /* JADX INFO: renamed from: a */
                public final Menu f19174a;

                /* JADX INFO: renamed from: h */
                public boolean f19181h;

                /* JADX INFO: renamed from: i */
                public int f19182i;

                /* JADX INFO: renamed from: j */
                public int f19183j;

                /* JADX INFO: renamed from: k */
                public CharSequence f19184k;

                /* JADX INFO: renamed from: l */
                public CharSequence f19185l;

                /* JADX INFO: renamed from: m */
                public int f19186m;

                /* JADX INFO: renamed from: n */
                public char f19187n;

                /* JADX INFO: renamed from: o */
                public int f19188o;

                /* JADX INFO: renamed from: p */
                public char f19189p;

                /* JADX INFO: renamed from: q */
                public int f19190q;

                /* JADX INFO: renamed from: r */
                public int f19191r;

                /* JADX INFO: renamed from: s */
                public boolean f19192s;

                /* JADX INFO: renamed from: t */
                public boolean f19193t;

                /* JADX INFO: renamed from: u */
                public boolean f19194u;

                /* JADX INFO: renamed from: v */
                public int f19195v;

                /* JADX INFO: renamed from: w */
                public int f19196w;

                /* JADX INFO: renamed from: x */
                public String f19197x;

                /* JADX INFO: renamed from: y */
                public String f19198y;

                /* JADX INFO: renamed from: z */
                public AbstractC1815k2 f19199z;

                /* JADX INFO: renamed from: C */
                public ColorStateList f19171C = null;

                /* JADX INFO: renamed from: D */
                public PorterDuff.Mode f19172D = null;

                /* JADX INFO: renamed from: b */
                public int f19175b = 0;

                /* JADX INFO: renamed from: c */
                public int f19176c = 0;

                /* JADX INFO: renamed from: d */
                public int f19177d = 0;

                /* JADX INFO: renamed from: e */
                public int f19178e = 0;

                /* JADX INFO: renamed from: f */
                public boolean f19179f = true;

                /* JADX INFO: renamed from: g */
                public boolean f19180g = true;

                public xi2(yi2 yi2Var, Menu menu) {
/* 4 */             this.f19173E = yi2Var;
/* 11 */            this.f19174a = menu;
                }

                /* JADX INFO: renamed from: a */
                public final Object m9970a(String str, Class[] clsArr, Object[] objArr) {
                    try {
/* 14 */                Constructor<?> constructor = Class.forName(str, false, this.f19173E.f19649c.getClassLoader()).getConstructor(clsArr);
/* 19 */                constructor.setAccessible(true);
/* 22 */                return constructor.newInstance(objArr);
                    } catch (Exception e) {
/* 44 */                AbstractC1245n0.m4891s("SupportMenuInflater", "Cannot instantiate class: " + str, e);
/* 47 */                return null;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m9971b(MenuItem menuItem) {
/* 1 */             yi2 yi2Var = this.f19173E;
/* 3 */             Context context = yi2Var.f19649c;
/* 25 */            boolean z = false;
/* 44 */            menuItem.setChecked(this.f19192s).setVisible(this.f19193t).setEnabled(this.f19194u).setCheckable(this.f19191r >= 1).setTitleCondensed(this.f19185l).setIcon(this.f19186m);
/* 47 */            int i = this.f19195v;
/* 49 */            if (i >= 0) {
/* 51 */                menuItem.setShowAsAction(i);
                    }
/* 56 */            if (this.f19198y != null) {
/* 62 */                if (context.isRestricted()) {
/* 132 */                   f42.m3656l("The android:onClick attribute cannot be used within a restricted context");
/* 135 */                   return;
                        }
/* 68 */                if (yi2Var.f19650d == null) {
/* 74 */                    yi2Var.f19650d = yi2.m10150a(context);
                        }
/* 76 */                Object obj = yi2Var.f19650d;
/* 78 */                String str = this.f19198y;
/* 80 */                wi2 wi2Var = new wi2();
/* 83 */                wi2Var.f18655b = obj;
/* 85 */                Class<?> cls = obj.getClass();
                        try {
/* 95 */                    wi2Var.f18656c = cls.getMethod(str, wi2.f18653d);
/* 97 */                    menuItem.setOnMenuItemClickListener(wi2Var);
                        } catch (Exception e) {
/* 108 */                   StringBuilder sbM3513q = AbstractC0886en.m3513q("Couldn't resolve menu item onClick handler ", str, " in class ");
/* 116 */                   sbM3513q.append(cls.getName());
/* 123 */                   InflateException inflateException = new InflateException(sbM3513q.toString());
/* 126 */                   inflateException.initCause(e);
/* 129 */                   throw inflateException;
                        }
                    }
/* 139 */           if (this.f19191r >= 2) {
/* 143 */               if (menuItem instanceof sg1) {
/* 148 */                   ((sg1) menuItem).m8503f(true);
                        } else if (menuItem instanceof wg1) {
/* 157 */                   wg1 wg1Var = (wg1) menuItem;
/* 159 */                   zi2 zi2Var = wg1Var.f18615c;
                            try {
/* 163 */                       if (wg1Var.f18616d == null) {
/* 181 */                           wg1Var.f18616d = zi2Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                                }
/* 194 */                       wg1Var.f18616d.invoke(zi2Var, Boolean.TRUE);
                            } catch (Exception e2) {
/* 202 */                       AbstractC1245n0.m4891s("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                            }
                        }
                    }
/* 205 */           String str2 = this.f19197x;
/* 207 */           if (str2 != null) {
/* 219 */               menuItem.setActionView((View) m9970a(str2, yi2.f19645e, yi2Var.f19647a));
/* 222 */               z = true;
                    }
/* 223 */           int i2 = this.f19196w;
/* 225 */           if (i2 > 0) {
/* 227 */               if (z) {
/* 237 */                   AbstractC1245n0.m4889q("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                        } else {
/* 229 */                   menuItem.setActionView(i2);
                        }
                    }
/* 240 */           AbstractC1815k2 abstractC1815k2 = this.f19199z;
/* 242 */           if (abstractC1815k2 != null) {
/* 246 */               if (menuItem instanceof zi2) {
/* 251 */                   ((zi2) menuItem).mo37a(abstractC1815k2);
                        } else {
/* 259 */                   AbstractC1245n0.m4889q("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                        }
                    }
/* 262 */           CharSequence charSequence = this.f19169A;
/* 264 */           boolean z2 = menuItem instanceof zi2;
/* 268 */           if (z2) {
/* 273 */               ((zi2) menuItem).setContentDescription(charSequence);
                    } else if (Build.VERSION.SDK_INT >= 26) {
/* 281 */               qg1.m7797h(menuItem, charSequence);
                    }
/* 284 */           CharSequence charSequence2 = this.f19170B;
/* 286 */           if (z2) {
/* 291 */               ((zi2) menuItem).setTooltipText(charSequence2);
                    } else if (Build.VERSION.SDK_INT >= 26) {
/* 299 */               qg1.m7802m(menuItem, charSequence2);
                    }
/* 302 */           char c = this.f19187n;
/* 304 */           int i3 = this.f19188o;
/* 306 */           if (z2) {
/* 311 */               ((zi2) menuItem).setAlphabeticShortcut(c, i3);
                    } else if (Build.VERSION.SDK_INT >= 26) {
/* 319 */               qg1.m7796g(menuItem, c, i3);
                    }
/* 322 */           char c2 = this.f19189p;
/* 324 */           int i4 = this.f19190q;
/* 326 */           if (z2) {
/* 331 */               ((zi2) menuItem).setNumericShortcut(c2, i4);
                    } else if (Build.VERSION.SDK_INT >= 26) {
/* 339 */               qg1.m7800k(menuItem, c2, i4);
                    }
/* 342 */           PorterDuff.Mode mode = this.f19172D;
/* 344 */           if (mode != null) {
/* 346 */               if (z2) {
/* 351 */                   ((zi2) menuItem).setIconTintMode(mode);
                        } else if (Build.VERSION.SDK_INT >= 26) {
/* 359 */                   qg1.m7799j(menuItem, mode);
                        }
                    }
/* 362 */           ColorStateList colorStateList = this.f19171C;
/* 364 */           if (colorStateList != null) {
/* 366 */               if (z2) {
/* 370 */                   ((zi2) menuItem).setIconTintList(colorStateList);
                        } else if (Build.VERSION.SDK_INT >= 26) {
/* 378 */                   qg1.m7798i(menuItem, colorStateList);
                        }
                    }
                }
            }
