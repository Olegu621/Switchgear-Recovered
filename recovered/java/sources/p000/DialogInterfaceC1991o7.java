            package p000;

            import android.R;
            import android.content.Context;
            import android.content.DialogInterface;
            import android.graphics.drawable.Drawable;
            import android.os.Bundle;
            import android.text.TextUtils;
            import android.util.TypedValue;
            import android.view.ContextThemeWrapper;
            import android.view.KeyEvent;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import android.widget.Button;
            import android.widget.FrameLayout;
            import android.widget.ImageView;
            import android.widget.LinearLayout;
            import android.widget.ListAdapter;
            import android.widget.TextView;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.R$id;
            import androidx.appcompat.app.AlertController$RecycleListView;
            import androidx.appcompat.widget.LinearLayoutCompat;
            import androidx.core.widget.NestedScrollView;
            import java.util.WeakHashMap;
            
            /* JADX INFO: renamed from: o7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class DialogInterfaceC1991o7 extends DialogC0860dy implements DialogInterface, InterfaceC0209ca {

                /* JADX INFO: renamed from: d */
                public LayoutInflaterFactory2C2324wa f14653d;

                /* JADX INFO: renamed from: e */
                public final C2361xa f14654e;

                /* JADX INFO: renamed from: f */
                public final C1917m7 f14655f;

                /* JADX WARN: Type inference failed for: r1v2, types: [xa] */
                public DialogInterfaceC1991o7(ContextThemeWrapper contextThemeWrapper, int i) {
                    int i2;
/* 1 */             int iM7107e = m7107e(contextThemeWrapper, i);
/* 6 */             if (iM7107e == 0) {
/* 10 */                TypedValue typedValue = new TypedValue();
/* 19 */                contextThemeWrapper.getTheme().resolveAttribute(R$attr.dialogTheme, typedValue, true);
/* 22 */                i2 = typedValue.resourceId;
                    } else {
/* 25 */                i2 = iM7107e;
                    }
/* 26 */            super(contextThemeWrapper, i2);
/* 34 */            this.f14654e = new l31() { // from class: xa
                        @Override // p000.l31
                        public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
/* 3 */                     return this.f19006a.m7111g(keyEvent);
                        }
                    };
/* 36 */            AbstractC1021ia abstractC1021iaM7108c = m7108c();
/* 40 */            if (iM7107e == 0) {
/* 44 */                TypedValue typedValue2 = new TypedValue();
/* 53 */                contextThemeWrapper.getTheme().resolveAttribute(R$attr.dialogTheme, typedValue2, true);
/* 56 */                iM7107e = typedValue2.resourceId;
                    }
/* 61 */            ((LayoutInflaterFactory2C2324wa) abstractC1021iaM7108c).f18495E0 = iM7107e;
/* 63 */            abstractC1021iaM7108c.mo4502d();
/* 79 */            this.f14655f = new C1917m7(getContext(), this, getWindow());
                }

                /* JADX INFO: renamed from: e */
                public static int m7107e(Context context, int i) {
/* 6 */             if (((i >>> 24) & 255) >= 1) {
/* 8 */                 return i;
                    }
/* 11 */            TypedValue typedValue = new TypedValue();
/* 20 */            context.getTheme().resolveAttribute(R$attr.alertDialogTheme, typedValue, true);
/* 23 */            return typedValue.resourceId;
                }

                @Override // p000.DialogC0860dy, android.app.Dialog
                public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
