            package androidx.fragment.app;

            import android.view.View;
            import android.view.ViewGroup;
            
            /* JADX INFO: renamed from: androidx.fragment.app.r */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewOnAttachStateChangeListenerC0106r implements View.OnAttachStateChangeListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C0113y f1469a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ LayoutInflaterFactory2C0107s f1470b;

                public ViewOnAttachStateChangeListenerC0106r(LayoutInflaterFactory2C0107s layoutInflaterFactory2C0107s, C0113y c0113y) {
/* 4 */             this.f1470b = layoutInflaterFactory2C0107s;
/* 6 */             this.f1469a = c0113y;
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
/* 1 */             C0113y c0113y = this.f1469a;
/* 3 */             Fragment fragment = c0113y.f1526c;
/* 5 */             c0113y.m741i();
/* 24 */            C0096h.m654j((ViewGroup) fragment.mView.getParent(), this.f1470b.f1471a).m662i();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
                }
            }
