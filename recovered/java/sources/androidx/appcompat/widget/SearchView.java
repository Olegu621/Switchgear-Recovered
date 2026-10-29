            package androidx.appcompat.widget;

            import android.app.PendingIntent;
            import android.app.SearchableInfo;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.res.Configuration;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.database.Cursor;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.Editable;
            import android.text.SpannableStringBuilder;
            import android.text.TextUtils;
            import android.text.style.ImageSpan;
            import android.util.AttributeSet;
            import android.util.TypedValue;
            import android.view.KeyEvent;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            import android.view.inputmethod.InputMethodManager;
            import android.widget.AutoCompleteTextView;
            import android.widget.ImageView;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.R$dimen;
            import androidx.appcompat.R$id;
            import androidx.appcompat.R$layout;
            import androidx.appcompat.R$string;
            import androidx.appcompat.R$styleable;
            import androidx.core.app.NotificationCompat;
            import androidx.customview.view.AbsSavedState;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.Method;
            import java.util.WeakHashMap;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.C1787jb;
            import p000.C1867kv;
            import p000.InterfaceC1942mw;
            import p000.ViewOnFocusChangeListenerC1904lv;
            import p000.ac1;
            import p000.e33;
            import p000.e82;
            import p000.f82;
            import p000.g82;
            import p000.h82;
            import p000.i13;
            import p000.i82;
            import p000.j82;
            import p000.l81;
            import p000.mp0;
            import p000.ni2;
            import p000.rj1;
            import p000.s20;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public class SearchView extends LinearLayoutCompat implements InterfaceC1942mw {

                /* JADX INFO: renamed from: R0 */
                public static final rj1 f594R0;

                /* JADX INFO: renamed from: A0 */
                public boolean f595A0;

                /* JADX INFO: renamed from: B0 */
                public boolean f596B0;

                /* JADX INFO: renamed from: C0 */
                public s20 f597C0;

                /* JADX INFO: renamed from: D0 */
                public boolean f598D0;

                /* JADX INFO: renamed from: E0 */
                public CharSequence f599E0;

                /* JADX INFO: renamed from: F0 */
                public boolean f600F0;

                /* JADX INFO: renamed from: G0 */
                public boolean f601G0;

                /* JADX INFO: renamed from: H0 */
                public int f602H0;

                /* JADX INFO: renamed from: I0 */
                public boolean f603I0;

                /* JADX INFO: renamed from: J0 */
                public CharSequence f604J0;

                /* JADX INFO: renamed from: K0 */
                public boolean f605K0;

                /* JADX INFO: renamed from: L0 */
                public int f606L0;

                /* JADX INFO: renamed from: M0 */
                public SearchableInfo f607M0;

                /* JADX INFO: renamed from: N0 */
                public Bundle f608N0;

                /* JADX INFO: renamed from: O0 */
                public final e82 f609O0;

                /* JADX INFO: renamed from: P0 */
                public final e82 f610P0;

                /* JADX INFO: renamed from: Q0 */
                public final WeakHashMap f611Q0;

                /* JADX INFO: renamed from: d0 */
                public final SearchAutoComplete f612d0;

                /* JADX INFO: renamed from: e0 */
                public final View f613e0;

                /* JADX INFO: renamed from: f0 */
                public final View f614f0;

                /* JADX INFO: renamed from: g0 */
                public final View f615g0;

                /* JADX INFO: renamed from: h0 */
                public final ImageView f616h0;

                /* JADX INFO: renamed from: i0 */
                public final ImageView f617i0;

                /* JADX INFO: renamed from: j0 */
                public final ImageView f618j0;

                /* JADX INFO: renamed from: k0 */
                public final ImageView f619k0;

                /* JADX INFO: renamed from: l0 */
                public final View f620l0;

                /* JADX INFO: renamed from: m0 */
                public j82 f621m0;

                /* JADX INFO: renamed from: n0 */
                public final Rect f622n0;

                /* JADX INFO: renamed from: o0 */
                public final Rect f623o0;

                /* JADX INFO: renamed from: p0 */
                public final int[] f624p0;

                /* JADX INFO: renamed from: q0 */
                public final int[] f625q0;

                /* JADX INFO: renamed from: r0 */
                public final ImageView f626r0;

                /* JADX INFO: renamed from: s0 */
                public final Drawable f627s0;

                /* JADX INFO: renamed from: t0 */
                public final int f628t0;

                /* JADX INFO: renamed from: u0 */
                public final int f629u0;

                /* JADX INFO: renamed from: v0 */
                public final Intent f630v0;

                /* JADX INFO: renamed from: w0 */
                public final Intent f631w0;

                /* JADX INFO: renamed from: x0 */
                public final CharSequence f632x0;

                /* JADX INFO: renamed from: y0 */
                public View.OnFocusChangeListener f633y0;

                /* JADX INFO: renamed from: z0 */
                public View.OnClickListener f634z0;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends AbsSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0069i();

                    /* JADX INFO: renamed from: c */
                    public boolean f635c;

                    public SavedState(Parcel parcel, ClassLoader classLoader) {
/* 1 */                 super(parcel, classLoader);
/* 15 */                this.f635c = ((Boolean) parcel.readValue(null)).booleanValue();
                    }

                    public final String toString() {
/* 5 */                 StringBuilder sb = new StringBuilder("SearchView.SavedState{");
/* 16 */                sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 21 */                sb.append(" isIconified=");
/* 28 */                return AbstractC0886en.m3511o(sb, this.f635c, "}");
                    }

                    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 10 */                parcel.writeValue(Boolean.valueOf(this.f635c));
                    }
                }

                static {
/* 5 */             rj1 rj1Var = null;
/* 6 */             if (Build.VERSION.SDK_INT < 29) {
/* 12 */                rj1 rj1Var2 = new rj1();
/* 15 */                rj1Var2.f16118a = null;
/* 17 */                rj1Var2.f16119b = null;
/* 19 */                rj1Var2.f16120c = null;
/* 21 */                rj1.m8189a();
                        try {
/* 27 */                    Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
/* 31 */                    rj1Var2.f16118a = declaredMethod;
/* 33 */                    declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                        }
                        try {
/* 38 */                    Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
/* 42 */                    rj1Var2.f16119b = declaredMethod2;
/* 44 */                    declaredMethod2.setAccessible(true);
                        } catch (NoSuchMethodException unused2) {
                        }
                        try {
/* 55 */                    Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
/* 59 */                    rj1Var2.f16120c = method;
/* 61 */                    method.setAccessible(true);
                        } catch (NoSuchMethodException unused3) {
                        }
/* 64 */                rj1Var = rj1Var2;
                    }
/* 65 */            f594R0 = rj1Var;
                }

                public SearchView(Context context, AttributeSet attributeSet, int i) {
/* 3 */             super(context, attributeSet, i);
/* 11 */            this.f622n0 = new Rect();
/* 18 */            this.f623o0 = new Rect();
/* 23 */            this.f624p0 = new int[2];
/* 27 */            this.f625q0 = new int[2];
/* 35 */            this.f609O0 = new e82(this, 0);
/* 43 */            this.f610P0 = new e82(this, 1);
/* 50 */            this.f611Q0 = new WeakHashMap();
/* 54 */            ViewOnClickListenerC0066f viewOnClickListenerC0066f = new ViewOnClickListenerC0066f(this);
/* 59 */            ViewOnKeyListenerC0067g viewOnKeyListenerC0067g = new ViewOnKeyListenerC0067g(this);
/* 64 */            f82 f82Var = new f82(this);
/* 69 */            C1787jb c1787jb = new C1787jb(this, 2);
/* 74 */            l81 l81Var = new l81(this, 1);
/* 79 */            C1867kv c1867kv = new C1867kv(this, 1);
/* 90 */            ac1 ac1VarM156H = ac1.m156H(context, attributeSet, R$styleable.SearchView, i);
/* 103 */           e33.m3317m(this, context, R$styleable.SearchView, attributeSet, (TypedArray) ac1VarM156H.f178c, i);
/* 106 */           LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
/* 110 */           int i2 = R$styleable.SearchView_layout;
/* 112 */           int i3 = R$layout.abc_search_view;
/* 116 */           TypedArray typedArray = (TypedArray) ac1VarM156H.f178c;
/* 122 */           layoutInflaterFrom.inflate(typedArray.getResourceId(i2, i3), (ViewGroup) this, true);
/* 131 */           SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R$id.search_src_text);
/* 133 */           this.f612d0 = searchAutoComplete;
/* 135 */           searchAutoComplete.setSearchView(this);
/* 144 */           this.f613e0 = findViewById(R$id.search_edit_frame);
/* 148 */           View viewFindViewById = findViewById(R$id.search_plate);
/* 152 */           this.f614f0 = viewFindViewById;
/* 156 */           View viewFindViewById2 = findViewById(R$id.submit_area);
/* 160 */           this.f615g0 = viewFindViewById2;
/* 168 */           ImageView imageView = (ImageView) findViewById(R$id.search_button);
/* 170 */           this.f616h0 = imageView;
/* 178 */           ImageView imageView2 = (ImageView) findViewById(R$id.search_go_btn);
/* 180 */           this.f617i0 = imageView2;
/* 188 */           ImageView imageView3 = (ImageView) findViewById(R$id.search_close_btn);
/* 190 */           this.f618j0 = imageView3;
/* 198 */           ImageView imageView4 = (ImageView) findViewById(R$id.search_voice_btn);
/* 200 */           this.f619k0 = imageView4;
/* 210 */           ImageView imageView5 = (ImageView) findViewById(R$id.search_mag_icon);
/* 212 */           this.f626r0 = imageView5;
/* 222 */           viewFindViewById.setBackground(ac1VarM156H.m184n(R$styleable.SearchView_queryBackground));
/* 231 */           viewFindViewById2.setBackground(ac1VarM156H.m184n(R$styleable.SearchView_submitBackground));
/* 240 */           imageView.setImageDrawable(ac1VarM156H.m184n(R$styleable.SearchView_searchIcon));
/* 249 */           imageView2.setImageDrawable(ac1VarM156H.m184n(R$styleable.SearchView_goIcon));
/* 258 */           imageView3.setImageDrawable(ac1VarM156H.m184n(R$styleable.SearchView_closeIcon));
/* 267 */           imageView4.setImageDrawable(ac1VarM156H.m184n(R$styleable.SearchView_voiceIcon));
/* 276 */           imageView5.setImageDrawable(ac1VarM156H.m184n(R$styleable.SearchView_searchIcon));
/* 285 */           this.f627s0 = ac1VarM156H.m184n(R$styleable.SearchView_searchHintIcon);
/* 297 */           i13.m4420B(imageView, getResources().getString(R$string.abc_searchview_description_search));
/* 308 */           this.f628t0 = typedArray.getResourceId(R$styleable.SearchView_suggestionRowLayout, R$layout.abc_search_dropdown_item_icons_2line);
/* 317 */           this.f629u0 = typedArray.getResourceId(R$styleable.SearchView_commitIcon, 0);
/* 319 */           imageView.setOnClickListener(viewOnClickListenerC0066f);
/* 322 */           imageView3.setOnClickListener(viewOnClickListenerC0066f);
/* 325 */           imageView2.setOnClickListener(viewOnClickListenerC0066f);
/* 328 */           imageView4.setOnClickListener(viewOnClickListenerC0066f);
/* 331 */           searchAutoComplete.setOnClickListener(viewOnClickListenerC0066f);
/* 334 */           searchAutoComplete.addTextChangedListener(c1867kv);
/* 337 */           searchAutoComplete.setOnEditorActionListener(f82Var);
/* 340 */           searchAutoComplete.setOnItemClickListener(c1787jb);
/* 345 */           searchAutoComplete.setOnItemSelectedListener(l81Var);
/* 350 */           searchAutoComplete.setOnKeyListener(viewOnKeyListenerC0067g);
/* 359 */           searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1904lv(this, 2));
/* 369 */           setIconifiedByDefault(typedArray.getBoolean(R$styleable.SearchView_iconifiedByDefault, true));
/* 375 */           int dimensionPixelSize = typedArray.getDimensionPixelSize(R$styleable.SearchView_android_maxWidth, -1);
/* 379 */           if (dimensionPixelSize != -1) {
/* 381 */               setMaxWidth(dimensionPixelSize);
                    }
