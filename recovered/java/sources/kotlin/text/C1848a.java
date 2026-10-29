            package kotlin.text;
            
            /* JADX INFO: renamed from: kotlin.text.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class C1848a extends CharsKt__CharJVMKt {
                /* JADX INFO: renamed from: b */
                public static final boolean m6251b(char c, char c2, boolean z) {
/* 2 */             if (c == c2) {
/* 1 */                 return true;
                    }
/* 6 */             if (!z) {
/* 5 */                 return false;
                    }
/* 9 */             char upperCase = Character.toUpperCase(c);
/* 13 */            char upperCase2 = Character.toUpperCase(c2);
                    return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
                }
            }
