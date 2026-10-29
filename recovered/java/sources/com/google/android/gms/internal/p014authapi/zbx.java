            package com.google.android.gms.internal.p014authapi;

            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.auth.api.identity.BeginSignInResult;
            import com.google.android.gms.common.api.Status;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zbx extends zbb implements zby {
                public zbx() {
/* 3 */             super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
                }

                @Override // com.google.android.gms.internal.p014authapi.zbb
                public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 2 */             if (i != 1) {
/* 27 */                return false;
                    }
/* 10 */            Status status = (Status) zbc.zba(parcel, Status.CREATOR);
/* 18 */            BeginSignInResult beginSignInResult = (BeginSignInResult) zbc.zba(parcel, BeginSignInResult.CREATOR);
/* 20 */            zbc.zbb(parcel);
/* 23 */            zbb(status, beginSignInResult);
/* 1 */             return true;
                }
            }
