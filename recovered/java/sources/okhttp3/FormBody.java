            package okhttp3;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.EOFException;
            import java.io.IOException;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.internal.Util;
            import okio.Buffer;
            import okio.BufferedSink;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\bJ\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b\u0012J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\bJ\u001a\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006\u001d"}, m6176d2 = {"Lokhttp3/FormBody;", "Lokhttp3/RequestBody;", "encodedNames", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "encodedValues", "(Ljava/util/List;Ljava/util/List;)V", "size", HttpUrl.FRAGMENT_ENCODE_SET, "()I", "contentLength", HttpUrl.FRAGMENT_ENCODE_SET, "contentType", "Lokhttp3/MediaType;", "encodedName", FirebaseAnalytics.Param.INDEX, "encodedValue", "name", "-deprecated_size", FirebaseAnalytics.Param.VALUE, "writeOrCountBytes", "sink", "Lokio/BufferedSink;", "countBytes", HttpUrl.FRAGMENT_ENCODE_SET, "writeTo", HttpUrl.FRAGMENT_ENCODE_SET, "Builder", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 18 */    public final class FormBody extends RequestBody {
                private final List<String> encodedNames;
                private final List<String> encodedValues;
                private static final MediaType CONTENT_TYPE = MediaType.INSTANCE.get("application/x-www-form-urlencoded");

                public FormBody(List<String> list, List<String> list2) {
/* 1 */             list.getClass();
/* 4 */             list2.getClass();
/* 14 */            this.encodedNames = Util.toImmutableList(list);
/* 20 */            this.encodedValues = Util.toImmutableList(list2);
                }

                private final long writeOrCountBytes(BufferedSink sink, boolean countBytes) throws EOFException {
                    Buffer buffer;
/* 1 */             if (countBytes) {
/* 5 */                 buffer = new Buffer();
                    } else {
/* 9 */                 sink.getClass();
/* 12 */                buffer = sink.getBuffer();
                    }
/* 18 */            int size = this.encodedNames.size();
/* 22 */            int i = 0;
/* 23 */            while (i < size) {
/* 25 */                int i2 = i + 1;
/* 27 */                if (i > 0) {
/* 31 */                    buffer.writeByte(38);
                        }
/* 42 */                buffer.writeUtf8(this.encodedNames.get(i));
/* 47 */                buffer.writeByte(61);
/* 58 */                buffer.writeUtf8(this.encodedValues.get(i));
/* 61 */                i = i2;
                    }
/* 63 */            if (!countBytes) {
/* 73 */                return 0L;
                    }
/* 65 */            long size2 = buffer.size();
/* 69 */            buffer.clear();
/* 72 */            return size2;
                }

                /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
                public final int m10540deprecated_size() {
/* 1 */             return size();
                }

                @Override // okhttp3.RequestBody
                public long contentLength() {
/* 3 */             return writeOrCountBytes(null, true);
                }

                @Override // okhttp3.RequestBody
                /* JADX INFO: renamed from: contentType */
                public MediaType get$contentType() {
/* 1 */             return CONTENT_TYPE;
                }

                public final String encodedName(int index) {
/* 3 */             return this.encodedNames.get(index);
                }

                public final String encodedValue(int index) {
/* 3 */             return this.encodedValues.get(index);
                }

                public final String name(int index) {
/* 12 */            return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, encodedName(index), 0, 0, true, 3, null);
                }

                public final int size() {
/* 3 */             return this.encodedNames.size();
                }

                public final String value(int index) {
/* 12 */            return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, encodedValue(index), 0, 0, true, 3, null);
                }

                @Override // okhttp3.RequestBody
                public void writeTo(BufferedSink sink) throws IOException {
/* 1 */             sink.getClass();
/* 5 */             writeOrCountBytes(sink, false);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m6176d2 = {"Lokhttp3/FormBody$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, "charset", "Ljava/nio/charset/Charset;", "(Ljava/nio/charset/Charset;)V", "names", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "values", "add", "name", FirebaseAnalytics.Param.VALUE, "addEncoded", "build", "Lokhttp3/FormBody;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 19 */        public static final class Builder {
                    private final Charset charset;
                    private final List<String> names;
                    private final List<String> values;

                    public Builder(Charset charset) {
/* 4 */                 this.charset = charset;
/* 11 */                this.names = new ArrayList();
/* 18 */                this.values = new ArrayList();
                    }

                    public final Builder add(String name, String value) {
/* 1 */                 name.getClass();
/* 4 */                 value.getClass();
/* 7 */                 List<String> list = this.names;
/* 9 */                 HttpUrl.Companion companion = HttpUrl.INSTANCE;
/* 29 */                list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
/* 43 */                this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, value, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
/* 46 */                return this;
                    }

                    public final Builder addEncoded(String name, String value) {
/* 1 */                 name.getClass();
/* 4 */                 value.getClass();
/* 7 */                 List<String> list = this.names;
/* 9 */                 HttpUrl.Companion companion = HttpUrl.INSTANCE;
/* 29 */                list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
/* 43 */                this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, value, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
/* 46 */                return this;
                    }

                    public final FormBody build() {
/* 7 */                 return new FormBody(this.names, this.values);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
/* 20 */            public Builder() {
/* 21 */                this(null, 1, 0 == true ? 1 : 0);
                    }

/* 21 */            public /* synthetic */ Builder(Charset charset, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 22 */                this((i & 1) != 0 ? null : charset);
                    }
                }
            }
