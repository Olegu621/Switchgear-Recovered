            package okhttp3;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.Closeable;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.io.Reader;
            import java.nio.charset.Charset;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.Charsets;
            import okhttp3.internal.Util;
            import okio.Buffer;
            import okio.BufferedSource;
            import okio.ByteString;
            import p000.ds0;
            import p000.f42;
            import p000.jb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000 !2\u00020\u0001:\u0002 !B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J@\u0010\u0010\u001a\u0002H\u0011\"\b\b\u0000\u0010\u0011*\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002H\u00110\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u00020\u00170\u0014H\u0082\b¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH&J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH&J\b\u0010\u001d\u001a\u00020\u0015H&J\u0006\u0010\u001e\u001a\u00020\u001fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m6176d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "()V", "reader", "Ljava/io/Reader;", "byteStream", "Ljava/io/InputStream;", "byteString", "Lokio/ByteString;", "bytes", HttpUrl.FRAGMENT_ENCODE_SET, "charStream", "charset", "Ljava/nio/charset/Charset;", "close", HttpUrl.FRAGMENT_ENCODE_SET, "consumeSource", "T", HttpUrl.FRAGMENT_ENCODE_SET, "consumer", "Lkotlin/Function1;", "Lokio/BufferedSource;", "sizeMapper", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "contentLength", HttpUrl.FRAGMENT_ENCODE_SET, "contentType", "Lokhttp3/MediaType;", FirebaseAnalytics.Param.SOURCE, "string", HttpUrl.FRAGMENT_ENCODE_SET, "BomAwareReader", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public abstract class ResponseBody implements Closeable {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private Reader reader;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m6176d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", FirebaseAnalytics.Param.SOURCE, "Lokio/BufferedSource;", "charset", "Ljava/nio/charset/Charset;", "(Lokio/BufferedSource;Ljava/nio/charset/Charset;)V", "closed", HttpUrl.FRAGMENT_ENCODE_SET, "delegate", "close", HttpUrl.FRAGMENT_ENCODE_SET, "read", HttpUrl.FRAGMENT_ENCODE_SET, "cbuf", HttpUrl.FRAGMENT_ENCODE_SET, "off", "len", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class BomAwareReader extends Reader {
                    private final Charset charset;
                    private boolean closed;
                    private Reader delegate;
                    private final BufferedSource source;

                    public BomAwareReader(BufferedSource bufferedSource, Charset charset) {
/* 1 */                 bufferedSource.getClass();
/* 4 */                 charset.getClass();
/* 10 */                this.source = bufferedSource;
/* 12 */                this.charset = charset;
                    }

                    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws IOException {
                        Unit unit;
/* 2 */                 this.closed = true;
/* 4 */                 Reader reader = this.delegate;
/* 6 */                 if (reader == null) {
/* 8 */                     unit = null;
                        } else {
/* 10 */                    reader.close();
/* 13 */                    unit = Unit.f12910a;
                        }
/* 15 */                if (unit == null) {
/* 19 */                    this.source.close();
                        }
                    }

                    @Override // java.io.Reader
                    public int read(char[] cbuf, int off, int len) throws IOException {
/* 1 */                 cbuf.getClass();
/* 6 */                 if (this.closed) {
/* 40 */                    ds0.m3195l("Stream closed");
/* 43 */                    return 0;
                        }
/* 8 */                 Reader inputStreamReader = this.delegate;
/* 10 */                if (inputStreamReader == null) {
/* 28 */                    inputStreamReader = new InputStreamReader(this.source.inputStream(), Util.readBomAsCharset(this.source, this.charset));
/* 31 */                    this.delegate = inputStreamReader;
                        }
/* 33 */                return inputStreamReader.read(cbuf, off, len);
                    }
                }

                private final Charset charset() {
/* 1 */             MediaType mediaTypeContentType = get$contentType();
/* 11 */            Charset charset = mediaTypeContentType == null ? null : mediaTypeContentType.charset(Charsets.UTF_8);
                    return charset == null ? Charsets.UTF_8 : charset;
                }

                private final <T> T consumeSource(Function1<? super BufferedSource, ? extends T> consumer, Function1<? super T, Integer> sizeMapper) throws IOException {
/* 1 */             long jContentLength = get$contentLength();
/* 11 */            if (jContentLength > 2147483647L) {
/* 68 */                ds0.m3195l(Intrinsics.m6219d(Long.valueOf(jContentLength), "Cannot buffer entire body for content length: "));
/* 10 */                return null;
                    }
/* 13 */            BufferedSource bufferedSourceSource = get$this_asResponseBody();
                    try {
/* 17 */                T t = (T) consumer.invoke(bufferedSourceSource);
/* 21 */                jb1.m5754n(bufferedSourceSource, null);
/* 30 */                int iIntValue = ((Number) sizeMapper.invoke(t)).intValue();
/* 38 */                if (jContentLength == -1 || jContentLength == iIntValue) {
/* 50 */                    return t;
                        }
/* 46 */                f42.m3650f(iIntValue, jContentLength);
/* 10 */                return null;
                    } catch (Throwable th) {
                        try {
/* 52 */                    throw th;
                        } catch (Throwable th2) {
/* 54 */                    jb1.m5754n(bufferedSourceSource, th);
/* 57 */                    throw th2;
                        }
                    }
                }

                public static final ResponseBody create(String str, MediaType mediaType) {
/* 3 */             return INSTANCE.create(str, mediaType);
                }

                public final InputStream byteStream() {
/* 5 */             return get$this_asResponseBody().inputStream();
                }

                public final ByteString byteString() throws IOException {
/* 1 */             long jContentLength = get$contentLength();
/* 11 */            if (jContentLength > 2147483647L) {
/* 62 */                ds0.m3195l(Intrinsics.m6219d(Long.valueOf(jContentLength), "Cannot buffer entire body for content length: "));
/* 10 */                return null;
                    }
/* 13 */            BufferedSource bufferedSourceSource = get$this_asResponseBody();
                    try {
/* 17 */                ByteString byteString = bufferedSourceSource.readByteString();
/* 21 */                jb1.m5754n(bufferedSourceSource, null);
/* 24 */                int size = byteString.size();
/* 32 */                if (jContentLength == -1 || jContentLength == size) {
/* 44 */                    return byteString;
                        }
/* 40 */                f42.m3650f(size, jContentLength);
/* 10 */                return null;
                    } catch (Throwable th) {
                        try {
/* 46 */                    throw th;
                        } catch (Throwable th2) {
/* 48 */                    jb1.m5754n(bufferedSourceSource, th);
/* 51 */                    throw th2;
                        }
                    }
                }

                public final byte[] bytes() throws IOException {
/* 1 */             long jContentLength = get$contentLength();
/* 11 */            if (jContentLength > 2147483647L) {
/* 59 */                ds0.m3195l(Intrinsics.m6219d(Long.valueOf(jContentLength), "Cannot buffer entire body for content length: "));
/* 10 */                return null;
                    }
/* 13 */            BufferedSource bufferedSourceSource = get$this_asResponseBody();
                    try {
/* 17 */                byte[] byteArray = bufferedSourceSource.readByteArray();
/* 21 */                jb1.m5754n(bufferedSourceSource, null);
/* 24 */                int length = byteArray.length;
/* 29 */                if (jContentLength == -1 || jContentLength == length) {
/* 41 */                    return byteArray;
                        }
/* 37 */                f42.m3650f(length, jContentLength);
/* 10 */                return null;
                    } catch (Throwable th) {
                        try {
/* 43 */                    throw th;
                        } catch (Throwable th2) {
/* 45 */                    jb1.m5754n(bufferedSourceSource, th);
/* 48 */                    throw th2;
                        }
                    }
                }

                public final Reader charStream() {
/* 1 */             Reader reader = this.reader;
/* 3 */             if (reader != null) {
/* 20 */                return reader;
                    }
/* 15 */            BomAwareReader bomAwareReader = new BomAwareReader(get$this_asResponseBody(), charset());
/* 18 */            this.reader = bomAwareReader;
/* 20 */            return bomAwareReader;
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
/* 5 */             Util.closeQuietly(get$this_asResponseBody());
                }

                /* JADX INFO: renamed from: contentLength */
                public abstract long get$contentLength();

                /* JADX INFO: renamed from: contentType */
                public abstract MediaType get$contentType();

                /* JADX INFO: renamed from: source */
                public abstract BufferedSource get$this_asResponseBody();

                public final String string() throws IOException {
/* 1 */             BufferedSource bufferedSourceSource = get$this_asResponseBody();
                    try {
/* 13 */                String string = bufferedSourceSource.readString(Util.readBomAsCharset(bufferedSourceSource, charset()));
/* 18 */                jb1.m5754n(bufferedSourceSource, null);
/* 21 */                return string;
                    } catch (Throwable th) {
                        try {
/* 23 */                    throw th;
                        } catch (Throwable th2) {
/* 25 */                    jb1.m5754n(bufferedSourceSource, th);
/* 28 */                    throw th2;
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\fH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\rH\u0007J'\u0010\u000e\u001a\u00020\u0004*\u00020\u000b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003¨\u0006\u0010"}, m6176d2 = {"Lokhttp3/ResponseBody$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "create", "Lokhttp3/ResponseBody;", "contentType", "Lokhttp3/MediaType;", "content", HttpUrl.FRAGMENT_ENCODE_SET, "contentLength", HttpUrl.FRAGMENT_ENCODE_SET, "Lokio/BufferedSource;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokio/ByteString;", "asResponseBody", "toResponseBody", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public static /* synthetic */ ResponseBody create$default(Companion companion, BufferedSource bufferedSource, MediaType mediaType, long j, int i, Object obj) {
/* 3 */                 if ((i & 1) != 0) {
/* 5 */                     mediaType = null;
                        }
/* 8 */                 if ((i & 2) != 0) {
/* 10 */                    j = -1;
                        }
/* 12 */                return companion.create(bufferedSource, mediaType, j);
                    }

                    public final ResponseBody create(String str, MediaType mediaType) {
/* 1 */                 str.getClass();
/* 4 */                 Charset charset = Charsets.UTF_8;
/* 6 */                 if (mediaType != null) {
/* 10 */                    Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
/* 14 */                    if (charsetCharset$default == null) {
/* 35 */                        mediaType = MediaType.INSTANCE.parse(mediaType + "; charset=utf-8");
                            } else {
/* 40 */                        charset = charsetCharset$default;
                            }
                        }
/* 46 */                Buffer bufferWriteString = new Buffer().writeString(str, charset);
/* 54 */                return create(bufferWriteString, mediaType, bufferWriteString.size());
                    }

/* 4 */             private Companion() {
                    }

/* 16 */            public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
                        if ((i & 1) != 0) {
                            mediaType = null;
                        }
/* 17 */                return companion.create(bArr, mediaType);
                    }

/* 17 */            public static /* synthetic */ ResponseBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i, Object obj) {
                        if ((i & 1) != 0) {
                            mediaType = null;
                        }
/* 18 */                return companion.create(byteString, mediaType);
                    }

