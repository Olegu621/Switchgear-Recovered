            package com.quago.mobile.sdk;

            import android.view.KeyEvent;
            import android.view.MotionEvent;
            import android.view.Window;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.z */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class C0772z extends AbstractWindowCallbackC0726e1 {
                public C0772z(Window.Callback callback) {
/* 1 */             super(callback);
                }

                @Override // com.quago.mobile.sdk.AbstractWindowCallbackC0726e1, android.view.Window.Callback
                public boolean dispatchKeyEvent(KeyEvent keyEvent) {
/* 1 */             C0752o0 c0752o0 = Quago.quagoManager;
/* 5 */             if (c0752o0.f5580a) {
/* 10 */                c0752o0.f5597r.m2601a(keyEvent);
                    }
/* 13 */            Window.Callback callback = this.f5426a;
/* 15 */            if (callback == null) {
/* 17 */                return false;
                    }
/* 19 */            return callback.dispatchKeyEvent(keyEvent);
                }

                @Override // com.quago.mobile.sdk.AbstractWindowCallbackC0726e1, android.view.Window.Callback
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
/* 1 */             C0752o0 c0752o0 = Quago.quagoManager;
/* 5 */             if (c0752o0.f5580a && motionEvent != null) {
/* 13 */                c0752o0.f5597r.m2602a(motionEvent);
/* 22 */                if (c0752o0.f5582c == 0) {
/* 24 */                    long eventTime = motionEvent.getEventTime();
/* 28 */                    c0752o0.f5582c = eventTime;
/* 36 */                    c0752o0.f5581b = c0752o0.f5575C + (eventTime - c0752o0.f5574B);
                        }
                    }
/* 38 */            Window.Callback callback = this.f5426a;
/* 40 */            if (callback == null) {
/* 42 */                return false;
                    }
/* 44 */            return callback.dispatchTouchEvent(motionEvent);
                }
            }
