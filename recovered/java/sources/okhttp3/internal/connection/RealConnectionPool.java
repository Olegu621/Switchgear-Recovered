            package okhttp3.internal.connection;

            import androidx.core.app.NotificationCompat;
            import java.lang.ref.Reference;
            import java.net.Socket;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.ConcurrentLinkedQueue;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.Address;
            import okhttp3.ConnectionPool;
            import okhttp3.HttpUrl;
            import okhttp3.Route;
            import okhttp3.internal.Util;
            import okhttp3.internal.concurrent.Task;
            import okhttp3.internal.concurrent.TaskQueue;
            import okhttp3.internal.concurrent.TaskRunner;
            import okhttp3.internal.platform.Platform;
            import p000.ds0;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u000e\u0018\u0000 (2\u00020\u0001:\u0001(B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ.\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u0015J\u000e\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0012J\u0006\u0010\"\u001a\u00020\u0005J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u0005J\u0018\u0010&\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u000e\u0010'\u001a\u00020$2\u0006\u0010!\u001a\u00020\u0012R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m6176d2 = {"Lokhttp3/internal/connection/RealConnectionPool;", HttpUrl.FRAGMENT_ENCODE_SET, "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "maxIdleConnections", HttpUrl.FRAGMENT_ENCODE_SET, "keepAliveDuration", HttpUrl.FRAGMENT_ENCODE_SET, "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(Lokhttp3/internal/concurrent/TaskRunner;IJLjava/util/concurrent/TimeUnit;)V", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupTask", "okhttp3/internal/connection/RealConnectionPool$cleanupTask$1", "Lokhttp3/internal/connection/RealConnectionPool$cleanupTask$1;", "connections", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lokhttp3/internal/connection/RealConnection;", "keepAliveDurationNs", "callAcquirePooledConnection", HttpUrl.FRAGMENT_ENCODE_SET, "address", "Lokhttp3/Address;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/internal/connection/RealCall;", "routes", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Route;", "requireMultiplexed", "cleanup", "now", "connectionBecameIdle", "connection", "connectionCount", "evictAll", HttpUrl.FRAGMENT_ENCODE_SET, "idleConnectionCount", "pruneAndGetAllocationCount", "put", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class RealConnectionPool {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final TaskQueue cleanupQueue;
                private final RealConnectionPool$cleanupTask$1 cleanupTask;
                private final ConcurrentLinkedQueue<RealConnection> connections;
                private final long keepAliveDurationNs;
                private final int maxIdleConnections;

                /* JADX WARN: Type inference failed for: r4v2, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
                public RealConnectionPool(TaskRunner taskRunner, int i, long j, TimeUnit timeUnit) {
/* 1 */             taskRunner.getClass();
/* 4 */             timeUnit.getClass();
/* 10 */            this.maxIdleConnections = i;
/* 16 */            this.keepAliveDurationNs = timeUnit.toNanos(j);
/* 22 */            this.cleanupQueue = taskRunner.newQueue();
/* 28 */            final String strM6219d = Intrinsics.m6219d(" ConnectionPool", Util.okHttpName);
/* 37 */            this.cleanupTask = new Task(strM6219d) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
/* 7 */                     return this.this$0.cleanup(System.nanoTime());
                        }
                    };
/* 44 */            this.connections = new ConcurrentLinkedQueue<>();
/* 50 */            if (j > 0) {
/* 52 */                return;
                    }
