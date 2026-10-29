            package p000;

            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class i81 implements SerialDescriptor {

                /* JADX INFO: renamed from: a */
                public final SerialDescriptor f9497a;

                public i81(SerialDescriptor serialDescriptor) {
/* 4 */             this.f9497a = serialDescriptor;
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
/* 21 */            C1951n4.m6859j(fm0.m3783i(str, " is not a valid list index"));
/* 24 */            return 0;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: e */
                public final py0 mo134e() {
/* 1 */             return ei2.f7699l;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 35 */                return true;
                    }
/* 6 */             if (!(obj instanceof i81)) {
/* 37 */                return false;
                    }
/* 9 */             i81 i81Var = (i81) obj;
                    return Intrinsics.m6216a(this.f9497a, i81Var.f9497a) && Intrinsics.m6216a(mo130a(), i81Var.mo130a());
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: f */
                public final int mo135f() {
/* 1 */             return 1;
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
/* 10 */            StringBuilder sbM3793s = fm0.m3793s(i, "Illegal index ", ", ");
/* 18 */            sbM3793s.append(mo130a());
/* 23 */            sbM3793s.append(" expects only non-negative indices");
/* 39 */            throw new IllegalArgumentException(sbM3793s.toString().toString());
                }

                public final int hashCode() {
/* 17 */            return mo130a().hashCode() + (this.f9497a.hashCode() * 31);
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: i */
                public final SerialDescriptor mo138i(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 return this.f9497a;
                    }
/* 10 */            StringBuilder sbM3793s = fm0.m3793s(i, "Illegal index ", ", ");
/* 18 */            sbM3793s.append(mo130a());
/* 23 */            sbM3793s.append(" expects only non-negative indices");
/* 39 */            throw new IllegalArgumentException(sbM3793s.toString().toString());
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                public final boolean isInline() {
/* 1 */             return false;
                }

                public final String toString() {
/* 28 */            return mo130a() + '(' + this.f9497a + ')';
                }
            }