/* 1 */             m3280b();
/* 8 */             LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = (LayoutInflaterFactory2C2324wa) m7108c();
/* 10 */            layoutInflaterFactory2C2324wa.m9507w();
/* 24 */            ((ViewGroup) layoutInflaterFactory2C2324wa.f18526l0.findViewById(R.id.content)).addView(view, layoutParams);
/* 35 */            layoutInflaterFactory2C2324wa.f18512X.m7743a(layoutInflaterFactory2C2324wa.f18511W.getCallback());
                }

                /* JADX INFO: renamed from: c */
                public final AbstractC1021ia m7108c() {
/* 3 */             if (this.f14653d == null) {
/* 5 */                 ExecutorC0984ha executorC0984ha = AbstractC1021ia.f9502a;
/* 20 */                this.f14653d = new LayoutInflaterFactory2C2324wa(getContext(), getWindow(), this, this);
                    }
/* 22 */            return this.f14653d;
                }

                /* JADX INFO: renamed from: d */
                public final void m7109d(Bundle bundle) {
/* 5 */             LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = (LayoutInflaterFactory2C2324wa) m7108c();
/* 9 */             LayoutInflater layoutInflaterFrom = LayoutInflater.from(layoutInflaterFactory2C2324wa.f18510V);
/* 17 */            if (layoutInflaterFrom.getFactory() == null) {
/* 19 */                layoutInflaterFrom.setFactory2(layoutInflaterFactory2C2324wa);
                    } else {
/* 23 */                layoutInflaterFrom.getFactory2();
                    }
/* 26 */            super.onCreate(bundle);
/* 33 */            m7108c().mo4502d();
                }

                @Override // android.app.Dialog, android.content.DialogInterface
                public final void dismiss() {
/* 1 */             super.dismiss();
/* 8 */             m7108c().mo4503e();
                }

                @Override // android.app.Dialog, android.view.Window.Callback
                public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
/* 11 */            return he3.m4185f(this.f14654e, getWindow().getDecorView(), this, keyEvent);
                }

                /* JADX INFO: renamed from: f */
                public final void m7110f(CharSequence charSequence) {
/* 1 */             super.setTitle(charSequence);
/* 8 */             m7108c().mo4508k(charSequence);
                }

                @Override // android.app.Dialog
                public final View findViewById(int i) {
/* 5 */             LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = (LayoutInflaterFactory2C2324wa) m7108c();
/* 7 */             layoutInflaterFactory2C2324wa.m9507w();
/* 12 */            return layoutInflaterFactory2C2324wa.f18511W.findViewById(i);
                }

                /* JADX INFO: renamed from: g */
                public final boolean m7111g(KeyEvent keyEvent) {
/* 1 */             return super.dispatchKeyEvent(keyEvent);
                }

                @Override // android.app.Dialog
                public final void invalidateOptionsMenu() {
/* 5 */             m7108c().mo4501a();
                }

                @Override // p000.DialogC0860dy, android.app.Dialog
                public final void onCreate(Bundle bundle) {
                    int i;
                    ListAdapter listAdapter;
                    View viewFindViewById;
/* 1 */             m7109d(bundle);
/* 6 */             C1917m7 c1917m7 = this.f14655f;
/* 12 */            c1917m7.f13614b.setContentView(c1917m7.f13638z);
/* 15 */            Context context = c1917m7.f13613a;
/* 17 */            Window window = c1917m7.f13615c;
/* 21 */            View viewFindViewById2 = window.findViewById(R$id.parentPanel);
/* 27 */            View viewFindViewById3 = viewFindViewById2.findViewById(R$id.topPanel);
/* 33 */            View viewFindViewById4 = viewFindViewById2.findViewById(R$id.contentPanel);
/* 39 */            View viewFindViewById5 = viewFindViewById2.findViewById(R$id.buttonPanel);
/* 49 */            ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R$id.customPanel);
/* 51 */            View view = c1917m7.f13619g;
/* 53 */            if (view == null) {
/* 56 */                view = null;
                    }
/* 63 */            boolean z = view != null;
/* 64 */            if (!z || !C1917m7.m6612a(view)) {
/* 74 */                window.setFlags(131072, 131072);
                    }
/* 80 */            if (z) {
/* 88 */                FrameLayout frameLayout = (FrameLayout) window.findViewById(R$id.custom);
/* 95 */                frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
/* 100 */               if (c1917m7.f13620h) {
/* 102 */                   frameLayout.setPadding(0, 0, 0, 0);
                        }
/* 107 */               if (c1917m7.f13618f != null) {
/* 116 */                   ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
                        }
                    } else {
/* 119 */               viewGroup.setVisibility(8);
                    }
