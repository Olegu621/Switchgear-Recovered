            package com.android.billingclient.api;

            import android.os.Bundle;
            import android.os.ResultReceiver;
            import com.google.android.gms.internal.play_billing.zze;
            import com.google.android.gms.internal.play_billing.zzkg;
            import p000.C1795jj;
            import p000.C1833kj;
            import p000.if3;
            import p000.kf3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzaw extends ResultReceiver {
                @Override // android.os.ResultReceiver
                public final void onReceiveResult(int i, Bundle bundle) {
/* 1 */             C1795jj c1795jjM6120a = C1833kj.m6120a();
/* 5 */             c1795jjM6120a.f12324a = i;
/* 8 */             if (i == 0) {
/* 54 */                c1795jjM6120a.m5841a();
/* 57 */                throw null;
                    }
/* 10 */            if (bundle == null) {
/* 51 */                C1833kj c1833kj = kf3.f12723a;
/* 53 */                throw null;
                    }
/* 18 */            c1795jjM6120a.f12325b = zze.zzh(bundle, "BillingClient");
/* 22 */            int i2 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
/* 47 */            if3.m4525c(i2 != 0 ? zzkg.zza(i2) : 23, 16, c1795jjM6120a.m5841a(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS"));
/* 50 */            throw null;
                }
            }
