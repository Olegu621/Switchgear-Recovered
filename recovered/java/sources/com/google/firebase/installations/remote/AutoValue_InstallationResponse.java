            package com.google.firebase.installations.remote;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 32 */    final class AutoValue_InstallationResponse extends InstallationResponse {
                private final TokenResult authToken;
                private final String fid;
                private final String refreshToken;
                private final InstallationResponse.ResponseCode responseCode;
                private final String uri;

                private AutoValue_InstallationResponse(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode) {
/* 4 */             this.uri = str;
/* 6 */             this.fid = str2;
/* 8 */             this.refreshToken = str3;
/* 10 */            this.authToken = tokenResult;
/* 12 */            this.responseCode = responseCode;
                }

                public boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof InstallationResponse) {
/* 10 */                InstallationResponse installationResponse = (InstallationResponse) obj;
/* 12 */                String str = this.uri;
/* 14 */                if (str != null ? str.equals(installationResponse.getUri()) : installationResponse.getUri() == null) {
/* 33 */                    String str2 = this.fid;
/* 35 */                    if (str2 != null ? str2.equals(installationResponse.getFid()) : installationResponse.getFid() == null) {
/* 54 */                        String str3 = this.refreshToken;
/* 56 */                        if (str3 != null ? str3.equals(installationResponse.getRefreshToken()) : installationResponse.getRefreshToken() == null) {
/* 75 */                            TokenResult tokenResult = this.authToken;
/* 77 */                            if (tokenResult != null ? tokenResult.equals(installationResponse.getAuthToken()) : installationResponse.getAuthToken() == null) {
/* 96 */                                InstallationResponse.ResponseCode responseCode = this.responseCode;
/* 98 */                                if (responseCode != null ? responseCode.equals(installationResponse.getResponseCode()) : installationResponse.getResponseCode() == null) {
/* 1 */                                     return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                @Override // com.google.firebase.installations.remote.InstallationResponse
                public TokenResult getAuthToken() {
/* 1 */             return this.authToken;
                }

                @Override // com.google.firebase.installations.remote.InstallationResponse
                public String getFid() {
/* 1 */             return this.fid;
                }

                @Override // com.google.firebase.installations.remote.InstallationResponse
                public String getRefreshToken() {
/* 1 */             return this.refreshToken;
                }

                @Override // com.google.firebase.installations.remote.InstallationResponse
                public InstallationResponse.ResponseCode getResponseCode() {
/* 1 */             return this.responseCode;
                }

                @Override // com.google.firebase.installations.remote.InstallationResponse
                public String getUri() {
/* 1 */             return this.uri;
                }

                public int hashCode() {
/* 1 */             String str = this.uri;
/* 16 */            int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
/* 17 */            String str2 = this.fid;
/* 28 */            int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
/* 29 */            String str3 = this.refreshToken;
/* 40 */            int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
/* 41 */            TokenResult tokenResult = this.authToken;
/* 52 */            int iHashCode4 = (iHashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
/* 53 */            InstallationResponse.ResponseCode responseCode = this.responseCode;
/* 62 */            return iHashCode4 ^ (responseCode != null ? responseCode.hashCode() : 0);
                }

                @Override // com.google.firebase.installations.remote.InstallationResponse
                public InstallationResponse.Builder toBuilder() {
/* 4 */             return new Builder(this);
                }

                public String toString() {
/* 58 */            return "InstallationResponse{uri=" + this.uri + ", fid=" + this.fid + ", refreshToken=" + this.refreshToken + ", authToken=" + this.authToken + ", responseCode=" + this.responseCode + "}";
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 33 */        public static final class Builder extends InstallationResponse.Builder {
                    private TokenResult authToken;
                    private String fid;
                    private String refreshToken;
                    private InstallationResponse.ResponseCode responseCode;
                    private String uri;

                    private Builder(InstallationResponse installationResponse) {
/* 8 */                 this.uri = installationResponse.getUri();
/* 14 */                this.fid = installationResponse.getFid();
/* 20 */                this.refreshToken = installationResponse.getRefreshToken();
/* 26 */                this.authToken = installationResponse.getAuthToken();
/* 32 */                this.responseCode = installationResponse.getResponseCode();
                    }

                    @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
                    public InstallationResponse build() {
/* 14 */                return new AutoValue_InstallationResponse(this.uri, this.fid, this.refreshToken, this.authToken, this.responseCode);
                    }

                    @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
                    public InstallationResponse.Builder setAuthToken(TokenResult tokenResult) {
/* 1 */                 this.authToken = tokenResult;
/* 3 */                 return this;
                    }

                    @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
                    public InstallationResponse.Builder setFid(String str) {
/* 1 */                 this.fid = str;
/* 3 */                 return this;
                    }

                    @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
                    public InstallationResponse.Builder setRefreshToken(String str) {
/* 1 */                 this.refreshToken = str;
/* 3 */                 return this;
                    }

                    @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
                    public InstallationResponse.Builder setResponseCode(InstallationResponse.ResponseCode responseCode) {
/* 1 */                 this.responseCode = responseCode;
/* 3 */                 return this;
                    }

                    @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
                    public InstallationResponse.Builder setUri(String str) {
/* 1 */                 this.uri = str;
/* 3 */                 return this;
                    }

/* 34 */            public Builder() {
                    }
                }
            }
