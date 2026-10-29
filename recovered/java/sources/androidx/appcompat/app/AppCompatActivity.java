            package androidx.appcompat.app;

            import android.R;
            import android.app.Activity;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.content.res.Configuration;
            import android.content.res.Resources;
            import android.os.Build;
            import android.os.Bundle;
            import android.view.ContextThemeWrapper;
            import android.view.KeyEvent;
            import android.view.Menu;
            import android.view.MenuInflater;
            import android.view.MenuItem;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import androidx.appcompat.R$style;
            import androidx.appcompat.widget.Toolbar;
            import androidx.fragment.app.FragmentActivity;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import p000.AbstractC1021ia;
            import p000.AbstractC1778j2;
            import p000.AbstractC1957na;
            import p000.AbstractC2165s1;
            import p000.C0012aa;
            import p000.C1951n4;
            import p000.C2491ya;
            import p000.C2527z9;
            import p000.ExecutorC0984ha;
            import p000.InterfaceC0209ca;
            import p000.InterfaceC1013i2;
            import p000.InterfaceC2277v1;
            import p000.LayoutInflaterFactory2C2324wa;
            import p000.RunnableC0873ea;
            import p000.c42;
            import p000.f42;
            import p000.h91;
            import p000.j13;
            import p000.py0;
            import p000.t73;
            import p000.ta1;
            import p000.v00;
            import p000.v13;
            import p000.w11;
            import p000.x32;
            import p000.xm2;
            import p000.xp2;
            import p000.xt0;
            import p000.yi2;
            import p000.z00;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public class AppCompatActivity extends FragmentActivity implements InterfaceC0209ca {
                private static final String DELEGATE_TAG = "androidx:appcompat";
                private AbstractC1021ia mDelegate;
                private Resources mResources;

                public AppCompatActivity() {
/* 15 */            getSavedStateRegistry().m9724c(DELEGATE_TAG, new C2527z9(this));
/* 23 */            addOnContextAvailableListener(new C0012aa(this));
                }

                @Override // androidx.activity.ComponentActivity, android.app.Activity
                public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
/* 1 */             initializeViewTreeOwners();
/* 8 */             LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = (LayoutInflaterFactory2C2324wa) getDelegate();
/* 10 */            layoutInflaterFactory2C2324wa.m9507w();
/* 24 */            ((ViewGroup) layoutInflaterFactory2C2324wa.f18526l0.findViewById(R.id.content)).addView(view, layoutParams);
/* 35 */            layoutInflaterFactory2C2324wa.f18512X.m7743a(layoutInflaterFactory2C2324wa.f18511W.getCallback());
                }

                /* JADX WARN: Code duplicated, block: B:101:0x019b  */
                /* JADX WARN: Code duplicated, block: B:104:0x01b3  */
                /* JADX WARN: Code duplicated, block: B:107:0x01c2  */
                /* JADX WARN: Code duplicated, block: B:110:0x01cd  */
                /* JADX WARN: Code duplicated, block: B:113:0x01d5  */
                /* JADX WARN: Code duplicated, block: B:116:0x01dd  */
                /* JADX WARN: Code duplicated, block: B:119:0x01e5  */
                /* JADX WARN: Code duplicated, block: B:120:0x01e8  */
                /* JADX WARN: Code duplicated, block: B:124:0x01fd  */
                /* JADX WARN: Code duplicated, block: B:126:0x0207  */
                /* JADX WARN: Code duplicated, block: B:127:0x020b  */
                /* JADX WARN: Code duplicated, block: B:152:0x020e A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:160:0x0228 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:162:0x0212 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:44:0x0098  */
                /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
                /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
                /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
                /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
                /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
                /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
                /* JADX WARN: Code duplicated, block: B:63:0x00fa  */
                /* JADX WARN: Code duplicated, block: B:66:0x0105  */
                /* JADX WARN: Code duplicated, block: B:69:0x010d  */
                /* JADX WARN: Code duplicated, block: B:72:0x0115  */
                /* JADX WARN: Code duplicated, block: B:75:0x011d  */
                /* JADX WARN: Code duplicated, block: B:78:0x0125  */
                /* JADX WARN: Code duplicated, block: B:81:0x012d  */
                /* JADX WARN: Code duplicated, block: B:84:0x0139  */
                /* JADX WARN: Code duplicated, block: B:87:0x0148  */
                /* JADX WARN: Code duplicated, block: B:90:0x0157  */
                /* JADX WARN: Code duplicated, block: B:93:0x0166  */
                /* JADX WARN: Code duplicated, block: B:96:0x0171  */
                /* JADX WARN: Code duplicated, block: B:98:0x017f  */
                @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
                public void attachBaseContext(Context context) {
                    Configuration configuration;
                    Configuration configuration2;
                    Configuration configuration3;
                    z00 z00Var;
                    Resources.Theme theme;
                    Method method;
                    float f;
                    float f2;
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    int i11;
                    int i12;
                    int i13;
                    int i14;
                    int i15;
                    int i16;
                    int i17;
                    int i18;
                    int i19;
                    int i20;
                    int i21;
                    int i22;
                    int i23;
                    int i24;
                    int i25;
                    int i26;
                    int i27;
                    int i28;
                    int i29;
                    int i30;
                    int i31;
                    int i32;
                    int i33;
                    int i34;
                    int i35;
                    int i36;
/* 5 */             LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = (LayoutInflaterFactory2C2324wa) getDelegate();
/* 8 */             layoutInflaterFactory2C2324wa.f18540z0 = true;
/* 10 */            int i37 = layoutInflaterFactory2C2324wa.f18494D0;
/* 14 */            if (i37 == -100) {
/* 17 */                i37 = AbstractC1021ia.f9503b;
                    }
/* 19 */            int iM9493C = layoutInflaterFactory2C2324wa.m9493C(context, i37);
/* 27 */            int i38 = 0;
/* 28 */            if (AbstractC1021ia.m4499b(context) && AbstractC1021ia.m4499b(context)) {
/* 41 */                if (Build.VERSION.SDK_INT < 33) {
                            synchronized (AbstractC1021ia.f9510w) {
                                try {
/* 61 */                            h91 h91Var = AbstractC1021ia.f9504c;
/* 63 */                            if (h91Var == null) {
/* 67 */                                if (AbstractC1021ia.f9505d == null) {
/* 77 */                                    AbstractC1021ia.f9505d = h91.m4135a(w11.m9393C(context));
                                        }
/* 92 */                                if (!AbstractC1021ia.f9505d.f8973a.f9500a.isEmpty()) {
/* 98 */                                    AbstractC1021ia.f9504c = AbstractC1021ia.f9505d;
                                        }
                                    } else if (!h91Var.equals(AbstractC1021ia.f9505d)) {
/* 109 */                               h91 h91Var2 = AbstractC1021ia.f9504c;
/* 111 */                               AbstractC1021ia.f9505d = h91Var2;
/* 121 */                               w11.m9454x(context, h91Var2.f8973a.f9500a.toLanguageTags());
                                    }
                                } catch (Throwable th) {
/* 127 */                           throw th;
                                }
                            }
                        } else if (!AbstractC1021ia.f9507f) {
/* 54 */                    AbstractC1021ia.f9502a.execute(new RunnableC0873ea(context, i38));
                        }
                    }
/* 128 */           h91 h91VarM9489p = LayoutInflaterFactory2C2324wa.m9489p(context);
/* 135 */           if (context instanceof ContextThemeWrapper) {
                        try {
/* 144 */                   ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C2324wa.m9490t(context, iM9493C, h91VarM9489p, null, false));
                        } catch (IllegalStateException unused) {
/* 151 */                   if (context instanceof z00) {
                                try {
/* 160 */                           ((z00) context).m10231a(LayoutInflaterFactory2C2324wa.m9490t(context, iM9493C, h91VarM9489p, null, false));
                                } catch (IllegalStateException unused2) {
/* 167 */                           if (LayoutInflaterFactory2C2324wa.f18490U0) {
/* 173 */                               Configuration configuration4 = new Configuration();
/* 177 */                               configuration4.uiMode = -1;
/* 180 */                               configuration4.fontScale = 0.0f;
/* 190 */                               configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
/* 198 */                               configuration2 = context.getResources().getConfiguration();
/* 204 */                               configuration.uiMode = configuration2.uiMode;
/* 210 */                               if (configuration.equals(configuration2)) {
/* 489 */                                   configuration3 = null;
                                        } else {
/* 214 */                                   configuration3 = new Configuration();
/* 217 */                                   configuration3.fontScale = 0.0f;
/* 223 */                                   if (configuration.diff(configuration2) != 0) {
/* 227 */                                       f = configuration.fontScale;
/* 229 */                                       f2 = configuration2.fontScale;
/* 233 */                                       if (f != f2) {
/* 235 */                                           configuration3.fontScale = f2;
                                                }
/* 237 */                                       i = configuration.mcc;
/* 239 */                                       i2 = configuration2.mcc;
/* 241 */                                       if (i != i2) {
/* 243 */                                           configuration3.mcc = i2;
                                                }
/* 245 */                                       i3 = configuration.mnc;
/* 247 */                                       i4 = configuration2.mnc;
/* 249 */                                       if (i3 != i4) {
/* 251 */                                           configuration3.mnc = i4;
                                                }
/* 253 */                                       AbstractC1957na.m6951a(configuration, configuration2, configuration3);
/* 256 */                                       i5 = configuration.touchscreen;
/* 258 */                                       i6 = configuration2.touchscreen;
/* 260 */                                       if (i5 != i6) {
/* 262 */                                           configuration3.touchscreen = i6;
                                                }
/* 264 */                                       i7 = configuration.keyboard;
/* 266 */                                       i8 = configuration2.keyboard;
/* 268 */                                       if (i7 != i8) {
/* 270 */                                           configuration3.keyboard = i8;
                                                }
/* 272 */                                       i9 = configuration.keyboardHidden;
/* 274 */                                       i10 = configuration2.keyboardHidden;
/* 276 */                                       if (i9 != i10) {
/* 278 */                                           configuration3.keyboardHidden = i10;
                                                }
/* 280 */                                       i11 = configuration.navigation;
/* 282 */                                       i12 = configuration2.navigation;
/* 284 */                                       if (i11 != i12) {
/* 286 */                                           configuration3.navigation = i12;
                                                }
/* 288 */                                       i13 = configuration.navigationHidden;
/* 290 */                                       i14 = configuration2.navigationHidden;
/* 292 */                                       if (i13 != i14) {
/* 294 */                                           configuration3.navigationHidden = i14;
                                                }
/* 296 */                                       i15 = configuration.orientation;
/* 298 */                                       i16 = configuration2.orientation;
/* 300 */                                       if (i15 != i16) {
/* 302 */                                           configuration3.orientation = i16;
                                                }
/* 306 */                                       i17 = configuration.screenLayout & 15;
/* 310 */                                       i18 = configuration2.screenLayout & 15;
/* 312 */                                       if (i17 != i18) {
/* 317 */                                           configuration3.screenLayout |= i18;
                                                }
/* 321 */                                       i19 = configuration.screenLayout & 192;
/* 325 */                                       i20 = configuration2.screenLayout & 192;
/* 327 */                                       if (i19 != i20) {
/* 332 */                                           configuration3.screenLayout |= i20;
                                                }
/* 336 */                                       i21 = configuration.screenLayout & 48;
/* 340 */                                       i22 = configuration2.screenLayout & 48;
/* 342 */                                       if (i21 != i22) {
/* 347 */                                           configuration3.screenLayout |= i22;
                                                }
/* 351 */                                       i23 = configuration.screenLayout & 768;
/* 355 */                                       i24 = configuration2.screenLayout & 768;
/* 357 */                                       if (i23 != i24) {
/* 362 */                                           configuration3.screenLayout |= i24;
                                                }
/* 368 */                                       if (Build.VERSION.SDK_INT >= 26) {
/* 382 */                                           if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
/* 1 */                                                 configuration3.colorMode |= configuration2.colorMode & 3;
                                                    }
/* 410 */                                           if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
/* 1 */                                                 configuration3.colorMode |= configuration2.colorMode & 12;
                                                    }
                                                }
/* 428 */                                       i25 = configuration.uiMode & 15;
/* 432 */                                       i26 = configuration2.uiMode & 15;
/* 434 */                                       if (i25 != i26) {
/* 439 */                                           configuration3.uiMode |= i26;
                                                }
/* 443 */                                       i27 = configuration.uiMode & 48;
/* 447 */                                       i28 = configuration2.uiMode & 48;
/* 449 */                                       if (i27 != i28) {
/* 454 */                                           configuration3.uiMode |= i28;
                                                }
/* 456 */                                       i29 = configuration.screenWidthDp;
/* 458 */                                       i30 = configuration2.screenWidthDp;
/* 460 */                                       if (i29 != i30) {
/* 462 */                                           configuration3.screenWidthDp = i30;
                                                }
/* 464 */                                       i31 = configuration.screenHeightDp;
/* 466 */                                       i32 = configuration2.screenHeightDp;
/* 468 */                                       if (i31 != i32) {
/* 470 */                                           configuration3.screenHeightDp = i32;
                                                }
/* 472 */                                       i33 = configuration.smallestScreenWidthDp;
/* 474 */                                       i34 = configuration2.smallestScreenWidthDp;
/* 476 */                                       if (i33 != i34) {
/* 478 */                                           configuration3.smallestScreenWidthDp = i34;
                                                }
/* 480 */                                       i35 = configuration.densityDpi;
/* 482 */                                       i36 = configuration2.densityDpi;
/* 484 */                                       if (i35 != i36) {
/* 486 */                                           configuration3.densityDpi = i36;
                                                }
                                            }
                                        }
/* 490 */                               Configuration configurationM9490t = LayoutInflaterFactory2C2324wa.m9490t(context, iM9493C, h91VarM9489p, configuration3, true);
/* 498 */                               z00Var = new z00(context, R$style.Theme_AppCompat_Empty);
/* 501 */                               z00Var.m10231a(configurationM9490t);
                                        try {
/* 508 */                                   if (context.getTheme() != null) {
/* 510 */                                       theme = z00Var.getTheme();
/* 518 */                                       if (Build.VERSION.SDK_INT >= 29) {
/* 520 */                                           c42.m1526a(theme);
                                                } else {
                                                    synchronized (j13.f12003m) {
/* 529 */                                               if (!j13.f12005o) {
                                                            try {
/* 535 */                                                       Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
/* 539 */                                                       j13.f12004n = declaredMethod;
/* 541 */                                                       declaredMethod.setAccessible(true);
                                                            } catch (NoSuchMethodException unused3) {
                                                            }
/* 547 */                                                   j13.f12005o = true;
                                                        }
/* 549 */                                               method = j13.f12004n;
/* 551 */                                               if (method != null) {
                                                            try {
/* 553 */                                                       method.invoke(theme, null);
                                                            } catch (IllegalAccessException | InvocationTargetException unused4) {
/* 557 */                                                       j13.f12004n = null;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (NullPointerException unused5) {
                                        }
/* 563 */                               context = z00Var;
                                    }
                                }
                            } else if (LayoutInflaterFactory2C2324wa.f18490U0) {
/* 173 */                       Configuration configuration5 = new Configuration();
/* 177 */                       configuration5.uiMode = -1;
/* 180 */                       configuration5.fontScale = 0.0f;
/* 190 */                       configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
/* 198 */                       configuration2 = context.getResources().getConfiguration();
/* 204 */                       configuration.uiMode = configuration2.uiMode;
/* 210 */                       if (configuration.equals(configuration2)) {
/* 214 */                           configuration3 = new Configuration();
/* 217 */                           configuration3.fontScale = 0.0f;
/* 223 */                           if (configuration.diff(configuration2) != 0) {
/* 227 */                               f = configuration.fontScale;
/* 229 */                               f2 = configuration2.fontScale;
/* 233 */                               if (f != f2) {
/* 235 */                                   configuration3.fontScale = f2;
                                        }
/* 237 */                               i = configuration.mcc;
/* 239 */                               i2 = configuration2.mcc;
/* 241 */                               if (i != i2) {
/* 243 */                                   configuration3.mcc = i2;
                                        }
/* 245 */                               i3 = configuration.mnc;
/* 247 */                               i4 = configuration2.mnc;
/* 249 */                               if (i3 != i4) {
/* 251 */                                   configuration3.mnc = i4;
                                        }
/* 253 */                               AbstractC1957na.m6951a(configuration, configuration2, configuration3);
/* 256 */                               i5 = configuration.touchscreen;
/* 258 */                               i6 = configuration2.touchscreen;
/* 260 */                               if (i5 != i6) {
/* 262 */                                   configuration3.touchscreen = i6;
                                        }
/* 264 */                               i7 = configuration.keyboard;
/* 266 */                               i8 = configuration2.keyboard;
/* 268 */                               if (i7 != i8) {
/* 270 */                                   configuration3.keyboard = i8;
                                        }
/* 272 */                               i9 = configuration.keyboardHidden;
/* 274 */                               i10 = configuration2.keyboardHidden;
/* 276 */                               if (i9 != i10) {
/* 278 */                                   configuration3.keyboardHidden = i10;
                                        }
/* 280 */                               i11 = configuration.navigation;
/* 282 */                               i12 = configuration2.navigation;
/* 284 */                               if (i11 != i12) {
/* 286 */                                   configuration3.navigation = i12;
                                        }
/* 288 */                               i13 = configuration.navigationHidden;
/* 290 */                               i14 = configuration2.navigationHidden;
/* 292 */                               if (i13 != i14) {
/* 294 */                                   configuration3.navigationHidden = i14;
                                        }
/* 296 */                               i15 = configuration.orientation;
/* 298 */                               i16 = configuration2.orientation;
/* 300 */                               if (i15 != i16) {
/* 302 */                                   configuration3.orientation = i16;
                                        }
/* 306 */                               i17 = configuration.screenLayout & 15;
/* 310 */                               i18 = configuration2.screenLayout & 15;
/* 312 */                               if (i17 != i18) {
/* 317 */                                   configuration3.screenLayout |= i18;
                                        }
/* 321 */                               i19 = configuration.screenLayout & 192;
/* 325 */                               i20 = configuration2.screenLayout & 192;
/* 327 */                               if (i19 != i20) {
/* 332 */                                   configuration3.screenLayout |= i20;
                                        }
/* 336 */                               i21 = configuration.screenLayout & 48;
/* 340 */                               i22 = configuration2.screenLayout & 48;
/* 342 */                               if (i21 != i22) {
/* 347 */                                   configuration3.screenLayout |= i22;
                                        }
/* 351 */                               i23 = configuration.screenLayout & 768;
/* 355 */                               i24 = configuration2.screenLayout & 768;
/* 357 */                               if (i23 != i24) {
/* 362 */                                   configuration3.screenLayout |= i24;
                                        }
/* 368 */                               if (Build.VERSION.SDK_INT >= 26) {
/* 382 */                                   if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
/* 1 */                                         configuration3.colorMode |= configuration2.colorMode & 3;
                                            }
/* 410 */                                   if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
/* 1 */                                         configuration3.colorMode |= configuration2.colorMode & 12;
                                            }
                                        }
/* 428 */                               i25 = configuration.uiMode & 15;
/* 432 */                               i26 = configuration2.uiMode & 15;
/* 434 */                               if (i25 != i26) {
/* 439 */                                   configuration3.uiMode |= i26;
                                        }
/* 443 */                               i27 = configuration.uiMode & 48;
/* 447 */                               i28 = configuration2.uiMode & 48;
/* 449 */                               if (i27 != i28) {
/* 454 */                                   configuration3.uiMode |= i28;
                                        }
/* 456 */                               i29 = configuration.screenWidthDp;
/* 458 */                               i30 = configuration2.screenWidthDp;
/* 460 */                               if (i29 != i30) {
/* 462 */                                   configuration3.screenWidthDp = i30;
                                        }
/* 464 */                               i31 = configuration.screenHeightDp;
/* 466 */                               i32 = configuration2.screenHeightDp;
/* 468 */                               if (i31 != i32) {
/* 470 */                                   configuration3.screenHeightDp = i32;
                                        }
/* 472 */                               i33 = configuration.smallestScreenWidthDp;
/* 474 */                               i34 = configuration2.smallestScreenWidthDp;
/* 476 */                               if (i33 != i34) {
/* 478 */                                   configuration3.smallestScreenWidthDp = i34;
                                        }
/* 480 */                               i35 = configuration.densityDpi;
/* 482 */                               i36 = configuration2.densityDpi;
/* 484 */                               if (i35 != i36) {
/* 486 */                                   configuration3.densityDpi = i36;
                                        }
                                    }
                                } else {
/* 489 */                           configuration3 = null;
                                }
/* 490 */                       Configuration configurationM9490t2 = LayoutInflaterFactory2C2324wa.m9490t(context, iM9493C, h91VarM9489p, configuration3, true);
/* 498 */                       z00Var = new z00(context, R$style.Theme_AppCompat_Empty);
/* 501 */                       z00Var.m10231a(configurationM9490t2);
/* 508 */                       if (context.getTheme() != null) {
/* 510 */                           theme = z00Var.getTheme();
/* 518 */                           if (Build.VERSION.SDK_INT >= 29) {
/* 520 */                               c42.m1526a(theme);
                                    } else {
                                        synchronized (j13.f12003m) {
/* 529 */                                   if (!j13.f12005o) {
/* 535 */                                       Method declaredMethod2 = Resources.Theme.class.getDeclaredMethod("rebase", null);
/* 539 */                                       j13.f12004n = declaredMethod2;
/* 541 */                                       declaredMethod2.setAccessible(true);
/* 547 */                                       j13.f12005o = true;
                                            }
/* 549 */                                   method = j13.f12004n;
/* 551 */                                   if (method != null) {
/* 553 */                                       method.invoke(theme, null);
                                            }
                                        }
                                    }
                                }
/* 563 */                       context = z00Var;
                            }
                        }
                    } else if (context instanceof z00) {
/* 160 */               ((z00) context).m10231a(LayoutInflaterFactory2C2324wa.m9490t(context, iM9493C, h91VarM9489p, null, false));
                    } else if (LayoutInflaterFactory2C2324wa.f18490U0) {
/* 173 */               Configuration configuration6 = new Configuration();
/* 177 */               configuration6.uiMode = -1;
/* 180 */               configuration6.fontScale = 0.0f;
/* 190 */               configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
/* 198 */               configuration2 = context.getResources().getConfiguration();
/* 204 */               configuration.uiMode = configuration2.uiMode;
/* 210 */               if (configuration.equals(configuration2)) {
/* 214 */                   configuration3 = new Configuration();
/* 217 */                   configuration3.fontScale = 0.0f;
/* 223 */                   if (configuration.diff(configuration2) != 0) {
/* 227 */                       f = configuration.fontScale;
/* 229 */                       f2 = configuration2.fontScale;
/* 233 */                       if (f != f2) {
/* 235 */                           configuration3.fontScale = f2;
                                }
/* 237 */                       i = configuration.mcc;
/* 239 */                       i2 = configuration2.mcc;
/* 241 */                       if (i != i2) {
/* 243 */                           configuration3.mcc = i2;
                                }
/* 245 */                       i3 = configuration.mnc;
/* 247 */                       i4 = configuration2.mnc;
/* 249 */                       if (i3 != i4) {
/* 251 */                           configuration3.mnc = i4;
                                }
/* 253 */                       AbstractC1957na.m6951a(configuration, configuration2, configuration3);
/* 256 */                       i5 = configuration.touchscreen;
/* 258 */                       i6 = configuration2.touchscreen;
/* 260 */                       if (i5 != i6) {
/* 262 */                           configuration3.touchscreen = i6;
                                }
/* 264 */                       i7 = configuration.keyboard;
/* 266 */                       i8 = configuration2.keyboard;
/* 268 */                       if (i7 != i8) {
/* 270 */                           configuration3.keyboard = i8;
                                }
/* 272 */                       i9 = configuration.keyboardHidden;
/* 274 */                       i10 = configuration2.keyboardHidden;
/* 276 */                       if (i9 != i10) {
/* 278 */                           configuration3.keyboardHidden = i10;
                                }
/* 280 */                       i11 = configuration.navigation;
/* 282 */                       i12 = configuration2.navigation;
/* 284 */                       if (i11 != i12) {
/* 286 */                           configuration3.navigation = i12;
                                }
/* 288 */                       i13 = configuration.navigationHidden;
/* 290 */                       i14 = configuration2.navigationHidden;
/* 292 */                       if (i13 != i14) {
/* 294 */                           configuration3.navigationHidden = i14;
                                }
/* 296 */                       i15 = configuration.orientation;
/* 298 */                       i16 = configuration2.orientation;
/* 300 */                       if (i15 != i16) {
/* 302 */                           configuration3.orientation = i16;
                                }
/* 306 */                       i17 = configuration.screenLayout & 15;
/* 310 */                       i18 = configuration2.screenLayout & 15;
/* 312 */                       if (i17 != i18) {
/* 317 */                           configuration3.screenLayout |= i18;
                                }
/* 321 */                       i19 = configuration.screenLayout & 192;
/* 325 */                       i20 = configuration2.screenLayout & 192;
/* 327 */                       if (i19 != i20) {
/* 332 */                           configuration3.screenLayout |= i20;
                                }
/* 336 */                       i21 = configuration.screenLayout & 48;
/* 340 */                       i22 = configuration2.screenLayout & 48;
/* 342 */                       if (i21 != i22) {
/* 347 */                           configuration3.screenLayout |= i22;
                                }
/* 351 */                       i23 = configuration.screenLayout & 768;
/* 355 */                       i24 = configuration2.screenLayout & 768;
/* 357 */                       if (i23 != i24) {
/* 362 */                           configuration3.screenLayout |= i24;
                                }
/* 368 */                       if (Build.VERSION.SDK_INT >= 26) {
/* 382 */                           if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
/* 1 */                                 configuration3.colorMode |= configuration2.colorMode & 3;
                                    }
/* 410 */                           if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
/* 1 */                                 configuration3.colorMode |= configuration2.colorMode & 12;
                                    }
                                }
/* 428 */                       i25 = configuration.uiMode & 15;
/* 432 */                       i26 = configuration2.uiMode & 15;
/* 434 */                       if (i25 != i26) {
/* 439 */                           configuration3.uiMode |= i26;
                                }
/* 443 */                       i27 = configuration.uiMode & 48;
/* 447 */                       i28 = configuration2.uiMode & 48;
/* 449 */                       if (i27 != i28) {
/* 454 */                           configuration3.uiMode |= i28;
                                }
/* 456 */                       i29 = configuration.screenWidthDp;
/* 458 */                       i30 = configuration2.screenWidthDp;
/* 460 */                       if (i29 != i30) {
/* 462 */                           configuration3.screenWidthDp = i30;
                                }
/* 464 */                       i31 = configuration.screenHeightDp;
/* 466 */                       i32 = configuration2.screenHeightDp;
/* 468 */                       if (i31 != i32) {
/* 470 */                           configuration3.screenHeightDp = i32;
                                }
/* 472 */                       i33 = configuration.smallestScreenWidthDp;
/* 474 */                       i34 = configuration2.smallestScreenWidthDp;
/* 476 */                       if (i33 != i34) {
/* 478 */                           configuration3.smallestScreenWidthDp = i34;
                                }
/* 480 */                       i35 = configuration.densityDpi;
/* 482 */                       i36 = configuration2.densityDpi;
/* 484 */                       if (i35 != i36) {
/* 486 */                           configuration3.densityDpi = i36;
                                }
                            }
                        } else {
/* 489 */                   configuration3 = null;
                        }
/* 490 */               Configuration configurationM9490t3 = LayoutInflaterFactory2C2324wa.m9490t(context, iM9493C, h91VarM9489p, configuration3, true);
/* 498 */               z00Var = new z00(context, R$style.Theme_AppCompat_Empty);
/* 501 */               z00Var.m10231a(configurationM9490t3);
/* 508 */               if (context.getTheme() != null) {
/* 510 */                   theme = z00Var.getTheme();
/* 518 */                   if (Build.VERSION.SDK_INT >= 29) {
/* 520 */                       c42.m1526a(theme);
                            } else {
                                synchronized (j13.f12003m) {
/* 529 */                           if (!j13.f12005o) {
/* 535 */                               Method declaredMethod3 = Resources.Theme.class.getDeclaredMethod("rebase", null);
/* 539 */                               j13.f12004n = declaredMethod3;
/* 541 */                               declaredMethod3.setAccessible(true);
/* 547 */                               j13.f12005o = true;
                                    }
/* 549 */                           method = j13.f12004n;
/* 551 */                           if (method != null) {
/* 553 */                               method.invoke(theme, null);
                                    }
                                }
                            }
                        }
/* 563 */               context = z00Var;
                    }