/* 18 */            public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
                        if ((i & 1) != 0) {
                            mediaType = null;
                        }
/* 19 */                return companion.create(str, mediaType);
                    }

/* 58 */            public final ResponseBody create(byte[] bArr, MediaType mediaType) {
                        bArr.getClass();
/* 61 */                return create(new Buffer().write(bArr), mediaType, bArr.length);
                    }

/* 61 */            public final ResponseBody create(ByteString byteString, MediaType mediaType) {
                        byteString.getClass();
/* 64 */                return create(new Buffer().write(byteString), mediaType, byteString.size());
                    }

/* 64 */            public final ResponseBody create(final BufferedSource bufferedSource, final MediaType mediaType, final long j) {
                        bufferedSource.getClass();
/* 65 */                return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                            @Override // okhttp3.ResponseBody
                            /* JADX INFO: renamed from: contentLength, reason: from getter */
                            public long get$contentLength() {
/* 1 */                         return j;
                            }

                            @Override // okhttp3.ResponseBody
                            /* JADX INFO: renamed from: contentType, reason: from getter */
                            public MediaType get$contentType() {
/* 1 */                         return mediaType;
                            }

                            @Override // okhttp3.ResponseBody
                            /* JADX INFO: renamed from: source, reason: from getter */
                            public BufferedSource get$this_asResponseBody() {
/* 1 */                         return bufferedSource;
                            }
                        };
                    }

