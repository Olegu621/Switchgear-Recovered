            package io.sentry.android.core;

            import android.net.ConnectivityManager;
            import android.net.Network;
            import android.net.NetworkCapabilities;
            import android.os.Build;
            import io.sentry.C1443f;
            import io.sentry.C1469h4;
            import io.sentry.C1486i0;
            import io.sentry.EnumC1553m5;
            import io.sentry.InterfaceC1699u4;
            import io.sentry.android.core.internal.util.C1216c;
            import io.sentry.util.AbstractC1704c;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: io.sentry.android.core.e1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1186e1 extends ConnectivityManager.NetworkCallback {

                /* JADX INFO: renamed from: b */
                public final C1248o0 f10003b;

                /* JADX INFO: renamed from: e */
                public final InterfaceC1699u4 f10006e;

                /* JADX INFO: renamed from: c */
                public NetworkCapabilities f10004c = null;

                /* JADX INFO: renamed from: d */
                public long f10005d = 0;

                /* JADX INFO: renamed from: a */
                public final C1469h4 f10002a = C1469h4.f10976a;

                public C1186e1(C1248o0 c1248o0, InterfaceC1699u4 interfaceC1699u4) {
/* 17 */            AbstractC1704c.m5462q(c1248o0, "BuildInfoProvider is required");
/* 20 */            this.f10003b = c1248o0;
/* 24 */            AbstractC1704c.m5462q(interfaceC1699u4, "SentryDateProvider is required");
/* 27 */            this.f10006e = interfaceC1699u4;
                }

                /* JADX INFO: renamed from: a */
                public static C1443f m4783a(String str) {
/* 3 */             C1443f c1443f = new C1443f();
/* 8 */             c1443f.f10930e = "system";
/* 12 */            c1443f.f10932i = "network.event";
/* 16 */            c1443f.m5209d(str, "action");
/* 21 */            c1443f.f10934w = EnumC1553m5.INFO;
/* 23 */            return c1443f;
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onAvailable(Network network) {
/* 9 */             this.f10002a.mo5089i(m4783a("NETWORK_AVAILABLE"));
/* 13 */            this.f10004c = null;
                }

                /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
                /* JADX WARN: Code duplicated, block: B:50:0x00de  */
                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                    int i;
                    C1183d1 c1183d1;
                    boolean z;
                    boolean z2;
                    C1183d1 c1183d2;
                    C1183d1 c1183d3;
/* 11 */            long jMo5278d = this.f10006e.mo4856a().mo5278d();
/* 15 */            NetworkCapabilities networkCapabilities2 = this.f10004c;
/* 17 */            long j = this.f10005d;
/* 19 */            C1248o0 c1248o0 = this.f10003b;
/* 21 */            if (networkCapabilities2 == null) {
/* 25 */                c1183d3 = new C1183d1(networkCapabilities, c1248o0, jMo5278d);
                    } else {
/* 32 */                AbstractC1704c.m5462q(c1248o0, "BuildInfoProvider is required");
/* 35 */                int linkDownstreamBandwidthKbps = networkCapabilities2.getLinkDownstreamBandwidthKbps();
/* 39 */                int linkUpstreamBandwidthKbps = networkCapabilities2.getLinkUpstreamBandwidthKbps();
/* 54 */                int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities2.getSignalStrength() : 0;
/* 57 */                if (signalStrength <= -100) {
/* 60 */                    signalStrength = 0;
                        }
/* 62 */                boolean zHasTransport = networkCapabilities2.hasTransport(4);
/* 66 */                String strM4826k = C1216c.m4826k(networkCapabilities2);
/* 70 */                if (strM4826k == null) {
/* 73 */                    strM4826k = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 77 */                C1183d1 c1183d4 = new C1183d1(networkCapabilities, c1248o0, jMo5278d);
/* 83 */                int iAbs = Math.abs(signalStrength - c1183d4.f9993c);
/* 91 */                int iAbs2 = Math.abs(linkDownstreamBandwidthKbps - c1183d4.f9991a);
/* 99 */                int iAbs3 = Math.abs(linkUpstreamBandwidthKbps - c1183d4.f9992b);
/* 130 */               boolean z3 = ((double) Math.abs(j - c1183d4.f9994d)) / 1000000.0d < 5000.0d;
/* 139 */               boolean z4 = z3 || iAbs <= 5;
/* 152 */               if (z3) {
/* 175 */                   i = linkUpstreamBandwidthKbps;
/* 176 */                   c1183d1 = c1183d4;
                        } else {
/* 154 */                   c1183d1 = c1183d4;
                            double d = iAbs2;
/* 161 */                   i = linkUpstreamBandwidthKbps;
/* 170 */                   if (d > Math.max(1000.0d, ((double) Math.abs(linkDownstreamBandwidthKbps)) * 0.1d)) {
/* 173 */                       z = false;
                            }
/* 179 */                   if (!z3 || iAbs3 <= Math.max(1000.0d, ((double) Math.abs(i)) * 0.1d)) {
/* 201 */                       z2 = true;
                            } else {
/* 197 */                       z2 = false;
                            }
/* 198 */                   c1183d2 = c1183d1;
/* 205 */                   if (zHasTransport != c1183d2.f9995e && strM4826k.equals(c1183d2.f9996f) && z4 && z && z2) {
/* 221 */                       c1183d3 = null;
                            } else {
/* 223 */                       c1183d3 = c1183d2;
                            }
                        }
/* 178 */               z = true;
/* 179 */               if (z3) {
/* 201 */                   z2 = true;
                        } else {
/* 201 */                   z2 = true;
                        }
/* 198 */               c1183d2 = c1183d1;
/* 205 */               if (zHasTransport != c1183d2.f9995e) {
/* 223 */                   c1183d3 = c1183d2;
                        } else {
/* 223 */                   c1183d3 = c1183d2;
                        }
                    }
/* 224 */           if (c1183d3 == null) {
/* 226 */               return;
                    }
/* 227 */           this.f10004c = networkCapabilities;
/* 229 */           this.f10005d = jMo5278d;
/* 233 */           C1443f c1443fM4783a = m4783a("NETWORK_CAPABILITIES_CHANGED");
/* 245 */           c1443fM4783a.m5209d(Integer.valueOf(c1183d3.f9991a), "download_bandwidth");
/* 256 */           c1443fM4783a.m5209d(Integer.valueOf(c1183d3.f9992b), "upload_bandwidth");
/* 267 */           c1443fM4783a.m5209d(Boolean.valueOf(c1183d3.f9995e), "vpn_active");
/* 274 */           c1443fM4783a.m5209d(c1183d3.f9996f, "network_type");
/* 277 */           int i2 = c1183d3.f9993c;
/* 279 */           if (i2 != 0) {
/* 287 */               c1443fM4783a.m5209d(Integer.valueOf(i2), "signal_strength");
                    }
/* 292 */           C1486i0 c1486i0 = new C1486i0();
/* 297 */           c1486i0.m5275d(c1183d3, "android:networkCapabilities");
/* 302 */           this.f10002a.mo5086f(c1443fM4783a, c1486i0);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onLost(Network network) {
/* 9 */             this.f10002a.mo5089i(m4783a("NETWORK_LOST"));
/* 13 */            this.f10004c = null;
                }
            }
