            package com.google.android.gms.auth.api.signin.internal;

            import android.os.Binder;
            import com.google.android.gms.auth.api.signin.RevocationBoundService;
            import p000.AbstractC0886en;
            import p000.yy1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zbt extends zbo {

                /* JADX INFO: renamed from: a */
                public final RevocationBoundService f3409a;

                public zbt(RevocationBoundService revocationBoundService) {
/* 3 */             super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
/* 6 */             this.f3409a = revocationBoundService;
                }

                /* JADX INFO: renamed from: a */
                public final void m1999a() {
/* 11 */            if (!yy1.m10228x(this.f3409a, Binder.getCallingUid())) {
/* 31 */                throw new SecurityException(AbstractC0886en.m3505i(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
                    }
                }
            }
