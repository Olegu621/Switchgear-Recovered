            package androidx.appcompat.widget;

            import android.content.Context;
            import android.graphics.Canvas;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.widget.SeekBar;
            import androidx.appcompat.R$attr;
            import p000.C0874eb;
            import p000.sn2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 20 */    public class AppCompatSeekBar extends SeekBar {

                /* JADX INFO: renamed from: a */
                public final C0874eb f520a;

                public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 8 */             sn2.m8583a(this, getContext());
/* 13 */            C0874eb c0874eb = new C0874eb(this);
/* 16 */            this.f520a = c0874eb;
/* 18 */            c0874eb.mo1568B(attributeSet, i);
                }

                @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             C0874eb c0874eb = this.f520a;
/* 6 */             AppCompatSeekBar appCompatSeekBar = c0874eb.f7600i;
/* 8 */             Drawable drawable = c0874eb.f7601v;
/* 10 */            if (drawable != null && drawable.isStateful() && drawable.setState(appCompatSeekBar.getDrawableState())) {
/* 28 */                appCompatSeekBar.invalidateDrawable(drawable);
                    }
                }

                @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
                public final void jumpDrawablesToCurrentState() {
/* 1 */             super.jumpDrawablesToCurrentState();
/* 6 */             Drawable drawable = this.f520a.f7601v;
/* 8 */             if (drawable != null) {
/* 10 */                drawable.jumpToCurrentState();
                    }
                }

                @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
                public final synchronized void onDraw(Canvas canvas) {
/* 2 */             super.onDraw(canvas);
/* 7 */             this.f520a.m3356P(canvas);
                }

/* 21 */        public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
/* 22 */            this(context, attributeSet, R$attr.seekBarStyle);
                }
            }
