            package p000;

            import java.io.Serializable;
            import java.util.Iterator;
            import java.util.Locale;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class cn3 implements Iterable, Serializable {

                /* JADX INFO: renamed from: b */
                public static final an3 f3019b = new an3(so3.f16727b);

                /* JADX INFO: renamed from: a */
                public int f3020a;

                static {
/* 10 */            int i = wm3.f18690a;
                }

                /* JADX INFO: renamed from: d */
                public static an3 m1731d(byte[] bArr, int i, int i2) {
/* 4 */             m1732e(i, i + i2, bArr.length);
/* 9 */             byte[] bArr2 = new byte[i2];
/* 12 */            System.arraycopy(bArr, i, bArr2, 0, i2);
/* 15 */            return new an3(bArr2);
                }

                /* JADX INFO: renamed from: e */
                public static int m1732e(int i, int i2, int i3) {
/* 3 */             int i4 = i2 - i;
/* 9 */             if ((i | i2 | i4 | (i3 - i2)) >= 0) {
/* 108 */               return i4;
                    }
/* 11 */            if (i < 0) {
/* 84 */                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
/* 89 */                sb.append("Beginning index: ");
/* 92 */                sb.append(i);
/* 97 */                sb.append(" < 0");
/* 107 */               throw new IndexOutOfBoundsException(sb.toString());
                    }
/* 14 */            if (i2 < i) {
/* 39 */                pk3.m7470f(String.valueOf(i).length() + 44 + String.valueOf(i2).length(), "Beginning index larger than ending index: ", i, ", ", i2);
/* 13 */                return 0;
                    }
/* 66 */            pk3.m7470f(String.valueOf(i2).length() + 15 + String.valueOf(i3).length(), "End index: ", i2, " >= ", i3);
/* 13 */            return 0;
                }

                /* JADX INFO: renamed from: a */
                public abstract byte mo318a(int i);

                /* JADX INFO: renamed from: b */
                public abstract byte mo319b(int i);

                /* JADX INFO: renamed from: c */
                public abstract int mo320c();

                public final int hashCode() {
/* 1 */             int i = this.f3020a;
/* 3 */             if (i != 0) {
/* 32 */                return i;
                    }
/* 5 */             int iMo320c = mo320c();
/* 10 */            an3 an3Var = (an3) this;
/* 13 */            int i2 = iMo320c;
/* 14 */            for (int i3 = 0; i3 < iMo320c; i3++) {
/* 22 */                i2 = (i2 * 31) + an3Var.f344c[i3];
                    }
/* 26 */            if (i2 == 0) {
/* 28 */                i2 = 1;
                    }
/* 29 */            this.f3020a = i2;
/* 31 */            return i2;
                }

                @Override // java.lang.Iterable
                public final /* synthetic */ Iterator iterator() {
/* 3 */             return new C2111ql(this);
                }

                public final String toString() {
                    String strConcat;
/* 1 */             Locale locale = Locale.ROOT;
/* 7 */             String hexString = Integer.toHexString(System.identityHashCode(this));
/* 11 */            int iMo320c = mo320c();
/* 21 */            if (mo320c() <= 50) {
/* 23 */                strConcat = i13.m4423E(this);
                    } else {
/* 28 */                an3 an3Var = (an3) this;
/* 37 */                int iM1732e = m1732e(0, 47, an3Var.mo320c());
/* 60 */                strConcat = i13.m4423E(iM1732e == 0 ? f3019b : new zm3(an3Var.f344c, iM1732e)).concat("...");
                    }
/* 68 */            StringBuilder sb = new StringBuilder("<ByteString@");
/* 71 */            sb.append(hexString);
/* 76 */            sb.append(" size=");
/* 79 */            sb.append(iMo320c);
/* 84 */            sb.append(" contents=\"");
/* 89 */            return fm0.m3789o(sb, strConcat, "\">");
                }
            }
