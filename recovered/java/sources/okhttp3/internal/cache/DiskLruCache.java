            package okhttp3.internal.cache;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.Closeable;
            import java.io.EOFException;
            import java.io.File;
            import java.io.FileNotFoundException;
            import java.io.Flushable;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import kotlin.text.Regex;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import okhttp3.internal.Util;
            import okhttp3.internal.concurrent.Task;
            import okhttp3.internal.concurrent.TaskQueue;
            import okhttp3.internal.concurrent.TaskRunner;
            import okhttp3.internal.p012io.FileSystem;
            import okhttp3.internal.platform.Platform;
            import okio.BufferedSink;
            import okio.BufferedSource;
            import okio.ForwardingSource;
            import okio.Okio;
            import okio.Sink;
            import okio.Source;
            import p000.C1951n4;
            import p000.ds0;
            import p000.f42;
            import p000.jb1;
            import p000.r21;
            import p000.s80;
            import p000.w41;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010)\n\u0002\b\u0007*\u0001\u0014\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0004[\\]^B7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u000209H\u0016J!\u0010;\u001a\u0002092\n\u0010<\u001a\u00060=R\u00020\u00002\u0006\u0010>\u001a\u00020\u0010H\u0000¢\u0006\u0002\b?J\u0006\u0010@\u001a\u000209J \u0010A\u001a\b\u0018\u00010=R\u00020\u00002\u0006\u0010B\u001a\u00020(2\b\b\u0002\u0010C\u001a\u00020\u000bH\u0007J\u0006\u0010D\u001a\u000209J\b\u0010E\u001a\u000209H\u0016J\u0017\u0010F\u001a\b\u0018\u00010GR\u00020\u00002\u0006\u0010B\u001a\u00020(H\u0086\u0002J\u0006\u0010H\u001a\u000209J\u0006\u0010I\u001a\u00020\u0010J\b\u0010J\u001a\u00020\u0010H\u0002J\b\u0010K\u001a\u00020%H\u0002J\b\u0010L\u001a\u000209H\u0002J\b\u0010M\u001a\u000209H\u0002J\u0010\u0010N\u001a\u0002092\u0006\u0010O\u001a\u00020(H\u0002J\r\u0010P\u001a\u000209H\u0000¢\u0006\u0002\bQJ\u000e\u0010R\u001a\u00020\u00102\u0006\u0010B\u001a\u00020(J\u0019\u0010S\u001a\u00020\u00102\n\u0010T\u001a\u00060)R\u00020\u0000H\u0000¢\u0006\u0002\bUJ\b\u0010V\u001a\u00020\u0010H\u0002J\u0006\u00105\u001a\u00020\u000bJ\u0010\u0010W\u001a\f\u0012\b\u0012\u00060GR\u00020\u00000XJ\u0006\u0010Y\u001a\u000209J\u0010\u0010Z\u001a\u0002092\u0006\u0010B\u001a\u00020(H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(\u0012\b\u0012\u00060)R\u00020\u00000'X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R&\u0010\n\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u00101\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006_"}, m6176d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "directory", "Ljava/io/File;", "appVersion", HttpUrl.FRAGMENT_ENCODE_SET, "valueCount", "maxSize", HttpUrl.FRAGMENT_ENCODE_SET, "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "civilizedFileSystem", HttpUrl.FRAGMENT_ENCODE_SET, "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupTask", "okhttp3/internal/cache/DiskLruCache$cleanupTask$1", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "closed", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "getDirectory", "()Ljava/io/File;", "getFileSystem$okhttp", "()Lokhttp3/internal/io/FileSystem;", "hasJournalErrors", "initialized", "journalFile", "journalFileBackup", "journalFileTmp", "journalWriter", "Lokio/BufferedSink;", "lruEntries", "Ljava/util/LinkedHashMap;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", FirebaseAnalytics.Param.VALUE, "getMaxSize", "()J", "setMaxSize", "(J)V", "mostRecentRebuildFailed", "mostRecentTrimFailed", "nextSequenceNumber", "redundantOpCount", "size", "getValueCount$okhttp", "()I", "checkNotClosed", HttpUrl.FRAGMENT_ENCODE_SET, "close", "completeEdit", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "success", "completeEdit$okhttp", "delete", "edit", "key", "expectedSequenceNumber", "evictAll", "flush", "get", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "initialize", "isClosed", "journalRebuildRequired", "newJournalWriter", "processJournal", "readJournal", "readJournalLine", "line", "rebuildJournal", "rebuildJournal$okhttp", "remove", "removeEntry", "entry", "removeEntry$okhttp", "removeOldestEntry", "snapshots", HttpUrl.FRAGMENT_ENCODE_SET, "trimToSize", "validateKey", "Companion", "Editor", "Entry", "Snapshot", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 146 */   public final class DiskLruCache implements Closeable, Flushable {
                private final int appVersion;
                private boolean civilizedFileSystem;
                private final TaskQueue cleanupQueue;
                private final DiskLruCache$cleanupTask$1 cleanupTask;
                private boolean closed;
                private final File directory;
                private final FileSystem fileSystem;
                private boolean hasJournalErrors;
                private boolean initialized;
                private final File journalFile;
                private final File journalFileBackup;
                private final File journalFileTmp;
                private BufferedSink journalWriter;
                private final LinkedHashMap<String, Entry> lruEntries;
                private long maxSize;
                private boolean mostRecentRebuildFailed;
                private boolean mostRecentTrimFailed;
                private long nextSequenceNumber;
                private int redundantOpCount;
                private long size;
                private final int valueCount;
                public static final String JOURNAL_FILE = "journal";
                public static final String JOURNAL_FILE_TEMP = "journal.tmp";
                public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
                public static final String MAGIC = "libcore.io.DiskLruCache";
                public static final String VERSION_1 = "1";
                public static final long ANY_SEQUENCE_NUMBER = -1;
                public static final Regex LEGAL_KEY_PATTERN = new Regex("[a-z0-9_-]{1,120}");
                public static final String CLEAN = "CLEAN";
                public static final String DIRTY = "DIRTY";
                public static final String REMOVE = "REMOVE";
                public static final String READ = "READ";

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\r\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u00060\u0003R\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m6176d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", HttpUrl.FRAGMENT_ENCODE_SET, "entry", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "done", HttpUrl.FRAGMENT_ENCODE_SET, "getEntry$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "written", HttpUrl.FRAGMENT_ENCODE_SET, "getWritten$okhttp", "()[Z", "abort", HttpUrl.FRAGMENT_ENCODE_SET, "commit", "detach", "detach$okhttp", "newSink", "Lokio/Sink;", FirebaseAnalytics.Param.INDEX, HttpUrl.FRAGMENT_ENCODE_SET, "newSource", "Lokio/Source;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public final class Editor {
                    private boolean done;
                    private final Entry entry;
                    final /* synthetic */ DiskLruCache this$0;
                    private final boolean[] written;

                    public Editor(DiskLruCache diskLruCache, Entry entry) {
/* 1 */                 diskLruCache.getClass();
/* 4 */                 entry.getClass();
/* 7 */                 this.this$0 = diskLruCache;
/* 12 */                this.entry = entry;
/* 28 */                this.written = entry.getReadable() ? null : new boolean[diskLruCache.getValueCount()];
                    }

                    public final void abort() throws IOException {
/* 1 */                 DiskLruCache diskLruCache = this.this$0;
                        synchronized (diskLruCache) {
                            try {
/* 6 */                         if (this.done) {
/* 41 */                            throw new IllegalStateException("Check failed.");
                                }
/* 20 */                        if (Intrinsics.m6216a(getEntry().getCurrentEditor(), this)) {
/* 23 */                            diskLruCache.completeEdit$okhttp(this, false);
                                }
/* 30 */                        this.done = true;
                            } catch (Throwable th) {
/* 43 */                        throw th;
                            }
                        }
                    }

                    public final void commit() throws IOException {
/* 1 */                 DiskLruCache diskLruCache = this.this$0;
                        synchronized (diskLruCache) {
                            try {
/* 6 */                         if (this.done) {
/* 40 */                            throw new IllegalStateException("Check failed.");
                                }
/* 21 */                        if (Intrinsics.m6216a(getEntry().getCurrentEditor(), this)) {
/* 23 */                            diskLruCache.completeEdit$okhttp(this, true);
                                }
/* 29 */                        this.done = true;
                            } catch (Throwable th) {
/* 42 */                        throw th;
                            }
                        }
                    }

                    public final void detach$okhttp() throws IOException {
/* 11 */                if (Intrinsics.m6216a(this.entry.getCurrentEditor(), this)) {
/* 19 */                    if (this.this$0.civilizedFileSystem) {
/* 24 */                        this.this$0.completeEdit$okhttp(this, false);
                            } else {
/* 31 */                        this.entry.setZombie$okhttp(true);
                            }
                        }
                    }

                    /* JADX INFO: renamed from: getEntry$okhttp, reason: from getter */
                    public final Entry getEntry() {
/* 1 */                 return this.entry;
                    }

                    /* JADX INFO: renamed from: getWritten$okhttp, reason: from getter */
                    public final boolean[] getWritten() {
/* 1 */                 return this.written;
                    }

                    public final Sink newSink(int index) {
/* 1 */                 DiskLruCache diskLruCache = this.this$0;
                        synchronized (diskLruCache) {
/* 6 */                     if (this.done) {
/* 97 */                        throw new IllegalStateException("Check failed.");
                            }
/* 20 */                    if (!Intrinsics.m6216a(getEntry().getCurrentEditor(), this)) {
/* 22 */                        return Okio.blackhole();
                            }
/* 38 */                    if (!getEntry().getReadable()) {
/* 40 */                        boolean[] written = getWritten();
/* 44 */                        written.getClass();
/* 48 */                        written[index] = true;
                            }
                            try {
/* 79 */                        return new FaultHidingSink(diskLruCache.getFileSystem().sink(getEntry().getDirtyFiles$okhttp().get(index)), new DiskLruCache$Editor$newSink$1$1(diskLruCache, this));
                            } catch (FileNotFoundException unused) {
/* 84 */                        return Okio.blackhole();
                            }
                        }
                    }

                    public final Source newSource(int index) {
/* 1 */                 DiskLruCache diskLruCache = this.this$0;
                        synchronized (diskLruCache) {
/* 6 */                     if (this.done) {
/* 80 */                        throw new IllegalStateException("Check failed.");
                            }
/* 16 */                    Source source = null;
/* 17 */                    if (!getEntry().getReadable() || !Intrinsics.m6216a(getEntry().getCurrentEditor(), this) || getEntry().getZombie()) {
/* 16 */                        return null;
                            }
                            try {
/* 62 */                        source = diskLruCache.getFileSystem().source(getEntry().getCleanFiles$okhttp().get(index));
                            } catch (FileNotFoundException unused) {
                            }
/* 70 */                    return source;
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010.\u001a\u00020/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000301H\u0002J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u001aH\u0002J\u001b\u00105\u001a\u0002062\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000301H\u0000¢\u0006\u0002\b7J\u0013\u00108\u001a\b\u0018\u000109R\u00020\fH\u0000¢\u0006\u0002\b:J\u0015\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020=H\u0000¢\u0006\u0002\b>R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0018\u00010\u000bR\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$¨\u0006?"}, m6176d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", HttpUrl.FRAGMENT_ENCODE_SET, "key", HttpUrl.FRAGMENT_ENCODE_SET, "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "cleanFiles", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/io/File;", "getCleanFiles$okhttp", "()Ljava/util/List;", "currentEditor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "getCurrentEditor$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "setCurrentEditor$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "dirtyFiles", "getDirtyFiles$okhttp", "getKey$okhttp", "()Ljava/lang/String;", "lengths", HttpUrl.FRAGMENT_ENCODE_SET, "getLengths$okhttp", "()[J", "lockingSourceCount", HttpUrl.FRAGMENT_ENCODE_SET, "getLockingSourceCount$okhttp", "()I", "setLockingSourceCount$okhttp", "(I)V", "readable", HttpUrl.FRAGMENT_ENCODE_SET, "getReadable$okhttp", "()Z", "setReadable$okhttp", "(Z)V", "sequenceNumber", HttpUrl.FRAGMENT_ENCODE_SET, "getSequenceNumber$okhttp", "()J", "setSequenceNumber$okhttp", "(J)V", "zombie", "getZombie$okhttp", "setZombie$okhttp", "invalidLengths", HttpUrl.FRAGMENT_ENCODE_SET, "strings", HttpUrl.FRAGMENT_ENCODE_SET, "newSource", "Lokio/Source;", FirebaseAnalytics.Param.INDEX, "setLengths", HttpUrl.FRAGMENT_ENCODE_SET, "setLengths$okhttp", "snapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot$okhttp", "writeLengths", "writer", "Lokio/BufferedSink;", "writeLengths$okhttp", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public final class Entry {
                    private final List<File> cleanFiles;
                    private Editor currentEditor;
                    private final List<File> dirtyFiles;
                    private final String key;
                    private final long[] lengths;
                    private int lockingSourceCount;
                    private boolean readable;
                    private long sequenceNumber;
                    final /* synthetic */ DiskLruCache this$0;
                    private boolean zombie;

                    public Entry(DiskLruCache diskLruCache, String str) {
/* 1 */                 diskLruCache.getClass();
/* 4 */                 str.getClass();
/* 7 */                 this.this$0 = diskLruCache;
/* 12 */                this.key = str;
/* 20 */                this.lengths = new long[diskLruCache.getValueCount()];
/* 27 */                this.cleanFiles = new ArrayList();
/* 34 */                this.dirtyFiles = new ArrayList();
/* 38 */                StringBuilder sb = new StringBuilder(str);
/* 43 */                sb.append('.');
/* 46 */                int length = sb.length();
/* 50 */                int valueCount = diskLruCache.getValueCount();
/* 55 */                for (int i = 0; i < valueCount; i++) {
/* 59 */                    sb.append(i);
/* 79 */                    this.cleanFiles.add(new File(this.this$0.getDirectory(), sb.toString()));
/* 84 */                    sb.append(".tmp");
/* 104 */                   this.dirtyFiles.add(new File(this.this$0.getDirectory(), sb.toString()));
/* 107 */                   sb.setLength(length);
                        }
                    }

                    private final Void invalidLengths(List<String> strings) throws IOException {
/* 12 */                throw new IOException(Intrinsics.m6219d(strings, "unexpected journal line: "));
                    }

                    private final Source newSource(int index) throws FileNotFoundException {
/* 15 */                final Source source = this.this$0.getFileSystem().source(this.cleanFiles.get(index));
/* 25 */                if (this.this$0.civilizedFileSystem) {
/* 27 */                    return source;
                        }
/* 32 */                this.lockingSourceCount++;
/* 36 */                final DiskLruCache diskLruCache = this.this$0;
/* 38 */                return new ForwardingSource(diskLruCache, this) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                            private boolean closed;
                            final /* synthetic */ DiskLruCache this$0;
                            final /* synthetic */ DiskLruCache.Entry this$1;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
/* 7 */                         super(this.$fileSource);
/* 3 */                         this.this$0 = diskLruCache;
/* 5 */                         this.this$1 = this;
                            }

                            @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
                            public void close() throws IOException {
/* 1 */                         super.close();
/* 6 */                         if (this.closed) {
/* 47 */                            return;
                                }
/* 9 */                         this.closed = true;
/* 11 */                        DiskLruCache diskLruCache2 = this.this$0;
/* 13 */                        DiskLruCache.Entry entry = this.this$1;
                                synchronized (diskLruCache2) {
/* 22 */                            entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount() - 1);
/* 29 */                            if (entry.getLockingSourceCount() == 0 && entry.getZombie()) {
/* 37 */                                diskLruCache2.removeEntry$okhttp(entry);
                                    }
                                }
                            }
                        };
                    }

                    public final List<File> getCleanFiles$okhttp() {
/* 1 */                 return this.cleanFiles;
                    }

                    /* JADX INFO: renamed from: getCurrentEditor$okhttp, reason: from getter */
                    public final Editor getCurrentEditor() {
/* 1 */                 return this.currentEditor;
                    }

                    public final List<File> getDirtyFiles$okhttp() {
/* 1 */                 return this.dirtyFiles;
                    }

                    /* JADX INFO: renamed from: getKey$okhttp, reason: from getter */
                    public final String getKey() {
/* 1 */                 return this.key;
                    }

                    /* JADX INFO: renamed from: getLengths$okhttp, reason: from getter */
                    public final long[] getLengths() {
/* 1 */                 return this.lengths;
                    }

                    /* JADX INFO: renamed from: getLockingSourceCount$okhttp, reason: from getter */
                    public final int getLockingSourceCount() {
/* 1 */                 return this.lockingSourceCount;
                    }

                    /* JADX INFO: renamed from: getReadable$okhttp, reason: from getter */
                    public final boolean getReadable() {
/* 1 */                 return this.readable;
                    }

                    /* JADX INFO: renamed from: getSequenceNumber$okhttp, reason: from getter */
                    public final long getSequenceNumber() {
/* 1 */                 return this.sequenceNumber;
                    }

                    /* JADX INFO: renamed from: getZombie$okhttp, reason: from getter */
                    public final boolean getZombie() {
/* 1 */                 return this.zombie;
                    }

                    public final void setCurrentEditor$okhttp(Editor editor) {
/* 1 */                 this.currentEditor = editor;
                    }

                    public final void setLengths$okhttp(List<String> strings) throws IOException {
/* 1 */                 strings.getClass();
/* 14 */                if (strings.size() != this.this$0.getValueCount()) {
/* 51 */                    invalidLengths(strings);
/* 59 */                    throw new w41();
                        }
                        try {
/* 16 */                    int size = strings.size();
/* 20 */                    int i = 0;
/* 21 */                    while (i < size) {
/* 23 */                        int i2 = i + 1;
/* 37 */                        this.lengths[i] = Long.parseLong(strings.get(i));
/* 39 */                        i = i2;
                            }
                        } catch (NumberFormatException unused) {
/* 42 */                    invalidLengths(strings);
/* 50 */                    throw new w41();
                        }
                    }

                    public final void setLockingSourceCount$okhttp(int i) {
/* 1 */                 this.lockingSourceCount = i;
                    }

                    public final void setReadable$okhttp(boolean z) {
/* 1 */                 this.readable = z;
                    }

                    public final void setSequenceNumber$okhttp(long j) {
/* 1 */                 this.sequenceNumber = j;
                    }

                    public final void setZombie$okhttp(boolean z) {
/* 1 */                 this.zombie = z;
                    }

                    public final Snapshot snapshot$okhttp() {
/* 1 */                 DiskLruCache diskLruCache = this.this$0;
/* 6 */                 if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
/* 25 */                    s80.m8422c(Thread.currentThread().getName(), " MUST hold lock on ", diskLruCache);
/* 5 */                     return null;
                        }
/* 31 */                if (!this.readable) {
/* 5 */                     return null;
                        }
/* 40 */                if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
/* 5 */                     return null;
                        }
/* 53 */                ArrayList arrayList = new ArrayList();
/* 63 */                long[] jArr = (long[]) this.lengths.clone();
                        try {
/* 67 */                    int valueCount = this.this$0.getValueCount();
/* 72 */                    for (int i = 0; i < valueCount; i++) {
/* 80 */                        arrayList.add(newSource(i));
                            }
/* 93 */                    return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
                        } catch (FileNotFoundException unused) {
/* 97 */                    Iterator it = arrayList.iterator();
/* 105 */                   while (it.hasNext()) {
/* 113 */                       Util.closeQuietly((Source) it.next());
                            }
                            try {
/* 119 */                       this.this$0.removeEntry$okhttp(this);
                            } catch (IOException unused2) {
                            }
/* 5 */                     return null;
                        }
                    }

                    public final void writeLengths$okhttp(BufferedSink writer) throws IOException {
/* 1 */                 writer.getClass();
/* 4 */                 long[] jArr = this.lengths;
/* 6 */                 int length = jArr.length;
/* 7 */                 int i = 0;
/* 8 */                 while (i < length) {
/* 10 */                    long j = jArr[i];
/* 12 */                    i++;
/* 20 */                    writer.writeByte(32).writeDecimalLong(j);
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\f\u0010\u000e\u001a\b\u0018\u00010\u000fR\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m6176d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "key", HttpUrl.FRAGMENT_ENCODE_SET, "sequenceNumber", HttpUrl.FRAGMENT_ENCODE_SET, "sources", HttpUrl.FRAGMENT_ENCODE_SET, "Lokio/Source;", "lengths", HttpUrl.FRAGMENT_ENCODE_SET, "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "close", HttpUrl.FRAGMENT_ENCODE_SET, "edit", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "getLength", FirebaseAnalytics.Param.INDEX, HttpUrl.FRAGMENT_ENCODE_SET, "getSource", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public final class Snapshot implements Closeable {
                    private final String key;
                    private final long[] lengths;
                    private final long sequenceNumber;
                    private final List<Source> sources;
                    final /* synthetic */ DiskLruCache this$0;

                    /* JADX WARN: Multi-variable type inference failed */
                    public Snapshot(DiskLruCache diskLruCache, String str, long j, List<? extends Source> list, long[] jArr) {
/* 1 */                 diskLruCache.getClass();
/* 4 */                 str.getClass();
/* 7 */                 list.getClass();
/* 10 */                jArr.getClass();
/* 13 */                this.this$0 = diskLruCache;
/* 18 */                this.key = str;
/* 20 */                this.sequenceNumber = j;
/* 22 */                this.sources = list;
/* 24 */                this.lengths = jArr;
                    }

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
/* 3 */                 Iterator<Source> it = this.sources.iterator();
/* 11 */                while (it.hasNext()) {
/* 19 */                    Util.closeQuietly(it.next());
                        }
                    }

                    public final Editor edit() throws IOException {
/* 7 */                 return this.this$0.edit(this.key, this.sequenceNumber);
                    }

                    public final long getLength(int index) {
/* 3 */                 return this.lengths[index];
                    }

                    public final Source getSource(int index) {
/* 3 */                 return this.sources.get(index);
                    }

                    /* JADX INFO: renamed from: key, reason: from getter */
                    public final String getKey() {
/* 1 */                 return this.key;
                    }
                }

                /* JADX INFO: renamed from: okhttp3.internal.cache.DiskLruCache$snapshots$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\r\u0010\u000b\u001a\u00060\u0002R\u00020\u0003H\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R$\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012 \u0006*\b\u0018\u00010\u0005R\u00020\u00030\u0005R\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0018\u00010\u0002R\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0018\u00010\u0002R\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m6176d2 = {"okhttp3/internal/cache/DiskLruCache$snapshots$1", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "delegate", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "kotlin.jvm.PlatformType", "nextSnapshot", "removeSnapshot", "hasNext", HttpUrl.FRAGMENT_ENCODE_SET, "next", "remove", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class C20101 implements Iterator<Snapshot>, r21 {
                    private final Iterator<Entry> delegate;
                    private Snapshot nextSnapshot;
                    private Snapshot removeSnapshot;

                    public C20101() {
/* 19 */                Iterator<Entry> it = new ArrayList(DiskLruCache.this.getLruEntries$okhttp().values()).iterator();
/* 23 */                it.getClass();
/* 26 */                this.delegate = it;
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
/* 4 */                 if (this.nextSnapshot != null) {
/* 3 */                     return true;
                        }
/* 7 */                 DiskLruCache diskLruCache = DiskLruCache.this;
                        synchronized (diskLruCache) {
/* 15 */                    if (diskLruCache.getClosed()) {
/* 14 */                        return false;
                            }
/* 25 */                    while (this.delegate.hasNext()) {
/* 29 */                        Entry next = this.delegate.next();
/* 39 */                        Snapshot snapshotSnapshot$okhttp = next == null ? null : next.snapshot$okhttp();
/* 43 */                        if (snapshotSnapshot$okhttp != null) {
/* 46 */                            this.nextSnapshot = snapshotSnapshot$okhttp;
/* 3 */                             return true;
                                }
                            }
/* 14 */                    return false;
                        }
                    }

                    @Override // java.util.Iterator
                    public Snapshot next() {
/* 6 */                 if (!hasNext()) {
/* 18 */                    C1951n4.m6864o();
/* 5 */                     return null;
                        }
/* 8 */                 Snapshot snapshot = this.nextSnapshot;
/* 10 */                this.removeSnapshot = snapshot;
/* 12 */                this.nextSnapshot = null;
/* 14 */                snapshot.getClass();
/* 17 */                return snapshot;
                    }

                    @Override // java.util.Iterator
                    public void remove() {
/* 1 */                 Snapshot snapshot = this.removeSnapshot;
/* 3 */                 if (snapshot == null) {
/* 27 */                    f42.m3656l("remove() before next()");
/* 30 */                    return;
                        }
                        try {
/* 12 */                    DiskLruCache.this.remove(snapshot.getKey());
                        } catch (IOException unused) {
                        } finally {
/* 19 */                    this.removeSnapshot = null;
                        }
                    }
                }

                /* JADX WARN: Type inference failed for: r5v3, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
                public DiskLruCache(FileSystem fileSystem, File file, int i, int i2, long j, TaskRunner taskRunner) {
/* 1 */             fileSystem.getClass();
/* 4 */             file.getClass();
/* 7 */             taskRunner.getClass();
/* 13 */            this.fileSystem = fileSystem;
/* 15 */            this.directory = file;
/* 17 */            this.appVersion = i;
/* 19 */            this.valueCount = i2;
/* 21 */            this.maxSize = j;
/* 32 */            this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
/* 38 */            this.cleanupQueue = taskRunner.newQueue();
/* 44 */            final String strM6219d = Intrinsics.m6219d(" Cache", Util.okHttpName);
/* 53 */            this.cleanupTask = new Task(strM6219d) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
/* 1 */                     DiskLruCache diskLruCache = this.this$0;
                            synchronized (diskLruCache) {
/* 10 */                        if (!diskLruCache.initialized || diskLruCache.getClosed()) {
/* 8 */                             return -1L;
                                }
                                try {
/* 20 */                            diskLruCache.trimToSize();
                                } catch (IOException unused) {
/* 1 */                             diskLruCache.mostRecentTrimFailed = true;
                                }
                                try {
/* 33 */                            if (diskLruCache.journalRebuildRequired()) {
/* 35 */                                diskLruCache.rebuildJournal$okhttp();
/* 1 */                                 diskLruCache.redundantOpCount = 0;
                                    }
                                } catch (IOException unused2) {
/* 1 */                             diskLruCache.mostRecentRebuildFailed = true;
/* 1 */                             diskLruCache.journalWriter = Okio.buffer(Okio.blackhole());
                                }
/* 8 */                         return -1L;
                            }
                        }
                    };
