            package p000;

            import java.util.Comparator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class ol1 implements Comparator {

                /* JADX INFO: renamed from: a */
                public static final ol1 f14800a = new ol1();

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
/* 1 */             Comparable comparable = (Comparable) obj;
/* 3 */             Comparable comparable2 = (Comparable) obj2;
/* 5 */             comparable.getClass();
/* 8 */             comparable2.getClass();
/* 11 */            return comparable.compareTo(comparable2);
                }

                @Override // java.util.Comparator
                public final Comparator reversed() {
/* 1 */             return z42.f19932a;
                }
            }
