            package com.google.android.gms.internal.auth;

            import android.content.Context;
            import android.net.Uri;
            import android.os.Build;
            import android.os.StrictMode;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.config.AbstractC1417a;
            import java.io.BufferedReader;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.io.InputStreamReader;
            import java.util.HashMap;
            import p000.le2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzcp {
                private static volatile zzdh zza;

                private zzcp() {
                }

                /* JADX WARN: Code duplicated, block: B:18:0x0030 A[Catch: all -> 0x001c, TryCatch #6 {all -> 0x001c, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0013, B:18:0x0030, B:74:0x017c, B:13:0x001f, B:15:0x0027, B:20:0x0037, B:22:0x003d, B:24:0x0043, B:25:0x0047, B:73:0x0177, B:75:0x017f, B:76:0x0182, B:77:0x0183, B:26:0x004b, B:28:0x004f, B:29:0x005c, B:31:0x0062, B:37:0x007b, B:39:0x0081, B:40:0x0087, B:60:0x0148, B:61:0x014b, B:69:0x016c, B:68:0x0157, B:70:0x016d, B:71:0x0172, B:72:0x0173, B:34:0x006a, B:36:0x0070), top: B:92:0x0003, inners: #2 }] */
                public static zzdh zza(Context context) {
                    zzdh zzdhVar;
                    zzdh zzdhVarZzc;
                    zzdh zzdhVarZzc2;
                    synchronized (zzcp.class) {
                        try {
/* 4 */                     zzdhVar = zza;
/* 6 */                     if (zzdhVar == null) {
/* 8 */                         String str = Build.TYPE;
/* 10 */                        String str2 = Build.TAGS;
/* 18 */                        if (!str.equals("eng") && !str.equals("userdebug")) {
/* 49 */                            zzdhVarZzc2 = zzdh.zzc();
                                } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
/* 60 */                            if (zzcc.zzb() && !context.isDeviceProtectedStorage()) {
/* 68 */                                context = context.createDeviceProtectedStorageContext();
                                    }
/* 72 */                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                    try {
/* 76 */                                StrictMode.allowThreadDiskWrites();
                                        try {
/* 90 */                                    File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
/* 107 */                                   zzdhVarZzc = file.exists() ? zzdh.zzd(file) : zzdh.zzc();
                                        } catch (RuntimeException e) {
/* 117 */                                   AbstractC1245n0.m4877e("HermeticFileOverrides", "no data dir", e);
/* 120 */                                   zzdhVarZzc = zzdh.zzc();
                                        }
/* 128 */                               if (zzdhVarZzc.zzb()) {
/* 134 */                                   File file2 = (File) zzdhVarZzc.zza();
                                            try {
/* 152 */                                       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(AbstractC1417a.m5164b(file2, new FileInputStream(file2))));
                                                try {
/* 157 */                                           le2 le2Var = new le2();
/* 162 */                                           HashMap map = new HashMap();
                                                    while (true) {
/* 165 */                                               String line = bufferedReader.readLine();
/* 169 */                                               if (line == null) {
                                                            break;
                                                        }
/* 174 */                                               String[] strArrSplit = line.split(" ", 3);
/* 179 */                                               if (strArrSplit.length != 3) {
/* 200 */                                                   AbstractC1245n0.m4876d("HermeticFileOverrides", "Invalid: " + line);
                                                        } else {
/* 211 */                                                   String str3 = new String(strArrSplit[0]);
/* 222 */                                                   String strDecode = Uri.decode(new String(strArrSplit[1]));
/* 233 */                                                   String strDecode2 = (String) map.get(strArrSplit[2]);
/* 235 */                                                   if (strDecode2 == null) {
/* 241 */                                                       String str4 = new String(strArrSplit[2]);
/* 244 */                                                       strDecode2 = Uri.decode(str4);
/* 254 */                                                       if (strDecode2.length() < 1024 || strDecode2 == str4) {
/* 258 */                                                           map.put(str4, strDecode2);
                                                                }
                                                            }
/* 265 */                                                   if (!le2Var.containsKey(str3)) {
/* 272 */                                                       le2Var.put(str3, new le2());
                                                            }
/* 282 */                                                   ((le2) le2Var.getOrDefault(str3, null)).put(strDecode, strDecode2);
                                                        }
                                                    }
/* 321 */                                           AbstractC1245n0.m4889q("HermeticFileOverrides", "Parsed " + file2.toString() + " for Android package " + context.getPackageName());
/* 326 */                                           zzci zzciVar = new zzci(le2Var);
/* 329 */                                           bufferedReader.close();
/* 332 */                                           zzdhVarZzc2 = zzdh.zzd(zzciVar);
                                                } catch (Throwable th) {
                                                    try {
/* 339 */                                               bufferedReader.close();
                                                    } catch (Throwable th2) {
                                                        try {
/* 362 */                                                   Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                                        } catch (Exception unused) {
                                                        }
                                                    }
/* 365 */                                           throw th;
                                                }
                                            } catch (IOException e2) {
/* 371 */                                       throw new RuntimeException(e2);
                                            }
                                        } else {
/* 372 */                                   zzdhVarZzc2 = zzdh.zzc();
                                        }
/* 376 */                               StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                    } catch (Throwable th3) {
/* 384 */                               StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
/* 387 */                               throw th3;
                                    }
                                } else {
/* 49 */                            zzdhVarZzc2 = zzdh.zzc();
                                }
/* 53 */                        zzdhVar = zzdhVarZzc2;
/* 381 */                       zza = zzdhVar;
                            }
                        } catch (Throwable th4) {
/* 391 */                   throw th4;
                        }
                    }
/* 389 */           return zzdhVar;
                }
            }
