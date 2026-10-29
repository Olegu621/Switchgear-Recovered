            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class ax2 implements Comparable {

                /* JADX INFO: renamed from: b */
                public static final zw2 f2137b = new zw2(null);

                /* JADX INFO: renamed from: a */
                public final short f2138a;

                @Override // java.lang.Comparable
                public final /* synthetic */ int compareTo(Object obj) {
/* 12 */            return Intrinsics.m6217b(this.f2138a & 65535, ((ax2) obj).f2138a & 65535);
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof ax2) {
                        return this.f2138a == ((ax2) obj).f2138a;
                    }
/* 14 */            return false;
                }

                public final int hashCode() {
/* 3 */             return Short.hashCode(this.f2138a);
                }

                public final String toString() {
/* 7 */             return String.valueOf(this.f2138a & 65535);
                }
            }
