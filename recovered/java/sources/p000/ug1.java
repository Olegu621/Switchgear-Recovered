            package p000;

            import android.view.CollapsibleActionView;
            import android.view.View;
            import android.widget.FrameLayout;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ug1 extends FrameLayout implements InterfaceC1942mw {

                /* JADX INFO: renamed from: a */
                public final CollapsibleActionView f17519a;

                /* JADX WARN: Multi-variable type inference failed */
                public ug1(View view) {
/* 5 */             super(view.getContext());
/* 11 */            this.f17519a = (CollapsibleActionView) view;
/* 13 */            addView(view);
                }

                @Override // p000.InterfaceC1942mw
                public final void onActionViewCollapsed() {
/* 3 */             this.f17519a.onActionViewCollapsed();
                }

                @Override // p000.InterfaceC1942mw
                public final void onActionViewExpanded() {
/* 3 */             this.f17519a.onActionViewExpanded();
                }
            }
