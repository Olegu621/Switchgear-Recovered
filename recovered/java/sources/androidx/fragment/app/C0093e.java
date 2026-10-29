            package androidx.fragment.app;

            import android.animation.AnimatorSet;
            import android.content.Context;
            import android.os.Build;
            import android.view.View;
            import android.view.ViewGroup;
            import java.util.Objects;
            import p000.C0917fh;
            import p000.q60;
            import p000.r60;
            import p000.s60;
            import p000.wc0;
            import p000.wf2;
            
            /* JADX INFO: renamed from: androidx.fragment.app.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0093e extends wf2 {

                /* JADX INFO: renamed from: c */
                public final C0092d f1423c;

                /* JADX INFO: renamed from: d */
                public AnimatorSet f1424d;

                public C0093e(C0092d c0092d) {
/* 4 */             this.f1423c = c0092d;
                }

                @Override // p000.wf2
                /* JADX INFO: renamed from: b */
                public final void mo641b(ViewGroup viewGroup) {
/* 1 */             viewGroup.getClass();
/* 4 */             AnimatorSet animatorSet = this.f1424d;
/* 8 */             C0091c0 c0091c0 = this.f1423c.f1425a;
/* 10 */            if (animatorSet == null) {
/* 12 */                c0091c0.m645c(this);
/* 15 */                return;
                    }
/* 18 */            if (!c0091c0.f1414g) {
/* 32 */                animatorSet.end();
                    } else if (Build.VERSION.SDK_INT >= 26) {
/* 28 */                s60.f16448a.m8414a(animatorSet);
                    }
/* 40 */            if (AbstractC0111w.m674K(2)) {
/* 42 */                c0091c0.toString();
                    }
                }

                @Override // p000.wf2
                /* JADX INFO: renamed from: c */
                public final void mo642c(ViewGroup viewGroup) {
/* 1 */             viewGroup.getClass();
/* 6 */             C0091c0 c0091c0 = this.f1423c.f1425a;
/* 8 */             AnimatorSet animatorSet = this.f1424d;
/* 10 */            if (animatorSet == null) {
/* 12 */                c0091c0.m645c(this);
/* 15 */                return;
                    }
/* 16 */            animatorSet.start();
/* 24 */            if (AbstractC0111w.m674K(2)) {
/* 26 */                Objects.toString(c0091c0);
                    }
                }

                @Override // p000.wf2
                /* JADX INFO: renamed from: d */
                public final void mo648d(C0917fh c0917fh, ViewGroup viewGroup) {
/* 1 */             viewGroup.getClass();
/* 6 */             C0091c0 c0091c0 = this.f1423c.f1425a;
/* 8 */             AnimatorSet animatorSet = this.f1424d;
/* 10 */            if (animatorSet == null) {
/* 12 */                c0091c0.m645c(this);
/* 15 */                return;
                    }
/* 20 */            if (Build.VERSION.SDK_INT < 34 || !c0091c0.f1410c.mTransitioning) {
/* 81 */                return;
                    }
/* 33 */            if (AbstractC0111w.m674K(2)) {
/* 35 */                c0091c0.toString();
                    }
/* 40 */            long jM8075a = r60.f15886a.m8075a(animatorSet);
/* 48 */            long j = (long) (c0917fh.f8211c * jM8075a);
/* 55 */            if (j == 0) {
/* 57 */                j = 1;
                    }
/* 60 */            if (j == jM8075a) {
/* 62 */                j = jM8075a - 1;
                    }
/* 68 */            if (AbstractC0111w.m674K(2)) {
/* 70 */                animatorSet.toString();
/* 73 */                c0091c0.toString();
                    }
/* 78 */            s60.f16448a.m8415b(animatorSet, j);
                }

                @Override // p000.wf2
                /* JADX INFO: renamed from: e */
                public final void mo649e(ViewGroup viewGroup) {
                    C0093e c0093e;
/* 1 */             viewGroup.getClass();
/* 4 */             C0092d c0092d = this.f1423c;
/* 10 */            if (c0092d.m650a()) {
/* 76 */                return;
                    }
/* 13 */            Context context = viewGroup.getContext();
/* 17 */            context.getClass();
/* 20 */            wc0 wc0VarM647b = c0092d.m647b(context);
/* 32 */            this.f1424d = wc0VarM647b != null ? (AnimatorSet) wc0VarM647b.f18578c : null;
/* 34 */            C0091c0 c0091c0 = c0092d.f1425a;
/* 36 */            Fragment fragment = c0091c0.f1410c;
/* 46 */            boolean z = c0091c0.f1408a == 3;
/* 48 */            View view = fragment.mView;
/* 50 */            viewGroup.startViewTransition(view);
/* 53 */            AnimatorSet animatorSet = this.f1424d;
/* 55 */            if (animatorSet != null) {
/* 59 */                c0093e = this;
/* 64 */                animatorSet.addListener(new q60(viewGroup, view, z, c0091c0, c0093e));
                    } else {
/* 68 */                c0093e = this;
                    }
/* 69 */            AnimatorSet animatorSet2 = c0093e.f1424d;
/* 71 */            if (animatorSet2 != null) {
/* 73 */                animatorSet2.setTarget(view);
                    }
                }
            }
