            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            import androidx.appcompat.widget.ActionMenuView;
            import com.google.android.material.bottomappbar.BottomAppBar;
            
            /* JADX INFO: renamed from: lk */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1893lk extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public boolean f13334a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ActionMenuView f13335b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f13336c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f13337d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ BottomAppBar f13338e;

                public C1893lk(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
/* 1 */             this.f13338e = bottomAppBar;
/* 3 */             this.f13335b = actionMenuView;
/* 5 */             this.f13336c = i;
/* 7 */             this.f13337d = z;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
/* 2 */             this.f13334a = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
/* 3 */             if (this.f13334a) {
/* 17 */                return;
                    }
/* 14 */            this.f13338e.m2250I(this.f13335b, this.f13336c, this.f13337d, false);
                }
            }
