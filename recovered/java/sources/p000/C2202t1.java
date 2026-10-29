            package p000;

            import android.graphics.Canvas;
            import android.graphics.ColorFilter;
            import android.graphics.Outline;
            import android.graphics.drawable.Drawable;
            import androidx.appcompat.widget.ActionBarContainer;
            
            /* JADX INFO: renamed from: t1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2202t1 extends Drawable {

                /* JADX INFO: renamed from: a */
                public final ActionBarContainer f16893a;

                public C2202t1(ActionBarContainer actionBarContainer) {
/* 4 */             this.f16893a = actionBarContainer;
                }

                @Override // android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
/* 1 */             ActionBarContainer actionBarContainer = this.f16893a;
/* 5 */             if (actionBarContainer.f402i) {
/* 7 */                 Drawable drawable = actionBarContainer.f401f;
/* 9 */                 if (drawable != null) {
/* 11 */                    drawable.draw(canvas);
/* 14 */                    return;
                        }
/* 33 */                return;
                    }
/* 15 */            Drawable drawable2 = actionBarContainer.f399d;
/* 17 */            if (drawable2 != null) {
/* 19 */                drawable2.draw(canvas);
                    }
/* 22 */            Drawable drawable3 = actionBarContainer.f400e;
/* 24 */            if (drawable3 == null || !actionBarContainer.f403v) {
/* 33 */                return;
                    }
/* 30 */            drawable3.draw(canvas);
                }

                @Override // android.graphics.drawable.Drawable
                public final int getOpacity() {
/* 1 */             return 0;
                }

                @Override // android.graphics.drawable.Drawable
                public final void getOutline(Outline outline) {
/* 1 */             ActionBarContainer actionBarContainer = this.f16893a;
/* 5 */             if (actionBarContainer.f402i) {
/* 9 */                 if (actionBarContainer.f401f != null) {
/* 13 */                    actionBarContainer.f399d.getOutline(outline);
                        }
                    } else {
/* 17 */                Drawable drawable = actionBarContainer.f399d;
/* 19 */                if (drawable != null) {
/* 21 */                    drawable.getOutline(outline);
                        }
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public final void setAlpha(int i) {
                }

                @Override // android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
                }
            }
