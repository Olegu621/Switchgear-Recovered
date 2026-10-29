            package io.sentry.util;

            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1487i1;
            import java.nio.charset.Charset;
            import java.util.Calendar;
            import java.util.HashMap;
            
            /* JADX INFO: renamed from: io.sentry.util.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC1706e {

                /* JADX INFO: renamed from: a */
                public static final Charset f11729a = Charset.forName("UTF-8");

                /* JADX INFO: renamed from: a */
                public static long m5469a(InterfaceC1487i1 interfaceC1487i1, ILogger iLogger, InterfaceC1458g2 interfaceC1458g2) {
                    try {
/* 3 */                 C1705d c1705d = new C1705d();
/* 6 */                 interfaceC1487i1.mo5063a(c1705d, interfaceC1458g2);
/* 9 */                 return c1705d.f11728a;
                    } catch (Throwable th) {
/* 17 */                iLogger.mo4671d(EnumC1553m5.ERROR, "Could not calculate size of serializable", th);
/* 20 */                return 0L;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static HashMap m5470b(Calendar calendar) {
/* 3 */             HashMap map = new HashMap();
/* 17 */            map.put("year", Integer.valueOf(calendar.get(1)));
/* 31 */            map.put("month", Integer.valueOf(calendar.get(2)));
/* 45 */            map.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
/* 60 */            map.put("hourOfDay", Integer.valueOf(calendar.get(11)));
/* 75 */            map.put("minute", Integer.valueOf(calendar.get(12)));
/* 90 */            map.put("second", Integer.valueOf(calendar.get(13)));
/* 93 */            return map;
                }
            }
