            package com.appsflyer.internal;

            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, m6176d2 = {"Lcom/appsflyer/internal/AFe1tSDK;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "AFAdRevenueData", "Ljava/lang/String;", "getMonetizationNetwork", "getRevenue", "getMediationNetwork", "getCurrencyIso4217Code"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public enum AFe1tSDK {
                API("api"),
                RC("rc"),
                DEFAULT(HttpUrl.FRAGMENT_ENCODE_SET);


                /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
                public final String getMonetizationNetwork;

                AFe1tSDK(String str) {
/* 4 */             this.getMonetizationNetwork = str;
                }
            }
