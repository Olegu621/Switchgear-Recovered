            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class iw1 {

                /* JADX INFO: renamed from: a */
                public final String f11950a;

                public iw1(String str) {
/* 1 */             str.getClass();
/* 7 */             this.f11950a = str;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof iw1)) {
/* 16 */                return false;
                    }
/* 11 */            return Intrinsics.m6216a(this.f11950a, ((iw1) obj).f11950a);
                }

                public final int hashCode() {
/* 3 */             return this.f11950a.hashCode();
                }

                public final String toString() {
/* 1 */             return this.f11950a;
                }
            }
