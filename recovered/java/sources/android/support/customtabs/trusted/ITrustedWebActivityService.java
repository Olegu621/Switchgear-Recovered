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
            public interface ITrustedWebActivityService extends IInterface {
                public static final String DESCRIPTOR = "android$support$customtabs$trusted$ITrustedWebActivityService".replace('$', '.');

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Default implements ITrustedWebActivityService {
                    @Override // android.support.customtabs.trusted.ITrustedWebActivityService
                    public Bundle areNotificationsEnabled(Bundle bundle) throws RemoteException {
/* 1 */                 return null;
                    }

                    @Override // android.os.IInterface
                    public IBinder asBinder() {
/* 1 */                 return null;
                    }

                    @Override // android.support.customtabs.trusted.ITrustedWebActivityService
                    public void cancelNotification(Bundle bundle) throws RemoteException {
                    }

                    @Override // android.support.customtabs.trusted.ITrustedWebActivityService
                    public Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) throws RemoteException {
/* 1 */                 return null;
                    }

                    @Override // android.support.customtabs.trusted.ITrustedWebActivityService
                    public Bundle getActiveNotifications() throws RemoteException {
/* 1 */                 return null;
                    }

                    @Override // android.support.customtabs.trusted.ITrustedWebActivityService
                    public Bundle getSmallIconBitmap() throws RemoteException {
/* 1 */                 return null;
                    }

                    @Override // android.support.customtabs.trusted.ITrustedWebActivityService
                    public int getSmallIconId() throws RemoteException {
/* 1 */                 return 0;
                    }

                    @Override // android.support.customtabs.trusted.ITrustedWebActivityService
                    public Bundle notifyNotificationWithChannel(Bundle bundle) throws RemoteException {
/* 1 */                 return null;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Stub extends Binder implements ITrustedWebActivityService {
                    static final int TRANSACTION_areNotificationsEnabled = 6;
                    static final int TRANSACTION_cancelNotification = 3;
                    static final int TRANSACTION_extraCommand = 9;
                    static final int TRANSACTION_getActiveNotifications = 5;
                    static final int TRANSACTION_getSmallIconBitmap = 7;
                    static final int TRANSACTION_getSmallIconId = 4;
                    static final int TRANSACTION_notifyNotificationWithChannel = 2;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static class Proxy implements ITrustedWebActivityService {
                        private IBinder mRemote;

                        public Proxy(IBinder iBinder) {
/* 4 */                     this.mRemote = iBinder;
                        }

                        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
                        public Bundle areNotificationsEnabled(Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ITrustedWebActivityService.DESCRIPTOR);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 21 */                        this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
/* 24 */                        parcelObtain2.readException();
/* 33 */                        return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                            } finally {
/* 43 */                        parcelObtain2.recycle();
/* 46 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.os.IInterface
                        public IBinder asBinder() {
/* 1 */                     return this.mRemote;
                        }

                        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
                        public void cancelNotification(Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ITrustedWebActivityService.DESCRIPTOR);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 21 */                        this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
/* 24 */                        parcelObtain2.readException();
                            } finally {
/* 35 */                        parcelObtain2.recycle();
/* 38 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
                        public Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ITrustedWebActivityService.DESCRIPTOR);
/* 14 */                        parcelObtain.writeString(str);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 21 */                        parcelObtain.writeStrongBinder(iBinder);
/* 28 */                        this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
/* 31 */                        parcelObtain2.readException();
/* 40 */                        return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                            } finally {
/* 50 */                        parcelObtain2.recycle();
/* 53 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
                        public Bundle getActiveNotifications() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ITrustedWebActivityService.DESCRIPTOR);
/* 18 */                        this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
/* 21 */                        parcelObtain2.readException();
/* 30 */                        return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                            } finally {
/* 40 */                        parcelObtain2.recycle();
/* 43 */                        parcelObtain.recycle();
                            }
                        }

                        public String getInterfaceDescriptor() {
/* 1 */                     return ITrustedWebActivityService.DESCRIPTOR;
                        }

                        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
                        public Bundle getSmallIconBitmap() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ITrustedWebActivityService.DESCRIPTOR);
