            package p000;

            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.util.Locale;
            import java.util.regex.Pattern;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class r13 {
                static {
/* 4 */             Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+$", 2);
/* 9 */             Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeyVersions/([0-9a-zA-Z\\-\\.\\_~])+$", 2);
                }

                /* JADX INFO: renamed from: a */
                public static void m8049a(int i) {
/* 3 */             if (i != 16 && i != 32) {
/* 31 */                throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
                    }
                }

                /* JADX INFO: renamed from: b */
                public static String m8050b(String str) {
/* 13 */            if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
/* 17 */                return str.substring(19);
                    }
/* 24 */            C1951n4.m6859j("key URI must start with android-keystore://");
/* 27 */            return null;
                }

                /* JADX INFO: renamed from: c */
                public static void m8051c(int i) throws GeneralSecurityException {
/* 1 */             if (i < 0 || i > 0) {
/* 30 */                throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", Integer.valueOf(i), 0));
                    }
                }
            }
