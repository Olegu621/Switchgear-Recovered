            package com.google.android.gms.internal.measurement;

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
            import p000.C0826d;
            import p000.le2;
            import p000.lq1;
            import p000.sw1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjy {
                private static volatile lq1 zza;

                private zzjy() {
                }

                /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #2 {all -> 0x0022, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:76:0x017f, B:15:0x0025, B:17:0x002d, B:21:0x003a, B:23:0x0040, B:25:0x0046, B:27:0x004e, B:75:0x017b, B:77:0x0182, B:78:0x0185, B:79:0x0186, B:28:0x0052, B:30:0x0056, B:31:0x0063, B:33:0x0069, B:39:0x007f, B:41:0x0085, B:42:0x0091, B:62:0x015f, B:63:0x0162, B:71:0x0172, B:70:0x016f, B:72:0x0173, B:73:0x0178, B:74:0x0179, B:34:0x006f, B:38:0x0076), top: B:87:0x0007, inners: #1 }] */
                public static lq1 zza(Context context) {
                    lq1 lq1Var;
                    lq1 sw1Var;
                    lq1 sw1Var2;
/* 1 */             lq1 lq1Var2 = zza;
/* 3 */             if (lq1Var2 != null) {
/* 395 */               return lq1Var2;
                    }
                    synchronized (zzjy.class) {
                        try {
/* 8 */                     lq1Var = zza;
/* 10 */                    if (lq1Var == null) {
/* 12 */                        String str = Build.TYPE;
/* 14 */                        String str2 = Build.TAGS;
/* 16 */                        int i = zzka.zza;
/* 24 */                        if (!str.equals("eng") && !str.equals("userdebug")) {
/* 55 */                            lq1Var = C0826d.f6944a;
                                } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
/* 77 */                            Context contextCreateDeviceProtectedStorageContext = (!zzjm.zza() || context.isDeviceProtectedStorage()) ? context : context.createDeviceProtectedStorageContext();
/* 79 */                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                    try {
/* 83 */                                StrictMode.allowThreadDiskWrites();
/* 86 */                                char c = 0;
                                        try {
/* 97 */                                    File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
/* 112 */                                   sw1Var = file.exists() ? new sw1(file) : C0826d.f6944a;
                                        } catch (RuntimeException e) {
/* 123 */                                   AbstractC1245n0.m4877e("HermeticFileOverrides", "no data dir", e);
/* 126 */                                   sw1Var = C0826d.f6944a;
                                        }
/* 132 */                               if (sw1Var.mo2902b()) {
/* 138 */                                   File file2 = (File) sw1Var.mo2901a();
                                            try {
/* 162 */                                       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(AbstractC1417a.m5164b(file2, new FileInputStream(file2))));
                                                try {
/* 167 */                                           le2 le2Var = new le2();
/* 172 */                                           HashMap map = new HashMap();
                                                    while (true) {
/* 175 */                                               String line = bufferedReader.readLine();
/* 179 */                                               if (line == null) {
                                                            break;
                                                        }
/* 184 */                                               String[] strArrSplit = line.split(" ", 3);
/* 189 */                                               if (strArrSplit.length != 3) {
/* 201 */                                                   StringBuilder sb = new StringBuilder(line.length() + 9);
/* 204 */                                                   sb.append("Invalid: ");
/* 207 */                                                   sb.append(line);
/* 214 */                                                   AbstractC1245n0.m4876d("HermeticFileOverrides", sb.toString());
                                                        } else {
/* 226 */                                                   String str3 = new String(strArrSplit[c]);
/* 237 */                                                   String strDecode = Uri.decode(new String(strArrSplit[1]));
/* 248 */                                                   String strDecode2 = (String) map.get(strArrSplit[2]);
/* 250 */                                                   if (strDecode2 == null) {
/* 256 */                                                       String str4 = new String(strArrSplit[2]);
/* 259 */                                                       strDecode2 = Uri.decode(str4);
/* 269 */                                                       if (strDecode2.length() < 1024 || strDecode2 == str4) {
/* 273 */                                                           map.put(str4, strDecode2);
                                                                }
                                                            }
/* 281 */                                                   le2 le2Var2 = (le2) le2Var.getOrDefault(str3, null);
/* 283 */                                                   if (le2Var2 == null) {
/* 287 */                                                       le2Var2 = new le2();
/* 290 */                                                       le2Var.put(str3, le2Var2);
                                                            }
/* 293 */                                                   le2Var2.put(strDecode, strDecode2);
/* 296 */                                                   c = 0;
                                                        }
                                                    }
/* 300 */                                           String string = file2.toString();
/* 304 */                                           String packageName = contextCreateDeviceProtectedStorageContext.getPackageName();
/* 325 */                                           StringBuilder sb2 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
/* 328 */                                           sb2.append("Parsed ");
/* 331 */                                           sb2.append(string);
/* 334 */                                           sb2.append(" for Android package ");
/* 337 */                                           sb2.append(packageName);
/* 344 */                                           AbstractC1245n0.m4889q("HermeticFileOverrides", sb2.toString());
/* 349 */                                           zzjs zzjsVar = new zzjs(le2Var);
/* 352 */                                           bufferedReader.close();
/* 357 */                                           sw1Var2 = new sw1(zzjsVar);
                                                } catch (Throwable th) {
                                                    try {
/* 363 */                                               bufferedReader.close();
/* 371 */                                               throw th;
                                                    } catch (Throwable th2) {
/* 368 */                                               th.addSuppressed(th2);
/* 371 */                                               throw th;
                                                    }
                                                }
                                            } catch (IOException e2) {
/* 377 */                                       throw new RuntimeException(e2);
                                            }
                                        } else {
/* 378 */                                   sw1Var2 = C0826d.f6944a;
                                        }
/* 380 */                               StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
/* 383 */                               lq1Var = sw1Var2;
                                    } catch (Throwable th3) {
/* 387 */                               StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
/* 390 */                               throw th3;
                                    }
                                } else {
/* 55 */                            lq1Var = C0826d.f6944a;
                                }
/* 384 */                       zza = lq1Var;
                            }
                        } catch (Throwable th4) {
/* 394 */                   throw th4;
                        }
                    }
/* 392 */           return lq1Var;
                }
            }
