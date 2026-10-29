            package p000;

            import java.util.List;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class x00 implements SerialDescriptor {

                /* JADX INFO: renamed from: a */
                public final aa2 f18880a;

                /* JADX INFO: renamed from: b */
                public final C0857dv f18881b;

                /* JADX INFO: renamed from: c */
                public final String f18882c;

                public x00(aa2 aa2Var, C0857dv c0857dv) {
/* 4 */             this.f18880a = aa2Var;
/* 6 */             this.f18881b = c0857dv;
/* 39 */            this.f18882c = aa2Var.f143a + '<' + c0857dv.m3242b() + '>';
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: a */
                public final String mo130a() {
/* 1 */             return this.f18882c;
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
/* 6 */             return this.f18880a.mo133d(str);
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: e */
                public final py0 mo134e() {
/* 3 */             return this.f18880a.f144b;
                }

                public final boolean equals(Object obj) {
/* 8 */             x00 x00Var = obj instanceof x00 ? (x00) obj : null;
                    return x00Var != null && this.f18880a.equals(x00Var.f18880a) && x00Var.f18881b.equals(this.f18881b);
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: f */
                public final int mo135f() {
/* 3 */             return this.f18880a.f145c;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: g */
                public final String mo136g(int i) {
/* 5 */             return this.f18880a.f148f[i];
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                public final List getAnnotations() {
/* 3 */             return this.f18880a.f146d;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: h */
                public final List mo137h(int i) {
/* 5 */             return this.f18880a.f150h[i];
                }

                public final int hashCode() {
/* 15 */            return this.f18882c.hashCode() + (this.f18881b.hashCode() * 31);
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: i */
                public final SerialDescriptor mo138i(int i) {
/* 5 */             return this.f18880a.f149g[i];
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                public final boolean isInline() {
/* 1 */             return false;
                }

                public final String toString() {
/* 28 */            return "ContextDescriptor(kClass: " + this.f18881b + ", original: " + this.f18880a + ')';
                }
            }
