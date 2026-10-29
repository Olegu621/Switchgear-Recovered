            package android.support.v4.media;

            import android.graphics.Bitmap;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.support.v4.media.session.MediaSessionCompat;
            import android.text.TextUtils;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 71 */    public final class MediaDescriptionCompat implements Parcelable {
                public static final long BT_FOLDER_TYPE_ALBUMS = 2;
                public static final long BT_FOLDER_TYPE_ARTISTS = 3;
                public static final long BT_FOLDER_TYPE_GENRES = 4;
                public static final long BT_FOLDER_TYPE_MIXED = 0;
                public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
                public static final long BT_FOLDER_TYPE_TITLES = 1;
                public static final long BT_FOLDER_TYPE_YEARS = 6;
                public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() { // from class: android.support.v4.media.MediaDescriptionCompat.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public MediaDescriptionCompat createFromParcel(Parcel parcel) {
/* 5 */                 return MediaDescriptionCompat.fromMediaDescription(MediaDescriptionCompatApi21.fromParcel(parcel));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
/* 5 */             public MediaDescriptionCompat[] newArray(int i) {
/* 6 */                 return new MediaDescriptionCompat[i];
                    }
                };
                public static final String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";
                public static final String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
                public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
                public static final String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
                public static final long STATUS_DOWNLOADED = 2;
                public static final long STATUS_DOWNLOADING = 1;
                public static final long STATUS_NOT_DOWNLOADED = 0;
                private final CharSequence mDescription;
                private Object mDescriptionObj;
                private final Bundle mExtras;
                private final Bitmap mIcon;
                private final Uri mIconUri;
                private final String mMediaId;
                private final Uri mMediaUri;
                private final CharSequence mSubtitle;
                private final CharSequence mTitle;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class Builder {
                    private CharSequence mDescription;
                    private Bundle mExtras;
                    private Bitmap mIcon;
                    private Uri mIconUri;
                    private String mMediaId;
                    private Uri mMediaUri;
                    private CharSequence mSubtitle;
                    private CharSequence mTitle;

                    public MediaDescriptionCompat build() {
/* 19 */                return new MediaDescriptionCompat(this.mMediaId, this.mTitle, this.mSubtitle, this.mDescription, this.mIcon, this.mIconUri, this.mExtras, this.mMediaUri);
                    }

                    public Builder setDescription(CharSequence charSequence) {
/* 1 */                 this.mDescription = charSequence;
/* 3 */                 return this;
                    }

                    public Builder setExtras(Bundle bundle) {
/* 1 */                 this.mExtras = bundle;
/* 3 */                 return this;
                    }

                    public Builder setIconBitmap(Bitmap bitmap) {
/* 1 */                 this.mIcon = bitmap;
/* 3 */                 return this;
                    }

                    public Builder setIconUri(Uri uri) {
/* 1 */                 this.mIconUri = uri;
/* 3 */                 return this;
                    }

                    public Builder setMediaId(String str) {
/* 1 */                 this.mMediaId = str;
/* 3 */                 return this;
                    }

                    public Builder setMediaUri(Uri uri) {
/* 1 */                 this.mMediaUri = uri;
/* 3 */                 return this;
                    }

                    public Builder setSubtitle(CharSequence charSequence) {
/* 1 */                 this.mSubtitle = charSequence;
/* 3 */                 return this;
                    }

                    public Builder setTitle(CharSequence charSequence) {
/* 1 */                 this.mTitle = charSequence;
/* 3 */                 return this;
                    }
                }

                public MediaDescriptionCompat(Parcel parcel) {
/* 8 */             this.mMediaId = parcel.readString();
/* 10 */            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
/* 18 */            this.mTitle = (CharSequence) creator.createFromParcel(parcel);
/* 26 */            this.mSubtitle = (CharSequence) creator.createFromParcel(parcel);
/* 34 */            this.mDescription = (CharSequence) creator.createFromParcel(parcel);
/* 38 */            ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
/* 48 */            this.mIcon = (Bitmap) parcel.readParcelable(classLoader);
/* 56 */            this.mIconUri = (Uri) parcel.readParcelable(classLoader);
/* 62 */            this.mExtras = parcel.readBundle(classLoader);
/* 70 */            this.mMediaUri = (Uri) parcel.readParcelable(classLoader);
                }

                public static MediaDescriptionCompat fromMediaDescription(Object obj) {
                    Uri uri;
/* 1 */             Bundle bundle = null;
/* 2 */             if (obj == null) {
/* 1 */                 return null;
                    }
/* 6 */             Builder builder = new Builder();
/* 13 */            builder.setMediaId(MediaDescriptionCompatApi21.getMediaId(obj));
/* 20 */            builder.setTitle(MediaDescriptionCompatApi21.getTitle(obj));
/* 27 */            builder.setSubtitle(MediaDescriptionCompatApi21.getSubtitle(obj));
/* 34 */            builder.setDescription(MediaDescriptionCompatApi21.getDescription(obj));
/* 41 */            builder.setIconBitmap(MediaDescriptionCompatApi21.getIconBitmap(obj));
/* 48 */            builder.setIconUri(MediaDescriptionCompatApi21.getIconUri(obj));
/* 51 */            Bundle extras = MediaDescriptionCompatApi21.getExtras(obj);
/* 57 */            if (extras != null) {
/* 59 */                MediaSessionCompat.ensureClassLoader(extras);
/* 66 */                uri = (Uri) extras.getParcelable(DESCRIPTION_KEY_MEDIA_URI);
                    } else {
/* 69 */                uri = null;
                    }
/* 70 */            if (uri == null) {
/* 94 */                bundle = extras;
                    } else if (!extras.containsKey(DESCRIPTION_KEY_NULL_BUNDLE_FLAG) || extras.size() != 2) {
/* 88 */                extras.remove(DESCRIPTION_KEY_MEDIA_URI);
/* 91 */                extras.remove(DESCRIPTION_KEY_NULL_BUNDLE_FLAG);
/* 94 */                bundle = extras;
                    }
/* 95 */            builder.setExtras(bundle);
/* 98 */            if (uri != null) {
/* 100 */               builder.setMediaUri(uri);
                    } else {
/* 108 */               builder.setMediaUri(MediaDescriptionCompatApi23.getMediaUri(obj));
                    }
/* 111 */           MediaDescriptionCompat mediaDescriptionCompatBuild = builder.build();
/* 115 */           mediaDescriptionCompatBuild.mDescriptionObj = obj;
/* 117 */           return mediaDescriptionCompatBuild;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
/* 1 */             return 0;
                }

                public CharSequence getDescription() {
/* 1 */             return this.mDescription;
                }

                public Bundle getExtras() {
/* 1 */             return this.mExtras;
                }

                public Bitmap getIconBitmap() {
/* 1 */             return this.mIcon;
                }

                public Uri getIconUri() {
/* 1 */             return this.mIconUri;
                }

                public Object getMediaDescription() {
/* 1 */             Object obj = this.mDescriptionObj;
/* 3 */             if (obj != null) {
/* 55 */                return obj;
                    }
/* 5 */             Object objNewInstance = MediaDescriptionCompatApi21.Builder.newInstance();
/* 11 */            MediaDescriptionCompatApi21.Builder.setMediaId(objNewInstance, this.mMediaId);
/* 16 */            MediaDescriptionCompatApi21.Builder.setTitle(objNewInstance, this.mTitle);
/* 21 */            MediaDescriptionCompatApi21.Builder.setSubtitle(objNewInstance, this.mSubtitle);
/* 26 */            MediaDescriptionCompatApi21.Builder.setDescription(objNewInstance, this.mDescription);
/* 31 */            MediaDescriptionCompatApi21.Builder.setIconBitmap(objNewInstance, this.mIcon);
/* 36 */            MediaDescriptionCompatApi21.Builder.setIconUri(objNewInstance, this.mIconUri);
/* 41 */            MediaDescriptionCompatApi21.Builder.setExtras(objNewInstance, this.mExtras);
/* 46 */            MediaDescriptionCompatApi23.Builder.setMediaUri(objNewInstance, this.mMediaUri);
/* 49 */            Object objBuild = MediaDescriptionCompatApi21.Builder.build(objNewInstance);
/* 53 */            this.mDescriptionObj = objBuild;
/* 55 */            return objBuild;
                }

                public String getMediaId() {
/* 1 */             return this.mMediaId;
                }

                public Uri getMediaUri() {
/* 1 */             return this.mMediaUri;
                }

                public CharSequence getSubtitle() {
/* 1 */             return this.mSubtitle;
                }

                public CharSequence getTitle() {
/* 1 */             return this.mTitle;
                }

                public String toString() {
/* 29 */            return ((Object) this.mTitle) + ", " + ((Object) this.mSubtitle) + ", " + ((Object) this.mDescription);
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int i) {
/* 5 */             MediaDescriptionCompatApi21.writeToParcel(getMediaDescription(), parcel, i);
                }

/* 72 */        public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
/* 74 */            this.mMediaId = str;
/* 75 */            this.mTitle = charSequence;
/* 76 */            this.mSubtitle = charSequence2;
/* 77 */            this.mDescription = charSequence3;
/* 78 */            this.mIcon = bitmap;
/* 79 */            this.mIconUri = uri;
/* 80 */            this.mExtras = bundle;
/* 81 */            this.mMediaUri = uri2;
                }
            }
