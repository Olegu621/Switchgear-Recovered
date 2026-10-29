            package com.appsflyer.internal;

            import android.content.Context;
            import android.net.ConnectivityManager;
            import android.net.NetworkInfo;
            import com.appsflyer.AFLogger;
            import java.net.NetworkInterface;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Enumeration;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFi1nSDK extends AFi1qSDK {
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AFi1nSDK(Context context) {
/* 4 */             super(context);
/* 1 */             context.getClass();
                }

                @Override // com.appsflyer.internal.AFi1qSDK
                public final String AFAdRevenueData() {
/* 1 */             ConnectivityManager connectivityManager = this.AFAdRevenueData;
/* 5 */             if (connectivityManager != null) {
/* 18 */                if (AFi1qSDK.m1821v_(connectivityManager.getNetworkInfo(1))) {
/* 16 */                    return "WIFI";
                        }
/* 32 */                if (AFi1qSDK.m1821v_(connectivityManager.getNetworkInfo(0))) {
/* 30 */                    return "MOBILE";
                        }
/* 35 */                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
/* 39 */                if (activeNetworkInfo != null) {
/* 41 */                    int type = activeNetworkInfo.getType();
/* 45 */                    if (type != 0) {
                                return type != 1 ? "unknown" : "WIFI";
                            }
/* 30 */                    return "MOBILE";
                        }
                    }
/* 3 */             return "unknown";
                }

                @Override // com.appsflyer.internal.AFi1qSDK
                public final boolean getMediationNetwork() {
                    try {
/* 2 */                 Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
/* 6 */                 networkInterfaces.getClass();
/* 9 */                 ArrayList<NetworkInterface> list = Collections.list(networkInterfaces);
/* 13 */                list.getClass();
/* 16 */                if (list != null && list.isEmpty()) {
/* 1 */                     return false;
                        }
/* 35 */                for (NetworkInterface networkInterface : list) {
/* 47 */                    if (networkInterface.isUp() && Intrinsics.m6216a(networkInterface.getName(), "tun0")) {
/* 61 */                        return true;
                            }
                        }
/* 1 */                 return false;
                    } catch (Exception e) {
/* 65 */                AFLogger.afErrorLog("Failed collecting ivc data", e);
/* 1 */                 return false;
                    }
                }
            }
