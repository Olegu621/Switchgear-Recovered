            package p000;

            import android.os.Build;
            import android.view.View;
            import android.view.ViewTreeObserver;
            import java.util.Map;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class p23 implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

                /* JADX INFO: renamed from: a */
                public final WeakHashMap f14950a = new WeakHashMap();

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
/* 5 */             if (Build.VERSION.SDK_INT < 28) {
/* 21 */                for (Map.Entry entry : this.f14950a.entrySet()) {
/* 33 */                    View view = (View) entry.getKey();
/* 41 */                    boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
/* 59 */                    boolean z = view.isShown() && view.getWindowVisibility() == 0;
/* 60 */                    if (zBooleanValue != z) {
/* 69 */                        e33.m3311g(z ? 16 : 32, view);
/* 76 */                        entry.setValue(Boolean.valueOf(z));
                            }
                        }
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
/* 5 */             view.getViewTreeObserver().addOnGlobalLayoutListener(this);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
                }
            }
