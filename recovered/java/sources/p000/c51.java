            package p000;

            import java.util.Locale;
            import kotlin.ranges.IntRange;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class c51 {
                /* JADX INFO: renamed from: a */
                public static String m1532a(int i, String str) throws C0900f0 {
/* 5 */             int i2 = 2;
/* 6 */             if (i != str.length() || str.length() % 2 != 0) {
/* 114 */               throw new C0900f0("Invalid bit length for language", i2);
                    }
/* 19 */            int length = str.length() / 2;
/* 20 */            uy0 uy0Var = vy0.Companion;
/* 28 */            IntRange intRange = new IntRange(0, length - 1, 1);
/* 31 */            boolean zIsEmpty = intRange.isEmpty();
/* 35 */            String strSubstring = HttpUrl.FRAGMENT_ENCODE_SET;
/* 44 */            String strSubstring2 = zIsEmpty ? HttpUrl.FRAGMENT_ENCODE_SET : str.substring(0, intRange.f12927b + 1);
/* 48 */            uy0Var.getClass();
/* 57 */            long jM9146a = uy0.m9146a(length, strSubstring2) + 65;
/* 65 */            IntRange intRange2 = new IntRange(length, str.length() - 1, 1);
/* 72 */            if (!intRange2.isEmpty()) {
/* 78 */                strSubstring = str.substring(length, intRange2.f12927b + 1);
                    }
/* 90 */            char cM9146a = (char) (uy0.m9146a(length, strSubstring) + 65);
/* 93 */            StringBuilder sb = new StringBuilder();
/* 96 */            sb.append((char) jM9146a);
/* 99 */            sb.append(cM9146a);
/* 102 */           return sb.toString();
                }

                /* JADX INFO: renamed from: b */
                public static String m1533b(int i, String str) throws C0900f0 {
/* 1 */             str.getClass();
/* 6 */             String upperCase = str.toUpperCase(Locale.ROOT);
/* 10 */            upperCase.getClass();
/* 19 */            int iCharAt = ((byte) upperCase.charAt(0)) - 65;
/* 27 */            int iCharAt2 = ((byte) upperCase.charAt(1)) - 65;
/* 29 */            int i2 = 3;
/* 30 */            if (iCharAt < 0 || iCharAt > 25 || iCharAt2 < 0 || iCharAt2 > 25) {
/* 99 */                throw new C0900f0("Invalid Language Code: ".concat(upperCase), i2);
                    }
/* 42 */            if (i % 2 == 1) {
/* 87 */                throw new C0900f0(AbstractC0886en.m3505i(i, "numBits must be even, ", " is not valid"), i2);
                    }
/* 44 */            int i3 = i / 2;
/* 46 */            uy0 uy0Var = vy0.Companion;
/* 50 */            uh2 uh2Var = new uh2(iCharAt);
/* 53 */            uy0Var.getClass();
/* 69 */            return uy0.m9147b(uh2Var, i3).concat(uy0.m9147b(new uh2(iCharAt2), i3));
                }
            }
