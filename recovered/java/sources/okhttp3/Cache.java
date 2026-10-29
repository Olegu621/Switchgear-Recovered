            package okhttp3;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import java.io.Closeable;
            import java.io.File;
            import java.io.Flushable;
            import java.io.IOException;
            import java.security.cert.Certificate;
            import java.security.cert.CertificateEncodingException;
            import java.security.cert.CertificateException;
            import java.security.cert.CertificateFactory;
            import java.util.ArrayList;
            import java.util.Comparator;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            import java.util.TreeSet;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            import okhttp3.internal.Util;
            import okhttp3.internal.cache.CacheRequest;
            import okhttp3.internal.cache.CacheStrategy;
            import okhttp3.internal.cache.DiskLruCache;
            import okhttp3.internal.concurrent.TaskRunner;
            import okhttp3.internal.http.HttpMethod;
            import okhttp3.internal.http.StatusLine;
            import okhttp3.internal.p012io.FileSystem;
            import okhttp3.internal.platform.Platform;
            import okio.Buffer;
            import okio.BufferedSink;
            import okio.BufferedSource;
            import okio.ByteString;
            import okio.ForwardingSink;
            import okio.ForwardingSource;
            import okio.Okio;
            import okio.Sink;
            import okio.Source;
            import p000.C1951n4;
            import p000.ds0;
            import p000.f42;
            import p000.jb1;
            import p000.nd0;
            import p000.qd0;
            import p000.r21;
            import p000.rh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0004BCDEB\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0018\u00010\"R\u00020\fH\u0002J\b\u0010#\u001a\u00020 H\u0016J\u0006\u0010$\u001a\u00020 J\r\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b%J\u0006\u0010&\u001a\u00020 J\b\u0010'\u001a\u00020 H\u0016J\u0017\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b,J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010-\u001a\u00020 J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u0011J\u0017\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020)H\u0000¢\u0006\u0002\b1J\u0015\u00102\u001a\u00020 2\u0006\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b3J\u0006\u0010\u0016\u001a\u00020\u0011J\u0006\u00104\u001a\u00020\u0006J\r\u00105\u001a\u00020 H\u0000¢\u0006\u0002\b6J\u0015\u00107\u001a\u00020 2\u0006\u00108\u001a\u000209H\u0000¢\u0006\u0002\b:J\u001d\u0010;\u001a\u00020 2\u0006\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020)H\u0000¢\u0006\u0002\b>J\f\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@J\u0006\u0010\u0017\u001a\u00020\u0011J\u0006\u0010\u001c\u001a\u00020\u0011R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b¨\u0006F"}, m6176d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "directory", "Ljava/io/File;", "maxSize", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/io/File;J)V", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "(Ljava/io/File;JLokhttp3/internal/io/FileSystem;)V", "cache", "Lokhttp3/internal/cache/DiskLruCache;", "getCache$okhttp", "()Lokhttp3/internal/cache/DiskLruCache;", "()Ljava/io/File;", "hitCount", HttpUrl.FRAGMENT_ENCODE_SET, "isClosed", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "networkCount", "requestCount", "writeAbortCount", "getWriteAbortCount$okhttp", "()I", "setWriteAbortCount$okhttp", "(I)V", "writeSuccessCount", "getWriteSuccessCount$okhttp", "setWriteSuccessCount$okhttp", "abortQuietly", HttpUrl.FRAGMENT_ENCODE_SET, "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "close", "delete", "-deprecated_directory", "evictAll", "flush", "get", "Lokhttp3/Response;", "request", "Lokhttp3/Request;", "get$okhttp", "initialize", "put", "Lokhttp3/internal/cache/CacheRequest;", "response", "put$okhttp", "remove", "remove$okhttp", "size", "trackConditionalCacheHit", "trackConditionalCacheHit$okhttp", "trackResponse", "cacheStrategy", "Lokhttp3/internal/cache/CacheStrategy;", "trackResponse$okhttp", "update", "cached", "network", "update$okhttp", "urls", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "CacheResponseBody", "Companion", "Entry", "RealCacheRequest", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class Cache implements Closeable, Flushable {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final int ENTRY_BODY = 1;
                private static final int ENTRY_COUNT = 2;
                private static final int ENTRY_METADATA = 0;
                private static final int VERSION = 201105;
                private final DiskLruCache cache;
                private int hitCount;
                private int networkCount;
                private int requestCount;
                private int writeAbortCount;
                private int writeSuccessCount;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u0007\u001a\u00020\rH\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m6176d2 = {"Lokhttp3/Cache$CacheResponseBody;", "Lokhttp3/ResponseBody;", "snapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "contentType", HttpUrl.FRAGMENT_ENCODE_SET, "contentLength", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;Ljava/lang/String;Ljava/lang/String;)V", "bodySource", "Lokio/BufferedSource;", "getSnapshot", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/MediaType;", FirebaseAnalytics.Param.SOURCE, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class CacheResponseBody extends ResponseBody {
                    private final BufferedSource bodySource;
                    private final String contentLength;
                    private final String contentType;
                    private final DiskLruCache.Snapshot snapshot;

                    public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
/* 1 */                 snapshot.getClass();
/* 7 */                 this.snapshot = snapshot;
/* 9 */                 this.contentType = str;
/* 11 */                this.contentLength = str2;
/* 27 */                this.bodySource = Okio.buffer(new ForwardingSource(this) { // from class: okhttp3.Cache.CacheResponseBody.1
                            final /* synthetic */ CacheResponseBody this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
/* 5 */                         super(this.$source);
/* 3 */                         this.this$0 = this;
                            }

                            @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
                            public void close() throws IOException {
/* 7 */                         this.this$0.getSnapshot().close();
/* 10 */                        super.close();
                            }
                        });
                    }

                    @Override // okhttp3.ResponseBody
                    /* JADX INFO: renamed from: contentLength */
                    public long getContentLength() {
/* 1 */                 String str = this.contentLength;
/* 5 */                 if (str == null) {
/* 3 */                     return -1L;
                        }
/* 8 */                 return Util.toLongOrDefault(str, -1L);
                    }

                    @Override // okhttp3.ResponseBody
                    /* JADX INFO: renamed from: contentType */
                    public MediaType get$contentType() {
/* 1 */                 String str = this.contentType;
/* 3 */                 if (str == null) {
/* 5 */                     return null;
                        }
/* 9 */                 return MediaType.INSTANCE.parse(str);
                    }

                    public final DiskLruCache.Snapshot getSnapshot() {
/* 1 */                 return this.snapshot;
                    }

                    @Override // okhttp3.ResponseBody
                    /* JADX INFO: renamed from: source, reason: from getter */
                    public BufferedSource getSource() {
/* 1 */                 return this.bodySource;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0012\u0010\u0002\u001a\u00060\u0003R\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m6176d2 = {"Lokhttp3/Cache$RealCacheRequest;", "Lokhttp3/internal/cache/CacheRequest;", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "(Lokhttp3/Cache;Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "body", "Lokio/Sink;", "cacheOut", "done", HttpUrl.FRAGMENT_ENCODE_SET, "getDone", "()Z", "setDone", "(Z)V", "abort", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public final class RealCacheRequest implements CacheRequest {
                    private final Sink body;
                    private final Sink cacheOut;
                    private boolean done;
                    private final DiskLruCache.Editor editor;
                    final /* synthetic */ Cache this$0;

                    public RealCacheRequest(final Cache cache, DiskLruCache.Editor editor) {
/* 1 */                 cache.getClass();
/* 4 */                 editor.getClass();
/* 7 */                 this.this$0 = cache;
/* 12 */                this.editor = editor;
/* 15 */                Sink sinkNewSink = editor.newSink(1);
/* 19 */                this.cacheOut = sinkNewSink;
/* 26 */                this.body = new ForwardingSink(sinkNewSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                            @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                            public void close() throws IOException {
/* 1 */                         Cache cache2 = cache;
/* 3 */                         RealCacheRequest realCacheRequest = this;
                                synchronized (cache2) {
/* 10 */                            if (realCacheRequest.getDone()) {
/* 13 */                                return;
                                    }
/* 15 */                            realCacheRequest.setDone(true);
/* 23 */                            cache2.setWriteSuccessCount$okhttp(cache2.getWriteSuccessCount() + 1);
/* 27 */                            super.close();
/* 36 */                            this.editor.commit();
                                }
                            }
                        };
                    }

                    @Override // okhttp3.internal.cache.CacheRequest
                    public void abort() {
/* 1 */                 Cache cache = this.this$0;
                        synchronized (cache) {
/* 8 */                     if (getDone()) {
/* 11 */                        return;
                            }
/* 13 */                    setDone(true);
/* 21 */                    cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount() + 1);
/* 27 */                    Util.closeQuietly(this.cacheOut);
                            try {
/* 32 */                        this.editor.abort();
                            } catch (IOException unused) {
                            }
                        }
                    }

                    @Override // okhttp3.internal.cache.CacheRequest
                    /* JADX INFO: renamed from: body, reason: from getter */
                    public Sink getBody() {
/* 1 */                 return this.body;
                    }

                    public final boolean getDone() {
/* 1 */                 return this.done;
                    }

                    public final void setDone(boolean z) {
/* 1 */                 this.done = z;
                    }
                }

                /* JADX INFO: renamed from: okhttp3.Cache$urls$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000'\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\t\u001a\u00020\u0004H\u0096\u0002J\t\u0010\n\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m6176d2 = {"okhttp3/Cache$urls$1", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "canRemove", HttpUrl.FRAGMENT_ENCODE_SET, "delegate", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "nextUrl", "hasNext", "next", "remove", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class C20071 implements Iterator<String>, r21 {
                    private boolean canRemove;
                    private final Iterator<DiskLruCache.Snapshot> delegate;
                    private String nextUrl;

                    public C20071() {
/* 14 */                this.delegate = Cache.this.getCache().snapshots();
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
/* 4 */                 if (this.nextUrl != null) {
/* 3 */                     return true;
                        }
