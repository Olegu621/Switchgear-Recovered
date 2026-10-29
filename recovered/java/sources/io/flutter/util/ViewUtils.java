            package io.flutter.util;

            import android.app.Activity;
            import android.content.Context;
            import android.content.ContextWrapper;
            import android.graphics.Point;
            import android.graphics.Rect;
            import android.os.Build;
            import android.view.Display;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.WindowManager;
            import p000.AbstractC0886en;
            import p000.C2357x6;
            import p000.a83;
            import p000.b83;
            import p000.c83;
            import p000.ds0;
            import p000.f42;
            import p000.m83;
            import p000.s83;
            import p000.t83;
            import p000.w00;
            import p000.z73;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewUtils {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface DisplayUpdater {
                    void updateDisplayMetrics(float f, float f2, float f3);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface ViewVisitor {
                    boolean run(View view);
                }

                public static void calculateMaximumDisplayMetrics(Context context, DisplayUpdater displayUpdater) throws Exception {
                    Rect rect;
                    c83 a83Var;
                    m83 m83VarMo106b;
/* 1 */             Activity activity = getActivity(context);
/* 5 */             if (activity != null) {
/* 9 */                 s83.f16474a.getClass();
/* 12 */                int i = t83.f16997b;
/* 14 */                int i2 = Build.VERSION.SDK_INT;
/* 18 */                if (i2 >= 30) {
/* 1 */                     rect = ((WindowManager) activity.getSystemService(WindowManager.class)).getMaximumWindowMetrics().getBounds();
/* 36 */                    rect.getClass();
                        } else {
/* 42 */                    Object systemService = activity.getSystemService("window");
/* 46 */                    systemService.getClass();
/* 51 */                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
/* 55 */                    defaultDisplay.getClass();
/* 60 */                    Point point = new Point();
/* 63 */                    defaultDisplay.getRealSize(point);
/* 73 */                    rect = new Rect(0, 0, point.x, point.y);
                        }
/* 76 */                if (i2 < 30) {
/* 95 */                    if (i2 >= 30) {
/* 99 */                        a83Var = new b83();
                            } else {
/* 115 */                       a83Var = i2 >= 29 ? new a83() : new z73();
                            }
/* 118 */                   m83VarMo106b = a83Var.mo106b();
/* 122 */                   m83VarMo106b.getClass();
                        } else {
/* 78 */                    if (i2 < 30) {
/* 94 */                        throw new Exception("Incompatible SDK version");
                            }
/* 82 */                    m83VarMo106b = w00.f18404a.m9390a(activity);
                        }
/* 125 */               int i3 = rect.left;
/* 127 */               int i4 = rect.top;
/* 129 */               int i5 = rect.right;
/* 131 */               int i6 = rect.bottom;
/* 133 */               if (i3 > i5) {
/* 194 */                   ds0.m3200q(AbstractC0886en.m3506j("Left must be less than or equal to right, left: ", i3, i5, ", right: "));
                        } else if (i4 > i6) {
/* 182 */                   ds0.m3200q(AbstractC0886en.m3506j("top must be less than or equal to bottom, top: ", i4, i6, ", bottom: "));
                        } else {
/* 137 */                   m83VarMo106b.getClass();
/* 170 */                   displayUpdater.updateDisplayMetrics(new Rect(i3, i4, i5, i6).width(), new Rect(i3, i4, i5, i6).height(), context.getResources().getDisplayMetrics().density);
                        }
                    }
                }

                public static boolean childHasFocus(View view) {
/* 8 */             return traverseHierarchy(view, new f42(19));
                }

                public static Activity getActivity(Context context) {
/* 2 */             if (context == null) {
/* 1 */                 return null;
                    }
/* 7 */             if (context instanceof Activity) {
/* 9 */                 return (Activity) context;
                    }
/* 14 */            if (context instanceof ContextWrapper) {
/* 22 */                return getActivity(((ContextWrapper) context).getBaseContext());
                    }
/* 1 */             return null;
                }

                public static boolean hasChildViewOfType(View view, Class<? extends View>[] clsArr) {
/* 8 */             return traverseHierarchy(view, new C2357x6(clsArr, 18));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ boolean lambda$hasChildViewOfType$1(Class[] clsArr, View view) {
/* 4 */             for (Class cls : clsArr) {
/* 12 */                if (cls.isInstance(view)) {
/* 14 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

                public static boolean traverseHierarchy(View view, ViewVisitor viewVisitor) {
/* 2 */             if (view != null) {
/* 9 */                 if (viewVisitor.run(view)) {
/* 35 */                    return true;
                        }
/* 14 */                if (view instanceof ViewGroup) {
/* 16 */                    ViewGroup viewGroup = (ViewGroup) view;
/* 23 */                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
/* 33 */                        if (traverseHierarchy(viewGroup.getChildAt(i), viewVisitor)) {
/* 35 */                            return true;
                                }
                            }
                        }
                    }
/* 1 */             return false;
                }
            }
