            package androidx.fragment.app;

            import android.content.Context;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.animation.Animation;
            import p000.f42;
            import p000.lm0;
            import p000.p60;
            import p000.wc0;
            import p000.wf2;
            
            /* JADX INFO: renamed from: androidx.fragment.app.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0090c extends wf2 {

                /* JADX INFO: renamed from: c */
                public final C0092d f1407c;

                public C0090c(C0092d c0092d) {
/* 4 */             this.f1407c = c0092d;
                }

                @Override // p000.wf2
                /* JADX INFO: renamed from: b */
                public final void mo641b(ViewGroup viewGroup) {
/* 1 */             viewGroup.getClass();
/* 6 */             C0091c0 c0091c0 = this.f1407c.f1425a;
/* 10 */            View view = c0091c0.f1410c.mView;
/* 12 */            view.clearAnimation();
/* 15 */            viewGroup.endViewTransition(view);
/* 18 */            c0091c0.m645c(this);
/* 26 */            if (AbstractC0111w.m674K(2)) {
/* 28 */                c0091c0.toString();
                    }
                }

                @Override // p000.wf2
                /* JADX INFO: renamed from: c */
                public final void mo642c(ViewGroup viewGroup) {
/* 1 */             viewGroup.getClass();
/* 4 */             C0092d c0092d = this.f1407c;
/* 6 */             C0091c0 c0091c0 = c0092d.f1425a;
/* 12 */            if (c0092d.m650a()) {
/* 14 */                c0091c0.m645c(this);
/* 17 */                return;
                    }
/* 18 */            Context context = viewGroup.getContext();
/* 24 */            View view = c0091c0.f1410c.mView;
/* 26 */            context.getClass();
/* 29 */            wc0 wc0VarM647b = c0092d.m647b(context);
/* 35 */            if (wc0VarM647b == null) {
/* 89 */                f42.m3656l("Required value was null.");
/* 92 */                return;
                    }
/* 39 */            Animation animation = (Animation) wc0VarM647b.f18577b;
/* 41 */            if (animation == null) {
/* 85 */                f42.m3656l("Required value was null.");
/* 88 */                return;
                    }
/* 46 */            if (c0091c0.f1408a != 1) {
/* 48 */                view.startAnimation(animation);
/* 51 */                c0091c0.m645c(this);
/* 54 */                return;
                    }
/* 55 */            viewGroup.startViewTransition(view);
/* 60 */            lm0 lm0Var = new lm0(animation, viewGroup, view);
/* 68 */            lm0Var.setAnimationListener(new p60(c0091c0, viewGroup, view, this));
/* 71 */            view.startAnimation(lm0Var);
/* 79 */            if (AbstractC0111w.m674K(2)) {
/* 81 */                c0091c0.toString();
                    }
                }
            }
