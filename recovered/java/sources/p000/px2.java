            package p000;

            import kotlin.Unit;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class px2 implements KSerializer {

                /* JADX INFO: renamed from: b */
                public static final px2 f15326b = new px2();

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ep1 f15327a = new ep1(Unit.f12910a);

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 3 */             this.f15327a.deserialize(decoder);
/* 6 */             return Unit.f12910a;
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 3 */             return this.f15327a.getDescriptor();
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 1 */             Unit unit = (Unit) obj;
/* 3 */             unit.getClass();
/* 8 */             this.f15327a.serialize(encoder, unit);
                }
            }
