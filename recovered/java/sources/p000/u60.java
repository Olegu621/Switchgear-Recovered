            package p000;

            import android.transition.Transition;
            import androidx.fragment.app.AbstractC0094f;
            import androidx.fragment.app.C0091c0;
            import androidx.fragment.app.Fragment;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class u60 extends AbstractC0094f {

                /* JADX INFO: renamed from: b */
                public final Object f17371b;

                /* JADX INFO: renamed from: c */
                public final boolean f17372c;

                /* JADX INFO: renamed from: d */
                public final Object f17373d;

                public u60(C0091c0 c0091c0, boolean z, boolean z2) {
/* 1 */             super(c0091c0);
/* 4 */             Fragment fragment = c0091c0.f1410c;
/* 34 */            this.f17371b = c0091c0.f1408a == 2 ? z ? fragment.getReenterTransition() : fragment.getEnterTransition() : z ? fragment.getReturnTransition() : fragment.getExitTransition();
/* 53 */            this.f17372c = c0091c0.f1408a == 2 ? z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
/* 70 */            this.f17373d = z2 ? z ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
                }

                /* JADX INFO: renamed from: b */
                public final ln0 m8961b() {
/* 1 */             Object obj = this.f17371b;
/* 3 */             ln0 ln0VarM8962c = m8962c(obj);
/* 7 */             Object obj2 = this.f17373d;
/* 9 */             ln0 ln0VarM8962c2 = m8962c(obj2);
/* 13 */            if (ln0VarM8962c == null || ln0VarM8962c2 == null || ln0VarM8962c == ln0VarM8962c2) {
                        return ln0VarM8962c == null ? ln0VarM8962c2 : ln0VarM8962c;
                    }
/* 63 */            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f1425a.f1410c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
                }

                /* JADX INFO: renamed from: c */
                public final ln0 m8962c(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return null;
                    }
/* 5 */             jn0 jn0Var = en0.f7805a;
/* 9 */             if (obj instanceof Transition) {
/* 11 */                return jn0Var;
                    }
/* 12 */            ln0 ln0Var = en0.f7806b;
/* 14 */            if (ln0Var != null && ln0Var.mo5866e(obj)) {
/* 22 */                return ln0Var;
                    }
/* 29 */            StringBuilder sb = new StringBuilder("Transition ");
/* 32 */            sb.append(obj);
/* 37 */            Fragment fragment = this.f1425a.f1410c;
/* 41 */            sb.append(" for fragment ");
/* 44 */            sb.append(fragment);
/* 49 */            sb.append(" is not a valid framework Transition or AndroidX Transition");
/* 59 */            throw new IllegalArgumentException(sb.toString());
                }
            }
