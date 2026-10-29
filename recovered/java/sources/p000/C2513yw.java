            package p000;

            import kotlin.text.C1848a;
            import kotlin.text.CharsKt;
            import kotlin.text.StringsKt;
            
            /* JADX INFO: renamed from: yw */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2513yw {
                /* JADX INFO: renamed from: a */
                public static final String m10187a(C2513yw c2513yw, int i) {
/* 1 */             c2513yw.getClass();
/* 10 */            String string = Integer.toString(i, CharsKt.checkRadix(16));
/* 14 */            string.getClass();
/* 18 */            return StringsKt.m6232H(2, string);
                }

                /* JADX INFO: renamed from: b */
                public static C2566zw m10188b(String str) {
/* 1 */             str.getClass();
/* 9 */             if (str.length() > 0 && C1848a.m6251b(str.charAt(0), '#', false)) {
/* 24 */                str = str.substring(1);
                    }
/* 29 */            String strSubstring = str.substring(0, 2);
/* 34 */            String strSubstring2 = str.substring(2, 4);
/* 71 */            return new C2566zw(Integer.parseInt(strSubstring, CharsKt.checkRadix(16)), Integer.parseInt(str.substring(4, 6), CharsKt.checkRadix(16)), Integer.parseInt(strSubstring2, CharsKt.checkRadix(16)));
                }
            }
