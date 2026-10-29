            package p000;

            import java.nio.charset.Charset;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class wh2 {

                /* JADX INFO: renamed from: a */
                public static final String f18630a;

                /* JADX INFO: renamed from: b */
                public static final boolean f18631b;

                static {
/* 5 */             String strName = Charset.defaultCharset().name();
/* 9 */             f18630a = strName;
/* 31 */            f18631b = "SJIS".equalsIgnoreCase(strName) || "EUC_JP".equalsIgnoreCase(strName);
                }
            }
