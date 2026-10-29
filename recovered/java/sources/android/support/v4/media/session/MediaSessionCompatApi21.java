            package android.support.v4.media.session;

            import android.app.PendingIntent;
            import android.content.Context;
            import android.content.Intent;
            import android.media.AudioAttributes;
            import android.media.MediaDescription;
            import android.media.MediaMetadata;
            import android.media.Rating;
            import android.media.VolumeProvider;
            import android.media.session.MediaSession;
            import android.media.session.PlaybackState;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Parcelable;
            import android.os.ResultReceiver;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.Field;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class MediaSessionCompatApi21 {
                static final String TAG = "MediaSessionCompatApi21";

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface Callback {
                    void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver);

                    void onCustomAction(String str, Bundle bundle);

                    void onFastForward();

                    boolean onMediaButtonEvent(Intent intent);

                    void onPause();

                    void onPlay();

                    void onPlayFromMediaId(String str, Bundle bundle);

                    void onPlayFromSearch(String str, Bundle bundle);

                    void onRewind();

                    void onSeekTo(long j);

                    void onSetRating(Object obj);

                    void onSetRating(Object obj, Bundle bundle);

                    void onSkipToNext();

                    void onSkipToPrevious();

                    void onSkipToQueueItem(long j);

                    void onStop();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class CallbackProxy<T extends Callback> extends MediaSession.Callback {
                    protected final T mCallback;

                    public CallbackProxy(T t) {
/* 4 */                 this.mCallback = t;
                    }

                    @Override // android.media.session.MediaSession.Callback
                    public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
/* 1 */                 MediaSessionCompat.ensureClassLoader(bundle);
/* 6 */                 this.mCallback.onCommand(str, bundle, resultReceiver);
                    }

                    @Override // android.media.session.MediaSession.Callback
                    public void onCustomAction(String str, Bundle bundle) {
/* 1 */                 MediaSessionCompat.ensureClassLoader(bundle);
/* 6 */                 this.mCallback.onCustomAction(str, bundle);
                    }

                    @Override // android.media.session.MediaSession.Callback
                    public void onFastForward() {
/* 3 */                 this.mCallback.onFastForward();
                    }

                    @Override // android.media.session.MediaSession.Callback
                    public boolean onMediaButtonEvent(Intent intent) {
                        return this.mCallback.onMediaButtonEvent(intent) || super.onMediaButtonEvent(intent);
                    }

                    @Override // android.media.session.MediaSession.Callback
                    public void onPause() {
/* 3 */                 this.mCallback.onPause();
                    }

                    @Override // android.media.session.MediaSession.Callback
                    public void onPlay() {
/* 3 */                 this.mCallback.onPlay();
                    }

                    @Override // android.media.session.MediaSession.Callback
                    public void onPlayFromMediaId(String str, Bundle bundle) {
/* 1 */                 MediaSessionCompat.ensureClassLoader(bundle);
/* 6 */                 this.mCallback.onPlayFromMediaId(str, bundle);
                    }

                    @Override // android.media.session.MediaSession.Callback
                    public void onPlayFromSearch(String str, Bundle bundle) {
/* 1 */                 MediaSessionCompat.ensureClassLoader(bundle);
/* 6 */                 this.mCallback.onPlayFromSearch(str, bundle);
                    }

                    @Override // android.media.session.MediaSession.Callback
                    public void onRewind() {
/* 3 */                 this.mCallback.onRewind();
                    }

                    @Override // android.media.session.MediaSession.Callback
                    public void onSeekTo(long j) {
/* 3 */                 this.mCallback.onSeekTo(j);
                    }

                    @Override // android.media.session.MediaSession.Callback
                    public void onSetRating(Rating rating) {
/* 3 */                 this.mCallback.onSetRating(rating);
                    }

                    @Override // android.media.session.MediaSession.Callback
                    public void onSkipToNext() {
/* 3 */                 this.mCallback.onSkipToNext();
                    }

                    @Override // android.media.session.MediaSession.Callback
                    public void onSkipToPrevious() {
/* 3 */                 this.mCallback.onSkipToPrevious();
                    }

                    @Override // android.media.session.MediaSession.Callback
                    public void onSkipToQueueItem(long j) {
/* 3 */                 this.mCallback.onSkipToQueueItem(j);
                    }

                    @Override // android.media.session.MediaSession.Callback
                    public void onStop() {
/* 3 */                 this.mCallback.onStop();
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class QueueItem {
                    private QueueItem() {
                    }

                    public static Object createItem(Object obj, long j) {
/* 5 */                 return new MediaSession.QueueItem((MediaDescription) obj, j);
                    }

                    public static Object getDescription(Object obj) {
/* 3 */                 return ((MediaSession.QueueItem) obj).getDescription();
                    }

                    public static long getQueueId(Object obj) {
/* 3 */                 return ((MediaSession.QueueItem) obj).getQueueId();
                    }
                }

                private MediaSessionCompatApi21() {
                }

                public static Object createCallback(Callback callback) {
/* 3 */             return new CallbackProxy(callback);
                }

                public static Object createSession(Context context, String str) {
/* 3 */             return new MediaSession(context, str);
                }

                public static Parcelable getSessionToken(Object obj) {
/* 3 */             return ((MediaSession) obj).getSessionToken();
                }

                public static boolean hasCallback(Object obj) {
                    try {
/* 8 */                 Field declaredField = obj.getClass().getDeclaredField("mCallback");
/* 12 */                if (declaredField != null) {
/* 15 */                    declaredField.setAccessible(true);
                            return declaredField.get(obj) != null;
                        }
                    } catch (IllegalAccessException | NoSuchFieldException unused) {
/* 30 */                AbstractC1245n0.m4889q(TAG, "Failed to get mCallback object.");
                    }
/* 1 */             return false;
                }

                public static boolean isActive(Object obj) {
/* 3 */             return ((MediaSession) obj).isActive();
                }

                public static void release(Object obj) {
/* 3 */             ((MediaSession) obj).release();
                }

                public static void sendSessionEvent(Object obj, String str, Bundle bundle) {
/* 3 */             ((MediaSession) obj).sendSessionEvent(str, bundle);
                }

                public static void setActive(Object obj, boolean z) {
/* 3 */             ((MediaSession) obj).setActive(z);
                }

                public static void setCallback(Object obj, Object obj2, Handler handler) {
/* 5 */             ((MediaSession) obj).setCallback((MediaSession.Callback) obj2, handler);
                }

                public static void setExtras(Object obj, Bundle bundle) {
/* 3 */             ((MediaSession) obj).setExtras(bundle);
                }

                public static void setFlags(Object obj, int i) {
/* 3 */             ((MediaSession) obj).setFlags(i);
                }

                public static void setMediaButtonReceiver(Object obj, PendingIntent pendingIntent) {
/* 3 */             ((MediaSession) obj).setMediaButtonReceiver(pendingIntent);
                }

                public static void setMetadata(Object obj, Object obj2) {
/* 5 */             ((MediaSession) obj).setMetadata((MediaMetadata) obj2);
                }

                public static void setPlaybackState(Object obj, Object obj2) {
/* 5 */             ((MediaSession) obj).setPlaybackState((PlaybackState) obj2);
                }

                public static void setPlaybackToLocal(Object obj, int i) {
/* 3 */             AudioAttributes.Builder builder = new AudioAttributes.Builder();
/* 6 */             builder.setLegacyStreamType(i);
/* 15 */            ((MediaSession) obj).setPlaybackToLocal(builder.build());
                }

                public static void setPlaybackToRemote(Object obj, Object obj2) {
/* 5 */             ((MediaSession) obj).setPlaybackToRemote((VolumeProvider) obj2);
                }

                public static void setQueue(Object obj, List<Object> list) {
/* 1 */             if (list == null) {
/* 6 */                 ((MediaSession) obj).setQueue(null);
/* 9 */                 return;
                    }
/* 12 */            ArrayList arrayList = new ArrayList();
/* 15 */            Iterator<Object> it = list.iterator();
/* 23 */            while (it.hasNext()) {
/* 31 */                arrayList.add((MediaSession.QueueItem) it.next());
                    }
/* 37 */            ((MediaSession) obj).setQueue(arrayList);
                }

                public static void setQueueTitle(Object obj, CharSequence charSequence) {
/* 3 */             ((MediaSession) obj).setQueueTitle(charSequence);
                }

                public static void setSessionActivity(Object obj, PendingIntent pendingIntent) {
/* 3 */             ((MediaSession) obj).setSessionActivity(pendingIntent);
                }

                public static Object verifySession(Object obj) {
/* 3 */             if (obj instanceof MediaSession) {
/* 5 */                 return obj;
                    }
/* 8 */             C1951n4.m6859j("mediaSession is not a valid MediaSession object");
/* 11 */            return null;
                }

                public static Object verifyToken(Object obj) {
/* 3 */             if (obj instanceof MediaSession.Token) {
/* 5 */                 return obj;
                    }
/* 8 */             C1951n4.m6859j("token is not a valid MediaSession.Token object");
/* 11 */            return null;
                }
            }
