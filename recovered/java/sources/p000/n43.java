            package p000;

            import android.view.View;
            import android.view.ViewParent;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class n43 {
                /* JADX INFO: renamed from: a */
                public static boolean m6876a(ViewParent viewParent, View view, float f, float f2, boolean z) {
/* 1 */             return viewParent.onNestedFling(view, f, f2, z);
                }

                /* JADX INFO: renamed from: b */
                public static boolean m6877b(ViewParent viewParent, View view, float f, float f2) {
/* 1 */             return viewParent.onNestedPreFling(view, f, f2);
                }

                /* JADX INFO: renamed from: c */
                public static void m6878c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
/* 1 */             viewParent.onNestedPreScroll(view, i, i2, iArr);
                }

                /* JADX INFO: renamed from: d */
                public static void m6879d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
/* 1 */             viewParent.onNestedScroll(view, i, i2, i3, i4);
                }

                /* JADX INFO: renamed from: e */
                public static void m6880e(ViewParent viewParent, View view, View view2, int i) {
/* 1 */             viewParent.onNestedScrollAccepted(view, view2, i);
                }

                /* JADX INFO: renamed from: f */
                public static boolean m6881f(ViewParent viewParent, View view, View view2, int i) {
/* 1 */             return viewParent.onStartNestedScroll(view, view2, i);
                }

                /* JADX INFO: renamed from: g */
                public static void m6882g(ViewParent viewParent, View view) {
/* 1 */             viewParent.onStopNestedScroll(view);
                }
            }
