            package okhttp3.internal.platform.android;

            import android.util.Log;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.concurrent.CopyOnWriteArraySet;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import kotlin.Metadata;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import okhttp3.OkHttpClient;
            import okhttp3.internal.concurrent.TaskRunner;
            import okhttp3.internal.http2.Http2;
            import p000.di2;
            import p000.oc1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0002\b\u0012J\u0006\u0010\u0013\u001a\u00020\fJ\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m6176d2 = {"Lokhttp3/internal/platform/android/AndroidLog;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "MAX_LOG_LENGTH", HttpUrl.FRAGMENT_ENCODE_SET, "configuredLoggers", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/logging/Logger;", "knownLoggers", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "androidLog", HttpUrl.FRAGMENT_ENCODE_SET, "loggerName", "logLevel", "message", "t", HttpUrl.FRAGMENT_ENCODE_SET, "androidLog$okhttp", "enable", "enableLogging", "logger", "tag", "loggerTag", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class AndroidLog {
                private static final int MAX_LOG_LENGTH = 4000;
                private static final Map<String, String> knownLoggers;
                public static final AndroidLog INSTANCE = new AndroidLog();
                private static final CopyOnWriteArraySet<Logger> configuredLoggers = new CopyOnWriteArraySet<>();

                static {
/* 17 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 22 */            Package r2 = OkHttpClient.class.getPackage();
/* 30 */            String name = r2 == null ? null : r2.getName();
/* 34 */            if (name != null) {
/* 38 */                linkedHashMap.put(name, "OkHttp");
                    }
/* 47 */            linkedHashMap.put(OkHttpClient.class.getName(), "okhttp.OkHttpClient");
/* 58 */            linkedHashMap.put(Http2.class.getName(), "okhttp.Http2");
/* 69 */            linkedHashMap.put(TaskRunner.class.getName(), "okhttp.TaskRunner");
/* 76 */            linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
/* 83 */            knownLoggers = oc1.m7134h(linkedHashMap);
                }

                private AndroidLog() {
                }

                private final void enableLogging(String logger, String tag) {
                    Level level;
/* 1 */             Logger logger2 = Logger.getLogger(logger);
/* 11 */            if (configuredLoggers.add(logger2)) {
/* 14 */                logger2.setUseParentHandlers(false);
/* 22 */                if (Log.isLoggable(tag, 3)) {
/* 24 */                    level = Level.FINE;
                        } else {
/* 37 */                    level = Log.isLoggable(tag, 4) ? Level.INFO : Level.WARNING;
                        }
/* 39 */                logger2.setLevel(level);
/* 44 */                logger2.addHandler(AndroidLogHandler.INSTANCE);
                    }
                }

                private final String loggerTag(String loggerName) {
/* 3 */             String str = knownLoggers.get(loggerName);
                    return str == null ? di2.m3089y(23, loggerName) : str;
                }

                public final void androidLog$okhttp(String loggerName, int logLevel, String message, Throwable t) {
                    int iMin;
/* 1 */             loggerName.getClass();
/* 4 */             message.getClass();
/* 7 */             String strLoggerTag = loggerTag(loggerName);
/* 15 */            if (Log.isLoggable(strLoggerTag, logLevel)) {
/* 19 */                if (t != null) {
/* 39 */                    message = message + '\n' + ((Object) Log.getStackTraceString(t));
                        }
/* 43 */                int length = message.length();
/* 47 */                int i = 0;
/* 48 */                while (i < length) {
/* 51 */                    int iM6226B = StringsKt.m6226B(message, '\n', i, 4);
/* 56 */                    if (iM6226B == -1) {
/* 59 */                        iM6226B = length;
                            }
                            while (true) {
/* 62 */                        iMin = Math.min(iM6226B, i + MAX_LOG_LENGTH);
/* 70 */                        Log.println(logLevel, strLoggerTag, message.substring(i, iMin));
/* 73 */                        if (iMin >= iM6226B) {
                                    break;
                                } else {
/* 78 */                            i = iMin;
                                }
                            }
/* 75 */                    i = iMin + 1;
                        }
                    }
                }

                public final void enable() {
/* 15 */            for (Map.Entry<String, String> entry : knownLoggers.entrySet()) {
/* 35 */                enableLogging(entry.getKey(), entry.getValue());
                    }
                }
            }
