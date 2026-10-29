            package com.google.firebase.installations;

            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.firebase.installations.local.PersistedInstallationEntry;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class GetIdListener implements StateListener {
                final TaskCompletionSource<String> taskCompletionSource;

                public GetIdListener(TaskCompletionSource<String> taskCompletionSource) {
/* 4 */             this.taskCompletionSource = taskCompletionSource;
                }

                @Override // com.google.firebase.installations.StateListener
                public boolean onException(Exception exc) {
/* 1 */             return false;
                }

                @Override // com.google.firebase.installations.StateListener
                public boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry) {
/* 5 */             if (!persistedInstallationEntry.isUnregistered() && !persistedInstallationEntry.isRegistered() && !persistedInstallationEntry.isErrored()) {
/* 20 */                return false;
                    }
/* 28 */            this.taskCompletionSource.trySetResult(persistedInstallationEntry.getFirebaseInstallationId());
/* 31 */            return true;
                }
            }
