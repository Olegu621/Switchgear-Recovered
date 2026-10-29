            package p000;

            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            import kotlinx.serialization.json.AbstractC1858b;
            import kotlinx.serialization.json.AbstractC1860d;
            import kotlinx.serialization.json.JsonNull;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class d21 implements KSerializer {

                /* JADX INFO: renamed from: a */
                public static final d21 f6963a = new d21();

                /* JADX INFO: renamed from: b */
                public static final aa2 f6964b = hu0.m4322L("kotlinx.serialization.json.JsonPrimitive", gx1.f8844s, new SerialDescriptor[0]);

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 5 */             AbstractC1858b abstractC1858bMo5635m = jb1.m5746f(decoder).mo5635m();
/* 11 */            if (abstractC1858bMo5635m instanceof AbstractC1860d) {
/* 13 */                return (AbstractC1860d) abstractC1858bMo5635m;
                    }
/* 47 */            throw kb1.m6051d("Unexpected JSON element, expected JsonPrimitive, had " + j22.m5667a(abstractC1858bMo5635m.getClass()), abstractC1858bMo5635m.toString(), -1);
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 1 */             return f6964b;
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 1 */             AbstractC1860d abstractC1860d = (AbstractC1860d) obj;
/* 3 */             abstractC1860d.getClass();
/* 6 */             jb1.m5747g(encoder);
/* 11 */            if (abstractC1860d instanceof JsonNull) {
/* 17 */                encoder.mo1484A(x11.f18900a, JsonNull.f12961a);
                    } else {
/* 25 */                encoder.mo1484A(t11.f16894a, (s11) abstractC1860d);
                    }
                }
            }