/* 8 */                 this.canRemove = false;
/* 16 */                while (this.delegate.hasNext()) {
                            try {
/* 20 */                        DiskLruCache.Snapshot next = this.delegate.next();
                                try {
                                    continue;
/* 41 */                            this.nextUrl = Okio.buffer(next.getSource(0)).readUtf8LineStrict();
/* 44 */                            jb1.m5754n(next, null);
/* 3 */                             return true;
                                } catch (Throwable th) {
                                    try {
                                        continue;
/* 49 */                                throw th;
                                    } catch (Throwable th2) {
/* 51 */                                jb1.m5754n(next, th);
/* 54 */                                throw th2;
                                    }
                                }
                            } catch (IOException unused) {
                            }
                        }
/* 7 */                 return false;
                    }

                    @Override // java.util.Iterator
                    public String next() {
/* 6 */                 if (!hasNext()) {
/* 19 */                    C1951n4.m6864o();
/* 5 */                     return null;
                        }
/* 8 */                 String str = this.nextUrl;
/* 10 */                str.getClass();
/* 13 */                this.nextUrl = null;
/* 16 */                this.canRemove = true;
/* 18 */                return str;
                    }

                    @Override // java.util.Iterator
                    public void remove() {
/* 3 */                 if (this.canRemove) {
/* 7 */                     this.delegate.remove();
                        } else {
/* 13 */                    f42.m3656l("remove() before next()");
                        }
                    }
                }

                public Cache(File file, long j, FileSystem fileSystem) {
/* 1 */             file.getClass();
/* 4 */             fileSystem.getClass();
/* 24 */            this.cache = new DiskLruCache(fileSystem, file, VERSION, 2, j, TaskRunner.INSTANCE);
                }

                private final void abortQuietly(DiskLruCache.Editor editor) {
/* 1 */             if (editor == null) {
/* 3 */                 return;
                    }
                    try {
/* 4 */                 editor.abort();
                    } catch (IOException unused) {
                    }
                }

                public static final String key(HttpUrl httpUrl) {
/* 3 */             return INSTANCE.key(httpUrl);
                }

                /* JADX INFO: renamed from: -deprecated_directory, reason: not valid java name */
                public final File m10511deprecated_directory() {
/* 3 */             return this.cache.getDirectory();
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
/* 3 */             this.cache.close();
                }

                public final void delete() throws IOException {
/* 3 */             this.cache.delete();
                }

                public final File directory() {
/* 3 */             return this.cache.getDirectory();
                }

                public final void evictAll() throws IOException {
/* 3 */             this.cache.evictAll();
                }

                @Override // java.io.Flushable
                public void flush() throws IOException {
/* 3 */             this.cache.flush();
                }

                public final Response get$okhttp(Request request) {
/* 1 */             request.getClass();
                    try {
/* 17 */                DiskLruCache.Snapshot snapshot = this.cache.get(INSTANCE.key(request.url()));
/* 21 */                if (snapshot == null) {
/* 14 */                    return null;
                        }
                        try {
/* 31 */                    Entry entry = new Entry(snapshot.getSource(0));
/* 34 */                    Response response = entry.response(snapshot);
/* 42 */                    if (entry.matches(request, response)) {
/* 55 */                        return response;
                            }
/* 44 */                    ResponseBody responseBodyBody = response.body();
/* 48 */                    if (responseBodyBody != null) {
/* 51 */                        Util.closeQuietly(responseBodyBody);
                            }
/* 14 */                    return null;
                        } catch (IOException unused) {
/* 56 */                    Util.closeQuietly(snapshot);
/* 14 */                    return null;
                        }
                    } catch (IOException unused2) {
                    }
                }

                /* JADX INFO: renamed from: getCache$okhttp, reason: from getter */
                public final DiskLruCache getCache() {
/* 1 */             return this.cache;
                }

                /* JADX INFO: renamed from: getWriteAbortCount$okhttp, reason: from getter */
                public final int getWriteAbortCount() {
/* 1 */             return this.writeAbortCount;
                }

                /* JADX INFO: renamed from: getWriteSuccessCount$okhttp, reason: from getter */
                public final int getWriteSuccessCount() {
/* 1 */             return this.writeSuccessCount;
                }

                public final synchronized int hitCount() {
/* 2 */             return this.hitCount;
                }

                public final void initialize() throws IOException {
/* 3 */             this.cache.initialize();
                }

                public final boolean isClosed() {
/* 3 */             return this.cache.isClosed();
                }

                public final long maxSize() {
/* 3 */             return this.cache.getMaxSize();
                }

                public final synchronized int networkCount() {
/* 2 */             return this.networkCount;
                }

                public final CacheRequest put$okhttp(Response response) {
                    DiskLruCache.Editor editorEdit$default;
/* 1 */             response.getClass();
/* 8 */             String strMethod = response.request().method();
/* 27 */            if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
                        try {
/* 33 */                    remove$okhttp(response.request());
                        } catch (IOException unused) {
                        }
/* 26 */                return null;
                    }
