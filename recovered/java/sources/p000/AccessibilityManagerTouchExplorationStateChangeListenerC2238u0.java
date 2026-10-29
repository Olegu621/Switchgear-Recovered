            package p000;

            import android.view.accessibility.AccessibilityManager;
            import android.widget.AutoCompleteTextView;
            import com.google.android.material.internal.CheckableImageButton;
            import java.util.WeakHashMap;
            
            /* JADX INFO: renamed from: u0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AccessibilityManagerTouchExplorationStateChangeListenerC2238u0 implements AccessibilityManager.TouchExplorationStateChangeListener {

                /* JADX INFO: renamed from: a */
                public final gr0 f17321a;

                public AccessibilityManagerTouchExplorationStateChangeListenerC2238u0(gr0 gr0Var) {
/* 4 */             this.f17321a = gr0Var;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC2238u0) {
/* 17 */                return this.f17321a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC2238u0) obj).f17321a);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.f17321a.hashCode();
                }

                @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                public final void onTouchExplorationStateChanged(boolean z) {
/* 5 */             za0 za0Var = (za0) this.f17321a.f8789a;
/* 13 */            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) za0Var.f7137a.getEditText();
/* 15 */            if (autoCompleteTextView == null || autoCompleteTextView.getKeyListener() != null) {
/* 23 */                return;
                    }
/* 24 */            CheckableImageButton checkableImageButton = za0Var.f7139c;
/* 30 */            int i = z ? 2 : 1;
/* 31 */            WeakHashMap weakHashMap = e33.f7494a;
/* 33 */            checkableImageButton.setImportantForAccessibility(i);
                }
            }
