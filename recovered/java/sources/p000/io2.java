            package p000;

            import java.io.Serializable;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class io2 implements Serializable {
                public io2() {
/* 3 */             TimeUnit.SECONDS.getClass();
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 53 */                return true;
                    }
/* 4 */             if (obj == null || !io2.class.equals(obj.getClass())) {
/* 55 */                return false;
                    }
/* 27 */            io2 io2Var = obj instanceof io2 ? (io2) obj : null;
/* 30 */            TimeUnit.MILLISECONDS.getClass();
/* 36 */            Long l = io2Var != null ? 1800000L : null;
                    return l != null && 1800000 == l.longValue();
                }

                public final int hashCode() {
/* 10 */            return TimeUnit.SECONDS.hashCode() + 55800;
                }

                public final String toString() {
/* 18 */            return "TimeMeasure{value=1800, unit=" + TimeUnit.SECONDS + '}';
                }
            }
