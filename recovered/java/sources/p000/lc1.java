            package p000;

            import java.util.Collection;
            import java.util.Map;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 7 */     public final class lc1 implements Map, r21 {

                /* JADX INFO: renamed from: a */
                public final Map f13181a;

                /* JADX INFO: renamed from: b */
                public final Function1 f13182b;

                public lc1(Map map, Function1 function1) {
/* 1 */             map.getClass();
/* 7 */             this.f13181a = map;
/* 9 */             this.f13182b = function1;
                }

                @Override // java.util.Map
                public final void clear() {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Map
                public final boolean containsKey(Object obj) {
/* 3 */             return this.f13181a.containsKey(obj);
                }

                @Override // java.util.Map
                public final boolean containsValue(Object obj) {
/* 3 */             return this.f13181a.containsValue(obj);
                }

                @Override // java.util.Map
                public final Set entrySet() {
/* 3 */             return this.f13181a.entrySet();
                }

                @Override // java.util.Map
                public final boolean equals(Object obj) {
/* 3 */             return this.f13181a.equals(obj);
                }

                @Override // java.util.Map
                public final Object get(Object obj) {
/* 3 */             return this.f13181a.get(obj);
                }

                @Override // java.util.Map
                public final int hashCode() {
/* 3 */             return this.f13181a.hashCode();
                }

                @Override // java.util.Map
                public final boolean isEmpty() {
/* 3 */             return this.f13181a.isEmpty();
                }

                @Override // java.util.Map
                public final Set keySet() {
/* 3 */             return this.f13181a.keySet();
                }

                @Override // java.util.Map
                public final Object put(Object obj, Object obj2) {
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
                public final int size() {
/* 3 */             return this.f13181a.size();
                }

                public final String toString() {
/* 3 */             return this.f13181a.toString();
                }

                @Override // java.util.Map
                public final Collection values() {
/* 3 */             return this.f13181a.values();
                }

                @Override // java.util.Map
/* 8 */         public final boolean remove(Object obj, Object obj2) {
/* 9 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
