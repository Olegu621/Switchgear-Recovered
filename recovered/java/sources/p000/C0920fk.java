            package p000;

            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: renamed from: fk */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C0920fk implements KSerializer {

                /* JADX INFO: renamed from: a */
                public static final C0920fk f8246a = new C0920fk();

                /* JADX INFO: renamed from: b */
                public static final kx1 f8247b = new kx1("kotlin.Boolean", gx1.f8836k);

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 5 */             return Boolean.valueOf(decoder.mo4360f());
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 1 */             return f8247b;
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 7 */             encoder.mo1507k(((Boolean) obj).booleanValue());
                }
            }