/* 18 */                        this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
/* 21 */                        parcelObtain2.readException();
/* 30 */                        return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                            } finally {
/* 40 */                        parcelObtain2.recycle();
/* 43 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
                        public int getSmallIconId() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ITrustedWebActivityService.DESCRIPTOR);
/* 18 */                        this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
/* 21 */                        parcelObtain2.readException();
/* 24 */                        return parcelObtain2.readInt();
                            } finally {
/* 36 */                        parcelObtain2.recycle();
/* 39 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
                        public Bundle notifyNotificationWithChannel(Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ITrustedWebActivityService.DESCRIPTOR);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 21 */                        this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
/* 24 */                        parcelObtain2.readException();
/* 33 */                        return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                            } finally {
/* 43 */                        parcelObtain2.recycle();
/* 46 */                        parcelObtain.recycle();
                            }
                        }
                    }

                    public Stub() {
/* 6 */                 attachInterface(this, ITrustedWebActivityService.DESCRIPTOR);
                    }

                    public static ITrustedWebActivityService asInterface(IBinder iBinder) {
/* 1 */                 if (iBinder == null) {
/* 3 */                     return null;
                        }
/* 7 */                 IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ITrustedWebActivityService.DESCRIPTOR);
                        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITrustedWebActivityService)) ? new Proxy(iBinder) : (ITrustedWebActivityService) iInterfaceQueryLocalInterface;
                    }

                    @Override // android.os.IInterface
                    public IBinder asBinder() {
/* 1 */                 return this;
                    }

                    @Override // android.os.Binder
                    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 1 */                 String str = ITrustedWebActivityService.DESCRIPTOR;
/* 4 */                 if (i >= 1 && i <= 16777215) {
/* 11 */                    parcel.enforceInterface(str);
                        }
/* 17 */                if (i == 1598968902) {
/* 19 */                    parcel2.writeString(str);
/* 3 */                     return true;
                        }
                        switch (i) {
                            case 2:
/* 133 */                       Bundle bundleNotifyNotificationWithChannel = notifyNotificationWithChannel((Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 137 */                       parcel2.writeNoException();
/* 1 */                         _Parcel.writeTypedObject(parcel2, bundleNotifyNotificationWithChannel, 1);
/* 3 */                         return true;
                            case 3:
/* 118 */                       cancelNotification((Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 121 */                       parcel2.writeNoException();
/* 3 */                         return true;
                            case 4:
/* 99 */                        int smallIconId = getSmallIconId();
/* 103 */                       parcel2.writeNoException();
/* 106 */                       parcel2.writeInt(smallIconId);
/* 3 */                         return true;
                            case 5:
/* 88 */                        Bundle activeNotifications = getActiveNotifications();
/* 92 */                        parcel2.writeNoException();
/* 1 */                         _Parcel.writeTypedObject(parcel2, activeNotifications, 1);
/* 3 */                         return true;
                            case 6:
/* 77 */                        Bundle bundleAreNotificationsEnabled = areNotificationsEnabled((Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 81 */                        parcel2.writeNoException();
/* 1 */                         _Parcel.writeTypedObject(parcel2, bundleAreNotificationsEnabled, 1);
/* 3 */                         return true;
                            case 7:
/* 58 */                        Bundle smallIconBitmap = getSmallIconBitmap();
/* 62 */                        parcel2.writeNoException();
/* 1 */                         _Parcel.writeTypedObject(parcel2, smallIconBitmap, 1);
/* 3 */                         return true;
                            case 8:
                            default:
/* 26 */                        return super.onTransact(i, parcel, parcel2, i2);
                            case 9:
/* 47 */                        Bundle bundleExtraCommand = extraCommand(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), parcel.readStrongBinder());
/* 51 */                        parcel2.writeNoException();
/* 1 */                         _Parcel.writeTypedObject(parcel2, bundleExtraCommand, 1);
/* 3 */                         return true;
                        }
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

                Bundle areNotificationsEnabled(Bundle bundle) throws RemoteException;

                void cancelNotification(Bundle bundle) throws RemoteException;

                Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) throws RemoteException;

                Bundle getActiveNotifications() throws RemoteException;

                Bundle getSmallIconBitmap() throws RemoteException;

                int getSmallIconId() throws RemoteException;

                Bundle notifyNotificationWithChannel(Bundle bundle) throws RemoteException;
            }
