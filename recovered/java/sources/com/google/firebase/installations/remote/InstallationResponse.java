            package com.google.firebase.installations.remote;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class InstallationResponse {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Builder {
                    public abstract InstallationResponse build();

                    public abstract Builder setAuthToken(TokenResult tokenResult);

                    public abstract Builder setFid(String str);

                    public abstract Builder setRefreshToken(String str);

                    public abstract Builder setResponseCode(ResponseCode responseCode);

                    public abstract Builder setUri(String str);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum ResponseCode {
                    OK,
                    BAD_CONFIG
                }

                public static Builder builder() {
/* 3 */             return new AutoValue_InstallationResponse.Builder();
                }

                public abstract TokenResult getAuthToken();

                public abstract String getFid();

                public abstract String getRefreshToken();

                public abstract ResponseCode getResponseCode();

                public abstract String getUri();

                public abstract Builder toBuilder();
            }
