            package com.supercell.titan;

            import android.view.View;
            import android.widget.LinearLayout;
            import p000.f72;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ScInfoBox {

                /* JADX INFO: renamed from: f */
                public static int f5908f = -1;

                /* JADX INFO: renamed from: a */
                public String f5909a;

                /* JADX INFO: renamed from: b */
                public String f5910b;

                /* JADX INFO: renamed from: c */
                public int f5911c;

                /* JADX INFO: renamed from: d */
                public View.OnClickListener f5912d;

                /* JADX INFO: renamed from: e */
                public LinearLayout f5913e;

                public static ScInfoBox make(String str, int i, String str2, View.OnClickListener onClickListener) {
/* 3 */             ScInfoBox scInfoBox = new ScInfoBox();
/* 9 */             if (f5908f == -1) {
/* 15 */                f5908f = View.generateViewId();
                    }
/* 18 */            scInfoBox.f5913e = null;
/* 20 */            scInfoBox.f5909a = str;
/* 22 */            scInfoBox.f5910b = str2;
/* 24 */            scInfoBox.f5911c = i;
/* 26 */            scInfoBox.f5912d = onClickListener;
/* 28 */            return scInfoBox;
                }

                public void dismiss() {
/* 11 */            GameApp.getInstance().runOnUiThread(new f72(this, 0));
                }

                public void show() {
/* 1 */             GameApp gameApp = GameApp.getInstance();
/* 10 */            gameApp.runOnUiThread(new RunnableC0804k(this, gameApp));
                }
            }
