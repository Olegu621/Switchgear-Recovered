            package com.google.android.recaptcha.internal;

            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzqx implements zzsr {
                static final zzsr zza = new zzqx();

                private zzqx() {
                }

                @Override // com.google.android.recaptcha.internal.zzsr
                public final boolean zza(int i) {
                    zzqy zzqyVar;
/* 1 */             zzqy zzqyVar2 = zzqy.EDITION_UNKNOWN;
/* 4 */             if (i == 0) {
/* 61 */                zzqyVar = zzqy.EDITION_UNKNOWN;
                    } else if (i == 1) {
/* 58 */                zzqyVar = zzqy.EDITION_1_TEST_ONLY;
                    } else if (i == 2) {
/* 55 */                zzqyVar = zzqy.EDITION_2_TEST_ONLY;
                    } else if (i == 900) {
/* 52 */                zzqyVar = zzqy.EDITION_LEGACY;
                    } else if (i != Integer.MAX_VALUE) {
                        switch (i) {
                            case 998:
/* 46 */                        zzqyVar = zzqy.EDITION_PROTO2;
                                break;
                            case 999:
/* 43 */                        zzqyVar = zzqy.EDITION_PROTO3;
                                break;
                            case 1000:
/* 40 */                        zzqyVar = zzqy.EDITION_2023;
                                break;
                            case WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY /* 1001 */:
/* 37 */                        zzqyVar = zzqy.EDITION_2024;
                                break;
                            default:
                                switch (i) {
                                    case 99997:
/* 34 */                                zzqyVar = zzqy.EDITION_99997_TEST_ONLY;
                                        break;
                                    case 99998:
/* 31 */                                zzqyVar = zzqy.EDITION_99998_TEST_ONLY;
                                        break;
                                    case 99999:
/* 28 */                                zzqyVar = zzqy.EDITION_99999_TEST_ONLY;
                                        break;
                                    default:
/* 26 */                                zzqyVar = null;
                                        break;
                                }
                                break;
                        }
                    } else {
/* 49 */                zzqyVar = zzqy.EDITION_MAX;
                    }
                    return zzqyVar != null;
                }
            }
