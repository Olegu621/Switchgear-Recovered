            package com.google.android.gms.internal.play_billing;

            import io.flutter.plugin.editing.FlutterTextUtils;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzjh {
                public static String zza(zzgk zzgkVar) {
/* 7 */             StringBuilder sb = new StringBuilder(zzgkVar.zzd());
/* 15 */            for (int i = 0; i < zzgkVar.zzd(); i++) {
/* 17 */                byte bZza = zzgkVar.zza(i);
/* 23 */                if (bZza == 34) {
/* 137 */                   sb.append("\\\"");
                        } else if (bZza == 39) {
/* 131 */                   sb.append("\\'");
                        } else if (bZza != 92) {
                            switch (bZza) {
                                case 7:
/* 119 */                           sb.append("\\a");
                                    break;
                                case 8:
/* 113 */                           sb.append("\\b");
                                    break;
                                case 9:
/* 107 */                           sb.append("\\t");
                                    break;
                                case 10:
/* 101 */                           sb.append("\\n");
                                    break;
                                case 11:
/* 95 */                            sb.append("\\v");
                                    break;
                                case 12:
/* 89 */                            sb.append("\\f");
                                    break;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 83 */                            sb.append("\\r");
                                    break;
                                default:
/* 38 */                            if (bZza < 32 || bZza > 126) {
/* 49 */                                sb.append('\\');
/* 59 */                                sb.append((char) (((bZza >>> 6) & 3) + 48));
/* 69 */                                sb.append((char) (((bZza >>> 3) & 7) + 48));
/* 77 */                                sb.append((char) ((bZza & 7) + 48));
                                    } else {
/* 45 */                                sb.append((char) bZza);
                                    }
                                    break;
                            }
                        } else {
/* 125 */                   sb.append("\\\\");
                        }
                    }
/* 144 */           return sb.toString();
                }
            }
