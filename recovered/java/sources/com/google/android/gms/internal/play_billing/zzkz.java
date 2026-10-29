            package com.google.android.gms.internal.play_billing;

            import io.flutter.plugin.editing.FlutterTextUtils;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzkz implements zzhm {
                static final zzhm zza = new zzkz();

                private zzkz() {
                }

                @Override // com.google.android.gms.internal.play_billing.zzhm
                public final boolean zza(int i) {
/* 3 */             if (i == 17 || i == 18) {
/* 14 */                return true;
                    }
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
/* 14 */                    return true;
                        default:
/* 12 */                    return false;
                    }
                }
            }
