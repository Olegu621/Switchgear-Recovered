            package com.google.android.material.timepicker;

            import android.view.ViewTreeObserver;
            
            /* JADX INFO: renamed from: com.google.android.material.timepicker.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewTreeObserverOnPreDrawListenerC0380b implements ViewTreeObserver.OnPreDrawListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ClockFaceView f5127a;

                public ViewTreeObserverOnPreDrawListenerC0380b(ClockFaceView clockFaceView) {
/* 4 */             this.f5127a = clockFaceView;
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
/* 1 */             ClockFaceView clockFaceView = this.f5127a;
/* 3 */             ClockHandView clockHandView = clockFaceView.f5093j0;
/* 10 */            if (clockFaceView.isShown()) {
/* 17 */                clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
/* 31 */                int height = ((clockFaceView.getHeight() / 2) - clockHandView.f5109b) - clockFaceView.f5100q0;
/* 34 */                if (height != clockFaceView.f5118h0) {
/* 36 */                    clockFaceView.f5118h0 = height;
/* 38 */                    clockFaceView.m2428j();
/* 43 */                    clockHandView.f5107U = clockFaceView.f5118h0;
/* 45 */                    clockHandView.invalidate();
                        }
                    }
/* 9 */             return true;
                }
            }
