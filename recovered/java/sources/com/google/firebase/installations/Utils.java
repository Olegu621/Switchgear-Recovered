            package com.google.firebase.installations;

            import android.text.TextUtils;
            import com.google.firebase.installations.local.PersistedInstallationEntry;
            import com.google.firebase.installations.time.Clock;
            import com.google.firebase.installations.time.SystemClock;
            import java.util.regex.Pattern;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public final class Utils {
                private static final String APP_ID_IDENTIFICATION_SUBSTRING = ":";
                private static Utils singleton;
                private final Clock clock;
                public static final long AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS = 3600;
                private static final Pattern API_KEY_FORMAT = Pattern.compile("\\AA[\\w-]{38}\\z");

                private Utils(Clock clock) {
/* 4 */             this.clock = clock;
                }

                public static Utils getInstance(Clock clock) {
/* 3 */             if (singleton == null) {
/* 10 */                singleton = new Utils(clock);
                    }
/* 12 */            return singleton;
                }

                public static boolean isValidApiKeyFormat(String str) {
/* 7 */             return API_KEY_FORMAT.matcher(str).matches();
                }

                public static boolean isValidAppIdFormat(String str) {
/* 3 */             return str.contains(APP_ID_IDENTIFICATION_SUBSTRING);
                }

                public long currentTimeInMillis() {
/* 3 */             return this.clock.currentTimeMillis();
                }

                public long currentTimeInSecs() {
/* 7 */             return currentTimeInMillis() / 1000;
                }

                public long getRandomDelayForSyncPrevention() {
/* 11 */            return (long) (Math.random() * 1000.0d);
                }

                public boolean isAuthTokenExpired(PersistedInstallationEntry persistedInstallationEntry) {
/* 10 */            if (TextUtils.isEmpty(persistedInstallationEntry.getAuthToken())) {
/* 9 */                 return true;
                    }
                    return persistedInstallationEntry.getExpiresInSecs() + persistedInstallationEntry.getTokenCreationEpochInSecs() < currentTimeInSecs() + AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS;
                }

/* 14 */        public static Utils getInstance() {
/* 15 */            return getInstance(SystemClock.getInstance());
                }
            }
