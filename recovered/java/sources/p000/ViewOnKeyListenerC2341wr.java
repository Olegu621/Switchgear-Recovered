            package p000;

            import android.R;
            import android.content.Context;
            import android.content.res.Resources;
            import android.graphics.Rect;
            import android.os.Build;
            import android.os.Handler;
            import android.os.Parcelable;
            import android.view.Gravity;
            import android.view.KeyEvent;
            import android.view.LayoutInflater;
            import android.view.MenuItem;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewTreeObserver;
            import android.widget.FrameLayout;
            import android.widget.HeaderViewListAdapter;
            import android.widget.ListAdapter;
            import android.widget.PopupWindow;
            import android.widget.TextView;
            import androidx.appcompat.R$dimen;
            import androidx.appcompat.R$layout;
            import androidx.appcompat.widget.C0064d;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            /* JADX INFO: renamed from: wr */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewOnKeyListenerC2341wr extends xg1 implements View.OnKeyListener, PopupWindow.OnDismissListener {

                /* JADX INFO: renamed from: l0 */
                public static final int f18757l0 = R$layout.abc_cascading_menu_item_layout;

                /* JADX INFO: renamed from: Y */
                public View f18762Y;

                /* JADX INFO: renamed from: Z */
                public View f18763Z;

                /* JADX INFO: renamed from: a0 */
                public int f18764a0;

                /* JADX INFO: renamed from: b */
                public final Context f18765b;

                /* JADX INFO: renamed from: b0 */
                public boolean f18766b0;

                /* JADX INFO: renamed from: c */
                public final int f18767c;

                /* JADX INFO: renamed from: c0 */
                public boolean f18768c0;

                /* JADX INFO: renamed from: d */
                public final int f18769d;

                /* JADX INFO: renamed from: d0 */
                public int f18770d0;

                /* JADX INFO: renamed from: e */
                public final boolean f18771e;

                /* JADX INFO: renamed from: e0 */
                public int f18772e0;

                /* JADX INFO: renamed from: f */
                public final Handler f18773f;

                /* JADX INFO: renamed from: g0 */
                public boolean f18775g0;

                /* JADX INFO: renamed from: h0 */
                public dh1 f18776h0;

                /* JADX INFO: renamed from: i0 */
                public ViewTreeObserver f18778i0;

                /* JADX INFO: renamed from: j0 */
                public PopupWindow.OnDismissListener f18779j0;

                /* JADX INFO: renamed from: k0 */
                public boolean f18780k0;

                /* JADX INFO: renamed from: i */
                public final ArrayList f18777i = new ArrayList();

                /* JADX INFO: renamed from: v */
                public final ArrayList f18781v = new ArrayList();

                /* JADX INFO: renamed from: w */
                public final ViewTreeObserverOnGlobalLayoutListenerC1986o2 f18782w = new ViewTreeObserverOnGlobalLayoutListenerC1986o2(this, 3);

                /* JADX INFO: renamed from: U */
                public final ViewOnAttachStateChangeListenerC2228tr f18758U = new ViewOnAttachStateChangeListenerC2228tr(this, 0);

                /* JADX INFO: renamed from: V */
                public final qc3 f18759V = new qc3(this, 15);

                /* JADX INFO: renamed from: W */
                public int f18760W = 0;

                /* JADX INFO: renamed from: X */
                public int f18761X = 0;

                /* JADX INFO: renamed from: f0 */
                public boolean f18774f0 = false;

                public ViewOnKeyListenerC2341wr(Context context, View view, int i, boolean z) {
/* 47 */            this.f18765b = context;
/* 49 */            this.f18762Y = view;
/* 51 */            this.f18769d = i;
/* 53 */            this.f18771e = z;
/* 66 */            this.f18764a0 = view.getLayoutDirection() != 1 ? 1 : 0;
/* 68 */            Resources resources = context.getResources();
/* 90 */            this.f18767c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
/* 97 */            this.f18773f = new Handler();
                }

                @Override // p000.vd2
                /* JADX INFO: renamed from: a */
                public final boolean mo365a() {
/* 1 */             ArrayList arrayList = this.f18781v;
                    return arrayList.size() > 0 && ((C2304vr) arrayList.get(0)).f18323a.f591j0.isShowing();
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: b */
                public final void mo419b(boolean z) {
/* 3 */             Iterator it = this.f18781v.iterator();
/* 11 */            while (it.hasNext()) {
/* 23 */                ListAdapter adapter = ((C2304vr) it.next()).f18323a.f579c.getAdapter();
/* 29 */                if (adapter instanceof HeaderViewListAdapter) {
/* 33 */                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                        }
/* 42 */                ((gg1) adapter).notifyDataSetChanged();
                    }
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: c */
                public final boolean mo420c(hi2 hi2Var) {
/* 12 */            for (C2304vr c2304vr : this.f18781v) {
/* 22 */                if (hi2Var == c2304vr.f18324b) {
/* 28 */                    c2304vr.f18323a.f579c.requestFocus();
/* 11 */                    return true;
                        }
                    }
/* 36 */            if (!hi2Var.hasVisibleItems()) {
/* 49 */                return false;
                    }
/* 38 */            mo5818m(hi2Var);
/* 41 */            dh1 dh1Var = this.f18776h0;
/* 43 */            if (dh1Var != null) {
/* 45 */                dh1Var.mo2942z(hi2Var);
                    }
/* 11 */            return true;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: d */
                public final void mo421d(jg1 jg1Var, boolean z) {
/* 1 */             ArrayList arrayList = this.f18781v;
/* 3 */             int size = arrayList.size();
/* 8 */             int i = 0;
                    while (true) {
/* 9 */                 if (i >= size) {
/* 25 */                    i = -1;
                            break;
                        } else if (jg1Var == ((C2304vr) arrayList.get(i)).f18324b) {
                            break;
                        } else {
/* 22 */                    i++;
                        }
                    }
/* 26 */            if (i < 0) {
/* 168 */               return;
                    }
/* 30 */            int i2 = i + 1;
/* 36 */            if (i2 < arrayList.size()) {
/* 46 */                ((C2304vr) arrayList.get(i2)).f18324b.m5803c(false);
                    }
/* 53 */            C2304vr c2304vr = (C2304vr) arrayList.remove(i);
/* 55 */            jg1 jg1Var2 = c2304vr.f18324b;
/* 57 */            C0064d c0064d = c2304vr.f18323a;
/* 59 */            PopupWindow popupWindow = c0064d.f591j0;
/* 61 */            jg1Var2.m5810r(this);
/* 67 */            if (this.f18780k0) {
/* 69 */                ah1.m287b(popupWindow, null);
/* 72 */                popupWindow.setAnimationStyle(0);
                    }
/* 75 */            c0064d.dismiss();
/* 78 */            int size2 = arrayList.size();
/* 83 */            if (size2 > 0) {
/* 95 */                this.f18764a0 = ((C2304vr) arrayList.get(size2 - 1)).f18325c;
                    } else {
/* 109 */               this.f18764a0 = this.f18762Y.getLayoutDirection() == 1 ? 0 : 1;
                    }
/* 111 */           if (size2 != 0) {
/* 155 */               if (z) {
/* 165 */                   ((C2304vr) arrayList.get(0)).f18324b.m5803c(false);
/* 168 */                   return;
                        }
/* 168 */               return;
                    }
/* 113 */           dismiss();
/* 116 */           dh1 dh1Var = this.f18776h0;
/* 118 */           if (dh1Var != null) {
/* 120 */               dh1Var.mo2938d(jg1Var, true);
                    }
/* 123 */           ViewTreeObserver viewTreeObserver = this.f18778i0;
/* 125 */           if (viewTreeObserver != null) {
/* 131 */               if (viewTreeObserver.isAlive()) {
/* 137 */                   this.f18778i0.removeGlobalOnLayoutListener(this.f18782w);
                        }
/* 140 */               this.f18778i0 = null;
                    }
/* 146 */           this.f18763Z.removeOnAttachStateChangeListener(this.f18758U);
/* 151 */           this.f18779j0.onDismiss();
                }

                @Override // p000.vd2
                public final void dismiss() {
/* 1 */             ArrayList arrayList = this.f18781v;
/* 3 */             int size = arrayList.size();
/* 7 */             if (size > 0) {
/* 15 */                C2304vr[] c2304vrArr = (C2304vr[]) arrayList.toArray(new C2304vr[size]);
/* 19 */                for (int i = size - 1; i >= 0; i--) {
/* 21 */                    C2304vr c2304vr = c2304vrArr[i];
/* 31 */                    if (c2304vr.f18323a.f591j0.isShowing()) {
/* 35 */                        c2304vr.f18323a.dismiss();
                            }
                        }
                    }
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: e */
                public final boolean mo422e() {
/* 1 */             return false;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: g */
                public final void mo423g(Parcelable parcelable) {
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: h */
                public final void mo3431h(dh1 dh1Var) {
/* 1 */             this.f18776h0 = dh1Var;
                }

                @Override // p000.vd2
                /* JADX INFO: renamed from: j */
                public final ra0 mo370j() {
/* 1 */             ArrayList arrayList = this.f18781v;
/* 7 */             if (arrayList.isEmpty()) {
/* 9 */                 return null;
                    }
/* 25 */            return ((C2304vr) arrayList.get(arrayList.size() - 1)).f18323a.f579c;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: l */
                public final Parcelable mo426l() {
/* 1 */             return null;
                }

                @Override // p000.xg1
                /* JADX INFO: renamed from: m */
                public final void mo5818m(jg1 jg1Var) {
/* 3 */             jg1Var.m5802b(this, this.f18765b);
/* 10 */            if (mo365a()) {
/* 12 */                m9605v(jg1Var);
                    } else {
/* 18 */                this.f18777i.add(jg1Var);
                    }
                }

                @Override // p000.xg1
                /* JADX INFO: renamed from: o */
                public final void mo5819o(View view) {
/* 3 */             if (this.f18762Y != view) {
/* 5 */                 this.f18762Y = view;
/* 17 */                this.f18761X = Gravity.getAbsoluteGravity(this.f18760W, view.getLayoutDirection());
                    }
                }

                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    C2304vr c2304vr;
/* 1 */             ArrayList arrayList = this.f18781v;
/* 3 */             int size = arrayList.size();
/* 8 */             int i = 0;
                    while (true) {
/* 9 */                 if (i >= size) {
/* 31 */                    c2304vr = null;
                            break;
                        }
/* 15 */                c2304vr = (C2304vr) arrayList.get(i);
/* 25 */                if (!c2304vr.f18323a.f591j0.isShowing()) {
                            break;
                        } else {
/* 28 */                    i++;
                        }
                    }
/* 32 */            if (c2304vr != null) {
/* 36 */                c2304vr.f18324b.m5803c(false);
                    }
                }

                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
/* 6 */             if (keyEvent.getAction() != 1 || i != 82) {
/* 16 */                return false;
                    }
/* 12 */            dismiss();
/* 5 */             return true;
                }

                @Override // p000.xg1
                /* JADX INFO: renamed from: p */
                public final void mo5820p(boolean z) {
/* 1 */             this.f18774f0 = z;
                }

                @Override // p000.xg1
                /* JADX INFO: renamed from: q */
                public final void mo5821q(int i) {
/* 3 */             if (this.f18760W != i) {
/* 5 */                 this.f18760W = i;
/* 17 */                this.f18761X = Gravity.getAbsoluteGravity(i, this.f18762Y.getLayoutDirection());
                    }
                }

                @Override // p000.xg1
                /* JADX INFO: renamed from: r */
                public final void mo5822r(int i) {
/* 2 */             this.f18766b0 = true;
/* 4 */             this.f18770d0 = i;
                }

                @Override // p000.xg1
                /* JADX INFO: renamed from: s */
                public final void mo5823s(PopupWindow.OnDismissListener onDismissListener) {
/* 1 */             this.f18779j0 = onDismissListener;
                }

                @Override // p000.vd2
                public final void show() {
/* 5 */             if (mo365a()) {
/* 66 */                return;
                    }
/* 8 */             ArrayList arrayList = this.f18777i;
/* 10 */            Iterator it = arrayList.iterator();
/* 18 */            while (it.hasNext()) {
/* 26 */                m9605v((jg1) it.next());
                    }
/* 30 */            arrayList.clear();
/* 33 */            View view = this.f18762Y;
/* 35 */            this.f18763Z = view;
/* 37 */            if (view != null) {
/* 45 */                boolean z = this.f18778i0 == null;
/* 46 */                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
/* 50 */                this.f18778i0 = viewTreeObserver;
/* 52 */                if (z) {
/* 56 */                    viewTreeObserver.addOnGlobalLayoutListener(this.f18782w);
                        }
/* 63 */                this.f18763Z.addOnAttachStateChangeListener(this.f18758U);
                    }
                }

                @Override // p000.xg1
                /* JADX INFO: renamed from: t */
                public final void mo5824t(boolean z) {
/* 1 */             this.f18775g0 = z;
                }

                @Override // p000.xg1
                /* JADX INFO: renamed from: u */
                public final void mo5825u(int i) {
/* 2 */             this.f18768c0 = true;
/* 4 */             this.f18772e0 = i;
                }

                /* JADX WARN: Code duplicated, block: B:68:0x015f  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: v */
                public final void m9605v(jg1 jg1Var) {
                    boolean z;
                    char c;
                    View childAt;
                    C2304vr c2304vr;
                    int i;
                    int i2;
                    int i3;
                    int width;
                    MenuItem item;
                    gg1 gg1Var;
                    int headersCount;
                    int firstVisiblePosition;
/* 5 */             Context context = this.f18765b;
/* 7 */             LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
/* 17 */            gg1 gg1Var2 = new gg1(jg1Var, layoutInflaterFrom, this.f18771e, f18757l0);
/* 26 */            if (!mo365a() && this.f18774f0) {
/* 32 */                gg1Var2.f8597c = true;
                    } else if (mo365a()) {
/* 43 */                int size = jg1Var.f12261f.size();
/* 47 */                int i4 = 0;
                        while (true) {
/* 48 */                    if (i4 >= size) {
/* 71 */                        z = false;
                                break;
                            }
/* 50 */                    MenuItem item2 = jg1Var.getItem(i4);
/* 58 */                    if (item2.isVisible() && item2.getIcon() != null) {
/* 66 */                        z = true;
                                break;
                            }
/* 68 */                    i4++;
                        }
/* 72 */                gg1Var2.f8597c = z;
                    }
/* 76 */            int iM9791n = xg1.m9791n(gg1Var2, context, this.f18767c);
/* 85 */            C0064d c0064d = new C0064d(context, null, this.f18769d, 0);
/* 90 */            c0064d.f755m0 = this.f18759V;
/* 92 */            c0064d.f576a0 = this;
/* 94 */            PopupWindow popupWindow = c0064d.f591j0;
/* 96 */            popupWindow.setOnDismissListener(this);
/* 101 */           c0064d.f574Z = this.f18762Y;
/* 105 */           c0064d.f571W = this.f18761X;
/* 107 */           c0064d.f590i0 = true;
/* 109 */           popupWindow.setFocusable(true);
/* 113 */           popupWindow.setInputMethodMode(2);
/* 116 */           c0064d.mo373o(gg1Var2);
/* 119 */           c0064d.m375q(iM9791n);
/* 124 */           c0064d.f571W = this.f18761X;
/* 126 */           ArrayList arrayList = this.f18781v;
/* 132 */           if (arrayList.size() > 0) {
/* 143 */               c2304vr = (C2304vr) arrayList.get(arrayList.size() - 1);
/* 145 */               jg1 jg1Var2 = c2304vr.f18324b;
/* 149 */               int size2 = jg1Var2.f12261f.size();
/* 153 */               int i5 = 0;
                        while (true) {
/* 154 */                   if (i5 >= size2) {
/* 177 */                       item = null;
                                break;
                            }
/* 156 */                   item = jg1Var2.getItem(i5);
/* 164 */                   if (item.hasSubMenu() && jg1Var == item.getSubMenu()) {
                                break;
                            } else {
/* 173 */                       i5++;
                            }
                        }
/* 178 */               if (item == null) {
/* 180 */                   c = 0;
/* 182 */                   childAt = null;
                        } else {
/* 186 */                   ra0 ra0Var = c2304vr.f18323a.f579c;
/* 188 */                   ListAdapter adapter = ra0Var.getAdapter();
/* 194 */                   if (adapter instanceof HeaderViewListAdapter) {
/* 196 */                       HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
/* 198 */                       headersCount = headerViewListAdapter.getHeadersCount();
/* 206 */                       gg1Var = (gg1) headerViewListAdapter.getWrappedAdapter();
                            } else {
/* 209 */                       gg1Var = (gg1) adapter;
/* 211 */                       headersCount = 0;
                            }
/* 212 */                   int count = gg1Var.getCount();
/* 216 */                   int i6 = 0;
/* 217 */                   c = 0;
                            while (true) {
/* 220 */                       if (i6 >= count) {
/* 233 */                           i6 = -1;
                                    break;
                                } else if (item == gg1Var.getItem(i6)) {
                                    break;
                                } else {
/* 229 */                           i6++;
                                }
                            }
/* 253 */                   childAt = (i6 != -1 && (firstVisiblePosition = (i6 + headersCount) - ra0Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < ra0Var.getChildCount()) ? ra0Var.getChildAt(firstVisiblePosition) : null;
                        }
                    } else {
/* 258 */               c = 0;
/* 260 */               childAt = null;
/* 261 */               c2304vr = null;
                    }
/* 262 */           if (childAt != null) {
/* 268 */               if (Build.VERSION.SDK_INT <= 28) {
/* 270 */                   Method method = C0064d.f754n0;
/* 272 */                   if (method != null) {
                                try {
/* 275 */                           Object[] objArr = new Object[1];
/* 279 */                           objArr[c] = Boolean.FALSE;
/* 281 */                           method.invoke(popupWindow, objArr);
                                } catch (Exception unused) {
                                }
                            }
                        } else {
/* 288 */                   bh1.m1356a(popupWindow, c);
                        }
/* 292 */               ah1.m286a(popupWindow, null);
/* 311 */               ra0 ra0Var2 = ((C2304vr) arrayList.get(arrayList.size() - 1)).f18323a.f579c;
/* 314 */               int[] iArr = new int[2];
/* 316 */               ra0Var2.getLocationOnScreen(iArr);
/* 321 */               Rect rect = new Rect();
/* 326 */               this.f18763Z.getWindowVisibleDisplayFrame(rect);
/* 332 */               if (this.f18764a0 == 1) {
/* 346 */                   if (ra0Var2.getWidth() + iArr[0] + iM9791n > rect.right) {
/* 348 */                       i = 0;
                            } else {
/* 352 */                       i = 1;
                            }
                        } else if (iArr[0] - iM9791n < 0) {
/* 352 */                   i = 1;
                        } else {
/* 362 */                   i = 0;
                        }
/* 368 */               boolean z2 = i == 1;
/* 369 */               this.f18764a0 = i;
/* 376 */               if (Build.VERSION.SDK_INT >= 26) {
/* 378 */                   c0064d.f574Z = childAt;
/* 380 */                   i2 = 0;
/* 381 */                   i3 = 0;
                        } else {
/* 384 */                   int[] iArr2 = new int[2];
/* 388 */                   this.f18762Y.getLocationOnScreen(iArr2);
/* 391 */                   int[] iArr3 = new int[2];
/* 393 */                   childAt.getLocationOnScreen(iArr3);
/* 402 */                   if ((this.f18761X & 7) == 5) {
/* 413 */                       iArr2[0] = this.f18762Y.getWidth() + iArr2[0];
/* 422 */                       iArr3[0] = childAt.getWidth() + iArr3[0];
                            }
/* 428 */                   int i7 = iArr3[0] - iArr2[0];
/* 435 */                   i2 = iArr3[1] - iArr2[1];
/* 437 */                   i3 = i7;
                        }
/* 441 */               if ((this.f18761X & 5) != 5) {
/* 459 */                   width = z2 ? i3 + childAt.getWidth() : i3 - iM9791n;
                        } else if (z2) {
/* 445 */                   width = i3 + iM9791n;
                        } else {
/* 447 */                   iM9791n = childAt.getWidth();
                        }
/* 460 */               c0064d.f585f = width;
/* 463 */               c0064d.f570V = true;
/* 465 */               c0064d.f569U = true;
/* 467 */               c0064d.m371k(i2);
                    } else {
/* 473 */               if (this.f18766b0) {
/* 477 */                   c0064d.f585f = this.f18770d0;
                        }
/* 481 */               if (this.f18768c0) {
/* 485 */                   c0064d.m371k(this.f18772e0);
                        }
/* 488 */               Rect rect2 = this.f19082a;
/* 499 */               c0064d.f588h0 = rect2 != null ? new Rect(rect2) : null;
                    }
/* 508 */           arrayList.add(new C2304vr(c0064d, jg1Var, this.f18764a0));
/* 511 */           c0064d.show();
/* 514 */           ra0 ra0Var3 = c0064d.f579c;
/* 516 */           ra0Var3.setOnKeyListener(this);
/* 519 */           if (c2304vr == null && this.f18775g0 && jg1Var.f12268m != null) {
/* 536 */               FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R$layout.abc_popup_menu_header_item_layout, (ViewGroup) ra0Var3, false);
/* 545 */               TextView textView = (TextView) frameLayout.findViewById(R.id.title);
/* 547 */               frameLayout.setEnabled(false);
/* 552 */               textView.setText(jg1Var.f12268m);
/* 556 */               ra0Var3.addHeaderView(frameLayout, null, false);
/* 559 */               c0064d.show();
                    }
                }
            }
