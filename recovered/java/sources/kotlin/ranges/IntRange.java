            package kotlin.ranges;

            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.zy0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0005¨\u0006\u0006"}, m6176d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/a;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "e", "zy0", "kotlin-stdlib"}, m6177k = 1, m6178mv = {2, 2, 0}, m6180xi = 48)
            public final class IntRange extends C1847a {

                /* JADX INFO: renamed from: e */
                public static final zy0 f12923e = new zy0(null);

                /* JADX INFO: renamed from: f */
                public static final IntRange f12924f = new IntRange(1, 0, 1);

                @Override // kotlin.ranges.C1847a
                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof IntRange)) {
/* 36 */                return false;
                    }
/* 9 */             if (isEmpty() && ((IntRange) obj).isEmpty()) {
/* 34 */                return true;
                    }
/* 20 */            IntRange intRange = (IntRange) obj;
                    return this.f12926a == intRange.f12926a && this.f12927b == intRange.f12927b;
                }

                @Override // kotlin.ranges.C1847a
                public final int hashCode() {
/* 5 */             if (isEmpty()) {
/* 7 */                 return -1;
                    }
/* 15 */            return (this.f12926a * 31) + this.f12927b;
                }

                @Override // kotlin.ranges.C1847a
                public final boolean isEmpty() {
                    return this.f12926a > this.f12927b;
                }

                @Override // kotlin.ranges.C1847a
                public final String toString() {
/* 21 */            return this.f12926a + ".." + this.f12927b;
                }
            }
