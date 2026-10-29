            package android.support.customtabs;

            import android.net.Uri;
            import android.os.Binder;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface ICustomTabsCallback extends IInterface {
                public static final String DESCRIPTOR = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Default implements ICustomTabsCallback {
                    @Override // android.os.IInterface
                    public IBinder asBinder() {
/* 1 */                 return null;
                    }

                    @Override // android.support.customtabs.ICustomTabsCallback
                    public void extraCallback(String str, Bundle bundle) throws RemoteException {
                    }

                    @Override // android.support.customtabs.ICustomTabsCallback
                    public Bundle extraCallbackWithResult(String str, Bundle bundle) throws RemoteException {
/* 1 */                 return null;
                    }

                    @Override // android.support.customtabs.ICustomTabsCallback
                    public void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) throws RemoteException {
                    }

                    @Override // android.support.customtabs.ICustomTabsCallback
                    public void onActivityResized(int i, int i2, Bundle bundle) throws RemoteException {
                    }

                    @Override // android.support.customtabs.ICustomTabsCallback
                    public void onMessageChannelReady(Bundle bundle) throws RemoteException {
                    }

                    @Override // android.support.customtabs.ICustomTabsCallback
                    public void onMinimized(Bundle bundle) throws RemoteException {
                    }

                    @Override // android.support.customtabs.ICustomTabsCallback
                    public void onNavigationEvent(int i, Bundle bundle) throws RemoteException {
                    }

                    @Override // android.support.customtabs.ICustomTabsCallback
                    public void onPostMessage(String str, Bundle bundle) throws RemoteException {
                    }

                    @Override // android.support.customtabs.ICustomTabsCallback
                    public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
                    }

                    @Override // android.support.customtabs.ICustomTabsCallback
                    public void onUnminimized(Bundle bundle) throws RemoteException {
                    }

                    @Override // android.support.customtabs.ICustomTabsCallback
                    public void onWarmupCompleted(Bundle bundle) throws RemoteException {
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Stub extends Binder implements ICustomTabsCallback {
                    static final int TRANSACTION_extraCallback = 3;
                    static final int TRANSACTION_extraCallbackWithResult = 7;
                    static final int TRANSACTION_onActivityLayout = 10;
                    static final int TRANSACTION_onActivityResized = 8;
                    static final int TRANSACTION_onMessageChannelReady = 4;
                    static final int TRANSACTION_onMinimized = 11;
                    static final int TRANSACTION_onNavigationEvent = 2;
                    static final int TRANSACTION_onPostMessage = 5;
                    static final int TRANSACTION_onRelationshipValidationResult = 6;
                    static final int TRANSACTION_onUnminimized = 12;
                    static final int TRANSACTION_onWarmupCompleted = 9;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static class Proxy implements ICustomTabsCallback {
                        private IBinder mRemote;

                        public Proxy(IBinder iBinder) {
/* 4 */                     this.mRemote = iBinder;
                        }

                        @Override // android.os.IInterface
                        public IBinder asBinder() {
/* 1 */                     return this.mRemote;
                        }

                        @Override // android.support.customtabs.ICustomTabsCallback
                        public void extraCallback(String str, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(ICustomTabsCallback.DESCRIPTOR);
/* 10 */                        parcelObtain.writeString(str);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 22 */                        this.mRemote.transact(3, parcelObtain, null, 1);
                            } finally {
/* 30 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.ICustomTabsCallback
                        public Bundle extraCallbackWithResult(String str, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ICustomTabsCallback.DESCRIPTOR);
/* 14 */                        parcelObtain.writeString(str);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 24 */                        this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
/* 27 */                        parcelObtain2.readException();
/* 36 */                        return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                            } finally {
/* 46 */                        parcelObtain2.recycle();
/* 49 */                        parcelObtain.recycle();
                            }
                        }

                        public String getInterfaceDescriptor() {
/* 1 */                     return ICustomTabsCallback.DESCRIPTOR;
                        }

                        @Override // android.support.customtabs.ICustomTabsCallback
                        public void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(ICustomTabsCallback.DESCRIPTOR);
/* 10 */                        parcelObtain.writeInt(i);
/* 13 */                        parcelObtain.writeInt(i2);
/* 16 */                        parcelObtain.writeInt(i3);
/* 19 */                        parcelObtain.writeInt(i4);
/* 22 */                        parcelObtain.writeInt(i5);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 35 */                        this.mRemote.transact(10, parcelObtain, null, 1);
                            } finally {
/* 43 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.ICustomTabsCallback
                        public void onActivityResized(int i, int i2, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(ICustomTabsCallback.DESCRIPTOR);
/* 10 */                        parcelObtain.writeInt(i);
/* 13 */                        parcelObtain.writeInt(i2);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 26 */                        this.mRemote.transact(8, parcelObtain, null, 1);
                            } finally {
/* 34 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.ICustomTabsCallback
                        public void onMessageChannelReady(Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ICustomTabsCallback.DESCRIPTOR);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 21 */                        this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
/* 24 */                        parcelObtain2.readException();
                            } finally {
/* 35 */                        parcelObtain2.recycle();
/* 38 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.ICustomTabsCallback
                        public void onMinimized(Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(ICustomTabsCallback.DESCRIPTOR);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 20 */                        this.mRemote.transact(11, parcelObtain, null, 1);
                            } finally {
/* 28 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.ICustomTabsCallback
                        public void onNavigationEvent(int i, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(ICustomTabsCallback.DESCRIPTOR);
/* 10 */                        parcelObtain.writeInt(i);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 22 */                        this.mRemote.transact(2, parcelObtain, null, 1);
                            } finally {
/* 30 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.ICustomTabsCallback
                        public void onPostMessage(String str, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ICustomTabsCallback.DESCRIPTOR);
/* 14 */                        parcelObtain.writeString(str);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 24 */                        this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
/* 27 */                        parcelObtain2.readException();
                            } finally {
/* 38 */                        parcelObtain2.recycle();
/* 41 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.ICustomTabsCallback
                        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(ICustomTabsCallback.DESCRIPTOR);
/* 10 */                        parcelObtain.writeInt(i);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, uri, 0);
/* 17 */                        parcelObtain.writeInt(z ? 1 : 0);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 28 */                        this.mRemote.transact(6, parcelObtain, null, 1);
                            } finally {
/* 36 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.ICustomTabsCallback
                        public void onUnminimized(Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(ICustomTabsCallback.DESCRIPTOR);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 20 */                        this.mRemote.transact(Stub.TRANSACTION_onUnminimized, parcelObtain, null, 1);
                            } finally {
/* 28 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.ICustomTabsCallback
                        public void onWarmupCompleted(Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(ICustomTabsCallback.DESCRIPTOR);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 20 */                        this.mRemote.transact(9, parcelObtain, null, 1);
                            } finally {
/* 28 */                        parcelObtain.recycle();
                            }
                        }
                    }

                    public Stub() {
/* 6 */                 attachInterface(this, ICustomTabsCallback.DESCRIPTOR);
                    }

                    public static ICustomTabsCallback asInterface(IBinder iBinder) {
/* 1 */                 if (iBinder == null) {
/* 3 */                     return null;
                        }
/* 7 */                 IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICustomTabsCallback.DESCRIPTOR);
                        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICustomTabsCallback)) ? new Proxy(iBinder) : (ICustomTabsCallback) iInterfaceQueryLocalInterface;
                    }

                    @Override // android.os.IInterface
                    public IBinder asBinder() {
/* 1 */                 return this;
                    }

                    @Override // android.os.Binder
                    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 1 */                 String str = ICustomTabsCallback.DESCRIPTOR;
