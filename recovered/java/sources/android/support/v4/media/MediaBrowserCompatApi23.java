            package android.support.v4.media;

            import android.media.browse.MediaBrowser;
            import android.os.Parcel;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class MediaBrowserCompatApi23 {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface ItemCallback {
                    void onError(String str);

                    void onItemLoaded(Parcel parcel);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class ItemCallbackProxy<T extends ItemCallback> extends MediaBrowser.ItemCallback {
                    protected final T mItemCallback;

                    public ItemCallbackProxy(T t) {
/* 4 */                 this.mItemCallback = t;
                    }

                    @Override // android.media.browse.MediaBrowser.ItemCallback
                    public void onError(String str) {
/* 3 */                 this.mItemCallback.onError(str);
                    }

                    @Override // android.media.browse.MediaBrowser.ItemCallback
                    public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
/* 1 */                 if (mediaItem == null) {
/* 6 */                     this.mItemCallback.onItemLoaded(null);
/* 9 */                     return;
                        }
/* 10 */                Parcel parcelObtain = Parcel.obtain();
/* 15 */                mediaItem.writeToParcel(parcelObtain, 0);
/* 20 */                this.mItemCallback.onItemLoaded(parcelObtain);
                    }
                }

                private MediaBrowserCompatApi23() {
                }

                public static Object createItemCallback(ItemCallback itemCallback) {
/* 3 */             return new ItemCallbackProxy(itemCallback);
                }

                public static void getItem(Object obj, String str, Object obj2) {
/* 5 */             ((MediaBrowser) obj).getItem(str, (MediaBrowser.ItemCallback) obj2);
                }
            }
