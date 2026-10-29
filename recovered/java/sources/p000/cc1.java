            package p000;

            import java.util.Map;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class cc1 implements Map.Entry, r21 {

                /* JADX INFO: renamed from: a */
                public final Object f2837a;

                /* JADX INFO: renamed from: b */
                public final Object f2838b;

                public cc1(Object obj, Object obj2) {
/* 4 */             this.f2837a = obj;
/* 6 */             this.f2838b = obj2;
                }

                @Override // java.util.Map.Entry
                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof cc1)) {
/* 7 */                 return false;
                    }
/* 11 */            cc1 cc1Var = (cc1) obj;
                    return Intrinsics.m6216a(this.f2837a, cc1Var.f2837a) && Intrinsics.m6216a(this.f2838b, cc1Var.f2838b);
                }

                @Override // java.util.Map.Entry
                public final Object getKey() {
/* 1 */             return this.f2837a;
                }

                @Override // java.util.Map.Entry
                public final Object getValue() {
/* 1 */             return this.f2838b;
                }

                @Override // java.util.Map.Entry
                public final int hashCode() {
/* 2 */             Object obj = this.f2837a;
/* 12 */            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
/* 14 */            Object obj2 = this.f2838b;
/* 23 */            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
                }

                @Override // java.util.Map.Entry
                public final Object setValue(Object obj) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final String toString() {
/* 28 */            return "MapEntry(key=" + this.f2837a + ", value=" + this.f2838b + ')';
                }
            }
