            package com.google.android.gms.internal.p014authapi;

            import android.app.PendingIntent;
            import com.google.android.gms.auth.api.credentials.Credential;
            import com.google.android.gms.auth.api.credentials.CredentialRequest;
            import com.google.android.gms.auth.api.credentials.HintRequest;
            import p000.AbstractC0213ce;
            import p000.C0983h9;
            import p000.eb3;
            import p000.kb1;
            import p000.sr1;
            import p000.tr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zbl {
                public final sr1 delete(tr0 tr0Var, Credential credential) {
/* 3 */             kb1.m6062o(tr0Var, "client must not be null");
/* 8 */             kb1.m6062o(credential, "credential must not be null");
/* 20 */            return ((eb3) tr0Var).f7609b.doWrite(new zbi(this, tr0Var, credential));
                }

                public final sr1 disableAutoSignIn(tr0 tr0Var) {
/* 3 */             kb1.m6062o(tr0Var, "client must not be null");
/* 15 */            return ((eb3) tr0Var).f7609b.doWrite(new zbj(this, tr0Var));
                }

                public final PendingIntent getHintPickerIntent(tr0 tr0Var, HintRequest hintRequest) {
/* 3 */             kb1.m6062o(tr0Var, "client must not be null");
/* 8 */             kb1.m6062o(hintRequest, "request must not be null");
/* 11 */            C0983h9 c0983h9 = AbstractC0213ce.f2858a;
/* 18 */            throw new UnsupportedOperationException();
                }

                public final sr1 request(tr0 tr0Var, CredentialRequest credentialRequest) {
/* 3 */             kb1.m6062o(tr0Var, "client must not be null");
/* 8 */             kb1.m6062o(credentialRequest, "request must not be null");
/* 20 */            return ((eb3) tr0Var).f7609b.doRead(new zbg(this, tr0Var, credentialRequest));
                }

                public final sr1 save(tr0 tr0Var, Credential credential) {
/* 3 */             kb1.m6062o(tr0Var, "client must not be null");
/* 8 */             kb1.m6062o(credential, "credential must not be null");
/* 20 */            return ((eb3) tr0Var).f7609b.doWrite(new zbh(this, tr0Var, credential));
                }
            }
