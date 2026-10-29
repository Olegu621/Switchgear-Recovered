            package com.supercell.titan;

            import android.app.Dialog;
            import android.content.res.Resources;
            import android.graphics.Point;
            import android.graphics.Rect;
            import android.graphics.Typeface;
            import android.graphics.drawable.ColorDrawable;
            import android.os.Build;
            import android.os.Bundle;
            import android.text.InputFilter;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import android.widget.Button;
            import android.widget.RelativeLayout;
            import java.util.concurrent.atomic.AtomicInteger;
            import okio.Segment;
            import p000.ViewOnClickListenerC2239u1;
            import p000.bp2;
            import p000.d41;
            import p000.e41;
            import p000.xo2;
            import p000.yo2;
            import p000.zo2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class KeyboardDialog extends Dialog {

                /* JADX INFO: renamed from: U */
                public static KeyboardDialog f5808U;

                /* JADX INFO: renamed from: V */
                public static final Rect f5809V = new Rect();

                /* JADX INFO: renamed from: i */
                public static String f5810i;

                /* JADX INFO: renamed from: v */
                public static InputFilter[] f5811v;

                /* JADX INFO: renamed from: w */
                public static int f5812w;

                /* JADX INFO: renamed from: a */
                public final GameApp f5813a;

                /* JADX INFO: renamed from: b */
                public final Button f5814b;

                /* JADX INFO: renamed from: c */
                public final e41 f5815c;

                /* JADX INFO: renamed from: d */
                public final bp2 f5816d;

                /* JADX INFO: renamed from: e */
                public Typeface f5817e;

                /* JADX INFO: renamed from: f */
                public final int f5818f;

                static {
/* 11 */            new AtomicInteger(1);
                }

                public KeyboardDialog(GameApp gameApp) {
/* 3 */             super(gameApp, R.style.KeyboardDialog);
/* 6 */             this.f5813a = gameApp;
/* 9 */             requestWindowFeature(1);
/* 14 */            bp2 bp2Var = new bp2(gameApp);
/* 22 */            bp2Var.setOnEditorActionListener(new yo2());
/* 30 */            bp2Var.setOnKeyListener(new xo2());
/* 38 */            bp2Var.addTextChangedListener(new zo2(bp2Var));
/* 41 */            this.f5816d = bp2Var;
/* 48 */            this.f5814b = new Button(gameApp);
/* 55 */            this.f5815c = new e41(gameApp);
/* 59 */            Point point = new Point();
/* 70 */            gameApp.getWindowManager().getDefaultDisplay().getSize(point);
/* 75 */            this.f5818f = point.x;
/* 77 */            f5808U = this;
                }

                /* JADX INFO: renamed from: a */
                public static int m2732a(int i) {
/* 6 */             GameApp.getInstance().getResources();
/* 23 */            return (int) ((i * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
                }

                public static float getKeyboardSize(int i) {
                    KeyboardDialog keyboardDialog;
                    bp2 bp2Var;
/* 4 */             if (!VirtualKeyboardHandler.visible || (keyboardDialog = f5808U) == null || (bp2Var = keyboardDialog.f5816d) == null) {
/* 3 */                 return 0.0f;
                    }
/* 15 */            Rect rect = f5809V;
/* 17 */            bp2Var.getWindowVisibleDisplayFrame(rect);
/* 34 */            float height = (i - (rect.bottom - rect.top)) + f5808U.f5816d.getHeight();
/* 38 */            if (height < 0.0f) {
/* 3 */                 return 0.0f;
                    }
/* 41 */            return height;
                }

                public static void setImeOptions(int i) {
                    bp2 bp2Var;
/* 1 */             f5812w = i;
/* 3 */             KeyboardDialog keyboardDialog = f5808U;
/* 5 */             if (keyboardDialog == null || (bp2Var = keyboardDialog.f5816d) == null) {
/* 14 */                return;
                    }
/* 11 */            bp2Var.setImeOptions(i);
                }

                @Override // android.app.Dialog
                public final void onCreate(Bundle bundle) {
/* 1 */             super.onCreate(bundle);
/* 4 */             bp2 bp2Var = this.f5816d;
/* 10 */            this.f5817e = bp2Var.getTypeface();
/* 13 */            bp2Var.setFocusable(true);
/* 19 */            bp2Var.setInputType(65537);
/* 22 */            bp2Var.setSingleLine();
/* 28 */            d41 d41Var = new d41(this, 0);
/* 31 */            e41 e41Var = this.f5815c;
/* 33 */            e41Var.setOnTouchListener(d41Var);
/* 36 */            int iGenerateViewId = View.generateViewId();
/* 40 */            Button button = this.f5814b;
/* 42 */            button.setId(iGenerateViewId);
/* 51 */            button.setOnClickListener(new ViewOnClickListenerC2239u1(this, 4));
/* 57 */            ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
/* 60 */            e41Var.addView(button);
/* 63 */            e41Var.addView(bp2Var);
/* 66 */            e41Var.setFitsSystemWindows(true);
/* 69 */            setContentView(e41Var, layoutParams);
/* 72 */            String str = f5810i;
/* 75 */            if (str != null) {
/* 77 */                bp2Var.setText(str);
/* 80 */                f5810i = null;
                    }
/* 82 */            InputFilter[] inputFilterArr = f5811v;
/* 84 */            if (inputFilterArr != null) {
/* 86 */                bp2Var.setFilters(inputFilterArr);
/* 89 */                f5811v = null;
                    }
/* 93 */            bp2Var.setImeOptions(f5812w);
/* 96 */            setCanceledOnTouchOutside(false);
/* 99 */            updateUIFlags();
                }

                @Override // android.app.Dialog
                public final void onStop() {
/* 1 */             super.onStop();
/* 5 */             f5810i = null;
/* 7 */             f5808U = null;
                }

                public void updateUIFlags() {
/* 1 */             Window window = getWindow();
/* 6 */             window.clearFlags(2);
/* 15 */            window.setBackgroundDrawable(new ColorDrawable(0));
/* 19 */            window.setLayout(-1, -1);
/* 24 */            window.addFlags(Integer.MIN_VALUE);
/* 31 */            if (Build.VERSION.SDK_INT < 30) {
/* 35 */                window.addFlags(134217728);
/* 40 */                window.addFlags(67108864);
                    }
/* 45 */            window.setFlags(Segment.SHARE_MINIMUM, Segment.SHARE_MINIMUM);
                }
            }
