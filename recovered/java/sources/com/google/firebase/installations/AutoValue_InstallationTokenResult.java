            package com.google.firebase.installations;

            import okhttp3.HttpUrl;
            import p000.C1951n4;
            import p000.f42;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 28 */    final class AutoValue_InstallationTokenResult extends InstallationTokenResult {
                private final String token;
                private final long tokenCreationTimestamp;
                private final long tokenExpirationTimestamp;

                private AutoValue_InstallationTokenResult(String str, long j, long j2) {
/* 4 */             this.token = str;
/* 6 */             this.tokenExpirationTimestamp = j;
/* 8 */             this.tokenCreationTimestamp = j2;
                }

                public boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof InstallationTokenResult) {
/* 10 */                InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
/* 22 */                if (this.token.equals(installationTokenResult.getToken()) && this.tokenExpirationTimestamp == installationTokenResult.getTokenExpirationTimestamp() && this.tokenCreationTimestamp == installationTokenResult.getTokenCreationTimestamp()) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                @Override // com.google.firebase.installations.InstallationTokenResult
                public String getToken() {
/* 1 */             return this.token;
                }

                @Override // com.google.firebase.installations.InstallationTokenResult
                public long getTokenCreationTimestamp() {
/* 1 */             return this.tokenCreationTimestamp;
                }

                @Override // com.google.firebase.installations.InstallationTokenResult
                public long getTokenExpirationTimestamp() {
/* 1 */             return this.tokenExpirationTimestamp;
                }

                public int hashCode() {
/* 11 */            int iHashCode = (this.token.hashCode() ^ 1000003) * 1000003;
/* 12 */            long j = this.tokenExpirationTimestamp;
/* 22 */            long j2 = this.tokenCreationTimestamp;
/* 28 */            return ((int) (j2 ^ (j2 >>> 32))) ^ ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
                }

                @Override // com.google.firebase.installations.InstallationTokenResult
                public InstallationTokenResult.Builder toBuilder() {
/* 4 */             return new Builder(this);
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
/* 10 */            sb.append(this.token);
/* 15 */            sb.append(", tokenExpirationTimestamp=");
/* 20 */            sb.append(this.tokenExpirationTimestamp);
/* 25 */            sb.append(", tokenCreationTimestamp=");
/* 32 */            return fm0.m3787m(sb, this.tokenCreationTimestamp, "}");
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 29 */        public static final class Builder extends InstallationTokenResult.Builder {
                    private String token;
                    private Long tokenCreationTimestamp;
                    private Long tokenExpirationTimestamp;

                    private Builder(InstallationTokenResult installationTokenResult) {
/* 8 */                 this.token = installationTokenResult.getToken();
/* 18 */                this.tokenExpirationTimestamp = Long.valueOf(installationTokenResult.getTokenExpirationTimestamp());
/* 28 */                this.tokenCreationTimestamp = Long.valueOf(installationTokenResult.getTokenCreationTimestamp());
                    }

                    @Override // com.google.firebase.installations.InstallationTokenResult.Builder
                    public InstallationTokenResult build() {
/* 8 */                 String strConcat = this.token == null ? " token" : HttpUrl.FRAGMENT_ENCODE_SET;
/* 12 */                if (this.tokenExpirationTimestamp == null) {
/* 16 */                    strConcat = strConcat.concat(" tokenExpirationTimestamp");
                        }
/* 22 */                if (this.tokenCreationTimestamp == null) {
/* 26 */                    strConcat = strConcat.concat(" tokenCreationTimestamp");
                        }
/* 34 */                if (strConcat.isEmpty()) {
/* 53 */                    return new AutoValue_InstallationTokenResult(this.token, this.tokenExpirationTimestamp.longValue(), this.tokenCreationTimestamp.longValue());
                        }
/* 63 */                f42.m3656l("Missing required properties:".concat(strConcat));
/* 66 */                return null;
                    }

                    @Override // com.google.firebase.installations.InstallationTokenResult.Builder
                    public InstallationTokenResult.Builder setToken(String str) {
/* 1 */                 if (str != null) {
/* 3 */                     this.token = str;
/* 5 */                     return this;
                        }
/* 8 */                 C1951n4.m6868s("Null token");
/* 11 */                return null;
                    }

                    @Override // com.google.firebase.installations.InstallationTokenResult.Builder
                    public InstallationTokenResult.Builder setTokenCreationTimestamp(long j) {
/* 5 */                 this.tokenCreationTimestamp = Long.valueOf(j);
/* 7 */                 return this;
                    }

                    @Override // com.google.firebase.installations.InstallationTokenResult.Builder
                    public InstallationTokenResult.Builder setTokenExpirationTimestamp(long j) {
/* 5 */                 this.tokenExpirationTimestamp = Long.valueOf(j);
/* 7 */                 return this;
                    }

/* 30 */            public Builder() {
                    }
                }
            }
