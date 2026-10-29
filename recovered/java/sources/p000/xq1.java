            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class xq1 implements InterfaceC0194bv {

                /* JADX INFO: renamed from: a */
                public final Class f19322a;

                public xq1(Class cls) {
/* 1 */             cls.getClass();
/* 7 */             this.f19322a = cls;
                }

                @Override // p000.InterfaceC0194bv
                /* JADX INFO: renamed from: a */
                public final Class mo1447a() {
/* 1 */             return this.f19322a;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof xq1) {
                        return Intrinsics.m6216a(this.f19322a, ((xq1) obj).f19322a);
                    }
/* 19 */            return false;
                }

                public final int hashCode() {
/* 3 */             return this.f19322a.hashCode();
                }

                public final String toString() {
/* 16 */            return this.f19322a + " (Kotlin reflection is not available)";
                }
            }
