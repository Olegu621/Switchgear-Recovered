            package com.google.android.gms.internal.play_billing;

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
            public final class zzhs {
                public static final zzhs zza;
                public static final zzhs zzb;
                public static final zzhs zzc;
                public static final zzhs zzd;
                public static final zzhs zze;
                public static final zzhs zzf;
                public static final zzhs zzg;
                public static final zzhs zzh;
                public static final zzhs zzi;
                public static final zzhs zzj;
                private static final /* synthetic */ zzhs[] zzk;
                private final Class zzl;

                static {
/* 11 */            zzhs zzhsVar = new zzhs("VOID", 0, Void.class, Void.class, null);
/* 14 */            zza = zzhsVar;
/* 25 */            Class cls = Integer.TYPE;
/* 29 */            zzhs zzhsVar2 = new zzhs("INT", 1, cls, Integer.class, 0);
/* 32 */            zzb = zzhsVar2;
/* 50 */            zzhs zzhsVar3 = new zzhs("LONG", 2, Long.TYPE, Long.class, 0L);
/* 53 */            zzc = zzhsVar3;
/* 70 */            zzhs zzhsVar4 = new zzhs("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
/* 73 */            zzd = zzhsVar4;
/* 90 */            zzhs zzhsVar5 = new zzhs("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
/* 93 */            zze = zzhsVar5;
/* 106 */           zzhs zzhsVar6 = new zzhs("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
/* 109 */           zzf = zzhsVar6;
/* 122 */           zzhs zzhsVar7 = new zzhs("STRING", 6, String.class, String.class, HttpUrl.FRAGMENT_ENCODE_SET);
/* 126 */           zzg = zzhsVar7;
/* 139 */           zzhs zzhsVar8 = new zzhs("BYTE_STRING", 7, zzgk.class, zzgk.class, zzgk.zzb);
/* 143 */           zzh = zzhsVar8;
/* 155 */           zzhs zzhsVar9 = new zzhs("ENUM", 8, cls, Integer.class, null);
/* 158 */           zzi = zzhsVar9;
/* 173 */           zzhs zzhsVar10 = new zzhs("MESSAGE", 9, Object.class, Object.class, null);
/* 176 */           zzj = zzhsVar10;
/* 187 */           zzk = new zzhs[]{zzhsVar, zzhsVar2, zzhsVar3, zzhsVar4, zzhsVar5, zzhsVar6, zzhsVar7, zzhsVar8, zzhsVar9, zzhsVar10};
                }

                private zzhs(String str, int i, Class cls, Class cls2, Object obj) {
/* 1 */             super(str, i);
/* 4 */             this.zzl = cls2;
                }

                public static zzhs[] values() {
/* 7 */             return (zzhs[]) zzk.clone();
                }

                public final Class zza() {
/* 1 */             return this.zzl;
                }
            }
