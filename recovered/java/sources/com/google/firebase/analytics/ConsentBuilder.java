            package com.google.firebase.analytics;

            import java.util.LinkedHashMap;
            import java.util.Map;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0016"}, m6176d2 = {"Lcom/google/firebase/analytics/ConsentBuilder;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "adStorage", "Lcom/google/firebase/analytics/FirebaseAnalytics$ConsentStatus;", "getAdStorage", "()Lcom/google/firebase/analytics/FirebaseAnalytics$ConsentStatus;", "setAdStorage", "(Lcom/google/firebase/analytics/FirebaseAnalytics$ConsentStatus;)V", "analyticsStorage", "getAnalyticsStorage", "setAnalyticsStorage", "adUserData", "getAdUserData", "setAdUserData", "adPersonalization", "getAdPersonalization", "setAdPersonalization", "asMap", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/google/firebase/analytics/FirebaseAnalytics$ConsentType;", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final class ConsentBuilder {
                private FirebaseAnalytics.ConsentStatus zza;
                private FirebaseAnalytics.ConsentStatus zzb;
                private FirebaseAnalytics.ConsentStatus zzc;
                private FirebaseAnalytics.ConsentStatus zzd;

                public final Map<FirebaseAnalytics.ConsentType, FirebaseAnalytics.ConsentStatus> asMap() {
/* 3 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 6 */             FirebaseAnalytics.ConsentStatus consentStatus = this.zza;
/* 8 */             if (consentStatus != null) {
/* 12 */                linkedHashMap.put(FirebaseAnalytics.ConsentType.AD_STORAGE, consentStatus);
                    }
/* 15 */            FirebaseAnalytics.ConsentStatus consentStatus2 = this.zzb;
/* 17 */            if (consentStatus2 != null) {
/* 21 */                linkedHashMap.put(FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE, consentStatus2);
                    }
/* 24 */            FirebaseAnalytics.ConsentStatus consentStatus3 = this.zzc;
/* 26 */            if (consentStatus3 != null) {
/* 30 */                linkedHashMap.put(FirebaseAnalytics.ConsentType.AD_USER_DATA, consentStatus3);
                    }
/* 33 */            FirebaseAnalytics.ConsentStatus consentStatus4 = this.zzd;
/* 35 */            if (consentStatus4 != null) {
/* 39 */                linkedHashMap.put(FirebaseAnalytics.ConsentType.AD_PERSONALIZATION, consentStatus4);
                    }
/* 42 */            return linkedHashMap;
                }

                /* JADX INFO: renamed from: getAdPersonalization, reason: from getter */
                public final FirebaseAnalytics.ConsentStatus getZzd() {
/* 1 */             return this.zzd;
                }

                /* JADX INFO: renamed from: getAdStorage, reason: from getter */
                public final FirebaseAnalytics.ConsentStatus getZza() {
/* 1 */             return this.zza;
                }

                /* JADX INFO: renamed from: getAdUserData, reason: from getter */
                public final FirebaseAnalytics.ConsentStatus getZzc() {
/* 1 */             return this.zzc;
                }

                /* JADX INFO: renamed from: getAnalyticsStorage, reason: from getter */
                public final FirebaseAnalytics.ConsentStatus getZzb() {
/* 1 */             return this.zzb;
                }

                public final void setAdPersonalization(FirebaseAnalytics.ConsentStatus consentStatus) {
/* 1 */             this.zzd = consentStatus;
                }

                public final void setAdStorage(FirebaseAnalytics.ConsentStatus consentStatus) {
/* 1 */             this.zza = consentStatus;
                }

                public final void setAdUserData(FirebaseAnalytics.ConsentStatus consentStatus) {
/* 1 */             this.zzc = consentStatus;
                }

                public final void setAnalyticsStorage(FirebaseAnalytics.ConsentStatus consentStatus) {
/* 1 */             this.zzb = consentStatus;
                }
            }
