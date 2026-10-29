            package com.google.android.gms.internal.drive;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzma {
                private static final zzly zzuu = zzei();
                private static final zzly zzuv = new zzlz();

                public static zzly zzeg() {
/* 1 */             return zzuu;
                }

                public static zzly zzeh() {
/* 1 */             return zzuv;
                }

                private static zzly zzei() {
                    try {
/* 16 */                return (zzly) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
                    } catch (Exception unused) {
/* 1 */                 return null;
                    }
                }
            }
