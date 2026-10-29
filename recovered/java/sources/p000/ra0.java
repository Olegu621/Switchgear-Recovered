            package p000;

            import android.content.Context;
            import android.graphics.Canvas;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.os.Build;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.ListAdapter;
            import android.widget.ListView;
            import androidx.appcompat.R$attr;
            import java.lang.reflect.Field;
            import java.lang.reflect.InvocationTargetException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ra0 extends ListView {

                /* JADX INFO: renamed from: U */
                public boolean f15939U;

                /* JADX INFO: renamed from: V */
                public r81 f15940V;

                /* JADX INFO: renamed from: W */
                public RunnableC2495ye f15941W;

                /* JADX INFO: renamed from: a */
                public final Rect f15942a;

                /* JADX INFO: renamed from: b */
                public int f15943b;

                /* JADX INFO: renamed from: c */
                public int f15944c;

                /* JADX INFO: renamed from: d */
                public int f15945d;

                /* JADX INFO: renamed from: e */
                public int f15946e;

                /* JADX INFO: renamed from: f */
                public int f15947f;

                /* JADX INFO: renamed from: i */
                public pa0 f15948i;

                /* JADX INFO: renamed from: v */
                public boolean f15949v;

                /* JADX INFO: renamed from: w */
                public final boolean f15950w;

                public ra0(Context context, boolean z) {
/* 4 */             super(context, null, R$attr.dropDownListViewStyle);
/* 12 */            this.f15942a = new Rect();
/* 15 */            this.f15943b = 0;
/* 17 */            this.f15944c = 0;
/* 19 */            this.f15945d = 0;
/* 21 */            this.f15946e = 0;
/* 23 */            this.f15950w = z;
/* 25 */            setCacheColorHint(0);
                }

                /* JADX INFO: renamed from: a */
                public final int m8098a(int i, int i2) {
/* 1 */             int listPaddingTop = getListPaddingTop();
/* 5 */             int listPaddingBottom = getListPaddingBottom();
/* 9 */             int dividerHeight = getDividerHeight();
/* 13 */            Drawable divider = getDivider();
/* 17 */            ListAdapter adapter = getAdapter();
/* 21 */            if (adapter == null) {
/* 23 */                return listPaddingTop + listPaddingBottom;
                    }
/* 25 */            int measuredHeight = listPaddingTop + listPaddingBottom;
/* 27 */            if (dividerHeight <= 0 || divider == null) {
/* 32 */                dividerHeight = 0;
                    }
/* 33 */            int count = adapter.getCount();
/* 39 */            int i3 = 0;
/* 40 */            View view = null;
/* 41 */            for (int i4 = 0; i4 < count; i4++) {
/* 43 */                int itemViewType = adapter.getItemViewType(i4);
/* 47 */                if (itemViewType != i3) {
/* 49 */                    view = null;
/* 50 */                    i3 = itemViewType;
                        }
/* 51 */                view = adapter.getView(i4, view, this);
/* 55 */                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
/* 59 */                if (layoutParams == null) {
/* 61 */                    layoutParams = generateDefaultLayoutParams();
/* 65 */                    view.setLayoutParams(layoutParams);
                        }
/* 68 */                int i5 = layoutParams.height;
/* 83 */                view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
/* 86 */                view.forceLayout();
/* 89 */                if (i4 > 0) {
/* 91 */                    measuredHeight += dividerHeight;
                        }
/* 96 */                measuredHeight += view.getMeasuredHeight();
/* 97 */                if (measuredHeight >= i2) {
/* 99 */                    return i2;
                        }
                    }
/* 103 */           return measuredHeight;
                }

                /* JADX WARN: Code duplicated, block: B:81:0x014a  */
                /* JADX WARN: Code duplicated, block: B:83:0x015f  */
                /* JADX WARN: Code duplicated, block: B:86:0x0166 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:87:0x0168  */
                /* JADX WARN: Code duplicated, block: B:89:0x017a  */
                /* JADX WARN: Code duplicated, block: B:90:0x017c  */
                /* JADX WARN: Code duplicated, block: B:92:0x0180  */
                /* JADX WARN: Code duplicated, block: B:9:0x0016  */
                /* JADX INFO: renamed from: b */
                public final boolean m8099b(MotionEvent motionEvent, int i) {
                    boolean z;
                    boolean zM7127a;
                    View childAt;
                    View childAt2;
                    r81 r81Var;
/* 5 */             int actionMasked = motionEvent.getActionMasked();
/* 9 */             boolean z2 = true;
/* 11 */            if (actionMasked != 1) {
/* 14 */                if (actionMasked == 2) {
/* 27 */                    z = true;
                        } else if (actionMasked != 3) {
/* 19 */                    z = true;
/* 20 */                    z2 = false;
                        } else {
/* 23 */                    z = false;
/* 24 */                    z2 = false;
                        }
/* 327 */               if (z || z2) {
/* 331 */                   this.f15939U = false;
/* 333 */                   setPressed(false);
/* 336 */                   drawableStateChanged();
/* 346 */                   childAt2 = getChildAt(this.f15947f - getFirstVisiblePosition());
/* 350 */                   if (childAt2 != null) {
/* 352 */                       childAt2.setPressed(false);
                            }
                        }
/* 355 */               r81Var = this.f15940V;
/* 357 */               if (z) {
/* 359 */                   if (r81Var == null) {
/* 366 */                       this.f15940V = new r81(this);
                            }
/* 368 */                   r81 r81Var2 = this.f15940V;
/* 370 */                   boolean z3 = r81Var2.f15921a0;
/* 373 */                   r81Var2.f15921a0 = true;
/* 375 */                   r81Var2.onTouch(this, motionEvent);
                        } else if (r81Var != null) {
/* 383 */                   if (r81Var.f15921a0) {
/* 385 */                       r81Var.m8084d();
                            }
/* 388 */                   r81Var.f15921a0 = false;
                        }
/* 390 */               return z;
                    }
/* 29 */            z = false;
/* 30 */            int iFindPointerIndex = motionEvent.findPointerIndex(i);
/* 34 */            if (iFindPointerIndex < 0) {
/* 23 */                z = false;
/* 24 */                z2 = false;
                    } else {
/* 41 */                int x = (int) motionEvent.getX(iFindPointerIndex);
/* 46 */                int y = (int) motionEvent.getY(iFindPointerIndex);
/* 47 */                int iPointToPosition = pointToPosition(x, y);
/* 52 */                if (iPointToPosition != -1) {
/* 62 */                    View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                            float f = x;
                            float f2 = y;
/* 68 */                    this.f15939U = true;
/* 70 */                    ma0.m6633a(this, f, f2);
/* 77 */                    if (!isPressed()) {
/* 79 */                        setPressed(true);
                            }
/* 82 */                    layoutChildren();
/* 85 */                    int i2 = this.f15947f;
/* 87 */                    if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
/* 108 */                       childAt.setPressed(false);
                            }
/* 111 */                   this.f15947f = iPointToPosition;
/* 127 */                   ma0.m6633a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
/* 134 */                   if (!childAt3.isPressed()) {
/* 136 */                       childAt3.setPressed(true);
                            }
/* 139 */                   Drawable selector = getSelector();
/* 149 */                   boolean z4 = (selector == null || iPointToPosition == -1) ? false : true;
/* 150 */                   if (z4) {
/* 152 */                       selector.setVisible(false, false);
                            }
/* 155 */                   int left = childAt3.getLeft();
/* 159 */                   int top = childAt3.getTop();
/* 163 */                   int right = childAt3.getRight();
/* 167 */                   int bottom = childAt3.getBottom();
/* 173 */                   Rect rect = this.f15942a;
/* 175 */                   rect.set(left, top, right, bottom);
/* 183 */                   rect.left -= this.f15943b;
/* 190 */                   rect.top -= this.f15944c;
/* 197 */                   rect.right += this.f15945d;
/* 204 */                   rect.bottom += this.f15946e;
/* 210 */                   if (Build.VERSION.SDK_INT >= 33) {
/* 212 */                       zM7127a = oa0.m7127a(this);
                            } else {
/* 217 */                       Field field = qa0.f15460a;
/* 219 */                       if (field != null) {
                                    try {
/* 221 */                               zM7127a = field.getBoolean(this);
                                    } catch (IllegalAccessException e) {
/* 227 */                               e.printStackTrace();
/* 230 */                               zM7127a = false;
                                    }
                                } else {
/* 230 */                           zM7127a = false;
                                }
                            }
/* 235 */                   if (childAt3.isEnabled() != zM7127a) {
/* 237 */                       boolean z5 = !zM7127a;
/* 241 */                       if (Build.VERSION.SDK_INT >= 33) {
/* 243 */                           oa0.m7128b(this, z5);
                                } else {
/* 247 */                           Field field2 = qa0.f15460a;
/* 249 */                           if (field2 != null) {
                                        try {
/* 255 */                                   field2.set(this, Boolean.valueOf(z5));
                                        } catch (IllegalAccessException e2) {
/* 260 */                                   e2.printStackTrace();
                                        }
                                    }
                                }
/* 263 */                       if (iPointToPosition != -1) {
/* 265 */                           refreshDrawableState();
                                }
                            }
/* 268 */                   if (z4) {
/* 270 */                       float fExactCenterX = rect.exactCenterX();
/* 274 */                       float fExactCenterY = rect.exactCenterY();
/* 288 */                       selector.setVisible(getVisibility() == 0, false);
/* 291 */                       s90.m8445e(selector, fExactCenterX, fExactCenterY);
                            }
/* 294 */                   Drawable selector2 = getSelector();
/* 298 */                   if (selector2 != null && iPointToPosition != -1) {
/* 302 */                       s90.m8445e(selector2, f, f2);
                            }
/* 305 */                   pa0 pa0Var = this.f15948i;
/* 307 */                   if (pa0Var != null) {
/* 309 */                       pa0Var.f15039b = false;
                            }
/* 311 */                   refreshDrawableState();
/* 316 */                   if (actionMasked == 1) {
/* 322 */                       performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                            }
/* 325 */                   z2 = false;
/* 326 */                   z = true;
                        }
                    }
/* 327 */           if (z) {
/* 331 */               this.f15939U = false;
/* 333 */               setPressed(false);
/* 336 */               drawableStateChanged();
/* 346 */               childAt2 = getChildAt(this.f15947f - getFirstVisiblePosition());
/* 350 */               if (childAt2 != null) {
/* 352 */                   childAt2.setPressed(false);
                        }
                    } else {
/* 331 */               this.f15939U = false;
/* 333 */               setPressed(false);
/* 336 */               drawableStateChanged();
/* 346 */               childAt2 = getChildAt(this.f15947f - getFirstVisiblePosition());
/* 350 */               if (childAt2 != null) {
/* 352 */                   childAt2.setPressed(false);
                        }
                    }
/* 355 */           r81Var = this.f15940V;
/* 357 */           if (z) {
/* 359 */               if (r81Var == null) {
/* 366 */                   this.f15940V = new r81(this);
                        }
/* 368 */               r81 r81Var3 = this.f15940V;
/* 370 */               boolean z6 = r81Var3.f15921a0;
/* 373 */               r81Var3.f15921a0 = true;
/* 375 */               r81Var3.onTouch(this, motionEvent);
                    } else if (r81Var != null) {
/* 383 */               if (r81Var.f15921a0) {
/* 385 */                   r81Var.m8084d();
                        }
/* 388 */               r81Var.f15921a0 = false;
                    }
/* 390 */           return z;
                }

                @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
                public final void dispatchDraw(Canvas canvas) {
                    Drawable selector;
/* 1 */             Rect rect = this.f15942a;
/* 7 */             if (!rect.isEmpty() && (selector = getSelector()) != null) {
/* 15 */                selector.setBounds(rect);
/* 18 */                selector.draw(canvas);
                    }
/* 21 */            super.dispatchDraw(canvas);
                }

                @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
                public final void drawableStateChanged() {
/* 3 */             if (this.f15941W != null) {
/* 39 */                return;
                    }
/* 6 */             super.drawableStateChanged();
/* 9 */             pa0 pa0Var = this.f15948i;
/* 11 */            if (pa0Var != null) {
/* 14 */                pa0Var.f15039b = true;
                    }
/* 16 */            Drawable selector = getSelector();
/* 20 */            if (selector != null && this.f15939U && isPressed()) {
/* 36 */                selector.setState(getDrawableState());
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final boolean hasFocus() {
                    return this.f15950w || super.hasFocus();
                }

                @Override // android.view.View
                public final boolean hasWindowFocus() {
                    return this.f15950w || super.hasWindowFocus();
                }

                @Override // android.view.View
                public final boolean isFocused() {
                    return this.f15950w || super.isFocused();
                }

                @Override // android.view.View
                public final boolean isInTouchMode() {
                    return (this.f15950w && this.f15949v) || super.isInTouchMode();
                }

                @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
/* 2 */             this.f15941W = null;
/* 4 */             super.onDetachedFromWindow();
                }

                @Override // android.view.View
                public boolean onHoverEvent(MotionEvent motionEvent) {
/* 1 */             int i = Build.VERSION.SDK_INT;
/* 5 */             if (i < 26) {
/* 7 */                 return super.onHoverEvent(motionEvent);
                    }
/* 12 */            int actionMasked = motionEvent.getActionMasked();
/* 18 */            if (actionMasked == 10 && this.f15941W == null) {
/* 27 */                RunnableC2495ye runnableC2495ye = new RunnableC2495ye(this, 6);
/* 30 */                this.f15941W = runnableC2495ye;
/* 32 */                post(runnableC2495ye);
                    }
/* 35 */            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
/* 42 */            if (actionMasked != 9 && actionMasked != 7) {
/* 48 */                setSelection(-1);
/* 51 */                return zOnHoverEvent;
                    }
/* 62 */            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
/* 66 */            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
/* 80 */                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
/* 88 */                if (childAt.isEnabled()) {
/* 90 */                    requestFocus();
/* 95 */                    if (i < 30 || !na0.f14171d) {
/* 168 */                       setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                            } else {
                                try {
/* 117 */                           na0.f14168a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
/* 130 */                           na0.f14169b.invoke(this, Integer.valueOf(iPointToPosition));
/* 143 */                           na0.f14170c.invoke(this, Integer.valueOf(iPointToPosition));
                                } catch (IllegalAccessException e) {
/* 155 */                           e.printStackTrace();
                                } catch (InvocationTargetException e2) {
/* 151 */                           e2.printStackTrace();
                                }
                            }
                        }
/* 171 */               Drawable selector = getSelector();
/* 175 */               if (selector != null && this.f15939U && isPressed()) {
/* 191 */                   selector.setState(getDrawableState());
                        }
                    }
/* 194 */           return zOnHoverEvent;
                }

                @Override // android.widget.AbsListView, android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
