            package p000;

            import android.content.Context;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Looper;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.common.internal.service.zai;
            import com.google.android.gms.internal.base.zaf;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gc3 extends kr0 {

                /* JADX INFO: renamed from: a */
                public final zm2 f8545a;

                public gc3(Context context, Looper looper, C2345wv c2345wv, zm2 zm2Var, InterfaceC2478xy interfaceC2478xy, wp1 wp1Var) {
/* 9 */             super(context, looper, 270, c2345wv, interfaceC2478xy, wp1Var);
/* 12 */            this.f8545a = zm2Var;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final IInterface createServiceInterface(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
                    return iInterfaceQueryLocalInterface instanceof zai ? (zai) iInterfaceQueryLocalInterface : new zai(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final Feature[] getApiFeatures() {
/* 1 */             return zaf.zab;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final Bundle getGetServiceRequestExtraArgs() {
/* 1 */             zm2 zm2Var = this.f8545a;
/* 3 */             zm2Var.getClass();
/* 8 */             Bundle bundle = new Bundle();
/* 11 */            String str = zm2Var.f20265a;
/* 13 */            if (str != null) {
/* 17 */                bundle.putString("api", str);
                    }
/* 20 */            return bundle;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final int getMinApkVersion() {
/* 1 */             return 203400000;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getServiceDescriptor() {
/* 1 */             return "com.google.android.gms.common.internal.service.IClientTelemetryService";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getStartServiceAction() {
/* 1 */             return "com.google.android.gms.common.telemetry.service.START";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final boolean getUseDynamicLookup() {
/* 1 */             return true;
                }
            }
