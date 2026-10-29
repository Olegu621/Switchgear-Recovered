            package p000;

            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.json.AbstractC1858b;
            import kotlinx.serialization.json.C1857a;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class f21 extends AbstractC1946n {

                /* JADX INFO: renamed from: e */
                public final C1857a f7973e;

                /* JADX INFO: renamed from: f */
                public final int f7974f;

                /* JADX INFO: renamed from: g */
                public int f7975g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f21(b11 b11Var, C1857a c1857a) {
/* 4 */             super(b11Var);
/* 1 */             b11Var.getClass();
/* 7 */             this.f7973e = c1857a;
/* 15 */            this.f7974f = c1857a.f12963a.size();
/* 18 */            this.f7975g = -1;
                }

                @Override // p000.AbstractC1946n
                /* JADX INFO: renamed from: G */
                public final AbstractC1858b mo3292G(String str) {
/* 1 */             str.getClass();
/* 16 */            return (AbstractC1858b) this.f7973e.f12963a.get(Integer.parseInt(str));
                }

                @Override // p000.AbstractC1946n
                /* JADX INFO: renamed from: Q */
                public final String mo3293Q(SerialDescriptor serialDescriptor, int i) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             return String.valueOf(i);
                }

                @Override // p000.AbstractC1946n
                /* JADX INFO: renamed from: T */
                public final AbstractC1858b mo3294T() {
/* 1 */             return this.f7973e;
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: x */
                public final int mo3299x(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             int i = this.f7975g;
/* 10 */            if (i >= this.f7974f - 1) {
/* 17 */                return -1;
                    }
/* 12 */            int i2 = i + 1;
/* 14 */            this.f7975g = i2;
/* 16 */            return i2;
                }
            }
