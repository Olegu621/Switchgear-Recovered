            package com.google.android.material.timepicker;

            import android.os.Bundle;
            import android.os.SystemClock;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.accessibility.AccessibilityNodeInfo;
            import com.google.android.material.R$id;
            import p000.C0864e1;
            import p000.C0901f1;
            import p000.C2201t0;
            import p000.C2518z0;
            
            /* JADX INFO: renamed from: com.google.android.material.timepicker.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0381c extends C2201t0 {

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ClockFaceView f5128d;

                public C0381c(ClockFaceView clockFaceView) {
/* 1 */             this.f5128d = clockFaceView;
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: d */
                public final void mo128d(View view, C0901f1 c0901f1) {
/* 1 */             AccessibilityNodeInfo accessibilityNodeInfo = c0901f1.f7961a;
/* 5 */             this.f16886a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
/* 16 */            int iIntValue = ((Integer) view.getTag(R$id.material_value_index)).intValue();
/* 20 */            if (iIntValue > 0) {
/* 34 */                accessibilityNodeInfo.setTraversalAfter((View) this.f5128d.f5096m0.get(iIntValue - 1));
                    }
/* 47 */            c0901f1.m3629j(C0864e1.m3291a(0, 1, iIntValue, 1, view.isSelected()));
/* 50 */            accessibilityNodeInfo.setClickable(true);
/* 55 */            c0901f1.m3622b(C2518z0.f19874g);
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: g */
                public final boolean mo129g(View view, int i, Bundle bundle) {
/* 3 */             ClockHandView clockHandView = this.f5128d.f5093j0;
/* 7 */             if (i != 16) {
/* 59 */                return super.mo129g(view, i, bundle);
                    }
/* 9 */             long jUptimeMillis = SystemClock.uptimeMillis();
/* 25 */            float width = (view.getWidth() / 2.0f) + view.getX();
/* 37 */            float height = (view.getHeight() / 2.0f) + view.getY();
/* 46 */            clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, width, height, 0));
/* 54 */            clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, width, height, 0));
/* 57 */            return true;
                }
            }
