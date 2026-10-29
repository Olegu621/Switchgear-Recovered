            package android.support.v4.media.session;

            import android.media.session.PlaybackState;
            import android.os.Bundle;
            import java.util.Iterator;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class PlaybackStateCompatApi21 {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class CustomAction {
                    private CustomAction() {
                    }

                    public static String getAction(Object obj) {
/* 3 */                 return ((PlaybackState.CustomAction) obj).getAction();
                    }

                    public static Bundle getExtras(Object obj) {
/* 3 */                 return ((PlaybackState.CustomAction) obj).getExtras();
                    }

                    public static int getIcon(Object obj) {
/* 3 */                 return ((PlaybackState.CustomAction) obj).getIcon();
                    }

                    public static CharSequence getName(Object obj) {
/* 3 */                 return ((PlaybackState.CustomAction) obj).getName();
                    }

                    public static Object newInstance(String str, CharSequence charSequence, int i, Bundle bundle) {
/* 3 */                 PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(str, charSequence, i);
/* 6 */                 builder.setExtras(bundle);
/* 9 */                 return builder.build();
                    }
                }

                private PlaybackStateCompatApi21() {
                }

                public static long getActions(Object obj) {
/* 3 */             return ((PlaybackState) obj).getActions();
                }

                public static long getActiveQueueItemId(Object obj) {
/* 3 */             return ((PlaybackState) obj).getActiveQueueItemId();
                }

                public static long getBufferedPosition(Object obj) {
/* 3 */             return ((PlaybackState) obj).getBufferedPosition();
                }

                public static List<Object> getCustomActions(Object obj) {
/* 3 */             return ((PlaybackState) obj).getCustomActions();
                }

                public static CharSequence getErrorMessage(Object obj) {
/* 3 */             return ((PlaybackState) obj).getErrorMessage();
                }

                public static long getLastPositionUpdateTime(Object obj) {
/* 3 */             return ((PlaybackState) obj).getLastPositionUpdateTime();
                }

                public static float getPlaybackSpeed(Object obj) {
/* 3 */             return ((PlaybackState) obj).getPlaybackSpeed();
                }

                public static long getPosition(Object obj) {
/* 3 */             return ((PlaybackState) obj).getPosition();
                }

                public static int getState(Object obj) {
/* 3 */             return ((PlaybackState) obj).getState();
                }

                public static Object newInstance(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, List<Object> list, long j5) {
/* 3 */             PlaybackState.Builder builder = new PlaybackState.Builder();
/* 11 */            builder.setState(i, j, f, j4);
/* 14 */            builder.setBufferedPosition(j2);
/* 17 */            builder.setActions(j3);
/* 20 */            builder.setErrorMessage(charSequence);
/* 23 */            Iterator<Object> it = list.iterator();
/* 31 */            while (it.hasNext()) {
/* 39 */                builder.addCustomAction((PlaybackState.CustomAction) it.next());
                    }
/* 45 */            builder.setActiveQueueItemId(j5);
/* 48 */            return builder.build();
                }
            }
