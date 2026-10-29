            package p000;

            import kotlin.Unit;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class ep1 implements KSerializer {

                /* JADX INFO: renamed from: a */
                public final Object f7817a;

                /* JADX INFO: renamed from: b */
                public final nd0 f7818b;

                /* JADX INFO: renamed from: c */
                public final p51 f7819c;

                public ep1(Unit unit) {
/* 1 */             unit.getClass();
/* 7 */             this.f7817a = unit;
/* 11 */            this.f7818b = nd0.f14189a;
/* 25 */            this.f7819c = r51.m8064a(v51.f17865a, new C0908f8(this, 4));
                }

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 1 */             SerialDescriptor descriptor = getDescriptor();
/* 5 */             InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor);
/* 13 */            int iMo3299x = interfaceC1870kyMo3297c.mo3299x(getDescriptor());
/* 18 */            if (iMo3299x != -1) {
/* 37 */                throw new ea2(fm0.m3781g(iMo3299x, "Unexpected index "));
                    }
/* 20 */            interfaceC1870kyMo3297c.mo3296b(descriptor);
/* 23 */            return this.f7817a;
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 7 */             return (SerialDescriptor) this.f7819c.getValue();
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 1 */             obj.getClass();
/* 16 */            encoder.mo1499c(getDescriptor()).mo1498b(getDescriptor());
                }
            }
