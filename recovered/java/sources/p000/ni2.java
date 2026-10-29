            package p000;

            import android.app.SearchableInfo;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.pm.ActivityInfo;
            import android.content.pm.PackageManager;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.database.Cursor;
            import android.graphics.drawable.Drawable;
            import android.net.Uri;
            import android.os.Bundle;
            import android.text.SpannableString;
            import android.text.TextUtils;
            import android.text.style.TextAppearanceSpan;
            import android.util.TypedValue;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.ImageView;
            import android.widget.TextView;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.R$id;
            import androidx.appcompat.widget.SearchView;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.io.InputStream;
            import java.util.List;
            import java.util.WeakHashMap;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ni2 extends s20 implements View.OnClickListener {

                /* JADX INFO: renamed from: i0 */
                public static final /* synthetic */ int f14276i0 = 0;

                /* JADX INFO: renamed from: U */
                public final LayoutInflater f14277U;

                /* JADX INFO: renamed from: V */
                public final SearchView f14278V;

                /* JADX INFO: renamed from: W */
                public final SearchableInfo f14279W;

                /* JADX INFO: renamed from: X */
                public final Context f14280X;

                /* JADX INFO: renamed from: Y */
                public final WeakHashMap f14281Y;

                /* JADX INFO: renamed from: Z */
                public final int f14282Z;

                /* JADX INFO: renamed from: a0 */
                public int f14283a0;

                /* JADX INFO: renamed from: b0 */
                public ColorStateList f14284b0;

                /* JADX INFO: renamed from: c0 */
                public int f14285c0;

                /* JADX INFO: renamed from: d0 */
                public int f14286d0;

                /* JADX INFO: renamed from: e0 */
                public int f14287e0;

                /* JADX INFO: renamed from: f0 */
                public int f14288f0;

                /* JADX INFO: renamed from: g0 */
                public int f14289g0;

                /* JADX INFO: renamed from: h0 */
                public int f14290h0;

                /* JADX INFO: renamed from: v */
                public final int f14291v;

                /* JADX INFO: renamed from: w */
                public final int f14292w;

                public ni2(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
/* 1 */             int suggestionRowLayout = searchView.getSuggestionRowLayout();
/* 9 */             this.f16388b = true;
/* 12 */            this.f16389c = null;
/* 15 */            this.f16387a = false;
/* 18 */            this.f16390d = -1;
/* 25 */            this.f16391e = new q20(this);
/* 32 */            this.f16392f = new r20(this, 0);
/* 34 */            this.f14292w = suggestionRowLayout;
/* 36 */            this.f14291v = suggestionRowLayout;
/* 46 */            this.f14277U = (LayoutInflater) context.getSystemService("layout_inflater");
/* 48 */            this.f14283a0 = 1;
/* 50 */            this.f14285c0 = -1;
/* 52 */            this.f14286d0 = -1;
/* 54 */            this.f14287e0 = -1;
/* 56 */            this.f14288f0 = -1;
/* 58 */            this.f14289g0 = -1;
/* 60 */            this.f14290h0 = -1;
/* 62 */            this.f14278V = searchView;
/* 64 */            this.f14279W = searchableInfo;
/* 70 */            this.f14282Z = searchView.getSuggestionCommitIconResId();
/* 72 */            this.f14280X = context;
/* 74 */            this.f14281Y = weakHashMap;
                }

                /* JADX INFO: renamed from: h */
                public static String m6985h(Cursor cursor, int i) {
/* 3 */             if (i == -1) {
/* 2 */                 return null;
                    }
                    try {
/* 6 */                 return cursor.getString(i);
                    } catch (Exception e) {
/* 16 */                AbstractC1245n0.m4877e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
/* 2 */                 return null;
                    }
                }

                @Override // p000.s20
                /* JADX INFO: renamed from: a */
                public final void mo6986a(View view, Cursor cursor) {
                    int i;
                    Drawable drawableM6991f;
                    CharSequence charSequenceM6985h;
/* 10 */            mi2 mi2Var = (mi2) view.getTag();
/* 12 */            int i2 = this.f14290h0;
/* 24 */            int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
/* 25 */            TextView textView = mi2Var.f13791a;
/* 27 */            TextView textView2 = mi2Var.f13792b;
/* 29 */            ImageView imageView = mi2Var.f13795e;
/* 33 */            if (textView != null) {
/* 37 */                String strM6985h = m6985h(cursor, this.f14285c0);
/* 41 */                textView.setText(strM6985h);
/* 48 */                if (TextUtils.isEmpty(strM6985h)) {
/* 50 */                    textView.setVisibility(8);
                        } else {
/* 54 */                    textView.setVisibility(0);
                        }
                    }
/* 58 */            Context context = this.f14280X;
/* 61 */            if (textView2 != null) {
/* 65 */                String strM6985h2 = m6985h(cursor, this.f14287e0);
/* 69 */                if (strM6985h2 != null) {
/* 73 */                    if (this.f14284b0 == null) {
/* 77 */                        TypedValue typedValue = new TypedValue();
/* 86 */                        context.getTheme().resolveAttribute(R$attr.textColorSearchUrl, typedValue, true);
/* 99 */                        this.f14284b0 = context.getResources().getColorStateList(typedValue.resourceId);
                            }
/* 103 */                   SpannableString spannableString = new SpannableString(strM6985h2);
/* 128 */                   spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f14284b0, null), 0, strM6985h2.length(), 33);
                            charSequenceM6985h = spannableString;
                        } else {
/* 134 */                   charSequenceM6985h = m6985h(cursor, this.f14286d0);
                        }
/* 142 */               if (TextUtils.isEmpty(charSequenceM6985h)) {
/* 144 */                   if (textView != null) {
/* 146 */                       textView.setSingleLine(false);
/* 149 */                       textView.setMaxLines(2);
                            }
                        } else if (textView != null) {
/* 155 */                   textView.setSingleLine(true);
/* 158 */                   textView.setMaxLines(1);
                        }
/* 161 */               textView2.setText(charSequenceM6985h);
/* 168 */               if (TextUtils.isEmpty(charSequenceM6985h)) {
/* 170 */                   textView2.setVisibility(8);
                        } else {
/* 174 */                   textView2.setVisibility(0);
                        }
                    }
