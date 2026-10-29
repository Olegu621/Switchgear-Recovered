            package com.supercell.titan;

            import android.content.Context;
            import android.net.ConnectivityManager;
            import android.net.NetworkRequest;
            import android.os.Build;
            import android.telephony.TelephonyManager;
            import java.util.Collections;
            import java.util.List;
            import java.util.Locale;
            import okhttp3.HttpUrl;
            import p000.an1;
            import p000.wx0;
            import p000.zm1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class NetworkInfo {
                public static final int TRANSPORT_CELLULAR = 3;
                public static final int TRANSPORT_NONE = 1;
                public static final int TRANSPORT_OTHER = 2;
                public static final int TRANSPORT_UNKNOWN = 0;
                public static final int TRANSPORT_VPN = 5;
                public static final int TRANSPORT_WIFI = 4;

                /* JADX INFO: renamed from: a */
                public zm1 f5852a;

                /* JADX INFO: renamed from: b */
                public volatile int f5853b = 0;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class NetworkInfoInitializer implements wx0 {
                    @Override // p000.wx0
                    public NetworkInfo create(Context context) {
/* 1 */                 NetworkInfo networkInfo = an1.f343a;
/* 3 */                 networkInfo.init(context);
/* 6 */                 return networkInfo;
                    }

                    @Override // p000.wx0
                    public List<Class<? extends wx0>> dependencies() {
/* 1 */                 return Collections.EMPTY_LIST;
                    }
                }

                public static int getNetworkTransportType() {
/* 3 */             return an1.f343a.f5853b;
                }

                public static int getNetworkType(Context context) {
                    android.net.NetworkInfo activeNetworkInfo;
                    TelephonyManager telephonyManager;
/* 5 */             if (Build.VERSION.SDK_INT >= 33) {
/* 17 */                if (!context.getPackageManager().hasSystemFeature("android.hardware.telephony.data") || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
/* 55 */                    return 0;
                        }
/* 29 */                return telephonyManager.getDataNetworkType();
                    }
/* 40 */            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
/* 42 */            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
/* 55 */                return 0;
                    }
/* 50 */            return activeNetworkInfo.getSubtype();
                }

                public static String getSimCountryIso(Context context) {
                    String simCountryIso;
/* 7 */             TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    return (telephonyManager == null || (simCountryIso = telephonyManager.getSimCountryIso()) == null) ? HttpUrl.FRAGMENT_ENCODE_SET : simCountryIso.toUpperCase(Locale.ROOT);
                }

                public void init(Context context) {
/* 6 */             this.f5852a = new zm1(this, context);
/* 10 */            NetworkRequest.Builder builder = new NetworkRequest.Builder();
/* 15 */            builder.addCapability(12);
/* 20 */            builder.addCapability(16);
/* 37 */            ((ConnectivityManager) context.getSystemService("connectivity")).registerNetworkCallback(builder.build(), this.f5852a);
                }
            }
