            package io.sentry.android.core.internal.util;

            import android.net.ConnectivityManager;
            import android.net.Network;
            import android.net.NetworkCapabilities;
            import android.os.SystemClock;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1570o0;
            import io.sentry.InterfaceC1578p0;
            import io.sentry.util.C1702a;
            import java.util.Iterator;
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.util.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1215b extends ConnectivityManager.NetworkCallback {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C1216c f10138a;

                public C1215b(C1216c c1216c) {
/* 1 */             this.f10138a = c1216c;
                }

                /* JADX INFO: renamed from: a */
                public final void m4824a() {
/* 6 */             this.f10138a.f10146V.set(false);
/* 11 */            C1702a c1702a = this.f10138a.f10152f;
/* 13 */            c1702a.m5443c();
                    try {
/* 19 */                this.f10138a.f10154v = null;
/* 23 */                this.f10138a.f10155w = null;
/* 25 */                C1216c c1216c = this.f10138a;
/* 29 */                c1216c.f10150d.getClass();
/* 36 */                c1216c.f10145U = SystemClock.uptimeMillis();
/* 52 */                this.f10138a.f10148b.getLogger().mo4672k(EnumC1553m5.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);
/* 59 */                Iterator it = this.f10138a.f10151e.iterator();
/* 67 */                while (it.hasNext()) {
/* 77 */                    ((InterfaceC1578p0) it.next()).mo4757f(EnumC1570o0.DISCONNECTED);
                        }
/* 83 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 87 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 92 */                    th.addSuppressed(th2);
                        }
/* 95 */                throw th;
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onAvailable(Network network) {
/* 3 */             this.f10138a.f10155w = network;
/* 14 */            if (this.f10138a.f10146V.getAndSet(true)) {
/* 58 */                return;
                    }
/* 16 */            C1702a c1702a = C1216c.f10141Y;
/* 18 */            c1702a.m5443c();
                    try {
/* 23 */                Iterator it = C1216c.f10142Z.iterator();
/* 31 */                while (it.hasNext()) {
/* 39 */                    ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
                        }
/* 45 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 49 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 54 */                    th.addSuppressed(th2);
                        }
/* 57 */                throw th;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:33:0x006b A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #1 {all -> 0x0075, blocks: (B:30:0x005d, B:31:0x0065, B:33:0x006b), top: B:61:0x005d }] */
                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                    EnumC1570o0 enumC1570o0M4830i;
                    C1702a c1702a;
                    Iterator it;
/* 9 */             if (network.equals(this.f10138a.f10155w)) {
/* 14 */                NetworkCapabilities networkCapabilities2 = this.f10138a.f10154v;
/* 16 */                int i = 0;
/* 27 */                if ((networkCapabilities2 == null) != (networkCapabilities == null)) {
/* 78 */                    this.f10138a.m4834p(networkCapabilities);
/* 83 */                    enumC1570o0M4830i = this.f10138a.m4830i();
/* 89 */                    c1702a = this.f10138a.f10152f;
/* 91 */                    c1702a.m5443c();
/* 98 */                    it = this.f10138a.f10151e.iterator();
/* 106 */                   while (it.hasNext()) {
/* 114 */                       ((InterfaceC1578p0) it.next()).mo4757f(enumC1570o0M4830i);
                            }
/* 120 */                   c1702a.close();
                        } else if (networkCapabilities2 != null || networkCapabilities != null) {
/* 35 */                    int[] iArr = C1216c.f10144b0;
/* 37 */                    int length = iArr.length;
/* 38 */                    int i2 = 0;
                            while (true) {
/* 39 */                        if (i2 >= length) {
/* 59 */                            int[] iArr2 = C1216c.f10143a0;
/* 61 */                            int length2 = iArr2.length;
                                    while (true) {
/* 62 */                                if (i < length2) {
/* 64 */                                    int i3 = iArr2[i];
/* 74 */                                    if (networkCapabilities2.hasTransport(i3) == networkCapabilities.hasTransport(i3)) {
/* 133 */                                       i++;
                                            }
                                        }
                                    }
                                } else {
/* 41 */                            int i4 = iArr[i2];
/* 43 */                            if (i4 == 0 || networkCapabilities2.hasCapability(i4) == networkCapabilities.hasCapability(i4)) {
/* 56 */                                i2++;
                                    }
                                }
/* 78 */                        this.f10138a.m4834p(networkCapabilities);
/* 83 */                        enumC1570o0M4830i = this.f10138a.m4830i();
/* 89 */                        c1702a = this.f10138a.f10152f;
/* 91 */                        c1702a.m5443c();
                                try {
/* 98 */                            it = this.f10138a.f10151e.iterator();
/* 106 */                           while (it.hasNext()) {
/* 114 */                               ((InterfaceC1578p0) it.next()).mo4757f(enumC1570o0M4830i);
                                    }
/* 120 */                           c1702a.close();
                                } catch (Throwable th) {
                                    try {
/* 124 */                               c1702a.close();
                                    } catch (Throwable th2) {
/* 129 */                               th.addSuppressed(th2);
                                    }
/* 132 */                           throw th;
                                }
                            }
                        }
/* 136 */               C1702a c1702a2 = C1216c.f10141Y;
/* 138 */               c1702a2.m5443c();
                        try {
/* 143 */                   Iterator it2 = C1216c.f10142Z.iterator();
/* 151 */                   while (it2.hasNext()) {
/* 159 */                       ((ConnectivityManager.NetworkCallback) it2.next()).onCapabilitiesChanged(network, networkCapabilities);
                            }
/* 165 */                   c1702a2.close();
                        } catch (Throwable th3) {
                            try {
/* 169 */                       c1702a2.close();
                            } catch (Throwable th4) {
/* 174 */                       th3.addSuppressed(th4);
                            }
/* 177 */                   throw th3;
                        }
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onLost(Network network) {
/* 9 */             if (network.equals(this.f10138a.f10155w)) {
/* 12 */                m4824a();
/* 15 */                C1702a c1702a = C1216c.f10141Y;
/* 17 */                c1702a.m5443c();
                        try {
/* 22 */                    Iterator it = C1216c.f10142Z.iterator();
/* 30 */                    while (it.hasNext()) {
/* 38 */                        ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
                            }
/* 44 */                    c1702a.close();
                        } catch (Throwable th) {
                            try {
/* 48 */                        c1702a.close();
                            } catch (Throwable th2) {
/* 53 */                        th.addSuppressed(th2);
                            }
/* 56 */                    throw th;
                        }
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onUnavailable() {
/* 1 */             m4824a();
/* 4 */             C1702a c1702a = C1216c.f10141Y;
/* 6 */             c1702a.m5443c();
                    try {
/* 11 */                Iterator it = C1216c.f10142Z.iterator();
/* 19 */                while (it.hasNext()) {
/* 1 */                     ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
                        }
/* 33 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 37 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 42 */                    th.addSuppressed(th2);
                        }
/* 45 */                throw th;
                    }
                }
            }
