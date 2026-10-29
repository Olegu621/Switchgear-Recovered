            package p000;

            import android.view.View;
            import android.view.ViewTreeObserver;
            import android.view.accessibility.AccessibilityManager;
            import java.util.WeakHashMap;
            
            /* JADX INFO: renamed from: tr */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewOnAttachStateChangeListenerC2228tr implements View.OnAttachStateChangeListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17237a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f17238b;

                public /* synthetic */ ViewOnAttachStateChangeListenerC2228tr(Object obj, int i) {
/* 1 */             this.f17237a = i;
/* 3 */             this.f17238b = obj;
                }

                /* JADX INFO: renamed from: a */
                private final void m8879a(View view) {
                }

                /* JADX INFO: renamed from: b */
                private final void m8880b(View view) {
                }

                /* JADX INFO: renamed from: c */
                private final void m8881c(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
/* 1 */             int i = this.f17237a;
/* 3 */             Object obj = this.f17238b;
                    switch (i) {
                        case 1:
/* 22 */                    ((za0) obj).m10296f();
                            break;
                        case 2:
/* 9 */                     View view2 = (View) obj;
/* 11 */                    view2.removeOnAttachStateChangeListener(this);
/* 14 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 16 */                    q23.m7679c(view2);
                            break;
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
/* 1 */             int i = this.f17237a;
/* 3 */             Object obj = this.f17238b;
                    switch (i) {
                        case 0:
/* 54 */                    ViewOnKeyListenerC2341wr viewOnKeyListenerC2341wr = (ViewOnKeyListenerC2341wr) obj;
/* 56 */                    ViewTreeObserver viewTreeObserver = viewOnKeyListenerC2341wr.f18778i0;
/* 58 */                    if (viewTreeObserver != null) {
/* 64 */                        if (!viewTreeObserver.isAlive()) {
/* 70 */                            viewOnKeyListenerC2341wr.f18778i0 = view.getViewTreeObserver();
                                }
/* 76 */                        viewOnKeyListenerC2341wr.f18778i0.removeGlobalOnLayoutListener(viewOnKeyListenerC2341wr.f18782w);
                            }
/* 79 */                    view.removeOnAttachStateChangeListener(this);
                            break;
                        case 1:
/* 37 */                    za0 za0Var = (za0) obj;
/* 39 */                    AccessibilityManager accessibilityManager = za0Var.f20031q;
/* 41 */                    if (accessibilityManager != null) {
/* 50 */                        accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC2238u0(za0Var.f20025k));
                            }
                            break;
                        case 2:
                            break;
                        default:
/* 8 */                     jg2 jg2Var = (jg2) obj;
/* 10 */                    ViewTreeObserver viewTreeObserver2 = jg2Var.f12287Z;
/* 12 */                    if (viewTreeObserver2 != null) {
/* 18 */                        if (!viewTreeObserver2.isAlive()) {
/* 24 */                            jg2Var.f12287Z = view.getViewTreeObserver();
                                }
/* 30 */                        jg2Var.f12287Z.removeGlobalOnLayoutListener(jg2Var.f12300w);
                            }
/* 33 */                    view.removeOnAttachStateChangeListener(this);
                            break;
                    }
                }
            }
