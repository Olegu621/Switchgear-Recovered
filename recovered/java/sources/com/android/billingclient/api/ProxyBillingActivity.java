            package com.android.billingclient.api;

            import android.app.Activity;
            import android.app.PendingIntent;
            import android.content.Intent;
            import android.content.IntentSender;
            import android.os.Bundle;
            import android.os.ResultReceiver;
            import com.google.android.gms.internal.play_billing.zze;
            import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
            import p000.C1795jj;
            import p000.C1833kj;
            import p000.if3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ProxyBillingActivity extends Activity {

                /* JADX INFO: renamed from: a */
                public ResultReceiver f3026a;

                /* JADX INFO: renamed from: b */
                public ResultReceiver f3027b;

                /* JADX INFO: renamed from: c */
                public boolean f3028c;

                /* JADX INFO: renamed from: d */
                public boolean f3029d;

                /* JADX INFO: renamed from: e */
                public int f3030e;

                /* JADX INFO: renamed from: a */
                public final Intent m1742a() {
/* 5 */             Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
/* 16 */            intent.setPackage(getApplicationContext().getPackageName());
/* 19 */            return intent;
                }

                @Override // android.app.Activity
                public final void onActivityResult(int i, int i2, Intent intent) {
                    Intent intentM1742a;
/* 1 */             super.onActivityResult(i, i2, intent);
/* 12 */            if (i == 100 || i == 110) {
/* 69 */                int i3 = zze.zzf(intent, "ProxyBillingActivity").f12818a;
/* 72 */                if (i2 != -1) {
/* 102 */                   zze.zzl("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                        } else if (i3 != 0) {
/* 76 */                    i2 = -1;
/* 102 */                   zze.zzl("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                        } else {
/* 78 */                    i3 = 0;
                        }
/* 105 */               ResultReceiver resultReceiver = this.f3026a;
/* 107 */               if (resultReceiver != null) {
/* 116 */                   resultReceiver.send(i3, intent != null ? intent.getExtras() : null);
                        } else {
/* 121 */                   if (intent == null) {
/* 240 */                       intentM1742a = m1742a();
                            } else if (intent.getExtras() != null) {
/* 139 */                       String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
/* 143 */                       if (string != null) {
/* 149 */                           intentM1742a = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
/* 160 */                           intentM1742a.setPackage(getApplicationContext().getPackageName());
/* 163 */                           intentM1742a.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
/* 166 */                           intentM1742a.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                                } else {
/* 170 */                           Intent intentM1742a2 = m1742a();
/* 178 */                           intentM1742a2.putExtras(intent.getExtras());
/* 181 */                           intentM1742a2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
/* 184 */                           intentM1742a = intentM1742a2;
                                }
                            } else {
/* 186 */                       intentM1742a = m1742a();
/* 192 */                       zze.zzl("ProxyBillingActivity", "Got null bundle!");
/* 198 */                       intentM1742a.putExtra("RESPONSE_CODE", 6);
/* 205 */                       intentM1742a.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
/* 208 */                       C1795jj c1795jjM6120a = C1833kj.m6120a();
/* 212 */                       c1795jjM6120a.f12324a = 6;
/* 214 */                       c1795jjM6120a.f12325b = "An internal error occurred.";
/* 233 */                       intentM1742a.putExtra("FAILURE_LOGGING_PAYLOAD", if3.m4524b(22, 2, c1795jjM6120a.m5841a()).zzh());
/* 236 */                       intentM1742a.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                            }
/* 244 */                   if (i == 110) {
/* 249 */                       intentM1742a.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                            }
/* 252 */                   sendBroadcast(intentM1742a);
                        }
                    } else if (i == 101) {
/* 21 */                int iZza = zze.zza(intent, "ProxyBillingActivity");
/* 25 */                ResultReceiver resultReceiver2 = this.f3027b;
/* 27 */                if (resultReceiver2 != null) {
/* 36 */                    resultReceiver2.send(iZza, intent != null ? intent.getExtras() : null);
                        }
                    } else {
/* 60 */                zze.zzl("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
                    }
/* 255 */           this.f3028c = false;
/* 257 */           finish();
                }

                @Override // android.app.Activity
                public final void onCreate(Bundle bundle) {
                    PendingIntent pendingIntent;
/* 1 */             super.onCreate(bundle);
/* 15 */            if (bundle != null) {
/* 230 */               zze.zzk("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
/* 239 */               this.f3028c = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
/* 245 */               if (bundle.containsKey("result_receiver")) {
/* 253 */                   this.f3026a = (ResultReceiver) bundle.getParcelable("result_receiver");
                        } else if (bundle.containsKey("in_app_message_result_receiver")) {
/* 268 */                   this.f3027b = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
                        }
/* 274 */               this.f3029d = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
/* 282 */               this.f3030e = bundle.getInt("activity_code", 100);
/* 284 */               return;
                    }
/* 19 */            zze.zzk("ProxyBillingActivity", "Launching Play Store billing flow");
/* 22 */            this.f3030e = 100;
/* 36 */            if (getIntent().hasExtra("BUY_INTENT")) {
/* 46 */                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
/* 56 */                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
/* 68 */                    this.f3029d = true;
/* 72 */                    this.f3030e = 110;
                        }
                    } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
/* 95 */                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
/* 107 */               this.f3026a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
                    } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
/* 130 */               pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
/* 142 */               this.f3027b = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
/* 146 */               this.f3030e = ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE;
                    } else {
/* 149 */               pendingIntent = null;
                    }
                    try {
/* 150 */               this.f3028c = true;
/* 167 */               startIntentSenderForResult(pendingIntent.getIntentSender(), this.f3030e, new Intent(), 0, 0, 0);
                    } catch (IntentSender.SendIntentException e) {
/* 174 */               zze.zzm("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
/* 177 */               ResultReceiver resultReceiver = this.f3026a;
/* 180 */               if (resultReceiver != null) {
/* 182 */                   resultReceiver.send(6, null);
                        } else {
/* 186 */                   ResultReceiver resultReceiver2 = this.f3027b;
/* 188 */                   if (resultReceiver2 != null) {
/* 190 */                       resultReceiver2.send(0, null);
                            } else {
/* 194 */                       Intent intentM1742a = m1742a();
/* 200 */                       if (this.f3029d) {
/* 204 */                           intentM1742a.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                                }
/* 209 */                       intentM1742a.putExtra("RESPONSE_CODE", 6);
/* 216 */                       intentM1742a.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
/* 219 */                       sendBroadcast(intentM1742a);
                            }
                        }
/* 222 */               this.f3028c = false;
/* 224 */               finish();
                    }
                }

                @Override // android.app.Activity
                public final void onDestroy() {
/* 1 */             super.onDestroy();
/* 8 */             if (isFinishing() && this.f3028c) {
/* 15 */                Intent intentM1742a = m1742a();
/* 22 */                intentM1742a.putExtra("RESPONSE_CODE", 1);
/* 29 */                intentM1742a.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
/* 32 */                int i = this.f3030e;
/* 36 */                if (i == 110 || i == 100) {
/* 46 */                    intentM1742a.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                        }
/* 49 */                sendBroadcast(intentM1742a);
                    }
                }

                @Override // android.app.Activity
                public final void onSaveInstanceState(Bundle bundle) {
/* 1 */             super.onSaveInstanceState(bundle);
/* 4 */             ResultReceiver resultReceiver = this.f3026a;
/* 6 */             if (resultReceiver != null) {
/* 10 */                bundle.putParcelable("result_receiver", resultReceiver);
                    }
/* 13 */            ResultReceiver resultReceiver2 = this.f3027b;
/* 15 */            if (resultReceiver2 != null) {
/* 19 */                bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
                    }
/* 26 */            bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f3028c);
/* 33 */            bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f3029d);
/* 40 */            bundle.putInt("activity_code", this.f3030e);
                }
            }
