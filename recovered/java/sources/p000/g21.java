            package p000;

            import java.util.List;
            import kotlin.collections.CollectionsKt;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.json.AbstractC1858b;
            import kotlinx.serialization.json.C1859c;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class g21 extends e21 {

                /* JADX INFO: renamed from: j */
                public final C1859c f8436j;

                /* JADX INFO: renamed from: k */
                public final List f8437k;

                /* JADX INFO: renamed from: l */
                public final int f8438l;

                /* JADX INFO: renamed from: m */
                public int f8439m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g21(b11 b11Var, C1859c c1859c) {
/* 5 */             super(b11Var, c1859c, null, null);
/* 1 */             b11Var.getClass();
/* 8 */             this.f8436j = c1859c;
/* 16 */            List listM6192K = CollectionsKt.m6192K(c1859c.f12964a.keySet());
/* 20 */            this.f8437k = listM6192K;
/* 28 */            this.f8438l = listM6192K.size() * 2;
/* 31 */            this.f8439m = -1;
                }

                @Override // p000.e21, p000.AbstractC1946n
                /* JADX INFO: renamed from: G */
                public final AbstractC1858b mo3292G(String str) {
/* 1 */             str.getClass();
/* 8 */             if (this.f8439m % 2 == 0) {
/* 10 */                return py0.m7585H(str);
                    }
/* 15 */            C1859c c1859c = this.f8436j;
/* 17 */            c1859c.getClass();
/* 24 */            return (AbstractC1858b) mc1.m6638a(c1859c, str);
                }

                @Override // p000.e21, p000.AbstractC1946n
                /* JADX INFO: renamed from: Q */
                public final String mo3293Q(SerialDescriptor serialDescriptor, int i) {
/* 1 */             serialDescriptor.getClass();
/* 12 */            return (String) this.f8437k.get(i / 2);
                }

                @Override // p000.e21, p000.AbstractC1946n
                /* JADX INFO: renamed from: T */
                public final AbstractC1858b mo3294T() {
/* 1 */             return this.f8436j;
                }

                @Override // p000.e21
                /* JADX INFO: renamed from: W */
                public final C1859c mo3294T() {
/* 1 */             return this.f8436j;
                }

                @Override // p000.e21, p000.AbstractC1946n, p000.InterfaceC1870ky
                /* JADX INFO: renamed from: b */
                public final void mo3296b(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
                }

                @Override // p000.e21, p000.InterfaceC1870ky
                /* JADX INFO: renamed from: x */
                public final int mo3299x(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             int i = this.f8439m;
/* 10 */            if (i >= this.f8438l - 1) {
/* 17 */                return -1;
                    }
/* 12 */            int i2 = i + 1;
/* 14 */            this.f8439m = i2;
/* 16 */            return i2;
                }
            }
