            package com.google.android.gms.internal.fido;

            import android.content.Context;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Looper;
            import p000.C2345wv;
            import p000.InterfaceC2478xy;
            import p000.kr0;
            import p000.wp1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzaa extends kr0 {
                public zzaa(Context context, Looper looper, C2345wv c2345wv, InterfaceC2478xy interfaceC2478xy, wp1 wp1Var) {
/* 9 */             super(context, looper, 262, c2345wv, interfaceC2478xy, wp1Var);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.sourcedevice.internal.ISourceDirectTransferService");
                    return iInterfaceQueryLocalInterface instanceof zzt ? (zzt) iInterfaceQueryLocalInterface : new zzt(iBinder);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final int getMinApkVersion() {
/* 1 */             return 203000000;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getServiceDescriptor() {
/* 1 */             return "com.google.android.gms.fido.sourcedevice.internal.ISourceDirectTransferService";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getStartServiceAction() {
/* 1 */             return "com.google.android.gms.fido.sourcedevice.service.START";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final boolean getUseDynamicLookup() {
/* 1 */             return true;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final boolean usesClientTelemetry() {
/* 1 */             return true;
                }
            }
