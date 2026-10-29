            package p000;

            import androidx.core.app.NotificationCompat;
            import java.io.PrintWriter;
            import java.io.StringWriter;
            import java.util.HashMap;
            import okio.Segment;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class if0 implements Thread.UncaughtExceptionHandler {

                /* JADX INFO: renamed from: a */
                public final Thread.UncaughtExceptionHandler f9564a = Thread.getDefaultUncaughtExceptionHandler();

                /* JADX INFO: renamed from: a */
                public static String m4520a(int i, String str) {
/* 1 */             if (str == null) {
/* 17 */                return null;
                    }
/* 3 */             int length = str.length();
/* 7 */             if (length <= i) {
/* 10 */                i = length;
                    }
/* 12 */            return str.substring(0, i);
                }

                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    String strM4520a;
/* 1 */             thread.getClass();
/* 4 */             th.getClass();
/* 14 */            k50.m5968e("if0", "Uncaught exception being tracked...", new Object[0]);
/* 23 */            String strM4520a2 = m4520a(2048, th.getMessage());
/* 27 */            if (strM4520a2 == null || strM4520a2.length() == 0) {
/* 35 */                strM4520a2 = "Android Exception. Null or empty message found";
                    }
/* 37 */            int i = mn0.f13881p;
/* 41 */            StringWriter stringWriter = new StringWriter();
/* 49 */            th.printStackTrace(new PrintWriter(stringWriter));
/* 52 */            String string = stringWriter.toString();
/* 56 */            string.getClass();
/* 61 */            String strM4520a3 = m4520a(8096, string);
/* 71 */            String strM4520a4 = m4520a(Segment.SHARE_MINIMUM, thread.getName());
/* 75 */            StackTraceElement[] stackTrace = th.getStackTrace();
/* 79 */            stackTrace.getClass();
/* 83 */            Integer numValueOf = null;
/* 84 */            if (stackTrace.length == 0) {
/* 86 */                strM4520a = null;
                    } else {
/* 92 */                StackTraceElement stackTraceElement = th.getStackTrace()[0];
/* 94 */                int lineNumber = stackTraceElement.getLineNumber();
/* 102 */               numValueOf = lineNumber >= 0 ? Integer.valueOf(lineNumber) : null;
/* 110 */               strM4520a = m4520a(Segment.SHARE_MINIMUM, stackTraceElement.getClassName());
                    }
/* 122 */           String strM4520a5 = m4520a(Segment.SHARE_MINIMUM, th.getClass().getName());
/* 128 */           HashMap map = new HashMap();
/* 133 */           mn0.m6688d(map, "message", strM4520a2);
/* 138 */           mn0.m6688d(map, "stackTrace", strM4520a3);
/* 143 */           mn0.m6688d(map, "threadName", strM4520a4);
/* 156 */           mn0.m6688d(map, "threadId", Long.valueOf(thread.getId()));
/* 163 */           mn0.m6688d(map, "programmingLanguage", "JAVA");
/* 168 */           mn0.m6688d(map, "lineNumber", numValueOf);
/* 173 */           mn0.m6688d(map, "className", strM4520a);
/* 178 */           mn0.m6688d(map, "exceptionName", strM4520a5);
/* 185 */           mn0.m6688d(map, "isFatal", Boolean.TRUE);
/* 197 */           a92 a92Var = new a92(new b92("iglu:com.snowplowanalytics.snowplow/application_error/jsonschema/1-0-0", map));
/* 202 */           HashMap map2 = new HashMap();
/* 207 */           map2.put(NotificationCompat.CATEGORY_EVENT, a92Var);
/* 212 */           xn1.m10006b("SnowplowCrashReporting", map2);
/* 215 */           Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f9564a;
/* 217 */           if (uncaughtExceptionHandler != null) {
/* 219 */               uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                }
            }
