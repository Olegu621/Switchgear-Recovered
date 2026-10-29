            package com.google.firebase.installations;

            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.firebase.installations.local.PersistedInstallationEntry;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class GetAuthTokenListener implements StateListener {
                private final TaskCompletionSource<InstallationTokenResult> resultTaskCompletionSource;
                private final Utils utils;

                public GetAuthTokenListener(Utils utils, TaskCompletionSource<InstallationTokenResult> taskCompletionSource) {
/* 4 */             this.utils = utils;
/* 6 */             this.resultTaskCompletionSource = taskCompletionSource;
                }

                @Override // com.google.firebase.installations.StateListener
                public boolean onException(Exception exc) {
/* 3 */             this.resultTaskCompletionSource.trySetException(exc);
/* 6 */             return true;
                }

                @Override // com.google.firebase.installations.StateListener
                public boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry) {
/* 5 */             if (!persistedInstallationEntry.isRegistered() || this.utils.isAuthTokenExpired(persistedInstallationEntry)) {
/* 54 */                return false;
                    }
/* 49 */            this.resultTaskCompletionSource.setResult(InstallationTokenResult.builder().setToken(persistedInstallationEntry.getAuthToken()).setTokenExpirationTimestamp(persistedInstallationEntry.getExpiresInSecs()).setTokenCreationTimestamp(persistedInstallationEntry.getTokenCreationEpochInSecs()).build());
/* 52 */            return true;
                }
            }
