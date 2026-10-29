            package android.support.v4.media.session;

            import android.app.PendingIntent;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ActivityInfo;
            import android.content.pm.ResolveInfo;
            import android.graphics.Bitmap;
            import android.media.AudioManager;
            import android.media.Rating;
            import android.media.RemoteControlClient;
            import android.media.session.MediaSession;
            import android.media.session.MediaSessionManager;
            import android.net.Uri;
            import android.os.BadParcelableException;
            import android.os.Binder;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.IBinder;
            import android.os.Looper;
            import android.os.Message;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.RemoteCallbackList;
            import android.os.RemoteException;
            import android.os.ResultReceiver;
            import android.os.SystemClock;
            import android.support.v4.media.MediaDescriptionCompat;
            import android.support.v4.media.MediaMetadataCompat;
            import android.support.v4.media.RatingCompat;
            import android.text.TextUtils;
            import android.util.TypedValue;
            import android.view.KeyEvent;
            import android.view.ViewConfiguration;
            import androidx.core.app.NotificationCompat;
            import androidx.media.session.MediaButtonReceiver;
            import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import p000.C1951n4;
            import p000.c63;
            import p000.d63;
            import p000.fm0;
            import p000.pf1;
            import p000.rf1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 2 */     public class MediaSessionCompat {
                public static final String ACTION_ARGUMENT_CAPTIONING_ENABLED = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
                public static final String ACTION_ARGUMENT_EXTRAS = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
                public static final String ACTION_ARGUMENT_MEDIA_ID = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
                public static final String ACTION_ARGUMENT_QUERY = "android.support.v4.media.session.action.ARGUMENT_QUERY";
                public static final String ACTION_ARGUMENT_RATING = "android.support.v4.media.session.action.ARGUMENT_RATING";
                public static final String ACTION_ARGUMENT_REPEAT_MODE = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
                public static final String ACTION_ARGUMENT_SHUFFLE_MODE = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
                public static final String ACTION_ARGUMENT_URI = "android.support.v4.media.session.action.ARGUMENT_URI";
                public static final String ACTION_FLAG_AS_INAPPROPRIATE = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";
                public static final String ACTION_FOLLOW = "android.support.v4.media.session.action.FOLLOW";
                public static final String ACTION_PLAY_FROM_URI = "android.support.v4.media.session.action.PLAY_FROM_URI";
                public static final String ACTION_PREPARE = "android.support.v4.media.session.action.PREPARE";
                public static final String ACTION_PREPARE_FROM_MEDIA_ID = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
                public static final String ACTION_PREPARE_FROM_SEARCH = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
                public static final String ACTION_PREPARE_FROM_URI = "android.support.v4.media.session.action.PREPARE_FROM_URI";
                public static final String ACTION_SET_CAPTIONING_ENABLED = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
                public static final String ACTION_SET_RATING = "android.support.v4.media.session.action.SET_RATING";
                public static final String ACTION_SET_REPEAT_MODE = "android.support.v4.media.session.action.SET_REPEAT_MODE";
                public static final String ACTION_SET_SHUFFLE_MODE = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
                public static final String ACTION_SKIP_AD = "android.support.v4.media.session.action.SKIP_AD";
                public static final String ACTION_UNFOLLOW = "android.support.v4.media.session.action.UNFOLLOW";
                public static final String ARGUMENT_MEDIA_ATTRIBUTE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";
                public static final String ARGUMENT_MEDIA_ATTRIBUTE_VALUE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";
                private static final String DATA_CALLING_PACKAGE = "data_calling_pkg";
                private static final String DATA_CALLING_PID = "data_calling_pid";
                private static final String DATA_CALLING_UID = "data_calling_uid";
                private static final String DATA_EXTRAS = "data_extras";
                public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;
                public static final int FLAG_HANDLES_QUEUE_COMMANDS = 4;
                public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;
                public static final String KEY_EXTRA_BINDER = "android.support.v4.media.session.EXTRA_BINDER";
                public static final String KEY_SESSION_TOKEN2_BUNDLE = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE";
                public static final String KEY_TOKEN = "android.support.v4.media.session.TOKEN";
                private static final int MAX_BITMAP_SIZE_IN_DP = 320;
                public static final int MEDIA_ATTRIBUTE_ALBUM = 1;
                public static final int MEDIA_ATTRIBUTE_ARTIST = 0;
                public static final int MEDIA_ATTRIBUTE_PLAYLIST = 2;
                static final String TAG = "MediaSessionCompat";
                static int sMaxBitmapSize;
                private final ArrayList<OnActiveChangeListener> mActiveListeners;
                private final MediaControllerCompat mController;
                private final MediaSessionImpl mImpl;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Callback {
                    private CallbackHandler mCallbackHandler = null;
                    final Object mCallbackObj = MediaSessionCompatApi24.createCallback(new StubApi24());
                    private boolean mMediaPlayPauseKeyPending;
                    WeakReference<MediaSessionImpl> mSessionImpl;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public class CallbackHandler extends Handler {
                        private static final int MSG_MEDIA_PLAY_PAUSE_KEY_DOUBLE_TAP_TIMEOUT = 1;

                        public CallbackHandler(Looper looper) {
/* 3 */                     super(looper);
                        }

                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
/* 4 */                     if (message.what == 1) {
/* 12 */                        Callback.this.handleMediaPlayPauseKeySingleTapIfPending((pf1) message.obj);
                            }
                        }
                    }

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public class StubApi23 extends StubApi21 implements MediaSessionCompatApi23.Callback {
                        public StubApi23() {
/* 3 */                     super();
                        }

                        @Override // android.support.v4.media.session.MediaSessionCompatApi23.Callback
                        public void onPlayFromUri(Uri uri, Bundle bundle) {
/* 3 */                     Callback.this.onPlayFromUri(uri, bundle);
                        }
                    }

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public class StubApi24 extends StubApi23 implements MediaSessionCompatApi24.Callback {
                        public StubApi24() {
/* 3 */                     super();
                        }

                        @Override // android.support.v4.media.session.MediaSessionCompatApi24.Callback
                        public void onPrepare() {
/* 3 */                     Callback.this.onPrepare();
                        }

                        @Override // android.support.v4.media.session.MediaSessionCompatApi24.Callback
                        public void onPrepareFromMediaId(String str, Bundle bundle) {
/* 3 */                     Callback.this.onPrepareFromMediaId(str, bundle);
                        }

                        @Override // android.support.v4.media.session.MediaSessionCompatApi24.Callback
                        public void onPrepareFromSearch(String str, Bundle bundle) {
/* 3 */                     Callback.this.onPrepareFromSearch(str, bundle);
                        }

                        @Override // android.support.v4.media.session.MediaSessionCompatApi24.Callback
                        public void onPrepareFromUri(Uri uri, Bundle bundle) {
/* 3 */                     Callback.this.onPrepareFromUri(uri, bundle);
                        }
                    }

                    public void handleMediaPlayPauseKeySingleTapIfPending(pf1 pf1Var) {
/* 3 */                 if (this.mMediaPlayPauseKeyPending) {
/* 7 */                     this.mMediaPlayPauseKeyPending = false;
/* 12 */                    this.mCallbackHandler.removeMessages(1);
/* 17 */                    MediaSessionImpl mediaSessionImpl = this.mSessionImpl.get();
/* 23 */                    if (mediaSessionImpl == null) {
/* 25 */                        return;
                            }
/* 26 */                    PlaybackStateCompat playbackState = mediaSessionImpl.getPlaybackState();
/* 36 */                    long actions = playbackState == null ? 0L : playbackState.getActions();
/* 51 */                    boolean z = playbackState != null && playbackState.getState() == 3;
/* 61 */                    boolean z2 = (516 & actions) != 0;
/* 67 */                    boolean z3 = (actions & 514) != 0;
/* 70 */                    mediaSessionImpl.setCurrentControllerInfo(pf1Var);
/* 73 */                    if (z && z3) {
/* 77 */                        onPause();
                            } else if (!z && z2) {
/* 85 */                        onPlay();
                            }
/* 89 */                    mediaSessionImpl.setCurrentControllerInfo(null);
                        }
                    }

                    public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                    }

                    public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                    }

                    public void onCustomAction(String str, Bundle bundle) {
                    }

                    public void onFastForward() {
                    }

                    public boolean onMediaButtonEvent(Intent intent) {
                        MediaSessionImpl mediaSessionImpl;
                        KeyEvent keyEvent;
/* 6 */                 if (Build.VERSION.SDK_INT >= 27 || (mediaSessionImpl = this.mSessionImpl.get()) == null || this.mCallbackHandler == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
/* 5 */                     return false;
                        }
/* 41 */                pf1 currentControllerInfo = mediaSessionImpl.getCurrentControllerInfo();
/* 45 */                int keyCode = keyEvent.getKeyCode();
/* 51 */                if (keyCode != 79 && keyCode != 85) {
/* 57 */                    handleMediaPlayPauseKeySingleTapIfPending(currentControllerInfo);
/* 5 */                     return false;
                        }
/* 66 */                if (keyEvent.getRepeatCount() > 0) {
/* 68 */                    handleMediaPlayPauseKeySingleTapIfPending(currentControllerInfo);
                        } else if (this.mMediaPlayPauseKeyPending) {
/* 78 */                    this.mCallbackHandler.removeMessages(1);
/* 81 */                    this.mMediaPlayPauseKeyPending = false;
/* 83 */                    PlaybackStateCompat playbackState = mediaSessionImpl.getPlaybackState();
/* 102 */                   if (((playbackState == null ? 0L : playbackState.getActions()) & 32) != 0) {
/* 104 */                       onSkipToNext();
                            }
                        } else {
/* 108 */                   this.mMediaPlayPauseKeyPending = true;
/* 110 */                   CallbackHandler callbackHandler = this.mCallbackHandler;
/* 121 */                   callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(1, currentControllerInfo), ViewConfiguration.getDoubleTapTimeout());
                        }
/* 65 */                return true;
                    }

                    public void onPause() {
                    }

                    public void onPlay() {
                    }

                    public void onPlayFromMediaId(String str, Bundle bundle) {
                    }

                    public void onPlayFromSearch(String str, Bundle bundle) {
                    }

                    public void onPlayFromUri(Uri uri, Bundle bundle) {
                    }

                    public void onPrepare() {
                    }

                    public void onPrepareFromMediaId(String str, Bundle bundle) {
                    }

                    public void onPrepareFromSearch(String str, Bundle bundle) {
                    }

                    public void onPrepareFromUri(Uri uri, Bundle bundle) {
                    }

                    public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                    }

                    @Deprecated
                    public void onRemoveQueueItemAt(int i) {
                    }

                    public void onRewind() {
                    }

                    public void onSeekTo(long j) {
                    }

                    public void onSetCaptioningEnabled(boolean z) {
                    }

                    public void onSetRating(RatingCompat ratingCompat) {
                    }

                    public void onSetRepeatMode(int i) {
                    }

                    public void onSetShuffleMode(int i) {
                    }

                    public void onSkipToNext() {
                    }

                    public void onSkipToPrevious() {
                    }

                    public void onSkipToQueueItem(long j) {
                    }

                    public void onStop() {
                    }

                    public void setSessionImpl(MediaSessionImpl mediaSessionImpl, Handler handler) {
/* 6 */                 this.mSessionImpl = new WeakReference<>(mediaSessionImpl);
/* 8 */                 CallbackHandler callbackHandler = this.mCallbackHandler;
/* 10 */                if (callbackHandler != null) {
/* 13 */                    callbackHandler.removeCallbacksAndMessages(null);
                        }
/* 25 */                this.mCallbackHandler = new CallbackHandler(handler.getLooper());
                    }

/* 1 */             public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                    }

