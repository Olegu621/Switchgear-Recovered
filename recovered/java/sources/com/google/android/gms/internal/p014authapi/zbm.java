            package com.google.android.gms.internal.p014authapi;

            import android.content.Context;
            import android.os.RemoteException;
            import p000.AbstractC0213ce;
            import p000.AbstractC0955gi;
            import p000.InterfaceC2359x8;
            import p000.p42;
            import p000.tr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            abstract class zbm extends AbstractC0955gi {
                public zbm(tr0 tr0Var) {
/* 3 */             super(AbstractC0213ce.f2858a, tr0Var);
                }

                @Override // p000.AbstractC0955gi
                public final /* bridge */ /* synthetic */ void doExecute(InterfaceC2359x8 interfaceC2359x8) throws RemoteException {
/* 1 */             zbo zboVar = (zbo) interfaceC2359x8;
/* 13 */            zba(zboVar.getContext(), (zbt) zboVar.getService());
                }

                @Override // p000.AbstractC0955gi, p000.InterfaceC0992hi
                public final /* bridge */ /* synthetic */ void setResult(Object obj) {
/* 3 */             setResult((p42) obj);
                }

                public abstract void zba(Context context, zbt zbtVar) throws RemoteException;
            }
