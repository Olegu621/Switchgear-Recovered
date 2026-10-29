            package p000;

            import kotlin.text.AbstractC1856i;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class k11 extends hu0 {

                /* JADX INFO: renamed from: e */
                public final C1837kn f12560e;

                /* JADX INFO: renamed from: f */
                public final C0168b5 f12561f;

                public k11(C1837kn c1837kn, b11 b11Var) {
/* 1 */             b11Var.getClass();
/* 7 */             this.f12560e = c1837kn;
/* 11 */            this.f12561f = b11Var.f2163b;
                }

                @Override // p000.hu0, kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: B */
                public final byte mo4351B() {
/* 1 */             C1837kn c1837kn = this.f12560e;
/* 3 */             String strM6132j = c1837kn.m6132j();
                    try {
/* 7 */                 return AbstractC1856i.m6264a(strM6132j);
                    } catch (IllegalArgumentException unused) {
/* 33 */                C1837kn.m6122m(c1837kn, "Failed to parse type 'UByte' for input '" + strM6132j + '\'', 0, 6);
/* 37 */                throw null;
                    }
                }

                @Override // p000.hu0, kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: C */
                public final short mo4352C() {
/* 1 */             C1837kn c1837kn = this.f12560e;
/* 3 */             String strM6132j = c1837kn.m6132j();
                    try {
/* 7 */                 return AbstractC1856i.m6269f(strM6132j);
                    } catch (IllegalArgumentException unused) {
/* 33 */                C1837kn.m6122m(c1837kn, "Failed to parse type 'UShort' for input '" + strM6132j + '\'', 0, 6);
/* 37 */                throw null;
                    }
                }

                @Override // kotlinx.serialization.encoding.Decoder, p000.InterfaceC1870ky
                /* JADX INFO: renamed from: a */
                public final C0168b5 mo5933a() {
/* 1 */             return this.f12561f;
                }

                @Override // p000.hu0, kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: o */
                public final int mo4369o() {
/* 1 */             C1837kn c1837kn = this.f12560e;
/* 3 */             String strM6132j = c1837kn.m6132j();
                    try {
/* 7 */                 return AbstractC1856i.m6265b(strM6132j);
                    } catch (IllegalArgumentException unused) {
/* 33 */                C1837kn.m6122m(c1837kn, "Failed to parse type 'UInt' for input '" + strM6132j + '\'', 0, 6);
/* 37 */                throw null;
                    }
                }

                @Override // p000.hu0, kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: s */
                public final long mo4373s() {
/* 1 */             C1837kn c1837kn = this.f12560e;
/* 3 */             String strM6132j = c1837kn.m6132j();
                    try {
/* 7 */                 return AbstractC1856i.m6267d(strM6132j);
                    } catch (IllegalArgumentException unused) {
/* 33 */                C1837kn.m6122m(c1837kn, "Failed to parse type 'ULong' for input '" + strM6132j + '\'', 0, 6);
/* 37 */                throw null;
                    }
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: x */
                public final int mo3299x(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 11 */            throw new IllegalStateException("unsupported");
                }
            }
