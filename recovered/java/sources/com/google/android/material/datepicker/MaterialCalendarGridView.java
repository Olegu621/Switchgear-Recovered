            package com.google.android.material.datepicker;

            import android.R;
            import android.content.Context;
            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.util.AttributeSet;
            import android.view.KeyEvent;
            import android.view.View;
            import android.widget.Adapter;
            import android.widget.GridView;
            import android.widget.ListAdapter;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$id;
            import io.sentry.C1697u2;
            import java.util.Calendar;
            import java.util.Iterator;
            import p000.C1969nm;
            import p000.C2093q3;
            import p000.aa0;
            import p000.e33;
            import p000.h13;
            import p000.hr1;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     final class MaterialCalendarGridView extends GridView {

                /* JADX INFO: renamed from: a */
                public final Calendar f4624a;

                /* JADX INFO: renamed from: b */
                public final boolean f4625b;

                public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 9 */             this.f4624a = h13.m4086f(null);
/* 22 */            if (C0356m.m2315k(getContext(), R.attr.windowFullscreen)) {
/* 26 */                setNextFocusLeftId(R$id.cancel_button);
/* 31 */                setNextFocusRightId(R$id.confirm_button);
                    }
/* 44 */            this.f4625b = C0356m.m2315k(getContext(), R$attr.nestedScrollable);
/* 52 */            e33.m3318n(this, new aa0(2));
                }

                /* JADX INFO: renamed from: a */
                public final C0358o m2296a() {
/* 5 */             return (C0358o) super.getAdapter();
                }

                /* JADX INFO: renamed from: b */
                public final View m2297b(int i) {
/* 6 */             return getChildAt(i - getFirstVisiblePosition());
                }

                @Override // android.widget.GridView, android.widget.AdapterView
                public final Adapter getAdapter() {
/* 5 */             return (C0358o) super.getAdapter();
                }

                @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 10 */            ((C0358o) super.getAdapter()).notifyDataSetChanged();
                }

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
                    int iM2301e;
                    int width;
                    int iM2301e2;
                    int width2;
                    int i;
                    int width3;
                    int right;
