            package com.google.android.gms.internal.drive;
            
            /* JADX WARN: Enum visitor error
            jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzww' uses external variables
            	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
            	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
            	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
            	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
            	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
            	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
             */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public class zznm {
                public static final zznm zzwu;
                public static final zznm zzwv;
                public static final zznm zzww;
                public static final zznm zzwx;
                public static final zznm zzwy;
                public static final zznm zzwz;
                public static final zznm zzxa;
                public static final zznm zzxb;
                public static final zznm zzxc;
                public static final zznm zzxd;
                public static final zznm zzxe;
                public static final zznm zzxf;
                public static final zznm zzxg;
                public static final zznm zzxh;
                public static final zznm zzxi;
                public static final zznm zzxj;
                public static final zznm zzxk;
                public static final zznm zzxl;
                private static final /* synthetic */ zznm[] zzxo;
                private final zznr zzxm;
                private final int zzxn;

                static {
/* 9 */             zznm zznmVar = new zznm("DOUBLE", 0, zznr.DOUBLE, 1);
/* 12 */            zzwu = zznmVar;
/* 21 */            zznm zznmVar2 = new zznm("FLOAT", 1, zznr.FLOAT, 5);
/* 24 */            zzwv = zznmVar2;
/* 28 */            zznr zznrVar = zznr.LONG;
/* 32 */            final int i = 2;
/* 33 */            zznm zznmVar3 = new zznm("INT64", 2, zznrVar, 0);
/* 36 */            zzww = zznmVar3;
/* 42 */            final int i2 = 3;
/* 43 */            zznm zznmVar4 = new zznm("UINT64", 3, zznrVar, 0);
/* 46 */            zzwx = zznmVar4;
/* 50 */            zznr zznrVar2 = zznr.INT;
/* 55 */            zznm zznmVar5 = new zznm("INT32", 4, zznrVar2, 0);
/* 58 */            zzwy = zznmVar5;
/* 64 */            zznm zznmVar6 = new zznm("FIXED64", 5, zznrVar, 1);
/* 67 */            zzwz = zznmVar6;
/* 76 */            zznm zznmVar7 = new zznm("FIXED32", 6, zznrVar2, 5);
/* 79 */            zzxa = zznmVar7;
/* 90 */            zznm zznmVar8 = new zznm("BOOL", 7, zznr.BOOLEAN, 0);
/* 93 */            zzxb = zznmVar8;
/* 97 */            final zznr zznrVar3 = zznr.STRING;
/* 101 */           final String str = "STRING";
/* 103 */           final int i3 = 8;
/* 105 */           zznm zznmVar9 = new zznm(str, i3, zznrVar3, i) { // from class: com.google.android.gms.internal.drive.zznn
                        {
/* 1 */                     int i4 = 2;
/* 2 */                     zznl zznlVar = null;
/* 3 */                     int i5 = 8;
                        }
                    };
/* 108 */           zzxc = zznmVar9;
/* 112 */           final zznr zznrVar4 = zznr.MESSAGE;
/* 116 */           final String str2 = "GROUP";
/* 118 */           final int i4 = 9;
/* 120 */           zznm zznmVar10 = new zznm(str2, i4, zznrVar4, i2) { // from class: com.google.android.gms.internal.drive.zzno
                        {
/* 1 */                     int i5 = 3;
/* 2 */                     zznl zznlVar = null;
/* 3 */                     int i6 = 9;
                        }
                    };
/* 123 */           zzxd = zznmVar10;
/* 129 */           final String str3 = "MESSAGE";
/* 133 */           final int i5 = 10;
/* 137 */           final int i6 = 2;
/* 138 */           zznm zznmVar11 = new zznm(str3, i5, zznrVar4, i6) { // from class: com.google.android.gms.internal.drive.zznp
                        {
/* 1 */                     int i7 = 2;
/* 2 */                     zznl zznlVar = null;
/* 3 */                     int i8 = 10;
                        }
                    };
/* 141 */           zzxe = zznmVar11;
/* 145 */           final zznr zznrVar5 = zznr.BYTE_STRING;
/* 149 */           final String str4 = "BYTES";
/* 153 */           final int i7 = 11;
/* 155 */           zznm zznmVar12 = new zznm(str4, i7, zznrVar5, i6) { // from class: com.google.android.gms.internal.drive.zznq
                        {
/* 1 */                     int i8 = 2;
/* 2 */                     zznl zznlVar = null;
/* 3 */                     int i9 = 11;
                        }
                    };
/* 158 */           zzxf = zznmVar12;
/* 169 */           zznm zznmVar13 = new zznm("UINT32", 12, zznrVar2, 0);
/* 172 */           zzxg = zznmVar13;
/* 188 */           zznm zznmVar14 = new zznm("ENUM", 13, zznr.ENUM, 0);
/* 191 */           zzxh = zznmVar14;
/* 202 */           zznm zznmVar15 = new zznm("SFIXED32", 14, zznrVar2, 5);
/* 205 */           zzxi = zznmVar15;
/* 218 */           zznm zznmVar16 = new zznm("SFIXED64", 15, zznrVar, 1);
/* 221 */           zzxj = zznmVar16;
/* 234 */           zznm zznmVar17 = new zznm("SINT32", 16, zznrVar2, 0);
/* 237 */           zzxk = zznmVar17;
/* 247 */           zznm zznmVar18 = new zznm("SINT64", 17, zznrVar, 0);
/* 250 */           zzxl = zznmVar18;
/* 298 */           zzxo = new zznm[]{zznmVar, zznmVar2, zznmVar3, zznmVar4, zznmVar5, zznmVar6, zznmVar7, zznmVar8, zznmVar9, zznmVar10, zznmVar11, zznmVar12, zznmVar13, zznmVar14, zznmVar15, zznmVar16, zznmVar17, zznmVar18};
                }

                private zznm(String str, int i, zznr zznrVar, int i2) {
/* 1 */             super(str, i);
/* 4 */             this.zzxm = zznrVar;
/* 6 */             this.zzxn = i2;
                }

                public static zznm[] values() {
/* 7 */             return (zznm[]) zzxo.clone();
                }

                public final zznr zzfj() {
/* 1 */             return this.zzxm;
                }

                public final int zzfk() {
/* 1 */             return this.zzxn;
                }

/* 8 */         public /* synthetic */ zznm(String str, int i, zznr zznrVar, int i2, zznl zznlVar) {
/* 9 */             this(str, i, zznrVar, i2);
                }
            }