/* 390 */           this.f632x0 = typedArray.getText(R$styleable.SearchView_defaultQueryHint);
/* 398 */           this.f599E0 = typedArray.getText(R$styleable.SearchView_queryHint);
/* 402 */           int i4 = typedArray.getInt(R$styleable.SearchView_android_imeOptions, -1);
/* 406 */           if (i4 != -1) {
/* 408 */               setImeOptions(i4);
                    }
/* 413 */           int i5 = typedArray.getInt(R$styleable.SearchView_android_inputType, -1);
/* 417 */           if (i5 != -1) {
/* 419 */               setInputType(i5);
                    }
/* 429 */           setFocusable(typedArray.getBoolean(R$styleable.SearchView_android_focusable, true));
/* 432 */           ac1VarM156H.m168J();
/* 439 */           Intent intent = new Intent("android.speech.action.WEB_SEARCH");
/* 442 */           this.f630v0 = intent;
/* 446 */           intent.addFlags(268435456);
/* 453 */           intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
/* 460 */           Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
/* 463 */           this.f631w0 = intent2;
/* 465 */           intent2.addFlags(268435456);
/* 472 */           View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
/* 476 */           this.f620l0 = viewFindViewById3;
/* 478 */           if (viewFindViewById3 != null) {
/* 486 */               viewFindViewById3.addOnLayoutChangeListener(new mp0(this, 2));
                    }
