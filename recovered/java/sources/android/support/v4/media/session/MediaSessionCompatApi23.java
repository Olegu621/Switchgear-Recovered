            package android.support.v4.media.session;

            import android.net.Uri;
            import android.os.Bundle;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class MediaSessionCompatApi23 {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface Callback extends MediaSessionCompatApi21.Callback {
                    void onPlayFromUri(Uri uri, Bundle bundle);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class CallbackProxy<T extends Callback> extends MediaSessionCompatApi21.CallbackProxy<T> {
                    public CallbackProxy(T t) {
/* 1 */                 super(t);
                    }

                    @Override // android.media.session.MediaSession.Callback
                    public void onPlayFromUri(Uri uri, Bundle bundle) {
/* 1 */                 MediaSessionCompat.ensureClassLoader(bundle);
/* 8 */                 ((Callback) this.mCallback).onPlayFromUri(uri, bundle);
                    }
                }

                private MediaSessionCompatApi23() {
                }

                public static Object createCallback(Callback callback) {
/* 3 */             return new CallbackProxy(callback);
                }
            }
