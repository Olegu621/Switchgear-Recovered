            package p000;

            import java.util.List;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class ci1 implements KSerializer {

                /* JADX INFO: renamed from: a */
                public final kx1 f2929a;

                public ci1() {
/* 6 */             j13.m5658t(ty0.f17302a);
/* 11 */            this.f2929a = az0.f2144b;
                }

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
                    Object n42Var;
                    try {
/* 1 */                 m42 m42Var = o42.f14612b;
/* 7 */                 n42Var = Integer.valueOf(decoder.mo4369o());
                    } catch (Throwable th) {
/* 13 */                m42 m42Var2 = o42.f14612b;
/* 17 */                n42Var = new n42(th);
                    }
/* 25 */            if (o42.m7099a(n42Var) == null) {
/* 45 */                return n42Var;
                    }
/* 30 */            j13.m5658t(ty0.f17302a);
/* 41 */            return decoder.mo4375u(new C0950gd(az0.f2143a, 0));
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 1 */             return this.f2929a;
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 1 */             obj.getClass();
/* 6 */             if (obj instanceof Integer) {
/* 10 */                j13.m5658t(ty0.f17302a);
/* 15 */                encoder.mo1484A(az0.f2143a, obj);
                    } else if (!(obj instanceof List)) {
/* 44 */                f42.m3656l("Unexpected vendors array serialization");
                    } else {
/* 25 */                j13.m5658t(ty0.f17302a);
/* 38 */                encoder.mo1484A(new C0950gd(az0.f2143a, 0), (List) obj);
                    }
                }
            }
