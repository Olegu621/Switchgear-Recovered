            package com.google.android.recaptcha.internal;
            
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
            public final class zzvg {
                public static final zzvg zza;
                public static final zzvg zzb;
                public static final zzvg zzc;
                public static final zzvg zzd;
                public static final zzvg zze;
                public static final zzvg zzf;
                public static final zzvg zzg;
                public static final zzvg zzh;
                public static final zzvg zzi;
                public static final zzvg zzj;
                public static final zzvg zzk;
                public static final zzvg zzl;
                public static final zzvg zzm;
                public static final zzvg zzn;
                public static final zzvg zzo;
                public static final zzvg zzp;
                public static final zzvg zzq;
                public static final zzvg zzr;
                private static final /* synthetic */ zzvg[] zzs;
                private final zzvh zzt;

                static {
/* 9 */             zzvg zzvgVar = new zzvg("DOUBLE", 0, zzvh.DOUBLE, 1);
/* 12 */            zza = zzvgVar;
/* 21 */            zzvg zzvgVar2 = new zzvg("FLOAT", 1, zzvh.FLOAT, 5);
/* 24 */            zzb = zzvgVar2;
/* 28 */            zzvh zzvhVar = zzvh.LONG;
/* 33 */            zzvg zzvgVar3 = new zzvg("INT64", 2, zzvhVar, 0);
/* 36 */            zzc = zzvgVar3;
/* 43 */            zzvg zzvgVar4 = new zzvg("UINT64", 3, zzvhVar, 0);
/* 46 */            zzd = zzvgVar4;
/* 50 */            zzvh zzvhVar2 = zzvh.INT;
/* 55 */            zzvg zzvgVar5 = new zzvg("INT32", 4, zzvhVar2, 0);
/* 58 */            zze = zzvgVar5;
/* 64 */            zzvg zzvgVar6 = new zzvg("FIXED64", 5, zzvhVar, 1);
/* 67 */            zzf = zzvgVar6;
/* 75 */            zzvg zzvgVar7 = new zzvg("FIXED32", 6, zzvhVar2, 5);
/* 78 */            zzg = zzvgVar7;
/* 87 */            zzvg zzvgVar8 = new zzvg("BOOL", 7, zzvh.BOOLEAN, 0);
/* 90 */            zzh = zzvgVar8;
/* 101 */           zzvg zzvgVar9 = new zzvg("STRING", 8, zzvh.STRING, 2);
/* 104 */           zzi = zzvgVar9;
/* 108 */           zzvh zzvhVar3 = zzvh.MESSAGE;
/* 114 */           zzvg zzvgVar10 = new zzvg("GROUP", 9, zzvhVar3, 3);
/* 117 */           zzj = zzvgVar10;
/* 128 */           zzvg zzvgVar11 = new zzvg("MESSAGE", 10, zzvhVar3, 2);
/* 131 */           zzk = zzvgVar11;
/* 144 */           zzvg zzvgVar12 = new zzvg("BYTES", 11, zzvh.BYTE_STRING, 2);
/* 147 */           zzl = zzvgVar12;
/* 158 */           zzvg zzvgVar13 = new zzvg("UINT32", 12, zzvhVar2, 0);
/* 161 */           zzm = zzvgVar13;
/* 177 */           zzvg zzvgVar14 = new zzvg("ENUM", 13, zzvh.ENUM, 0);
/* 180 */           zzn = zzvgVar14;
/* 189 */           zzvg zzvgVar15 = new zzvg("SFIXED32", 14, zzvhVar2, 5);
/* 192 */           zzo = zzvgVar15;
/* 203 */           zzvg zzvgVar16 = new zzvg("SFIXED64", 15, zzvhVar, 1);
/* 206 */           zzp = zzvgVar16;
/* 217 */           zzvg zzvgVar17 = new zzvg("SINT32", 16, zzvhVar2, 0);
/* 220 */           zzq = zzvgVar17;
/* 228 */           zzvg zzvgVar18 = new zzvg("SINT64", 17, zzvhVar, 0);
/* 231 */           zzr = zzvgVar18;
/* 252 */           zzs = new zzvg[]{zzvgVar, zzvgVar2, zzvgVar3, zzvgVar4, zzvgVar5, zzvgVar6, zzvgVar7, zzvgVar8, zzvgVar9, zzvgVar10, zzvgVar11, zzvgVar12, zzvgVar13, zzvgVar14, zzvgVar15, zzvgVar16, zzvgVar17, zzvgVar18};
                }

                private zzvg(String str, int i, zzvh zzvhVar, int i2) {
/* 1 */             super(str, i);
/* 4 */             this.zzt = zzvhVar;
                }

                public static zzvg[] values() {
/* 7 */             return (zzvg[]) zzs.clone();
                }

                public final zzvh zza() {
/* 1 */             return this.zzt;
                }
            }
