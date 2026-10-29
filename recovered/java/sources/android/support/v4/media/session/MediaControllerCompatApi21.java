            package android.support.v4.media.session;

            import android.app.Activity;
            import android.app.PendingIntent;
            import android.content.Context;
            import android.media.AudioAttributes;
            import android.media.MediaMetadata;
            import android.media.Rating;
            import android.media.session.MediaController;
            import android.media.session.MediaSession;
            import android.media.session.PlaybackState;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.ResultReceiver;
            import android.view.KeyEvent;
            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class MediaControllerCompatApi21 {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface Callback {
                    void onAudioInfoChanged(int i, int i2, int i3, int i4, int i5);

                    void onExtrasChanged(Bundle bundle);

                    void onMetadataChanged(Object obj);

                    void onPlaybackStateChanged(Object obj);

                    void onQueueChanged(List<?> list);

                    void onQueueTitleChanged(CharSequence charSequence);

                    void onSessionDestroyed();

                    void onSessionEvent(String str, Bundle bundle);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class CallbackProxy<T extends Callback> extends MediaController.Callback {
                    protected final T mCallback;

                    public CallbackProxy(T t) {
/* 4 */                 this.mCallback = t;
                    }

                    @Override // android.media.session.MediaController.Callback
                    public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
/* 23 */                this.mCallback.onAudioInfoChanged(playbackInfo.getPlaybackType(), PlaybackInfo.getLegacyAudioStream(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
                    }

                    @Override // android.media.session.MediaController.Callback
                    public void onExtrasChanged(Bundle bundle) {
/* 1 */                 MediaSessionCompat.ensureClassLoader(bundle);
/* 6 */                 this.mCallback.onExtrasChanged(bundle);
                    }

                    @Override // android.media.session.MediaController.Callback
                    public void onMetadataChanged(MediaMetadata mediaMetadata) {
/* 3 */                 this.mCallback.onMetadataChanged(mediaMetadata);
                    }

                    @Override // android.media.session.MediaController.Callback
                    public void onPlaybackStateChanged(PlaybackState playbackState) {
/* 3 */                 this.mCallback.onPlaybackStateChanged(playbackState);
                    }

                    @Override // android.media.session.MediaController.Callback
                    public void onQueueChanged(List<MediaSession.QueueItem> list) {
/* 3 */                 this.mCallback.onQueueChanged(list);
                    }

                    @Override // android.media.session.MediaController.Callback
                    public void onQueueTitleChanged(CharSequence charSequence) {
/* 3 */                 this.mCallback.onQueueTitleChanged(charSequence);
                    }

                    @Override // android.media.session.MediaController.Callback
                    public void onSessionDestroyed() {
/* 3 */                 this.mCallback.onSessionDestroyed();
                    }

                    @Override // android.media.session.MediaController.Callback
                    public void onSessionEvent(String str, Bundle bundle) {
/* 1 */                 MediaSessionCompat.ensureClassLoader(bundle);
/* 6 */                 this.mCallback.onSessionEvent(str, bundle);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class PlaybackInfo {
                    private static final int FLAG_SCO = 4;
                    private static final int STREAM_BLUETOOTH_SCO = 6;
                    private static final int STREAM_SYSTEM_ENFORCED = 7;

                    private PlaybackInfo() {
                    }

                    public static AudioAttributes getAudioAttributes(Object obj) {
/* 3 */                 return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
                    }

                    public static int getCurrentVolume(Object obj) {
/* 3 */                 return ((MediaController.PlaybackInfo) obj).getCurrentVolume();
                    }

                    public static int getLegacyAudioStream(Object obj) {
/* 5 */                 return toLegacyStreamType(getAudioAttributes(obj));
                    }

                    public static int getMaxVolume(Object obj) {
/* 3 */                 return ((MediaController.PlaybackInfo) obj).getMaxVolume();
                    }

                    public static int getPlaybackType(Object obj) {
/* 3 */                 return ((MediaController.PlaybackInfo) obj).getPlaybackType();
                    }

                    public static int getVolumeControl(Object obj) {
/* 3 */                 return ((MediaController.PlaybackInfo) obj).getVolumeControl();
                    }

                    private static int toLegacyStreamType(AudioAttributes audioAttributes) {
/* 7 */                 if ((audioAttributes.getFlags() & 1) == 1) {
/* 9 */                     return 7;
                        }
/* 17 */                if ((audioAttributes.getFlags() & 4) == 4) {
/* 19 */                    return 6;
                        }
/* 21 */                int usage = audioAttributes.getUsage();
/* 27 */                if (usage == 13) {
/* 5 */                     return 1;
                        }
                        switch (usage) {
                            case 2:
/* 42 */                        return 0;
                            case 3:
/* 39 */                        return 8;
                            case 4:
/* 15 */                        return 4;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
/* 36 */                        return 5;
                            case 6:
/* 34 */                        return 2;
                            default:
/* 32 */                        return 3;
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class TransportControls {
                    private TransportControls() {
                    }

                    public static void fastForward(Object obj) {
/* 3 */                 ((MediaController.TransportControls) obj).fastForward();
                    }

                    public static void pause(Object obj) {
/* 3 */                 ((MediaController.TransportControls) obj).pause();
                    }

                    public static void play(Object obj) {
/* 3 */                 ((MediaController.TransportControls) obj).play();
                    }

                    public static void playFromMediaId(Object obj, String str, Bundle bundle) {
/* 3 */                 ((MediaController.TransportControls) obj).playFromMediaId(str, bundle);
                    }

                    public static void playFromSearch(Object obj, String str, Bundle bundle) {
/* 3 */                 ((MediaController.TransportControls) obj).playFromSearch(str, bundle);
                    }

                    public static void rewind(Object obj) {
/* 3 */                 ((MediaController.TransportControls) obj).rewind();
                    }

                    public static void seekTo(Object obj, long j) {
/* 3 */                 ((MediaController.TransportControls) obj).seekTo(j);
                    }

                    public static void sendCustomAction(Object obj, String str, Bundle bundle) {
/* 3 */                 ((MediaController.TransportControls) obj).sendCustomAction(str, bundle);
                    }

                    public static void setRating(Object obj, Object obj2) {
/* 5 */                 ((MediaController.TransportControls) obj).setRating((Rating) obj2);
                    }

                    public static void skipToNext(Object obj) {
/* 3 */                 ((MediaController.TransportControls) obj).skipToNext();
                    }

                    public static void skipToPrevious(Object obj) {
/* 3 */                 ((MediaController.TransportControls) obj).skipToPrevious();
                    }

                    public static void skipToQueueItem(Object obj, long j) {
/* 3 */                 ((MediaController.TransportControls) obj).skipToQueueItem(j);
                    }

                    public static void stop(Object obj) {
/* 3 */                 ((MediaController.TransportControls) obj).stop();
                    }
                }

                private MediaControllerCompatApi21() {
                }

                public static void adjustVolume(Object obj, int i, int i2) {
/* 3 */             ((MediaController) obj).adjustVolume(i, i2);
                }

                public static Object createCallback(Callback callback) {
/* 3 */             return new CallbackProxy(callback);
                }

                public static boolean dispatchMediaButtonEvent(Object obj, KeyEvent keyEvent) {
/* 3 */             return ((MediaController) obj).dispatchMediaButtonEvent(keyEvent);
                }

                public static Object fromToken(Context context, Object obj) {
/* 5 */             return new MediaController(context, (MediaSession.Token) obj);
                }

                public static Bundle getExtras(Object obj) {
/* 3 */             return ((MediaController) obj).getExtras();
                }

                public static long getFlags(Object obj) {
/* 3 */             return ((MediaController) obj).getFlags();
                }

                public static Object getMediaController(Activity activity) {
/* 1 */             return activity.getMediaController();
                }

                public static Object getMetadata(Object obj) {
/* 3 */             return ((MediaController) obj).getMetadata();
                }

                public static String getPackageName(Object obj) {
/* 3 */             return ((MediaController) obj).getPackageName();
                }

                public static Object getPlaybackInfo(Object obj) {
/* 3 */             return ((MediaController) obj).getPlaybackInfo();
                }

                public static Object getPlaybackState(Object obj) {
/* 3 */             return ((MediaController) obj).getPlaybackState();
                }

                public static List<Object> getQueue(Object obj) {
/* 3 */             List<MediaSession.QueueItem> queue = ((MediaController) obj).getQueue();
/* 7 */             if (queue == null) {
/* 9 */                 return null;
                    }
/* 13 */            return new ArrayList(queue);
                }

                public static CharSequence getQueueTitle(Object obj) {
/* 3 */             return ((MediaController) obj).getQueueTitle();
                }

                public static int getRatingType(Object obj) {
/* 3 */             return ((MediaController) obj).getRatingType();
                }

                public static PendingIntent getSessionActivity(Object obj) {
/* 3 */             return ((MediaController) obj).getSessionActivity();
                }

                public static Object getSessionToken(Object obj) {
/* 3 */             return ((MediaController) obj).getSessionToken();
                }

                public static Object getTransportControls(Object obj) {
/* 3 */             return ((MediaController) obj).getTransportControls();
                }

                public static void registerCallback(Object obj, Object obj2, Handler handler) {
/* 5 */             ((MediaController) obj).registerCallback((MediaController.Callback) obj2, handler);
                }

                public static void sendCommand(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
/* 3 */             ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
                }

                public static void setMediaController(Activity activity, Object obj) {
/* 3 */             activity.setMediaController((MediaController) obj);
                }

                public static void setVolumeTo(Object obj, int i, int i2) {
/* 3 */             ((MediaController) obj).setVolumeTo(i, i2);
                }

                public static void unregisterCallback(Object obj, Object obj2) {
/* 5 */             ((MediaController) obj).unregisterCallback((MediaController.Callback) obj2);
                }
            }
