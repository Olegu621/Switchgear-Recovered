            package com.google.android.material.appbar;

            import android.view.View;
            import android.widget.OverScroller;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            import java.util.WeakHashMap;
            import p000.e33;
            
            /* JADX INFO: renamed from: com.google.android.material.appbar.g */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RunnableC0339g implements Runnable {

                /* JADX INFO: renamed from: a */
                public final CoordinatorLayout f4416a;

                /* JADX INFO: renamed from: b */
                public final View f4417b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ HeaderBehavior f4418c;

                public RunnableC0339g(HeaderBehavior headerBehavior, CoordinatorLayout coordinatorLayout, View view) {
/* 4 */             this.f4418c = headerBehavior;
/* 6 */             this.f4416a = coordinatorLayout;
/* 8 */             this.f4417b = view;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    HeaderBehavior headerBehavior;
                    OverScroller overScroller;
/* 1 */             View view = this.f4417b;
/* 3 */             if (view == null || (overScroller = (headerBehavior = this.f4418c).f4385d) == null) {
/* 37 */                return;
                    }
/* 11 */            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
/* 15 */            CoordinatorLayout coordinatorLayout = this.f4416a;
/* 17 */            if (!zComputeScrollOffset) {
/* 34 */                headerBehavior.mo2221z(coordinatorLayout, view);
/* 37 */                return;
                    }
/* 25 */            headerBehavior.m2231B(coordinatorLayout, view, headerBehavior.f4385d.getCurrY());
/* 28 */            WeakHashMap weakHashMap = e33.f7494a;
/* 30 */            view.postOnAnimation(this);
                }
            }
