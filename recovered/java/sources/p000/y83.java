            package p000;
            
            /* JADX WARN: Enum visitor error
            jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
            	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
            	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
            	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
            	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
            	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
            	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
             */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class y83 {

                /* JADX INFO: renamed from: c */
                public static final u83 f19521c;

                /* JADX INFO: renamed from: d */
                public static final v83 f19522d;

                /* JADX INFO: renamed from: e */
                public static final w83 f19523e;

                /* JADX INFO: renamed from: f */
                public static final /* synthetic */ y83[] f19524f;

                /* JADX INFO: renamed from: a */
                public final z83 f19525a;

                /* JADX INFO: renamed from: b */
                public final int f19526b;

                /* JADX INFO: Fake field, exist only in values array */
                y83 EF0;

                /* JADX INFO: Fake field, exist only in values array */
                y83 EF1;

                /* JADX INFO: Fake field, exist only in values array */
                y83 EF2;

                static {
/* 9 */             y83 y83Var = new y83("DOUBLE", 0, z83.f19986d, 1);
/* 19 */            y83 y83Var2 = new y83("FLOAT", 1, z83.f19985c, 5);
/* 24 */            z83 z83Var = z83.f19984b;
/* 29 */            y83 y83Var3 = new y83("INT64", 2, z83Var, 0);
/* 37 */            y83 y83Var4 = new y83("UINT64", 3, z83Var, 0);
/* 42 */            z83 z83Var2 = z83.f19983a;
/* 47 */            y83 y83Var5 = new y83("INT32", 4, z83Var2, 0);
/* 54 */            y83 y83Var6 = new y83("FIXED64", 5, z83Var, 1);
/* 64 */            y83 y83Var7 = new y83("FIXED32", 6, z83Var2, 5);
/* 76 */            y83 y83Var8 = new y83("BOOL", 7, z83.f19987e, 0);
/* 89 */            u83 u83Var = new u83("STRING", 8, z83.f19988f, 2);
/* 92 */            f19521c = u83Var;
/* 96 */            z83 z83Var3 = z83.f19991w;
/* 104 */           v83 v83Var = new v83("GROUP", 9, z83Var3, 3);
/* 107 */           f19522d = v83Var;
/* 122 */           w83 w83Var = new w83("MESSAGE", 10, z83Var3, 2);
/* 125 */           f19523e = w83Var;
/* 268 */           f19524f = new y83[]{y83Var, y83Var2, y83Var3, y83Var4, y83Var5, y83Var6, y83Var7, y83Var8, u83Var, v83Var, w83Var, new x83("BYTES", 11, z83.f19989i, 2), new y83("UINT32", 12, z83Var2, 0), new y83("ENUM", 13, z83.f19990v, 0), new y83("SFIXED32", 14, z83Var2, 5), new y83("SFIXED64", 15, z83Var, 1), new y83("SINT32", 16, z83Var2, 0), new y83("SINT64", 17, z83Var, 0)};
                }

                public y83(String str, int i, z83 z83Var, int i2) {
/* 1 */             super(str, i);
/* 4 */             this.f19525a = z83Var;
/* 6 */             this.f19526b = i2;
                }

                public static y83 valueOf(String str) {
/* 7 */             return (y83) Enum.valueOf(y83.class, str);
                }

                public static y83[] values() {
/* 7 */             return (y83[]) f19524f.clone();
                }
            }
