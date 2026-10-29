            package com.google.android.gms.internal.auth;

            import android.content.Context;
            import android.os.RemoteException;
            import com.google.android.gms.auth.api.proxy.ProxyRequest;
            import p000.tr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbq extends zzbi {
                final /* synthetic */ ProxyRequest zza;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbq(zzbt zzbtVar, tr0 tr0Var, ProxyRequest proxyRequest) {
/* 3 */             super(tr0Var);
/* 1 */             this.zza = proxyRequest;
                }

                @Override // com.google.android.gms.internal.auth.zzbi
                public final void zza(Context context, zzbh zzbhVar) throws RemoteException {
/* 8 */             zzbhVar.zze(new zzbp(this), this.zza);
                }
            }