/* 43 */            if (!Intrinsics.m6216a(strMethod, "GET")) {
/* 26 */                return null;
                    }
/* 46 */            Companion companion = INSTANCE;
/* 52 */            if (companion.hasVaryAll(response)) {
/* 26 */                return null;
                    }
/* 57 */            Entry entry = new Entry(response);
                    try {
/* 78 */                editorEdit$default = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
/* 82 */                if (editorEdit$default == null) {
/* 26 */                    return null;
                        }
                        try {
/* 85 */                    entry.writeTo(editorEdit$default);
/* 90 */                    return new RealCacheRequest(this, editorEdit$default);
                        } catch (IOException unused2) {
/* 95 */                    abortQuietly(editorEdit$default);
/* 26 */                    return null;
                        }
                    } catch (IOException unused3) {
/* 94 */                editorEdit$default = null;
                    }
                }

                public final void remove$okhttp(Request request) throws IOException {
/* 1 */             request.getClass();
/* 16 */            this.cache.remove(INSTANCE.key(request.url()));
                }

                public final synchronized int requestCount() {
/* 2 */             return this.requestCount;
                }

                public final void setWriteAbortCount$okhttp(int i) {
/* 1 */             this.writeAbortCount = i;
                }

                public final void setWriteSuccessCount$okhttp(int i) {
/* 1 */             this.writeSuccessCount = i;
                }

                public final long size() throws IOException {
/* 3 */             return this.cache.size();
                }

                public final synchronized void trackConditionalCacheHit$okhttp() {
/* 6 */             this.hitCount++;
                }

                public final synchronized void trackResponse$okhttp(CacheStrategy cacheStrategy) {
                    try {
/* 2 */                 cacheStrategy.getClass();
/* 9 */                 this.requestCount++;
/* 15 */                if (cacheStrategy.getNetworkRequest() != null) {
/* 21 */                    this.networkCount++;
                        } else if (cacheStrategy.getCacheResponse() != null) {
/* 36 */                    this.hitCount++;
                        }
                    } catch (Throwable th) {
/* 41 */                throw th;
                    }
                }

                public final void update$okhttp(Response cached, Response network) {
                    DiskLruCache.Editor editorEdit;
/* 1 */             cached.getClass();
/* 4 */             network.getClass();
/* 9 */             Entry entry = new Entry(network);
/* 12 */            ResponseBody responseBodyBody = cached.body();
/* 16 */            if (responseBodyBody == null) {
/* 45 */                C1951n4.m6868s("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
/* 48 */                return;
                    }
                    try {
/* 24 */                editorEdit = ((CacheResponseBody) responseBodyBody).getSnapshot().edit();
/* 28 */                if (editorEdit == null) {
/* 30 */                    return;
                        }
                        try {
/* 31 */                    entry.writeTo(editorEdit);
/* 34 */                    editorEdit.commit();
                        } catch (IOException unused) {
/* 39 */                    abortQuietly(editorEdit);
                        }
                    } catch (IOException unused2) {
/* 38 */                editorEdit = null;
                    }
                }

                public final Iterator<String> urls() throws IOException {
/* 3 */             return new C20071();
                }

                public final synchronized int writeAbortCount() {
/* 2 */             return this.writeAbortCount;
                }

                public final synchronized int writeSuccessCount() {
/* 2 */             return this.writeSuccessCount;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aJ\n\u0010\u001b\u001a\u00020\u0015*\u00020\u0017J\u0012\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001d*\u00020\u0011H\u0002J\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m6176d2 = {"Lokhttp3/Cache$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "ENTRY_BODY", HttpUrl.FRAGMENT_ENCODE_SET, "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "key", HttpUrl.FRAGMENT_ENCODE_SET, "url", "Lokhttp3/HttpUrl;", "readInt", FirebaseAnalytics.Param.SOURCE, "Lokio/BufferedSource;", "readInt$okhttp", "varyHeaders", "Lokhttp3/Headers;", "requestHeaders", "responseHeaders", "varyMatches", HttpUrl.FRAGMENT_ENCODE_SET, "cachedResponse", "Lokhttp3/Response;", "cachedRequest", "newRequest", "Lokhttp3/Request;", "hasVaryAll", "varyFields", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    private final Set<String> varyFields(Headers headers) {
/* 1 */                 int size = headers.size();
/* 5 */                 TreeSet treeSet = null;
/* 7 */                 int i = 0;
/* 8 */                 while (i < size) {
/* 10 */                    int i2 = i + 1;
/* 22 */                    if ("Vary".equalsIgnoreCase(headers.name(i))) {
/* 26 */                        String strValue = headers.value(i);
/* 30 */                        if (treeSet == null) {
/* 36 */                            rh2.f16075a.getClass();
/* 39 */                            Comparator comparator = String.CASE_INSENSITIVE_ORDER;
/* 41 */                            comparator.getClass();
/* 44 */                            treeSet = new TreeSet(comparator);
                                }
/* 58 */                        Iterator it = StringsKt.m6235K(strValue, new char[]{','}).iterator();
/* 66 */                        while (it.hasNext()) {
/* 82 */                            treeSet.add(StringsKt.m6239O((String) it.next()).toString());
                                }
                            }
/* 24 */                    i = i2;
                        }
                        return treeSet == null ? qd0.f15493a : treeSet;
                    }

                    private final Headers varyHeaders(Headers requestHeaders, Headers responseHeaders) {
/* 1 */                 Set<String> setVaryFields = varyFields(responseHeaders);
/* 9 */                 if (setVaryFields.isEmpty()) {
/* 11 */                    return Util.EMPTY_HEADERS;
                        }
/* 16 */                Headers.Builder builder = new Headers.Builder();
/* 19 */                int size = requestHeaders.size();
/* 23 */                int i = 0;
/* 24 */                while (i < size) {
/* 26 */                    int i2 = i + 1;
/* 28 */                    String strName = requestHeaders.name(i);
/* 36 */                    if (setVaryFields.contains(strName)) {
/* 42 */                        builder.add(strName, requestHeaders.value(i));
                            }
/* 45 */                    i = i2;
                        }
/* 47 */                return builder.build();
                    }

                    public final boolean hasVaryAll(Response response) {
/* 1 */                 response.getClass();
/* 14 */                return varyFields(response.headers()).contains("*");
                    }

                    public final String key(HttpUrl url) {
/* 1 */                 url.getClass();
/* 18 */                return ByteString.INSTANCE.encodeUtf8(url.getUrl()).md5().hex();
                    }

                    public final int readInt$okhttp(BufferedSource source) throws IOException {
/* 3 */                 source.getClass();
                        try {
/* 6 */                     long decimalLong = source.readDecimalLong();
/* 10 */                    String utf8LineStrict = source.readUtf8LineStrict();
/* 18 */                    if (decimalLong >= 0 && decimalLong <= 2147483647L && utf8LineStrict.length() <= 0) {
/* 33 */                        return (int) decimalLong;
                            }
/* 60 */                    throw new IOException("expected an int but was \"" + decimalLong + utf8LineStrict + '\"');
                        } catch (NumberFormatException e) {
/* 66 */                    ds0.m3195l(e.getMessage());
/* 69 */                    return 0;
                        }
                    }

                    public final boolean varyMatches(Response cachedResponse, Headers cachedRequest, Request newRequest) {
/* 1 */                 cachedResponse.getClass();
/* 4 */                 cachedRequest.getClass();
/* 7 */                 newRequest.getClass();
/* 14 */                Set<String> setVaryFields = varyFields(cachedResponse.headers());
/* 19 */                if (setVaryFields != null && setVaryFields.isEmpty()) {
/* 18 */                    return true;
                        }
/* 36 */                for (String str : setVaryFields) {
/* 56 */                    if (!Intrinsics.m6216a(cachedRequest.values(str), newRequest.headers(str))) {
/* 58 */                        return false;
                            }
                        }
/* 18 */                return true;
                    }

/* 4 */             private Companion() {
                    }

/* 51 */            public final Headers varyHeaders(Response response) {
                        response.getClass();
/* 52 */                Response responseNetworkResponse = response.networkResponse();
                        responseNetworkResponse.getClass();
/* 54 */                return varyHeaders(responseNetworkResponse.request().headers(), response.headers());
                    }
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 26 */        public Cache(File file, long j) {
/* 27 */            this(file, j, FileSystem.SYSTEM);
                    file.getClass();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 /2\u00020\u0001:\u0001/B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#H\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\n\u0010$\u001a\u00060%R\u00020&J\u001e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\u0012\u0010,\u001a\u00020(2\n\u0010-\u001a\u00060.R\u00020&R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m6176d2 = {"Lokhttp3/Cache$Entry;", HttpUrl.FRAGMENT_ENCODE_SET, "rawSource", "Lokio/Source;", "(Lokio/Source;)V", "response", "Lokhttp3/Response;", "(Lokhttp3/Response;)V", "code", HttpUrl.FRAGMENT_ENCODE_SET, "handshake", "Lokhttp3/Handshake;", "isHttps", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "message", HttpUrl.FRAGMENT_ENCODE_SET, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, "Lokhttp3/Protocol;", "receivedResponseMillis", HttpUrl.FRAGMENT_ENCODE_SET, "requestMethod", "responseHeaders", "Lokhttp3/Headers;", "sentRequestMillis", "url", "Lokhttp3/HttpUrl;", "varyHeaders", "matches", "request", "Lokhttp3/Request;", "readCertificateList", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/security/cert/Certificate;", FirebaseAnalytics.Param.SOURCE, "Lokio/BufferedSource;", "snapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "writeCertList", HttpUrl.FRAGMENT_ENCODE_SET, "sink", "Lokio/BufferedSink;", "certificates", "writeTo", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 280 */       public static final class Entry {
                    private static final String RECEIVED_MILLIS;
                    private static final String SENT_MILLIS;
                    private final int code;
                    private final Handshake handshake;
                    private final String message;
                    private final Protocol protocol;
                    private final long receivedResponseMillis;
                    private final String requestMethod;
                    private final Headers responseHeaders;
                    private final long sentRequestMillis;
                    private final HttpUrl url;
                    private final Headers varyHeaders;

                    static {
/* 9 */                 Platform.Companion companion = Platform.INSTANCE;
/* 25 */                SENT_MILLIS = Intrinsics.m6219d("-Sent-Millis", companion.get().getPrefix());
/* 41 */                RECEIVED_MILLIS = Intrinsics.m6219d("-Received-Millis", companion.get().getPrefix());
                    }

                    public Entry(Source source) throws IOException {
/* 1 */                 source.getClass();
                        try {
/* 7 */                     BufferedSource bufferedSourceBuffer = Okio.buffer(source);
/* 11 */                    String utf8LineStrict = bufferedSourceBuffer.readUtf8LineStrict();
/* 17 */                    HttpUrl httpUrl = HttpUrl.INSTANCE.parse(utf8LineStrict);
/* 21 */                    if (httpUrl == null) {
/* 260 */                       IOException iOException = new IOException(Intrinsics.m6219d(utf8LineStrict, "Cache corruption for "));
/* 272 */                       Platform.INSTANCE.get().log("cache corruption", 5, iOException);
/* 275 */                       throw iOException;
                            }
/* 23 */                    this.url = httpUrl;
/* 29 */                    this.requestMethod = bufferedSourceBuffer.readUtf8LineStrict();
/* 33 */                    Headers.Builder builder = new Headers.Builder();
/* 38 */                    int int$okhttp = Cache.INSTANCE.readInt$okhttp(bufferedSourceBuffer);
/* 42 */                    int i = 0;
/* 43 */                    int i2 = 0;
/* 44 */                    while (i2 < int$okhttp) {
/* 46 */                        i2++;
/* 52 */                        builder.addLenient$okhttp(bufferedSourceBuffer.readUtf8LineStrict());
                            }
/* 63 */                    this.varyHeaders = builder.build();
/* 71 */                    StatusLine statusLine = StatusLine.INSTANCE.parse(bufferedSourceBuffer.readUtf8LineStrict());
/* 77 */                    this.protocol = statusLine.protocol;
/* 81 */                    this.code = statusLine.code;
/* 85 */                    this.message = statusLine.message;
/* 89 */                    Headers.Builder builder2 = new Headers.Builder();
/* 94 */                    int int$okhttp2 = Cache.INSTANCE.readInt$okhttp(bufferedSourceBuffer);
/* 98 */                    while (i < int$okhttp2) {
/* 100 */                       i++;
/* 106 */                       builder2.addLenient$okhttp(bufferedSourceBuffer.readUtf8LineStrict());
                            }
/* 110 */                   String str = SENT_MILLIS;
/* 112 */                   String str2 = builder2.get(str);
/* 116 */                   String str3 = RECEIVED_MILLIS;
/* 118 */                   String str4 = builder2.get(str3);
/* 122 */                   builder2.removeAll(str);
/* 125 */                   builder2.removeAll(str3);
/* 128 */                   long j = 0;
/* 138 */                   this.sentRequestMillis = str2 == null ? 0L : Long.parseLong(str2);
/* 140 */                   if (str4 != null) {
/* 143 */                       j = Long.parseLong(str4);
                            }
/* 147 */                   this.receivedResponseMillis = j;
/* 153 */                   this.responseHeaders = builder2.build();
/* 160 */                   if (isHttps()) {
/* 162 */                       String utf8LineStrict2 = bufferedSourceBuffer.readUtf8LineStrict();
/* 170 */                       if (utf8LineStrict2.length() > 0) {
/* 245 */                           throw new IOException("expected \"\" but was \"" + utf8LineStrict2 + '\"');
                                }
/* 215 */                       this.handshake = Handshake.INSTANCE.get(!bufferedSourceBuffer.exhausted() ? TlsVersion.INSTANCE.forJavaName(bufferedSourceBuffer.readUtf8LineStrict()) : TlsVersion.SSL_3_0, CipherSuite.INSTANCE.forJavaName(bufferedSourceBuffer.readUtf8LineStrict()), readCertificateList(bufferedSourceBuffer), readCertificateList(bufferedSourceBuffer));
                            } else {
/* 246 */                       this.handshake = null;
                            }
/* 248 */                   jb1.m5754n(source, null);
                        } catch (Throwable th) {
                            try {
/* 276 */                       throw th;
                            } catch (Throwable th2) {
/* 278 */                       jb1.m5754n(source, th);
/* 281 */                       throw th2;
                            }
                        }
                    }

                    private final boolean isHttps() {
/* 9 */                 return Intrinsics.m6216a(this.url.scheme(), "https");
                    }

                    private final List<Certificate> readCertificateList(BufferedSource source) throws IOException {
/* 3 */                 int int$okhttp = Cache.INSTANCE.readInt$okhttp(source);
/* 8 */                 if (int$okhttp == -1) {
/* 10 */                    return nd0.f14189a;
                        }
                        try {
/* 15 */                    CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
/* 21 */                    ArrayList arrayList = new ArrayList(int$okhttp);
/* 24 */                    int i = 0;
/* 25 */                    while (i < int$okhttp) {
/* 27 */                        i++;
/* 29 */                        String utf8LineStrict = source.readUtf8LineStrict();
/* 35 */                        Buffer buffer = new Buffer();
/* 40 */                        ByteString byteStringDecodeBase64 = ByteString.INSTANCE.decodeBase64(utf8LineStrict);
/* 44 */                        byteStringDecodeBase64.getClass();
/* 47 */                        buffer.write(byteStringDecodeBase64);
/* 58 */                        arrayList.add(certificateFactory.generateCertificate(buffer.inputStream()));
                            }
/* 62 */                    return arrayList;
                        } catch (CertificateException e) {
/* 68 */                    ds0.m3195l(e.getMessage());
/* 71 */                    return null;
                        }
                    }

                    private final void writeCertList(BufferedSink sink, List<? extends Certificate> certificates) throws IOException {
                        try {
/* 12 */                    sink.writeDecimalLong(certificates.size()).writeByte(10);
/* 15 */                    Iterator<? extends Certificate> it = certificates.iterator();
/* 23 */                    while (it.hasNext()) {
/* 31 */                        byte[] encoded = it.next().getEncoded();
/* 35 */                        ByteString.Companion companion = ByteString.INSTANCE;
/* 37 */                        encoded.getClass();
/* 56 */                        sink.writeUtf8(ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).base64()).writeByte(10);
                            }
                        } catch (CertificateEncodingException e) {
/* 67 */                    ds0.m3195l(e.getMessage());
                        }
                    }

                    public final boolean matches(Request request, Response response) {
/* 1 */                 request.getClass();
/* 4 */                 response.getClass();
                        return Intrinsics.m6216a(this.url, request.url()) && Intrinsics.m6216a(this.requestMethod, request.method()) && Cache.INSTANCE.varyMatches(response, this.varyHeaders, request);
                    }

                    public final Response response(DiskLruCache.Snapshot snapshot) {
/* 1 */                 snapshot.getClass();
/* 8 */                 String str = this.responseHeaders.get("Content-Type");
/* 16 */                String str2 = this.responseHeaders.get("Content-Length");
/* 108 */               return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
                    }

                    public final void writeTo(DiskLruCache.Editor editor) throws IOException {
/* 1 */                 editor.getClass();
/* 9 */                 BufferedSink bufferedSinkBuffer = Okio.buffer(editor.newSink(0));
                        try {
/* 25 */                    bufferedSinkBuffer.writeUtf8(this.url.getUrl()).writeByte(10);
/* 34 */                    bufferedSinkBuffer.writeUtf8(this.requestMethod).writeByte(10);
/* 48 */                    bufferedSinkBuffer.writeDecimalLong(this.varyHeaders.size()).writeByte(10);
/* 53 */                    int size = this.varyHeaders.size();
/* 57 */                    int i = 0;
/* 60 */                    while (i < size) {
/* 62 */                        int i2 = i + 1;
/* 88 */                        bufferedSinkBuffer.writeUtf8(this.varyHeaders.name(i)).writeUtf8(": ").writeUtf8(this.varyHeaders.value(i)).writeByte(10);
/* 91 */                        i = i2;
                            }
/* 115 */                   bufferedSinkBuffer.writeUtf8(new StatusLine(this.protocol, this.code, this.message).toString()).writeByte(10);
/* 131 */                   bufferedSinkBuffer.writeDecimalLong(this.responseHeaders.size() + 2).writeByte(10);
/* 136 */                   int size2 = this.responseHeaders.size();
/* 140 */                   for (int i3 = 0; i3 < size2; i3++) {
/* 168 */                       bufferedSinkBuffer.writeUtf8(this.responseHeaders.name(i3)).writeUtf8(": ").writeUtf8(this.responseHeaders.value(i3)).writeByte(10);
                            }
/* 189 */                   bufferedSinkBuffer.writeUtf8(SENT_MILLIS).writeUtf8(": ").writeDecimalLong(this.sentRequestMillis).writeByte(10);
/* 208 */                   bufferedSinkBuffer.writeUtf8(RECEIVED_MILLIS).writeUtf8(": ").writeDecimalLong(this.receivedResponseMillis).writeByte(10);
/* 215 */                   if (isHttps()) {
/* 217 */                       bufferedSinkBuffer.writeByte(10);
/* 220 */                       Handshake handshake = this.handshake;
/* 222 */                       handshake.getClass();
/* 237 */                       bufferedSinkBuffer.writeUtf8(handshake.cipherSuite().javaName()).writeByte(10);
/* 246 */                       writeCertList(bufferedSinkBuffer, this.handshake.peerCertificates());
/* 255 */                       writeCertList(bufferedSinkBuffer, this.handshake.localCertificates());
/* 272 */                       bufferedSinkBuffer.writeUtf8(this.handshake.tlsVersion().javaName()).writeByte(10);
                            }
/* 276 */                   jb1.m5754n(bufferedSinkBuffer, null);
                        } catch (Throwable th) {
                            try {
/* 280 */                       throw th;
                            } catch (Throwable th2) {
/* 282 */                       jb1.m5754n(bufferedSinkBuffer, th);
/* 285 */                       throw th2;
                            }
                        }
                    }

/* 281 */           public Entry(Response response) {
                        response.getClass();
/* 283 */               this.url = response.request().url();
/* 284 */               this.varyHeaders = Cache.INSTANCE.varyHeaders(response);
/* 285 */               this.requestMethod = response.request().method();
/* 286 */               this.protocol = response.protocol();
/* 287 */               this.code = response.code();
/* 288 */               this.message = response.message();
/* 289 */               this.responseHeaders = response.headers();
/* 290 */               this.handshake = response.handshake();
/* 291 */               this.sentRequestMillis = response.sentRequestAtMillis();
/* 292 */               this.receivedResponseMillis = response.receivedResponseAtMillis();
                    }
                }
            }
