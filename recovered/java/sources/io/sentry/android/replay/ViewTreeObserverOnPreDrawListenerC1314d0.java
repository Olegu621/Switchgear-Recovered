            package io.sentry.android.replay;

            import android.graphics.Point;
            import android.view.View;
            import android.view.ViewTreeObserver;
            import java.lang.ref.WeakReference;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.d0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewTreeObserverOnPreDrawListenerC1314d0 implements ViewTreeObserver.OnPreDrawListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C1318f0 f10504a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ View f10505b;

                public ViewTreeObserverOnPreDrawListenerC1314d0(C1318f0 c1318f0, View view) {
/* 4 */             this.f10504a = c1318f0;
/* 6 */             this.f10505b = view;
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() throws Exception {
/* 1 */             C1318f0 c1318f0 = this.f10504a;
/* 3 */             Point point = c1318f0.f10529v;
/* 11 */            WeakReference weakReference = (WeakReference) CollectionsKt.m6205z(c1318f0.f10528i);
/* 22 */            View view = weakReference != null ? (View) weakReference.get() : null;
/* 23 */            View view2 = this.f10505b;
/* 30 */            if (Intrinsics.m6216a(view2, view)) {
/* 59 */                view2.getClass();
/* 66 */                if (view2.getWidth() > 0 && view2.getHeight() > 0) {
/* 78 */                    if (view2.getViewTreeObserver() != null && view2.getViewTreeObserver().isAlive()) {
                                try {
/* 95 */                            view2.getViewTreeObserver().removeOnPreDrawListener(this);
                                } catch (IllegalStateException unused) {
                                }
                            }
/* 104 */                   if (view2.getWidth() != point.x || view2.getHeight() != point.y) {
/* 122 */                       point.set(view2.getWidth(), view2.getHeight());
/* 135 */                       c1318f0.f10524c.m4980s(view2.getWidth(), view2.getHeight());
                            }
                        }
                    } else if (view2 != null && view2.getViewTreeObserver() != null && view2.getViewTreeObserver().isAlive()) {
                        try {
/* 55 */                    view2.getViewTreeObserver().removeOnPreDrawListener(this);
/* 29 */                    return true;
                        } catch (IllegalStateException unused2) {
                        }
                    }
/* 29 */            return true;
                }
            }