/* 1 */             public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
                    }

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 9 */             public class StubApi21 implements MediaSessionCompatApi21.Callback {
                        public StubApi21() {
                        }

                        @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
                        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                            try {
/* 7 */                         QueueItem queueItem = null;
/* 7 */                         IBinder iBinderAsBinder = null;
/* 7 */                         queueItem = null;
/* 8 */                         if (str.equals(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER)) {
/* 18 */                            MediaSessionImplApi21 mediaSessionImplApi21 = (MediaSessionImplApi21) Callback.this.mSessionImpl.get();
/* 20 */                            if (mediaSessionImplApi21 != null) {
/* 24 */                                Bundle bundle2 = new Bundle();
/* 27 */                                Token sessionToken = mediaSessionImplApi21.getSessionToken();
/* 31 */                                IMediaSession extraBinder = sessionToken.getExtraBinder();
/* 37 */                                if (extraBinder != null) {
/* 40 */                                    iBinderAsBinder = extraBinder.asBinder();
                                        }
/* 44 */                                bundle2.putBinder(MediaSessionCompat.KEY_EXTRA_BINDER, iBinderAsBinder);
/* 53 */                                bundle2.putBundle(MediaSessionCompat.KEY_SESSION_TOKEN2_BUNDLE, sessionToken.getSessionToken2Bundle());
/* 57 */                                resultReceiver.send(0, bundle2);
/* 60 */                                return;
                                    }
/* 188 */                           return;
                                }
/* 69 */                        if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM)) {
/* 79 */                            Callback.this.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION));
/* 82 */                            return;
                                }
/* 91 */                        if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT)) {
/* 105 */                           Callback.this.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX));
/* 108 */                           return;
                                }
/* 115 */                       if (str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM)) {
/* 125 */                           Callback.this.onRemoveQueueItem((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION));
/* 128 */                           return;
                                }
/* 131 */                       boolean zEquals = str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM_AT);
/* 135 */                       Callback callback = Callback.this;
/* 137 */                       if (!zEquals) {
/* 189 */                           callback.onCommand(str, bundle, resultReceiver);
/* 192 */                           return;
                                }
/* 145 */                       MediaSessionImplApi21 mediaSessionImplApi22 = (MediaSessionImplApi21) callback.mSessionImpl.get();
/* 147 */                       if (mediaSessionImplApi22 == null || mediaSessionImplApi22.mQueue == null) {
/* 188 */                           return;
                                }
/* 154 */                       int i = bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, -1);
/* 158 */                       if (i >= 0 && i < mediaSessionImplApi22.mQueue.size()) {
/* 170 */                           queueItem = mediaSessionImplApi22.mQueue.get(i);
                                }
/* 177 */                       if (queueItem != null) {
/* 185 */                           Callback.this.onRemoveQueueItem(queueItem.getDescription());
                                }
                            } catch (BadParcelableException unused) {
/* 197 */                       AbstractC1245n0.m4876d(MediaSessionCompat.TAG, "Could not unparcel the extra data.");
                            }
                        }

                        @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
                        public void onCustomAction(String str, Bundle bundle) {
/* 3 */                     Bundle bundle2 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
/* 7 */                     MediaSessionCompat.ensureClassLoader(bundle2);
/* 18 */                    if (str.equals(MediaSessionCompat.ACTION_PLAY_FROM_URI)) {
/* 28 */                        Callback.this.onPlayFromUri((Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI), bundle2);
/* 31 */                        return;
                            }
/* 38 */                    if (str.equals(MediaSessionCompat.ACTION_PREPARE)) {
/* 42 */                        Callback.this.onPrepare();
/* 45 */                        return;
                            }
/* 52 */                    if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
/* 62 */                        Callback.this.onPrepareFromMediaId(bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID), bundle2);
/* 65 */                        return;
                            }
/* 72 */                    if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH)) {
/* 82 */                        Callback.this.onPrepareFromSearch(bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_QUERY), bundle2);
/* 85 */                        return;
                            }
/* 92 */                    if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_URI)) {
/* 102 */                       Callback.this.onPrepareFromUri((Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI), bundle2);
/* 105 */                       return;
                            }
/* 112 */                   if (str.equals(MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED)) {
/* 122 */                       Callback.this.onSetCaptioningEnabled(bundle.getBoolean(MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED));
/* 125 */                       return;
                            }
/* 132 */                   if (str.equals(MediaSessionCompat.ACTION_SET_REPEAT_MODE)) {
/* 142 */                       Callback.this.onSetRepeatMode(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE));
                            } else if (str.equals(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE)) {
/* 162 */                       Callback.this.onSetShuffleMode(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE));
                            } else if (!str.equals(MediaSessionCompat.ACTION_SET_RATING)) {
/* 190 */                       Callback.this.onCustomAction(str, bundle);
                            } else {
/* 184 */                       Callback.this.onSetRating((RatingCompat) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_RATING), bundle2);
                            }
                        }

                        @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
                        public void onFastForward() {
/* 3 */                     Callback.this.onFastForward();
                        }

                        @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
                        public boolean onMediaButtonEvent(Intent intent) {
/* 3 */                     return Callback.this.onMediaButtonEvent(intent);
                        }

                        @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
                        public void onPause() {
/* 3 */                     Callback.this.onPause();
                        }

                        @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
                        public void onPlay() {
/* 3 */                     Callback.this.onPlay();
                        }

                        @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
                        public void onPlayFromMediaId(String str, Bundle bundle) {
/* 3 */                     Callback.this.onPlayFromMediaId(str, bundle);
                        }

                        @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
                        public void onPlayFromSearch(String str, Bundle bundle) {
/* 3 */                     Callback.this.onPlayFromSearch(str, bundle);
                        }

                        @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
                        public void onRewind() {
/* 3 */                     Callback.this.onRewind();
                        }

                        @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
                        public void onSeekTo(long j) {
/* 3 */                     Callback.this.onSeekTo(j);
                        }

                        @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
                        public void onSetRating(Object obj) {
/* 7 */                     Callback.this.onSetRating(RatingCompat.fromRating(obj));
                        }

                        @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
                        public void onSkipToNext() {
/* 3 */                     Callback.this.onSkipToNext();
                        }

                        @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
                        public void onSkipToPrevious() {
/* 3 */                     Callback.this.onSkipToPrevious();
                        }

                        @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
                        public void onSkipToQueueItem(long j) {
/* 3 */                     Callback.this.onSkipToQueueItem(j);
                        }

                        @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
                        public void onStop() {
/* 3 */                     Callback.this.onStop();
                        }

                        @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
