            package com.google.android.gms.internal.p014authapi;

            import com.google.android.gms.auth.api.credentials.Credential;
            import com.google.android.gms.common.api.Status;
            import p000.p42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zbe implements p42 {
                private final Status zba;
                private final Credential zbb;

                public zbe(Status status, Credential credential) {
/* 4 */             this.zba = status;
/* 6 */             this.zbb = credential;
                }

                public final Credential getCredential() {
/* 1 */             return this.zbb;
                }

                @Override // p000.p42
                public final Status getStatus() {
/* 1 */             return this.zba;
                }
            }
