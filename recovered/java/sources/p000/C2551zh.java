            package p000;

            import java.util.Map;
            import kotlin.text.C1852e;
            import kotlin.text.CharsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: zh */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2551zh {
                /* JADX INFO: renamed from: a */
                public static String m10353a(String str) throws C0900f0 {
/* 1 */             str.getClass();
                    try {
/* 5 */                 int length = str.length();
/* 9 */                 String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 12 */                for (int i = 0; i < length; i++) {
/* 34 */                    Integer num = (Integer) ((Map) AbstractC0020ai.f288a.getValue()).get(String.valueOf(str.charAt(i)));
/* 36 */                    if (num == null) {
/* 108 */                       throw new C0900f0("Invalid value on index " + i, 2);
                            }
/* 46 */                    String string = Integer.toString(num.intValue(), CharsKt.checkRadix(2));
/* 50 */                    string.getClass();
/* 79 */                    str2 = str2 + C1852e.m6260j(6 - string.length(), "0") + string;
                        }
/* 109 */               return str2;
                    } catch (Exception unused) {
/* 117 */               throw new C0900f0("Invalid encoded Base64URL string", 2);
                    }
                }
            }
