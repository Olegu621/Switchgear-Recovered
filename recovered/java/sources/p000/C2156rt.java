            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: renamed from: rt */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C2156rt extends AbstractC2045ot {

                /* JADX INFO: renamed from: e */
                public static final C2119qt f16287e = new C2119qt(null);

                static {
/* 13 */            new C2156rt((char) 1, (char) 0);
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof C2156rt)) {
/* 36 */                return false;
                    }
/* 9 */             if (isEmpty() && ((C2156rt) obj).isEmpty()) {
/* 34 */                return true;
                    }
/* 20 */            C2156rt c2156rt = (C2156rt) obj;
                    return this.f14888a == c2156rt.f14888a && this.f14889b == c2156rt.f14889b;
                }

                public final int hashCode() {
/* 5 */             if (isEmpty()) {
/* 7 */                 return -1;
                    }
/* 15 */            return (this.f14888a * 31) + this.f14889b;
                }

                public final boolean isEmpty() {
                    return Intrinsics.m6217b(this.f14888a, this.f14889b) > 0;
                }

                public final String toString() {
/* 21 */            return this.f14888a + ".." + this.f14889b;
                }
            }
