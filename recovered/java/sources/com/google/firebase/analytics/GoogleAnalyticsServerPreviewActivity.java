            package com.google.firebase.analytics;

            import android.app.Activity;
            import android.os.Bundle;
            import com.google.android.gms.internal.measurement.zzfb;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class GoogleAnalyticsServerPreviewActivity extends Activity {
                @Override // android.app.Activity
                public void onCreate(Bundle bundle) {
/* 1 */             super.onCreate(bundle);
/* 13 */            zzfb.zza(this, null).zze(getIntent());
/* 16 */            finish();
                }
            }