/* 491 */           m389w(this.f595A0);
/* 494 */           m386t();
                }

                private int getPreferredHeight() {
/* 11 */            return getContext().getResources().getDimensionPixelSize(R$dimen.abc_search_view_preferred_height);
                }

                private int getPreferredWidth() {
/* 11 */            return getContext().getResources().getDimensionPixelSize(R$dimen.abc_search_view_preferred_width);
                }

                private void setQuery(CharSequence charSequence) {
/* 1 */             SearchAutoComplete searchAutoComplete = this.f612d0;
/* 3 */             searchAutoComplete.setText(charSequence);
/* 18 */            searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void clearFocus() {
/* 2 */             this.f601G0 = true;
/* 4 */             super.clearFocus();
/* 7 */             SearchAutoComplete searchAutoComplete = this.f612d0;
/* 9 */             searchAutoComplete.clearFocus();
/* 13 */            searchAutoComplete.setImeVisibility(false);
/* 16 */            this.f601G0 = false;
                }

                public int getImeOptions() {
/* 3 */             return this.f612d0.getImeOptions();
                }

                public int getInputType() {
/* 3 */             return this.f612d0.getInputType();
                }

                public int getMaxWidth() {
/* 1 */             return this.f602H0;
                }

                public CharSequence getQuery() {
/* 3 */             return this.f612d0.getText();
                }

                public CharSequence getQueryHint() {
/* 1 */             CharSequence charSequence = this.f599E0;
/* 3 */             if (charSequence != null) {
/* 5 */                 return charSequence;
                    }
/* 6 */             SearchableInfo searchableInfo = this.f607M0;
                    return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f632x0 : getContext().getText(this.f607M0.getHintId());
                }

                public int getSuggestionCommitIconResId() {
/* 1 */             return this.f629u0;
                }

                public int getSuggestionRowLayout() {
/* 1 */             return this.f628t0;
                }

                public s20 getSuggestionsAdapter() {
/* 1 */             return this.f597C0;
                }

                /* JADX INFO: renamed from: j */
                public final Intent m376j(Uri uri, String str, String str2, String str3) {
/* 3 */             Intent intent = new Intent(str);
/* 8 */             intent.addFlags(268435456);
/* 11 */            if (uri != null) {
/* 13 */                intent.setData(uri);
                    }
/* 20 */            intent.putExtra("user_query", this.f604J0);
/* 23 */            if (str3 != null) {
/* 27 */                intent.putExtra("query", str3);
                    }
/* 30 */            if (str2 != null) {
/* 34 */                intent.putExtra("intent_extra_data_key", str2);
                    }
/* 37 */            Bundle bundle = this.f608N0;
/* 39 */            if (bundle != null) {
/* 43 */                intent.putExtra("app_data", bundle);
                    }
/* 52 */            intent.setComponent(this.f607M0.getSearchActivity());
/* 55 */            return intent;
                }

                /* JADX INFO: renamed from: k */
                public final Intent m377k(Intent intent, SearchableInfo searchableInfo) {
/* 1 */             ComponentName searchActivity = searchableInfo.getSearchActivity();
/* 9 */             Intent intent2 = new Intent("android.intent.action.SEARCH");
/* 12 */            intent2.setComponent(searchActivity);
/* 22 */            PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
/* 28 */            Bundle bundle = new Bundle();
/* 31 */            Bundle bundle2 = this.f608N0;
/* 33 */            if (bundle2 != null) {
/* 37 */                bundle.putParcelable("app_data", bundle2);
                    }
/* 42 */            Intent intent3 = new Intent(intent);
/* 45 */            Resources resources = getResources();
/* 64 */            String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
/* 82 */            String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
/* 98 */            String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
/* 110 */           int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
/* 113 */           intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
/* 118 */           intent3.putExtra("android.speech.extra.PROMPT", string2);
/* 123 */           intent3.putExtra("android.speech.extra.LANGUAGE", string3);
/* 128 */           intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
/* 140 */           intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
/* 145 */           intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
/* 150 */           intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
/* 153 */           return intent3;
                }

                /* JADX INFO: renamed from: l */
                public final void m378l() {
/* 1 */             int i = Build.VERSION.SDK_INT;
/* 5 */             SearchAutoComplete searchAutoComplete = this.f612d0;
/* 7 */             if (i >= 29) {
/* 9 */                 AbstractC0068h.m431a(searchAutoComplete);
/* 12 */                return;
                    }
/* 13 */            rj1 rj1Var = f594R0;
/* 15 */            rj1Var.getClass();
/* 18 */            rj1.m8189a();
/* 21 */            Method method = rj1Var.f16118a;
/* 24 */            if (method != null) {
                        try {
/* 26 */                    method.invoke(searchAutoComplete, null);
                        } catch (Exception unused) {
                        }
                    }
/* 29 */            rj1Var.getClass();
/* 32 */            rj1.m8189a();
/* 35 */            Method method2 = rj1Var.f16119b;
/* 37 */            if (method2 != null) {
                        try {
/* 39 */                    method2.invoke(searchAutoComplete, null);
                        } catch (Exception unused2) {
                        }
                    }
                }

                /* JADX INFO: renamed from: m */
                public final void m379m() {
/* 1 */             SearchAutoComplete searchAutoComplete = this.f612d0;
/* 12 */            if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
/* 27 */                searchAutoComplete.setText(HttpUrl.FRAGMENT_ENCODE_SET);
/* 30 */                searchAutoComplete.requestFocus();
/* 33 */                searchAutoComplete.setImeVisibility(true);
                    } else if (this.f595A0) {
/* 18 */                clearFocus();
/* 21 */                m389w(true);
                    }
                }

                /* JADX INFO: renamed from: n */
                public final void m380n(int i) {
                    int position;
                    String strM6985h;
/* 5 */             Cursor cursor = this.f597C0.f16389c;
/* 7 */             if (cursor != null && cursor.moveToPosition(i)) {
/* 15 */                Intent intentM376j = null;
                        try {
/* 16 */                    int i2 = ni2.f14276i0;
/* 24 */                    String strM6985h2 = ni2.m6985h(cursor, cursor.getColumnIndex("suggest_intent_action"));
/* 28 */                    if (strM6985h2 == null) {
/* 32 */                        strM6985h2 = this.f607M0.getSuggestIntentAction();
                            }
/* 39 */                    if (strM6985h2 == null) {
/* 41 */                        strM6985h2 = "android.intent.action.SEARCH";
                            }
/* 49 */                    String strM6985h3 = ni2.m6985h(cursor, cursor.getColumnIndex("suggest_intent_data"));
/* 53 */                    if (strM6985h3 == null) {
/* 57 */                        strM6985h3 = this.f607M0.getSuggestIntentData();
                            }
/* 61 */                    if (strM6985h3 != null && (strM6985h = ni2.m6985h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
/* 95 */                        strM6985h3 = strM6985h3 + "/" + Uri.encode(strM6985h);
                            }
/* 127 */                   intentM376j = m376j(strM6985h3 == null ? null : Uri.parse(strM6985h3), strM6985h2, ni2.m6985h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), ni2.m6985h(cursor, cursor.getColumnIndex("suggest_intent_query")));
                        } catch (RuntimeException e) {
                            try {
/* 132 */                       position = cursor.getPosition();
                            } catch (RuntimeException unused) {
/* 137 */                       position = -1;
                            }
/* 157 */                   AbstractC1245n0.m4891s("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e);
                        }
/* 160 */               if (intentM376j != null) {
                            try {
/* 167 */                       getContext().startActivity(intentM376j);
                            } catch (RuntimeException e2) {
/* 186 */                       AbstractC1245n0.m4877e("SearchView", "Failed launch activity: " + intentM376j, e2);
                            }
                        }
                    }
/* 190 */           SearchAutoComplete searchAutoComplete = this.f612d0;
/* 192 */           searchAutoComplete.setImeVisibility(false);
/* 195 */           searchAutoComplete.dismissDropDown();
                }

                /* JADX INFO: renamed from: o */
                public final void m381o(int i) {
/* 3 */             Editable text = this.f612d0.getText();
/* 9 */             Cursor cursor = this.f597C0.f16389c;
/* 11 */            if (cursor == null) {
/* 39 */                return;
                    }
/* 18 */            if (!cursor.moveToPosition(i)) {
/* 36 */                setQuery(text);
/* 39 */                return;
                    }
/* 22 */            String strMo6988c = this.f597C0.mo6988c(cursor);
/* 26 */            if (strMo6988c != null) {
/* 28 */                setQuery(strMo6988c);
                    } else {
/* 32 */                setQuery(text);
                    }
                }

                @Override // p000.InterfaceC1942mw
                public final void onActionViewCollapsed() {
/* 1 */             SearchAutoComplete searchAutoComplete = this.f612d0;
/* 5 */             searchAutoComplete.setText(HttpUrl.FRAGMENT_ENCODE_SET);
/* 12 */            searchAutoComplete.setSelection(searchAutoComplete.length());
/* 15 */            this.f604J0 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 17 */            clearFocus();
/* 21 */            m389w(true);
/* 26 */            searchAutoComplete.setImeOptions(this.f606L0);
/* 30 */            this.f605K0 = false;
                }

                @Override // p000.InterfaceC1942mw
                public final void onActionViewExpanded() {
/* 3 */             if (this.f605K0) {
/* 5 */                 return;
                    }
/* 7 */             this.f605K0 = true;
/* 9 */             SearchAutoComplete searchAutoComplete = this.f612d0;
/* 11 */            int imeOptions = searchAutoComplete.getImeOptions();
/* 15 */            this.f606L0 = imeOptions;
/* 20 */            searchAutoComplete.setImeOptions(imeOptions | 33554432);
/* 25 */            searchAutoComplete.setText(HttpUrl.FRAGMENT_ENCODE_SET);
/* 29 */            setIconified(false);
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
/* 3 */             removeCallbacks(this.f609O0);
/* 8 */             post(this.f610P0);
/* 11 */            super.onDetachedFromWindow();
                }

                @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 4 */             if (z) {
/* 6 */                 SearchAutoComplete searchAutoComplete = this.f612d0;
/* 8 */                 int[] iArr = this.f624p0;
/* 10 */                searchAutoComplete.getLocationInWindow(iArr);
/* 13 */                int[] iArr2 = this.f625q0;
/* 15 */                getLocationInWindow(iArr2);
/* 23 */                int i5 = iArr[1] - iArr2[1];
/* 29 */                int i6 = iArr[0] - iArr2[0];
/* 34 */                int width = searchAutoComplete.getWidth() + i6;
/* 39 */                int height = searchAutoComplete.getHeight() + i5;
/* 40 */                Rect rect = this.f622n0;
/* 42 */                rect.set(i6, i5, width, height);
/* 45 */                int i7 = rect.left;
/* 47 */                int i8 = rect.right;
/* 49 */                int i9 = i4 - i2;
/* 50 */                Rect rect2 = this.f623o0;
/* 52 */                rect2.set(i7, 0, i8, i9);
/* 55 */                j82 j82Var = this.f621m0;
/* 57 */                if (j82Var == null) {
/* 61 */                    j82 j82Var2 = new j82(searchAutoComplete, rect2, rect);
/* 64 */                    this.f621m0 = j82Var2;
/* 66 */                    setTouchDelegate(j82Var2);
                        } else {
/* 72 */                    j82Var.f12141b.set(rect2);
/* 75 */                    Rect rect3 = j82Var.f12143d;
/* 77 */                    rect3.set(rect2);
/* 82 */                    int i10 = -j82Var.f12144e;
/* 83 */                    rect3.inset(i10, i10);
/* 88 */                    j82Var.f12142c.set(rect);
                        }
                    }
                }

                @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
                public final void onMeasure(int i, int i2) {
                    int i3;
/* 3 */             if (this.f596B0) {
/* 5 */                 super.onMeasure(i, i2);
/* 8 */                 return;
                    }
/* 9 */             int mode = View.MeasureSpec.getMode(i);
/* 13 */            int size = View.MeasureSpec.getSize(i);
/* 21 */            if (mode == Integer.MIN_VALUE) {
/* 47 */                int i4 = this.f602H0;
/* 60 */                size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
                    } else if (mode == 0) {
/* 37 */                size = this.f602H0;
/* 39 */                if (size <= 0) {
/* 42 */                    size = getPreferredWidth();
                        }
                    } else if (mode == 1073741824 && (i3 = this.f602H0) > 0) {
/* 32 */                size = Math.min(i3, size);
                    }
/* 64 */            int mode2 = View.MeasureSpec.getMode(i2);
/* 68 */            int size2 = View.MeasureSpec.getSize(i2);
/* 72 */            if (mode2 == Integer.MIN_VALUE) {
/* 86 */                size2 = Math.min(getPreferredHeight(), size2);
                    } else if (mode2 == 0) {
/* 77 */                size2 = getPreferredHeight();
                    }
/* 98 */            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                }

                @Override // android.view.View
                public final void onRestoreInstanceState(Parcelable parcelable) {
/* 3 */             if (!(parcelable instanceof SavedState)) {
/* 5 */                 super.onRestoreInstanceState(parcelable);
/* 8 */                 return;
                    }
/* 9 */             SavedState savedState = (SavedState) parcelable;
/* 13 */            super.onRestoreInstanceState(savedState.f1292a);
/* 18 */            m389w(savedState.f635c);
/* 21 */            requestLayout();
                }

                @Override // android.view.View
                public final Parcelable onSaveInstanceState() {
/* 7 */             SavedState savedState = new SavedState(super.onSaveInstanceState());
/* 12 */            savedState.f635c = this.f596B0;
/* 14 */            return savedState;
                }

                @Override // android.view.View
                public final void onWindowFocusChanged(boolean z) {
/* 1 */             super.onWindowFocusChanged(z);
/* 6 */             post(this.f609O0);
                }

                /* JADX INFO: renamed from: p */
                public final void m382p(CharSequence charSequence) {
/* 1 */             setQuery(charSequence);
                }

                /* JADX INFO: renamed from: q */
                public final void m383q() {
/* 1 */             SearchAutoComplete searchAutoComplete = this.f612d0;
/* 3 */             Editable text = searchAutoComplete.getText();
/* 7 */             if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
/* 44 */                return;
                    }
