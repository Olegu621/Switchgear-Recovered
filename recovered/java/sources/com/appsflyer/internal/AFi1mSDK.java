            package com.appsflyer.internal;

            import android.content.Context;
            import android.net.ConnectivityManager;
            import android.net.Network;
            import android.net.NetworkCapabilities;
            import android.net.NetworkRequest;
            import com.appsflyer.AFLogger;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 35 */    public final class AFi1mSDK extends AFi1qSDK {
                private String getMonetizationNetwork;
                private Network getRevenue;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class AFa1vSDK extends ConnectivityManager.NetworkCallback {
                    public AFa1vSDK() {
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onAvailable(Network network) {
/* 1 */                 network.getClass();
/* 1 */                 AFi1mSDK.this.getRevenue = network;
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onLost(Network network) {
/* 1 */                 network.getClass();
/* 1 */                 AFi1mSDK.this.getRevenue = network;
/* 37 */                AFi1mSDK.this.getMonetizationNetwork = "NetworkLost";
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AFi1mSDK(Context context) {
/* 4 */             super(context);
/* 1 */             context.getClass();
/* 9 */             this.getMonetizationNetwork = "unknown";
/* 13 */            AFa1vSDK aFa1vSDK = new AFa1vSDK();
                    try {
/* 16 */                ConnectivityManager connectivityManager = this.AFAdRevenueData;
/* 18 */                if (connectivityManager != null) {
/* 29 */                    connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), aFa1vSDK);
                        }
                    } catch (Throwable th) {
/* 49 */                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.DEVICE_DATA, "Error at attempt to register network callback with ConnectivityManager", th, true, false, false, false, 96, null);
                    }
                }

                /* JADX INFO: renamed from: y_ */
                private static boolean m1819y_(NetworkCapabilities networkCapabilities) {
                    return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
                }

                @Override // com.appsflyer.internal.AFi1qSDK
                public final String AFAdRevenueData() {
/* 1 */             Network network = this.getRevenue;
/* 5 */             if (network != null) {
/* 7 */                 ConnectivityManager connectivityManager = this.AFAdRevenueData;
/* 16 */                NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
/* 17 */                if (networkCapabilities != null) {
/* 24 */                    if (networkCapabilities.hasTransport(1)) {
/* 26 */                        return "WIFI";
                            }
/* 34 */                    if (networkCapabilities.hasTransport(0)) {
/* 36 */                        return "MOBILE";
                            }
                        }
                    }
/* 3 */             return "unknown";
                }

                @Override // com.appsflyer.internal.AFi1qSDK
                public final boolean getMediationNetwork() {
/* 1 */             Network network = this.getRevenue;
/* 3 */             if (network == null) {
/* 35 */                return false;
                    }
/* 14 */            if (Intrinsics.m6216a(this.getMonetizationNetwork, "NetworkLost")) {
/* 17 */                network = null;
                    }
/* 18 */            if (network == null) {
/* 35 */                return false;
                    }
/* 20 */            ConnectivityManager connectivityManager = this.AFAdRevenueData;
/* 24 */            NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
/* 28 */            if (networkCapabilities != null) {
/* 30 */                return m1819y_(networkCapabilities);
                    }
/* 35 */            return false;
                }
            }
