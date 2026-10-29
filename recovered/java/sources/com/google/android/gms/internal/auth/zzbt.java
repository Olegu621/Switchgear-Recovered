            package com.google.android.gms.internal.auth;

            import com.google.android.gms.auth.api.proxy.ProxyRequest;
            import p000.eb3;
            import p000.kb1;
            import p000.sr1;
            import p000.tr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbt {
                public final sr1 getSpatulaHeader(tr0 tr0Var) {
/* 1 */             kb1.m6061n(tr0Var);
/* 13 */            return ((eb3) tr0Var).f7609b.doWrite(new zzbs(this, tr0Var));
                }

                public final sr1 performProxyRequest(tr0 tr0Var, ProxyRequest proxyRequest) {
/* 1 */             kb1.m6061n(tr0Var);
/* 4 */             kb1.m6061n(proxyRequest);
/* 16 */            return ((eb3) tr0Var).f7609b.doWrite(new zzbq(this, tr0Var, proxyRequest));
                }
            }
