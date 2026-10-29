            package com.google.android.material.internal;

            import android.content.Context;
            import android.util.AttributeSet;
            import android.widget.ImageButton;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public class VisibilityAwareImageButton extends ImageButton {

                /* JADX INFO: renamed from: a */
                public int f4811a;

                public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 8 */             this.f4811a = getVisibility();
                }

                /* JADX INFO: renamed from: a */
                public final void m2344a(int i, boolean z) {
/* 1 */             super.setVisibility(i);
/* 4 */             if (z) {
/* 6 */                 this.f4811a = i;
                    }
                }

                public final int getUserSetVisibility() {
/* 1 */             return this.f4811a;
                }

                @Override // android.widget.ImageView, android.view.View
                public void setVisibility(int i) {
/* 2 */             m2344a(i, true);
                }

/* 10 */        public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
/* 11 */            this(context, attributeSet, 0);
                }
            }
