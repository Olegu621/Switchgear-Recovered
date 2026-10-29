            package android.support.v4.media.session;

            import android.app.PendingIntent;
            import android.net.Uri;
            import android.os.Binder;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.support.v4.media.MediaDescriptionCompat;
            import android.support.v4.media.MediaMetadataCompat;
            import android.support.v4.media.RatingCompat;
            import android.text.TextUtils;
            import android.view.KeyEvent;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface IMediaSession extends IInterface {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Stub extends Binder implements IMediaSession {
                    private static final String DESCRIPTOR = "android.support.v4.media.session.IMediaSession";
                    static final int TRANSACTION_addQueueItem = 41;
                    static final int TRANSACTION_addQueueItemAt = 42;
                    static final int TRANSACTION_adjustVolume = 11;
                    static final int TRANSACTION_fastForward = 22;
                    static final int TRANSACTION_getExtras = 31;
                    static final int TRANSACTION_getFlags = 9;
                    static final int TRANSACTION_getLaunchPendingIntent = 8;
                    static final int TRANSACTION_getMetadata = 27;
                    static final int TRANSACTION_getPackageName = 6;
                    static final int TRANSACTION_getPlaybackState = 28;
                    static final int TRANSACTION_getQueue = 29;
                    static final int TRANSACTION_getQueueTitle = 30;
                    static final int TRANSACTION_getRatingType = 32;
                    static final int TRANSACTION_getRepeatMode = 37;
                    static final int TRANSACTION_getShuffleMode = 47;
                    static final int TRANSACTION_getTag = 7;
                    static final int TRANSACTION_getVolumeAttributes = 10;
                    static final int TRANSACTION_isCaptioningEnabled = 45;
                    static final int TRANSACTION_isShuffleModeEnabledRemoved = 38;
                    static final int TRANSACTION_isTransportControlEnabled = 5;
                    static final int TRANSACTION_next = 20;
                    static final int TRANSACTION_pause = 18;
                    static final int TRANSACTION_play = 13;
                    static final int TRANSACTION_playFromMediaId = 14;
                    static final int TRANSACTION_playFromSearch = 15;
                    static final int TRANSACTION_playFromUri = 16;
                    static final int TRANSACTION_prepare = 33;
                    static final int TRANSACTION_prepareFromMediaId = 34;
                    static final int TRANSACTION_prepareFromSearch = 35;
                    static final int TRANSACTION_prepareFromUri = 36;
                    static final int TRANSACTION_previous = 21;
                    static final int TRANSACTION_rate = 25;
                    static final int TRANSACTION_rateWithExtras = 51;
                    static final int TRANSACTION_registerCallbackListener = 3;
                    static final int TRANSACTION_removeQueueItem = 43;
                    static final int TRANSACTION_removeQueueItemAt = 44;
                    static final int TRANSACTION_rewind = 23;
                    static final int TRANSACTION_seekTo = 24;
                    static final int TRANSACTION_sendCommand = 1;
                    static final int TRANSACTION_sendCustomAction = 26;
                    static final int TRANSACTION_sendMediaButton = 2;
                    static final int TRANSACTION_setCaptioningEnabled = 46;
                    static final int TRANSACTION_setRepeatMode = 39;
                    static final int TRANSACTION_setShuffleMode = 48;
                    static final int TRANSACTION_setShuffleModeEnabledRemoved = 40;
                    static final int TRANSACTION_setVolumeTo = 12;
                    static final int TRANSACTION_skipToQueueItem = 17;
                    static final int TRANSACTION_stop = 19;
                    static final int TRANSACTION_unregisterCallbackListener = 4;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static class Proxy implements IMediaSession {
                        private IBinder mRemote;

                        public Proxy(IBinder iBinder) {
/* 4 */                     this.mRemote = iBinder;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 15 */                        if (mediaDescriptionCompat != null) {
/* 18 */                            parcelObtain.writeInt(1);
/* 21 */                            mediaDescriptionCompat.writeToParcel(parcelObtain, 0);
                                } else {
/* 27 */                            parcelObtain.writeInt(0);
                                }
/* 34 */                        this.mRemote.transact(41, parcelObtain, parcelObtain2, 0);
/* 37 */                        parcelObtain2.readException();
                            } finally {
/* 47 */                        parcelObtain2.recycle();
/* 50 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 15 */                        if (mediaDescriptionCompat != null) {
/* 18 */                            parcelObtain.writeInt(1);
/* 21 */                            mediaDescriptionCompat.writeToParcel(parcelObtain, 0);
                                } else {
/* 27 */                            parcelObtain.writeInt(0);
                                }
/* 30 */                        parcelObtain.writeInt(i);
/* 37 */                        this.mRemote.transact(Stub.TRANSACTION_addQueueItemAt, parcelObtain, parcelObtain2, 0);
/* 40 */                        parcelObtain2.readException();
                            } finally {
/* 50 */                        parcelObtain2.recycle();
/* 53 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void adjustVolume(int i, int i2, String str) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 14 */                        parcelObtain.writeInt(i);
/* 17 */                        parcelObtain.writeInt(i2);
/* 20 */                        parcelObtain.writeString(str);
/* 28 */                        this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
/* 31 */                        parcelObtain2.readException();
                            } finally {
/* 42 */                        parcelObtain2.recycle();
/* 45 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.os.IInterface
                        public IBinder asBinder() {
/* 1 */                     return this.mRemote;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void fastForward() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 19 */                        this.mRemote.transact(22, parcelObtain, parcelObtain2, 0);
/* 22 */                        parcelObtain2.readException();
                            } finally {
/* 33 */                        parcelObtain2.recycle();
/* 36 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public Bundle getExtras() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 19 */                        this.mRemote.transact(31, parcelObtain, parcelObtain2, 0);
/* 22 */                        parcelObtain2.readException();
/* 42 */                        return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                            } finally {
/* 50 */                        parcelObtain2.recycle();
/* 53 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public long getFlags() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 19 */                        this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
/* 22 */                        parcelObtain2.readException();
/* 25 */                        return parcelObtain2.readLong();
                            } finally {
/* 37 */                        parcelObtain2.recycle();
/* 40 */                        parcelObtain.recycle();
                            }
                        }

                        public String getInterfaceDescriptor() {
/* 1 */                     return Stub.DESCRIPTOR;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public PendingIntent getLaunchPendingIntent() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 19 */                        this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
/* 22 */                        parcelObtain2.readException();
/* 42 */                        return parcelObtain2.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcelObtain2) : null;
                            } finally {
/* 50 */                        parcelObtain2.recycle();
/* 53 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public MediaMetadataCompat getMetadata() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 19 */                        this.mRemote.transact(27, parcelObtain, parcelObtain2, 0);
/* 22 */                        parcelObtain2.readException();
/* 42 */                        return parcelObtain2.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain2) : null;
                            } finally {
/* 50 */                        parcelObtain2.recycle();
/* 53 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public String getPackageName() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 18 */                        this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
/* 21 */                        parcelObtain2.readException();
/* 24 */                        return parcelObtain2.readString();
                            } finally {
/* 36 */                        parcelObtain2.recycle();
/* 39 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public PlaybackStateCompat getPlaybackState() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 19 */                        this.mRemote.transact(28, parcelObtain, parcelObtain2, 0);
/* 22 */                        parcelObtain2.readException();
/* 42 */                        return parcelObtain2.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcelObtain2) : null;
                            } finally {
/* 50 */                        parcelObtain2.recycle();
/* 53 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public List<MediaSessionCompat.QueueItem> getQueue() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 19 */                        this.mRemote.transact(29, parcelObtain, parcelObtain2, 0);
/* 22 */                        parcelObtain2.readException();
/* 27 */                        return parcelObtain2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                            } finally {
/* 39 */                        parcelObtain2.recycle();
/* 42 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public CharSequence getQueueTitle() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 19 */                        this.mRemote.transact(30, parcelObtain, parcelObtain2, 0);
/* 22 */                        parcelObtain2.readException();
/* 42 */                        return parcelObtain2.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcelObtain2) : null;
                            } finally {
/* 50 */                        parcelObtain2.recycle();
/* 53 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public int getRatingType() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 19 */                        this.mRemote.transact(32, parcelObtain, parcelObtain2, 0);
/* 22 */                        parcelObtain2.readException();
/* 25 */                        return parcelObtain2.readInt();
                            } finally {
/* 37 */                        parcelObtain2.recycle();
/* 40 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public int getRepeatMode() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 19 */                        this.mRemote.transact(Stub.TRANSACTION_getRepeatMode, parcelObtain, parcelObtain2, 0);
/* 22 */                        parcelObtain2.readException();
/* 25 */                        return parcelObtain2.readInt();
                            } finally {
/* 37 */                        parcelObtain2.recycle();
/* 40 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public int getShuffleMode() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 19 */                        this.mRemote.transact(Stub.TRANSACTION_getShuffleMode, parcelObtain, parcelObtain2, 0);
/* 22 */                        parcelObtain2.readException();
/* 25 */                        return parcelObtain2.readInt();
                            } finally {
/* 37 */                        parcelObtain2.recycle();
/* 40 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public String getTag() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 18 */                        this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
/* 21 */                        parcelObtain2.readException();
/* 24 */                        return parcelObtain2.readString();
                            } finally {
/* 36 */                        parcelObtain2.recycle();
/* 39 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public ParcelableVolumeInfo getVolumeAttributes() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 19 */                        this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
/* 22 */                        parcelObtain2.readException();
/* 42 */                        return parcelObtain2.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                            } finally {
/* 50 */                        parcelObtain2.recycle();
/* 53 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public boolean isCaptioningEnabled() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 19 */                        this.mRemote.transact(Stub.TRANSACTION_isCaptioningEnabled, parcelObtain, parcelObtain2, 0);
/* 22 */                        parcelObtain2.readException();
/* 29 */                        return parcelObtain2.readInt() != 0;
                            } finally {
/* 40 */                        parcelObtain2.recycle();
/* 43 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public boolean isShuffleModeEnabledRemoved() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 19 */                        this.mRemote.transact(Stub.TRANSACTION_isShuffleModeEnabledRemoved, parcelObtain, parcelObtain2, 0);
/* 22 */                        parcelObtain2.readException();
/* 29 */                        return parcelObtain2.readInt() != 0;
                            } finally {
/* 40 */                        parcelObtain2.recycle();
/* 43 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public boolean isTransportControlEnabled() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 18 */                        this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
/* 21 */                        parcelObtain2.readException();
/* 28 */                        return parcelObtain2.readInt() != 0;
                            } finally {
/* 39 */                        parcelObtain2.recycle();
/* 42 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void next() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 19 */                        this.mRemote.transact(Stub.TRANSACTION_next, parcelObtain, parcelObtain2, 0);
/* 22 */                        parcelObtain2.readException();
                            } finally {
/* 33 */                        parcelObtain2.recycle();
/* 36 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void pause() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 19 */                        this.mRemote.transact(Stub.TRANSACTION_pause, parcelObtain, parcelObtain2, 0);
/* 22 */                        parcelObtain2.readException();
                            } finally {
/* 33 */                        parcelObtain2.recycle();
/* 36 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void play() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 19 */                        this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
/* 22 */                        parcelObtain2.readException();
                            } finally {
/* 33 */                        parcelObtain2.recycle();
/* 36 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void playFromMediaId(String str, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 14 */                        parcelObtain.writeString(str);
/* 18 */                        if (bundle != null) {
/* 21 */                            parcelObtain.writeInt(1);
/* 24 */                            bundle.writeToParcel(parcelObtain, 0);
                                } else {
/* 30 */                            parcelObtain.writeInt(0);
                                }
/* 37 */                        this.mRemote.transact(Stub.TRANSACTION_playFromMediaId, parcelObtain, parcelObtain2, 0);
/* 40 */                        parcelObtain2.readException();
                            } finally {
/* 50 */                        parcelObtain2.recycle();
/* 53 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void playFromSearch(String str, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 14 */                        parcelObtain.writeString(str);
/* 18 */                        if (bundle != null) {
/* 21 */                            parcelObtain.writeInt(1);
/* 24 */                            bundle.writeToParcel(parcelObtain, 0);
                                } else {
/* 30 */                            parcelObtain.writeInt(0);
                                }
/* 37 */                        this.mRemote.transact(15, parcelObtain, parcelObtain2, 0);
/* 40 */                        parcelObtain2.readException();
                            } finally {
/* 50 */                        parcelObtain2.recycle();
/* 53 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void playFromUri(Uri uri, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 16 */                        if (uri != null) {
/* 18 */                            parcelObtain.writeInt(1);
/* 21 */                            uri.writeToParcel(parcelObtain, 0);
                                } else {
/* 27 */                            parcelObtain.writeInt(0);
                                }
/* 30 */                        if (bundle != null) {
/* 32 */                            parcelObtain.writeInt(1);
/* 35 */                            bundle.writeToParcel(parcelObtain, 0);
                                } else {
/* 39 */                            parcelObtain.writeInt(0);
                                }
/* 46 */                        this.mRemote.transact(16, parcelObtain, parcelObtain2, 0);
/* 49 */                        parcelObtain2.readException();
                            } finally {
/* 59 */                        parcelObtain2.recycle();
/* 62 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void prepare() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 19 */                        this.mRemote.transact(33, parcelObtain, parcelObtain2, 0);
/* 22 */                        parcelObtain2.readException();
                            } finally {
/* 33 */                        parcelObtain2.recycle();
/* 36 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void prepareFromMediaId(String str, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 14 */                        parcelObtain.writeString(str);
/* 18 */                        if (bundle != null) {
/* 21 */                            parcelObtain.writeInt(1);
/* 24 */                            bundle.writeToParcel(parcelObtain, 0);
                                } else {
/* 30 */                            parcelObtain.writeInt(0);
                                }
/* 37 */                        this.mRemote.transact(34, parcelObtain, parcelObtain2, 0);
/* 40 */                        parcelObtain2.readException();
                            } finally {
/* 50 */                        parcelObtain2.recycle();
/* 53 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void prepareFromSearch(String str, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 14 */                        parcelObtain.writeString(str);
/* 18 */                        if (bundle != null) {
/* 21 */                            parcelObtain.writeInt(1);
/* 24 */                            bundle.writeToParcel(parcelObtain, 0);
                                } else {
/* 30 */                            parcelObtain.writeInt(0);
                                }
/* 37 */                        this.mRemote.transact(35, parcelObtain, parcelObtain2, 0);
/* 40 */                        parcelObtain2.readException();
                            } finally {
/* 50 */                        parcelObtain2.recycle();
/* 53 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void prepareFromUri(Uri uri, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 16 */                        if (uri != null) {
/* 18 */                            parcelObtain.writeInt(1);
/* 21 */                            uri.writeToParcel(parcelObtain, 0);
                                } else {
/* 27 */                            parcelObtain.writeInt(0);
                                }
/* 30 */                        if (bundle != null) {
/* 32 */                            parcelObtain.writeInt(1);
/* 35 */                            bundle.writeToParcel(parcelObtain, 0);
                                } else {
/* 39 */                            parcelObtain.writeInt(0);
                                }
/* 46 */                        this.mRemote.transact(36, parcelObtain, parcelObtain2, 0);
/* 49 */                        parcelObtain2.readException();
                            } finally {
/* 59 */                        parcelObtain2.recycle();
/* 62 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void previous() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 19 */                        this.mRemote.transact(21, parcelObtain, parcelObtain2, 0);
/* 22 */                        parcelObtain2.readException();
                            } finally {
/* 33 */                        parcelObtain2.recycle();
/* 36 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void rate(RatingCompat ratingCompat) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 15 */                        if (ratingCompat != null) {
/* 18 */                            parcelObtain.writeInt(1);
/* 21 */                            ratingCompat.writeToParcel(parcelObtain, 0);
                                } else {
/* 27 */                            parcelObtain.writeInt(0);
                                }
/* 34 */                        this.mRemote.transact(25, parcelObtain, parcelObtain2, 0);
/* 37 */                        parcelObtain2.readException();
                            } finally {
/* 47 */                        parcelObtain2.recycle();
/* 50 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 16 */                        if (ratingCompat != null) {
/* 18 */                            parcelObtain.writeInt(1);
/* 21 */                            ratingCompat.writeToParcel(parcelObtain, 0);
                                } else {
/* 27 */                            parcelObtain.writeInt(0);
                                }
/* 30 */                        if (bundle != null) {
/* 32 */                            parcelObtain.writeInt(1);
/* 35 */                            bundle.writeToParcel(parcelObtain, 0);
                                } else {
/* 39 */                            parcelObtain.writeInt(0);
                                }
/* 46 */                        this.mRemote.transact(Stub.TRANSACTION_rateWithExtras, parcelObtain, parcelObtain2, 0);
/* 49 */                        parcelObtain2.readException();
                            } finally {
/* 59 */                        parcelObtain2.recycle();
/* 62 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 24 */                        parcelObtain.writeStrongBinder(iMediaControllerCallback != null ? iMediaControllerCallback.asBinder() : null);
/* 31 */                        this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
/* 34 */                        parcelObtain2.readException();
                            } finally {
/* 44 */                        parcelObtain2.recycle();
/* 47 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 15 */                        if (mediaDescriptionCompat != null) {
/* 18 */                            parcelObtain.writeInt(1);
/* 21 */                            mediaDescriptionCompat.writeToParcel(parcelObtain, 0);
                                } else {
/* 27 */                            parcelObtain.writeInt(0);
                                }
/* 34 */                        this.mRemote.transact(Stub.TRANSACTION_removeQueueItem, parcelObtain, parcelObtain2, 0);
/* 37 */                        parcelObtain2.readException();
                            } finally {
/* 47 */                        parcelObtain2.recycle();
/* 50 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void removeQueueItemAt(int i) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 14 */                        parcelObtain.writeInt(i);
/* 22 */                        this.mRemote.transact(Stub.TRANSACTION_removeQueueItemAt, parcelObtain, parcelObtain2, 0);
/* 25 */                        parcelObtain2.readException();
                            } finally {
/* 36 */                        parcelObtain2.recycle();
/* 39 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void rewind() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 19 */                        this.mRemote.transact(23, parcelObtain, parcelObtain2, 0);
/* 22 */                        parcelObtain2.readException();
                            } finally {
/* 33 */                        parcelObtain2.recycle();
/* 36 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void seekTo(long j) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 14 */                        parcelObtain.writeLong(j);
/* 22 */                        this.mRemote.transact(24, parcelObtain, parcelObtain2, 0);
/* 25 */                        parcelObtain2.readException();
                            } finally {
/* 36 */                        parcelObtain2.recycle();
/* 39 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void sendCommand(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 14 */                        parcelObtain.writeString(str);
/* 19 */                        if (bundle != null) {
/* 21 */                            parcelObtain.writeInt(1);
/* 24 */                            bundle.writeToParcel(parcelObtain, 0);
                                } else {
/* 30 */                            parcelObtain.writeInt(0);
                                }
/* 33 */                        if (resultReceiverWrapper != null) {
/* 35 */                            parcelObtain.writeInt(1);
/* 38 */                            resultReceiverWrapper.writeToParcel(parcelObtain, 0);
                                } else {
/* 42 */                            parcelObtain.writeInt(0);
                                }
/* 47 */                        this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
/* 50 */                        parcelObtain2.readException();
                            } finally {
/* 60 */                        parcelObtain2.recycle();
/* 63 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void sendCustomAction(String str, Bundle bundle) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 14 */                        parcelObtain.writeString(str);
/* 18 */                        if (bundle != null) {
/* 21 */                            parcelObtain.writeInt(1);
/* 24 */                            bundle.writeToParcel(parcelObtain, 0);
                                } else {
/* 30 */                            parcelObtain.writeInt(0);
                                }
/* 37 */                        this.mRemote.transact(26, parcelObtain, parcelObtain2, 0);
/* 40 */                        parcelObtain2.readException();
                            } finally {
/* 50 */                        parcelObtain2.recycle();
/* 53 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public boolean sendMediaButton(KeyEvent keyEvent) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 16 */                        if (keyEvent != null) {
/* 18 */                            parcelObtain.writeInt(1);
/* 21 */                            keyEvent.writeToParcel(parcelObtain, 0);
                                } else {
/* 27 */                            parcelObtain.writeInt(0);
                                }
/* 33 */                        this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
/* 36 */                        parcelObtain2.readException();
/* 43 */                        return parcelObtain2.readInt() != 0;
                            } finally {
/* 54 */                        parcelObtain2.recycle();
/* 57 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void setCaptioningEnabled(boolean z) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 14 */                        parcelObtain.writeInt(z ? 1 : 0);
/* 22 */                        this.mRemote.transact(Stub.TRANSACTION_setCaptioningEnabled, parcelObtain, parcelObtain2, 0);
/* 25 */                        parcelObtain2.readException();
                            } finally {
/* 36 */                        parcelObtain2.recycle();
/* 39 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void setRepeatMode(int i) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 14 */                        parcelObtain.writeInt(i);
/* 22 */                        this.mRemote.transact(Stub.TRANSACTION_setRepeatMode, parcelObtain, parcelObtain2, 0);
/* 25 */                        parcelObtain2.readException();
                            } finally {
/* 36 */                        parcelObtain2.recycle();
/* 39 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void setShuffleMode(int i) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 14 */                        parcelObtain.writeInt(i);
/* 22 */                        this.mRemote.transact(Stub.TRANSACTION_setShuffleMode, parcelObtain, parcelObtain2, 0);
/* 25 */                        parcelObtain2.readException();
                            } finally {
/* 36 */                        parcelObtain2.recycle();
/* 39 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void setShuffleModeEnabledRemoved(boolean z) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 14 */                        parcelObtain.writeInt(z ? 1 : 0);
/* 22 */                        this.mRemote.transact(40, parcelObtain, parcelObtain2, 0);
/* 25 */                        parcelObtain2.readException();
                            } finally {
/* 36 */                        parcelObtain2.recycle();
/* 39 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void setVolumeTo(int i, int i2, String str) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 14 */                        parcelObtain.writeInt(i);
/* 17 */                        parcelObtain.writeInt(i2);
/* 20 */                        parcelObtain.writeString(str);
/* 28 */                        this.mRemote.transact(Stub.TRANSACTION_setVolumeTo, parcelObtain, parcelObtain2, 0);
/* 31 */                        parcelObtain2.readException();
                            } finally {
/* 42 */                        parcelObtain2.recycle();
/* 45 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void skipToQueueItem(long j) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 14 */                        parcelObtain.writeLong(j);
/* 22 */                        this.mRemote.transact(Stub.TRANSACTION_skipToQueueItem, parcelObtain, parcelObtain2, 0);
/* 25 */                        parcelObtain2.readException();
                            } finally {
/* 36 */                        parcelObtain2.recycle();
/* 39 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void stop() throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 19 */                        this.mRemote.transact(Stub.TRANSACTION_stop, parcelObtain, parcelObtain2, 0);
/* 22 */                        parcelObtain2.readException();
                            } finally {
/* 33 */                        parcelObtain2.recycle();
/* 36 */                        parcelObtain.recycle();
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) throws RemoteException {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 5 */                     Parcel parcelObtain2 = Parcel.obtain();
                            try {
/* 11 */                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
/* 24 */                        parcelObtain.writeStrongBinder(iMediaControllerCallback != null ? iMediaControllerCallback.asBinder() : null);
/* 31 */                        this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
/* 34 */                        parcelObtain2.readException();
                            } finally {
/* 44 */                        parcelObtain2.recycle();
/* 47 */                        parcelObtain.recycle();
                            }
                        }
                    }

                    public Stub() {
/* 6 */                 attachInterface(this, DESCRIPTOR);
                    }

                    public static IMediaSession asInterface(IBinder iBinder) {
/* 1 */                 if (iBinder == null) {
/* 3 */                     return null;
                        }
/* 7 */                 IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
                        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMediaSession)) ? new Proxy(iBinder) : (IMediaSession) iInterfaceQueryLocalInterface;
                    }

                    @Override // android.os.IInterface
                    public IBinder asBinder() {
/* 1 */                 return this;
                    }

                    @Override // android.os.Binder
                    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 7 */                 if (i == TRANSACTION_rateWithExtras) {
/* 974 */                   parcel.enforceInterface(DESCRIPTOR);
/* 1008 */                  rateWithExtras(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
/* 1011 */                  parcel2.writeNoException();
/* 6 */                     return true;
                        }
/* 12 */                if (i == 1598968902) {
/* 970 */                   parcel2.writeString(DESCRIPTOR);
/* 6 */                     return true;
                        }
                        switch (i) {
                            case 1:
/* 925 */                       parcel.enforceInterface(DESCRIPTOR);
/* 963 */                       sendCommand(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel) : null);
/* 966 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case 2:
/* 896 */                       parcel.enforceInterface(DESCRIPTOR);
/* 914 */                       boolean zSendMediaButton = sendMediaButton(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
/* 918 */                       parcel2.writeNoException();
/* 921 */                       parcel2.writeInt(zSendMediaButton ? 1 : 0);
/* 6 */                         return true;
                            case 3:
/* 878 */                       parcel.enforceInterface(DESCRIPTOR);
/* 889 */                       registerCallbackListener(IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
/* 892 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case 4:
/* 860 */                       parcel.enforceInterface(DESCRIPTOR);
/* 871 */                       unregisterCallbackListener(IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
/* 874 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case 5:
/* 846 */                       parcel.enforceInterface(DESCRIPTOR);
/* 849 */                       boolean zIsTransportControlEnabled = isTransportControlEnabled();
/* 853 */                       parcel2.writeNoException();
/* 856 */                       parcel2.writeInt(zIsTransportControlEnabled ? 1 : 0);
/* 6 */                         return true;
                            case 6:
/* 832 */                       parcel.enforceInterface(DESCRIPTOR);
/* 835 */                       String packageName = getPackageName();
/* 839 */                       parcel2.writeNoException();
/* 842 */                       parcel2.writeString(packageName);
/* 6 */                         return true;
                            case 7:
/* 818 */                       parcel.enforceInterface(DESCRIPTOR);
/* 821 */                       String tag = getTag();
/* 825 */                       parcel2.writeNoException();
/* 828 */                       parcel2.writeString(tag);
/* 6 */                         return true;
                            case 8:
/* 795 */                       parcel.enforceInterface(DESCRIPTOR);
/* 798 */                       PendingIntent launchPendingIntent = getLaunchPendingIntent();
/* 802 */                       parcel2.writeNoException();
/* 805 */                       if (launchPendingIntent != null) {
/* 807 */                           parcel2.writeInt(1);
/* 810 */                           launchPendingIntent.writeToParcel(parcel2, 1);
                                } else {
/* 814 */                           parcel2.writeInt(0);
                                }
/* 6 */                         return true;
                            case 9:
/* 781 */                       parcel.enforceInterface(DESCRIPTOR);
/* 784 */                       long flags = getFlags();
/* 788 */                       parcel2.writeNoException();
/* 791 */                       parcel2.writeLong(flags);
/* 6 */                         return true;
                            case 10:
/* 758 */                       parcel.enforceInterface(DESCRIPTOR);
/* 761 */                       ParcelableVolumeInfo volumeAttributes = getVolumeAttributes();
/* 765 */                       parcel2.writeNoException();
/* 768 */                       if (volumeAttributes != null) {
/* 770 */                           parcel2.writeInt(1);
/* 773 */                           volumeAttributes.writeToParcel(parcel2, 1);
                                } else {
/* 777 */                           parcel2.writeInt(0);
                                }
/* 6 */                         return true;
                            case 11:
/* 736 */                       parcel.enforceInterface(DESCRIPTOR);
/* 751 */                       adjustVolume(parcel.readInt(), parcel.readInt(), parcel.readString());
/* 754 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case TRANSACTION_setVolumeTo /* 12 */:
/* 714 */                       parcel.enforceInterface(DESCRIPTOR);
/* 729 */                       setVolumeTo(parcel.readInt(), parcel.readInt(), parcel.readString());
/* 732 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case 13:
/* 704 */                       parcel.enforceInterface(DESCRIPTOR);
/* 707 */                       play();
/* 710 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case TRANSACTION_playFromMediaId /* 14 */:
/* 675 */                       parcel.enforceInterface(DESCRIPTOR);
/* 697 */                       playFromMediaId(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
/* 700 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case 15:
/* 646 */                       parcel.enforceInterface(DESCRIPTOR);
/* 668 */                       playFromSearch(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
/* 671 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case 16:
/* 605 */                       parcel.enforceInterface(DESCRIPTOR);
/* 639 */                       playFromUri(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
/* 642 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case TRANSACTION_skipToQueueItem /* 17 */:
/* 591 */                       parcel.enforceInterface(DESCRIPTOR);
/* 598 */                       skipToQueueItem(parcel.readLong());
/* 601 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case TRANSACTION_pause /* 18 */:
/* 581 */                       parcel.enforceInterface(DESCRIPTOR);
/* 584 */                       pause();
/* 587 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case TRANSACTION_stop /* 19 */:
/* 571 */                       parcel.enforceInterface(DESCRIPTOR);
/* 574 */                       stop();
/* 577 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case TRANSACTION_next /* 20 */:
/* 561 */                       parcel.enforceInterface(DESCRIPTOR);
/* 564 */                       next();
/* 567 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case 21:
/* 551 */                       parcel.enforceInterface(DESCRIPTOR);
/* 554 */                       previous();
/* 557 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case 22:
/* 541 */                       parcel.enforceInterface(DESCRIPTOR);
/* 544 */                       fastForward();
/* 547 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case 23:
/* 531 */                       parcel.enforceInterface(DESCRIPTOR);
/* 534 */                       rewind();
/* 537 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case 24:
/* 517 */                       parcel.enforceInterface(DESCRIPTOR);
/* 524 */                       seekTo(parcel.readLong());
/* 527 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case 25:
/* 492 */                       parcel.enforceInterface(DESCRIPTOR);
/* 510 */                       rate(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null);
/* 513 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case 26:
/* 463 */                       parcel.enforceInterface(DESCRIPTOR);
/* 485 */                       sendCustomAction(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
/* 488 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case 27:
/* 440 */                       parcel.enforceInterface(DESCRIPTOR);
/* 443 */                       MediaMetadataCompat metadata = getMetadata();
/* 447 */                       parcel2.writeNoException();
/* 450 */                       if (metadata != null) {
/* 452 */                           parcel2.writeInt(1);
/* 455 */                           metadata.writeToParcel(parcel2, 1);
                                } else {
/* 459 */                           parcel2.writeInt(0);
                                }
/* 6 */                         return true;
                            case 28:
/* 417 */                       parcel.enforceInterface(DESCRIPTOR);
/* 420 */                       PlaybackStateCompat playbackState = getPlaybackState();
/* 424 */                       parcel2.writeNoException();
/* 427 */                       if (playbackState != null) {
/* 429 */                           parcel2.writeInt(1);
/* 432 */                           playbackState.writeToParcel(parcel2, 1);
                                } else {
/* 436 */                           parcel2.writeInt(0);
                                }
/* 6 */                         return true;
                            case 29:
/* 403 */                       parcel.enforceInterface(DESCRIPTOR);
/* 406 */                       List<MediaSessionCompat.QueueItem> queue = getQueue();
/* 410 */                       parcel2.writeNoException();
/* 413 */                       parcel2.writeTypedList(queue);
/* 6 */                         return true;
                            case 30:
/* 380 */                       parcel.enforceInterface(DESCRIPTOR);
/* 383 */                       CharSequence queueTitle = getQueueTitle();
/* 387 */                       parcel2.writeNoException();
/* 390 */                       if (queueTitle != null) {
/* 392 */                           parcel2.writeInt(1);
/* 395 */                           TextUtils.writeToParcel(queueTitle, parcel2, 1);
                                } else {
/* 399 */                           parcel2.writeInt(0);
                                }
/* 6 */                         return true;
                            case 31:
/* 357 */                       parcel.enforceInterface(DESCRIPTOR);
/* 360 */                       Bundle extras = getExtras();
/* 364 */                       parcel2.writeNoException();
/* 367 */                       if (extras != null) {
/* 369 */                           parcel2.writeInt(1);
/* 372 */                           extras.writeToParcel(parcel2, 1);
                                } else {
/* 376 */                           parcel2.writeInt(0);
                                }
/* 6 */                         return true;
                            case 32:
/* 343 */                       parcel.enforceInterface(DESCRIPTOR);
/* 346 */                       int ratingType = getRatingType();
/* 350 */                       parcel2.writeNoException();
/* 353 */                       parcel2.writeInt(ratingType);
/* 6 */                         return true;
                            case 33:
/* 333 */                       parcel.enforceInterface(DESCRIPTOR);
/* 336 */                       prepare();
/* 339 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case 34:
/* 304 */                       parcel.enforceInterface(DESCRIPTOR);
/* 326 */                       prepareFromMediaId(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
/* 329 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case 35:
/* 275 */                       parcel.enforceInterface(DESCRIPTOR);
/* 297 */                       prepareFromSearch(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
/* 300 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case 36:
/* 234 */                       parcel.enforceInterface(DESCRIPTOR);
/* 268 */                       prepareFromUri(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
/* 271 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case TRANSACTION_getRepeatMode /* 37 */:
/* 220 */                       parcel.enforceInterface(DESCRIPTOR);
/* 223 */                       int repeatMode = getRepeatMode();
/* 227 */                       parcel2.writeNoException();
/* 230 */                       parcel2.writeInt(repeatMode);
/* 6 */                         return true;
                            case TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
/* 206 */                       parcel.enforceInterface(DESCRIPTOR);
/* 209 */                       boolean zIsShuffleModeEnabledRemoved = isShuffleModeEnabledRemoved();
/* 213 */                       parcel2.writeNoException();
/* 216 */                       parcel2.writeInt(zIsShuffleModeEnabledRemoved ? 1 : 0);
/* 6 */                         return true;
                            case TRANSACTION_setRepeatMode /* 39 */:
/* 192 */                       parcel.enforceInterface(DESCRIPTOR);
/* 199 */                       setRepeatMode(parcel.readInt());
/* 202 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case 40:
/* 175 */                       parcel.enforceInterface(DESCRIPTOR);
/* 185 */                       setShuffleModeEnabledRemoved(parcel.readInt() != 0);
/* 188 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case 41:
/* 150 */                       parcel.enforceInterface(DESCRIPTOR);
/* 168 */                       addQueueItem(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
/* 171 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case TRANSACTION_addQueueItemAt /* 42 */:
/* 121 */                       parcel.enforceInterface(DESCRIPTOR);
/* 143 */                       addQueueItemAt(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
/* 146 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case TRANSACTION_removeQueueItem /* 43 */:
/* 96 */                        parcel.enforceInterface(DESCRIPTOR);
/* 114 */                       removeQueueItem(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
/* 117 */                       parcel2.writeNoException();
/* 6 */                         return true;
                            case TRANSACTION_removeQueueItemAt /* 44 */:
/* 82 */                        parcel.enforceInterface(DESCRIPTOR);
/* 89 */                        removeQueueItemAt(parcel.readInt());
/* 92 */                        parcel2.writeNoException();
/* 6 */                         return true;
                            case TRANSACTION_isCaptioningEnabled /* 45 */:
/* 68 */                        parcel.enforceInterface(DESCRIPTOR);
/* 71 */                        boolean zIsCaptioningEnabled = isCaptioningEnabled();
/* 75 */                        parcel2.writeNoException();
/* 78 */                        parcel2.writeInt(zIsCaptioningEnabled ? 1 : 0);
/* 6 */                         return true;
                            case TRANSACTION_setCaptioningEnabled /* 46 */:
/* 51 */                        parcel.enforceInterface(DESCRIPTOR);
/* 61 */                        setCaptioningEnabled(parcel.readInt() != 0);
/* 64 */                        parcel2.writeNoException();
/* 6 */                         return true;
                            case TRANSACTION_getShuffleMode /* 47 */:
/* 37 */                        parcel.enforceInterface(DESCRIPTOR);
/* 40 */                        int shuffleMode = getShuffleMode();
/* 44 */                        parcel2.writeNoException();
/* 47 */                        parcel2.writeInt(shuffleMode);
/* 6 */                         return true;
                            case TRANSACTION_setShuffleMode /* 48 */:
/* 23 */                        parcel.enforceInterface(DESCRIPTOR);
/* 30 */                        setShuffleMode(parcel.readInt());
/* 33 */                        parcel2.writeNoException();
/* 6 */                         return true;
                            default:
/* 18 */                        return super.onTransact(i, parcel, parcel2, i2);
                        }
                    }
                }

                void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

                void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException;

                void adjustVolume(int i, int i2, String str) throws RemoteException;

                void fastForward() throws RemoteException;

                Bundle getExtras() throws RemoteException;

                long getFlags() throws RemoteException;

                PendingIntent getLaunchPendingIntent() throws RemoteException;

                MediaMetadataCompat getMetadata() throws RemoteException;

                String getPackageName() throws RemoteException;

                PlaybackStateCompat getPlaybackState() throws RemoteException;

                List<MediaSessionCompat.QueueItem> getQueue() throws RemoteException;

                CharSequence getQueueTitle() throws RemoteException;

                int getRatingType() throws RemoteException;

                int getRepeatMode() throws RemoteException;

                int getShuffleMode() throws RemoteException;

                String getTag() throws RemoteException;

                ParcelableVolumeInfo getVolumeAttributes() throws RemoteException;

                boolean isCaptioningEnabled() throws RemoteException;

                boolean isShuffleModeEnabledRemoved() throws RemoteException;

                boolean isTransportControlEnabled() throws RemoteException;

                void next() throws RemoteException;

                void pause() throws RemoteException;

                void play() throws RemoteException;

                void playFromMediaId(String str, Bundle bundle) throws RemoteException;

                void playFromSearch(String str, Bundle bundle) throws RemoteException;

                void playFromUri(Uri uri, Bundle bundle) throws RemoteException;

                void prepare() throws RemoteException;

                void prepareFromMediaId(String str, Bundle bundle) throws RemoteException;

                void prepareFromSearch(String str, Bundle bundle) throws RemoteException;

                void prepareFromUri(Uri uri, Bundle bundle) throws RemoteException;

                void previous() throws RemoteException;

                void rate(RatingCompat ratingCompat) throws RemoteException;

                void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;

                void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) throws RemoteException;

                void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

                void removeQueueItemAt(int i) throws RemoteException;

                void rewind() throws RemoteException;

                void seekTo(long j) throws RemoteException;

                void sendCommand(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;

                void sendCustomAction(String str, Bundle bundle) throws RemoteException;

                boolean sendMediaButton(KeyEvent keyEvent) throws RemoteException;

                void setCaptioningEnabled(boolean z) throws RemoteException;

                void setRepeatMode(int i) throws RemoteException;

                void setShuffleMode(int i) throws RemoteException;

                void setShuffleModeEnabledRemoved(boolean z) throws RemoteException;

                void setVolumeTo(int i, int i2, String str) throws RemoteException;

                void skipToQueueItem(long j) throws RemoteException;

                void stop() throws RemoteException;

                void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) throws RemoteException;
            }
