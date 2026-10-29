            package com.google.firebase.analytics.ktx;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.google.firebase.ktx.Firebase;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import okhttp3.HttpUrl;
            import p000.vi0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0014\b\u0004\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\"$\u0010\f\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0015\u0010\u001a\u001a\u00020\u0000*\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, m6176d2 = {"Lcom/google/firebase/analytics/FirebaseAnalytics;", HttpUrl.FRAGMENT_ENCODE_SET, "name", "Lkotlin/Function1;", "Lcom/google/firebase/analytics/ktx/ParametersBuilder;", HttpUrl.FRAGMENT_ENCODE_SET, "block", "logEvent", "(Lcom/google/firebase/analytics/FirebaseAnalytics;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lcom/google/firebase/analytics/ktx/ConsentBuilder;", "setConsent", "(Lcom/google/firebase/analytics/FirebaseAnalytics;Lkotlin/jvm/functions/Function1;)V", "ANALYTICS", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "getANALYTICS", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "setANALYTICS", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", HttpUrl.FRAGMENT_ENCODE_SET, "LOCK", "Ljava/lang/Object;", "getLOCK", "()Ljava/lang/Object;", "Lcom/google/firebase/ktx/Firebase;", "getAnalytics", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/analytics/FirebaseAnalytics;", "analytics", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, m6177k = 2, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final class AnalyticsKt {
                private static volatile FirebaseAnalytics zza;
                private static final Object zzb = new Object();

                public static final FirebaseAnalytics getANALYTICS() {
/* 1 */             return zza;
                }

                public static final FirebaseAnalytics getAnalytics(Firebase firebase) {
/* 1 */             firebase.getClass();
/* 6 */             if (zza == null) {
                        synchronized (zzb) {
/* 13 */                    if (zza == null) {
/* 15 */                        vi0 vi0VarM9271c = vi0.m9271c();
/* 19 */                        vi0VarM9271c.m9274a();
/* 28 */                        zza = FirebaseAnalytics.getInstance(vi0VarM9271c.f18192a);
                            }
                        }
                    }
/* 37 */            FirebaseAnalytics firebaseAnalytics = zza;
/* 39 */            firebaseAnalytics.getClass();
/* 42 */            return firebaseAnalytics;
                }

                public static final Object getLOCK() {
/* 1 */             return zzb;
                }

                public static final void logEvent(FirebaseAnalytics firebaseAnalytics, String str, Function1<? super ParametersBuilder, Unit> function1) {
/* 1 */             firebaseAnalytics.getClass();
/* 4 */             str.getClass();
/* 7 */             function1.getClass();
/* 12 */            ParametersBuilder parametersBuilder = new ParametersBuilder();
/* 15 */            function1.invoke(parametersBuilder);
/* 22 */            firebaseAnalytics.logEvent(str, parametersBuilder.getZza());
                }

                public static final void setANALYTICS(FirebaseAnalytics firebaseAnalytics) {
/* 1 */             zza = firebaseAnalytics;
                }

                public static final void setConsent(FirebaseAnalytics firebaseAnalytics, Function1<? super ConsentBuilder, Unit> function1) {
/* 1 */             firebaseAnalytics.getClass();
/* 4 */             function1.getClass();
/* 9 */             ConsentBuilder consentBuilder = new ConsentBuilder();
/* 12 */            function1.invoke(consentBuilder);
/* 19 */            firebaseAnalytics.setConsent(consentBuilder.asMap());
                }
            }
