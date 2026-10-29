            package android.support.v4.media;

            import android.graphics.Bitmap;
            import android.media.MediaMetadata;
            import android.media.Rating;
            import android.os.Parcel;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class MediaMetadataCompatApi21 {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Builder {
                    private Builder() {
                    }

                    public static Object build(Object obj) {
/* 3 */                 return ((MediaMetadata.Builder) obj).build();
                    }

                    public static Object newInstance() {
/* 3 */                 return new MediaMetadata.Builder();
                    }

                    public static void putBitmap(Object obj, String str, Bitmap bitmap) {
/* 3 */                 ((MediaMetadata.Builder) obj).putBitmap(str, bitmap);
                    }

                    public static void putLong(Object obj, String str, long j) {
/* 3 */                 ((MediaMetadata.Builder) obj).putLong(str, j);
                    }

                    public static void putRating(Object obj, String str, Object obj2) {
/* 5 */                 ((MediaMetadata.Builder) obj).putRating(str, (Rating) obj2);
                    }

                    public static void putString(Object obj, String str, String str2) {
/* 3 */                 ((MediaMetadata.Builder) obj).putString(str, str2);
                    }

                    public static void putText(Object obj, String str, CharSequence charSequence) {
/* 3 */                 ((MediaMetadata.Builder) obj).putText(str, charSequence);
                    }
                }

                private MediaMetadataCompatApi21() {
                }

                public static Object createFromParcel(Parcel parcel) {
/* 3 */             return MediaMetadata.CREATOR.createFromParcel(parcel);
                }

                public static Bitmap getBitmap(Object obj, String str) {
/* 3 */             return ((MediaMetadata) obj).getBitmap(str);
                }

                public static long getLong(Object obj, String str) {
/* 3 */             return ((MediaMetadata) obj).getLong(str);
                }

                public static Object getRating(Object obj, String str) {
/* 3 */             return ((MediaMetadata) obj).getRating(str);
                }

                public static CharSequence getText(Object obj, String str) {
/* 3 */             return ((MediaMetadata) obj).getText(str);
                }

                public static Set<String> keySet(Object obj) {
/* 3 */             return ((MediaMetadata) obj).keySet();
                }

                public static void writeToParcel(Object obj, Parcel parcel, int i) {
/* 3 */             ((MediaMetadata) obj).writeToParcel(parcel, i);
                }
            }