/* 1 */             MaterialCalendarGridView materialCalendarGridView = this;
/* 3 */             super.onDraw(canvas);
/* 10 */            C0358o c0358o = (C0358o) super.getAdapter();
/* 12 */            DateSelector dateSelector = c0358o.f4691b;
/* 14 */            C1969nm c1969nm = c0358o.f4693d;
/* 16 */            Month month = c0358o.f4690a;
/* 18 */            int iM2301e3 = month.m2301e();
/* 22 */            int i2 = month.f4629d;
/* 28 */            int iMax = Math.max(iM2301e3, materialCalendarGridView.getFirstVisiblePosition());
/* 40 */            int iMin = Math.min(c0358o.m2321b(), materialCalendarGridView.getLastVisiblePosition());
/* 44 */            Long item = c0358o.getItem(iMax);
/* 48 */            Long item2 = c0358o.getItem(iMin);
/* 56 */            Iterator it = dateSelector.mo2295s().iterator();
/* 64 */            while (it.hasNext()) {
/* 70 */                hr1 hr1Var = (hr1) it.next();
/* 72 */                Object obj = hr1Var.f9210a;
/* 74 */                if (obj == null) {
/* 440 */                   materialCalendarGridView = this;
                        } else if (hr1Var.f9211b != null) {
/* 81 */                    Long l = (Long) obj;
/* 83 */                    long jLongValue = l.longValue();
/* 89 */                    Long l2 = (Long) hr1Var.f9211b;
/* 91 */                    long jLongValue2 = l2.longValue();
/* 95 */                    if (item == null || item2 == null || l.longValue() > item2.longValue() || l2.longValue() < item.longValue()) {
/* 429 */                       materialCalendarGridView = this;
/* 431 */                       month = month;
/* 432 */                       it = it;
/* 434 */                       iMax = iMax;
/* 436 */                       c0358o = c0358o;
                            } else {
/* 132 */                       boolean zM6036J = kb1.m6036J(materialCalendarGridView);
/* 136 */                       long jLongValue3 = item.longValue();
/* 142 */                       Iterator it2 = it;
/* 146 */                       Calendar calendar = materialCalendarGridView.f4624a;
/* 148 */                       if (jLongValue < jLongValue3) {
/* 152 */                           if (iMax % i2 == 0) {
/* 154 */                               right = 0;
                                    } else {
/* 176 */                               right = !zM6036J ? materialCalendarGridView.m2297b(iMax - 1).getRight() : materialCalendarGridView.m2297b(iMax - 1).getLeft();
                                    }
/* 180 */                           width = right;
/* 181 */                           iM2301e = iMax;
                                } else {
/* 183 */                           calendar.setTimeInMillis(jLongValue);
/* 197 */                           iM2301e = month.m2301e() + (calendar.get(5) - 1);
/* 198 */                           View viewM2297b = materialCalendarGridView.m2297b(iM2301e);
/* 212 */                           width = (viewM2297b.getWidth() / 2) + viewM2297b.getLeft();
                                }
/* 219 */                       if (jLongValue2 > item2.longValue()) {
/* 224 */                           if ((iMin + 1) % i2 == 0) {
/* 226 */                               width2 = materialCalendarGridView.getWidth();
                                    } else {
/* 246 */                               width2 = !zM6036J ? materialCalendarGridView.m2297b(iMin).getRight() : materialCalendarGridView.m2297b(iMin).getLeft();
                                    }
/* 250 */                           iM2301e2 = iMin;
                                } else {
/* 252 */                           calendar.setTimeInMillis(jLongValue2);
/* 266 */                           iM2301e2 = month.m2301e() + (calendar.get(5) - 1);
/* 267 */                           View viewM2297b2 = materialCalendarGridView.m2297b(iM2301e2);
/* 281 */                           width2 = (viewM2297b2.getWidth() / 2) + viewM2297b2.getLeft();
                                }
/* 286 */                       int itemId = (int) c0358o.getItemId(iM2301e);
/* 287 */                       Month month2 = month;
/* 288 */                       int i3 = iMax;
/* 294 */                       int itemId2 = (int) c0358o.getItemId(iM2301e2);
/* 295 */                       while (itemId <= itemId2) {
/* 301 */                           int numColumns = materialCalendarGridView.getNumColumns() * itemId;
/* 308 */                           C0358o c0358o2 = c0358o;
/* 310 */                           int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
/* 312 */                           View viewM2297b3 = materialCalendarGridView.m2297b(numColumns);
/* 330 */                           int top = viewM2297b3.getTop() + ((Rect) ((C2093q3) c1969nm.f14373a).f15370b).top;
/* 336 */                           int i4 = width2;
/* 348 */                           int bottom = viewM2297b3.getBottom() - ((Rect) ((C2093q3) c1969nm.f14373a).f15370b).bottom;
/* 350 */                           if (zM6036J) {
/* 373 */                               int i5 = iM2301e2 > numColumns2 ? 0 : i4;
/* 382 */                               int width4 = numColumns > iM2301e ? getWidth() : width;
/* 385 */                               i = i5;
/* 386 */                               width3 = width4;
                                    } else {
/* 357 */                               i = numColumns > iM2301e ? 0 : width;
/* 365 */                               width3 = iM2301e2 > numColumns2 ? getWidth() : i4;
                                    }
/* 408 */                           canvas.drawRect(i, top, width3, bottom, (Paint) c1969nm.f14380h);
/* 411 */                           itemId++;
/* 413 */                           materialCalendarGridView = this;
/* 415 */                           c0358o = c0358o2;
/* 417 */                           width2 = i4;
                                }
/* 420 */                       materialCalendarGridView = this;
/* 422 */                       month = month2;
/* 423 */                       it = it2;
/* 425 */                       iMax = i3;
                            }
                        }
                    }
                }

                @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
                public final void onFocusChanged(boolean z, int i, Rect rect) {
/* 1 */             if (!z) {
/* 47 */                super.onFocusChanged(false, i, rect);
/* 50 */                return;
                    }
/* 5 */             if (i == 33) {
/* 17 */                setSelection(((C0358o) super.getAdapter()).m2321b());
                    } else if (i == 130) {
/* 37 */                setSelection(((C0358o) super.getAdapter()).f4690a.m2301e());
                    } else {
/* 42 */                super.onFocusChanged(true, i, rect);
                    }
                }

                @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
                public final boolean onKeyDown(int i, KeyEvent keyEvent) {
/* 6 */             if (!super.onKeyDown(i, keyEvent)) {
/* 5 */                 return false;
                    }
/* 15 */            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((C0358o) super.getAdapter()).f4690a.m2301e()) {
/* 14 */                return true;
                    }
/* 38 */            if (19 != i) {
/* 5 */                 return false;
                    }
/* 52 */            setSelection(((C0358o) super.getAdapter()).f4690a.m2301e());
/* 14 */            return true;
                }

                @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
                public final void onMeasure(int i, int i2) {
/* 3 */             if (!this.f4625b) {
/* 28 */                super.onMeasure(i, i2);
/* 31 */                return;
                    }
/* 14 */            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
/* 25 */            getLayoutParams().height = getMeasuredHeight();
                }

                @Override // android.widget.AdapterView
                public final void setAdapter(ListAdapter listAdapter) {
/* 3 */             if (listAdapter instanceof C0358o) {
/* 5 */                 super.setAdapter(listAdapter);
                    } else {
/* 27 */                C1697u2.m5437m("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C0358o.class.getCanonicalName()});
                    }
                }

                @Override // android.widget.GridView, android.widget.AdapterView
                public final void setSelection(int i) {
/* 13 */            if (i < ((C0358o) super.getAdapter()).f4690a.m2301e()) {
/* 27 */                super.setSelection(((C0358o) super.getAdapter()).f4690a.m2301e());
                    } else {
/* 31 */                super.setSelection(i);
                    }
                }

                @Override // android.widget.GridView, android.widget.AdapterView
/* 7 */         public final ListAdapter getAdapter() {
/* 8 */             return (C0358o) super.getAdapter();
                }

/* 55 */        public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
/* 56 */            this(context, attributeSet, 0);
                }
            }
