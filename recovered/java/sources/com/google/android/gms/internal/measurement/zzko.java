            package com.google.android.gms.internal.measurement;

            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum zzko implements zzmi {
                IAB_TCF_PURPOSE_UNKNOWN(0),
                IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE(1),
                IAB_TCF_PURPOSE_SELECT_BASIC_ADS(2),
                IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE(3),
                IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS(4),
                IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_CONTENT_PROFILE(5),
                IAB_TCF_PURPOSE_SELECT_PERSONALISED_CONTENT(6),
                IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE(7),
                IAB_TCF_PURPOSE_MEASURE_CONTENT_PERFORMANCE(8),
                IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS(9),
                IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS(10),
                IAB_TCF_PURPOSE_USE_LIMITED_DATA_TO_SELECT_CONTENT(11),
                UNRECOGNIZED(-1);

                private final int zzn;

                zzko(int i) {
/* 4 */             this.zzn = i;
                }

                @Override // java.lang.Enum
                public final String toString() {
/* 3 */             return Integer.toString(this.zzn);
                }

                @Override // com.google.android.gms.internal.measurement.zzmi
                public final int zza() {
/* 3 */             if (this != UNRECOGNIZED) {
/* 5 */                 return this.zzn;
                    }
/* 10 */            C1951n4.m6859j("Can't get the number of an unknown enum value.");
/* 13 */            return 0;
                }
            }
