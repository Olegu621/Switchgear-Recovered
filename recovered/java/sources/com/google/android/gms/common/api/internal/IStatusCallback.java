            package com.google.android.gms.common.api.internal;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.internal.base.zab;
            import com.google.android.gms.internal.base.zac;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface IStatusCallback extends IInterface {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Stub extends zab implements IStatusCallback {
                    public Stub() {
/* 3 */                 super("com.google.android.gms.common.api.internal.IStatusCallback");
                    }

                    public static IStatusCallback asInterface(IBinder iBinder) {
/* 1 */                 if (iBinder == null) {
/* 3 */                     return null;
                        }
/* 7 */                 IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                        return iInterfaceQueryLocalInterface instanceof IStatusCallback ? (IStatusCallback) iInterfaceQueryLocalInterface : new zaby(iBinder, "com.google.android.gms.common.api.internal.IStatusCallback");
                    }

                    @Override // com.google.android.gms.internal.base.zab
                    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 2 */                 if (i != 1) {
/* 19 */                    return false;
                        }
/* 10 */                Status status = (Status) zac.zaa(parcel, Status.CREATOR);
/* 12 */                zac.zab(parcel);
/* 15 */                onResult(status);
/* 1 */                 return true;
                    }
                }

                void onResult(Status status);
            }
