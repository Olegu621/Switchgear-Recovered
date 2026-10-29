            package com.google.android.material.circularreveal;

            import android.content.Context;
            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.widget.RelativeLayout;
            import p000.C0168b5;
            import p000.C2564zu;
            import p000.InterfaceC0157av;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class CircularRevealRelativeLayout extends RelativeLayout implements InterfaceC0157av {

                /* JADX INFO: renamed from: a */
                public final C0168b5 f4609a;

                public CircularRevealRelativeLayout(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 9 */             this.f4609a = new C0168b5(this);
                }

                @Override // p000.InterfaceC0157av
                /* JADX INFO: renamed from: a */
                public final void mo1170a() {
/* 3 */             this.f4609a.getClass();
                }

                @Override // p000.InterfaceC0157av
                /* JADX INFO: renamed from: b */
                public final void mo1171b() {
/* 3 */             this.f4609a.getClass();
                }

                @Override // p000.InterfaceC0157av
                /* JADX INFO: renamed from: c */
                public final void mo1172c(Canvas canvas) {
/* 1 */             super.draw(canvas);
                }

                @Override // p000.InterfaceC0157av
                /* JADX INFO: renamed from: d */
                public final boolean mo1173d() {
/* 1 */             return super.isOpaque();
                }

                @Override // android.view.View
                public final void draw(Canvas canvas) {
/* 1 */             C0168b5 c0168b5 = this.f4609a;
/* 3 */             if (c0168b5 != null) {
/* 5 */                 c0168b5.m1269o(canvas);
                    } else {
/* 9 */                 super.draw(canvas);
                    }
                }

                public Drawable getCircularRevealOverlayDrawable() {
/* 5 */             return (Drawable) this.f4609a.f2215f;
                }

                @Override // p000.InterfaceC0157av
                public int getCircularRevealScrimColor() {
/* 7 */             return ((Paint) this.f4609a.f2213d).getColor();
                }

                @Override // p000.InterfaceC0157av
                public C2564zu getRevealInfo() {
/* 3 */             return this.f4609a.m1272s();
                }

                @Override // android.view.View
                public final boolean isOpaque() {
/* 1 */             C0168b5 c0168b5 = this.f4609a;
                    return c0168b5 != null ? c0168b5.m1277x() : super.isOpaque();
                }

                @Override // p000.InterfaceC0157av
                public void setCircularRevealOverlayDrawable(Drawable drawable) {
/* 3 */             this.f4609a.m1248C(drawable);
                }

                @Override // p000.InterfaceC0157av
                public void setCircularRevealScrimColor(int i) {
/* 3 */             this.f4609a.m1249D(i);
                }

                @Override // p000.InterfaceC0157av
                public void setRevealInfo(C2564zu c2564zu) {
/* 3 */             this.f4609a.m1251F(c2564zu);
                }
            }
