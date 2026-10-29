            package p000;

            import io.flutter.Build;
            import java.io.Serializable;
            import java.util.Arrays;
            import java.util.Locale;
            
            /* JADX INFO: renamed from: vl */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2298vl implements Iterable, Serializable {

                /* JADX INFO: renamed from: b */
                public static final C2222tl f18234b = new C2222tl(ez0.f7924b);

                /* JADX INFO: renamed from: c */
                public static final dc0 f18235c;

                /* JADX INFO: renamed from: a */
                public int f18236a;

                static {
/* 31 */            f18235c = AbstractC2358x7.m9726a() ? new dc0(22) : new dc0(21);
                }

                /* JADX INFO: renamed from: b */
                public static int m9302b(int i, int i2, int i3) {
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
                public static C2222tl m9303c(byte[] bArr, int i, int i2) {
                    byte[] bArrCopyOfRange;
/* 4 */             m9302b(i, i + i2, bArr.length);
                    switch (f18235c.f7108a) {
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 24 */                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
                            break;
                        default:
/* 16 */                    bArrCopyOfRange = new byte[i2];
/* 19 */                    System.arraycopy(bArr, i, bArrCopyOfRange, 0, i2);
                            break;
                    }
/* 28 */            return new C2222tl(bArrCopyOfRange);
                }

                /* JADX INFO: renamed from: a */
                public abstract byte mo8194a(int i);

                /* JADX INFO: renamed from: d */
                public abstract void mo8195d(byte[] bArr, int i);

                /* JADX INFO: renamed from: e */
                public final byte[] m9304e() {
/* 1 */             int size = size();
/* 5 */             if (size == 0) {
/* 7 */                 return ez0.f7924b;
                    }
/* 10 */            byte[] bArr = new byte[size];
/* 12 */            mo8195d(bArr, size);
/* 15 */            return bArr;
                }

                public final int hashCode() {
/* 1 */             int i = this.f18236a;
/* 3 */             if (i != 0) {
/* 38 */                return i;
                    }
/* 5 */             int size = size();
/* 10 */            C2222tl c2222tl = (C2222tl) this;
/* 12 */            int iMo8196f = c2222tl.mo8196f();
/* 16 */            int i2 = size;
/* 20 */            for (int i3 = iMo8196f; i3 < iMo8196f + size; i3++) {
/* 28 */                i2 = (i2 * 31) + c2222tl.f17140d[i3];
                    }
/* 32 */            if (i2 == 0) {
/* 34 */                i2 = 1;
                    }
/* 35 */            this.f18236a = i2;
/* 37 */            return i2;
                }

                public abstract int size();

                public final String toString() {
                    String strConcat;
/* 1 */             Locale locale = Locale.ROOT;
/* 7 */             String hexString = Integer.toHexString(System.identityHashCode(this));
/* 11 */            int size = size();
/* 21 */            if (size() <= 50) {
/* 23 */                strConcat = yy1.m10222q(this);
                    } else {
/* 28 */                C2222tl c2222tl = (C2222tl) this;
/* 37 */                int iM9302b = m9302b(0, 47, c2222tl.size());
/* 64 */                strConcat = yy1.m10222q(iM9302b == 0 ? f18234b : new C2148rl(c2222tl.f17140d, c2222tl.mo8196f(), iM9302b)).concat("...");
                    }
/* 72 */            StringBuilder sb = new StringBuilder("<ByteString@");
/* 75 */            sb.append(hexString);
/* 80 */            sb.append(" size=");
/* 83 */            sb.append(size);
/* 88 */            sb.append(" contents=\"");
/* 93 */            return fm0.m3789o(sb, strConcat, "\">");
                }
            }
