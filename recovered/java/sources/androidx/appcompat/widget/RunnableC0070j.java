            package androidx.appcompat.widget;

            import android.view.inputmethod.InputMethodManager;
            
            /* JADX INFO: renamed from: androidx.appcompat.widget.j */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RunnableC0070j implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ SearchView.SearchAutoComplete f758a;

                public RunnableC0070j(SearchView.SearchAutoComplete searchAutoComplete) {
/* 4 */             this.f758a = searchAutoComplete;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             SearchView.SearchAutoComplete searchAutoComplete = this.f758a;
/* 5 */             if (searchAutoComplete.f638i) {
/* 20 */                ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
/* 23 */                searchAutoComplete.f638i = false;
                    }
                }
            }
