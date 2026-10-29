            package com.google.android.gms.internal.p015authapiphone;

            import android.content.Context;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Looper;
            import com.google.android.gms.common.Feature;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import p000.C2345wv;
            import p000.InterfaceC2478xy;
            import p000.kr0;
            import p000.wp1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzw extends kr0 {
                public zzw(Context context, Looper looper, C2345wv c2345wv, InterfaceC2478xy interfaceC2478xy, wp1 wp1Var) {
/* 9 */             super(context, looper, WebSocketProtocol.PAYLOAD_SHORT, c2345wv, interfaceC2478xy, wp1Var);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
                    return iInterfaceQueryLocalInterface instanceof zzh ? (zzh) iInterfaceQueryLocalInterface : new zzh(iBinder);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final Feature[] getApiFeatures() {
/* 1 */             return zzac.zze;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final int getMinApkVersion() {
/* 1 */             return 12451000;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getServiceDescriptor() {
/* 1 */             return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getStartServiceAction() {
/* 1 */             return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final boolean usesClientTelemetry() {
/* 1 */             return true;
                }
            }
