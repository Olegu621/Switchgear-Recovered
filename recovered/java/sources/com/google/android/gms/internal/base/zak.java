            package com.google.android.gms.internal.base;

            import android.graphics.Canvas;
            import android.graphics.ColorFilter;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.os.SystemClock;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 48 */    public final class zak extends Drawable implements Drawable.Callback {
                private int zaa;
                private long zab;
                private int zac;
                private int zad;
                private int zae;
                private int zaf;
                private boolean zag;
                private boolean zah;
                private zaj zai;
                private Drawable zaj;
                private Drawable zak;
                private boolean zal;
                private boolean zam;
                private boolean zan;
                private int zao;

                public zak(Drawable drawable, Drawable drawable2) {
/* 2 */             this(null);
/* 1 */             drawable = drawable == null ? zai.zaa : drawable;
/* 11 */            this.zaj = drawable;
/* 13 */            drawable.setCallback(this);
/* 16 */            zaj zajVar = this.zai;
/* 25 */            zajVar.zab = drawable.getChangingConfigurations() | zajVar.zab;
/* 1 */             drawable2 = drawable2 == null ? zai.zaa : drawable2;
/* 33 */            this.zak = drawable2;
/* 35 */            drawable2.setCallback(this);
/* 47 */            this.zai.zab |= drawable2.getChangingConfigurations();
                }

                /* JADX WARN: Code duplicated, block: B:25:0x005b  */
                /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
                @Override // android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
                    boolean z;
                    int i;
/* 1 */             int i2 = this.zaa;
/* 4 */             int i3 = 0;
/* 6 */             if (i2 == 1) {
/* 63 */                this.zab = SystemClock.uptimeMillis();
/* 65 */                this.zaa = 2;
/* 67 */                z = false;
                    } else if (i2 == 2 && this.zab >= 0) {
/* 31 */                float fUptimeMillis = (SystemClock.uptimeMillis() - this.zab) / this.zae;
/* 40 */                z = fUptimeMillis >= 1.0f;
/* 41 */                if (z) {
/* 43 */                    this.zaa = 0;
                        }
/* 56 */                this.zaf = (int) ((this.zac * Math.min(fUptimeMillis, 1.0f)) + 0.0f);
                    } else {
/* 10 */                z = true;
                    }
/* 68 */            int i4 = this.zaf;
/* 70 */            boolean z2 = this.zag;
/* 72 */            Drawable drawable = this.zaj;
/* 74 */            Drawable drawable2 = this.zak;
/* 76 */            if (!z) {
/* 99 */                if (z2) {
/* 104 */                   drawable.setAlpha(this.zad - i4);
/* 107 */                   i3 = 1;
                        }
/* 108 */               drawable.draw(canvas);
/* 111 */               if (i3 != 0) {
/* 115 */                   drawable.setAlpha(this.zad);
                        }
/* 118 */               if (i4 > 0) {
/* 120 */                   drawable2.setAlpha(i4);
/* 123 */                   drawable2.draw(canvas);
/* 128 */                   drawable2.setAlpha(this.zad);
                        }
/* 131 */               invalidateSelf();
/* 134 */               return;
                    }
/* 78 */            if (z2) {
/* 80 */                if (i4 == 0) {
                        }
/* 88 */                i = this.zad;
/* 90 */                if (i4 == i) {
/* 92 */                    drawable2.setAlpha(i);
/* 95 */                    drawable2.draw(canvas);
                        }
                    }
/* 83 */            i3 = i4;
/* 84 */            drawable.draw(canvas);
/* 87 */            i4 = i3;
/* 88 */            i = this.zad;
/* 90 */            if (i4 == i) {
/* 92 */                drawable2.setAlpha(i);
/* 95 */                drawable2.draw(canvas);
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public final int getChangingConfigurations() {
/* 1 */             int changingConfigurations = super.getChangingConfigurations();
/* 5 */             zaj zajVar = this.zai;
/* 12 */            return zajVar.zab | changingConfigurations | zajVar.zaa;
                }

                @Override // android.graphics.drawable.Drawable
                public final Drawable.ConstantState getConstantState() {
/* 5 */             if (!zac()) {
/* 18 */                return null;
                    }
/* 13 */            this.zai.zaa = getChangingConfigurations();
/* 15 */            return this.zai;
                }

                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicHeight() {
/* 13 */            return Math.max(this.zaj.getIntrinsicHeight(), this.zak.getIntrinsicHeight());
                }

                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicWidth() {
/* 13 */            return Math.max(this.zaj.getIntrinsicWidth(), this.zak.getIntrinsicWidth());
                }

                @Override // android.graphics.drawable.Drawable
                public final int getOpacity() {
/* 3 */             if (!this.zan) {
/* 21 */                this.zao = Drawable.resolveOpacity(this.zaj.getOpacity(), this.zak.getOpacity());
/* 24 */                this.zan = true;
                    }
/* 26 */            return this.zao;
                }

                @Override // android.graphics.drawable.Drawable.Callback
                public final void invalidateDrawable(Drawable drawable) {
/* 1 */             Drawable.Callback callback = getCallback();
/* 5 */             if (callback != null) {
/* 7 */                 callback.invalidateDrawable(this);
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public final Drawable mutate() {
/* 3 */             if (this.zah || super.mutate() != this) {
/* 37 */                return this;
                    }
/* 15 */            if (!zac()) {
/* 33 */                f42.m3656l("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
/* 36 */                return null;
                    }
/* 19 */            this.zaj.mutate();
/* 24 */            this.zak.mutate();
/* 28 */            this.zah = true;
/* 30 */            return this;
                }

                @Override // android.graphics.drawable.Drawable
                public final void onBoundsChange(Rect rect) {
/* 3 */             this.zaj.setBounds(rect);
/* 8 */             this.zak.setBounds(rect);
                }

                @Override // android.graphics.drawable.Drawable.Callback
                public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
/* 1 */             Drawable.Callback callback = getCallback();
/* 5 */             if (callback != null) {
/* 7 */                 callback.scheduleDrawable(this, runnable, j);
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public final void setAlpha(int i) {
/* 5 */             if (this.zaf == this.zad) {
/* 7 */                 this.zaf = i;
                    }
/* 9 */             this.zad = i;
/* 11 */            invalidateSelf();
                }

                @Override // android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
/* 3 */             this.zaj.setColorFilter(colorFilter);
/* 8 */             this.zak.setColorFilter(colorFilter);
                }

                @Override // android.graphics.drawable.Drawable.Callback
                public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
/* 1 */             Drawable.Callback callback = getCallback();
/* 5 */             if (callback != null) {
/* 7 */                 callback.unscheduleDrawable(this, runnable);
                    }
                }

                public final Drawable zaa() {
/* 1 */             return this.zak;
                }

                public final void zab(int i) {
/* 3 */             this.zac = this.zad;
/* 6 */             this.zaf = 0;
/* 10 */            this.zae = 250;
/* 13 */            this.zaa = 1;
/* 15 */            invalidateSelf();
                }

                public final boolean zac() {
/* 3 */             if (!this.zal) {
/* 11 */                boolean z = false;
/* 13 */                if (this.zaj.getConstantState() != null && this.zak.getConstantState() != null) {
/* 23 */                    z = true;
                        }
/* 24 */                this.zam = z;
/* 26 */                this.zal = true;
                    }
/* 28 */            return this.zam;
                }

/* 49 */        public zak(zaj zajVar) {
                    this.zaa = 0;
                    this.zad = 255;
                    this.zaf = 0;
                    this.zag = true;
/* 51 */            this.zai = new zaj(zajVar);
                }
            }
