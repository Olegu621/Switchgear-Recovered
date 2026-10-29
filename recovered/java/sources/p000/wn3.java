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
            public final class wn3 {

                /* JADX INFO: renamed from: b */
                public static final wn3 f18705b;

                /* JADX INFO: renamed from: c */
                public static final wn3 f18706c;

                /* JADX INFO: renamed from: d */
                public static final wn3[] f18707d;

                /* JADX INFO: renamed from: e */
                public static final /* synthetic */ wn3[] f18708e;

                /* JADX INFO: renamed from: a */
                public final int f18709a;

                /* JADX INFO: Fake field, exist only in values array */
                wn3 EF0;

                static {
/* 3 */             vo3 vo3Var = vo3.f18271e;
/* 11 */            wn3 wn3Var = new wn3("DOUBLE", 0, 0, 1, vo3Var);
/* 16 */            vo3 vo3Var2 = vo3.f18270d;
/* 24 */            wn3 wn3Var2 = new wn3("FLOAT", 1, 1, 1, vo3Var2);
/* 30 */            vo3 vo3Var3 = vo3.f18269c;
/* 41 */            wn3 wn3Var3 = new wn3("INT64", 2, 2, 1, vo3Var3);
/* 55 */            wn3 wn3Var4 = new wn3("UINT64", 3, 3, 1, vo3Var3);
/* 62 */            vo3 vo3Var4 = vo3.f18268b;
/* 74 */            wn3 wn3Var5 = new wn3("INT32", 4, 4, 1, vo3Var4);
/* 87 */            wn3 wn3Var6 = new wn3("FIXED64", 5, 5, 1, vo3Var3);
/* 100 */           wn3 wn3Var7 = new wn3("FIXED32", 6, 6, 1, vo3Var4);
/* 107 */           vo3 vo3Var5 = vo3.f18272f;
/* 119 */           wn3 wn3Var8 = new wn3("BOOL", 7, 7, 1, vo3Var5);
/* 126 */           vo3 vo3Var6 = vo3.f18273i;
/* 136 */           wn3 wn3Var9 = new wn3("STRING", 8, 8, 1, vo3Var6);
/* 141 */           vo3 vo3Var7 = vo3.f18265U;
/* 153 */           wn3 wn3Var10 = new wn3("MESSAGE", 9, 9, 1, vo3Var7);
/* 160 */           vo3 vo3Var8 = vo3.f18274v;
/* 170 */           wn3 wn3Var11 = new wn3("BYTES", 10, 10, 1, vo3Var8);
/* 181 */           wn3 wn3Var12 = new wn3("UINT32", 11, 11, 1, vo3Var4);
/* 188 */           vo3 vo3Var9 = vo3.f18275w;
/* 200 */           wn3 wn3Var13 = new wn3("ENUM", 12, 12, 1, vo3Var9);
/* 211 */           wn3 wn3Var14 = new wn3("SFIXED32", 13, 13, 1, vo3Var4);
/* 224 */           wn3 wn3Var15 = new wn3("SFIXED64", 14, 14, 1, vo3Var3);
/* 239 */           wn3 wn3Var16 = new wn3("SINT32", 15, 15, 1, vo3Var4);
/* 254 */           wn3 wn3Var17 = new wn3("SINT64", 16, 16, 1, vo3Var3);
/* 269 */           wn3 wn3Var18 = new wn3("GROUP", 17, 17, 1, vo3Var7);
/* 282 */           wn3 wn3Var19 = new wn3("DOUBLE_LIST", 18, 18, 2, vo3Var);
/* 295 */           wn3 wn3Var20 = new wn3("FLOAT_LIST", 19, 19, 2, vo3Var2);
/* 312 */           wn3 wn3Var21 = new wn3("INT64_LIST", 20, 20, 2, vo3Var3);
/* 329 */           wn3 wn3Var22 = new wn3("UINT64_LIST", 21, 21, 2, vo3Var3);
/* 344 */           wn3 wn3Var23 = new wn3("INT32_LIST", 22, 22, 2, vo3Var4);
/* 359 */           wn3 wn3Var24 = new wn3("FIXED64_LIST", 23, 23, 2, vo3Var3);
/* 372 */           wn3 wn3Var25 = new wn3("FIXED32_LIST", 24, 24, 2, vo3Var4);
/* 389 */           wn3 wn3Var26 = new wn3("BOOL_LIST", 25, 25, 2, vo3Var5);
/* 406 */           wn3 wn3Var27 = new wn3("STRING_LIST", 26, 26, 2, vo3Var6);
/* 419 */           wn3 wn3Var28 = new wn3("MESSAGE_LIST", 27, 27, 2, vo3Var7);
/* 438 */           wn3 wn3Var29 = new wn3("BYTES_LIST", 28, 28, 2, vo3Var8);
/* 451 */           wn3 wn3Var30 = new wn3("UINT32_LIST", 29, 29, 2, vo3Var4);
/* 468 */           wn3 wn3Var31 = new wn3("ENUM_LIST", 30, 30, 2, vo3Var9);
/* 483 */           wn3 wn3Var32 = new wn3("SFIXED32_LIST", 31, 31, 2, vo3Var4);
/* 498 */           wn3 wn3Var33 = new wn3("SFIXED64_LIST", 32, 32, 2, vo3Var3);
/* 513 */           wn3 wn3Var34 = new wn3("SINT32_LIST", 33, 33, 2, vo3Var4);
/* 528 */           wn3 wn3Var35 = new wn3("SINT64_LIST", 34, 34, 2, vo3Var3);
/* 541 */           wn3 wn3Var36 = new wn3("DOUBLE_LIST_PACKED", 35, 35, 3, vo3Var);
/* 544 */           f18705b = wn3Var36;
/* 554 */           wn3 wn3Var37 = new wn3("FLOAT_LIST_PACKED", 36, 36, 3, vo3Var2);
/* 567 */           wn3 wn3Var38 = new wn3("INT64_LIST_PACKED", 37, 37, 3, vo3Var3);
/* 582 */           wn3 wn3Var39 = new wn3("UINT64_LIST_PACKED", 38, 38, 3, vo3Var3);
/* 599 */           wn3 wn3Var40 = new wn3("INT32_LIST_PACKED", 39, 39, 3, vo3Var4);
/* 614 */           wn3 wn3Var41 = new wn3("FIXED64_LIST_PACKED", 40, 40, 3, vo3Var3);
/* 633 */           wn3 wn3Var42 = new wn3("FIXED32_LIST_PACKED", 41, 41, 3, vo3Var4);
/* 650 */           wn3 wn3Var43 = new wn3("BOOL_LIST_PACKED", 42, 42, 3, vo3Var5);
/* 661 */           wn3 wn3Var44 = new wn3("UINT32_LIST_PACKED", 43, 43, 3, vo3Var4);
/* 676 */           wn3 wn3Var45 = new wn3("ENUM_LIST_PACKED", 44, 44, 3, vo3Var9);
/* 687 */           wn3 wn3Var46 = new wn3("SFIXED32_LIST_PACKED", 45, 45, 3, vo3Var4);
/* 700 */           wn3 wn3Var47 = new wn3("SFIXED64_LIST_PACKED", 46, 46, 3, vo3Var3);
/* 714 */           wn3 wn3Var48 = new wn3("SINT32_LIST_PACKED", 47, 47, 3, vo3Var4);
/* 725 */           wn3 wn3Var49 = new wn3("SINT64_LIST_PACKED", 48, 48, 3, vo3Var3);
/* 728 */           f18706c = wn3Var49;
/* 834 */           f18708e = new wn3[]{wn3Var, wn3Var2, wn3Var3, wn3Var4, wn3Var5, wn3Var6, wn3Var7, wn3Var8, wn3Var9, wn3Var10, wn3Var11, wn3Var12, wn3Var13, wn3Var14, wn3Var15, wn3Var16, wn3Var17, wn3Var18, wn3Var19, wn3Var20, wn3Var21, wn3Var22, wn3Var23, wn3Var24, wn3Var25, wn3Var26, wn3Var27, wn3Var28, wn3Var29, wn3Var30, wn3Var31, wn3Var32, wn3Var33, wn3Var34, wn3Var35, wn3Var36, wn3Var37, wn3Var38, wn3Var39, wn3Var40, wn3Var41, wn3Var42, wn3Var43, wn3Var44, wn3Var45, wn3Var46, wn3Var47, wn3Var48, wn3Var49, new wn3("GROUP_LIST", 49, 49, 2, vo3Var7), new wn3("MAP", 50, 50, 4, vo3.f18267a)};
/* 836 */           wn3[] wn3VarArrValues = values();
/* 843 */           f18707d = new wn3[wn3VarArrValues.length];
/* 846 */           for (wn3 wn3Var50 : wn3VarArrValues) {
/* 854 */               f18707d[wn3Var50.f18709a] = wn3Var50;
                    }
                }

                public wn3(String str, int i, int i2, int i3, vo3 vo3Var) {
/* 1 */             super(str, i);
/* 4 */             this.f18709a = i2;
/* 6 */             vo3 vo3Var2 = vo3.f18267a;
/* 8 */             int i4 = i3 - 1;
/* 11 */            if (i4 == 1 || i4 == 3) {
/* 17 */                vo3Var.getClass();
                    }
/* 24 */            if (i3 == 1) {
/* 26 */                vo3Var.ordinal();
                    }
                }

                public static wn3[] values() {
/* 7 */             return (wn3[]) f18708e.clone();
                }
            }