/* 177 */           ImageView imageView2 = mi2Var.f13793c;
/* 179 */           if (imageView2 != null) {
/* 181 */               int i4 = this.f14288f0;
/* 184 */               if (i4 == -1) {
/* 186 */                   drawableM6991f = null;
                        } else {
/* 193 */                   drawableM6991f = m6991f(cursor.getString(i4));
/* 197 */                   if (drawableM6991f == null) {
/* 203 */                       ComponentName searchActivity = this.f14279W.getSearchActivity();
/* 207 */                       String strFlattenToShortString = searchActivity.flattenToShortString();
/* 211 */                       WeakHashMap weakHashMap = this.f14281Y;
/* 217 */                       if (weakHashMap.containsKey(strFlattenToShortString)) {
/* 223 */                           Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(strFlattenToShortString);
/* 233 */                           drawableM6991f = constantState == null ? null : constantState.newDrawable(context.getResources());
                                } else {
/* 240 */                           PackageManager packageManager = context.getPackageManager();
                                    try {
/* 246 */                               ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
/* 250 */                               int iconResource = activityInfo.getIconResource();
/* 254 */                               if (iconResource != 0) {
/* 264 */                                   Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
/* 268 */                                   if (drawable == null) {
/* 274 */                                       StringBuilder sbM3793s = fm0.m3793s(iconResource, "Invalid icon resource ", " for ");
/* 282 */                                       sbM3793s.append(searchActivity.flattenToShortString());
/* 289 */                                       AbstractC1245n0.m4889q("SuggestionsAdapter", sbM3793s.toString());
/* 256 */                                       drawableM6991f = null;
                                            } else {
/* 293 */                                       drawableM6991f = drawable;
                                            }
                                        } else {
/* 256 */                                   drawableM6991f = null;
                                        }
                                    } catch (PackageManager.NameNotFoundException e) {
/* 300 */                               AbstractC1245n0.m4889q("SuggestionsAdapter", e.toString());
                                    }
/* 312 */                           weakHashMap.put(strFlattenToShortString, drawableM6991f == null ? null : drawableM6991f.getConstantState());
                                }
/* 315 */                       if (drawableM6991f == null) {
/* 322 */                           drawableM6991f = context.getPackageManager().getDefaultActivityIcon();
                                }
                            }
                        }
/* 326 */               imageView2.setImageDrawable(drawableM6991f);
/* 329 */               if (drawableM6991f == null) {
/* 332 */                   imageView2.setVisibility(4);
                        } else {
/* 337 */                   imageView2.setVisibility(0);
/* 340 */                   drawableM6991f.setVisible(false, false);
/* 344 */                   drawableM6991f.setVisible(true, false);
                        }
                    }
