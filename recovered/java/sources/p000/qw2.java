            package p000;

            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class qw2 implements KSerializer {

                /* JADX INFO: renamed from: a */
                public static final qw2 f15786a = new qw2();

                /* JADX INFO: renamed from: b */
                public static final xx0 f15787b;

                static {
/* 10 */            j13.m5658t(ty0.f17302a);
/* 21 */            f15787b = b40.m1217a("kotlin.UInt", az0.f2143a);
                }

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 13 */            return new mw2(decoder.mo4378z(f15787b).mo4369o());
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 1 */             return f15787b;
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 11 */            encoder.mo1522z(f15787b).mo1521y(((mw2) obj).f14055a);
                }
            }
