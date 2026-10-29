            package android.support.customtabs;

            import android.os.Binder;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface IEngagementSignalsCallback extends IInterface {
                public static final String DESCRIPTOR = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Default implements IEngagementSignalsCallback {
                    @Override // android.os.IInterface
                    public IBinder asBinder() {
/* 1 */                 return null;
                    }

                    @Override // android.support.customtabs.IEngagementSignalsCallback
                    public void onGreatestScrollPercentageIncreased(int i, Bundle bundle) throws RemoteException {
                    }

                    @Override // android.support.customtabs.IEngagementSignalsCallback
                    public void onSessionEnded(boolean z, Bundle bundle) throws RemoteException {
                    }

                    @Override // android.support.customtabs.IEngagementSignalsCallback
                    public void onVerticalScrollEvent(boolean z, Bundle bundle) throws RemoteException {
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Stub extends Binder implements IEngagementSignalsCallback {
                    static final int TRANSACTION_onGreatestScrollPercentageIncreased = 3;
                    static final int TRANSACTION_onSessionEnded = 4;
                    static final int TRANSACTION_onVerticalScrollEvent = 2;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static class Proxy implements IEngagementSignalsCallback {
                        private IBinder mRemote;

                        public Proxy(IBinder iBinder) {
/* 4 */                     this.mRemote = iBinder;
                        }

                        @Override // android.os.IInterface
                        public IBinder asBinder() {
/* 1 */                     return this.mRemote;
                        }

                        public String getInterfaceDescriptor() {
/* 1 */                     return IEngagementSignalsCallback.DESCRIPTOR;
                        }

                        @Override // android.support.customtabs.IEngagementSignalsCallback
                        public void onGreatestScrollPercentageIncreased(int i, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(IEngagementSignalsCallback.DESCRIPTOR);
/* 10 */                        parcelObtain.writeInt(i);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 22 */                        this.mRemote.transact(3, parcelObtain, null, 1);
                            } finally {
/* 30 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.IEngagementSignalsCallback
                        public void onSessionEnded(boolean z, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(IEngagementSignalsCallback.DESCRIPTOR);
/* 10 */                        parcelObtain.writeInt(z ? 1 : 0);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 22 */                        this.mRemote.transact(4, parcelObtain, null, 1);
                            } finally {
/* 30 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.IEngagementSignalsCallback
                        public void onVerticalScrollEvent(boolean z, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(IEngagementSignalsCallback.DESCRIPTOR);
/* 10 */                        parcelObtain.writeInt(z ? 1 : 0);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 22 */                        this.mRemote.transact(2, parcelObtain, null, 1);
                            } finally {
/* 30 */                        parcelObtain.recycle();
                            }
                        }
                    }

                    public Stub() {
/* 6 */                 attachInterface(this, IEngagementSignalsCallback.DESCRIPTOR);
                    }

                    public static IEngagementSignalsCallback asInterface(IBinder iBinder) {
/* 1 */                 if (iBinder == null) {
/* 3 */                     return null;
                        }
/* 7 */                 IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IEngagementSignalsCallback.DESCRIPTOR);
                        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IEngagementSignalsCallback)) ? new Proxy(iBinder) : (IEngagementSignalsCallback) iInterfaceQueryLocalInterface;
                    }

                    @Override // android.os.IInterface
                    public IBinder asBinder() {
/* 1 */                 return this;
                    }

                    @Override // android.os.Binder
                    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 1 */                 String str = IEngagementSignalsCallback.DESCRIPTOR;
/* 4 */                 if (i >= 1 && i <= 16777215) {
/* 11 */                    parcel.enforceInterface(str);
                        }
/* 17 */                if (i == 1598968902) {
/* 19 */                    parcel2.writeString(str);
/* 3 */                     return true;
                        }
/* 25 */                if (i == 2) {
/* 88 */                    onVerticalScrollEvent(parcel.readInt() != 0, (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                        } else if (i == 3) {
/* 69 */                    onGreatestScrollPercentageIncreased(parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                        } else {
/* 31 */                    if (i != 4) {
/* 33 */                        return super.onTransact(i, parcel, parcel2, i2);
                            }
/* 53 */                    onSessionEnded(parcel.readInt() != 0, (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                        }
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

                void onGreatestScrollPercentageIncreased(int i, Bundle bundle) throws RemoteException;

                void onSessionEnded(boolean z, Bundle bundle) throws RemoteException;

                void onVerticalScrollEvent(boolean z, Bundle bundle) throws RemoteException;
            }