/* 63 */            ds0.m3200q(Intrinsics.m6219d(Long.valueOf(j), "keepAliveDuration <= 0: "));
/* 67 */            throw null;
                }

                private final int pruneAndGetAllocationCount(RealConnection connection, long now) {
/* 4 */             if (Util.assertionsEnabled && !Thread.holdsLock(connection)) {
/* 23 */                s80.m8422c(Thread.currentThread().getName(), " MUST hold lock on ", connection);
/* 3 */                 return 0;
                    }
/* 27 */            List<Reference<RealCall>> calls = connection.getCalls();
/* 31 */            int i = 0;
/* 36 */            while (i < calls.size()) {
/* 38 */                Reference<RealCall> reference = calls.get(i);
/* 48 */                if (reference.get() != null) {
/* 50 */                    i++;
                        } else {
/* 96 */                    Platform.INSTANCE.get().logCloseableLeak("A connection to " + connection.getRoute().address().url() + " was leaked. Did you forget to close a response body?", ((RealCall.CallReference) reference).getCallStackTrace());
/* 99 */                    calls.remove(i);
/* 103 */                   connection.setNoNewExchanges(true);
/* 110 */                   if (calls.isEmpty()) {
/* 115 */                       connection.setIdleAtNs$okhttp(now - this.keepAliveDurationNs);
/* 3 */                         return 0;
                            }
                        }
                    }
/* 119 */           return calls.size();
                }

                /* JADX WARN: Code duplicated, block: B:13:0x0027 A[Catch: all -> 0x0025, TRY_LEAVE, TryCatch #0 {all -> 0x0025, blocks: (B:8:0x001e, B:13:0x0027, B:17:0x002f), top: B:25:0x001e }] */
                /* JADX WARN: Code duplicated, block: B:28:0x002f A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:30:0x002d A[SYNTHETIC] */
                public final boolean callAcquirePooledConnection(Address address, RealCall call, List<Route> routes, boolean requireMultiplexed) {
/* 1 */             address.getClass();
/* 4 */             call.getClass();
/* 17 */            for (RealConnection realConnection : this.connections) {
/* 25 */                realConnection.getClass();
                        synchronized (realConnection) {
/* 29 */                    if (requireMultiplexed) {
                                try {
/* 35 */                            if (realConnection.isMultiplexed$okhttp()) {
/* 44 */                                if (!realConnection.isEligible$okhttp(address, routes)) {
/* 48 */                                    call.acquireConnectionNoEvents(realConnection);
/* 52 */                                    return true;
                                        }
                                    }
                                } catch (Throwable th) {
/* 55 */                            throw th;
                                }
                            } else if (!realConnection.isEligible$okhttp(address, routes)) {
/* 48 */                        call.acquireConnectionNoEvents(realConnection);
/* 52 */                        return true;
                            }
                        }
                    }
/* 56 */            return false;
                }

                public final long cleanup(long now) {
/* 7 */             int i = 0;
/* 11 */            long j = Long.MIN_VALUE;
/* 12 */            RealConnection realConnection = null;
/* 13 */            int i2 = 0;
/* 18 */            for (RealConnection realConnection2 : this.connections) {
/* 26 */                realConnection2.getClass();
                        synchronized (realConnection2) {
/* 34 */                    if (pruneAndGetAllocationCount(realConnection2, now) > 0) {
/* 36 */                        i2++;
                            } else {
/* 39 */                        i++;
/* 45 */                        long idleAtNs = now - realConnection2.getIdleAtNs();
/* 49 */                        if (idleAtNs > j) {
/* 51 */                            realConnection = realConnection2;
/* 52 */                            j = idleAtNs;
                                }
                            }
                        }
                    }
/* 58 */            long j2 = this.keepAliveDurationNs;
/* 62 */            if (j < j2 && i <= this.maxIdleConnections) {
/* 69 */                if (i > 0) {
/* 71 */                    return j2 - j;
                        }
/* 73 */                if (i2 > 0) {
/* 75 */                    return j2;
                        }
/* 76 */                return -1L;
                    }
/* 79 */            realConnection.getClass();
                    synchronized (realConnection) {
/* 93 */                if (!realConnection.getCalls().isEmpty()) {
/* 91 */                    return 0L;
                        }
/* 104 */               if (realConnection.getIdleAtNs() + j != now) {
/* 91 */                    return 0L;
                        }
/* 109 */               realConnection.setNoNewExchanges(true);
/* 114 */               this.connections.remove(realConnection);
/* 122 */               Util.closeQuietly(realConnection.socket());
/* 131 */               if (this.connections.isEmpty()) {
/* 135 */                   this.cleanupQueue.cancelAll();
                        }
/* 91 */                return 0L;
                    }
                }

                public final boolean connectionBecameIdle(RealConnection connection) {
/* 1 */             connection.getClass();
/* 7 */             if (Util.assertionsEnabled && !Thread.holdsLock(connection)) {
/* 26 */                s80.m8422c(Thread.currentThread().getName(), " MUST hold lock on ", connection);
/* 6 */                 return false;
                    }
/* 34 */            if (!connection.getNoNewExchanges() && this.maxIdleConnections != 0) {
/* 49 */                TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
/* 6 */                 return false;
                    }
/* 54 */            connection.setNoNewExchanges(true);
/* 59 */            this.connections.remove(connection);
/* 68 */            if (this.connections.isEmpty()) {
/* 72 */                this.cleanupQueue.cancelAll();
                    }
/* 53 */            return true;
                }

                public final int connectionCount() {
/* 3 */             return this.connections.size();
                }

                public final void evictAll() {
                    Socket socket;
/* 3 */             Iterator<RealConnection> it = this.connections.iterator();
/* 7 */             it.getClass();
/* 14 */            while (it.hasNext()) {
/* 16 */                RealConnection next = it.next();
/* 22 */                next.getClass();
                        synchronized (next) {
/* 34 */                    if (next.getCalls().isEmpty()) {
/* 36 */                        it.remove();
/* 40 */                        next.setNoNewExchanges(true);
/* 43 */                        socket = next.socket();
                            } else {
/* 50 */                        socket = null;
                            }
                        }
/* 52 */                if (socket != null) {
/* 55 */                    Util.closeQuietly(socket);
                        }
                    }
/* 67 */            if (this.connections.isEmpty()) {
/* 71 */                this.cleanupQueue.cancelAll();
                    }
                }

                public final int idleConnectionCount() {
                    boolean zIsEmpty;
/* 1 */             ConcurrentLinkedQueue<RealConnection> concurrentLinkedQueue = this.connections;
/* 3 */             int i = 0;
/* 4 */             if (concurrentLinkedQueue != null && concurrentLinkedQueue.isEmpty()) {
/* 3 */                 return 0;
                    }
/* 21 */            for (RealConnection realConnection : concurrentLinkedQueue) {
/* 29 */                realConnection.getClass();
                        synchronized (realConnection) {
/* 37 */                    zIsEmpty = realConnection.getCalls().isEmpty();
                        }
/* 42 */                if (zIsEmpty && (i = i + 1) < 0) {
/* 56 */                    throw new ArithmeticException("Count overflow has happened.");
                        }
                    }
/* 60 */            return i;
                }

                public final void put(RealConnection connection) {
/* 1 */             connection.getClass();
/* 6 */             if (Util.assertionsEnabled && !Thread.holdsLock(connection)) {
/* 25 */                s80.m8422c(Thread.currentThread().getName(), " MUST hold lock on ", connection);
                    } else {
/* 31 */                this.connections.add(connection);
/* 42 */                TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m6176d2 = {"Lokhttp3/internal/connection/RealConnectionPool$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "get", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/ConnectionPool;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final RealConnectionPool get(ConnectionPool connectionPool) {
/* 1 */                 connectionPool.getClass();
/* 4 */                 return connectionPool.getDelegate();
                    }

/* 4 */             private Companion() {
                    }
                }
            }
