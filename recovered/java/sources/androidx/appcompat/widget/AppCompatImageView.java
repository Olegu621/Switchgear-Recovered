            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.Bitmap;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.RippleDrawable;
            import android.net.Uri;
            import android.util.AttributeSet;
            import android.widget.ImageView;
            import p000.C0173ba;
            import p000.C0174bb;
            import p000.sn2;
            import p000.uo2;
            import p000.vo2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 36 */    public class AppCompatImageView extends ImageView {
                private final C0173ba mBackgroundTintHelper;
                private boolean mHasLevel;
                private final C0174bb mImageHelper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
/* 4 */             super(context, attributeSet, i);
/* 1 */             uo2.m9055a(context);
/* 8 */             this.mHasLevel = false;
/* 14 */            sn2.m8583a(this, getContext());
/* 19 */            C0173ba c0173ba = new C0173ba(this);
/* 22 */            this.mBackgroundTintHelper = c0173ba;
/* 24 */            c0173ba.m1304d(attributeSet, i);
/* 29 */            C0174bb c0174bb = new C0174bb(this);
/* 32 */            this.mImageHelper = c0174bb;
/* 34 */            c0174bb.m1313b(attributeSet, i);
                }

                @Override // android.widget.ImageView, android.view.View
                public void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             C0173ba c0173ba = this.mBackgroundTintHelper;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1301a();
                    }
/* 11 */            C0174bb c0174bb = this.mImageHelper;
/* 13 */            if (c0174bb != null) {
/* 15 */                c0174bb.m1312a();
                    }
                }

                public ColorStateList getSupportBackgroundTintList() {
/* 1 */             C0173ba c0173ba = this.mBackgroundTintHelper;
/* 3 */             if (c0173ba != null) {
/* 5 */                 return c0173ba.m1302b();
                    }
/* 10 */            return null;
                }

                public PorterDuff.Mode getSupportBackgroundTintMode() {
/* 1 */             C0173ba c0173ba = this.mBackgroundTintHelper;
/* 3 */             if (c0173ba != null) {
/* 5 */                 return c0173ba.m1303c();
                    }
/* 10 */            return null;
                }

                public ColorStateList getSupportImageTintList() {
                    vo2 vo2Var;
/* 1 */             C0174bb c0174bb = this.mImageHelper;
/* 4 */             if (c0174bb == null || (vo2Var = c0174bb.f2342b) == null) {
/* 3 */                 return null;
                    }
/* 10 */            return vo2Var.f18261a;
                }

                public PorterDuff.Mode getSupportImageTintMode() {
                    vo2 vo2Var;
/* 1 */             C0174bb c0174bb = this.mImageHelper;
/* 4 */             if (c0174bb == null || (vo2Var = c0174bb.f2342b) == null) {
/* 3 */                 return null;
                    }
/* 10 */            return vo2Var.f18262b;
                }

                @Override // android.widget.ImageView, android.view.View
                public boolean hasOverlappingRendering() {
                    return !(this.mImageHelper.f2341a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
                }

                @Override // android.view.View
                public void setBackgroundDrawable(Drawable drawable) {
/* 1 */             super.setBackgroundDrawable(drawable);
/* 4 */             C0173ba c0173ba = this.mBackgroundTintHelper;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1305e();
                    }
                }

                @Override // android.view.View
                public void setBackgroundResource(int i) {
/* 1 */             super.setBackgroundResource(i);
/* 4 */             C0173ba c0173ba = this.mBackgroundTintHelper;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1306f(i);
                    }
                }

                @Override // android.widget.ImageView
                public void setImageBitmap(Bitmap bitmap) {
/* 1 */             super.setImageBitmap(bitmap);
/* 4 */             C0174bb c0174bb = this.mImageHelper;
/* 6 */             if (c0174bb != null) {
/* 8 */                 c0174bb.m1312a();
                    }
                }

                @Override // android.widget.ImageView
                public void setImageDrawable(Drawable drawable) {
/* 1 */             C0174bb c0174bb = this.mImageHelper;
/* 3 */             if (c0174bb != null && drawable != null && !this.mHasLevel) {
/* 15 */                c0174bb.f2343c = drawable.getLevel();
                    }
/* 17 */            super.setImageDrawable(drawable);
/* 20 */            C0174bb c0174bb2 = this.mImageHelper;
/* 22 */            if (c0174bb2 != null) {
/* 24 */                c0174bb2.m1312a();
/* 29 */                if (this.mHasLevel) {
/* 50 */                    return;
                        }
/* 31 */                C0174bb c0174bb3 = this.mImageHelper;
/* 33 */                ImageView imageView = c0174bb3.f2341a;
/* 39 */                if (imageView.getDrawable() != null) {
/* 47 */                    imageView.getDrawable().setLevel(c0174bb3.f2343c);
                        }
                    }
                }

                @Override // android.widget.ImageView
                public void setImageLevel(int i) {
/* 1 */             super.setImageLevel(i);
/* 5 */             this.mHasLevel = true;
                }

                @Override // android.widget.ImageView
                public void setImageResource(int i) {
/* 1 */             C0174bb c0174bb = this.mImageHelper;
/* 3 */             if (c0174bb != null) {
/* 5 */                 c0174bb.m1314c(i);
                    }
                }

                @Override // android.widget.ImageView
                public void setImageURI(Uri uri) {
/* 1 */             super.setImageURI(uri);
/* 4 */             C0174bb c0174bb = this.mImageHelper;
/* 6 */             if (c0174bb != null) {
/* 8 */                 c0174bb.m1312a();
                    }
                }

                public void setSupportBackgroundTintList(ColorStateList colorStateList) {
/* 1 */             C0173ba c0173ba = this.mBackgroundTintHelper;
/* 3 */             if (c0173ba != null) {
/* 5 */                 c0173ba.m1308h(colorStateList);
                    }
                }

                public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
/* 1 */             C0173ba c0173ba = this.mBackgroundTintHelper;
/* 3 */             if (c0173ba != null) {
/* 5 */                 c0173ba.m1309i(mode);
                    }
                }

                public void setSupportImageTintList(ColorStateList colorStateList) {
/* 1 */             C0174bb c0174bb = this.mImageHelper;
/* 3 */             if (c0174bb != null) {
/* 7 */                 if (c0174bb.f2342b == null) {
/* 14 */                    c0174bb.f2342b = new vo2();
                        }
/* 16 */                vo2 vo2Var = c0174bb.f2342b;
/* 18 */                vo2Var.f18261a = colorStateList;
/* 21 */                vo2Var.f18264d = true;
/* 23 */                c0174bb.m1312a();
                    }
                }

                public void setSupportImageTintMode(PorterDuff.Mode mode) {
/* 1 */             C0174bb c0174bb = this.mImageHelper;
/* 3 */             if (c0174bb != null) {
/* 7 */                 if (c0174bb.f2342b == null) {
/* 14 */                    c0174bb.f2342b = new vo2();
                        }
/* 16 */                vo2 vo2Var = c0174bb.f2342b;
/* 18 */                vo2Var.f18262b = mode;
/* 21 */                vo2Var.f18263c = true;
/* 23 */                c0174bb.m1312a();
                    }
                }

/* 37 */        public AppCompatImageView(Context context, AttributeSet attributeSet) {
/* 38 */            this(context, attributeSet, 0);
                }

/* 38 */        public AppCompatImageView(Context context) {
/* 39 */            this(context, null);
                }
            }