/* 60 */            if (j <= 0) {
/* 100 */               C1951n4.m6859j("maxSize <= 0");
/* 103 */               throw null;
                    }
/* 62 */            if (i2 <= 0) {
/* 94 */                C1951n4.m6859j("valueCount <= 0");
/* 97 */                throw null;
                    }
/* 71 */            this.journalFile = new File(file, JOURNAL_FILE);
/* 80 */            this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
/* 89 */            this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
                }

                private final synchronized void checkNotClosed() {
/* 4 */             if (this.closed) {
/* 15 */                throw new IllegalStateException("cache is closed");
                    }
                }

                public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j, int i, Object obj) throws IOException {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 j = ANY_SEQUENCE_NUMBER;
                    }
/* 7 */             return diskLruCache.edit(str, j);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final boolean journalRebuildRequired() {
/* 1 */             int i = this.redundantOpCount;
                    return i >= 2000 && i >= this.lruEntries.size();
                }

                private final BufferedSink newJournalWriter() throws FileNotFoundException {
/* 19 */            return Okio.buffer(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
                }

                private final void processJournal() throws IOException {
/* 5 */             this.fileSystem.delete(this.journalFileTmp);
/* 14 */            Iterator<Entry> it = this.lruEntries.values().iterator();
/* 22 */            while (it.hasNext()) {
/* 24 */                Entry next = it.next();
/* 28 */                next.getClass();
/* 31 */                Entry entry = next;
/* 37 */                int i = 0;
/* 38 */                if (entry.getCurrentEditor() == null) {
/* 40 */                    int i2 = this.valueCount;
/* 42 */                    while (i < i2) {
/* 55 */                        this.size += entry.getLengths()[i];
/* 44 */                        i++;
                            }
                        } else {
/* 60 */                    entry.setCurrentEditor$okhttp(null);
/* 63 */                    int i3 = this.valueCount;
/* 65 */                    while (i < i3) {
/* 81 */                        this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i));
/* 96 */                        this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i));
/* 67 */                        i++;
                            }
