            package p000;

            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            import kotlinx.serialization.json.AbstractC1858b;
            import kotlinx.serialization.json.AbstractC1860d;
            import kotlinx.serialization.json.C1857a;
            import kotlinx.serialization.json.C1859c;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class n11 implements KSerializer {

                /* JADX INFO: renamed from: a */
                public static final n11 f14092a = new n11();

                /* JADX INFO: renamed from: b */
                public static final aa2 f14093b = hu0.m4320K("kotlinx.serialization.json.JsonElement", lt1.f13493l, new SerialDescriptor[0], C0170b7.f2262e);

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 5 */             return jb1.m5746f(decoder).mo5635m();
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 1 */             return f14093b;
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 1 */             AbstractC1858b abstractC1858b = (AbstractC1858b) obj;
/* 3 */             abstractC1858b.getClass();
/* 6 */             jb1.m5747g(encoder);
/* 11 */            if (abstractC1858b instanceof AbstractC1860d) {
/* 15 */                encoder.mo1484A(d21.f6963a, abstractC1858b);
                    } else if (abstractC1858b instanceof C1859c) {
/* 25 */                encoder.mo1484A(z11.f19904a, abstractC1858b);
                    } else if (abstractC1858b instanceof C1857a) {
/* 35 */                encoder.mo1484A(d11.f6955a, abstractC1858b);
                    }
                }
            }
