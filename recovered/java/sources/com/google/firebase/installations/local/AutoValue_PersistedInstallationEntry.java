            package com.google.firebase.installations.local;

            import okhttp3.HttpUrl;
            import p000.C1951n4;
            import p000.f42;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 52 */    final class AutoValue_PersistedInstallationEntry extends PersistedInstallationEntry {
                private final String authToken;
                private final long expiresInSecs;
                private final String firebaseInstallationId;
                private final String fisError;
                private final String refreshToken;
                private final PersistedInstallation.RegistrationStatus registrationStatus;
                private final long tokenCreationEpochInSecs;

                private AutoValue_PersistedInstallationEntry(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j, long j2, String str4) {
/* 4 */             this.firebaseInstallationId = str;
/* 6 */             this.registrationStatus = registrationStatus;
/* 8 */             this.authToken = str2;
/* 10 */            this.refreshToken = str3;
/* 12 */            this.expiresInSecs = j;
/* 14 */            this.tokenCreationEpochInSecs = j2;
/* 16 */            this.fisError = str4;
                }

                public boolean equals(Object obj) {
                    String str;
                    String str2;
                    String str3;
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof PersistedInstallationEntry) {
/* 10 */                PersistedInstallationEntry persistedInstallationEntry = (PersistedInstallationEntry) obj;
/* 12 */                String str4 = this.firebaseInstallationId;
/* 14 */                if (str4 != null ? str4.equals(persistedInstallationEntry.getFirebaseInstallationId()) : persistedInstallationEntry.getFirebaseInstallationId() == null) {
/* 43 */                    if (this.registrationStatus.equals(persistedInstallationEntry.getRegistrationStatus()) && ((str = this.authToken) != null ? str.equals(persistedInstallationEntry.getAuthToken()) : persistedInstallationEntry.getAuthToken() == null) && ((str2 = this.refreshToken) != null ? str2.equals(persistedInstallationEntry.getRefreshToken()) : persistedInstallationEntry.getRefreshToken() == null) && this.expiresInSecs == persistedInstallationEntry.getExpiresInSecs() && this.tokenCreationEpochInSecs == persistedInstallationEntry.getTokenCreationEpochInSecs() && ((str3 = this.fisError) != null ? str3.equals(persistedInstallationEntry.getFisError()) : persistedInstallationEntry.getFisError() == null)) {
/* 1 */                         return true;
                            }
                        }
                    }
/* 7 */             return false;
                }

                @Override // com.google.firebase.installations.local.PersistedInstallationEntry
                public String getAuthToken() {
/* 1 */             return this.authToken;
                }

                @Override // com.google.firebase.installations.local.PersistedInstallationEntry
                public long getExpiresInSecs() {
/* 1 */             return this.expiresInSecs;
                }

                @Override // com.google.firebase.installations.local.PersistedInstallationEntry
                public String getFirebaseInstallationId() {
/* 1 */             return this.firebaseInstallationId;
                }

                @Override // com.google.firebase.installations.local.PersistedInstallationEntry
                public String getFisError() {
/* 1 */             return this.fisError;
                }

                @Override // com.google.firebase.installations.local.PersistedInstallationEntry
                public String getRefreshToken() {
/* 1 */             return this.refreshToken;
                }

                @Override // com.google.firebase.installations.local.PersistedInstallationEntry
                public PersistedInstallation.RegistrationStatus getRegistrationStatus() {
/* 1 */             return this.registrationStatus;
                }

                @Override // com.google.firebase.installations.local.PersistedInstallationEntry
                public long getTokenCreationEpochInSecs() {
/* 1 */             return this.tokenCreationEpochInSecs;
                }

                public int hashCode() {
/* 1 */             String str = this.firebaseInstallationId;
/* 24 */            int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.registrationStatus.hashCode()) * 1000003;
/* 25 */            String str2 = this.authToken;
/* 36 */            int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
/* 37 */            String str3 = this.refreshToken;
/* 48 */            int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
/* 49 */            long j = this.expiresInSecs;
/* 58 */            int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
/* 59 */            long j2 = this.tokenCreationEpochInSecs;
/* 66 */            int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
/* 67 */            String str4 = this.fisError;
/* 76 */            return i2 ^ (str4 != null ? str4.hashCode() : 0);
                }

                @Override // com.google.firebase.installations.local.PersistedInstallationEntry
                public PersistedInstallationEntry.Builder toBuilder() {
/* 4 */             return new Builder(this);
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
/* 10 */            sb.append(this.firebaseInstallationId);
/* 15 */            sb.append(", registrationStatus=");
/* 20 */            sb.append(this.registrationStatus);
/* 25 */            sb.append(", authToken=");
/* 30 */            sb.append(this.authToken);
/* 35 */            sb.append(", refreshToken=");
/* 40 */            sb.append(this.refreshToken);
/* 45 */            sb.append(", expiresInSecs=");
/* 50 */            sb.append(this.expiresInSecs);
/* 55 */            sb.append(", tokenCreationEpochInSecs=");
/* 60 */            sb.append(this.tokenCreationEpochInSecs);
/* 65 */            sb.append(", fisError=");
/* 72 */            return fm0.m3789o(sb, this.fisError, "}");
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 53 */        public static final class Builder extends PersistedInstallationEntry.Builder {
                    private String authToken;
                    private Long expiresInSecs;
                    private String firebaseInstallationId;
                    private String fisError;
                    private String refreshToken;
                    private PersistedInstallation.RegistrationStatus registrationStatus;
                    private Long tokenCreationEpochInSecs;

                    private Builder(PersistedInstallationEntry persistedInstallationEntry) {
/* 8 */                 this.firebaseInstallationId = persistedInstallationEntry.getFirebaseInstallationId();
/* 14 */                this.registrationStatus = persistedInstallationEntry.getRegistrationStatus();
/* 20 */                this.authToken = persistedInstallationEntry.getAuthToken();
/* 26 */                this.refreshToken = persistedInstallationEntry.getRefreshToken();
/* 36 */                this.expiresInSecs = Long.valueOf(persistedInstallationEntry.getExpiresInSecs());
/* 46 */                this.tokenCreationEpochInSecs = Long.valueOf(persistedInstallationEntry.getTokenCreationEpochInSecs());
/* 52 */                this.fisError = persistedInstallationEntry.getFisError();
                    }

                    @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
                    public PersistedInstallationEntry build() {
/* 8 */                 String strConcat = this.registrationStatus == null ? " registrationStatus" : HttpUrl.FRAGMENT_ENCODE_SET;
/* 12 */                if (this.expiresInSecs == null) {
/* 16 */                    strConcat = strConcat.concat(" expiresInSecs");
                        }
/* 22 */                if (this.tokenCreationEpochInSecs == null) {
/* 26 */                    strConcat = strConcat.concat(" tokenCreationEpochInSecs");
                        }
/* 34 */                if (strConcat.isEmpty()) {
/* 61 */                    return new AutoValue_PersistedInstallationEntry(this.firebaseInstallationId, this.registrationStatus, this.authToken, this.refreshToken, this.expiresInSecs.longValue(), this.tokenCreationEpochInSecs.longValue(), this.fisError);
                        }
/* 71 */                f42.m3656l("Missing required properties:".concat(strConcat));
/* 74 */                return null;
                    }

                    @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
                    public PersistedInstallationEntry.Builder setAuthToken(String str) {
/* 1 */                 this.authToken = str;
/* 3 */                 return this;
                    }

                    @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
                    public PersistedInstallationEntry.Builder setExpiresInSecs(long j) {
/* 5 */                 this.expiresInSecs = Long.valueOf(j);
/* 7 */                 return this;
                    }

                    @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
                    public PersistedInstallationEntry.Builder setFirebaseInstallationId(String str) {
/* 1 */                 this.firebaseInstallationId = str;
/* 3 */                 return this;
                    }

                    @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
                    public PersistedInstallationEntry.Builder setFisError(String str) {
/* 1 */                 this.fisError = str;
/* 3 */                 return this;
                    }

                    @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
                    public PersistedInstallationEntry.Builder setRefreshToken(String str) {
/* 1 */                 this.refreshToken = str;
/* 3 */                 return this;
                    }

                    @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
                    public PersistedInstallationEntry.Builder setRegistrationStatus(PersistedInstallation.RegistrationStatus registrationStatus) {
/* 1 */                 if (registrationStatus != null) {
/* 3 */                     this.registrationStatus = registrationStatus;
/* 5 */                     return this;
                        }
/* 8 */                 C1951n4.m6868s("Null registrationStatus");
/* 11 */                return null;
                    }

                    @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
                    public PersistedInstallationEntry.Builder setTokenCreationEpochInSecs(long j) {
/* 5 */                 this.tokenCreationEpochInSecs = Long.valueOf(j);
/* 7 */                 return this;
                    }

/* 54 */            public Builder() {
                    }
                }
            }
