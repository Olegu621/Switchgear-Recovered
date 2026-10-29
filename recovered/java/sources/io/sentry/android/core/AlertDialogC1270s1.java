            package io.sentry.android.core;

            import android.app.Activity;
            import android.app.AlertDialog;
            import android.app.Application;
            import android.content.Context;
            import android.content.ContextWrapper;
            import android.content.DialogInterface;
            import android.os.Bundle;
            import android.view.View;
            import android.view.Window;
            import android.widget.Button;
            import android.widget.EditText;
            import android.widget.ImageView;
            import android.widget.TextView;
            import android.widget.Toast;
            import io.sentry.AbstractC1552m4;
            import io.sentry.C1470h5;
            import io.sentry.C1529k5;
            import io.sentry.C1554m6;
            import io.sentry.EnumC1553m5;
            import io.sentry.InterfaceC1389c1;
            import io.sentry.protocol.C1608j0;
            import io.sentry.protocol.C1609k;
            import io.sentry.protocol.C1626w;
            import java.lang.ref.WeakReference;
            import p000.C2076pn;
            import p000.h51;
            
            /* JADX INFO: renamed from: io.sentry.android.core.s1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AlertDialogC1270s1 extends AlertDialog {

                /* JADX INFO: renamed from: a */
                public boolean f10303a;

                /* JADX INFO: renamed from: b */
                public C1626w f10304b;

                /* JADX INFO: renamed from: c */
                public DialogInterface.OnDismissListener f10305c;

                /* JADX INFO: renamed from: d */
                public final C1470h5 f10306d;

                /* JADX INFO: renamed from: e */
                public C1249o1 f10307e;

                /* JADX INFO: renamed from: f */
                public C1267r1 f10308f;

                public AlertDialogC1270s1(Context context) {
                    Activity activity;
/* 2 */             super(context, 0);
/* 5 */             this.f10303a = false;
/* 17 */            C1470h5 feedbackOptions = AbstractC1552m4.m5357b().mo5092l().getFeedbackOptions();
/* 21 */            C1470h5 c1470h5 = new C1470h5();
/* 24 */            c1470h5.f10977a = false;
/* 27 */            c1470h5.f10978b = true;
/* 29 */            c1470h5.f10979c = false;
/* 31 */            c1470h5.f10980d = true;
/* 33 */            c1470h5.f10981e = true;
/* 35 */            c1470h5.f10982f = true;
/* 37 */            c1470h5.f10983g = false;
/* 41 */            c1470h5.f10977a = feedbackOptions.f10977a;
/* 45 */            c1470h5.f10978b = feedbackOptions.f10978b;
/* 49 */            c1470h5.f10979c = feedbackOptions.f10979c;
/* 53 */            c1470h5.f10980d = feedbackOptions.f10980d;
/* 57 */            c1470h5.f10981e = feedbackOptions.f10981e;
/* 61 */            c1470h5.f10982f = feedbackOptions.f10982f;
/* 65 */            c1470h5.f10983g = feedbackOptions.f10983g;
/* 69 */            c1470h5.f10984h = feedbackOptions.f10984h;
/* 71 */            this.f10306d = c1470h5;
/* 79 */            C1529k5.m5336d().m5337a("UserFeedbackWidget");
/* 90 */            C1470h5 feedbackOptions2 = AbstractC1552m4.m5357b().mo5092l().getFeedbackOptions();
/* 96 */            if (!c1470h5.f10983g || feedbackOptions2.f10983g) {
/* 175 */               return;
                    }
                    while (true) {
/* 105 */               if (!(context instanceof ContextWrapper)) {
/* 121 */                   activity = null;
                            break;
                        } else {
/* 109 */                   if (context instanceof Activity) {
/* 111 */                       activity = (Activity) context;
                                break;
                            }
/* 116 */                   context = ((ContextWrapper) context).getBaseContext();
                        }
                    }
/* 122 */           if (activity == null) {
/* 175 */               return;
                    }
/* 142 */           this.f10307e = new C1249o1(AbstractC1552m4.m5357b().mo5092l().getLogger());
/* 146 */           WeakReference weakReference = new WeakReference(activity);
/* 158 */           this.f10307e.m4898b(activity, new C2076pn(23, this, weakReference));
/* 161 */           Application application = activity.getApplication();
/* 167 */           C1267r1 c1267r1 = new C1267r1(this, weakReference);
/* 170 */           this.f10308f = c1267r1;
/* 172 */           application.registerActivityLifecycleCallbacks(c1267r1);
                }

                @Override // android.app.AlertDialog, android.app.Dialog
                public final void onCreate(Bundle bundle) {
                    C1608j0 c1608j0Mo4687K;
/* 1 */             super.onCreate(bundle);
/* 6 */             setContentView(R$layout.sentry_dialog_user_feedback);
/* 9 */             Window window = getWindow();
/* 13 */            if (window != null) {
/* 17 */                window.clearFlags(131072);
                    }
/* 22 */            setCancelable(this.f10303a);
/* 31 */            TextView textView = (TextView) findViewById(R$id.sentry_dialog_user_feedback_title);
/* 39 */            ImageView imageView = (ImageView) findViewById(R$id.sentry_dialog_user_feedback_logo);
/* 48 */            final TextView textView2 = (TextView) findViewById(R$id.sentry_dialog_user_feedback_txt_name);
/* 57 */            final EditText editText = (EditText) findViewById(R$id.sentry_dialog_user_feedback_edt_name);
/* 66 */            final TextView textView3 = (TextView) findViewById(R$id.sentry_dialog_user_feedback_txt_email);
/* 75 */            final EditText editText2 = (EditText) findViewById(R$id.sentry_dialog_user_feedback_edt_email);
/* 84 */            final TextView textView4 = (TextView) findViewById(R$id.sentry_dialog_user_feedback_txt_description);
/* 93 */            final EditText editText3 = (EditText) findViewById(R$id.sentry_dialog_user_feedback_edt_description);
/* 101 */           Button button = (Button) findViewById(R$id.sentry_dialog_user_feedback_btn_send);
/* 110 */           Button button2 = (Button) findViewById(R$id.sentry_dialog_user_feedback_btn_cancel);
/* 112 */           final C1470h5 c1470h5 = this.f10306d;
/* 119 */           if (c1470h5.f10982f) {
/* 121 */               imageView.setVisibility(0);
                    } else {
/* 125 */               imageView.setVisibility(8);
                    }
/* 132 */           if (c1470h5.f10978b || c1470h5.f10977a) {
/* 145 */               textView2.setVisibility(0);
/* 148 */               editText.setVisibility(0);
/* 153 */               textView2.setText("Name");
/* 158 */               editText.setHint("Your Name");
/* 163 */               if (c1470h5.f10977a) {
/* 165 */                   textView2.append(" (Required)");
                        }
                    } else {
/* 138 */               textView2.setVisibility(8);
/* 141 */               editText.setVisibility(8);
                    }
/* 170 */           if (c1470h5.f10980d || c1470h5.f10979c) {
/* 183 */               textView3.setVisibility(0);
/* 186 */               editText2.setVisibility(0);
/* 191 */               textView3.setText("Email");
/* 196 */               editText2.setHint("your.email@example.org");
/* 201 */               if (c1470h5.f10979c) {
/* 203 */                   textView3.append(" (Required)");
                        }
                    } else {
/* 176 */               textView3.setVisibility(8);
/* 179 */               editText2.setVisibility(8);
                    }
/* 208 */           if (c1470h5.f10981e && (c1608j0Mo4687K = AbstractC1552m4.m5357b().mo5102v().mo4687K()) != null) {
/* 226 */               editText.setText(c1608j0Mo4687K.f11363c);
/* 231 */               editText2.setText(c1608j0Mo4687K.f11361a);
                    }
/* 236 */           textView4.setText("Description");
/* 239 */           textView4.append(" (Required)");
/* 244 */           editText3.setHint("What's the bug? What did you expect?");
/* 249 */           textView.setText("Report a Bug");
/* 254 */           button.setText("Send Bug Report");
/* 263 */           button.setOnClickListener(new View.OnClickListener() { // from class: io.sentry.android.core.p1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
/* 1 */                     EditText editText4 = editText;
/* 11 */                    String strTrim = editText4.getText().toString().trim();
/* 15 */                    EditText editText5 = editText2;
/* 25 */                    String strTrim2 = editText5.getText().toString().trim();
/* 29 */                    EditText editText6 = editText3;
/* 39 */                    String strTrim3 = editText6.getText().toString().trim();
/* 43 */                    boolean zIsEmpty = strTrim.isEmpty();
/* 47 */                    C1470h5 c1470h6 = c1470h5;
/* 49 */                    if (zIsEmpty && c1470h6.f10977a) {
/* 61 */                        editText4.setError(textView2.getText());
/* 64 */                        return;
                            }
/* 69 */                    if (strTrim2.isEmpty() && c1470h6.f10979c) {
/* 81 */                        editText5.setError(textView3.getText());
/* 84 */                        return;
                            }
/* 89 */                    if (strTrim3.isEmpty()) {
/* 97 */                        editText6.setError(textView4.getText());
/* 100 */                       return;
                            }
/* 103 */                   C1609k c1609k = new C1609k(strTrim3);
/* 106 */                   c1609k.f11371c = strTrim;
/* 108 */                   c1609k.f11370b = strTrim2;
/* 110 */                   AlertDialogC1270s1 alertDialogC1270s1 = this.f10236a;
/* 112 */                   C1626w c1626w = alertDialogC1270s1.f10304b;
/* 114 */                   if (c1626w != null) {
/* 116 */                       c1609k.f11373e = c1626w;
                            }
/* 136 */                   if (AbstractC1552m4.m5357b().mo5103w().mo5210a(c1609k).equals(C1626w.f11478b)) {
/* 156 */                       c1470h6.getClass();
                            } else {
/* 138 */                       Context context = alertDialogC1270s1.getContext();
/* 142 */                       c1470h6.getClass();
/* 152 */                       Toast.makeText(context, "Thank you for your report!", 0).show();
                            }
/* 159 */                   alertDialogC1270s1.cancel();
                        }
                    });
