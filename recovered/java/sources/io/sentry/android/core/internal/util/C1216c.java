            package io.sentry.android.core.internal.util;

            import android.content.Context;
            import android.net.ConnectivityManager;
            import android.net.Network;
            import android.net.NetworkCapabilities;
            import android.net.NetworkInfo;
            import android.os.SystemClock;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1570o0;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1578p0;
            import io.sentry.InterfaceC1631q0;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.android.core.C1191g0;
            import io.sentry.android.core.C1248o0;
            import io.sentry.android.core.InterfaceC1182d0;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.util.C1702a;
            import java.util.ArrayList;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.util.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1216c implements InterfaceC1631q0, InterfaceC1182d0 {

                /* JADX INFO: renamed from: X */
                public static volatile ConnectivityManager f10140X;

                /* JADX INFO: renamed from: U */
                public volatile long f10145U;

                /* JADX INFO: renamed from: V */
                public final AtomicBoolean f10146V;

                /* JADX INFO: renamed from: a */
                public final Context f10147a;

                /* JADX INFO: renamed from: b */
                public final SentryAndroidOptions f10148b;

                /* JADX INFO: renamed from: c */
                public final C1248o0 f10149c;

                /* JADX INFO: renamed from: d */
                public final C1217d f10150d;

                /* JADX INFO: renamed from: e */
                public final ArrayList f10151e;

                /* JADX INFO: renamed from: f */
                public final C1702a f10152f;

                /* JADX INFO: renamed from: i */
                public volatile C1215b f10153i;

                /* JADX INFO: renamed from: v */
                public volatile NetworkCapabilities f10154v;

                /* JADX INFO: renamed from: w */
                public volatile Network f10155w;

                /* JADX INFO: renamed from: W */
                public static final C1702a f10139W = new C1702a();

                /* JADX INFO: renamed from: Y */
                public static final C1702a f10141Y = new C1702a();

                /* JADX INFO: renamed from: Z */
                public static final ArrayList f10142Z = new ArrayList();

                /* JADX INFO: renamed from: a0 */
                public static final int[] f10143a0 = {1, 0, 3, 2};

                /* JADX INFO: renamed from: b0 */
                public static final int[] f10144b0 = new int[2];

                public C1216c(Context context, C1248o0 c1248o0, SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             C1217d c1217d = C1217d.f10156a;
/* 11 */            this.f10152f = new C1702a();
/* 15 */            this.f10145U = 0L;
/* 23 */            this.f10146V = new AtomicBoolean(false);
/* 25 */            Context applicationContext = context.getApplicationContext();
/* 32 */            this.f10147a = applicationContext != null ? applicationContext : context;
/* 34 */            this.f10148b = sentryAndroidOptions;
/* 36 */            this.f10149c = c1248o0;
/* 38 */            this.f10150d = c1217d;
/* 45 */            this.f10151e = new ArrayList();
/* 47 */            int[] iArr = f10144b0;
/* 51 */            iArr[0] = 12;
/* 56 */            iArr[1] = 16;
/* 63 */            m4832n(new RunnableC1214a(this, 1));
/* 68 */            C1191g0.f10017e.m4788c(this);
                }

                /* JADX INFO: renamed from: g */
                public static boolean m4825g(Context context, ILogger iLogger, C1248o0 c1248o0, ConnectivityManager.NetworkCallback networkCallback) {
/* 1 */             c1248o0.getClass();
/* 8 */             if (!AbstractC1417a.m5179r(context)) {
/* 17 */                iLogger.mo4672k(EnumC1553m5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
/* 14 */                return false;
                    }
/* 21 */            C1702a c1702a = f10141Y;
/* 23 */            c1702a.m5443c();
                    try {
/* 28 */                f10142Z.add(networkCallback);
/* 31 */                c1702a.close();
/* 34 */                return true;
                    } catch (Throwable th) {
                        try {
/* 37 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 42 */                    th.addSuppressed(th2);
                        }
/* 45 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: k */
                public static String m4826k(NetworkCapabilities networkCapabilities) {
/* 6 */             if (networkCapabilities.hasTransport(3)) {
/* 8 */                 return "ethernet";
                    }
/* 16 */            if (networkCapabilities.hasTransport(1)) {
/* 18 */                return "wifi";
                    }
/* 26 */            if (networkCapabilities.hasTransport(0)) {
/* 28 */                return "cellular";
                    }
/* 31 */            return null;
                }

                /* JADX INFO: renamed from: m */
                public static ConnectivityManager m4827m(Context context, ILogger iLogger) {
/* 3 */             if (f10140X != null) {
/* 5 */                 return f10140X;
                    }
/* 8 */             C1702a c1702a = f10139W;
/* 10 */            c1702a.m5443c();
                    try {
/* 15 */                if (f10140X != null) {
/* 17 */                    ConnectivityManager connectivityManager = f10140X;
/* 19 */                    c1702a.close();
/* 22 */                    return connectivityManager;
                        }
/* 33 */                f10140X = (ConnectivityManager) context.getSystemService("connectivity");
/* 37 */                if (f10140X == null) {
/* 46 */                    iLogger.mo4672k(EnumC1553m5.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
                        }
/* 49 */                ConnectivityManager connectivityManager2 = f10140X;
/* 51 */                c1702a.close();
/* 54 */                return connectivityManager2;
                    } catch (Throwable th) {
                        try {
/* 55 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 60 */                    th.addSuppressed(th2);
                        }
/* 63 */                throw th;
                    }
                }

                @Override // io.sentry.InterfaceC1631q0
                /* JADX INFO: renamed from: Z0 */
                public final void mo4828Z0(InterfaceC1578p0 interfaceC1578p0) {
/* 1 */             C1702a c1702a = this.f10152f;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 this.f10151e.remove(interfaceC1578p0);
/* 11 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 16 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 21 */                    th.addSuppressed(th2);
                        }
/* 24 */                throw th;
                    }
                }

                @Override // io.sentry.android.core.InterfaceC1182d0
                /* JADX INFO: renamed from: c */
                public final void mo4761c() {
/* 3 */             if (this.f10153i != null) {
/* 5 */                 return;
                    }
/* 12 */            m4832n(new RunnableC1214a(this, 3));
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 7 */             m4832n(new RunnableC1214a(this, 0));
                }

                @Override // io.sentry.android.core.InterfaceC1182d0
                /* JADX INFO: renamed from: f */
                public final void mo4762f() {
/* 3 */             if (this.f10153i == null) {
/* 5 */                 return;
                    }
/* 12 */            m4832n(new RunnableC1214a(this, 2));
                }

                /* JADX INFO: renamed from: h */
                public final void m4829h() {
/* 5 */             if (AbstractC1245n0.m4882j() && this.f10153i == null) {
/* 13 */                C1702a c1702a = this.f10152f;
/* 15 */                c1702a.m5443c();
                        try {
/* 20 */                    if (this.f10153i != null) {
/* 22 */                        c1702a.close();
/* 25 */                        return;
                            }
/* 28 */                    C1215b c1215b = new C1215b(this);
/* 31 */                    Context context = this.f10147a;
/* 35 */                    ILogger logger = this.f10148b.getLogger();
/* 41 */                    this.f10149c.getClass();
/* 44 */                    ConnectivityManager connectivityManagerM4827m = m4827m(context, logger);
/* 49 */                    if (connectivityManagerM4827m != null) {
/* 56 */                        if (AbstractC1417a.m5179r(context)) {
                                    try {
/* 68 */                                connectivityManagerM4827m.registerDefaultNetworkCallback(c1215b);
/* 71 */                                this.f10153i = c1215b;
/* 85 */                                this.f10148b.getLogger().mo4672k(EnumC1553m5.DEBUG, "Network callback registered successfully", new Object[0]);
                                    } catch (Throwable th) {
/* 96 */                                logger.mo4671d(EnumC1553m5.WARNING, "registerDefaultNetworkCallback failed", th);
/* 111 */                               this.f10148b.getLogger().mo4672k(EnumC1553m5.WARNING, "Failed to register network callback", new Object[0]);
                                    }
/* 114 */                           c1702a.close();
                                }
/* 64 */                        logger.mo4672k(EnumC1553m5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                            }
/* 111 */                   this.f10148b.getLogger().mo4672k(EnumC1553m5.WARNING, "Failed to register network callback", new Object[0]);
/* 114 */                   c1702a.close();
                        } catch (Throwable th2) {
                            try {
/* 118 */                       c1702a.close();
                            } catch (Throwable th3) {
/* 123 */                       th2.addSuppressed(th3);
                            }
/* 126 */                   throw th2;
                        }
                    }
                }

                /* JADX INFO: renamed from: i */
                public final EnumC1570o0 m4830i() {
/* 4 */             if (this.f10154v != null) {
/* 6 */                 NetworkCapabilities networkCapabilities = this.f10154v;
/* 8 */                 if (networkCapabilities != null) {
/* 13 */                    boolean zHasCapability = networkCapabilities.hasCapability(12);
/* 19 */                    this.f10149c.getClass();
/* 22 */                    if (zHasCapability && networkCapabilities.hasCapability(16)) {
/* 35 */                        for (int i : f10143a0) {
/* 43 */                            if (networkCapabilities.hasTransport(i)) {
/* 45 */                                return EnumC1570o0.CONNECTED;
                                    }
                                }
                            }
                        }
/* 51 */                return EnumC1570o0.DISCONNECTED;
                    }
/* 62 */            ConnectivityManager connectivityManagerM4827m = m4827m(this.f10147a, this.f10148b.getLogger());
/* 66 */            if (connectivityManagerM4827m == null) {
/* 136 */               return EnumC1570o0.UNKNOWN;
                    }
/* 68 */            Context context = this.f10147a;
/* 72 */            ILogger logger = this.f10148b.getLogger();
/* 80 */            if (!AbstractC1417a.m5179r(context)) {
/* 88 */                logger.mo4672k(EnumC1553m5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
/* 91 */                return EnumC1570o0.NO_PERMISSION;
                    }
                    try {
/* 94 */                NetworkInfo activeNetworkInfo = connectivityManagerM4827m.getActiveNetworkInfo();
/* 98 */                if (activeNetworkInfo != null) {
                            return activeNetworkInfo.isConnected() ? EnumC1570o0.CONNECTED : EnumC1570o0.DISCONNECTED;
                        }
/* 106 */               logger.mo4672k(EnumC1553m5.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
/* 109 */               return EnumC1570o0.DISCONNECTED;
                    } catch (Throwable th) {
/* 130 */               logger.mo4671d(EnumC1553m5.WARNING, "Could not retrieve Connection Status", th);
/* 133 */               return EnumC1570o0.UNKNOWN;
                    }
                }

                /* JADX INFO: renamed from: l */
                public final String m4831l() {
/* 1 */             NetworkCapabilities networkCapabilities = this.f10154v;
/* 3 */             if (networkCapabilities != null) {
/* 5 */                 return m4826k(networkCapabilities);
                    }
/* 10 */            Context context = this.f10147a;
/* 14 */            ILogger logger = this.f10148b.getLogger();
/* 18 */            C1248o0 c1248o0 = this.f10149c;
/* 20 */            ConnectivityManager connectivityManagerM4827m = m4827m(context, logger);
/* 25 */            if (connectivityManagerM4827m != null) {
/* 33 */                if (!AbstractC1417a.m5179r(context)) {
/* 41 */                    logger.mo4672k(EnumC1553m5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
/* 24 */                    return null;
                        }
                        try {
/* 45 */                    c1248o0.getClass();
/* 48 */                    Network activeNetwork = connectivityManagerM4827m.getActiveNetwork();
/* 52 */                    if (activeNetwork == null) {
/* 60 */                        logger.mo4672k(EnumC1553m5.INFO, "Network is null and cannot check network status", new Object[0]);
/* 24 */                        return null;
                            }
/* 66 */                    NetworkCapabilities networkCapabilities2 = connectivityManagerM4827m.getNetworkCapabilities(activeNetwork);
/* 70 */                    if (networkCapabilities2 == null) {
/* 78 */                        logger.mo4672k(EnumC1553m5.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
/* 24 */                        return null;
                            }
/* 83 */                    boolean zHasTransport = networkCapabilities2.hasTransport(3);
/* 88 */                    boolean zHasTransport2 = networkCapabilities2.hasTransport(1);
/* 92 */                    boolean zHasTransport3 = networkCapabilities2.hasTransport(0);
/* 96 */                    if (zHasTransport) {
/* 98 */                        return "ethernet";
                            }
/* 101 */                   if (zHasTransport2) {
/* 103 */                       return "wifi";
                            }
/* 106 */                   if (zHasTransport3) {
/* 108 */                       return "cellular";
                            }
                        } catch (Throwable th) {
/* 116 */                   logger.mo4671d(EnumC1553m5.ERROR, "Failed to retrieve network info", th);
/* 24 */                    return null;
                        }
                    }
/* 24 */            return null;
                }

                /* JADX INFO: renamed from: n */
                public final void m4832n(Runnable runnable) {
/* 1 */             SentryAndroidOptions sentryAndroidOptions = this.f10148b;
                    try {
/* 7 */                 sentryAndroidOptions.getExecutorService().submit(runnable);
                    } catch (Throwable th) {
/* 20 */                sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "AndroidConnectionStatusProvider submit failed", th);
                    }
                }

                /* JADX INFO: renamed from: o */
                public final void m4833o(boolean z) {
/* 1 */             C1702a c1702a = this.f10152f;
/* 3 */             c1702a.m5443c();
/* 6 */             if (z) {
                        try {
/* 10 */                    this.f10151e.clear();
                        } catch (Throwable th) {
                            try {
/* 78 */                        c1702a.close();
                            } catch (Throwable th2) {
/* 83 */                        th.addSuppressed(th2);
                            }
/* 86 */                    throw th;
                        }
                    }
/* 16 */            C1215b c1215b = this.f10153i;
/* 19 */            this.f10153i = null;
/* 21 */            if (c1215b != null) {
/* 23 */                Context context = this.f10147a;
/* 27 */                ILogger logger = this.f10148b.getLogger();
/* 31 */                ConnectivityManager connectivityManagerM4827m = m4827m(context, logger);
/* 35 */                if (connectivityManagerM4827m != null) {
                            try {
/* 38 */                        connectivityManagerM4827m.unregisterNetworkCallback(c1215b);
                            } catch (Throwable th3) {
/* 47 */                        logger.mo4671d(EnumC1553m5.WARNING, "unregisterNetworkCallback failed", th3);
                            }
                        }
                    }
/* 50 */            this.f10154v = null;
/* 52 */            this.f10155w = null;
/* 56 */            this.f10145U = 0L;
/* 58 */            c1702a.close();
/* 74 */            this.f10148b.getLogger().mo4672k(EnumC1553m5.DEBUG, "Network callback unregistered", new Object[0]);
                }

                /* JADX INFO: renamed from: p */
                public final void m4834p(NetworkCapabilities networkCapabilities) {
/* 3 */             C1702a c1702a = this.f10152f;
/* 5 */             c1702a.m5443c();
                    try {
/* 10 */                if (networkCapabilities != null) {
/* 12 */                    this.f10154v = networkCapabilities;
                        } else {
/* 24 */                    if (!AbstractC1417a.m5179r(this.f10147a)) {
/* 38 */                        this.f10148b.getLogger().mo4672k(EnumC1553m5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
/* 41 */                        this.f10154v = null;
/* 45 */                        this.f10150d.getClass();
/* 52 */                        this.f10145U = SystemClock.uptimeMillis();
/* 54 */                        c1702a.close();
/* 57 */                        return;
                            }
/* 60 */                    this.f10149c.getClass();
/* 71 */                    ConnectivityManager connectivityManagerM4827m = m4827m(this.f10147a, this.f10148b.getLogger());
/* 75 */                    if (connectivityManagerM4827m != null) {
/* 77 */                        Network activeNetwork = connectivityManagerM4827m.getActiveNetwork();
/* 89 */                        this.f10154v = activeNetwork != null ? connectivityManagerM4827m.getNetworkCapabilities(activeNetwork) : null;
                            } else {
/* 92 */                        this.f10154v = null;
                            }
                        }
/* 96 */                this.f10150d.getClass();
/* 103 */               this.f10145U = SystemClock.uptimeMillis();
/* 143 */               this.f10148b.getLogger().mo4672k(EnumC1553m5.DEBUG, "Cache updated - Status: " + m4830i() + ", Type: " + m4831l(), new Object[0]);
                    } catch (Throwable th) {
                        try {
/* 157 */                   this.f10148b.getLogger().mo4671d(EnumC1553m5.WARNING, "Failed to update connection status cache", th);
/* 160 */                   this.f10154v = null;
/* 164 */                   this.f10150d.getClass();
/* 171 */                   this.f10145U = SystemClock.uptimeMillis();
                        } catch (Throwable th2) {
                            try {
/* 178 */                       c1702a.close();
                            } catch (Throwable th3) {
/* 183 */                       th2.addSuppressed(th3);
                            }
/* 186 */                   throw th2;
                        }
                    }
/* 173 */           c1702a.close();
                }

                @Override // io.sentry.InterfaceC1631q0
                /* JADX INFO: renamed from: r0 */
                public final EnumC1570o0 mo4835r0() {
/* 3 */             this.f10150d.getClass();
/* 18 */            if (SystemClock.uptimeMillis() - this.f10145U >= 120000) {
/* 22 */                m4834p(null);
                    }
/* 25 */            return m4830i();
                }

                @Override // io.sentry.InterfaceC1631q0
                /* JADX INFO: renamed from: u */
                public final String mo4836u() {
/* 3 */             this.f10150d.getClass();
/* 18 */            if (SystemClock.uptimeMillis() - this.f10145U >= 120000) {
/* 22 */                m4834p(null);
                    }
/* 25 */            return m4831l();
                }

                @Override // io.sentry.InterfaceC1631q0
                /* JADX INFO: renamed from: z0 */
                public final boolean mo4837z0(InterfaceC1578p0 interfaceC1578p0) {
/* 1 */             C1702a c1702a = this.f10152f;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 this.f10151e.add(interfaceC1578p0);
/* 11 */                c1702a.close();
/* 14 */                m4829h();
                        return this.f10153i != null;
                    } catch (Throwable th) {
                        try {
/* 26 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 31 */                    th.addSuppressed(th2);
                        }
/* 34 */                throw th;
                    }
                }
            }
