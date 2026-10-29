            package p000;

            import android.view.View;
            import android.widget.AbsListView;
            import android.widget.AdapterView;
            import java.lang.reflect.Method;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class na0 {

                /* JADX INFO: renamed from: a */
                public static final Method f14168a;

                /* JADX INFO: renamed from: b */
                public static final Method f14169b;

                /* JADX INFO: renamed from: c */
                public static final Method f14170c;

                /* JADX INFO: renamed from: d */
                public static final boolean f14171d;

                static {
                    try {
/* 7 */                 Class cls = Integer.TYPE;
/* 11 */                Class cls2 = Boolean.TYPE;
/* 13 */                Class cls3 = Float.TYPE;
/* 19 */                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
/* 23 */                f14168a = declaredMethod;
/* 26 */                declaredMethod.setAccessible(true);
/* 35 */                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
/* 39 */                f14169b = declaredMethod2;
/* 41 */                declaredMethod2.setAccessible(true);
/* 50 */                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
/* 54 */                f14170c = declaredMethod3;
/* 56 */                declaredMethod3.setAccessible(true);
/* 59 */                f14171d = true;
                    } catch (NoSuchMethodException e) {
/* 63 */                e.printStackTrace();
                    }
                }
            }
