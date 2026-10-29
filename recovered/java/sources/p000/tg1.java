            package p000;

            import android.view.ActionProvider;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class tg1 extends AbstractC1815k2 implements ActionProvider.VisibilityListener {

                /* JADX INFO: renamed from: b */
                public er0 f17087b;

                /* JADX INFO: renamed from: c */
                public final ActionProvider f17088c;

                public tg1(wg1 wg1Var, ActionProvider actionProvider) {
/* 4 */             this.f17088c = actionProvider;
                }

                @Override // android.view.ActionProvider.VisibilityListener
                public final void onActionProviderVisibilityChanged(boolean z) {
/* 1 */             er0 er0Var = this.f17087b;
/* 3 */             if (er0Var != null) {
/* 9 */                 jg1 jg1Var = ((sg1) er0Var.f7853b).f16596n;
/* 12 */                jg1Var.f12263h = true;
/* 14 */                jg1Var.mo5808p(true);
                    }
                }
            }
