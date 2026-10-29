            package com.google.android.gms.internal.play_billing;

            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzka implements zzhm {
                static final zzhm zza = new zzka();

                private zzka() {
                }

                @Override // com.google.android.gms.internal.play_billing.zzhm
                public final boolean zza(int i) {
                    switch (i) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
                        case 14:
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 9 */                     return true;
                        default:
                            switch (i) {
                                case Build.API_LEVELS.API_22 /* 22 */:
                                case Build.API_LEVELS.API_23 /* 23 */:
                                case 24:
                                case Build.API_LEVELS.API_25 /* 25 */:
                                case Build.API_LEVELS.API_26 /* 26 */:
                                case Build.API_LEVELS.API_27 /* 27 */:
                                case Build.API_LEVELS.API_28 /* 28 */:
                                case Build.API_LEVELS.API_29 /* 29 */:
                                case Build.API_LEVELS.API_30 /* 30 */:
/* 9 */                             return true;
                                default:
/* 7 */                             return false;
                            }
                    }
                }
            }
