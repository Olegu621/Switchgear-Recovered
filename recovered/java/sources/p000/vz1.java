            package p000;

            import java.util.List;
            import kotlin.text.StringsKt__StringsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vz1 {
                /* JADX INFO: renamed from: a */
                public static wz1 m9357a(String str) throws C0900f0 {
/* 1 */             str.getClass();
/* 7 */             List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{"-"}, false, 0, 6, null);
/* 18 */            wz1 wz1Var = new wz1();
/* 26 */            if (listSplit$default.size() != 2) {
/* 74 */                throw new C0900f0("hash", str);
                    }
/* 42 */            wz1Var.f18878a = Integer.valueOf(Integer.parseInt((String) listSplit$default.get(0)));
/* 44 */            k42 k42Var = l42.Companion;
/* 53 */            int i = Integer.parseInt((String) listSplit$default.get(1));
/* 57 */            k42Var.getClass();
/* 64 */            wz1Var.f18879b = k42.m5948a(i);
/* 66 */            return wz1Var;
                }
            }
