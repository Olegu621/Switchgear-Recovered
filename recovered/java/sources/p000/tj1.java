            package p000;

            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class tj1 {

                /* JADX INFO: renamed from: b */
                public static final tj1 f17127b = new tj1(Collections.unmodifiableMap(new HashMap()));

                /* JADX INFO: renamed from: a */
                public final Map f17128a;

                public tj1(Map map) {
/* 4 */             this.f17128a = map;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof tj1) {
/* 13 */                return this.f17128a.equals(((tj1) obj).f17128a);
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.f17128a.hashCode();
                }

                public final String toString() {
/* 3 */             return this.f17128a.toString();
                }
            }