/* 65 */            public final ResponseBody create(MediaType contentType, String content) {
                        content.getClass();
/* 66 */                return create(content, contentType);
                    }

/* 66 */            public final ResponseBody create(MediaType contentType, byte[] content) {
                        content.getClass();
/* 67 */                return create(content, contentType);
                    }

/* 67 */            public final ResponseBody create(MediaType contentType, ByteString content) {
                        content.getClass();
/* 68 */                return create(content, contentType);
                    }

/* 68 */            public final ResponseBody create(MediaType contentType, long contentLength, BufferedSource content) {
                        content.getClass();
/* 69 */                return create(content, contentType, contentLength);
                    }
                }

/* 7 */         public static final ResponseBody create(MediaType mediaType, long j, BufferedSource bufferedSource) {
/* 8 */             return INSTANCE.create(mediaType, j, bufferedSource);
                }

/* 8 */         public static final ResponseBody create(MediaType mediaType, String str) {
/* 9 */             return INSTANCE.create(mediaType, str);
                }

/* 9 */         public static final ResponseBody create(MediaType mediaType, ByteString byteString) {
/* 10 */            return INSTANCE.create(mediaType, byteString);
                }

/* 10 */        public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
/* 11 */            return INSTANCE.create(mediaType, bArr);
                }

/* 11 */        public static final ResponseBody create(BufferedSource bufferedSource, MediaType mediaType, long j) {
/* 12 */            return INSTANCE.create(bufferedSource, mediaType, j);
                }

/* 12 */        public static final ResponseBody create(ByteString byteString, MediaType mediaType) {
/* 13 */            return INSTANCE.create(byteString, mediaType);
                }

/* 13 */        public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
/* 14 */            return INSTANCE.create(bArr, mediaType);
                }
            }
