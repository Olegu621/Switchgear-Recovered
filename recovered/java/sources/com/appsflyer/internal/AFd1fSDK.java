            package com.appsflyer.internal;

            import android.text.TextUtils;
            import com.appsflyer.AppsFlyerLib;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.Pair;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            import p000.oc1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rBE\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, m6176d2 = {"Lcom/appsflyer/internal/AFd1fSDK;", "Lcom/appsflyer/internal/AFd1bSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "p0", HttpUrl.FRAGMENT_ENCODE_SET, "p1", HttpUrl.FRAGMENT_ENCODE_SET, "p2", "p3", HttpUrl.FRAGMENT_ENCODE_SET, "p4", "<init>", "(Ljava/lang/String;Ljava/util/Map;[BLjava/lang/String;Z)V", "AFa1uSDK"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 2 */     public final class AFd1fSDK extends AFd1bSDK {

                /* JADX INFO: renamed from: AFa1uSDK, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                public /* synthetic */ AFd1fSDK(String str, Map map, byte[] bArr, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 23 */            this(str, map, (i & 4) != 0 ? null : bArr, (i & 8) != 0 ? "GET" : str2, (i & 16) != 0 ? false : z);
                }

                public static final AFd1fSDK getRevenue(String str, String str2, String str3, String str4) {
/* 1 */             str.getClass();
/* 4 */             str3.getClass();
/* 7 */             str4.getClass();
/* 12 */            String monetizationNetwork = Companion.getMonetizationNetwork(str, str2, str3);
/* 20 */            String strValueOf = String.valueOf(System.currentTimeMillis());
/* 65 */            AFd1fSDK aFd1fSDK = new AFd1fSDK(monetizationNetwork, oc1.m7131e(new Pair("Connection", "close"), new Pair("af_request_epoch_ms", strValueOf), new Pair("af_sig", Companion.getMediationNetwork(str, str3, str2, str4, strValueOf))), null, null, false, 28, null);
/* 70 */            aFd1fSDK.component4 = 10000;
/* 72 */            return aFd1fSDK;
                }

                /* JADX INFO: renamed from: com.appsflyer.internal.AFd1fSDK$AFa1uSDK, reason: from kotlin metadata */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\n\u001a\u0006*\u00020\u00040\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r"}, m6176d2 = {"Lcom/appsflyer/internal/AFd1fSDK$AFa1uSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "p0", "p1", "p2", "p3", "p4", "getMediationNetwork", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getMonetizationNetwork", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    private Companion() {
                    }

                    public static String getMediationNetwork(String p0, String p1, String p2, String p3, String p4) {
/* 1 */                 p0.getClass();
/* 4 */                 p1.getClass();
/* 7 */                 p3.getClass();
/* 10 */                p4.getClass();
/* 38 */                return AFj1dSDK.getMonetizationNetwork(TextUtils.join("\u2063", new String[]{p4, p2, p0 + p1}), p3);
                    }

                    public static String getMonetizationNetwork(String p0, String p1, String p2) {
/* 49 */                return String.format(AFd1nSDK.getMonetizationNetwork, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getRevenue().getHostName()) + p0 + p2 + "?device_id=" + p1;
                    }

/* 4 */             public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 5 */                 this();
                    }
                }

/* 26 */        private AFd1fSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z) {
/* 27 */            super(str, bArr, str2, map, z);
                }
            }
