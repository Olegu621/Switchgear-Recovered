            package com.google.android.gms.internal.measurement;
            
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
            public final class zzos {
                public static final zzos zza;
                public static final zzos zzb;
                public static final zzos zzc;
                public static final zzos zzd;
                public static final zzos zze;
                public static final zzos zzf;
                public static final zzos zzg;
                public static final zzos zzh;
                public static final zzos zzi;
                public static final zzos zzj;
                public static final zzos zzk;
                public static final zzos zzl;
                public static final zzos zzm;
                public static final zzos zzn;
                public static final zzos zzo;
                public static final zzos zzp;
                public static final zzos zzq;
                public static final zzos zzr;
                private static final /* synthetic */ zzos[] zzu;
                private final zzot zzs;
                private final int zzt;

                static {
/* 9 */             zzos zzosVar = new zzos("DOUBLE", 0, zzot.DOUBLE, 1);
/* 12 */            zza = zzosVar;
/* 21 */            zzos zzosVar2 = new zzos("FLOAT", 1, zzot.FLOAT, 5);
/* 24 */            zzb = zzosVar2;
/* 28 */            zzot zzotVar = zzot.LONG;
/* 33 */            zzos zzosVar3 = new zzos("INT64", 2, zzotVar, 0);
/* 36 */            zzc = zzosVar3;
/* 43 */            zzos zzosVar4 = new zzos("UINT64", 3, zzotVar, 0);
/* 46 */            zzd = zzosVar4;
/* 50 */            zzot zzotVar2 = zzot.INT;
/* 55 */            zzos zzosVar5 = new zzos("INT32", 4, zzotVar2, 0);
/* 58 */            zze = zzosVar5;
/* 64 */            zzos zzosVar6 = new zzos("FIXED64", 5, zzotVar, 1);
/* 67 */            zzf = zzosVar6;
/* 75 */            zzos zzosVar7 = new zzos("FIXED32", 6, zzotVar2, 5);
/* 78 */            zzg = zzosVar7;
/* 87 */            zzos zzosVar8 = new zzos("BOOL", 7, zzot.BOOLEAN, 0);
/* 90 */            zzh = zzosVar8;
/* 101 */           zzos zzosVar9 = new zzos("STRING", 8, zzot.STRING, 2);
/* 104 */           zzi = zzosVar9;
/* 108 */           zzot zzotVar3 = zzot.MESSAGE;
/* 114 */           zzos zzosVar10 = new zzos("GROUP", 9, zzotVar3, 3);
/* 117 */           zzj = zzosVar10;
/* 128 */           zzos zzosVar11 = new zzos("MESSAGE", 10, zzotVar3, 2);
/* 131 */           zzk = zzosVar11;
/* 144 */           zzos zzosVar12 = new zzos("BYTES", 11, zzot.BYTE_STRING, 2);
/* 147 */           zzl = zzosVar12;
/* 158 */           zzos zzosVar13 = new zzos("UINT32", 12, zzotVar2, 0);
/* 161 */           zzm = zzosVar13;
/* 177 */           zzos zzosVar14 = new zzos("ENUM", 13, zzot.ENUM, 0);
/* 180 */           zzn = zzosVar14;
/* 189 */           zzos zzosVar15 = new zzos("SFIXED32", 14, zzotVar2, 5);
/* 192 */           zzo = zzosVar15;
/* 203 */           zzos zzosVar16 = new zzos("SFIXED64", 15, zzotVar, 1);
/* 206 */           zzp = zzosVar16;
/* 217 */           zzos zzosVar17 = new zzos("SINT32", 16, zzotVar2, 0);
/* 220 */           zzq = zzosVar17;
/* 228 */           zzos zzosVar18 = new zzos("SINT64", 17, zzotVar, 0);
/* 231 */           zzr = zzosVar18;
/* 252 */           zzu = new zzos[]{zzosVar, zzosVar2, zzosVar3, zzosVar4, zzosVar5, zzosVar6, zzosVar7, zzosVar8, zzosVar9, zzosVar10, zzosVar11, zzosVar12, zzosVar13, zzosVar14, zzosVar15, zzosVar16, zzosVar17, zzosVar18};
                }

                private zzos(String str, int i, zzot zzotVar, int i2) {
/* 1 */             super(str, i);
/* 4 */             this.zzs = zzotVar;
/* 6 */             this.zzt = i2;
                }

                public static zzos[] values() {
/* 7 */             return (zzos[]) zzu.clone();
                }

                public final zzot zza() {
/* 1 */             return this.zzs;
                }

                public final int zzb() {
/* 1 */             return this.zzt;
                }
            }
