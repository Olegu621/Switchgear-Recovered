            package p000;

            import java.io.Serializable;
            import java.util.Collection;
            import java.util.Map;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 7 */     public final class od0 implements Map, Serializable, r21 {

                /* JADX INFO: renamed from: a */
                public static final od0 f14715a = new od0();

                private final Object readResolve() {
/* 1 */             return f14715a;
                }

                @Override // java.util.Map
                public final void clear() {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Map
                public final boolean containsKey(Object obj) {
/* 1 */             return false;
                }

                @Override // java.util.Map
                public final /* bridge */ boolean containsValue(Object obj) {
/* 1 */             return false;
                }

                @Override // java.util.Map
                public final Set entrySet() {
/* 1 */             return qd0.f15493a;
                }

                @Override // java.util.Map
                public final boolean equals(Object obj) {
                    return (obj instanceof Map) && ((Map) obj).isEmpty();
                }

                @Override // java.util.Map
                public final /* bridge */ /* synthetic */ Object get(Object obj) {
/* 1 */             return null;
                }

                @Override // java.util.Map
                public final int hashCode() {
/* 1 */             return 0;
                }

                @Override // java.util.Map
                public final boolean isEmpty() {
/* 1 */             return true;
                }

                @Override // java.util.Map
                public final Set keySet() {
/* 1 */             return qd0.f15493a;
                }

                @Override // java.util.Map
                public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Map
                public final void putAll(Map map) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Map
                public final Object remove(Object obj) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Map
                public final /* bridge */ int size() {
/* 1 */             return 0;
                }

                public final String toString() {
/* 1 */             return "{}";
                }

                @Override // java.util.Map
                public final Collection values() {
/* 1 */             return nd0.f14189a;
                }

                @Override // java.util.Map
/* 8 */         public final boolean remove(Object obj, Object obj2) {
/* 9 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
