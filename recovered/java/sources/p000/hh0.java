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
            public final class hh0 {

                /* JADX INFO: renamed from: b */
                public static final hh0 f9077b;

                /* JADX INFO: renamed from: c */
                public static final hh0 f9078c;

                /* JADX INFO: renamed from: d */
                public static final hh0[] f9079d;

                /* JADX INFO: renamed from: e */
                public static final /* synthetic */ hh0[] f9080e;

                /* JADX INFO: renamed from: a */
                public final int f9081a;

                /* JADX INFO: Fake field, exist only in values array */
                hh0 EF0;

                static {
/* 3 */             g01 g01Var = g01.f8419e;
/* 12 */            hh0 hh0Var = new hh0("DOUBLE", 0, 0, 1, g01Var);
/* 17 */            g01 g01Var2 = g01.f8418d;
/* 26 */            hh0 hh0Var2 = new hh0("FLOAT", 1, 1, 1, g01Var2);
/* 33 */            g01 g01Var3 = g01.f8417c;
/* 42 */            hh0 hh0Var3 = new hh0("INT64", 2, 2, 1, g01Var3);
/* 54 */            hh0 hh0Var4 = new hh0("UINT64", 3, 3, 1, g01Var3);
/* 61 */            g01 g01Var4 = g01.f8416b;
/* 70 */            hh0 hh0Var5 = new hh0("INT32", 4, 4, 1, g01Var4);
/* 83 */            hh0 hh0Var6 = new hh0("FIXED64", 5, 5, 1, g01Var3);
/* 96 */            hh0 hh0Var7 = new hh0("FIXED32", 6, 6, 1, g01Var4);
/* 103 */           g01 g01Var5 = g01.f8420f;
/* 111 */           hh0 hh0Var8 = new hh0("BOOL", 7, 7, 1, g01Var5);
/* 118 */           g01 g01Var6 = g01.f8421i;
/* 128 */           hh0 hh0Var9 = new hh0("STRING", 8, 8, 1, g01Var6);
/* 135 */           g01 g01Var7 = g01.f8413U;
/* 145 */           hh0 hh0Var10 = new hh0("MESSAGE", 9, 9, 1, g01Var7);
/* 152 */           g01 g01Var8 = g01.f8422v;
/* 160 */           hh0 hh0Var11 = new hh0("BYTES", 10, 10, 1, g01Var8);
/* 177 */           hh0 hh0Var12 = new hh0("UINT32", 11, 11, 1, g01Var4);
/* 184 */           g01 g01Var9 = g01.f8423w;
/* 194 */           hh0 hh0Var13 = new hh0("ENUM", 12, 12, 1, g01Var9);
/* 209 */           hh0 hh0Var14 = new hh0("SFIXED32", 13, 13, 1, g01Var4);
/* 224 */           hh0 hh0Var15 = new hh0("SFIXED64", 14, 14, 1, g01Var3);
/* 241 */           hh0 hh0Var16 = new hh0("SINT32", 15, 15, 1, g01Var4);
/* 256 */           hh0 hh0Var17 = new hh0("SINT64", 16, 16, 1, g01Var3);
/* 271 */           hh0 hh0Var18 = new hh0("GROUP", 17, 17, 1, g01Var7);
/* 286 */           hh0 hh0Var19 = new hh0("DOUBLE_LIST", 18, 18, 2, g01Var);
/* 302 */           hh0 hh0Var20 = new hh0("FLOAT_LIST", 19, 19, 2, g01Var2);
/* 314 */           hh0 hh0Var21 = new hh0("INT64_LIST", 20, 20, 2, g01Var3);
/* 327 */           hh0 hh0Var22 = new hh0("UINT64_LIST", 21, 21, 2, g01Var3);
/* 342 */           hh0 hh0Var23 = new hh0("INT32_LIST", 22, 22, 2, g01Var4);
/* 355 */           hh0 hh0Var24 = new hh0("FIXED64_LIST", 23, 23, 2, g01Var3);
/* 368 */           hh0 hh0Var25 = new hh0("FIXED32_LIST", 24, 24, 2, g01Var4);
/* 385 */           hh0 hh0Var26 = new hh0("BOOL_LIST", 25, 25, 2, g01Var5);
/* 402 */           hh0 hh0Var27 = new hh0("STRING_LIST", 26, 26, 2, g01Var6);
/* 415 */           hh0 hh0Var28 = new hh0("MESSAGE_LIST", 27, 27, 2, g01Var7);
/* 430 */           hh0 hh0Var29 = new hh0("BYTES_LIST", 28, 28, 2, g01Var8);
/* 441 */           hh0 hh0Var30 = new hh0("UINT32_LIST", 29, 29, 2, g01Var4);
/* 456 */           hh0 hh0Var31 = new hh0("ENUM_LIST", 30, 30, 2, g01Var9);
/* 469 */           hh0 hh0Var32 = new hh0("SFIXED32_LIST", 31, 31, 2, g01Var4);
/* 482 */           hh0 hh0Var33 = new hh0("SFIXED64_LIST", 32, 32, 2, g01Var3);
/* 497 */           hh0 hh0Var34 = new hh0("SINT32_LIST", 33, 33, 2, g01Var4);
/* 512 */           hh0 hh0Var35 = new hh0("SINT64_LIST", 34, 34, 2, g01Var3);
/* 535 */           hh0 hh0Var36 = new hh0("DOUBLE_LIST_PACKED", 35, 35, 3, g01Var);
/* 538 */           f9077b = hh0Var36;
/* 552 */           hh0 hh0Var37 = new hh0("FLOAT_LIST_PACKED", 36, 36, 3, g01Var2);
/* 563 */           hh0 hh0Var38 = new hh0("INT64_LIST_PACKED", 37, 37, 3, g01Var3);
/* 576 */           hh0 hh0Var39 = new hh0("UINT64_LIST_PACKED", 38, 38, 3, g01Var3);
/* 593 */           hh0 hh0Var40 = new hh0("INT32_LIST_PACKED", 39, 39, 3, g01Var4);
/* 606 */           hh0 hh0Var41 = new hh0("FIXED64_LIST_PACKED", 40, 40, 3, g01Var3);
/* 619 */           hh0 hh0Var42 = new hh0("FIXED32_LIST_PACKED", 41, 41, 3, g01Var4);
/* 637 */           hh0 hh0Var43 = new hh0("BOOL_LIST_PACKED", 42, 42, 3, g01Var5);
/* 648 */           hh0 hh0Var44 = new hh0("UINT32_LIST_PACKED", 43, 43, 3, g01Var4);
/* 665 */           hh0 hh0Var45 = new hh0("ENUM_LIST_PACKED", 44, 44, 3, g01Var9);
/* 676 */           hh0 hh0Var46 = new hh0("SFIXED32_LIST_PACKED", 45, 45, 3, g01Var4);
/* 691 */           hh0 hh0Var47 = new hh0("SFIXED64_LIST_PACKED", 46, 46, 3, g01Var3);
/* 706 */           hh0 hh0Var48 = new hh0("SINT32_LIST_PACKED", 47, 47, 3, g01Var4);
/* 717 */           hh0 hh0Var49 = new hh0("SINT64_LIST_PACKED", 48, 48, 3, g01Var3);
/* 720 */           f9078c = hh0Var49;
/* 827 */           f9080e = new hh0[]{hh0Var, hh0Var2, hh0Var3, hh0Var4, hh0Var5, hh0Var6, hh0Var7, hh0Var8, hh0Var9, hh0Var10, hh0Var11, hh0Var12, hh0Var13, hh0Var14, hh0Var15, hh0Var16, hh0Var17, hh0Var18, hh0Var19, hh0Var20, hh0Var21, hh0Var22, hh0Var23, hh0Var24, hh0Var25, hh0Var26, hh0Var27, hh0Var28, hh0Var29, hh0Var30, hh0Var31, hh0Var32, hh0Var33, hh0Var34, hh0Var35, hh0Var36, hh0Var37, hh0Var38, hh0Var39, hh0Var40, hh0Var41, hh0Var42, hh0Var43, hh0Var44, hh0Var45, hh0Var46, hh0Var47, hh0Var48, hh0Var49, new hh0("GROUP_LIST", 49, 49, 2, g01Var7), new hh0("MAP", 50, 50, 4, g01.f8415a)};
/* 829 */           hh0[] hh0VarArrValues = values();
/* 836 */           f9079d = new hh0[hh0VarArrValues.length];
/* 840 */           for (hh0 hh0Var50 : hh0VarArrValues) {
/* 848 */               f9079d[hh0Var50.f9081a] = hh0Var50;
                    }
                }

                public hh0(String str, int i, int i2, int i3, g01 g01Var) {
/* 1 */             super(str, i);
/* 4 */             this.f9081a = i2;
/* 6 */             int iM3520y = AbstractC0886en.m3520y(i3);
/* 11 */            if (iM3520y == 1 || iM3520y == 3) {
/* 17 */                g01Var.getClass();
                    }
/* 24 */            if (i3 == 1) {
/* 26 */                g01Var.ordinal();
                    }
                }

                public static hh0 valueOf(String str) {
/* 7 */             return (hh0) Enum.valueOf(hh0.class, str);
                }

                public static hh0[] values() {
/* 7 */             return (hh0[]) f9080e.clone();
                }
            }
