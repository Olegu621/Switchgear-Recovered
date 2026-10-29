            package p000;
            
            /* JADX WARN: Enum visitor error
            jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
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
            public final class gh0 {

                /* JADX INFO: renamed from: b */
                public static final gh0 f8610b;

                /* JADX INFO: renamed from: c */
                public static final gh0 f8611c;

                /* JADX INFO: renamed from: d */
                public static final gh0[] f8612d;

                /* JADX INFO: renamed from: e */
                public static final /* synthetic */ gh0[] f8613e;

                /* JADX INFO: renamed from: a */
                public final int f8614a;

                /* JADX INFO: Fake field, exist only in values array */
                gh0 EF0;

                static {
/* 3 */             f01 f01Var = f01.f7952e;
/* 12 */            gh0 gh0Var = new gh0("DOUBLE", 0, 0, 1, f01Var);
/* 17 */            f01 f01Var2 = f01.f7951d;
/* 26 */            gh0 gh0Var2 = new gh0("FLOAT", 1, 1, 1, f01Var2);
/* 33 */            f01 f01Var3 = f01.f7950c;
/* 42 */            gh0 gh0Var3 = new gh0("INT64", 2, 2, 1, f01Var3);
/* 54 */            gh0 gh0Var4 = new gh0("UINT64", 3, 3, 1, f01Var3);
/* 61 */            f01 f01Var4 = f01.f7949b;
/* 70 */            gh0 gh0Var5 = new gh0("INT32", 4, 4, 1, f01Var4);
/* 83 */            gh0 gh0Var6 = new gh0("FIXED64", 5, 5, 1, f01Var3);
/* 96 */            gh0 gh0Var7 = new gh0("FIXED32", 6, 6, 1, f01Var4);
/* 103 */           f01 f01Var5 = f01.f7953f;
/* 111 */           gh0 gh0Var8 = new gh0("BOOL", 7, 7, 1, f01Var5);
/* 118 */           f01 f01Var6 = f01.f7954i;
/* 128 */           gh0 gh0Var9 = new gh0("STRING", 8, 8, 1, f01Var6);
/* 135 */           f01 f01Var7 = f01.f7946U;
/* 145 */           gh0 gh0Var10 = new gh0("MESSAGE", 9, 9, 1, f01Var7);
/* 152 */           f01 f01Var8 = f01.f7955v;
/* 160 */           gh0 gh0Var11 = new gh0("BYTES", 10, 10, 1, f01Var8);
/* 177 */           gh0 gh0Var12 = new gh0("UINT32", 11, 11, 1, f01Var4);
/* 184 */           f01 f01Var9 = f01.f7956w;
/* 194 */           gh0 gh0Var13 = new gh0("ENUM", 12, 12, 1, f01Var9);
/* 209 */           gh0 gh0Var14 = new gh0("SFIXED32", 13, 13, 1, f01Var4);
/* 224 */           gh0 gh0Var15 = new gh0("SFIXED64", 14, 14, 1, f01Var3);
/* 241 */           gh0 gh0Var16 = new gh0("SINT32", 15, 15, 1, f01Var4);
/* 256 */           gh0 gh0Var17 = new gh0("SINT64", 16, 16, 1, f01Var3);
/* 271 */           gh0 gh0Var18 = new gh0("GROUP", 17, 17, 1, f01Var7);
/* 286 */           gh0 gh0Var19 = new gh0("DOUBLE_LIST", 18, 18, 2, f01Var);
/* 302 */           gh0 gh0Var20 = new gh0("FLOAT_LIST", 19, 19, 2, f01Var2);
/* 314 */           gh0 gh0Var21 = new gh0("INT64_LIST", 20, 20, 2, f01Var3);
/* 327 */           gh0 gh0Var22 = new gh0("UINT64_LIST", 21, 21, 2, f01Var3);
/* 342 */           gh0 gh0Var23 = new gh0("INT32_LIST", 22, 22, 2, f01Var4);
/* 355 */           gh0 gh0Var24 = new gh0("FIXED64_LIST", 23, 23, 2, f01Var3);
/* 368 */           gh0 gh0Var25 = new gh0("FIXED32_LIST", 24, 24, 2, f01Var4);
/* 385 */           gh0 gh0Var26 = new gh0("BOOL_LIST", 25, 25, 2, f01Var5);
/* 402 */           gh0 gh0Var27 = new gh0("STRING_LIST", 26, 26, 2, f01Var6);
/* 415 */           gh0 gh0Var28 = new gh0("MESSAGE_LIST", 27, 27, 2, f01Var7);
/* 430 */           gh0 gh0Var29 = new gh0("BYTES_LIST", 28, 28, 2, f01Var8);
/* 441 */           gh0 gh0Var30 = new gh0("UINT32_LIST", 29, 29, 2, f01Var4);
/* 456 */           gh0 gh0Var31 = new gh0("ENUM_LIST", 30, 30, 2, f01Var9);
/* 469 */           gh0 gh0Var32 = new gh0("SFIXED32_LIST", 31, 31, 2, f01Var4);
/* 482 */           gh0 gh0Var33 = new gh0("SFIXED64_LIST", 32, 32, 2, f01Var3);
/* 497 */           gh0 gh0Var34 = new gh0("SINT32_LIST", 33, 33, 2, f01Var4);
/* 512 */           gh0 gh0Var35 = new gh0("SINT64_LIST", 34, 34, 2, f01Var3);
/* 535 */           gh0 gh0Var36 = new gh0("DOUBLE_LIST_PACKED", 35, 35, 3, f01Var);
/* 538 */           f8610b = gh0Var36;
/* 552 */           gh0 gh0Var37 = new gh0("FLOAT_LIST_PACKED", 36, 36, 3, f01Var2);
/* 563 */           gh0 gh0Var38 = new gh0("INT64_LIST_PACKED", 37, 37, 3, f01Var3);
/* 576 */           gh0 gh0Var39 = new gh0("UINT64_LIST_PACKED", 38, 38, 3, f01Var3);
/* 593 */           gh0 gh0Var40 = new gh0("INT32_LIST_PACKED", 39, 39, 3, f01Var4);
/* 606 */           gh0 gh0Var41 = new gh0("FIXED64_LIST_PACKED", 40, 40, 3, f01Var3);
/* 619 */           gh0 gh0Var42 = new gh0("FIXED32_LIST_PACKED", 41, 41, 3, f01Var4);
/* 637 */           gh0 gh0Var43 = new gh0("BOOL_LIST_PACKED", 42, 42, 3, f01Var5);
/* 648 */           gh0 gh0Var44 = new gh0("UINT32_LIST_PACKED", 43, 43, 3, f01Var4);
/* 665 */           gh0 gh0Var45 = new gh0("ENUM_LIST_PACKED", 44, 44, 3, f01Var9);
/* 676 */           gh0 gh0Var46 = new gh0("SFIXED32_LIST_PACKED", 45, 45, 3, f01Var4);
/* 691 */           gh0 gh0Var47 = new gh0("SFIXED64_LIST_PACKED", 46, 46, 3, f01Var3);
/* 706 */           gh0 gh0Var48 = new gh0("SINT32_LIST_PACKED", 47, 47, 3, f01Var4);
/* 717 */           gh0 gh0Var49 = new gh0("SINT64_LIST_PACKED", 48, 48, 3, f01Var3);
/* 720 */           f8611c = gh0Var49;
/* 827 */           f8613e = new gh0[]{gh0Var, gh0Var2, gh0Var3, gh0Var4, gh0Var5, gh0Var6, gh0Var7, gh0Var8, gh0Var9, gh0Var10, gh0Var11, gh0Var12, gh0Var13, gh0Var14, gh0Var15, gh0Var16, gh0Var17, gh0Var18, gh0Var19, gh0Var20, gh0Var21, gh0Var22, gh0Var23, gh0Var24, gh0Var25, gh0Var26, gh0Var27, gh0Var28, gh0Var29, gh0Var30, gh0Var31, gh0Var32, gh0Var33, gh0Var34, gh0Var35, gh0Var36, gh0Var37, gh0Var38, gh0Var39, gh0Var40, gh0Var41, gh0Var42, gh0Var43, gh0Var44, gh0Var45, gh0Var46, gh0Var47, gh0Var48, gh0Var49, new gh0("GROUP_LIST", 49, 49, 2, f01Var7), new gh0("MAP", 50, 50, 4, f01.f7948a)};
/* 829 */           gh0[] gh0VarArrValues = values();
/* 836 */           f8612d = new gh0[gh0VarArrValues.length];
/* 840 */           for (gh0 gh0Var50 : gh0VarArrValues) {
/* 848 */               f8612d[gh0Var50.f8614a] = gh0Var50;
                    }
                }

                public gh0(String str, int i, int i2, int i3, f01 f01Var) {
/* 1 */             super(str, i);
/* 4 */             this.f8614a = i2;
/* 6 */             int iM3520y = AbstractC0886en.m3520y(i3);
/* 11 */            if (iM3520y == 1 || iM3520y == 3) {
/* 17 */                f01Var.getClass();
                    }
/* 24 */            if (i3 == 1) {
/* 26 */                f01Var.ordinal();
                    }
                }

                public static gh0 valueOf(String str) {
/* 7 */             return (gh0) Enum.valueOf(gh0.class, str);
                }

                public static gh0[] values() {
/* 7 */             return (gh0[]) f8613e.clone();
                }
            }
