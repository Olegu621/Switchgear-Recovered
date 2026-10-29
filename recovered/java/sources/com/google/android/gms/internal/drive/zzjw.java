            package com.google.android.gms.internal.drive;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzjw {
                private static final Class<?> zzok = zzce();

                private static Class<?> zzce() {
                    try {
/* 3 */                 return Class.forName("com.google.protobuf.ExtensionRegistry");
                    } catch (ClassNotFoundException unused) {
/* 8 */                 return null;
                    }
                }

                public static zzjx zzcf() {
/* 3 */             if (zzok != null) {
                        try {
/* 7 */                     return zzn("getEmptyRegistry");
                        } catch (Exception unused) {
                        }
                    }
/* 12 */            return zzjx.zzoo;
                }

                public static zzjx zzcg() {
                    zzjx zzjxVarZzn;
/* 3 */             if (zzok != null) {
                        try {
/* 7 */                     zzjxVarZzn = zzn("loadGeneratedRegistry");
                        } catch (Exception unused) {
/* 12 */                    zzjxVarZzn = null;
                        }
                    } else {
/* 12 */                zzjxVarZzn = null;
                    }
/* 13 */            if (zzjxVarZzn == null) {
/* 15 */                zzjxVarZzn = zzjx.zzcg();
                    }
                    return zzjxVarZzn == null ? zzcf() : zzjxVarZzn;
                }

                private static final zzjx zzn(String str) throws Exception {
/* 12 */            return (zzjx) zzok.getDeclaredMethod(str, null).invoke(null, null);
                }
            }
