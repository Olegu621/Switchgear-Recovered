            package p000;

            import android.os.Message;
            import android.text.Editable;
            import android.text.method.PasswordTransformationMethod;
            import android.view.View;
            import android.widget.AutoCompleteTextView;
            import android.widget.EditText;
            import androidx.appcompat.widget.C0071k;
            import androidx.appcompat.widget.Toolbar;
            import com.google.android.material.datepicker.C0355l;
            import com.google.android.material.internal.NavigationMenuItemView;
            import com.google.android.material.textfield.TextInputLayout;
            import com.supercell.titan.KeyboardDialog;
            import com.supercell.titan.RunnableC0804k;
            import com.supercell.titan.ScInfoBox;
            
            /* JADX INFO: renamed from: u1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewOnClickListenerC2239u1 implements View.OnClickListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17327a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f17328b;

                public /* synthetic */ ViewOnClickListenerC2239u1(Object obj, int i) {
/* 1 */             this.f17327a = i;
/* 3 */             this.f17328b = obj;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Message message;
                    Message message2;
                    Message message3;
/* 1 */             int i = this.f17327a;
/* 4 */             Message messageObtain = null;
/* 4 */             messageObtain = null;
/* 5 */             boolean z = true;
/* 6 */             Object obj = this.f17328b;
                    switch (i) {
                        case 0:
/* 284 */                   ((AbstractC1778j2) obj).mo4210a();
                            break;
                        case 1:
/* 225 */                   C1917m7 c1917m7 = (C1917m7) obj;
/* 229 */                   if (view == c1917m7.f13621i && (message3 = c1917m7.f13623k) != null) {
/* 235 */                       messageObtain = Message.obtain(message3);
                            } else if (view == c1917m7.f13624l && (message2 = c1917m7.f13626n) != null) {
/* 248 */                       messageObtain = Message.obtain(message2);
                            } else if (view == c1917m7.f13627o && (message = c1917m7.f13629q) != null) {
/* 261 */                       messageObtain = Message.obtain(message);
                            }
/* 265 */                   if (messageObtain != null) {
/* 267 */                       messageObtain.sendToTarget();
                            }
/* 278 */                   c1917m7.f13611E.obtainMessage(1, c1917m7.f13614b).sendToTarget();
                            break;
                        case 2:
/* 202 */                   TextInputLayout textInputLayout = ((C2121qv) obj).f7137a;
/* 208 */                   Editable text = textInputLayout.getEditText().getText();
/* 212 */                   if (text != null) {
/* 214 */                       text.clear();
                            }
/* 221 */                   w11.m9394D(textInputLayout, textInputLayout.f5018P0, textInputLayout.f5020R0);
                            break;
                        case 3:
/* 186 */                   za0 za0Var = (za0) obj;
/* 196 */                   za0.m10293d(za0Var, (AutoCompleteTextView) za0Var.f7137a.getEditText());
                            break;
                        case 4:
/* 182 */                   ((KeyboardDialog) obj).f5813a.runOnView(new vc0(4));
                            break;
                        case 5:
/* 155 */                   C0355l c0355l = (C0355l) obj;
/* 157 */                   int i2 = c0355l.f4663f;
/* 160 */                   if (i2 == 2) {
/* 162 */                       c0355l.m2313i(1);
                            } else if (i2 == 1) {
/* 168 */                       c0355l.m2313i(2);
                            }
                            break;
                        case 6:
/* 135 */                   sg1 itemData = ((rl1) view).getItemData();
/* 139 */                   tl1 tl1Var = (tl1) obj;
/* 149 */                   if (!tl1Var.f17174p0.m5809q(itemData, tl1Var.f17173o0, 0)) {
/* 151 */                       itemData.setChecked(true);
                            }
                            break;
                        case 7:
/* 84 */                    NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
/* 86 */                    gm1 gm1Var = (gm1) obj;
/* 88 */                    yl1 yl1Var = gm1Var.f8727e;
/* 90 */                    if (yl1Var != null) {
/* 92 */                        yl1Var.f19679f = true;
                            }
/* 94 */                    sg1 itemData2 = navigationMenuItemView.getItemData();
/* 100 */                   boolean zM5809q = gm1Var.f8723c.m5809q(itemData2, gm1Var, 0);
/* 104 */                   if (itemData2 != null && itemData2.isCheckable() && zM5809q) {
/* 116 */                       gm1Var.f8727e.m10158i(itemData2);
                            } else {
/* 120 */                       z = false;
                            }
/* 121 */                   yl1 yl1Var2 = gm1Var.f8727e;
/* 123 */                   if (yl1Var2 != null) {
/* 125 */                       yl1Var2.f19679f = false;
                            }
/* 127 */                   if (z) {
/* 129 */                       gm1Var.mo419b(false);
                            }
                            break;
                        case 8:
/* 39 */                    or1 or1Var = (or1) obj;
/* 41 */                    TextInputLayout textInputLayout2 = or1Var.f7137a;
/* 43 */                    EditText editText = textInputLayout2.getEditText();
/* 47 */                    if (editText != null) {
/* 50 */                        int selectionEnd = editText.getSelectionEnd();
/* 58 */                        if (or1.m7238d(or1Var)) {
/* 60 */                            editText.setTransformationMethod(null);
                                } else {
/* 68 */                            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                }
/* 71 */                        if (selectionEnd >= 0) {
/* 73 */                            editText.setSelection(selectionEnd);
                                }
/* 80 */                        w11.m9394D(textInputLayout2, textInputLayout2.f5018P0, textInputLayout2.f5020R0);
                                break;
                            }
                            break;
                        case 9:
/* 28 */                    ScInfoBox scInfoBox = ((RunnableC0804k) obj).f6011b;
/* 32 */                    scInfoBox.f5912d.onClick(view);
/* 35 */                    scInfoBox.dismiss();
                            break;
                        default:
/* 13 */                    C0071k c0071k = ((Toolbar) obj).f685A0;
/* 18 */                    sg1 sg1Var = c0071k != null ? c0071k.f760b : null;
/* 20 */                    if (sg1Var != null) {
/* 22 */                        sg1Var.collapseActionView();
                            }
                            break;
                    }
                }
            }
