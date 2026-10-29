            package xhpgvfjuz;

            import android.os.Bundle;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.view.accessibility.AccessibilityNodeProvider;
            
            /* JADX INFO: renamed from: xhpgvfjuz.B */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class C2370B extends View.AccessibilityDelegate {

                /* JADX INFO: renamed from: a */
                private final View.AccessibilityDelegate f19098a;

                public C2370B(View.AccessibilityDelegate accessibilityDelegate) {
                    this.f19098a = accessibilityDelegate;
                }

                /* JADX INFO: renamed from: a */
                public native AccessibilityNodeProvider m9795a(View view, View.AccessibilityDelegate accessibilityDelegate);

                /* JADX INFO: renamed from: a */
                public native void m9796a(View view, int i, View.AccessibilityDelegate accessibilityDelegate);

                /* JADX INFO: renamed from: a */
                public native void m9797a(View view, AccessibilityEvent accessibilityEvent, View.AccessibilityDelegate accessibilityDelegate);

                /* JADX INFO: renamed from: a */
                public native void m9798a(View view, AccessibilityNodeInfo accessibilityNodeInfo, View.AccessibilityDelegate accessibilityDelegate);

                /* JADX INFO: renamed from: a */
                public native void m9799a(View view, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle, View.AccessibilityDelegate accessibilityDelegate);

                /* JADX INFO: renamed from: a */
                public native boolean m9800a(View view, int i, Bundle bundle, View.AccessibilityDelegate accessibilityDelegate);

                /* JADX INFO: renamed from: a */
                public native boolean m9801a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent, View.AccessibilityDelegate accessibilityDelegate);

                @Override // android.view.View.AccessibilityDelegate
                public void addExtraDataToAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
                    m9799a(view, accessibilityNodeInfo, str, bundle, this.f19098a);
                }

                /* JADX INFO: renamed from: b */
                public native void m9802b(View view, AccessibilityEvent accessibilityEvent, View.AccessibilityDelegate accessibilityDelegate);

                /* JADX INFO: renamed from: c */
                public native void m9803c(View view, AccessibilityEvent accessibilityEvent, View.AccessibilityDelegate accessibilityDelegate);

                /* JADX INFO: renamed from: d */
                public native boolean m9804d(View view, AccessibilityEvent accessibilityEvent, View.AccessibilityDelegate accessibilityDelegate);

                @Override // android.view.View.AccessibilityDelegate
                public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    return m9804d(view, accessibilityEvent, this.f19098a);
                }

                @Override // android.view.View.AccessibilityDelegate
                public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                    return m9795a(view, this.f19098a);
                }

                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    m9802b(view, accessibilityEvent, this.f19098a);
                }

                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    m9798a(view, accessibilityNodeInfo, this.f19098a);
                }

                @Override // android.view.View.AccessibilityDelegate
                public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    m9797a(view, accessibilityEvent, this.f19098a);
                }

                @Override // android.view.View.AccessibilityDelegate
                public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return m9801a(viewGroup, view, accessibilityEvent, this.f19098a);
                }

                @Override // android.view.View.AccessibilityDelegate
                public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                    return m9800a(view, i, bundle, this.f19098a);
                }

                @Override // android.view.View.AccessibilityDelegate
                public void sendAccessibilityEvent(View view, int i) {
                    m9796a(view, i, this.f19098a);
                }

                @Override // android.view.View.AccessibilityDelegate
                public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    m9803c(view, accessibilityEvent, this.f19098a);
                }
            }
