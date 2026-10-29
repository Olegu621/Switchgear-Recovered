            package p000;

            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yx0 implements uq0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ KSerializer f19843a;

                public yx0(KSerializer kSerializer) {
/* 4 */             this.f19843a = kSerializer;
                }

                @Override // p000.uq0
                public final KSerializer[] childSerializers() {
/* 2 */             return new KSerializer[]{this.f19843a};
                }

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 8 */             throw new IllegalStateException("unsupported");
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 8 */             throw new IllegalStateException("unsupported");
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 8 */             throw new IllegalStateException("unsupported");
                }

                @Override // p000.uq0
                public final KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
