            package com.google.firebase.installations.local;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class PersistedInstallationEntry {
                public static PersistedInstallationEntry INSTANCE = builder().build();

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Builder {
                    public abstract PersistedInstallationEntry build();

                    public abstract Builder setAuthToken(String str);

                    public abstract Builder setExpiresInSecs(long j);

                    public abstract Builder setFirebaseInstallationId(String str);

                    public abstract Builder setFisError(String str);

                    public abstract Builder setRefreshToken(String str);

                    public abstract Builder setRegistrationStatus(PersistedInstallation.RegistrationStatus registrationStatus);

                    public abstract Builder setTokenCreationEpochInSecs(long j);
                }

                public static Builder builder() {
/* 18 */            return new AutoValue_PersistedInstallationEntry.Builder().setTokenCreationEpochInSecs(0L).setRegistrationStatus(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION).setExpiresInSecs(0L);
                }

                public abstract String getAuthToken();

                public abstract long getExpiresInSecs();

                public abstract String getFirebaseInstallationId();

                public abstract String getFisError();

                public abstract String getRefreshToken();

                public abstract PersistedInstallation.RegistrationStatus getRegistrationStatus();

                public abstract long getTokenCreationEpochInSecs();

                public boolean isErrored() {
                    return getRegistrationStatus() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR;
                }

                public boolean isNotGenerated() {
                    return getRegistrationStatus() == PersistedInstallation.RegistrationStatus.NOT_GENERATED || getRegistrationStatus() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
                }

                public boolean isRegistered() {
                    return getRegistrationStatus() == PersistedInstallation.RegistrationStatus.REGISTERED;
                }

                public boolean isUnregistered() {
                    return getRegistrationStatus() == PersistedInstallation.RegistrationStatus.UNREGISTERED;
                }

                public boolean shouldAttemptMigration() {
                    return getRegistrationStatus() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
                }

                public abstract Builder toBuilder();

                public PersistedInstallationEntry withAuthToken(String str, long j, long j2) {
/* 17 */            return toBuilder().setAuthToken(str).setExpiresInSecs(j).setTokenCreationEpochInSecs(j2).build();
                }

                public PersistedInstallationEntry withClearedAuthToken() {
/* 10 */            return toBuilder().setAuthToken(null).build();
                }

                public PersistedInstallationEntry withFisError(String str) {
/* 15 */            return toBuilder().setFisError(str).setRegistrationStatus(PersistedInstallation.RegistrationStatus.REGISTER_ERROR).build();
                }

                public PersistedInstallationEntry withNoGeneratedFid() {
/* 11 */            return toBuilder().setRegistrationStatus(PersistedInstallation.RegistrationStatus.NOT_GENERATED).build();
                }

                public PersistedInstallationEntry withRegisteredFid(String str, String str2, long j, String str3, long j2) {
/* 31 */            return toBuilder().setFirebaseInstallationId(str).setRegistrationStatus(PersistedInstallation.RegistrationStatus.REGISTERED).setAuthToken(str3).setRefreshToken(str2).setExpiresInSecs(j2).setTokenCreationEpochInSecs(j).build();
                }

                public PersistedInstallationEntry withUnregisteredFid(String str) {
/* 15 */            return toBuilder().setFirebaseInstallationId(str).setRegistrationStatus(PersistedInstallation.RegistrationStatus.UNREGISTERED).build();
                }
            }
