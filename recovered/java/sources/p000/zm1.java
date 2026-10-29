            package p000;

            import android.content.Context;
            import android.net.ConnectivityManager;
            import android.net.LinkProperties;
            import android.net.Network;
            import android.net.NetworkCapabilities;
            import android.net.RouteInfo;
            import android.os.Build;
            import com.supercell.titan.NetworkInfo;
            import java.util.HashMap;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zm1 extends ConnectivityManager.NetworkCallback {

                /* JADX INFO: renamed from: a */
                public final ConnectivityManager f20260a;

                /* JADX INFO: renamed from: b */
                public final HashMap f20261b = new HashMap();

                /* JADX INFO: renamed from: c */
                public Network f20262c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ NetworkInfo f20263d;

                public zm1(NetworkInfo networkInfo, Context context) {
/* 1 */             this.f20263d = networkInfo;
/* 21 */            this.f20260a = (ConnectivityManager) context.getSystemService("connectivity");
                }

                /* JADX INFO: renamed from: a */
                public final void m10406a() {
/* 9 */             Integer num = (Integer) this.f20261b.get(this.f20262c);
/* 21 */            this.f20263d.f5853b = num == null ? 1 : num.intValue();
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onAvailable(Network network) {
/* 5 */             if (Build.VERSION.SDK_INT >= 26) {
/* 28 */                return;
                    }
/* 8 */             ConnectivityManager connectivityManager = this.f20260a;
/* 10 */            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
/* 14 */            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
/* 18 */            if (networkCapabilities == null || linkProperties == null) {
/* 28 */                return;
                    }
/* 22 */            onCapabilitiesChanged(network, networkCapabilities);
/* 25 */            onLinkPropertiesChanged(network, linkProperties);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                    int i;
/* 3 */             boolean zHasCapability = networkCapabilities.hasCapability(12);
/* 7 */             HashMap map = this.f20261b;
/* 9 */             if (zHasCapability && networkCapabilities.hasCapability(16)) {
/* 24 */                if (networkCapabilities.hasTransport(0)) {
/* 26 */                    i = 3;
                        } else if (networkCapabilities.hasTransport(1)) {
/* 36 */                    i = 4;
                        } else {
/* 46 */                    i = networkCapabilities.hasTransport(4) ? 5 : 2;
                        }
/* 51 */                map.put(network, Integer.valueOf(i));
                    } else {
/* 55 */                map.remove(network);
                    }
/* 58 */            m10406a();
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
/* 5 */             Iterator<RouteInfo> it = linkProperties.getRoutes().iterator();
/* 13 */            while (it.hasNext()) {
/* 25 */                if (it.next().isDefaultRoute()) {
/* 27 */                    this.f20262c = network;
/* 37 */                    m10406a();
                        }
                    }
/* 32 */            if (this.f20262c == network) {
/* 35 */                this.f20262c = null;
                    }
/* 37 */            m10406a();
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onLost(Network network) {
/* 3 */             this.f20261b.remove(network);
/* 6 */             m10406a();
                }
            }
