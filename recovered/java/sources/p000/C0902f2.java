            package p000;

            import android.content.Context;
            import android.graphics.drawable.Drawable;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.widget.AppCompatImageView;
            import androidx.appcompat.widget.C0062b;
            
            /* JADX INFO: renamed from: f2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0902f2 extends AppCompatImageView implements InterfaceC0939g2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C0062b f7972a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0902f2(C0062b c0062b, Context context) {
/* 6 */             super(context, null, R$attr.actionOverflowButtonStyle);
/* 1 */             this.f7972a = c0062b;
/* 10 */            setClickable(true);
/* 13 */            setFocusable(true);
/* 17 */            setVisibility(0);
/* 20 */            setEnabled(true);
/* 27 */            i13.m4420B(this, getContentDescription());
/* 35 */            setOnTouchListener(new C0165b2(this, this, 1));
                }

                @Override // p000.InterfaceC0939g2
                /* JADX INFO: renamed from: a */
                public final boolean mo325a() {
/* 1 */             return false;
                }

                @Override // p000.InterfaceC0939g2
                /* JADX INFO: renamed from: b */
                public final boolean mo326b() {
/* 1 */             return false;
                }

                @Override // android.view.View
                public final boolean performClick() {
/* 6 */             if (super.performClick()) {
/* 5 */                 return true;
                    }
/* 10 */            playSoundEffect(0);
/* 15 */            this.f7972a.m428n();
/* 5 */             return true;
                }

                @Override // android.widget.ImageView
                public final boolean setFrame(int i, int i2, int i3, int i4) {
/* 1 */             boolean frame = super.setFrame(i, i2, i3, i4);
/* 5 */             Drawable drawable = getDrawable();
/* 9 */             Drawable background = getBackground();
/* 13 */            if (drawable != null && background != null) {
/* 17 */                int width = getWidth();
/* 21 */                int height = getHeight();
/* 29 */                int iMax = Math.max(width, height) / 2;
/* 50 */                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
/* 53 */                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
/* 61 */                s90.m8446f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
                    }
/* 64 */            return frame;
                }
            }
