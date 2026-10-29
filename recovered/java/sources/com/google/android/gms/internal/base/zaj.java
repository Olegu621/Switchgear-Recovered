            package com.google.android.gms.internal.base;

            import android.graphics.drawable.Drawable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zaj extends Drawable.ConstantState {
                int zaa;
                int zab;

                public zaj(zaj zajVar) {
/* 4 */             if (zajVar != null) {
/* 8 */                 this.zaa = zajVar.zaa;
/* 12 */                this.zab = zajVar.zab;
                    }
                }

                @Override // android.graphics.drawable.Drawable.ConstantState
                public final int getChangingConfigurations() {
/* 1 */             return this.zaa;
                }

                @Override // android.graphics.drawable.Drawable.ConstantState
                public final Drawable newDrawable() {
/* 3 */             return new zak(this);
                }
            }
