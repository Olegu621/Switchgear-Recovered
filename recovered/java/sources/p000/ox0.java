            package p000;

            import android.view.View;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.widget.EditText;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ox0 extends View.AccessibilityDelegate {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ px0 f14911a;

                public ox0(px0 px0Var) {
/* 1 */             this.f14911a = px0Var;
                }

                @Override // android.view.View.AccessibilityDelegate
                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
/* 8 */             EditText editText = this.f14911a.f15302b.getEditText();
/* 12 */            if (editText != null) {
/* 14 */                accessibilityNodeInfo.setLabeledBy(editText);
                    }
                }
            }
