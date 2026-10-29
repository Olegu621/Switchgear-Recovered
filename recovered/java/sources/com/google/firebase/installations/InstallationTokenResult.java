            package com.google.firebase.installations;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class InstallationTokenResult {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Builder {
                    public abstract InstallationTokenResult build();

                    public abstract Builder setToken(String str);

                    public abstract Builder setTokenCreationTimestamp(long j);

                    public abstract Builder setTokenExpirationTimestamp(long j);
                }

                public static Builder builder() {
/* 3 */             return new AutoValue_InstallationTokenResult.Builder();
                }

                public abstract String getToken();

                public abstract long getTokenCreationTimestamp();

                public abstract long getTokenExpirationTimestamp();

                public abstract Builder toBuilder();
            }
