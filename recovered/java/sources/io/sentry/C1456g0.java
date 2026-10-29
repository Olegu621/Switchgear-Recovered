            package io.sentry;

            import java.util.Objects;
            import java.util.regex.Pattern;
            
            /* JADX INFO: renamed from: io.sentry.g0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1456g0 {

                /* JADX INFO: renamed from: a */
                public final String f10950a;

                /* JADX INFO: renamed from: b */
                public final Pattern f10951b;

                public C1456g0(String str) {
                    Pattern patternCompile;
/* 4 */             this.f10950a = str;
                    try {
/* 6 */                 patternCompile = Pattern.compile(str);
                    } catch (Throwable unused) {
/* 31 */                AbstractC1552m4.m5357b().mo5092l().getLogger().mo4672k(EnumC1553m5.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
/* 34 */                patternCompile = null;
                    }
/* 35 */            this.f10951b = patternCompile;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == null || C1456g0.class != obj.getClass()) {
/* 23 */                return false;
                    }
/* 18 */            return Objects.equals(this.f10950a, ((C1456g0) obj).f10950a);
                }

                public final int hashCode() {
/* 7 */             return Objects.hash(this.f10950a);
                }
            }
