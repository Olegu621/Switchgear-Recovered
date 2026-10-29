            package p000;

            import android.graphics.Rect;
            import android.view.View;
            import android.view.accessibility.AccessibilityNodeInfo;
            import java.time.Duration;
            
            /* JADX INFO: renamed from: c1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0200c1 {
                /* JADX INFO: renamed from: a */
                public static AccessibilityNodeInfo.AccessibilityAction m1472a() {
/* 1 */             return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
                }

                /* JADX INFO: renamed from: b */
                public static void m1473b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
/* 1 */             accessibilityNodeInfo.getBoundsInWindow(rect);
                }

                /* JADX INFO: renamed from: c */
                public static CharSequence m1474c(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             return accessibilityNodeInfo.getContainerTitle();
                }

                /* JADX INFO: renamed from: d */
                public static long m1475d(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 5 */             return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
                }

                /* JADX INFO: renamed from: e */
                public static boolean m1476e(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
                }

                /* JADX INFO: renamed from: f */
                public static boolean m1477f(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             return accessibilityNodeInfo.isAccessibilityDataSensitive();
                }

                /* JADX INFO: renamed from: g */
                public static void m1478g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
/* 1 */             accessibilityNodeInfo.setAccessibilityDataSensitive(z);
                }

                /* JADX INFO: renamed from: h */
                public static void m1479h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
/* 1 */             accessibilityNodeInfo.setBoundsInWindow(rect);
                }

                /* JADX INFO: renamed from: i */
                public static void m1480i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
/* 1 */             accessibilityNodeInfo.setContainerTitle(charSequence);
                }

                /* JADX INFO: renamed from: j */
                public static void m1481j(AccessibilityNodeInfo accessibilityNodeInfo, long j) {
/* 5 */             accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j));
                }

                /* JADX INFO: renamed from: k */
                public static void m1482k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z) {
/* 1 */             accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z);
                }

                /* JADX INFO: renamed from: l */
                public static void m1483l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
/* 1 */             accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z);
                }
            }
