            package okhttp3;

            import java.io.File;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.nio.charset.Charset;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.text.Charsets;
            import okhttp3.internal.Util;
            import okio.BufferedSink;
            import okio.ByteString;
            import okio.Okio;
            import okio.Source;
            import p000.jb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000f"}, m6176d2 = {"Lokhttp3/RequestBody;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "contentLength", HttpUrl.FRAGMENT_ENCODE_SET, "contentType", "Lokhttp3/MediaType;", "isDuplex", HttpUrl.FRAGMENT_ENCODE_SET, "isOneShot", "writeTo", HttpUrl.FRAGMENT_ENCODE_SET, "sink", "Lokio/BufferedSink;", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public abstract class RequestBody {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                public static final RequestBody create(File file, MediaType mediaType) {
/* 3 */             return INSTANCE.create(file, mediaType);
                }

                public long contentLength() throws IOException {
/* 1 */             return -1L;
                }

                /* JADX INFO: renamed from: contentType */
                public abstract MediaType get$contentType();

                public boolean isDuplex() {
/* 1 */             return false;
                }

                public boolean isOneShot() {
/* 1 */             return false;
                }

                public abstract void writeTo(BufferedSink sink) throws IOException;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J.\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u000eH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u000fH\u0007J\u001d\u0010\u0010\u001a\u00020\u0004*\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J1\u0010\u0011\u001a\u00020\u0004*\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u0011\u001a\u00020\u0004*\u00020\u000e2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u0011\u001a\u00020\u0004*\u00020\u000f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003¨\u0006\u0012"}, m6176d2 = {"Lokhttp3/RequestBody$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "create", "Lokhttp3/RequestBody;", "contentType", "Lokhttp3/MediaType;", "file", "Ljava/io/File;", "content", HttpUrl.FRAGMENT_ENCODE_SET, "offset", HttpUrl.FRAGMENT_ENCODE_SET, "byteCount", HttpUrl.FRAGMENT_ENCODE_SET, "Lokio/ByteString;", "asRequestBody", "toRequestBody", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, int i2, int i3, Object obj) {
/* 3 */                 if ((i3 & 1) != 0) {
/* 5 */                     mediaType = null;
                        }
/* 8 */                 if ((i3 & 2) != 0) {
/* 10 */                    i = 0;
                        }
/* 13 */                if ((i3 & 4) != 0) {
/* 15 */                    i2 = bArr.length;
                        }
/* 16 */                return companion.create(bArr, mediaType, i, i2);
                    }

                    public final RequestBody create(String str, MediaType mediaType) {
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
/* 41 */                byte[] bytes = str.getBytes(charset);
/* 45 */                bytes.getClass();
/* 50 */                return create(bytes, mediaType, 0, bytes.length);
                    }

/* 4 */             private Companion() {
                    }

/* 20 */            public static /* synthetic */ RequestBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i, Object obj) {
                        if ((i & 1) != 0) {
                            mediaType = null;
                        }
/* 21 */                return companion.create(byteString, mediaType);
                    }

/* 21 */            public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
                        if ((i & 1) != 0) {
                            mediaType = null;
                        }
/* 22 */                return companion.create(str, mediaType);
                    }

/* 22 */            public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i, Object obj) {
                        if ((i & 1) != 0) {
                            mediaType = null;
                        }
/* 23 */                return companion.create(file, mediaType);
                    }

/* 23 */            public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i, int i2, int i3, Object obj) {
                        if ((i3 & 4) != 0) {
                            i = 0;
                        }
                        if ((i3 & 8) != 0) {
/* 24 */                    i2 = bArr.length;
                        }
/* 25 */                return companion.create(mediaType, bArr, i, i2);
                    }

/* 54 */            public final RequestBody create(MediaType mediaType, byte[] bArr, int i) {
/* 55 */                bArr.getClass();
                        return create$default(this, mediaType, bArr, i, 0, 8, (Object) null);
                    }

/* 55 */            public final RequestBody create(byte[] bArr) {
/* 56 */                bArr.getClass();
                        return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
                    }

/* 56 */            public final RequestBody create(byte[] bArr, MediaType mediaType) {
/* 57 */                bArr.getClass();
                        return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
                    }

/* 57 */            public final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
/* 58 */                bArr.getClass();
                        return create$default(this, bArr, mediaType, i, 0, 4, (Object) null);
                    }

/* 58 */            public final RequestBody create(MediaType mediaType, byte[] bArr) {
/* 59 */                bArr.getClass();
                        return create$default(this, mediaType, bArr, 0, 0, 12, (Object) null);
                    }

