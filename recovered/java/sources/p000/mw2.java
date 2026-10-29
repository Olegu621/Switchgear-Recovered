            package p000;

            import io.flutter.embedding.android.KeyboardMap;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class mw2 implements Comparable {

                /* JADX INFO: renamed from: b */
                public static final lw2 f14054b = new lw2(null);

                /* JADX INFO: renamed from: a */
                public final int f14055a;

                public /* synthetic */ mw2(int i) {
/* 4 */             this.f14055a = i;
                }

                @Override // java.lang.Comparable
                public final int compareTo(Object obj) {
/* 11 */            return Intrinsics.m6217b(this.f14055a ^ Integer.MIN_VALUE, ((mw2) obj).f14055a ^ Integer.MIN_VALUE);
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof mw2) {
                        return this.f14055a == ((mw2) obj).f14055a;
                    }
/* 14 */            return false;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.f14055a);
                }

                public final String toString() {
/* 10 */            return String.valueOf(((long) this.f14055a) & KeyboardMap.kValueMask);
                }
            }
