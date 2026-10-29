            package p000;

            import io.sentry.C1697u2;
            import java.util.Arrays;
            import java.util.List;
            import java.util.Map;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 42 */    public final class b10 implements KSerializer {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2156a;

                /* JADX INFO: renamed from: b */
                public final KSerializer f2157b;

                /* JADX INFO: renamed from: c */
                public final Object f2158c;

                /* JADX INFO: renamed from: d */
                public final Object f2159d;

                /* JADX INFO: renamed from: e */
                public final SerialDescriptor f2160e;

                public b10(C0857dv c0857dv, KSerializer kSerializer, KSerializer[] kSerializerArr) {
/* 2 */             this.f2156a = 0;
/* 7 */             this.f2158c = c0857dv;
/* 9 */             this.f2157b = kSerializer;
/* 11 */            List listAsList = Arrays.asList(kSerializerArr);
/* 15 */            listAsList.getClass();
/* 18 */            this.f2159d = listAsList;
/* 41 */            this.f2160e = new x00(hu0.m4320K("kotlinx.serialization.ContextualSerializer", ba2.f2339k, new SerialDescriptor[0], new C1983o(this, 5)), c0857dv);
                }

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 1 */             int i = this.f2156a;
/* 3 */             KSerializer kSerializer = this.f2157b;
/* 5 */             Object obj = this.f2158c;
/* 7 */             Object obj2 = this.f2159d;
                    switch (i) {
                        case 0:
/* 114 */                   C0168b5 c0168b5Mo5933a = decoder.mo5933a();
/* 122 */                   c0168b5Mo5933a.getClass();
/* 125 */                   ((List) obj2).getClass();
/* 136 */                   if (((Map) c0168b5Mo5933a.f2211b).get((C0857dv) obj) == null) {
/* 138 */                       return decoder.mo4375u(kSerializer);
                            }
/* 143 */                   C1697u2.m5431g();
/* 9 */                     return null;
                        default:
/* 15 */                    aa2 aa2Var = (aa2) this.f2160e;
/* 17 */                    InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(aa2Var);
/* 21 */                    Object obj3 = py0.f15333g;
/* 23 */                    Object objMo4350A = obj3;
/* 24 */                    Object objMo4350A2 = objMo4350A;
/* 25 */                    Object objMo4350A3 = objMo4350A2;
                            while (true) {
/* 26 */                        int iMo3299x = interfaceC1870kyMo3297c.mo3299x(aa2Var);
/* 31 */                        if (iMo3299x == -1) {
/* 75 */                            interfaceC1870kyMo3297c.mo3296b(aa2Var);
/* 78 */                            if (objMo4350A == obj3) {
/* 113 */                               throw new ea2("Element 'first' is missing");
                                    }
/* 80 */                            if (objMo4350A2 == obj3) {
/* 105 */                               throw new ea2("Element 'second' is missing");
                                    }
/* 82 */                            if (objMo4350A3 != obj3) {
/* 86 */                                return new zr2(objMo4350A, objMo4350A2, objMo4350A3);
                                    }
/* 97 */                            throw new ea2("Element 'third' is missing");
                                }
/* 33 */                        if (iMo3299x == 0) {
/* 70 */                            objMo4350A = interfaceC1870kyMo3297c.mo4350A(aa2Var, 0, kSerializer, null);
                                } else if (iMo3299x == 1) {
/* 64 */                            objMo4350A2 = interfaceC1870kyMo3297c.mo4350A(aa2Var, 1, (KSerializer) obj, null);
                                } else {
/* 39 */                            if (iMo3299x != 2) {
/* 60 */                                throw new ea2(fm0.m3781g(iMo3299x, "Unexpected index "));
                                    }
/* 44 */                            objMo4350A3 = interfaceC1870kyMo3297c.mo4350A(aa2Var, 2, (KSerializer) obj2, null);
                                }
                            }
                            break;
                    }
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
                    switch (this.f2156a) {
                        case 0:
/* 13 */                    return (x00) this.f2160e;
                        default:
/* 8 */                     return (aa2) this.f2160e;
                    }
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 1 */             int i = this.f2156a;
/* 3 */             Object obj2 = this.f2159d;
/* 5 */             Object obj3 = this.f2158c;
/* 7 */             KSerializer kSerializer = this.f2157b;
                    switch (i) {
                        case 0:
/* 51 */                    obj.getClass();
/* 54 */                    C0168b5 c0168b5Mo1497a = encoder.mo1497a();
/* 62 */                    c0168b5Mo1497a.getClass();
/* 65 */                    ((List) obj2).getClass();
/* 76 */                    if (((Map) c0168b5Mo1497a.f2211b).get((C0857dv) obj3) != null) {
/* 82 */                        C1697u2.m5431g();
                            } else {
/* 78 */                        encoder.mo1484A(kSerializer, obj);
                            }
                            break;
                        default:
/* 12 */                    zr2 zr2Var = (zr2) obj;
/* 14 */                    zr2Var.getClass();
/* 19 */                    aa2 aa2Var = (aa2) this.f2160e;
/* 21 */                    InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(aa2Var);
/* 28 */                    interfaceC1907lyMo1499c.mo1505i(aa2Var, 0, kSerializer, zr2Var.f20306a);
/* 36 */                    interfaceC1907lyMo1499c.mo1505i(aa2Var, 1, (KSerializer) obj3, zr2Var.f20307b);
/* 44 */                    interfaceC1907lyMo1499c.mo1505i(aa2Var, 2, (KSerializer) obj2, zr2Var.f20308c);
/* 47 */                    interfaceC1907lyMo1499c.mo1498b(aa2Var);
                            break;
                    }
                }

/* 43 */        public b10(KSerializer kSerializer, KSerializer kSerializer2, KSerializer kSerializer3) {
                    this.f2156a = 1;
/* 45 */            this.f2157b = kSerializer;
/* 46 */            this.f2158c = kSerializer2;
/* 47 */            this.f2159d = kSerializer3;
/* 48 */            this.f2160e = hu0.m4318J("kotlin.Triple", new SerialDescriptor[0], new C1983o(this, 20));
                }
            }
