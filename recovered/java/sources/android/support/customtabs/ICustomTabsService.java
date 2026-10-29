            package android.support.customtabs;

            import android.net.Uri;
            import android.os.Binder;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.RemoteException;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface ICustomTabsService extends IInterface {
                public static final String DESCRIPTOR = "android$support$customtabs$ICustomTabsService".replace('$', '.');

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Default implements ICustomTabsService {
                    @Override // android.os.IInterface
                    public IBinder asBinder() {
/* 1 */                 return null;
                    }

                    @Override // android.support.customtabs.ICustomTabsService
                    public Bundle extraCommand(String str, Bundle bundle) throws RemoteException {
/* 1 */                 return null;
                    }

                    @Override // android.support.customtabs.ICustomTabsService
                    public boolean isEngagementSignalsApiAvailable(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
/* 1 */                 return false;
                    }

                    @Override // android.support.customtabs.ICustomTabsService
                    public boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
/* 1 */                 return false;
                    }

                    @Override // android.support.customtabs.ICustomTabsService
                    public boolean newSession(ICustomTabsCallback iCustomTabsCallback) throws RemoteException {
/* 1 */                 return false;
                    }

                    @Override // android.support.customtabs.ICustomTabsService
                    public boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
/* 1 */                 return false;
                    }

                    @Override // android.support.customtabs.ICustomTabsService
                    public int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException {
/* 1 */                 return 0;
                    }

                    @Override // android.support.customtabs.ICustomTabsService
                    public boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i, Bundle bundle) throws RemoteException {
/* 1 */                 return false;
                    }

                    @Override // android.support.customtabs.ICustomTabsService
                    public boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) throws RemoteException {
/* 1 */                 return false;
                    }

                    @Override // android.support.customtabs.ICustomTabsService
                    public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) throws RemoteException {
/* 1 */                 return false;
                    }

                    @Override // android.support.customtabs.ICustomTabsService
                    public boolean setEngagementSignalsCallback(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) throws RemoteException {
/* 1 */                 return false;
                    }

                    @Override // android.support.customtabs.ICustomTabsService
                    public boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
