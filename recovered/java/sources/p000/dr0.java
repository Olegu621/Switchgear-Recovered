            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.FrameLayout;
            import androidx.transition.R$id;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dr0 extends FrameLayout {

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ int f7389c = 0;

                /* JADX INFO: renamed from: a */
                public ViewGroup f7390a;

                /* JADX INFO: renamed from: b */
                public boolean f7391b;

                /* JADX INFO: renamed from: a */
                public static void m3181a(View view, ArrayList arrayList) {
/* 1 */             Object parent = view.getParent();
/* 7 */             if (parent instanceof ViewGroup) {
/* 11 */                m3181a((View) parent, arrayList);
                    }
/* 14 */            arrayList.add(view);
                }

                @Override // android.view.ViewGroup
                public final void onViewAdded(View view) {
/* 3 */             if (this.f7391b) {
/* 5 */                 super.onViewAdded(view);
                    } else {
/* 11 */                f42.m3656l("This GhostViewHolder is detached!");
                    }
                }

                @Override // android.view.ViewGroup
                public final void onViewRemoved(View view) {
/* 1 */             ViewGroup viewGroup = this.f7390a;
/* 3 */             super.onViewRemoved(view);
/* 12 */            if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
/* 29 */                viewGroup.setTag(R$id.ghost_view_holder, null);
/* 36 */                viewGroup.getOverlay().remove(this);
/* 39 */                this.f7391b = false;
                    }
                }
            }