/* 101 */                   it.remove();
                        }
                    }
                }

                private final void readJournal() throws IOException {
/* 13 */            BufferedSource bufferedSourceBuffer = Okio.buffer(this.fileSystem.source(this.journalFile));
                    try {
/* 17 */                String utf8LineStrict = bufferedSourceBuffer.readUtf8LineStrict();
/* 21 */                String utf8LineStrict2 = bufferedSourceBuffer.readUtf8LineStrict();
/* 25 */                String utf8LineStrict3 = bufferedSourceBuffer.readUtf8LineStrict();
/* 29 */                String utf8LineStrict4 = bufferedSourceBuffer.readUtf8LineStrict();
/* 33 */                String utf8LineStrict5 = bufferedSourceBuffer.readUtf8LineStrict();
/* 43 */                if (!Intrinsics.m6216a(MAGIC, utf8LineStrict) || !Intrinsics.m6216a(VERSION_1, utf8LineStrict2) || !Intrinsics.m6216a(String.valueOf(this.appVersion), utf8LineStrict3) || !Intrinsics.m6216a(String.valueOf(getValueCount()), utf8LineStrict4) || utf8LineStrict5.length() > 0) {
/* 170 */                   throw new IOException("unexpected journal header: [" + utf8LineStrict + ", " + utf8LineStrict2 + ", " + utf8LineStrict4 + ", " + utf8LineStrict5 + ']');
                        }
/* 85 */                int i = 0;
                        while (true) {
                            try {
/* 90 */                        readJournalLine(bufferedSourceBuffer.readUtf8LineStrict());
/* 93 */                        i++;
                            } catch (EOFException unused) {
/* 107 */                       this.redundantOpCount = i - getLruEntries$okhttp().size();
/* 113 */                       if (bufferedSourceBuffer.exhausted()) {
/* 123 */                           this.journalWriter = newJournalWriter();
                                } else {
/* 115 */                           rebuildJournal$okhttp();
                                }
/* 126 */                       jb1.m5754n(bufferedSourceBuffer, null);
/* 129 */                       return;
                            }
                        }
                    } catch (Throwable th) {
                        try {
/* 171 */                   throw th;
                        } catch (Throwable th2) {
/* 173 */                   jb1.m5754n(bufferedSourceBuffer, th);
/* 176 */                   throw th2;
                        }
                    }
                }

                private final void readJournalLine(String line) throws IOException {
                    String strSubstring;
/* 5 */             int iM6226B = StringsKt.m6226B(line, ' ', 0, 6);
/* 12 */            if (iM6226B == -1) {
/* 166 */               ds0.m3195l(Intrinsics.m6219d(line, "unexpected journal line: "));
/* 169 */               return;
                    }
/* 14 */            int i = iM6226B + 1;
/* 17 */            int iM6226B2 = StringsKt.m6226B(line, ' ', i, 4);
/* 21 */            if (iM6226B2 == -1) {
/* 23 */                strSubstring = line.substring(i);
/* 27 */                String str = REMOVE;
/* 33 */                if (iM6226B == str.length() && C1852e.m6263m(line, str, false)) {
/* 43 */                    this.lruEntries.remove(strSubstring);
/* 46 */                    return;
                        }
                    } else {
/* 47 */                strSubstring = line.substring(i, iM6226B2);
                    }
/* 53 */            Entry entry = this.lruEntries.get(strSubstring);
/* 59 */            if (entry == null) {
/* 63 */                entry = new Entry(this, strSubstring);
/* 68 */                this.lruEntries.put(strSubstring, entry);
                    }
/* 71 */            if (iM6226B2 != -1) {
/* 73 */                String str2 = CLEAN;
/* 79 */                if (iM6226B == str2.length() && C1852e.m6263m(line, str2, false)) {
/* 97 */                    List<String> listM6235K = StringsKt.m6235K(line.substring(iM6226B2 + 1), new char[]{' '});
/* 101 */                   entry.setReadable$okhttp(true);
/* 105 */                   entry.setCurrentEditor$okhttp(null);
/* 108 */                   entry.setLengths$okhttp(listM6235K);
/* 111 */                   return;
                        }
                    }
/* 112 */           if (iM6226B2 == -1) {
/* 114 */               String str3 = DIRTY;
/* 120 */               if (iM6226B == str3.length() && C1852e.m6263m(line, str3, false)) {
/* 133 */                   entry.setCurrentEditor$okhttp(new Editor(this, entry));
/* 136 */                   return;
                        }
                    }
/* 137 */           if (iM6226B2 == -1) {
/* 139 */               String str4 = READ;
/* 145 */               if (iM6226B == str4.length() && C1852e.m6263m(line, str4, false)) {
/* 153 */                   return;
                        }
                    }
/* 158 */           ds0.m3195l(Intrinsics.m6219d(line, "unexpected journal line: "));
                }

                private final boolean removeOldestEntry() throws IOException {
/* 15 */            for (Entry entry : this.lruEntries.values()) {
/* 27 */                if (!entry.getZombie()) {
/* 29 */                    removeEntry$okhttp(entry);
/* 32 */                    return true;
                        }
                    }
/* 34 */            return false;
                }

                private final void validateKey(String key) {
/* 7 */             if (LEGAL_KEY_PATTERN.m6223b(key)) {
/* 9 */                 return;
                    }
/* 12 */            ds0.m3193j(key, "keys must match regex [a-z0-9_-]{1,120}: \"");
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public synchronized void close() throws IOException {
                    Editor currentEditor;
                    try {
/* 5 */                 if (this.initialized && !this.closed) {
/* 14 */                    Collection<Entry> collectionValues = this.lruEntries.values();
/* 18 */                    collectionValues.getClass();
/* 21 */                    int i = 0;
/* 24 */                    Object[] array = collectionValues.toArray(new Entry[0]);
/* 28 */                    if (array == null) {
/* 83 */                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                            }
/* 30 */                    Entry[] entryArr = (Entry[]) array;
/* 32 */                    int length = entryArr.length;
/* 33 */                    while (i < length) {
/* 35 */                        Entry entry = entryArr[i];
/* 37 */                        i++;
/* 43 */                        if (entry.getCurrentEditor() != null && (currentEditor = entry.getCurrentEditor()) != null) {
/* 52 */                            currentEditor.detach$okhttp();
                                }
                            }
/* 58 */                    trimToSize();
/* 61 */                    BufferedSink bufferedSink = this.journalWriter;
/* 63 */                    bufferedSink.getClass();
/* 66 */                    bufferedSink.close();
/* 70 */                    this.journalWriter = null;
/* 72 */                    this.closed = true;
/* 75 */                    return;
                        }
/* 84 */                this.closed = true;
                    } catch (Throwable th) {
/* 89 */                throw th;
                    }
                }

                public final synchronized void completeEdit$okhttp(Editor editor, boolean success) throws IOException {
/* 2 */             editor.getClass();
/* 5 */             Entry entry = editor.getEntry();
/* 17 */            if (!Intrinsics.m6216a(entry.getCurrentEditor(), editor)) {
/* 317 */               throw new IllegalStateException("Check failed.");
                    }
/* 19 */            int i = 0;
/* 20 */            if (success && !entry.getReadable()) {
/* 28 */                int i2 = this.valueCount;
/* 30 */                int i3 = 0;
/* 31 */                while (i3 < i2) {
/* 33 */                    int i4 = i3 + 1;
/* 35 */                    boolean[] written = editor.getWritten();
/* 39 */                    written.getClass();
/* 44 */                    if (!written[i3]) {
/* 75 */                        editor.abort();
/* 93 */                        throw new IllegalStateException(Intrinsics.m6219d(Integer.valueOf(i3), "Newly created entry didn't create value for index "));
                            }
/* 62 */                    if (!this.fileSystem.exists(entry.getDirtyFiles$okhttp().get(i3))) {
/* 64 */                        editor.abort();
/* 68 */                        return;
                            }
/* 73 */                    i3 = i4;
                        }
                    }
/* 94 */            int i5 = this.valueCount;
/* 96 */            while (i < i5) {
/* 98 */                int i6 = i + 1;
/* 104 */               File file = entry.getDirtyFiles$okhttp().get(i);
/* 110 */               if (!success || entry.getZombie()) {
/* 168 */                   this.fileSystem.delete(file);
                        } else if (this.fileSystem.exists(file)) {
/* 130 */                   File file2 = entry.getCleanFiles$okhttp().get(i);
/* 138 */                   this.fileSystem.rename(file, file2);
/* 145 */                   long j = entry.getLengths()[i];
/* 149 */                   long size = this.fileSystem.size(file2);
/* 157 */                   entry.getLengths()[i] = size;
/* 163 */                   this.size = (this.size - j) + size;
                        }
/* 171 */               i = i6;
                    }
/* 174 */           entry.setCurrentEditor$okhttp(null);
/* 181 */           if (entry.getZombie()) {
/* 183 */               removeEntry$okhttp(entry);
/* 187 */               return;
                    }
/* 192 */           this.redundantOpCount++;
/* 194 */           BufferedSink bufferedSink = this.journalWriter;
/* 196 */           bufferedSink.getClass();
/* 207 */           if (entry.getReadable() || success) {
/* 243 */               entry.setReadable$okhttp(true);
/* 252 */               bufferedSink.writeUtf8(CLEAN).writeByte(32);
/* 259 */               bufferedSink.writeUtf8(entry.getKey());
/* 262 */               entry.writeLengths$okhttp(bufferedSink);
/* 265 */               bufferedSink.writeByte(10);
/* 268 */               if (success) {
/* 270 */                   long j2 = this.nextSequenceNumber;
/* 275 */                   this.nextSequenceNumber = 1 + j2;
/* 277 */                   entry.setSequenceNumber$okhttp(j2);
                        }
                    } else {
/* 220 */               getLruEntries$okhttp().remove(entry.getKey());
/* 229 */               bufferedSink.writeUtf8(REMOVE).writeByte(32);
/* 236 */               bufferedSink.writeUtf8(entry.getKey());
/* 239 */               bufferedSink.writeByte(10);
                    }
/* 280 */           bufferedSink.flush();
/* 289 */           if (this.size > this.maxSize || journalRebuildRequired()) {
/* 305 */               TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
                    }
                }

                public final void delete() throws IOException {
/* 1 */             close();
/* 8 */             this.fileSystem.deleteContents(this.directory);
                }

                public final synchronized Editor edit(String key, long expectedSequenceNumber) throws IOException {
/* 2 */             key.getClass();
/* 5 */             initialize();
/* 8 */             checkNotClosed();
/* 11 */            validateKey(key);
/* 16 */            Entry entry = this.lruEntries.get(key);
/* 27 */            if (expectedSequenceNumber != ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber() != expectedSequenceNumber)) {
/* 26 */                return null;
                    }
/* 53 */            if ((entry == null ? null : entry.getCurrentEditor()) != null) {
/* 26 */                return null;
                    }
/* 57 */            if (entry != null && entry.getLockingSourceCount() != 0) {
/* 26 */                return null;
                    }
/* 69 */            if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
/* 76 */                BufferedSink bufferedSink = this.journalWriter;
/* 78 */                bufferedSink.getClass();
/* 99 */                bufferedSink.writeUtf8(DIRTY).writeByte(32).writeUtf8(key).writeByte(10);
/* 102 */               bufferedSink.flush();
/* 107 */               if (this.hasJournalErrors) {
/* 26 */                    return null;
                        }
/* 111 */               if (entry == null) {
/* 115 */                   entry = new Entry(this, key);
/* 120 */                   this.lruEntries.put(key, entry);
                        }
/* 125 */               Editor editor = new Editor(this, entry);
/* 128 */               entry.setCurrentEditor$okhttp(editor);
/* 132 */               return editor;
                    }
