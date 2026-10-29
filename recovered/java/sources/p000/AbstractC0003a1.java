            package p000;

            import android.view.accessibility.AccessibilityNodeInfo;
            
            /* JADX INFO: renamed from: a1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0003a1 {
                /* JADX INFO: renamed from: a */
                public static Object m14a(int i, float f, float f2, float f3) {
/* 3 */             return new AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
                }

                /* JADX INFO: renamed from: b */
                public static CharSequence m15b(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             return accessibilityNodeInfo.getStateDescription();
                }

                /* JADX INFO: renamed from: c */
                public static void m16c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
/* 1 */             accessibilityNodeInfo.setStateDescription(charSequence);
                }
            }
