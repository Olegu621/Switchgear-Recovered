            package xhpgvfjuz;

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
            
            /* JADX INFO: renamed from: xhpgvfjuz.U */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class WindowCallbackC2388U implements Window.Callback {

                /* JADX INFO: renamed from: a */
                private final Window.Callback f19130a;

                public WindowCallbackC2388U(Window.Callback callback) {
                    this.f19130a = callback;
                }

                /* JADX INFO: renamed from: a */
                public native ActionMode m9836a(ActionMode.Callback callback, int i, Window.Callback callback2);

                /* JADX INFO: renamed from: a */
                public native ActionMode m9837a(ActionMode.Callback callback, Window.Callback callback2);

                /* JADX INFO: renamed from: a */
                public native View m9838a(int i, Window.Callback callback);

                /* JADX INFO: renamed from: a */
                public native void m9839a(ActionMode actionMode, Window.Callback callback);

                /* JADX INFO: renamed from: a */
                public native void m9840a(Window.Callback callback);

                /* JADX INFO: renamed from: a */
                public native void m9841a(WindowManager.LayoutParams layoutParams, Window.Callback callback);

                /* JADX INFO: renamed from: a */
                public native void m9842a(boolean z, Window.Callback callback);

                /* JADX INFO: renamed from: a */
                public native boolean m9843a(int i, Menu menu, Window.Callback callback);

                /* JADX INFO: renamed from: a */
                public native boolean m9844a(int i, MenuItem menuItem, Window.Callback callback);

                /* JADX INFO: renamed from: a */
                public native boolean m9845a(int i, View view, Menu menu, Window.Callback callback);

                /* JADX INFO: renamed from: a */
                public native boolean m9846a(KeyEvent keyEvent, Window.Callback callback);

                /* JADX INFO: renamed from: a */
                public native boolean m9847a(MotionEvent motionEvent, Window.Callback callback);

                /* JADX INFO: renamed from: a */
                public native boolean m9848a(SearchEvent searchEvent, Window.Callback callback);

                /* JADX INFO: renamed from: a */
                public native boolean m9849a(AccessibilityEvent accessibilityEvent, Window.Callback callback);

                /* JADX INFO: renamed from: b */
                public native void m9850b(int i, Menu menu, Window.Callback callback);

                /* JADX INFO: renamed from: b */
                public native void m9851b(ActionMode actionMode, Window.Callback callback);

                /* JADX INFO: renamed from: b */
                public native boolean m9852b(KeyEvent keyEvent, Window.Callback callback);

                /* JADX INFO: renamed from: b */
                public native boolean m9853b(MotionEvent motionEvent, Window.Callback callback);

                /* JADX INFO: renamed from: b */
                public native boolean m9854b(Window.Callback callback);

                /* JADX INFO: renamed from: c */
                public native void m9855c(Window.Callback callback);

                /* JADX INFO: renamed from: c */
                public native boolean m9856c(int i, Menu menu, Window.Callback callback);

                /* JADX INFO: renamed from: c */
                public native boolean m9857c(MotionEvent motionEvent, Window.Callback callback);

                /* JADX INFO: renamed from: d */
                public native void m9858d(Window.Callback callback);

                @Override // android.view.Window.Callback
                public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
                    return m9857c(motionEvent, this.f19130a);
                }

                @Override // android.view.Window.Callback
                public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                    return m9846a(keyEvent, this.f19130a);
                }

                @Override // android.view.Window.Callback
                public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
                    return m9852b(keyEvent, this.f19130a);
                }

                @Override // android.view.Window.Callback
                public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
                    return m9849a(accessibilityEvent, this.f19130a);
                }

                @Override // android.view.Window.Callback
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    return m9853b(motionEvent, this.f19130a);
                }

                @Override // android.view.Window.Callback
                public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
                    return m9847a(motionEvent, this.f19130a);
                }

                @Override // android.view.Window.Callback
                public void onActionModeFinished(ActionMode actionMode) {
                    m9839a(actionMode, this.f19130a);
                }

                @Override // android.view.Window.Callback
                public void onActionModeStarted(ActionMode actionMode) {
                    m9851b(actionMode, this.f19130a);
                }

                @Override // android.view.Window.Callback
                public void onAttachedToWindow() {
                    m9840a(this.f19130a);
                }

                @Override // android.view.Window.Callback
                public void onContentChanged() {
                    m9855c(this.f19130a);
                }

                @Override // android.view.Window.Callback
                public boolean onCreatePanelMenu(int i, Menu menu) {
                    return m9843a(i, menu, this.f19130a);
                }

                @Override // android.view.Window.Callback
                public View onCreatePanelView(int i) {
                    return m9838a(i, this.f19130a);
                }

                @Override // android.view.Window.Callback
                public void onDetachedFromWindow() {
                    m9858d(this.f19130a);
                }

                @Override // android.view.Window.Callback
                public boolean onMenuItemSelected(int i, MenuItem menuItem) {
                    return m9844a(i, menuItem, this.f19130a);
                }

                @Override // android.view.Window.Callback
                public boolean onMenuOpened(int i, Menu menu) {
                    return m9856c(i, menu, this.f19130a);
                }

                @Override // android.view.Window.Callback
                public void onPanelClosed(int i, Menu menu) {
                    m9850b(i, menu, this.f19130a);
                }

                @Override // android.view.Window.Callback
                public boolean onPreparePanel(int i, View view, Menu menu) {
                    return m9845a(i, view, menu, this.f19130a);
                }

                @Override // android.view.Window.Callback
                public boolean onSearchRequested() {
                    return m9854b(this.f19130a);
                }

                @Override // android.view.Window.Callback
                public boolean onSearchRequested(SearchEvent searchEvent) {
                    return m9848a(searchEvent, this.f19130a);
                }

                @Override // android.view.Window.Callback
                public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
                    m9841a(layoutParams, this.f19130a);
                }

                @Override // android.view.Window.Callback
                public void onWindowFocusChanged(boolean z) {
                    m9842a(z, this.f19130a);
                }

                @Override // android.view.Window.Callback
                public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
                    return m9837a(callback, this.f19130a);
                }

                @Override // android.view.Window.Callback
                public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
                    return m9836a(callback, i, this.f19130a);
                }
            }
