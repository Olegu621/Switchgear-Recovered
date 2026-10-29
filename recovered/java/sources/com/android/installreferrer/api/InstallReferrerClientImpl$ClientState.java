            package com.android.installreferrer.api;

            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Retention(RetentionPolicy.SOURCE)
            public @interface InstallReferrerClientImpl$ClientState {
                public static final int CLOSED = 3;
                public static final int CONNECTED = 2;
                public static final int CONNECTING = 1;
                public static final int DISCONNECTED = 0;
            }
