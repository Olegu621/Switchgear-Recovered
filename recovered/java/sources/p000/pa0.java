            package p000;

            import android.content.res.ColorStateList;
            import android.graphics.Canvas;
            import android.graphics.ColorFilter;
            import android.graphics.PorterDuff;
            import android.graphics.Rect;
            import android.graphics.Region;
            import android.graphics.drawable.Drawable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pa0 extends Drawable implements Drawable.Callback {

                /* JADX INFO: renamed from: a */
                public Drawable f15038a;

                /* JADX INFO: renamed from: b */
                public boolean f15039b;

                /* JADX INFO: renamed from: a */
                public final void m7376a(Canvas canvas) {
/* 3 */             this.f15038a.draw(canvas);
                }

                /* JADX INFO: renamed from: b */
                public final void m7377b(float f, float f2) {
/* 3 */             s90.m8445e(this.f15038a, f, f2);
                }

                /* JADX INFO: renamed from: c */
                public final void m7378c(int i, int i2, int i3, int i4) {
/* 3 */             s90.m8446f(this.f15038a, i, i2, i3, i4);
                }

                /* JADX INFO: renamed from: d */
                public final boolean m7379d(boolean z, boolean z2) {
                    return super.setVisible(z, z2) || this.f15038a.setVisible(z, z2);
                }

                @Override // android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
/* 3 */             if (this.f15039b) {
/* 5 */                 m7376a(canvas);
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public final int getChangingConfigurations() {
/* 3 */             return this.f15038a.getChangingConfigurations();
                }

                @Override // android.graphics.drawable.Drawable
                public final Drawable getCurrent() {
/* 3 */             return this.f15038a.getCurrent();
                }

                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicHeight() {
/* 3 */             return this.f15038a.getIntrinsicHeight();
                }

                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicWidth() {
/* 3 */             return this.f15038a.getIntrinsicWidth();
                }

                @Override // android.graphics.drawable.Drawable
                public final int getMinimumHeight() {
/* 3 */             return this.f15038a.getMinimumHeight();
                }

                @Override // android.graphics.drawable.Drawable
                public final int getMinimumWidth() {
/* 3 */             return this.f15038a.getMinimumWidth();
                }

                @Override // android.graphics.drawable.Drawable
                public final int getOpacity() {
/* 3 */             return this.f15038a.getOpacity();
                }

                @Override // android.graphics.drawable.Drawable
                public final boolean getPadding(Rect rect) {
/* 3 */             return this.f15038a.getPadding(rect);
                }

                @Override // android.graphics.drawable.Drawable
                public final int[] getState() {
/* 3 */             return this.f15038a.getState();
                }

                @Override // android.graphics.drawable.Drawable
                public final Region getTransparentRegion() {
/* 3 */             return this.f15038a.getTransparentRegion();
                }

                @Override // android.graphics.drawable.Drawable.Callback
                public final void invalidateDrawable(Drawable drawable) {
/* 1 */             invalidateSelf();
                }

                @Override // android.graphics.drawable.Drawable
                public final boolean isAutoMirrored() {
/* 3 */             return this.f15038a.isAutoMirrored();
                }

                @Override // android.graphics.drawable.Drawable
                public final boolean isStateful() {
/* 3 */             return this.f15038a.isStateful();
                }

                @Override // android.graphics.drawable.Drawable
                public final void jumpToCurrentState() {
/* 3 */             this.f15038a.jumpToCurrentState();
                }

                @Override // android.graphics.drawable.Drawable
                public final void onBoundsChange(Rect rect) {
/* 3 */             this.f15038a.setBounds(rect);
                }

                @Override // android.graphics.drawable.Drawable
                public final boolean onLevelChange(int i) {
/* 3 */             return this.f15038a.setLevel(i);
                }

                @Override // android.graphics.drawable.Drawable.Callback
                public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
/* 1 */             scheduleSelf(runnable, j);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setAlpha(int i) {
/* 3 */             this.f15038a.setAlpha(i);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setAutoMirrored(boolean z) {
/* 3 */             this.f15038a.setAutoMirrored(z);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setChangingConfigurations(int i) {
/* 3 */             this.f15038a.setChangingConfigurations(i);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
/* 3 */             this.f15038a.setColorFilter(colorFilter);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setDither(boolean z) {
/* 3 */             this.f15038a.setDither(z);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setFilterBitmap(boolean z) {
/* 3 */             this.f15038a.setFilterBitmap(z);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setHotspot(float f, float f2) {
/* 3 */             if (this.f15039b) {
/* 5 */                 m7377b(f, f2);
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public final void setHotspotBounds(int i, int i2, int i3, int i4) {
/* 3 */             if (this.f15039b) {
/* 5 */                 m7378c(i, i2, i3, i4);
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public final boolean setState(int[] iArr) {
/* 3 */             if (this.f15039b) {
/* 7 */                 return this.f15038a.setState(iArr);
                    }
/* 12 */            return false;
                }

                @Override // android.graphics.drawable.Drawable
                public final void setTint(int i) {
/* 3 */             s90.m8447g(this.f15038a, i);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setTintList(ColorStateList colorStateList) {
/* 3 */             s90.m8448h(this.f15038a, colorStateList);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setTintMode(PorterDuff.Mode mode) {
/* 3 */             s90.m8449i(this.f15038a, mode);
                }

                @Override // android.graphics.drawable.Drawable
                public final boolean setVisible(boolean z, boolean z2) {
/* 3 */             if (this.f15039b) {
/* 5 */                 return m7379d(z, z2);
                    }
/* 10 */            return false;
                }

                @Override // android.graphics.drawable.Drawable.Callback
                public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
/* 1 */             unscheduleSelf(runnable);
                }
            }
