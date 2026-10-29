            package com.google.android.gms.internal.p014authapi;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
            import com.google.android.gms.auth.api.identity.SavePasswordRequest;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zbz extends zba implements IInterface {
                public zbz(IBinder iBinder) {
/* 3 */             super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
                }

                public final void zbc(zbaf zbafVar, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) throws RemoteException {
/* 1 */             Parcel parcelZba = zba();
/* 5 */             zbc.zbd(parcelZba, zbafVar);
/* 8 */             zbc.zbc(parcelZba, saveAccountLinkingTokenRequest);
/* 12 */            zbb(1, parcelZba);
                }

                public final void zbd(zbah zbahVar, SavePasswordRequest savePasswordRequest) throws RemoteException {
/* 1 */             Parcel parcelZba = zba();
/* 5 */             zbc.zbd(parcelZba, zbahVar);
/* 8 */             zbc.zbc(parcelZba, savePasswordRequest);
/* 12 */            zbb(2, parcelZba);
                }
            }
