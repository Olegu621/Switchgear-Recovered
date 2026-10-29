            package com.google.android.gms.internal.drive;

            import okhttp3.HttpUrl;
            
            /* JADX WARN: Enum visitor error
            jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzss' uses external variables
            	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
            	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
            	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
            	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
            	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
            	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
             */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzks {
                public static final zzks zzsr;
                public static final zzks zzss;
                public static final zzks zzst;
                public static final zzks zzsu;
                public static final zzks zzsv;
                public static final zzks zzsw;
                public static final zzks zzsx;
                public static final zzks zzsy;
                public static final zzks zzsz;
                public static final zzks zzta;
                private static final /* synthetic */ zzks[] zzte;
                private final Class<?> zztb;
                private final Class<?> zztc;
                private final Object zztd;

                static {
/* 11 */            zzks zzksVar = new zzks("VOID", 0, Void.class, Void.class, null);
/* 14 */            zzsr = zzksVar;
/* 25 */            Class cls = Integer.TYPE;
/* 29 */            zzks zzksVar2 = new zzks("INT", 1, cls, Integer.class, 0);
/* 32 */            zzss = zzksVar2;
/* 50 */            zzks zzksVar3 = new zzks("LONG", 2, Long.TYPE, Long.class, 0L);
/* 53 */            zzst = zzksVar3;
/* 70 */            zzks zzksVar4 = new zzks("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
/* 73 */            zzsu = zzksVar4;
/* 90 */            zzks zzksVar5 = new zzks("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
/* 93 */            zzsv = zzksVar5;
/* 106 */           zzks zzksVar6 = new zzks("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
/* 109 */           zzsw = zzksVar6;
/* 122 */           zzks zzksVar7 = new zzks("STRING", 6, String.class, String.class, HttpUrl.FRAGMENT_ENCODE_SET);
/* 126 */           zzsx = zzksVar7;
/* 139 */           zzks zzksVar8 = new zzks("BYTE_STRING", 7, zzjc.class, zzjc.class, zzjc.zznq);
/* 143 */           zzsy = zzksVar8;
/* 155 */           zzks zzksVar9 = new zzks("ENUM", 8, cls, Integer.class, null);
/* 158 */           zzsz = zzksVar9;
/* 173 */           zzks zzksVar10 = new zzks("MESSAGE", 9, Object.class, Object.class, null);
/* 176 */           zzta = zzksVar10;
/* 187 */           zzte = new zzks[]{zzksVar, zzksVar2, zzksVar3, zzksVar4, zzksVar5, zzksVar6, zzksVar7, zzksVar8, zzksVar9, zzksVar10};
                }

                private zzks(String str, int i, Class cls, Class cls2, Object obj) {
/* 1 */             super(str, i);
/* 4 */             this.zztb = cls;
/* 6 */             this.zztc = cls2;
/* 8 */             this.zztd = obj;
                }

                public static zzks[] values() {
/* 7 */             return (zzks[]) zzte.clone();
                }

                public final Class<?> zzdo() {
/* 1 */             return this.zztc;
                }
            }
