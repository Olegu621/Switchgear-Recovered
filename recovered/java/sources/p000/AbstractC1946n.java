            package p000;

            import java.util.ArrayList;
            import java.util.NoSuchElementException;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.json.AbstractC1858b;
            import kotlinx.serialization.json.AbstractC1860d;
            import kotlinx.serialization.json.C1857a;
            import kotlinx.serialization.json.C1859c;
            import kotlinx.serialization.json.JsonNull;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: n */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC1946n implements j11, Decoder, InterfaceC1870ky {

                /* JADX INFO: renamed from: a */
                public final ArrayList f14079a = new ArrayList();

                /* JADX INFO: renamed from: b */
                public boolean f14080b;

                /* JADX INFO: renamed from: c */
                public final b11 f14081c;

                /* JADX INFO: renamed from: d */
                public final wl0 f14082d;

                public AbstractC1946n(b11 b11Var) {
/* 11 */            this.f14081c = b11Var;
/* 15 */            this.f14082d = b11Var.f2162a;
                }

                /* JADX INFO: renamed from: F */
                public static s11 m6836F(AbstractC1860d abstractC1860d, String str) {
/* 8 */             s11 s11Var = abstractC1860d instanceof s11 ? (s11) abstractC1860d : null;
/* 9 */             if (s11Var != null) {
/* 11 */                return s11Var;
                    }
/* 36 */            throw kb1.m6050c(-1, "Unexpected 'null' when " + str + " was expected");
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: A */
                public final Object mo4350A(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             kSerializer.getClass();
/* 7 */             String strM6847S = m6847S(serialDescriptor, i);
/* 14 */            om2 om2Var = new om2(this, kSerializer, obj, 1);
/* 19 */            this.f14079a.add(strM6847S);
/* 22 */            Object objInvoke = om2Var.invoke();
/* 28 */            if (!this.f14080b) {
/* 30 */                m6848U();
                    }
/* 34 */            this.f14080b = false;
/* 36 */            return objInvoke;
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: B */
                public final byte mo4351B() {
/* 5 */             return m6839J(m6848U());
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: C */
                public final short mo4352C() {
/* 5 */             return m6844O(m6848U());
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: D */
                public final float mo4353D() {
/* 5 */             return m6842M(m6848U());
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: E */
                public final double mo4354E() {
/* 5 */             return m6841L(m6848U());
                }

                /* JADX INFO: renamed from: G */
                public abstract AbstractC1858b mo3292G(String str);

                /* JADX INFO: renamed from: H */
                public final AbstractC1858b m6837H() {
                    AbstractC1858b abstractC1858bMo3292G;
/* 7 */             String str = (String) CollectionsKt.m6205z(this.f14079a);
                    return (str == null || (abstractC1858bMo3292G = mo3292G(str)) == null) ? mo3294T() : abstractC1858bMo3292G;
                }

                /* JADX INFO: renamed from: I */
                public final boolean m6838I(Object obj) {
/* 1 */             String str = (String) obj;
/* 3 */             str.getClass();
/* 6 */             AbstractC1860d abstractC1860dM6846R = m6846R(str);
/* 12 */            wl0 wl0Var = this.f14081c.f2162a;
/* 22 */            if (m6836F(abstractC1860dM6846R, "boolean").f16379a) {
/* 71 */                throw kb1.m6051d(fm0.m3784j("Boolean literal for key '", str, "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."), m6837H().toString(), -1);
                    }
                    try {
/* 28 */                Boolean boolM8508b = sh2.m8508b(abstractC1860dM6846R.mo6271a());
/* 32 */                if (boolM8508b != null) {
/* 34 */                    return boolM8508b.booleanValue();
                        }
/* 44 */                throw new IllegalArgumentException();
                    } catch (IllegalArgumentException unused) {
/* 45 */                m6849V("boolean");
/* 49 */                throw null;
                    }
                }

                /* JADX INFO: renamed from: J */
                public final byte m6839J(Object obj) {
/* 1 */             String str = (String) obj;
/* 3 */             str.getClass();
                    try {
/* 17 */                int i = Integer.parseInt(m6846R(str).mo6271a());
/* 35 */                Byte bValueOf = (-128 > i || i > 127) ? null : Byte.valueOf((byte) i);
/* 36 */                if (bValueOf != null) {
/* 38 */                    return bValueOf.byteValue();
                        }
/* 43 */                m6849V("byte");
/* 46 */                throw null;
                    } catch (IllegalArgumentException unused) {
/* 47 */                m6849V("byte");
/* 50 */                throw null;
                    }
                }

                /* JADX INFO: renamed from: K */
                public final char m6840K(Object obj) {
/* 1 */             String str = (String) obj;
/* 3 */             str.getClass();
                    try {
/* 10 */                String strMo6271a = m6846R(str).mo6271a();
/* 14 */                strMo6271a.getClass();
/* 17 */                int length = strMo6271a.length();
/* 21 */                if (length == 0) {
/* 47 */                    throw new NoSuchElementException("Char sequence is empty.");
                        }
/* 24 */                if (length == 1) {
/* 27 */                    return strMo6271a.charAt(0);
                        }
/* 39 */                throw new IllegalArgumentException("Char sequence has more than one element.");
                    } catch (IllegalArgumentException unused) {
/* 50 */                m6849V("char");
/* 54 */                throw null;
                    }
                }

                /* JADX INFO: renamed from: L */
                public final double m6841L(Object obj) {
/* 1 */             String str = (String) obj;
/* 3 */             str.getClass();
                    try {
/* 14 */                double d = Double.parseDouble(m6846R(str).mo6271a());
/* 20 */                wl0 wl0Var = this.f14081c.f2162a;
/* 26 */                if (!Double.isInfinite(d) && !Double.isNaN(d)) {
/* 34 */                    return d;
                        }
/* 35 */                Double dValueOf = Double.valueOf(d);
/* 43 */                String string = m6837H().toString();
/* 47 */                string.getClass();
/* 59 */                throw kb1.m6050c(-1, kb1.m6045U(dValueOf, str, string));
                    } catch (IllegalArgumentException unused) {
/* 62 */                m6849V("double");
/* 66 */                throw null;
                    }
                }

                /* JADX INFO: renamed from: M */
                public final float m6842M(Object obj) {
/* 1 */             String str = (String) obj;
/* 3 */             str.getClass();
                    try {
/* 14 */                float f = Float.parseFloat(m6846R(str).mo6271a());
/* 20 */                wl0 wl0Var = this.f14081c.f2162a;
/* 26 */                if (!Float.isInfinite(f) && !Float.isNaN(f)) {
/* 34 */                    return f;
                        }
/* 35 */                Float fValueOf = Float.valueOf(f);
/* 43 */                String string = m6837H().toString();
/* 47 */                string.getClass();
/* 59 */                throw kb1.m6050c(-1, kb1.m6045U(fValueOf, str, string));
                    } catch (IllegalArgumentException unused) {
/* 62 */                m6849V("float");
/* 66 */                throw null;
                    }
                }

                /* JADX INFO: renamed from: N */
                public final Decoder m6843N(Object obj, SerialDescriptor serialDescriptor) {
/* 1 */             String str = (String) obj;
/* 3 */             str.getClass();
/* 6 */             serialDescriptor.getClass();
/* 13 */            if (qh2.m7852a(serialDescriptor)) {
/* 32 */                return new k11(new C1837kn(m6846R(str).mo6271a()), this.f14081c);
                    }
/* 38 */            this.f14079a.add(str);
/* 41 */            return this;
                }

                /* JADX INFO: renamed from: O */
                public final short m6844O(Object obj) {
/* 1 */             String str = (String) obj;
/* 3 */             str.getClass();
                    try {
/* 17 */                int i = Integer.parseInt(m6846R(str).mo6271a());
/* 35 */                Short shValueOf = (-32768 > i || i > 32767) ? null : Short.valueOf((short) i);
/* 36 */                if (shValueOf != null) {
/* 38 */                    return shValueOf.shortValue();
                        }
/* 43 */                m6849V("short");
/* 46 */                throw null;
                    } catch (IllegalArgumentException unused) {
/* 47 */                m6849V("short");
/* 50 */                throw null;
                    }
                }

                /* JADX INFO: renamed from: P */
                public final String m6845P(Object obj) {
/* 1 */             String str = (String) obj;
/* 3 */             str.getClass();
/* 6 */             AbstractC1860d abstractC1860dM6846R = m6846R(str);
/* 12 */            wl0 wl0Var = this.f14081c.f2162a;
/* 23 */            if (!m6836F(abstractC1860dM6846R, "string").f16379a) {
/* 69 */                throw kb1.m6051d(fm0.m3784j("String literal for key '", str, "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."), m6837H().toString(), -1);
                    }
/* 27 */            if (abstractC1860dM6846R instanceof JsonNull) {
/* 48 */                throw kb1.m6051d("Unexpected 'null' value instead of string literal", m6837H().toString(), -1);
                    }
/* 29 */            return abstractC1860dM6846R.mo6271a();
                }

                /* JADX INFO: renamed from: Q */
                public abstract String mo3293Q(SerialDescriptor serialDescriptor, int i);

                /* JADX INFO: renamed from: R */
                public final AbstractC1860d m6846R(String str) {
/* 1 */             str.getClass();
/* 4 */             AbstractC1858b abstractC1858bMo3292G = mo3292G(str);
/* 16 */            AbstractC1860d abstractC1860d = abstractC1858bMo3292G instanceof AbstractC1860d ? (AbstractC1860d) abstractC1858bMo3292G : null;
/* 17 */            if (abstractC1860d != null) {
/* 19 */                return abstractC1860d;
                    }
/* 55 */            throw kb1.m6051d("Expected JsonPrimitive at " + str + ", found " + abstractC1858bMo3292G, m6837H().toString(), -1);
                }

                /* JADX INFO: renamed from: S */
                public final String m6847S(SerialDescriptor serialDescriptor, int i) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             String strMo3293Q = mo3293Q(serialDescriptor, i);
/* 8 */             strMo3293Q.getClass();
/* 19 */            return strMo3293Q;
                }

                /* JADX INFO: renamed from: T */
                public abstract AbstractC1858b mo3294T();

                /* JADX INFO: renamed from: U */
                public final Object m6848U() {
/* 1 */             ArrayList arrayList = this.f14079a;
/* 7 */             Object objRemove = arrayList.remove(C2085pw.m7565d(arrayList));
/* 12 */            this.f14080b = true;
/* 14 */            return objRemove;
                }

                /* JADX INFO: renamed from: V */
                public final void m6849V(String str) {
/* 33 */            throw kb1.m6051d("Failed to parse '" + str + '\'', m6837H().toString(), -1);
                }

                @Override // kotlinx.serialization.encoding.Decoder, p000.InterfaceC1870ky
                /* JADX INFO: renamed from: a */
                public final C0168b5 mo5933a() {
/* 3 */             return this.f14081c.f2163b;
                }

                /* JADX INFO: renamed from: b */
                public void mo3296b(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: c */
                public InterfaceC1870ky mo3297c(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             AbstractC1858b abstractC1858bM6837H = m6837H();
/* 8 */             py0 py0VarMo134e = serialDescriptor.mo134e();
/* 22 */            boolean z = Intrinsics.m6216a(py0VarMo134e, ei2.f7699l) ? true : py0VarMo134e instanceof lt1;
/* 24 */            b11 b11Var = this.f14081c;
/* 33 */            if (z) {
/* 39 */                if (abstractC1858bM6837H instanceof C1857a) {
/* 43 */                    return new f21(b11Var, (C1857a) abstractC1858bM6837H);
                        }
/* 93 */                throw kb1.m6050c(-1, "Expected " + j22.m5667a(C1857a.class) + " as the serialized body of " + serialDescriptor.mo130a() + ", but had " + j22.m5667a(abstractC1858bM6837H.getClass()));
                    }
/* 102 */           if (!Intrinsics.m6216a(py0VarMo134e, ei2.f7700m)) {
/* 198 */               if (abstractC1858bM6837H instanceof C1859c) {
/* 203 */                   return new e21(b11Var, (C1859c) abstractC1858bM6837H, null, null);
                        }
/* 251 */               throw kb1.m6050c(-1, "Expected " + j22.m5667a(C1859c.class) + " as the serialized body of " + serialDescriptor.mo130a() + ", but had " + j22.m5667a(abstractC1858bM6837H.getClass()));
                    }
/* 111 */           SerialDescriptor serialDescriptorM7890a = qj3.m7890a(serialDescriptor.mo138i(0), b11Var.f2163b);
/* 115 */           py0 py0VarMo134e2 = serialDescriptorM7890a.mo134e();
/* 121 */           if (!(py0VarMo134e2 instanceof gx1) && !Intrinsics.m6216a(py0VarMo134e2, ca2.f2798k)) {
/* 136 */               throw kb1.m6049b(serialDescriptorM7890a);
                    }
/* 141 */           if (abstractC1858bM6837H instanceof C1859c) {
/* 145 */               return new g21(b11Var, (C1859c) abstractC1858bM6837H);
                    }
/* 193 */           throw kb1.m6050c(-1, "Expected " + j22.m5667a(C1859c.class) + " as the serialized body of " + serialDescriptor.mo130a() + ", but had " + j22.m5667a(abstractC1858bM6837H.getClass()));
                }

                @Override // p000.j11
                /* JADX INFO: renamed from: d */
                public final b11 mo5634d() {
/* 1 */             return this.f14081c;
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: e */
                public final Decoder mo4359e(cx1 cx1Var, int i) {
/* 1 */             cx1Var.getClass();
/* 12 */            return m6843N(m6847S(cx1Var, i), cx1Var.mo138i(i));
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: f */
                public final boolean mo4360f() {
/* 5 */             return m6838I(m6848U());
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: g */
                public final char mo4361g() {
/* 5 */             return m6840K(m6848U());
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: h */
                public final int mo4362h(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 8 */             String str = (String) m6848U();
/* 10 */            str.getClass();
/* 25 */            return w11.m9446p(serialDescriptor, this.f14081c, m6846R(str).mo6271a(), HttpUrl.FRAGMENT_ENCODE_SET);
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: i */
                public final long mo4363i(SerialDescriptor serialDescriptor, int i) {
/* 1 */             serialDescriptor.getClass();
                    try {
/* 16 */                return Long.parseLong(m6846R(m6847S(serialDescriptor, i)).mo6271a());
                    } catch (IllegalArgumentException unused) {
/* 23 */                m6849V("long");
/* 27 */                throw null;
                    }
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: j */
                public final double mo4364j(cx1 cx1Var, int i) {
/* 1 */             cx1Var.getClass();
/* 8 */             return m6841L(m6847S(cx1Var, i));
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: k */
                public final char mo4366k(cx1 cx1Var, int i) {
/* 1 */             cx1Var.getClass();
/* 8 */             return m6840K(m6847S(cx1Var, i));
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: l */
                public final float mo4367l(cx1 cx1Var, int i) {
/* 1 */             cx1Var.getClass();
/* 8 */             return m6842M(m6847S(cx1Var, i));
                }

                @Override // p000.j11
                /* JADX INFO: renamed from: m */
                public final AbstractC1858b mo5635m() {
/* 1 */             return m6837H();
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: n */
                public final byte mo4368n(cx1 cx1Var, int i) {
/* 1 */             cx1Var.getClass();
/* 8 */             return m6839J(m6847S(cx1Var, i));
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: o */
                public final int mo4369o() {
/* 5 */             String str = (String) m6848U();
/* 7 */             str.getClass();
                    try {
/* 18 */                return Integer.parseInt(m6846R(str).mo6271a());
                    } catch (IllegalArgumentException unused) {
/* 25 */                m6849V("int");
/* 29 */                throw null;
                    }
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: p */
                public final short mo4370p(cx1 cx1Var, int i) {
/* 1 */             cx1Var.getClass();
/* 8 */             return m6844O(m6847S(cx1Var, i));
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: q */
                public final int mo4371q(SerialDescriptor serialDescriptor, int i) {
/* 1 */             serialDescriptor.getClass();
                    try {
/* 16 */                return Integer.parseInt(m6846R(m6847S(serialDescriptor, i)).mo6271a());
                    } catch (IllegalArgumentException unused) {
/* 23 */                m6849V("int");
/* 27 */                throw null;
                    }
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: r */
                public final String mo4372r() {
/* 5 */             return m6845P(m6848U());
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: s */
                public final long mo4373s() {
/* 5 */             String str = (String) m6848U();
/* 7 */             str.getClass();
                    try {
/* 18 */                return Long.parseLong(m6846R(str).mo6271a());
                    } catch (IllegalArgumentException unused) {
/* 25 */                m6849V("long");
/* 29 */                throw null;
                    }
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: t */
                public final boolean mo4374t(SerialDescriptor serialDescriptor, int i) {
/* 1 */             serialDescriptor.getClass();
/* 8 */             return m6838I(m6847S(serialDescriptor, i));
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: u */
                public final Object mo4375u(KSerializer kSerializer) {
/* 1 */             kSerializer.getClass();
/* 4 */             return py0.m7594Q(this, kSerializer);
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: v */
                public final String mo4376v(SerialDescriptor serialDescriptor, int i) {
/* 1 */             serialDescriptor.getClass();
/* 8 */             return m6845P(m6847S(serialDescriptor, i));
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: w */
                public boolean mo3298w() {
/* 7 */             return !(m6837H() instanceof JsonNull);
                }

                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: y */
                public final Object mo4377y(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             kSerializer.getClass();
/* 7 */             String strM6847S = m6847S(serialDescriptor, i);
/* 14 */            om2 om2Var = new om2(this, kSerializer, obj, 0);
/* 19 */            this.f14079a.add(strM6847S);
/* 22 */            Object objInvoke = om2Var.invoke();
/* 28 */            if (!this.f14080b) {
/* 30 */                m6848U();
                    }
/* 33 */            this.f14080b = false;
/* 35 */            return objInvoke;
                }

                @Override // kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: z */
                public final Decoder mo4378z(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 8 */             return m6843N(m6848U(), serialDescriptor);
                }
            }
