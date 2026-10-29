            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import android.view.animation.Animation;
            import androidx.fragment.app.AbstractC0111w;
            import androidx.fragment.app.C0090c;
            import androidx.fragment.app.C0091c0;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class p60 implements Animation.AnimationListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C0091c0 f14978a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ViewGroup f14979b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ View f14980c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C0090c f14981d;

                public p60(C0091c0 c0091c0, ViewGroup viewGroup, View view, C0090c c0090c) {
/* 4 */             this.f14978a = c0091c0;
/* 6 */             this.f14979b = viewGroup;
/* 8 */             this.f14980c = view;
/* 10 */            this.f14981d = c0090c;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
/* 1 */             animation.getClass();
/* 7 */             ViewGroup viewGroup = this.f14979b;
/* 16 */            viewGroup.post(new RunnableC2558zo(2, viewGroup, this.f14980c, this.f14981d));
/* 23 */            if (AbstractC0111w.m674K(2)) {
/* 27 */                Objects.toString(this.f14978a);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
/* 1 */             animation.getClass();
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
/* 1 */             animation.getClass();
/* 9 */             if (AbstractC0111w.m674K(2)) {
/* 13 */                Objects.toString(this.f14978a);
                    }
                }
            }
