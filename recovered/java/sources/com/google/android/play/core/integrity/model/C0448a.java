            package com.google.android.play.core.integrity.model;

            import java.util.HashMap;
            import java.util.Map;
            import okhttp3.HttpUrl;
            import p000.pm2;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.model.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0448a {

                /* JADX INFO: renamed from: a */
                private static final Map f5254a;

                /* JADX INFO: renamed from: b */
                private static final Map f5255b;

                static {
/* 3 */             HashMap map = new HashMap();
/* 6 */             f5254a = map;
/* 10 */            HashMap map2 = new HashMap();
/* 13 */            f5255b = map2;
/* 22 */            map.put(-1, "Integrity API is not available.\nIntegrity API is not enabled, or the Play Store version might be old.\nRecommended actions:\n1) Make sure that Integrity API is enabled in Google Play Console.\n2) Ask the user to update Play Store.\n");
/* 32 */            map.put(-2, "The Play Store app is either not installed or not the official version.\nAsk the user to install an official and recent version of Play Store.\n");
/* 42 */            map.put(-3, "Network error: unable to obtain integrity details.\nAsk the user to check for a connection.\n");
/* 52 */            map.put(-4, "No active account found in the Play Store app. Note that the Play Integrity API now supports unauthenticated requests. This error code is used only for older Play Store versions that lack support.\nAsk the user to authenticate in Play Store.\n");
/* 62 */            map.put(-5, "PackageManager could not find this app.\nSomething is wrong (possibly an attack). Non-actionable.\n");
/* 72 */            map.put(-6, "Google Play Services is not available or version is too old.\nAsk the user to Install or Update Play Services.\n");
/* 82 */            map.put(-7, "The calling app UID (user id) does not match the one from Package Manager.\nSomething is wrong (possibly an attack). Non-actionable.\n");
/* 92 */            map.put(-8, "The calling app is making too many requests to the API and hence is throttled.\nRetry with an exponential backoff.\n");
/* 103 */           map.put(-9, "Binding to the service in the Play Store has failed. This can be due to having an old Play Store version installed on the device.\nAsk the user to update Play Store.\n");
/* 114 */           map.put(-10, "Nonce length is too short. The nonce must be a minimum of 16 bytes (before base64 encoding) to allow for a better security.\nRetry with a longer nonce.\n");
/* 125 */           map.put(-11, "Nonce length is too long. The nonce must be less than 500 bytes before base64 encoding.\nRetry with a shorter nonce.\n");
/* 136 */           map.put(-12, "Unknown internal Google server error.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
/* 147 */           map.put(-13, "Nonce is not encoded as a base64 web-safe no-wrap string.\nRetry with correct nonce format.\n");
/* 160 */           map.put(-14, "The Play Store needs to be updated.\nAsk the user to update the Google Play Store.\n");
/* 173 */           map.put(-15, "Play Services needs to be updated.\nAsk the user to update Google Play Services.\n");
/* 186 */           map.put(-16, "The provided cloud project number is invalid.\nUse the cloud project number which can be found in Project info in your Google Cloud Console for the cloud project where Play Integrity API is enabled.\n");
/* 199 */           map.put(-100, "Unknown error processing integrity request.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
/* 212 */           map.put(-17, "There is a transient error on the calling device.\nRetry with an exponential backoff.\n");
/* 217 */           map2.put(-1, "API_NOT_AVAILABLE");
/* 222 */           map2.put(-3, "NETWORK_ERROR");
/* 227 */           map2.put(-2, "PLAY_STORE_NOT_FOUND");
/* 232 */           map2.put(-4, "PLAY_STORE_ACCOUNT_NOT_FOUND");
/* 237 */           map2.put(-14, "PLAY_STORE_VERSION_OUTDATED");
/* 242 */           map2.put(-5, "APP_NOT_INSTALLED");
/* 247 */           map2.put(-6, "PLAY_SERVICES_NOT_FOUND");
/* 252 */           map2.put(-15, "PLAY_SERVICES_VERSION_OUTDATED");
/* 257 */           map2.put(-7, "APP_UID_MISMATCH");
/* 262 */           map2.put(-8, "TOO_MANY_REQUESTS");
/* 267 */           map2.put(-9, "CANNOT_BIND_TO_SERVICE");
/* 272 */           map2.put(-10, "NONCE_TOO_SHORT");
/* 279 */           map2.put(-11, "NONCE_TOO_LONG");
/* 286 */           map2.put(-13, "NONCE_IS_NOT_BASE64");
/* 293 */           map2.put(-16, "CLOUD_PROJECT_NUMBER_IS_INVALID");
/* 300 */           map2.put(-12, "GOOGLE_SERVER_UNAVAILABLE");
/* 307 */           map2.put(-100, "INTERNAL_ERROR");
/* 312 */           map2.put(-17, "CLIENT_TRANSIENT_ERROR");
                }

                /* JADX INFO: renamed from: a */
                public static String m2496a(int i) {
/* 1 */             Map map = f5254a;
/* 3 */             Integer numValueOf = Integer.valueOf(i);
/* 11 */            if (!map.containsKey(numValueOf)) {
/* 43 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 13 */            Map map2 = f5255b;
                    return !map2.containsKey(numValueOf) ? HttpUrl.FRAGMENT_ENCODE_SET : pm2.m7489l((String) map.get(numValueOf), " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#", (String) map2.get(numValueOf), ")");
                }
            }