/* 268 */           button2.setText("Cancel");
/* 277 */           button2.setOnClickListener(new h51(this, 7));
/* 282 */           setOnDismissListener(this.f10305c);
                }

                @Override // android.app.Dialog
                public final void onStart() {
/* 1 */             super.onStart();
/* 10 */            EditText editText = (EditText) findViewById(R$id.sentry_dialog_user_feedback_edt_description);
/* 16 */            editText.getText().clear();
/* 20 */            editText.setError(null);
/* 27 */            C1554m6 c1554m6Mo5092l = AbstractC1552m4.m5357b().mo5092l();
/* 35 */            c1554m6Mo5092l.getFeedbackOptions().getClass();
/* 44 */            c1554m6Mo5092l.getReplayController().mo4971c(Boolean.FALSE);
/* 55 */            this.f10304b = c1554m6Mo5092l.getReplayController().mo4974i();
                }

                @Override // android.app.Dialog
                public final void setCancelable(boolean z) {
/* 1 */             super.setCancelable(z);
/* 4 */             this.f10303a = z;
                }

                @Override // android.app.Dialog
                public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
/* 1 */             this.f10305c = onDismissListener;
/* 15 */            final Runnable runnable = AbstractC1552m4.m5357b().mo5092l().getFeedbackOptions().f10984h;
/* 17 */            if (runnable != null) {
/* 24 */                super.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: io.sentry.android.core.q1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
/* 3 */                         runnable.run();
/* 7 */                         AlertDialogC1270s1 alertDialogC1270s1 = this.f10291a;
/* 9 */                         alertDialogC1270s1.f10304b = null;
/* 11 */                        DialogInterface.OnDismissListener onDismissListener2 = alertDialogC1270s1.f10305c;
/* 13 */                        if (onDismissListener2 != null) {
/* 15 */                            onDismissListener2.onDismiss(dialogInterface);
                                }
                            }
                        });
                    } else {
/* 30 */                super.setOnDismissListener(this.f10305c);
                    }
                }

                @Override // android.app.Dialog
                public final void show() {
/* 1 */             InterfaceC1389c1 interfaceC1389c1M5357b = AbstractC1552m4.m5357b();
/* 5 */             C1554m6 c1554m6Mo5092l = interfaceC1389c1M5357b.mo5092l();
/* 13 */            if (interfaceC1389c1M5357b.isEnabled() && c1554m6Mo5092l.isEnabled()) {
/* 22 */                super.show();
                    } else {
/* 37 */                c1554m6Mo5092l.getLogger().mo4672k(EnumC1553m5.WARNING, "Sentry is disabled. Feedback dialog won't be shown.", new Object[0]);
                    }
                }
            }
