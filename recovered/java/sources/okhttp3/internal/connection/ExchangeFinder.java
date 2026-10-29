            package okhttp3.internal.connection;

            import androidx.core.app.NotificationCompat;
            import java.io.IOException;
            import java.net.Socket;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.Address;
            import okhttp3.EventListener;
            import okhttp3.HttpUrl;
            import okhttp3.OkHttpClient;
            import okhttp3.Route;
            import okhttp3.internal.Util;
            import okhttp3.internal.http.ExchangeCodec;
            import okhttp3.internal.http.RealInterceptorChain;
            import okhttp3.internal.http2.ConnectionShutdownException;
            import okhttp3.internal.http2.ErrorCode;
            import okhttp3.internal.http2.StreamResetException;
            import p000.ds0;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ0\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$H\u0002J8\u0010%\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0002J\u0006\u0010'\u001a\u00020$J\n\u0010(\u001a\u0004\u0018\u00010\u0010H\u0002J\u000e\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, m6176d2 = {"Lokhttp3/internal/connection/ExchangeFinder;", HttpUrl.FRAGMENT_ENCODE_SET, "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "address", "Lokhttp3/Address;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/internal/connection/RealCall;", "eventListener", "Lokhttp3/EventListener;", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Address;Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;)V", "getAddress$okhttp", "()Lokhttp3/Address;", "connectionShutdownCount", HttpUrl.FRAGMENT_ENCODE_SET, "nextRouteToTry", "Lokhttp3/Route;", "otherFailureCount", "refusedStreamCount", "routeSelection", "Lokhttp3/internal/connection/RouteSelector$Selection;", "routeSelector", "Lokhttp3/internal/connection/RouteSelector;", "find", "Lokhttp3/internal/http/ExchangeCodec;", "client", "Lokhttp3/OkHttpClient;", "chain", "Lokhttp3/internal/http/RealInterceptorChain;", "findConnection", "Lokhttp3/internal/connection/RealConnection;", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "connectionRetryEnabled", HttpUrl.FRAGMENT_ENCODE_SET, "findHealthyConnection", "doExtensiveHealthChecks", "retryAfterFailure", "retryRoute", "sameHostAndPort", "url", "Lokhttp3/HttpUrl;", "trackFailure", HttpUrl.FRAGMENT_ENCODE_SET, "e", "Ljava/io/IOException;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class ExchangeFinder {
                private final Address address;
                private final RealCall call;
                private final RealConnectionPool connectionPool;
                private int connectionShutdownCount;
                private final EventListener eventListener;
                private Route nextRouteToTry;
                private int otherFailureCount;
                private int refusedStreamCount;
                private RouteSelector.Selection routeSelection;
                private RouteSelector routeSelector;

                public ExchangeFinder(RealConnectionPool realConnectionPool, Address address, RealCall realCall, EventListener eventListener) {
/* 1 */             realConnectionPool.getClass();
/* 4 */             address.getClass();
/* 7 */             realCall.getClass();
/* 10 */            eventListener.getClass();
/* 16 */            this.connectionPool = realConnectionPool;
/* 18 */            this.address = address;
/* 20 */            this.call = realCall;
/* 22 */            this.eventListener = eventListener;
                }

                /* JADX WARN: Code duplicated, block: B:56:0x0129  */
                /* JADX WARN: Code duplicated, block: B:58:0x0143  */
                /* JADX WARN: Code duplicated, block: B:74:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                private final RealConnection findConnection(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled) throws IOException {
                    List<Route> routes;
                    RealConnection realConnection;
                    Socket socketReleaseConnectionNoEvents$okhttp;
/* 8 */             if (this.call.getCanceled()) {
/* 364 */               ds0.m3195l("Canceled");
/* 7 */                 return null;
                    }
/* 12 */            RealConnection connection = this.call.getConnection();
/* 16 */            if (connection != null) {
                        synchronized (connection) {
                            try {
/* 51 */                        socketReleaseConnectionNoEvents$okhttp = (connection.getNoNewExchanges() || !sameHostAndPort(connection.getRoute().address().url())) ? this.call.releaseConnectionNoEvents$okhttp() : null;
                            } catch (Throwable th) {
/* 88 */                        throw th;
                            }
                        }
/* 62 */                if (this.call.getConnection() != null) {
/* 64 */                    if (socketReleaseConnectionNoEvents$okhttp == null) {
/* 66 */                        return connection;
                            }
/* 69 */                    f42.m3656l("Check failed.");
/* 7 */                     return null;
                        }
/* 73 */                if (socketReleaseConnectionNoEvents$okhttp != null) {
/* 76 */                    Util.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
                        }
/* 83 */                this.eventListener.connectionReleased(this.call, connection);
                    }
/* 90 */            this.refusedStreamCount = 0;
/* 92 */            this.connectionShutdownCount = 0;
/* 94 */            this.otherFailureCount = 0;
/* 106 */           if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, null, false)) {
/* 110 */               RealConnection connection2 = this.call.getConnection();
/* 114 */               connection2.getClass();
/* 121 */               this.eventListener.connectionAcquired(this.call, connection2);
/* 124 */               return connection2;
                    }
