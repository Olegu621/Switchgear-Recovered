            package com.supercell.titan;

            import android.text.InputFilter;
            import java.io.UnsupportedEncodingException;
            import p000.RunnableC2300vn;
            import p000.bp2;
            import p000.iu0;
            import p000.v53;
            import p000.w53;
            import p000.x53;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 16 */    public class VirtualKeyboardHandler {

                /* JADX INFO: renamed from: a */
                public static boolean f5975a;

                /* JADX INFO: renamed from: b */
                public static String f5976b;

                /* JADX INFO: renamed from: c */
                public static KeyboardDialog f5977c;

                /* JADX INFO: renamed from: d */
                public static final w53 f5978d = new w53();
                public static boolean visible;

                public static native String getFontPath(String str);

                public static float getKeyboardSize(int i) {
/* 1 */             return KeyboardDialog.getKeyboardSize(i);
                }

                public static void hideKeyboard() {
/* 4 */             if (f5977c != null) {
/* 16 */                GameApp.getInstance().runOnUiThread(new v53(false, true));
                    }
/* 19 */            visible = false;
                }

                public static native void inputEscPressed();

                public static native void inputKeyboardDismissed();

                public static native void inputOkPressed();

                public static native void inputSelectionChanged(int i, int i2);

                public static native void inputTextChanged(String str);

                public static native void keyboardSizeChanged(float f, float f2);

                public static void setMaxTextLength(int i, int i2) {
                    int i3;
                    bp2 bp2Var;
/* 1 */             char c = 1;
/* 7 */             int i4 = i2 == 0 ? 1 : 0;
/* 8 */             if (i >= 0) {
/* 10 */                i4++;
                    }
/* 12 */            InputFilter[] inputFilterArr = new InputFilter[i4];
/* 14 */            if (i >= 0) {
/* 21 */                inputFilterArr[0] = new x53(i);
                    } else {
/* 24 */                c = 0;
                    }
/* 25 */            if (i2 == 0) {
/* 29 */                inputFilterArr[c] = f5978d;
/* 31 */                i3 = -1845493754;
                    } else {
/* 35 */                i3 = 301989894;
                    }
/* 38 */            KeyboardDialog.f5811v = inputFilterArr;
/* 40 */            KeyboardDialog keyboardDialog = KeyboardDialog.f5808U;
/* 42 */            if (keyboardDialog != null && (bp2Var = keyboardDialog.f5816d) != null) {
/* 48 */                bp2Var.setFilters(inputFilterArr);
                    }
/* 51 */            KeyboardDialog.setImeOptions(i3);
                }

                public static void setText(byte[] bArr) {
                    try {
/* 5 */                 String str = new String(bArr, "UTF-8");
/* 10 */                if (KeyboardDialog.f5808U == null) {
/* 32 */                    KeyboardDialog.f5810i = str;
                        } else if (GameApp.getInstance() != null) {
/* 28 */                    GameApp.getInstance().runOnUiThread(new iu0(str, 3));
                        }
                    } catch (UnsupportedEncodingException e) {
/* 36 */                GameApp.debuggerException(e);
                    }
                }

                public static void showKeyboard(boolean z, String str) {
/* 1 */             GameApp gameApp = GameApp.getInstance();
/* 5 */             f5975a = z;
/* 7 */             f5976b = str;
/* 14 */            gameApp.runOnUiThread(new RunnableC2300vn(gameApp, z, str));
                }

                public static void updateUIFlags() {
/* 1 */             KeyboardDialog keyboardDialog = f5977c;
/* 3 */             if (keyboardDialog != null) {
/* 5 */                 keyboardDialog.updateUIFlags();
                    }
                }

/* 17 */        public static void showKeyboard() {
/* 18 */            showKeyboard(f5975a, f5976b);
                }
            }
