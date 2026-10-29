            package p000;

            import java.util.List;
            import java.util.Set;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class z92 implements SerialDescriptor, InterfaceC1895lm {

                /* JADX INFO: renamed from: a */
                public final SerialDescriptor f20000a;

                /* JADX INFO: renamed from: b */
                public final String f20001b;

                /* JADX INFO: renamed from: c */
                public final Set f20002c;

                public z92(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 7 */             this.f20000a = serialDescriptor;
/* 30 */            this.f20001b = serialDescriptor.mo130a() + '?';
/* 36 */            this.f20002c = xe2.m9766d(serialDescriptor);
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: a */
                public final String mo130a() {
/* 1 */             return this.f20001b;
                }

                @Override // p000.InterfaceC1895lm
                /* JADX INFO: renamed from: b */
                public final Set mo131b() {
/* 1 */             return this.f20002c;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: c */
                public final boolean mo132c() {
/* 1 */             return true;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: d */
                public final int mo133d(String str) {
/* 1 */             str.getClass();
/* 6 */             return this.f20000a.mo133d(str);
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: e */
                public final py0 mo134e() {
/* 3 */             return this.f20000a.mo134e();
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof z92) {
                        return Intrinsics.m6216a(this.f20000a, ((z92) obj).f20000a);
                    }
/* 7 */             return false;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: f */
                public final int mo135f() {
/* 3 */             return this.f20000a.mo135f();
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: g */
                public final String mo136g(int i) {
/* 3 */             return this.f20000a.mo136g(i);
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                public final List getAnnotations() {
/* 3 */             return this.f20000a.getAnnotations();
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: h */
                public final List mo137h(int i) {
/* 3 */             return this.f20000a.mo137h(i);
                }

                public final int hashCode() {
/* 7 */             return this.f20000a.hashCode() * 31;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: i */
                public final SerialDescriptor mo138i(int i) {
/* 3 */             return this.f20000a.mo138i(i);
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                public final boolean isInline() {
/* 3 */             return this.f20000a.isInline();
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append(this.f20000a);
/* 13 */            sb.append('?');
/* 16 */            return sb.toString();
                }
            }
