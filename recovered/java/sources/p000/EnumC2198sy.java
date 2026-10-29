            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: renamed from: sy */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class EnumC2198sy {

                /* JADX INFO: renamed from: a */
                public static final EnumC2198sy f16864a;

                /* JADX INFO: renamed from: b */
                public static final EnumC2198sy f16865b;

                /* JADX INFO: renamed from: c */
                public static final EnumC2198sy f16866c;

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ EnumC2198sy[] f16867d;

                static {
/* 6 */             EnumC2198sy enumC2198sy = new EnumC2198sy("ALWAYS_OVERRIDE", 0);
/* 9 */             f16864a = enumC2198sy;
/* 16 */            EnumC2198sy enumC2198sy2 = new EnumC2198sy("HIGH_PRIORITY_REQUIRED", 1);
/* 24 */            EnumC2198sy enumC2198sy3 = new EnumC2198sy("REQUIRED", 2);
/* 27 */            f16865b = enumC2198sy3;
/* 34 */            EnumC2198sy enumC2198sy4 = new EnumC2198sy("OPTIONAL", 3);
/* 37 */            f16866c = enumC2198sy4;
/* 43 */            f16867d = new EnumC2198sy[]{enumC2198sy, enumC2198sy2, enumC2198sy3, enumC2198sy4};
                }

                public static EnumC2198sy valueOf(String str) {
/* 7 */             return (EnumC2198sy) Enum.valueOf(EnumC2198sy.class, str);
                }

                public static EnumC2198sy[] values() {
/* 7 */             return (EnumC2198sy[]) f16867d.clone();
                }
            }
