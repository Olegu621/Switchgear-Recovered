            package android.support.v4.media;

            import android.graphics.Bitmap;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.support.v4.media.session.MediaSessionCompat;
            import android.text.TextUtils;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import java.util.Set;
            import p000.C1024id;
            import p000.C1951n4;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public final class MediaMetadataCompat implements Parcelable {
                public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
                static final C1024id METADATA_KEYS_TYPE;
                public static final String METADATA_KEY_ADVERTISEMENT = "android.media.metadata.ADVERTISEMENT";
                public static final String METADATA_KEY_ALBUM = "android.media.metadata.ALBUM";
                public static final String METADATA_KEY_ALBUM_ART = "android.media.metadata.ALBUM_ART";
                public static final String METADATA_KEY_ALBUM_ARTIST = "android.media.metadata.ALBUM_ARTIST";
                public static final String METADATA_KEY_ALBUM_ART_URI = "android.media.metadata.ALBUM_ART_URI";
                public static final String METADATA_KEY_ART = "android.media.metadata.ART";
                public static final String METADATA_KEY_ARTIST = "android.media.metadata.ARTIST";
                public static final String METADATA_KEY_ART_URI = "android.media.metadata.ART_URI";
                public static final String METADATA_KEY_AUTHOR = "android.media.metadata.AUTHOR";
                public static final String METADATA_KEY_BT_FOLDER_TYPE = "android.media.metadata.BT_FOLDER_TYPE";
                public static final String METADATA_KEY_COMPILATION = "android.media.metadata.COMPILATION";
                public static final String METADATA_KEY_COMPOSER = "android.media.metadata.COMPOSER";
                public static final String METADATA_KEY_DATE = "android.media.metadata.DATE";
                public static final String METADATA_KEY_DISC_NUMBER = "android.media.metadata.DISC_NUMBER";
                public static final String METADATA_KEY_DISPLAY_DESCRIPTION = "android.media.metadata.DISPLAY_DESCRIPTION";
                public static final String METADATA_KEY_DISPLAY_ICON = "android.media.metadata.DISPLAY_ICON";
                public static final String METADATA_KEY_DISPLAY_ICON_URI = "android.media.metadata.DISPLAY_ICON_URI";
                public static final String METADATA_KEY_DISPLAY_SUBTITLE = "android.media.metadata.DISPLAY_SUBTITLE";
                public static final String METADATA_KEY_DISPLAY_TITLE = "android.media.metadata.DISPLAY_TITLE";
                public static final String METADATA_KEY_DOWNLOAD_STATUS = "android.media.metadata.DOWNLOAD_STATUS";
                public static final String METADATA_KEY_DURATION = "android.media.metadata.DURATION";
                public static final String METADATA_KEY_GENRE = "android.media.metadata.GENRE";
                public static final String METADATA_KEY_MEDIA_ID = "android.media.metadata.MEDIA_ID";
                public static final String METADATA_KEY_MEDIA_URI = "android.media.metadata.MEDIA_URI";
                public static final String METADATA_KEY_NUM_TRACKS = "android.media.metadata.NUM_TRACKS";
                public static final String METADATA_KEY_RATING = "android.media.metadata.RATING";
                public static final String METADATA_KEY_TITLE = "android.media.metadata.TITLE";
                public static final String METADATA_KEY_TRACK_NUMBER = "android.media.metadata.TRACK_NUMBER";
                public static final String METADATA_KEY_USER_RATING = "android.media.metadata.USER_RATING";
                public static final String METADATA_KEY_WRITER = "android.media.metadata.WRITER";
                public static final String METADATA_KEY_YEAR = "android.media.metadata.YEAR";
                static final int METADATA_TYPE_BITMAP = 2;
                static final int METADATA_TYPE_LONG = 0;
                static final int METADATA_TYPE_RATING = 3;
                static final int METADATA_TYPE_TEXT = 1;
                private static final String[] PREFERRED_BITMAP_ORDER;
                private static final String[] PREFERRED_DESCRIPTION_ORDER;
                private static final String[] PREFERRED_URI_ORDER;
                private static final String TAG = "MediaMetadata";
                final Bundle mBundle;
                private MediaDescriptionCompat mDescription;
                private Object mMetadataObj;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Retention(RetentionPolicy.SOURCE)
                public @interface BitmapKey {
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Retention(RetentionPolicy.SOURCE)
                public @interface LongKey {
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Retention(RetentionPolicy.SOURCE)
                public @interface RatingKey {
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Retention(RetentionPolicy.SOURCE)
                public @interface TextKey {
                }

                static {
/* 3 */             C1024id c1024id = new C1024id();
/* 6 */             METADATA_KEYS_TYPE = c1024id;
/* 15 */            c1024id.put(METADATA_KEY_TITLE, 1);
/* 20 */            c1024id.put(METADATA_KEY_ARTIST, 1);
/* 30 */            c1024id.put(METADATA_KEY_DURATION, 0);
/* 35 */            c1024id.put(METADATA_KEY_ALBUM, 1);
/* 40 */            c1024id.put(METADATA_KEY_AUTHOR, 1);
/* 45 */            c1024id.put(METADATA_KEY_WRITER, 1);
/* 50 */            c1024id.put(METADATA_KEY_COMPOSER, 1);
/* 55 */            c1024id.put(METADATA_KEY_COMPILATION, 1);
/* 60 */            c1024id.put(METADATA_KEY_DATE, 1);
/* 65 */            c1024id.put(METADATA_KEY_YEAR, 0);
/* 70 */            c1024id.put(METADATA_KEY_GENRE, 1);
/* 75 */            c1024id.put(METADATA_KEY_TRACK_NUMBER, 0);
/* 80 */            c1024id.put(METADATA_KEY_NUM_TRACKS, 0);
/* 85 */            c1024id.put(METADATA_KEY_DISC_NUMBER, 0);
/* 90 */            c1024id.put(METADATA_KEY_ALBUM_ARTIST, 1);
/* 100 */           c1024id.put(METADATA_KEY_ART, 2);
/* 105 */           c1024id.put(METADATA_KEY_ART_URI, 1);
/* 110 */           c1024id.put(METADATA_KEY_ALBUM_ART, 2);
/* 115 */           c1024id.put(METADATA_KEY_ALBUM_ART_URI, 1);
/* 125 */           c1024id.put(METADATA_KEY_USER_RATING, 3);
/* 130 */           c1024id.put(METADATA_KEY_RATING, 3);
/* 135 */           c1024id.put(METADATA_KEY_DISPLAY_TITLE, 1);
/* 140 */           c1024id.put(METADATA_KEY_DISPLAY_SUBTITLE, 1);
/* 145 */           c1024id.put(METADATA_KEY_DISPLAY_DESCRIPTION, 1);
/* 150 */           c1024id.put(METADATA_KEY_DISPLAY_ICON, 2);
/* 155 */           c1024id.put(METADATA_KEY_DISPLAY_ICON_URI, 1);
/* 160 */           c1024id.put(METADATA_KEY_MEDIA_ID, 1);
/* 165 */           c1024id.put(METADATA_KEY_BT_FOLDER_TYPE, 0);
/* 170 */           c1024id.put(METADATA_KEY_MEDIA_URI, 1);
/* 175 */           c1024id.put(METADATA_KEY_ADVERTISEMENT, 0);
/* 180 */           c1024id.put(METADATA_KEY_DOWNLOAD_STATUS, 0);
/* 201 */           PREFERRED_DESCRIPTION_ORDER = new String[]{METADATA_KEY_TITLE, METADATA_KEY_ARTIST, METADATA_KEY_ALBUM, METADATA_KEY_ALBUM_ARTIST, METADATA_KEY_WRITER, METADATA_KEY_AUTHOR, METADATA_KEY_COMPOSER};
/* 207 */           PREFERRED_BITMAP_ORDER = new String[]{METADATA_KEY_DISPLAY_ICON, METADATA_KEY_ART, METADATA_KEY_ALBUM_ART};
/* 213 */           PREFERRED_URI_ORDER = new String[]{METADATA_KEY_DISPLAY_ICON_URI, METADATA_KEY_ART_URI, METADATA_KEY_ALBUM_ART_URI};
/* 220 */           CREATOR = new Parcelable.Creator<MediaMetadataCompat>() { // from class: android.support.v4.media.MediaMetadataCompat.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public MediaMetadataCompat createFromParcel(Parcel parcel) {
/* 3 */                     return new MediaMetadataCompat(parcel);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
/* 5 */                 public MediaMetadataCompat[] newArray(int i) {
/* 6 */                     return new MediaMetadataCompat[i];
                        }
                    };
                }

                public MediaMetadataCompat(Parcel parcel) {
/* 14 */            this.mBundle = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
                }

                public static MediaMetadataCompat fromMediaMetadata(Object obj) {
/* 1 */             if (obj == null) {
/* 28 */                return null;
                    }
/* 3 */             Parcel parcelObtain = Parcel.obtain();
/* 8 */             MediaMetadataCompatApi21.writeToParcel(obj, parcelObtain, 0);
/* 11 */            parcelObtain.setDataPosition(0);
/* 16 */            MediaMetadataCompat mediaMetadataCompatCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
/* 22 */            parcelObtain.recycle();
/* 25 */            mediaMetadataCompatCreateFromParcel.mMetadataObj = obj;
/* 27 */            return mediaMetadataCompatCreateFromParcel;
                }

                public boolean containsKey(String str) {
/* 3 */             return this.mBundle.containsKey(str);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
/* 1 */             return 0;
                }

                public Bitmap getBitmap(String str) {
                    try {
/* 7 */                 return (Bitmap) this.mBundle.getParcelable(str);
                    } catch (Exception e) {
/* 15 */                AbstractC1245n0.m4891s(TAG, "Failed to retrieve a key as Bitmap.", e);
/* 18 */                return null;
                    }
                }

                public Bundle getBundle() {
/* 5 */             return new Bundle(this.mBundle);
                }

                public MediaDescriptionCompat getDescription() {
                    Bitmap bitmap;
                    Uri uri;
/* 1 */             MediaDescriptionCompat mediaDescriptionCompat = this.mDescription;
/* 3 */             if (mediaDescriptionCompat != null) {
/* 5 */                 return mediaDescriptionCompat;
                    }
/* 8 */             String string = getString(METADATA_KEY_MEDIA_ID);
/* 13 */            CharSequence[] charSequenceArr = new CharSequence[3];
/* 17 */            CharSequence text = getText(METADATA_KEY_DISPLAY_TITLE);
/* 28 */            if (TextUtils.isEmpty(text)) {
/* 49 */                int i = 0;
/* 50 */                int i2 = 0;
/* 51 */                while (i < 3) {
/* 53 */                    String[] strArr = PREFERRED_DESCRIPTION_ORDER;
/* 56 */                    if (i2 >= strArr.length) {
                                break;
                            }
/* 58 */                    int i3 = i2 + 1;
/* 62 */                    CharSequence text2 = getText(strArr[i2]);
/* 70 */                    if (!TextUtils.isEmpty(text2)) {
/* 74 */                        charSequenceArr[i] = text2;
/* 72 */                        i++;
                            }
/* 77 */                    i2 = i3;
                        }
                    } else {
/* 30 */                charSequenceArr[0] = text;
/* 38 */                charSequenceArr[1] = getText(METADATA_KEY_DISPLAY_SUBTITLE);
/* 46 */                charSequenceArr[2] = getText(METADATA_KEY_DISPLAY_DESCRIPTION);
                    }
/* 79 */            int i4 = 0;
                    while (true) {
/* 80 */                String[] strArr2 = PREFERRED_BITMAP_ORDER;
/* 84 */                if (i4 >= strArr2.length) {
/* 98 */                    bitmap = null;
                            break;
                        }
/* 88 */                bitmap = getBitmap(strArr2[i4]);
/* 92 */                if (bitmap != null) {
                            break;
                        }
/* 95 */                i4++;
                    }
/* 99 */            int i5 = 0;
                    while (true) {
/* 100 */               String[] strArr3 = PREFERRED_URI_ORDER;
/* 103 */               if (i5 >= strArr3.length) {
/* 125 */                   uri = null;
                            break;
                        }
/* 107 */               String string2 = getString(strArr3[i5]);
/* 115 */               if (!TextUtils.isEmpty(string2)) {
/* 117 */                   uri = Uri.parse(string2);
                            break;
                        }
/* 122 */               i5++;
                    }
/* 128 */           String string3 = getString(METADATA_KEY_MEDIA_URI);
/* 138 */           Uri uri2 = TextUtils.isEmpty(string3) ? null : Uri.parse(string3);
/* 144 */           MediaDescriptionCompat.Builder builder = new MediaDescriptionCompat.Builder();
/* 147 */           builder.setMediaId(string);
/* 152 */           builder.setTitle(charSequenceArr[0]);
/* 157 */           builder.setSubtitle(charSequenceArr[1]);
/* 162 */           builder.setDescription(charSequenceArr[2]);
/* 165 */           builder.setIconBitmap(bitmap);
/* 168 */           builder.setIconUri(uri);
/* 171 */           builder.setMediaUri(uri2);
/* 176 */           Bundle bundle = new Bundle();
/* 187 */           if (this.mBundle.containsKey(METADATA_KEY_BT_FOLDER_TYPE)) {
/* 195 */               bundle.putLong(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE, getLong(METADATA_KEY_BT_FOLDER_TYPE));
                    }
/* 206 */           if (this.mBundle.containsKey(METADATA_KEY_DOWNLOAD_STATUS)) {
/* 214 */               bundle.putLong(MediaDescriptionCompat.EXTRA_DOWNLOAD_STATUS, getLong(METADATA_KEY_DOWNLOAD_STATUS));
                    }
/* 221 */           if (!bundle.isEmpty()) {
/* 223 */               builder.setExtras(bundle);
                    }
/* 226 */           MediaDescriptionCompat mediaDescriptionCompatBuild = builder.build();
/* 230 */           this.mDescription = mediaDescriptionCompatBuild;
/* 232 */           return mediaDescriptionCompatBuild;
                }

                public long getLong(String str) {
/* 5 */             return this.mBundle.getLong(str, 0L);
                }

                public Object getMediaMetadata() {
/* 3 */             if (this.mMetadataObj == null) {
/* 5 */                 Parcel parcelObtain = Parcel.obtain();
/* 10 */                writeToParcel(parcelObtain, 0);
/* 13 */                parcelObtain.setDataPosition(0);
/* 20 */                this.mMetadataObj = MediaMetadataCompatApi21.createFromParcel(parcelObtain);
/* 22 */                parcelObtain.recycle();
                    }
/* 25 */            return this.mMetadataObj;
                }

                public RatingCompat getRating(String str) {
                    try {
/* 7 */                 return RatingCompat.fromRating(this.mBundle.getParcelable(str));
                    } catch (Exception e) {
/* 17 */                AbstractC1245n0.m4891s(TAG, "Failed to retrieve a key as Rating.", e);
/* 20 */                return null;
                    }
                }

                public String getString(String str) {
/* 3 */             CharSequence charSequence = this.mBundle.getCharSequence(str);
/* 7 */             if (charSequence != null) {
/* 9 */                 return charSequence.toString();
                    }
/* 14 */            return null;
                }

                public CharSequence getText(String str) {
/* 3 */             return this.mBundle.getCharSequence(str);
                }

                public Set<String> keySet() {
/* 3 */             return this.mBundle.keySet();
                }

                public int size() {
/* 3 */             return this.mBundle.size();
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeBundle(this.mBundle);
                }

/* 16 */        public MediaMetadataCompat(Bundle bundle) {
/* 18 */            Bundle bundle2 = new Bundle(bundle);
                    this.mBundle = bundle2;
/* 19 */            MediaSessionCompat.ensureClassLoader(bundle2);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 57 */        public static final class Builder {
                    private final Bundle mBundle;

                    public Builder(MediaMetadataCompat mediaMetadataCompat, int i) {
/* 1 */                 this(mediaMetadataCompat);
/* 18 */                for (String str : this.mBundle.keySet()) {
/* 28 */                    Object obj = this.mBundle.get(str);
/* 34 */                    if (obj instanceof Bitmap) {
/* 36 */                        Bitmap bitmap = (Bitmap) obj;
/* 42 */                        if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
/* 54 */                            putBitmap(str, scaleBitmap(bitmap, i));
                                }
                            }
                        }
                    }

                    private Bitmap scaleBitmap(Bitmap bitmap, int i) {
                        float f = i;
/* 15 */                float fMin = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
/* 34 */                return Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), true);
                    }

                    public MediaMetadataCompat build() {
/* 5 */                 return new MediaMetadataCompat(this.mBundle);
                    }

                    public Builder putBitmap(String str, Bitmap bitmap) {
/* 1 */                 C1024id c1024id = MediaMetadataCompat.METADATA_KEYS_TYPE;
/* 7 */                 if (!c1024id.containsKey(str) || ((Integer) c1024id.getOrDefault(str, null)).intValue() == 2) {
/* 39 */                    this.mBundle.putParcelable(str, bitmap);
/* 42 */                    return this;
                        }
/* 32 */                C1951n4.m6859j(fm0.m3784j("The ", str, " key cannot be used to put a Bitmap"));
/* 35 */                return null;
                    }

                    public Builder putLong(String str, long j) {
/* 1 */                 C1024id c1024id = MediaMetadataCompat.METADATA_KEYS_TYPE;
/* 7 */                 if (!c1024id.containsKey(str) || ((Integer) c1024id.getOrDefault(str, null)).intValue() == 0) {
/* 38 */                    this.mBundle.putLong(str, j);
/* 41 */                    return this;
                        }
/* 31 */                C1951n4.m6859j(fm0.m3784j("The ", str, " key cannot be used to put a long"));
/* 34 */                return null;
                    }

                    public Builder putRating(String str, RatingCompat ratingCompat) {
/* 1 */                 C1024id c1024id = MediaMetadataCompat.METADATA_KEYS_TYPE;
/* 7 */                 if (!c1024id.containsKey(str) || ((Integer) c1024id.getOrDefault(str, null)).intValue() == 3) {
/* 45 */                    this.mBundle.putParcelable(str, (Parcelable) ratingCompat.getRating());
/* 48 */                    return this;
                        }
/* 32 */                C1951n4.m6859j(fm0.m3784j("The ", str, " key cannot be used to put a Rating"));
/* 35 */                return null;
                    }

                    public Builder putString(String str, String str2) {
/* 1 */                 C1024id c1024id = MediaMetadataCompat.METADATA_KEYS_TYPE;
/* 7 */                 if (!c1024id.containsKey(str) || ((Integer) c1024id.getOrDefault(str, null)).intValue() == 1) {
/* 39 */                    this.mBundle.putCharSequence(str, str2);
/* 42 */                    return this;
                        }
/* 32 */                C1951n4.m6859j(fm0.m3784j("The ", str, " key cannot be used to put a String"));
/* 35 */                return null;
                    }

                    public Builder putText(String str, CharSequence charSequence) {
/* 1 */                 C1024id c1024id = MediaMetadataCompat.METADATA_KEYS_TYPE;
/* 7 */                 if (!c1024id.containsKey(str) || ((Integer) c1024id.getOrDefault(str, null)).intValue() == 1) {
/* 39 */                    this.mBundle.putCharSequence(str, charSequence);
/* 42 */                    return this;
                        }
/* 32 */                C1951n4.m6859j(fm0.m3784j("The ", str, " key cannot be used to put a CharSequence"));
/* 35 */                return null;
                    }

/* 58 */            public Builder(MediaMetadataCompat mediaMetadataCompat) {
/* 60 */                Bundle bundle = new Bundle(mediaMetadataCompat.mBundle);
                        this.mBundle = bundle;
/* 61 */                MediaSessionCompat.ensureClassLoader(bundle);
                    }

/* 61 */            public Builder() {
/* 63 */                this.mBundle = new Bundle();
                    }
                }
            }
