            package kotlinx.serialization.json;

            import java.util.Collection;
            import java.util.Map;
            import java.util.Set;
            import java.util.function.BiFunction;
            import java.util.function.Function;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import p000.C0170b7;
            import p000.r21;
            
            /* JADX INFO: renamed from: kotlinx.serialization.json.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 7 */     public final class C1859c extends AbstractC1858b implements Map, r21 {
                public static final JsonObject$Companion Companion = new JsonObject$Companion();

                /* JADX INFO: renamed from: a */
                public final Map f12964a;

                public C1859c(Map map) {
/* 1 */             map.getClass();
/* 7 */             this.f12964a = map;
                }

                @Override // java.util.Map
                public final void clear() {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Map
                public final /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Map
                public final /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Map
                public final /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Map
                public final boolean containsKey(Object obj) {
/* 3 */             if (!(obj instanceof String)) {
/* 5 */                 return false;
                    }
/* 11 */            return this.f12964a.containsKey((String) obj);
                }

                @Override // java.util.Map
                public final boolean containsValue(Object obj) {
/* 3 */             if (!(obj instanceof AbstractC1858b)) {
/* 5 */                 return false;
                    }
/* 11 */            return this.f12964a.containsValue((AbstractC1858b) obj);
                }

                @Override // java.util.Map
                public final Set entrySet() {
/* 3 */             return this.f12964a.entrySet();
                }

                @Override // java.util.Map
                public final boolean equals(Object obj) {
/* 3 */             return Intrinsics.m6216a(this.f12964a, obj);
                }

                @Override // java.util.Map
                public final Object get(Object obj) {
/* 3 */             if (!(obj instanceof String)) {
/* 5 */                 return null;
                    }
/* 15 */            return (AbstractC1858b) this.f12964a.get((String) obj);
                }

                @Override // java.util.Map
                public final int hashCode() {
/* 3 */             return this.f12964a.hashCode();
                }

                @Override // java.util.Map
                public final boolean isEmpty() {
/* 3 */             return this.f12964a.isEmpty();
                }

                @Override // java.util.Map
                public final Set keySet() {
/* 3 */             return this.f12964a.keySet();
                }

                @Override // java.util.Map
                public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
                public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Map
                public final Object remove(Object obj) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Map
                public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Map
                public final void replaceAll(BiFunction biFunction) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Map
                public final int size() {
/* 3 */             return this.f12964a.size();
                }

                public final String toString() {
/* 17 */            return CollectionsKt.m6203x(this.f12964a.entrySet(), ",", "{", "}", C0170b7.f2264f, 24);
                }

                @Override // java.util.Map
                public final Collection values() {
/* 3 */             return this.f12964a.values();
                }

                @Override // java.util.Map
/* 8 */         public final boolean remove(Object obj, Object obj2) {
/* 9 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Map
/* 8 */         public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
/* 9 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
