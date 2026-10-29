            package com.appsflyer.internal;

            import android.content.Context;
            import android.net.ConnectivityManager;
            import android.net.Network;
            import android.net.NetworkCapabilities;
            import android.net.NetworkInfo;
            import com.appsflyer.AFLogger;
            import java.util.ArrayList;
            import java.util.Iterator;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            import kotlin.sequences.Sequence;
            import p000.C0197bz;
            import p000.C2066pd;
            import p000.b51;
            import p000.ki0;
            import p000.li0;
            import p000.pd0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFi1tSDK extends AFi1qSDK {

                /* JADX INFO: renamed from: com.appsflyer.internal.AFi1tSDK$2 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, m6176d2 = {"Landroid/net/Network;", "p0", "Landroid/net/NetworkInfo;", "x_", "(Landroid/net/Network;)Landroid/net/NetworkInfo;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02782 extends b51 implements Function1<Network, NetworkInfo> {
                    public C02782() {
/* 4 */                 super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: x_, reason: merged with bridge method [inline-methods] */
                    public final NetworkInfo invoke(Network network) {
/* 3 */                 ConnectivityManager connectivityManager = AFi1tSDK.this.AFAdRevenueData;
/* 5 */                 connectivityManager.getClass();
/* 8 */                 return connectivityManager.getNetworkInfo(network);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AFi1tSDK(Context context) {
/* 4 */             super(context);
/* 1 */             context.getClass();
                }

                /* JADX INFO: renamed from: w_ */
                private static boolean m1822w_(NetworkCapabilities networkCapabilities) {
                    return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
                }

                @Override // com.appsflyer.internal.AFi1qSDK
                public final String AFAdRevenueData() {
                    Network[] allNetworks;
                    Object next;
/* 1 */             ConnectivityManager connectivityManager = this.AFAdRevenueData;
/* 3 */             if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
/* 94 */                return "unknown";
                    }
/* 20 */            Sequence c2066pd = allNetworks.length == 0 ? pd0.f15071a : new C2066pd(allNetworks, 0);
/* 24 */            if (c2066pd == null) {
/* 94 */                return "unknown";
                    }
/* 50 */            ki0 ki0Var = new ki0(new li0(new li0(c2066pd, new C02782()), new C0197bz(19)));
/* 70 */            do {
/* 57 */                if (!ki0Var.hasNext()) {
/* 73 */                    next = null;
                            break;
                        }
/* 59 */                next = ki0Var.next();
/* 70 */            } while (!AFi1qSDK.m1821v_((NetworkInfo) next));
/* 74 */            NetworkInfo networkInfo = (NetworkInfo) next;
/* 76 */            if (networkInfo == null) {
/* 94 */                return "unknown";
                    }
/* 78 */            int type = networkInfo.getType();
/* 82 */            if (type != 0) {
                        return type != 1 ? "unknown" : "WIFI";
                    }
/* 91 */            return "MOBILE";
                }

                @Override // com.appsflyer.internal.AFi1qSDK
                public final boolean getMediationNetwork() {
                    Network[] allNetworks;
                    try {
/* 2 */                 ConnectivityManager connectivityManager = this.AFAdRevenueData;
/* 4 */                 if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null) {
/* 14 */                    ArrayList arrayList = new ArrayList();
/* 19 */                    for (Network network : allNetworks) {
/* 23 */                        ConnectivityManager connectivityManager2 = this.AFAdRevenueData;
/* 25 */                        connectivityManager2.getClass();
/* 28 */                        NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
/* 32 */                        if (networkCapabilities != null) {
/* 34 */                            arrayList.add(networkCapabilities);
                                }
                            }
/* 47 */                    if (!arrayList.isEmpty()) {
/* 49 */                        Iterator it = arrayList.iterator();
/* 57 */                        while (it.hasNext()) {
/* 69 */                            if (m1822w_((NetworkCapabilities) it.next())) {
/* 71 */                                return true;
                                    }
                                }
                            }
                        }
/* 1 */                 return false;
                    } catch (Exception e) {
/* 76 */                AFLogger.afErrorLog("Failed collecting ivc data", e);
/* 1 */                 return false;
                    }
                }
            }