/* 347 */           ImageView imageView3 = mi2Var.f13794d;
/* 349 */           if (imageView3 == null) {
/* 389 */               i = 1;
                    } else {
/* 351 */               int i5 = this.f14289g0;
/* 362 */               Drawable drawableM6991f2 = i5 == -1 ? null : m6991f(cursor.getString(i5));
/* 366 */               imageView3.setImageDrawable(drawableM6991f2);
/* 369 */               if (drawableM6991f2 == null) {
/* 373 */                   imageView3.setVisibility(8);
/* 389 */                   i = 1;
                        } else {
/* 378 */                   imageView3.setVisibility(0);
/* 381 */                   drawableM6991f2.setVisible(false, false);
/* 384 */                   i = 1;
/* 385 */                   drawableM6991f2.setVisible(true, false);
                        }
                    }
/* 390 */           int i6 = this.f14283a0;
/* 393 */           if (i6 != 2 && (i6 != i || (i3 & 1) == 0)) {
/* 405 */               imageView.setVisibility(8);
/* 422 */               return;
                    }
/* 409 */           imageView.setVisibility(0);
/* 416 */           imageView.setTag(textView.getText());
/* 419 */           imageView.setOnClickListener(this);
                }

                @Override // p000.s20
                /* JADX INFO: renamed from: b */
                public final void mo6987b(Cursor cursor) {
                    try {
/* 1 */                 super.mo6987b(cursor);
/* 4 */                 if (cursor != null) {
/* 12 */                    this.f14285c0 = cursor.getColumnIndex("suggest_text_1");
/* 20 */                    this.f14286d0 = cursor.getColumnIndex("suggest_text_2");
/* 28 */                    this.f14287e0 = cursor.getColumnIndex("suggest_text_2_url");
/* 36 */                    this.f14288f0 = cursor.getColumnIndex("suggest_icon_1");
/* 44 */                    this.f14289g0 = cursor.getColumnIndex("suggest_icon_2");
/* 52 */                    this.f14290h0 = cursor.getColumnIndex("suggest_flags");
                        }
                    } catch (Exception e) {
/* 60 */                AbstractC1245n0.m4877e("SuggestionsAdapter", "error changing cursor and caching columns", e);
                    }
                }

                @Override // p000.s20
                /* JADX INFO: renamed from: c */
                public final String mo6988c(Cursor cursor) {
                    String strM6985h;
                    String strM6985h2;
/* 1 */             if (cursor == null) {
/* 57 */                return null;
                    }
/* 10 */            String strM6985h3 = m6985h(cursor, cursor.getColumnIndex("suggest_intent_query"));
/* 14 */            if (strM6985h3 != null) {
/* 16 */                return strM6985h3;
                    }
/* 17 */            SearchableInfo searchableInfo = this.f14279W;
/* 23 */            if (searchableInfo.shouldRewriteQueryFromData() && (strM6985h2 = m6985h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
/* 37 */                return strM6985h2;
                    }
/* 42 */            if (!searchableInfo.shouldRewriteQueryFromText() || (strM6985h = m6985h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
/* 57 */                return null;
                    }
/* 56 */            return strM6985h;
                }

                @Override // p000.s20
                /* JADX INFO: renamed from: d */
                public final View mo6989d(ViewGroup viewGroup) {
/* 6 */             View viewInflate = this.f14277U.inflate(this.f14291v, viewGroup, false);
/* 15 */            viewInflate.setTag(new mi2(viewInflate));
/* 28 */            ((ImageView) viewInflate.findViewById(R$id.edit_query)).setImageResource(this.f14282Z);
/* 31 */            return viewInflate;
                }

                /* JADX INFO: renamed from: e */
                public final Drawable m6990e(Uri uri) throws FileNotFoundException {
                    int identifier;
/* 1 */             String authority = uri.getAuthority();
/* 10 */            if (TextUtils.isEmpty(authority)) {
/* 105 */               f42.m3654j(uri, "No authority: ");
/* 9 */                 return null;
                    }
                    try {
/* 18 */                Resources resourcesForApplication = this.f14280X.getPackageManager().getResourcesForApplication(authority);
/* 22 */                List<String> pathSegments = uri.getPathSegments();
/* 26 */                if (pathSegments == null) {
/* 93 */                    f42.m3654j(uri, "No path: ");
/* 9 */                     return null;
                        }
/* 28 */                int size = pathSegments.size();
/* 34 */                if (size == 1) {
                            try {
/* 42 */                        identifier = Integer.parseInt(pathSegments.get(0));
                            } catch (NumberFormatException unused) {
/* 49 */                        f42.m3654j(uri, "Single path segment is not a resource ID: ");
/* 9 */                         return null;
                            }
                        } else {
/* 54 */                    if (size != 2) {
/* 87 */                        f42.m3654j(uri, "More than two path segments: ");
/* 9 */                         return null;
                            }
/* 68 */                    identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                        }
/* 72 */                if (identifier != 0) {
/* 74 */                    return resourcesForApplication.getDrawable(identifier);
                        }
/* 81 */                f42.m3654j(uri, "No resource found for: ");
/* 9 */                 return null;
                    } catch (PackageManager.NameNotFoundException unused2) {
/* 99 */                f42.m3654j(uri, "No package found for authority: ");
/* 9 */                 return null;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:54:0x010c  */
                /* JADX INFO: renamed from: f */
                public final Drawable m6991f(String str) {
/* 1 */             WeakHashMap weakHashMap = this.f14281Y;
/* 5 */             Context context = this.f14280X;
/* 9 */             Drawable drawableM6990e = null;
/* 10 */            if (str != null && !str.isEmpty() && !"0".equals(str)) {
                        try {
/* 28 */                    int i = Integer.parseInt(str);
/* 52 */                    String str2 = "android.resource://" + context.getPackageName() + "/" + i;
/* 60 */                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
/* 66 */                    Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
/* 70 */                    if (drawableNewDrawable != null) {
/* 72 */                        return drawableNewDrawable;
                            }
/* 73 */                    Drawable drawable = v00.getDrawable(context, i);
/* 77 */                    if (drawable != null) {
/* 83 */                        weakHashMap.put(str2, drawable.getConstantState());
                            }
/* 86 */                    return drawable;
                        } catch (Resources.NotFoundException unused) {
/* 93 */                    AbstractC1245n0.m4889q("SuggestionsAdapter", "Icon resource not found: ".concat(str));
/* 9 */                     return null;
                        } catch (NumberFormatException unused2) {
/* 101 */                   Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
/* 107 */                   Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
/* 111 */                   if (drawableNewDrawable2 != null) {
/* 113 */                       return drawableNewDrawable2;
                            }
/* 114 */                   Uri uri = Uri.parse(str);
                            try {
/* 134 */                       if ("android.resource".equals(uri.getScheme())) {
                                    try {
/* 136 */                               drawableM6990e = m6990e(uri);
                                    } catch (Resources.NotFoundException unused3) {
/* 161 */                               throw new FileNotFoundException("Resource does not exist: " + uri);
                                    }
                                } else {
/* 166 */                           InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 170 */                           if (inputStreamOpenInputStream == null) {
/* 237 */                               throw new FileNotFoundException("Failed to open " + uri);
                                    }
                                    try {
/* 172 */                               Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                                        try {
/* 176 */                                   inputStreamOpenInputStream.close();
                                        } catch (IOException e) {
/* 194 */                                   AbstractC1245n0.m4877e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                                        }
/* 179 */                               drawableM6990e = drawableCreateFromStream;
                                    } catch (Throwable th) {
                                        try {
/* 199 */                                   inputStreamOpenInputStream.close();
                                        } catch (IOException e2) {
/* 216 */                                   AbstractC1245n0.m4877e("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
                                        }
/* 219 */                               throw th;
                                    }
                                }
                            } catch (FileNotFoundException e3) {
/* 264 */                       AbstractC1245n0.m4889q("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
/* 267 */                       if (drawableM6990e != null) {
/* 273 */                           weakHashMap.put(str, drawableM6990e.getConstantState());
                                }
/* 276 */                       return drawableM6990e;
                            }
/* 267 */                   if (drawableM6990e != null) {
/* 273 */                       weakHashMap.put(str, drawableM6990e.getConstantState());
                            }
                        }
                    }
/* 276 */           return drawableM6990e;
                }

                /* JADX INFO: renamed from: g */
                public final Cursor m6992g(SearchableInfo searchableInfo, String str) {
                    String suggestAuthority;
/* 1 */             String[] strArr = null;
/* 2 */             if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
/* 1 */                 return null;
                    }
/* 33 */            Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(HttpUrl.FRAGMENT_ENCODE_SET).fragment(HttpUrl.FRAGMENT_ENCODE_SET);
/* 37 */            String suggestPath = searchableInfo.getSuggestPath();
/* 41 */            if (suggestPath != null) {
/* 43 */                builderFragment.appendEncodedPath(suggestPath);
                    }
/* 48 */            builderFragment.appendPath("search_suggest_query");
/* 51 */            String suggestSelection = searchableInfo.getSuggestSelection();
/* 55 */            if (suggestSelection != null) {
/* 58 */                strArr = new String[]{str};
                    } else {
/* 65 */                builderFragment.appendPath(str);
                    }
/* 63 */            String[] strArr2 = strArr;
/* 77 */            builderFragment.appendQueryParameter("limit", String.valueOf(50));
/* 92 */            return this.f14280X.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
                }

                @Override // p000.s20, android.widget.BaseAdapter, android.widget.SpinnerAdapter
                public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
                    try {
/* 1 */                 return super.getDropDownView(i, view, viewGroup);
                    } catch (RuntimeException e) {
/* 11 */                AbstractC1245n0.m4891s("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
/* 19 */                View viewInflate = this.f14277U.inflate(this.f14292w, viewGroup, false);
/* 23 */                if (viewInflate != null) {
/* 37 */                    ((mi2) viewInflate.getTag()).f13791a.setText(e.toString());
                        }
/* 40 */                return viewInflate;
                    }
                }

                @Override // p000.s20, android.widget.Adapter
                public final View getView(int i, View view, ViewGroup viewGroup) {
                    try {
/* 1 */                 return super.getView(i, view, viewGroup);
                    } catch (RuntimeException e) {
/* 11 */                AbstractC1245n0.m4891s("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
/* 14 */                View viewMo6989d = mo6989d(viewGroup);
/* 30 */                ((mi2) viewMo6989d.getTag()).f13791a.setText(e.toString());
/* 33 */                return viewMo6989d;
                    }
                }

                @Override // android.widget.BaseAdapter, android.widget.Adapter
                public final boolean hasStableIds() {
/* 1 */             return false;
                }

                @Override // android.widget.BaseAdapter
                public final void notifyDataSetChanged() {
/* 1 */             super.notifyDataSetChanged();
/* 4 */             Cursor cursor = this.f16389c;
/* 13 */            Bundle extras = cursor != null ? cursor.getExtras() : null;
/* 14 */            if (extras != null) {
/* 18 */                extras.getBoolean("in_progress");
                    }
                }

                @Override // android.widget.BaseAdapter
                public final void notifyDataSetInvalidated() {
/* 1 */             super.notifyDataSetInvalidated();
/* 4 */             Cursor cursor = this.f16389c;
/* 13 */            Bundle extras = cursor != null ? cursor.getExtras() : null;
/* 14 */            if (extras != null) {
/* 18 */                extras.getBoolean("in_progress");
                    }
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
/* 1 */             Object tag = view.getTag();
/* 7 */             if (tag instanceof CharSequence) {
/* 13 */                this.f14278V.m382p((CharSequence) tag);
                    }
                }
            }
