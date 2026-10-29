            package com.google.android.gms.internal.measurement;

            import okhttp3.HttpUrl;
            
            /* JADX WARN: Enum visitor error
            jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
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
            public final class zzmr {
                public static final zzmr zza;
                public static final zzmr zzb;
                public static final zzmr zzc;
                public static final zzmr zzd;
                public static final zzmr zze;
                public static final zzmr zzf;
                public static final zzmr zzg;
                public static final zzmr zzh;
                public static final zzmr zzi;
                public static final zzmr zzj;
                private static final /* synthetic */ zzmr[] zzl;
                private final Class zzk;

                static {
/* 11 */            zzmr zzmrVar = new zzmr("VOID", 0, Void.class, Void.class, null);
/* 14 */            zza = zzmrVar;
/* 25 */            Class cls = Integer.TYPE;
/* 29 */            zzmr zzmrVar2 = new zzmr("INT", 1, cls, Integer.class, 0);
/* 32 */            zzb = zzmrVar2;
/* 50 */            zzmr zzmrVar3 = new zzmr("LONG", 2, Long.TYPE, Long.class, 0L);
/* 53 */            zzc = zzmrVar3;
/* 70 */            zzmr zzmrVar4 = new zzmr("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
/* 73 */            zzd = zzmrVar4;
/* 90 */            zzmr zzmrVar5 = new zzmr("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
/* 93 */            zze = zzmrVar5;
/* 106 */           zzmr zzmrVar6 = new zzmr("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
/* 109 */           zzf = zzmrVar6;
/* 122 */           zzmr zzmrVar7 = new zzmr("STRING", 6, String.class, String.class, HttpUrl.FRAGMENT_ENCODE_SET);
/* 126 */           zzg = zzmrVar7;
/* 139 */           zzmr zzmrVar8 = new zzmr("BYTE_STRING", 7, zzlg.class, zzlg.class, zzlg.zzb);
/* 143 */           zzh = zzmrVar8;
/* 155 */           zzmr zzmrVar9 = new zzmr("ENUM", 8, cls, Integer.class, null);
/* 158 */           zzi = zzmrVar9;
/* 173 */           zzmr zzmrVar10 = new zzmr("MESSAGE", 9, Object.class, Object.class, null);
/* 176 */           zzj = zzmrVar10;
/* 187 */           zzl = new zzmr[]{zzmrVar, zzmrVar2, zzmrVar3, zzmrVar4, zzmrVar5, zzmrVar6, zzmrVar7, zzmrVar8, zzmrVar9, zzmrVar10};
                }

                private zzmr(String str, int i, Class cls, Class cls2, Object obj) {
/* 1 */             super(str, i);
/* 4 */             this.zzk = cls2;
                }

                public static zzmr[] values() {
/* 7 */             return (zzmr[]) zzl.clone();
                }

                public final Class zza() {
/* 1 */             return this.zzk;
                }
            }
