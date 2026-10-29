            package p000;

            import android.os.Build;
            import android.view.View;
            import android.view.inputmethod.InputMethodManager;
            import android.widget.Button;
            import android.widget.RelativeLayout;
            import com.google.android.material.behavior.SwipeDismissBehavior;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.KeyboardDialog;
            import com.supercell.titan.R;
            import com.supercell.titan.RunnableC0804k;
            import com.supercell.titan.VirtualKeyboardHandler;
            import java.util.WeakHashMap;
            import java.util.concurrent.Executor;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: vn */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final class RunnableC2300vn implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18252a;

                /* JADX INFO: renamed from: b */
                public boolean f18253b;

                /* JADX INFO: renamed from: c */
                public final Object f18254c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f18255d;

                public RunnableC2300vn(GameApp gameApp, boolean z, String str) {
/* 2 */             this.f18252a = 2;
/* 7 */             this.f18254c = gameApp;
/* 9 */             this.f18253b = z;
/* 11 */            this.f18255d = str;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // java.lang.Runnable
                public final void run() {
                    fs0 fs0Var;
/* 1 */             int i = this.f18252a;
/* 3 */             int i2 = 4;
/* 4 */             Object obj = this.f18255d;
/* 6 */             Object obj2 = this.f18254c;
                    switch (i) {
                        case 0:
/* 321 */                   ((Executor) obj2).execute(new RunnableC2166s2(this, i2));
                            break;
                        case 1:
/* 276 */                   View view = (View) obj2;
/* 278 */                   SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj;
/* 280 */                   j33 j33Var = swipeDismissBehavior.f4441a;
/* 282 */                   if (j33Var != null && j33Var.m5677h()) {
/* 290 */                       WeakHashMap weakHashMap = e33.f7494a;
/* 292 */                       view.postOnAnimation(this);
                                break;
                            } else if (this.f18253b && (fs0Var = swipeDismissBehavior.f4442b) != null) {
/* 310 */                       ((RunnableC0804k) fs0Var.f8339b).f6011b.dismiss();
                                break;
                            }
                            break;
                        default:
/* 11 */                    KeyboardDialog keyboardDialog = VirtualKeyboardHandler.f5977c;
/* 13 */                    if (keyboardDialog == null || !keyboardDialog.isShowing()) {
/* 34 */                        VirtualKeyboardHandler.f5977c = new KeyboardDialog((GameApp) obj2);
                            } else {
/* 23 */                        VirtualKeyboardHandler.f5977c.isShowing();
                            }
/* 36 */                    KeyboardDialog keyboardDialog2 = VirtualKeyboardHandler.f5977c;
/* 38 */                    boolean z = this.f18253b;
/* 40 */                    String str = (String) obj;
/* 42 */                    GameApp gameApp = keyboardDialog2.f5813a;
/* 44 */                    Button button = keyboardDialog2.f5814b;
/* 46 */                    bp2 bp2Var = keyboardDialog2.f5816d;
/* 48 */                    keyboardDialog2.updateUIFlags();
/* 51 */                    boolean z2 = false;
/* 52 */                    int i3 = 16;
/* 59 */                    if (z) {
/* 63 */                        bp2Var.setBackgroundResource(R.drawable.edit_text_style);
/* 68 */                        bp2Var.setTextAppearance(gameApp, R.style.largeEdittextText);
/* 73 */                        bp2Var.setWidth(keyboardDialog2.f5818f);
/* 78 */                        bp2Var.setTypeface(keyboardDialog2.f5817e);
/* 83 */                        int iM2732a = KeyboardDialog.m2732a(8);
/* 88 */                        int iM2732a2 = KeyboardDialog.m2732a(6);
/* 92 */                        bp2Var.setPadding(iM2732a, iM2732a2, iM2732a, iM2732a2);
/* 95 */                        if (str != null && str.trim().length() > 0) {
/* 112 */                           gameApp.runOnView(new dp0(keyboardDialog2, str, i3, z2));
                                }
/* 117 */                       int iM2732a3 = KeyboardDialog.m2732a(14);
/* 123 */                       button.setBackgroundResource(R.drawable.edit_text_style);
/* 128 */                       button.setText("✔");
/* 131 */                       button.setPadding(iM2732a3, 0, iM2732a3, 0);
/* 134 */                       int iM2732a4 = KeyboardDialog.m2732a(2);
/* 140 */                       RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
/* 143 */                       layoutParams.setMargins(iM2732a4, 0, 0, 0);
/* 149 */                       RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
/* 152 */                       layoutParams2.addRule(12);
/* 155 */                       layoutParams.addRule(12);
/* 160 */                       layoutParams.addRule(21);
/* 167 */                       layoutParams2.addRule(16, button.getId());
/* 170 */                       button.setLayoutParams(layoutParams);
/* 177 */                       button.setHeight(bp2Var.getHeight());
/* 180 */                       bp2Var.setLayoutParams(layoutParams2);
                            } else {
/* 185 */                       button.setBackgroundDrawable(null);
/* 190 */                       button.setText(HttpUrl.FRAGMENT_ENCODE_SET);
/* 193 */                       button.setHeight(1);
/* 196 */                       bp2Var.setBackgroundDrawable(null);
/* 201 */                       bp2Var.setTextAppearance(gameApp, R.style.invisibleText);
/* 204 */                       bp2Var.setWidth(1);
/* 209 */                       RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
/* 212 */                       layoutParams3.addRule(12);
/* 215 */                       bp2Var.setLayoutParams(layoutParams3);
                            }
/* 222 */                   keyboardDialog2.getWindow().setSoftInputMode(16);
/* 225 */                   keyboardDialog2.show();
/* 232 */                   keyboardDialog2.getWindow().setSoftInputMode(4);
/* 235 */                   bp2Var.requestFocus();
/* 244 */                   InputMethodManager inputMethodManager = (InputMethodManager) gameApp.getSystemService("input_method");
/* 250 */                   if (Build.VERSION.SDK_INT >= 33) {
/* 252 */                       inputMethodManager.showSoftInput(bp2Var, 0);
                            } else if (!inputMethodManager.showSoftInput(keyboardDialog2.f5815c, 0) && !inputMethodManager.showSoftInput(bp2Var, 2)) {
/* 270 */                       inputMethodManager.toggleSoftInput(0, 1);
                            }
/* 273 */                   VirtualKeyboardHandler.visible = true;
                            break;
                    }
                }

/* 13 */        public RunnableC2300vn(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
                    this.f18252a = 1;
                    this.f18255d = swipeDismissBehavior;
/* 15 */            this.f18254c = view;
/* 16 */            this.f18253b = z;
                }

/* 16 */        public RunnableC2300vn(C2337wn c2337wn, y92 y92Var) {
                    this.f18252a = 0;
                    this.f18255d = c2337wn;
/* 18 */            this.f18253b = false;
/* 19 */            this.f18254c = y92Var;
                }
            }
