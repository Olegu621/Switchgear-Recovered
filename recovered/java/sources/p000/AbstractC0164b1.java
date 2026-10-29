            package p000;

            import android.view.accessibility.AccessibilityNodeInfo;
            
            /* JADX INFO: renamed from: b1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0164b1 {
                /* JADX INFO: renamed from: a */
                public static C0864e1 m1188a(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
/* 44 */            return new C0864e1(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z2).setRowTitle(str).setColumnTitle(str2).build());
                }

                /* JADX INFO: renamed from: b */
                public static C0901f1 m1189b(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
/* 1 */             AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i, i2);
/* 5 */             if (child != null) {
/* 9 */                 return new C0901f1((Object) child);
                    }
/* 13 */            return null;
                }

                /* JADX INFO: renamed from: c */
                public static String m1190c(Object obj) {
/* 3 */             return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
                }

                /* JADX INFO: renamed from: d */
                public static String m1191d(Object obj) {
/* 3 */             return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
                }

                /* JADX INFO: renamed from: e */
                public static AccessibilityNodeInfo.ExtraRenderingInfo m1192e(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             return accessibilityNodeInfo.getExtraRenderingInfo();
                }

                /* JADX INFO: renamed from: f */
                public static C0901f1 m1193f(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
/* 1 */             AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i);
/* 5 */             if (parent != null) {
/* 9 */                 return new C0901f1((Object) parent);
                    }
/* 13 */            return null;
                }

                /* JADX INFO: renamed from: g */
                public static String m1194g(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             return accessibilityNodeInfo.getUniqueId();
                }

                /* JADX INFO: renamed from: h */
                public static boolean m1195h(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             return accessibilityNodeInfo.isTextSelectable();
                }

                /* JADX INFO: renamed from: i */
                public static void m1196i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
/* 1 */             accessibilityNodeInfo.setTextSelectable(z);
                }

                /* JADX INFO: renamed from: j */
                public static void m1197j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
/* 1 */             accessibilityNodeInfo.setUniqueId(str);
                }
            }
