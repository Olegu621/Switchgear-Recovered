            package com.google.firebase.installations.remote;

            import com.google.firebase.installations.Utils;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     class RequestLimiter {
                private static final long MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS = 86400000;
                private static final long MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS = 1800000;
                private int attemptCount;
                private long nextRequestTime;
                private final Utils utils;

                public RequestLimiter() {
/* 8 */             this.utils = Utils.getInstance();
                }

                private synchronized long getBackoffDuration(int i) {
/* 6 */             if (isRetryableError(i)) {
/* 38 */                return (long) Math.min(Math.pow(2.0d, this.attemptCount) + this.utils.getRandomDelayForSyncPrevention(), MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS);
                    }
/* 8 */             return MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS;
                }

                private static boolean isRetryableError(int i) {
/* 3 */             if (i != 429) {
                        return i >= 500 && i < 600;
                    }
/* 16 */            return true;
                }

                private static boolean isSuccessfulOrRequiresNewFidCreation(int i) {
                    return (i >= 200 && i < 300) || i == 401 || i == 404;
                }

                private synchronized void resetBackoffStrategy() {
/* 3 */             this.attemptCount = 0;
                }

                public synchronized boolean isRequestAllowed() {
/* 23 */            return this.attemptCount == 0 || this.utils.currentTimeInMillis() > this.nextRequestTime;
                }

                public synchronized void setNextRequestTime(int i) {
/* 6 */             if (isSuccessfulOrRequiresNewFidCreation(i)) {
/* 8 */                 resetBackoffStrategy();
/* 12 */                return;
                    }
/* 19 */            this.attemptCount++;
/* 32 */            this.nextRequestTime = this.utils.currentTimeInMillis() + getBackoffDuration(i);
                }

/* 10 */        public RequestLimiter(Utils utils) {
/* 12 */            this.utils = utils;
                }
            }
