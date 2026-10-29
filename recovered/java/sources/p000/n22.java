            package p000;

            import java.io.Serializable;
            import java.util.regex.Pattern;
            import kotlin.text.Regex;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class n22 implements Serializable {

                /* JADX INFO: renamed from: c */
                public static final m22 f14104c = new m22(null);

                /* JADX INFO: renamed from: a */
                public final String f14105a;

                /* JADX INFO: renamed from: b */
                public final int f14106b;

                public n22(String str, int i) {
/* 1 */             str.getClass();
/* 7 */             this.f14105a = str;
/* 9 */             this.f14106b = i;
                }

                private final Object readResolve() {
/* 7 */             Pattern patternCompile = Pattern.compile(this.f14105a, this.f14106b);
/* 11 */            patternCompile.getClass();
/* 14 */            return new Regex(patternCompile);
                }
            }
