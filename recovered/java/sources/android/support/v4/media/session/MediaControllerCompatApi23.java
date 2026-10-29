            package android.support.v4.media.session;

            import android.media.session.MediaController;
            import android.net.Uri;
            import android.os.Bundle;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class MediaControllerCompatApi23 {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class TransportControls {
                    private TransportControls() {
                    }

                    public static void playFromUri(Object obj, Uri uri, Bundle bundle) {
/* 3 */                 ((MediaController.TransportControls) obj).playFromUri(uri, bundle);
                    }
                }

                private MediaControllerCompatApi23() {
                }
            }
