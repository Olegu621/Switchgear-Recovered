            package p000;

            import java.util.List;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class q83 {

                /* JADX INFO: renamed from: a */
                public final List f15446a;

                public q83(List list) {
/* 1 */             list.getClass();
/* 7 */             this.f15446a = list;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || !q83.class.equals(obj.getClass())) {
/* 31 */                return false;
                    }
/* 26 */            return Intrinsics.m6216a(this.f15446a, ((q83) obj).f15446a);
                }

                public final int hashCode() {
/* 3 */             return this.f15446a.hashCode();
                }

                public final String toString() {
/* 12 */            return CollectionsKt.m6203x(this.f15446a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
                }
            }
