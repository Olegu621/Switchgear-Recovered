            package p000;

            import java.util.List;
            import kotlin.text.StringsKt;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class qt0 implements SerialDescriptor {

                /* JADX INFO: renamed from: a */
                public final String f15735a;

                /* JADX INFO: renamed from: b */
                public final SerialDescriptor f15736b;

                /* JADX INFO: renamed from: c */
                public final SerialDescriptor f15737c;

                public qt0(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
/* 4 */             this.f15735a = str;
/* 6 */             this.f15736b = serialDescriptor;
/* 8 */             this.f15737c = serialDescriptor2;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: a */
                public final String mo130a() {
/* 1 */             return this.f15735a;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: c */
                public final boolean mo132c() {
/* 1 */             return false;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: d */
                public final int mo133d(String str) {
/* 1 */             str.getClass();
/* 4 */             Integer intOrNull = StringsKt.toIntOrNull(str);
/* 8 */             if (intOrNull != null) {
/* 10 */                return intOrNull.intValue();
                    }
/* 21 */            C1951n4.m6859j(fm0.m3783i(str, " is not a valid map index"));
/* 24 */            return 0;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: e */
                public final py0 mo134e() {
/* 1 */             return ei2.f7700m;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 45 */                return true;
                    }
/* 6 */             if (!(obj instanceof qt0)) {
/* 43 */                return false;
                    }
/* 9 */             qt0 qt0Var = (qt0) obj;
                    return this.f15735a.equals(qt0Var.f15735a) && this.f15736b.equals(qt0Var.f15736b) && this.f15737c.equals(qt0Var.f15737c);
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: f */
                public final int mo135f() {
/* 1 */             return 2;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: g */
                public final String mo136g(int i) {
/* 1 */             return String.valueOf(i);
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                public final List getAnnotations() {
/* 1 */             return nd0.f14189a;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: h */
                public final List mo137h(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 return nd0.f14189a;
                    }
/* 22 */            ds0.m3200q(fm0.m3789o(fm0.m3793s(i, "Illegal index ", ", "), this.f15735a, " expects only non-negative indices"));
/* 25 */            return null;
                }

                public final int hashCode() {
/* 24 */            return this.f15737c.hashCode() + ((this.f15736b.hashCode() + (this.f15735a.hashCode() * 31)) * 31);
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: i */
                public final SerialDescriptor mo138i(int i) {
/* 2 */             if (i < 0) {
/* 39 */                ds0.m3200q(fm0.m3789o(fm0.m3793s(i, "Illegal index ", ", "), this.f15735a, " expects only non-negative indices"));
/* 1 */                 return null;
                    }
/* 4 */             int i2 = i % 2;
/* 6 */             if (i2 == 0) {
/* 20 */                return this.f15736b;
                    }
/* 9 */             if (i2 == 1) {
/* 11 */                return this.f15737c;
                    }
/* 16 */            f42.m3656l("Unreached");
/* 1 */             return null;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                public final boolean isInline() {
/* 1 */             return false;
                }

                public final String toString() {
/* 36 */            return this.f15735a + '(' + this.f15736b + ", " + this.f15737c + ')';
                }
            }
