            package p000;

            import java.util.Collections;
            import java.util.Map;
            import kotlin.Pair;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class nc1 extends mc1 {
                /* JADX INFO: renamed from: c */
                public static int m6962c(int i) {
/* 1 */             if (i < 0) {
/* 3 */                 return i;
                    }
/* 5 */             if (i < 3) {
/* 7 */                 return i + 1;
                    }
                    return i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : AbstractC0208c9.API_PRIORITY_OTHER;
                }

                /* JADX INFO: renamed from: d */
                public static Map m6963d(Pair pair) {
/* 1 */             pair.getClass();
/* 8 */             Map mapSingletonMap = Collections.singletonMap(pair.f12908a, pair.f12909b);
/* 12 */            mapSingletonMap.getClass();
/* 15 */            return mapSingletonMap;
                }
            }
