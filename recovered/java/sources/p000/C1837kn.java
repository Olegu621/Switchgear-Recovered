            package p000;

            import java.io.Serializable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: kn */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 192 */   public final class C1837kn implements ng2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12881a;

                /* JADX INFO: renamed from: b */
                public int f12882b;

                /* JADX INFO: renamed from: c */
                public final Serializable f12883c;

                /* JADX INFO: renamed from: d */
                public final Object f12884d;

                /* JADX INFO: renamed from: e */
                public Serializable f12885e;

                /* JADX INFO: renamed from: f */
                public final Serializable f12886f;

                public C1837kn(C0816cq c0816cq) {
/* 2 */             this.f12881a = 0;
/* 7 */             this.f12882b = 0;
/* 11 */            HashMap map = new HashMap();
/* 14 */            this.f12883c = map;
/* 21 */            this.f12886f = new HashSet();
/* 28 */            this.f12884d = new ArrayList();
/* 35 */            this.f12885e = new ArrayList();
/* 41 */            Set hashSet = new HashSet();
                    try {
/* 46 */                hashSet = c0816cq.f6873a.mo1598u();
                    } catch (C1897lo unused) {
/* 53 */                hu0.m4325T("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
                    }
/* 56 */            Iterator it = hashSet.iterator();
/* 64 */            while (it.hasNext()) {
/* 74 */                ArrayList arrayList = new ArrayList((Set) it.next());
/* 82 */                if (arrayList.size() >= 2) {
/* 88 */                    String str = (String) arrayList.get(0);
/* 95 */                    String str2 = (String) arrayList.get(1);
                            try {
/* 101 */                       if (yy1.m10227w(c0816cq, str) && yy1.m10227w(c0816cq, str2)) {
/* 126 */                           ((HashSet) this.f12886f).add(new HashSet(Arrays.asList(str, str2)));
/* 133 */                           if (!map.containsKey(str)) {
/* 140 */                               map.put(str, new ArrayList());
                                    }
/* 147 */                           if (!map.containsKey(str2)) {
/* 154 */                               map.put(str2, new ArrayList());
                                    }
/* 169 */                           ((List) map.get(str)).add((String) arrayList.get(1));
/* 184 */                           ((List) map.get(str2)).add((String) arrayList.get(0));
                                }
                            } catch (ux0 unused2) {
/* 188 */                       hu0.m4312F0("Camera2CameraCoordinator");
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: m */
                public static /* synthetic */ void m6122m(C1837kn c1837kn, String str, int i, int i2) {
/* 3 */             if ((i2 & 2) != 0) {
/* 5 */                 i = c1837kn.f12882b;
                    }
/* 16 */            c1837kn.m6134l(i, str, (i2 & 4) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
/* 20 */            throw null;
                }

                /* JADX INFO: renamed from: a */
                public int m6123a(CharSequence charSequence, int i) {
/* 1 */             int i2 = i + 4;
/* 7 */             if (i2 < charSequence.length()) {
/* 69 */                ((StringBuilder) this.f12883c).append((char) (m6136o(charSequence, i + 3) + (m6136o(charSequence, i) << 12) + (m6136o(charSequence, i + 1) << 8) + (m6136o(charSequence, i + 2) << 4)));
/* 72 */                return i2;
                    }
/* 9 */             this.f12882b = i;
/* 15 */            if (i2 < charSequence.length()) {
/* 19 */                return m6123a(charSequence, this.f12882b);
                    }
/* 28 */            m6122m(this, "Unexpected EOF during unicode escape", 0, 6);
/* 32 */            throw null;
                }

                /* JADX INFO: renamed from: b */
                public boolean m6124b() {
/* 3 */             String str = (String) this.f12886f;
/* 5 */             int i = this.f12882b;
/* 9 */             if (i == -1) {
/* 8 */                 return false;
                    }
/* 16 */            while (i < str.length()) {
/* 18 */                char cCharAt = str.charAt(i);
/* 24 */                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
/* 39 */                    this.f12882b = i;
/* 63 */                    return !(cCharAt == '}' || cCharAt == ']' || cCharAt == ':' || cCharAt == ',');
                        }
/* 66 */                i++;
                    }
/* 69 */            this.f12882b = i;
/* 8 */             return false;
                }

                /* JADX INFO: renamed from: c */
                public void m6125c(int i, String str) {
/* 3 */             String str2 = (String) this.f12886f;
/* 17 */            if (str2.length() - i < str.length()) {
/* 80 */                m6122m(this, "Unexpected end of boolean literal", 0, 6);
/* 83 */                throw null;
                    }
/* 19 */            int length = str.length();
/* 24 */            for (int i2 = 0; i2 < length; i2++) {
/* 38 */                if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
/* 66 */                    m6122m(this, "Expected valid boolean literal prefix, but had '" + m6132j() + '\'', 0, 6);
/* 69 */                    throw null;
                        }
                    }
/* 75 */            this.f12882b = str.length() + i;
                }

                /* JADX INFO: renamed from: d */
                public String m6126d() {
                    String string;
/* 3 */             StringBuilder sb = (StringBuilder) this.f12883c;
/* 7 */             String str = (String) this.f12886f;
/* 11 */            m6129g('\"');
/* 14 */            int i = this.f12882b;
/* 17 */            int iM6226B = StringsKt.m6226B(str, '\"', i, 4);
/* 24 */            if (iM6226B == -1) {
/* 199 */               m6135n((byte) 1);
/* 202 */               throw null;
                    }
/* 26 */            int i2 = i;
/* 27 */            while (i2 < iM6226B) {
/* 35 */                if (str.charAt(i2) == '\\') {
/* 37 */                    int iM6139r = this.f12882b;
/* 39 */                    char cCharAt = str.charAt(i2);
/* 44 */                    boolean z = false;
/* 45 */                    while (cCharAt != '\"') {
/* 49 */                        if (cCharAt == '\\') {
/* 51 */                            sb.append((CharSequence) str, iM6139r, i2);
/* 56 */                            int iM6139r2 = m6139r(i2 + 1);
/* 61 */                            if (iM6139r2 == -1) {
/* 129 */                               m6122m(this, "Expected escape sequence to continue, got EOF", 0, 6);
/* 132 */                               throw null;
                                    }
/* 63 */                            int iM6123a = iM6139r2 + 1;
/* 65 */                            char cCharAt2 = str.charAt(iM6139r2);
/* 71 */                            if (cCharAt2 == 'u') {
/* 73 */                                iM6123a = m6123a(str, iM6123a);
                                    } else {
/* 85 */                                char c = cCharAt2 < 'u' ? C1939mt.f14015a[cCharAt2] : (char) 0;
/* 86 */                                if (c == 0) {
/* 123 */                                   m6122m(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, 6);
/* 126 */                                   throw null;
                                        }
/* 88 */                                sb.append(c);
                                    }
/* 91 */                            iM6139r = m6139r(iM6123a);
/* 95 */                            if (iM6139r == -1) {
/* 100 */                               m6122m(this, "EOF", iM6139r, 4);
/* 103 */                               throw null;
                                    }
                                } else {
/* 133 */                           i2++;
/* 139 */                           if (i2 >= str.length()) {
/* 141 */                               sb.append((CharSequence) str, iM6139r, i2);
/* 144 */                               iM6139r = m6139r(i2);
/* 148 */                               if (iM6139r == -1) {
/* 151 */                                   m6122m(this, "EOF", iM6139r, 4);
/* 154 */                                   throw null;
                                        }
                                    } else {
                                        continue;
                                    }
/* 155 */                           cCharAt = str.charAt(i2);
                                }
/* 97 */                        i2 = iM6139r;
/* 98 */                        z = true;
/* 155 */                       cCharAt = str.charAt(i2);
                            }
/* 160 */                   if (z) {
/* 171 */                       sb.append((CharSequence) str, iM6139r, i2);
/* 174 */                       String string2 = sb.toString();
/* 178 */                       sb.setLength(0);
/* 181 */                       string = string2;
                            } else {
/* 166 */                       string = str.subSequence(iM6139r, i2).toString();
                            }
/* 183 */                   this.f12882b = i2 + 1;
/* 185 */                   return string;
                        }
/* 186 */               i2++;
                    }
/* 192 */           this.f12882b = iM6226B + 1;
/* 194 */           return str.substring(i, iM6226B);
                }

                /* JADX INFO: renamed from: e */
                public byte m6127e() {
                    byte bM5752l;
/* 3 */             String str = (String) this.f12886f;
/* 31 */            do {
/* 5 */                 int i = this.f12882b;
/* 8 */                 if (i == -1 || i >= str.length()) {
/* 34 */                    return (byte) 10;
                        }
/* 16 */                int i2 = this.f12882b;
/* 20 */                this.f12882b = i2 + 1;
/* 26 */                bM5752l = jb1.m5752l(str.charAt(i2));
/* 31 */            } while (bM5752l == 3);
/* 33 */            return bM5752l;
                }

                /* JADX INFO: renamed from: f */
                public byte m6128f(byte b) {
/* 1 */             byte bM6127e = m6127e();
/* 5 */             if (bM6127e == b) {
/* 7 */                 return bM6127e;
                    }
/* 8 */             m6135n(b);
/* 12 */            throw null;
                }

                /* JADX INFO: renamed from: g */
                public void m6129g(char c) {
/* 5 */             if (this.f12882b == -1) {
/* 57 */                m6143v(c);
/* 60 */                throw null;
                    }
/* 9 */             String str = (String) this.f12886f;
/* 17 */            while (this.f12882b < str.length()) {
/* 19 */                int i = this.f12882b;
/* 23 */                this.f12882b = i + 1;
/* 25 */                char cCharAt = str.charAt(i);
/* 31 */                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
/* 46 */                    if (cCharAt == c) {
/* 48 */                        return;
                            }
/* 49 */                    m6143v(c);
/* 52 */                    throw null;
                        }
                    }
/* 53 */            m6143v(c);
/* 56 */            throw null;
                }

                /* JADX INFO: renamed from: h */
                public long m6130h() throws Throwable {
                    boolean z;
/* 7 */             int iM6139r = m6139r(m6140s());
/* 13 */            String str = (String) this.f12886f;
/* 21 */            Throwable th = null;
/* 22 */            int i = 6;
/* 23 */            int i2 = 0;
/* 24 */            if (iM6139r >= str.length() || iM6139r == -1) {
/* 230 */               m6122m(this, "EOF", 0, 6);
/* 233 */               throw null;
                    }
/* 35 */            if (str.charAt(iM6139r) == '\"') {
/* 37 */                iM6139r++;
/* 43 */                if (iM6139r == str.length()) {
/* 47 */                    m6122m(this, "EOF", 0, 6);
/* 50 */                    throw null;
                        }
/* 45 */                z = true;
                    } else {
/* 51 */                z = false;
                    }
/* 52 */            int i3 = iM6139r;
/* 53 */            boolean z2 = false;
/* 54 */            long j = 0;
/* 56 */            int i4 = 1;
                    while (true) {
/* 61 */                th = th;
/* 63 */                if (i4 != 0) {
/* 65 */                    char cCharAt = str.charAt(i3);
/* 71 */                    if (cCharAt != '-') {
/* 91 */                        if (jb1.m5752l(cCharAt) != 0) {
                                    break;
                                }
/* 93 */                        i3++;
/* 103 */                       i4 = i3 != str.length() ? 1 : i2;
/* 104 */                       int i5 = cCharAt - '0';
/* 106 */                       if (i5 < 0 || i5 >= 10) {
/* 156 */                           m6122m(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i2, i);
/* 159 */                           throw th;
                                }
/* 117 */                       j = (j * 10) - ((long) i5);
/* 120 */                       if (j > 0) {
/* 131 */                           m6122m(this, "Numeric value overflow", 0, 6);
/* 134 */                           throw th;
                                }
/* 124 */                       i = 6;
/* 125 */                       i2 = 0;
                            } else {
/* 73 */                        if (i3 != iM6139r) {
/* 83 */                            m6122m(this, "Unexpected symbol '-' in numeric literal", i2, i);
/* 86 */                            throw th;
                                }
/* 75 */                        i3++;
/* 79 */                        z2 = true;
                            }
                        } else {
                            break;
                        }
                    }
/* 160 */           if (iM6139r == i3 || (z2 && iM6139r == i3 - 1)) {
/* 222 */               m6122m(this, "Expected numeric literal", 0, 6);
/* 225 */               throw th;
                    }
/* 172 */           if (z) {
/* 174 */               if (i4 == 0) {
/* 199 */                   m6122m(this, "EOF", 0, 6);
/* 202 */                   throw th;
                        }
/* 182 */               if (str.charAt(i3) != '\"') {
/* 193 */                   m6122m(this, "Expected closing quotation mark", 0, 6);
/* 196 */                   throw th;
                        }
/* 184 */               i3++;
                    }
/* 203 */           this.f12882b = i3;
/* 205 */           if (z2) {
/* 207 */               return j;
                    }
/* 212 */           if (j != Long.MIN_VALUE) {
/* 214 */               return -j;
                    }
/* 216 */           m6122m(this, "Numeric value overflow", 0, 6);
/* 219 */           throw th;
                }

                /* JADX INFO: renamed from: i */
                public String m6131i() {
/* 3 */             String str = (String) this.f12885e;
/* 5 */             if (str == null) {
/* 14 */                return m6126d();
                    }
/* 7 */             str.getClass();
/* 11 */            this.f12885e = null;
/* 13 */            return str;
                }

                /* JADX INFO: renamed from: j */
                public String m6132j() {
                    String string;
/* 3 */             StringBuilder sb = (StringBuilder) this.f12883c;
/* 7 */             String str = (String) this.f12886f;
/* 11 */            String str2 = (String) this.f12885e;
/* 14 */            if (str2 != null) {
/* 16 */                str2.getClass();
/* 19 */                this.f12885e = null;
/* 21 */                return str2;
                    }
/* 22 */            int iM6140s = m6140s();
/* 30 */            if (iM6140s >= str.length() || iM6140s == -1) {
/* 153 */               m6122m(this, "EOF", iM6140s, 4);
/* 156 */               throw null;
                    }
/* 39 */            byte bM5752l = jb1.m5752l(str.charAt(iM6140s));
/* 44 */            if (bM5752l == 1) {
/* 46 */                return m6131i();
                    }
/* 52 */            if (bM5752l != 0) {
/* 146 */               m6122m(this, "Expected beginning of the string, but got " + str.charAt(iM6140s), 0, 6);
/* 149 */               throw null;
                    }
/* 54 */            boolean z = false;
/* 63 */            while (jb1.m5752l(str.charAt(iM6140s)) == 0) {
/* 65 */                iM6140s++;
/* 71 */                if (iM6140s >= str.length()) {
/* 75 */                    sb.append((CharSequence) str, this.f12882b, iM6140s);
/* 78 */                    int iM6139r = m6139r(iM6140s);
/* 82 */                    if (iM6139r == -1) {
/* 84 */                        this.f12882b = iM6140s;
/* 86 */                        sb.append((CharSequence) str, 0, 0);
/* 89 */                        String string2 = sb.toString();
/* 93 */                        sb.setLength(0);
/* 96 */                        return string2;
                            }
/* 97 */                    iM6140s = iM6139r;
/* 98 */                    z = true;
                        }
                    }
/* 100 */           int i = this.f12882b;
/* 102 */           if (z) {
/* 113 */               sb.append((CharSequence) str, i, iM6140s);
/* 116 */               String string3 = sb.toString();
/* 120 */               sb.setLength(0);
/* 123 */               string = string3;
                    } else {
/* 108 */               string = str.subSequence(i, iM6140s).toString();
                    }
/* 124 */           this.f12882b = iM6140s;
/* 126 */           return string;
                }

                /* JADX INFO: renamed from: k */
                public String m6133k() {
/* 1 */             String strM6132j = m6132j();
/* 11 */            if (!Intrinsics.m6216a(strM6132j, "null") || ((String) this.f12886f).charAt(this.f12882b - 1) == '\"') {
/* 39 */                return strM6132j;
                    }
/* 34 */            m6122m(this, "Unexpected 'null' value instead of string literal", 0, 6);
/* 38 */            throw null;
                }

                /* JADX INFO: renamed from: l */
                public void m6134l(int i, String str, String str2) {
/* 1 */             str2.getClass();
/* 15 */            String strConcat = str2.length() == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : "\n".concat(str2);
/* 21 */            StringBuilder sbM3794t = fm0.m3794t(str, " at path: ");
/* 33 */            sbM3794t.append(((bx0) this.f12884d).m1457c());
/* 36 */            sbM3794t.append(strConcat);
/* 51 */            throw kb1.m6051d(sbM3794t.toString(), (String) this.f12886f, i);
                }

                /* JADX INFO: renamed from: n */
                public void m6135n(byte b) {
                    String str;
                    int i;
/* 3 */             String str2 = (String) this.f12886f;
/* 7 */             if (b == 1) {
/* 9 */                 str = "quotation mark '\"'";
                    } else if (b == 4) {
/* 14 */                str = "comma ','";
                    } else if (b == 5) {
/* 20 */                str = "colon ':'";
                    } else if (b == 6) {
/* 26 */                str = "start of the object '{'";
                    } else if (b == 7) {
/* 32 */                str = "end of the object '}'";
                    } else if (b == 8) {
/* 39 */                str = "start of the array '['";
                    } else {
/* 49 */                str = b == 9 ? "end of the array ']'" : "valid token";
                    }
/* 89 */            m6122m(this, fm0.m3785k("Expected ", str, ", but had '", (this.f12882b == str2.length() || (i = this.f12882b) <= 0) ? "EOF" : String.valueOf(str2.charAt(i - 1)), "' instead"), this.f12882b - 1, 4);
/* 93 */            throw null;
                }

                /* JADX INFO: renamed from: o */
                public int m6136o(CharSequence charSequence, int i) {
/* 1 */             char cCharAt = charSequence.charAt(i);
/* 7 */             if ('0' <= cCharAt && cCharAt < ':') {
/* 13 */                return cCharAt - '0';
                    }
/* 17 */            if ('a' <= cCharAt && cCharAt < 'g') {
/* 23 */                return cCharAt - 'W';
                    }
/* 28 */            if ('A' <= cCharAt && cCharAt < 'G') {
/* 34 */                return cCharAt - '7';
                    }
/* 58 */            m6122m(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, 6);
/* 62 */            throw null;
                }

                /* JADX INFO: renamed from: p */
                public String m6137p(String str) {
/* 3 */             HashMap map = (HashMap) this.f12883c;
/* 9 */             if (!map.containsKey(str)) {
/* 84 */                return null;
                    }
/* 26 */            for (String str2 : (List) map.get(str)) {
/* 38 */                Iterator it = ((ArrayList) this.f12885e).iterator();
/* 46 */                while (it.hasNext()) {
/* 56 */                    InterfaceC2469xp interfaceC2469xpMo311c = ((InterfaceC2469xp) it.next()).mo311c();
/* 64 */                    de3.m3023e("CameraInfo doesn't contain Camera2 implementation.", interfaceC2469xpMo311c instanceof C2557zn);
/* 81 */                    if (str2.equals(((C2557zn) ((C2557zn) interfaceC2469xpMo311c).f20269c.f15492b).f20267a)) {
/* 83 */                        return str2;
                            }
                        }
                    }
/* 84 */            return null;
                }

                /* JADX INFO: renamed from: q */
                public byte m6138q() {
/* 3 */             String str = (String) this.f12886f;
/* 5 */             int i = this.f12882b;
                    while (true) {
/* 7 */                 int iM6139r = m6139r(i);
/* 14 */                if (iM6139r == -1) {
/* 45 */                    this.f12882b = iM6139r;
/* 12 */                    return (byte) 10;
                        }
/* 16 */                char cCharAt = str.charAt(iM6139r);
/* 22 */                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
/* 35 */                    this.f12882b = iM6139r;
/* 37 */                    return jb1.m5752l(cCharAt);
                        }
/* 42 */                i = iM6139r + 1;
                    }
                }

                /* JADX INFO: renamed from: r */
                public int m6139r(int i) {
/* 9 */             if (i < ((String) this.f12886f).length()) {
/* 11 */                return i;
                    }
/* 12 */            return -1;
                }

                /* JADX INFO: renamed from: s */
                public int m6140s() {
                    char cCharAt;
/* 3 */             String str = (String) this.f12886f;
/* 5 */             int i = this.f12882b;
/* 8 */             if (i == -1) {
/* 10 */                return i;
                    }
/* 15 */            while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
/* 37 */                i++;
                    }
/* 40 */            this.f12882b = i;
/* 42 */            return i;
                }

                /* JADX INFO: renamed from: t */
                public boolean m6141t() {
/* 1 */             int iM6140s = m6140s();
/* 7 */             String str = (String) this.f12886f;
/* 14 */            if (iM6140s == str.length() || iM6140s == -1 || str.charAt(iM6140s) != ',') {
/* 13 */                return false;
                    }
/* 32 */            this.f12882b++;
/* 30 */            return true;
                }

                public String toString() {
                    switch (this.f12881a) {
                        case 2:
/* 15 */                    StringBuilder sb = new StringBuilder("JsonReader(source='");
/* 22 */                    sb.append(this.f12886f);
/* 27 */                    sb.append("', currentPosition=");
/* 34 */                    return AbstractC0886en.m3510n(sb, this.f12882b, ')');
                        default:
/* 6 */                     return super.toString();
                    }
                }

                /* JADX INFO: renamed from: u */
                public boolean m6142u() {
/* 5 */             int iM6139r = m6139r(m6140s());
/* 11 */            String str = (String) this.f12886f;
/* 17 */            int length = str.length() - iM6139r;
/* 20 */            if (length < 4 || iM6139r == -1) {
/* 18 */                return true;
                    }
/* 28 */            for (int i = 0; i < 4; i++) {
/* 42 */                if ("null".charAt(i) != str.charAt(iM6139r + i)) {
/* 18 */                    return true;
                        }
                    }
/* 48 */            if (length > 4 && jb1.m5752l(str.charAt(iM6139r + 4)) == 0) {
/* 18 */                return true;
                    }
/* 64 */            this.f12882b = iM6139r + 4;
/* 26 */            return false;
                }

                /* JADX INFO: renamed from: v */
                public void m6143v(char c) {
/* 3 */             int i = this.f12882b - 1;
/* 5 */             this.f12882b = i;
/* 8 */             if (i >= 0 && c == '\"' && Intrinsics.m6216a(m6132j(), "null")) {
/* 34 */                m6134l(this.f12882b - 4, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.");
/* 37 */                throw null;
                    }
/* 42 */            m6135n(jb1.m5752l(c));
/* 45 */            throw null;
                }

/* 193 */       public C1837kn(String str, String str2, String str3, String str4, int i, String str5, String str6) {
                    this.f12881a = 1;
                    str2.getClass();
                    str3.getClass();
                    str5.getClass();
                    str6.getClass();
/* 195 */           this.f12884d = str3;
/* 196 */           this.f12882b = i;
/* 197 */           this.f12885e = str5;
/* 198 */           this.f12886f = str6;
/* 199 */           HashMap map = new HashMap();
                    this.f12883c = map;
/* 200 */           map.put("firstEventId", str);
/* 202 */           map.put("firstEventTimestamp", str2);
/* 203 */           map.put("sessionId", str3);
/* 205 */           map.put("previousSessionId", str4);
/* 206 */           map.put("sessionIndex", Integer.valueOf(i));
/* 207 */           map.put("userId", str5);
/* 208 */           map.put("storageMechanism", str6);
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 208 */       public C1837kn(String str) {
                    this.f12881a = 2;
                    str.getClass();
/* 211 */           bx0 bx0Var = new bx0(0 == true ? 1 : 0, 1);
/* 212 */           bx0Var.f2630b = new Object[8];
/* 213 */           int[] iArr = new int[8];
                    for (int i = 0; i < 8; i++) {
                        iArr[i] = -1;
                    }
                    bx0Var.f2632d = iArr;
/* 214 */           bx0Var.f2631c = -1;
/* 215 */           this.f12884d = bx0Var;
/* 216 */           this.f12883c = new StringBuilder();
/* 217 */           this.f12886f = str;
                }
            }
