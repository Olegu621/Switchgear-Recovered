            package p000;

            import android.view.View;
            import androidx.appcompat.widget.ActionBarContextView;
            import com.google.android.material.floatingactionbutton.FloatingActionButton;
            
            /* JADX INFO: renamed from: b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class C0162b implements r43 {

                /* JADX INFO: renamed from: a */
                public boolean f2148a;

                /* JADX INFO: renamed from: b */
                public int f2149b;

                /* JADX INFO: renamed from: c */
                public final View f2150c;

                public C0162b(FloatingActionButton floatingActionButton) {
/* 5 */             this.f2148a = false;
/* 7 */             this.f2149b = 0;
/* 9 */             this.f2150c = floatingActionButton;
                }

                @Override // p000.r43
                /* JADX INFO: renamed from: a */
                public void mo1184a() {
/* 2 */             this.f2148a = true;
                }

                @Override // p000.r43
                /* JADX INFO: renamed from: b */
                public void mo1185b() {
/* 2 */             super/*android.view.View*/.setVisibility(0);
/* 9 */             this.f2148a = false;
                }

                @Override // p000.r43
                /* JADX INFO: renamed from: c */
                public void mo1186c() {
/* 3 */             if (this.f2148a) {
/* 5 */                 return;
                    }
/* 8 */             ActionBarContextView actionBarContextView = (ActionBarContextView) this.f2150c;
/* 11 */            actionBarContextView.f418f = null;
/* 1 */             super/*android.view.View*/.setVisibility(this.f2149b);
                }

/* 11 */        public C0162b(ActionBarContextView actionBarContextView) {
                    this.f2150c = actionBarContextView;
/* 13 */            this.f2148a = false;
                }
            }
