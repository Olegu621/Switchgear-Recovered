            package p000;

            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Encoder;
            import kotlinx.serialization.json.AbstractC1858b;
            import kotlinx.serialization.json.C1857a;
            import kotlinx.serialization.json.C1859c;
            import kotlinx.serialization.json.JsonNull;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 43 */    public class c21 implements p11, Encoder, InterfaceC1907ly {

                /* JADX INFO: renamed from: a */
                public final ArrayList f2657a;

                /* JADX INFO: renamed from: b */
                public final b11 f2658b;

                /* JADX INFO: renamed from: c */
                public final Function1 f2659c;

                /* JADX INFO: renamed from: d */
                public final wl0 f2660d;

                /* JADX INFO: renamed from: e */
                public String f2661e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ int f2662f;

                /* JADX INFO: renamed from: g */
                public Object f2663g;

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public c21(b11 b11Var, Function1 function1, int i) {
/* 7 */             this(b11Var, function1, (char) 0);
/* 1 */             this.f2662f = i;
                    switch (i) {
                        case 1:
/* 28 */                    b11Var.getClass();
/* 31 */                    function1.getClass();
/* 34 */                    this(b11Var, function1, (char) 0);
/* 42 */                    this.f2663g = new LinkedHashMap();
                            break;
                        case 2:
/* 11 */                    b11Var.getClass();
/* 14 */                    function1.getClass();
/* 17 */                    this(b11Var, function1, (char) 0);
/* 25 */                    this.f2663g = new ArrayList();
                            break;
                        default:
                            break;
                    }
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: A */
                public final void mo1484A(KSerializer kSerializer, Object obj) {
/* 1 */             kSerializer.getClass();
/* 6 */             Object objM6205z = CollectionsKt.m6205z(this.f2657a);
/* 10 */            b11 b11Var = this.f2658b;
/* 12 */            if (objM6205z == null) {
/* 20 */                SerialDescriptor serialDescriptorM7890a = qj3.m7890a(kSerializer.getDescriptor(), b11Var.f2163b);
/* 30 */                if ((serialDescriptorM7890a.mo134e() instanceof gx1) || serialDescriptorM7890a.mo134e() == ca2.f2798k) {
/* 42 */                    Function1 function1 = this.f2659c;
/* 44 */                    function1.getClass();
/* 48 */                    c21 c21Var = new c21(b11Var, function1, 0);
/* 55 */                    c21Var.f2657a.add("primitive");
/* 58 */                    c21Var.mo1484A(kSerializer, obj);
/* 65 */                    kSerializer.getDescriptor().getClass();
/* 74 */                    c21Var.f2659c.invoke(c21Var.mo1493J());
/* 77 */                    return;
                        }
                    }
/* 80 */            if (!(kSerializer instanceof mt1)) {
/* 121 */               kSerializer.serialize(this, obj);
/* 124 */               return;
                    }
/* 82 */            wl0 wl0Var = b11Var.f2162a;
/* 85 */            mt1 mt1Var = (mt1) kSerializer;
/* 93 */            String strM7589L = py0.m7589L(b11Var, ((mt1) kSerializer).getDescriptor());
/* 97 */            obj.getClass();
/* 100 */           KSerializer kSerializerM5756p = jb1.m5756p(mt1Var, this, obj);
/* 112 */           py0.m7588K(kSerializerM5756p.getDescriptor().mo134e());
/* 115 */           this.f2661e = strM7589L;
/* 117 */           kSerializerM5756p.serialize(this, obj);
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: B */
                public final void mo1485B(long j) {
/* 5 */             String str = (String) m1495L();
/* 7 */             str.getClass();
/* 18 */            mo1496M(str, py0.m7584G(Long.valueOf(j)));
                }

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: C */
                public final Encoder mo1486C(cx1 cx1Var, int i) {
/* 1 */             cx1Var.getClass();
/* 4 */             String strM1494K = m1494K(cx1Var, i);
/* 8 */             SerialDescriptor serialDescriptorMo138i = cx1Var.mo138i(i);
/* 12 */            serialDescriptorMo138i.getClass();
/* 19 */            if (qh2.m7852a(serialDescriptorMo138i)) {
/* 23 */                return new C2052p(this, strM1494K);
                    }
/* 29 */            this.f2657a.add(strM1494K);
/* 32 */            return this;
                }

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: D */
                public final void mo1487D(SerialDescriptor serialDescriptor, int i, long j) {
/* 1 */             serialDescriptor.getClass();
/* 16 */            mo1496M(m1494K(serialDescriptor, i), py0.m7584G(Long.valueOf(j)));
                }

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: E */
                public final boolean mo1488E(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 6 */             return this.f2660d.f18680b;
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: F */
                public final void mo1489F(String str) {
/* 1 */             str.getClass();
/* 8 */             String str2 = (String) m1495L();
/* 10 */            str2.getClass();
/* 17 */            mo1496M(str2, py0.m7585H(str));
                }

                /* JADX INFO: renamed from: G */
                public final void m1490G(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             kSerializer.getClass();
/* 13 */            this.f2657a.add(m1494K(serialDescriptor, i));
/* 24 */            if (kSerializer.getDescriptor().mo132c()) {
/* 26 */                mo1484A(kSerializer, obj);
                    } else if (obj == null) {
/* 32 */                mo1502f();
                    } else {
/* 36 */                mo1484A(kSerializer, obj);
                    }
                }

                /* JADX INFO: renamed from: H */
                public final void m1491H(Object obj, double d) {
/* 1 */             String str = (String) obj;
/* 3 */             str.getClass();
/* 14 */            mo1496M(str, py0.m7584G(Double.valueOf(d)));
/* 19 */            this.f2660d.getClass();
/* 26 */            if (Double.isInfinite(d) || Double.isNaN(d)) {
/* 35 */                Double dValueOf = Double.valueOf(d);
/* 43 */                String string = mo1493J().toString();
/* 47 */                string.getClass();
/* 59 */                throw new l11(kb1.m6045U(dValueOf, str, string));
                    }
                }

                /* JADX INFO: renamed from: I */
                public final void m1492I(Object obj, float f) {
/* 1 */             String str = (String) obj;
/* 3 */             str.getClass();
/* 14 */            mo1496M(str, py0.m7584G(Float.valueOf(f)));
/* 19 */            this.f2660d.getClass();
/* 26 */            if (Float.isInfinite(f) || Float.isNaN(f)) {
/* 35 */                Float fValueOf = Float.valueOf(f);
/* 43 */                String string = mo1493J().toString();
/* 47 */                string.getClass();
/* 59 */                throw new l11(kb1.m6045U(fValueOf, str, string));
                    }
                }

                /* JADX INFO: renamed from: J */
                public AbstractC1858b mo1493J() {
                    switch (this.f2662f) {
                        case 0:
/* 28 */                    AbstractC1858b abstractC1858b = (AbstractC1858b) this.f2663g;
/* 30 */                    if (abstractC1858b != null) {
/* 39 */                        return abstractC1858b;
                            }
/* 35 */                    C1951n4.m6859j("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
/* 38 */                    return null;
                        case 1:
/* 22 */                    return new C1859c((LinkedHashMap) this.f2663g);
                        default:
/* 12 */                    return new C1857a((ArrayList) this.f2663g);
                    }
                }

                /* JADX INFO: renamed from: K */
                public final String m1494K(SerialDescriptor serialDescriptor, int i) {
                    String strValueOf;
/* 1 */             serialDescriptor.getClass();
/* 4 */             int i2 = this.f2662f;
/* 6 */             serialDescriptor.getClass();
                    switch (i2) {
                        case 2:
/* 17 */                    strValueOf = String.valueOf(i);
                            break;
                        default:
/* 12 */                    strValueOf = serialDescriptor.mo136g(i);
                            break;
                    }
/* 21 */            strValueOf.getClass();
/* 32 */            return strValueOf;
                }

                /* JADX INFO: renamed from: L */
                public final Object m1495L() {
/* 1 */             ArrayList arrayList = this.f2657a;
/* 7 */             if (arrayList.isEmpty()) {
/* 25 */                throw new ea2("No tag in stack for requested element");
                    }
/* 13 */            return arrayList.remove(C2085pw.m7565d(arrayList));
                }

                /* JADX INFO: renamed from: M */
                public void mo1496M(String str, AbstractC1858b abstractC1858b) {
/* 1 */             int i = this.f2662f;
/* 3 */             str.getClass();
/* 6 */             abstractC1858b.getClass();
                    switch (i) {
                        case 0:
/* 34 */                    if (str != "primitive") {
/* 53 */                        C1951n4.m6859j("This output can only consume primitives with 'primitive' tag");
                            } else if (((AbstractC1858b) this.f2663g) != null) {
/* 47 */                        C1951n4.m6859j("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                            } else {
/* 42 */                        this.f2663g = abstractC1858b;
                            }
                            break;
                        case 1:
/* 28 */                    ((LinkedHashMap) this.f2663g).put(str, abstractC1858b);
                            break;
                        default:
/* 20 */                    ((ArrayList) this.f2663g).add(Integer.parseInt(str), abstractC1858b);
                            break;
                    }
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: a */
                public final C0168b5 mo1497a() {
/* 3 */             return this.f2658b.f2163b;
                }

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: b */
                public final void mo1498b(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 10 */            if (!this.f2657a.isEmpty()) {
/* 12 */                m1495L();
                    }
/* 21 */            this.f2659c.invoke(mo1493J());
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: c */
                public final InterfaceC1907ly mo1499c(SerialDescriptor serialDescriptor) {
                    c21 c21Var;
/* 1 */             serialDescriptor.getClass();
/* 18 */            Function1 c1983o = CollectionsKt.m6205z(this.f2657a) == null ? this.f2659c : new C1983o(this, 0);
/* 21 */            py0 py0VarMo134e = serialDescriptor.mo134e();
/* 36 */            boolean z = Intrinsics.m6216a(py0VarMo134e, ei2.f7699l) ? true : py0VarMo134e instanceof lt1;
/* 38 */            b11 b11Var = this.f2658b;
/* 40 */            if (z) {
/* 45 */                c21Var = new c21(b11Var, c1983o, 2);
                    } else if (Intrinsics.m6216a(py0VarMo134e, ei2.f7700m)) {
/* 63 */                SerialDescriptor serialDescriptorM7890a = qj3.m7890a(serialDescriptor.mo138i(0), b11Var.f2163b);
/* 67 */                py0 py0VarMo134e2 = serialDescriptorM7890a.mo134e();
/* 73 */                if (!(py0VarMo134e2 instanceof gx1) && !Intrinsics.m6216a(py0VarMo134e2, ca2.f2798k)) {
/* 88 */                    throw kb1.m6049b(serialDescriptorM7890a);
                        }
/* 91 */                c1983o.getClass();
/* 94 */                h21 h21Var = new h21(b11Var, c1983o, 1);
/* 97 */                h21Var.f8872i = true;
                        c21Var = h21Var;
                    } else {
/* 102 */               c21Var = new c21(b11Var, c1983o, 1);
                    }
/* 105 */           String str = this.f2661e;
/* 107 */           if (str != null) {
/* 117 */               c21Var.mo1496M(str, py0.m7585H(serialDescriptor.mo130a()));
/* 121 */               this.f2661e = null;
                    }
/* 123 */           return c21Var;
                }

                @Override // p000.p11
                /* JADX INFO: renamed from: d */
                public final b11 mo1500d() {
/* 1 */             return this.f2658b;
                }

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: e */
                public final void mo1501e(cx1 cx1Var, int i, double d) {
/* 1 */             cx1Var.getClass();
/* 8 */             m1491H(m1494K(cx1Var, i), d);
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: f */
                public final void mo1502f() {
/* 7 */             String str = (String) CollectionsKt.m6205z(this.f2657a);
/* 9 */             if (str == null) {
/* 15 */                this.f2659c.invoke(JsonNull.f12961a);
                    } else {
/* 21 */                mo1496M(str, JsonNull.f12961a);
                    }
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: g */
                public final void mo1503g(double d) {
/* 5 */             m1491H(m1495L(), d);
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: h */
                public final void mo1504h(short s) {
/* 5 */             String str = (String) m1495L();
/* 7 */             str.getClass();
/* 18 */            mo1496M(str, py0.m7584G(Short.valueOf(s)));
                }

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: i */
                public final void mo1505i(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             kSerializer.getClass();
/* 13 */            this.f2657a.add(m1494K(serialDescriptor, i));
/* 16 */            mo1484A(kSerializer, obj);
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: j */
                public final void mo1506j(byte b) {
/* 5 */             String str = (String) m1495L();
/* 7 */             str.getClass();
/* 18 */            mo1496M(str, py0.m7584G(Byte.valueOf(b)));
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: k */
                public final void mo1507k(boolean z) {
/* 5 */             String str = (String) m1495L();
/* 7 */             str.getClass();
/* 20 */            mo1496M(str, new s11(Boolean.valueOf(z), false));
                }

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: l */
                public final void mo1508l(int i, int i2, SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 16 */            mo1496M(m1494K(serialDescriptor, i), py0.m7584G(Integer.valueOf(i2)));
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: m */
                public final void mo1509m(float f) {
/* 5 */             m1492I(m1495L(), f);
                }

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: n */
                public final void mo1510n(cx1 cx1Var, int i, byte b) {
/* 1 */             cx1Var.getClass();
/* 16 */            mo1496M(m1494K(cx1Var, i), py0.m7584G(Byte.valueOf(b)));
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: o */
                public final void mo1511o(char c) {
/* 5 */             String str = (String) m1495L();
/* 7 */             str.getClass();
/* 18 */            mo1496M(str, py0.m7585H(String.valueOf(c)));
                }

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: p */
                public final void mo1512p(cx1 cx1Var, int i, float f) {
/* 1 */             cx1Var.getClass();
/* 8 */             m1492I(m1494K(cx1Var, i), f);
                }

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: q */
                public final void mo1513q(SerialDescriptor serialDescriptor, int i, boolean z) {
/* 1 */             serialDescriptor.getClass();
/* 18 */            mo1496M(m1494K(serialDescriptor, i), new s11(Boolean.valueOf(z), false));
                }

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: r */
                public final void mo1514r(SerialDescriptor serialDescriptor, int i, String str) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             str.getClass();
/* 15 */            mo1496M(m1494K(serialDescriptor, i), py0.m7585H(str));
                }

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: s */
                public void mo1515s(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
                    switch (this.f2662f) {
                        case 1:
/* 10 */                    serialDescriptor.getClass();
/* 13 */                    kSerializer.getClass();
/* 16 */                    if (obj == null) {
/* 20 */                        this.f2660d.getClass();
                            }
/* 23 */                    m1490G(serialDescriptor, i, kSerializer, obj);
                            break;
                        default:
/* 6 */                     m1490G(serialDescriptor, i, kSerializer, obj);
                            break;
                    }
                }

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: t */
                public final void mo1516t(cx1 cx1Var, int i, short s) {
/* 1 */             cx1Var.getClass();
/* 16 */            mo1496M(m1494K(cx1Var, i), py0.m7584G(Short.valueOf(s)));
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: u */
                public final InterfaceC1907ly mo1517u(SerialDescriptor serialDescriptor, int i) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             return mo1499c(serialDescriptor);
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: v */
                public final void mo1518v(SerialDescriptor serialDescriptor, int i) {
/* 1 */             serialDescriptor.getClass();
/* 8 */             String str = (String) m1495L();
/* 10 */            str.getClass();
/* 21 */            mo1496M(str, py0.m7585H(serialDescriptor.mo136g(i)));
                }

                @Override // p000.p11
                /* JADX INFO: renamed from: w */
                public final void mo1519w(AbstractC1858b abstractC1858b) {
/* 1 */             abstractC1858b.getClass();
/* 6 */             mo1484A(n11.f14092a, abstractC1858b);
                }

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: x */
                public final void mo1520x(cx1 cx1Var, int i, char c) {
/* 1 */             cx1Var.getClass();
/* 16 */            mo1496M(m1494K(cx1Var, i), py0.m7585H(String.valueOf(c)));
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: y */
                public final void mo1521y(int i) {
/* 5 */             String str = (String) m1495L();
/* 7 */             str.getClass();
/* 18 */            mo1496M(str, py0.m7584G(Integer.valueOf(i)));
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: z */
                public final Encoder mo1522z(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 8 */             String str = (String) m1495L();
/* 10 */            str.getClass();
/* 17 */            if (qh2.m7852a(serialDescriptor)) {
/* 21 */                return new C2052p(this, str);
                    }
/* 27 */            this.f2657a.add(str);
/* 30 */            return this;
                }

/* 44 */        public c21(b11 b11Var, Function1 function1, char c) {
/* 46 */            this.f2657a = new ArrayList();
/* 47 */            this.f2658b = b11Var;
/* 48 */            this.f2659c = function1;
/* 50 */            this.f2660d = b11Var.f2162a;
                }
            }