/* 10 */                public void onSetRating(Object obj, Bundle bundle) {
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface MediaSessionImpl {
                    String getCallingPackage();

                    pf1 getCurrentControllerInfo();

                    Object getMediaSession();

                    PlaybackStateCompat getPlaybackState();

                    Object getRemoteControlClient();

                    Token getSessionToken();

                    boolean isActive();

                    void release();

                    void sendSessionEvent(String str, Bundle bundle);

                    void setActive(boolean z);

                    void setCallback(Callback callback, Handler handler);

                    void setCaptioningEnabled(boolean z);

                    void setCurrentControllerInfo(pf1 pf1Var);

                    void setExtras(Bundle bundle);

                    void setFlags(int i);

                    void setMediaButtonReceiver(PendingIntent pendingIntent);

                    void setMetadata(MediaMetadataCompat mediaMetadataCompat);

                    void setPlaybackState(PlaybackStateCompat playbackStateCompat);

                    void setPlaybackToLocal(int i);

                    void setPlaybackToRemote(d63 d63Var);

                    void setQueue(List<QueueItem> list);

                    void setQueueTitle(CharSequence charSequence);

                    void setRatingType(int i);

                    void setRepeatMode(int i);

                    void setSessionActivity(PendingIntent pendingIntent);

                    void setShuffleMode(int i);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class MediaSessionImplApi18 extends MediaSessionImplBase {
                    private static boolean sIsMbrPendingIntentSupported = true;

                    public MediaSessionImplApi18(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
/* 1 */                 super(context, str, componentName, pendingIntent);
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
                    public int getRccTransportControlFlagsFromActions(long j) {
/* 1 */                 int rccTransportControlFlagsFromActions = super.getRccTransportControlFlagsFromActions(j);
                        return (j & 256) != 0 ? rccTransportControlFlagsFromActions | NotificationCompat.FLAG_LOCAL_ONLY : rccTransportControlFlagsFromActions;
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
                    public void registerMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
/* 3 */                 if (sIsMbrPendingIntentSupported) {
                            try {
/* 7 */                         this.mAudioManager.registerMediaButtonEventReceiver(pendingIntent);
                            } catch (NullPointerException unused) {
/* 15 */                        AbstractC1245n0.m4889q(MediaSessionCompat.TAG, "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
/* 19 */                        sIsMbrPendingIntentSupported = false;
                            }
                        }
/* 23 */                if (sIsMbrPendingIntentSupported) {
/* 28 */                    return;
                        }
/* 25 */                super.registerMediaButtonEventReceiver(pendingIntent, componentName);
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setCallback(Callback callback, Handler handler) {
/* 1 */                 super.setCallback(callback, handler);
/* 4 */                 if (callback == null) {
/* 9 */                     this.mRcc.setPlaybackPositionUpdateListener(null);
                        } else {
/* 20 */                    this.mRcc.setPlaybackPositionUpdateListener(new RemoteControlClient.OnPlaybackPositionUpdateListener() { // from class: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18.1
                                @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
                                public void onPlaybackPositionUpdate(long j) {
/* 12 */                            MediaSessionImplApi18.this.postToHandler(18, -1, -1, Long.valueOf(j), null);
                                }
                            });
                        }
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
                    public void setRccState(PlaybackStateCompat playbackStateCompat) {
/* 1 */                 long position = playbackStateCompat.getPosition();
/* 5 */                 float playbackSpeed = playbackStateCompat.getPlaybackSpeed();
/* 9 */                 long lastPositionUpdateTime = playbackStateCompat.getLastPositionUpdateTime();
/* 13 */                long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 22 */                if (playbackStateCompat.getState() == 3) {
/* 24 */                    long j = 0;
/* 28 */                    if (position > 0) {
/* 32 */                        if (lastPositionUpdateTime > 0) {
/* 34 */                            j = jElapsedRealtime - lastPositionUpdateTime;
/* 39 */                            if (playbackSpeed > 0.0f && playbackSpeed != 1.0f) {
/* 49 */                                j = (long) (j * playbackSpeed);
                                    }
                                }
/* 50 */                        position += j;
                            }
                        }
/* 61 */                this.mRcc.setPlaybackState(getRccStateFromState(playbackStateCompat.getState()), position, playbackSpeed);
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
                    public void unregisterMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
/* 3 */                 if (sIsMbrPendingIntentSupported) {
/* 7 */                     this.mAudioManager.unregisterMediaButtonEventReceiver(pendingIntent);
                        } else {
/* 11 */                    super.unregisterMediaButtonEventReceiver(pendingIntent, componentName);
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class MediaSessionImplApi19 extends MediaSessionImplApi18 {
                    public MediaSessionImplApi19(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
/* 1 */                 super(context, str, componentName, pendingIntent);
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
                    public RemoteControlClient.MetadataEditor buildRccMetadata(Bundle bundle) {
/* 1 */                 RemoteControlClient.MetadataEditor metadataEditorBuildRccMetadata = super.buildRccMetadata(bundle);
/* 5 */                 PlaybackStateCompat playbackStateCompat = this.mState;
/* 25 */                if (((playbackStateCompat == null ? 0L : playbackStateCompat.getActions()) & 128) != 0) {
/* 27 */                    metadataEditorBuildRccMetadata.addEditableKey(268435457);
                        }
/* 30 */                if (bundle != null) {
/* 39 */                    if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_YEAR)) {
/* 47 */                        metadataEditorBuildRccMetadata.putLong(8, bundle.getLong(MediaMetadataCompat.METADATA_KEY_YEAR));
                            }
/* 56 */                    if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_RATING)) {
/* 64 */                        metadataEditorBuildRccMetadata.putObject(ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE, (Object) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_RATING));
                            }
/* 73 */                    if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_USER_RATING)) {
/* 79 */                        metadataEditorBuildRccMetadata.putObject(268435457, (Object) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_USER_RATING));
                            }
                        }
/* 82 */                return metadataEditorBuildRccMetadata;
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18, android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
                    public int getRccTransportControlFlagsFromActions(long j) {
/* 1 */                 int rccTransportControlFlagsFromActions = super.getRccTransportControlFlagsFromActions(j);
                        return (j & 128) != 0 ? rccTransportControlFlagsFromActions | NotificationCompat.FLAG_GROUP_SUMMARY : rccTransportControlFlagsFromActions;
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18, android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setCallback(Callback callback, Handler handler) {
/* 1 */                 super.setCallback(callback, handler);
/* 4 */                 if (callback == null) {
/* 9 */                     this.mRcc.setMetadataUpdateListener(null);
                        } else {
/* 20 */                    this.mRcc.setMetadataUpdateListener(new RemoteControlClient.OnMetadataUpdateListener() { // from class: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi19.1
                                @Override // android.media.RemoteControlClient.OnMetadataUpdateListener
                                public void onMetadataUpdate(int i, Object obj) {
/* 4 */                             if (i == 268435457 && (obj instanceof Rating)) {
/* 21 */                                MediaSessionImplApi19.this.postToHandler(19, -1, -1, RatingCompat.fromRating(obj), null);
                                    }
                                }
                            });
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface OnActiveChangeListener {
                    void onActiveChanged();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Retention(RetentionPolicy.SOURCE)
                public @interface SessionFlags {
                }

                private MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
/* 9 */             this.mActiveListeners = new ArrayList<>();
/* 11 */            ComponentName componentName2 = null;
/* 12 */            if (context == null) {
/* 195 */               C1951n4.m6859j("context must not be null");
/* 198 */               throw null;
                    }
/* 18 */            if (TextUtils.isEmpty(str)) {
/* 189 */               C1951n4.m6859j("tag must not be null or empty");
/* 192 */               throw null;
                    }
/* 24 */            if (componentName == null) {
/* 26 */                int i = MediaButtonReceiver.f1553a;
/* 30 */                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
/* 37 */                intent.setPackage(context.getPackageName());
/* 44 */                List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
/* 52 */                if (listQueryBroadcastReceivers.size() == 1) {
/* 62 */                    ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
/* 68 */                    componentName2 = new ComponentName(activityInfo.packageName, activityInfo.name);
                        } else if (listQueryBroadcastReceivers.size() > 1) {
/* 83 */                    AbstractC1245n0.m4889q("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                        }
/* 71 */                componentName = componentName2;
/* 87 */                if (componentName == null) {
/* 93 */                    AbstractC1245n0.m4889q(TAG, "Couldn't find a unique registered media button receiver in the given context.");
                        }
                    }
/* 96 */            if (componentName != null && pendingIntent == null) {
/* 102 */               Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
/* 105 */               intent2.setComponent(componentName);
/* 108 */               pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 0);
                    }
/* 116 */           if (Build.VERSION.SDK_INT >= 28) {
/* 120 */               MediaSessionImplApi28 mediaSessionImplApi28 = new MediaSessionImplApi28(context, str, bundle);
/* 123 */               this.mImpl = mediaSessionImplApi28;
/* 130 */               setCallback(new Callback() { // from class: android.support.v4.media.session.MediaSessionCompat.1
                        });
/* 133 */               mediaSessionImplApi28.setMediaButtonReceiver(pendingIntent);
                    } else {
/* 139 */               MediaSessionImplApi21 mediaSessionImplApi21 = new MediaSessionImplApi21(context, str, bundle);
/* 142 */               this.mImpl = mediaSessionImplApi21;
/* 149 */               setCallback(new Callback() { // from class: android.support.v4.media.session.MediaSessionCompat.2
                        });
/* 152 */               mediaSessionImplApi21.setMediaButtonReceiver(pendingIntent);
                    }
/* 160 */           this.mController = new MediaControllerCompat(context, this);
/* 164 */           if (sMaxBitmapSize == 0) {
/* 184 */               sMaxBitmapSize = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    }
                }

                public static void ensureClassLoader(Bundle bundle) {
/* 1 */             if (bundle != null) {
/* 9 */                 bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
                    }
                }

                public static MediaSessionCompat fromMediaSession(Context context, Object obj) {
/* 1 */             if (context == null || obj == null) {
/* 16 */                return null;
                    }
/* 12 */            return new MediaSessionCompat(context, new MediaSessionImplApi21(obj));
                }

                public static PlaybackStateCompat getStateWithUpdatedPosition(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
                    long j;
/* 1 */             if (playbackStateCompat == null) {
/* 115 */               return playbackStateCompat;
                    }
/* 7 */             long j2 = -1;
/* 11 */            if (playbackStateCompat.getPosition() == -1) {
/* 115 */               return playbackStateCompat;
                    }
/* 19 */            if (playbackStateCompat.getState() != 3 && playbackStateCompat.getState() != 4 && playbackStateCompat.getState() != 5) {
/* 115 */               return playbackStateCompat;
                    }
/* 35 */            long lastPositionUpdateTime = playbackStateCompat.getLastPositionUpdateTime();
/* 43 */            if (lastPositionUpdateTime <= 0) {
/* 115 */               return playbackStateCompat;
                    }
/* 45 */            long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 62 */            long position = playbackStateCompat.getPosition() + ((long) (playbackStateCompat.getPlaybackSpeed() * (jElapsedRealtime - lastPositionUpdateTime)));
/* 63 */            if (mediaMetadataCompat != null && mediaMetadataCompat.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
/* 73 */                j2 = mediaMetadataCompat.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
                    }
/* 79 */            if (j2 < 0 || position <= j2) {
/* 93 */                j = position < 0 ? 0L : position;
                    } else {
/* 85 */                j = j2;
                    }
/* 111 */           return new PlaybackStateCompat.Builder(playbackStateCompat).setState(playbackStateCompat.getState(), j, playbackStateCompat.getPlaybackSpeed(), jElapsedRealtime).build();
                }

                public void addOnActiveChangeListener(OnActiveChangeListener onActiveChangeListener) {
/* 1 */             if (onActiveChangeListener != null) {
/* 5 */                 this.mActiveListeners.add(onActiveChangeListener);
                    } else {
/* 11 */                C1951n4.m6859j("Listener may not be null");
                    }
                }

                public String getCallingPackage() {
/* 3 */             return this.mImpl.getCallingPackage();
                }

                public MediaControllerCompat getController() {
/* 1 */             return this.mController;
                }

                public final pf1 getCurrentControllerInfo() {
/* 3 */             return this.mImpl.getCurrentControllerInfo();
                }

                public Object getMediaSession() {
/* 3 */             return this.mImpl.getMediaSession();
                }

                public Object getRemoteControlClient() {
/* 3 */             return this.mImpl.getRemoteControlClient();
                }

                public Token getSessionToken() {
/* 3 */             return this.mImpl.getSessionToken();
                }

                public boolean isActive() {
/* 3 */             return this.mImpl.isActive();
                }

                public void release() {
/* 3 */             this.mImpl.release();
                }

                public void removeOnActiveChangeListener(OnActiveChangeListener onActiveChangeListener) {
/* 1 */             if (onActiveChangeListener != null) {
/* 5 */                 this.mActiveListeners.remove(onActiveChangeListener);
                    } else {
/* 11 */                C1951n4.m6859j("Listener may not be null");
                    }
                }

                public void sendSessionEvent(String str, Bundle bundle) {
/* 5 */             if (TextUtils.isEmpty(str)) {
/* 15 */                C1951n4.m6859j("event cannot be null or empty");
                    } else {
/* 9 */                 this.mImpl.sendSessionEvent(str, bundle);
                    }
                }

                public void setActive(boolean z) {
/* 3 */             this.mImpl.setActive(z);
/* 8 */             Iterator<OnActiveChangeListener> it = this.mActiveListeners.iterator();
/* 16 */            while (it.hasNext()) {
/* 24 */                it.next().onActiveChanged();
                    }
                }

                public void setCallback(Callback callback, Handler handler) {
/* 1 */             MediaSessionImpl mediaSessionImpl = this.mImpl;
/* 3 */             if (callback == null) {
/* 6 */                 mediaSessionImpl.setCallback(null, null);
/* 9 */                 return;
                    }
/* 10 */            if (handler == null) {
/* 15 */                handler = new Handler();
                    }
/* 18 */            mediaSessionImpl.setCallback(callback, handler);
                }

                public void setCaptioningEnabled(boolean z) {
/* 3 */             this.mImpl.setCaptioningEnabled(z);
                }

                public void setExtras(Bundle bundle) {
/* 3 */             this.mImpl.setExtras(bundle);
                }

                public void setFlags(int i) {
/* 3 */             this.mImpl.setFlags(i);
                }

                public void setMediaButtonReceiver(PendingIntent pendingIntent) {
/* 3 */             this.mImpl.setMediaButtonReceiver(pendingIntent);
                }

                public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
/* 3 */             this.mImpl.setMetadata(mediaMetadataCompat);
                }

                public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
/* 3 */             this.mImpl.setPlaybackState(playbackStateCompat);
                }

                public void setPlaybackToLocal(int i) {
/* 3 */             this.mImpl.setPlaybackToLocal(i);
                }

                public void setPlaybackToRemote(d63 d63Var) {
/* 8 */             throw new IllegalArgumentException("volumeProvider may not be null!");
                }

                public void setQueue(List<QueueItem> list) {
/* 3 */             this.mImpl.setQueue(list);
                }

                public void setQueueTitle(CharSequence charSequence) {
/* 3 */             this.mImpl.setQueueTitle(charSequence);
                }

                public void setRatingType(int i) {
/* 3 */             this.mImpl.setRatingType(i);
                }

                public void setRepeatMode(int i) {
/* 3 */             this.mImpl.setRepeatMode(i);
                }

                public void setSessionActivity(PendingIntent pendingIntent) {
/* 3 */             this.mImpl.setSessionActivity(pendingIntent);
                }

                public void setShuffleMode(int i) {
/* 3 */             this.mImpl.setShuffleMode(i);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 3 */         public static class MediaSessionImplApi28 extends MediaSessionImplApi21 {
                    public MediaSessionImplApi28(Context context, String str, Bundle bundle) {
/* 1 */                 super(context, str, bundle);
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public final pf1 getCurrentControllerInfo() {
/* 1 */                 MediaSessionManager.RemoteUserInfo currentControllerInfo = ((MediaSession) this.mSessionObj).getCurrentControllerInfo();
/* 11 */                pf1 pf1Var = new pf1();
/* 19 */                pf1Var.f15098a = new rf1(currentControllerInfo);
/* 21 */                return pf1Var;
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setCurrentControllerInfo(pf1 pf1Var) {
                    }

/* 4 */             public MediaSessionImplApi28(Object obj) {
/* 5 */                 super(obj);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 9 */         public static class MediaSessionImplBase implements MediaSessionImpl {
                    static final int RCC_PLAYSTATE_NONE = 0;
                    final AudioManager mAudioManager;
                    volatile Callback mCallback;
                    boolean mCaptioningEnabled;
                    private final Context mContext;
                    Bundle mExtras;
                    int mFlags;
                    private MessageHandler mHandler;
                    int mLocalStream;
                    private final ComponentName mMediaButtonReceiverComponentName;
                    private final PendingIntent mMediaButtonReceiverIntent;
                    MediaMetadataCompat mMetadata;
                    final String mPackageName;
                    List<QueueItem> mQueue;
                    CharSequence mQueueTitle;
                    int mRatingType;
                    final RemoteControlClient mRcc;
                    private pf1 mRemoteUserInfo;
                    int mRepeatMode;
                    PendingIntent mSessionActivity;
                    int mShuffleMode;
                    PlaybackStateCompat mState;
                    private final MediaSessionStub mStub;
                    final String mTag;
                    private final Token mToken;
                    d63 mVolumeProvider;
                    int mVolumeType;
                    final Object mLock = new Object();
                    final RemoteCallbackList<IMediaControllerCallback> mControllerCallbacks = new RemoteCallbackList<>();
                    boolean mDestroyed = false;
                    boolean mIsActive = false;
                    private boolean mIsMbrRegistered = false;
                    private boolean mIsRccRegistered = false;
                    private c63 mVolumeCallback = new c63() { // from class: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.1
                        public void onVolumeChanged(d63 d63Var) {
/* 3 */                     MediaSessionImplBase.this.getClass();
/* 8 */                     MediaSessionImplBase mediaSessionImplBase = MediaSessionImplBase.this;
/* 10 */                    int i = mediaSessionImplBase.mVolumeType;
/* 12 */                    int i2 = mediaSessionImplBase.mLocalStream;
/* 15 */                    throw null;
                        }
                    };

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static final class Command {
                        public final String command;
                        public final Bundle extras;
                        public final ResultReceiver stub;

                        public Command(String str, Bundle bundle, ResultReceiver resultReceiver) {
/* 4 */                     this.command = str;
/* 6 */                     this.extras = bundle;
/* 8 */                     this.stub = resultReceiver;
                        }
                    }

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public class MessageHandler extends Handler {
                        private static final int KEYCODE_MEDIA_PAUSE = 127;
                        private static final int KEYCODE_MEDIA_PLAY = 126;
                        private static final int MSG_ADD_QUEUE_ITEM = 25;
                        private static final int MSG_ADD_QUEUE_ITEM_AT = 26;
                        private static final int MSG_ADJUST_VOLUME = 2;
                        private static final int MSG_COMMAND = 1;
                        private static final int MSG_CUSTOM_ACTION = 20;
                        private static final int MSG_FAST_FORWARD = 16;
                        private static final int MSG_MEDIA_BUTTON = 21;
                        private static final int MSG_NEXT = 14;
                        private static final int MSG_PAUSE = 12;
                        private static final int MSG_PLAY = 7;
                        private static final int MSG_PLAY_MEDIA_ID = 8;
                        private static final int MSG_PLAY_SEARCH = 9;
                        private static final int MSG_PLAY_URI = 10;
                        private static final int MSG_PREPARE = 3;
                        private static final int MSG_PREPARE_MEDIA_ID = 4;
                        private static final int MSG_PREPARE_SEARCH = 5;
                        private static final int MSG_PREPARE_URI = 6;
                        private static final int MSG_PREVIOUS = 15;
                        private static final int MSG_RATE = 19;
                        private static final int MSG_RATE_EXTRA = 31;
                        private static final int MSG_REMOVE_QUEUE_ITEM = 27;
                        private static final int MSG_REMOVE_QUEUE_ITEM_AT = 28;
                        private static final int MSG_REWIND = 17;
                        private static final int MSG_SEEK_TO = 18;
                        private static final int MSG_SET_CAPTIONING_ENABLED = 29;
                        private static final int MSG_SET_REPEAT_MODE = 23;
                        private static final int MSG_SET_SHUFFLE_MODE = 30;
                        private static final int MSG_SET_VOLUME = 22;
                        private static final int MSG_SKIP_TO_ITEM = 11;
                        private static final int MSG_STOP = 13;

                        public MessageHandler(Looper looper) {
/* 3 */                     super(looper);
                        }

                        private void onMediaButtonEvent(KeyEvent keyEvent, Callback callback) {
/* 1 */                     if (keyEvent == null || keyEvent.getAction() != 0) {
/* 129 */                       return;
                            }
/* 13 */                    PlaybackStateCompat playbackStateCompat = MediaSessionImplBase.this.mState;
/* 21 */                    long actions = playbackStateCompat == null ? 0L : playbackStateCompat.getActions();
/* 25 */                    int keyCode = keyEvent.getKeyCode();
/* 31 */                    if (keyCode != 79) {
/* 35 */                        if (keyCode == 126) {
/* 116 */                           if ((4 & actions) != 0) {
/* 118 */                               callback.onPlay();
/* 121 */                               return;
                                    }
/* 129 */                           return;
                                }
/* 39 */                        if (keyCode == 127) {
/* 105 */                           if ((2 & actions) != 0) {
/* 107 */                               callback.onPause();
/* 110 */                               return;
                                    }
/* 129 */                           return;
                                }
                                switch (keyCode) {
                                    case 86:
/* 94 */                                if ((1 & actions) != 0) {
/* 96 */                                    callback.onStop();
                                        }
                                        break;
                                    case 87:
/* 83 */                                if ((32 & actions) != 0) {
/* 85 */                                    callback.onSkipToNext();
                                        }
                                        break;
                                    case 88:
/* 72 */                                if ((16 & actions) != 0) {
/* 74 */                                    callback.onSkipToPrevious();
                                        }
                                        break;
                                    case 89:
/* 61 */                                if ((8 & actions) != 0) {
/* 63 */                                    callback.onRewind();
                                        }
                                        break;
                                    case 90:
/* 50 */                                if ((64 & actions) != 0) {
/* 52 */                                    callback.onFastForward();
                                        }
                                        break;
                                }
/* 55 */                        return;
                            }
/* 126 */                   AbstractC1245n0.m4889q(MediaSessionCompat.TAG, "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
                        }

                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
/* 3 */                     Callback callback = MediaSessionImplBase.this.mCallback;
/* 5 */                     if (callback == null) {
/* 7 */                         return;
                            }
/* 8 */                     Bundle data = message.getData();
/* 12 */                    MediaSessionCompat.ensureClassLoader(data);
/* 40 */                    MediaSessionImplBase.this.setCurrentControllerInfo(new pf1(data.getString(MediaSessionCompat.DATA_CALLING_PACKAGE), data.getInt(MediaSessionCompat.DATA_CALLING_PID), data.getInt(MediaSessionCompat.DATA_CALLING_UID)));
/* 45 */                    Bundle bundle = data.getBundle(MediaSessionCompat.DATA_EXTRAS);
/* 49 */                    MediaSessionCompat.ensureClassLoader(bundle);
                            try {
                                switch (message.what) {
                                    case 1:
/* 342 */                               Command command = (Command) message.obj;
/* 350 */                               callback.onCommand(command.command, command.extras, command.stub);
                                        break;
                                    case 2:
/* 336 */                               MediaSessionImplBase.this.adjustVolume(message.arg1, 0);
                                        break;
                                    case 3:
/* 328 */                               callback.onPrepare();
                                        break;
                                    case 4:
/* 324 */                               callback.onPrepareFromMediaId((String) message.obj, bundle);
                                        break;
                                    case 5:
/* 316 */                               callback.onPrepareFromSearch((String) message.obj, bundle);
                                        break;
                                    case 6:
/* 308 */                               callback.onPrepareFromUri((Uri) message.obj, bundle);
                                        break;
                                    case 7:
/* 300 */                               callback.onPlay();
                                        break;
                                    case 8:
/* 296 */                               callback.onPlayFromMediaId((String) message.obj, bundle);
                                        break;
                                    case 9:
/* 288 */                               callback.onPlayFromSearch((String) message.obj, bundle);
                                        break;
                                    case 10:
/* 280 */                               callback.onPlayFromUri((Uri) message.obj, bundle);
                                        break;
                                    case 11:
/* 272 */                               callback.onSkipToQueueItem(((Long) message.obj).longValue());
                                        break;
                                    case MSG_PAUSE /* 12 */:
/* 260 */                               callback.onPause();
                                        break;
                                    case 13:
/* 256 */                               callback.onStop();
                                        break;
                                    case MSG_NEXT /* 14 */:
/* 252 */                               callback.onSkipToNext();
                                        break;
                                    case 15:
/* 247 */                               callback.onSkipToPrevious();
                                        break;
                                    case 16:
/* 242 */                               callback.onFastForward();
                                        break;
                                    case MSG_REWIND /* 17 */:
/* 237 */                               callback.onRewind();
                                        break;
                                    case MSG_SEEK_TO /* 18 */:
/* 232 */                               callback.onSeekTo(((Long) message.obj).longValue());
                                        break;
                                    case MSG_RATE /* 19 */:
/* 219 */                               callback.onSetRating((RatingCompat) message.obj);
                                        break;
                                    case MSG_CUSTOM_ACTION /* 20 */:
/* 210 */                               callback.onCustomAction((String) message.obj, bundle);
                                        break;
                                    case 21:
/* 181 */                               KeyEvent keyEvent = (KeyEvent) message.obj;
/* 187 */                               Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
/* 192 */                               intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
/* 199 */                               if (!callback.onMediaButtonEvent(intent)) {
/* 201 */                                   onMediaButtonEvent(keyEvent, callback);
                                        }
                                        break;
                                    case 22:
/* 174 */                               MediaSessionImplBase.this.setVolumeTo(message.arg1, 0);
                                        break;
                                    case 23:
/* 165 */                               callback.onSetRepeatMode(message.arg1);
                                        break;
                                    case 25:
/* 158 */                               callback.onAddQueueItem((MediaDescriptionCompat) message.obj);
                                        break;
                                    case 26:
/* 149 */                               callback.onAddQueueItem((MediaDescriptionCompat) message.obj, message.arg1);
                                        break;
                                    case 27:
/* 138 */                               callback.onRemoveQueueItem((MediaDescriptionCompat) message.obj);
                                        break;
                                    case 28:
/* 95 */                                List<QueueItem> list = MediaSessionImplBase.this.mQueue;
/* 97 */                                if (list != null) {
/* 99 */                                    int i = message.arg1;
/* 122 */                                   QueueItem queueItem = (i < 0 || i >= list.size()) ? null : MediaSessionImplBase.this.mQueue.get(message.arg1);
/* 123 */                                   if (queueItem != null) {
/* 129 */                                       callback.onRemoveQueueItem(queueItem.getDescription());
                                            }
                                        }
                                        break;
                                    case 29:
/* 88 */                                callback.onSetCaptioningEnabled(((Boolean) message.obj).booleanValue());
                                        break;
                                    case 30:
/* 75 */                                callback.onSetShuffleMode(message.arg1);
                                        break;
                                    case 31:
/* 65 */                                callback.onSetRating((RatingCompat) message.obj, bundle);
                                        break;
                                }
                            } finally {
/* 361 */                       MediaSessionImplBase.this.setCurrentControllerInfo(null);
                            }
                        }
                    }

                    public MediaSessionImplBase(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
/* 34 */                if (componentName == null) {
/* 92 */                    C1951n4.m6859j("MediaButtonReceiver component may not be null.");
/* 96 */                    throw null;
                        }
/* 36 */                this.mContext = context;
/* 42 */                this.mPackageName = context.getPackageName();
/* 52 */                this.mAudioManager = (AudioManager) context.getSystemService("audio");
/* 54 */                this.mTag = str;
/* 56 */                this.mMediaButtonReceiverComponentName = componentName;
/* 58 */                this.mMediaButtonReceiverIntent = pendingIntent;
/* 62 */                MediaSessionStub mediaSessionStub = new MediaSessionStub();
/* 65 */                this.mStub = mediaSessionStub;
/* 72 */                this.mToken = new Token(mediaSessionStub);
/* 74 */                this.mRatingType = 0;
/* 77 */                this.mVolumeType = 1;
/* 80 */                this.mLocalStream = 3;
/* 87 */                this.mRcc = new RemoteControlClient(pendingIntent);
                    }

                    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
                        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
                        */
                    private void sendCaptioningEnabled(boolean r3) {
                        /*
                            r2 = this;
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                            int r0 = r0.beginBroadcast()
                            int r0 = r0 + (-1)
                        L8:
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                            if (r0 < 0) goto L18
                            android.os.IInterface r1 = r1.getBroadcastItem(r0)
                            android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                            r1.onCaptioningEnabledChanged(r3)     // Catch: android.os.RemoteException -> L15
                        L15:
                            int r0 = r0 + (-1)
                            goto L8
                        L18:
                            r1.finishBroadcast()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendCaptioningEnabled(boolean):void");
                    }

                    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
                        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
                        */
                    private void sendEvent(java.lang.String r3, android.os.Bundle r4) {
                        /*
                            r2 = this;
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                            int r0 = r0.beginBroadcast()
                            int r0 = r0 + (-1)
                        L8:
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                            if (r0 < 0) goto L18
                            android.os.IInterface r1 = r1.getBroadcastItem(r0)
                            android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                            r1.onEvent(r3, r4)     // Catch: android.os.RemoteException -> L15
                        L15:
                            int r0 = r0 + (-1)
                            goto L8
                        L18:
                            r1.finishBroadcast()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendEvent(java.lang.String, android.os.Bundle):void");
                    }

                    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
                        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
                        */
                    private void sendExtras(android.os.Bundle r3) {
                        /*
                            r2 = this;
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                            int r0 = r0.beginBroadcast()
                            int r0 = r0 + (-1)
                        L8:
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                            if (r0 < 0) goto L18
                            android.os.IInterface r1 = r1.getBroadcastItem(r0)
                            android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                            r1.onExtrasChanged(r3)     // Catch: android.os.RemoteException -> L15
                        L15:
                            int r0 = r0 + (-1)
                            goto L8
                        L18:
                            r1.finishBroadcast()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendExtras(android.os.Bundle):void");
                    }

                    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
                        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
                        */
                    private void sendMetadata(android.support.v4.media.MediaMetadataCompat r3) {
                        /*
                            r2 = this;
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                            int r0 = r0.beginBroadcast()
                            int r0 = r0 + (-1)
                        L8:
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                            if (r0 < 0) goto L18
                            android.os.IInterface r1 = r1.getBroadcastItem(r0)
                            android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                            r1.onMetadataChanged(r3)     // Catch: android.os.RemoteException -> L15
                        L15:
                            int r0 = r0 + (-1)
                            goto L8
                        L18:
                            r1.finishBroadcast()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendMetadata(android.support.v4.media.MediaMetadataCompat):void");
                    }

                    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
                        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
                        */
                    private void sendQueue(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> r3) {
                        /*
                            r2 = this;
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                            int r0 = r0.beginBroadcast()
                            int r0 = r0 + (-1)
                        L8:
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                            if (r0 < 0) goto L18
                            android.os.IInterface r1 = r1.getBroadcastItem(r0)
                            android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                            r1.onQueueChanged(r3)     // Catch: android.os.RemoteException -> L15
                        L15:
                            int r0 = r0 + (-1)
                            goto L8
                        L18:
                            r1.finishBroadcast()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendQueue(java.util.List):void");
                    }

                    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
                        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
                        */
                    private void sendQueueTitle(java.lang.CharSequence r3) {
                        /*
                            r2 = this;
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                            int r0 = r0.beginBroadcast()
                            int r0 = r0 + (-1)
                        L8:
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                            if (r0 < 0) goto L18
                            android.os.IInterface r1 = r1.getBroadcastItem(r0)
                            android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                            r1.onQueueTitleChanged(r3)     // Catch: android.os.RemoteException -> L15
                        L15:
                            int r0 = r0 + (-1)
                            goto L8
                        L18:
                            r1.finishBroadcast()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendQueueTitle(java.lang.CharSequence):void");
                    }

                    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
                        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
                        */
                    private void sendRepeatMode(int r3) {
                        /*
                            r2 = this;
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                            int r0 = r0.beginBroadcast()
                            int r0 = r0 + (-1)
                        L8:
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                            if (r0 < 0) goto L18
                            android.os.IInterface r1 = r1.getBroadcastItem(r0)
                            android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                            r1.onRepeatModeChanged(r3)     // Catch: android.os.RemoteException -> L15
                        L15:
                            int r0 = r0 + (-1)
                            goto L8
                        L18:
                            r1.finishBroadcast()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendRepeatMode(int):void");
                    }

                    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
                        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
                        */
                    private void sendSessionDestroyed() {
                        /*
                            r2 = this;
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                            int r0 = r0.beginBroadcast()
                            int r0 = r0 + (-1)
                        L8:
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                            if (r0 < 0) goto L18
                            android.os.IInterface r1 = r1.getBroadcastItem(r0)
                            android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                            r1.onSessionDestroyed()     // Catch: android.os.RemoteException -> L15
                        L15:
                            int r0 = r0 + (-1)
                            goto L8
                        L18:
                            r1.finishBroadcast()
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r2 = r2.mControllerCallbacks
                            r2.kill()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendSessionDestroyed():void");
                    }

                    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
                        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
                        */
                    private void sendShuffleMode(int r3) {
                        /*
                            r2 = this;
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                            int r0 = r0.beginBroadcast()
                            int r0 = r0 + (-1)
                        L8:
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                            if (r0 < 0) goto L18
                            android.os.IInterface r1 = r1.getBroadcastItem(r0)
                            android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                            r1.onShuffleModeChanged(r3)     // Catch: android.os.RemoteException -> L15
                        L15:
                            int r0 = r0 + (-1)
                            goto L8
                        L18:
                            r1.finishBroadcast()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendShuffleMode(int):void");
                    }

                    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
                        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
                        */
                    private void sendState(android.support.v4.media.session.PlaybackStateCompat r3) {
                        /*
                            r2 = this;
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                            int r0 = r0.beginBroadcast()
                            int r0 = r0 + (-1)
                        L8:
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                            if (r0 < 0) goto L18
                            android.os.IInterface r1 = r1.getBroadcastItem(r0)
                            android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                            r1.onPlaybackStateChanged(r3)     // Catch: android.os.RemoteException -> L15
                        L15:
                            int r0 = r0 + (-1)
                            goto L8
                        L18:
                            r1.finishBroadcast()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendState(android.support.v4.media.session.PlaybackStateCompat):void");
                    }

                    public void adjustVolume(int i, int i2) {
/* 4 */                 if (this.mVolumeType == 2) {
/* 6 */                     return;
                        }
/* 11 */                this.mAudioManager.adjustStreamVolume(this.mLocalStream, i, i2);
                    }

                    public RemoteControlClient.MetadataEditor buildRccMetadata(Bundle bundle) {
/* 4 */                 RemoteControlClient.MetadataEditor metadataEditorEditMetadata = this.mRcc.editMetadata(true);
/* 8 */                 if (bundle != null) {
/* 21 */                    if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ART)) {
/* 27 */                        Bitmap bitmapCopy = (Bitmap) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_ART);
/* 29 */                        if (bitmapCopy != null) {
/* 35 */                            bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), false);
                                }
/* 39 */                        metadataEditorEditMetadata.putBitmap(100, bitmapCopy);
                            } else if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ALBUM_ART)) {
/* 55 */                        Bitmap bitmapCopy2 = (Bitmap) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_ALBUM_ART);
/* 57 */                        if (bitmapCopy2 != null) {
/* 63 */                            bitmapCopy2 = bitmapCopy2.copy(bitmapCopy2.getConfig(), false);
                                }
/* 67 */                        metadataEditorEditMetadata.putBitmap(100, bitmapCopy2);
                            }
/* 76 */                    if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ALBUM)) {
/* 82 */                        metadataEditorEditMetadata.putString(1, bundle.getString(MediaMetadataCompat.METADATA_KEY_ALBUM));
                            }
/* 91 */                    if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST)) {
/* 99 */                        metadataEditorEditMetadata.putString(13, bundle.getString(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST));
                            }
/* 108 */                   if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ARTIST)) {
/* 115 */                       metadataEditorEditMetadata.putString(2, bundle.getString(MediaMetadataCompat.METADATA_KEY_ARTIST));
                            }
/* 124 */                   if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_AUTHOR)) {
/* 131 */                       metadataEditorEditMetadata.putString(3, bundle.getString(MediaMetadataCompat.METADATA_KEY_AUTHOR));
                            }
/* 140 */                   if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_COMPILATION)) {
/* 148 */                       metadataEditorEditMetadata.putString(15, bundle.getString(MediaMetadataCompat.METADATA_KEY_COMPILATION));
                            }
/* 157 */                   if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_COMPOSER)) {
/* 164 */                       metadataEditorEditMetadata.putString(4, bundle.getString(MediaMetadataCompat.METADATA_KEY_COMPOSER));
                            }
/* 173 */                   if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DATE)) {
/* 180 */                       metadataEditorEditMetadata.putString(5, bundle.getString(MediaMetadataCompat.METADATA_KEY_DATE));
                            }
/* 189 */                   if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DISC_NUMBER)) {
/* 197 */                       metadataEditorEditMetadata.putLong(14, bundle.getLong(MediaMetadataCompat.METADATA_KEY_DISC_NUMBER));
                            }
