            package p000;

            import android.content.Context;
            import android.net.Uri;
            import android.webkit.SafeBrowsingResponse;
            import android.webkit.ValueCallback;
            import android.webkit.WebView;
            import java.util.List;
            
            /* JADX INFO: renamed from: s9 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2173s9 {
                /* JADX INFO: renamed from: a */
                public static void m8435a(SafeBrowsingResponse safeBrowsingResponse, boolean z) {
/* 1 */             safeBrowsingResponse.backToSafety(z);
                }

                /* JADX INFO: renamed from: b */
                public static Uri m8436b() {
/* 1 */             return WebView.getSafeBrowsingPrivacyPolicyUrl();
                }

                /* JADX INFO: renamed from: c */
                public static void m8437c(SafeBrowsingResponse safeBrowsingResponse, boolean z) {
/* 1 */             safeBrowsingResponse.proceed(z);
                }

                /* JADX INFO: renamed from: d */
                public static void m8438d(List<String> list, ValueCallback<Boolean> valueCallback) {
/* 1 */             WebView.setSafeBrowsingWhitelist(list, valueCallback);
                }

                /* JADX INFO: renamed from: e */
                public static void m8439e(SafeBrowsingResponse safeBrowsingResponse, boolean z) {
/* 1 */             safeBrowsingResponse.showInterstitial(z);
                }

                /* JADX INFO: renamed from: f */
                public static void m8440f(Context context, ValueCallback<Boolean> valueCallback) {
/* 1 */             WebView.startSafeBrowsing(context, valueCallback);
                }
            }
