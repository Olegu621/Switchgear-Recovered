            package android.support.v4.media;

            import android.content.ComponentName;
            import android.content.Context;
            import android.media.browse.MediaBrowser;
            import android.os.Bundle;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class MediaBrowserCompatApi21 {
                static final String NULL_MEDIA_ITEM_ID = "android.support.v4.media.MediaBrowserCompat.NULL_MEDIA_ITEM";

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface ConnectionCallback {
                    void onConnected();

                    void onConnectionFailed();

                    void onConnectionSuspended();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class ConnectionCallbackProxy<T extends ConnectionCallback> extends MediaBrowser.ConnectionCallback {
                    protected final T mConnectionCallback;

                    public ConnectionCallbackProxy(T t) {
/* 4 */                 this.mConnectionCallback = t;
                    }

                    @Override // android.media.browse.MediaBrowser.ConnectionCallback
                    public void onConnected() {
/* 3 */                 this.mConnectionCallback.onConnected();
                    }

                    @Override // android.media.browse.MediaBrowser.ConnectionCallback
                    public void onConnectionFailed() {
/* 3 */                 this.mConnectionCallback.onConnectionFailed();
                    }

                    @Override // android.media.browse.MediaBrowser.ConnectionCallback
                    public void onConnectionSuspended() {
/* 3 */                 this.mConnectionCallback.onConnectionSuspended();
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class MediaItem {
                    private MediaItem() {
                    }

                    public static Object getDescription(Object obj) {
/* 3 */                 return ((MediaBrowser.MediaItem) obj).getDescription();
                    }

                    public static int getFlags(Object obj) {
/* 3 */                 return ((MediaBrowser.MediaItem) obj).getFlags();
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface SubscriptionCallback {
                    void onChildrenLoaded(String str, List<?> list);

                    void onError(String str);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SubscriptionCallbackProxy<T extends SubscriptionCallback> extends MediaBrowser.SubscriptionCallback {
                    protected final T mSubscriptionCallback;

                    public SubscriptionCallbackProxy(T t) {
/* 4 */                 this.mSubscriptionCallback = t;
                    }

                    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
                    public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
/* 3 */                 this.mSubscriptionCallback.onChildrenLoaded(str, list);
                    }

                    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
                    public void onError(String str) {
/* 3 */                 this.mSubscriptionCallback.onError(str);
                    }
                }

                private MediaBrowserCompatApi21() {
                }

                public static void connect(Object obj) {
/* 3 */             ((MediaBrowser) obj).connect();
                }

                public static Object createBrowser(Context context, ComponentName componentName, Object obj, Bundle bundle) {
/* 5 */             return new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) obj, bundle);
                }

                public static Object createConnectionCallback(ConnectionCallback connectionCallback) {
/* 3 */             return new ConnectionCallbackProxy(connectionCallback);
                }

                public static Object createSubscriptionCallback(SubscriptionCallback subscriptionCallback) {
/* 3 */             return new SubscriptionCallbackProxy(subscriptionCallback);
                }

                public static void disconnect(Object obj) {
/* 3 */             ((MediaBrowser) obj).disconnect();
                }

                public static Bundle getExtras(Object obj) {
/* 3 */             return ((MediaBrowser) obj).getExtras();
                }

                public static String getRoot(Object obj) {
/* 3 */             return ((MediaBrowser) obj).getRoot();
                }

                public static ComponentName getServiceComponent(Object obj) {
/* 3 */             return ((MediaBrowser) obj).getServiceComponent();
                }

                public static Object getSessionToken(Object obj) {
/* 3 */             return ((MediaBrowser) obj).getSessionToken();
                }

                public static boolean isConnected(Object obj) {
/* 3 */             return ((MediaBrowser) obj).isConnected();
                }

                public static void subscribe(Object obj, String str, Object obj2) {
/* 5 */             ((MediaBrowser) obj).subscribe(str, (MediaBrowser.SubscriptionCallback) obj2);
                }

                public static void unsubscribe(Object obj, String str) {
/* 3 */             ((MediaBrowser) obj).unsubscribe(str);
                }
            }
