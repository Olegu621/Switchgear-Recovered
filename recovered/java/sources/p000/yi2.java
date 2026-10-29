            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.content.ContextWrapper;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.util.AttributeSet;
            import android.util.Xml;
            import android.view.InflateException;
            import android.view.Menu;
            import android.view.MenuInflater;
            import android.view.SubMenu;
            import androidx.appcompat.R$styleable;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import okhttp3.internal.http2.Settings;
            import org.xmlpull.v1.XmlPullParser;
            import org.xmlpull.v1.XmlPullParserException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yi2 extends MenuInflater {

                /* JADX INFO: renamed from: e */
                public static final Class[] f19645e;

                /* JADX INFO: renamed from: f */
                public static final Class[] f19646f;

                /* JADX INFO: renamed from: a */
                public final Object[] f19647a;

                /* JADX INFO: renamed from: b */
                public final Object[] f19648b;

                /* JADX INFO: renamed from: c */
                public final Context f19649c;

                /* JADX INFO: renamed from: d */
                public Object f19650d;

                static {
/* 3 */             Class[] clsArr = {Context.class};
/* 7 */             f19645e = clsArr;
/* 9 */             f19646f = clsArr;
                }

                public yi2(Context context) {
/* 1 */             super(context);
/* 4 */             this.f19649c = context;
/* 6 */             Object[] objArr = {context};
/* 10 */            this.f19647a = objArr;
/* 12 */            this.f19648b = objArr;
                }

                /* JADX INFO: renamed from: a */
                public static Object m10150a(Object obj) {
                    return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m10150a(((ContextWrapper) obj).getBaseContext()) : obj;
                }

                /* JADX WARN: Code duplicated, block: B:19:0x0048  */
                /* JADX INFO: renamed from: b */
                public final void m10151b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
                    int i;
                    XmlPullParser xmlPullParser2;
/* 9 */             xi2 xi2Var = new xi2(this, menu);
/* 12 */            int eventType = xmlPullParser.getEventType();
/* 51 */            do {
/* 16 */                i = 2;
/* 20 */                if (eventType == 2) {
/* 22 */                    String name = xmlPullParser.getName();
/* 30 */                    if (name.equals("menu")) {
/* 32 */                        eventType = xmlPullParser.next();
                                break;
                            } else {
/* 43 */                        f42.m3663s("Expecting menu, got ".concat(name));
/* 46 */                        return;
                            }
                        }
/* 47 */                eventType = xmlPullParser.next();
/* 51 */            } while (eventType != 1);
/* 55 */            boolean z = false;
/* 56 */            boolean z2 = false;
/* 57 */            String str = null;
/* 58 */            while (!z) {
/* 60 */                if (eventType == 1) {
/* 627 */                   f42.m3663s("Unexpected end of document");
/* 630 */                   return;
                        }
/* 66 */                Menu menu2 = xi2Var.f19174a;
/* 68 */                if (eventType != i) {
/* 71 */                    if (eventType != 3) {
/* 73 */                        xmlPullParser2 = xmlPullParser;
                            } else {
/* 77 */                        String name2 = xmlPullParser.getName();
/* 81 */                        if (z2 && name2.equals(str)) {
/* 89 */                            xmlPullParser2 = xmlPullParser;
/* 91 */                            z2 = false;
/* 92 */                            str = null;
                                } else {
/* 99 */                            if (name2.equals("group")) {
/* 101 */                               xi2Var.f19175b = 0;
/* 103 */                               xi2Var.f19176c = 0;
/* 105 */                               xi2Var.f19177d = 0;
/* 107 */                               xi2Var.f19178e = 0;
/* 109 */                               xi2Var.f19179f = true;
/* 111 */                               xi2Var.f19180g = true;
                                    } else if (name2.equals("item")) {
/* 122 */                               if (!xi2Var.f19181h) {
/* 124 */                                   AbstractC1815k2 abstractC1815k2 = xi2Var.f19199z;
/* 126 */                                   if (abstractC1815k2 == null || !((tg1) abstractC1815k2).f17088c.hasSubMenu()) {
/* 160 */                                       xi2Var.f19181h = true;
/* 174 */                                       xi2Var.m9971b(menu2.add(xi2Var.f19175b, xi2Var.f19182i, xi2Var.f19183j, xi2Var.f19184k));
                                            } else {
/* 138 */                                       xi2Var.f19181h = true;
/* 156 */                                       xi2Var.m9971b(menu2.addSubMenu(xi2Var.f19175b, xi2Var.f19182i, xi2Var.f19183j, xi2Var.f19184k).getItem());
                                            }
                                        }
                                    } else if (name2.equals("menu")) {
/* 184 */                               xmlPullParser2 = xmlPullParser;
/* 186 */                               z = true;
                                    }
/* 73 */                            xmlPullParser2 = xmlPullParser;
                                }
                            }
                        } else if (z2) {
/* 73 */                    xmlPullParser2 = xmlPullParser;
                        } else {
/* 192 */                   String name3 = xmlPullParser.getName();
/* 196 */                   boolean zEquals = name3.equals("group");
/* 200 */                   Context context = this.f19649c;
/* 202 */                   if (zEquals) {
/* 206 */                       TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MenuGroup);
/* 216 */                       xi2Var.f19175b = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MenuGroup_android_id, 0);
/* 224 */                       xi2Var.f19176c = typedArrayObtainStyledAttributes.getInt(R$styleable.MenuGroup_android_menuCategory, 0);
/* 232 */                       xi2Var.f19177d = typedArrayObtainStyledAttributes.getInt(R$styleable.MenuGroup_android_orderInCategory, 0);
/* 240 */                       xi2Var.f19178e = typedArrayObtainStyledAttributes.getInt(R$styleable.MenuGroup_android_checkableBehavior, 0);
/* 248 */                       xi2Var.f19179f = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MenuGroup_android_visible, true);
/* 256 */                       xi2Var.f19180g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MenuGroup_android_enabled, true);
/* 258 */                       typedArrayObtainStyledAttributes.recycle();
                            } else if (name3.equals("item")) {
/* 271 */                       ac1 ac1VarM155G = ac1.m155G(context, attributeSet, R$styleable.MenuItem);
/* 275 */                       int i2 = R$styleable.MenuItem_android_id;
/* 279 */                       TypedArray typedArray = (TypedArray) ac1VarM155G.f178c;
/* 285 */                       xi2Var.f19182i = typedArray.getResourceId(i2, 0);
/* 311 */                       xi2Var.f19183j = (typedArray.getInt(R$styleable.MenuItem_android_menuCategory, xi2Var.f19176c) & (-65536)) | (typedArray.getInt(R$styleable.MenuItem_android_orderInCategory, xi2Var.f19177d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
/* 319 */                       xi2Var.f19184k = typedArray.getText(R$styleable.MenuItem_android_title);
/* 327 */                       xi2Var.f19185l = typedArray.getText(R$styleable.MenuItem_android_titleCondensed);
/* 335 */                       xi2Var.f19186m = typedArray.getResourceId(R$styleable.MenuItem_android_icon, 0);
/* 339 */                       String string = typedArray.getString(R$styleable.MenuItem_android_alphabeticShortcut);
/* 351 */                       xi2Var.f19187n = string == null ? (char) 0 : string.charAt(0);
/* 361 */                       xi2Var.f19188o = typedArray.getInt(R$styleable.MenuItem_alphabeticModifiers, 4096);
/* 365 */                       String string2 = typedArray.getString(R$styleable.MenuItem_android_numericShortcut);
/* 377 */                       xi2Var.f19189p = string2 == null ? (char) 0 : string2.charAt(0);
/* 385 */                       xi2Var.f19190q = typedArray.getInt(R$styleable.MenuItem_numericModifiers, 4096);
/* 393 */                       if (typedArray.hasValue(R$styleable.MenuItem_android_checkable)) {
/* 401 */                           xi2Var.f19191r = typedArray.getBoolean(R$styleable.MenuItem_android_checkable, false) ? 1 : 0;
                                } else {
/* 406 */                           xi2Var.f19191r = xi2Var.f19178e;
                                }
/* 414 */                       xi2Var.f19192s = typedArray.getBoolean(R$styleable.MenuItem_android_checked, false);
/* 424 */                       xi2Var.f19193t = typedArray.getBoolean(R$styleable.MenuItem_android_visible, xi2Var.f19179f);
/* 434 */                       xi2Var.f19194u = typedArray.getBoolean(R$styleable.MenuItem_android_enabled, xi2Var.f19180g);
/* 443 */                       xi2Var.f19195v = typedArray.getInt(R$styleable.MenuItem_showAsAction, -1);
/* 451 */                       xi2Var.f19198y = typedArray.getString(R$styleable.MenuItem_android_onClick);
/* 459 */                       xi2Var.f19196w = typedArray.getResourceId(R$styleable.MenuItem_actionLayout, 0);
/* 467 */                       xi2Var.f19197x = typedArray.getString(R$styleable.MenuItem_actionViewClass);
/* 471 */                       String string3 = typedArray.getString(R$styleable.MenuItem_actionProviderClass);
/* 479 */                       boolean z3 = string3 != null;
/* 480 */                       if (z3 && xi2Var.f19196w == 0 && xi2Var.f19197x == null) {
/* 500 */                           xi2Var.f19199z = (AbstractC1815k2) xi2Var.m9970a(string3, f19646f, this.f19648b);
                                } else {
/* 503 */                           if (z3) {
/* 509 */                               AbstractC1245n0.m4889q("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                    }
/* 512 */                           xi2Var.f19199z = null;
                                }
/* 520 */                       xi2Var.f19169A = typedArray.getText(R$styleable.MenuItem_contentDescription);
/* 528 */                       xi2Var.f19170B = typedArray.getText(R$styleable.MenuItem_tooltipText);
/* 536 */                       if (typedArray.hasValue(R$styleable.MenuItem_iconTintMode)) {
/* 550 */                           xi2Var.f19172D = w90.m9485c(typedArray.getInt(R$styleable.MenuItem_iconTintMode, -1), xi2Var.f19172D);
                                } else {
/* 553 */                           xi2Var.f19172D = null;
                                }
/* 561 */                       if (typedArray.hasValue(R$styleable.MenuItem_iconTint)) {
/* 569 */                           xi2Var.f19171C = ac1VarM155G.m183m(R$styleable.MenuItem_iconTint);
                                } else {
/* 572 */                           xi2Var.f19171C = null;
                                }
/* 574 */                       ac1VarM155G.m168J();
/* 577 */                       xi2Var.f19181h = false;
                            } else if (name3.equals("menu")) {
/* 587 */                       xi2Var.f19181h = true;
/* 597 */                       SubMenu subMenuAddSubMenu = menu2.addSubMenu(xi2Var.f19175b, xi2Var.f19182i, xi2Var.f19183j, xi2Var.f19184k);
/* 605 */                       xi2Var.m9971b(subMenuAddSubMenu.getItem());
/* 608 */                       xmlPullParser2 = xmlPullParser;
/* 610 */                       m10151b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                            } else {
/* 614 */                       xmlPullParser2 = xmlPullParser;
/* 616 */                       str = name3;
/* 617 */                       z2 = true;
                            }
/* 73 */                    xmlPullParser2 = xmlPullParser;
                        }
/* 618 */               eventType = xmlPullParser2.next();
/* 622 */               i = 2;
                        z = z;
                        z2 = z2;
                    }
                }

                @Override // android.view.MenuInflater
                public final void inflate(int i, Menu menu) {
/* 5 */             if (!(menu instanceof jg1)) {
/* 7 */                 super.inflate(i, menu);
/* 10 */                return;
                    }
/* 11 */            XmlResourceParser layout = null;
/* 12 */            boolean z = false;
                    try {
                        try {
/* 19 */                    layout = this.f19649c.getResources().getLayout(i);
/* 23 */                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
/* 29 */                    if (menu instanceof jg1) {
/* 32 */                        jg1 jg1Var = (jg1) menu;
/* 36 */                        if (!jg1Var.f12271p) {
/* 38 */                            jg1Var.m5817y();
/* 41 */                            z = true;
                                }
                            }
/* 49 */                    m10151b(layout, attributeSetAsAttributeSet, menu);
/* 52 */                    if (z) {
/* 56 */                        ((jg1) menu).m5816x();
                            }
/* 59 */                    layout.close();
                        } catch (IOException e) {
/* 68 */                    throw new InflateException("Error inflating menu XML", e);
                        } catch (XmlPullParserException e2) {
/* 74 */                    throw new InflateException("Error inflating menu XML", e2);
                        }
                    } catch (Throwable th) {
/* 75 */                if (z) {
/* 79 */                    ((jg1) menu).m5816x();
                        }
/* 82 */                if (layout != null) {
/* 84 */                    layout.close();
                        }
/* 87 */                throw th;
                    }
                }
            }
