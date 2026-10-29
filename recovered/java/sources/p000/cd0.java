            package p000;

            import android.text.Editable;
            import android.text.method.KeyListener;
            import android.text.method.MetaKeyKeyListener;
            import android.view.KeyEvent;
            import android.view.View;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cd0 implements KeyListener {

                /* JADX INFO: renamed from: a */
                public final KeyListener f2844a;

                public cd0(KeyListener keyListener) {
/* 4 */             this.f2844a = keyListener;
                }

                @Override // android.text.method.KeyListener
                public final void clearMetaKeyState(View view, Editable editable, int i) {
/* 3 */             this.f2844a.clearMetaKeyState(view, editable, i);
                }

                @Override // android.text.method.KeyListener
                public final int getInputType() {
/* 3 */             return this.f2844a.getInputType();
                }

                @Override // android.text.method.KeyListener
                public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
                    boolean zM3360o;
/* 5 */             if (i != 67) {
/* 13 */                zM3360o = i != 112 ? false : C0875ec.m3360o(editable, keyEvent, true);
                    } else {
/* 18 */                zM3360o = C0875ec.m3360o(editable, keyEvent, false);
                    }
/* 22 */            if (!zM3360o) {
                        return this.f2844a.onKeyDown(view, editable, i, keyEvent);
                    }
/* 24 */            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
/* 3 */             return true;
                }

                @Override // android.text.method.KeyListener
                public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
/* 3 */             return this.f2844a.onKeyOther(view, editable, keyEvent);
                }

                @Override // android.text.method.KeyListener
                public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
/* 3 */             return this.f2844a.onKeyUp(view, editable, i, keyEvent);
                }
            }