/* 564 */           super.attachBaseContext(context);
                }

                @Override // android.app.Activity
                public void closeOptionsMenu() {
/* 1 */             AbstractC2165s1 supportActionBar = getSupportActionBar();
/* 14 */            if (getWindow().hasFeature(0)) {
/* 16 */                if (supportActionBar == null || !supportActionBar.mo8341a()) {
/* 24 */                    super.closeOptionsMenu();
                        }
                    }
                }

                @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
                public boolean dispatchKeyEvent(KeyEvent keyEvent) {
/* 1 */             int keyCode = keyEvent.getKeyCode();
/* 5 */             AbstractC2165s1 supportActionBar = getSupportActionBar();
/* 11 */            if (keyCode == 82 && supportActionBar != null && supportActionBar.mo8352l(keyEvent)) {
/* 21 */                return true;
                    }
/* 23 */            return super.dispatchKeyEvent(keyEvent);
                }

                @Override // android.app.Activity
                public <T extends View> T findViewById(int i) {
/* 5 */             LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = (LayoutInflaterFactory2C2324wa) getDelegate();
/* 7 */             layoutInflaterFactory2C2324wa.m9507w();
/* 12 */            return (T) layoutInflaterFactory2C2324wa.f18511W.findViewById(i);
                }

                public AbstractC1021ia getDelegate() {
/* 3 */             if (this.mDelegate == null) {
/* 5 */                 ExecutorC0984ha executorC0984ha = AbstractC1021ia.f9502a;
/* 13 */                this.mDelegate = new LayoutInflaterFactory2C2324wa(this, null, this, this);
                    }
/* 15 */            return this.mDelegate;
                }

                public InterfaceC2277v1 getDrawerToggleDelegate() {
/* 7 */             ((LayoutInflaterFactory2C2324wa) getDelegate()).getClass();
/* 14 */            return new xt0(17);
                }

                @Override // android.app.Activity
                public MenuInflater getMenuInflater() {
/* 5 */             LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = (LayoutInflaterFactory2C2324wa) getDelegate();
/* 9 */             if (layoutInflaterFactory2C2324wa.f18515a0 == null) {
/* 11 */                layoutInflaterFactory2C2324wa.m9491A();
/* 16 */                AbstractC2165s1 abstractC2165s1 = layoutInflaterFactory2C2324wa.f18514Z;
/* 30 */                layoutInflaterFactory2C2324wa.f18515a0 = new yi2(abstractC2165s1 != null ? abstractC2165s1.mo8345e() : layoutInflaterFactory2C2324wa.f18510V);
                    }
/* 32 */            return layoutInflaterFactory2C2324wa.f18515a0;
                }

                @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
                public Resources getResources() {
/* 1 */             Resources resources = this.mResources;
/* 3 */             if (resources == null) {
/* 5 */                 int i = v13.f17842a;
                    }
                    return resources == null ? super.getResources() : resources;
                }

                public AbstractC2165s1 getSupportActionBar() {
/* 5 */             LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = (LayoutInflaterFactory2C2324wa) getDelegate();
/* 7 */             layoutInflaterFactory2C2324wa.m9491A();
/* 10 */            return layoutInflaterFactory2C2324wa.f18514Z;
                }

                public Intent getSupportParentActivityIntent() {
/* 1 */             return py0.m7603c0(this);
                }

                @Override // android.app.Activity
                public void invalidateOptionsMenu() {
/* 5 */             getDelegate().mo4501a();
                }

                @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) throws IllegalAccessException {
/* 1 */             super.onConfigurationChanged(configuration);
/* 8 */             LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = (LayoutInflaterFactory2C2324wa) getDelegate();
/* 12 */            if (layoutInflaterFactory2C2324wa.f18531q0 && layoutInflaterFactory2C2324wa.f18525k0) {
/* 18 */                layoutInflaterFactory2C2324wa.m9491A();
/* 21 */                AbstractC2165s1 abstractC2165s1 = layoutInflaterFactory2C2324wa.f18514Z;
/* 23 */                if (abstractC2165s1 != null) {
/* 25 */                    abstractC2165s1.mo8349i();
                        }
                    }
/* 28 */            C2491ya c2491yaM10132a = C2491ya.m10132a();
/* 32 */            Context context = layoutInflaterFactory2C2324wa.f18510V;
                    synchronized (c2491yaM10132a) {
/* 35 */                x32 x32Var = c2491yaM10132a.f19553a;
                        synchronized (x32Var) {
/* 44 */                    ta1 ta1Var = (ta1) x32Var.f18931b.get(context);
/* 46 */                    if (ta1Var != null) {
/* 48 */                        ta1Var.m8752a();
                            }
                        }
                    }
/* 71 */            layoutInflaterFactory2C2324wa.f18493C0 = new Configuration(layoutInflaterFactory2C2324wa.f18510V.getResources().getConfiguration());
/* 74 */            layoutInflaterFactory2C2324wa.m9500n(false, false);
/* 79 */            if (this.mResources != null) {
/* 99 */                this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
                    }
                }

                @Override // android.app.Activity, android.view.Window.Callback
                public void onContentChanged() {
/* 1 */             onSupportContentChanged();
                }

                public void onCreateSupportNavigateUpTaskStack(xm2 xm2Var) {
/* 1 */             ArrayList arrayList = xm2Var.f19249a;
/* 3 */             AppCompatActivity appCompatActivity = xm2Var.f19250b;
/* 5 */             Intent supportParentActivityIntent = getSupportParentActivityIntent();
/* 9 */             if (supportParentActivityIntent == null) {
/* 11 */                supportParentActivityIntent = py0.m7603c0(this);
                    }
/* 15 */            if (supportParentActivityIntent != null) {
/* 17 */                ComponentName component = supportParentActivityIntent.getComponent();
/* 21 */                if (component == null) {
/* 27 */                    component = supportParentActivityIntent.resolveActivity(appCompatActivity.getPackageManager());
                        }
/* 31 */                int size = arrayList.size();
                        try {
/* 39 */                    for (Intent intentM7604d0 = py0.m7604d0(appCompatActivity, component); intentM7604d0 != null; intentM7604d0 = py0.m7604d0(appCompatActivity, intentM7604d0.getComponent())) {
/* 41 */                        arrayList.add(size, intentM7604d0);
                            }
/* 53 */                    arrayList.add(supportParentActivityIntent);
                        } catch (PackageManager.NameNotFoundException e) {
/* 62 */                    AbstractC1245n0.m4876d("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
/* 65 */                    C1951n4.m6863n(e);
                        }
                    }
                }

                @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
                public void onDestroy() {
/* 1 */             super.onDestroy();
/* 8 */             getDelegate().mo4503e();
                }

                @Override // android.app.Activity, android.view.KeyEvent.Callback
                public boolean onKeyDown(int i, KeyEvent keyEvent) {
                    Window window;
/* 5 */             if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
/* 63 */                return super.onKeyDown(i, keyEvent);
                    }
/* 61 */            return true;
                }

                public void onLocalesChanged(h91 h91Var) {
                }

                @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
                public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
