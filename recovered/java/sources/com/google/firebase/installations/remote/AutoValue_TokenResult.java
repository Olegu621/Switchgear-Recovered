            package com.google.firebase.installations.remote;

            import okhttp3.HttpUrl;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 24 */    final class AutoValue_TokenResult extends TokenResult {
                private final TokenResult.ResponseCode responseCode;
                private final String token;
                private final long tokenExpirationTimestamp;

                private AutoValue_TokenResult(String str, long j, TokenResult.ResponseCode responseCode) {
/* 4 */             this.token = str;
/* 6 */             this.tokenExpirationTimestamp = j;
/* 8 */             this.responseCode = responseCode;
                }

                public boolean equals(Object obj) {
                    TokenResult.ResponseCode responseCode;
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof TokenResult) {
/* 10 */                TokenResult tokenResult = (TokenResult) obj;
/* 12 */                String str = this.token;
/* 14 */                if (str != null ? str.equals(tokenResult.getToken()) : tokenResult.getToken() == null) {
/* 41 */                    if (this.tokenExpirationTimestamp == tokenResult.getTokenExpirationTimestamp() && ((responseCode = this.responseCode) != null ? responseCode.equals(tokenResult.getResponseCode()) : tokenResult.getResponseCode() == null)) {
/* 1 */                         return true;
                            }
                        }
                    }
/* 7 */             return false;
                }

                @Override // com.google.firebase.installations.remote.TokenResult
                public TokenResult.ResponseCode getResponseCode() {
/* 1 */             return this.responseCode;
                }

                @Override // com.google.firebase.installations.remote.TokenResult
                public String getToken() {
/* 1 */             return this.token;
                }

                @Override // com.google.firebase.installations.remote.TokenResult
                public long getTokenExpirationTimestamp() {
/* 1 */             return this.tokenExpirationTimestamp;
                }

                public int hashCode() {
/* 1 */             String str = this.token;
/* 8 */             int iHashCode = str == null ? 0 : str.hashCode();
/* 17 */            long j = this.tokenExpirationTimestamp;
/* 26 */            int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
/* 27 */            TokenResult.ResponseCode responseCode = this.responseCode;
/* 36 */            return i ^ (responseCode != null ? responseCode.hashCode() : 0);
                }

                @Override // com.google.firebase.installations.remote.TokenResult
                public TokenResult.Builder toBuilder() {
/* 4 */             return new Builder(this);
                }

                public String toString() {
/* 38 */            return "TokenResult{token=" + this.token + ", tokenExpirationTimestamp=" + this.tokenExpirationTimestamp + ", responseCode=" + this.responseCode + "}";
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 25 */        public static final class Builder extends TokenResult.Builder {
                    private TokenResult.ResponseCode responseCode;
                    private String token;
                    private Long tokenExpirationTimestamp;

                    private Builder(TokenResult tokenResult) {
/* 8 */                 this.token = tokenResult.getToken();
/* 18 */                this.tokenExpirationTimestamp = Long.valueOf(tokenResult.getTokenExpirationTimestamp());
/* 24 */                this.responseCode = tokenResult.getResponseCode();
                    }

                    @Override // com.google.firebase.installations.remote.TokenResult.Builder
                    public TokenResult build() {
/* 8 */                 String str = this.tokenExpirationTimestamp == null ? " tokenExpirationTimestamp" : HttpUrl.FRAGMENT_ENCODE_SET;
/* 14 */                if (str.isEmpty()) {
/* 29 */                    return new AutoValue_TokenResult(this.token, this.tokenExpirationTimestamp.longValue(), this.responseCode);
                        }
/* 39 */                f42.m3656l("Missing required properties:".concat(str));
/* 42 */                return null;
                    }

                    @Override // com.google.firebase.installations.remote.TokenResult.Builder
                    public TokenResult.Builder setResponseCode(TokenResult.ResponseCode responseCode) {
/* 1 */                 this.responseCode = responseCode;
/* 3 */                 return this;
                    }

                    @Override // com.google.firebase.installations.remote.TokenResult.Builder
                    public TokenResult.Builder setToken(String str) {
/* 1 */                 this.token = str;
/* 3 */                 return this;
                    }

                    @Override // com.google.firebase.installations.remote.TokenResult.Builder
                    public TokenResult.Builder setTokenExpirationTimestamp(long j) {
/* 5 */                 this.tokenExpirationTimestamp = Long.valueOf(j);
/* 7 */                 return this;
                    }

/* 26 */            public Builder() {
                    }
                }
            }
