            package p000;

            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class yh2 {
                /* JADX INFO: renamed from: a */
                public static void m10149a(StringBuilder sb, Object obj, Function1 function1) {
/* 1 */             if (function1 != null) {
/* 9 */                 sb.append((CharSequence) function1.invoke(obj));
/* 12 */                return;
                    }
/* 19 */            if (obj == null ? true : obj instanceof CharSequence) {
/* 23 */                sb.append((CharSequence) obj);
                    } else if (obj instanceof Character) {
/* 37 */                sb.append(((Character) obj).charValue());
                    } else {
/* 45 */                sb.append((CharSequence) obj.toString());
                    }
                }
            }
