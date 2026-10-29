            package com.quago.mobile.sdk;

            import android.view.KeyEvent;
            import android.view.Window;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.b0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0716b0 extends C0772z {
                public C0716b0(Window.Callback callback) {
/* 1 */             super(callback);
                }

                @Override // com.quago.mobile.sdk.C0772z, com.quago.mobile.sdk.AbstractWindowCallbackC0726e1, android.view.Window.Callback
                public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
/* 1 */             Window.Callback callback = this.f5426a;
/* 3 */             if (callback == null) {
/* 5 */                 return false;
                    }
/* 7 */             return callback.dispatchKeyEvent(keyEvent);
                }
            }