/* 59 */            public final RequestBody create(final ByteString byteString, final MediaType mediaType) {
                        byteString.getClass();
/* 60 */                return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                            @Override // okhttp3.RequestBody
                            public long contentLength() {
/* 7 */                         return byteString.size();
                            }

                            @Override // okhttp3.RequestBody
                            /* JADX INFO: renamed from: contentType, reason: from getter */
                            public MediaType get$contentType() {
/* 1 */                         return mediaType;
                            }

                            @Override // okhttp3.RequestBody
                            public void writeTo(BufferedSink sink) throws IOException {
/* 1 */                         sink.getClass();
/* 6 */                         sink.write(byteString);
                            }
                        };
                    }

/* 60 */            public final RequestBody create(final byte[] bArr, final MediaType mediaType, final int i, final int i2) {
                        bArr.getClass();
/* 61 */                Util.checkOffsetAndCount(bArr.length, i, i2);
/* 62 */                return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                            @Override // okhttp3.RequestBody
                            public long contentLength() {
/* 3 */                         return i2;
                            }

                            @Override // okhttp3.RequestBody
                            /* JADX INFO: renamed from: contentType, reason: from getter */
                            public MediaType get$contentType() {
/* 1 */                         return mediaType;
                            }

                            @Override // okhttp3.RequestBody
                            public void writeTo(BufferedSink sink) throws IOException {
/* 1 */                         sink.getClass();
/* 10 */                        sink.write(bArr, i, i2);
                            }
                        };
                    }

/* 62 */            public final RequestBody create(final File file, final MediaType mediaType) {
                        file.getClass();
/* 63 */                return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                            @Override // okhttp3.RequestBody
                            public long contentLength() {
/* 3 */                         return file.length();
                            }

                            @Override // okhttp3.RequestBody
                            /* JADX INFO: renamed from: contentType, reason: from getter */
                            public MediaType get$contentType() {
/* 1 */                         return mediaType;
                            }

                            @Override // okhttp3.RequestBody
                            public void writeTo(BufferedSink sink) throws FileNotFoundException {
/* 1 */                         sink.getClass();
/* 6 */                         Source source = Okio.source(file);
                                try {
/* 10 */                            sink.writeAll(source);
/* 14 */                            jb1.m5754n(source, null);
                                } catch (Throwable th) {
                                    try {
/* 19 */                                throw th;
                                    } catch (Throwable th2) {
/* 21 */                                jb1.m5754n(source, th);
/* 24 */                                throw th2;
                                    }
                                }
                            }
                        };
                    }

/* 63 */            public final RequestBody create(MediaType contentType, String content) {
                        content.getClass();
/* 64 */                return create(content, contentType);
                    }

/* 64 */            public final RequestBody create(MediaType contentType, ByteString content) {
                        content.getClass();
/* 65 */                return create(content, contentType);
                    }

/* 65 */            public final RequestBody create(MediaType contentType, byte[] content, int offset, int byteCount) {
                        content.getClass();
/* 66 */                return create(content, contentType, offset, byteCount);
                    }

/* 66 */            public final RequestBody create(MediaType contentType, File file) {
                        file.getClass();
/* 67 */                return create(file, contentType);
                    }
                }

/* 7 */         public static final RequestBody create(String str, MediaType mediaType) {
/* 8 */             return INSTANCE.create(str, mediaType);
                }

/* 8 */         public static final RequestBody create(MediaType mediaType, File file) {
/* 9 */             return INSTANCE.create(mediaType, file);
                }

/* 9 */         public static final RequestBody create(MediaType mediaType, String str) {
/* 10 */            return INSTANCE.create(mediaType, str);
                }

/* 10 */        public static final RequestBody create(MediaType mediaType, ByteString byteString) {
/* 11 */            return INSTANCE.create(mediaType, byteString);
                }

/* 11 */        public static final RequestBody create(MediaType mediaType, byte[] bArr) {
/* 12 */            return INSTANCE.create(mediaType, bArr);
                }

/* 12 */        public static final RequestBody create(MediaType mediaType, byte[] bArr, int i) {
/* 13 */            return INSTANCE.create(mediaType, bArr, i);
                }

/* 13 */        public static final RequestBody create(MediaType mediaType, byte[] bArr, int i, int i2) {
/* 14 */            return INSTANCE.create(mediaType, bArr, i, i2);
                }

/* 14 */        public static final RequestBody create(ByteString byteString, MediaType mediaType) {
/* 15 */            return INSTANCE.create(byteString, mediaType);
                }

/* 15 */        public static final RequestBody create(byte[] bArr) {
/* 16 */            return INSTANCE.create(bArr);
                }

/* 16 */        public static final RequestBody create(byte[] bArr, MediaType mediaType) {
/* 17 */            return INSTANCE.create(bArr, mediaType);
                }

/* 17 */        public static final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
/* 18 */            return INSTANCE.create(bArr, mediaType, i);
                }

/* 18 */        public static final RequestBody create(byte[] bArr, MediaType mediaType, int i, int i2) {
/* 19 */            return INSTANCE.create(bArr, mediaType, i, i2);
                }
            }
