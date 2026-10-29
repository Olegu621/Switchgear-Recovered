            package android.support.v4.app;

            import android.app.Notification;
            import android.os.Binder;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface INotificationSideChannel extends IInterface {
                public static final String DESCRIPTOR = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Default implements INotificationSideChannel {
                    @Override // android.os.IInterface
                    public IBinder asBinder() {
/* 1 */                 return null;
                    }

                    @Override // android.support.v4.app.INotificationSideChannel
                    public void cancel(String str, int i, String str2) throws RemoteException {
                    }

                    @Override // android.support.v4.app.INotificationSideChannel
                    public void cancelAll(String str) throws RemoteException {
                    }

                    @Override // android.support.v4.app.INotificationSideChannel
                    public void notify(String str, int i, String str2, Notification notification) throws RemoteException {
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Stub extends Binder implements INotificationSideChannel {
                    static final int TRANSACTION_cancel = 2;
                    static final int TRANSACTION_cancelAll = 3;
                    static final int TRANSACTION_notify = 1;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static class Proxy implements INotificationSideChannel {
                        private IBinder mRemote;

                        public Proxy(IBinder iBinder) {
/* 4 */                     this.mRemote = iBinder;
                        }

                        @Override // android.os.IInterface
                        public IBinder asBinder() {
/* 1 */                     return this.mRemote;
                        }

                        @Override // android.support.v4.app.INotificationSideChannel
                        public void cancel(String str, int i, String str2) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(INotificationSideChannel.DESCRIPTOR);
/* 10 */                        parcelObtain.writeString(str);
/* 13 */                        parcelObtain.writeInt(i);
/* 16 */                        parcelObtain.writeString(str2);
/* 24 */                        this.mRemote.transact(2, parcelObtain, null, 1);
                            } finally {
/* 32 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.app.INotificationSideChannel
                        public void cancelAll(String str) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(INotificationSideChannel.DESCRIPTOR);
/* 10 */                        parcelObtain.writeString(str);
/* 18 */                        this.mRemote.transact(3, parcelObtain, null, 1);
                            } finally {
/* 26 */                        parcelObtain.recycle();
                            }
                        }

                        public String getInterfaceDescriptor() {
/* 1 */                     return INotificationSideChannel.DESCRIPTOR;
                        }

                        @Override // android.support.v4.app.INotificationSideChannel
                        public void notify(String str, int i, String str2, Notification notification) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(INotificationSideChannel.DESCRIPTOR);
/* 10 */                        parcelObtain.writeString(str);
/* 13 */                        parcelObtain.writeInt(i);
/* 16 */                        parcelObtain.writeString(str2);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, notification, 0);
/* 27 */                        this.mRemote.transact(1, parcelObtain, null, 1);
                            } finally {
/* 35 */                        parcelObtain.recycle();
                            }
                        }
                    }

                    public Stub() {
/* 6 */                 attachInterface(this, INotificationSideChannel.DESCRIPTOR);
                    }

                    public static INotificationSideChannel asInterface(IBinder iBinder) {
/* 1 */                 if (iBinder == null) {
/* 3 */                     return null;
                        }
/* 7 */                 IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(INotificationSideChannel.DESCRIPTOR);
                        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INotificationSideChannel)) ? new Proxy(iBinder) : (INotificationSideChannel) iInterfaceQueryLocalInterface;
                    }

                    @Override // android.os.IInterface
                    public IBinder asBinder() {
/* 1 */                 return this;
                    }

                    @Override // android.os.Binder
                    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 1 */                 String str = INotificationSideChannel.DESCRIPTOR;
/* 4 */                 if (i >= 1 && i <= 16777215) {
/* 11 */                    parcel.enforceInterface(str);
                        }
/* 17 */                if (i == 1598968902) {
/* 19 */                    parcel2.writeString(str);
/* 3 */                     return true;
                        }
/* 23 */                if (i == 1) {
/* 80 */                    notify(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) _Parcel.readTypedObject(parcel, Notification.CREATOR));
                        } else if (i == 2) {
/* 56 */                    cancel(parcel.readString(), parcel.readInt(), parcel.readString());
                        } else {
/* 29 */                    if (i != 3) {
/* 31 */                        return super.onTransact(i, parcel, parcel2, i2);
                            }
/* 40 */                    cancelAll(parcel.readString());
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

                void cancel(String str, int i, String str2) throws RemoteException;

                void cancelAll(String str) throws RemoteException;

                void notify(String str, int i, String str2, Notification notification) throws RemoteException;
            }
