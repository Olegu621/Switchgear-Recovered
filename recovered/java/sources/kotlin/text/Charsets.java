            package kotlin.text;

            import java.nio.charset.Charset;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m6176d2 = {"Lkotlin/text/Charsets;", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/nio/charset/Charset;", "UTF_8", "Ljava/nio/charset/Charset;", "kotlin-stdlib"}, m6177k = 1, m6178mv = {2, 2, 0}, m6180xi = 48)
            public final class Charsets {
                public static final Charset UTF_8;

                /* JADX INFO: renamed from: a */
                public static final Charsets f12932a = new Charsets();

                /* JADX INFO: renamed from: b */
                public static volatile Charset f12933b;

                /* JADX INFO: renamed from: c */
                public static volatile Charset f12934c;

                static {
/* 10 */            Charset charsetForName = Charset.forName("UTF-8");
/* 14 */            charsetForName.getClass();
/* 17 */            UTF_8 = charsetForName;
/* 25 */            Charset.forName("UTF-16").getClass();
/* 34 */            Charset.forName("UTF-16BE").getClass();
/* 43 */            Charset.forName("UTF-16LE").getClass();
/* 52 */            Charset.forName("US-ASCII").getClass();
/* 61 */            Charset.forName("ISO-8859-1").getClass();
                }
            }
