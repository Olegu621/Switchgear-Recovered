            package p000;

            import io.flutter.Build;
            import io.sentry.C1697u2;
            import java.io.Serializable;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.Locale;
            
            /* JADX INFO: renamed from: ul */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class C2259ul implements Iterable, Serializable {

                /* JADX INFO: renamed from: c */
                public static final C2259ul f17581c = new C2259ul(fz0.f8402b);

                /* JADX INFO: renamed from: d */
                public static final xt0 f17582d;

                /* JADX INFO: renamed from: a */
                public int f17583a = 0;

                /* JADX INFO: renamed from: b */
                public final byte[] f17584b;

                static {
/* 31 */            f17582d = AbstractC2488y7.m10123a() ? new xt0(22) : new xt0(21);
                }

                public C2259ul(byte[] bArr) {
/* 7 */             bArr.getClass();
/* 10 */            this.f17584b = bArr;
                }

                /* JADX INFO: renamed from: b */
                public static int m9038b(int i, int i2, int i3) {
/* 1 */             int i4 = i2 - i;
/* 9 */             if ((i | i2 | i4 | (i3 - i2)) >= 0) {
/* 52 */                return i4;
                    }
/* 11 */            if (i < 0) {
/* 48 */                s80.m8425f(AbstractC0886en.m3505i(i, "Beginning index: ", " < 0"));
/* 26 */                return 0;
                    }
/* 13 */            if (i2 < i) {
/* 23 */                s80.m8425f(AbstractC0886en.m3506j("Beginning index larger than ending index: ", i, i2, ", "));
/* 26 */                return 0;
                    }
/* 36 */            s80.m8425f(AbstractC0886en.m3506j("End index: ", i2, i3, " >= "));
/* 26 */            return 0;
                }

                /* JADX INFO: renamed from: c */
                public static C2259ul m9039c(byte[] bArr, int i, int i2) {
                    byte[] bArrCopyOfRange;
/* 4 */             m9038b(i, i + i2, bArr.length);
                    switch (f17582d.f19369a) {
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 24 */                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
                            break;
                        default:
/* 16 */                    bArrCopyOfRange = new byte[i2];
/* 19 */                    System.arraycopy(bArr, i, bArrCopyOfRange, 0, i2);
                            break;
                    }
/* 28 */            return new C2259ul(bArrCopyOfRange);
                }

                /* JADX INFO: renamed from: a */
                public byte mo8549a(int i) {
/* 3 */             return this.f17584b[i];
                }

                /* JADX INFO: renamed from: d */
                public void mo8550d(byte[] bArr, int i) {
/* 4 */             System.arraycopy(this.f17584b, 0, bArr, 0, i);
                }

                /* JADX INFO: renamed from: e */
                public int mo8551e() {
/* 1 */             return 0;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 95 */                return true;
                    }
/* 7 */             if ((obj instanceof C2259ul) && size() == ((C2259ul) obj).size()) {
/* 28 */                if (size() == 0) {
/* 95 */                    return true;
                        }
/* 33 */                if (!(obj instanceof C2259ul)) {
/* 130 */                   return obj.equals(this);
                        }
/* 35 */                C2259ul c2259ul = (C2259ul) obj;
/* 37 */                int i = this.f17583a;
/* 39 */                int i2 = c2259ul.f17583a;
/* 41 */                if (i == 0 || i2 == 0 || i == i2) {
/* 48 */                    int size = size();
/* 56 */                    if (size > c2259ul.size()) {
/* 126 */                       C1697u2.m5432h(size, size());
/* 6 */                         return false;
                            }
/* 62 */                    if (size > c2259ul.size()) {
/* 103 */                       StringBuilder sbM3793s = fm0.m3793s(size, "Ran off end of other: 0, ", ", ");
/* 111 */                       sbM3793s.append(c2259ul.size());
/* 121 */                       throw new IllegalArgumentException(sbM3793s.toString());
                            }
/* 64 */                    byte[] bArr = c2259ul.f17584b;
/* 70 */                    int iMo8551e = mo8551e() + size;
/* 71 */                    int iMo8551e2 = mo8551e();
/* 75 */                    int iMo8551e3 = c2259ul.mo8551e();
/* 79 */                    while (iMo8551e2 < iMo8551e) {
/* 87 */                        if (this.f17584b[iMo8551e2] == bArr[iMo8551e3]) {
/* 90 */                            iMo8551e2++;
/* 92 */                            iMo8551e3++;
                                }
                            }
/* 95 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                /* JADX INFO: renamed from: f */
                public byte mo8552f(int i) {
/* 3 */             return this.f17584b[i];
                }

                public final int hashCode() {
/* 1 */             int i = this.f17583a;
/* 3 */             if (i != 0) {
/* 35 */                return i;
                    }
/* 5 */             int size = size();
/* 9 */             int iMo8551e = mo8551e();
/* 13 */            int i2 = size;
/* 17 */            for (int i3 = iMo8551e; i3 < iMo8551e + size; i3++) {
/* 25 */                i2 = (i2 * 31) + this.f17584b[i3];
                    }
/* 29 */            if (i2 == 0) {
/* 31 */                i2 = 1;
                    }
/* 32 */            this.f17583a = i2;
/* 34 */            return i2;
                }

                @Override // java.lang.Iterable
                public final Iterator iterator() {
/* 3 */             return new C2111ql(this);
                }

                public int size() {
/* 3 */             return this.f17584b.length;
                }

                public final String toString() {
                    String strConcat;
/* 1 */             Locale locale = Locale.ROOT;
/* 7 */             String hexString = Integer.toHexString(System.identityHashCode(this));
/* 11 */            int size = size();
/* 21 */            if (size() <= 50) {
/* 23 */                strConcat = xe2.m9778p(this);
                    } else {
/* 35 */                int iM9038b = m9038b(0, 47, size());
/* 62 */                strConcat = xe2.m9778p(iM9038b == 0 ? f17581c : new C2185sl(this.f17584b, mo8551e(), iM9038b)).concat("...");
                    }
/* 70 */            StringBuilder sb = new StringBuilder("<ByteString@");
/* 73 */            sb.append(hexString);
/* 78 */            sb.append(" size=");
/* 81 */            sb.append(size);
/* 86 */            sb.append(" contents=\"");
/* 91 */            return fm0.m3789o(sb, strConcat, "\">");
                }
            }
