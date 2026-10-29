            package com.google.android.gms.internal.auth;

            import android.content.Context;
            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import p000.AbstractC0841de;
            import p000.AbstractC0955gi;
            import p000.InterfaceC2359x8;
            import p000.p42;
            import p000.tr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            abstract class zzbj extends AbstractC0955gi {
                public zzbj(tr0 tr0Var) {
/* 3 */             super(AbstractC0841de.f7136a, tr0Var);
                }

                @Override // com.google.android.gms.common.api.internal.BasePendingResult
                public final /* synthetic */ p42 createFailedResult(Status status) {
/* 3 */             return new zzbv(status);
                }

                @Override // p000.AbstractC0955gi
                public final /* bridge */ /* synthetic */ void doExecute(InterfaceC2359x8 interfaceC2359x8) throws RemoteException {
/* 1 */             zzbe zzbeVar = (zzbe) interfaceC2359x8;
/* 13 */            zza(zzbeVar.getContext(), (zzbh) zzbeVar.getService());
                }

                @Override // p000.AbstractC0955gi, p000.InterfaceC0992hi
                public final /* bridge */ /* synthetic */ void setResult(Object obj) {
/* 3 */             setResult((p42) obj);
                }

                public abstract void zza(Context context, zzbh zzbhVar) throws RemoteException;
            }
