            package android.support.v4.media;

            import android.media.MediaDescription;
            import android.net.Uri;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class MediaDescriptionCompatApi23 {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Builder {
                    private Builder() {
                    }

                    public static void setMediaUri(Object obj, Uri uri) {
/* 3 */                 ((MediaDescription.Builder) obj).setMediaUri(uri);
                    }
                }

                private MediaDescriptionCompatApi23() {
                }

                public static Uri getMediaUri(Object obj) {
/* 3 */             return ((MediaDescription) obj).getMediaUri();
                }
            }
