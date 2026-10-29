            package com.google.firebase.analytics.ktx.ktxtesting;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.google.firebase.analytics.ktx.AnalyticsKt;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¨\u0006\u0006"}, m6176d2 = {"withAnalyticsForTest", HttpUrl.FRAGMENT_ENCODE_SET, "analytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "block", "Lkotlin/Function0;", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, m6177k = 2, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final class TestingKt {
                public static final void withAnalyticsForTest(FirebaseAnalytics firebaseAnalytics, Function0<Unit> function0) {
/* 1 */             firebaseAnalytics.getClass();
/* 4 */             function0.getClass();
                    synchronized (AnalyticsKt.getLOCK()) {
/* 12 */                FirebaseAnalytics analytics = AnalyticsKt.getANALYTICS();
/* 16 */                AnalyticsKt.setANALYTICS(firebaseAnalytics);
                        try {
/* 19 */                    function0.invoke();
/* 22 */                    AnalyticsKt.setANALYTICS(analytics);
                        } catch (Throwable th) {
/* 30 */                    AnalyticsKt.setANALYTICS(analytics);
/* 33 */                    throw th;
                        }
                    }
                }
            }
