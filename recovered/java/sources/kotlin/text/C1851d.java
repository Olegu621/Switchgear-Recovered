            package kotlin.text;

            import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
            import okhttp3.internal.http2.Settings;
            import p000.ci2;
            
            /* JADX INFO: renamed from: kotlin.text.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class C1851d extends ci2 {
                /* JADX WARN: Code duplicated, block: B:105:0x0126  */
                /* JADX WARN: Code duplicated, block: B:108:0x012a A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:110:0x012d A[PHI: r4
  0x012d: PHI (r4v5 int) = (r4v4 int), (r4v18 int) binds: [B:69:0x00cf, B:108:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:112:0x0137  */
                /* JADX WARN: Code duplicated, block: B:113:0x013a  */
                /* JADX WARN: Code duplicated, block: B:116:0x0142  */
                /* JADX WARN: Code duplicated, block: B:117:0x0144 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:121:0x014b  */
                /* JADX WARN: Code duplicated, block: B:123:0x014e  */
                /* JADX WARN: Code duplicated, block: B:131:0x0161  */
                /* JADX WARN: Code duplicated, block: B:136:0x016f  */
                /* JADX WARN: Code duplicated, block: B:137:0x0171  */
                /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
                /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
                /* JADX WARN: Code duplicated, block: B:76:0x00e1  */
                /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
                /* JADX WARN: Code duplicated, block: B:79:0x00e7  */
                /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
                /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
                /* JADX WARN: Code duplicated, block: B:88:0x0101  */
                /* JADX WARN: Code duplicated, block: B:89:0x0104  */
                /* JADX WARN: Code duplicated, block: B:92:0x0108 A[ADDED_TO_REGION] */
                /* JADX INFO: renamed from: d */
                public static final boolean m6255d(String str) {
                    char c;
                    boolean z;
                    boolean z2;
                    int i;
                    int iCharAt;
                    int i2;
                    int iCharAt2;
                    int i3;
                    boolean z3;
                    int i4;
                    boolean z4;
                    String str2;
                    int i5;
                    boolean z5;
/* 7 */             boolean z6 = true;
/* 8 */             int length = str.length() - 1;
/* 10 */            int i6 = 0;
                    while (true) {
/* 11 */                c = ' ';
/* 13 */                if (i6 > length || str.charAt(i6) > ' ') {
                            break;
                        }
/* 21 */                i6++;
                    }
/* 24 */            if (i6 <= length) {
/* 28 */                while (length > i6 && str.charAt(length) <= ' ') {
/* 36 */                    length--;
                        }
/* 47 */                if (str.charAt(i6) == '+' || str.charAt(i6) == '-') {
/* 55 */                    i6++;
                        }
/* 57 */                if (i6 <= length) {
/* 75 */                    if (str.charAt(i6) != '0') {
/* 203 */                       z = true;
/* 207 */                       z2 = false;
/* 208 */                       if (z2) {
/* 302 */                           i = i6 + 1;
/* 308 */                           iCharAt = str.charAt(i6) | ' ';
/* 310 */                           if (z2) {
/* 312 */                               i2 = 112;
                                    } else {
/* 315 */                               i2 = ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE;
                                    }
/* 321 */                           if (iCharAt != i2) {
/* 323 */                               if (z2) {
                                        }
                                    } else if (i <= length) {
/* 352 */                               while (i <= length) {
/* 362 */                                   i++;
                                        }
/* 365 */                               if (i > length) {
/* 380 */                                   return z;
                                        }
/* 368 */                               if (i != length) {
                                        }
                                    }
                                } else {
/* 210 */                           i3 = i6;
/* 211 */                           while (i3 <= length && ((str.charAt(i3) - '0') & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 10) {
/* 221 */                               i3++;
                                    }
/* 224 */                           if (i6 != i3) {
/* 226 */                               z3 = z;
                                    } else {
/* 229 */                               z3 = false;
                                    }
/* 230 */                           if (i3 > length) {
/* 232 */                               i6 = i3;
                                    } else {
/* 238 */                               if (str.charAt(i3) == '.') {
/* 240 */                                   i5 = i3 + 1;
/* 242 */                                   i4 = i5;
/* 243 */                                   while (i4 <= length && ((str.charAt(i4) - '0') & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 10) {
/* 253 */                                       i4++;
                                            }
/* 256 */                                   if (i5 != i4) {
/* 258 */                                       z4 = z;
                                            }
/* 263 */                                   if (!z3 || z4) {
/* 295 */                                       i6 = i4;
                                            } else {
/* 269 */                                       if (length == i4 + 2) {
/* 271 */                                           str2 = "NaN";
                                                } else {
/* 281 */                                           str2 = length == i4 + 7 ? "Infinity" : null;
                                                }
/* 292 */                                       i6 = (str2 != null && StringsKt__StringsKt.m6243o(i4, str, str2, false) == i4) ? length + 1 : -1;
                                            }
                                        } else {
/* 261 */                                   i4 = i3;
                                        }
/* 262 */                               z4 = false;
/* 263 */                               if (z3) {
/* 295 */                                   i6 = i4;
                                        } else {
/* 295 */                                   i6 = i4;
                                        }
                                    }
/* 296 */                           if (i6 != -1) {
/* 299 */                               if (i6 > length) {
/* 380 */                                   return z;
                                        }
/* 302 */                               i = i6 + 1;
/* 308 */                               iCharAt = str.charAt(i6) | ' ';
/* 310 */                               if (z2) {
/* 312 */                                   i2 = 112;
                                        } else {
/* 315 */                                   i2 = ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE;
                                        }
/* 321 */                               if (iCharAt != i2) {
/* 323 */                                   if (z2 && ((iCharAt == 102 || iCharAt == 100) && i > length)) {
/* 380 */                                       return z;
                                            }
                                        } else if (i <= length && ((str.charAt(i) != '+' && str.charAt(i) != '-') || (i = i6 + 2) <= length)) {
/* 352 */                                   while (i <= length && ((str.charAt(i) - '0') & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 10) {
/* 362 */                                       i++;
                                            }
/* 365 */                                   if (i > length) {
/* 380 */                                       return z;
                                            }
/* 368 */                                   if (i != length && ((iCharAt2 = str.charAt(i) | ' ') == 102 || iCharAt2 == 100)) {
/* 380 */                                       return z;
                                            }
                                        }
                                    }
                                }
                            } else {
/* 77 */                        int i7 = i6 + 1;
/* 79 */                        if (i7 > length) {
/* 7 */                             return true;
                                }
/* 92 */                        if ((str.charAt(i7) | ' ') == 120) {
/* 94 */                            int i8 = i6 + 2;
/* 96 */                            int i9 = i8;
                                    while (true) {
/* 98 */                                if (i9 > length) {
/* 125 */                                   z = z6;
                                            break;
                                        }
/* 100 */                               char cCharAt = str.charAt(i9);
/* 106 */                               z = z6;
/* 110 */                               if (((cCharAt - '0') & Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 10 && (((cCharAt | ' ') - 97) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 6) {
                                            break;
                                        }
/* 120 */                               i9++;
/* 122 */                               z6 = z;
                                    }
/* 132 */                           boolean z7 = i8 != i9 ? z : false;
/* 133 */                           if (i9 <= length) {
/* 143 */                               if (str.charAt(i9) == '.') {
/* 145 */                                   int i10 = i9 + 1;
/* 147 */                                   int i11 = i10;
/* 148 */                                   while (i11 <= length) {
/* 150 */                                       char cCharAt2 = str.charAt(i11);
/* 156 */                                       char c2 = c;
/* 160 */                                       if (((cCharAt2 - '0') & Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 10 && (((cCharAt2 | ' ') - 97) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 6) {
                                                    break;
                                                }
/* 170 */                                       i11++;
/* 172 */                                       c = c2;
                                            }
/* 182 */                                   z5 = i10 != i11 ? z : false;
/* 183 */                                   i9 = i11;
                                        } else {
/* 187 */                                   z5 = false;
                                        }
/* 188 */                               if (z7 || z5) {
/* 193 */                                   i6 = i9;
                                        }
/* 194 */                               if (i6 != -1 && i6 <= length) {
/* 200 */                                   z2 = z;
                                        }
                                    }
/* 137 */                           i6 = -1;
/* 194 */                           if (i6 != -1) {
/* 200 */                               z2 = z;
                                    }
                                } else {
/* 203 */                           z = true;
/* 207 */                           z2 = false;
                                }
/* 208 */                       if (z2) {
/* 210 */                           i3 = i6;
/* 211 */                           while (i3 <= length) {
/* 221 */                               i3++;
                                    }
/* 224 */                           if (i6 != i3) {
/* 226 */                               z3 = z;
                                    } else {
/* 229 */                               z3 = false;
                                    }
/* 230 */                           if (i3 > length) {
/* 232 */                               i6 = i3;
                                    } else {
/* 238 */                               if (str.charAt(i3) == '.') {
/* 240 */                                   i5 = i3 + 1;
/* 242 */                                   i4 = i5;
/* 243 */                                   while (i4 <= length) {
/* 253 */                                       i4++;
                                            }
/* 256 */                                   if (i5 != i4) {
/* 258 */                                       z4 = z;
                                            }
/* 263 */                                   if (z3) {
/* 295 */                                       i6 = i4;
                                            } else {
/* 295 */                                       i6 = i4;
                                            }
                                        } else {
/* 261 */                                   i4 = i3;
                                        }
/* 262 */                               z4 = false;
/* 263 */                               if (z3) {
/* 295 */                                   i6 = i4;
                                        } else {
/* 295 */                                   i6 = i4;
                                        }
                                    }
/* 296 */                           if (i6 != -1) {
/* 299 */                               if (i6 > length) {
/* 380 */                                   return z;
                                        }
/* 302 */                               i = i6 + 1;
/* 308 */                               iCharAt = str.charAt(i6) | ' ';
/* 310 */                               if (z2) {
/* 312 */                                   i2 = 112;
                                        } else {
/* 315 */                                   i2 = ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE;
                                        }
/* 321 */                               if (iCharAt != i2) {
/* 323 */                                   if (z2) {
                                            }
                                        } else if (i <= length) {
/* 352 */                                   while (i <= length) {
/* 362 */                                       i++;
                                            }
/* 365 */                                   if (i > length) {
/* 380 */                                       return z;
                                            }
/* 368 */                                   if (i != length) {
                                            }
                                        }
                                    }
                                } else {
/* 302 */                           i = i6 + 1;
/* 308 */                           iCharAt = str.charAt(i6) | ' ';
/* 310 */                           if (z2) {
/* 312 */                               i2 = 112;
                                    } else {
/* 315 */                               i2 = ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE;
                                    }
/* 321 */                           if (iCharAt != i2) {
/* 323 */                               if (z2) {
                                        }
                                    } else if (i <= length) {
/* 352 */                               while (i <= length) {
/* 362 */                                   i++;
                                        }
/* 365 */                               if (i > length) {
/* 380 */                                   return z;
                                        }
/* 368 */                               if (i != length) {
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 9 */             return false;
                }
            }
