            package com.google.android.gms.internal.drive;

            import io.flutter.plugin.editing.FlutterTextUtils;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzmt {
                public static String zzc(zzjc zzjcVar) {
/* 3 */             zzmu zzmuVar = new zzmu(zzjcVar);
/* 12 */            StringBuilder sb = new StringBuilder(zzmuVar.size());
/* 20 */            for (int i = 0; i < zzmuVar.size(); i++) {
/* 22 */                byte bZzs = zzmuVar.zzs(i);
/* 28 */                if (bZzs == 34) {
/* 142 */                   sb.append("\\\"");
                        } else if (bZzs == 39) {
/* 136 */                   sb.append("\\'");
                        } else if (bZzs != 92) {
                            switch (bZzs) {
                                case 7:
/* 124 */                           sb.append("\\a");
                                    break;
                                case 8:
/* 118 */                           sb.append("\\b");
                                    break;
                                case 9:
/* 112 */                           sb.append("\\t");
                                    break;
                                case 10:
/* 106 */                           sb.append("\\n");
                                    break;
                                case 11:
/* 100 */                           sb.append("\\v");
                                    break;
                                case 12:
/* 94 */                            sb.append("\\f");
                                    break;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 88 */                            sb.append("\\r");
                                    break;
                                default:
/* 43 */                            if (bZzs < 32 || bZzs > 126) {
/* 54 */                                sb.append('\\');
/* 64 */                                sb.append((char) (((bZzs >>> 6) & 3) + 48));
/* 74 */                                sb.append((char) (((bZzs >>> 3) & 7) + 48));
/* 82 */                                sb.append((char) ((bZzs & 7) + 48));
                                    } else {
/* 50 */                                sb.append((char) bZzs);
                                    }
                                    break;
                            }
                        } else {
/* 130 */                   sb.append("\\\\");
                        }
                    }
/* 149 */           return sb.toString();
                }
            }
