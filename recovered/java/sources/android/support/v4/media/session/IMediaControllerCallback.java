            package android.support.v4.media.session;

            import android.os.Binder;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.support.v4.media.MediaMetadataCompat;
            import android.text.TextUtils;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface IMediaControllerCallback extends IInterface {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Stub extends Binder implements IMediaControllerCallback {
                    private static final String DESCRIPTOR = "android.support.v4.media.session.IMediaControllerCallback";
                    static final int TRANSACTION_onCaptioningEnabledChanged = 11;
                    static final int TRANSACTION_onEvent = 1;
                    static final int TRANSACTION_onExtrasChanged = 7;
                    static final int TRANSACTION_onMetadataChanged = 4;
                    static final int TRANSACTION_onPlaybackStateChanged = 3;
                    static final int TRANSACTION_onQueueChanged = 5;
                    static final int TRANSACTION_onQueueTitleChanged = 6;
                    static final int TRANSACTION_onRepeatModeChanged = 9;
                    static final int TRANSACTION_onSessionDestroyed = 2;
                    static final int TRANSACTION_onSessionReady = 13;
                    static final int TRANSACTION_onShuffleModeChanged = 12;
                    static final int TRANSACTION_onShuffleModeChangedRemoved = 10;
                    static final int TRANSACTION_onVolumeInfoChanged = 8;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static class Proxy implements IMediaControllerCallback {
                        private IBinder mRemote;

                        public Proxy(IBinder iBinder) {
/* 4 */                     this.mRemote = iBinder;
                        }

                        @Override // android.os.IInterface
                        public IBinder asBinder() {
/* 1 */                     return this.mRemote;
                        }

                        public String getInterfaceDescriptor() {
/* 1 */                     return Stub.DESCRIPTOR;
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onCaptioningEnabledChanged(boolean z) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 10 */                        parcelObtain.writeInt(z ? 1 : 0);
/* 19 */                        this.mRemote.transact(11, parcelObtain, null, 1);
                            } finally {
/* 27 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onEvent(String str, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 10 */                        parcelObtain.writeString(str);
/* 15 */                        if (bundle != null) {
/* 17 */                            parcelObtain.writeInt(1);
/* 20 */                            bundle.writeToParcel(parcelObtain, 0);
                                } else {
/* 26 */                            parcelObtain.writeInt(0);
                                }
/* 32 */                        this.mRemote.transact(1, parcelObtain, null, 1);
                            } finally {
/* 39 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onExtrasChanged(Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 12 */                        if (bundle != null) {
/* 14 */                            parcelObtain.writeInt(1);
/* 17 */                            bundle.writeToParcel(parcelObtain, 0);
                                } else {
/* 23 */                            parcelObtain.writeInt(0);
                                }
/* 30 */                        this.mRemote.transact(7, parcelObtain, null, 1);
                            } finally {
/* 37 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 12 */                        if (mediaMetadataCompat != null) {
/* 14 */                            parcelObtain.writeInt(1);
/* 17 */                            mediaMetadataCompat.writeToParcel(parcelObtain, 0);
                                } else {
/* 23 */                            parcelObtain.writeInt(0);
                                }
/* 30 */                        this.mRemote.transact(4, parcelObtain, null, 1);
                            } finally {
/* 37 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 12 */                        if (playbackStateCompat != null) {
/* 14 */                            parcelObtain.writeInt(1);
/* 17 */                            playbackStateCompat.writeToParcel(parcelObtain, 0);
                                } else {
/* 23 */                            parcelObtain.writeInt(0);
                                }
/* 30 */                        this.mRemote.transact(3, parcelObtain, null, 1);
                            } finally {
/* 37 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 10 */                        parcelObtain.writeTypedList(list);
/* 18 */                        this.mRemote.transact(5, parcelObtain, null, 1);
                            } finally {
/* 26 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 12 */                        if (charSequence != null) {
/* 14 */                            parcelObtain.writeInt(1);
/* 17 */                            TextUtils.writeToParcel(charSequence, parcelObtain, 0);
                                } else {
/* 23 */                            parcelObtain.writeInt(0);
                                }
/* 30 */                        this.mRemote.transact(6, parcelObtain, null, 1);
                            } finally {
/* 37 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onRepeatModeChanged(int i) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 10 */                        parcelObtain.writeInt(i);
/* 19 */                        this.mRemote.transact(9, parcelObtain, null, 1);
                            } finally {
/* 27 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onSessionDestroyed() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 15 */                        this.mRemote.transact(2, parcelObtain, null, 1);
                            } finally {
/* 23 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onSessionReady() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 16 */                        this.mRemote.transact(13, parcelObtain, null, 1);
                            } finally {
/* 24 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onShuffleModeChanged(int i) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 10 */                        parcelObtain.writeInt(i);
/* 19 */                        this.mRemote.transact(Stub.TRANSACTION_onShuffleModeChanged, parcelObtain, null, 1);
                            } finally {
/* 27 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onShuffleModeChangedRemoved(boolean z) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 10 */                        parcelObtain.writeInt(z ? 1 : 0);
/* 19 */                        this.mRemote.transact(10, parcelObtain, null, 1);
                            } finally {
/* 27 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
                            try {
/* 7 */                         parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 12 */                        if (parcelableVolumeInfo != null) {
/* 14 */                            parcelObtain.writeInt(1);
/* 17 */                            parcelableVolumeInfo.writeToParcel(parcelObtain, 0);
                                } else {
/* 23 */                            parcelObtain.writeInt(0);
                                }
/* 31 */                        this.mRemote.transact(8, parcelObtain, null, 1);
                            } finally {
/* 38 */                        parcelObtain.recycle();
                            }
                        }
                    }

                    public Stub() {
/* 6 */                 attachInterface(this, DESCRIPTOR);
                    }

                    public static IMediaControllerCallback asInterface(IBinder iBinder) {
/* 1 */                 if (iBinder == null) {
/* 3 */                     return null;
                        }
/* 7 */                 IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
                        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMediaControllerCallback)) ? new Proxy(iBinder) : (IMediaControllerCallback) iInterfaceQueryLocalInterface;
                    }

                    @Override // android.os.IInterface
                    public IBinder asBinder() {
/* 1 */                 return this;
                    }

                    @Override // android.os.Binder
                    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 7 */                 if (i == 1598968902) {
/* 232 */                   parcel2.writeString(DESCRIPTOR);
/* 6 */                     return true;
                        }
                        switch (i) {
                            case 1:
/* 206 */                       parcel.enforceInterface(DESCRIPTOR);
/* 228 */                       onEvent(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
/* 6 */                         return true;
                            case 2:
/* 199 */                       parcel.enforceInterface(DESCRIPTOR);
/* 202 */                       onSessionDestroyed();
/* 6 */                         return true;
                            case 3:
/* 177 */                       parcel.enforceInterface(DESCRIPTOR);
/* 195 */                       onPlaybackStateChanged(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
/* 6 */                         return true;
                            case 4:
/* 155 */                       parcel.enforceInterface(DESCRIPTOR);
/* 173 */                       onMetadataChanged(parcel.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcel) : null);
/* 6 */                         return true;
                            case 5:
/* 142 */                       parcel.enforceInterface(DESCRIPTOR);
/* 151 */                       onQueueChanged(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
/* 6 */                         return true;
                            case 6:
/* 120 */                       parcel.enforceInterface(DESCRIPTOR);
/* 138 */                       onQueueTitleChanged(parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
/* 6 */                         return true;
                            case 7:
/* 98 */                        parcel.enforceInterface(DESCRIPTOR);
/* 116 */                       onExtrasChanged(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
/* 6 */                         return true;
                            case 8:
/* 76 */                        parcel.enforceInterface(DESCRIPTOR);
/* 94 */                        onVolumeInfoChanged(parcel.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(parcel) : null);
/* 6 */                         return true;
                            case 9:
/* 65 */                        parcel.enforceInterface(DESCRIPTOR);
/* 72 */                        onRepeatModeChanged(parcel.readInt());
/* 6 */                         return true;
                            case 10:
/* 51 */                        parcel.enforceInterface(DESCRIPTOR);
/* 61 */                        onShuffleModeChangedRemoved(parcel.readInt() != 0);
/* 6 */                         return true;
                            case 11:
/* 37 */                        parcel.enforceInterface(DESCRIPTOR);
/* 47 */                        onCaptioningEnabledChanged(parcel.readInt() != 0);
/* 6 */                         return true;
                            case TRANSACTION_onShuffleModeChanged /* 12 */:
/* 26 */                        parcel.enforceInterface(DESCRIPTOR);
/* 33 */                        onShuffleModeChanged(parcel.readInt());
/* 6 */                         return true;
                            case 13:
/* 19 */                        parcel.enforceInterface(DESCRIPTOR);
/* 22 */                        onSessionReady();
/* 6 */                         return true;
                            default:
/* 14 */                        return super.onTransact(i, parcel, parcel2, i2);
                        }
                    }
                }

                void onCaptioningEnabledChanged(boolean z) throws RemoteException;

                void onEvent(String str, Bundle bundle) throws RemoteException;

                void onExtrasChanged(Bundle bundle) throws RemoteException;

                void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

                void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) throws RemoteException;

                void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException;

                void onQueueTitleChanged(CharSequence charSequence) throws RemoteException;

                void onRepeatModeChanged(int i) throws RemoteException;

                void onSessionDestroyed() throws RemoteException;

                void onSessionReady() throws RemoteException;

                void onShuffleModeChanged(int i) throws RemoteException;

                void onShuffleModeChangedRemoved(boolean z) throws RemoteException;

                void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;
            }
