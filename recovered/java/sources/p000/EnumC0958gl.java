            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: renamed from: gl */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class EnumC0958gl {
                public static final C0921fl Companion;

                /* JADX INFO: renamed from: a */
                public static final EnumC0958gl f8689a;

                /* JADX INFO: renamed from: b */
                public static final EnumC0958gl f8690b;

                /* JADX INFO: renamed from: c */
                public static final EnumC0958gl f8691c;

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ EnumC0958gl[] f8692d;

                static {
/* 6 */             EnumC0958gl enumC0958gl = new EnumC0958gl("HORIZONTAL", 0);
/* 9 */             f8689a = enumC0958gl;
/* 16 */            EnumC0958gl enumC0958gl2 = new EnumC0958gl("VERTICAL", 1);
/* 19 */            f8690b = enumC0958gl2;
/* 26 */            EnumC0958gl enumC0958gl3 = new EnumC0958gl("DEFAULT", 2);
/* 29 */            f8691c = enumC0958gl3;
/* 35 */            f8692d = new EnumC0958gl[]{enumC0958gl, enumC0958gl2, enumC0958gl3};
/* 44 */            Companion = new C0921fl();
                }

                public static EnumC0958gl valueOf(String str) {
/* 7 */             return (EnumC0958gl) Enum.valueOf(EnumC0958gl.class, str);
                }

                public static EnumC0958gl[] values() {
/* 7 */             return (EnumC0958gl[]) f8692d.clone();
                }
            }
