            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import androidx.transition.R$id;
            import androidx.transition.Transition;
            import androidx.transition.Visibility;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class z53 extends jr2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ViewGroup f19943a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ View f19944b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ View f19945c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Visibility f19946d;

                public z53(Visibility visibility, ViewGroup viewGroup, View view, View view2) {
/* 4 */             this.f19946d = visibility;
/* 6 */             this.f19943a = viewGroup;
/* 8 */             this.f19944b = view;
/* 10 */            this.f19945c = view2;
                }

                @Override // p000.jr2, p000.ir2
                /* JADX INFO: renamed from: b */
                public final void mo87b(Transition transition) {
/* 9 */             this.f19943a.getOverlay().remove(this.f19944b);
                }

                @Override // p000.ir2
                /* JADX INFO: renamed from: c */
                public final void mo88c(Transition transition) {
/* 6 */             this.f19945c.setTag(R$id.save_overlay_view, null);
/* 17 */            this.f19943a.getOverlay().remove(this.f19944b);
/* 20 */            transition.m1104v(this);
                }

                @Override // p000.jr2, p000.ir2
                /* JADX INFO: renamed from: e */
                public final void mo90e(Transition transition) {
/* 1 */             View view = this.f19944b;
/* 7 */             if (view.getParent() == null) {
/* 15 */                this.f19943a.getOverlay().add(view);
                    } else {
/* 21 */                this.f19946d.cancel();
                    }
                }
            }
