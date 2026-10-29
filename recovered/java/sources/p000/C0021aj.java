            package p000;

            import android.text.SpannableStringBuilder;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: renamed from: aj */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0021aj {

                /* JADX INFO: renamed from: b */
                public static final String f304b;

                /* JADX INFO: renamed from: c */
                public static final String f305c;

                /* JADX INFO: renamed from: d */
                public static final C0021aj f306d;

                /* JADX INFO: renamed from: e */
                public static final C0021aj f307e;

                /* JADX INFO: renamed from: a */
                public final boolean f308a;

                static {
/* 1 */             zr3 zr3Var = en2.f7810c;
/* 9 */             f304b = Character.toString((char) 8206);
/* 17 */            f305c = Character.toString((char) 8207);
/* 25 */            f306d = new C0021aj(false);
/* 33 */            f307e = new C0021aj(true);
                }

                public C0021aj(boolean z) {
/* 1 */             zr3 zr3Var = en2.f7808a;
/* 6 */             this.f308a = z;
                }

                /* JADX INFO: renamed from: a */
                public static int m291a(CharSequence charSequence) {
                    byte directionality;
/* 3 */             C2552zi c2552zi = new C2552zi(charSequence);
/* 7 */             c2552zi.f20157c = 0;
/* 9 */             int i = 0;
/* 10 */            int i2 = 0;
/* 11 */            int i3 = 0;
                    while (true) {
/* 12 */                int i4 = c2552zi.f20157c;
/* 18 */                if (i4 < c2552zi.f20156b && i == 0) {
/* 22 */                    CharSequence charSequence2 = c2552zi.f20155a;
/* 24 */                    char cCharAt = charSequence2.charAt(i4);
/* 28 */                    c2552zi.f20158d = cCharAt;
/* 30 */                    boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
/* 34 */                    int i5 = c2552zi.f20157c;
/* 36 */                    if (zIsHighSurrogate) {
/* 38 */                        int iCodePointAt = Character.codePointAt(charSequence2, i5);
/* 49 */                        c2552zi.f20157c = Character.charCount(iCodePointAt) + c2552zi.f20157c;
/* 51 */                        directionality = Character.getDirectionality(iCodePointAt);
                            } else {
/* 58 */                        c2552zi.f20157c = i5 + 1;
/* 60 */                        char c = c2552zi.f20158d;
/* 71 */                        directionality = c < 1792 ? C2552zi.f20154e[c] : Character.getDirectionality(c);
                            }
/* 75 */                    if (directionality != 0) {
/* 77 */                        if (directionality == 1 || directionality == 2) {
/* 102 */                           if (i3 == 0) {
/* 17 */                                return 1;
                                    }
                                } else if (directionality != 9) {
                                    switch (directionality) {
                                        case 14:
                                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 98 */                                    i3++;
/* 100 */                                   i2 = -1;
                                            continue;
                                        case 16:
                                        case 17:
/* 94 */                                    i3++;
/* 96 */                                    i2 = 1;
                                            continue;
                                        case 18:
/* 90 */                                    i3--;
/* 92 */                                    i2 = 0;
                                            continue;
                                    }
                                }
                            } else if (i3 == 0) {
/* 16 */                        return -1;
                            }
/* 108 */                   i = i3;
                        }
                    }
/* 110 */           if (i != 0) {
/* 113 */               if (i2 == 0) {
/* 118 */                   while (c2552zi.f20157c > 0) {
                                switch (c2552zi.m10355a()) {
                                    case 14:
                                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 137 */                               if (i == i3) {
/* 16 */                                    return -1;
                                        }
/* 134 */                               i3--;
                                        break;
                                    case 16:
                                    case 17:
/* 131 */                               if (i == i3) {
/* 17 */                                    return 1;
                                        }
/* 134 */                               i3--;
                                        break;
                                    case 18:
/* 128 */                               i3++;
                                        break;
                                    default:
                                        break;
                                }
                            }
                        } else {
/* 115 */                   return i2;
                        }
                    }
/* 6 */             return 0;
                }

                /* JADX INFO: renamed from: b */
                public static int m292b(CharSequence charSequence) {
/* 3 */             C2552zi c2552zi = new C2552zi(charSequence);
/* 8 */             c2552zi.f20157c = c2552zi.f20156b;
/* 11 */            int i = 0;
                    while (true) {
/* 12 */                int i2 = i;
/* 15 */                while (c2552zi.f20157c > 0) {
/* 17 */                    byte bM10355a = c2552zi.m10355a();
/* 21 */                    if (bM10355a == 0) {
/* 57 */                        if (i == 0) {
/* 59 */                            return -1;
                                }
/* 61 */                        if (i2 == 0) {
                                }
                            } else if (bM10355a == 1 || bM10355a == 2) {
/* 51 */                        if (i == 0) {
/* 23 */                            return 1;
                                }
/* 54 */                        if (i2 == 0) {
                                }
                            } else if (bM10355a != 9) {
                                switch (bM10355a) {
                                    case 14:
                                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 48 */                                if (i2 == i) {
/* 59 */                                    return -1;
                                        }
/* 45 */                                i--;
                                        break;
                                    case 16:
                                    case 17:
/* 42 */                                if (i2 == i) {
/* 23 */                                    return 1;
                                        }
/* 45 */                                i--;
                                        break;
                                    case 18:
/* 39 */                                i++;
                                        break;
                                    default:
/* 36 */                                if (i2 != 0) {
                                        }
                                        break;
                                }
                            } else {
                                continue;
                            }
                        }
/* 10 */                return 0;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final SpannableStringBuilder m293c(CharSequence charSequence) {
                    String str;
/* 1 */             zr3 zr3Var = en2.f7810c;
/* 3 */             if (charSequence == null) {
/* 5 */                 return null;
                    }
/* 11 */            boolean zM10433i = zr3Var.m10433i(charSequence, charSequence.length());
/* 17 */            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
/* 31 */            boolean zM10433i2 = (zM10433i ? en2.f7809b : en2.f7808a).m10433i(charSequence, charSequence.length());
/* 35 */            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 37 */            String str3 = f305c;
/* 40 */            String str4 = f304b;
/* 43 */            boolean z = this.f308a;
/* 45 */            if (z || !(zM10433i2 || m291a(charSequence) == 1)) {
/* 69 */                str = (!z || (zM10433i2 && m291a(charSequence) != -1)) ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
                    } else {
/* 55 */                str = str4;
                    }
/* 70 */            spannableStringBuilder.append((CharSequence) str);
/* 73 */            if (zM10433i != z) {
/* 82 */                spannableStringBuilder.append(zM10433i ? (char) 8235 : (char) 8234);
/* 85 */                spannableStringBuilder.append(charSequence);
/* 90 */                spannableStringBuilder.append((char) 8236);
                    } else {
/* 94 */                spannableStringBuilder.append(charSequence);
                    }
/* 108 */           boolean zM10433i3 = (zM10433i ? en2.f7809b : en2.f7808a).m10433i(charSequence, charSequence.length());
/* 112 */           if (!z && (zM10433i3 || m292b(charSequence) == 1)) {
/* 122 */               str2 = str4;
                    } else if (z && (!zM10433i3 || m292b(charSequence) == -1)) {
/* 134 */               str2 = str3;
                    }
/* 135 */           spannableStringBuilder.append((CharSequence) str2);
/* 138 */           return spannableStringBuilder;
                }
            }
