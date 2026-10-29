            package okhttp3;

            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import okhttp3.internal.concurrent.TaskRunner;
            import okhttp3.internal.connection.RealConnectionPool;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0007\b\u0016¢\u0006\u0002\u0010\tB\u000f\b\u0000\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\u000f\u001a\u00020\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0003R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m6176d2 = {"Lokhttp3/ConnectionPool;", HttpUrl.FRAGMENT_ENCODE_SET, "maxIdleConnections", HttpUrl.FRAGMENT_ENCODE_SET, "keepAliveDuration", HttpUrl.FRAGMENT_ENCODE_SET, "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(IJLjava/util/concurrent/TimeUnit;)V", "()V", "delegate", "Lokhttp3/internal/connection/RealConnectionPool;", "(Lokhttp3/internal/connection/RealConnectionPool;)V", "getDelegate$okhttp", "()Lokhttp3/internal/connection/RealConnectionPool;", "connectionCount", "evictAll", HttpUrl.FRAGMENT_ENCODE_SET, "idleConnectionCount", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 16 */    public final class ConnectionPool {
                private final RealConnectionPool delegate;

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public ConnectionPool(int i, long j, TimeUnit timeUnit) {
/* 14 */            this(new RealConnectionPool(TaskRunner.INSTANCE, i, j, timeUnit));
/* 1 */             timeUnit.getClass();
                }

                public final int connectionCount() {
/* 3 */             return this.delegate.connectionCount();
                }

                public final void evictAll() {
/* 3 */             this.delegate.evictAll();
                }

                /* JADX INFO: renamed from: getDelegate$okhttp, reason: from getter */
                public final RealConnectionPool getDelegate() {
/* 1 */             return this.delegate;
                }

                public final int idleConnectionCount() {
/* 3 */             return this.delegate.idleConnectionCount();
                }

/* 17 */        public ConnectionPool(RealConnectionPool realConnectionPool) {
                    realConnectionPool.getClass();
/* 19 */            this.delegate = realConnectionPool;
                }

/* 19 */        public ConnectionPool() {
/* 20 */            this(5, 5L, TimeUnit.MINUTES);
                }
            }
