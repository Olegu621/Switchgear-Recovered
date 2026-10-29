            package p000;

            import android.transition.Transition;
            import android.view.View;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gn0 implements Transition.TransitionListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ View f8745a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ArrayList f8746b;

                public gn0(View view, ArrayList arrayList) {
/* 4 */             this.f8745a = view;
/* 6 */             this.f8746b = arrayList;
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionCancel(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionEnd(Transition transition) {
/* 1 */             transition.removeListener(this);
/* 8 */             this.f8745a.setVisibility(8);
/* 11 */            ArrayList arrayList = this.f8746b;
/* 13 */            int size = arrayList.size();
/* 19 */            for (int i = 0; i < size; i++) {
/* 27 */                ((View) arrayList.get(i)).setVisibility(0);
                    }
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionStart(Transition transition) {
/* 1 */             transition.removeListener(this);
/* 4 */             transition.addListener(this);
                }
            }
