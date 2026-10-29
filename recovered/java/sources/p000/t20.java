            package p000;

            import android.database.Cursor;
            import android.widget.Filter;
            import androidx.appcompat.widget.SearchView;
            import io.sentry.android.core.AbstractC1245n0;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class t20 extends Filter {

                /* JADX INFO: renamed from: a */
                public s20 f16898a;

                @Override // android.widget.Filter
                public final CharSequence convertResultToString(Object obj) {
/* 5 */             return this.f16898a.mo6988c((Cursor) obj);
                }

                /* JADX WARN: Code duplicated, block: B:17:0x0031  */
                @Override // android.widget.Filter
                public final Filter.FilterResults performFiltering(CharSequence charSequence) {
                    Cursor cursorM6992g;
/* 3 */             ni2 ni2Var = (ni2) this.f16898a;
/* 5 */             SearchView searchView = ni2Var.f14278V;
/* 12 */            String string = charSequence == null ? HttpUrl.FRAGMENT_ENCODE_SET : charSequence.toString();
/* 21 */            if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
                        try {
/* 32 */                    cursorM6992g = ni2Var.m6992g(ni2Var.f14279W, string);
/* 36 */                    if (cursorM6992g != null) {
/* 38 */                        cursorM6992g.getCount();
                            } else {
/* 50 */                        cursorM6992g = null;
                            }
                        } catch (RuntimeException e) {
/* 47 */                    AbstractC1245n0.m4891s("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
                        }
                    } else {
/* 50 */                cursorM6992g = null;
                    }
/* 53 */            Filter.FilterResults filterResults = new Filter.FilterResults();
/* 56 */            if (cursorM6992g != null) {
/* 62 */                filterResults.count = cursorM6992g.getCount();
/* 64 */                filterResults.values = cursorM6992g;
                    } else {
/* 68 */                filterResults.count = 0;
/* 70 */                filterResults.values = null;
                    }
/* 72 */            return filterResults;
                }

                @Override // android.widget.Filter
                public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
/* 1 */             s20 s20Var = this.f16898a;
/* 3 */             Cursor cursor = s20Var.f16389c;
/* 5 */             Object obj = filterResults.values;
/* 7 */             if (obj == null || obj == cursor) {
/* 16 */                return;
                    }
/* 13 */            s20Var.mo6987b((Cursor) obj);
                }
            }
