            package p000;

            import android.content.Context;
            import android.content.res.XmlResourceParser;
            import android.util.Xml;
            import androidx.constraintlayout.widget.ConstraintLayout;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import java.lang.reflect.Constructor;
            import java.util.ArrayList;
            import java.util.HashMap;
            import org.xmlpull.v1.XmlPullParserException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class m31 {

                /* JADX INFO: renamed from: b */
                public static final HashMap f13554b;

                /* JADX INFO: renamed from: a */
                public HashMap f13555a = new HashMap();

                static {
/* 3 */             HashMap map = new HashMap();
/* 6 */             f13554b = map;
                    try {
/* 17 */                map.put("KeyAttribute", c31.class.getConstructor(null));
/* 28 */                map.put("KeyPosition", s31.class.getConstructor(null));
/* 39 */                map.put("KeyCycle", e31.class.getConstructor(null));
/* 50 */                map.put("KeyTimeCycle", y31.class.getConstructor(null));
/* 61 */                map.put("KeyTrigger", z31.class.getConstructor(null));
                    } catch (NoSuchMethodException e) {
/* 70 */                AbstractC1245n0.m4877e("KeyFrames", "unable to load", e);
                    }
                }

                public m31(Context context, XmlResourceParser xmlResourceParser) {
                    Exception e;
                    a31 a31Var;
                    HashMap map;
                    HashMap map2;
                    try {
/* 11 */                int eventType = xmlResourceParser.getEventType();
/* 16 */                a31 a31Var2 = null;
/* 18 */                while (eventType != 1) {
/* 21 */                    if (eventType == 2) {
/* 42 */                        String name = xmlResourceParser.getName();
/* 46 */                        HashMap map3 = f13554b;
/* 52 */                        if (map3.containsKey(name)) {
                                    try {
/* 58 */                                Constructor constructor = (Constructor) map3.get(name);
/* 60 */                                if (constructor == null) {
/* 114 */                                   throw new NullPointerException("Keymaker for " + name + " not found");
                                        }
/* 66 */                                a31Var = (a31) constructor.newInstance(null);
                                        try {
/* 72 */                                    a31Var.mo45c(context, Xml.asAttributeSet(xmlResourceParser));
/* 75 */                                    m6595b(a31Var);
                                        } catch (Exception e2) {
/* 80 */                                    e = e2;
/* 119 */                                   AbstractC1245n0.m4877e("KeyFrames", "unable to create ", e);
                                        }
/* 78 */                                a31Var2 = a31Var;
                                    } catch (Exception e3) {
/* 83 */                                a31 a31Var3 = a31Var2;
/* 84 */                                e = e3;
/* 85 */                                a31Var = a31Var3;
                                    }
/* 119 */                           AbstractC1245n0.m4877e("KeyFrames", "unable to create ", e);
/* 78 */                            a31Var2 = a31Var;
                                } else if (name.equalsIgnoreCase("CustomAttribute")) {
/* 131 */                           if (a31Var2 != null && (map2 = a31Var2.f75d) != null) {
/* 137 */                               C2088pz.m7616d(context, xmlResourceParser, map2);
                                    }
                                } else if (name.equalsIgnoreCase("CustomMethod") && a31Var2 != null && (map = a31Var2.f75d) != null) {
/* 155 */                           C2088pz.m7616d(context, xmlResourceParser, map);
                                }
                            } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
/* 173 */                       return;
                            }
/* 158 */                   eventType = xmlResourceParser.next();
                        }
                    } catch (IOException e4) {
/* 165 */               e4.printStackTrace();
                    } catch (XmlPullParserException e5) {
/* 170 */               e5.printStackTrace();
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m6594a(zj1 zj1Var) {
/* 1 */             HashMap map = this.f13555a;
/* 13 */            ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(zj1Var.f20178c));
/* 15 */            if (arrayList != null) {
/* 19 */                zj1Var.f20198w.addAll(arrayList);
                    }
/* 31 */            ArrayList<a31> arrayList2 = (ArrayList) map.get(-1);
/* 33 */            if (arrayList2 != null) {
/* 43 */                for (a31 a31Var : arrayList2) {
/* 59 */                    String str = ((ConstraintLayout.LayoutParams) zj1Var.f20177b.getLayoutParams()).f1094Y;
/* 61 */                    String str2 = a31Var.f74c;
/* 74 */                    if ((str2 == null || str == null) ? false : str.matches(str2)) {
/* 76 */                        zj1Var.m10358a(a31Var);
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m6595b(a31 a31Var) {
/* 1 */             HashMap map = this.f13555a;
/* 13 */            if (!map.containsKey(Integer.valueOf(a31Var.f73b))) {
/* 26 */                map.put(Integer.valueOf(a31Var.f73b), new ArrayList());
                    }
/* 39 */            ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(a31Var.f73b));
/* 41 */            if (arrayList != null) {
/* 43 */                arrayList.add(a31Var);
                    }
                }
            }
