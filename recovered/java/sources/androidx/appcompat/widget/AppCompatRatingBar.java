            package androidx.appcompat.widget;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.util.AttributeSet;
            import android.view.View;
            import android.widget.RatingBar;
            import androidx.appcompat.R$attr;
            import p000.C0210cb;
            import p000.sn2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 21 */    public class AppCompatRatingBar extends RatingBar {

                /* JADX INFO: renamed from: a */
                public final C0210cb f519a;

                public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 8 */             sn2.m8583a(this, getContext());
/* 14 */            C0210cb c0210cb = new C0210cb(this, 0);
/* 17 */            this.f519a = c0210cb;
/* 19 */            c0210cb.mo1568B(attributeSet, i);
                }

                @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
                public final synchronized void onMeasure(int i, int i2) {
/* 2 */             super.onMeasure(i, i2);
/* 9 */             Bitmap bitmap = (Bitmap) this.f519a.f2805c;
/* 11 */            if (bitmap != null) {
/* 31 */                setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
                    }
                }

/* 22 */        public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
/* 23 */            this(context, attributeSet, R$attr.ratingBarStyle);
                }
            }