/* 1 */                 return false;
                    }

                    @Override // android.support.customtabs.ICustomTabsService
                    public boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) throws RemoteException {
/* 1 */                 return false;
                    }

                    @Override // android.support.customtabs.ICustomTabsService
                    public boolean warmup(long j) throws RemoteException {
/* 1 */                 return false;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Stub extends Binder implements ICustomTabsService {
                    static final int TRANSACTION_extraCommand = 5;
                    static final int TRANSACTION_isEngagementSignalsApiAvailable = 13;
                    static final int TRANSACTION_mayLaunchUrl = 4;
                    static final int TRANSACTION_newSession = 3;
                    static final int TRANSACTION_newSessionWithExtras = 10;
                    static final int TRANSACTION_postMessage = 8;
                    static final int TRANSACTION_receiveFile = 12;
                    static final int TRANSACTION_requestPostMessageChannel = 7;
                    static final int TRANSACTION_requestPostMessageChannelWithExtras = 11;
                    static final int TRANSACTION_setEngagementSignalsCallback = 14;
                    static final int TRANSACTION_updateVisuals = 6;
                    static final int TRANSACTION_validateRelationship = 9;
                    static final int TRANSACTION_warmup = 2;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static class Proxy implements ICustomTabsService {
                        private IBinder mRemote;

                        public Proxy(IBinder iBinder) {
/* 4 */                     this.mRemote = iBinder;
                        }

                        @Override // android.os.IInterface
                        public IBinder asBinder() {
/* 1 */                     return this.mRemote;
                        }

                        @Override // android.support.customtabs.ICustomTabsService
                        public Bundle extraCommand(String str, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ICustomTabsService.DESCRIPTOR);
/* 14 */                        parcelObtain.writeString(str);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 24 */                        this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
/* 27 */                        parcelObtain2.readException();
/* 36 */                        return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                            } finally {
/* 46 */                        parcelObtain2.recycle();
/* 49 */                        parcelObtain.recycle();
                            }
                        }

                        public String getInterfaceDescriptor() {
/* 1 */                     return ICustomTabsService.DESCRIPTOR;
                        }

                        @Override // android.support.customtabs.ICustomTabsService
                        public boolean isEngagementSignalsApiAvailable(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ICustomTabsService.DESCRIPTOR);
/* 14 */                        parcelObtain.writeStrongInterface(iCustomTabsCallback);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 25 */                        this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
/* 28 */                        parcelObtain2.readException();
/* 35 */                        return parcelObtain2.readInt() != 0;
                            } finally {
/* 46 */                        parcelObtain2.recycle();
/* 49 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.ICustomTabsService
                        public boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ICustomTabsService.DESCRIPTOR);
/* 14 */                        parcelObtain.writeStrongInterface(iCustomTabsCallback);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, uri, 0);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 1 */                         _Parcel.writeTypedList(parcelObtain, list, 0);
/* 30 */                        this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
/* 33 */                        parcelObtain2.readException();
/* 40 */                        return parcelObtain2.readInt() != 0;
                            } finally {
/* 51 */                        parcelObtain2.recycle();
/* 54 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.ICustomTabsService
                        public boolean newSession(ICustomTabsCallback iCustomTabsCallback) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ICustomTabsService.DESCRIPTOR);
/* 14 */                        parcelObtain.writeStrongInterface(iCustomTabsCallback);
/* 21 */                        this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
/* 24 */                        parcelObtain2.readException();
/* 31 */                        return parcelObtain2.readInt() != 0;
                            } finally {
/* 42 */                        parcelObtain2.recycle();
/* 45 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.ICustomTabsService
                        public boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ICustomTabsService.DESCRIPTOR);
/* 14 */                        parcelObtain.writeStrongInterface(iCustomTabsCallback);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 25 */                        this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
/* 28 */                        parcelObtain2.readException();
/* 35 */                        return parcelObtain2.readInt() != 0;
                            } finally {
/* 46 */                        parcelObtain2.recycle();
/* 49 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.ICustomTabsService
                        public int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ICustomTabsService.DESCRIPTOR);
/* 14 */                        parcelObtain.writeStrongInterface(iCustomTabsCallback);
/* 17 */                        parcelObtain.writeString(str);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 28 */                        this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
/* 31 */                        parcelObtain2.readException();
/* 34 */                        return parcelObtain2.readInt();
                            } finally {
/* 46 */                        parcelObtain2.recycle();
/* 49 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.ICustomTabsService
                        public boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ICustomTabsService.DESCRIPTOR);
/* 14 */                        parcelObtain.writeStrongInterface(iCustomTabsCallback);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, uri, 0);
/* 21 */                        parcelObtain.writeInt(i);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 31 */                        this.mRemote.transact(Stub.TRANSACTION_receiveFile, parcelObtain, parcelObtain2, 0);
/* 34 */                        parcelObtain2.readException();
/* 41 */                        return parcelObtain2.readInt() != 0;
                            } finally {
/* 52 */                        parcelObtain2.recycle();
/* 55 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.ICustomTabsService
                        public boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ICustomTabsService.DESCRIPTOR);
/* 14 */                        parcelObtain.writeStrongInterface(iCustomTabsCallback);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, uri, 0);
/* 24 */                        this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
/* 27 */                        parcelObtain2.readException();
/* 34 */                        return parcelObtain2.readInt() != 0;
                            } finally {
/* 45 */                        parcelObtain2.recycle();
/* 48 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.ICustomTabsService
                        public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ICustomTabsService.DESCRIPTOR);
/* 14 */                        parcelObtain.writeStrongInterface(iCustomTabsCallback);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, uri, 0);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 28 */                        this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
/* 31 */                        parcelObtain2.readException();
/* 38 */                        return parcelObtain2.readInt() != 0;
                            } finally {
/* 49 */                        parcelObtain2.recycle();
/* 52 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.ICustomTabsService
                        public boolean setEngagementSignalsCallback(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ICustomTabsService.DESCRIPTOR);
/* 14 */                        parcelObtain.writeStrongInterface(iCustomTabsCallback);
/* 17 */                        parcelObtain.writeStrongBinder(iBinder);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 28 */                        this.mRemote.transact(Stub.TRANSACTION_setEngagementSignalsCallback, parcelObtain, parcelObtain2, 0);
/* 31 */                        parcelObtain2.readException();
/* 38 */                        return parcelObtain2.readInt() != 0;
                            } finally {
/* 49 */                        parcelObtain2.recycle();
/* 52 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.ICustomTabsService
                        public boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ICustomTabsService.DESCRIPTOR);
/* 14 */                        parcelObtain.writeStrongInterface(iCustomTabsCallback);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 24 */                        this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
/* 27 */                        parcelObtain2.readException();
/* 34 */                        return parcelObtain2.readInt() != 0;
                            } finally {
/* 45 */                        parcelObtain2.recycle();
/* 48 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.ICustomTabsService
                        public boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ICustomTabsService.DESCRIPTOR);
/* 14 */                        parcelObtain.writeStrongInterface(iCustomTabsCallback);
/* 17 */                        parcelObtain.writeInt(i);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, uri, 0);
/* 1 */                         _Parcel.writeTypedObject(parcelObtain, bundle, 0);
/* 31 */                        this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
/* 34 */                        parcelObtain2.readException();
/* 41 */                        return parcelObtain2.readInt() != 0;
                            } finally {
/* 52 */                        parcelObtain2.recycle();
/* 55 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.customtabs.ICustomTabsService
                        public boolean warmup(long j) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(ICustomTabsService.DESCRIPTOR);
/* 14 */                        parcelObtain.writeLong(j);
/* 21 */                        this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
/* 24 */                        parcelObtain2.readException();
/* 31 */                        return parcelObtain2.readInt() != 0;
                            } finally {
/* 42 */                        parcelObtain2.recycle();
/* 45 */                        parcelObtain.recycle();
                            }
                        }
                    }

                    public Stub() {
/* 6 */                 attachInterface(this, ICustomTabsService.DESCRIPTOR);
                    }

                    public static ICustomTabsService asInterface(IBinder iBinder) {
/* 1 */                 if (iBinder == null) {
/* 3 */                     return null;
                        }
/* 7 */                 IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICustomTabsService.DESCRIPTOR);
                        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICustomTabsService)) ? new Proxy(iBinder) : (ICustomTabsService) iInterfaceQueryLocalInterface;
                    }

                    @Override // android.os.IInterface
                    public IBinder asBinder() {
/* 1 */                 return this;
                    }

                    @Override // android.os.Binder
                    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 1 */                 String str = ICustomTabsService.DESCRIPTOR;