/* 125 */           Route next = this.nextRouteToTry;
                    try {
/* 127 */               if (next == null) {
/* 136 */                   RouteSelector.Selection selection = this.routeSelection;
/* 138 */                   if (selection != null) {
/* 140 */                       selection.getClass();
/* 147 */                       if (selection.hasNext()) {
/* 149 */                           RouteSelector.Selection selection2 = this.routeSelection;
/* 151 */                           selection2.getClass();
/* 154 */                           next = selection2.next();
                                }
/* 241 */                       realConnection = new RealConnection(this.connectionPool, next);
/* 246 */                       this.call.setConnectionToCancel(realConnection);
/* 260 */                       realConnection.connect(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled, this.call, this.eventListener);
/* 265 */                       this.call.setConnectionToCancel(null);
/* 282 */                       this.call.getClient().getRouteDatabase().connected(realConnection.getRoute());
/* 296 */                       if (!this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
                                    synchronized (realConnection) {
/* 327 */                               this.connectionPool.put(realConnection);
/* 332 */                               this.call.acquireConnectionNoEvents(realConnection);
                                    }
/* 340 */                           this.eventListener.connectionAcquired(this.call, realConnection);
/* 343 */                           return realConnection;
                                }
/* 300 */                       RealConnection connection3 = this.call.getConnection();
/* 304 */                       connection3.getClass();
/* 307 */                       this.nextRouteToTry = next;
/* 313 */                       Util.closeQuietly(realConnection.socket());
/* 320 */                       this.eventListener.connectionAcquired(this.call, connection3);
/* 323 */                       return connection3;
                            }
/* 159 */                   RouteSelector routeSelector = this.routeSelector;
/* 161 */                   if (routeSelector == null) {
/* 181 */                       routeSelector = new RouteSelector(this.address, this.call.getClient().getRouteDatabase(), this.call, this.eventListener);
/* 184 */                       this.routeSelector = routeSelector;
                            }
/* 186 */                   RouteSelector.Selection next2 = routeSelector.next();
/* 190 */                   this.routeSelection = next2;
/* 192 */                   routes = next2.getRoutes();
/* 202 */                   if (this.call.getCanceled()) {
/* 358 */                       ds0.m3195l("Canceled");
/* 7 */                         return null;
                            }
/* 214 */                   if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, false)) {
/* 218 */                       RealConnection connection4 = this.call.getConnection();
/* 222 */                       connection4.getClass();
/* 229 */                       this.eventListener.connectionAcquired(this.call, connection4);
/* 232 */                       return connection4;
                            }
/* 233 */                   next = next2.next();
/* 241 */                   realConnection = new RealConnection(this.connectionPool, next);
/* 246 */                   this.call.setConnectionToCancel(realConnection);
/* 260 */                   realConnection.connect(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled, this.call, this.eventListener);
/* 265 */                   this.call.setConnectionToCancel(null);
/* 282 */                   this.call.getClient().getRouteDatabase().connected(realConnection.getRoute());
/* 296 */                   if (!this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
                                synchronized (realConnection) {
/* 327 */                           this.connectionPool.put(realConnection);
/* 332 */                           this.call.acquireConnectionNoEvents(realConnection);
/* 340 */                           this.eventListener.connectionAcquired(this.call, realConnection);
/* 343 */                           return realConnection;
                                }
                            }
/* 300 */                   RealConnection connection5 = this.call.getConnection();
/* 304 */                   connection5.getClass();
/* 307 */                   this.nextRouteToTry = next;
/* 313 */                   Util.closeQuietly(realConnection.socket());
/* 320 */                   this.eventListener.connectionAcquired(this.call, connection5);
/* 323 */                   return connection5;
                        }
/* 129 */               next.getClass();
/* 132 */               this.nextRouteToTry = null;
/* 260 */               realConnection.connect(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled, this.call, this.eventListener);
/* 265 */               this.call.setConnectionToCancel(null);
/* 282 */               this.call.getClient().getRouteDatabase().connected(realConnection.getRoute());
/* 296 */               if (!this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
                            synchronized (realConnection) {
/* 327 */                       this.connectionPool.put(realConnection);
/* 332 */                       this.call.acquireConnectionNoEvents(realConnection);
/* 340 */                       this.eventListener.connectionAcquired(this.call, realConnection);
/* 343 */                       return realConnection;
                            }
                        }
/* 300 */               RealConnection connection6 = this.call.getConnection();
/* 304 */               connection6.getClass();
/* 307 */               this.nextRouteToTry = next;
/* 313 */               Util.closeQuietly(realConnection.socket());
/* 320 */               this.eventListener.connectionAcquired(this.call, connection6);
/* 323 */               return connection6;
                    } catch (Throwable th2) {
/* 352 */               this.call.setConnectionToCancel(null);
/* 355 */               throw th2;
                    }
