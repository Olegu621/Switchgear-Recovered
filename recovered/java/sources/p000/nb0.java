            package p000;

            import android.hardware.camera2.params.DynamicRangeProfiles;
            import android.support.v4.media.session.PlaybackStateCompat;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class nb0 {

                /* JADX INFO: renamed from: a */
                public static final HashMap f14175a;

                /* JADX INFO: renamed from: b */
                public static final HashMap f14176b;

                static {
                    mb0 mb0Var;
/* 3 */             HashMap map = new HashMap();
/* 6 */             f14175a = map;
/* 10 */            HashMap map2 = new HashMap();
/* 13 */            f14176b = map2;
/* 21 */            mb0 mb0Var2 = mb0.f13671d;
/* 23 */            map.put(1L, mb0Var2);
/* 30 */            map2.put(mb0Var2, Collections.singletonList(1L));
/* 41 */            map.put(2L, mb0.f13672e);
/* 54 */            map2.put((mb0) map.get(2L), Collections.singletonList(2L));
/* 63 */            mb0 mb0Var3 = mb0.f13673f;
/* 65 */            map.put(4L, mb0Var3);
/* 72 */            map2.put(mb0Var3, Collections.singletonList(4L));
/* 81 */            mb0 mb0Var4 = mb0.f13674g;
/* 83 */            map.put(8L, mb0Var4);
/* 90 */            map2.put(mb0Var4, Collections.singletonList(8L));
/* 121 */           List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
/* 125 */           Iterator it = listAsList.iterator();
                    while (true) {
/* 129 */               boolean zHasNext = it.hasNext();
/* 133 */               mb0Var = mb0.f13675h;
/* 135 */               if (!zHasNext) {
                            break;
                        }
/* 145 */               f14175a.put((Long) it.next(), mb0Var);
                    }
/* 151 */           f14176b.put(mb0Var, listAsList);
/* 182 */           List listAsList2 = Arrays.asList(1024L, Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH), 256L, 512L);
/* 186 */           Iterator it2 = listAsList2.iterator();
                    while (true) {
/* 190 */               boolean zHasNext2 = it2.hasNext();
/* 194 */               mb0 mb0Var5 = mb0.f13676i;
/* 196 */               if (!zHasNext2) {
/* 212 */                   f14176b.put(mb0Var5, listAsList2);
/* 215 */                   return;
                        } else {
/* 206 */                   f14175a.put((Long) it2.next(), mb0Var5);
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
                public static Long m6958a(mb0 mb0Var, DynamicRangeProfiles dynamicRangeProfiles) {
/* 7 */             List<Long> list = (List) f14176b.get(mb0Var);
/* 9 */             if (list == null) {
/* 38 */                return null;
                    }
/* 1 */             Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
/* 23 */            for (Long l : list) {
/* 35 */                if (supportedProfiles.contains(l)) {
/* 37 */                    return l;
                        }
                    }
/* 38 */            return null;
                }
            }
