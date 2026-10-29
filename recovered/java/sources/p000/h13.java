            package p000;

            import android.content.res.Resources;
            import com.google.android.material.R$string;
            import java.text.DateFormat;
            import java.text.SimpleDateFormat;
            import java.util.Calendar;
            import java.util.Locale;
            import java.util.TimeZone;
            import java.util.concurrent.atomic.AtomicReference;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class h13 {

                /* JADX INFO: renamed from: a */
                public static final AtomicReference f8867a = new AtomicReference();

                /* JADX INFO: renamed from: a */
                public static long m4081a(long j) {
/* 2 */             Calendar calendarM4086f = m4086f(null);
/* 6 */             calendarM4086f.setTimeInMillis(j);
/* 13 */            return m4082b(calendarM4086f).getTimeInMillis();
                }

                /* JADX INFO: renamed from: b */
                public static Calendar m4082b(Calendar calendar) {
/* 1 */             Calendar calendarM4086f = m4086f(calendar);
/* 6 */             Calendar calendarM4086f2 = m4086f(null);
/* 25 */            calendarM4086f2.set(calendarM4086f.get(1), calendarM4086f.get(2), calendarM4086f.get(5));
/* 28 */            return calendarM4086f2;
                }

                /* JADX INFO: renamed from: c */
                public static SimpleDateFormat m4083c() {
/* 30 */            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("\\s+", HttpUrl.FRAGMENT_ENCODE_SET), Locale.getDefault());
/* 39 */            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
/* 43 */            simpleDateFormat.setLenient(false);
/* 46 */            return simpleDateFormat;
                }

                /* JADX INFO: renamed from: d */
                public static String m4084d(Resources resources, SimpleDateFormat simpleDateFormat) {
/* 1 */             String pattern = simpleDateFormat.toPattern();
/* 7 */             String string = resources.getString(R$string.mtrl_picker_text_input_year_abbr);
/* 13 */            String string2 = resources.getString(R$string.mtrl_picker_text_input_month_abbr);
/* 19 */            String string3 = resources.getString(R$string.mtrl_picker_text_input_day_abbr);
/* 38 */            if (pattern.replaceAll("[^y]", HttpUrl.FRAGMENT_ENCODE_SET).length() == 1) {
/* 42 */                pattern = pattern.replace("y", "yyyy");
                    }
/* 58 */            return pattern.replace("d", string3).replace("M", string2).replace("y", string);
                }

                /* JADX INFO: renamed from: e */
                public static Calendar m4085e() {
/* 9 */             Calendar calendar = Calendar.getInstance();
/* 16 */            calendar.set(11, 0);
/* 21 */            calendar.set(12, 0);
/* 26 */            calendar.set(13, 0);
/* 31 */            calendar.set(14, 0);
/* 40 */            calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
/* 43 */            return calendar;
                }

                /* JADX INFO: renamed from: f */
                public static Calendar m4086f(Calendar calendar) {
/* 7 */             Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
/* 11 */            if (calendar == null) {
/* 13 */                calendar2.clear();
/* 16 */                return calendar2;
                    }
/* 21 */            calendar2.setTimeInMillis(calendar.getTimeInMillis());
/* 24 */            return calendar2;
                }
            }
