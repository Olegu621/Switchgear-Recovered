            package okhttp3.internal.platform.android;

            import java.util.logging.Level;
            import java.util.logging.LogRecord;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m6176d2 = {"androidLevel", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/util/logging/LogRecord;", "getAndroidLevel", "(Ljava/util/logging/LogRecord;)I", "okhttp"}, m6177k = 2, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class AndroidLogKt {
                /* JADX INFO: Access modifiers changed from: private */
                public static final int getAndroidLevel(LogRecord logRecord) {
/* 5 */             int iIntValue = logRecord.getLevel().intValue();
/* 9 */             Level level = Level.INFO;
/* 15 */            if (iIntValue > level.intValue()) {
/* 17 */                return 5;
                    }
                    return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
                }
            }
