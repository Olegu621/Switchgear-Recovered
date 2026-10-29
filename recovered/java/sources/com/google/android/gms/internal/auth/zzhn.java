            package com.google.android.gms.internal.auth;
            
            /* JADX WARN: Enum visitor error
            jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
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
            public final class zzhn {
                public static final zzhn zza;
                public static final zzhn zzb;
                public static final zzhn zzc;
                public static final zzhn zzd;
                public static final zzhn zze;
                public static final zzhn zzf;
                public static final zzhn zzg;
                public static final zzhn zzh;
                public static final zzhn zzi;
                public static final zzhn zzj;
                public static final zzhn zzk;
                public static final zzhn zzl;
                public static final zzhn zzm;
                public static final zzhn zzn;
                public static final zzhn zzo;
                public static final zzhn zzp;
                public static final zzhn zzq;
                public static final zzhn zzr;
                private static final /* synthetic */ zzhn[] zzs;
                private final zzho zzt;

                static {
/* 9 */             zzhn zzhnVar = new zzhn("DOUBLE", 0, zzho.DOUBLE, 1);
/* 12 */            zza = zzhnVar;
/* 21 */            zzhn zzhnVar2 = new zzhn("FLOAT", 1, zzho.FLOAT, 5);
/* 24 */            zzb = zzhnVar2;
/* 28 */            zzho zzhoVar = zzho.LONG;
/* 33 */            zzhn zzhnVar3 = new zzhn("INT64", 2, zzhoVar, 0);
/* 36 */            zzc = zzhnVar3;
/* 43 */            zzhn zzhnVar4 = new zzhn("UINT64", 3, zzhoVar, 0);
/* 46 */            zzd = zzhnVar4;
/* 50 */            zzho zzhoVar2 = zzho.INT;
/* 55 */            zzhn zzhnVar5 = new zzhn("INT32", 4, zzhoVar2, 0);
/* 58 */            zze = zzhnVar5;
/* 64 */            zzhn zzhnVar6 = new zzhn("FIXED64", 5, zzhoVar, 1);
/* 67 */            zzf = zzhnVar6;
/* 75 */            zzhn zzhnVar7 = new zzhn("FIXED32", 6, zzhoVar2, 5);
/* 78 */            zzg = zzhnVar7;
/* 87 */            zzhn zzhnVar8 = new zzhn("BOOL", 7, zzho.BOOLEAN, 0);
/* 90 */            zzh = zzhnVar8;
/* 101 */           zzhn zzhnVar9 = new zzhn("STRING", 8, zzho.STRING, 2);
/* 104 */           zzi = zzhnVar9;
/* 108 */           zzho zzhoVar3 = zzho.MESSAGE;
/* 114 */           zzhn zzhnVar10 = new zzhn("GROUP", 9, zzhoVar3, 3);
/* 117 */           zzj = zzhnVar10;
/* 128 */           zzhn zzhnVar11 = new zzhn("MESSAGE", 10, zzhoVar3, 2);
/* 131 */           zzk = zzhnVar11;
/* 144 */           zzhn zzhnVar12 = new zzhn("BYTES", 11, zzho.BYTE_STRING, 2);
/* 147 */           zzl = zzhnVar12;
/* 158 */           zzhn zzhnVar13 = new zzhn("UINT32", 12, zzhoVar2, 0);
/* 161 */           zzm = zzhnVar13;
/* 177 */           zzhn zzhnVar14 = new zzhn("ENUM", 13, zzho.ENUM, 0);
/* 180 */           zzn = zzhnVar14;
/* 189 */           zzhn zzhnVar15 = new zzhn("SFIXED32", 14, zzhoVar2, 5);
/* 192 */           zzo = zzhnVar15;
/* 203 */           zzhn zzhnVar16 = new zzhn("SFIXED64", 15, zzhoVar, 1);
/* 206 */           zzp = zzhnVar16;
/* 217 */           zzhn zzhnVar17 = new zzhn("SINT32", 16, zzhoVar2, 0);
/* 220 */           zzq = zzhnVar17;
/* 228 */           zzhn zzhnVar18 = new zzhn("SINT64", 17, zzhoVar, 0);
/* 231 */           zzr = zzhnVar18;
/* 252 */           zzs = new zzhn[]{zzhnVar, zzhnVar2, zzhnVar3, zzhnVar4, zzhnVar5, zzhnVar6, zzhnVar7, zzhnVar8, zzhnVar9, zzhnVar10, zzhnVar11, zzhnVar12, zzhnVar13, zzhnVar14, zzhnVar15, zzhnVar16, zzhnVar17, zzhnVar18};
                }

                private zzhn(String str, int i, zzho zzhoVar, int i2) {
/* 1 */             super(str, i);
/* 4 */             this.zzt = zzhoVar;
                }

                public static zzhn[] values() {
/* 7 */             return (zzhn[]) zzs.clone();
                }

                public final zzho zza() {
/* 1 */             return this.zzt;
                }
            }
