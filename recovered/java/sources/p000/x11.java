            package p000;

            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            import kotlinx.serialization.json.JsonNull;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class x11 implements KSerializer {

                /* JADX INFO: renamed from: a */
                public static final x11 f18900a = new x11();

                /* JADX INFO: renamed from: b */
                public static final aa2 f18901b = hu0.m4322L("kotlinx.serialization.json.JsonNull", ca2.f2798k, new SerialDescriptor[0]);

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 1 */             jb1.m5746f(decoder);
/* 8 */             if (decoder.mo3298w()) {
/* 20 */                throw new l11("Expected 'null' literal");
                    }
/* 10 */            return JsonNull.f12961a;
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 1 */             return f18901b;
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 3 */             ((JsonNull) obj).getClass();
/* 6 */             jb1.m5747g(encoder);
/* 9 */             encoder.mo1502f();
                }
            }