/* 17 */            if (this.f607M0 != null) {
/* 34 */                getContext().startActivity(m376j(null, "android.intent.action.SEARCH", null, text.toString()));
                    }
/* 38 */            searchAutoComplete.setImeVisibility(false);
/* 41 */            searchAutoComplete.dismissDropDown();
                }

                /* JADX INFO: renamed from: r */
                public final void m384r() {
/* 7 */             boolean zIsEmpty = TextUtils.isEmpty(this.f612d0.getText());
/* 25 */            int i = (!zIsEmpty || (this.f595A0 && !this.f605K0)) ? 0 : 8;
/* 26 */            ImageView imageView = this.f618j0;
/* 28 */            imageView.setVisibility(i);
/* 31 */            Drawable drawable = imageView.getDrawable();
/* 35 */            if (drawable != null) {
/* 44 */                drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final boolean requestFocus(int i, Rect rect) {
/* 4 */             if (this.f601G0 || !isFocusable()) {
/* 3 */                 return false;
                    }
/* 16 */            if (this.f596B0) {
/* 30 */                return super.requestFocus(i, rect);
                    }
/* 20 */            boolean zRequestFocus = this.f612d0.requestFocus(i, rect);
/* 24 */            if (zRequestFocus) {
/* 26 */                m389w(false);
                    }
/* 29 */            return zRequestFocus;
                }

                /* JADX INFO: renamed from: s */
                public final void m385s() {
/* 12 */            int[] iArr = this.f612d0.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
/* 16 */            Drawable background = this.f614f0.getBackground();
/* 20 */            if (background != null) {
/* 22 */                background.setState(iArr);
                    }
/* 27 */            Drawable background2 = this.f615g0.getBackground();
/* 31 */            if (background2 != null) {
/* 33 */                background2.setState(iArr);
                    }
/* 36 */            invalidate();
                }

                public void setAppSearchData(Bundle bundle) {
/* 1 */             this.f608N0 = bundle;
                }

                public void setIconified(boolean z) {
/* 1 */             if (z) {
/* 3 */                 m379m();
/* 6 */                 return;
                    }
/* 8 */             m389w(false);
/* 11 */            SearchAutoComplete searchAutoComplete = this.f612d0;
/* 13 */            searchAutoComplete.requestFocus();
/* 17 */            searchAutoComplete.setImeVisibility(true);
/* 20 */            View.OnClickListener onClickListener = this.f634z0;
/* 22 */            if (onClickListener != null) {
/* 24 */                onClickListener.onClick(this);
                    }
                }

                public void setIconifiedByDefault(boolean z) {
/* 3 */             if (this.f595A0 == z) {
/* 5 */                 return;
                    }
/* 6 */             this.f595A0 = z;
/* 8 */             m389w(z);
/* 11 */            m386t();
                }

                public void setImeOptions(int i) {
/* 3 */             this.f612d0.setImeOptions(i);
                }

                public void setInputType(int i) {
/* 3 */             this.f612d0.setInputType(i);
                }

                public void setMaxWidth(int i) {
/* 1 */             this.f602H0 = i;
/* 3 */             requestLayout();
                }

                public void setOnCloseListener(g82 g82Var) {
                }

                public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
/* 1 */             this.f633y0 = onFocusChangeListener;
                }

                public void setOnQueryTextListener(h82 h82Var) {
                }

                public void setOnSearchClickListener(View.OnClickListener onClickListener) {
/* 1 */             this.f634z0 = onClickListener;
                }

                public void setOnSuggestionListener(i82 i82Var) {
                }

                public void setQueryHint(CharSequence charSequence) {
/* 1 */             this.f599E0 = charSequence;
/* 3 */             m386t();
                }

                public void setQueryRefinementEnabled(boolean z) {
/* 1 */             this.f600F0 = z;
/* 3 */             s20 s20Var = this.f597C0;
/* 7 */             if (s20Var instanceof ni2) {
/* 16 */                ((ni2) s20Var).f14283a0 = z ? 2 : 1;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:34:0x0098  */
                public void setSearchableInfo(SearchableInfo searchableInfo) {
                    boolean z;
/* 1 */             this.f607M0 = searchableInfo;
/* 3 */             Intent intent = null;
/* 5 */             SearchAutoComplete searchAutoComplete = this.f612d0;
/* 7 */             if (searchableInfo != null) {
/* 13 */                searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
/* 22 */                searchAutoComplete.setImeOptions(this.f607M0.getImeOptions());
/* 27 */                int inputType = this.f607M0.getInputType();
/* 33 */                if ((inputType & 15) == 1) {
/* 38 */                    inputType &= -65537;
/* 45 */                    if (this.f607M0.getSuggestAuthority() != null) {
/* 49 */                        inputType |= 589824;
                            }
                        }
/* 50 */                searchAutoComplete.setInputType(inputType);
/* 53 */                s20 s20Var = this.f597C0;
/* 55 */                if (s20Var != null) {
/* 57 */                    s20Var.mo6987b(null);
                        }
/* 66 */                if (this.f607M0.getSuggestAuthority() != null) {
/* 78 */                    ni2 ni2Var = new ni2(getContext(), this, this.f607M0, this.f611Q0);
/* 81 */                    this.f597C0 = ni2Var;
/* 83 */                    searchAutoComplete.setAdapter(ni2Var);
/* 97 */                    ((ni2) this.f597C0).f14283a0 = this.f600F0 ? 2 : 1;
                        }
/* 99 */                m386t();
                    }
/* 102 */           SearchableInfo searchableInfo2 = this.f607M0;
/* 105 */           if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
/* 119 */               if (this.f607M0.getVoiceSearchLaunchWebSearch()) {
/* 121 */                   intent = this.f630v0;
                        } else if (this.f607M0.getVoiceSearchLaunchRecognizer()) {
/* 132 */                   intent = this.f631w0;
                        }
/* 134 */               z = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
                    }
/* 154 */           this.f603I0 = z;
/* 156 */           if (z) {
/* 160 */               searchAutoComplete.setPrivateImeOptions("nm");
                    }
/* 165 */           m389w(this.f596B0);
                }

                public void setSubmitButtonEnabled(boolean z) {
/* 1 */             this.f598D0 = z;
/* 5 */             m389w(this.f596B0);
                }

                public void setSuggestionsAdapter(s20 s20Var) {
/* 1 */             this.f597C0 = s20Var;
/* 5 */             this.f612d0.setAdapter(s20Var);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                /* JADX INFO: renamed from: t */
                public final void m386t() {
                    Drawable drawable;
/* 1 */             CharSequence queryHint = getQueryHint();
                    CharSequence charSequence = queryHint;
/* 5 */             if (queryHint == null) {
/* 7 */                 charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 9 */             boolean z = this.f595A0;
/* 11 */            SearchAutoComplete searchAutoComplete = this.f612d0;
                    CharSequence charSequence2 = charSequence;
/* 13 */            if (z && (drawable = this.f627s0) != null) {
                        charSequence2 = charSequence;
/* 28 */                int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
/* 30 */                drawable.setBounds(0, 0, textSize, textSize);
/* 37 */                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
/* 49 */                spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
/* 52 */                spannableStringBuilder.append(charSequence);
/* 55 */                charSequence2 = spannableStringBuilder;
                    }
                    charSequence2 = charSequence;
/* 56 */            searchAutoComplete.setHint(charSequence2);
                }

                /* JADX INFO: renamed from: u */
                public final void m387u() {
/* 35 */            this.f615g0.setVisibility(((this.f598D0 || this.f603I0) && !this.f596B0 && (this.f617i0.getVisibility() == 0 || this.f619k0.getVisibility() == 0)) ? 0 : 8);
                }

                /* JADX INFO: renamed from: v */
                public final void m388v(boolean z) {
/* 1 */             boolean z2 = this.f598D0;
/* 33 */            this.f617i0.setVisibility((!z2 || !(z2 || this.f603I0) || this.f596B0 || !hasFocus() || (!z && this.f603I0)) ? 8 : 0);
                }

                /* JADX INFO: renamed from: w */
                public final void m389w(boolean z) {
/* 1 */             this.f596B0 = z;
/* 3 */             int i = 8;
/* 10 */            int i2 = z ? 0 : 8;
/* 17 */            boolean zIsEmpty = TextUtils.isEmpty(this.f612d0.getText());
/* 25 */            this.f616h0.setVisibility(i2);
/* 28 */            m388v(!zIsEmpty);
/* 38 */            this.f613e0.setVisibility(z ? 8 : 0);
/* 41 */            ImageView imageView = this.f626r0;
/* 57 */            imageView.setVisibility((imageView.getDrawable() == null || this.f595A0) ? 8 : 0);
/* 60 */            m384r();
/* 65 */            if (this.f603I0 && !this.f596B0 && zIsEmpty) {
/* 75 */                this.f617i0.setVisibility(8);
/* 78 */                i = 0;
                    }
/* 81 */            this.f619k0.setVisibility(i);
/* 84 */            m387u();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 16 */        public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

                    /* JADX INFO: renamed from: e */
                    public int f636e;

                    /* JADX INFO: renamed from: f */
                    public SearchView f637f;

                    /* JADX INFO: renamed from: i */
                    public boolean f638i;

                    /* JADX INFO: renamed from: v */
                    public final RunnableC0070j f639v;

                    public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
/* 1 */                 super(context, attributeSet, i);
/* 9 */                 this.f639v = new RunnableC0070j(this);
/* 15 */                this.f636e = getThreshold();
                    }

                    private int getSearchViewTextMinWidthDp() {
/* 5 */                 Configuration configuration = getResources().getConfiguration();
/* 9 */                 int i = configuration.screenWidthDp;
/* 11 */                int i2 = configuration.screenHeightDp;
/* 15 */                if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
/* 26 */                    return NotificationCompat.FLAG_LOCAL_ONLY;
                        }
/* 31 */                if (i < 600) {
                            return (i < 640 || i2 < 480) ? 160 : 192;
                        }
/* 45 */                return 192;
                    }

                    /* JADX INFO: renamed from: a */
                    public final void m390a() {
/* 5 */                 if (Build.VERSION.SDK_INT >= 29) {
/* 8 */                     AbstractC0068h.m432b(this, 1);
/* 15 */                    if (enoughToFilter()) {
/* 17 */                        showDropDown();
/* 20 */                        return;
                            }
/* 42 */                    return;
                        }
/* 21 */                rj1 rj1Var = SearchView.f594R0;
/* 23 */                rj1Var.getClass();
/* 26 */                rj1.m8189a();
/* 29 */                Method method = rj1Var.f16120c;
/* 31 */                if (method != null) {
                            try {
/* 39 */                        method.invoke(this, Boolean.TRUE);
                            } catch (Exception unused) {
                            }
                        }
                    }

                    @Override // android.widget.AutoCompleteTextView
                    public final boolean enoughToFilter() {
                        return this.f636e <= 0 || super.enoughToFilter();
                    }

                    @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
                    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
/* 1 */                 InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
/* 7 */                 if (this.f638i) {
/* 9 */                     RunnableC0070j runnableC0070j = this.f639v;
/* 11 */                    removeCallbacks(runnableC0070j);
/* 14 */                    post(runnableC0070j);
                        }
/* 17 */                return inputConnectionOnCreateInputConnection;
                    }

                    @Override // android.view.View
                    public final void onFinishInflate() {
/* 1 */                 super.onFinishInflate();
/* 23 */                setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
                    }

                    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
                    public final void onFocusChanged(boolean z, int i, Rect rect) {
/* 1 */                 super.onFocusChanged(z, i, rect);
/* 4 */                 SearchView searchView = this.f637f;
/* 8 */                 searchView.m389w(searchView.f596B0);
/* 13 */                searchView.post(searchView.f609O0);
/* 22 */                if (searchView.f612d0.hasFocus()) {
/* 24 */                    searchView.m378l();
                        }
                    }

                    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
                    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
/* 2 */                 if (i == 4) {
/* 9 */                     if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
/* 17 */                        KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
/* 21 */                        if (keyDispatcherState != null) {
/* 23 */                            keyDispatcherState.startTracking(keyEvent, this);
                                }
/* 8 */                         return true;
                            }
/* 31 */                    if (keyEvent.getAction() == 1) {
/* 33 */                        KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
/* 37 */                        if (keyDispatcherState2 != null) {
/* 39 */                            keyDispatcherState2.handleUpEvent(keyEvent);
                                }
/* 46 */                        if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
/* 56 */                            this.f637f.clearFocus();
/* 60 */                            setImeVisibility(false);
/* 8 */                             return true;
                                }
                            }
                        }
