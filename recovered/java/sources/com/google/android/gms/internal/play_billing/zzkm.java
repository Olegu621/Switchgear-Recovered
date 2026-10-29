            package com.google.android.gms.internal.play_billing;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzkm implements zzhm {
                static final zzhm zza = new zzkm();

                private zzkm() {
                }

                @Override // com.google.android.gms.internal.play_billing.zzhm
                public final boolean zza(int i) {
                    zzkn zzknVar;
/* 2 */             if (i == 0) {
/* 23 */                zzknVar = zzkn.BROADCAST_ACTION_UNSPECIFIED;
                    } else if (i == 1) {
/* 20 */                zzknVar = zzkn.PURCHASES_UPDATED_ACTION;
                    } else if (i != 2) {
/* 14 */                zzknVar = i != 3 ? null : zzkn.ALTERNATIVE_BILLING_ACTION;
                    } else {
/* 17 */                zzknVar = zzkn.LOCAL_PURCHASES_UPDATED_ACTION;
                    }
                    return zzknVar != null;
                }
            }