/* 134 */           routes = null;
/* 241 */           realConnection = new RealConnection(this.connectionPool, next);
/* 246 */           this.call.setConnectionToCancel(realConnection);
                }

                private final RealConnection findHealthyConnection(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled, boolean doExtensiveHealthChecks) throws IOException {
                    while (true) {
/* 1 */                 RealConnection realConnectionFindConnection = findConnection(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled);
/* 9 */                 if (realConnectionFindConnection.isHealthy(doExtensiveHealthChecks)) {
/* 11 */                    return realConnectionFindConnection;
                        }
/* 12 */                realConnectionFindConnection.noNewExchanges$okhttp();
/* 17 */                if (this.nextRouteToTry == null) {
/* 20 */                    RouteSelector.Selection selection = this.routeSelection;
/* 31 */                    if (selection == null ? true : selection.hasNext()) {
                                continue;
                            } else {
/* 34 */                        RouteSelector routeSelector = this.routeSelector;
/* 43 */                        if (!(routeSelector != null ? routeSelector.hasNext() : true)) {
/* 48 */                            ds0.m3195l("exhausted all routes");
/* 51 */                            return null;
                                }
                            }
                        }
                    }
                }

                private final Route retryRoute() {
                    RealConnection connection;
/* 5 */             if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null) {
/* 3 */                 return null;
                    }
                    synchronized (connection) {
/* 30 */                if (connection.getRouteFailureCount() != 0) {
/* 3 */                     return null;
                        }
/* 58 */                if (Util.canReuseConnectionFor(connection.getRoute().address().url(), getAddress().url())) {
/* 62 */                    return connection.getRoute();
                        }
/* 3 */                 return null;
                    }
                }

                public final ExchangeCodec find(OkHttpClient client, RealInterceptorChain chain) {
                    ExchangeFinder exchangeFinder;
/* 1 */             client.getClass();
/* 4 */             chain.getClass();
                    try {
/* 43 */                exchangeFinder = this;
                        try {
/* 48 */                    return exchangeFinder.findHealthyConnection(chain.getConnectTimeoutMillis$okhttp(), chain.getReadTimeoutMillis(), chain.getWriteTimeoutMillis(), client.pingIntervalMillis(), client.retryOnConnectionFailure(), !Intrinsics.m6216a(chain.getRequest().method(), "GET")).newCodec$okhttp(client, chain);
                        } catch (IOException e) {
/* 53 */                    e = e;
/* 54 */                    IOException iOException = e;
/* 65 */                    exchangeFinder.trackFailure(iOException);
/* 73 */                    throw new RouteException(iOException);
                        } catch (RouteException e2) {
/* 56 */                    e = e2;
/* 57 */                    RouteException routeException = e;
/* 78 */                    exchangeFinder.trackFailure(routeException.getLastConnectException());
/* 81 */                    throw routeException;
                        }
                    } catch (IOException e3) {
/* 59 */                e = e3;
/* 60 */                exchangeFinder = this;
                    } catch (RouteException e4) {
/* 62 */                e = e4;
/* 63 */                exchangeFinder = this;
                    }
                }

                /* JADX INFO: renamed from: getAddress$okhttp, reason: from getter */
                public final Address getAddress() {
/* 1 */             return this.address;
                }

                public final boolean retryAfterFailure() {
                    RouteSelector routeSelector;
/* 3 */             if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
/* 13 */                return false;
                    }
/* 18 */            if (this.nextRouteToTry != null) {
/* 17 */                return true;
                    }
/* 21 */            Route routeRetryRoute = retryRoute();
/* 25 */            if (routeRetryRoute != null) {
/* 27 */                this.nextRouteToTry = routeRetryRoute;
/* 17 */                return true;
                    }
/* 30 */            RouteSelector.Selection selection = this.routeSelection;
/* 32 */            if ((selection != null && selection.hasNext()) || (routeSelector = this.routeSelector) == null) {
/* 17 */                return true;
                    }
/* 47 */            return routeSelector.hasNext();
                }

                public final boolean sameHostAndPort(HttpUrl url) {
/* 1 */             url.getClass();
/* 6 */             HttpUrl httpUrlUrl = this.address.url();
                    return url.port() == httpUrlUrl.port() && Intrinsics.m6216a(url.host(), httpUrlUrl.host());
                }

                public final void trackFailure(IOException e) {
/* 1 */             e.getClass();
/* 5 */             this.nextRouteToTry = null;
/* 9 */             if ((e instanceof StreamResetException) && ((StreamResetException) e).errorCode == ErrorCode.REFUSED_STREAM) {
/* 24 */                this.refusedStreamCount++;
                    } else if (e instanceof ConnectionShutdownException) {
/* 35 */                this.connectionShutdownCount++;
                    } else {
/* 42 */                this.otherFailureCount++;
                    }
                }
            }
