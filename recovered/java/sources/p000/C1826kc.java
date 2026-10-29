            package p000;

            import android.content.ContextWrapper;
            import android.util.Base64;
            import io.sentry.android.core.AbstractC1245n0;
            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.util.Arrays;
            
            /* JADX INFO: renamed from: kc */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1826kc extends ContextWrapper {
                /* JADX INFO: renamed from: a */
                public static String m6076a(String str, String str2) {
/* 17 */            String str3 = str + ' ' + str2;
                    try {
/* 23 */                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
/* 27 */                Charset charset = StandardCharsets.UTF_8;
/* 29 */                charset.getClass();
/* 32 */                byte[] bytes = str3.getBytes(charset);
/* 36 */                bytes.getClass();
/* 39 */                messageDigest.update(bytes);
/* 54 */                String strEncodeToString = Base64.encodeToString(Arrays.copyOfRange(messageDigest.digest(), 0, 9), 3);
/* 58 */                strEncodeToString.getClass();
/* 63 */                return strEncodeToString.substring(0, 11);
                    } catch (NoSuchAlgorithmException e) {
/* 73 */                AbstractC1245n0.m4877e("kc", "hash:NoSuchAlgorithm", e);
/* 76 */                return null;
                    }
                }
            }
