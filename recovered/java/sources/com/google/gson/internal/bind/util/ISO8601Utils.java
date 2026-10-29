            package com.google.gson.internal.bind.util;

            import java.text.ParseException;
            import java.text.ParsePosition;
            import java.util.Date;
            import java.util.GregorianCalendar;
            import java.util.Locale;
            import java.util.TimeZone;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 178 */   public class ISO8601Utils {
                private static final String UTC_ID = "UTC";
                private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

                private static boolean checkOffset(String str, int i, char c) {
                    return i < str.length() && str.charAt(i) == c;
                }

                public static String format(Date date, boolean z, TimeZone timeZone) {
/* 5 */             GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
/* 8 */             gregorianCalendar.setTime(date);
/* 33 */            StringBuilder sb = new StringBuilder(19 + (z ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
/* 40 */            padInt(sb, gregorianCalendar.get(1), 4);
/* 45 */            sb.append('-');
/* 54 */            padInt(sb, gregorianCalendar.get(2) + 1, 2);
/* 57 */            sb.append('-');
/* 65 */            padInt(sb, gregorianCalendar.get(5), 2);
/* 70 */            sb.append('T');
/* 79 */            padInt(sb, gregorianCalendar.get(11), 2);
/* 84 */            sb.append(':');
/* 93 */            padInt(sb, gregorianCalendar.get(12), 2);
/* 96 */            sb.append(':');
/* 105 */           padInt(sb, gregorianCalendar.get(13), 2);
/* 108 */           if (z) {
/* 112 */               sb.append('.');
/* 122 */               padInt(sb, gregorianCalendar.get(14), 3);
                    }
/* 129 */           int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
/* 133 */           if (offset != 0) {
/* 138 */               int i = offset / 60000;
/* 142 */               int iAbs = Math.abs(i / 60);
/* 148 */               int iAbs2 = Math.abs(i % 60);
/* 157 */               sb.append(offset >= 0 ? '+' : '-');
/* 160 */               padInt(sb, iAbs, 2);
/* 163 */               sb.append(':');
/* 166 */               padInt(sb, iAbs2, 2);
                    } else {
/* 172 */               sb.append('Z');
                    }
/* 175 */           return sb.toString();
                }

                private static int indexOfNonDigit(String str, int i) {
/* 5 */             while (i < str.length()) {
/* 7 */                 char cCharAt = str.charAt(i);
/* 13 */                if (cCharAt < '0' || cCharAt > '9') {
/* 23 */                    return i;
                        }
/* 20 */                i++;
                    }
/* 24 */            return str.length();
                }

                private static void padInt(StringBuilder sb, int i, int i2) {
/* 1 */             String string = Integer.toString(i);
/* 10 */            for (int length = i2 - string.length(); length > 0; length--) {
/* 14 */                sb.append('0');
                    }
/* 20 */            sb.append(string);
                }

                /* JADX WARN: Code duplicated, block: B:56:0x00eb A[Catch: IllegalArgumentException -> 0x0056, NumberFormatException -> 0x0059, IndexOutOfBoundsException -> 0x005c, TryCatch #2 {IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x005c, NumberFormatException -> 0x0059, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003f, B:13:0x0045, B:23:0x0065, B:25:0x0075, B:26:0x0077, B:28:0x0083, B:29:0x0086, B:31:0x008c, B:35:0x0096, B:40:0x00a6, B:42:0x00ae, B:54:0x00e5, B:56:0x00eb, B:58:0x00f1, B:84:0x0182, B:64:0x0102, B:65:0x0118, B:66:0x0119, B:70:0x0129, B:72:0x0136, B:75:0x013f, B:77:0x0151, B:80:0x0160, B:81:0x017d, B:83:0x0180, B:69:0x0125, B:86:0x01b4, B:87:0x01bb, B:47:0x00c8, B:48:0x00cb), top: B:98:0x000c }] */
                /* JADX WARN: Code duplicated, block: B:58:0x00f1 A[Catch: IllegalArgumentException -> 0x0056, NumberFormatException -> 0x0059, IndexOutOfBoundsException -> 0x005c, TryCatch #2 {IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x005c, NumberFormatException -> 0x0059, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003f, B:13:0x0045, B:23:0x0065, B:25:0x0075, B:26:0x0077, B:28:0x0083, B:29:0x0086, B:31:0x008c, B:35:0x0096, B:40:0x00a6, B:42:0x00ae, B:54:0x00e5, B:56:0x00eb, B:58:0x00f1, B:84:0x0182, B:64:0x0102, B:65:0x0118, B:66:0x0119, B:70:0x0129, B:72:0x0136, B:75:0x013f, B:77:0x0151, B:80:0x0160, B:81:0x017d, B:83:0x0180, B:69:0x0125, B:86:0x01b4, B:87:0x01bb, B:47:0x00c8, B:48:0x00cb), top: B:98:0x000c }] */
                /* JADX WARN: Code duplicated, block: B:59:0x00f9  */
                /* JADX WARN: Code duplicated, block: B:68:0x0124  */
                /* JADX WARN: Code duplicated, block: B:69:0x0125 A[Catch: IllegalArgumentException -> 0x0056, NumberFormatException -> 0x0059, IndexOutOfBoundsException -> 0x005c, TryCatch #2 {IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x005c, NumberFormatException -> 0x0059, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003f, B:13:0x0045, B:23:0x0065, B:25:0x0075, B:26:0x0077, B:28:0x0083, B:29:0x0086, B:31:0x008c, B:35:0x0096, B:40:0x00a6, B:42:0x00ae, B:54:0x00e5, B:56:0x00eb, B:58:0x00f1, B:84:0x0182, B:64:0x0102, B:65:0x0118, B:66:0x0119, B:70:0x0129, B:72:0x0136, B:75:0x013f, B:77:0x0151, B:80:0x0160, B:81:0x017d, B:83:0x0180, B:69:0x0125, B:86:0x01b4, B:87:0x01bb, B:47:0x00c8, B:48:0x00cb), top: B:98:0x000c }] */
                /* JADX WARN: Code duplicated, block: B:83:0x0180 A[Catch: IllegalArgumentException -> 0x0056, NumberFormatException -> 0x0059, IndexOutOfBoundsException -> 0x005c, TryCatch #2 {IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x005c, NumberFormatException -> 0x0059, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003f, B:13:0x0045, B:23:0x0065, B:25:0x0075, B:26:0x0077, B:28:0x0083, B:29:0x0086, B:31:0x008c, B:35:0x0096, B:40:0x00a6, B:42:0x00ae, B:54:0x00e5, B:56:0x00eb, B:58:0x00f1, B:84:0x0182, B:64:0x0102, B:65:0x0118, B:66:0x0119, B:70:0x0129, B:72:0x0136, B:75:0x013f, B:77:0x0151, B:80:0x0160, B:81:0x017d, B:83:0x0180, B:69:0x0125, B:86:0x01b4, B:87:0x01bb, B:47:0x00c8, B:48:0x00cb), top: B:98:0x000c }] */
                /* JADX WARN: Code duplicated, block: B:86:0x01b4 A[Catch: IllegalArgumentException -> 0x0056, NumberFormatException -> 0x0059, IndexOutOfBoundsException -> 0x005c, TryCatch #2 {IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x005c, NumberFormatException -> 0x0059, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003f, B:13:0x0045, B:23:0x0065, B:25:0x0075, B:26:0x0077, B:28:0x0083, B:29:0x0086, B:31:0x008c, B:35:0x0096, B:40:0x00a6, B:42:0x00ae, B:54:0x00e5, B:56:0x00eb, B:58:0x00f1, B:84:0x0182, B:64:0x0102, B:65:0x0118, B:66:0x0119, B:70:0x0129, B:72:0x0136, B:75:0x013f, B:77:0x0151, B:80:0x0160, B:81:0x017d, B:83:0x0180, B:69:0x0125, B:86:0x01b4, B:87:0x01bb, B:47:0x00c8, B:48:0x00cb), top: B:98:0x000c }] */
                /* JADX WARN: Code duplicated, block: B:89:0x01be  */
                /* JADX WARN: Code duplicated, block: B:90:0x01c0  */
                /* JADX WARN: Code duplicated, block: B:93:0x01d9  */
                /* JADX WARN: Code duplicated, block: B:95:0x01df  */
                /* JADX WARN: Instruction removed from duplicated block: B:90:0x01c0, please report this as an issue */
                /* JADX WARN: Instruction removed from duplicated block: B:95:0x01df, please report this as an issue */
                public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
                    String str2;
                    String message;
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    char cCharAt;
                    String strSubstring;
                    int length;
                    TimeZone timeZone;
                    char cCharAt2;
                    try {
/* 13 */                int index = parsePosition.getIndex();
/* 17 */                int i5 = index + 4;
/* 19 */                int i6 = parseInt(str, index, i5);
/* 30 */                if (checkOffset(str, i5, '-')) {
/* 32 */                    i5 = index + 5;
                        }
/* 34 */                int i7 = i5 + 2;
/* 36 */                int i8 = parseInt(str, i5, i7);
/* 44 */                if (checkOffset(str, i7, '-')) {
/* 46 */                    i7 = i5 + 3;
                        }
/* 48 */                int i9 = i7 + 2;
/* 50 */                int i10 = parseInt(str, i7, i9);
/* 56 */                boolean zCheckOffset = checkOffset(str, i9, 'T');
/* 62 */                if (!zCheckOffset && str.length() <= i9) {
/* 73 */                    GregorianCalendar gregorianCalendar = new GregorianCalendar(i6, i8 - 1, i10);
/* 76 */                    gregorianCalendar.setLenient(false);
/* 79 */                    parsePosition.setIndex(i9);
/* 82 */                    return gregorianCalendar.getTime();
                        }
/* 100 */               if (zCheckOffset) {
/* 104 */                   int i11 = i7 + 5;
/* 106 */                   int i12 = parseInt(str, i7 + 3, i11);
/* 116 */                   if (checkOffset(str, i11, ':')) {
/* 118 */                       i11 = i7 + 6;
                            }
/* 120 */                   int i13 = i11 + 2;
/* 122 */                   int i14 = parseInt(str, i11, i13);
/* 130 */                   if (checkOffset(str, i13, ':')) {
/* 132 */                       i13 = i11 + 3;
                            }
/* 139 */                   if (str.length() <= i13 || (cCharAt2 = str.charAt(i13)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
/* 220 */                       i9 = i13;
/* 221 */                       i = i12;
/* 222 */                       i2 = i14;
                            } else {
/* 151 */                       int i15 = i13 + 2;
/* 153 */                       i4 = parseInt(str, i13, i15);
/* 159 */                       if (i4 > 59 && i4 < 63) {
/* 165 */                           i4 = 59;
                                }
/* 173 */                       if (checkOffset(str, i15, '.')) {
/* 175 */                           int i16 = i13 + 3;
/* 179 */                           int iIndexOfNonDigit = indexOfNonDigit(str, i13 + 4);
/* 185 */                           int iMin = Math.min(iIndexOfNonDigit, i13 + 6);
/* 189 */                           int i17 = parseInt(str, i16, iMin);
/* 193 */                           int i18 = iMin - i16;
/* 195 */                           if (i18 == 1) {
/* 204 */                               i17 *= 100;
                                    } else if (i18 == 2) {
/* 201 */                               i17 *= 10;
                                    }
/* 206 */                           i = i12;
/* 207 */                           i9 = iIndexOfNonDigit;
/* 208 */                           i2 = i14;
/* 210 */                           i3 = i17;
                                } else {
/* 213 */                           i = i12;
/* 214 */                           i9 = i15;
/* 215 */                           i2 = i14;
/* 217 */                           i3 = 0;
                                }
                            }
/* 234 */                   if (str.length() > i9) {
/* 444 */                       throw new IllegalArgumentException("No time zone indicator");
                            }
/* 236 */                   cCharAt = str.charAt(i9);
/* 240 */                   if (cCharAt == 'Z') {
/* 242 */                       timeZone = TIMEZONE_UTC;
/* 246 */                       length = i9 + 1;
                            } else {
/* 252 */                       if (cCharAt != '+' && cCharAt != '-') {
/* 281 */                           throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                                }
/* 282 */                       strSubstring = str.substring(i9);
/* 291 */                       if (strSubstring.length() >= 5) {
/* 294 */                           strSubstring = strSubstring.concat("00");
                                }
/* 302 */                       length = i9 + strSubstring.length();
/* 309 */                       if (!"+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
/* 385 */                           timeZone = TIMEZONE_UTC;
                                } else {
/* 320 */                           String strConcat = "GMT".concat(strSubstring);
/* 324 */                           TimeZone timeZone2 = TimeZone.getTimeZone(strConcat);
/* 328 */                           String id = timeZone2.getID();
/* 336 */                           if (!id.equals(strConcat) && !id.replace(":", HttpUrl.FRAGMENT_ENCODE_SET).equals(strConcat)) {
/* 382 */                               throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + strConcat + " given, resolves to " + timeZone2.getID());
                                    }
/* 383 */                           timeZone = timeZone2;
                                }
                            }
/* 389 */                   GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
/* 393 */                   gregorianCalendar2.setLenient(false);
/* 397 */                   gregorianCalendar2.set(1, i6);
/* 402 */                   gregorianCalendar2.set(2, i8 - 1);
/* 406 */                   gregorianCalendar2.set(5, i10);
/* 411 */                   gregorianCalendar2.set(11, i);
/* 416 */                   gregorianCalendar2.set(12, i2);
/* 421 */                   gregorianCalendar2.set(13, i4);
/* 426 */                   gregorianCalendar2.set(14, i3);
/* 429 */                   parsePosition.setIndex(length);
/* 432 */                   return gregorianCalendar2.getTime();
                        }
/* 227 */               i = 0;
/* 228 */               i2 = 0;
/* 224 */               i3 = 0;
/* 225 */               i4 = 0;
/* 234 */               if (str.length() > i9) {
/* 444 */                   throw new IllegalArgumentException("No time zone indicator");
                        }
/* 236 */               cCharAt = str.charAt(i9);
/* 240 */               if (cCharAt == 'Z') {
/* 242 */                   timeZone = TIMEZONE_UTC;
/* 246 */                   length = i9 + 1;
                        } else {
/* 252 */                   if (cCharAt != '+') {
/* 281 */                       throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                            }
/* 282 */                   strSubstring = str.substring(i9);
/* 291 */                   if (strSubstring.length() >= 5) {
/* 294 */                       strSubstring = strSubstring.concat("00");
                            }
/* 302 */                   length = i9 + strSubstring.length();
/* 309 */                   if ("+0000".equals(strSubstring)) {
/* 385 */                       timeZone = TIMEZONE_UTC;
                            } else {
/* 385 */                       timeZone = TIMEZONE_UTC;
                            }
                        }
/* 389 */               GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
/* 393 */               gregorianCalendar3.setLenient(false);
/* 397 */               gregorianCalendar3.set(1, i6);
/* 402 */               gregorianCalendar3.set(2, i8 - 1);
/* 406 */               gregorianCalendar3.set(5, i10);
/* 411 */               gregorianCalendar3.set(11, i);
/* 416 */               gregorianCalendar3.set(12, i2);
/* 421 */               gregorianCalendar3.set(13, i4);
/* 426 */               gregorianCalendar3.set(14, i3);
/* 429 */               parsePosition.setIndex(length);
/* 432 */               return gregorianCalendar3.getTime();
                    } catch (IllegalArgumentException e) {
/* 87 */                e = e;
/* 445 */               if (str == null) {
/* 447 */                   str2 = null;
                        } else {
/* 464 */                   str2 = "\"" + str + '\"';
                        }
/* 468 */               message = e.getMessage();
/* 472 */               if (message != null || message.isEmpty()) {
/* 503 */                   message = "(" + e.getClass().getName() + ")";
                        }
/* 521 */               ParseException parseException = new ParseException(AbstractC0886en.m3509m("Failed to parse date [", str2, "]: ", message), parsePosition.getIndex());
/* 524 */               parseException.initCause(e);
/* 527 */               throw parseException;
                    } catch (IndexOutOfBoundsException e2) {
/* 93 */                e = e2;
/* 445 */               if (str == null) {
/* 447 */                   str2 = null;
                        } else {
/* 464 */                   str2 = "\"" + str + '\"';
                        }
/* 468 */               message = e.getMessage();
/* 472 */               if (message != null) {
/* 503 */                   message = "(" + e.getClass().getName() + ")";
                        } else {
/* 503 */                   message = "(" + e.getClass().getName() + ")";
                        }
/* 521 */               ParseException parseException2 = new ParseException(AbstractC0886en.m3509m("Failed to parse date [", str2, "]: ", message), parsePosition.getIndex());
/* 524 */               parseException2.initCause(e);
/* 527 */               throw parseException2;
                    } catch (NumberFormatException e3) {
/* 90 */                e = e3;
/* 445 */               if (str == null) {
/* 447 */                   str2 = null;
                        } else {
/* 464 */                   str2 = "\"" + str + '\"';
                        }
/* 468 */               message = e.getMessage();
/* 472 */               if (message != null) {
/* 503 */                   message = "(" + e.getClass().getName() + ")";
                        } else {
/* 503 */                   message = "(" + e.getClass().getName() + ")";
                        }
/* 521 */               ParseException parseException3 = new ParseException(AbstractC0886en.m3509m("Failed to parse date [", str2, "]: ", message), parsePosition.getIndex());
/* 524 */               parseException3.initCause(e);
/* 527 */               throw parseException3;
                    }
                }

                private static int parseInt(String str, int i, int i2) throws NumberFormatException {
                    int i3;
                    int i4;
/* 1 */             if (i < 0 || i2 > str.length() || i > i2) {
/* 87 */                throw new NumberFormatException(str);
                    }
/* 15 */            if (i < i2) {
/* 17 */                i4 = i + 1;
/* 23 */                int iDigit = Character.digit(str.charAt(i), 10);
/* 27 */                if (iDigit < 0) {
/* 44 */                    throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
                        }
/* 29 */                i3 = -iDigit;
                    } else {
/* 45 */                i3 = 0;
/* 46 */                i4 = i;
                    }
/* 47 */            while (i4 < i2) {
/* 49 */                int i5 = i4 + 1;
/* 55 */                int iDigit2 = Character.digit(str.charAt(i4), 10);
/* 59 */                if (iDigit2 < 0) {
/* 79 */                    throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
                        }
/* 63 */                i3 = (i3 * 10) - iDigit2;
/* 64 */                i4 = i5;
                    }
/* 80 */            return -i3;
                }

/* 179 */       public static String format(Date date, boolean z) {
/* 180 */           return format(date, z, TIMEZONE_UTC);
                }

/* 180 */       public static String format(Date date) {
/* 181 */           return format(date, false, TIMEZONE_UTC);
                }
            }
