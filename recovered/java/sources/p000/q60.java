            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.fragment.app.AbstractC0111w;
            import androidx.fragment.app.C0091c0;
            import androidx.fragment.app.C0093e;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class q60 extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ViewGroup f15404a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ View f15405b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f15406c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C0091c0 f15407d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ C0093e f15408e;

                public q60(ViewGroup viewGroup, View view, boolean z, C0091c0 c0091c0, C0093e c0093e) {
/* 1 */             this.f15404a = viewGroup;
/* 3 */             this.f15405b = view;
/* 5 */             this.f15406c = z;
/* 7 */             this.f15407d = c0091c0;
/* 9 */             this.f15408e = c0093e;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
/* 1 */             animator.getClass();
/* 4 */             ViewGroup viewGroup = this.f15404a;
/* 6 */             View view = this.f15405b;
/* 8 */             viewGroup.endViewTransition(view);
/* 11 */            boolean z = this.f15406c;
/* 13 */            C0091c0 c0091c0 = this.f15407d;
/* 15 */            if (z) {
/* 17 */                int i = c0091c0.f1408a;
/* 19 */                view.getClass();
/* 22 */                fm0.m3775a(i, view, viewGroup);
                    }
/* 25 */            C0093e c0093e = this.f15408e;
/* 31 */            c0093e.f1423c.f1425a.m645c(c0093e);
/* 39 */            if (AbstractC0111w.m674K(2)) {
/* 41 */                Objects.toString(c0091c0);
                    }
                }
            }
