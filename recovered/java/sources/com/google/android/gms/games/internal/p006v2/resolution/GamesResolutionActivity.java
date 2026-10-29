            package com.google.android.gms.games.internal.p006v2.resolution;

            import android.app.Activity;
            import android.app.PendingIntent;
            import android.content.Intent;
            import android.content.IntentSender;
            import android.os.Bundle;
            import android.os.ResultReceiver;
            import com.google.android.gms.common.internal.AbstractC0322a;
            import com.google.android.gms.internal.games_v2.zzez;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class GamesResolutionActivity extends Activity {

                /* JADX INFO: renamed from: a */
                public ResultReceiver f4039a;

                /* JADX INFO: renamed from: a */
                public final void m2112a(int i, Intent intent) {
                    Bundle bundle;
/* 1 */             ResultReceiver resultReceiver = this.f4039a;
/* 3 */             if (resultReceiver == null) {
/* 5 */                 return;
                    }
/* 6 */             if (intent == null) {
/* 10 */                bundle = new Bundle();
                    } else {
/* 16 */                Bundle bundle2 = new Bundle();
/* 21 */                bundle2.putParcelable("resultData", intent);
/* 24 */                bundle = bundle2;
                    }
/* 25 */            resultReceiver.send(i, bundle);
                }

                @Override // android.app.Activity
                public final void onActivityResult(int i, int i2, Intent intent) {
/* 1 */             super.onActivityResult(i, i2, intent);
/* 4 */             if (i == 0) {
/* 38 */                m2112a(i2, intent);
/* 41 */                finish();
/* 44 */                return;
                    }
/* 10 */            StringBuilder sb = new StringBuilder(36);
/* 15 */            sb.append("Unexpected request code: ");
/* 18 */            sb.append(i);
/* 27 */            zzez.zzc("ResultActivity", sb.toString());
/* 31 */            m2112a(0, intent);
/* 34 */            finish();
                }

                @Override // android.app.Activity
                public final void onCreate(Bundle bundle) {
                    GamesResolutionActivity gamesResolutionActivity;
/* 1 */             super.onCreate(bundle);
/* 6 */             if (bundle != null) {
/* 12 */                ResultReceiver resultReceiver = (ResultReceiver) bundle.getParcelable("resultReceiver");
/* 14 */                kb1.m6061n(resultReceiver);
/* 17 */                this.f4039a = resultReceiver;
/* 19 */                return;
                    }
/* 28 */            ResultReceiver resultReceiver2 = (ResultReceiver) getIntent().getParcelableExtra("resultReceiver");
/* 30 */            kb1.m6061n(resultReceiver2);
/* 33 */            this.f4039a = resultReceiver2;
/* 45 */            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra(AbstractC0322a.KEY_PENDING_INTENT);
/* 47 */            kb1.m6061n(pendingIntent);
                    try {
/* 59 */                gamesResolutionActivity = this;
                        try {
/* 60 */                    gamesResolutionActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 0, 0, 0);
                        } catch (IntentSender.SendIntentException e) {
/* 64 */                    e = e;
/* 74 */                    zzez.zzd("ResultActivity", "Failed to launch", e);
/* 79 */                    gamesResolutionActivity.m2112a(0, null);
/* 82 */                    gamesResolutionActivity.finish();
                        }
                    } catch (IntentSender.SendIntentException e2) {
/* 67 */                e = e2;
/* 68 */                gamesResolutionActivity = this;
                    }
                }

                @Override // android.app.Activity
                public final void onSaveInstanceState(Bundle bundle) {
/* 1 */             super.onSaveInstanceState(bundle);
/* 8 */             bundle.putParcelable("resultReceiver", this.f4039a);
                }
            }
