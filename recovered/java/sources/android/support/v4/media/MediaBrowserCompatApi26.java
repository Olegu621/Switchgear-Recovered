            package android.support.v4.media;

            import android.media.browse.MediaBrowser;
            import android.os.Bundle;
            import android.support.v4.media.session.MediaSessionCompat;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class MediaBrowserCompatApi26 {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface SubscriptionCallback extends MediaBrowserCompatApi21.SubscriptionCallback {
                    void onChildrenLoaded(String str, List<?> list, Bundle bundle);

                    void onError(String str, Bundle bundle);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SubscriptionCallbackProxy<T extends SubscriptionCallback> extends MediaBrowserCompatApi21.SubscriptionCallbackProxy<T> {
                    public SubscriptionCallbackProxy(T t) {
/* 1 */                 super(t);
                    }

                    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
                    public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
/* 1 */                 MediaSessionCompat.ensureClassLoader(bundle);
/* 8 */                 ((SubscriptionCallback) this.mSubscriptionCallback).onChildrenLoaded(str, list, bundle);
                    }

                    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
                    public void onError(String str, Bundle bundle) {
/* 1 */                 MediaSessionCompat.ensureClassLoader(bundle);
/* 8 */                 ((SubscriptionCallback) this.mSubscriptionCallback).onError(str, bundle);
                    }
                }

                private MediaBrowserCompatApi26() {
                }

                public static Object createSubscriptionCallback(SubscriptionCallback subscriptionCallback) {
/* 3 */             return new SubscriptionCallbackProxy(subscriptionCallback);
                }

                public static void subscribe(Object obj, String str, Bundle bundle, Object obj2) {
/* 5 */             ((MediaBrowser) obj).subscribe(str, bundle, (MediaBrowser.SubscriptionCallback) obj2);
                }

                public static void unsubscribe(Object obj, String str, Object obj2) {
/* 5 */             ((MediaBrowser) obj).unsubscribe(str, (MediaBrowser.SubscriptionCallback) obj2);
                }
            }
