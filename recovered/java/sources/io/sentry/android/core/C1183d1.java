            package io.sentry.android.core;

            import android.net.NetworkCapabilities;
            import android.os.Build;
            import io.sentry.android.core.internal.util.C1216c;
            import io.sentry.util.AbstractC1704c;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: io.sentry.android.core.d1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1183d1 {

                /* JADX INFO: renamed from: a */
                public final int f9991a;

                /* JADX INFO: renamed from: b */
                public final int f9992b;

                /* JADX INFO: renamed from: c */
                public final int f9993c;

                /* JADX INFO: renamed from: d */
                public final long f9994d;

                /* JADX INFO: renamed from: e */
                public final boolean f9995e;

                /* JADX INFO: renamed from: f */
                public final String f9996f;

                public C1183d1(NetworkCapabilities networkCapabilities, C1248o0 c1248o0, long j) {
/* 6 */             AbstractC1704c.m5462q(networkCapabilities, "NetworkCapabilities is required");
/* 11 */            AbstractC1704c.m5462q(c1248o0, "BuildInfoProvider is required");
/* 18 */            this.f9991a = networkCapabilities.getLinkDownstreamBandwidthKbps();
/* 24 */            this.f9992b = networkCapabilities.getLinkUpstreamBandwidthKbps();
/* 38 */            int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities.getSignalStrength() : 0;
/* 44 */            this.f9993c = signalStrength > -100 ? signalStrength : 0;
/* 51 */            this.f9995e = networkCapabilities.hasTransport(4);
/* 53 */            String strM4826k = C1216c.m4826k(networkCapabilities);
/* 62 */            this.f9996f = strM4826k == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM4826k;
/* 64 */            this.f9994d = j;
                }
            }
