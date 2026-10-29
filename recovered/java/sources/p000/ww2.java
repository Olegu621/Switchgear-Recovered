            package p000;

            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class ww2 implements KSerializer {

                /* JADX INFO: renamed from: a */
                public static final ww2 f18847a = new ww2();

                /* JADX INFO: renamed from: b */
                public static final xx0 f18848b;

                static {
/* 10 */            la1.f13161a.getClass();
/* 21 */            f18848b = b40.m1217a("kotlin.ULong", sa1.f16487a);
                }

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 13 */            return new sw2(decoder.mo4378z(f18848b).mo4373s());
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 1 */             return f18848b;
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 11 */            encoder.mo1522z(f18848b).mo1485B(((sw2) obj).f16830a);
                }
            }
