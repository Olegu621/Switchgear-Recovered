            package p000;

            import android.text.Editable;
            import android.widget.EditText;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.VirtualKeyboardHandler;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bp2 extends EditText {

                /* JADX INFO: renamed from: b */
                public static final vc0 f2561b = new vc0(5);

                /* JADX INFO: renamed from: a */
                public boolean f2562a;

                @Override // android.widget.TextView
                public final void onSelectionChanged(int i, int i2) {
                    int i3;
/* 1 */             super.onSelectionChanged(i, i2);
/* 4 */             GameApp gameApp = GameApp.getInstance();
/* 8 */             Editable text = getText();
/* 12 */            int iCharCount = 0;
/* 17 */            String string = text.subSequence(0, i).toString();
/* 21 */            int length = string.length();
/* 25 */            int iCharCount2 = 0;
/* 26 */            int i4 = 0;
/* 27 */            while (iCharCount2 < length) {
/* 37 */                iCharCount2 += Character.charCount(string.codePointAt(iCharCount2));
/* 38 */                i4++;
                    }
/* 41 */            if (i2 == i) {
/* 43 */                i3 = i4;
                    } else {
/* 49 */                String string2 = text.subSequence(0, i2).toString();
/* 53 */                int length2 = string2.length();
/* 57 */                i3 = 0;
/* 58 */                while (iCharCount < length2) {
/* 68 */                    iCharCount += Character.charCount(string2.codePointAt(iCharCount));
/* 69 */                    i3++;
                        }
                    }
/* 77 */            gameApp.runOnView(new ap2(i4, i3));
                }

                @Override // android.widget.TextView, android.view.View
                public final void onWindowFocusChanged(boolean z) {
/* 1 */             super.onWindowFocusChanged(z);
/* 4 */             if (z) {
/* 6 */                 boolean z2 = VirtualKeyboardHandler.visible;
/* 12 */                if (hasFocus() && z2) {
/* 16 */                    VirtualKeyboardHandler.showKeyboard();
                        }
/* 19 */                GameApp gameApp = GameApp.getInstance();
/* 23 */                if (gameApp != null) {
/* 25 */                    gameApp.handleFocusGained();
/* 28 */                    VirtualKeyboardHandler.updateUIFlags();
                        }
                    }
                }
            }
