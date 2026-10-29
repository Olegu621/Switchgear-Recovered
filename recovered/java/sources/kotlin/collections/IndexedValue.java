            package kotlin.collections;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, m6176d2 = {"Lkotlin/collections/IndexedValue;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, m6177k = 1, m6178mv = {2, 2, 0}, m6180xi = 48)
            public final /* data */ class IndexedValue<T> {

                /* JADX INFO: renamed from: a */
                public final int f12911a;

                /* JADX INFO: renamed from: b */
                public final Object f12912b;

                public IndexedValue(int i, Object obj) {
/* 4 */             this.f12911a = i;
/* 6 */             this.f12912b = obj;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IndexedValue)) {
/* 7 */                 return false;
                    }
/* 11 */            IndexedValue indexedValue = (IndexedValue) obj;
                    return this.f12911a == indexedValue.f12911a && Intrinsics.m6216a(this.f12912b, indexedValue.f12912b);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = Integer.hashCode(this.f12911a) * 31;
/* 9 */             Object obj = this.f12912b;
/* 19 */            return iHashCode + (obj == null ? 0 : obj.hashCode());
                }

                public final String toString() {
/* 28 */            return "IndexedValue(index=" + this.f12911a + ", value=" + this.f12912b + ')';
                }
            }
