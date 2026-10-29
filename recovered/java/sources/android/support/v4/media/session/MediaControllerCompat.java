            package android.support.v4.media.session;

            import android.app.Activity;
            import android.app.PendingIntent;
            import android.content.Context;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.IBinder;
            import android.os.Looper;
            import android.os.Message;
            import android.os.RemoteException;
            import android.os.ResultReceiver;
            import android.support.v4.media.MediaDescriptionCompat;
            import android.support.v4.media.MediaMetadataCompat;
            import android.support.v4.media.RatingCompat;
            import android.text.TextUtils;
            import android.view.KeyEvent;
            import androidx.core.app.ComponentActivity;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.List;
            import p000.AbstractC2514yx;
            import p000.C1951n4;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     public final class MediaControllerCompat {
                public static final String COMMAND_ADD_QUEUE_ITEM = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";
                public static final String COMMAND_ADD_QUEUE_ITEM_AT = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";
                public static final String COMMAND_ARGUMENT_INDEX = "android.support.v4.media.session.command.ARGUMENT_INDEX";
                public static final String COMMAND_ARGUMENT_MEDIA_DESCRIPTION = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
                public static final String COMMAND_GET_EXTRA_BINDER = "android.support.v4.media.session.command.GET_EXTRA_BINDER";
                public static final String COMMAND_REMOVE_QUEUE_ITEM = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";
                public static final String COMMAND_REMOVE_QUEUE_ITEM_AT = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";
                static final String TAG = "MediaControllerCompat";
                private final MediaControllerImpl mImpl;
                private final HashSet<Callback> mRegisteredCallbacks = new HashSet<>();
                private final MediaSessionCompat.Token mToken;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Callback implements IBinder.DeathRecipient {
                    final Object mCallbackObj = MediaControllerCompatApi21.createCallback(new StubApi21(this));
                    MessageHandler mHandler;
                    IMediaControllerCallback mIControllerCallback;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public class MessageHandler extends Handler {
                        private static final int MSG_DESTROYED = 8;
                        private static final int MSG_EVENT = 1;
                        private static final int MSG_SESSION_READY = 13;
                        private static final int MSG_UPDATE_CAPTIONING_ENABLED = 11;
                        private static final int MSG_UPDATE_EXTRAS = 7;
                        private static final int MSG_UPDATE_METADATA = 3;
                        private static final int MSG_UPDATE_PLAYBACK_STATE = 2;
                        private static final int MSG_UPDATE_QUEUE = 5;
                        private static final int MSG_UPDATE_QUEUE_TITLE = 6;
                        private static final int MSG_UPDATE_REPEAT_MODE = 9;
                        private static final int MSG_UPDATE_SHUFFLE_MODE = 12;
                        private static final int MSG_UPDATE_VOLUME = 4;
                        boolean mRegistered;

                        public MessageHandler(Looper looper) {
/* 3 */                     super(looper);
/* 7 */                     this.mRegistered = false;
                        }

                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
/* 3 */                     if (this.mRegistered) {
                                switch (message.what) {
                                    case 1:
/* 129 */                               Bundle data = message.getData();
/* 133 */                               MediaSessionCompat.ensureClassLoader(data);
/* 142 */                               Callback.this.onSessionEvent((String) message.obj, data);
                                        break;
                                    case 2:
/* 125 */                               Callback.this.onPlaybackStateChanged((PlaybackStateCompat) message.obj);
                                        break;
                                    case 3:
/* 115 */                               Callback.this.onMetadataChanged((MediaMetadataCompat) message.obj);
                                        break;
                                    case 4:
/* 105 */                               Callback.this.onAudioInfoChanged((PlaybackInfo) message.obj);
                                        break;
                                    case 5:
/* 95 */                                Callback.this.onQueueChanged((List) message.obj);
                                        break;
                                    case 6:
/* 85 */                                Callback.this.onQueueTitleChanged((CharSequence) message.obj);
                                        break;
                                    case 7:
/* 68 */                                Bundle bundle = (Bundle) message.obj;
/* 70 */                                MediaSessionCompat.ensureClassLoader(bundle);
/* 75 */                                Callback.this.onExtrasChanged(bundle);
                                        break;
                                    case 8:
/* 62 */                                Callback.this.onSessionDestroyed();
                                        break;
                                    case 9:
/* 56 */                                Callback.this.onRepeatModeChanged(((Integer) message.obj).intValue());
                                        break;
                                    case 11:
/* 42 */                                Callback.this.onCaptioningEnabledChanged(((Boolean) message.obj).booleanValue());
                                        break;
                                    case MSG_UPDATE_SHUFFLE_MODE /* 12 */:
/* 28 */                                Callback.this.onShuffleModeChanged(((Integer) message.obj).intValue());
                                        break;
                                    case 13:
/* 14 */                                Callback.this.onSessionReady();
                                        break;
                                }
                            }
                        }
                    }

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static class StubApi21 implements MediaControllerCompatApi21.Callback {
                        private final WeakReference<Callback> mCallback;

                        public StubApi21(Callback callback) {
/* 9 */                     this.mCallback = new WeakReference<>(callback);
                        }

                        @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
                        public void onAudioInfoChanged(int i, int i2, int i3, int i4, int i5) {
/* 3 */                     Callback callback = this.mCallback.get();
/* 9 */                     if (callback != null) {
/* 21 */                        callback.onAudioInfoChanged(new PlaybackInfo(i, i2, i3, i4, i5));
                            }
                        }

                        @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
                        public void onExtrasChanged(Bundle bundle) {
/* 3 */                     Callback callback = this.mCallback.get();
/* 9 */                     if (callback != null) {
/* 11 */                        callback.onExtrasChanged(bundle);
                            }
                        }

                        @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
                        public void onMetadataChanged(Object obj) {
/* 3 */                     Callback callback = this.mCallback.get();
/* 9 */                     if (callback != null) {
/* 15 */                        callback.onMetadataChanged(MediaMetadataCompat.fromMediaMetadata(obj));
                            }
                        }

                        @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
                        public void onPlaybackStateChanged(Object obj) {
/* 3 */                     Callback callback = this.mCallback.get();
/* 9 */                     if (callback == null || callback.mIControllerCallback != null) {
/* 23 */                        return;
                            }
/* 20 */                    callback.onPlaybackStateChanged(PlaybackStateCompat.fromPlaybackState(obj));
                        }

                        @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
                        public void onQueueChanged(List<?> list) {
/* 3 */                     Callback callback = this.mCallback.get();
/* 9 */                     if (callback != null) {
/* 15 */                        callback.onQueueChanged(MediaSessionCompat.QueueItem.fromQueueItemList(list));
                            }
                        }

                        @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
                        public void onQueueTitleChanged(CharSequence charSequence) {
/* 3 */                     Callback callback = this.mCallback.get();
/* 9 */                     if (callback != null) {
/* 11 */                        callback.onQueueTitleChanged(charSequence);
                            }
                        }

                        @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
                        public void onSessionDestroyed() {
/* 3 */                     Callback callback = this.mCallback.get();
/* 9 */                     if (callback != null) {
/* 11 */                        callback.onSessionDestroyed();
                            }
                        }

                        @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
                        public void onSessionEvent(String str, Bundle bundle) {
/* 3 */                     Callback callback = this.mCallback.get();
/* 9 */                     if (callback != null) {
/* 11 */                        callback.onSessionEvent(str, bundle);
                            }
                        }
                    }

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static class StubCompat extends IMediaControllerCallback.Stub {
                        private final WeakReference<Callback> mCallback;

                        public StubCompat(Callback callback) {
/* 9 */                     this.mCallback = new WeakReference<>(callback);
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onCaptioningEnabledChanged(boolean z) throws RemoteException {
/* 3 */                     Callback callback = this.mCallback.get();
/* 9 */                     if (callback != null) {
/* 18 */                        callback.postToHandler(11, Boolean.valueOf(z), null);
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onEvent(String str, Bundle bundle) throws RemoteException {
/* 3 */                     Callback callback = this.mCallback.get();
/* 9 */                     if (callback != null) {
/* 12 */                        callback.postToHandler(1, str, bundle);
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onExtrasChanged(Bundle bundle) throws RemoteException {
/* 3 */                     Callback callback = this.mCallback.get();
/* 9 */                     if (callback != null) {
/* 13 */                        callback.postToHandler(7, bundle, null);
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
/* 3 */                     Callback callback = this.mCallback.get();
/* 9 */                     if (callback != null) {
/* 13 */                        callback.postToHandler(3, mediaMetadataCompat, null);
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) throws RemoteException {
/* 3 */                     Callback callback = this.mCallback.get();
/* 9 */                     if (callback != null) {
/* 13 */                        callback.postToHandler(2, playbackStateCompat, null);
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
/* 3 */                     Callback callback = this.mCallback.get();
/* 9 */                     if (callback != null) {
/* 13 */                        callback.postToHandler(5, list, null);
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
/* 3 */                     Callback callback = this.mCallback.get();
/* 9 */                     if (callback != null) {
/* 13 */                        callback.postToHandler(6, charSequence, null);
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onRepeatModeChanged(int i) throws RemoteException {
/* 3 */                     Callback callback = this.mCallback.get();
/* 9 */                     if (callback != null) {
/* 18 */                        callback.postToHandler(9, Integer.valueOf(i), null);
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onSessionDestroyed() throws RemoteException {
/* 3 */                     Callback callback = this.mCallback.get();
/* 9 */                     if (callback != null) {
/* 14 */                        callback.postToHandler(8, null, null);
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onSessionReady() throws RemoteException {
/* 3 */                     Callback callback = this.mCallback.get();
/* 9 */                     if (callback != null) {
/* 14 */                        callback.postToHandler(13, null, null);
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onShuffleModeChanged(int i) throws RemoteException {
/* 3 */                     Callback callback = this.mCallback.get();
/* 9 */                     if (callback != null) {
/* 18 */                        callback.postToHandler(12, Integer.valueOf(i), null);
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onShuffleModeChangedRemoved(boolean z) throws RemoteException {
                        }

                        @Override // android.support.v4.media.session.IMediaControllerCallback
                        public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
/* 3 */                     Callback callback = this.mCallback.get();
/* 9 */                     if (callback != null) {
/* 32 */                        callback.postToHandler(4, parcelableVolumeInfo != null ? new PlaybackInfo(parcelableVolumeInfo.volumeType, parcelableVolumeInfo.audioStream, parcelableVolumeInfo.controlType, parcelableVolumeInfo.maxVolume, parcelableVolumeInfo.currentVolume) : null, null);
                            }
                        }
                    }

                    @Override // android.os.IBinder.DeathRecipient
                    public void binderDied() {
/* 4 */                 postToHandler(8, null, null);
                    }

                    public IMediaControllerCallback getIControllerCallback() {
/* 1 */                 return this.mIControllerCallback;
                    }

                    public void onAudioInfoChanged(PlaybackInfo playbackInfo) {
                    }

                    public void onCaptioningEnabledChanged(boolean z) {
                    }

                    public void onExtrasChanged(Bundle bundle) {
                    }

                    public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
                    }

                    public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
                    }

                    public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) {
                    }

                    public void onQueueTitleChanged(CharSequence charSequence) {
                    }

                    public void onRepeatModeChanged(int i) {
                    }

                    public void onSessionDestroyed() {
                    }

                    public void onSessionEvent(String str, Bundle bundle) {
                    }

                    public void onSessionReady() {
                    }

                    public void onShuffleModeChanged(int i) {
                    }

                    public void postToHandler(int i, Object obj, Bundle bundle) {
/* 1 */                 MessageHandler messageHandler = this.mHandler;
/* 3 */                 if (messageHandler != null) {
/* 5 */                     Message messageObtainMessage = messageHandler.obtainMessage(i, obj);
/* 9 */                     messageObtainMessage.setData(bundle);
/* 12 */                    messageObtainMessage.sendToTarget();
                        }
                    }

                    public void setHandler(Handler handler) {
/* 1 */                 if (handler != null) {
/* 23 */                    MessageHandler messageHandler = new MessageHandler(handler.getLooper());
/* 26 */                    this.mHandler = messageHandler;
/* 29 */                    messageHandler.mRegistered = true;
                        } else {
/* 3 */                     MessageHandler messageHandler2 = this.mHandler;
/* 5 */                     if (messageHandler2 != null) {
/* 8 */                         messageHandler2.mRegistered = false;
/* 11 */                        messageHandler2.removeCallbacksAndMessages(null);
/* 14 */                        this.mHandler = null;
                            }
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class MediaControllerExtraData extends AbstractC2514yx {
                    private final MediaControllerCompat mMediaController;

                    public MediaControllerExtraData(MediaControllerCompat mediaControllerCompat) {
/* 4 */                 this.mMediaController = mediaControllerCompat;
                    }

                    public MediaControllerCompat getMediaController() {
/* 1 */                 return this.mMediaController;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface MediaControllerImpl {
                    void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat);

                    void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i);

                    void adjustVolume(int i, int i2);

                    boolean dispatchMediaButtonEvent(KeyEvent keyEvent);

                    Bundle getExtras();

                    long getFlags();

                    Object getMediaController();

                    MediaMetadataCompat getMetadata();

                    String getPackageName();

                    PlaybackInfo getPlaybackInfo();

                    PlaybackStateCompat getPlaybackState();

                    List<MediaSessionCompat.QueueItem> getQueue();

                    CharSequence getQueueTitle();

                    int getRatingType();

                    int getRepeatMode();

                    PendingIntent getSessionActivity();

                    int getShuffleMode();

                    TransportControls getTransportControls();

                    boolean isCaptioningEnabled();

                    boolean isSessionReady();

                    void registerCallback(Callback callback, Handler handler);

                    void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat);

                    void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver);

                    void setVolumeTo(int i, int i2);

                    void unregisterCallback(Callback callback);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class MediaControllerImplApi23 extends MediaControllerImplApi21 {
                    public MediaControllerImplApi23(Context context, MediaSessionCompat.Token token) throws RemoteException {
/* 1 */                 super(context, token);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21, android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public TransportControls getTransportControls() {
/* 3 */                 Object transportControls = MediaControllerCompatApi21.getTransportControls(this.mControllerObj);
/* 7 */                 if (transportControls != null) {
/* 11 */                    return new TransportControlsApi23(transportControls);
                        }
/* 15 */                return null;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class MediaControllerImplApi24 extends MediaControllerImplApi23 {
                    public MediaControllerImplApi24(Context context, MediaSessionCompat.Token token) throws RemoteException {
/* 1 */                 super(context, token);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi23, android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21, android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public TransportControls getTransportControls() {
/* 3 */                 Object transportControls = MediaControllerCompatApi21.getTransportControls(this.mControllerObj);
/* 7 */                 if (transportControls != null) {
/* 11 */                    return new TransportControlsApi24(transportControls);
                        }
/* 15 */                return null;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class PlaybackInfo {
                    public static final int PLAYBACK_TYPE_LOCAL = 1;
                    public static final int PLAYBACK_TYPE_REMOTE = 2;
                    private final int mAudioStream;
                    private final int mCurrentVolume;
                    private final int mMaxVolume;
                    private final int mPlaybackType;
                    private final int mVolumeControl;

                    public PlaybackInfo(int i, int i2, int i3, int i4, int i5) {
/* 4 */                 this.mPlaybackType = i;
/* 6 */                 this.mAudioStream = i2;
/* 8 */                 this.mVolumeControl = i3;
/* 10 */                this.mMaxVolume = i4;
/* 12 */                this.mCurrentVolume = i5;
                    }

                    public int getAudioStream() {
/* 1 */                 return this.mAudioStream;
                    }

                    public int getCurrentVolume() {
/* 1 */                 return this.mCurrentVolume;
                    }

                    public int getMaxVolume() {
/* 1 */                 return this.mMaxVolume;
                    }

                    public int getPlaybackType() {
/* 1 */                 return this.mPlaybackType;
                    }

                    public int getVolumeControl() {
/* 1 */                 return this.mVolumeControl;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class TransportControls {
                    public static final String EXTRA_LEGACY_STREAM_TYPE = "android.media.session.extra.LEGACY_STREAM_TYPE";

                    public abstract void fastForward();

                    public abstract void pause();

                    public abstract void play();

                    public abstract void playFromMediaId(String str, Bundle bundle);

                    public abstract void playFromSearch(String str, Bundle bundle);

                    public abstract void playFromUri(Uri uri, Bundle bundle);

                    public abstract void prepare();

                    public abstract void prepareFromMediaId(String str, Bundle bundle);

                    public abstract void prepareFromSearch(String str, Bundle bundle);

                    public abstract void prepareFromUri(Uri uri, Bundle bundle);

                    public abstract void rewind();

                    public abstract void seekTo(long j);

                    public abstract void sendCustomAction(PlaybackStateCompat.CustomAction customAction, Bundle bundle);

                    public abstract void sendCustomAction(String str, Bundle bundle);

                    public abstract void setCaptioningEnabled(boolean z);

                    public abstract void setRating(RatingCompat ratingCompat);

                    public abstract void setRating(RatingCompat ratingCompat, Bundle bundle);

                    public abstract void setRepeatMode(int i);

                    public abstract void setShuffleMode(int i);

                    public abstract void skipToNext();

                    public abstract void skipToPrevious();

                    public abstract void skipToQueueItem(long j);

                    public abstract void stop();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class TransportControlsApi23 extends TransportControlsApi21 {
                    public TransportControlsApi23(Object obj) {
/* 1 */                 super(obj);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21, android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void playFromUri(Uri uri, Bundle bundle) {
/* 3 */                 MediaControllerCompatApi23.TransportControls.playFromUri(this.mControlsObj, uri, bundle);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class TransportControlsApi24 extends TransportControlsApi23 {
                    public TransportControlsApi24(Object obj) {
/* 1 */                 super(obj);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21, android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void prepare() {
/* 3 */                 MediaControllerCompatApi24.TransportControls.prepare(this.mControlsObj);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21, android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void prepareFromMediaId(String str, Bundle bundle) {
/* 3 */                 MediaControllerCompatApi24.TransportControls.prepareFromMediaId(this.mControlsObj, str, bundle);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21, android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void prepareFromSearch(String str, Bundle bundle) {
/* 3 */                 MediaControllerCompatApi24.TransportControls.prepareFromSearch(this.mControlsObj, str, bundle);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21, android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void prepareFromUri(Uri uri, Bundle bundle) {
/* 3 */                 MediaControllerCompatApi24.TransportControls.prepareFromUri(this.mControlsObj, uri, bundle);
                    }
                }

                public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
/* 11 */            MediaControllerImplApi24 mediaControllerImplApi24 = null;
/* 12 */            if (mediaSessionCompat == null) {
/* 40 */                C1951n4.m6859j("session must not be null");
/* 43 */                throw null;
                    }
/* 14 */            MediaSessionCompat.Token sessionToken = mediaSessionCompat.getSessionToken();
/* 18 */            this.mToken = sessionToken;
                    try {
/* 22 */                mediaControllerImplApi24 = new MediaControllerImplApi24(context, sessionToken);
                    } catch (RemoteException e) {
/* 32 */                AbstractC1245n0.m4891s(TAG, "Failed to create MediaControllerImpl.", e);
                    }
/* 35 */            this.mImpl = mediaControllerImplApi24;
                }

                public static MediaControllerCompat getMediaController(Activity activity) {
/* 4 */             if (activity instanceof ComponentActivity) {
/* 14 */                MediaControllerExtraData mediaControllerExtraData = (MediaControllerExtraData) ((ComponentActivity) activity).getExtraData(MediaControllerExtraData.class);
/* 16 */                if (mediaControllerExtraData != null) {
/* 18 */                    return mediaControllerExtraData.getMediaController();
                        }
/* 3 */                 return null;
                    }
/* 24 */            Object mediaController = MediaControllerCompatApi21.getMediaController(activity);
/* 28 */            if (mediaController == null) {
/* 3 */                 return null;
                    }
                    try {
/* 41 */                return new MediaControllerCompat(activity, MediaSessionCompat.Token.fromToken(MediaControllerCompatApi21.getSessionToken(mediaController)));
                    } catch (RemoteException e) {
/* 50 */                AbstractC1245n0.m4877e(TAG, "Dead object in getMediaController.", e);
/* 3 */                 return null;
                    }
                }

                public static void setMediaController(Activity activity, MediaControllerCompat mediaControllerCompat) {
/* 3 */             if (activity instanceof ComponentActivity) {
/* 13 */                ((ComponentActivity) activity).putExtraData(new MediaControllerExtraData(mediaControllerCompat));
                    }
/* 32 */            MediaControllerCompatApi21.setMediaController(activity, mediaControllerCompat != null ? MediaControllerCompatApi21.fromToken(activity, mediaControllerCompat.getSessionToken().getToken()) : null);
                }

                public static void validateCustomAction(String str, Bundle bundle) {
/* 1 */             if (str == null) {
/* 31 */                return;
                    }
/* 10 */            if (str.equals(MediaSessionCompat.ACTION_FOLLOW) || str.equals(MediaSessionCompat.ACTION_UNFOLLOW)) {
/* 21 */                if (bundle == null || !bundle.containsKey(MediaSessionCompat.ARGUMENT_MEDIA_ATTRIBUTE)) {
/* 40 */                    C1951n4.m6859j(fm0.m3784j("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", str, "."));
                        }
                    }
                }

                public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
/* 3 */             this.mImpl.addQueueItem(mediaDescriptionCompat);
                }

                public void adjustVolume(int i, int i2) {
/* 3 */             this.mImpl.adjustVolume(i, i2);
                }

                public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
/* 1 */             if (keyEvent != null) {
/* 5 */                 return this.mImpl.dispatchMediaButtonEvent(keyEvent);
                    }
/* 12 */            C1951n4.m6859j("KeyEvent may not be null");
/* 15 */            return false;
                }

                public Bundle getExtras() {
/* 3 */             return this.mImpl.getExtras();
                }

                public long getFlags() {
/* 3 */             return this.mImpl.getFlags();
                }

                public MediaMetadataCompat getMetadata() {
/* 3 */             return this.mImpl.getMetadata();
                }

                public String getPackageName() {
/* 3 */             return this.mImpl.getPackageName();
                }

                public PlaybackInfo getPlaybackInfo() {
/* 3 */             return this.mImpl.getPlaybackInfo();
                }

                public PlaybackStateCompat getPlaybackState() {
/* 3 */             return this.mImpl.getPlaybackState();
                }

                public List<MediaSessionCompat.QueueItem> getQueue() {
/* 3 */             return this.mImpl.getQueue();
                }

                public CharSequence getQueueTitle() {
/* 3 */             return this.mImpl.getQueueTitle();
                }

                public int getRatingType() {
/* 3 */             return this.mImpl.getRatingType();
                }

                public int getRepeatMode() {
/* 3 */             return this.mImpl.getRepeatMode();
                }

                public PendingIntent getSessionActivity() {
/* 3 */             return this.mImpl.getSessionActivity();
                }

                public MediaSessionCompat.Token getSessionToken() {
/* 1 */             return this.mToken;
                }

                public Bundle getSessionToken2Bundle() {
/* 3 */             return this.mToken.getSessionToken2Bundle();
                }

                public int getShuffleMode() {
/* 3 */             return this.mImpl.getShuffleMode();
                }

                public TransportControls getTransportControls() {
/* 3 */             return this.mImpl.getTransportControls();
                }

                public boolean isCaptioningEnabled() {
/* 3 */             return this.mImpl.isCaptioningEnabled();
                }

                public boolean isSessionReady() {
/* 3 */             return this.mImpl.isSessionReady();
                }

                public void registerCallback(Callback callback, Handler handler) {
/* 1 */             if (callback == null) {
/* 26 */                C1951n4.m6859j("callback must not be null");
/* 29 */                return;
                    }
/* 3 */             if (handler == null) {
/* 7 */                 handler = new Handler();
                    }
/* 10 */            callback.setHandler(handler);
/* 15 */            this.mImpl.registerCallback(callback, handler);
/* 20 */            this.mRegisteredCallbacks.add(callback);
                }

                public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
/* 3 */             this.mImpl.removeQueueItem(mediaDescriptionCompat);
                }

                @Deprecated
                public void removeQueueItemAt(int i) {
                    MediaSessionCompat.QueueItem queueItem;
/* 1 */             List<MediaSessionCompat.QueueItem> queue = getQueue();
/* 5 */             if (queue == null || i < 0 || i >= queue.size() || (queueItem = queue.get(i)) == null) {
/* 30 */                return;
                    }
/* 27 */            removeQueueItem(queueItem.getDescription());
                }

                public void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
/* 5 */             if (TextUtils.isEmpty(str)) {
/* 15 */                C1951n4.m6859j("command must neither be null nor empty");
                    } else {
/* 9 */                 this.mImpl.sendCommand(str, bundle, resultReceiver);
                    }
                }

                public void setVolumeTo(int i, int i2) {
/* 3 */             this.mImpl.setVolumeTo(i, i2);
                }

                public void unregisterCallback(Callback callback) {
/* 1 */             if (callback == null) {
/* 25 */                C1951n4.m6859j("callback must not be null");
/* 28 */                return;
                    }
                    try {
/* 6 */                 this.mRegisteredCallbacks.remove(callback);
/* 11 */                this.mImpl.unregisterCallback(callback);
                    } finally {
/* 19 */                callback.setHandler(null);
                    }
                }

/* 6 */         public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
/* 7 */             this.mImpl.addQueueItem(mediaDescriptionCompat, i);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 14 */        public static class TransportControlsBase extends TransportControls {
                    private IMediaSession mBinder;

                    public TransportControlsBase(IMediaSession iMediaSession) {
/* 4 */                 this.mBinder = iMediaSession;
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void fastForward() {
                        try {
/* 3 */                     this.mBinder.fastForward();
                        } catch (RemoteException e) {
/* 12 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in fastForward.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void pause() {
                        try {
/* 3 */                     this.mBinder.pause();
                        } catch (RemoteException e) {
/* 12 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in pause.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void play() {
                        try {
/* 3 */                     this.mBinder.play();
                        } catch (RemoteException e) {
/* 12 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in play.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void playFromMediaId(String str, Bundle bundle) {
                        try {
/* 3 */                     this.mBinder.playFromMediaId(str, bundle);
                        } catch (RemoteException e) {
/* 12 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in playFromMediaId.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void playFromSearch(String str, Bundle bundle) {
                        try {
/* 3 */                     this.mBinder.playFromSearch(str, bundle);
                        } catch (RemoteException e) {
/* 12 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in playFromSearch.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void playFromUri(Uri uri, Bundle bundle) {
                        try {
/* 3 */                     this.mBinder.playFromUri(uri, bundle);
                        } catch (RemoteException e) {
/* 12 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in playFromUri.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void prepare() {
                        try {
/* 3 */                     this.mBinder.prepare();
                        } catch (RemoteException e) {
/* 12 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in prepare.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void prepareFromMediaId(String str, Bundle bundle) {
                        try {
/* 3 */                     this.mBinder.prepareFromMediaId(str, bundle);
                        } catch (RemoteException e) {
/* 12 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in prepareFromMediaId.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void prepareFromSearch(String str, Bundle bundle) {
                        try {
/* 3 */                     this.mBinder.prepareFromSearch(str, bundle);
                        } catch (RemoteException e) {
/* 12 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in prepareFromSearch.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void prepareFromUri(Uri uri, Bundle bundle) {
                        try {
/* 3 */                     this.mBinder.prepareFromUri(uri, bundle);
                        } catch (RemoteException e) {
/* 12 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in prepareFromUri.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void rewind() {
                        try {
/* 3 */                     this.mBinder.rewind();
                        } catch (RemoteException e) {
/* 12 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in rewind.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void seekTo(long j) {
                        try {
/* 3 */                     this.mBinder.seekTo(j);
                        } catch (RemoteException e) {
/* 12 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in seekTo.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void sendCustomAction(String str, Bundle bundle) {
/* 1 */                 MediaControllerCompat.validateCustomAction(str, bundle);
                        try {
/* 6 */                     this.mBinder.sendCustomAction(str, bundle);
                        } catch (RemoteException e) {
/* 15 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in sendCustomAction.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void setCaptioningEnabled(boolean z) {
                        try {
/* 3 */                     this.mBinder.setCaptioningEnabled(z);
                        } catch (RemoteException e) {
/* 12 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in setCaptioningEnabled.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void setRating(RatingCompat ratingCompat) {
                        try {
/* 3 */                     this.mBinder.rate(ratingCompat);
                        } catch (RemoteException e) {
/* 12 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in setRating.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void setRepeatMode(int i) {
                        try {
/* 3 */                     this.mBinder.setRepeatMode(i);
                        } catch (RemoteException e) {
/* 12 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in setRepeatMode.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void setShuffleMode(int i) {
                        try {
/* 3 */                     this.mBinder.setShuffleMode(i);
                        } catch (RemoteException e) {
/* 12 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in setShuffleMode.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void skipToNext() {
                        try {
/* 3 */                     this.mBinder.next();
                        } catch (RemoteException e) {
/* 12 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in skipToNext.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void skipToPrevious() {
                        try {
/* 3 */                     this.mBinder.previous();
                        } catch (RemoteException e) {
/* 12 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in skipToPrevious.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void skipToQueueItem(long j) {
                        try {
/* 3 */                     this.mBinder.skipToQueueItem(j);
                        } catch (RemoteException e) {
/* 12 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in skipToQueueItem.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void stop() {
                        try {
/* 3 */                     this.mBinder.stop();
                        } catch (RemoteException e) {
/* 12 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in stop.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
/* 15 */            public void setRating(RatingCompat ratingCompat, Bundle bundle) {
                        try {
/* 16 */                    this.mBinder.rateWithExtras(ratingCompat, bundle);
                        } catch (RemoteException e) {
/* 17 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in setRating.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
/* 18 */            public void sendCustomAction(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
/* 19 */                sendCustomAction(customAction.getAction(), bundle);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 16 */        public static class TransportControlsApi21 extends TransportControls {
                    protected final Object mControlsObj;

                    public TransportControlsApi21(Object obj) {
/* 4 */                 this.mControlsObj = obj;
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void fastForward() {
/* 3 */                 MediaControllerCompatApi21.TransportControls.fastForward(this.mControlsObj);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void pause() {
/* 3 */                 MediaControllerCompatApi21.TransportControls.pause(this.mControlsObj);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void play() {
/* 3 */                 MediaControllerCompatApi21.TransportControls.play(this.mControlsObj);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void playFromMediaId(String str, Bundle bundle) {
/* 3 */                 MediaControllerCompatApi21.TransportControls.playFromMediaId(this.mControlsObj, str, bundle);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void playFromSearch(String str, Bundle bundle) {
/* 3 */                 MediaControllerCompatApi21.TransportControls.playFromSearch(this.mControlsObj, str, bundle);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void playFromUri(Uri uri, Bundle bundle) {
/* 1 */                 if (uri == null || Uri.EMPTY.equals(uri)) {
/* 34 */                    C1951n4.m6859j("You must specify a non-empty Uri for playFromUri.");
/* 37 */                    return;
                        }
/* 13 */                Bundle bundle2 = new Bundle();
/* 18 */                bundle2.putParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI, uri);
/* 23 */                bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
/* 28 */                sendCustomAction(MediaSessionCompat.ACTION_PLAY_FROM_URI, bundle2);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void prepare() {
/* 4 */                 sendCustomAction(MediaSessionCompat.ACTION_PREPARE, (Bundle) null);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void prepareFromMediaId(String str, Bundle bundle) {
/* 3 */                 Bundle bundle2 = new Bundle();
/* 8 */                 bundle2.putString(MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID, str);
/* 13 */                bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
/* 18 */                sendCustomAction(MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID, bundle2);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void prepareFromSearch(String str, Bundle bundle) {
/* 3 */                 Bundle bundle2 = new Bundle();
/* 8 */                 bundle2.putString(MediaSessionCompat.ACTION_ARGUMENT_QUERY, str);
/* 13 */                bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
/* 18 */                sendCustomAction(MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH, bundle2);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void prepareFromUri(Uri uri, Bundle bundle) {
/* 3 */                 Bundle bundle2 = new Bundle();
/* 8 */                 bundle2.putParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI, uri);
/* 13 */                bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
/* 18 */                sendCustomAction(MediaSessionCompat.ACTION_PREPARE_FROM_URI, bundle2);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void rewind() {
/* 3 */                 MediaControllerCompatApi21.TransportControls.rewind(this.mControlsObj);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void seekTo(long j) {
/* 3 */                 MediaControllerCompatApi21.TransportControls.seekTo(this.mControlsObj, j);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void sendCustomAction(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
/* 5 */                 MediaControllerCompat.validateCustomAction(customAction.getAction(), bundle);
/* 14 */                MediaControllerCompatApi21.TransportControls.sendCustomAction(this.mControlsObj, customAction.getAction(), bundle);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void setCaptioningEnabled(boolean z) {
/* 3 */                 Bundle bundle = new Bundle();
/* 8 */                 bundle.putBoolean(MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED, z);
/* 13 */                sendCustomAction(MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED, bundle);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void setRating(RatingCompat ratingCompat, Bundle bundle) {
/* 3 */                 Bundle bundle2 = new Bundle();
/* 8 */                 bundle2.putParcelable(MediaSessionCompat.ACTION_ARGUMENT_RATING, ratingCompat);
/* 13 */                bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
/* 18 */                sendCustomAction(MediaSessionCompat.ACTION_SET_RATING, bundle2);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void setRepeatMode(int i) {
/* 3 */                 Bundle bundle = new Bundle();
/* 8 */                 bundle.putInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE, i);
/* 13 */                sendCustomAction(MediaSessionCompat.ACTION_SET_REPEAT_MODE, bundle);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void setShuffleMode(int i) {
/* 3 */                 Bundle bundle = new Bundle();
/* 8 */                 bundle.putInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE, i);
/* 13 */                sendCustomAction(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE, bundle);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void skipToNext() {
/* 3 */                 MediaControllerCompatApi21.TransportControls.skipToNext(this.mControlsObj);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void skipToPrevious() {
/* 3 */                 MediaControllerCompatApi21.TransportControls.skipToPrevious(this.mControlsObj);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void skipToQueueItem(long j) {
/* 3 */                 MediaControllerCompatApi21.TransportControls.skipToQueueItem(this.mControlsObj, j);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
                    public void stop() {
/* 3 */                 MediaControllerCompatApi21.TransportControls.stop(this.mControlsObj);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
/* 17 */            public void sendCustomAction(String str, Bundle bundle) {
/* 18 */                MediaControllerCompat.validateCustomAction(str, bundle);
/* 19 */                MediaControllerCompatApi21.TransportControls.sendCustomAction(this.mControlsObj, str, bundle);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
/* 21 */            public void setRating(RatingCompat ratingCompat) {
/* 24 */                MediaControllerCompatApi21.TransportControls.setRating(this.mControlsObj, ratingCompat != null ? ratingCompat.getRating() : null);
                    }
                }

/* 29 */        public void registerCallback(Callback callback) {
/* 30 */            registerCallback(callback, null);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 37 */        public static class MediaControllerImplBase implements MediaControllerImpl {
                    private IMediaSession mBinder;
                    private TransportControls mTransportControls;

                    public MediaControllerImplBase(MediaSessionCompat.Token token) {
/* 14 */                this.mBinder = IMediaSession.Stub.asInterface((IBinder) token.getToken());
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                        try {
/* 14 */                    if ((this.mBinder.getFlags() & 4) == 0) {
/* 29 */                        throw new UnsupportedOperationException("This session doesn't support queue management operations");
                            }
/* 18 */                    this.mBinder.addQueueItem(mediaDescriptionCompat);
                        } catch (RemoteException e) {
/* 35 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in addQueueItem.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public void adjustVolume(int i, int i2) {
                        try {
/* 4 */                     this.mBinder.adjustVolume(i, i2, null);
                        } catch (RemoteException e) {
/* 13 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in adjustVolume.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
/* 2 */                 if (keyEvent == null) {
/* 21 */                    C1951n4.m6859j("event may not be null.");
/* 1 */                     return false;
                        }
                        try {
/* 6 */                     this.mBinder.sendMediaButton(keyEvent);
                        } catch (RemoteException e) {
/* 15 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in dispatchMediaButtonEvent.", e);
                        }
/* 1 */                 return false;
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public Bundle getExtras() {
                        try {
/* 3 */                     return this.mBinder.getExtras();
                        } catch (RemoteException e) {
/* 13 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in getExtras.", e);
/* 16 */                    return null;
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public long getFlags() {
                        try {
/* 3 */                     return this.mBinder.getFlags();
                        } catch (RemoteException e) {
/* 13 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in getFlags.", e);
/* 16 */                    return 0L;
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public Object getMediaController() {
/* 1 */                 return null;
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public MediaMetadataCompat getMetadata() {
                        try {
/* 3 */                     return this.mBinder.getMetadata();
                        } catch (RemoteException e) {
/* 13 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in getMetadata.", e);
/* 16 */                    return null;
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public String getPackageName() {
                        try {
/* 3 */                     return this.mBinder.getPackageName();
                        } catch (RemoteException e) {
/* 13 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in getPackageName.", e);
/* 16 */                    return null;
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public PlaybackInfo getPlaybackInfo() {
                        try {
/* 3 */                     ParcelableVolumeInfo volumeAttributes = this.mBinder.getVolumeAttributes();
/* 19 */                    return new PlaybackInfo(volumeAttributes.volumeType, volumeAttributes.audioStream, volumeAttributes.controlType, volumeAttributes.maxVolume, volumeAttributes.currentVolume);
                        } catch (RemoteException e) {
/* 29 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in getPlaybackInfo.", e);
/* 32 */                    return null;
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public PlaybackStateCompat getPlaybackState() {
                        try {
/* 3 */                     return this.mBinder.getPlaybackState();
                        } catch (RemoteException e) {
/* 13 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in getPlaybackState.", e);
/* 16 */                    return null;
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public List<MediaSessionCompat.QueueItem> getQueue() {
                        try {
/* 3 */                     return this.mBinder.getQueue();
                        } catch (RemoteException e) {
/* 13 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in getQueue.", e);
/* 16 */                    return null;
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public CharSequence getQueueTitle() {
                        try {
/* 3 */                     return this.mBinder.getQueueTitle();
                        } catch (RemoteException e) {
/* 13 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in getQueueTitle.", e);
/* 16 */                    return null;
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public int getRatingType() {
                        try {
/* 3 */                     return this.mBinder.getRatingType();
                        } catch (RemoteException e) {
/* 13 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in getRatingType.", e);
/* 16 */                    return 0;
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public int getRepeatMode() {
                        try {
/* 3 */                     return this.mBinder.getRepeatMode();
                        } catch (RemoteException e) {
/* 13 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in getRepeatMode.", e);
/* 16 */                    return -1;
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public PendingIntent getSessionActivity() {
                        try {
/* 3 */                     return this.mBinder.getLaunchPendingIntent();
                        } catch (RemoteException e) {
/* 13 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in getSessionActivity.", e);
/* 16 */                    return null;
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public int getShuffleMode() {
                        try {
/* 3 */                     return this.mBinder.getShuffleMode();
                        } catch (RemoteException e) {
/* 13 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in getShuffleMode.", e);
/* 16 */                    return -1;
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public TransportControls getTransportControls() {
/* 3 */                 if (this.mTransportControls == null) {
/* 12 */                    this.mTransportControls = new TransportControlsBase(this.mBinder);
                        }
/* 14 */                return this.mTransportControls;
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public boolean isCaptioningEnabled() {
                        try {
/* 3 */                     return this.mBinder.isCaptioningEnabled();
                        } catch (RemoteException e) {
/* 13 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in isCaptioningEnabled.", e);
/* 16 */                    return false;
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public boolean isSessionReady() {
/* 1 */                 return true;
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public void registerCallback(Callback callback, Handler handler) {
/* 1 */                 if (callback == null) {
/* 45 */                    C1951n4.m6859j("callback may not be null.");
/* 48 */                    return;
                        }
                        try {
/* 11 */                    this.mBinder.asBinder().linkToDeath(callback, 0);
/* 20 */                    this.mBinder.registerCallbackListener((IMediaControllerCallback) callback.mCallbackObj);
/* 25 */                    callback.postToHandler(13, null, null);
                        } catch (RemoteException e) {
/* 34 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in registerCallback.", e);
/* 39 */                    callback.postToHandler(8, null, null);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                        try {
/* 14 */                    if ((this.mBinder.getFlags() & 4) == 0) {
/* 29 */                        throw new UnsupportedOperationException("This session doesn't support queue management operations");
                            }
/* 18 */                    this.mBinder.removeQueueItem(mediaDescriptionCompat);
                        } catch (RemoteException e) {
/* 35 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in removeQueueItem.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                        try {
/* 8 */                     this.mBinder.sendCommand(str, bundle, new MediaSessionCompat.ResultReceiverWrapper(resultReceiver));
                        } catch (RemoteException e) {
/* 17 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in sendCommand.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public void setVolumeTo(int i, int i2) {
                        try {
/* 4 */                     this.mBinder.setVolumeTo(i, i2, null);
                        } catch (RemoteException e) {
/* 13 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in setVolumeTo.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public void unregisterCallback(Callback callback) {
/* 1 */                 if (callback == null) {
/* 34 */                    C1951n4.m6859j("callback may not be null.");
/* 37 */                    return;
                        }
                        try {
/* 9 */                     this.mBinder.unregisterCallbackListener((IMediaControllerCallback) callback.mCallbackObj);
/* 19 */                    this.mBinder.asBinder().unlinkToDeath(callback, 0);
                        } catch (RemoteException e) {
/* 28 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in unregisterCallback.", e);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
/* 38 */            public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                        try {
                            if ((this.mBinder.getFlags() & 4) != 0) {
/* 40 */                        this.mBinder.addQueueItemAt(mediaDescriptionCompat, i);
                                return;
                            }
/* 41 */                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                        } catch (RemoteException e) {
/* 42 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in addQueueItemAt.", e);
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 40 */        public static class MediaControllerImplApi21 implements MediaControllerImpl {
                    protected final Object mControllerObj;
                    final MediaSessionCompat.Token mSessionToken;
                    final Object mLock = new Object();
                    private final List<Callback> mPendingCallbacks = new ArrayList();
                    private HashMap<Callback, ExtraCallback> mCallbackMap = new HashMap<>();

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static class ExtraBinderRequestResultReceiver extends ResultReceiver {
                        private WeakReference<MediaControllerImplApi21> mMediaControllerImpl;

                        public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
/* 2 */                     super(null);
/* 10 */                    this.mMediaControllerImpl = new WeakReference<>(mediaControllerImplApi21);
                        }

                        @Override // android.os.ResultReceiver
                        public void onReceiveResult(int i, Bundle bundle) {
/* 3 */                     MediaControllerImplApi21 mediaControllerImplApi21 = this.mMediaControllerImpl.get();
/* 9 */                     if (mediaControllerImplApi21 == null || bundle == null) {
/* 51 */                        return;
                            }
                            synchronized (mediaControllerImplApi21.mLock) {
/* 29 */                        mediaControllerImplApi21.mSessionToken.setExtraBinder(IMediaSession.Stub.asInterface(bundle.getBinder(MediaSessionCompat.KEY_EXTRA_BINDER)));
/* 40 */                        mediaControllerImplApi21.mSessionToken.setSessionToken2Bundle(bundle.getBundle(MediaSessionCompat.KEY_SESSION_TOKEN2_BUNDLE));
/* 43 */                        mediaControllerImplApi21.processPendingCallbacksLocked();
                            }
                        }
                    }

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static class ExtraCallback extends Callback.StubCompat {
                        public ExtraCallback(Callback callback) {
/* 1 */                     super(callback);
                        }

                        @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
                        public void onExtrasChanged(Bundle bundle) throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
                        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
                        public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
                        public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
                        public void onSessionDestroyed() throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
                        public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }
                    }

                    public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) throws RemoteException {
/* 25 */                this.mSessionToken = token;
/* 31 */                Object objFromToken = MediaControllerCompatApi21.fromToken(context, token.getToken());
/* 35 */                this.mControllerObj = objFromToken;
/* 37 */                if (objFromToken == null) {
/* 54 */                    throw new RemoteException();
                        }
/* 43 */                if (token.getExtraBinder() == null) {
/* 45 */                    requestExtraBinder();
                        }
                    }

                    private void requestExtraBinder() {
/* 9 */                 sendCommand(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER, null, new ExtraBinderRequestResultReceiver(this));
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
/* 12 */                if ((getFlags() & 4) == 0) {
/* 38 */                    C1951n4.m6866q("This session doesn't support queue management operations");
/* 41 */                    return;
                        }
/* 16 */                Bundle bundle = new Bundle();
/* 21 */                bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mediaDescriptionCompat);
/* 26 */                bundle.putInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, i);
/* 32 */                sendCommand(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT, bundle, null);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public void adjustVolume(int i, int i2) {
/* 3 */                 MediaControllerCompatApi21.adjustVolume(this.mControllerObj, i, i2);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
/* 3 */                 return MediaControllerCompatApi21.dispatchMediaButtonEvent(this.mControllerObj, keyEvent);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public Bundle getExtras() {
/* 3 */                 return MediaControllerCompatApi21.getExtras(this.mControllerObj);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public long getFlags() {
/* 3 */                 return MediaControllerCompatApi21.getFlags(this.mControllerObj);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public Object getMediaController() {
/* 1 */                 return this.mControllerObj;
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public MediaMetadataCompat getMetadata() {
/* 3 */                 Object metadata = MediaControllerCompatApi21.getMetadata(this.mControllerObj);
/* 7 */                 if (metadata != null) {
/* 9 */                     return MediaMetadataCompat.fromMediaMetadata(metadata);
                        }
/* 14 */                return null;
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public String getPackageName() {
/* 3 */                 return MediaControllerCompatApi21.getPackageName(this.mControllerObj);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public PlaybackInfo getPlaybackInfo() {
/* 3 */                 Object playbackInfo = MediaControllerCompatApi21.getPlaybackInfo(this.mControllerObj);
/* 7 */                 if (playbackInfo != null) {
/* 31 */                    return new PlaybackInfo(MediaControllerCompatApi21.PlaybackInfo.getPlaybackType(playbackInfo), MediaControllerCompatApi21.PlaybackInfo.getLegacyAudioStream(playbackInfo), MediaControllerCompatApi21.PlaybackInfo.getVolumeControl(playbackInfo), MediaControllerCompatApi21.PlaybackInfo.getMaxVolume(playbackInfo), MediaControllerCompatApi21.PlaybackInfo.getCurrentVolume(playbackInfo));
                        }
/* 35 */                return null;
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public PlaybackStateCompat getPlaybackState() {
/* 7 */                 if (this.mSessionToken.getExtraBinder() != null) {
                            try {
/* 15 */                        return this.mSessionToken.getExtraBinder().getPlaybackState();
                            } catch (RemoteException e) {
/* 25 */                        AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in getPlaybackState.", e);
                            }
                        }
/* 30 */                Object playbackState = MediaControllerCompatApi21.getPlaybackState(this.mControllerObj);
/* 34 */                if (playbackState != null) {
/* 36 */                    return PlaybackStateCompat.fromPlaybackState(playbackState);
                        }
/* 41 */                return null;
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public List<MediaSessionCompat.QueueItem> getQueue() {
/* 3 */                 List<Object> queue = MediaControllerCompatApi21.getQueue(this.mControllerObj);
/* 7 */                 if (queue != null) {
/* 9 */                     return MediaSessionCompat.QueueItem.fromQueueItemList(queue);
                        }
/* 14 */                return null;
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public CharSequence getQueueTitle() {
/* 3 */                 return MediaControllerCompatApi21.getQueueTitle(this.mControllerObj);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public int getRatingType() {
/* 3 */                 return MediaControllerCompatApi21.getRatingType(this.mControllerObj);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public int getRepeatMode() {
/* 7 */                 if (this.mSessionToken.getExtraBinder() == null) {
/* 28 */                    return -1;
                        }
                        try {
/* 15 */                    return this.mSessionToken.getExtraBinder().getRepeatMode();
                        } catch (RemoteException e) {
/* 25 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in getRepeatMode.", e);
/* 28 */                    return -1;
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public PendingIntent getSessionActivity() {
/* 3 */                 return MediaControllerCompatApi21.getSessionActivity(this.mControllerObj);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public int getShuffleMode() {
/* 7 */                 if (this.mSessionToken.getExtraBinder() == null) {
/* 28 */                    return -1;
                        }
                        try {
/* 15 */                    return this.mSessionToken.getExtraBinder().getShuffleMode();
                        } catch (RemoteException e) {
/* 25 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in getShuffleMode.", e);
/* 28 */                    return -1;
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public TransportControls getTransportControls() {
/* 3 */                 Object transportControls = MediaControllerCompatApi21.getTransportControls(this.mControllerObj);
/* 7 */                 if (transportControls != null) {
/* 11 */                    return new TransportControlsApi21(transportControls);
                        }
/* 15 */                return null;
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public boolean isCaptioningEnabled() {
/* 7 */                 if (this.mSessionToken.getExtraBinder() == null) {
/* 28 */                    return false;
                        }
                        try {
/* 15 */                    return this.mSessionToken.getExtraBinder().isCaptioningEnabled();
                        } catch (RemoteException e) {
/* 25 */                    AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in isCaptioningEnabled.", e);
/* 28 */                    return false;
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public boolean isSessionReady() {
                        return this.mSessionToken.getExtraBinder() != null;
                    }

                    public void processPendingCallbacksLocked() {
/* 7 */                 if (this.mSessionToken.getExtraBinder() == null) {
/* 9 */                     return;
                        }
/* 20 */                for (Callback callback : this.mPendingCallbacks) {
/* 30 */                    ExtraCallback extraCallback = new ExtraCallback(callback);
/* 35 */                    this.mCallbackMap.put(callback, extraCallback);
/* 38 */                    callback.mIControllerCallback = extraCallback;
                            try {
/* 46 */                        this.mSessionToken.getExtraBinder().registerCallbackListener(extraCallback);
/* 52 */                        callback.postToHandler(13, null, null);
                            } catch (RemoteException e) {
/* 61 */                        AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in registerCallback.", e);
                            }
                        }
/* 66 */                this.mPendingCallbacks.clear();
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public final void registerCallback(Callback callback, Handler handler) {
/* 5 */                 MediaControllerCompatApi21.registerCallback(this.mControllerObj, callback.mCallbackObj, handler);
                        synchronized (this.mLock) {
/* 18 */                    if (this.mSessionToken.getExtraBinder() != null) {
/* 22 */                        ExtraCallback extraCallback = new ExtraCallback(callback);
/* 27 */                        this.mCallbackMap.put(callback, extraCallback);
/* 30 */                        callback.mIControllerCallback = extraCallback;
                                try {
/* 38 */                            this.mSessionToken.getExtraBinder().registerCallbackListener(extraCallback);
/* 43 */                            callback.postToHandler(13, null, null);
                                } catch (RemoteException e) {
/* 54 */                            AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in registerCallback.", e);
                                }
                            } else {
/* 58 */                        callback.mIControllerCallback = null;
/* 62 */                        this.mPendingCallbacks.add(callback);
                            }
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
/* 12 */                if ((getFlags() & 4) == 0) {
/* 33 */                    C1951n4.m6866q("This session doesn't support queue management operations");
/* 36 */                    return;
                        }
/* 16 */                Bundle bundle = new Bundle();
/* 21 */                bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mediaDescriptionCompat);
/* 27 */                sendCommand(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM, bundle, null);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
/* 3 */                 MediaControllerCompatApi21.sendCommand(this.mControllerObj, str, bundle, resultReceiver);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public void setVolumeTo(int i, int i2) {
/* 3 */                 MediaControllerCompatApi21.setVolumeTo(this.mControllerObj, i, i2);
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
                    public final void unregisterCallback(Callback callback) {
/* 5 */                 MediaControllerCompatApi21.unregisterCallback(this.mControllerObj, callback.mCallbackObj);
                        synchronized (this.mLock) {
/* 17 */                    if (this.mSessionToken.getExtraBinder() != null) {
                                try {
/* 21 */                            ExtraCallback extraCallbackRemove = this.mCallbackMap.remove(callback);
/* 27 */                            if (extraCallbackRemove != null) {
/* 30 */                                callback.mIControllerCallback = null;
/* 38 */                                this.mSessionToken.getExtraBinder().unregisterCallbackListener(extraCallbackRemove);
                                    }
                                } catch (RemoteException e) {
/* 49 */                            AbstractC1245n0.m4877e(MediaControllerCompat.TAG, "Dead object in unregisterCallback.", e);
                                }
                            } else {
/* 55 */                        this.mPendingCallbacks.remove(callback);
                            }
                        }
                    }

                    @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
/* 41 */            public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                        if ((getFlags() & 4) != 0) {
/* 43 */                    Bundle bundle = new Bundle();
/* 44 */                    bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mediaDescriptionCompat);
/* 45 */                    sendCommand(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM, bundle, null);
                            return;
                        }
/* 46 */                C1951n4.m6866q("This session doesn't support queue management operations");
                    }
                }

/* 43 */        public MediaControllerCompat(Context context, MediaSessionCompat.Token token) throws RemoteException {
                    if (token != null) {
/* 46 */                this.mToken = token;
/* 47 */                this.mImpl = new MediaControllerImplApi24(context, token);
                    } else {
/* 48 */                C1951n4.m6859j("sessionToken must not be null");
                        throw null;
                    }
                }

/* 53 */        public Object getMediaController() {
/* 54 */            return this.mImpl.getMediaController();
                }
            }
