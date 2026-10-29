            package p000;

            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class xs2 implements KSerializer {

                /* JADX INFO: renamed from: a */
                public static final xs2 f19353a = new xs2();

                /* JADX INFO: renamed from: b */
                public static final xx0 f19354b;

                static {
/* 10 */            C1968nl.f14354a.getClass();
/* 21 */            f19354b = b40.m1217a("kotlin.UByte", C2037ol.f14796a);
                }

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 13 */            return new ts2(decoder.mo4378z(f19354b).mo4351B());
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 1 */             return f19354b;
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 11 */            encoder.mo1522z(f19354b).mo1506j(((ts2) obj).f17252a);
                }
            }
