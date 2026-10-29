            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.content.ContextWrapper;
            import android.graphics.Point;
            import android.graphics.Rect;
            import android.inputmethodservice.InputMethodService;
            import android.os.Build;
            import android.view.Display;
            import android.view.WindowManager;
            import androidx.window.extensions.layout.FoldingFeature;
            import androidx.window.extensions.layout.WindowLayoutInfo;
            import io.sentry.C1697u2;
            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class og0 {
                /* JADX INFO: renamed from: a */
                public static ot0 m7167a(r83 r83Var, FoldingFeature foldingFeature) {
                    C0204c5 c0204c5;
                    C2131r4 c2131r4;
                    int i;
/* 1 */             foldingFeature.getClass();
/* 4 */             int type = foldingFeature.getType();
/* 11 */            if (type != 1) {
/* 13 */                if (type == 2) {
/* 16 */                    c0204c5 = C0204c5.f2715q;
                        }
/* 9 */                 return null;
                    }
/* 19 */            c0204c5 = C0204c5.f2714p;
/* 21 */            int state = foldingFeature.getState();
/* 25 */            if (state != 1) {
/* 27 */                if (state == 2) {
/* 30 */                    c2131r4 = C2131r4.f15858m;
                        }
/* 9 */                 return null;
                    }
/* 33 */            c2131r4 = C2131r4.f15857l;
/* 35 */            Rect bounds = foldingFeature.getBounds();
/* 39 */            bounds.getClass();
/* 42 */            int i2 = bounds.left;
/* 44 */            int i3 = bounds.top;
/* 46 */            int i4 = bounds.right;
/* 48 */            int i5 = bounds.bottom;
/* 50 */            if (i2 > i4) {
/* 146 */               ds0.m3200q(AbstractC0886en.m3506j("Left must be less than or equal to right, left: ", i2, i4, ", right: "));
/* 9 */                 return null;
                    }
/* 52 */            if (i3 > i5) {
/* 134 */               ds0.m3200q(AbstractC0886en.m3506j("top must be less than or equal to bottom, top: ", i3, i5, ", bottom: "));
/* 9 */                 return null;
                    }
/* 56 */            Rect rectM9582a = r83Var.f15931a.m9582a();
/* 60 */            int i6 = i5 - i3;
/* 61 */            if ((i6 != 0 || i4 - i2 != 0) && (((i = i4 - i2) == rectM9582a.width() || i6 == rectM9582a.height()) && ((i >= rectM9582a.width() || i6 >= rectM9582a.height()) && (i != rectM9582a.width() || i6 != rectM9582a.height())))) {
/* 112 */               Rect bounds2 = foldingFeature.getBounds();
/* 116 */               bounds2.getClass();
/* 122 */               return new ot0(new C2334wk(bounds2), c0204c5, c2131r4);
                    }
/* 9 */             return null;
                }

                /* JADX INFO: renamed from: b */
                public static q83 m7168b(r83 r83Var, WindowLayoutInfo windowLayoutInfo) {
                    ot0 ot0VarM7167a;
/* 1 */             windowLayoutInfo.getClass();
/* 4 */             List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
/* 8 */             displayFeatures.getClass();
/* 13 */            ArrayList arrayList = new ArrayList();
/* 24 */            for (FoldingFeature foldingFeature : displayFeatures) {
/* 34 */                if (foldingFeature instanceof FoldingFeature) {
/* 36 */                    foldingFeature.getClass();
/* 41 */                    ot0VarM7167a = m7167a(r83Var, foldingFeature);
                        } else {
/* 46 */                    ot0VarM7167a = null;
                        }
/* 47 */                if (ot0VarM7167a != null) {
/* 49 */                    arrayList.add(ot0VarM7167a);
                        }
                    }
/* 55 */            return new q83(arrayList);
                }

                /* JADX INFO: renamed from: c */
                public static q83 m7169c(Context context, WindowLayoutInfo windowLayoutInfo) throws Exception {
                    boolean z;
                    r83 r83Var;
                    c83 a83Var;
/* 1 */             windowLayoutInfo.getClass();
/* 4 */             int i = Build.VERSION.SDK_INT;
/* 11 */            if (i < 30) {
/* 206 */               if (i < 29 || !(context instanceof Activity)) {
/* 227 */                   C1951n4.m6866q("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
/* 6 */                     return null;
                        }
/* 212 */               int i2 = t83.f16997b;
/* 220 */               return m7168b(t83.m8729a((Activity) context), windowLayoutInfo);
                    }
/* 13 */            int i3 = t83.f16997b;
/* 15 */            if (i >= 30) {
/* 23 */                WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
/* 33 */                m83 m83VarM6620h = m83.m6620h(windowManager.getCurrentWindowMetrics().getWindowInsets(), null);
/* 1 */                 Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
/* 47 */                bounds.getClass();
/* 50 */                r83Var = new r83(bounds, m83VarM6620h);
                    } else {
/* 55 */                Context baseContext = context;
                        while (true) {
/* 60 */                    if (!(baseContext instanceof ContextWrapper)) {
/* 202 */                       C1697u2.m5435k(context, "Context ", " is not a UiContext");
/* 6 */                         return null;
                            }
/* 62 */                    z = baseContext instanceof Activity;
/* 64 */                    if (z || (baseContext instanceof InputMethodService)) {
                                break;
                            }
/* 73 */                    ContextWrapper contextWrapper = (ContextWrapper) baseContext;
/* 79 */                    if (contextWrapper.getBaseContext() == null) {
                                break;
                            }
/* 191 */                   baseContext = contextWrapper.getBaseContext();
/* 195 */                   baseContext.getClass();
                        }
/* 81 */                if (z) {
/* 85 */                    r83Var = t83.m8729a((Activity) context);
                        } else {
/* 92 */                    if (!(baseContext instanceof InputMethodService)) {
/* 190 */                       throw new IllegalArgumentException(context + " is not a UiContext");
                            }
/* 96 */                    Object systemService = context.getSystemService("window");
/* 100 */                   systemService.getClass();
/* 105 */                   Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
/* 109 */                   defaultDisplay.getClass();
/* 114 */                   Point point = new Point();
/* 117 */                   defaultDisplay.getRealSize(point);
/* 127 */                   Rect rect = new Rect(0, 0, point.x, point.y);
/* 132 */                   int i4 = Build.VERSION.SDK_INT;
/* 134 */                   if (i4 >= 30) {
/* 138 */                       a83Var = new b83();
                            } else {
/* 152 */                       a83Var = i4 >= 29 ? new a83() : new z73();
                            }
/* 155 */                   m83 m83VarMo106b = a83Var.mo106b();
/* 159 */                   m83VarMo106b.getClass();
/* 162 */                   r83Var = new r83(rect, m83VarMo106b);
                        }
                    }
/* 165 */           return m7168b(r83Var, windowLayoutInfo);
                }
            }
