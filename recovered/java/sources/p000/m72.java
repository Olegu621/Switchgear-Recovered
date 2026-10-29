            package p000;

            import java.util.Arrays;
            import java.util.List;
            import java.util.regex.Pattern;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class m72 {

                /* JADX INFO: renamed from: a */
                public static final Pattern f13647a = Pattern.compile("^[\\p{L}\\p{N}-]+_platform_\\d{17}-[0-9a-z]{15}$");

                /* JADX INFO: renamed from: a */
                public static void m6617a(String str, String str2) {
/* 5 */             if (!b40.m1232p(str)) {
/* 17 */                List listAsList = Arrays.asList(str.trim().split("\\."));
/* 26 */                if (listAsList.size() >= 3 && !listAsList.contains(HttpUrl.FRAGMENT_ENCODE_SET)) {
/* 40 */                    if (!b40.m1234r(str2) || !f13647a.matcher(str2).matches()) {
/* 62 */                        throw new C2086px("The platform id used in the Helpshift.install() is not valid!");
                            }
/* 54 */                    return;
                        }
                    }
/* 70 */            throw new C2086px("The domain name used in the Helpshift.install() is not valid!");
                }
            }