/* 5 */             if (super.onMenuItemSelected(i, menuItem)) {
/* 7 */                 return true;
                    }
/* 9 */             AbstractC2165s1 supportActionBar = getSupportActionBar();
/* 20 */            if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo8344d() & 4) == 0) {
/* 37 */                return false;
                    }
/* 32 */            return onSupportNavigateUp();
                }

                @Override // android.app.Activity, android.view.Window.Callback
                public boolean onMenuOpened(int i, Menu menu) {
/* 1 */             return super.onMenuOpened(i, menu);
                }

                public void onNightModeChanged(int i) {
                }

                @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
                public void onPanelClosed(int i, Menu menu) {
/* 1 */             super.onPanelClosed(i, menu);
                }

                @Override // android.app.Activity
                public void onPostCreate(Bundle bundle) {
/* 1 */             super.onPostCreate(bundle);
/* 10 */            ((LayoutInflaterFactory2C2324wa) getDelegate()).m9507w();
                }

                @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
                public void onPostResume() {
/* 1 */             super.onPostResume();
/* 8 */             LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = (LayoutInflaterFactory2C2324wa) getDelegate();
/* 10 */            layoutInflaterFactory2C2324wa.m9491A();
/* 13 */            AbstractC2165s1 abstractC2165s1 = layoutInflaterFactory2C2324wa.f18514Z;
/* 15 */            if (abstractC2165s1 != null) {
/* 18 */                abstractC2165s1.mo8357q(true);
                    }
                }

                public void onPrepareSupportNavigateUpTaskStack(xm2 xm2Var) {
                }

                @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
                public void onStart() throws IllegalAccessException {
/* 1 */             super.onStart();
/* 12 */            ((LayoutInflaterFactory2C2324wa) getDelegate()).m9500n(true, false);
                }

                @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
                public void onStop() {
/* 1 */             super.onStop();
/* 8 */             LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = (LayoutInflaterFactory2C2324wa) getDelegate();
/* 10 */            layoutInflaterFactory2C2324wa.m9491A();
/* 13 */            AbstractC2165s1 abstractC2165s1 = layoutInflaterFactory2C2324wa.f18514Z;
/* 15 */            if (abstractC2165s1 != null) {
/* 18 */                abstractC2165s1.mo8357q(false);
                    }
                }

                @Override // p000.InterfaceC0209ca
                public void onSupportActionModeFinished(AbstractC1778j2 abstractC1778j2) {
                }

                @Override // p000.InterfaceC0209ca
                public void onSupportActionModeStarted(AbstractC1778j2 abstractC1778j2) {
                }

                @Deprecated
                public void onSupportContentChanged() {
                }

                public boolean onSupportNavigateUp() {
/* 1 */             Intent supportParentActivityIntent = getSupportParentActivityIntent();
/* 6 */             if (supportParentActivityIntent == null) {
/* 5 */                 return false;
                    }
/* 13 */            if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
/* 98 */                supportNavigateUpTo(supportParentActivityIntent);
/* 12 */                return true;
                    }
