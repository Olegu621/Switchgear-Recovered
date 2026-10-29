            package p000;

            import java.util.Map;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            import kotlinx.serialization.json.C1859c;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class z11 implements KSerializer {

                /* JADX INFO: renamed from: a */
                public static final z11 f19904a = new z11();

                /* JADX INFO: renamed from: b */
                public static final y11 f19905b = y11.f19434b;

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 1 */             jb1.m5746f(decoder);
/* 8 */             j13.m5659u(rh2.f16075a);
/* 27 */            return new C1859c((Map) new rt0(vh2.f18183a, n11.f14092a, 1).deserialize(decoder));
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 1 */             return f19905b;
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 1 */             C1859c c1859c = (C1859c) obj;
/* 3 */             c1859c.getClass();
/* 6 */             jb1.m5747g(encoder);
/* 11 */            j13.m5659u(rh2.f16075a);
/* 24 */            new rt0(vh2.f18183a, n11.f14092a, 1).serialize(encoder, c1859c);
                }
            }
