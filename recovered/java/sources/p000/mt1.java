            package p000;

            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mt1 implements KSerializer {

                /* JADX INFO: renamed from: a */
                public final C0857dv f14021a;

                /* JADX INFO: renamed from: b */
                public final nd0 f14022b = nd0.f14189a;

                /* JADX INFO: renamed from: c */
                public final p51 f14023c = r51.m8064a(v51.f17865a, new C0908f8(this, 5));

                public mt1(C0857dv c0857dv) {
/* 4 */             this.f14021a = c0857dv;
                }

                /* JADX INFO: renamed from: a */
                public final KSerializer m6800a(InterfaceC1870ky interfaceC1870ky, String str) {
/* 1 */             C0168b5 c0168b5Mo5933a = interfaceC1870ky.mo5933a();
/* 5 */             c0168b5Mo5933a.getClass();
/* 10 */            Map map = (Map) c0168b5Mo5933a.f2214e;
/* 12 */            C0857dv c0857dv = this.f14021a;
/* 18 */            Map map2 = (Map) map.get(c0857dv);
/* 30 */            KSerializer kSerializer = map2 != null ? (KSerializer) map2.get(str) : null;
/* 31 */            if (kSerializer == null) {
/* 34 */                kSerializer = null;
                    }
/* 35 */            if (kSerializer != null) {
/* 37 */                return kSerializer;
                    }
/* 42 */            Object obj = ((Map) c0168b5Mo5933a.f2215f).get(c0857dv);
/* 56 */            Function1 function1 = gs2.m4012c(1, obj) ? (Function1) obj : null;
/* 57 */            if (function1 != null) {
/* 63 */                return (KSerializer) function1.invoke(str);
                    }
/* 20 */            return null;
                }

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 1 */             SerialDescriptor descriptor = getDescriptor();
/* 5 */             InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor);
/* 11 */            h22 h22Var = new h22();
/* 15 */            Object objMo4350A = null;
                    while (true) {
/* 20 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(getDescriptor());
/* 25 */                if (iMo3299x == -1) {
/* 112 */                   if (objMo4350A != null) {
/* 114 */                       interfaceC1870kyMo3297c.mo3296b(descriptor);
/* 117 */                       return objMo4350A;
                            }
/* 124 */                   C1951n4.m6867r((String) h22Var.f8873a, "Polymorphic value has not been read for class ");
/* 14 */                    return null;
                        }
/* 27 */                if (iMo3299x != 0) {
/* 29 */                    Object obj = h22Var.f8873a;
/* 32 */                    if (iMo3299x != 1) {
/* 40 */                        StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
/* 43 */                        String str = (String) obj;
/* 45 */                        if (str == null) {
/* 47 */                            str = "unknown class";
                                }
/* 49 */                        sb.append(str);
/* 54 */                        sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
/* 57 */                        sb.append(iMo3299x);
/* 67 */                        throw new ea2(sb.toString());
                            }
/* 68 */                    if (obj == null) {
/* 97 */                        C1951n4.m6859j("Cannot read polymorphic value before its type token");
/* 14 */                        return null;
                            }
/* 70 */                    h22Var.f8873a = obj;
/* 72 */                    String str2 = (String) obj;
/* 74 */                    KSerializer kSerializerM6800a = m6800a(interfaceC1870kyMo3297c, str2);
/* 78 */                    if (kSerializerM6800a == null) {
/* 91 */                        kb1.m6043S(str2, this.f14021a);
/* 94 */                        throw null;
                            }
/* 84 */                    objMo4350A = interfaceC1870kyMo3297c.mo4350A(getDescriptor(), iMo3299x, kSerializerM6800a, null);
                        } else {
/* 109 */                   h22Var.f8873a = interfaceC1870kyMo3297c.mo4376v(getDescriptor(), iMo3299x);
                        }
                    }
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 7 */             return (SerialDescriptor) this.f14023c.getValue();
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 1 */             obj.getClass();
/* 4 */             KSerializer kSerializerM5756p = jb1.m5756p(this, encoder, obj);
/* 8 */             SerialDescriptor descriptor = getDescriptor();
/* 12 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor);
/* 29 */            interfaceC1907lyMo1499c.mo1514r(getDescriptor(), 0, kSerializerM5756p.getDescriptor().mo130a());
/* 37 */            interfaceC1907lyMo1499c.mo1505i(getDescriptor(), 1, kSerializerM5756p, obj);
/* 40 */            interfaceC1907lyMo1499c.mo1498b(descriptor);
                }

                public final String toString() {
/* 18 */            return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f14021a + ')';
                }
            }
