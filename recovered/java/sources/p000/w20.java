            package p000;

            import android.net.Uri;
            import android.os.Bundle;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class w20 {
                public static final int ACTIVITY_LAYOUT_STATE_BOTTOM_SHEET = 1;
                public static final int ACTIVITY_LAYOUT_STATE_BOTTOM_SHEET_MAXIMIZED = 2;
                public static final int ACTIVITY_LAYOUT_STATE_FULL_SCREEN = 5;
                public static final int ACTIVITY_LAYOUT_STATE_SIDE_SHEET = 3;
                public static final int ACTIVITY_LAYOUT_STATE_SIDE_SHEET_MAXIMIZED = 4;
                public static final int ACTIVITY_LAYOUT_STATE_UNKNOWN = 0;
                public static final int NAVIGATION_ABORTED = 4;
                public static final int NAVIGATION_FAILED = 3;
                public static final int NAVIGATION_FINISHED = 2;
                public static final int NAVIGATION_STARTED = 1;
                public static final String ONLINE_EXTRAS_KEY = "online";
                public static final int TAB_HIDDEN = 6;
                public static final int TAB_SHOWN = 5;

                public void extraCallback(String str, Bundle bundle) {
                }

                public Bundle extraCallbackWithResult(String str, Bundle bundle) {
/* 1 */             return null;
                }

                public void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
                }

                public void onActivityResized(int i, int i2, Bundle bundle) {
                }

                public void onMessageChannelReady(Bundle bundle) {
                }

                public void onMinimized(Bundle bundle) {
                }

                public abstract void onNavigationEvent(int i, Bundle bundle);

                public void onPostMessage(String str, Bundle bundle) {
                }

                public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
                }

                public void onUnminimized(Bundle bundle) {
                }

                public void onWarmupCompleted(Bundle bundle) {
                }
            }
