            package p000;

            import android.os.Bundle;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.view.accessibility.AccessibilityNodeProvider;
            import java.util.List;
            
            /* JADX INFO: renamed from: g1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class C0938g1 extends AccessibilityNodeProvider {

                /* JADX INFO: renamed from: a */
                public final qc3 f8427a;

                public C0938g1(qc3 qc3Var) {
/* 4 */             this.f8427a = qc3Var;
                }

                @Override // android.view.accessibility.AccessibilityNodeProvider
                public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
/* 3 */             C0901f1 c0901f1Mo7766f = this.f8427a.mo7766f(i);
/* 7 */             if (c0901f1Mo7766f == null) {
/* 9 */                 return null;
                    }
/* 11 */            return c0901f1Mo7766f.f7961a;
                }

                @Override // android.view.accessibility.AccessibilityNodeProvider
                public final List findAccessibilityNodeInfosByText(String str, int i) {
/* 3 */             this.f8427a.getClass();
/* 6 */             return null;
                }

                @Override // android.view.accessibility.AccessibilityNodeProvider
                public final AccessibilityNodeInfo findFocus(int i) {
/* 3 */             C0901f1 c0901f1Mo7768h = this.f8427a.mo7768h(i);
/* 7 */             if (c0901f1Mo7768h == null) {
/* 9 */                 return null;
                    }
/* 11 */            return c0901f1Mo7768h.f7961a;
                }

                @Override // android.view.accessibility.AccessibilityNodeProvider
                public final boolean performAction(int i, int i2, Bundle bundle) {
/* 3 */             return this.f8427a.mo7769l(i, i2, bundle);
                }
            }