/* 64 */                return super.onKeyPreIme(i, keyEvent);
                    }

                    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
                    public final void onWindowFocusChanged(boolean z) {
/* 1 */                 super.onWindowFocusChanged(z);
/* 4 */                 if (z && this.f637f.hasFocus() && getVisibility() == 0) {
/* 21 */                    this.f638i = true;
/* 23 */                    Context context = getContext();
/* 27 */                    rj1 rj1Var = SearchView.f594R0;
/* 40 */                    if (context.getResources().getConfiguration().orientation == 2) {
/* 42 */                        m390a();
                            }
                        }
                    }

                    @Override // android.widget.AutoCompleteTextView
                    public final void performCompletion() {
                    }

                    @Override // android.widget.AutoCompleteTextView
                    public final void replaceText(CharSequence charSequence) {
                    }

                    public void setImeVisibility(boolean z) {
/* 11 */                InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
/* 13 */                RunnableC0070j runnableC0070j = this.f639v;
/* 16 */                if (!z) {
/* 18 */                    this.f638i = false;
/* 20 */                    removeCallbacks(runnableC0070j);
/* 27 */                    inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                        } else {
/* 35 */                    if (!inputMethodManager.isActive(this)) {
/* 47 */                        this.f638i = true;
/* 49 */                        return;
                            }
/* 37 */                    this.f638i = false;
/* 39 */                    removeCallbacks(runnableC0070j);
/* 42 */                    inputMethodManager.showSoftInput(this, 0);
                        }
                    }

                    public void setSearchView(SearchView searchView) {
/* 1 */                 this.f637f = searchView;
                    }

                    @Override // android.widget.AutoCompleteTextView
                    public void setThreshold(int i) {
/* 1 */                 super.setThreshold(i);
/* 4 */                 this.f636e = i;
                    }

/* 17 */            public SearchAutoComplete(Context context, AttributeSet attributeSet) {
/* 18 */                this(context, attributeSet, R$attr.autoCompleteTextViewStyle);
                    }
                }

/* 497 */       public SearchView(Context context, AttributeSet attributeSet) {
/* 498 */           this(context, attributeSet, R$attr.searchViewStyle);
                }
            }