/* 124 */           View viewFindViewById6 = viewGroup.findViewById(R$id.topPanel);
/* 130 */           View viewFindViewById7 = viewGroup.findViewById(R$id.contentPanel);
/* 136 */           View viewFindViewById8 = viewGroup.findViewById(R$id.buttonPanel);
/* 140 */           ViewGroup viewGroupM6613b = C1917m7.m6613b(viewFindViewById6, viewFindViewById3);
/* 144 */           ViewGroup viewGroupM6613b2 = C1917m7.m6613b(viewFindViewById7, viewFindViewById4);
/* 148 */           ViewGroup viewGroupM6613b3 = C1917m7.m6613b(viewFindViewById8, viewFindViewById5);
/* 158 */           NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R$id.scrollView);
/* 160 */           c1917m7.f13630r = nestedScrollView;
/* 162 */           nestedScrollView.setFocusable(false);
/* 167 */           c1917m7.f13630r.setNestedScrollingEnabled(false);
/* 177 */           TextView textView = (TextView) viewGroupM6613b2.findViewById(R.id.message);
/* 179 */           c1917m7.f13634v = textView;
/* 181 */           if (textView != null) {
/* 184 */               String str = c1917m7.f13617e;
/* 186 */               if (str != null) {
/* 188 */                   textView.setText(str);
                        } else {
/* 192 */                   textView.setVisibility(8);
/* 199 */                   c1917m7.f13630r.removeView(c1917m7.f13634v);
/* 204 */                   if (c1917m7.f13618f != null) {
/* 212 */                       ViewGroup viewGroup2 = (ViewGroup) c1917m7.f13630r.getParent();
/* 216 */                       int iIndexOfChild = viewGroup2.indexOfChild(c1917m7.f13630r);
/* 220 */                       viewGroup2.removeViewAt(iIndexOfChild);
/* 230 */                       viewGroup2.addView(c1917m7.f13618f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                            } else {
/* 234 */                       viewGroupM6613b2.setVisibility(8);
                            }
                        }
                    }
/* 244 */           Button button = (Button) viewGroupM6613b3.findViewById(R.id.button1);
/* 246 */           c1917m7.f13621i = button;
/* 248 */           ViewOnClickListenerC2239u1 viewOnClickListenerC2239u1 = c1917m7.f13612F;
/* 250 */           button.setOnClickListener(viewOnClickListenerC2239u1);
/* 255 */           boolean zIsEmpty = TextUtils.isEmpty(c1917m7.f13622j);
/* 259 */           Button button2 = c1917m7.f13621i;
/* 261 */           if (zIsEmpty) {
/* 263 */               button2.setVisibility(8);
/* 266 */               i = 0;
                    } else {
/* 270 */               button2.setText(c1917m7.f13622j);
/* 275 */               c1917m7.f13621i.setVisibility(0);
/* 278 */               i = 1;
                    }
/* 286 */           Button button3 = (Button) viewGroupM6613b3.findViewById(R.id.button2);
/* 288 */           c1917m7.f13624l = button3;
/* 290 */           button3.setOnClickListener(viewOnClickListenerC2239u1);
/* 295 */           boolean zIsEmpty2 = TextUtils.isEmpty(c1917m7.f13625m);
/* 299 */           Button button4 = c1917m7.f13624l;
/* 301 */           if (zIsEmpty2) {
/* 303 */               button4.setVisibility(8);
                    } else {
/* 309 */               button4.setText(c1917m7.f13625m);
/* 314 */               c1917m7.f13624l.setVisibility(0);
/* 317 */               i |= 2;
                    }
/* 326 */           Button button5 = (Button) viewGroupM6613b3.findViewById(R.id.button3);
/* 328 */           c1917m7.f13627o = button5;
/* 330 */           button5.setOnClickListener(viewOnClickListenerC2239u1);
/* 335 */           boolean zIsEmpty3 = TextUtils.isEmpty(c1917m7.f13628p);
/* 339 */           Button button6 = c1917m7.f13627o;
/* 341 */           if (zIsEmpty3) {
/* 343 */               button6.setVisibility(8);
                    } else {
/* 349 */               button6.setText(c1917m7.f13628p);
/* 354 */               c1917m7.f13627o.setVisibility(0);
/* 357 */               i |= 4;
                    }
/* 361 */           TypedValue typedValue = new TypedValue();
/* 370 */           context.getTheme().resolveAttribute(R$attr.alertDialogCenterButtons, typedValue, true);
/* 376 */           if (typedValue.data != 0) {
/* 380 */               if (i == 1) {
/* 382 */                   Button button7 = c1917m7.f13621i;
/* 388 */                   LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
/* 390 */                   layoutParams.gravity = 1;
/* 392 */                   layoutParams.weight = 0.5f;
/* 394 */                   button7.setLayoutParams(layoutParams);
                        } else if (i == 2) {
/* 400 */                   Button button8 = c1917m7.f13624l;
/* 406 */                   LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
/* 408 */                   layoutParams2.gravity = 1;
/* 410 */                   layoutParams2.weight = 0.5f;
/* 412 */                   button8.setLayoutParams(layoutParams2);
                        } else if (i == 4) {
/* 419 */                   Button button9 = c1917m7.f13627o;
/* 425 */                   LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
/* 427 */                   layoutParams3.gravity = 1;
/* 429 */                   layoutParams3.weight = 0.5f;
/* 431 */                   button9.setLayoutParams(layoutParams3);
                        }
                    }
/* 434 */           if (i == 0) {
/* 437 */               viewGroupM6613b3.setVisibility(8);
                    }
/* 442 */           if (c1917m7.f13635w != null) {
/* 452 */               viewGroupM6613b.addView(c1917m7.f13635w, 0, new ViewGroup.LayoutParams(-1, -2));
/* 461 */               window.findViewById(R$id.title_template).setVisibility(8);
                    } else {
/* 474 */               c1917m7.f13632t = (ImageView) window.findViewById(R.id.icon);
/* 482 */               if (TextUtils.isEmpty(c1917m7.f13616d) || !c1917m7.f13610D) {
/* 554 */                   window.findViewById(R$id.title_template).setVisibility(8);
/* 559 */                   c1917m7.f13632t.setVisibility(8);
/* 562 */                   viewGroupM6613b.setVisibility(8);
                        } else {
/* 494 */                   TextView textView2 = (TextView) window.findViewById(R$id.alertTitle);
/* 496 */                   c1917m7.f13633u = textView2;
/* 500 */                   textView2.setText(c1917m7.f13616d);
/* 503 */                   Drawable drawable = c1917m7.f13631s;
/* 505 */                   if (drawable != null) {
/* 509 */                       c1917m7.f13632t.setImageDrawable(drawable);
                            } else {
/* 539 */                       c1917m7.f13633u.setPadding(c1917m7.f13632t.getPaddingLeft(), c1917m7.f13632t.getPaddingTop(), c1917m7.f13632t.getPaddingRight(), c1917m7.f13632t.getPaddingBottom());
/* 544 */                       c1917m7.f13632t.setVisibility(8);
                            }
                        }
                    }
/* 573 */           boolean z2 = viewGroup.getVisibility() != 8;
/* 584 */           int i2 = (viewGroupM6613b == null || viewGroupM6613b.getVisibility() == 8) ? 0 : 1;
/* 593 */           boolean z3 = viewGroupM6613b3.getVisibility() != 8;
/* 594 */           if (!z3 && (viewFindViewById = viewGroupM6613b2.findViewById(R$id.textSpacerNoButtons)) != null) {
/* 604 */               viewFindViewById.setVisibility(0);
                    }
/* 607 */           if (i2 != 0) {
/* 609 */               NestedScrollView nestedScrollView2 = c1917m7.f13630r;
/* 611 */               if (nestedScrollView2 != null) {
/* 613 */                   nestedScrollView2.setClipToPadding(true);
                        }
/* 629 */               View viewFindViewById9 = (c1917m7.f13617e == null && c1917m7.f13618f == null) ? null : viewGroupM6613b.findViewById(R$id.titleDividerNoCustom);
/* 633 */               if (viewFindViewById9 != null) {
/* 635 */                   viewFindViewById9.setVisibility(0);
                        }
                    } else {
/* 641 */               View viewFindViewById10 = viewGroupM6613b2.findViewById(R$id.textSpacerNoTitle);
/* 645 */               if (viewFindViewById10 != null) {
/* 647 */                   viewFindViewById10.setVisibility(0);
                        }
                    }
/* 650 */           AlertController$RecycleListView alertController$RecycleListView = c1917m7.f13618f;
/* 652 */           if (alertController$RecycleListView != null && (!z3 || i2 == 0)) {
/* 684 */               alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f360a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f361b);
                    }
