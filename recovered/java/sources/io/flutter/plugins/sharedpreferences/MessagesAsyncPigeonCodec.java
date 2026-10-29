            package io.flutter.plugins.sharedpreferences;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.plugin.common.StandardMessageCodec;
            import java.io.ByteArrayOutputStream;
            import java.nio.ByteBuffer;
            import java.util.List;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u000f"}, m6176d2 = {"Lio/flutter/plugins/sharedpreferences/MessagesAsyncPigeonCodec;", "Lio/flutter/plugin/common/StandardMessageCodec;", "<init>", "()V", "readValueOfType", HttpUrl.FRAGMENT_ENCODE_SET, "type", HttpUrl.FRAGMENT_ENCODE_SET, "buffer", "Ljava/nio/ByteBuffer;", "writeValue", HttpUrl.FRAGMENT_ENCODE_SET, "stream", "Ljava/io/ByteArrayOutputStream;", FirebaseAnalytics.Param.VALUE, "shared_preferences_android_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public class MessagesAsyncPigeonCodec extends StandardMessageCodec {
                @Override // io.flutter.plugin.common.StandardMessageCodec
                public Object readValueOfType(byte type, ByteBuffer buffer) {
/* 1 */             buffer.getClass();
/* 7 */             if (type == -127) {
/* 13 */                Long l = (Long) readValue(buffer);
/* 15 */                if (l != null) {
/* 24 */                    return StringListLookupResultType.INSTANCE.ofRaw((int) l.longValue());
                        }
/* 6 */                 return null;
                    }
/* 32 */            if (type == -126) {
/* 34 */                Object value = readValue(buffer);
/* 45 */                List<? extends Object> list = value instanceof List ? (List) value : null;
/* 46 */                if (list != null) {
/* 50 */                    return SharedPreferencesPigeonOptions.INSTANCE.fromList(list);
                        }
/* 6 */                 return null;
                    }
/* 58 */            if (type != -125) {
/* 82 */                return super.readValueOfType(type, buffer);
                    }
/* 60 */            Object value2 = readValue(buffer);
/* 71 */            List<? extends Object> list2 = value2 instanceof List ? (List) value2 : null;
/* 72 */            if (list2 != null) {
/* 76 */                return StringListResult.INSTANCE.fromList(list2);
                    }
/* 6 */             return null;
                }

                @Override // io.flutter.plugin.common.StandardMessageCodec
                public void writeValue(ByteArrayOutputStream stream, Object value) {
/* 1 */             stream.getClass();
/* 6 */             if (value instanceof StringListLookupResultType) {
/* 10 */                stream.write(129);
/* 23 */                writeValue(stream, Integer.valueOf(((StringListLookupResultType) value).getRaw()));
                    } else if (value instanceof SharedPreferencesPigeonOptions) {
/* 33 */                stream.write(130);
/* 42 */                writeValue(stream, ((SharedPreferencesPigeonOptions) value).toList());
                    } else if (!(value instanceof StringListResult)) {
/* 65 */                super.writeValue(stream, value);
                    } else {
/* 52 */                stream.write(131);
/* 61 */                writeValue(stream, ((StringListResult) value).toList());
                    }
                }
            }
