            package p000;

            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.util.Arrays;
            import kotlin.text.Charsets;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vq0 {
                /* JADX INFO: renamed from: a */
                public static String m9312a(String str) throws NoSuchAlgorithmException {
/* 3 */             MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
/* 9 */             byte[] bytes = str.getBytes(Charsets.UTF_8);
/* 13 */            bytes.getClass();
/* 16 */            byte[] bArrDigest = messageDigest.digest(bytes);
/* 20 */            bArrDigest.getClass();
/* 24 */            String strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
/* 27 */            for (byte b : bArrDigest) {
/* 50 */                strConcat = strConcat.concat(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
                    }
/* 57 */            return strConcat;
                }
            }
