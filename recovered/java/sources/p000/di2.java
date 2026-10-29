            package p000;

            import java.util.NoSuchElementException;
            import kotlin.text.C1855h;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class di2 extends C1855h {
                /* JADX INFO: renamed from: w */
                public static String m3087w(int i, String str) {
/* 1 */             str.getClass();
/* 4 */             if (i < 0) {
/* 26 */                ds0.m3200q(AbstractC0886en.m3505i(i, "Requested character count ", " is less than zero."));
/* 29 */                return null;
                    }
/* 6 */             int length = str.length();
/* 10 */            if (i > length) {
/* 12 */                i = length;
                    }
/* 13 */            return str.substring(i);
                }

                /* JADX INFO: renamed from: x */
                public static char m3088x(CharSequence charSequence) {
/* 1 */             charSequence.getClass();
/* 8 */             if (charSequence.length() != 0) {
/* 16 */                return charSequence.charAt(charSequence.length() - 1);
                    }
/* 28 */            throw new NoSuchElementException("Char sequence is empty.");
                }

                /* JADX INFO: renamed from: y */
                public static String m3089y(int i, String str) {
/* 1 */             str.getClass();
/* 4 */             if (i < 0) {
/* 27 */                ds0.m3200q(AbstractC0886en.m3505i(i, "Requested character count ", " is less than zero."));
/* 30 */                return null;
                    }
/* 6 */             int length = str.length();
/* 10 */            if (i > length) {
/* 12 */                i = length;
                    }
/* 14 */            return str.substring(0, i);
                }
            }
