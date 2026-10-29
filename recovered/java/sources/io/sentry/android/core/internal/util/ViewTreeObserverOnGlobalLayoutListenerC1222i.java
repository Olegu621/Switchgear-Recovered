            package io.sentry.android.core.internal.util;

            import android.view.View;
            import android.view.ViewTreeObserver;
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.util.i */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewTreeObserverOnGlobalLayoutListenerC1222i implements ViewTreeObserver.OnGlobalLayoutListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ View f10168a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ViewTreeObserverOnDrawListenerC1223j f10169b;

                public ViewTreeObserverOnGlobalLayoutListenerC1222i(ViewTreeObserverOnDrawListenerC1223j viewTreeObserverOnDrawListenerC1223j, View view) {
/* 4 */             this.f10169b = viewTreeObserverOnDrawListenerC1223j;
/* 6 */             this.f10168a = view;
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
/* 1 */             View view = this.f10168a;
/* 7 */             view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
/* 16 */            view.getViewTreeObserver().removeOnDrawListener(this.f10169b);
                }
            }
