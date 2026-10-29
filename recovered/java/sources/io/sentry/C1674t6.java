            package io.sentry;

            import io.sentry.exception.C1441b;
            import io.sentry.protocol.C1626w;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            
            /* JADX INFO: renamed from: io.sentry.t6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 76 */    public final class C1674t6 {

                /* JADX INFO: renamed from: d */
                public static final Pattern f11674d = Pattern.compile("^[ \\t]*([0-9a-f]{32})-([0-9a-f]{16})(-[01])?[ \\t]*$", 2);

                /* JADX INFO: renamed from: a */
                public final C1626w f11675a;

                /* JADX INFO: renamed from: b */
                public final C1430d7 f11676b;

                /* JADX INFO: renamed from: c */
                public final Boolean f11677c;

                public C1674t6(String str) throws C1441b {
/* 6 */             Matcher matcher = f11674d.matcher(str);
/* 15 */            if (!matcher.matches()) {
/* 77 */                throw new C1441b("sentry-trace header does not conform to expected format: ".concat(str), null);
                    }
/* 27 */            this.f11675a = new C1626w(matcher.group(1));
/* 39 */            this.f11676b = new C1430d7(matcher.group(2));
/* 42 */            String strGroup = matcher.group(3);
/* 63 */            this.f11677c = strGroup != null ? Boolean.valueOf("1".equals(strGroup.substring(1))) : null;
                }

                /* JADX INFO: renamed from: a */
                public final String m5414a() {
/* 1 */             C1430d7 c1430d7 = this.f11676b;
/* 5 */             Boolean bool = this.f11677c;
/* 7 */             C1626w c1626w = this.f11675a;
/* 9 */             if (bool == null) {
/* 61 */                return c1626w + "-" + c1430d7;
                    }
/* 42 */            return c1626w + "-" + c1430d7 + "-" + (bool.booleanValue() ? "1" : "0");
                }

/* 77 */        public C1674t6(C1626w c1626w, C1430d7 c1430d7, Boolean bool) {
/* 79 */            this.f11675a = c1626w;
/* 80 */            this.f11676b = c1430d7;
/* 81 */            this.f11677c = bool;
                }
            }
