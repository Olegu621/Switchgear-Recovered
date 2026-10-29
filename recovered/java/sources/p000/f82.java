            package p000;

            import android.view.KeyEvent;
            import android.widget.TextView;
            import androidx.appcompat.widget.SearchView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class f82 implements TextView.OnEditorActionListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ SearchView f8045a;

                public f82(SearchView searchView) {
/* 4 */             this.f8045a = searchView;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
/* 3 */             this.f8045a.m383q();
/* 6 */             return true;
                }
            }
