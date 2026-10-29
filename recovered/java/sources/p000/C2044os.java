            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            import android.graphics.Rect;
            import android.view.View;
            import java.util.WeakHashMap;
            
            /* JADX INFO: renamed from: os */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2044os extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public boolean f14875a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ View f14876b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Rect f14877c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f14878d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f14879e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ int f14880f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ int f14881g;

                public C2044os(View view, Rect rect, int i, int i2, int i3, int i4) {
/* 1 */             this.f14876b = view;
/* 3 */             this.f14877c = rect;
/* 5 */             this.f14878d = i;
/* 7 */             this.f14879e = i2;
/* 9 */             this.f14880f = i3;
/* 11 */            this.f14881g = i4;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
/* 2 */             this.f14875a = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
/* 3 */             if (this.f14875a) {
/* 25 */                return;
                    }
/* 5 */             WeakHashMap weakHashMap = e33.f7494a;
/* 7 */             View view = this.f14876b;
/* 11 */            view.setClipBounds(this.f14877c);
/* 22 */            l53.m6342a(view, this.f14878d, this.f14879e, this.f14880f, this.f14881g);
                }
            }
