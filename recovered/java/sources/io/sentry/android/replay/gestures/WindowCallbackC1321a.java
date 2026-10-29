            package io.sentry.android.replay.gestures;

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
            import io.sentry.EnumC1553m5;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.replay.C1333r;
            import io.sentry.android.replay.EnumC1334s;
            import io.sentry.android.replay.ReplayIntegration;
            import io.sentry.android.replay.capture.AbstractC1301c;
            import java.util.List;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.gestures.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class WindowCallbackC1321a implements Window.Callback {

                /* JADX INFO: renamed from: a */
                public final Window.Callback f10534a;

                /* JADX INFO: renamed from: b */
                public final SentryAndroidOptions f10535b;

                /* JADX INFO: renamed from: c */
                public volatile ReplayIntegration f10536c;

                public WindowCallbackC1321a(SentryAndroidOptions sentryAndroidOptions, ReplayIntegration replayIntegration, Window.Callback callback) {
/* 4 */             this.f10534a = callback;
/* 6 */             this.f10535b = sentryAndroidOptions;
/* 8 */             this.f10536c = replayIntegration;
                }

                /* JADX INFO: renamed from: a */
                public final boolean m5009a(MotionEvent motionEvent) {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.dispatchTouchEvent(motionEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.dispatchGenericMotionEvent(motionEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.dispatchKeyEvent(keyEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.dispatchKeyShortcutEvent(keyEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    AbstractC1301c abstractC1301c;
/* 1 */             if (motionEvent != null) {
/* 3 */                 MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
/* 7 */                 motionEventObtainNoHistory.getClass();
                        try {
/* 10 */                    ReplayIntegration replayIntegration = this.f10536c;
/* 12 */                    if (replayIntegration != null && replayIntegration.f10411W.get()) {
/* 22 */                        C1333r c1333r = replayIntegration.f10420c0;
/* 28 */                        if ((c1333r.f10572a == EnumC1334s.STARTED || c1333r.f10572a == EnumC1334s.RESUMED) && (abstractC1301c = replayIntegration.f10413Y) != null) {
/* 40 */                            abstractC1301c.mo4992i(motionEventObtainNoHistory);
                                }
                            }
                        } catch (Throwable th) {
                            try {
/* 58 */                        this.f10535b.getLogger().mo4671d(EnumC1553m5.ERROR, "Error dispatching touch event", th);
                            } finally {
/* 63 */                        motionEventObtainNoHistory.recycle();
                            }
                        }
                    }
/* 67 */            return m5009a(motionEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.dispatchTrackballEvent(motionEvent);
                }

                @Override // android.view.Window.Callback
                public final void onActionModeFinished(ActionMode actionMode) {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return;
                    }
/* 6 */             callback.onActionModeFinished(actionMode);
                }

                @Override // android.view.Window.Callback
                public final void onActionModeStarted(ActionMode actionMode) {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return;
                    }
/* 6 */             callback.onActionModeStarted(actionMode);
                }

                @Override // android.view.Window.Callback
                public final void onAttachedToWindow() {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return;
                    }
/* 6 */             callback.onAttachedToWindow();
                }

                @Override // android.view.Window.Callback
                public final void onContentChanged() {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return;
                    }
/* 6 */             callback.onContentChanged();
                }

                @Override // android.view.Window.Callback
                public final boolean onCreatePanelMenu(int i, Menu menu) {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.onCreatePanelMenu(i, menu);
                }

                @Override // android.view.Window.Callback
                public final View onCreatePanelView(int i) {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return null;
                    }
/* 7 */             return callback.onCreatePanelView(i);
                }

                @Override // android.view.Window.Callback
                public final void onDetachedFromWindow() {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return;
                    }
/* 6 */             callback.onDetachedFromWindow();
                }

                @Override // android.view.Window.Callback
                public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.onMenuItemSelected(i, menuItem);
                }

                @Override // android.view.Window.Callback
                public final boolean onMenuOpened(int i, Menu menu) {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.onMenuOpened(i, menu);
                }

                @Override // android.view.Window.Callback
                public final void onPanelClosed(int i, Menu menu) {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return;
                    }
/* 6 */             callback.onPanelClosed(i, menu);
                }

                @Override // android.view.Window.Callback
                public final void onPointerCaptureChanged(boolean z) {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return;
                    }
/* 1 */             callback.onPointerCaptureChanged(z);
                }

                @Override // android.view.Window.Callback
                public final boolean onPreparePanel(int i, View view, Menu menu) {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.onPreparePanel(i, view, menu);
                }

                @Override // android.view.Window.Callback
                public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return;
                    }
/* 6 */             callback.onProvideKeyboardShortcuts(list, menu, i);
                }

                @Override // android.view.Window.Callback
                public final boolean onSearchRequested() {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.onSearchRequested();
                }

                @Override // android.view.Window.Callback
                public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return;
                    }
/* 6 */             callback.onWindowAttributesChanged(layoutParams);
                }

                @Override // android.view.Window.Callback
                public final void onWindowFocusChanged(boolean z) {
/* 1 */             Window.Callback callback = this.f10534a;
/* 3 */             if (callback == null) {
/* 5 */                 return;
                    }
/* 6 */             callback.onWindowFocusChanged(z);
                }

                @Override // android.view.Window.Callback
                public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
/* 1 */             Window.Callback callback2 = this.f10534a;
/* 3 */             if (callback2 == null) {
/* 5 */                 return null;
                    }
/* 7 */             return callback2.onWindowStartingActionMode(callback);
                }

                @Override // android.view.Window.Callback
/* 11 */        public final boolean onSearchRequested(SearchEvent searchEvent) {
/* 12 */            Window.Callback callback = this.f10534a;
                    if (callback == null) {
                        return false;
                    }
/* 13 */            return callback.onSearchRequested(searchEvent);
                }

                @Override // android.view.Window.Callback
/* 11 */        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
/* 12 */            Window.Callback callback2 = this.f10534a;
                    if (callback2 == null) {
                        return null;
                    }
/* 13 */            return callback2.onWindowStartingActionMode(callback, i);
                }
            }
