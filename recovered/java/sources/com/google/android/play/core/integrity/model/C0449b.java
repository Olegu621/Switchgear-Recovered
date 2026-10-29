            package com.google.android.play.core.integrity.model;

            import java.util.HashMap;
            import java.util.Map;
            import okhttp3.HttpUrl;
            import p000.pm2;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.model.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0449b {

                /* JADX INFO: renamed from: a */
                private static final Map f5256a;

                /* JADX INFO: renamed from: b */
                private static final Map f5257b;

                static {
/* 3 */             HashMap map = new HashMap();
/* 6 */             f5256a = map;
/* 10 */            HashMap map2 = new HashMap();
/* 13 */            f5257b = map2;
/* 22 */            map.put(-1, "Standard Integrity API is not available.\nStandard Integrity API is not enabled, or the Play Store version might be old.\nRecommended actions:\n1) Make sure to be allowlisted to use Standard Integrity API.\n2) Make sure that Integrity API is enabled in Google Play Console.\n3) Ask the user to update Play Store.\n");
/* 32 */            map.put(-2, "The Play Store app is either not installed or not the official version.\nAsk the user to install an official and recent version of Play Store.\n");
/* 42 */            map.put(-3, "Network error: unable to obtain integrity details.\nAsk the user to check for a connection.\n");
/* 52 */            map.put(-5, "PackageManager could not find this app.\nSomething is wrong (possibly an attack). Non-actionable.\n");
/* 62 */            map.put(-6, "Google Play Services is not available or version is too old.\nAsk the user to Install or Update Play Services.\n");
/* 72 */            map.put(-7, "The calling app UID (user id) does not match the one from Package Manager.\nSomething is wrong (possibly an attack). Non-actionable.\n");
/* 82 */            map.put(-8, "The calling app is making too many requests to the API and hence is throttled.\nRetry with an exponential backoff.\n");
/* 93 */            map.put(-9, "Binding to the service in the Play Store has failed. This can be due to having an old Play Store version installed on the device.\nAsk the user to update Play Store.\n");
/* 104 */           map.put(-12, "Unknown internal Google server error.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
/* 115 */           map.put(-14, "The Play Store needs to be updated.\nAsk the user to update the Google Play Store.\n");
/* 126 */           map.put(-15, "Play Services needs to be updated.\nAsk the user to update Google Play Services.\n");
/* 137 */           map.put(-16, "The provided cloud project number is invalid.\nUse the cloud project number which can be found in Project info in your Google Cloud Console for the cloud project where Play Integrity API is enabled.\n");
/* 148 */           map.put(-17, "The provided request hash is too long. The request hash length must be less than 500 bytes.\nRetry with a shorter request hash.");
/* 161 */           map.put(-18, "There is a transient error on the calling device.\nRetry with an exponential backoff.\n");
/* 174 */           map.put(-19, "The StandardIntegrityTokenProvider is invalid (e.g. it is outdated).\nRequest a new integrity token provider by calling StandardIntegrityManager#prepareIntegrityToken.");
/* 187 */           map.put(-100, "Unknown error processing integrity request.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
/* 192 */           map2.put(-1, "API_NOT_AVAILABLE");
/* 197 */           map2.put(-3, "NETWORK_ERROR");
/* 202 */           map2.put(-2, "PLAY_STORE_NOT_FOUND");
/* 207 */           map2.put(-14, "PLAY_STORE_VERSION_OUTDATED");
/* 212 */           map2.put(-5, "APP_NOT_INSTALLED");
/* 217 */           map2.put(-6, "PLAY_SERVICES_NOT_FOUND");
/* 222 */           map2.put(-15, "PLAY_SERVICES_VERSION_OUTDATED");
/* 227 */           map2.put(-7, "APP_UID_MISMATCH");
/* 232 */           map2.put(-8, "TOO_MANY_REQUESTS");
/* 237 */           map2.put(-9, "CANNOT_BIND_TO_SERVICE");
/* 242 */           map2.put(-16, "CLOUD_PROJECT_NUMBER_IS_INVALID");
/* 247 */           map2.put(-17, "REQUEST_HASH_TOO_LONG");
/* 254 */           map2.put(-12, "GOOGLE_SERVER_UNAVAILABLE");
/* 261 */           map2.put(-18, "CLIENT_TRANSIENT_ERROR");
/* 268 */           map2.put(-19, "INTEGRITY_TOKEN_PROVIDER_INVALID");
/* 273 */           map2.put(-100, "INTERNAL_ERROR");
                }

                /* JADX INFO: renamed from: a */
                public static String m2497a(int i) {
/* 1 */             Map map = f5256a;
/* 3 */             Integer numValueOf = Integer.valueOf(i);
/* 11 */            if (!map.containsKey(numValueOf)) {
/* 43 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 13 */            Map map2 = f5257b;
                    return !map2.containsKey(numValueOf) ? HttpUrl.FRAGMENT_ENCODE_SET : pm2.m7489l((String) map.get(numValueOf), " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/StandardIntegrityErrorCode.html#", (String) map2.get(numValueOf), ")");
                }
            }
