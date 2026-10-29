            package p000;

            import kotlin.text.C1852e;
            import kotlin.text.CharsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class c50 {
                /* JADX INFO: renamed from: a */
                public static String m1531a(int i, long j) throws C0900f0 {
/* 5 */             long j2 = j / 100;
/* 6 */             vy0.Companion.getClass();
/* 14 */            String string = Long.toString(j2, CharsKt.checkRadix(2));
/* 18 */            string.getClass();
/* 25 */            if (string.length() <= i && j2 >= 0) {
                        return string.length() < i ? fm0.m3783i(C1852e.m6260j(i - string.length(), "0"), string) : string;
                    }
/* 82 */            throw new C0900f0(j2 + " too large to encode into " + i, 3);
                }
            }
