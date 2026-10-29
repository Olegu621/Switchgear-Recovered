            package android.support.v4.media.session;

            import android.media.session.PlaybackState;
            import android.os.Bundle;
            import java.util.Iterator;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class PlaybackStateCompatApi22 {
                private PlaybackStateCompatApi22() {
                }

                public static Bundle getExtras(Object obj) {
/* 3 */             return ((PlaybackState) obj).getExtras();
                }

                public static Object newInstance(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, List<Object> list, long j5, Bundle bundle) {
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
/* 50 */            builder.setExtras(bundle);
/* 53 */            return builder.build();
                }
            }
