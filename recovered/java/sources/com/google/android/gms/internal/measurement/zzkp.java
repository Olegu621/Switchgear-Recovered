            package com.google.android.gms.internal.measurement;

            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum zzkp implements zzmi {
                PURPOSE_RESTRICTION_NOT_ALLOWED(0),
                PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
                PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
                PURPOSE_RESTRICTION_UNDEFINED(3),
                UNRECOGNIZED(-1);

                private final int zzf;

                zzkp(int i) {
/* 4 */             this.zzf = i;
                }

                @Override // java.lang.Enum
                public final String toString() {
/* 3 */             return Integer.toString(this.zzf);
                }

                @Override // com.google.android.gms.internal.measurement.zzmi
                public final int zza() {
/* 3 */             if (this != UNRECOGNIZED) {
/* 5 */                 return this.zzf;
                    }
/* 10 */            C1951n4.m6859j("Can't get the number of an unknown enum value.");
/* 13 */            return 0;
                }
            }
