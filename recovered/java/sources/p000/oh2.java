            package p000;

            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.NoSuchElementException;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.json.AbstractC1858b;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class oh2 extends hu0 implements j11 {

                /* JADX INFO: renamed from: e */
                public final b11 f14755e;

                /* JADX INFO: renamed from: f */
                public final int f14756f;

                /* JADX INFO: renamed from: g */
                public final C1837kn f14757g;

                /* JADX INFO: renamed from: h */
                public final C0168b5 f14758h;

                /* JADX INFO: renamed from: i */
                public int f14759i;

                /* JADX INFO: renamed from: j */
                public C0832d5 f14760j;

                /* JADX INFO: renamed from: k */
                public final wl0 f14761k;

                public oh2(b11 b11Var, int i, C1837kn c1837kn, SerialDescriptor serialDescriptor, C0832d5 c0832d5) {
/* 1 */             if (i == 0) {
/* 30 */                throw null;
                    }
/* 3 */             serialDescriptor.getClass();
/* 9 */             this.f14755e = b11Var;
/* 11 */            this.f14756f = i;
/* 13 */            this.f14757g = c1837kn;
/* 17 */            this.f14758h = b11Var.f2163b;
/* 20 */            this.f14759i = -1;
/* 22 */            this.f14760j = c0832d5;
/* 26 */            this.f14761k = b11Var.f2162a;
                }

                @Override // p000.hu0, p000.InterfaceC1870ky
                /* JADX INFO: renamed from: A */
                public final Object mo4350A(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
/* 5 */             bx0 bx0Var = (bx0) this.f14757g.f12884d;
/* 7 */             serialDescriptor.getClass();
/* 10 */            kSerializer.getClass();
/* 25 */            boolean z = this.f14756f == 3 && (i & 1) == 0;
/* 27 */            if (z) {
/* 31 */                int[] iArr = (int[]) bx0Var.f2632d;
/* 33 */                int i2 = bx0Var.f2631c;
/* 37 */                if (iArr[i2] == -2) {
/* 45 */                    ((Object[]) bx0Var.f2630b)[i2] = dc0.f7094U;
                        }
                    }
/* 47 */            Object objMo4375u = mo4375u(kSerializer);
/* 51 */            if (z) {
/* 55 */                int[] iArr2 = (int[]) bx0Var.f2632d;
/* 57 */                int i3 = bx0Var.f2631c;
/* 61 */                if (iArr2[i3] != -2) {
/* 63 */                    int i4 = i3 + 1;
/* 64 */                    bx0Var.f2631c = i4;
/* 68 */                    Object[] objArr = (Object[]) bx0Var.f2630b;
/* 71 */                    if (i4 == objArr.length) {
/* 73 */                        int i5 = i4 * 2;
/* 79 */                        bx0Var.f2630b = Arrays.copyOf(objArr, i5);
/* 89 */                        bx0Var.f2632d = Arrays.copyOf((int[]) bx0Var.f2632d, i5);
                            }
                        }
/* 93 */                Object[] objArr2 = (Object[]) bx0Var.f2630b;
/* 95 */                int i6 = bx0Var.f2631c;
/* 97 */                objArr2[i6] = objMo4375u;
/* 103 */               ((int[]) bx0Var.f2632d)[i6] = -2;
                    }
/* 105 */           return objMo4375u;
                }

                @Override // p000.hu0, kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: B */
                public final byte mo4351B() throws Throwable {
/* 1 */             C1837kn c1837kn = this.f14757g;
/* 3 */             long jM6130h = c1837kn.m6130h();
/* 8 */             byte b = (byte) jM6130h;
/* 12 */            if (jM6130h == b) {
/* 14 */                return b;
                    }
/* 36 */            C1837kn.m6122m(c1837kn, "Failed to parse byte for input '" + jM6130h + '\'', 0, 6);
/* 40 */            throw null;
                }

                @Override // p000.hu0, kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: C */
                public final short mo4352C() throws Throwable {
/* 1 */             C1837kn c1837kn = this.f14757g;
/* 3 */             long jM6130h = c1837kn.m6130h();
/* 8 */             short s = (short) jM6130h;
/* 12 */            if (jM6130h == s) {
/* 14 */                return s;
                    }
/* 36 */            C1837kn.m6122m(c1837kn, "Failed to parse short for input '" + jM6130h + '\'', 0, 6);
/* 40 */            throw null;
                }

                @Override // p000.hu0, kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: D */
                public final float mo4353D() {
/* 1 */             C1837kn c1837kn = this.f14757g;
/* 3 */             String strM6132j = c1837kn.m6132j();
                    try {
/* 8 */                 float f = Float.parseFloat(strM6132j);
/* 16 */                if (!Float.isInfinite(f) && !Float.isNaN(f)) {
/* 24 */                    return f;
                        }
/* 29 */                kb1.m6042R(c1837kn, Float.valueOf(f));
/* 32 */                throw null;
                    } catch (IllegalArgumentException unused) {
/* 54 */                C1837kn.m6122m(c1837kn, "Failed to parse type 'float' for input '" + strM6132j + '\'', 0, 6);
/* 57 */                throw null;
                    }
                }

                @Override // p000.hu0, kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: E */
                public final double mo4354E() {
/* 1 */             C1837kn c1837kn = this.f14757g;
/* 3 */             String strM6132j = c1837kn.m6132j();
                    try {
/* 8 */                 double d = Double.parseDouble(strM6132j);
/* 16 */                if (!Double.isInfinite(d) && !Double.isNaN(d)) {
/* 24 */                    return d;
                        }
/* 29 */                kb1.m6042R(c1837kn, Double.valueOf(d));
/* 32 */                throw null;
                    } catch (IllegalArgumentException unused) {
/* 54 */                C1837kn.m6122m(c1837kn, "Failed to parse type 'double' for input '" + strM6132j + '\'', 0, 6);
/* 57 */                throw null;
                    }
                }

                @Override // kotlinx.serialization.encoding.Decoder, p000.InterfaceC1870ky
                /* JADX INFO: renamed from: a */
                public final C0168b5 mo5933a() {
/* 1 */             return this.f14758h;
                }

                @Override // p000.hu0, p000.InterfaceC1870ky
                /* JADX INFO: renamed from: b */
                public final void mo3296b(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 11 */            if (this.f14755e.f2162a.f18681c && serialDescriptor.mo135f() == 0) {
/* 23 */                while (mo3299x(serialDescriptor) != -1) {
                        }
                    }
/* 27 */            char cM7482e = pm2.m7482e(this.f14756f);
/* 31 */            C1837kn c1837kn = this.f14757g;
/* 33 */            c1837kn.m6129g(cM7482e);
/* 38 */            bx0 bx0Var = (bx0) c1837kn.f12884d;
/* 40 */            int i = bx0Var.f2631c;
/* 44 */            int[] iArr = (int[]) bx0Var.f2632d;
/* 49 */            if (iArr[i] == -2) {
/* 51 */                iArr[i] = -1;
/* 54 */                bx0Var.f2631c = i - 1;
                    }
/* 56 */            int i2 = bx0Var.f2631c;
/* 58 */            if (i2 != -1) {
/* 61 */                bx0Var.f2631c = i2 - 1;
                    }
                }

                @Override // p000.hu0, kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: c */
                public final InterfaceC1870ky mo3297c(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             b11 b11Var = this.f14755e;
/* 6 */             int iM7880M = qj3.m7880M(b11Var, serialDescriptor);
/* 10 */            C1837kn c1837kn = this.f14757g;
/* 14 */            bx0 bx0Var = (bx0) c1837kn.f12884d;
/* 19 */            int i = bx0Var.f2631c + 1;
/* 20 */            bx0Var.f2631c = i;
/* 24 */            Object[] objArr = (Object[]) bx0Var.f2630b;
/* 27 */            if (i == objArr.length) {
/* 29 */                int i2 = i * 2;
/* 35 */                bx0Var.f2630b = Arrays.copyOf(objArr, i2);
/* 45 */                bx0Var.f2632d = Arrays.copyOf((int[]) bx0Var.f2632d, i2);
                    }
/* 51 */            ((Object[]) bx0Var.f2630b)[i] = serialDescriptor;
/* 57 */            c1837kn.m6129g(pm2.m7481d(iM7880M));
/* 65 */            if (c1837kn.m6138q() == 4) {
/* 106 */               C1837kn.m6122m(c1837kn, "Unexpected leading comma", 0, 6);
/* 110 */               throw null;
                    }
/* 67 */            int iM3520y = AbstractC0886en.m3520y(iM7880M);
/* 71 */            if (iM3520y == 1 || iM3520y == 2 || iM3520y == 3) {
/* 98 */                return new oh2(b11Var, iM7880M, c1837kn, serialDescriptor, this.f14760j);
                    }
                    return this.f14756f == iM7880M ? this : new oh2(b11Var, iM7880M, c1837kn, serialDescriptor, this.f14760j);
                }

                @Override // p000.j11
                /* JADX INFO: renamed from: d */
                public final b11 mo5634d() {
/* 1 */             return this.f14755e;
                }

                @Override // p000.hu0, kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: f */
                public final boolean mo4360f() {
/* 1 */             C1837kn c1837kn = this.f14757g;
/* 7 */             int iM6139r = c1837kn.m6139r(c1837kn.m6140s());
/* 13 */            String str = (String) c1837kn.f12886f;
/* 22 */            if (iM6139r >= str.length() || iM6139r == -1) {
/* 85 */                C1837kn.m6122m(c1837kn, "EOF", 0, 6);
/* 88 */                throw null;
                    }
/* 27 */            int i = iM6139r + 1;
/* 33 */            int iCharAt = str.charAt(iM6139r) | ' ';
/* 37 */            if (iCharAt == 102) {
/* 79 */                c1837kn.m6125c(i, "alse");
/* 21 */                return false;
                    }
/* 41 */            if (iCharAt == 116) {
/* 45 */                c1837kn.m6125c(i, "rue");
/* 48 */                return true;
                    }
/* 73 */            C1837kn.m6122m(c1837kn, "Expected valid boolean literal prefix, but had '" + c1837kn.m6132j() + '\'', 0, 6);
/* 76 */            throw null;
                }

                @Override // p000.hu0, kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: g */
                public final char mo4361g() {
/* 1 */             C1837kn c1837kn = this.f14757g;
/* 3 */             String strM6132j = c1837kn.m6132j();
/* 13 */            if (strM6132j.length() == 1) {
/* 15 */                return strM6132j.charAt(0);
                    }
/* 40 */            C1837kn.m6122m(c1837kn, "Expected single char, but got '" + strM6132j + '\'', 0, 6);
/* 44 */            throw null;
                }

                @Override // p000.hu0, kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: h */
                public final int mo4362h(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             C1837kn c1837kn = this.f14757g;
/* 26 */            return w11.m9446p(serialDescriptor, this.f14755e, c1837kn.m6131i(), " at path ".concat(((bx0) c1837kn.f12884d).m1457c()));
                }

                @Override // p000.j11
                /* JADX INFO: renamed from: m */
                public final AbstractC1858b mo5635m() {
/* 12 */            return new C1954n7(this.f14755e.f2162a, this.f14757g).m6900e();
                }

                @Override // p000.hu0, kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: o */
                public final int mo4369o() throws Throwable {
/* 1 */             C1837kn c1837kn = this.f14757g;
/* 3 */             long jM6130h = c1837kn.m6130h();
/* 7 */             int i = (int) jM6130h;
/* 11 */            if (jM6130h == i) {
/* 13 */                return i;
                    }
/* 35 */            C1837kn.m6122m(c1837kn, "Failed to parse int for input '" + jM6130h + '\'', 0, 6);
/* 39 */            throw null;
                }

                @Override // p000.hu0, kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: r */
                public final String mo4372r() {
/* 3 */             return this.f14757g.m6131i();
                }

                @Override // p000.hu0, kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: s */
                public final long mo4373s() {
/* 3 */             return this.f14757g.m6130h();
                }

                @Override // p000.hu0, kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: u */
                public final Object mo4375u(KSerializer kSerializer) {
                    String strM6133k;
/* 1 */             C1837kn c1837kn = this.f14757g;
/* 3 */             b11 b11Var = this.f14755e;
/* 5 */             kSerializer.getClass();
                    try {
/* 10 */                if (!(kSerializer instanceof mt1)) {
/* 105 */                   return kSerializer.deserialize(this);
                        }
/* 19 */                String strM7589L = py0.m7589L(b11Var, ((mt1) kSerializer).getDescriptor());
/* 23 */                strM7589L.getClass();
/* 26 */                int i = c1837kn.f12882b;
                        try {
/* 34 */                    if (c1837kn.m6127e() != 6) {
/* 66 */                        c1837kn.f12882b = i;
/* 37 */                        strM6133k = null;
                            } else if (!Intrinsics.m6216a(c1837kn.m6133k(), strM7589L)) {
/* 66 */                        c1837kn.f12882b = i;
/* 37 */                        strM6133k = null;
                            } else if (c1837kn.m6127e() != 5) {
/* 66 */                        c1837kn.f12882b = i;
/* 37 */                        strM6133k = null;
                            } else {
/* 57 */                        strM6133k = c1837kn.m6133k();
/* 61 */                        c1837kn.f12882b = i;
                            }
/* 74 */                    KSerializer kSerializerM6800a = strM6133k != null ? ((mt1) kSerializer).m6800a(this, strM6133k) : null;
/* 81 */                    if (kSerializerM6800a == null) {
/* 83 */                        return py0.m7594Q(this, kSerializer);
                            }
/* 90 */                    C0832d5 c0832d5 = new C0832d5(6);
/* 93 */                    c0832d5.f6995b = strM7589L;
/* 95 */                    this.f14760j = c0832d5;
/* 97 */                    return kSerializerM6800a.deserialize(this);
                        } catch (Throwable th) {
/* 102 */                   c1837kn.f12882b = i;
/* 104 */                   throw th;
                        }
                    } catch (ej1 e) {
/* 149 */               throw new ej1(e.f7733a, e.getMessage() + " at path: " + ((bx0) c1837kn.f12884d).m1457c(), e);
                    }
                }

                @Override // p000.hu0, kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: w */
                public final boolean mo3298w() {
                    return this.f14757g.m6142u();
                }

                /* JADX WARN: Code duplicated, block: B:30:0x0066 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:31:0x0068  */
                /* JADX WARN: Code duplicated, block: B:33:0x006f A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:35:0x0072  */
                /* JADX WARN: Code duplicated, block: B:37:0x0076 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:39:0x0079  */
                /* JADX WARN: Code duplicated, block: B:42:0x0087 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:44:0x008b  */
                /* JADX WARN: Code duplicated, block: B:87:0x0149  */
                /* JADX WARN: Code restructure failed: missing block: B:134:0x014a, code lost:
                
                    r10 = 6;
                 */
                @Override // p000.InterfaceC1870ky
                /* JADX INFO: renamed from: x */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int mo3299x(SerialDescriptor serialDescriptor) {
                    boolean z;
                    boolean zM6141t;
                    byte b;
                    String strM6131i;
                    boolean zM6141t2;
                    int i;
                    int i2;
/* 5 */             C1837kn c1837kn = this.f14757g;
/* 9 */             bx0 bx0Var = (bx0) c1837kn.f12884d;
/* 13 */            String str = (String) c1837kn.f12886f;
/* 15 */            serialDescriptor.getClass();
/* 18 */            int i3 = this.f14756f;
/* 20 */            int iM3520y = AbstractC0886en.m3520y(i3);
/* 27 */            char c = ':';
/* 31 */            int i4 = -1;
/* 33 */            if (iM3520y == 0) {
/* 146 */               boolean zM6141t3 = c1837kn.m6141t();
                        while (true) {
/* 154 */                   if (!c1837kn.m6124b()) {
/* 510 */                       if (!zM6141t3) {
/* 512 */                           i4 = -1;
                                    break;
                                }
/* 527 */                       C1837kn.m6122m(c1837kn, "Unexpected trailing comma", 0, 6);
/* 532 */                       throw null;
                            }
/* 156 */                   String strM6126d = c1837kn.m6126d();
/* 160 */                   c1837kn.m6129g(c);
/* 163 */                   b11 b11Var = this.f14755e;
/* 165 */                   int iM9444o = w11.m9444o(serialDescriptor, b11Var, strM6126d);
/* 170 */                   wl0 wl0Var = this.f14761k;
/* 172 */                   if (iM9444o != -3) {
/* 176 */                       if (wl0Var.f18682d) {
/* 178 */                           SerialDescriptor serialDescriptorMo138i = serialDescriptor.mo138i(iM9444o);
/* 186 */                           if (serialDescriptorMo138i.mo132c() || c1837kn.m6142u()) {
/* 205 */                               if (Intrinsics.m6216a(serialDescriptorMo138i.mo134e(), ca2.f2798k)) {
/* 211 */                                   if (c1837kn.m6138q() != 1) {
/* 213 */                                       strM6131i = null;
                                            } else {
/* 215 */                                       strM6131i = c1837kn.m6131i();
/* 219 */                                       c1837kn.f12885e = strM6131i;
                                            }
/* 221 */                                   if (strM6131i != null && w11.m9444o(serialDescriptorMo138i, b11Var, strM6131i) == -3) {
/* 230 */                                       c1837kn.m6131i();
                                            }
                                        }
                                    }
/* 233 */                           zM6141t = c1837kn.m6141t();
/* 237 */                           z = false;
                                }
/* 239 */                       i4 = iM9444o;
                                break;
                            }
/* 242 */                   z = true;
/* 243 */                   zM6141t = false;
/* 244 */                   if (z) {
/* 248 */                       if (!wl0Var.f18681c) {
/* 250 */                           C0832d5 c0832d5 = this.f14760j;
/* 252 */                           if (c0832d5 == null || !Intrinsics.m6216a(c0832d5.f6995b, strM6126d)) {
/* 303 */                               c1837kn.m6134l(StringsKt.m6229E(6, str.subSequence(0, c1837kn.f12882b).toString(), strM6126d), "Encountered an unknown key '" + strM6126d + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
/* 308 */                               throw null;
                                    }
/* 263 */                           c0832d5.f6995b = null;
                                }
/* 311 */                       ArrayList arrayList = new ArrayList();
/* 314 */                       byte bM6138q = c1837kn.m6138q();
/* 320 */                       if (bM6138q != 8) {
/* 322 */                           b = 6;
/* 323 */                           if (bM6138q != 6) {
/* 325 */                               c1837kn.m6132j();
                                    } else {
                                        while (true) {
/* 331 */                                   byte bM6138q2 = c1837kn.m6138q();
/* 335 */                                   if (bM6138q2 == 1) {
/* 337 */                                       c1837kn.m6126d();
                                            } else {
/* 341 */                                       if (bM6138q2 == 8 || bM6138q2 == b) {
/* 350 */                                           arrayList.add(Byte.valueOf(bM6138q2));
                                                } else if (bM6138q2 == 9) {
/* 371 */                                           if (((Number) CollectionsKt.m6204y(arrayList)).byteValue() != 8) {
/* 414 */                                               throw kb1.m6051d("found ] instead of } at path: " + bx0Var, str, c1837kn.f12882b);
                                                    }
/* 377 */                                           if (arrayList.isEmpty()) {
/* 393 */                                               throw new NoSuchElementException("List is empty.");
                                                    }
/* 384 */                                           arrayList.remove(arrayList.size() - 1);
                                                } else if (bM6138q2 == 7) {
/* 429 */                                           if (((Number) CollectionsKt.m6204y(arrayList)).byteValue() != 6) {
/* 472 */                                               throw kb1.m6051d("found } instead of ] at path: " + bx0Var, str, c1837kn.f12882b);
                                                    }
/* 435 */                                           if (arrayList.isEmpty()) {
/* 451 */                                               throw new NoSuchElementException("List is empty.");
                                                    }
/* 442 */                                           arrayList.remove(arrayList.size() - 1);
                                                } else if (bM6138q2 == 10) {
/* 502 */                                           C1837kn.m6122m(c1837kn, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, 6);
/* 507 */                                           throw null;
                                                }
/* 477 */                                       c1837kn.m6127e();
/* 484 */                                       if (arrayList.size() == 0) {
                                                    break;
                                                }
/* 330 */                                       b = 6;
                                            }
                                        }
                                    }
/* 486 */                           zM6141t3 = c1837kn.m6141t();
                                } else {
/* 330 */                           b = 6;
                                }
                            } else {
/* 508 */                       zM6141t3 = zM6141t;
                            }
/* 491 */                   c = ':';
                        }
                    } else if (iM3520y != 2) {
/* 38 */                boolean zM6141t4 = c1837kn.m6141t();
/* 46 */                if (c1837kn.m6124b()) {
/* 48 */                    int i5 = this.f14759i;
/* 50 */                    if (i5 != -1 && !zM6141t4) {
/* 57 */                        C1837kn.m6122m(c1837kn, "Expected end of the array or comma", 0, 6);
/* 60 */                        throw null;
                            }
/* 61 */                    i4 = i5 + 1;
/* 63 */                    this.f14759i = i4;
                        } else if (zM6141t4) {
/* 71 */                    C1837kn.m6122m(c1837kn, "Unexpected trailing comma", 0, 6);
/* 74 */                    throw null;
                        }
                    } else {
/* 75 */                int i6 = this.f14759i;
/* 83 */                boolean z2 = i6 % 2 != 0;
/* 84 */                if (z2) {
/* 86 */                    if (i6 != -1) {
/* 88 */                        zM6141t2 = c1837kn.m6141t();
                            }
/* 101 */                   if (c1837kn.m6124b()) {
/* 103 */                       if (z2) {
/* 105 */                           i = this.f14759i;
/* 107 */                           i2 = c1837kn.f12882b;
/* 110 */                           if (i == -1) {
/* 112 */                               if (zM6141t2) {
/* 115 */                                   C1837kn.m6122m(c1837kn, "Unexpected trailing comma", i2, 4);
/* 118 */                                   throw null;
                                        }
                                    } else if (!zM6141t2) {
/* 124 */                               C1837kn.m6122m(c1837kn, "Expected comma after the key-value pair", i2, 4);
/* 127 */                               throw null;
                                    }
                                }
/* 130 */                       i4 = this.f14759i + 1;
/* 132 */                       this.f14759i = i4;
                            } else if (zM6141t2) {
/* 142 */                       C1837kn.m6122m(c1837kn, "Expected '}', but had ',' instead", 0, 6);
/* 145 */                       throw null;
                            }
                        } else {
/* 93 */                    c1837kn.m6129g(':');
                        }
/* 96 */                zM6141t2 = false;
/* 101 */               if (c1837kn.m6124b()) {
/* 103 */                   if (z2) {
/* 105 */                       i = this.f14759i;
/* 107 */                       i2 = c1837kn.f12882b;
/* 110 */                       if (i == -1) {
/* 112 */                           if (zM6141t2) {
/* 115 */                               C1837kn.m6122m(c1837kn, "Unexpected trailing comma", i2, 4);
/* 118 */                               throw null;
                                    }
                                } else if (!zM6141t2) {
/* 124 */                           C1837kn.m6122m(c1837kn, "Expected comma after the key-value pair", i2, 4);
/* 127 */                           throw null;
                                }
                            }
/* 130 */                   i4 = this.f14759i + 1;
/* 132 */                   this.f14759i = i4;
                        } else if (zM6141t2) {
/* 142 */                   C1837kn.m6122m(c1837kn, "Expected '}', but had ',' instead", 0, 6);
/* 145 */                   throw null;
                        }
                    }
/* 514 */           if (i3 != 3) {
/* 522 */               ((int[]) bx0Var.f2632d)[bx0Var.f2631c] = i4;
                    }
/* 524 */           return i4;
                }

                @Override // p000.hu0, kotlinx.serialization.encoding.Decoder
                /* JADX INFO: renamed from: z */
                public final Decoder mo4378z(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
                    return qh2.m7852a(serialDescriptor) ? new k11(this.f14757g, this.f14755e) : this;
                }
            }
