            package okhttp3;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.UUID;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.internal.Util;
            import okio.Buffer;
            import okio.BufferedSink;
            import okio.ByteString;
            import p000.C1951n4;
            import p000.ds0;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 #2\u00020\u0001:\u0003\"#$B%\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\r\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\b\u0015J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0012J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\b\u0018J\r\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u001aJ\u001a\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014¨\u0006%"}, m6176d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "boundaryByteString", "Lokio/ByteString;", "type", "Lokhttp3/MediaType;", "parts", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/MultipartBody$Part;", "(Lokio/ByteString;Lokhttp3/MediaType;Ljava/util/List;)V", "boundary", HttpUrl.FRAGMENT_ENCODE_SET, "()Ljava/lang/String;", "contentLength", HttpUrl.FRAGMENT_ENCODE_SET, "contentType", "()Ljava/util/List;", "size", HttpUrl.FRAGMENT_ENCODE_SET, "()I", "()Lokhttp3/MediaType;", "-deprecated_boundary", "part", FirebaseAnalytics.Param.INDEX, "-deprecated_parts", "-deprecated_size", "-deprecated_type", "writeOrCountBytes", "sink", "Lokio/BufferedSink;", "countBytes", HttpUrl.FRAGMENT_ENCODE_SET, "writeTo", HttpUrl.FRAGMENT_ENCODE_SET, "Builder", "Companion", "Part", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 1 */     public final class MultipartBody extends RequestBody {
                public static final MediaType ALTERNATIVE;
                private static final byte[] COLONSPACE;
                private static final byte[] CRLF;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final byte[] DASHDASH;
                public static final MediaType DIGEST;
                public static final MediaType FORM;
                public static final MediaType MIXED;
                public static final MediaType PARALLEL;
                private final ByteString boundaryByteString;
                private long contentLength;
                private final MediaType contentType;
                private final List<Part> parts;
                private final MediaType type;

                static {
/* 9 */             MediaType.Companion companion = MediaType.INSTANCE;
/* 17 */            MIXED = companion.get("multipart/mixed");
/* 25 */            ALTERNATIVE = companion.get("multipart/alternative");
/* 33 */            DIGEST = companion.get("multipart/digest");
/* 41 */            PARALLEL = companion.get("multipart/parallel");
/* 49 */            FORM = companion.get("multipart/form-data");
/* 57 */            COLONSPACE = new byte[]{58, 32};
/* 64 */            CRLF = new byte[]{13, 10};
/* 71 */            DASHDASH = new byte[]{45, 45};
                }

                public MultipartBody(ByteString byteString, MediaType mediaType, List<Part> list) {
/* 1 */             byteString.getClass();
/* 4 */             mediaType.getClass();
/* 7 */             list.getClass();
/* 13 */            this.boundaryByteString = byteString;
/* 15 */            this.type = mediaType;
/* 17 */            this.parts = list;
/* 49 */            this.contentType = MediaType.INSTANCE.get(mediaType + "; boundary=" + boundary());
/* 53 */            this.contentLength = -1L;
                }

                /* JADX WARN: Multi-variable type inference failed */
                private final long writeOrCountBytes(BufferedSink sink, boolean countBytes) throws IOException {
                    Buffer buffer;
/* 1 */             if (countBytes) {
/* 5 */                 sink = new Buffer();
/* 8 */                 buffer = sink;
                    } else {
/* 10 */                buffer = 0;
                    }
/* 13 */            int size = this.parts.size();
/* 18 */            long j = 0;
/* 20 */            int i = 0;
/* 21 */            while (i < size) {
/* 23 */                int i2 = i + 1;
/* 27 */                Part part = this.parts.get(i);
/* 33 */                Headers headers = part.headers();
/* 37 */                RequestBody requestBodyBody = part.body();
/* 41 */                sink.getClass();
/* 46 */                sink.write(DASHDASH);
/* 51 */                sink.write(this.boundaryByteString);
/* 56 */                sink.write(CRLF);
/* 59 */                if (headers != null) {
/* 61 */                    int size2 = headers.size();
/* 66 */                    for (int i3 = 0; i3 < size2; i3++) {
/* 94 */                        sink.writeUtf8(headers.name(i3)).write(COLONSPACE).writeUtf8(headers.value(i3)).write(CRLF);
                            }
                        }
/* 99 */                MediaType contentType = requestBodyBody.getContentType();
/* 103 */               if (contentType != null) {
/* 121 */                   sink.writeUtf8("Content-Type: ").writeUtf8(contentType.getMediaType()).write(CRLF);
                        }
/* 124 */               long jContentLength = requestBodyBody.contentLength();
/* 132 */               if (jContentLength != -1) {
/* 146 */                   sink.writeUtf8("Content-Length: ").writeDecimalLong(jContentLength).write(CRLF);
                        } else if (countBytes) {
/* 152 */                   buffer.getClass();
/* 155 */                   buffer.clear();
/* 128 */                   return -1L;
                        }
/* 159 */               byte[] bArr = CRLF;
/* 161 */               sink.write(bArr);
/* 164 */               if (countBytes) {
/* 166 */                   j += jContentLength;
                        } else {
/* 168 */                   requestBodyBody.writeTo(sink);
                        }
/* 171 */               sink.write(bArr);
/* 174 */               i = i2;
                    }
/* 177 */           sink.getClass();
/* 180 */           byte[] bArr2 = DASHDASH;
/* 182 */           sink.write(bArr2);
/* 187 */           sink.write(this.boundaryByteString);
/* 190 */           sink.write(bArr2);
/* 195 */           sink.write(CRLF);
/* 198 */           if (!countBytes) {
/* 212 */               return j;
                    }
/* 200 */           buffer.getClass();
/* 207 */           long size3 = buffer.size() + j;
/* 208 */           buffer.clear();
/* 211 */           return size3;
                }

                /* JADX INFO: renamed from: -deprecated_boundary, reason: not valid java name */
                public final String m10578deprecated_boundary() {
/* 1 */             return boundary();
                }

                /* JADX INFO: renamed from: -deprecated_parts, reason: not valid java name */
                public final List<Part> m10579deprecated_parts() {
/* 1 */             return this.parts;
                }

                /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
                public final int m10580deprecated_size() {
/* 1 */             return size();
                }

                /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name and from getter */
                public final MediaType getType() {
/* 1 */             return this.type;
                }

                public final String boundary() {
/* 3 */             return this.boundaryByteString.utf8();
                }

                @Override // okhttp3.RequestBody
                public long contentLength() throws IOException {
/* 1 */             long j = this.contentLength;
/* 7 */             if (j != -1) {
/* 17 */                return j;
                    }
/* 11 */            long jWriteOrCountBytes = writeOrCountBytes(null, true);
/* 15 */            this.contentLength = jWriteOrCountBytes;
/* 17 */            return jWriteOrCountBytes;
                }

                @Override // okhttp3.RequestBody
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public MediaType getContentType() {
/* 1 */             return this.contentType;
                }

                public final Part part(int index) {
/* 3 */             return this.parts.get(index);
                }

                public final List<Part> parts() {
/* 1 */             return this.parts;
                }

                public final int size() {
/* 3 */             return this.parts.size();
                }

                public final MediaType type() {
/* 1 */             return this.type;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(BufferedSink sink) throws IOException {
/* 1 */             sink.getClass();
/* 5 */             writeOrCountBytes(sink, false);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0019\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\tJ\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\nR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\b¨\u0006\f"}, m6176d2 = {"Lokhttp3/MultipartBody$Part;", HttpUrl.FRAGMENT_ENCODE_SET, "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)V", "()Lokhttp3/RequestBody;", "()Lokhttp3/Headers;", "-deprecated_body", "-deprecated_headers", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */         public static final class Part {

                    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private final RequestBody body;
                    private final Headers headers;

                    private Part(Headers headers, RequestBody requestBody) {
/* 4 */                 this.headers = headers;
/* 6 */                 this.body = requestBody;
                    }

                    public static final Part create(Headers headers, RequestBody requestBody) {
/* 3 */                 return INSTANCE.create(headers, requestBody);
                    }

                    public static final Part createFormData(String str, String str2) {
/* 3 */                 return INSTANCE.createFormData(str, str2);
                    }

                    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name and from getter */
                    public final RequestBody getBody() {
/* 1 */                 return this.body;
                    }

                    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name and from getter */
                    public final Headers getHeaders() {
/* 1 */                 return this.headers;
                    }

                    public final RequestBody body() {
/* 1 */                 return this.body;
                    }

                    public final Headers headers() {
/* 1 */                 return this.headers;
                    }

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    @Metadata(m6175d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u000e"}, m6176d2 = {"Lokhttp3/MultipartBody$Part$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "create", "Lokhttp3/MultipartBody$Part;", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "createFormData", "name", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.VALUE, "filename", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */             public static final class Companion {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                     this();
                        }

                        public final Part create(Headers headers, RequestBody body) {
/* 1 */                     body.getClass();
/* 4 */                     DefaultConstructorMarker defaultConstructorMarker = null;
/* 15 */                    if ((headers == null ? null : headers.get("Content-Type")) != null) {
/* 43 */                        C1951n4.m6859j("Unexpected header: Content-Type");
/* 4 */                         return null;
                            }
/* 27 */                    if ((headers == null ? null : headers.get("Content-Length")) == null) {
/* 31 */                        return new Part(headers, body, defaultConstructorMarker);
                            }
/* 37 */                    C1951n4.m6859j("Unexpected header: Content-Length");
/* 4 */                     return null;
                        }

                        public final Part createFormData(String name, String filename, RequestBody body) {
/* 1 */                     name.getClass();
/* 4 */                     body.getClass();
/* 9 */                     StringBuilder sb = new StringBuilder();
/* 14 */                    sb.append("form-data; name=");
/* 17 */                    Companion companion = MultipartBody.INSTANCE;
/* 19 */                    companion.appendQuotedString$okhttp(sb, name);
/* 22 */                    if (filename != null) {
/* 26 */                        sb.append("; filename=");
/* 29 */                        companion.appendQuotedString$okhttp(sb, filename);
                            }
/* 51 */                    return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", sb.toString()).build(), body);
                        }

/* 4 */                 private Companion() {
                        }

/* 46 */                public final Part create(RequestBody body) {
                            body.getClass();
/* 47 */                    return create(null, body);
                        }

/* 55 */                public final Part createFormData(String name, String value) {
                            name.getClass();
                            value.getClass();
/* 56 */                    return createFormData(name, null, RequestBody.Companion.create$default(RequestBody.INSTANCE, value, (MediaType) null, 1, (Object) null));
                        }
                    }

/* 7 */             public static final Part create(RequestBody requestBody) {
/* 8 */                 return INSTANCE.create(requestBody);
                    }

/* 7 */             public static final Part createFormData(String str, String str2, RequestBody requestBody) {
/* 8 */                 return INSTANCE.createFormData(str, str2, requestBody);
                    }

/* 8 */             public /* synthetic */ Part(Headers headers, RequestBody requestBody, DefaultConstructorMarker defaultConstructorMarker) {
/* 9 */                 this(headers, requestBody);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\r\u001a\u00020\u000e*\u00060\u000fj\u0002`\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m6176d2 = {"Lokhttp3/MultipartBody$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "ALTERNATIVE", "Lokhttp3/MediaType;", "COLONSPACE", HttpUrl.FRAGMENT_ENCODE_SET, "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "appendQuotedString", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "key", HttpUrl.FRAGMENT_ENCODE_SET, "appendQuotedString$okhttp", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final void appendQuotedString$okhttp(StringBuilder sb, String str) {
/* 1 */                 sb.getClass();
/* 4 */                 str.getClass();
/* 9 */                 sb.append('\"');
/* 12 */                int length = str.length();
/* 16 */                int i = 0;
/* 17 */                while (i < length) {
/* 19 */                    int i2 = i + 1;
/* 21 */                    char cCharAt = str.charAt(i);
/* 27 */                    if (cCharAt == '\n') {
/* 31 */                        sb.append("%0A");
                            } else if (cCharAt == '\r') {
/* 41 */                        sb.append("%0D");
                            } else if (cCharAt == '\"') {
/* 49 */                        sb.append("%22");
                            } else {
/* 53 */                        sb.append(cCharAt);
                            }
/* 56 */                    i = i2;
                        }
/* 58 */                sb.append('\"');
                    }

/* 4 */             private Companion() {
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003J \u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m6176d2 = {"Lokhttp3/MultipartBody$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, "boundary", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;)V", "Lokio/ByteString;", "parts", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/MultipartBody$Part;", "type", "Lokhttp3/MediaType;", "addFormDataPart", "name", FirebaseAnalytics.Param.VALUE, "filename", "body", "Lokhttp3/RequestBody;", "addPart", "headers", "Lokhttp3/Headers;", "part", "build", "Lokhttp3/MultipartBody;", "setType", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 12 */        public static final class Builder {
                    private final ByteString boundary;
                    private final List<Part> parts;
                    private MediaType type;

                    public Builder(String str) {
/* 1 */                 str.getClass();
/* 13 */                this.boundary = ByteString.INSTANCE.encodeUtf8(str);
/* 17 */                this.type = MultipartBody.MIXED;
/* 24 */                this.parts = new ArrayList();
                    }

                    public final Builder addFormDataPart(String name, String value) {
/* 1 */                 name.getClass();
/* 4 */                 value.getClass();
/* 13 */                addPart(Part.INSTANCE.createFormData(name, value));
/* 16 */                return this;
                    }

                    public final Builder addPart(RequestBody body) {
/* 1 */                 body.getClass();
/* 10 */                addPart(Part.INSTANCE.create(body));
/* 13 */                return this;
                    }

                    public final MultipartBody build() {
/* 7 */                 if (!this.parts.isEmpty()) {
/* 21 */                    return new MultipartBody(this.boundary, this.type, Util.toImmutableList(this.parts));
                        }
/* 27 */                f42.m3656l("Multipart body must have at least one part.");
/* 30 */                return null;
                    }

                    public final Builder setType(MediaType type) {
/* 1 */                 type.getClass();
/* 14 */                if (Intrinsics.m6216a(type.type(), "multipart")) {
/* 16 */                    this.type = type;
/* 18 */                    return this;
                        }
/* 25 */                ds0.m3200q(Intrinsics.m6219d(type, "multipart != "));
/* 28 */                return null;
                    }

/* 13 */            public final Builder addPart(Headers headers, RequestBody body) {
                        body.getClass();
/* 14 */                addPart(Part.INSTANCE.create(headers, body));
                        return this;
                    }

/* 14 */            public final Builder addPart(Part part) {
                        part.getClass();
/* 15 */                this.parts.add(part);
                        return this;
                    }

/* 16 */            public final Builder addFormDataPart(String name, String filename, RequestBody body) {
                        name.getClass();
                        body.getClass();
/* 17 */                addPart(Part.INSTANCE.createFormData(name, filename, body));
                        return this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
/* 26 */            public Builder() {
/* 27 */                this(null, 1, 0 == true ? 1 : 0);
                    }

                    /* JADX WARN: Illegal instructions before constructor call */
/* 27 */            public /* synthetic */ Builder(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        if ((i & 1) != 0) {
/* 28 */                    str = UUID.randomUUID().toString();
                            str.getClass();
                        }
                        this(str);
                    }
                }
            }
