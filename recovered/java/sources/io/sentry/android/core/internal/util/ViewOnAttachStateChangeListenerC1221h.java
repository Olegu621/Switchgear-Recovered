            package io.sentry.android.core.internal.util;

            import android.view.View;
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.util.h */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewOnAttachStateChangeListenerC1221h implements View.OnAttachStateChangeListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ViewTreeObserverOnDrawListenerC1223j f10167a;

                public ViewOnAttachStateChangeListenerC1221h(ViewTreeObserverOnDrawListenerC1223j viewTreeObserverOnDrawListenerC1223j) {
/* 4 */             this.f10167a = viewTreeObserverOnDrawListenerC1223j;
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
/* 7 */             view.getViewTreeObserver().addOnDrawListener(this.f10167a);
/* 10 */            view.removeOnAttachStateChangeListener(this);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
/* 1 */             view.removeOnAttachStateChangeListener(this);
                }
            }
