            package android.support.customtabs.trusted;

            import android.os.Binder;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface ITrustedWebActivityCallback extends IInterface {
                public static final String DESCRIPTOR = "android$support$customtabs$trusted$ITrustedWebActivityCallback".replace('$', '.');

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Default implements ITrustedWebActivityCallback {
                    @Override // android.os.IInterface
                    public IBinder asBinder() {
/* 1 */                 return null;
                    }

                    @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback
                    public void onExtraCallback(String str, Bundle bundle) throws RemoteException {
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Stub extends Binder implements ITrustedWebActivityCallback {
                    static final int TRANSACTION_onExtraCallback = 2;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static class Proxy implements ITrustedWebActivityCallback {
                        private IBinder mRemote;

                        public Proxy(IBinder iBinder) {
/* 4 */                     this.mRemote = iBinder;
                        }

                        @Override // android.os.IInterface
                        public IBinder asBinder() {
/* 1 */                     return this.mRemote;
                        }

                        public String getInterfaceDescriptor() {
/* 1 */                     return ITrustedWebActivityCallback.DESCRIPTOR;
                        }

                        @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback
                        public void onExtraCallback(String str, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ITrustedWebActivityCallback.DESCRIPTOR);
/* 14 */                        parcelObtain.writeString(str);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 24 */                        this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
/* 27 */                        parcelObtain2.readException();
                            } finally {
/* 38 */                        parcelObtain2.recycle();
/* 41 */                        parcelObtain.recycle();
                            }
                        }
                    }

                    public Stub() {
/* 6 */                 attachInterface(this, ITrustedWebActivityCallback.DESCRIPTOR);
                    }

                    public static ITrustedWebActivityCallback asInterface(IBinder iBinder) {
/* 1 */                 if (iBinder == null) {
/* 3 */                     return null;
                        }
/* 7 */                 IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ITrustedWebActivityCallback.DESCRIPTOR);
                        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITrustedWebActivityCallback)) ? new Proxy(iBinder) : (ITrustedWebActivityCallback) iInterfaceQueryLocalInterface;
                    }

                    @Override // android.os.IInterface
                    public IBinder asBinder() {
/* 1 */                 return this;
                    }

                    @Override // android.os.Binder
                    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 1 */                 String str = ITrustedWebActivityCallback.DESCRIPTOR;
/* 4 */                 if (i >= 1 && i <= 16777215) {
/* 11 */                    parcel.enforceInterface(str);
                        }
/* 17 */                if (i == 1598968902) {
/* 19 */                    parcel2.writeString(str);
/* 3 */                     return true;
                        }
/* 24 */                if (i != 2) {
/* 26 */                    return super.onTransact(i, parcel, parcel2, i2);
                        }
/* 43 */                onExtraCallback(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 46 */                parcel2.writeNoException();
/* 3 */                 return true;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class _Parcel {
                    /* JADX INFO: Access modifiers changed from: private */
                    public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
/* 5 */                 if (parcel.readInt() != 0) {
/* 7 */                     return creator.createFromParcel(parcel);
                        }
/* 12 */                return null;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
/* 1 */                 if (t == null) {
/* 12 */                    parcel.writeInt(0);
                        } else {
/* 4 */                     parcel.writeInt(1);
/* 7 */                     t.writeToParcel(parcel, i);
                        }
                    }
                }

                void onExtraCallback(String str, Bundle bundle) throws RemoteException;
            }
