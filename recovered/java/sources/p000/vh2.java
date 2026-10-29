            package p000;

            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class vh2 implements KSerializer {

                /* JADX INFO: renamed from: a */
                public static final vh2 f18183a = new vh2();

                /* JADX INFO: renamed from: b */
                public static final kx1 f18184b = new kx1("kotlin.String", gx1.f8844s);

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 1 */             return decoder.mo4372r();
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 1 */             return f18184b;
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 1 */             String str = (String) obj;
/* 3 */             str.getClass();
/* 6 */             encoder.mo1489F(str);
                }
            }