/* 206 */                   if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
/* 214 */                       metadataEditorEditMetadata.putLong(9, bundle.getLong(MediaMetadataCompat.METADATA_KEY_DURATION));
                            }
/* 223 */                   if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_GENRE)) {
/* 230 */                       metadataEditorEditMetadata.putString(6, bundle.getString(MediaMetadataCompat.METADATA_KEY_GENRE));
                            }
/* 239 */                   if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_TITLE)) {
/* 246 */                       metadataEditorEditMetadata.putString(7, bundle.getString(MediaMetadataCompat.METADATA_KEY_TITLE));
                            }
/* 255 */                   if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER)) {
/* 261 */                       metadataEditorEditMetadata.putLong(0, bundle.getLong(MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER));
                            }
/* 270 */                   if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_WRITER)) {
/* 278 */                       metadataEditorEditMetadata.putString(11, bundle.getString(MediaMetadataCompat.METADATA_KEY_WRITER));
                            }
                        }
/* 281 */               return metadataEditorEditMetadata;
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public String getCallingPackage() {
/* 1 */                 return null;
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public pf1 getCurrentControllerInfo() {
                        pf1 pf1Var;
                        synchronized (this.mLock) {
/* 4 */                     pf1Var = this.mRemoteUserInfo;
                        }
/* 7 */                 return pf1Var;
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public Object getMediaSession() {
/* 1 */                 return null;
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public PlaybackStateCompat getPlaybackState() {
                        PlaybackStateCompat playbackStateCompat;
                        synchronized (this.mLock) {
/* 4 */                     playbackStateCompat = this.mState;
                        }
/* 7 */                 return playbackStateCompat;
                    }

                    public int getRccStateFromState(int i) {
                        switch (i) {
                            case 0:
/* 26 */                        return 0;
                            case 1:
/* 24 */                        return 1;
                            case 2:
/* 22 */                        return 2;
                            case 3:
/* 20 */                        return 3;
                            case 4:
/* 18 */                        return 4;
                            case 5:
/* 16 */                        return 5;
                            case 6:
                            case 8:
/* 13 */                        return 8;
                            case 7:
/* 10 */                        return 9;
                            case 9:
/* 8 */                         return 7;
                            case 10:
                            case 11:
/* 6 */                         return 6;
                            default:
/* 4 */                         return -1;
                        }
                    }

                    public int getRccTransportControlFlagsFromActions(long j) {
/* 13 */                int i = (1 & j) != 0 ? 32 : 0;
/* 19 */                if ((2 & j) != 0) {
/* 21 */                    i |= 16;
                        }
/* 28 */                if ((4 & j) != 0) {
/* 30 */                    i |= 4;
                        }
/* 37 */                if ((8 & j) != 0) {
/* 39 */                    i |= 2;
                        }
/* 46 */                if ((16 & j) != 0) {
/* 48 */                    i |= 1;
                        }
/* 55 */                if ((32 & j) != 0) {
/* 57 */                    i |= 128;
                        }
/* 64 */                if ((64 & j) != 0) {
/* 66 */                    i |= 64;
                        }
                        return (j & 512) != 0 ? i | 8 : i;
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public Object getRemoteControlClient() {
/* 1 */                 return null;
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public Token getSessionToken() {
/* 1 */                 return this.mToken;
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public boolean isActive() {
/* 1 */                 return this.mIsActive;
                    }

                    public void postToHandler(int i, int i2, int i3, Object obj, Bundle bundle) {
                        synchronized (this.mLock) {
                            try {
/* 4 */                         MessageHandler messageHandler = this.mHandler;
/* 6 */                         if (messageHandler != null) {
/* 8 */                             Message messageObtainMessage = messageHandler.obtainMessage(i, i2, i3, obj);
/* 14 */                            Bundle bundle2 = new Bundle();
/* 21 */                            bundle2.putString(MediaSessionCompat.DATA_CALLING_PACKAGE, "android.media.session.MediaController");
/* 30 */                            bundle2.putInt(MediaSessionCompat.DATA_CALLING_PID, Binder.getCallingPid());
/* 39 */                            bundle2.putInt(MediaSessionCompat.DATA_CALLING_UID, Binder.getCallingUid());
/* 42 */                            if (bundle != null) {
/* 46 */                                bundle2.putBundle(MediaSessionCompat.DATA_EXTRAS, bundle);
                                    }
/* 52 */                            messageObtainMessage.setData(bundle2);
/* 55 */                            messageObtainMessage.sendToTarget();
                                }
                            } catch (Throwable th) {
/* 61 */                        throw th;
                            }
                        }
                    }

                    public void registerMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
/* 3 */                 this.mAudioManager.registerMediaButtonEventReceiver(componentName);
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void release() {
/* 2 */                 this.mIsActive = false;
/* 5 */                 this.mDestroyed = true;
/* 7 */                 update();
/* 10 */                sendSessionDestroyed();
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void sendSessionEvent(String str, Bundle bundle) {
/* 1 */                 sendEvent(str, bundle);
                    }

                    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
                        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
                        */
                    public void sendVolumeInfoChanged(android.support.v4.media.session.ParcelableVolumeInfo r3) {
                        /*
                            r2 = this;
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                            int r0 = r0.beginBroadcast()
                            int r0 = r0 + (-1)
                        L8:
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                            if (r0 < 0) goto L18
                            android.os.IInterface r1 = r1.getBroadcastItem(r0)
                            android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                            r1.onVolumeInfoChanged(r3)     // Catch: android.os.RemoteException -> L15
                        L15:
                            int r0 = r0 + (-1)
                            goto L8
                        L18:
                            r1.finishBroadcast()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendVolumeInfoChanged(android.support.v4.media.session.ParcelableVolumeInfo):void");
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setActive(boolean z) {
/* 3 */                 if (z == this.mIsActive) {
/* 24 */                    return;
                        }
/* 6 */                 this.mIsActive = z;
/* 12 */                if (update()) {
/* 16 */                    setMetadata(this.mMetadata);
/* 21 */                    setPlaybackState(this.mState);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setCallback(Callback callback, Handler handler) {
/* 1 */                 this.mCallback = callback;
/* 3 */                 if (callback != null) {
/* 5 */                     if (handler == null) {
/* 9 */                         handler = new Handler();
                            }
                            synchronized (this.mLock) {
                                try {
/* 15 */                            MessageHandler messageHandler = this.mHandler;
/* 17 */                            if (messageHandler != null) {
/* 20 */                                messageHandler.removeCallbacksAndMessages(null);
                                    }
/* 35 */                            this.mHandler = new MessageHandler(handler.getLooper());
/* 39 */                            this.mCallback.setSessionImpl(this, handler);
                                } catch (Throwable th) {
/* 45 */                            throw th;
                                }
                            }
                        }
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setCaptioningEnabled(boolean z) {
/* 3 */                 if (this.mCaptioningEnabled != z) {
/* 5 */                     this.mCaptioningEnabled = z;
/* 7 */                     sendCaptioningEnabled(z);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setCurrentControllerInfo(pf1 pf1Var) {
                        synchronized (this.mLock) {
/* 4 */                     this.mRemoteUserInfo = pf1Var;
                        }
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setExtras(Bundle bundle) {
/* 1 */                 this.mExtras = bundle;
/* 3 */                 sendExtras(bundle);
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setFlags(int i) {
                        synchronized (this.mLock) {
/* 4 */                     this.mFlags = i;
                        }
/* 7 */                 update();
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setMediaButtonReceiver(PendingIntent pendingIntent) {
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
/* 1 */                 if (mediaMetadataCompat != null) {
/* 10 */                    mediaMetadataCompat = new MediaMetadataCompat.Builder(mediaMetadataCompat, MediaSessionCompat.sMaxBitmapSize).build();
                        }
                        synchronized (this.mLock) {
/* 17 */                    this.mMetadata = mediaMetadataCompat;
                        }
/* 20 */                sendMetadata(mediaMetadataCompat);
/* 25 */                if (this.mIsActive) {
/* 40 */                    buildRccMetadata(mediaMetadataCompat == null ? null : mediaMetadataCompat.getBundle()).apply();
                        }
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
                        synchronized (this.mLock) {
/* 4 */                     this.mState = playbackStateCompat;
                        }
/* 7 */                 sendState(playbackStateCompat);
/* 12 */                if (this.mIsActive) {
/* 15 */                    if (playbackStateCompat == null) {
/* 20 */                        this.mRcc.setPlaybackState(0);
/* 25 */                        this.mRcc.setTransportControlFlags(0);
                            } else {
/* 29 */                        setRccState(playbackStateCompat);
/* 42 */                        this.mRcc.setTransportControlFlags(getRccTransportControlFlagsFromActions(playbackStateCompat.getActions()));
                            }
                        }
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setPlaybackToLocal(int i) {
/* 1 */                 this.mLocalStream = i;
/* 4 */                 this.mVolumeType = 1;
/* 8 */                 int i2 = this.mVolumeType;
/* 10 */                int i3 = this.mLocalStream;
/* 30 */                sendVolumeInfoChanged(new ParcelableVolumeInfo(i2, i3, 2, this.mAudioManager.getStreamMaxVolume(i3), this.mAudioManager.getStreamVolume(this.mLocalStream)));
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setPlaybackToRemote(d63 d63Var) {
/* 8 */                 throw new IllegalArgumentException("volumeProvider may not be null");
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setQueue(List<QueueItem> list) {
/* 1 */                 this.mQueue = list;
/* 3 */                 sendQueue(list);
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setQueueTitle(CharSequence charSequence) {
/* 1 */                 this.mQueueTitle = charSequence;
/* 3 */                 sendQueueTitle(charSequence);
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setRatingType(int i) {
/* 1 */                 this.mRatingType = i;
                    }

                    public void setRccState(PlaybackStateCompat playbackStateCompat) {
/* 11 */                this.mRcc.setPlaybackState(getRccStateFromState(playbackStateCompat.getState()));
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setRepeatMode(int i) {
/* 3 */                 if (this.mRepeatMode != i) {
/* 5 */                     this.mRepeatMode = i;
/* 7 */                     sendRepeatMode(i);
                        }
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setSessionActivity(PendingIntent pendingIntent) {
                        synchronized (this.mLock) {
/* 4 */                     this.mSessionActivity = pendingIntent;
                        }
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setShuffleMode(int i) {
/* 3 */                 if (this.mShuffleMode != i) {
/* 5 */                     this.mShuffleMode = i;
/* 7 */                     sendShuffleMode(i);
                        }
                    }

                    public void setVolumeTo(int i, int i2) {
/* 4 */                 if (this.mVolumeType == 2) {
/* 6 */                     return;
                        }
/* 11 */                this.mAudioManager.setStreamVolume(this.mLocalStream, i, i2);
                    }

                    public void unregisterMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
/* 3 */                 this.mAudioManager.unregisterMediaButtonEventReceiver(componentName);
                    }

                    public boolean update() {
/* 1 */                 boolean z = this.mIsActive;
/* 3 */                 boolean z2 = this.mIsMbrRegistered;
/* 6 */                 if (z) {
/* 9 */                     if (!z2 && (this.mFlags & 1) != 0) {
/* 20 */                        registerMediaButtonEventReceiver(this.mMediaButtonReceiverIntent, this.mMediaButtonReceiverComponentName);
/* 23 */                        this.mIsMbrRegistered = true;
                            } else if (z2 && (this.mFlags & 1) == 0) {
/* 37 */                        unregisterMediaButtonEventReceiver(this.mMediaButtonReceiverIntent, this.mMediaButtonReceiverComponentName);
/* 40 */                        this.mIsMbrRegistered = false;
                            }
/* 42 */                    boolean z3 = this.mIsRccRegistered;
/* 44 */                    if (!z3 && (this.mFlags & 2) != 0) {
/* 56 */                        this.mAudioManager.registerRemoteControlClient(this.mRcc);
/* 59 */                        this.mIsRccRegistered = true;
/* 8 */                         return true;
                            }
/* 62 */                    if (z3 && (this.mFlags & 2) == 0) {
/* 72 */                        this.mRcc.setPlaybackState(0);
/* 79 */                        this.mAudioManager.unregisterRemoteControlClient(this.mRcc);
/* 82 */                        this.mIsRccRegistered = false;
/* 5 */                         return false;
                            }
                        } else {
/* 85 */                    if (z2) {
/* 91 */                        unregisterMediaButtonEventReceiver(this.mMediaButtonReceiverIntent, this.mMediaButtonReceiverComponentName);
/* 94 */                        this.mIsMbrRegistered = false;
                            }
/* 98 */                    if (this.mIsRccRegistered) {
/* 102 */                       this.mRcc.setPlaybackState(0);
/* 109 */                       this.mAudioManager.unregisterRemoteControlClient(this.mRcc);
/* 112 */                       this.mIsRccRegistered = false;
                            }
                        }
/* 5 */                 return false;
                    }

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 10 */            public class MediaSessionStub extends IMediaSession.Stub {
                        public MediaSessionStub() {
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
/* 3 */                     postToHandler(25, mediaDescriptionCompat);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) {
/* 3 */                     postToHandler(26, mediaDescriptionCompat, i);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void adjustVolume(int i, int i2, String str) {
/* 3 */                     MediaSessionImplBase.this.adjustVolume(i, i2);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void fastForward() throws RemoteException {
/* 3 */                     postToHandler(16);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public Bundle getExtras() {
                            Bundle bundle;
                            synchronized (MediaSessionImplBase.this.mLock) {
/* 8 */                         bundle = MediaSessionImplBase.this.mExtras;
                            }
/* 11 */                    return bundle;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public long getFlags() {
                            long j;
                            synchronized (MediaSessionImplBase.this.mLock) {
/* 8 */                         j = MediaSessionImplBase.this.mFlags;
                            }
/* 12 */                    return j;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public PendingIntent getLaunchPendingIntent() {
                            PendingIntent pendingIntent;
                            synchronized (MediaSessionImplBase.this.mLock) {
/* 8 */                         pendingIntent = MediaSessionImplBase.this.mSessionActivity;
                            }
/* 11 */                    return pendingIntent;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public MediaMetadataCompat getMetadata() {
/* 3 */                     return MediaSessionImplBase.this.mMetadata;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public String getPackageName() {
/* 3 */                     return MediaSessionImplBase.this.mPackageName;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public PlaybackStateCompat getPlaybackState() {
                            PlaybackStateCompat playbackStateCompat;
                            MediaMetadataCompat mediaMetadataCompat;
                            synchronized (MediaSessionImplBase.this.mLock) {
/* 6 */                         MediaSessionImplBase mediaSessionImplBase = MediaSessionImplBase.this;
/* 8 */                         playbackStateCompat = mediaSessionImplBase.mState;
/* 10 */                        mediaMetadataCompat = mediaSessionImplBase.mMetadata;
                            }
/* 13 */                    return MediaSessionCompat.getStateWithUpdatedPosition(playbackStateCompat, mediaMetadataCompat);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public List<QueueItem> getQueue() {
                            List<QueueItem> list;
                            synchronized (MediaSessionImplBase.this.mLock) {
/* 8 */                         list = MediaSessionImplBase.this.mQueue;
                            }
/* 11 */                    return list;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public CharSequence getQueueTitle() {
/* 3 */                     return MediaSessionImplBase.this.mQueueTitle;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public int getRatingType() {
/* 3 */                     return MediaSessionImplBase.this.mRatingType;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public int getRepeatMode() {
/* 3 */                     return MediaSessionImplBase.this.mRepeatMode;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public int getShuffleMode() {
/* 3 */                     return MediaSessionImplBase.this.mShuffleMode;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public String getTag() {
/* 3 */                     return MediaSessionImplBase.this.mTag;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public ParcelableVolumeInfo getVolumeAttributes() {
                            int i;
                            int i2;
                            int streamMaxVolume;
                            int streamVolume;
                            synchronized (MediaSessionImplBase.this.mLock) {
/* 6 */                         MediaSessionImplBase mediaSessionImplBase = MediaSessionImplBase.this;
/* 8 */                         i = mediaSessionImplBase.mVolumeType;
/* 10 */                        i2 = mediaSessionImplBase.mLocalStream;
/* 12 */                        mediaSessionImplBase.getClass();
/* 16 */                        if (i == 2) {
/* 46 */                            throw null;
                                }
/* 22 */                        streamMaxVolume = MediaSessionImplBase.this.mAudioManager.getStreamMaxVolume(i2);
/* 30 */                        streamVolume = MediaSessionImplBase.this.mAudioManager.getStreamVolume(i2);
                            }
/* 38 */                    return new ParcelableVolumeInfo(i, i2, 2, streamMaxVolume, streamVolume);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public boolean isCaptioningEnabled() {
/* 3 */                     return MediaSessionImplBase.this.mCaptioningEnabled;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public boolean isShuffleModeEnabledRemoved() {
/* 1 */                     return false;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public boolean isTransportControlEnabled() {
                            return (MediaSessionImplBase.this.mFlags & 2) != 0;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void next() throws RemoteException {
/* 3 */                     postToHandler(14);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void pause() throws RemoteException {
/* 3 */                     postToHandler(12);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void play() throws RemoteException {
/* 2 */                     postToHandler(7);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void playFromMediaId(String str, Bundle bundle) throws RemoteException {
/* 3 */                     postToHandler(8, str, bundle);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void playFromSearch(String str, Bundle bundle) throws RemoteException {
/* 3 */                     postToHandler(9, str, bundle);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void playFromUri(Uri uri, Bundle bundle) throws RemoteException {
/* 3 */                     postToHandler(10, uri, bundle);
                        }

                        public void postToHandler(int i) {
/* 8 */                     MediaSessionImplBase.this.postToHandler(i, 0, 0, null, null);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void prepare() throws RemoteException {
/* 2 */                     postToHandler(3);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void prepareFromMediaId(String str, Bundle bundle) throws RemoteException {
/* 2 */                     postToHandler(4, str, bundle);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void prepareFromSearch(String str, Bundle bundle) throws RemoteException {
/* 2 */                     postToHandler(5, str, bundle);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void prepareFromUri(Uri uri, Bundle bundle) throws RemoteException {
/* 2 */                     postToHandler(6, uri, bundle);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void previous() throws RemoteException {
/* 3 */                     postToHandler(15);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void rate(RatingCompat ratingCompat) throws RemoteException {
/* 3 */                     postToHandler(19, ratingCompat);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
/* 3 */                     postToHandler(31, ratingCompat, bundle);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
/* 5 */                     if (MediaSessionImplBase.this.mDestroyed) {
                                try {
/* 7 */                             iMediaControllerCallback.onSessionDestroyed();
                                } catch (Exception unused) {
                                }
                            } else {
/* 30 */                        MediaSessionImplBase.this.mControllerCallbacks.register(iMediaControllerCallback, new pf1("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                            }
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
/* 3 */                     postToHandler(27, mediaDescriptionCompat);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void removeQueueItemAt(int i) {
/* 3 */                     postToHandler(28, i);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void rewind() throws RemoteException {
/* 3 */                     postToHandler(17);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void seekTo(long j) throws RemoteException {
/* 7 */                     postToHandler(18, Long.valueOf(j));
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void sendCommand(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
/* 9 */                     postToHandler(1, new Command(str, bundle, resultReceiverWrapper.mResultReceiver));
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void sendCustomAction(String str, Bundle bundle) throws RemoteException {
/* 3 */                     postToHandler(20, str, bundle);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public boolean sendMediaButton(KeyEvent keyEvent) {
/* 7 */                     boolean z = (MediaSessionImplBase.this.mFlags & 1) != 0;
/* 11 */                    if (z) {
/* 15 */                        postToHandler(21, keyEvent);
                            }
/* 18 */                    return z;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void setCaptioningEnabled(boolean z) throws RemoteException {
/* 7 */                     postToHandler(29, Boolean.valueOf(z));
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void setRepeatMode(int i) throws RemoteException {
/* 3 */                     postToHandler(23, i);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void setShuffleMode(int i) throws RemoteException {
/* 3 */                     postToHandler(30, i);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void setShuffleModeEnabledRemoved(boolean z) throws RemoteException {
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void setVolumeTo(int i, int i2, String str) {
/* 3 */                     MediaSessionImplBase.this.setVolumeTo(i, i2);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void skipToQueueItem(long j) {
/* 7 */                     postToHandler(11, Long.valueOf(j));
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void stop() throws RemoteException {
/* 3 */                     postToHandler(13);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
/* 5 */                     MediaSessionImplBase.this.mControllerCallbacks.unregister(iMediaControllerCallback);
                        }

/* 11 */                public void postToHandler(int i, int i2) {
/* 12 */                    MediaSessionImplBase.this.postToHandler(i, i2, 0, null, null);
                        }

/* 12 */                public void postToHandler(int i, Object obj) {
/* 13 */                    MediaSessionImplBase.this.postToHandler(i, 0, 0, obj, null);
                        }

/* 13 */                public void postToHandler(int i, Object obj, int i2) {
/* 14 */                    MediaSessionImplBase.this.postToHandler(i, i2, 0, obj, null);
                        }

/* 14 */                public void postToHandler(int i, Object obj, Bundle bundle) {
/* 15 */                    MediaSessionImplBase.this.postToHandler(i, 0, 0, obj, bundle);
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 9 */         public static final class Token implements Parcelable {
                    public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>() { // from class: android.support.v4.media.session.MediaSessionCompat.Token.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public Token createFromParcel(Parcel parcel) {
/* 8 */                     return new Token(parcel.readParcelable(null));
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
/* 5 */                 public Token[] newArray(int i) {
/* 6 */                     return new Token[i];
                        }
                    };
                    private IMediaSession mExtraBinder;
                    private final Object mInner;
                    private Bundle mSessionToken2Bundle;

                    public Token(Object obj, IMediaSession iMediaSession, Bundle bundle) {
/* 4 */                 this.mInner = obj;
/* 6 */                 this.mExtraBinder = iMediaSession;
/* 8 */                 this.mSessionToken2Bundle = bundle;
                    }

                    public static Token fromBundle(Bundle bundle) {
/* 2 */                 if (bundle == null) {
/* 1 */                     return null;
                        }
/* 11 */                IMediaSession iMediaSessionAsInterface = IMediaSession.Stub.asInterface(bundle.getBinder(MediaSessionCompat.KEY_EXTRA_BINDER));
/* 17 */                Bundle bundle2 = bundle.getBundle(MediaSessionCompat.KEY_SESSION_TOKEN2_BUNDLE);
/* 27 */                Token token = (Token) bundle.getParcelable(MediaSessionCompat.KEY_TOKEN);
/* 29 */                if (token == null) {
/* 1 */                     return null;
                        }
/* 36 */                return new Token(token.mInner, iMediaSessionAsInterface, bundle2);
                    }

                    public static Token fromToken(Object obj, IMediaSession iMediaSession) {
/* 1 */                 if (obj != null) {
/* 9 */                     return new Token(MediaSessionCompatApi21.verifyToken(obj), iMediaSession);
                        }
/* 13 */                return null;
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
/* 1 */                 return 0;
                    }

                    public boolean equals(Object obj) {
/* 2 */                 if (this == obj) {
/* 1 */                     return true;
                        }
/* 8 */                 if (!(obj instanceof Token)) {
/* 7 */                     return false;
                        }
/* 13 */                Object obj2 = this.mInner;
/* 15 */                Object obj3 = ((Token) obj).mInner;
/* 17 */                if (obj2 == null) {
                            return obj3 == null;
                        }
/* 23 */                if (obj3 == null) {
/* 7 */                     return false;
                        }
/* 26 */                return obj2.equals(obj3);
                    }

                    public IMediaSession getExtraBinder() {
/* 1 */                 return this.mExtraBinder;
                    }

                    public Bundle getSessionToken2Bundle() {
/* 1 */                 return this.mSessionToken2Bundle;
                    }

                    public Object getToken() {
/* 1 */                 return this.mInner;
                    }

                    public int hashCode() {
/* 1 */                 Object obj = this.mInner;
/* 3 */                 if (obj == null) {
/* 5 */                     return 0;
                        }
/* 7 */                 return obj.hashCode();
                    }

                    public void setExtraBinder(IMediaSession iMediaSession) {
/* 1 */                 this.mExtraBinder = iMediaSession;
                    }

                    public void setSessionToken2Bundle(Bundle bundle) {
/* 1 */                 this.mSessionToken2Bundle = bundle;
                    }

                    public Bundle toBundle() {
/* 3 */                 Bundle bundle = new Bundle();
/* 8 */                 bundle.putParcelable(MediaSessionCompat.KEY_TOKEN, this);
/* 11 */                IMediaSession iMediaSession = this.mExtraBinder;
/* 13 */                if (iMediaSession != null) {
/* 21 */                    bundle.putBinder(MediaSessionCompat.KEY_EXTRA_BINDER, iMediaSession.asBinder());
                        }
/* 24 */                Bundle bundle2 = this.mSessionToken2Bundle;
/* 26 */                if (bundle2 != null) {
/* 30 */                    bundle.putBundle(MediaSessionCompat.KEY_SESSION_TOKEN2_BUNDLE, bundle2);
                        }
/* 33 */                return bundle;
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel parcel, int i) {
/* 5 */                 parcel.writeParcelable((Parcelable) this.mInner, i);
                    }

/* 10 */            public Token(Object obj, IMediaSession iMediaSession) {
/* 11 */                this(obj, iMediaSession, null);
                    }

/* 11 */            public Token(Object obj) {
/* 12 */                this(obj, null, null);
                    }

/* 14 */            public static Token fromToken(Object obj) {
/* 15 */                return fromToken(obj, null);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 13 */        public static final class ResultReceiverWrapper implements Parcelable {
                    public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator<ResultReceiverWrapper>() { // from class: android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public ResultReceiverWrapper createFromParcel(Parcel parcel) {
/* 3 */                     return new ResultReceiverWrapper(parcel);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
/* 5 */                 public ResultReceiverWrapper[] newArray(int i) {
/* 6 */                     return new ResultReceiverWrapper[i];
                        }
                    };
                    ResultReceiver mResultReceiver;

                    public ResultReceiverWrapper(Parcel parcel) {
/* 12 */                this.mResultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
/* 1 */                 return 0;
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel parcel, int i) {
/* 3 */                 this.mResultReceiver.writeToParcel(parcel, i);
                    }

/* 14 */            public ResultReceiverWrapper(ResultReceiver resultReceiver) {
/* 16 */                this.mResultReceiver = resultReceiver;
                    }
                }

/* 21 */        public void setCallback(Callback callback) {
/* 22 */            setCallback(callback, null);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 30 */        public static final class QueueItem implements Parcelable {
                    public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator<QueueItem>() { // from class: android.support.v4.media.session.MediaSessionCompat.QueueItem.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public QueueItem createFromParcel(Parcel parcel) {
/* 3 */                     return new QueueItem(parcel);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
/* 5 */                 public QueueItem[] newArray(int i) {
/* 6 */                     return new QueueItem[i];
                        }
                    };
                    public static final int UNKNOWN_ID = -1;
                    private final MediaDescriptionCompat mDescription;
                    private final long mId;
                    private Object mItem;

                    private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
/* 5 */                 if (mediaDescriptionCompat == null) {
/* 28 */                    C1951n4.m6859j("Description cannot be null.");
/* 31 */                    throw null;
                        }
/* 11 */                if (j == -1) {
/* 22 */                    C1951n4.m6859j("Id cannot be QueueItem.UNKNOWN_ID");
/* 25 */                    throw null;
                        }
/* 13 */                this.mDescription = mediaDescriptionCompat;
/* 15 */                this.mId = j;
/* 17 */                this.mItem = obj;
                    }

                    public static QueueItem fromQueueItem(Object obj) {
/* 1 */                 if (obj != null) {
/* 17 */                    return new QueueItem(obj, MediaDescriptionCompat.fromMediaDescription(MediaSessionCompatApi21.QueueItem.getDescription(obj)), MediaSessionCompatApi21.QueueItem.getQueueId(obj));
                        }
/* 21 */                return null;
                    }

                    public static List<QueueItem> fromQueueItemList(List<?> list) {
/* 1 */                 if (list == null) {
/* 31 */                    return null;
                        }
/* 5 */                 ArrayList arrayList = new ArrayList();
/* 8 */                 Iterator<?> it = list.iterator();
/* 16 */                while (it.hasNext()) {
/* 26 */                    arrayList.add(fromQueueItem(it.next()));
                        }
/* 30 */                return arrayList;
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
/* 1 */                 return 0;
                    }

                    public MediaDescriptionCompat getDescription() {
/* 1 */                 return this.mDescription;
                    }

                    public long getQueueId() {
/* 1 */                 return this.mId;
                    }

                    public Object getQueueItem() {
/* 1 */                 Object obj = this.mItem;
/* 3 */                 if (obj != null) {
/* 19 */                    return obj;
                        }
/* 13 */                Object objCreateItem = MediaSessionCompatApi21.QueueItem.createItem(this.mDescription.getMediaDescription(), this.mId);
/* 17 */                this.mItem = objCreateItem;
/* 19 */                return objCreateItem;
                    }

                    public String toString() {
/* 5 */                 StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
/* 10 */                sb.append(this.mDescription);
/* 15 */                sb.append(", Id=");
/* 22 */                return fm0.m3787m(sb, this.mId, " }");
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel parcel, int i) {
/* 3 */                 this.mDescription.writeToParcel(parcel, i);
/* 8 */                 parcel.writeLong(this.mId);
                    }

/* 31 */            public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
/* 32 */                this(null, mediaDescriptionCompat, j);
                    }

/* 32 */            public QueueItem(Parcel parcel) {
/* 34 */                this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
/* 35 */                this.mId = parcel.readLong();
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 35 */        public static class MediaSessionImplApi21 implements MediaSessionImpl {
                    boolean mCaptioningEnabled;
                    boolean mDestroyed = false;
                    final RemoteCallbackList<IMediaControllerCallback> mExtraControllerCallbacks = new RemoteCallbackList<>();
                    MediaMetadataCompat mMetadata;
                    PlaybackStateCompat mPlaybackState;
                    List<QueueItem> mQueue;
                    int mRatingType;
                    int mRepeatMode;
                    final Object mSessionObj;
                    int mShuffleMode;
                    final Token mToken;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public class ExtraSession extends IMediaSession.Stub {
                        public ExtraSession() {
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void adjustVolume(int i, int i2, String str) {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void fastForward() throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public Bundle getExtras() {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public long getFlags() {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public PendingIntent getLaunchPendingIntent() {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public MediaMetadataCompat getMetadata() {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public String getPackageName() {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public PlaybackStateCompat getPlaybackState() {
/* 1 */                     MediaSessionImplApi21 mediaSessionImplApi21 = MediaSessionImplApi21.this;
/* 7 */                     return MediaSessionCompat.getStateWithUpdatedPosition(mediaSessionImplApi21.mPlaybackState, mediaSessionImplApi21.mMetadata);
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public List<QueueItem> getQueue() {
/* 1 */                     return null;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public CharSequence getQueueTitle() {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public int getRatingType() {
/* 3 */                     return MediaSessionImplApi21.this.mRatingType;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public int getRepeatMode() {
/* 3 */                     return MediaSessionImplApi21.this.mRepeatMode;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public int getShuffleMode() {
/* 3 */                     return MediaSessionImplApi21.this.mShuffleMode;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public String getTag() {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public ParcelableVolumeInfo getVolumeAttributes() {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public boolean isCaptioningEnabled() {
/* 3 */                     return MediaSessionImplApi21.this.mCaptioningEnabled;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public boolean isShuffleModeEnabledRemoved() {
/* 1 */                     return false;
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public boolean isTransportControlEnabled() {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void next() throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void pause() throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void play() throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void playFromMediaId(String str, Bundle bundle) throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void playFromSearch(String str, Bundle bundle) throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void playFromUri(Uri uri, Bundle bundle) throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void prepare() throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void prepareFromMediaId(String str, Bundle bundle) throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void prepareFromSearch(String str, Bundle bundle) throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void prepareFromUri(Uri uri, Bundle bundle) throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void previous() throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void rate(RatingCompat ratingCompat) throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
/* 1 */                     MediaSessionImplApi21 mediaSessionImplApi21 = MediaSessionImplApi21.this;
/* 5 */                     if (mediaSessionImplApi21.mDestroyed) {
/* 35 */                        return;
                            }
/* 7 */                     String callingPackage = mediaSessionImplApi21.getCallingPackage();
/* 11 */                    if (callingPackage == null) {
/* 13 */                        callingPackage = "android.media.session.MediaController";
                            }
/* 32 */                    MediaSessionImplApi21.this.mExtraControllerCallbacks.register(iMediaControllerCallback, new pf1(callingPackage, Binder.getCallingPid(), Binder.getCallingUid()));
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void removeQueueItemAt(int i) {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void rewind() throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void seekTo(long j) throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void sendCommand(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void sendCustomAction(String str, Bundle bundle) throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public boolean sendMediaButton(KeyEvent keyEvent) {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void setCaptioningEnabled(boolean z) throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void setRepeatMode(int i) throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void setShuffleMode(int i) throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void setShuffleModeEnabledRemoved(boolean z) throws RemoteException {
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void setVolumeTo(int i, int i2, String str) {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void skipToQueueItem(long j) {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void stop() throws RemoteException {
/* 6 */                     throw new AssertionError();
                        }

                        @Override // android.support.v4.media.session.IMediaSession
                        public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
/* 5 */                     MediaSessionImplApi21.this.mExtraControllerCallbacks.unregister(iMediaControllerCallback);
                        }
                    }

                    public MediaSessionImplApi21(Context context, String str, Bundle bundle) {
/* 14 */                Object objCreateSession = MediaSessionCompatApi21.createSession(context, str);
/* 18 */                this.mSessionObj = objCreateSession;
/* 34 */                this.mToken = new Token(MediaSessionCompatApi21.getSessionToken(objCreateSession), new ExtraSession(), bundle);
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public String getCallingPackage() {
/* 3 */                 return MediaSessionCompatApi24.getCallingPackage(this.mSessionObj);
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public pf1 getCurrentControllerInfo() {
/* 1 */                 return null;
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public Object getMediaSession() {
/* 1 */                 return this.mSessionObj;
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public PlaybackStateCompat getPlaybackState() {
/* 1 */                 return this.mPlaybackState;
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public Object getRemoteControlClient() {
/* 1 */                 return null;
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public Token getSessionToken() {
/* 1 */                 return this.mToken;
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public boolean isActive() {
/* 3 */                 return MediaSessionCompatApi21.isActive(this.mSessionObj);
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void release() {
/* 2 */                 this.mDestroyed = true;
/* 6 */                 MediaSessionCompatApi21.release(this.mSessionObj);
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void sendSessionEvent(String str, Bundle bundle) {
/* 3 */                 MediaSessionCompatApi21.sendSessionEvent(this.mSessionObj, str, bundle);
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setActive(boolean z) {
/* 3 */                 MediaSessionCompatApi21.setActive(this.mSessionObj, z);
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setCallback(Callback callback, Handler handler) {
/* 9 */                 MediaSessionCompatApi21.setCallback(this.mSessionObj, callback == null ? null : callback.mCallbackObj, handler);
/* 12 */                if (callback != null) {
/* 14 */                    callback.setSessionImpl(this, handler);
                        }
                    }

                    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
                        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
                        */
                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setCaptioningEnabled(boolean r3) {
                        /*
                            r2 = this;
                            boolean r0 = r2.mCaptioningEnabled
                            if (r0 == r3) goto L21
                            r2.mCaptioningEnabled = r3
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mExtraControllerCallbacks
                            int r0 = r0.beginBroadcast()
                            int r0 = r0 + (-1)
                        Le:
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mExtraControllerCallbacks
                            if (r0 < 0) goto L1e
                            android.os.IInterface r1 = r1.getBroadcastItem(r0)
                            android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                            r1.onCaptioningEnabledChanged(r3)     // Catch: android.os.RemoteException -> L1b
                        L1b:
                            int r0 = r0 + (-1)
                            goto Le
                        L1e:
                            r1.finishBroadcast()
                        L21:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21.setCaptioningEnabled(boolean):void");
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setCurrentControllerInfo(pf1 pf1Var) {
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setExtras(Bundle bundle) {
/* 3 */                 MediaSessionCompatApi21.setExtras(this.mSessionObj, bundle);
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setFlags(int i) {
/* 3 */                 MediaSessionCompatApi21.setFlags(this.mSessionObj, i);
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setMediaButtonReceiver(PendingIntent pendingIntent) {
/* 3 */                 MediaSessionCompatApi21.setMediaButtonReceiver(this.mSessionObj, pendingIntent);
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
/* 1 */                 this.mMetadata = mediaMetadataCompat;
/* 13 */                MediaSessionCompatApi21.setMetadata(this.mSessionObj, mediaMetadataCompat == null ? null : mediaMetadataCompat.getMediaMetadata());
                    }

                    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
                        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
                        */
                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setPlaybackState(android.support.v4.media.session.PlaybackStateCompat r3) {
                        /*
                            r2 = this;
                            r2.mPlaybackState = r3
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mExtraControllerCallbacks
                            int r0 = r0.beginBroadcast()
                            int r0 = r0 + (-1)
                        La:
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mExtraControllerCallbacks
                            if (r0 < 0) goto L1a
                            android.os.IInterface r1 = r1.getBroadcastItem(r0)
                            android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                            r1.onPlaybackStateChanged(r3)     // Catch: android.os.RemoteException -> L17
                        L17:
                            int r0 = r0 + (-1)
                            goto La
                        L1a:
                            r1.finishBroadcast()
                            java.lang.Object r2 = r2.mSessionObj
                            if (r3 != 0) goto L23
                            r3 = 0
                            goto L27
                        L23:
                            java.lang.Object r3 = r3.getPlaybackState()
                        L27:
                            android.support.v4.media.session.MediaSessionCompatApi21.setPlaybackState(r2, r3)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21.setPlaybackState(android.support.v4.media.session.PlaybackStateCompat):void");
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setPlaybackToLocal(int i) {
/* 3 */                 MediaSessionCompatApi21.setPlaybackToLocal(this.mSessionObj, i);
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setPlaybackToRemote(d63 d63Var) {
/* 2 */                 throw null;
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setQueue(List<QueueItem> list) {
                        ArrayList arrayList;
/* 1 */                 this.mQueue = list;
/* 3 */                 if (list != null) {
/* 7 */                     arrayList = new ArrayList();
/* 10 */                    Iterator<QueueItem> it = list.iterator();
/* 18 */                    while (it.hasNext()) {
/* 30 */                        arrayList.add(it.next().getQueueItem());
                            }
                        } else {
/* 34 */                    arrayList = null;
                        }
/* 37 */                MediaSessionCompatApi21.setQueue(this.mSessionObj, arrayList);
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setQueueTitle(CharSequence charSequence) {
/* 3 */                 MediaSessionCompatApi21.setQueueTitle(this.mSessionObj, charSequence);
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setRatingType(int i) {
/* 3 */                 MediaSessionCompatApi22.setRatingType(this.mSessionObj, i);
                    }

                    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
                        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
                        */
                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setRepeatMode(int r3) {
                        /*
                            r2 = this;
                            int r0 = r2.mRepeatMode
                            if (r0 == r3) goto L21
                            r2.mRepeatMode = r3
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mExtraControllerCallbacks
                            int r0 = r0.beginBroadcast()
                            int r0 = r0 + (-1)
                        Le:
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mExtraControllerCallbacks
                            if (r0 < 0) goto L1e
                            android.os.IInterface r1 = r1.getBroadcastItem(r0)
                            android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                            r1.onRepeatModeChanged(r3)     // Catch: android.os.RemoteException -> L1b
                        L1b:
                            int r0 = r0 + (-1)
                            goto Le
                        L1e:
                            r1.finishBroadcast()
                        L21:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21.setRepeatMode(int):void");
                    }

                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setSessionActivity(PendingIntent pendingIntent) {
/* 3 */                 MediaSessionCompatApi21.setSessionActivity(this.mSessionObj, pendingIntent);
                    }

                    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
                        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
                        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
                        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
                        */
                    @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
                    public void setShuffleMode(int r3) {
                        /*
                            r2 = this;
                            int r0 = r2.mShuffleMode
                            if (r0 == r3) goto L21
                            r2.mShuffleMode = r3
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mExtraControllerCallbacks
                            int r0 = r0.beginBroadcast()
                            int r0 = r0 + (-1)
                        Le:
                            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mExtraControllerCallbacks
                            if (r0 < 0) goto L1e
                            android.os.IInterface r1 = r1.getBroadcastItem(r0)
                            android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                            r1.onShuffleModeChanged(r3)     // Catch: android.os.RemoteException -> L1b
                        L1b:
                            int r0 = r0 + (-1)
                            goto Le
                        L1e:
                            r1.finishBroadcast()
                        L21:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21.setShuffleMode(int):void");
                    }

/* 36 */            public MediaSessionImplApi21(Object obj) {
/* 40 */                Object objVerifySession = MediaSessionCompatApi21.verifySession(obj);
                        this.mSessionObj = objVerifySession;
/* 41 */                this.mToken = new Token(MediaSessionCompatApi21.getSessionToken(objVerifySession), new ExtraSession());
                    }
                }

/* 198 */       public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
/* 199 */           this(context, str, componentName, pendingIntent, null);
                }

/* 199 */       public MediaSessionCompat(Context context, String str, Bundle bundle) {
/* 200 */           this(context, str, null, null, bundle);
                }

/* 200 */       public MediaSessionCompat(Context context, String str) {
/* 201 */           this(context, str, null, null);
                }

/* 201 */       private MediaSessionCompat(Context context, MediaSessionImpl mediaSessionImpl) {
/* 203 */           this.mActiveListeners = new ArrayList<>();
/* 204 */           this.mImpl = mediaSessionImpl;
/* 205 */           if (!MediaSessionCompatApi21.hasCallback(mediaSessionImpl.getMediaSession())) {
/* 206 */               setCallback(new Callback() { // from class: android.support.v4.media.session.MediaSessionCompat.3
                        });
                    }
/* 207 */           this.mController = new MediaControllerCompat(context, this);
                }
            }
