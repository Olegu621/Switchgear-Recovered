            package okhttp3.internal.connection;

            import java.util.LinkedHashSet;
            import java.util.Set;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import okhttp3.Route;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m6176d2 = {"Lokhttp3/internal/connection/RouteDatabase;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "failedRoutes", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Route;", "connected", HttpUrl.FRAGMENT_ENCODE_SET, "route", "failed", "failedRoute", "shouldPostpone", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class RouteDatabase {
                private final Set<Route> failedRoutes = new LinkedHashSet();

                public final synchronized void connected(Route route) {
/* 2 */             route.getClass();
/* 7 */             this.failedRoutes.remove(route);
                }

                public final synchronized void failed(Route failedRoute) {
/* 2 */             failedRoute.getClass();
/* 7 */             this.failedRoutes.add(failedRoute);
                }

                public final synchronized boolean shouldPostpone(Route route) {
/* 2 */             route.getClass();
/* 7 */             return this.failedRoutes.contains(route);
                }
            }
