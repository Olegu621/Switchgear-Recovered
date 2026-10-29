            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import android.view.animation.Animation;
            import android.view.animation.AnimationSet;
            import android.view.animation.Transformation;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 24 */    public final class lm0 extends AnimationSet implements Runnable {

                /* JADX INFO: renamed from: a */
                public final ViewGroup f13394a;

                /* JADX INFO: renamed from: b */
                public final View f13395b;

                /* JADX INFO: renamed from: c */
                public boolean f13396c;

                /* JADX INFO: renamed from: d */
                public boolean f13397d;

                /* JADX INFO: renamed from: e */
                public boolean f13398e;

                public lm0(Animation animation, ViewGroup viewGroup, View view) {
/* 2 */             super(false);
/* 6 */             this.f13398e = true;
/* 8 */             this.f13394a = viewGroup;
/* 10 */            this.f13395b = view;
/* 12 */            addAnimation(animation);
/* 15 */            viewGroup.post(this);
                }

                @Override // android.view.animation.AnimationSet, android.view.animation.Animation
                public final boolean getTransformation(long j, Transformation transformation) {
/* 2 */             this.f13398e = true;
/* 6 */             if (this.f13396c) {
/* 10 */                return !this.f13397d;
                    }
/* 16 */            if (!super.getTransformation(j, transformation)) {
/* 18 */                this.f13396c = true;
/* 22 */                fq1.m3803a(this.f13394a, this);
                    }
/* 1 */             return true;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             boolean z = this.f13396c;
/* 3 */             ViewGroup viewGroup = this.f13394a;
/* 5 */             if (z || !this.f13398e) {
/* 20 */                viewGroup.endViewTransition(this.f13395b);
/* 24 */                this.f13397d = true;
                    } else {
/* 12 */                this.f13398e = false;
/* 14 */                viewGroup.post(this);
                    }
                }

                @Override // android.view.animation.Animation
/* 25 */        public final boolean getTransformation(long j, Transformation transformation, float f) {
/* 26 */            this.f13398e = true;
/* 27 */            if (this.f13396c) {
/* 28 */                return !this.f13397d;
                    }
/* 29 */            if (!super.getTransformation(j, transformation, f)) {
/* 30 */                this.f13396c = true;
/* 31 */                fq1.m3803a(this.f13394a, this);
                    }
                    return true;
                }
            }
