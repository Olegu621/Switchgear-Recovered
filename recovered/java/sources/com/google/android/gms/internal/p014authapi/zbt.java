            package com.google.android.gms.internal.p014authapi;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.auth.api.credentials.CredentialRequest;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zbt extends zba implements IInterface {
                public zbt(IBinder iBinder) {
/* 3 */             super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                }

                public final void zbc(zbs zbsVar, zbp zbpVar) throws RemoteException {
/* 1 */             Parcel parcelZba = zba();
/* 5 */             zbc.zbd(parcelZba, zbsVar);
/* 8 */             zbc.zbc(parcelZba, zbpVar);
/* 12 */            zbb(3, parcelZba);
                }

                public final void zbd(zbs zbsVar, CredentialRequest credentialRequest) throws RemoteException {
/* 1 */             Parcel parcelZba = zba();
/* 5 */             zbc.zbd(parcelZba, zbsVar);
/* 8 */             zbc.zbc(parcelZba, credentialRequest);
/* 12 */            zbb(1, parcelZba);
                }

                public final void zbe(zbs zbsVar, zbu zbuVar) throws RemoteException {
/* 1 */             Parcel parcelZba = zba();
/* 5 */             zbc.zbd(parcelZba, zbsVar);
/* 8 */             zbc.zbc(parcelZba, zbuVar);
/* 12 */            zbb(2, parcelZba);
                }

                public final void zbf(zbs zbsVar) throws RemoteException {
/* 1 */             Parcel parcelZba = zba();
/* 5 */             zbc.zbd(parcelZba, zbsVar);
/* 9 */             zbb(4, parcelZba);
                }
            }
