            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ij0 {
                /* JADX INFO: renamed from: a */
                public static u13 m4550a(Integer num, String str) throws C0900f0 {
/* 9 */             if (str.length() != num.intValue()) {
/* 60 */                throw new C0900f0("bitfield encoding length mismatch", 2);
                    }
/* 13 */            u13 u13Var = new u13();
/* 17 */            int i = 0;
/* 22 */            for (int i2 = 0; i2 < str.length(); i2++) {
/* 24 */                char cCharAt = str.charAt(i2);
/* 28 */                i++;
/* 32 */                AbstractC0883ek.Companion.getClass();
/* 37 */                if (cCharAt == '1') {
/* 39 */                    u13Var.m8935b(i);
                        }
                    }
/* 49 */            u13Var.f17330a = str.length();
/* 51 */            return u13Var;
                }

                /* JADX INFO: renamed from: b */
                public static String m4551b(u13 u13Var, Integer num) {
/* 1 */             u13Var.getClass();
/* 11 */            int iIntValue = num != null ? num.intValue() : u13Var.f17331b;
/* 15 */            StringBuilder sb = new StringBuilder();
/* 18 */            int i = 1;
/* 19 */            if (1 <= iIntValue) {
                        while (true) {
/* 21 */                    C0847dk c0847dk = AbstractC0883ek.Companion;
/* 23 */                    boolean zM8934a = u13Var.m8934a(i);
/* 27 */                    c0847dk.getClass();
/* 34 */                    sb.append(C0847dk.m3142a(zM8934a));
/* 37 */                    if (i == iIntValue) {
                                break;
                            }
/* 39 */                    i++;
                        }
                    }
/* 42 */            return sb.toString();
                }
            }
