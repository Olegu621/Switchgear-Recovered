            package android.support.v4.media;

            import android.media.browse.MediaBrowser;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.InvocationTargetException;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class ParceledListSliceAdapterApi21 {
                private static Constructor sConstructor;

                static {
                    try {
/* 17 */                sConstructor = Class.forName("android.content.pm.ParceledListSlice").getConstructor(List.class);
                    } catch (ClassNotFoundException | NoSuchMethodException e) {
/* 21 */                e.printStackTrace();
                    }
                }

                private ParceledListSliceAdapterApi21() {
                }

                public static Object newInstance(List<MediaBrowser.MediaItem> list) {
                    try {
/* 7 */                 return sConstructor.newInstance(list);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
/* 13 */                e.printStackTrace();
/* 16 */                return null;
                    }
                }
            }
