            package p000;

            import java.util.Map;
            import kotlin.Pair;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 47 */    public final class ec1 implements KSerializer {

                /* JADX INFO: renamed from: a */
                public final KSerializer f7618a;

                /* JADX INFO: renamed from: b */
                public final KSerializer f7619b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f7620c;

                /* JADX INFO: renamed from: d */
                public final aa2 f7621d;

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public ec1(KSerializer kSerializer, KSerializer kSerializer2, int i) {
/* 7 */             this(kSerializer, kSerializer2, (byte) 0);
/* 1 */             this.f7620c = i;
                    switch (i) {
                        case 1:
/* 28 */                    this(kSerializer, kSerializer2, (byte) 0);
/* 45 */                    this.f7621d = hu0.m4318J("kotlin.Pair", new SerialDescriptor[0], new dc1(kSerializer, kSerializer2, 1));
                            break;
                        default:
/* 25 */                    this.f7621d = hu0.m4320K("kotlin.collections.Map.Entry", ei2.f7700m, new SerialDescriptor[0], new dc1(kSerializer, kSerializer2, 0));
                            break;
                    }
                }

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 1 */             Object obj = py0.f15333g;
/* 7 */             InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(getDescriptor());
/* 11 */            Object objMo4350A = obj;
/* 12 */            Object objMo4350A2 = objMo4350A;
                    while (true) {
/* 17 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(getDescriptor());
/* 22 */                if (iMo3299x == -1) {
/* 69 */                    interfaceC1870kyMo3297c.mo3296b(getDescriptor());
/* 72 */                    if (objMo4350A == obj) {
/* 108 */                       throw new ea2("Element 'key' is missing");
                            }
/* 74 */                    if (objMo4350A2 == obj) {
/* 100 */                       throw new ea2("Element 'value' is missing");
                            }
                            switch (this.f7620c) {
                                case 0:
/* 89 */                            return new cc1(objMo4350A, objMo4350A2);
                                default:
/* 83 */                            return new Pair(objMo4350A, objMo4350A2);
                            }
                        }
/* 25 */                if (iMo3299x == 0) {
/* 60 */                    objMo4350A = interfaceC1870kyMo3297c.mo4350A(getDescriptor(), 0, this.f7618a, null);
                        } else {
/* 28 */                    if (iMo3299x != 1) {
/* 52 */                        throw new ea2(fm0.m3781g(iMo3299x, "Invalid index: "));
                            }
/* 36 */                    objMo4350A2 = interfaceC1870kyMo3297c.mo4350A(getDescriptor(), 1, this.f7619b, null);
                        }
                    }
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
                    switch (this.f7620c) {
                        case 0:
                            break;
                    }
/* 6 */             return this.f7621d;
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
                    Object key;
                    Object value;
/* 5 */             InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(getDescriptor());
/* 9 */             SerialDescriptor descriptor = getDescriptor();
/* 13 */            int i = this.f7620c;
                    switch (i) {
                        case 0:
/* 28 */                    Map.Entry entry = (Map.Entry) obj;
/* 30 */                    entry.getClass();
/* 33 */                    key = entry.getKey();
                            break;
                        default:
/* 19 */                    Pair pair = (Pair) obj;
/* 21 */                    pair.getClass();
/* 24 */                    key = pair.f12908a;
                            break;
                    }
/* 40 */            interfaceC1907lyMo1499c.mo1505i(descriptor, 0, this.f7618a, key);
/* 43 */            SerialDescriptor descriptor2 = getDescriptor();
                    switch (i) {
                        case 0:
/* 58 */                    Map.Entry entry2 = (Map.Entry) obj;
/* 60 */                    entry2.getClass();
/* 63 */                    value = entry2.getValue();
                            break;
                        default:
/* 50 */                    Pair pair2 = (Pair) obj;
/* 52 */                    pair2.getClass();
/* 55 */                    value = pair2.f12909b;
                            break;
                    }
/* 70 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 1, this.f7619b, value);
/* 77 */            interfaceC1907lyMo1499c.mo1498b(getDescriptor());
                }

/* 48 */        public ec1(KSerializer kSerializer, KSerializer kSerializer2, byte b) {
/* 50 */            this.f7618a = kSerializer;
/* 51 */            this.f7619b = kSerializer2;
                }
            }
