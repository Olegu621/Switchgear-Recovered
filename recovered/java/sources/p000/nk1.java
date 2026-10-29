            package p000;

            import android.animation.Animator;
            import android.animation.TimeInterpolator;
            import android.animation.ValueAnimator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class nk1 {

                /* JADX INFO: renamed from: a */
                public long f14332a;

                /* JADX INFO: renamed from: c */
                public TimeInterpolator f14334c = null;

                /* JADX INFO: renamed from: d */
                public int f14335d = 0;

                /* JADX INFO: renamed from: e */
                public int f14336e = 1;

                /* JADX INFO: renamed from: b */
                public long f14333b = 150;

                public nk1(long j) {
/* 13 */            this.f14332a = j;
                }

                /* JADX INFO: renamed from: a */
                public final void m6995a(Animator animator) {
/* 3 */             animator.setStartDelay(this.f14332a);
/* 8 */             animator.setDuration(this.f14333b);
/* 15 */            animator.setInterpolator(m6996b());
/* 20 */            if (animator instanceof ValueAnimator) {
/* 22 */                ValueAnimator valueAnimator = (ValueAnimator) animator;
/* 26 */                valueAnimator.setRepeatCount(this.f14335d);
/* 31 */                valueAnimator.setRepeatMode(this.f14336e);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final TimeInterpolator m6996b() {
/* 1 */             TimeInterpolator timeInterpolator = this.f14334c;
                    return timeInterpolator != null ? timeInterpolator : AbstractC2246u8.f17411b;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 8 */             if (!(obj instanceof nk1)) {
/* 7 */                 return false;
                    }
/* 11 */            nk1 nk1Var = (nk1) obj;
/* 19 */            if (this.f14332a == nk1Var.f14332a && this.f14333b == nk1Var.f14333b && this.f14335d == nk1Var.f14335d && this.f14336e == nk1Var.f14336e) {
/* 61 */                return m6996b().getClass().equals(nk1Var.m6996b().getClass());
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             long j = this.f14332a;
/* 11 */            long j2 = this.f14333b;
/* 42 */            return ((((m6996b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f14335d) * 31) + this.f14336e;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("\n");
/* 14 */            sb.append(nk1.class.getName());
/* 19 */            sb.append('{');
/* 30 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 35 */            sb.append(" delay: ");
/* 40 */            sb.append(this.f14332a);
/* 45 */            sb.append(" duration: ");
/* 50 */            sb.append(this.f14333b);
/* 55 */            sb.append(" interpolator: ");
/* 66 */            sb.append(m6996b().getClass());
/* 71 */            sb.append(" repeatCount: ");
/* 76 */            sb.append(this.f14335d);
/* 81 */            sb.append(" repeatMode: ");
/* 88 */            return fm0.m3786l(sb, this.f14336e, "}\n");
                }
            }
