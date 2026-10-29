            package com.quago.mobile.sdk;

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
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.e1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public abstract class AbstractWindowCallbackC0726e1 implements Window.Callback {

                /* JADX INFO: renamed from: a */
                public final Window.Callback f5426a;

                public AbstractWindowCallbackC0726e1(Window.Callback callback) {
/* 4 */             this.f5426a = callback;
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
/* 1 */             Window.Callback callback = this.f5426a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.dispatchGenericMotionEvent(motionEvent);
                }

                @Override // android.view.Window.Callback
                public boolean dispatchKeyEvent(KeyEvent keyEvent) {
/* 1 */             Window.Callback callback = this.f5426a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.dispatchKeyEvent(keyEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
/* 1 */             Window.Callback callback = this.f5426a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.dispatchKeyShortcutEvent(keyEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
/* 1 */             Window.Callback callback = this.f5426a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
                }

                @Override // android.view.Window.Callback
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
/* 1 */             Window.Callback callback = this.f5426a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.dispatchTouchEvent(motionEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
/* 1 */             Window.Callback callback = this.f5426a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.dispatchTrackballEvent(motionEvent);
                }

                @Override // android.view.Window.Callback
                public final void onActionModeFinished(ActionMode actionMode) {
/* 1 */             Window.Callback callback = this.f5426a;
/* 3 */             if (callback != null) {
/* 5 */                 callback.onActionModeFinished(actionMode);
                    }
                }

                @Override // android.view.Window.Callback
                public final void onActionModeStarted(ActionMode actionMode) {
/* 1 */             Window.Callback callback = this.f5426a;
/* 3 */             if (callback != null) {
/* 5 */                 callback.onActionModeStarted(actionMode);
                    }
                }

                @Override // android.view.Window.Callback
                public final void onAttachedToWindow() {
/* 1 */             Window.Callback callback = this.f5426a;
/* 3 */             if (callback != null) {
/* 5 */                 callback.onAttachedToWindow();
                    }
                }

                @Override // android.view.Window.Callback
                public final void onContentChanged() {
/* 1 */             Window.Callback callback = this.f5426a;
/* 3 */             if (callback != null) {
/* 5 */                 callback.onContentChanged();
                    }
                }

                @Override // android.view.Window.Callback
                public final boolean onCreatePanelMenu(int i, Menu menu) {
/* 1 */             Window.Callback callback = this.f5426a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.onCreatePanelMenu(i, menu);
                }

                @Override // android.view.Window.Callback
                public final View onCreatePanelView(int i) {
/* 1 */             Window.Callback callback = this.f5426a;
/* 3 */             if (callback == null) {
/* 5 */                 return null;
                    }
/* 7 */             return callback.onCreatePanelView(i);
                }

                @Override // android.view.Window.Callback
                public final void onDetachedFromWindow() {
/* 1 */             Window.Callback callback = this.f5426a;
/* 3 */             if (callback != null) {
/* 5 */                 callback.onDetachedFromWindow();
                    }
                }

                @Override // android.view.Window.Callback
                public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
/* 1 */             Window.Callback callback = this.f5426a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.onMenuItemSelected(i, menuItem);
                }

                @Override // android.view.Window.Callback
                public final boolean onMenuOpened(int i, Menu menu) {
/* 1 */             Window.Callback callback = this.f5426a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.onMenuOpened(i, menu);
                }

                @Override // android.view.Window.Callback
                public final void onPanelClosed(int i, Menu menu) {
/* 1 */             Window.Callback callback = this.f5426a;
/* 3 */             if (callback != null) {
/* 5 */                 callback.onPanelClosed(i, menu);
                    }
                }

                @Override // android.view.Window.Callback
                public final boolean onPreparePanel(int i, View view, Menu menu) {
/* 1 */             Window.Callback callback = this.f5426a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.onPreparePanel(i, view, menu);
                }

                @Override // android.view.Window.Callback
                public final boolean onSearchRequested() {
/* 1 */             Window.Callback callback = this.f5426a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.onSearchRequested();
                }

                @Override // android.view.Window.Callback
                public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
/* 1 */             Window.Callback callback = this.f5426a;
/* 3 */             if (callback != null) {
/* 5 */                 callback.onWindowAttributesChanged(layoutParams);
                    }
                }

                @Override // android.view.Window.Callback
                public final void onWindowFocusChanged(boolean z) {
/* 1 */             Window.Callback callback = this.f5426a;
/* 3 */             if (callback != null) {
/* 5 */                 callback.onWindowFocusChanged(z);
                    }
                }

                @Override // android.view.Window.Callback
                public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
/* 1 */             Window.Callback callback2 = this.f5426a;
/* 3 */             if (callback2 == null) {
/* 5 */                 return null;
                    }
/* 7 */             return callback2.onWindowStartingActionMode(callback);
                }

                @Override // android.view.Window.Callback
/* 11 */        public final boolean onSearchRequested(SearchEvent searchEvent) {
/* 12 */            Window.Callback callback = this.f5426a;
                    if (callback != null) {
/* 13 */                return callback.onSearchRequested(searchEvent);
                    }
                    return false;
                }

                @Override // android.view.Window.Callback
/* 11 */        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
/* 12 */            Window.Callback callback2 = this.f5426a;
                    if (callback2 != null) {
/* 13 */                return callback2.onWindowStartingActionMode(callback, i);
                    }
                    return null;
                }
            }
