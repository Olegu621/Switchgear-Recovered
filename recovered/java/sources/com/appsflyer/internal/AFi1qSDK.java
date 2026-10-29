            package com.appsflyer.internal;

            import android.content.Context;
            import android.net.ConnectivityManager;
            import android.net.NetworkInfo;
            import android.telephony.TelephonyManager;
            import com.appsflyer.AFLogger;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H%¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00128\u0005@\u0004X\u0085\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, m6176d2 = {"Lcom/appsflyer/internal/AFi1qSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", HttpUrl.FRAGMENT_ENCODE_SET, "AFAdRevenueData", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFi1rSDK;", "getMonetizationNetwork", "()Lcom/appsflyer/internal/AFi1rSDK;", "Landroid/net/NetworkInfo;", HttpUrl.FRAGMENT_ENCODE_SET, "v_", "(Landroid/net/NetworkInfo;)Z", "getMediationNetwork", "()Z", "Landroid/net/ConnectivityManager;", "getCurrencyIso4217Code", "Landroid/net/ConnectivityManager;", "Landroid/telephony/TelephonyManager;", "getRevenue", "Landroid/telephony/TelephonyManager;", "AFa1vSDK"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public abstract class AFi1qSDK {

                /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
                ConnectivityManager AFAdRevenueData;

                /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
                private final TelephonyManager getMediationNetwork;

                public AFi1qSDK(Context context) {
/* 1 */             context.getClass();
/* 9 */             Object systemService = context.getSystemService("connectivity");
/* 22 */            this.AFAdRevenueData = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
/* 26 */            Object systemService2 = context.getSystemService("phone");
/* 37 */            this.getMediationNetwork = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
                }

                /* JADX INFO: renamed from: v_ */
                public static boolean m1821v_(NetworkInfo p0) {
/* 1 */             if (p0 != null) {
/* 3 */                 return p0.isConnectedOrConnecting();
                    }
/* 8 */             return false;
                }

                public abstract String AFAdRevenueData();

                public abstract boolean getMediationNetwork();

                public final AFi1rSDK getMonetizationNetwork() {
                    Throwable th;
                    String str;
                    String simOperatorName;
/* 1 */             String networkOperatorName = null;
                    try {
/* 2 */                 TelephonyManager telephonyManager = this.getMediationNetwork;
/* 4 */                 if (telephonyManager != null) {
/* 6 */                     simOperatorName = telephonyManager.getSimOperatorName();
                            try {
/* 10 */                        networkOperatorName = telephonyManager.getNetworkOperatorName();
/* 14 */                        if (networkOperatorName == null || networkOperatorName.length() == 0) {
/* 34 */                            if (telephonyManager.getPhoneType() == 2) {
/* 36 */                                networkOperatorName = "CDMA";
                                    }
                                }
                            } catch (Throwable th2) {
/* 25 */                        str = networkOperatorName;
/* 26 */                        networkOperatorName = simOperatorName;
/* 27 */                        th = th2;
/* 47 */                        AFLogger.afErrorLog("Exception while collecting network info. ", th);
/* 50 */                        simOperatorName = networkOperatorName;
/* 51 */                        networkOperatorName = str;
                            }
                        } else {
/* 43 */                    simOperatorName = null;
                        }
                    } catch (Throwable th3) {
/* 40 */                th = th3;
/* 41 */                str = null;
                    }
/* 62 */            return new AFi1rSDK(AFAdRevenueData(), networkOperatorName, simOperatorName, getMediationNetwork());
                }
            }
