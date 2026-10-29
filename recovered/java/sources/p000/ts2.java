            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class ts2 implements Comparable {

                /* JADX INFO: renamed from: b */
                public static final ss2 f17251b = new ss2(null);

                /* JADX INFO: renamed from: a */
                public final byte f17252a;

                public /* synthetic */ ts2(byte b) {
/* 4 */             this.f17252a = b;
                }

                @Override // java.lang.Comparable
                public final /* synthetic */ int compareTo(Object obj) {
/* 11 */            return Intrinsics.m6217b(this.f17252a & 255, ((ts2) obj).f17252a & 255);
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof ts2) {
                        return this.f17252a == ((ts2) obj).f17252a;
                    }
/* 14 */            return false;
                }

                public final int hashCode() {
/* 3 */             return Byte.hashCode(this.f17252a);
                }

                public final String toString() {
/* 5 */             return String.valueOf(this.f17252a & 255);
                }
            }
