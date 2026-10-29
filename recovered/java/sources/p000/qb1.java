            package p000;

            import java.util.ConcurrentModificationException;
            import java.util.Map;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class qb1 implements Map.Entry, r21 {

                /* JADX INFO: renamed from: a */
                public final sb1 f15479a;

                /* JADX INFO: renamed from: b */
                public final int f15480b;

                /* JADX INFO: renamed from: c */
                public final int f15481c;

                public qb1(sb1 sb1Var, int i) {
/* 1 */             sb1Var.getClass();
/* 7 */             this.f15479a = sb1Var;
/* 9 */             this.f15480b = i;
/* 13 */            this.f15481c = sb1Var.f16504v;
                }

                /* JADX INFO: renamed from: a */
                public final void m7761a() {
/* 7 */             if (this.f15479a.f16504v != this.f15481c) {
/* 17 */                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
                    }
                }

                @Override // java.util.Map.Entry
                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof Map.Entry)) {
/* 37 */                return false;
                    }
/* 5 */             Map.Entry entry = (Map.Entry) obj;
                    return Intrinsics.m6216a(entry.getKey(), getKey()) && Intrinsics.m6216a(entry.getValue(), getValue());
                }

                @Override // java.util.Map.Entry
                public final Object getKey() {
/* 1 */             m7761a();
/* 10 */            return this.f15479a.f16497a[this.f15480b];
                }

                @Override // java.util.Map.Entry
                public final Object getValue() {
/* 1 */             m7761a();
/* 6 */             Object[] objArr = this.f15479a.f16498b;
/* 8 */             objArr.getClass();
/* 13 */            return objArr[this.f15480b];
                }

                @Override // java.util.Map.Entry
                public final int hashCode() {
/* 1 */             Object key = getKey();
/* 13 */            int iHashCode = key != null ? key.hashCode() : 0;
/* 14 */            Object value = getValue();
/* 24 */            return iHashCode ^ (value != null ? value.hashCode() : 0);
                }

                @Override // java.util.Map.Entry
                public final Object setValue(Object obj) {
/* 1 */             m7761a();
/* 4 */             sb1 sb1Var = this.f15479a;
/* 6 */             sb1Var.m8462b();
/* 9 */             Object[] objArr = sb1Var.f16498b;
/* 11 */            if (objArr == null) {
/* 16 */                int length = sb1Var.f16497a.length;
/* 17 */                if (length < 0) {
/* 32 */                    C1951n4.m6859j("capacity must be non-negative.");
/* 35 */                    return null;
                        }
/* 19 */                objArr = new Object[length];
/* 21 */                sb1Var.f16498b = objArr;
                    }
/* 23 */            int i = this.f15480b;
/* 25 */            Object obj2 = objArr[i];
/* 27 */            objArr[i] = obj;
/* 29 */            return obj2;
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(getKey());
/* 15 */            sb.append('=');
/* 22 */            sb.append(getValue());
/* 25 */            return sb.toString();
                }
            }
