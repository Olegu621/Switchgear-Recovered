            package com.android.billingclient.api;

            import android.app.PendingIntent;
            import android.content.IntentSender;
            import android.os.Bundle;
            import android.os.ResultReceiver;
            import androidx.activity.ComponentActivity;
            import androidx.activity.result.IntentSenderRequest;
            import com.google.android.gms.internal.play_billing.zze;
            import p000.AbstractC0903f3;
            import p000.C0866e3;
            import p000.ac3;
            import p000.fs0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ProxyBillingActivityV2 extends ComponentActivity {

                /* JADX INFO: renamed from: b */
                public AbstractC0903f3 f3031b;

                /* JADX INFO: renamed from: c */
                public AbstractC0903f3 f3032c;

                /* JADX INFO: renamed from: d */
                public ResultReceiver f3033d;

                /* JADX INFO: renamed from: e */
                public ResultReceiver f3034e;

                @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
                public final void onCreate(Bundle bundle) {
/* 1 */             super.onCreate(bundle);
/* 21 */            this.f3031b = registerForActivityResult(new C0866e3(2), new fs0(this, 28));
/* 38 */            this.f3032c = registerForActivityResult(new C0866e3(2), new ac3(this, 3));
/* 44 */            if (bundle != null) {
/* 169 */               if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
/* 177 */                   this.f3033d = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
/* 179 */                   return;
                        } else {
/* 184 */                   if (bundle.containsKey("external_payment_dialog_result_receiver")) {
/* 192 */                       this.f3034e = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
/* 194 */                       return;
                            }
/* 194 */                   return;
                        }
                    }
/* 50 */            zze.zzk("ProxyBillingActivityV2", "Launching Play Store billing dialog");
/* 65 */            if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
/* 75 */                PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
/* 87 */                this.f3033d = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
/* 89 */                AbstractC0903f3 abstractC0903f3 = this.f3031b;
/* 91 */                pendingIntent.getClass();
/* 94 */                IntentSender intentSender = pendingIntent.getIntentSender();
/* 98 */                intentSender.getClass();
/* 106 */               abstractC0903f3.mo3637a(new IntentSenderRequest(intentSender, null, 0, 0));
/* 109 */               return;
                    }
/* 120 */           if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
/* 130 */               PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
/* 142 */               this.f3034e = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
/* 144 */               AbstractC0903f3 abstractC0903f4 = this.f3032c;
/* 146 */               pendingIntent2.getClass();
/* 149 */               IntentSender intentSender2 = pendingIntent2.getIntentSender();
/* 153 */               intentSender2.getClass();
/* 161 */               abstractC0903f4.mo3637a(new IntentSenderRequest(intentSender2, null, 0, 0));
                    }
                }

                @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
                public final void onSaveInstanceState(Bundle bundle) {
/* 1 */             super.onSaveInstanceState(bundle);
/* 4 */             ResultReceiver resultReceiver = this.f3033d;
/* 6 */             if (resultReceiver != null) {
/* 10 */                bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
                    }
/* 13 */            ResultReceiver resultReceiver2 = this.f3034e;
/* 15 */            if (resultReceiver2 != null) {
/* 19 */                bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
                    }
                }
            }
