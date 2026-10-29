            package p000;

            import android.text.Editable;
            import com.supercell.titan.KeyboardDialog;
            import com.supercell.titan.VirtualKeyboardHandler;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class iu0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11928a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f11929b;

                public /* synthetic */ iu0(String str, int i) {
/* 1 */             this.f11928a = i;
/* 3 */             this.f11929b = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bp2 bp2Var;
/* 1 */             int i = this.f11928a;
/* 3 */             int i2 = 0;
/* 4 */             int i3 = 1;
/* 10 */            String str = this.f11929b;
                    switch (i) {
                        case 0:
                            try {
/* 145 */                       if (rs0.m8239b()) {
/* 166 */                           xe2.m9775m("Helpshift", "Registering push token, token is empty?- " + b40.m1232p(str), null);
/* 169 */                           rs0 rs0Var = rs0.f16254y;
/* 180 */                           rs0Var.f16271p.m8116u(new cp0(13, rs0Var, str));
                                }
                            } catch (Exception e) {
/* 187 */                       AbstractC1245n0.m4877e("HelpshiftTitan", "HelpshiftTitan.setPushNotificationToken", e);
/* 190 */                       return;
                            }
                            break;
                        case 1:
                            try {
/* 94 */                        if (rs0.m8239b()) {
/* 111 */                           xe2.m9775m("Helpshift", "leaveBreadCrumb() is called with action " + str, null);
/* 118 */                           if (!b40.m1232p(str)) {
/* 121 */                               rs0 rs0Var2 = rs0.f16254y;
/* 130 */                               rs0Var2.f16271p.m8116u(new du0(rs0Var2, str, i2));
                                    }
                                }
                            } catch (Exception e2) {
/* 137 */                       AbstractC1245n0.m4877e("HelpshiftTitan", "HelpshiftTitan.leaveBreadcrumb", e2);
/* 140 */                       return;
                            }
                            break;
                        case 2:
                            try {
/* 50 */                        if (rs0.m8239b()) {
/* 67 */                            xe2.m9775m("Helpshift", "setLanguage() is called for language - " + str, null);
/* 70 */                            rs0 rs0Var3 = rs0.f16254y;
/* 79 */                            rs0Var3.f16271p.m8116u(new du0(rs0Var3, str, i3));
                                }
                            } catch (Exception e3) {
/* 86 */                        AbstractC1245n0.m4877e("HelpshiftTitan", "HelpshiftTitan.setSDKLanguage", e3);
/* 89 */                        return;
                            }
                            break;
                        case 3:
/* 19 */                    KeyboardDialog keyboardDialog = KeyboardDialog.f5808U;
/* 21 */                    if (keyboardDialog == null || (bp2Var = keyboardDialog.f5816d) == null) {
/* 43 */                        KeyboardDialog.f5810i = str;
                            } else {
/* 27 */                        bp2Var.f2562a = true;
/* 29 */                        Editable editableText = bp2Var.getEditableText();
/* 37 */                        editableText.replace(0, editableText.length(), str);
/* 40 */                        bp2Var.f2562a = false;
                            }
                            break;
                        default:
/* 15 */                    VirtualKeyboardHandler.inputTextChanged(str);
                            break;
                    }
                }
            }
