            package p000;

            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class ex2 implements KSerializer {

                /* JADX INFO: renamed from: a */
                public static final ex2 f7915a = new ex2();

                /* JADX INFO: renamed from: b */
                public static final xx0 f7916b;

                static {
/* 10 */            td2.f17051a.getClass();
/* 21 */            f7916b = b40.m1217a("kotlin.UShort", ud2.f17475a);
                }

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 13 */            return new ax2(decoder.mo4378z(f7916b).mo4352C());
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 1 */             return f7916b;
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 11 */            encoder.mo1522z(f7916b).mo1504h(((ax2) obj).f2138a);
                }
            }
