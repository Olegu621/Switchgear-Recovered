            package android.support.v4.media;

            import android.graphics.Bitmap;
            import android.media.MediaDescription;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Parcel;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class MediaDescriptionCompatApi21 {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Builder {
                    private Builder() {
                    }

                    public static Object build(Object obj) {
/* 3 */                 return ((MediaDescription.Builder) obj).build();
                    }

                    public static Object newInstance() {
/* 3 */                 return new MediaDescription.Builder();
                    }

                    public static void setDescription(Object obj, CharSequence charSequence) {
/* 3 */                 ((MediaDescription.Builder) obj).setDescription(charSequence);
                    }

                    public static void setExtras(Object obj, Bundle bundle) {
/* 3 */                 ((MediaDescription.Builder) obj).setExtras(bundle);
                    }

                    public static void setIconBitmap(Object obj, Bitmap bitmap) {
/* 3 */                 ((MediaDescription.Builder) obj).setIconBitmap(bitmap);
                    }

                    public static void setIconUri(Object obj, Uri uri) {
/* 3 */                 ((MediaDescription.Builder) obj).setIconUri(uri);
                    }

                    public static void setMediaId(Object obj, String str) {
/* 3 */                 ((MediaDescription.Builder) obj).setMediaId(str);
                    }

                    public static void setSubtitle(Object obj, CharSequence charSequence) {
/* 3 */                 ((MediaDescription.Builder) obj).setSubtitle(charSequence);
                    }

                    public static void setTitle(Object obj, CharSequence charSequence) {
/* 3 */                 ((MediaDescription.Builder) obj).setTitle(charSequence);
                    }
                }

                private MediaDescriptionCompatApi21() {
                }

                public static Object fromParcel(Parcel parcel) {
/* 3 */             return MediaDescription.CREATOR.createFromParcel(parcel);
                }

                public static CharSequence getDescription(Object obj) {
/* 3 */             return ((MediaDescription) obj).getDescription();
                }

                public static Bundle getExtras(Object obj) {
/* 3 */             return ((MediaDescription) obj).getExtras();
                }

                public static Bitmap getIconBitmap(Object obj) {
/* 3 */             return ((MediaDescription) obj).getIconBitmap();
                }

                public static Uri getIconUri(Object obj) {
/* 3 */             return ((MediaDescription) obj).getIconUri();
                }

                public static String getMediaId(Object obj) {
/* 3 */             return ((MediaDescription) obj).getMediaId();
                }

                public static CharSequence getSubtitle(Object obj) {
/* 3 */             return ((MediaDescription) obj).getSubtitle();
                }

                public static CharSequence getTitle(Object obj) {
/* 3 */             return ((MediaDescription) obj).getTitle();
                }

                public static void writeToParcel(Object obj, Parcel parcel, int i) {
/* 3 */             ((MediaDescription) obj).writeToParcel(parcel, i);
                }
            }
