            package com.google.firebase.installations.remote;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class TokenResult {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Builder {
                    public abstract TokenResult build();

                    public abstract Builder setResponseCode(ResponseCode responseCode);

                    public abstract Builder setToken(String str);

                    public abstract Builder setTokenExpirationTimestamp(long j);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum ResponseCode {
                    OK,
                    BAD_CONFIG,
                    AUTH_ERROR
                }

                public static Builder builder() {
/* 8 */             return new AutoValue_TokenResult.Builder().setTokenExpirationTimestamp(0L);
                }

                public abstract ResponseCode getResponseCode();

                public abstract String getToken();

                public abstract long getTokenExpirationTimestamp();

                public abstract Builder toBuilder();
            }
