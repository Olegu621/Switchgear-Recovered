            package com.google.android.gms.internal.measurement;

            import io.flutter.Build;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum zzin implements zzmi {
                CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN(0),
                CLIENT_UPLOAD_ELIGIBLE(1),
                MEASUREMENT_SERVICE_NOT_ENABLED(2),
                ANDROID_TOO_OLD(3),
                NON_PLAY_MODE(4),
                SDK_TOO_OLD(5),
                MISSING_JOB_SCHEDULER(6),
                NOT_ENABLED_IN_MANIFEST(7),
                CLIENT_FLAG_OFF(8),
                SERVICE_FLAG_OFF(20),
                PINNED_TO_SERVICE_UPLOAD(21),
                MISSING_SGTM_SERVER_URL(22);

                private final int zzm;

                zzin(int i) {
/* 4 */             this.zzm = i;
                }

                public static zzin zzb(int i) {
                    switch (i) {
                        case 0:
/* 42 */                    return CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN;
                        case 1:
/* 39 */                    return CLIENT_UPLOAD_ELIGIBLE;
                        case 2:
/* 36 */                    return MEASUREMENT_SERVICE_NOT_ENABLED;
                        case 3:
/* 33 */                    return ANDROID_TOO_OLD;
                        case 4:
/* 30 */                    return NON_PLAY_MODE;
                        case 5:
/* 27 */                    return SDK_TOO_OLD;
                        case 6:
/* 24 */                    return MISSING_JOB_SCHEDULER;
                        case 7:
/* 21 */                    return NOT_ENABLED_IN_MANIFEST;
                        case 8:
/* 18 */                    return CLIENT_FLAG_OFF;
                        default:
                            switch (i) {
                                case 20:
/* 15 */                            return SERVICE_FLAG_OFF;
                                case Build.API_LEVELS.API_21 /* 21 */:
/* 12 */                            return PINNED_TO_SERVICE_UPLOAD;
                                case Build.API_LEVELS.API_22 /* 22 */:
/* 9 */                             return MISSING_SGTM_SERVER_URL;
                                default:
/* 7 */                             return null;
                            }
                    }
                }

                @Override // java.lang.Enum
                public final String toString() {
/* 3 */             return Integer.toString(this.zzm);
                }

                @Override // com.google.android.gms.internal.measurement.zzmi
                public final int zza() {
/* 1 */             return this.zzm;
                }
            }
