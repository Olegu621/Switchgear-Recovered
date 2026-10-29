            package com.quago.mobile.sdk;

            import android.graphics.PointF;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0715b {

                /* JADX INFO: renamed from: a */
                public final PointF f5360a;

                /* JADX INFO: renamed from: b */
                public final PointF f5361b;

                /* JADX INFO: renamed from: c */
                public final PointF f5362c;

                /* JADX INFO: renamed from: d */
                public final PointF f5363d;

                public C0715b(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
/* 4 */             this.f5360a = pointF;
/* 6 */             this.f5361b = pointF2;
/* 8 */             this.f5362c = pointF3;
/* 10 */            this.f5363d = pointF4;
                }

                /* JADX INFO: renamed from: a */
                public final PointF m2547a(float f) {
/* 1 */             PointF pointF = this.f5360a;
/* 3 */             PointF pointF2 = this.f5361b;
/* 5 */             PointF pointF3 = this.f5362c;
/* 7 */             PointF pointF4 = this.f5363d;
/* 11 */            float f2 = 1.0f - f;
/* 12 */            float f3 = f2 * f2;
/* 14 */            float f4 = f3 * f2;
/* 16 */            float f5 = f * f;
/* 18 */            float f6 = f5 * f;
/* 28 */            PointF pointF5 = new PointF(pointF.x * f4, f4 * pointF.y);
/* 36 */            float f7 = f3 * 3.0f * f;
/* 43 */            PointF pointF6 = new PointF(pointF2.x * f7, f7 * pointF2.y);
/* 49 */            float f8 = f2 * 3.0f * f5;
/* 56 */            PointF pointF7 = new PointF(pointF3.x * f8, f8 * pointF3.y);
/* 67 */            PointF pointF8 = new PointF(pointF4.x * f6, f6 * pointF4.y);
/* 94 */            return new PointF(pointF5.x + pointF6.x + pointF7.x + pointF8.x, pointF5.y + pointF6.y + pointF7.y + pointF8.y);
                }
            }
