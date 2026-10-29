            package p000;

            import android.graphics.Outline;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.view.View;
            import android.view.ViewOutlineProvider;
            import com.google.android.material.imageview.ShapeableImageView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fd2 extends ViewOutlineProvider {

                /* JADX INFO: renamed from: a */
                public final Rect f8167a = new Rect();

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ShapeableImageView f8168b;

                public fd2(ShapeableImageView shapeableImageView) {
/* 1 */             this.f8168b = shapeableImageView;
                }

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
/* 1 */             ShapeableImageView shapeableImageView = this.f8168b;
/* 5 */             if (shapeableImageView.f4778w == null) {
/* 7 */                 return;
                    }
/* 10 */            if (shapeableImageView.f4777v == null) {
/* 19 */                shapeableImageView.f4777v = new fd1(shapeableImageView.f4778w);
                    }
/* 21 */            RectF rectF = shapeableImageView.f4766b;
/* 23 */            Rect rect = this.f8167a;
/* 25 */            rectF.round(rect);
/* 30 */            shapeableImageView.f4777v.setBounds(rect);
/* 35 */            shapeableImageView.f4777v.getOutline(outline);
                }
            }
