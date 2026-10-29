            package com.google.android.gms.internal.p014authapi;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.auth.api.identity.BeginSignInRequest;
            import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
            import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
            import com.google.android.gms.common.api.internal.IStatusCallback;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zbai extends zba implements IInterface {
                public zbai(IBinder iBinder) {
/* 3 */             super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
                }

                public final void zbc(zby zbyVar, BeginSignInRequest beginSignInRequest) throws RemoteException {
/* 1 */             Parcel parcelZba = zba();
/* 5 */             zbc.zbd(parcelZba, zbyVar);
/* 8 */             zbc.zbc(parcelZba, beginSignInRequest);
/* 12 */            zbb(1, parcelZba);
                }

                public final void zbd(zbab zbabVar, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, String str) throws RemoteException {
/* 1 */             Parcel parcelZba = zba();
/* 5 */             zbc.zbd(parcelZba, zbabVar);
/* 8 */             zbc.zbc(parcelZba, getPhoneNumberHintIntentRequest);
/* 11 */            parcelZba.writeString(str);
/* 15 */            zbb(4, parcelZba);
                }

                public final void zbe(zbad zbadVar, GetSignInIntentRequest getSignInIntentRequest) throws RemoteException {
/* 1 */             Parcel parcelZba = zba();
/* 5 */             zbc.zbd(parcelZba, zbadVar);
/* 8 */             zbc.zbc(parcelZba, getSignInIntentRequest);
/* 12 */            zbb(3, parcelZba);
                }

                public final void zbf(IStatusCallback iStatusCallback, String str) throws RemoteException {
/* 1 */             Parcel parcelZba = zba();
/* 5 */             zbc.zbd(parcelZba, iStatusCallback);
/* 8 */             parcelZba.writeString(str);
/* 12 */            zbb(2, parcelZba);
                }
            }