/* 4 */                 if (i >= 1 && i <= 16777215) {
/* 11 */                    parcel.enforceInterface(str);
                        }
/* 17 */                if (i == 1598968902) {
/* 19 */                    parcel2.writeString(str);
/* 3 */                     return true;
                        }
                        switch (i) {
                            case 2:
/* 253 */                       onNavigationEvent(parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 3 */                         return true;
                            case 3:
/* 236 */                       extraCallback(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 3 */                         return true;
                            case 4:
/* 216 */                       onMessageChannelReady((Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 219 */                       parcel2.writeNoException();
/* 3 */                         return true;
                            case 5:
/* 200 */                       onPostMessage(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 203 */                       parcel2.writeNoException();
/* 3 */                         return true;
                            case 6:
/* 183 */                       onRelationshipValidationResult(parcel.readInt(), (Uri) _Parcel.readTypedObject(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 3 */                         return true;
                            case 7:
/* 141 */                       Bundle bundleExtraCallbackWithResult = extraCallbackWithResult(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 145 */                       parcel2.writeNoException();
/* 1 */                         _Parcel.writeTypedObject(parcel2, bundleExtraCallbackWithResult, 1);
/* 3 */                         return true;
                            case 8:
/* 123 */                       onActivityResized(parcel.readInt(), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 3 */                         return true;
                            case 9:
/* 101 */                       onWarmupCompleted((Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 3 */                         return true;
                            case 10:
/* 87 */                        onActivityLayout(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 3 */                         return true;
                            case 11:
/* 52 */                        onMinimized((Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 3 */                         return true;
                            case TRANSACTION_onUnminimized /* 12 */:
/* 39 */                        onUnminimized((Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 3 */                         return true;
                            default:
/* 26 */                        return super.onTransact(i, parcel, parcel2, i2);
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

                void extraCallback(String str, Bundle bundle) throws RemoteException;

                Bundle extraCallbackWithResult(String str, Bundle bundle) throws RemoteException;

                void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) throws RemoteException;

                void onActivityResized(int i, int i2, Bundle bundle) throws RemoteException;

                void onMessageChannelReady(Bundle bundle) throws RemoteException;

                void onMinimized(Bundle bundle) throws RemoteException;

                void onNavigationEvent(int i, Bundle bundle) throws RemoteException;

                void onPostMessage(String str, Bundle bundle) throws RemoteException;

                void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException;

                void onUnminimized(Bundle bundle) throws RemoteException;

                void onWarmupCompleted(Bundle bundle) throws RemoteException;
            }
