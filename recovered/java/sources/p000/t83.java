            package p000;

            import android.app.Activity;
            import android.content.res.Configuration;
            import android.content.res.Resources;
            import android.graphics.Point;
            import android.graphics.Rect;
            import android.os.Build;
            import android.view.Display;
            import android.view.DisplayCutout;
            import android.view.WindowManager;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.Field;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class t83 implements s83 {

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ int f16997b = 0;

                static {
/* 57 */            new ArrayList(new C2546zc(new Integer[]{1, 2, 4, 8, 16, 32, 64, 128}, true));
                }

                /* JADX INFO: renamed from: a */
                public static r83 m8729a(Activity activity) throws Exception {
                    Rect rect;
                    c83 a83Var;
                    m83 m83VarMo106b;
/* 1 */             int i = Build.VERSION.SDK_INT;
/* 7 */             if (i >= 30) {
/* 1 */                 rect = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
/* 25 */                rect.getClass();
                    } else if (i >= 29) {
/* 38 */                Configuration configuration = activity.getResources().getConfiguration();
                        try {
/* 46 */                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
/* 51 */                    declaredField.setAccessible(true);
/* 54 */                    Object obj = declaredField.get(configuration);
/* 71 */                    Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
/* 75 */                    objInvoke.getClass();
/* 80 */                    rect = new Rect((Rect) objInvoke);
                        } catch (IllegalAccessException e) {
/* 102 */                   AbstractC1245n0.m4890r("t83", e);
/* 105 */                   rect = m8730b(activity);
                        } catch (NoSuchFieldException e2) {
/* 118 */                   AbstractC1245n0.m4890r("t83", e2);
/* 121 */                   rect = m8730b(activity);
                        } catch (NoSuchMethodException e3) {
/* 110 */                   AbstractC1245n0.m4890r("t83", e3);
/* 113 */                   rect = m8730b(activity);
                        } catch (InvocationTargetException e4) {
/* 94 */                    AbstractC1245n0.m4890r("t83", e4);
/* 97 */                    rect = m8730b(activity);
                        }
                    } else if (i >= 28) {
/* 130 */               rect = m8730b(activity);
                    } else {
/* 137 */               rect = new Rect();
/* 144 */               Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
/* 148 */               defaultDisplay.getRectSize(rect);
/* 155 */               if (!activity.isInMultiWindowMode()) {
/* 159 */                   Point point = new Point();
/* 162 */                   defaultDisplay.getRealSize(point);
/* 165 */                   Resources resources = activity.getResources();
/* 175 */                   int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
/* 186 */                   int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
/* 189 */                   int i2 = rect.bottom + dimensionPixelSize;
/* 192 */                   if (i2 == point.y) {
/* 194 */                       rect.bottom = i2;
                            } else {
/* 199 */                       int i3 = rect.right + dimensionPixelSize;
/* 202 */                       if (i3 == point.x) {
/* 204 */                           rect.right = i3;
                                }
                            }
                        }
                    }
/* 206 */           int i4 = Build.VERSION.SDK_INT;
/* 208 */           if (i4 < 30) {
/* 227 */               if (i4 >= 30) {
/* 231 */                   a83Var = new b83();
                        } else {
/* 245 */                   a83Var = i4 >= 29 ? new a83() : new z73();
                        }
/* 248 */               m83VarMo106b = a83Var.mo106b();
/* 252 */               m83VarMo106b.getClass();
                    } else {
/* 210 */               if (i4 < 30) {
/* 226 */                   throw new Exception("Incompatible SDK version");
                        }
/* 214 */               m83VarMo106b = w00.f18404a.m9390a(activity);
                    }
/* 262 */           return new r83(new C2334wk(rect), m83VarMo106b);
                }

                /* JADX INFO: renamed from: b */
                public static Rect m8730b(Activity activity) {
/* 5 */             Rect rect = new Rect();
/* 12 */            Configuration configuration = activity.getResources().getConfiguration();
/* 17 */            DisplayCutout displayCutoutM8247g = null;
                    try {
/* 22 */                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
/* 26 */                declaredField.setAccessible(true);
/* 29 */                Object obj = declaredField.get(configuration);
/* 37 */                if (activity.isInMultiWindowMode()) {
/* 49 */                    Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
/* 53 */                    objInvoke.getClass();
/* 58 */                    rect.set((Rect) objInvoke);
                        } else {
/* 80 */                    Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
/* 84 */                    objInvoke2.getClass();
/* 89 */                    rect.set((Rect) objInvoke2);
                        }
                    } catch (IllegalAccessException e) {
/* 108 */               AbstractC1245n0.m4890r("t83", e);
/* 119 */               activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
                    } catch (NoSuchFieldException e2) {
/* 138 */               AbstractC1245n0.m4890r("t83", e2);
/* 149 */               activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
                    } catch (NoSuchMethodException e3) {
/* 123 */               AbstractC1245n0.m4890r("t83", e3);
/* 134 */               activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
                    } catch (InvocationTargetException e4) {
/* 93 */                AbstractC1245n0.m4890r("t83", e4);
/* 104 */               activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
                    }
/* 156 */           Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
/* 162 */           Point point = new Point();
/* 165 */           defaultDisplay.getClass();
/* 168 */           defaultDisplay.getRealSize(point);
/* 176 */           if (!activity.isInMultiWindowMode()) {
/* 178 */               Resources resources = activity.getResources();
/* 188 */               int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
/* 199 */               int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
/* 202 */               int i = rect.bottom + dimensionPixelSize;
/* 205 */               if (i == point.y) {
/* 207 */                   rect.bottom = i;
                        } else {
/* 212 */                   int i2 = rect.right + dimensionPixelSize;
/* 215 */                   if (i2 == point.x) {
/* 217 */                       rect.right = i2;
                            } else if (rect.left == dimensionPixelSize) {
/* 224 */                       rect.left = 0;
                            }
                        }
                    }
/* 232 */           if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
                        try {
/* 254 */                   Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
/* 258 */                   constructor.setAccessible(true);
/* 261 */                   Object objNewInstance = constructor.newInstance(null);
/* 279 */                   Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
/* 283 */                   declaredMethod.setAccessible(true);
/* 290 */                   declaredMethod.invoke(defaultDisplay, objNewInstance);
/* 299 */                   Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
/* 303 */                   declaredField2.setAccessible(true);
/* 306 */                   Object obj2 = declaredField2.get(objNewInstance);
/* 314 */                   if (rt1.m8255o(obj2)) {
/* 316 */                       displayCutoutM8247g = rt1.m8247g(obj2);
                            }
                        } catch (ClassNotFoundException e5) {
/* 353 */                   AbstractC1245n0.m4890r("t83", e5);
                        } catch (IllegalAccessException e6) {
/* 341 */                   AbstractC1245n0.m4890r("t83", e6);
                        } catch (InstantiationException e7) {
/* 333 */                   AbstractC1245n0.m4890r("t83", e7);
                        } catch (NoSuchFieldException e8) {
/* 345 */                   AbstractC1245n0.m4890r("t83", e8);
                        } catch (NoSuchMethodException e9) {
/* 349 */                   AbstractC1245n0.m4890r("t83", e9);
                        } catch (InvocationTargetException e10) {
/* 337 */                   AbstractC1245n0.m4890r("t83", e10);
                        }
/* 356 */               if (displayCutoutM8247g != null) {
/* 364 */                   if (rect.left == displayCutoutM8247g.getSafeInsetLeft()) {
/* 366 */                       rect.left = 0;
                            }
/* 377 */                   if (point.x - rect.right == displayCutoutM8247g.getSafeInsetRight()) {
/* 386 */                       rect.right = displayCutoutM8247g.getSafeInsetRight() + rect.right;
                            }
/* 394 */                   if (rect.top == displayCutoutM8247g.getSafeInsetTop()) {
/* 396 */                       rect.top = 0;
                            }
/* 407 */                   if (point.y - rect.bottom == displayCutoutM8247g.getSafeInsetBottom()) {
/* 416 */                       rect.bottom = displayCutoutM8247g.getSafeInsetBottom() + rect.bottom;
                            }
                        }
                    }
/* 418 */           return rect;
                }
            }
