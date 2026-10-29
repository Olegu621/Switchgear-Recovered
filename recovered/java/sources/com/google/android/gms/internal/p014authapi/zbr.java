            package com.google.android.gms.internal.p014authapi;

            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.auth.api.credentials.Credential;
            import com.google.android.gms.common.api.Status;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zbr extends zbb implements zbs {
                public zbr() {
/* 3 */             super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
                }

                @Override // com.google.android.gms.internal.p014authapi.zbb
                public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 2 */             if (i == 1) {
/* 52 */                Status status = (Status) zbc.zba(parcel, Status.CREATOR);
/* 60 */                Credential credential = (Credential) zbc.zba(parcel, Credential.CREATOR);
/* 62 */                zbc.zbb(parcel);
/* 65 */                zbb(status, credential);
                    } else if (i == 2) {
/* 37 */                Status status2 = (Status) zbc.zba(parcel, Status.CREATOR);
/* 39 */                zbc.zbb(parcel);
/* 42 */                zbc(status2);
                    } else {
/* 8 */                 if (i != 3) {
/* 10 */                    return false;
                        }
/* 18 */                Status status3 = (Status) zbc.zba(parcel, Status.CREATOR);
/* 20 */                String string = parcel.readString();
/* 24 */                zbc.zbb(parcel);
/* 27 */                zbd(status3, string);
                    }
/* 68 */            parcel2.writeNoException();
/* 1 */             return true;
                }
            }
