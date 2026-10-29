            package com.google.android.recaptcha.internal;

            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzpu {
                private static final Map zza;

                static {
/* 5 */             LinkedHashMap linkedHashMap = new LinkedHashMap(16);
/* 10 */            LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
/* 17 */            zzb(linkedHashMap, linkedHashMap2, Boolean.TYPE, Boolean.class);
/* 24 */            zzb(linkedHashMap, linkedHashMap2, Byte.TYPE, Byte.class);
/* 31 */            zzb(linkedHashMap, linkedHashMap2, Character.TYPE, Character.class);
/* 38 */            zzb(linkedHashMap, linkedHashMap2, Double.TYPE, Double.class);
/* 45 */            zzb(linkedHashMap, linkedHashMap2, Float.TYPE, Float.class);
/* 52 */            zzb(linkedHashMap, linkedHashMap2, Integer.TYPE, Integer.class);
/* 59 */            zzb(linkedHashMap, linkedHashMap2, Long.TYPE, Long.class);
/* 66 */            zzb(linkedHashMap, linkedHashMap2, Short.TYPE, Short.class);
/* 73 */            zzb(linkedHashMap, linkedHashMap2, Void.TYPE, Void.class);
/* 80 */            zza = Collections.unmodifiableMap(linkedHashMap);
/* 82 */            Collections.unmodifiableMap(linkedHashMap2);
                }

                public static Class zza(Class cls) {
/* 1 */             cls.getClass();
/* 10 */            Class cls2 = (Class) zza.get(cls);
                    return cls2 == null ? cls : cls2;
                }

                private static void zzb(Map map, Map map2, Class cls, Class cls2) {
/* 1 */             map.put(cls, cls2);
/* 4 */             map2.put(cls2, cls);
                }
            }
