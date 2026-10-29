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
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 1 */     public final class WindowCallbackC1200b implements Window.Callback {
                @Override // android.view.Window.Callback
                public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
/* 1 */             return false;
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
/* 1 */             return false;
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
/* 1 */             return false;
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
/* 1 */             return false;
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
/* 1 */             return false;
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
/* 1 */             return false;
                }

                @Override // android.view.Window.Callback
                public final void onActionModeFinished(ActionMode actionMode) {
                }

                @Override // android.view.Window.Callback
                public final void onActionModeStarted(ActionMode actionMode) {
                }

                @Override // android.view.Window.Callback
                public final void onAttachedToWindow() {
                }

                @Override // android.view.Window.Callback
                public final void onContentChanged() {
                }

                @Override // android.view.Window.Callback
                public final boolean onCreatePanelMenu(int i, Menu menu) {
/* 1 */             return false;
                }

                @Override // android.view.Window.Callback
                public final View onCreatePanelView(int i) {
/* 1 */             return null;
                }

                @Override // android.view.Window.Callback
                public final void onDetachedFromWindow() {
                }

                @Override // android.view.Window.Callback
                public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
/* 1 */             return false;
                }

                @Override // android.view.Window.Callback
                public final boolean onMenuOpened(int i, Menu menu) {
/* 1 */             return false;
                }

                @Override // android.view.Window.Callback
                public final void onPanelClosed(int i, Menu menu) {
                }

                @Override // android.view.Window.Callback
                public final boolean onPreparePanel(int i, View view, Menu menu) {
/* 1 */             return false;
                }

                @Override // android.view.Window.Callback
                public final boolean onSearchRequested() {
/* 1 */             return false;
                }

                @Override // android.view.Window.Callback
                public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
                }

                @Override // android.view.Window.Callback
                public final void onWindowFocusChanged(boolean z) {
                }

                @Override // android.view.Window.Callback
                public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
/* 1 */             return null;
                }

                @Override // android.view.Window.Callback
/* 2 */         public final boolean onSearchRequested(SearchEvent searchEvent) {
/* 3 */             return false;
                }

                @Override // android.view.Window.Callback
/* 2 */         public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
/* 3 */             return null;
                }
            }