/* 141 */           TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
/* 26 */            return null;
                }

                public final synchronized void evictAll() throws IOException {
                    try {
/* 2 */                 initialize();
/* 7 */                 Collection<Entry> collectionValues = this.lruEntries.values();
/* 11 */                collectionValues.getClass();
/* 17 */                Object[] array = collectionValues.toArray(new Entry[0]);
/* 21 */                if (array == null) {
/* 53 */                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
/* 23 */                Entry[] entryArr = (Entry[]) array;
/* 25 */                int length = entryArr.length;
/* 26 */                int i = 0;
/* 27 */                while (i < length) {
/* 29 */                    Entry entry = entryArr[i];
/* 31 */                    i++;
/* 33 */                    entry.getClass();
/* 36 */                    removeEntry$okhttp(entry);
                        }
/* 42 */                this.mostRecentTrimFailed = false;
                    } catch (Throwable th) {
/* 55 */                throw th;
                    }
                }

                @Override // java.io.Flushable
                public synchronized void flush() throws IOException {
/* 4 */             if (this.initialized) {
/* 8 */                 checkNotClosed();
/* 11 */                trimToSize();
/* 14 */                BufferedSink bufferedSink = this.journalWriter;
/* 16 */                bufferedSink.getClass();
/* 19 */                bufferedSink.flush();
                    }
                }

                public final synchronized Snapshot get(String key) throws IOException {
/* 2 */             key.getClass();
/* 5 */             initialize();
/* 8 */             checkNotClosed();
/* 11 */            validateKey(key);
/* 16 */            Entry entry = this.lruEntries.get(key);
/* 23 */            if (entry == null) {
/* 22 */                return null;
                    }
/* 27 */            Snapshot snapshotSnapshot$okhttp = entry.snapshot$okhttp();
/* 31 */            if (snapshotSnapshot$okhttp == null) {
/* 22 */                return null;
                    }
/* 39 */            this.redundantOpCount++;
/* 41 */            BufferedSink bufferedSink = this.journalWriter;
/* 43 */            bufferedSink.getClass();
/* 64 */            bufferedSink.writeUtf8(READ).writeByte(32).writeUtf8(key).writeByte(10);
/* 71 */            if (journalRebuildRequired()) {
/* 81 */                TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
                    }
/* 89 */            return snapshotSnapshot$okhttp;
                }

                /* JADX INFO: renamed from: getClosed$okhttp, reason: from getter */
                public final boolean getClosed() {
/* 1 */             return this.closed;
                }

                public final File getDirectory() {
/* 1 */             return this.directory;
                }

                /* JADX INFO: renamed from: getFileSystem$okhttp, reason: from getter */
                public final FileSystem getFileSystem() {
/* 1 */             return this.fileSystem;
                }

                public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
/* 1 */             return this.lruEntries;
                }

                public final synchronized long getMaxSize() {
/* 2 */             return this.maxSize;
                }

                /* JADX INFO: renamed from: getValueCount$okhttp, reason: from getter */
                public final int getValueCount() {
/* 1 */             return this.valueCount;
                }

                public final synchronized void initialize() throws IOException {
                    try {
/* 8 */                 if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
/* 50 */                    throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
                        }
/* 56 */                if (this.initialized) {
/* 59 */                    return;
                        }
/* 68 */                if (this.fileSystem.exists(this.journalFileBackup)) {
/* 74 */                    boolean zExists = this.fileSystem.exists(this.journalFile);
/* 78 */                    FileSystem fileSystem = this.fileSystem;
/* 80 */                    if (zExists) {
/* 84 */                        fileSystem.delete(this.journalFileBackup);
                            } else {
/* 92 */                        fileSystem.rename(this.journalFileBackup, this.journalFile);
                            }
                        }
/* 103 */               this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
/* 114 */               if (this.fileSystem.exists(this.journalFile)) {
                            try {
/* 116 */                       readJournal();
/* 119 */                       processJournal();
/* 122 */                       this.initialized = true;
/* 125 */                       return;
                            } catch (IOException e) {
/* 165 */                       Platform.INSTANCE.get().log("DiskLruCache " + this.directory + " is corrupt: " + ((Object) e.getMessage()) + ", removing", 5, e);
                                try {
/* 169 */                           delete();
/* 172 */                           this.closed = false;
/* 179 */                           rebuildJournal$okhttp();
/* 182 */                           this.initialized = true;
                                } catch (Throwable th) {
/* 176 */                           this.closed = false;
/* 178 */                           throw th;
                                }
                            }
                        }
/* 179 */               rebuildJournal$okhttp();
/* 182 */               this.initialized = true;
                    } catch (Throwable th2) {
/* 187 */               throw th2;
                    }
                }

                public final synchronized boolean isClosed() {
/* 2 */             return this.closed;
                }

                public final synchronized void rebuildJournal$okhttp() throws IOException {
                    try {
/* 2 */                 BufferedSink bufferedSink = this.journalWriter;
/* 4 */                 if (bufferedSink != null) {
/* 7 */                     bufferedSink.close();
                        }
/* 18 */                BufferedSink bufferedSinkBuffer = Okio.buffer(this.fileSystem.sink(this.journalFileTmp));
                        try {
/* 30 */                    bufferedSinkBuffer.writeUtf8(MAGIC).writeByte(10);
/* 39 */                    bufferedSinkBuffer.writeUtf8(VERSION_1).writeByte(10);
/* 49 */                    bufferedSinkBuffer.writeDecimalLong(this.appVersion).writeByte(10);
/* 61 */                    bufferedSinkBuffer.writeDecimalLong(getValueCount()).writeByte(10);
/* 64 */                    bufferedSinkBuffer.writeByte(10);
/* 83 */                    for (Entry entry : getLruEntries$okhttp().values()) {
/* 97 */                        if (entry.getCurrentEditor() != null) {
/* 105 */                           bufferedSinkBuffer.writeUtf8(DIRTY).writeByte(32);
/* 112 */                           bufferedSinkBuffer.writeUtf8(entry.getKey());
/* 115 */                           bufferedSinkBuffer.writeByte(10);
                                } else {
/* 127 */                           bufferedSinkBuffer.writeUtf8(CLEAN).writeByte(32);
/* 134 */                           bufferedSinkBuffer.writeUtf8(entry.getKey());
/* 137 */                           entry.writeLengths$okhttp(bufferedSinkBuffer);
/* 140 */                           bufferedSinkBuffer.writeByte(10);
                                }
                            }
/* 145 */                   jb1.m5754n(bufferedSinkBuffer, null);
/* 156 */                   if (this.fileSystem.exists(this.journalFile)) {
/* 164 */                       this.fileSystem.rename(this.journalFile, this.journalFileBackup);
                            }
/* 176 */                   this.fileSystem.rename(this.journalFileTmp, this.journalFile);
/* 183 */                   this.fileSystem.delete(this.journalFileBackup);
/* 190 */                   this.journalWriter = newJournalWriter();
/* 193 */                   this.hasJournalErrors = false;
/* 195 */                   this.mostRecentRebuildFailed = false;
                        } catch (Throwable th) {
                            try {
/* 199 */                       throw th;
                            } catch (Throwable th2) {
/* 201 */                       jb1.m5754n(bufferedSinkBuffer, th);
/* 204 */                       throw th2;
                            }
                        }
                    } catch (Throwable th3) {
/* 206 */               throw th3;
                    }
                }

                public final synchronized boolean remove(String key) throws IOException {
/* 2 */             key.getClass();
/* 5 */             initialize();
/* 8 */             checkNotClosed();
/* 11 */            validateKey(key);
/* 16 */            Entry entry = this.lruEntries.get(key);
/* 23 */            if (entry == null) {
/* 22 */                return false;
                    }
/* 27 */            boolean zRemoveEntry$okhttp = removeEntry$okhttp(entry);
/* 31 */            if (zRemoveEntry$okhttp && this.size <= this.maxSize) {
/* 41 */                this.mostRecentTrimFailed = false;
                    }
/* 47 */            return zRemoveEntry$okhttp;
                }

                public final boolean removeEntry$okhttp(Entry entry) throws IOException {
                    BufferedSink bufferedSink;
/* 1 */             entry.getClass();
/* 11 */            if (!this.civilizedFileSystem) {
/* 17 */                if (entry.getLockingSourceCount() > 0 && (bufferedSink = this.journalWriter) != null) {
/* 26 */                    bufferedSink.writeUtf8(DIRTY);
/* 29 */                    bufferedSink.writeByte(32);
/* 36 */                    bufferedSink.writeUtf8(entry.getKey());
/* 39 */                    bufferedSink.writeByte(10);
/* 42 */                    bufferedSink.flush();
                        }
/* 49 */                if (entry.getLockingSourceCount() > 0 || entry.getCurrentEditor() != null) {
/* 57 */                    entry.setZombie$okhttp(true);
/* 10 */                    return true;
                        }
                    }
/* 61 */            Editor currentEditor = entry.getCurrentEditor();
/* 65 */            if (currentEditor != null) {
/* 68 */                currentEditor.detach$okhttp();
                    }
/* 71 */            int i = this.valueCount;
/* 74 */            for (int i2 = 0; i2 < i; i2++) {
/* 90 */                this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i2));
/* 102 */               this.size -= entry.getLengths()[i2];
/* 110 */               entry.getLengths()[i2] = 0;
                    }
