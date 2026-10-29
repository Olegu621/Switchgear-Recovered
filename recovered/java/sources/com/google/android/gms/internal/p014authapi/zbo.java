            package com.google.android.gms.internal.p014authapi;

            import android.content.Context;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Looper;
            import p000.C0177be;
            import p000.C0210cb;
            import p000.C2345wv;
            import p000.kr0;
            import p000.rr0;
            import p000.sr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zbo extends kr0 {
                private final C0177be zba;

                public zbo(Context context, Looper looper, C2345wv c2345wv, C0177be c0177be, rr0 rr0Var, sr0 sr0Var) {
/* 9 */             super(context, looper, 68, c2345wv, rr0Var, sr0Var);
/* 16 */            c0177be = c0177be == null ? C0177be.f2381c : c0177be;
/* 19 */            C0210cb c0210cb = new C0210cb(false);
/* 24 */            c0210cb.f2804b = Boolean.FALSE;
/* 26 */            C0177be c0177be2 = C0177be.f2381c;
/* 28 */            c0177be.getClass();
/* 37 */            c0210cb.f2804b = Boolean.valueOf(c0177be.f2382a);
/* 41 */            c0210cb.f2805c = c0177be.f2383b;
/* 47 */            c0210cb.f2805c = zbbb.zba();
/* 54 */            this.zba = new C0177be(c0210cb);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    return iInterfaceQueryLocalInterface instanceof zbt ? (zbt) iInterfaceQueryLocalInterface : new zbt(iBinder);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final Bundle getGetServiceRequestExtraArgs() {
/* 1 */             C0177be c0177be = this.zba;
/* 3 */             c0177be.getClass();
/* 8 */             Bundle bundle = new Bundle();
/* 14 */            bundle.putString("consumer_package", null);
/* 21 */            bundle.putBoolean("force_save_dialog", c0177be.f2382a);
/* 28 */            bundle.putString("log_session_id", c0177be.f2383b);
/* 31 */            return bundle;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final int getMinApkVersion() {
/* 1 */             return 12800000;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getServiceDescriptor() {
/* 1 */             return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getStartServiceAction() {
/* 1 */             return "com.google.android.gms.auth.api.credentials.service.START";
                }

                public final C0177be zba() {
/* 1 */             return this.zba;
                }
            }
