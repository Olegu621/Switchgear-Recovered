            package com.google.android.gms.internal.auth;

            import android.content.ContentResolver;
            import android.database.Cursor;
            import android.net.Uri;
            import java.util.HashMap;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.regex.Pattern;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzcb {
                static HashMap zze;
                private static Object zzl;
                private static boolean zzm;
                public static final Uri zza = Uri.parse("content://com.google.android.gsf.gservices");
                public static final Uri zzb = Uri.parse("content://com.google.android.gsf.gservices/prefix");
                public static final Pattern zzc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
                public static final Pattern zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);
                private static final AtomicBoolean zzk = new AtomicBoolean();
                static final HashMap zzf = new HashMap();
                static final HashMap zzg = new HashMap();
                static final HashMap zzh = new HashMap();
                static final HashMap zzi = new HashMap();
                static final String[] zzj = new String[0];

                public static String zza(ContentResolver contentResolver, String str, String str2) {
                    synchronized (zzcb.class) {
                        try {
/* 8 */                     String str3 = null;
/* 9 */                     if (zze == null) {
/* 13 */                        zzk.set(false);
/* 21 */                        zze = new HashMap();
/* 28 */                        zzl = new Object();
/* 30 */                        zzm = false;
/* 39 */                        contentResolver.registerContentObserver(zza, true, new zzca(null));
                            } else if (zzk.getAndSet(false)) {
/* 57 */                        zze.clear();
/* 62 */                        zzf.clear();
/* 67 */                        zzg.clear();
/* 72 */                        zzh.clear();
/* 77 */                        zzi.clear();
/* 85 */                        zzl = new Object();
/* 87 */                        zzm = false;
                            }
/* 89 */                    Object obj = zzl;
/* 97 */                    if (zze.containsKey(str)) {
/* 105 */                       String str4 = (String) zze.get(str);
/* 107 */                       if (str4 != null) {
/* 110 */                           str3 = str4;
                                }
/* 112 */                       return str3;
                            }
/* 115 */                   int length = zzj.length;
/* 127 */                   Cursor cursorQuery = contentResolver.query(zza, null, null, new String[]{str}, null);
/* 131 */                   if (cursorQuery == null) {
/* 8 */                         return null;
                            }
                            try {
/* 138 */                       if (!cursorQuery.moveToFirst()) {
/* 140 */                           zzc(obj, str, null);
/* 8 */                             return null;
                                }
/* 150 */                       String string = cursorQuery.getString(1);
/* 154 */                       if (string != null && string.equals(null)) {
/* 162 */                           string = null;
                                }
/* 163 */                       zzc(obj, str, string);
/* 166 */                       return string != null ? string : null;
                            } finally {
/* 174 */                       cursorQuery.close();
                            }
                        } catch (Throwable th) {
/* 179 */                   throw th;
                        }
                    }
                }

                private static void zzc(Object obj, String str, String str2) {
                    synchronized (zzcb.class) {
                        try {
/* 6 */                     if (obj == zzl) {
/* 10 */                        zze.put(str, str2);
                            }
                        } catch (Throwable th) {
/* 19 */                    throw th;
                        }
                    }
                }
            }
