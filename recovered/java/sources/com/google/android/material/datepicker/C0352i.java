            package com.google.android.material.datepicker;

            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.view.View;
            import androidx.recyclerview.widget.AbstractC0130h;
            import androidx.recyclerview.widget.GridLayoutManager;
            import androidx.recyclerview.widget.RecyclerView;
            import java.util.Calendar;
            import p000.C2093q3;
            import p000.h13;
            import p000.hr1;
            
            /* JADX INFO: renamed from: com.google.android.material.datepicker.i */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0352i extends AbstractC0130h {

                /* JADX INFO: renamed from: a */
                public final Calendar f4648a = h13.m4086f(null);

                /* JADX INFO: renamed from: b */
                public final Calendar f4649b = h13.m4086f(null);

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C0355l f4650c;

                public C0352i(C0355l c0355l) {
/* 4 */             this.f4650c = c0355l;
                }

                @Override // androidx.recyclerview.widget.AbstractC0130h
                /* JADX INFO: renamed from: b */
                public final void mo963b(Canvas canvas, RecyclerView recyclerView) {
/* 9 */             if ((recyclerView.getAdapter() instanceof C0363t) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
/* 25 */                C0363t c0363t = (C0363t) recyclerView.getAdapter();
/* 31 */                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
/* 33 */                C0355l c0355l = this.f4650c;
/* 49 */                for (hr1 hr1Var : c0355l.f4660c.mo2295s()) {
/* 57 */                    Object obj = hr1Var.f9210a;
/* 59 */                    if (obj != null && hr1Var.f9211b != null) {
/* 68 */                        long jLongValue = ((Long) obj).longValue();
/* 72 */                        Calendar calendar = this.f4648a;
/* 74 */                        calendar.setTimeInMillis(jLongValue);
/* 81 */                        long jLongValue2 = ((Long) hr1Var.f9211b).longValue();
/* 85 */                        Calendar calendar2 = this.f4649b;
/* 87 */                        calendar2.setTimeInMillis(jLongValue2);
/* 103 */                       int i = calendar.get(1) - c0363t.f4705d.f4661d.f4612a.f4628c;
/* 116 */                       int i2 = calendar2.get(1) - c0363t.f4705d.f4661d.f4612a.f4628c;
/* 117 */                       View viewMo799B = gridLayoutManager.mo799B(i);
/* 121 */                       View viewMo799B2 = gridLayoutManager.mo799B(i2);
/* 125 */                       int i3 = gridLayoutManager.f1577q0;
/* 127 */                       int i4 = i / i3;
/* 128 */                       int i5 = i2 / i3;
/* 130 */                       for (int i6 = i4; i6 <= i5; i6++) {
/* 135 */                           View viewMo799B3 = gridLayoutManager.mo799B(gridLayoutManager.f1577q0 * i6);
/* 139 */                           if (viewMo799B3 != null) {
/* 158 */                               int top = viewMo799B3.getTop() + ((Rect) ((C2093q3) c0355l.f4664i.f14376d).f15370b).top;
/* 175 */                               int bottom = viewMo799B3.getBottom() - ((Rect) ((C2093q3) c0355l.f4664i.f14376d).f15370b).bottom;
/* 231 */                               canvas.drawRect(i6 == i4 ? (viewMo799B.getWidth() / 2) + viewMo799B.getLeft() : 0, top, i6 == i5 ? (viewMo799B2.getWidth() / 2) + viewMo799B2.getLeft() : recyclerView.getWidth(), bottom, (Paint) c0355l.f4664i.f14380h);
                                    }
                                }
                            }
                        }
                    }
                }
            }