/* 4 */                 if (i >= 1 && i <= 16777215) {
/* 11 */                    parcel.enforceInterface(str);
                        }
/* 17 */                if (i == 1598968902) {
/* 19 */                    parcel2.writeString(str);
/* 3 */                     return true;
                        }
                        switch (i) {
                            case 2:
/* 407 */                       boolean zWarmup = warmup(parcel.readLong());
/* 411 */                       parcel2.writeNoException();
/* 414 */                       parcel2.writeInt(zWarmup ? 1 : 0);
/* 3 */                         return true;
                            case 3:
/* 392 */                       boolean zNewSession = newSession(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()));
/* 396 */                       parcel2.writeNoException();
/* 399 */                       parcel2.writeInt(zNewSession ? 1 : 0);
/* 3 */                         return true;
                            case 4:
/* 349 */                       ICustomTabsCallback iCustomTabsCallbackAsInterface = ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder());
/* 359 */                       Uri uri = (Uri) _Parcel.readTypedObject(parcel, Uri.CREATOR);
/* 361 */                       Parcelable.Creator creator = Bundle.CREATOR;
/* 373 */                       boolean zMayLaunchUrl = mayLaunchUrl(iCustomTabsCallbackAsInterface, uri, (Bundle) _Parcel.readTypedObject(parcel, creator), parcel.createTypedArrayList(creator));
/* 377 */                       parcel2.writeNoException();
/* 380 */                       parcel2.writeInt(zMayLaunchUrl ? 1 : 0);
/* 3 */                         return true;
                            case 5:
/* 334 */                       Bundle bundleExtraCommand = extraCommand(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 338 */                       parcel2.writeNoException();
/* 1 */                         _Parcel.writeTypedObject(parcel2, bundleExtraCommand, 1);
/* 3 */                         return true;
                            case 6:
/* 311 */                       boolean zUpdateVisuals = updateVisuals(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 315 */                       parcel2.writeNoException();
/* 318 */                       parcel2.writeInt(zUpdateVisuals ? 1 : 0);
/* 3 */                         return true;
                            case 7:
/* 283 */                       boolean zRequestPostMessageChannel = requestPostMessageChannel(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Uri) _Parcel.readTypedObject(parcel, Uri.CREATOR));
/* 287 */                       parcel2.writeNoException();
/* 290 */                       parcel2.writeInt(zRequestPostMessageChannel ? 1 : 0);
/* 3 */                         return true;
                            case 8:
/* 255 */                       int iPostMessage = postMessage(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 259 */                       parcel2.writeNoException();
/* 262 */                       parcel2.writeInt(iPostMessage);
/* 3 */                         return true;
                            case 9:
/* 223 */                       boolean zValidateRelationship = validateRelationship(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Uri) _Parcel.readTypedObject(parcel, Uri.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 227 */                       parcel2.writeNoException();
/* 230 */                       parcel2.writeInt(zValidateRelationship ? 1 : 0);
/* 3 */                         return true;
                            case 10:
/* 183 */                       boolean zNewSessionWithExtras = newSessionWithExtras(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 187 */                       parcel2.writeNoException();
/* 190 */                       parcel2.writeInt(zNewSessionWithExtras ? 1 : 0);
/* 3 */                         return true;
                            case 11:
/* 155 */                       boolean zRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Uri) _Parcel.readTypedObject(parcel, Uri.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 159 */                       parcel2.writeNoException();
/* 162 */                       parcel2.writeInt(zRequestPostMessageChannelWithExtras ? 1 : 0);
/* 3 */                         return true;
                            case TRANSACTION_receiveFile /* 12 */:
/* 119 */                       boolean zReceiveFile = receiveFile(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Uri) _Parcel.readTypedObject(parcel, Uri.CREATOR), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 123 */                       parcel2.writeNoException();
/* 126 */                       parcel2.writeInt(zReceiveFile ? 1 : 0);
/* 3 */                         return true;
                            case 13:
/* 79 */                        boolean zIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 83 */                        parcel2.writeNoException();
/* 86 */                        parcel2.writeInt(zIsEngagementSignalsApiAvailable ? 1 : 0);
/* 3 */                         return true;
                            case TRANSACTION_setEngagementSignalsCallback /* 14 */:
/* 51 */                        boolean engagementSignalsCallback = setEngagementSignalsCallback(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
/* 55 */                        parcel2.writeNoException();
/* 58 */                        parcel2.writeInt(engagementSignalsCallback ? 1 : 0);
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
                    public static <T extends Parcelable> void writeTypedList(Parcel parcel, List<T> list, int i) {
/* 1 */                 if (list == null) {
/* 4 */                     parcel.writeInt(-1);
/* 7 */                     return;
                        }
/* 8 */                 int size = list.size();
/* 12 */                parcel.writeInt(size);
/* 16 */                for (int i2 = 0; i2 < size; i2++) {
/* 24 */                    writeTypedObject(parcel, list.get(i2), i);
                        }
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

                Bundle extraCommand(String str, Bundle bundle) throws RemoteException;

                boolean isEngagementSignalsApiAvailable(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException;

                boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

                boolean newSession(ICustomTabsCallback iCustomTabsCallback) throws RemoteException;

                boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException;

                int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException;

                boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i, Bundle bundle) throws RemoteException;

                boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) throws RemoteException;

                boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) throws RemoteException;

                boolean setEngagementSignalsCallback(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) throws RemoteException;

                boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException;

                boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) throws RemoteException;

                boolean warmup(long j) throws RemoteException;
            }
