            package com.google.android.play.core.integrity;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class IntegrityTokenRequest {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Builder {
                    public abstract IntegrityTokenRequest build();

                    public abstract Builder setCloudProjectNumber(long j);

                    public abstract Builder setNonce(String str);
                }

                public static Builder builder() {
/* 3 */             return new C0400am();
                }

                public abstract Long cloudProjectNumber();

                public abstract String nonce();
            }
