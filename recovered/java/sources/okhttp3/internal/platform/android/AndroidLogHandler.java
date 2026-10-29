            package okhttp3.internal.platform.android;

            import java.util.logging.Handler;
            import java.util.logging.LogRecord;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m6176d2 = {"Lokhttp3/internal/platform/android/AndroidLogHandler;", "Ljava/util/logging/Handler;", "()V", "close", HttpUrl.FRAGMENT_ENCODE_SET, "flush", "publish", "record", "Ljava/util/logging/LogRecord;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class AndroidLogHandler extends Handler {
                public static final AndroidLogHandler INSTANCE = new AndroidLogHandler();

                private AndroidLogHandler() {
                }

                @Override // java.util.logging.Handler
                public void close() {
                }

                @Override // java.util.logging.Handler
                public void flush() {
                }

                @Override // java.util.logging.Handler
                public void publish(LogRecord record) {
/* 1 */             record.getClass();
/* 4 */             AndroidLog androidLog = AndroidLog.INSTANCE;
/* 6 */             String loggerName = record.getLoggerName();
/* 10 */            loggerName.getClass();
/* 1 */             int androidLevel = AndroidLogKt.getAndroidLevel(record);
/* 17 */            String message = record.getMessage();
/* 21 */            message.getClass();
/* 28 */            androidLog.androidLog$okhttp(loggerName, androidLevel, message, record.getThrown());
                }
            }
