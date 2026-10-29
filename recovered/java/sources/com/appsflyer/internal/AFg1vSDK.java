            package com.appsflyer.internal;

            import android.content.Context;
            import java.util.Map;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007"}, m6176d2 = {"Lcom/appsflyer/internal/AFg1vSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "Landroid/content/Context;", "p0", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getMediationNetwork", "(Landroid/content/Context;)Ljava/util/Map;", "AFa1vSDK"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public interface AFg1vSDK {

                /* JADX INFO: renamed from: AFa1vSDK, reason: from kotlin metadata */
                public static final Companion INSTANCE = Companion.getCurrencyIso4217Code;

                /* JADX INFO: renamed from: com.appsflyer.internal.AFg1vSDK$AFa1vSDK, reason: from kotlin metadata */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class Companion {
                    static final /* synthetic */ Companion getCurrencyIso4217Code = new Companion();

                    private Companion() {
                    }
                }

                Map<String, String> getMediationNetwork(Context p0);
            }