/* 5 */             if (motionEvent.getAction() == 0) {
/* 22 */                this.f15947f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                    }
/* 24 */            RunnableC2495ye runnableC2495ye = this.f15941W;
/* 26 */            if (runnableC2495ye != null) {
/* 30 */                ra0 ra0Var = (ra0) runnableC2495ye.f19586b;
/* 33 */                ra0Var.f15941W = null;
/* 35 */                ra0Var.removeCallbacks(runnableC2495ye);
                    }
/* 38 */            return super.onTouchEvent(motionEvent);
                }

                public void setListSelectionHidden(boolean z) {
/* 1 */             this.f15949v = z;
                }

                @Override // android.widget.AbsListView
                public void setSelector(Drawable drawable) {
/* 1 */             pa0 pa0Var = null;
/* 2 */             if (drawable != null) {
/* 6 */                 pa0 pa0Var2 = new pa0();
/* 9 */                 Drawable drawable2 = pa0Var2.f15038a;
/* 11 */                if (drawable2 != null) {
/* 13 */                    drawable2.setCallback(null);
                        }
/* 16 */                pa0Var2.f15038a = drawable;
/* 18 */                drawable.setCallback(pa0Var2);
/* 22 */                pa0Var2.f15039b = true;
/* 24 */                pa0Var = pa0Var2;
                    }
/* 25 */            this.f15948i = pa0Var;
/* 27 */            super.setSelector(pa0Var);
/* 32 */            Rect rect = new Rect();
/* 35 */            if (drawable != null) {
/* 37 */                drawable.getPadding(rect);
                    }
/* 42 */            this.f15943b = rect.left;
/* 46 */            this.f15944c = rect.top;
/* 50 */            this.f15945d = rect.right;
/* 54 */            this.f15946e = rect.bottom;
                }
            }
