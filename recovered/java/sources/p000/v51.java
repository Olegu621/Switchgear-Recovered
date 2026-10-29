            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class v51 {

                /* JADX INFO: renamed from: a */
                public static final v51 f17865a;

                /* JADX INFO: renamed from: b */
                public static final v51 f17866b;

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ v51[] f17867c;

                /* JADX INFO: Fake field, exist only in values array */
                v51 EF0;

                static {
/* 6 */             v51 v51Var = new v51("SYNCHRONIZED", 0);
/* 14 */            v51 v51Var2 = new v51("PUBLICATION", 1);
/* 17 */            f17865a = v51Var2;
/* 24 */            v51 v51Var3 = new v51("NONE", 2);
/* 27 */            f17866b = v51Var3;
/* 33 */            f17867c = new v51[]{v51Var, v51Var2, v51Var3};
                }

                public static v51 valueOf(String str) {
/* 7 */             return (v51) Enum.valueOf(v51.class, str);
                }

                public static v51[] values() {
/* 7 */             return (v51[]) f17867c.clone();
                }
            }
