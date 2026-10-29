            package p000;

            import android.transition.Transition;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hn0 implements Transition.TransitionListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Object f9154a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ArrayList f9155b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f9156c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ArrayList f9157d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ jn0 f9158e;

                public hn0(jn0 jn0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
/* 4 */             this.f9158e = jn0Var;
/* 6 */             this.f9154a = obj;
/* 8 */             this.f9155b = arrayList;
/* 10 */            this.f9156c = obj2;
/* 12 */            this.f9157d = arrayList2;
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionCancel(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionEnd(Transition transition) {
/* 1 */             transition.removeListener(this);
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionStart(Transition transition) {
/* 2 */             jn0 jn0Var = this.f9158e;
/* 4 */             Object obj = this.f9154a;
/* 6 */             if (obj != null) {
/* 10 */                jn0Var.m5878t(obj, this.f9155b, null);
                    }
/* 13 */            Object obj2 = this.f9156c;
/* 15 */            if (obj2 != null) {
/* 19 */                jn0Var.m5878t(obj2, this.f9157d, null);
                    }
                }
            }
