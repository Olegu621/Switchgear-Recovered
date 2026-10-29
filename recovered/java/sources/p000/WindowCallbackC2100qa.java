            package p000;

            import android.content.Context;
            import android.view.ActionMode;
            import android.view.KeyEvent;
            import android.view.Menu;
            import android.view.MenuItem;
            import android.view.MotionEvent;
            import android.view.SearchEvent;
            import android.view.View;
            import android.view.Window;
            import android.view.WindowManager;
            import android.view.accessibility.AccessibilityEvent;
            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: renamed from: qa */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public final class WindowCallbackC2100qa implements Window.Callback {

                /* JADX INFO: renamed from: a */
                public final Window.Callback f15454a;

                /* JADX INFO: renamed from: b */
                public er0 f15455b;

                /* JADX INFO: renamed from: c */
                public boolean f15456c;

                /* JADX INFO: renamed from: d */
                public boolean f15457d;

                /* JADX INFO: renamed from: e */
                public boolean f15458e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ LayoutInflaterFactory2C2324wa f15459f;

                public WindowCallbackC2100qa(LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa, Window.Callback callback) {
/* 4 */             this.f15459f = layoutInflaterFactory2C2324wa;
/* 6 */             if (callback != null) {
/* 8 */                 this.f15454a = callback;
                    } else {
/* 13 */                C1951n4.m6859j("Window callback may not be null");
/* 17 */                throw null;
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m7743a(Window.Callback callback) {
                    try {
/* 3 */                 this.f15456c = true;
/* 5 */                 callback.onContentChanged();
                    } finally {
/* 12 */                this.f15456c = false;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final boolean m7744b(int i, Menu menu) {
/* 3 */             return this.f15454a.onMenuOpened(i, menu);
                }

                /* JADX INFO: renamed from: c */
                public final void m7745c(int i, Menu menu) {
/* 3 */             this.f15454a.onPanelClosed(i, menu);
                }

                /* JADX INFO: renamed from: d */
                public final void m7746d(List list, Menu menu, int i) {
/* 3 */             o73.m7112a(this.f15454a, list, menu, i);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
/* 3 */             return this.f15454a.dispatchGenericMotionEvent(motionEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
/* 1 */             boolean z = this.f15457d;
/* 3 */             Window.Callback callback = this.f15454a;
/* 5 */             if (z) {
/* 7 */                 return callback.dispatchKeyEvent(keyEvent);
                    }
                    return this.f15459f.m9505u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
/* 8 */             if (!this.f15454a.dispatchKeyShortcutEvent(keyEvent)) {
/* 10 */                int keyCode = keyEvent.getKeyCode();
/* 14 */                LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = this.f15459f;
/* 16 */                layoutInflaterFactory2C2324wa.m9491A();
/* 19 */                AbstractC2165s1 abstractC2165s1 = layoutInflaterFactory2C2324wa.f18514Z;
/* 21 */                if (abstractC2165s1 == null || !abstractC2165s1.mo8351k(keyCode, keyEvent)) {
/* 30 */                    C2286va c2286va = layoutInflaterFactory2C2324wa.f18538x0;
/* 32 */                    if (c2286va == null || !layoutInflaterFactory2C2324wa.m9496F(c2286va, keyEvent.getKeyCode(), keyEvent)) {
/* 54 */                        if (layoutInflaterFactory2C2324wa.f18538x0 == null) {
/* 56 */                            C2286va c2286vaM9510z = layoutInflaterFactory2C2324wa.m9510z(0);
/* 60 */                            layoutInflaterFactory2C2324wa.m9497G(c2286vaM9510z, keyEvent);
/* 67 */                            boolean zM9496F = layoutInflaterFactory2C2324wa.m9496F(c2286vaM9510z, keyEvent.getKeyCode(), keyEvent);
/* 71 */                            c2286vaM9510z.f17940k = false;
/* 73 */                            if (zM9496F) {
                                    }
                                }
/* 53 */                        return false;
                            }
/* 44 */                    C2286va c2286va2 = layoutInflaterFactory2C2324wa.f18538x0;
/* 46 */                    if (c2286va2 != null) {
/* 48 */                        c2286va2.f17941l = true;
/* 7 */                         return true;
                            }
                        }
                    }
/* 7 */             return true;
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
/* 3 */             return this.f15454a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
/* 3 */             return this.f15454a.dispatchTouchEvent(motionEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
/* 3 */             return this.f15454a.dispatchTrackballEvent(motionEvent);
                }

                @Override // android.view.Window.Callback
                public final void onActionModeFinished(ActionMode actionMode) {
/* 3 */             this.f15454a.onActionModeFinished(actionMode);
                }

                @Override // android.view.Window.Callback
                public final void onActionModeStarted(ActionMode actionMode) {
/* 3 */             this.f15454a.onActionModeStarted(actionMode);
                }

                @Override // android.view.Window.Callback
                public final void onAttachedToWindow() {
/* 3 */             this.f15454a.onAttachedToWindow();
                }

                @Override // android.view.Window.Callback
                public final void onContentChanged() {
/* 3 */             if (this.f15456c) {
/* 7 */                 this.f15454a.onContentChanged();
                    }
                }

                @Override // android.view.Window.Callback
                public final boolean onCreatePanelMenu(int i, Menu menu) {
/* 1 */             if (i != 0 || (menu instanceof jg1)) {
/* 11 */                return this.f15454a.onCreatePanelMenu(i, menu);
                    }
/* 7 */             return false;
                }

                @Override // android.view.Window.Callback
                public final View onCreatePanelView(int i) {
/* 1 */             er0 er0Var = this.f15455b;
/* 3 */             if (er0Var != null) {
/* 25 */                View view = i == 0 ? new View(((xp2) er0Var.f7853b).f19302a.f762a.getContext()) : null;
/* 26 */                if (view != null) {
/* 28 */                    return view;
                        }
                    }
/* 31 */            return this.f15454a.onCreatePanelView(i);
                }

                @Override // android.view.Window.Callback
                public final void onDetachedFromWindow() {
/* 3 */             this.f15454a.onDetachedFromWindow();
                }

                @Override // android.view.Window.Callback
                public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
/* 3 */             return this.f15454a.onMenuItemSelected(i, menuItem);
                }

                @Override // android.view.Window.Callback
                public final boolean onMenuOpened(int i, Menu menu) {
/* 1 */             m7744b(i, menu);
/* 7 */             if (i == 108) {
/* 9 */                 LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = this.f15459f;
/* 11 */                layoutInflaterFactory2C2324wa.m9491A();
/* 14 */                AbstractC2165s1 abstractC2165s1 = layoutInflaterFactory2C2324wa.f18514Z;
/* 16 */                if (abstractC2165s1 != null) {
/* 18 */                    abstractC2165s1.mo8343c(true);
                        }
                    }
/* 6 */             return true;
                }

                @Override // android.view.Window.Callback
                public final void onPanelClosed(int i, Menu menu) {
/* 3 */             if (this.f15458e) {
/* 7 */                 this.f15454a.onPanelClosed(i, menu);
/* 10 */                return;
                    }
/* 11 */            m7745c(i, menu);
/* 16 */            LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = this.f15459f;
/* 19 */            if (i == 108) {
/* 21 */                layoutInflaterFactory2C2324wa.m9491A();
/* 24 */                AbstractC2165s1 abstractC2165s1 = layoutInflaterFactory2C2324wa.f18514Z;
/* 26 */                if (abstractC2165s1 != null) {
/* 28 */                    abstractC2165s1.mo8343c(false);
/* 31 */                    return;
                        }
/* 45 */                return;
                    }
/* 32 */            if (i == 0) {
/* 34 */                C2286va c2286vaM9510z = layoutInflaterFactory2C2324wa.m9510z(i);
/* 40 */                if (c2286vaM9510z.f17942m) {
/* 42 */                    layoutInflaterFactory2C2324wa.m9504s(c2286vaM9510z, false);
                        }
                    }
                }

                @Override // android.view.Window.Callback
                public final void onPointerCaptureChanged(boolean z) {
/* 3 */             p73.m7347a(this.f15454a, z);
                }

                @Override // android.view.Window.Callback
                public final boolean onPreparePanel(int i, View view, Menu menu) {
/* 9 */             jg1 jg1Var = menu instanceof jg1 ? (jg1) menu : null;
/* 11 */            if (i == 0 && jg1Var == null) {
/* 10 */                return false;
                    }
/* 17 */            if (jg1Var != null) {
/* 19 */                jg1Var.f12280y = true;
                    }
/* 21 */            er0 er0Var = this.f15455b;
/* 23 */            if (er0Var != null && i == 0) {
/* 29 */                xp2 xp2Var = (xp2) er0Var.f7853b;
/* 33 */                if (!xp2Var.f19305d) {
/* 37 */                    xp2Var.f19302a.f773l = true;
/* 39 */                    xp2Var.f19305d = true;
                        }
                    }
/* 43 */            boolean zOnPreparePanel = this.f15454a.onPreparePanel(i, view, menu);
/* 47 */            if (jg1Var != null) {
/* 49 */                jg1Var.f12280y = false;
                    }
/* 51 */            return zOnPreparePanel;
                }

                @Override // android.view.Window.Callback
                public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
/* 8 */             jg1 jg1Var = this.f15459f.m9510z(0).f17937h;
/* 10 */            if (jg1Var != null) {
/* 12 */                m7746d(list, jg1Var, i);
                    } else {
/* 16 */                m7746d(list, menu, i);
                    }
                }

                @Override // android.view.Window.Callback
                public final boolean onSearchRequested(SearchEvent searchEvent) {
/* 3 */             return n73.m6943a(this.f15454a, searchEvent);
                }

                @Override // android.view.Window.Callback
                public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
/* 3 */             this.f15454a.onWindowAttributesChanged(layoutParams);
                }

                @Override // android.view.Window.Callback
                public final void onWindowFocusChanged(boolean z) {
/* 3 */             this.f15454a.onWindowFocusChanged(z);
                }

                @Override // android.view.Window.Callback
                public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
/* 1 */             if (i != 0) {
/* 5 */                 return n73.m6944b(this.f15454a, callback, i);
                    }
/* 12 */            LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = this.f15459f;
/* 14 */            Context context = layoutInflaterFactory2C2324wa.f18510V;
/* 16 */            ra2 ra2Var = new ra2();
/* 19 */            ra2Var.f15956b = context;
/* 21 */            ra2Var.f15955a = callback;
/* 28 */            ra2Var.f15957c = new ArrayList();
/* 35 */            ra2Var.f15958d = new le2();
/* 37 */            AbstractC1778j2 abstractC1778j2Mo4509m = layoutInflaterFactory2C2324wa.mo4509m(ra2Var);
/* 41 */            if (abstractC1778j2Mo4509m != null) {
/* 43 */                return ra2Var.m8107k(abstractC1778j2Mo4509m);
                    }
/* 48 */            return null;
                }

                @Override // android.view.Window.Callback
/* 7 */         public final boolean onSearchRequested() {
/* 8 */             return this.f15454a.onSearchRequested();
                }

                @Override // android.view.Window.Callback
/* 49 */        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
/* 50 */            return null;
                }
            }
