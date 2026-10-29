            package android.support.v4.media;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.ServiceConnection;
            import android.os.BadParcelableException;
            import android.os.Binder;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.IBinder;
            import android.os.Message;
            import android.os.Messenger;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.RemoteException;
            import android.support.v4.media.session.IMediaSession;
            import android.support.v4.media.session.MediaSessionCompat;
            import android.support.v4.os.ResultReceiver;
            import android.text.TextUtils;
            import android.util.Log;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import p000.C1024id;
            import p000.C1951n4;
            import p000.f42;
            import p000.fm0;
            import p000.i13;
            import p000.s80;
            import p000.xb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 25 */    public final class MediaBrowserCompat {
                public static final String CUSTOM_ACTION_DOWNLOAD = "android.support.v4.media.action.DOWNLOAD";
                public static final String CUSTOM_ACTION_REMOVE_DOWNLOADED_FILE = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";
                public static final String EXTRA_DOWNLOAD_PROGRESS = "android.media.browse.extra.DOWNLOAD_PROGRESS";
                public static final String EXTRA_MEDIA_ID = "android.media.browse.extra.MEDIA_ID";
                public static final String EXTRA_PAGE = "android.media.browse.extra.PAGE";
                public static final String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
                private final MediaBrowserImpl mImpl;
                static final String TAG = "MediaBrowserCompat";
                static final boolean DEBUG = Log.isLoggable(TAG, 3);

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class CallbackHandler extends Handler {
                    private final WeakReference<MediaBrowserServiceCallbackImpl> mCallbackImplRef;
                    private WeakReference<Messenger> mCallbacksMessengerRef;

                    public CallbackHandler(MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl) {
/* 9 */                 this.mCallbackImplRef = new WeakReference<>(mediaBrowserServiceCallbackImpl);
                    }

                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
/* 7 */                 WeakReference<Messenger> weakReference = this.mCallbacksMessengerRef;
/* 9 */                 if (weakReference == null || weakReference.get() == null || this.mCallbackImplRef.get() == null) {
/* 162 */                   return;
                        }
/* 27 */                Bundle data = message.getData();
/* 31 */                MediaSessionCompat.ensureClassLoader(data);
/* 36 */                MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl = this.mCallbackImplRef.get();
/* 45 */                Messenger messenger = this.mCallbacksMessengerRef.get();
                        try {
/* 53 */                    int i = message.what;
/* 57 */                    if (i == 1) {
/* 127 */                       Bundle bundle = data.getBundle("data_root_hints");
/* 131 */                       MediaSessionCompat.ensureClassLoader(bundle);
/* 146 */                       mediaBrowserServiceCallbackImpl.onServiceConnected(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
/* 149 */                       return;
                            }
/* 60 */                    if (i == 2) {
/* 121 */                       mediaBrowserServiceCallbackImpl.onConnectionFailed(messenger);
/* 124 */                       return;
                            }
/* 63 */                    if (i != 3) {
/* 85 */                        AbstractC1245n0.m4889q(MediaBrowserCompat.TAG, "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
/* 88 */                        return;
                            }
/* 91 */                    Bundle bundle2 = data.getBundle("data_options");
/* 95 */                    MediaSessionCompat.ensureClassLoader(bundle2);
/* 100 */                   Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
/* 104 */                   MediaSessionCompat.ensureClassLoader(bundle3);
/* 117 */                   mediaBrowserServiceCallbackImpl.onLoadChildren(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                        } catch (BadParcelableException unused) {
/* 152 */                   AbstractC1245n0.m4876d(MediaBrowserCompat.TAG, "Could not unparcel the data.");
/* 157 */                   if (message.what == 1) {
/* 159 */                       mediaBrowserServiceCallbackImpl.onConnectionFailed(messenger);
                            }
                        }
                    }

                    public void setCallbacksMessenger(Messenger messenger) {
/* 6 */                 this.mCallbacksMessengerRef = new WeakReference<>(messenger);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class ConnectionCallback {
                    ConnectionCallbackInternal mConnectionCallbackInternal;
                    final Object mConnectionCallbackObj = MediaBrowserCompatApi21.createConnectionCallback(new StubApi21());

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public interface ConnectionCallbackInternal {
                        void onConnected();

                        void onConnectionFailed();

                        void onConnectionSuspended();
                    }

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public class StubApi21 implements MediaBrowserCompatApi21.ConnectionCallback {
                        public StubApi21() {
                        }

                        @Override // android.support.v4.media.MediaBrowserCompatApi21.ConnectionCallback
                        public void onConnected() {
/* 3 */                     ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.mConnectionCallbackInternal;
/* 5 */                     if (connectionCallbackInternal != null) {
/* 7 */                         connectionCallbackInternal.onConnected();
                            }
/* 12 */                    ConnectionCallback.this.onConnected();
                        }

                        @Override // android.support.v4.media.MediaBrowserCompatApi21.ConnectionCallback
                        public void onConnectionFailed() {
/* 3 */                     ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.mConnectionCallbackInternal;
/* 5 */                     if (connectionCallbackInternal != null) {
/* 7 */                         connectionCallbackInternal.onConnectionFailed();
                            }
/* 12 */                    ConnectionCallback.this.onConnectionFailed();
                        }

                        @Override // android.support.v4.media.MediaBrowserCompatApi21.ConnectionCallback
                        public void onConnectionSuspended() {
/* 3 */                     ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.mConnectionCallbackInternal;
/* 5 */                     if (connectionCallbackInternal != null) {
/* 7 */                         connectionCallbackInternal.onConnectionSuspended();
                            }
/* 12 */                    ConnectionCallback.this.onConnectionSuspended();
                        }
                    }

                    public void onConnected() {
                    }

                    public void onConnectionFailed() {
                    }

                    public void onConnectionSuspended() {
                    }

                    public void setInternalConnectionCallback(ConnectionCallbackInternal connectionCallbackInternal) {
/* 1 */                 this.mConnectionCallbackInternal = connectionCallbackInternal;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class CustomActionCallback {
                    public void onError(String str, Bundle bundle, Bundle bundle2) {
                    }

                    public void onProgressUpdate(String str, Bundle bundle, Bundle bundle2) {
                    }

                    public void onResult(String str, Bundle bundle, Bundle bundle2) {
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class CustomActionResultReceiver extends ResultReceiver {
                    private final String mAction;
                    private final CustomActionCallback mCallback;
                    private final Bundle mExtras;

                    public CustomActionResultReceiver(String str, Bundle bundle, CustomActionCallback customActionCallback, Handler handler) {
/* 1 */                 super(handler);
/* 4 */                 this.mAction = str;
/* 6 */                 this.mExtras = bundle;
/* 8 */                 this.mCallback = customActionCallback;
                    }

                    @Override // android.support.v4.os.ResultReceiver
                    public void onReceiveResult(int i, Bundle bundle) {
/* 3 */                 if (this.mCallback == null) {
/* 5 */                     return;
                        }
/* 6 */                 MediaSessionCompat.ensureClassLoader(bundle);
/* 10 */                if (i == -1) {
/* 79 */                    this.mCallback.onError(this.mAction, this.mExtras, bundle);
/* 82 */                    return;
                        }
/* 12 */                if (i == 0) {
/* 69 */                    this.mCallback.onResult(this.mAction, this.mExtras, bundle);
/* 72 */                    return;
                        }
/* 15 */                if (i == 1) {
/* 59 */                    this.mCallback.onProgressUpdate(this.mAction, this.mExtras, bundle);
/* 62 */                    return;
                        }
/* 21 */                StringBuilder sbM3793s = fm0.m3793s(i, "Unknown result code: ", " (extras=");
/* 27 */                sbM3793s.append(this.mExtras);
/* 32 */                sbM3793s.append(", resultData=");
/* 35 */                sbM3793s.append(bundle);
/* 40 */                sbM3793s.append(")");
/* 49 */                AbstractC1245n0.m4889q(MediaBrowserCompat.TAG, sbM3793s.toString());
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class ItemCallback {
                    final Object mItemCallbackObj = MediaBrowserCompatApi23.createItemCallback(new StubApi23());

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public class StubApi23 implements MediaBrowserCompatApi23.ItemCallback {
                        public StubApi23() {
                        }

                        @Override // android.support.v4.media.MediaBrowserCompatApi23.ItemCallback
                        public void onError(String str) {
/* 3 */                     ItemCallback.this.onError(str);
                        }

                        @Override // android.support.v4.media.MediaBrowserCompatApi23.ItemCallback
                        public void onItemLoaded(Parcel parcel) {
/* 1 */                     if (parcel == null) {
/* 6 */                         ItemCallback.this.onItemLoaded(null);
/* 9 */                         return;
                            }
/* 11 */                    parcel.setDataPosition(0);
/* 16 */                    MediaItem mediaItemCreateFromParcel = MediaItem.CREATOR.createFromParcel(parcel);
/* 22 */                    parcel.recycle();
/* 27 */                    ItemCallback.this.onItemLoaded(mediaItemCreateFromParcel);
                        }
                    }

                    public void onError(String str) {
                    }

                    public void onItemLoaded(MediaItem mediaItem) {
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class ItemReceiver extends ResultReceiver {
                    private final ItemCallback mCallback;
                    private final String mMediaId;

                    public ItemReceiver(String str, ItemCallback itemCallback, Handler handler) {
/* 1 */                 super(handler);
/* 4 */                 this.mMediaId = str;
/* 6 */                 this.mCallback = itemCallback;
                    }

                    @Override // android.support.v4.os.ResultReceiver
                    public void onReceiveResult(int i, Bundle bundle) {
/* 1 */                 MediaSessionCompat.ensureClassLoader(bundle);
/* 4 */                 if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
/* 48 */                    this.mCallback.onError(this.mMediaId);
/* 51 */                    return;
                        }
/* 17 */                Parcelable parcelable = bundle.getParcelable("media_item");
/* 21 */                if (parcelable == null || (parcelable instanceof MediaItem)) {
/* 40 */                    this.mCallback.onItemLoaded((MediaItem) parcelable);
                        } else {
/* 32 */                    this.mCallback.onError(this.mMediaId);
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface MediaBrowserImpl {
                    void connect();

                    void disconnect();

                    Bundle getExtras();

                    void getItem(String str, ItemCallback itemCallback);

                    Bundle getNotifyChildrenChangedOptions();

                    String getRoot();

                    ComponentName getServiceComponent();

                    MediaSessionCompat.Token getSessionToken();

                    boolean isConnected();

                    void search(String str, Bundle bundle, SearchCallback searchCallback);

                    void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback);

                    void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback);

                    void unsubscribe(String str, SubscriptionCallback subscriptionCallback);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class MediaBrowserImplApi21 implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl, ConnectionCallback.ConnectionCallbackInternal {
                    protected final Object mBrowserObj;
                    protected Messenger mCallbacksMessenger;
                    final Context mContext;
                    private MediaSessionCompat.Token mMediaSessionToken;
                    private Bundle mNotifyChildrenChangedOptions;
                    protected final Bundle mRootHints;
                    protected ServiceBinderWrapper mServiceBinderWrapper;
                    protected int mServiceVersion;
                    protected final CallbackHandler mHandler = new CallbackHandler(this);
                    private final C1024id mSubscriptions = new C1024id();

                    public MediaBrowserImplApi21(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
/* 18 */                this.mContext = context;
/* 28 */                Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
/* 31 */                this.mRootHints = bundle2;
/* 36 */                bundle2.putInt("extra_client_version", 1);
/* 39 */                connectionCallback.setInternalConnectionCallback(this);
/* 48 */                this.mBrowserObj = MediaBrowserCompatApi21.createBrowser(context, componentName, connectionCallback.mConnectionCallbackObj, bundle2);
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public void connect() {
/* 3 */                 MediaBrowserCompatApi21.connect(this.mBrowserObj);
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public void disconnect() {
                        Messenger messenger;
/* 1 */                 ServiceBinderWrapper serviceBinderWrapper = this.mServiceBinderWrapper;
/* 3 */                 if (serviceBinderWrapper != null && (messenger = this.mCallbacksMessenger) != null) {
                            try {
/* 9 */                         serviceBinderWrapper.unregisterCallbackMessenger(messenger);
                            } catch (RemoteException unused) {
                            }
                        }
/* 14 */                MediaBrowserCompatApi21.disconnect(this.mBrowserObj);
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public Bundle getExtras() {
/* 3 */                 return MediaBrowserCompatApi21.getExtras(this.mBrowserObj);
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public void getItem(final String str, final ItemCallback itemCallback) {
/* 5 */                 if (TextUtils.isEmpty(str)) {
/* 77 */                    C1951n4.m6859j("mediaId is empty");
/* 80 */                    return;
                        }
/* 7 */                 if (itemCallback == null) {
/* 71 */                    C1951n4.m6859j("cb is null");
/* 74 */                    return;
                        }
/* 15 */                if (!MediaBrowserCompatApi21.isConnected(this.mBrowserObj)) {
/* 24 */                    this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.1
                                @Override // java.lang.Runnable
                                public void run() {
/* 5 */                             itemCallback.onError(str);
                                }
                            });
/* 27 */                    return;
                        }
/* 30 */                if (this.mServiceBinderWrapper == null) {
/* 39 */                    this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.2
                                @Override // java.lang.Runnable
                                public void run() {
/* 5 */                             itemCallback.onError(str);
                                }
                            });
/* 42 */                    return;
                        }
                        try {
/* 54 */                    this.mServiceBinderWrapper.getMediaItem(str, new ItemReceiver(str, itemCallback, this.mHandler), this.mCallbacksMessenger);
                        } catch (RemoteException unused) {
/* 65 */                    this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.3
                                @Override // java.lang.Runnable
                                public void run() {
/* 5 */                             itemCallback.onError(str);
                                }
                            });
                        }
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public Bundle getNotifyChildrenChangedOptions() {
/* 1 */                 return this.mNotifyChildrenChangedOptions;
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public String getRoot() {
/* 3 */                 return MediaBrowserCompatApi21.getRoot(this.mBrowserObj);
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public ComponentName getServiceComponent() {
/* 3 */                 return MediaBrowserCompatApi21.getServiceComponent(this.mBrowserObj);
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public MediaSessionCompat.Token getSessionToken() {
/* 3 */                 if (this.mMediaSessionToken == null) {
/* 15 */                    this.mMediaSessionToken = MediaSessionCompat.Token.fromToken(MediaBrowserCompatApi21.getSessionToken(this.mBrowserObj));
                        }
/* 17 */                return this.mMediaSessionToken;
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public boolean isConnected() {
/* 3 */                 return MediaBrowserCompatApi21.isConnected(this.mBrowserObj);
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
                    public void onConnected() {
/* 3 */                 Bundle extras = MediaBrowserCompatApi21.getExtras(this.mBrowserObj);
/* 7 */                 if (extras == null) {
/* 83 */                    return;
                        }
/* 17 */                this.mServiceVersion = extras.getInt("extra_service_version", 0);
/* 21 */                IBinder binder = extras.getBinder("extra_messenger");
/* 25 */                if (binder != null) {
/* 34 */                    this.mServiceBinderWrapper = new ServiceBinderWrapper(binder, this.mRootHints);
/* 40 */                    Messenger messenger = new Messenger(this.mHandler);
/* 43 */                    this.mCallbacksMessenger = messenger;
/* 47 */                    this.mHandler.setCallbacksMessenger(messenger);
                            try {
/* 56 */                        this.mServiceBinderWrapper.registerCallbackMessenger(this.mContext, this.mCallbacksMessenger);
                            } catch (RemoteException unused) {
                            }
                        }
/* 65 */                IMediaSession iMediaSessionAsInterface = IMediaSession.Stub.asInterface(extras.getBinder("extra_session_binder"));
/* 69 */                if (iMediaSessionAsInterface != null) {
/* 81 */                    this.mMediaSessionToken = MediaSessionCompat.Token.fromToken(MediaBrowserCompatApi21.getSessionToken(this.mBrowserObj), iMediaSessionAsInterface);
                        }
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
                    public void onConnectionFailed() {
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
                    public void onConnectionSuspended() {
/* 2 */                 this.mServiceBinderWrapper = null;
/* 4 */                 this.mCallbacksMessenger = null;
/* 6 */                 this.mMediaSessionToken = null;
/* 10 */                this.mHandler.setCallbacksMessenger(null);
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
                    public void onLoadChildren(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
/* 3 */                 if (this.mCallbacksMessenger != messenger) {
/* 55 */                    return;
                        }
/* 13 */                Subscription subscription = (Subscription) this.mSubscriptions.getOrDefault(str, null);
/* 15 */                if (subscription == null) {
/* 17 */                    String str2 = MediaBrowserCompat.EXTRA_PAGE;
/* 19 */                    return;
                        }
/* 20 */                SubscriptionCallback callback = subscription.getCallback(bundle);
/* 24 */                if (callback != null) {
/* 26 */                    if (bundle == null) {
/* 28 */                        if (list == null) {
/* 30 */                            callback.onError(str);
/* 33 */                            return;
                                }
/* 34 */                        this.mNotifyChildrenChangedOptions = bundle2;
/* 36 */                        callback.onChildrenLoaded(str, list);
/* 39 */                        this.mNotifyChildrenChangedOptions = null;
/* 41 */                        return;
                            }
/* 42 */                    if (list == null) {
/* 44 */                        callback.onError(str, bundle);
/* 47 */                        return;
                            }
/* 48 */                    this.mNotifyChildrenChangedOptions = bundle2;
/* 50 */                    callback.onChildrenLoaded(str, list, bundle);
/* 53 */                    this.mNotifyChildrenChangedOptions = null;
                        }
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
                    public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public void search(final String str, final Bundle bundle, final SearchCallback searchCallback) {
/* 5 */                 if (!isConnected()) {
/* 50 */                    f42.m3656l("search() called while not connected");
/* 53 */                    return;
                        }
/* 9 */                 if (this.mServiceBinderWrapper == null) {
/* 18 */                    this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.4
                                @Override // java.lang.Runnable
                                public void run() {
/* 7 */                             searchCallback.onError(str, bundle);
                                }
                            });
/* 21 */                    return;
                        }
                        try {
/* 33 */                    this.mServiceBinderWrapper.search(str, bundle, new SearchResultReceiver(str, bundle, searchCallback, this.mHandler), this.mCallbacksMessenger);
                        } catch (RemoteException unused) {
/* 44 */                    this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.5
                                @Override // java.lang.Runnable
                                public void run() {
/* 7 */                             searchCallback.onError(str, bundle);
                                }
                            });
                        }
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public void sendCustomAction(final String str, final Bundle bundle, final CustomActionCallback customActionCallback) {
/* 5 */                 if (!isConnected()) {
/* 60 */                    s80.m8431l("Cannot send a custom action (", str, ") with extras ", bundle, " because the browser is not connected to the service.");
/* 63 */                    return;
                        }
/* 9 */                 if (this.mServiceBinderWrapper == null && customActionCallback != null) {
/* 20 */                    this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.6
                                @Override // java.lang.Runnable
                                public void run() {
/* 8 */                             customActionCallback.onError(str, bundle, null);
                                }
                            });
                        }
                        try {
/* 34 */                    this.mServiceBinderWrapper.sendCustomAction(str, bundle, new CustomActionResultReceiver(str, bundle, customActionCallback, this.mHandler), this.mCallbacksMessenger);
                        } catch (RemoteException unused) {
/* 38 */                    Objects.toString(bundle);
/* 41 */                    if (customActionCallback != null) {
/* 50 */                        this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.7
                                    @Override // java.lang.Runnable
                                    public void run() {
/* 8 */                                 customActionCallback.onError(str, bundle, null);
                                    }
                                });
                            }
                        }
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
/* 8 */                 Subscription subscription = (Subscription) this.mSubscriptions.getOrDefault(str, null);
/* 10 */                if (subscription == null) {
/* 14 */                    subscription = new Subscription();
/* 19 */                    this.mSubscriptions.put(str, subscription);
                        }
/* 22 */                subscriptionCallback.setSubscription(subscription);
/* 30 */                Bundle bundle2 = bundle != null ? new Bundle(bundle) : null;
/* 33 */                subscription.putCallback(bundle2, subscriptionCallback);
/* 36 */                ServiceBinderWrapper serviceBinderWrapper = this.mServiceBinderWrapper;
/* 38 */                if (serviceBinderWrapper == null) {
/* 44 */                    MediaBrowserCompatApi21.subscribe(this.mBrowserObj, str, subscriptionCallback.mSubscriptionCallbackObj);
                        } else {
                            try {
/* 52 */                        serviceBinderWrapper.addSubscription(str, subscriptionCallback.mToken, bundle2, this.mCallbacksMessenger);
                            } catch (RemoteException unused) {
                            }
                        }
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
/* 8 */                 Subscription subscription = (Subscription) this.mSubscriptions.getOrDefault(str, null);
/* 10 */                if (subscription == null) {
/* 130 */                   return;
                        }
/* 14 */                ServiceBinderWrapper serviceBinderWrapper = this.mServiceBinderWrapper;
/* 16 */                if (serviceBinderWrapper != null) {
                            try {
/* 69 */                        if (subscriptionCallback == null) {
/* 73 */                            serviceBinderWrapper.removeSubscription(str, null, this.mCallbacksMessenger);
                                } else {
/* 77 */                            List<SubscriptionCallback> callbacks = subscription.getCallbacks();
/* 81 */                            List<Bundle> optionsList = subscription.getOptionsList();
/* 91 */                            for (int size = callbacks.size() - 1; size >= 0; size--) {
/* 97 */                                if (callbacks.get(size) == subscriptionCallback) {
/* 105 */                                   this.mServiceBinderWrapper.removeSubscription(str, subscriptionCallback.mToken, this.mCallbacksMessenger);
/* 108 */                                   callbacks.remove(size);
/* 111 */                                   optionsList.remove(size);
                                        }
                                    }
                                }
                            } catch (RemoteException unused) {
                            }
                        } else if (subscriptionCallback == null) {
/* 22 */                    MediaBrowserCompatApi21.unsubscribe(this.mBrowserObj, str);
                        } else {
/* 26 */                    List<SubscriptionCallback> callbacks2 = subscription.getCallbacks();
/* 30 */                    List<Bundle> optionsList2 = subscription.getOptionsList();
/* 40 */                    for (int size2 = callbacks2.size() - 1; size2 >= 0; size2--) {
/* 46 */                        if (callbacks2.get(size2) == subscriptionCallback) {
/* 48 */                            callbacks2.remove(size2);
/* 51 */                            optionsList2.remove(size2);
                                }
                            }
/* 61 */                    if (callbacks2.size() == 0) {
/* 65 */                        MediaBrowserCompatApi21.unsubscribe(this.mBrowserObj, str);
                            }
                        }
/* 121 */               if (subscription.isEmpty() || subscriptionCallback == null) {
/* 127 */                   this.mSubscriptions.remove(str);
                        }
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
/* 1 */             public void onConnectionFailed(Messenger messenger) {
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class MediaBrowserImplApi23 extends MediaBrowserImplApi21 {
                    public MediaBrowserImplApi23(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
/* 1 */                 super(context, componentName, connectionCallback, bundle);
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public void getItem(String str, ItemCallback itemCallback) {
/* 3 */                 if (this.mServiceBinderWrapper == null) {
/* 9 */                     MediaBrowserCompatApi23.getItem(this.mBrowserObj, str, itemCallback.mItemCallbackObj);
                        } else {
/* 13 */                    super.getItem(str, itemCallback);
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class MediaBrowserImplApi26 extends MediaBrowserImplApi23 {
                    public MediaBrowserImplApi26(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
/* 1 */                 super(context, componentName, connectionCallback, bundle);
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
/* 3 */                 if (this.mServiceBinderWrapper != null && this.mServiceVersion >= 2) {
/* 11 */                    super.subscribe(str, bundle, subscriptionCallback);
/* 14 */                    return;
                        }
/* 15 */                Object obj = this.mBrowserObj;
/* 17 */                if (bundle == null) {
/* 21 */                    MediaBrowserCompatApi21.subscribe(obj, str, subscriptionCallback.mSubscriptionCallbackObj);
                        } else {
/* 27 */                    MediaBrowserCompatApi26.subscribe(obj, str, bundle, subscriptionCallback.mSubscriptionCallbackObj);
                        }
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
/* 3 */                 if (this.mServiceBinderWrapper != null && this.mServiceVersion >= 2) {
/* 11 */                    super.unsubscribe(str, subscriptionCallback);
/* 14 */                    return;
                        }
/* 15 */                Object obj = this.mBrowserObj;
/* 17 */                if (subscriptionCallback == null) {
/* 19 */                    MediaBrowserCompatApi21.unsubscribe(obj, str);
                        } else {
/* 25 */                    MediaBrowserCompatApi26.unsubscribe(obj, str, subscriptionCallback.mSubscriptionCallbackObj);
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class MediaBrowserImplBase implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl {
                    static final int CONNECT_STATE_CONNECTED = 3;
                    static final int CONNECT_STATE_CONNECTING = 2;
                    static final int CONNECT_STATE_DISCONNECTED = 1;
                    static final int CONNECT_STATE_DISCONNECTING = 0;
                    static final int CONNECT_STATE_SUSPENDED = 4;
                    final ConnectionCallback mCallback;
                    Messenger mCallbacksMessenger;
                    final Context mContext;
                    private Bundle mExtras;
                    private MediaSessionCompat.Token mMediaSessionToken;
                    private Bundle mNotifyChildrenChangedOptions;
                    final Bundle mRootHints;
                    private String mRootId;
                    ServiceBinderWrapper mServiceBinderWrapper;
                    final ComponentName mServiceComponent;
                    MediaServiceConnection mServiceConnection;
                    final CallbackHandler mHandler = new CallbackHandler(this);
                    private final C1024id mSubscriptions = new C1024id();
                    int mState = 1;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public class MediaServiceConnection implements ServiceConnection {
                        public MediaServiceConnection() {
                        }

                        private void postOrRun(Runnable runnable) {
/* 17 */                    if (Thread.currentThread() == MediaBrowserImplBase.this.mHandler.getLooper().getThread()) {
/* 19 */                        runnable.run();
                            } else {
/* 27 */                        MediaBrowserImplBase.this.mHandler.post(runnable);
                            }
                        }

                        public boolean isCurrent(String str) {
                            int i;
/* 1 */                     MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
/* 6 */                     if (mediaBrowserImplBase.mServiceConnection == this && (i = mediaBrowserImplBase.mState) != 0 && i != 1) {
/* 5 */                         return true;
                            }
/* 16 */                    int i2 = mediaBrowserImplBase.mState;
/* 18 */                    if (i2 == 0 || i2 == 1) {
/* 37 */                        return false;
                            }
/* 24 */                    Objects.toString(mediaBrowserImplBase.mServiceComponent);
/* 31 */                    Objects.toString(MediaBrowserImplBase.this.mServiceConnection);
/* 34 */                    toString();
/* 37 */                    return false;
                        }

                        @Override // android.content.ServiceConnection
                        public void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
/* 6 */                     postOrRun(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection.1
                                @Override // java.lang.Runnable
                                public void run() {
/* 1 */                             boolean z = MediaBrowserCompat.DEBUG;
/* 3 */                             if (z) {
/* 7 */                                 Objects.toString(componentName);
/* 12 */                                Objects.toString(iBinder);
/* 19 */                                MediaBrowserImplBase.this.dump();
                                    }
/* 30 */                            if (MediaServiceConnection.this.isCurrent("onServiceConnected")) {
/* 35 */                                MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
/* 46 */                                mediaBrowserImplBase.mServiceBinderWrapper = new ServiceBinderWrapper(iBinder, mediaBrowserImplBase.mRootHints);
/* 63 */                                MediaBrowserImplBase.this.mCallbacksMessenger = new Messenger(MediaBrowserImplBase.this.mHandler);
/* 67 */                                MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
/* 73 */                                mediaBrowserImplBase2.mHandler.setCallbacksMessenger(mediaBrowserImplBase2.mCallbacksMessenger);
/* 78 */                                MediaBrowserImplBase mediaBrowserImplBase3 = MediaBrowserImplBase.this;
/* 81 */                                mediaBrowserImplBase3.mState = 2;
/* 83 */                                if (z) {
                                            try {
/* 85 */                                        mediaBrowserImplBase3.dump();
                                            } catch (RemoteException unused) {
/* 124 */                                       AbstractC1245n0.m4889q(MediaBrowserCompat.TAG, "RemoteException during connect for " + MediaBrowserImplBase.this.mServiceComponent);
/* 129 */                                       if (MediaBrowserCompat.DEBUG) {
/* 135 */                                           MediaBrowserImplBase.this.dump();
/* 138 */                                           return;
                                                }
/* 138 */                                       return;
                                            }
                                        }
/* 90 */                                MediaBrowserImplBase mediaBrowserImplBase4 = MediaBrowserImplBase.this;
/* 98 */                                mediaBrowserImplBase4.mServiceBinderWrapper.connect(mediaBrowserImplBase4.mContext, mediaBrowserImplBase4.mCallbacksMessenger);
                                    }
                                }
                            });
                        }

                        @Override // android.content.ServiceConnection
                        public void onServiceDisconnected(final ComponentName componentName) {
/* 6 */                     postOrRun(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection.2
                                @Override // java.lang.Runnable
                                public void run() {
/* 3 */                             if (MediaBrowserCompat.DEBUG) {
/* 7 */                                 Objects.toString(componentName);
/* 10 */                                toString();
/* 19 */                                Objects.toString(MediaBrowserImplBase.this.mServiceConnection);
/* 26 */                                MediaBrowserImplBase.this.dump();
                                    }
/* 37 */                            if (MediaServiceConnection.this.isCurrent("onServiceDisconnected")) {
/* 42 */                                MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
/* 45 */                                mediaBrowserImplBase.mServiceBinderWrapper = null;
/* 47 */                                mediaBrowserImplBase.mCallbacksMessenger = null;
/* 51 */                                mediaBrowserImplBase.mHandler.setCallbacksMessenger(null);
/* 56 */                                MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
/* 59 */                                mediaBrowserImplBase2.mState = 4;
/* 63 */                                mediaBrowserImplBase2.mCallback.onConnectionSuspended();
                                    }
                                }
                            });
                        }
                    }

                    public MediaBrowserImplBase(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
/* 22 */                if (context == null) {
/* 59 */                    C1951n4.m6859j("context must not be null");
/* 62 */                    throw null;
                        }
/* 24 */                if (componentName == null) {
/* 53 */                    C1951n4.m6859j("service component must not be null");
/* 56 */                    throw null;
                        }
/* 26 */                if (connectionCallback == null) {
/* 47 */                    C1951n4.m6859j("connection callback must not be null");
/* 50 */                    throw null;
                        }
/* 28 */                this.mContext = context;
/* 30 */                this.mServiceComponent = componentName;
/* 32 */                this.mCallback = connectionCallback;
/* 42 */                this.mRootHints = bundle != null ? new Bundle(bundle) : null;
                    }

                    private static String getStateLabel(int i) {
/* 1 */                 if (i == 0) {
/* 34 */                    return "CONNECT_STATE_DISCONNECTING";
                        }
/* 4 */                 if (i == 1) {
/* 31 */                    return "CONNECT_STATE_DISCONNECTED";
                        }
/* 7 */                 if (i == 2) {
/* 28 */                    return "CONNECT_STATE_CONNECTING";
                        }
/* 10 */                if (i != 3) {
                            return i != 4 ? fm0.m3781g(i, "UNKNOWN/") : "CONNECT_STATE_SUSPENDED";
                        }
/* 25 */                return "CONNECT_STATE_CONNECTED";
                    }

                    private boolean isCurrent(Messenger messenger, String str) {
                        int i;
/* 4 */                 if (this.mCallbacksMessenger == messenger && (i = this.mState) != 0 && i != 1) {
/* 3 */                     return true;
                        }
/* 14 */                int i2 = this.mState;
/* 16 */                if (i2 == 0 || i2 == 1) {
/* 33 */                    return false;
                        }
/* 22 */                Objects.toString(this.mServiceComponent);
/* 27 */                Objects.toString(this.mCallbacksMessenger);
/* 30 */                toString();
/* 33 */                return false;
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public void connect() {
/* 1 */                 int i = this.mState;
/* 3 */                 if (i != 0 && i != 1) {
/* 28 */                    f42.m3656l(fm0.m3789o(new StringBuilder("connect() called while neigther disconnecting nor disconnected (state="), getStateLabel(this.mState), ")"));
                        } else {
/* 33 */                    this.mState = 2;
/* 42 */                    this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    boolean zBindService;
/* 1 */                             MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
/* 5 */                             if (mediaBrowserImplBase.mState == 0) {
/* 120 */                               return;
                                    }
/* 9 */                             mediaBrowserImplBase.mState = 2;
/* 13 */                            if (MediaBrowserCompat.DEBUG && mediaBrowserImplBase.mServiceConnection != null) {
/* 26 */                                s80.m8423d(MediaBrowserImplBase.this.mServiceConnection, "mServiceConnection should be null. Instead it is ");
/* 29 */                                return;
                                    }
/* 32 */                            if (mediaBrowserImplBase.mServiceBinderWrapper != null) {
/* 137 */                               s80.m8423d(MediaBrowserImplBase.this.mServiceBinderWrapper, "mServiceBinderWrapper should be null. Instead it is ");
/* 140 */                               return;
                                    }
/* 36 */                            if (mediaBrowserImplBase.mCallbacksMessenger != null) {
/* 127 */                               s80.m8423d(MediaBrowserImplBase.this.mCallbacksMessenger, "mCallbacksMessenger should be null. Instead it is ");
/* 130 */                               return;
                                    }
/* 42 */                            Intent intent = new Intent("android.media.browse.MediaBrowserService");
/* 49 */                            intent.setComponent(MediaBrowserImplBase.this.mServiceComponent);
/* 52 */                            MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
/* 59 */                            mediaBrowserImplBase2.mServiceConnection = mediaBrowserImplBase2.new MediaServiceConnection();
                                    try {
/* 61 */                                MediaBrowserImplBase mediaBrowserImplBase3 = MediaBrowserImplBase.this;
/* 68 */                                zBindService = mediaBrowserImplBase3.mContext.bindService(intent, mediaBrowserImplBase3.mServiceConnection, 1);
                                    } catch (Exception unused) {
/* 93 */                                AbstractC1245n0.m4876d(MediaBrowserCompat.TAG, "Failed binding to service " + MediaBrowserImplBase.this.mServiceComponent);
/* 96 */                                zBindService = false;
                                    }
/* 97 */                            if (!zBindService) {
/* 101 */                               MediaBrowserImplBase.this.forceCloseConnection();
/* 108 */                               MediaBrowserImplBase.this.mCallback.onConnectionFailed();
                                    }
/* 113 */                           if (MediaBrowserCompat.DEBUG) {
/* 117 */                               MediaBrowserImplBase.this.dump();
                                    }
                                }
                            });
                        }
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public void disconnect() {
/* 2 */                 this.mState = 0;
/* 11 */                this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.2
                            @Override // java.lang.Runnable
                            public void run() {
/* 1 */                         MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
/* 3 */                         Messenger messenger = mediaBrowserImplBase.mCallbacksMessenger;
/* 5 */                         if (messenger != null) {
                                    try {
/* 9 */                                 mediaBrowserImplBase.mServiceBinderWrapper.disconnect(messenger);
                                    } catch (RemoteException unused) {
/* 33 */                                AbstractC1245n0.m4889q(MediaBrowserCompat.TAG, "RemoteException during connect for " + MediaBrowserImplBase.this.mServiceComponent);
                                    }
                                }
/* 36 */                        MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
/* 38 */                        int i = mediaBrowserImplBase2.mState;
/* 40 */                        mediaBrowserImplBase2.forceCloseConnection();
/* 43 */                        if (i != 0) {
/* 47 */                            MediaBrowserImplBase.this.mState = i;
                                }
/* 51 */                        if (MediaBrowserCompat.DEBUG) {
/* 55 */                            MediaBrowserImplBase.this.dump();
                                }
                            }
                        });
                    }

                    public void dump() {
/* 3 */                 Objects.toString(this.mServiceComponent);
/* 8 */                 Objects.toString(this.mCallback);
/* 13 */                Objects.toString(this.mRootHints);
/* 18 */                getStateLabel(this.mState);
/* 23 */                Objects.toString(this.mServiceConnection);
/* 28 */                Objects.toString(this.mServiceBinderWrapper);
/* 33 */                Objects.toString(this.mCallbacksMessenger);
/* 38 */                Objects.toString(this.mMediaSessionToken);
                    }

                    public void forceCloseConnection() {
/* 1 */                 MediaServiceConnection mediaServiceConnection = this.mServiceConnection;
/* 3 */                 if (mediaServiceConnection != null) {
/* 7 */                     this.mContext.unbindService(mediaServiceConnection);
                        }
/* 11 */                this.mState = 1;
/* 14 */                this.mServiceConnection = null;
/* 16 */                this.mServiceBinderWrapper = null;
/* 18 */                this.mCallbacksMessenger = null;
/* 22 */                this.mHandler.setCallbacksMessenger(null);
/* 25 */                this.mRootId = null;
/* 27 */                this.mMediaSessionToken = null;
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public Bundle getExtras() {
/* 5 */                 if (isConnected()) {
/* 7 */                     return this.mExtras;
                        }
/* 29 */                f42.m3656l(fm0.m3789o(new StringBuilder("getExtras() called while not connected (state="), getStateLabel(this.mState), ")"));
/* 32 */                return null;
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public void getItem(final String str, final ItemCallback itemCallback) {
/* 5 */                 if (TextUtils.isEmpty(str)) {
/* 60 */                    C1951n4.m6859j("mediaId is empty");
/* 63 */                    return;
                        }
/* 7 */                 if (itemCallback == null) {
/* 54 */                    C1951n4.m6859j("cb is null");
/* 57 */                    return;
                        }
/* 13 */                if (!isConnected()) {
/* 22 */                    this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.3
                                @Override // java.lang.Runnable
                                public void run() {
/* 5 */                             itemCallback.onError(str);
                                }
                            });
/* 25 */                    return;
                        }
                        try {
/* 37 */                    this.mServiceBinderWrapper.getMediaItem(str, new ItemReceiver(str, itemCallback, this.mHandler), this.mCallbacksMessenger);
                        } catch (RemoteException unused) {
/* 48 */                    this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.4
                                @Override // java.lang.Runnable
                                public void run() {
/* 5 */                             itemCallback.onError(str);
                                }
                            });
                        }
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public Bundle getNotifyChildrenChangedOptions() {
/* 1 */                 return this.mNotifyChildrenChangedOptions;
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public String getRoot() {
/* 5 */                 if (isConnected()) {
/* 7 */                     return this.mRootId;
                        }
/* 29 */                f42.m3656l(fm0.m3789o(new StringBuilder("getRoot() called while not connected(state="), getStateLabel(this.mState), ")"));
/* 32 */                return null;
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public ComponentName getServiceComponent() {
/* 5 */                 if (isConnected()) {
/* 7 */                     return this.mServiceComponent;
                        }
/* 25 */                f42.m3656l(fm0.m3786l(new StringBuilder("getServiceComponent() called while not connected (state="), this.mState, ")"));
/* 28 */                return null;
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public MediaSessionCompat.Token getSessionToken() {
/* 5 */                 if (isConnected()) {
/* 7 */                     return this.mMediaSessionToken;
                        }
/* 25 */                f42.m3656l(fm0.m3786l(new StringBuilder("getSessionToken() called while not connected(state="), this.mState, ")"));
/* 28 */                return null;
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public boolean isConnected() {
                        return this.mState == 3;
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
                    public void onConnectionFailed(Messenger messenger) {
/* 19 */                AbstractC1245n0.m4876d(MediaBrowserCompat.TAG, "onConnectFailed for " + this.mServiceComponent);
/* 28 */                if (isCurrent(messenger, "onConnectFailed")) {
/* 34 */                    if (this.mState == 2) {
/* 65 */                        forceCloseConnection();
/* 70 */                        this.mCallback.onConnectionFailed();
                            } else {
/* 61 */                        AbstractC1245n0.m4889q(MediaBrowserCompat.TAG, "onConnect from service while mState=" + getStateLabel(this.mState) + "... ignoring");
                            }
                        }
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
                    public void onLoadChildren(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
                        SubscriptionCallback callback;
/* 7 */                 if (isCurrent(messenger, "onLoadChildren")) {
/* 12 */                    if (MediaBrowserCompat.DEBUG) {
/* 16 */                        Objects.toString(this.mServiceComponent);
                            }
/* 26 */                    Subscription subscription = (Subscription) this.mSubscriptions.getOrDefault(str, null);
/* 28 */                    if (subscription == null || (callback = subscription.getCallback(bundle)) == null) {
/* 66 */                        return;
                            }
/* 37 */                    if (bundle == null) {
/* 39 */                        if (list == null) {
/* 41 */                            callback.onError(str);
/* 44 */                            return;
                                }
/* 45 */                        this.mNotifyChildrenChangedOptions = bundle2;
/* 47 */                        callback.onChildrenLoaded(str, list);
/* 50 */                        this.mNotifyChildrenChangedOptions = null;
/* 52 */                        return;
                            }
/* 53 */                    if (list == null) {
/* 55 */                        callback.onError(str, bundle);
/* 58 */                        return;
                            }
/* 59 */                    this.mNotifyChildrenChangedOptions = bundle2;
/* 61 */                    callback.onChildrenLoaded(str, list, bundle);
/* 64 */                    this.mNotifyChildrenChangedOptions = null;
                        }
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
                    public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
/* 7 */                 if (isCurrent(messenger, "onConnect")) {
/* 14 */                    if (this.mState != 2) {
/* 43 */                        AbstractC1245n0.m4889q(MediaBrowserCompat.TAG, "onConnect from service while mState=" + getStateLabel(this.mState) + "... ignoring");
/* 46 */                        return;
                            }
/* 47 */                    this.mRootId = str;
/* 49 */                    this.mMediaSessionToken = token;
/* 51 */                    this.mExtras = bundle;
/* 54 */                    this.mState = 3;
/* 58 */                    if (MediaBrowserCompat.DEBUG) {
/* 60 */                        dump();
                            }
/* 65 */                    this.mCallback.onConnected();
                            try {
/* 84 */                        for (Map.Entry entry : (xb1) this.mSubscriptions.entrySet()) {
/* 96 */                            String str2 = (String) entry.getKey();
/* 102 */                           Subscription subscription = (Subscription) entry.getValue();
/* 104 */                           List<SubscriptionCallback> callbacks = subscription.getCallbacks();
/* 108 */                           List<Bundle> optionsList = subscription.getOptionsList();
/* 117 */                           for (int i = 0; i < callbacks.size(); i++) {
/* 137 */                               this.mServiceBinderWrapper.addSubscription(str2, callbacks.get(i).mToken, optionsList.get(i), this.mCallbacksMessenger);
                                    }
                                }
                            } catch (RemoteException unused) {
                            }
                        }
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public void search(final String str, final Bundle bundle, final SearchCallback searchCallback) {
/* 5 */                 if (!isConnected()) {
/* 52 */                    f42.m3656l(fm0.m3789o(new StringBuilder("search() called while not connected (state="), getStateLabel(this.mState), ")"));
/* 55 */                    return;
                        }
                        try {
/* 18 */                    this.mServiceBinderWrapper.search(str, bundle, new SearchResultReceiver(str, bundle, searchCallback, this.mHandler), this.mCallbacksMessenger);
                        } catch (RemoteException unused) {
/* 29 */                    this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.5
                                @Override // java.lang.Runnable
                                public void run() {
/* 7 */                             searchCallback.onError(str, bundle);
                                }
                            });
                        }
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public void sendCustomAction(final String str, final Bundle bundle, final CustomActionCallback customActionCallback) {
/* 5 */                 if (!isConnected()) {
/* 44 */                    s80.m8431l("Cannot send a custom action (", str, ") with extras ", bundle, " because the browser is not connected to the service.");
/* 47 */                    return;
                        }
                        try {
/* 18 */                    this.mServiceBinderWrapper.sendCustomAction(str, bundle, new CustomActionResultReceiver(str, bundle, customActionCallback, this.mHandler), this.mCallbacksMessenger);
                        } catch (RemoteException unused) {
/* 22 */                    Objects.toString(bundle);
/* 25 */                    if (customActionCallback != null) {
/* 34 */                        this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.6
                                    @Override // java.lang.Runnable
                                    public void run() {
/* 8 */                                 customActionCallback.onError(str, bundle, null);
                                    }
                                });
                            }
                        }
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
/* 8 */                 Subscription subscription = (Subscription) this.mSubscriptions.getOrDefault(str, null);
/* 10 */                if (subscription == null) {
/* 14 */                    subscription = new Subscription();
/* 19 */                    this.mSubscriptions.put(str, subscription);
                        }
/* 27 */                Bundle bundle2 = bundle != null ? new Bundle(bundle) : null;
/* 30 */                subscription.putCallback(bundle2, subscriptionCallback);
/* 37 */                if (isConnected()) {
                            try {
/* 45 */                        this.mServiceBinderWrapper.addSubscription(str, subscriptionCallback.mToken, bundle2, this.mCallbacksMessenger);
                            } catch (RemoteException unused) {
                            }
                        }
                    }

                    @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
                    public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
/* 8 */                 Subscription subscription = (Subscription) this.mSubscriptions.getOrDefault(str, null);
/* 10 */                if (subscription == null) {
/* 88 */                    return;
                        }
                        try {
/* 13 */                    if (subscriptionCallback != null) {
/* 29 */                        List<SubscriptionCallback> callbacks = subscription.getCallbacks();
/* 33 */                        List<Bundle> optionsList = subscription.getOptionsList();
/* 43 */                        for (int size = callbacks.size() - 1; size >= 0; size--) {
/* 49 */                            if (callbacks.get(size) == subscriptionCallback) {
/* 55 */                                if (isConnected()) {
/* 63 */                                    this.mServiceBinderWrapper.removeSubscription(str, subscriptionCallback.mToken, this.mCallbacksMessenger);
                                        }
/* 66 */                                callbacks.remove(size);
/* 69 */                                optionsList.remove(size);
                                    }
                                }
                            } else if (isConnected()) {
/* 25 */                        this.mServiceBinderWrapper.removeSubscription(str, null, this.mCallbacksMessenger);
                            }
                        } catch (RemoteException unused) {
                        }
/* 79 */                if (subscription.isEmpty() || subscriptionCallback == null) {
/* 85 */                    this.mSubscriptions.remove(str);
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface MediaBrowserServiceCallbackImpl {
                    void onConnectionFailed(Messenger messenger);

                    void onLoadChildren(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

                    void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class SearchCallback {
                    public void onError(String str, Bundle bundle) {
                    }

                    public void onSearchResult(String str, Bundle bundle, List<MediaItem> list) {
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SearchResultReceiver extends ResultReceiver {
                    private final SearchCallback mCallback;
                    private final Bundle mExtras;
                    private final String mQuery;

                    public SearchResultReceiver(String str, Bundle bundle, SearchCallback searchCallback, Handler handler) {
/* 1 */                 super(handler);
/* 4 */                 this.mQuery = str;
/* 6 */                 this.mExtras = bundle;
/* 8 */                 this.mCallback = searchCallback;
                    }

                    @Override // android.support.v4.os.ResultReceiver
                    public void onReceiveResult(int i, Bundle bundle) {
                        ArrayList arrayList;
/* 1 */                 MediaSessionCompat.ensureClassLoader(bundle);
/* 4 */                 if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
/* 59 */                    this.mCallback.onError(this.mQuery, this.mExtras);
/* 62 */                    return;
                        }
/* 17 */                Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
/* 21 */                if (parcelableArray != null) {
/* 25 */                    arrayList = new ArrayList();
/* 30 */                    for (Parcelable parcelable : parcelableArray) {
/* 36 */                        arrayList.add((MediaItem) parcelable);
                            }
                        } else {
/* 42 */                    arrayList = null;
                        }
/* 49 */                this.mCallback.onSearchResult(this.mQuery, this.mExtras, arrayList);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class ServiceBinderWrapper {
                    private Messenger mMessenger;
                    private Bundle mRootHints;

                    public ServiceBinderWrapper(IBinder iBinder, Bundle bundle) {
/* 9 */                 this.mMessenger = new Messenger(iBinder);
/* 11 */                this.mRootHints = bundle;
                    }

                    private void sendRequest(int i, Bundle bundle, Messenger messenger) throws RemoteException {
/* 1 */                 Message messageObtain = Message.obtain();
/* 5 */                 messageObtain.what = i;
/* 8 */                 messageObtain.arg1 = 1;
/* 10 */                messageObtain.setData(bundle);
/* 13 */                messageObtain.replyTo = messenger;
/* 17 */                this.mMessenger.send(messageObtain);
                    }

                    public void addSubscription(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
/* 3 */                 Bundle bundle2 = new Bundle();
/* 8 */                 bundle2.putString("data_media_item_id", str);
/* 13 */                bundle2.putBinder("data_callback_token", iBinder);
/* 18 */                bundle2.putBundle("data_options", bundle);
/* 22 */                sendRequest(3, bundle2, messenger);
                    }

                    public void connect(Context context, Messenger messenger) throws RemoteException {
/* 3 */                 Bundle bundle = new Bundle();
/* 12 */                bundle.putString("data_package_name", context.getPackageName());
/* 19 */                bundle.putBundle("data_root_hints", this.mRootHints);
/* 23 */                sendRequest(1, bundle, messenger);
                    }

                    public void disconnect(Messenger messenger) throws RemoteException {
/* 3 */                 sendRequest(2, null, messenger);
                    }

                    public void getMediaItem(String str, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
/* 3 */                 Bundle bundle = new Bundle();
/* 8 */                 bundle.putString("data_media_item_id", str);
/* 13 */                bundle.putParcelable("data_result_receiver", resultReceiver);
/* 17 */                sendRequest(5, bundle, messenger);
                    }

                    public void registerCallbackMessenger(Context context, Messenger messenger) throws RemoteException {
/* 3 */                 Bundle bundle = new Bundle();
/* 12 */                bundle.putString("data_package_name", context.getPackageName());
/* 19 */                bundle.putBundle("data_root_hints", this.mRootHints);
/* 23 */                sendRequest(6, bundle, messenger);
                    }

                    public void removeSubscription(String str, IBinder iBinder, Messenger messenger) throws RemoteException {
/* 3 */                 Bundle bundle = new Bundle();
/* 8 */                 bundle.putString("data_media_item_id", str);
/* 13 */                bundle.putBinder("data_callback_token", iBinder);
/* 17 */                sendRequest(4, bundle, messenger);
                    }

                    public void search(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
/* 3 */                 Bundle bundle2 = new Bundle();
/* 8 */                 bundle2.putString("data_search_query", str);
/* 13 */                bundle2.putBundle("data_search_extras", bundle);
/* 18 */                bundle2.putParcelable("data_result_receiver", resultReceiver);
/* 23 */                sendRequest(8, bundle2, messenger);
                    }

                    public void sendCustomAction(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
/* 3 */                 Bundle bundle2 = new Bundle();
/* 8 */                 bundle2.putString("data_custom_action", str);
/* 13 */                bundle2.putBundle("data_custom_action_extras", bundle);
/* 18 */                bundle2.putParcelable("data_result_receiver", resultReceiver);
/* 23 */                sendRequest(9, bundle2, messenger);
                    }

                    public void unregisterCallbackMessenger(Messenger messenger) throws RemoteException {
/* 3 */                 sendRequest(7, null, messenger);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Subscription {
                    private final List<SubscriptionCallback> mCallbacks = new ArrayList();
                    private final List<Bundle> mOptionsList = new ArrayList();

                    public SubscriptionCallback getCallback(Bundle bundle) {
/* 8 */                 for (int i = 0; i < this.mOptionsList.size(); i++) {
/* 22 */                    if (i13.m4425b(this.mOptionsList.get(i), bundle)) {
/* 26 */                        return this.mCallbacks.get(i);
                            }
                        }
/* 36 */                return null;
                    }

                    public List<SubscriptionCallback> getCallbacks() {
/* 1 */                 return this.mCallbacks;
                    }

                    public List<Bundle> getOptionsList() {
/* 1 */                 return this.mOptionsList;
                    }

                    public boolean isEmpty() {
/* 3 */                 return this.mCallbacks.isEmpty();
                    }

                    public void putCallback(Bundle bundle, SubscriptionCallback subscriptionCallback) {
/* 8 */                 for (int i = 0; i < this.mOptionsList.size(); i++) {
/* 22 */                    if (i13.m4425b(this.mOptionsList.get(i), bundle)) {
/* 26 */                        this.mCallbacks.set(i, subscriptionCallback);
/* 29 */                        return;
                            }
                        }
/* 35 */                this.mCallbacks.add(subscriptionCallback);
/* 40 */                this.mOptionsList.add(bundle);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class SubscriptionCallback {
                    final Object mSubscriptionCallbackObj;
                    WeakReference<Subscription> mSubscriptionRef;
                    final IBinder mToken = new Binder();

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public class StubApi21 implements MediaBrowserCompatApi21.SubscriptionCallback {
                        public StubApi21() {
                        }

                        public List<MediaItem> applyOptions(List<MediaItem> list, Bundle bundle) {
/* 1 */                     if (list == null) {
/* 3 */                         return null;
                            }
/* 8 */                     int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
/* 14 */                    int i2 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
/* 18 */                    if (i == -1 && i2 == -1) {
/* 22 */                        return list;
                            }
/* 23 */                    int i3 = i2 * i;
/* 25 */                    int size = i3 + i2;
/* 27 */                    if (i < 0 || i2 < 1 || i3 >= list.size()) {
/* 54 */                        return Collections.EMPTY_LIST;
                            }
/* 43 */                    if (size > list.size()) {
/* 45 */                        size = list.size();
                            }
/* 49 */                    return list.subList(i3, size);
                        }

                        @Override // android.support.v4.media.MediaBrowserCompatApi21.SubscriptionCallback
                        public void onChildrenLoaded(String str, List<?> list) {
/* 3 */                     WeakReference<Subscription> weakReference = SubscriptionCallback.this.mSubscriptionRef;
/* 9 */                     Subscription subscription = weakReference == null ? null : weakReference.get();
/* 15 */                    if (subscription == null) {
/* 23 */                        SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list));
/* 26 */                        return;
                            }
/* 27 */                    List<MediaItem> listFromMediaItemList = MediaItem.fromMediaItemList(list);
/* 31 */                    List<SubscriptionCallback> callbacks = subscription.getCallbacks();
/* 35 */                    List<Bundle> optionsList = subscription.getOptionsList();
/* 44 */                    for (int i = 0; i < callbacks.size(); i++) {
/* 46 */                        Bundle bundle = optionsList.get(i);
/* 52 */                        SubscriptionCallback subscriptionCallback = SubscriptionCallback.this;
/* 54 */                        if (bundle == null) {
/* 56 */                            subscriptionCallback.onChildrenLoaded(str, listFromMediaItemList);
                                } else {
/* 64 */                            subscriptionCallback.onChildrenLoaded(str, applyOptions(listFromMediaItemList, bundle), bundle);
                                }
                            }
                        }

                        @Override // android.support.v4.media.MediaBrowserCompatApi21.SubscriptionCallback
                        public void onError(String str) {
/* 3 */                     SubscriptionCallback.this.onError(str);
                        }
                    }

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public class StubApi26 extends StubApi21 implements MediaBrowserCompatApi26.SubscriptionCallback {
                        public StubApi26() {
/* 3 */                     super();
                        }

                        @Override // android.support.v4.media.MediaBrowserCompatApi26.SubscriptionCallback
                        public void onChildrenLoaded(String str, List<?> list, Bundle bundle) {
/* 7 */                     SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list), bundle);
                        }

                        @Override // android.support.v4.media.MediaBrowserCompatApi26.SubscriptionCallback
                        public void onError(String str, Bundle bundle) {
/* 3 */                     SubscriptionCallback.this.onError(str, bundle);
                        }
                    }

                    public SubscriptionCallback() {
/* 15 */                if (Build.VERSION.SDK_INT >= 26) {
/* 26 */                    this.mSubscriptionCallbackObj = MediaBrowserCompatApi26.createSubscriptionCallback(new StubApi26());
                        } else {
/* 38 */                    this.mSubscriptionCallbackObj = MediaBrowserCompatApi21.createSubscriptionCallback(new StubApi21());
                        }
                    }

                    public void onChildrenLoaded(String str, List<MediaItem> list) {
                    }

                    public void onError(String str) {
                    }

                    public void setSubscription(Subscription subscription) {
/* 6 */                 this.mSubscriptionRef = new WeakReference<>(subscription);
                    }

/* 1 */             public void onChildrenLoaded(String str, List<MediaItem> list, Bundle bundle) {
                    }

/* 1 */             public void onError(String str, Bundle bundle) {
                    }
                }

                public MediaBrowserCompat(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
/* 8 */             if (Build.VERSION.SDK_INT >= 26) {
/* 15 */                this.mImpl = new MediaBrowserImplApi26(context, componentName, connectionCallback, bundle);
                    } else {
/* 23 */                this.mImpl = new MediaBrowserImplApi23(context, componentName, connectionCallback, bundle);
                    }
                }

                public void connect() {
/* 3 */             this.mImpl.connect();
                }

                public void disconnect() {
/* 3 */             this.mImpl.disconnect();
                }

                public Bundle getExtras() {
/* 3 */             return this.mImpl.getExtras();
                }

                public void getItem(String str, ItemCallback itemCallback) {
/* 3 */             this.mImpl.getItem(str, itemCallback);
                }

                public Bundle getNotifyChildrenChangedOptions() {
/* 3 */             return this.mImpl.getNotifyChildrenChangedOptions();
                }

                public String getRoot() {
/* 3 */             return this.mImpl.getRoot();
                }

                public ComponentName getServiceComponent() {
/* 3 */             return this.mImpl.getServiceComponent();
                }

                public MediaSessionCompat.Token getSessionToken() {
/* 3 */             return this.mImpl.getSessionToken();
                }

                public boolean isConnected() {
/* 3 */             return this.mImpl.isConnected();
                }

                public void search(String str, Bundle bundle, SearchCallback searchCallback) {
/* 5 */             if (TextUtils.isEmpty(str)) {
/* 23 */                C1951n4.m6859j("query cannot be empty");
                    } else if (searchCallback != null) {
/* 11 */                this.mImpl.search(str, bundle, searchCallback);
                    } else {
/* 17 */                C1951n4.m6859j("callback cannot be null");
                    }
                }

                public void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback) {
/* 5 */             if (TextUtils.isEmpty(str)) {
/* 15 */                C1951n4.m6859j("action cannot be empty");
                    } else {
/* 9 */                 this.mImpl.sendCustomAction(str, bundle, customActionCallback);
                    }
                }

                public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
/* 5 */             if (TextUtils.isEmpty(str)) {
/* 31 */                C1951n4.m6859j("parentId is empty");
/* 34 */                return;
                    }
/* 7 */             if (subscriptionCallback == null) {
/* 25 */                C1951n4.m6859j("callback is null");
                    } else if (bundle != null) {
/* 13 */                this.mImpl.subscribe(str, bundle, subscriptionCallback);
                    } else {
/* 19 */                C1951n4.m6859j("options are null");
                    }
                }

                public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
/* 5 */             if (TextUtils.isEmpty(str)) {
/* 23 */                C1951n4.m6859j("parentId is empty");
                    } else if (subscriptionCallback != null) {
/* 11 */                this.mImpl.unsubscribe(str, subscriptionCallback);
                    } else {
/* 17 */                C1951n4.m6859j("callback is null");
                    }
                }

/* 26 */        public void unsubscribe(String str) {
/* 27 */            if (!TextUtils.isEmpty(str)) {
/* 28 */                this.mImpl.unsubscribe(str, null);
                    } else {
/* 29 */                C1951n4.m6859j("parentId is empty");
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 32 */        public static class MediaItem implements Parcelable {
                    public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() { // from class: android.support.v4.media.MediaBrowserCompat.MediaItem.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public MediaItem createFromParcel(Parcel parcel) {
/* 3 */                     return new MediaItem(parcel);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
/* 5 */                 public MediaItem[] newArray(int i) {
/* 6 */                     return new MediaItem[i];
                        }
                    };
                    public static final int FLAG_BROWSABLE = 1;
                    public static final int FLAG_PLAYABLE = 2;
                    private final MediaDescriptionCompat mDescription;
                    private final int mFlags;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    @Retention(RetentionPolicy.SOURCE)
                    public @interface Flags {
                    }

                    public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
/* 5 */                 if (mediaDescriptionCompat == null) {
/* 30 */                    C1951n4.m6859j("description cannot be null");
/* 33 */                    throw null;
                        }
/* 15 */                if (TextUtils.isEmpty(mediaDescriptionCompat.getMediaId())) {
/* 24 */                    C1951n4.m6859j("description must have a non-empty media id");
/* 27 */                    throw null;
                        }
/* 17 */                this.mFlags = i;
/* 19 */                this.mDescription = mediaDescriptionCompat;
                    }

                    public static MediaItem fromMediaItem(Object obj) {
/* 1 */                 if (obj == null) {
/* 21 */                    return null;
                        }
/* 17 */                return new MediaItem(MediaDescriptionCompat.fromMediaDescription(MediaBrowserCompatApi21.MediaItem.getDescription(obj)), MediaBrowserCompatApi21.MediaItem.getFlags(obj));
                    }

                    public static List<MediaItem> fromMediaItemList(List<?> list) {
/* 1 */                 if (list == null) {
/* 35 */                    return null;
                        }
/* 9 */                 ArrayList arrayList = new ArrayList(list.size());
/* 12 */                Iterator<?> it = list.iterator();
/* 20 */                while (it.hasNext()) {
/* 30 */                    arrayList.add(fromMediaItem(it.next()));
                        }
/* 34 */                return arrayList;
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
/* 1 */                 return 0;
                    }

                    public MediaDescriptionCompat getDescription() {
/* 1 */                 return this.mDescription;
                    }

                    public int getFlags() {
/* 1 */                 return this.mFlags;
                    }

                    public String getMediaId() {
/* 3 */                 return this.mDescription.getMediaId();
                    }

                    public boolean isBrowsable() {
                        return (this.mFlags & 1) != 0;
                    }

                    public boolean isPlayable() {
                        return (this.mFlags & 2) != 0;
                    }

                    public String toString() {
/* 28 */                return "MediaItem{mFlags=" + this.mFlags + ", mDescription=" + this.mDescription + '}';
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel parcel, int i) {
/* 3 */                 parcel.writeInt(this.mFlags);
/* 8 */                 this.mDescription.writeToParcel(parcel, i);
                    }

/* 33 */            public MediaItem(Parcel parcel) {
/* 35 */                this.mFlags = parcel.readInt();
/* 36 */                this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                }

/* 34 */        public void subscribe(String str, SubscriptionCallback subscriptionCallback) {
/* 35 */            if (TextUtils.isEmpty(str)) {
/* 38 */                C1951n4.m6859j("parentId is empty");
                    } else if (subscriptionCallback != null) {
/* 36 */                this.mImpl.subscribe(str, null, subscriptionCallback);
                    } else {
/* 37 */                C1951n4.m6859j("callback is null");
                    }
                }
            }
