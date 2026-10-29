            package xhpgvfjuz;

            import android.os.Bundle;
            import android.view.View;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.view.accessibility.AccessibilityNodeProvider;
            import java.util.List;
            
            /* JADX INFO: renamed from: xhpgvfjuz.ad */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class C2414ad extends AccessibilityNodeProvider {

                /* JADX INFO: renamed from: a */
                private final View f19136a;

                C2414ad(View view) {
                    this.f19136a = view;
                }

                /* JADX INFO: renamed from: a */
                public native AccessibilityNodeInfo m9879a(int i);

                /* JADX INFO: renamed from: a */
                public native List m9880a(String str, int i);

                /* JADX INFO: renamed from: a */
                public native boolean m9881a(int i, int i2, Bundle bundle);

                /* JADX INFO: renamed from: b */
                public native AccessibilityNodeInfo m9882b(int i);

                @Override // android.view.accessibility.AccessibilityNodeProvider
                public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                    return m9882b(i);
                }

                @Override // android.view.accessibility.AccessibilityNodeProvider
                public List findAccessibilityNodeInfosByText(String str, int i) {
                    return m9880a(str, i);
                }

                @Override // android.view.accessibility.AccessibilityNodeProvider
                public AccessibilityNodeInfo findFocus(int i) {
                    return m9879a(i);
                }

                @Override // android.view.accessibility.AccessibilityNodeProvider
                public boolean performAction(int i, int i2, Bundle bundle) {
                    return m9881a(i, i2, bundle);
                }
            }
