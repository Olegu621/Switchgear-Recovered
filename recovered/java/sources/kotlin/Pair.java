            package kotlin;

            import java.io.Serializable;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m6176d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, m6177k = 1, m6178mv = {2, 2, 0}, m6180xi = 48)
            public final /* data */ class Pair<A, B> implements Serializable {

                /* JADX INFO: renamed from: a */
                public final Object f12908a;

                /* JADX INFO: renamed from: b */
                public final Object f12909b;

                public Pair(Object obj, Object obj2) {
/* 4 */             this.f12908a = obj;
/* 6 */             this.f12909b = obj2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Pair)) {
/* 7 */                 return false;
                    }
/* 11 */            Pair pair = (Pair) obj;
                    return Intrinsics.m6216a(this.f12908a, pair.f12908a) && Intrinsics.m6216a(this.f12909b, pair.f12909b);
                }

                public final int hashCode() {
/* 2 */             Object obj = this.f12908a;
/* 12 */            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
/* 14 */            Object obj2 = this.f12909b;
/* 23 */            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
                }

                public final String toString() {
/* 28 */            return "(" + this.f12908a + ", " + this.f12909b + ')';
                }
            }
