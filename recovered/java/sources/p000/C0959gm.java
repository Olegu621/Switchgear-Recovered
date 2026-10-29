            package p000;

            import java.nio.charset.Charset;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Set;
            import java.util.regex.Pattern;
            
            /* JADX INFO: renamed from: gm */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0959gm {

                /* JADX INFO: renamed from: c */
                public static final String f8706c;

                /* JADX INFO: renamed from: d */
                public static final Set f8707d;

                /* JADX INFO: renamed from: e */
                public static final C0959gm f8708e;

                /* JADX INFO: renamed from: f */
                public static final C0959gm f8709f;

                /* JADX INFO: renamed from: a */
                public final String f8710a;

                /* JADX INFO: renamed from: b */
                public final String f8711b;

                static {
/* 5 */             String strM9452v = w11.m9452v("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
/* 9 */             f8706c = strM9452v;
/* 15 */            String strM9452v2 = w11.m9452v("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
/* 23 */            String strM9452v3 = w11.m9452v("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
/* 58 */            f8707d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new vd0("proto"), new vd0("json"))));
/* 66 */            f8708e = new C0959gm(strM9452v, null);
/* 73 */            f8709f = new C0959gm(strM9452v2, strM9452v3);
                }

                public C0959gm(String str, String str2) {
/* 4 */             this.f8710a = str;
/* 6 */             this.f8711b = str2;
                }

                /* JADX INFO: renamed from: a */
                public static C0959gm m3973a(byte[] bArr) {
/* 9 */             String str = new String(bArr, Charset.forName("UTF-8"));
/* 19 */            if (!str.startsWith("1$")) {
/* 79 */                C1951n4.m6859j("Version marker missing from extras");
/* 18 */                return null;
                    }
/* 32 */            String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
/* 37 */            if (strArrSplit.length != 2) {
/* 73 */                C1951n4.m6859j("Extra is not a valid encoded LegacyFlgDestination");
/* 18 */                return null;
                    }
/* 40 */            String str2 = strArrSplit[0];
/* 46 */            if (str2.isEmpty()) {
/* 67 */                C1951n4.m6859j("Missing endpoint in CCTDestination extras");
/* 18 */                return null;
                    }
/* 49 */            String str3 = strArrSplit[1];
/* 61 */            return new C0959gm(str2, str3.isEmpty() ? null : str3);
                }
            }
