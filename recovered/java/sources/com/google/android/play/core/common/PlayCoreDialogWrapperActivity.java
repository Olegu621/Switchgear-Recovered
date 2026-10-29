            package com.google.android.play.core.common;

            import android.app.Activity;
            import android.app.PendingIntent;
            import android.content.Intent;
            import android.content.IntentSender;
            import android.os.Bundle;
            import android.os.ResultReceiver;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PlayCoreDialogWrapperActivity extends Activity {

                /* JADX INFO: renamed from: a */
                public ResultReceiver f5144a;

                @Override // android.app.Activity
                public final void onActivityResult(int i, int i2, Intent intent) {
                    ResultReceiver resultReceiver;
/* 1 */             super.onActivityResult(i, i2, intent);
/* 4 */             if (i == 0 && (resultReceiver = this.f5144a) != null) {
/* 11 */                if (i2 == -1) {
/* 19 */                    resultReceiver.send(1, new Bundle());
                        } else if (i2 == 0) {
/* 31 */                    resultReceiver.send(2, new Bundle());
                        }
                    }
/* 34 */            finish();
                }

                @Override // android.app.Activity
                public final void onCreate(Bundle bundle) {
                    Intent intent;
                    PlayCoreDialogWrapperActivity playCoreDialogWrapperActivity;
/* 8 */             int intExtra = getIntent().getIntExtra("window_flags", 0);
/* 13 */            if (intExtra != 0) {
/* 23 */                getWindow().getDecorView().setSystemUiVisibility(intExtra);
/* 28 */                Intent intent2 = new Intent();
/* 31 */                intent2.putExtra("window_flags", intExtra);
/* 34 */                intent = intent2;
                    } else {
/* 36 */                intent = null;
                    }
/* 37 */            super.onCreate(bundle);
/* 42 */            if (bundle != null) {
/* 135 */               this.f5144a = (ResultReceiver) bundle.getParcelable("result_receiver");
/* 137 */               return;
                    }
/* 54 */            this.f5144a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
/* 60 */            Bundle extras = getIntent().getExtras();
/* 73 */            PendingIntent pendingIntent = extras != null ? (PendingIntent) extras.get("confirmation_intent") : null;
/* 76 */            if (extras == null || pendingIntent == null) {
/* 112 */               ResultReceiver resultReceiver = this.f5144a;
/* 114 */               if (resultReceiver != null) {
/* 121 */                   resultReceiver.send(3, new Bundle());
                        }
/* 124 */               finish();
/* 127 */               return;
                    }
                    try {
/* 90 */                playCoreDialogWrapperActivity = this;
                        try {
/* 91 */                    playCoreDialogWrapperActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 0, intent, 0, 0, 0);
                        } catch (IntentSender.SendIntentException unused) {
/* 96 */                    ResultReceiver resultReceiver2 = playCoreDialogWrapperActivity.f5144a;
/* 98 */                    if (resultReceiver2 != null) {
/* 105 */                       resultReceiver2.send(3, new Bundle());
                            }
/* 108 */                   playCoreDialogWrapperActivity.finish();
                        }
                    } catch (IntentSender.SendIntentException unused2) {
/* 95 */                playCoreDialogWrapperActivity = this;
                    }
                }

                @Override // android.app.Activity
                public final void onSaveInstanceState(Bundle bundle) {
/* 5 */             bundle.putParcelable("result_receiver", this.f5144a);
                }
            }
