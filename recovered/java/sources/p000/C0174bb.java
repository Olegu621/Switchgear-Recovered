            package p000;

            import android.content.res.TypedArray;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.widget.ImageView;
            import androidx.appcompat.R$styleable;
            
            /* JADX INFO: renamed from: bb */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0174bb {

                /* JADX INFO: renamed from: a */
                public final ImageView f2341a;

                /* JADX INFO: renamed from: b */
                public vo2 f2342b;

                /* JADX INFO: renamed from: c */
                public int f2343c = 0;

                public C0174bb(ImageView imageView) {
/* 7 */             this.f2341a = imageView;
                }

                /* JADX INFO: renamed from: a */
                public final void m1312a() {
                    vo2 vo2Var;
/* 1 */             ImageView imageView = this.f2341a;
/* 3 */             Drawable drawable = imageView.getDrawable();
/* 7 */             if (drawable != null) {
/* 9 */                 w90.m9483a(drawable);
                    }
/* 12 */            if (drawable == null || (vo2Var = this.f2342b) == null) {
/* 25 */                return;
                    }
/* 22 */            C2491ya.m10135e(drawable, vo2Var, imageView.getDrawableState());
                }

                /* JADX INFO: renamed from: b */
                public final void m1313b(AttributeSet attributeSet, int i) {
                    int resourceId;
/* 1 */             ImageView imageView = this.f2341a;
/* 9 */             ac1 ac1VarM156H = ac1.m156H(imageView.getContext(), attributeSet, R$styleable.AppCompatImageView, i);
/* 16 */            TypedArray typedArray = (TypedArray) ac1VarM156H.f178c;
/* 31 */            e33.m3317m(imageView, imageView.getContext(), R$styleable.AppCompatImageView, attributeSet, (TypedArray) ac1VarM156H.f178c, i);
                    try {
/* 34 */                Drawable drawable = imageView.getDrawable();
/* 39 */                if (drawable == null && (resourceId = typedArray.getResourceId(R$styleable.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = mn0.m6700p(imageView.getContext(), resourceId)) != null) {
/* 59 */                    imageView.setImageDrawable(drawable);
                        }
/* 66 */                if (drawable != null) {
/* 68 */                    w90.m9483a(drawable);
                        }
/* 77 */                if (typedArray.hasValue(R$styleable.AppCompatImageView_tint)) {
/* 85 */                    qw0.m8024c(imageView, ac1VarM156H.m183m(R$styleable.AppCompatImageView_tint));
                        }
/* 94 */                if (typedArray.hasValue(R$styleable.AppCompatImageView_tintMode)) {
/* 107 */                   qw0.m8025d(imageView, w90.m9485c(typedArray.getInt(R$styleable.AppCompatImageView_tintMode, -1), null));
                        }
                    } finally {
/* 114 */               ac1VarM156H.m168J();
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m1314c(int i) {
/* 1 */             ImageView imageView = this.f2341a;
/* 3 */             if (i != 0) {
/* 9 */                 Drawable drawableM6700p = mn0.m6700p(imageView.getContext(), i);
/* 13 */                if (drawableM6700p != null) {
/* 15 */                    w90.m9483a(drawableM6700p);
                        }
/* 18 */                imageView.setImageDrawable(drawableM6700p);
                    } else {
/* 23 */                imageView.setImageDrawable(null);
                    }
/* 26 */            m1312a();
                }
            }
