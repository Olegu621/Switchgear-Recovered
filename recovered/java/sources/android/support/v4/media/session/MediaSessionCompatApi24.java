            package android.support.v4.media.session;

            import android.media.session.MediaSession;
            import android.net.Uri;
            import android.os.Bundle;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.InvocationTargetException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class MediaSessionCompatApi24 {
                private static final String TAG = "MediaSessionCompatApi24";

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface Callback extends MediaSessionCompatApi23.Callback {
                    void onPrepare();

                    void onPrepareFromMediaId(String str, Bundle bundle);

                    void onPrepareFromSearch(String str, Bundle bundle);

                    void onPrepareFromUri(Uri uri, Bundle bundle);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class CallbackProxy<T extends Callback> extends MediaSessionCompatApi23.CallbackProxy<T> {
                    public CallbackProxy(T t) {
/* 1 */                 super(t);
                    }

                    @Override // android.media.session.MediaSession.Callback
                    public void onPrepare() {
/* 5 */                 ((Callback) this.mCallback).onPrepare();
                    }

                    @Override // android.media.session.MediaSession.Callback
                    public void onPrepareFromMediaId(String str, Bundle bundle) {
/* 1 */                 MediaSessionCompat.ensureClassLoader(bundle);
/* 8 */                 ((Callback) this.mCallback).onPrepareFromMediaId(str, bundle);
                    }

                    @Override // android.media.session.MediaSession.Callback
                    public void onPrepareFromSearch(String str, Bundle bundle) {
/* 1 */                 MediaSessionCompat.ensureClassLoader(bundle);
/* 8 */                 ((Callback) this.mCallback).onPrepareFromSearch(str, bundle);
                    }

                    @Override // android.media.session.MediaSession.Callback
                    public void onPrepareFromUri(Uri uri, Bundle bundle) {
/* 1 */                 MediaSessionCompat.ensureClassLoader(bundle);
/* 8 */                 ((Callback) this.mCallback).onPrepareFromUri(uri, bundle);
                    }
                }

                private MediaSessionCompatApi24() {
                }

                public static Object createCallback(Callback callback) {
/* 3 */             return new CallbackProxy(callback);
                }

                public static String getCallingPackage(Object obj) {
/* 1 */             MediaSession mediaSession = (MediaSession) obj;
                    try {
/* 18 */                return (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
/* 30 */                AbstractC1245n0.m4877e(TAG, "Cannot execute MediaSession.getCallingPackage()", e);
/* 3 */                 return null;
                    }
                }
            }