/* 117 */           this.redundantOpCount++;
/* 119 */           BufferedSink bufferedSink2 = this.journalWriter;
/* 121 */           if (bufferedSink2 != null) {
/* 126 */               bufferedSink2.writeUtf8(REMOVE);
/* 129 */               bufferedSink2.writeByte(32);
/* 136 */               bufferedSink2.writeUtf8(entry.getKey());
/* 139 */               bufferedSink2.writeByte(10);
                    }
/* 148 */           this.lruEntries.remove(entry.getKey());
/* 155 */           if (journalRebuildRequired()) {
/* 165 */               TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
                    }
/* 10 */            return true;
                }

                public final void setClosed$okhttp(boolean z) {
/* 1 */             this.closed = z;
                }

                public final synchronized void setMaxSize(long j) {
/* 2 */             this.maxSize = j;
/* 6 */             if (this.initialized) {
/* 16 */                TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
                    }
                }

                public final synchronized long size() throws IOException {
/* 2 */             initialize();
/* 5 */             return this.size;
                }

                public final synchronized Iterator<Snapshot> snapshots() throws IOException {
/* 2 */             initialize();
/* 7 */             return new C20101();
                }

                public final void trimToSize() throws IOException {
/* 7 */             while (this.size > this.maxSize) {
/* 13 */                if (!removeOldestEntry()) {
/* 15 */                    return;
                        }
                    }
/* 17 */            this.mostRecentTrimFailed = false;
                }

/* 147 */       public final Editor edit(String str) throws IOException {
/* 148 */           str.getClass();
                    return edit$default(this, str, 0L, 2, null);
                }
            }
