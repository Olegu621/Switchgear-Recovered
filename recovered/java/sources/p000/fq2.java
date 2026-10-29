            package p000;

            import io.sentry.android.core.AbstractC1245n0;
            import java.util.Arrays;
            import java.util.regex.Pattern;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fq2 {

                /* JADX INFO: renamed from: d */
                public static final Pattern f8319d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

                /* JADX INFO: renamed from: a */
                public final String f8320a;

                /* JADX INFO: renamed from: b */
                public final String f8321b;

                /* JADX INFO: renamed from: c */
                public final String f8322c;

                public fq2(String str, String str2) {
                    String strSubstring;
/* 4 */             if (str2 == null || !str2.startsWith("/topics/")) {
/* 45 */                strSubstring = str2;
                    } else {
/* 35 */                AbstractC1245n0.m4889q("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
/* 40 */                strSubstring = str2.substring(8);
                    }
/* 46 */            if (strSubstring == null || !f8319d.matcher(strSubstring).matches()) {
/* 81 */                C1951n4.m6859j(fm0.m3784j("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
/* 85 */                throw null;
                    }
/* 60 */            this.f8320a = strSubstring;
/* 62 */            this.f8321b = str;
/* 70 */            this.f8322c = AbstractC0886en.m3508l(str, "!", str2);
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof fq2)) {
/* 3 */                 return false;
                    }
/* 7 */             fq2 fq2Var = (fq2) obj;
                    return this.f8320a.equals(fq2Var.f8320a) && this.f8321b.equals(fq2Var.f8321b);
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.f8321b, this.f8320a});
                }
            }
