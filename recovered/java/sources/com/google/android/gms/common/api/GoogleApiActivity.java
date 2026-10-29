            package com.google.android.gms.common.api;

            import android.app.Activity;
            import android.app.PendingIntent;
            import android.content.ActivityNotFoundException;
            import android.content.DialogInterface;
            import android.content.Intent;
            import android.content.IntentSender;
            import android.os.Build;
            import android.os.Bundle;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.internal.base.zau;
            import io.sentry.android.core.AbstractC1245n0;
            import p000.fm0;
            import p000.kb1;
            import p000.pr0;
            import p000.ur0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ int f3436b = 0;

                /* JADX INFO: renamed from: a */
                public int f3437a = 0;

                @Override // android.app.Activity
                public final void onActivityResult(int i, int i2, Intent intent) {
/* 1 */             super.onActivityResult(i, i2, intent);
/* 6 */             if (i == 1) {
/* 14 */                boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
/* 18 */                this.f3437a = 0;
/* 20 */                setResult(i2, intent);
/* 23 */                if (booleanExtra) {
/* 25 */                    ur0 ur0VarM9125h = ur0.m9125h(this);
/* 30 */                    if (i2 == -1) {
/* 57 */                        zau zauVar = ur0VarM9125h.f17695n;
/* 64 */                        zauVar.sendMessage(zauVar.obtainMessage(3));
                            } else if (i2 == 0) {
/* 53 */                        ur0VarM9125h.m9131i(new ConnectionResult(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                            }
                        }
                    } else if (i == 2) {
/* 71 */                this.f3437a = 0;
/* 73 */                setResult(i2, intent);
                    }
/* 76 */            finish();
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
/* 2 */             this.f3437a = 0;
/* 4 */             setResult(0);
/* 7 */             finish();
                }

                @Override // android.app.Activity
                public final void onCreate(Bundle bundle) {
                    GoogleApiActivity googleApiActivity;
/* 1 */             super.onCreate(bundle);
/* 4 */             if (bundle != null) {
/* 12 */                this.f3437a = bundle.getInt("resolution");
                    }
/* 17 */            if (this.f3437a == 1) {
/* 197 */               return;
                    }
/* 23 */            Bundle extras = getIntent().getExtras();
/* 29 */            if (extras == null) {
/* 33 */                AbstractC1245n0.m4876d("GoogleApiActivity", "Activity started without extras");
/* 36 */                finish();
/* 39 */                return;
                    }
/* 47 */            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
/* 55 */            Integer num = (Integer) extras.get("error_code");
/* 57 */            if (pendingIntent == null && num == null) {
/* 64 */                AbstractC1245n0.m4876d("GoogleApiActivity", "Activity started without resolution");
/* 67 */                finish();
/* 70 */                return;
                    }
/* 71 */            if (pendingIntent == null) {
/* 183 */               kb1.m6061n(num);
/* 192 */               pr0.f15259d.m7542d(this, num.intValue(), this);
/* 195 */               this.f3437a = 1;
/* 197 */               return;
                    }
                    try {
/* 82 */                googleApiActivity = this;
                        try {
/* 83 */                    googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
/* 86 */                    googleApiActivity.f3437a = 1;
                        } catch (ActivityNotFoundException e) {
/* 92 */                    e = e;
/* 93 */                    ActivityNotFoundException activityNotFoundException = e;
/* 116 */                   if (extras.getBoolean("notify_manager", true)) {
/* 141 */                       ur0.m9125h(googleApiActivity).m9131i(new ConnectionResult(22, null, null), googleApiActivity.getIntent().getIntExtra("failing_client_id", -1));
                            } else {
/* 153 */                       String strM3784j = fm0.m3784j("Activity not found while launching ", pendingIntent.toString(), ".");
/* 165 */                       if (Build.FINGERPRINT.contains("generic")) {
/* 169 */                           strM3784j = strM3784j.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                                }
/* 173 */                       AbstractC1245n0.m4877e("GoogleApiActivity", strM3784j, activityNotFoundException);
                            }
/* 176 */                   googleApiActivity.f3437a = 1;
/* 178 */                   googleApiActivity.finish();
                        } catch (IntentSender.SendIntentException e2) {
/* 89 */                    e = e2;
/* 100 */                   AbstractC1245n0.m4877e("GoogleApiActivity", "Failed to launch pendingIntent", e);
/* 103 */                   googleApiActivity.finish();
                        }
                    } catch (ActivityNotFoundException e3) {
/* 107 */               e = e3;
/* 108 */               googleApiActivity = this;
                    } catch (IntentSender.SendIntentException e4) {
/* 95 */                e = e4;
/* 96 */                googleApiActivity = this;
                    }
                }

                @Override // android.app.Activity
                public final void onSaveInstanceState(Bundle bundle) {
/* 5 */             bundle.putInt("resolution", this.f3437a);
/* 8 */             super.onSaveInstanceState(bundle);
                }
            }
