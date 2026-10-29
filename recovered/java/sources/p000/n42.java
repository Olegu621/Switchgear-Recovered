            package p000;

            import java.io.Serializable;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class n42 implements Serializable {

                /* JADX INFO: renamed from: a */
                public final Throwable f14120a;

                public n42(Throwable th) {
/* 1 */             th.getClass();
/* 7 */             this.f14120a = th;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof n42) {
                        return Intrinsics.m6216a(this.f14120a, ((n42) obj).f14120a);
                    }
/* 19 */            return false;
                }

                public final int hashCode() {
/* 3 */             return this.f14120a.hashCode();
                }

                public final String toString() {
/* 18 */            return "Failure(" + this.f14120a + ')';
                }
            }
