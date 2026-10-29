            package io.sentry.android.core.internal.gestures;

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
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.j */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public abstract class AbstractWindowCallbackC1208j implements Window.Callback {

                /* JADX INFO: renamed from: a */
                public final Window.Callback f10104a;

                public AbstractWindowCallbackC1208j(Window.Callback callback) {
/* 4 */             this.f10104a = callback;
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
/* 3 */             return this.f10104a.dispatchGenericMotionEvent(motionEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
/* 3 */             return this.f10104a.dispatchKeyEvent(keyEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
/* 3 */             return this.f10104a.dispatchKeyShortcutEvent(keyEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
/* 3 */             return this.f10104a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
                }

                @Override // android.view.Window.Callback
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
/* 3 */             return this.f10104a.dispatchTouchEvent(motionEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
/* 3 */             return this.f10104a.dispatchTrackballEvent(motionEvent);
                }

                @Override // android.view.Window.Callback
                public final void onActionModeFinished(ActionMode actionMode) {
/* 3 */             this.f10104a.onActionModeFinished(actionMode);
                }

                @Override // android.view.Window.Callback
                public final void onActionModeStarted(ActionMode actionMode) {
/* 3 */             this.f10104a.onActionModeStarted(actionMode);
                }

                @Override // android.view.Window.Callback
                public final void onAttachedToWindow() {
/* 3 */             this.f10104a.onAttachedToWindow();
                }

                @Override // android.view.Window.Callback
                public void onContentChanged() {
/* 3 */             this.f10104a.onContentChanged();
                }

                @Override // android.view.Window.Callback
                public final boolean onCreatePanelMenu(int i, Menu menu) {
/* 3 */             return this.f10104a.onCreatePanelMenu(i, menu);
                }

                @Override // android.view.Window.Callback
                public final View onCreatePanelView(int i) {
/* 3 */             return this.f10104a.onCreatePanelView(i);
                }

                @Override // android.view.Window.Callback
                public final void onDetachedFromWindow() {
/* 3 */             this.f10104a.onDetachedFromWindow();
                }

                @Override // android.view.Window.Callback
                public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
/* 3 */             return this.f10104a.onMenuItemSelected(i, menuItem);
                }

                @Override // android.view.Window.Callback
                public final boolean onMenuOpened(int i, Menu menu) {
/* 3 */             return this.f10104a.onMenuOpened(i, menu);
                }

                @Override // android.view.Window.Callback
                public final void onPanelClosed(int i, Menu menu) {
/* 3 */             this.f10104a.onPanelClosed(i, menu);
                }

                @Override // android.view.Window.Callback
                public final boolean onPreparePanel(int i, View view, Menu menu) {
/* 3 */             return this.f10104a.onPreparePanel(i, view, menu);
                }

                @Override // android.view.Window.Callback
                public final boolean onSearchRequested() {
/* 3 */             return this.f10104a.onSearchRequested();
                }

                @Override // android.view.Window.Callback
                public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
/* 3 */             this.f10104a.onWindowAttributesChanged(layoutParams);
                }

                @Override // android.view.Window.Callback
                public final void onWindowFocusChanged(boolean z) {
/* 3 */             this.f10104a.onWindowFocusChanged(z);
                }

                @Override // android.view.Window.Callback
                public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
/* 3 */             return this.f10104a.onWindowStartingActionMode(callback);
                }

                @Override // android.view.Window.Callback
/* 7 */         public final boolean onSearchRequested(SearchEvent searchEvent) {
/* 8 */             return this.f10104a.onSearchRequested(searchEvent);
                }

                @Override // android.view.Window.Callback
/* 7 */         public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
/* 8 */             return this.f10104a.onWindowStartingActionMode(callback, i);
                }
            }
