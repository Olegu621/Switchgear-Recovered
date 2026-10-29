            package com.google.android.recaptcha.internal;

            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum zzzk implements zzsp {
                JS_CODE_UNSPECIFIED(0),
                JS_CODE_SUCCESS(1),
                JS_NETWORK_ERROR(2),
                JS_INTERNAL_ERROR(3),
                JS_INVALID_SITE_KEY(4),
                JS_INVALID_SITE_KEY_TYPE(5),
                JS_3P_APP_PACKAGE_NAME_NOT_ALLOWED(6),
                JS_INVALID_ACTION(7),
                JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED(8),
                JS_PROGRAM_ERROR(9),
                UNRECOGNIZED(-1);

                private final int zzm;

                zzzk(int i) {
/* 4 */             this.zzm = i;
                }

                public static zzzk zzb(int i) {
                    switch (i) {
                        case 0:
/* 33 */                    return JS_CODE_UNSPECIFIED;
                        case 1:
/* 30 */                    return JS_CODE_SUCCESS;
                        case 2:
/* 27 */                    return JS_NETWORK_ERROR;
                        case 3:
/* 24 */                    return JS_INTERNAL_ERROR;
                        case 4:
/* 21 */                    return JS_INVALID_SITE_KEY;
                        case 5:
/* 18 */                    return JS_INVALID_SITE_KEY_TYPE;
                        case 6:
/* 15 */                    return JS_3P_APP_PACKAGE_NAME_NOT_ALLOWED;
                        case 7:
/* 12 */                    return JS_INVALID_ACTION;
                        case 8:
/* 9 */                     return JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED;
                        case 9:
/* 6 */                     return JS_PROGRAM_ERROR;
                        default:
/* 4 */                     return null;
                    }
                }

                @Override // java.lang.Enum
                public final String toString() {
/* 3 */             return Integer.toString(this.zzm);
                }

                @Override // com.google.android.recaptcha.internal.zzsp
                public final int zza() {
/* 3 */             if (this != UNRECOGNIZED) {
/* 5 */                 return this.zzm;
                    }
/* 10 */            C1951n4.m6859j("Can't get the number of an unknown enum value.");
/* 13 */            return 0;
                }
            }
