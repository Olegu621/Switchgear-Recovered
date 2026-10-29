            package p000;

            import androidx.appcompat.widget.ActionMenuView;
            import com.google.android.material.bottomappbar.BottomAppBar;
            
            /* JADX INFO: renamed from: mk */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RunnableC1930mk implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ActionMenuView f13826a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f13827b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f13828c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ BottomAppBar f13829d;

                public RunnableC1930mk(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
/* 4 */             this.f13829d = bottomAppBar;
/* 6 */             this.f13826a = actionMenuView;
/* 8 */             this.f13827b = i;
/* 10 */            this.f13828c = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f13827b;
/* 3 */             boolean z = this.f13828c;
/* 5 */             BottomAppBar bottomAppBar = this.f13829d;
/* 7 */             ActionMenuView actionMenuView = this.f13826a;
/* 14 */            actionMenuView.setTranslationX(bottomAppBar.m2244C(actionMenuView, i, z));
                }
            }
