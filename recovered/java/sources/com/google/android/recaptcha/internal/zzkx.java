            package com.google.android.recaptcha.internal;

            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.os.Build;
            import androidx.core.app.NotificationCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.C1697u2;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzkx implements zzlb {
                private final Context zza;

                public zzkx(Context context) {
/* 4 */             this.zza = context;
                }

                @Override // com.google.android.recaptcha.internal.zzlb
                /* JADX INFO: renamed from: cs */
                public final /* synthetic */ Object mo2512cs(Object[] objArr) {
/* 1 */             return zzla.zza(this, objArr);
                }

                @Override // com.google.android.recaptcha.internal.zzlb
                public final Object zza(Object... objArr) throws zzdm {
/* 5 */             IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
/* 8 */             int i = Build.VERSION.SDK_INT;
/* 12 */            Context context = this.zza;
/* 24 */            Intent intentRegisterReceiver = i >= 33 ? context.registerReceiver(null, intentFilter, 4) : context.registerReceiver(null, intentFilter);
/* 28 */            if (intentRegisterReceiver == null) {
/* 131 */               C1697u2.m5433i(7, 19, null);
/* 14 */                return null;
                    }
/* 33 */            int intExtra = intentRegisterReceiver.getIntExtra("health", -1);
/* 39 */            int intExtra2 = intentRegisterReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
/* 45 */            int intExtra3 = intentRegisterReceiver.getIntExtra("plugged", -1);
/* 52 */            boolean booleanExtra = intentRegisterReceiver.getBooleanExtra("present", false);
/* 58 */            int intExtra4 = intentRegisterReceiver.getIntExtra("scale", -1);
/* 64 */            int intExtra5 = intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
/* 70 */            String stringExtra = intentRegisterReceiver.getStringExtra("technology");
/* 74 */            if (stringExtra == null) {
/* 76 */                stringExtra = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 123 */           return new Object[]{Integer.valueOf(intExtra), Integer.valueOf(intExtra2), Integer.valueOf(intExtra3), Boolean.valueOf(booleanExtra), Integer.valueOf(intExtra4), Integer.valueOf(intExtra5), stringExtra, Integer.valueOf(intentRegisterReceiver.getIntExtra("temperature", -1)), Integer.valueOf(intentRegisterReceiver.getIntExtra("voltage", -1))};
                }
            }
