            package com.google.android.gms.internal.games_v2;

            import android.content.Context;
            import p000.C2308vv;
            import p000.fq0;
            import p000.in3;
            import p000.nr0;
            import p000.or0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zze extends or0 {
                public zze(Context context, in3 in3Var) {
/* 9 */             super(context, null, fq0.f8314b, in3Var, nr0.f14414c);
                }

                @Override // p000.or0
                public final C2308vv createClientSettingsBuilder() {
/* 1 */             C2308vv c2308vvCreateClientSettingsBuilder = super.createClientSettingsBuilder();
/* 9 */             if (getApiOptions() != null) {
/* 17 */                ((in3) getApiOptions()).getClass();
                    }
/* 20 */            return c2308vvCreateClientSettingsBuilder;
                }
            }
