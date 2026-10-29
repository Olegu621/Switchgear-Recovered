            package io.sentry.android.replay.util;

            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import io.sentry.android.replay.viewhierarchy.AbstractC1370h;
            import java.io.Closeable;
            import java.util.ArrayList;
            import java.util.List;
            import p000.C0908f8;
            import p000.nd0;
            import p000.p51;
            import p000.r51;
            import p000.v51;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.util.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1351e implements Closeable {

                /* JADX INFO: renamed from: a */
                public final p51 f10658a;

                /* JADX INFO: renamed from: b */
                public final p51 f10659b;

                /* JADX INFO: renamed from: c */
                public final p51 f10660c;

                public C1351e() {
/* 4 */             v51 v51Var = v51.f17866b;
/* 12 */            this.f10658a = r51.m8064a(v51Var, C1349c.f10650b);
/* 25 */            this.f10659b = r51.m8064a(v51Var, new C0908f8(this, 24));
/* 33 */            this.f10660c = r51.m8064a(v51Var, C1349c.f10651c);
                }

                /* JADX INFO: renamed from: c */
                public final List m5036c(Bitmap bitmap, AbstractC1370h abstractC1370h, Matrix matrix) {
/* 1 */             bitmap.getClass();
/* 8 */             if (bitmap.isRecycled()) {
/* 10 */                return nd0.f14189a;
                    }
/* 15 */            ArrayList arrayList = new ArrayList();
/* 20 */            Canvas canvas = new Canvas(bitmap);
/* 23 */            if (matrix != null) {
/* 25 */                canvas.setMatrix(matrix);
                    }
/* 36 */            abstractC1370h.m5052a(new C1350d(this, bitmap, matrix, arrayList, canvas));
/* 39 */            return arrayList;
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 1 */             p51 p51Var = this.f10658a;
/* 7 */             if (!p51Var.isInitialized() || ((Bitmap) p51Var.getValue()).isRecycled()) {
/* 30 */                return;
                    }
/* 27 */            ((Bitmap) p51Var.getValue()).recycle();
                }
            }
