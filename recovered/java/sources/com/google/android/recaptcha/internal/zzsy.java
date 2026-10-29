            package com.google.android.recaptcha.internal;

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
            public final class zzsy {
                public static final zzsy zza;
                public static final zzsy zzb;
                public static final zzsy zzc;
                public static final zzsy zzd;
                public static final zzsy zze;
                public static final zzsy zzf;
                public static final zzsy zzg;
                public static final zzsy zzh;
                public static final zzsy zzi;
                public static final zzsy zzj;
                private static final /* synthetic */ zzsy[] zzk;
                private final Class zzl;

                static {
/* 11 */            zzsy zzsyVar = new zzsy("VOID", 0, Void.class, Void.class, null);
/* 14 */            zza = zzsyVar;
/* 25 */            Class cls = Integer.TYPE;
/* 29 */            zzsy zzsyVar2 = new zzsy("INT", 1, cls, Integer.class, 0);
/* 32 */            zzb = zzsyVar2;
/* 50 */            zzsy zzsyVar3 = new zzsy("LONG", 2, Long.TYPE, Long.class, 0L);
/* 53 */            zzc = zzsyVar3;
/* 70 */            zzsy zzsyVar4 = new zzsy("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
/* 73 */            zzd = zzsyVar4;
/* 90 */            zzsy zzsyVar5 = new zzsy("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
/* 93 */            zze = zzsyVar5;
/* 106 */           zzsy zzsyVar6 = new zzsy("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
/* 109 */           zzf = zzsyVar6;
/* 122 */           zzsy zzsyVar7 = new zzsy("STRING", 6, String.class, String.class, HttpUrl.FRAGMENT_ENCODE_SET);
/* 126 */           zzg = zzsyVar7;
/* 139 */           zzsy zzsyVar8 = new zzsy("BYTE_STRING", 7, zzqm.class, zzqm.class, zzqm.zzb);
/* 143 */           zzh = zzsyVar8;
/* 155 */           zzsy zzsyVar9 = new zzsy("ENUM", 8, cls, Integer.class, null);
/* 158 */           zzi = zzsyVar9;
/* 173 */           zzsy zzsyVar10 = new zzsy("MESSAGE", 9, Object.class, Object.class, null);
/* 176 */           zzj = zzsyVar10;
/* 187 */           zzk = new zzsy[]{zzsyVar, zzsyVar2, zzsyVar3, zzsyVar4, zzsyVar5, zzsyVar6, zzsyVar7, zzsyVar8, zzsyVar9, zzsyVar10};
                }

                private zzsy(String str, int i, Class cls, Class cls2, Object obj) {
/* 1 */             super(str, i);
/* 4 */             this.zzl = cls2;
                }

                public static zzsy[] values() {
/* 7 */             return (zzsy[]) zzk.clone();
                }

                public final Class zza() {
/* 1 */             return this.zzl;
                }
            }