/* 17 */            xm2 xm2Var = new xm2(this);
/* 20 */            onCreateSupportNavigateUpTaskStack(xm2Var);
/* 23 */            onPrepareSupportNavigateUpTaskStack(xm2Var);
/* 26 */            ArrayList arrayList = xm2Var.f19249a;
/* 32 */            if (arrayList.isEmpty()) {
/* 94 */                f42.m3656l("No intents added to TaskStackBuilder; cannot startActivities");
/* 5 */                 return false;
                    }
/* 40 */            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
/* 56 */            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
/* 58 */            AppCompatActivity appCompatActivity = xm2Var.f19250b;
/* 65 */            if (!v00.startActivities(appCompatActivity, intentArr, null)) {
/* 73 */                Intent intent = new Intent(intentArr[intentArr.length - 1]);
/* 78 */                intent.addFlags(268435456);
/* 81 */                appCompatActivity.startActivity(intent);
                    }
                    try {
/* 84 */                finishAffinity();
                    } catch (IllegalStateException unused) {
/* 88 */                finish();
                    }
/* 12 */            return true;
                }

                @Override // android.app.Activity
                public void onTitleChanged(CharSequence charSequence, int i) {
/* 1 */             super.onTitleChanged(charSequence, i);
/* 8 */             getDelegate().mo4508k(charSequence);
                }

                @Override // p000.InterfaceC0209ca
                public AbstractC1778j2 onWindowStartingSupportActionMode(InterfaceC1013i2 interfaceC1013i2) {
/* 1 */             return null;
                }

                @Override // android.app.Activity
                public void openOptionsMenu() {
/* 1 */             AbstractC2165s1 supportActionBar = getSupportActionBar();
/* 14 */            if (getWindow().hasFeature(0)) {
/* 16 */                if (supportActionBar == null || !supportActionBar.mo8353m()) {
/* 24 */                    super.openOptionsMenu();
                        }
                    }
                }

                @Override // androidx.activity.ComponentActivity, android.app.Activity
                public void setContentView(int i) {
/* 1 */             initializeViewTreeOwners();
/* 8 */             getDelegate().mo4505h(i);
                }

                public void setSupportActionBar(Toolbar toolbar) {
/* 5 */             LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = (LayoutInflaterFactory2C2324wa) getDelegate();
/* 11 */            if (layoutInflaterFactory2C2324wa.f18509U instanceof Activity) {
/* 14 */                layoutInflaterFactory2C2324wa.m9491A();
/* 17 */                AbstractC2165s1 abstractC2165s1 = layoutInflaterFactory2C2324wa.f18514Z;
/* 21 */                if (abstractC2165s1 instanceof t73) {
/* 80 */                    f42.m3656l("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
/* 83 */                    return;
                        }
/* 24 */                layoutInflaterFactory2C2324wa.f18515a0 = null;
/* 26 */                if (abstractC2165s1 != null) {
/* 28 */                    abstractC2165s1.mo8350j();
                        }
/* 31 */                layoutInflaterFactory2C2324wa.f18514Z = null;
/* 33 */                if (toolbar != null) {
/* 37 */                    Object obj = layoutInflaterFactory2C2324wa.f18509U;
/* 54 */                    xp2 xp2Var = new xp2(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : layoutInflaterFactory2C2324wa.f18516b0, layoutInflaterFactory2C2324wa.f18512X);
/* 57 */                    layoutInflaterFactory2C2324wa.f18514Z = xp2Var;
/* 63 */                    layoutInflaterFactory2C2324wa.f18512X.f15455b = xp2Var.f19304c;
/* 66 */                    toolbar.setBackInvokedCallbackEnabled(true);
                        } else {
/* 72 */                    layoutInflaterFactory2C2324wa.f18512X.f15455b = null;
                        }
/* 74 */                layoutInflaterFactory2C2324wa.mo4501a();
                    }
                }

                @Deprecated
                public void setSupportProgress(int i) {
                }

                @Deprecated
                public void setSupportProgressBarIndeterminate(boolean z) {
                }

                @Deprecated
                public void setSupportProgressBarIndeterminateVisibility(boolean z) {
                }

                @Deprecated
                public void setSupportProgressBarVisibility(boolean z) {
                }

                @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
                public void setTheme(int i) {
/* 1 */             super.setTheme(i);
/* 10 */            ((LayoutInflaterFactory2C2324wa) getDelegate()).f18495E0 = i;
                }

                public AbstractC1778j2 startSupportActionMode(InterfaceC1013i2 interfaceC1013i2) {
/* 5 */             return getDelegate().mo4509m(interfaceC1013i2);
                }

                @Override // androidx.fragment.app.FragmentActivity
                public void supportInvalidateOptionsMenu() {
/* 5 */             getDelegate().mo4501a();
                }

                public void supportNavigateUpTo(Intent intent) {
/* 1 */             navigateUpTo(intent);
                }

                public boolean supportRequestWindowFeature(int i) {
/* 5 */             return getDelegate().mo4504g(i);
                }

                public boolean supportShouldUpRecreateTask(Intent intent) {
/* 1 */             return shouldUpRecreateTask(intent);
                }

                @Override // androidx.activity.ComponentActivity, android.app.Activity
/* 11 */        public void setContentView(View view) {
/* 12 */            initializeViewTreeOwners();
/* 13 */            getDelegate().mo4506i(view);
                }

                @Override // androidx.activity.ComponentActivity, android.app.Activity
/* 13 */        public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
/* 14 */            initializeViewTreeOwners();
/* 15 */            getDelegate().mo4507j(view, layoutParams);
                }
            }
