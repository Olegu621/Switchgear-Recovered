            package p000;

            import java.util.Locale;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class h91 {

                /* JADX INFO: renamed from: b */
                public static final h91 f8972b = new h91(new i91(g91.m3895a(new Locale[0])));

                /* JADX INFO: renamed from: a */
                public final i91 f8973a;

                public h91(i91 i91Var) {
/* 4 */             this.f8973a = i91Var;
                }

                /* JADX INFO: renamed from: a */
                public static h91 m4135a(String str) {
/* 1 */             if (str == null || str.isEmpty()) {
/* 49 */                return f8972b;
                    }
/* 13 */            String[] strArrSplit = str.split(",", -1);
/* 17 */            int length = strArrSplit.length;
/* 18 */            Locale[] localeArr = new Locale[length];
/* 21 */            for (int i = 0; i < length; i++) {
/* 29 */                localeArr[i] = f91.m3680a(strArrSplit[i]);
                    }
/* 45 */            return new h91(new i91(g91.m3895a(localeArr)));
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof h91) {
                        return this.f8973a.equals(((h91) obj).f8973a);
                    }
/* 19 */            return false;
                }

                public final int hashCode() {
/* 5 */             return this.f8973a.f9500a.hashCode();
                }

                public final String toString() {
/* 5 */             return this.f8973a.f9500a.toString();
                }
            }
