            package io.sentry.android.replay.viewhierarchy;

            import androidx.compose.ui.node.LayoutNode;
            import androidx.compose.ui.node.NodeCoordinator;
            import io.sentry.internal.debugmeta.C1505c;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            import p000.ds0;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1365c {

                /* JADX INFO: renamed from: a */
                public static Boolean f10684a;

                /* JADX INFO: renamed from: b */
                public static C1505c f10685b;

                /* JADX INFO: renamed from: a */
                public static List m5049a(LayoutNode layoutNode) {
/* 1 */             Boolean bool = f10684a;
/* 3 */             Boolean bool2 = Boolean.FALSE;
/* 9 */             if (Intrinsics.m6216a(bool, bool2)) {
/* 11 */                return layoutNode.getChildren$ui();
                    }
/* 23 */            if (Intrinsics.m6216a(bool, Boolean.TRUE)) {
/* 31 */                Method method = (Method) m5050b().f11042b;
/* 33 */                method.getClass();
/* 36 */                Object objInvoke = method.invoke(layoutNode, null);
/* 40 */                objInvoke.getClass();
/* 43 */                return (List) objInvoke;
                    }
/* 46 */            if (bool != null) {
/* 80 */                ds0.m3187b();
/* 22 */                return null;
                    }
                    try {
/* 48 */                List children$ui = layoutNode.getChildren$ui();
/* 52 */                f10684a = bool2;
/* 54 */                return children$ui;
                    } catch (NoSuchMethodError unused) {
/* 57 */                f10684a = Boolean.TRUE;
/* 65 */                Method method2 = (Method) m5050b().f11042b;
/* 67 */                method2.getClass();
/* 70 */                Object objInvoke2 = method2.invoke(layoutNode, null);
/* 74 */                objInvoke2.getClass();
/* 77 */                return (List) objInvoke2;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static C1505c m5050b() {
                    Method declaredMethod;
/* 1 */             C1505c c1505c = f10685b;
/* 3 */             if (c1505c != null) {
/* 5 */                 return c1505c;
                    }
/* 11 */            Method method = null;
                    try {
/* 12 */                declaredMethod = LayoutNode.class.getDeclaredMethod("getChildren$ui_release", null);
/* 16 */                declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused) {
/* 20 */                declaredMethod = null;
                    }
                    try {
/* 23 */                Method declaredMethod2 = LayoutNode.class.getDeclaredMethod("getOuterCoordinator$ui_release", null);
/* 27 */                declaredMethod2.setAccessible(true);
/* 30 */                method = declaredMethod2;
                    } catch (NoSuchMethodException unused2) {
                    }
/* 33 */            C1505c c1505c2 = new C1505c(declaredMethod, method);
/* 36 */            f10685b = c1505c2;
/* 38 */            return c1505c2;
                }

                /* JADX INFO: renamed from: c */
                public static boolean m5051c(LayoutNode layoutNode) throws IllegalAccessException, InvocationTargetException {
/* 1 */             layoutNode.getClass();
/* 4 */             Boolean bool = f10684a;
/* 6 */             Boolean bool2 = Boolean.FALSE;
/* 12 */            if (Intrinsics.m6216a(bool, bool2)) {
/* 18 */                return layoutNode.getOuterCoordinator$ui().isTransparent();
                    }
/* 30 */            if (Intrinsics.m6216a(bool, Boolean.TRUE)) {
/* 38 */                Method method = (Method) m5050b().f11043c;
/* 40 */                method.getClass();
/* 43 */                Object objInvoke = method.invoke(layoutNode, null);
/* 47 */                objInvoke.getClass();
/* 52 */                return ((NodeCoordinator) objInvoke).isTransparent();
                    }
/* 57 */            if (bool != null) {
/* 99 */                ds0.m3187b();
/* 102 */               return false;
                    }
                    try {
/* 63 */                boolean zIsTransparent = layoutNode.getOuterCoordinator$ui().isTransparent();
/* 67 */                f10684a = bool2;
/* 69 */                return zIsTransparent;
                    } catch (NoSuchMethodError unused) {
/* 72 */                f10684a = Boolean.TRUE;
/* 80 */                Method method2 = (Method) m5050b().f11043c;
/* 82 */                method2.getClass();
/* 85 */                Object objInvoke2 = method2.invoke(layoutNode, null);
/* 89 */                objInvoke2.getClass();
/* 94 */                return ((NodeCoordinator) objInvoke2).isTransparent();
                    }
                }
            }
