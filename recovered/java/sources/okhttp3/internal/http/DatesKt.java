            package okhttp3.internal.http;

            import java.text.DateFormat;
            import java.text.ParsePosition;
            import java.text.SimpleDateFormat;
            import java.util.Date;
            import java.util.Locale;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import okhttp3.internal.Util;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000+\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\n\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u0005H\u0000\u001a\f\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0000\"\u0018\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u000f"}, m6176d2 = {"BROWSER_COMPATIBLE_DATE_FORMATS", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/text/DateFormat;", "[Ljava/text/DateFormat;", "BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS", HttpUrl.FRAGMENT_ENCODE_SET, "[Ljava/lang/String;", "MAX_DATE", HttpUrl.FRAGMENT_ENCODE_SET, "STANDARD_DATE_FORMAT", "okhttp3/internal/http/DatesKt$STANDARD_DATE_FORMAT$1", "Lokhttp3/internal/http/DatesKt$STANDARD_DATE_FORMAT$1;", "toHttpDateOrNull", "Ljava/util/Date;", "toHttpDateString", "okhttp"}, m6177k = 2, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class DatesKt {
                private static final DateFormat[] BROWSER_COMPATIBLE_DATE_FORMATS;
                private static final String[] BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
                public static final long MAX_DATE = 253402300799999L;
                private static final DatesKt$STANDARD_DATE_FORMAT$1 STANDARD_DATE_FORMAT = new ThreadLocal<DateFormat>() { // from class: okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1
                    @Override // java.lang.ThreadLocal
                    public DateFormat initialValue() {
/* 7 */                 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
/* 11 */                simpleDateFormat.setLenient(false);
/* 16 */                simpleDateFormat.setTimeZone(Util.UTC);
/* 19 */                return simpleDateFormat;
                    }
                };

                /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1] */
                static {
/* 38 */            String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
/* 42 */            BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = strArr;
/* 47 */            BROWSER_COMPATIBLE_DATE_FORMATS = new DateFormat[strArr.length];
                }

                public static final Date toHttpDateOrNull(String str) {
/* 1 */             str.getClass();
/* 9 */             if (str.length() == 0) {
/* 8 */                 return null;
                    }
/* 15 */            ParsePosition parsePosition = new ParsePosition(0);
/* 26 */            Date date = STANDARD_DATE_FORMAT.get().parse(str, parsePosition);
/* 38 */            if (parsePosition.getIndex() == str.length()) {
/* 40 */                return date;
                    }
/* 41 */            String[] strArr = BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
                    synchronized (strArr) {
                        try {
/* 44 */                    int length = strArr.length;
/* 45 */                    int i = 0;
/* 46 */                    while (i < length) {
/* 48 */                        int i2 = i + 1;
/* 50 */                        DateFormat[] dateFormatArr = BROWSER_COMPATIBLE_DATE_FORMATS;
/* 52 */                        DateFormat simpleDateFormat = dateFormatArr[i];
/* 54 */                        if (simpleDateFormat == null) {
/* 64 */                            simpleDateFormat = new SimpleDateFormat(BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS[i], Locale.US);
/* 69 */                            simpleDateFormat.setTimeZone(Util.UTC);
/* 72 */                            dateFormatArr[i] = simpleDateFormat;
                                }
/* 77 */                        parsePosition.setIndex(0);
/* 80 */                        Date date2 = simpleDateFormat.parse(str, parsePosition);
/* 88 */                        if (parsePosition.getIndex() != 0) {
/* 91 */                            return date2;
                                }
/* 92 */                        i = i2;
                            }
/* 8 */                     return null;
                        } catch (Throwable th) {
/* 97 */                    throw th;
                        }
                    }
                }

                public static final String toHttpDateString(Date date) {
/* 1 */             date.getClass();
/* 12 */            String str = STANDARD_DATE_FORMAT.get().format(date);
/* 16 */            str.getClass();
/* 19 */            return str;
                }
            }