/* 687 */           if (!z2) {
/* 689 */               View view2 = c1917m7.f13618f;
/* 691 */               if (view2 == null) {
/* 694 */                   view2 = c1917m7.f13630r;
                        }
/* 696 */               if (view2 != null) {
/* 698 */                   int i3 = z3 ? 2 : 0;
/* 704 */                   View viewFindViewById11 = window.findViewById(R$id.scrollIndicatorUp);
/* 710 */                   View viewFindViewById12 = window.findViewById(R$id.scrollIndicatorDown);
/* 714 */                   WeakHashMap weakHashMap = e33.f7494a;
/* 717 */                   t23.m8684d(view2, i2 | i3, 3);
/* 720 */                   if (viewFindViewById11 != null) {
/* 722 */                       viewGroupM6613b2.removeView(viewFindViewById11);
                            }
/* 725 */                   if (viewFindViewById12 != null) {
/* 727 */                       viewGroupM6613b2.removeView(viewFindViewById12);
                            }
                        }
                    }
/* 730 */           AlertController$RecycleListView alertController$RecycleListView2 = c1917m7.f13618f;
/* 732 */           if (alertController$RecycleListView2 == null || (listAdapter = c1917m7.f13636x) == null) {
/* 751 */               return;
                    }
/* 738 */           alertController$RecycleListView2.setAdapter(listAdapter);
/* 741 */           int i4 = c1917m7.f13637y;
/* 743 */           if (i4 > -1) {
/* 745 */               alertController$RecycleListView2.setItemChecked(i4, true);
/* 748 */               alertController$RecycleListView2.setSelection(i4);
                    }
                }

                @Override // android.app.Dialog, android.view.KeyEvent.Callback
                public final boolean onKeyDown(int i, KeyEvent keyEvent) {
/* 3 */             NestedScrollView nestedScrollView = this.f14655f.f13630r;
/* 5 */             if (nestedScrollView == null || !nestedScrollView.m592c(keyEvent)) {
/* 15 */                return super.onKeyDown(i, keyEvent);
                    }
/* 13 */            return true;
                }

                @Override // android.app.Dialog, android.view.KeyEvent.Callback
                public final boolean onKeyUp(int i, KeyEvent keyEvent) {
/* 3 */             NestedScrollView nestedScrollView = this.f14655f.f13630r;
/* 5 */             if (nestedScrollView == null || !nestedScrollView.m592c(keyEvent)) {
/* 15 */                return super.onKeyUp(i, keyEvent);
                    }
/* 13 */            return true;
                }

                @Override // p000.DialogC0860dy, android.app.Dialog
                public final void onStop() {
/* 1 */             super.onStop();
/* 8 */             LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = (LayoutInflaterFactory2C2324wa) m7108c();
/* 10 */            layoutInflaterFactory2C2324wa.m9491A();
/* 13 */            AbstractC2165s1 abstractC2165s1 = layoutInflaterFactory2C2324wa.f18514Z;
/* 15 */            if (abstractC2165s1 != null) {
/* 18 */                abstractC2165s1.mo8357q(false);
                    }
                }

                @Override // p000.InterfaceC0209ca
                public final void onSupportActionModeFinished(AbstractC1778j2 abstractC1778j2) {
                }

                @Override // p000.InterfaceC0209ca
                public final void onSupportActionModeStarted(AbstractC1778j2 abstractC1778j2) {
                }

                @Override // p000.InterfaceC0209ca
                public final AbstractC1778j2 onWindowStartingSupportActionMode(InterfaceC1013i2 interfaceC1013i2) {
/* 1 */             return null;
                }

                @Override // p000.DialogC0860dy, android.app.Dialog
                public final void setContentView(int i) {
/* 1 */             m3280b();
/* 8 */             m7108c().mo4505h(i);
                }

                @Override // android.app.Dialog
                public final void setTitle(int i) {
/* 1 */             super.setTitle(i);
/* 16 */            m7108c().mo4508k(getContext().getString(i));
                }

                @Override // p000.DialogC0860dy, android.app.Dialog
/* 11 */        public final void setContentView(View view) {
/* 12 */            m3280b();
/* 13 */            m7108c().mo4506i(view);
                }

                @Override // p000.DialogC0860dy, android.app.Dialog
/* 13 */        public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
/* 14 */            m3280b();
/* 15 */            m7108c().mo4507j(view, layoutParams);
                }

                @Override // android.app.Dialog
/* 19 */        public final void setTitle(CharSequence charSequence) {
/* 20 */            m7110f(charSequence);
/* 21 */            C1917m7 c1917m7 = this.f14655f;
                    c1917m7.f13616d = charSequence;
/* 22 */            TextView textView = c1917m7.f13633u;
                    if (textView != null) {
/* 23 */                textView.setText(charSequence);
                    }
                }
            }
