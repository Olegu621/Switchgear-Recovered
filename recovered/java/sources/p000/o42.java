            package p000;

            import java.io.Serializable;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class o42 implements Serializable {

                /* JADX INFO: renamed from: b */
                public static final m42 f14612b = new m42(null);

                /* JADX INFO: renamed from: a */
                public final Object f14613a;

                public /* synthetic */ o42(Object obj) {
/* 4 */             this.f14613a = obj;
                }

                /* JADX INFO: renamed from: a */
                public static final Throwable m7099a(Object obj) {
/* 3 */             if (obj instanceof n42) {
/* 7 */                 return ((n42) obj).f14120a;
                    }
/* 10 */            return null;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof o42) {
                        return Intrinsics.m6216a(this.f14613a, ((o42) obj).f14613a);
                    }
/* 18 */            return false;
                }

                public final int hashCode() {
/* 1 */             Object obj = this.f14613a;
/* 3 */             if (obj == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return obj.hashCode();
                }

                public final String toString() {
/* 1 */             Object obj = this.f14613a;
/* 5 */             if (obj instanceof n42) {
/* 9 */                 return ((n42) obj).toString();
                    }
/* 29 */            return "Success(" + obj + ')';
                }
            }
