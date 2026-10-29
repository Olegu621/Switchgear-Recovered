            package androidx.appcompat.widget;

            import android.app.SearchableInfo;
            import android.content.ActivityNotFoundException;
            import android.content.ComponentName;
            import android.content.Intent;
            import android.view.View;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: renamed from: androidx.appcompat.widget.f */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewOnClickListenerC0066f implements View.OnClickListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ SearchView f756a;

                public ViewOnClickListenerC0066f(SearchView searchView) {
/* 4 */             this.f756a = searchView;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
/* 1 */             SearchView searchView = this.f756a;
/* 3 */             SearchView.SearchAutoComplete searchAutoComplete = searchView.f612d0;
/* 7 */             if (view == searchView.f616h0) {
/* 10 */                searchView.m389w(false);
/* 13 */                searchAutoComplete.requestFocus();
/* 17 */                searchAutoComplete.setImeVisibility(true);
/* 20 */                View.OnClickListener onClickListener = searchView.f634z0;
/* 22 */                if (onClickListener != null) {
/* 24 */                    onClickListener.onClick(searchView);
/* 27 */                    return;
                        }
/* 124 */               return;
                    }
/* 30 */            if (view == searchView.f618j0) {
/* 32 */                searchView.m379m();
/* 35 */                return;
                    }
/* 38 */            if (view == searchView.f617i0) {
/* 40 */                searchView.m383q();
/* 43 */                return;
                    }
/* 46 */            if (view != searchView.f619k0) {
/* 119 */               if (view == searchAutoComplete) {
/* 121 */                   searchView.m378l();
/* 124 */                   return;
                        }
/* 124 */               return;
                    }
/* 48 */            SearchableInfo searchableInfo = searchView.f607M0;
/* 50 */            if (searchableInfo == null) {
/* 124 */               return;
                    }
                    try {
/* 57 */                if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
/* 95 */                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
/* 107 */                       searchView.getContext().startActivity(searchView.m377k(searchView.f631w0, searchableInfo));
                            }
                        } else {
/* 63 */                    Intent intent = new Intent(searchView.f630v0);
/* 66 */                    ComponentName searchActivity = searchableInfo.getSearchActivity();
/* 80 */                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
/* 87 */                    searchView.getContext().startActivity(intent);
                        }
                    } catch (ActivityNotFoundException unused) {
/* 115 */               AbstractC1245n0.m4889q("SearchView", "Could not find voice search activity");
                    }
                }
            }
