            package kotlin.text;

            import kotlin.Metadata;
            import kotlin.ranges.IntRange;
            import okhttp3.HttpUrl;
            import p000.fm0;
            
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m6176d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "radix", "checkRadix", "(I)I", "kotlin-stdlib"}, m6177k = 5, m6178mv = {2, 2, 0}, m6180xi = 49, m6181xs = "kotlin/text/CharsKt")
            public class CharsKt__CharJVMKt {
                /* JADX INFO: renamed from: a */
                public static final boolean m6221a(char c) {
                    return Character.isWhitespace(c) || Character.isSpaceChar(c);
                }

                public static int checkRadix(int i) {
/* 2 */             if (2 <= i && i < 37) {
/* 8 */                 return i;
                    }
/* 15 */            StringBuilder sbM3793s = fm0.m3793s(i, "radix ", " was not in valid range ");
/* 27 */            sbM3793s.append(new IntRange(2, 36, 1));
/* 37 */            throw new IllegalArgumentException(sbM3793s.toString());
                }
            }
