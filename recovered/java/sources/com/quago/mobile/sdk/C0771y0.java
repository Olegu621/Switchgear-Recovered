            package com.quago.mobile.sdk;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.os.Build;
            import com.quago.mobile.sdk.root.QuagoRootDetectionNative;
            import java.io.BufferedReader;
            import java.io.File;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.NoSuchElementException;
            import java.util.Scanner;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.fm0;
            import p000.pm2;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.y0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 554 */   public final class C0771y0 {

                /* JADX INFO: renamed from: a */
                public final C0740j0 f5685a = AbstractC0743k0.m2619a("QuagoRootDetection");

                /* JADX INFO: renamed from: b */
                public final Context f5686b;

                public C0771y0(Context context) {
/* 12 */            this.f5686b = context;
                }

                /* JADX WARN: Code duplicated, block: B:100:0x0224  */
                /* JADX WARN: Code duplicated, block: B:101:0x0226  */
                /* JADX WARN: Code duplicated, block: B:106:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:71:0x0191  */
                /* JADX WARN: Code duplicated, block: B:79:0x01c6  */
                /* JADX WARN: Code duplicated, block: B:80:0x01c9  */
                /* JADX WARN: Code duplicated, block: B:87:0x01d6  */
                /* JADX WARN: Code duplicated, block: B:89:0x01dc  */
                /* JADX WARN: Code duplicated, block: B:90:0x01e9  */
                /* JADX WARN: Code duplicated, block: B:92:0x01f4 A[LOOP:3: B:91:0x01f2->B:92:0x01f4, LOOP_END] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: a */
                public final boolean m2662a() {
                    char c;
                    String[] strArrSplit;
                    String[] strArrSplit2;
                    String str;
                    Process processExec;
                    boolean z;
                    String[] strArrM2581a;
                    int length;
                    String[] strArr;
                    int i;
                    QuagoRootDetectionNative quagoRootDetectionNative;
                    char c2;
                    String[] strArr2;
                    String str2;
/* 22 */            if (m2664a(new ArrayList(Arrays.asList(AbstractC0733h.f5443a)))) {
/* 551 */               c = 1;
                    } else {
/* 26 */                ArrayList arrayList = new ArrayList();
/* 35 */                arrayList.addAll(Arrays.asList(AbstractC0733h.f5444b));
/* 42 */                if (m2664a(arrayList) || m2663a("su")) {
/* 551 */                   c = 1;
                        } else {
/* 54 */                    HashMap map = new HashMap();
/* 61 */                    map.put("ro.debuggable", "1");
/* 68 */                    map.put("ro.secure", "0");
                            try {
/* 81 */                        InputStream inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
/* 102 */                       strArrSplit = inputStream == null ? null : new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
                            } catch (IOException | NoSuchElementException e) {
/* 114 */                       this.f5685a.m2612a("propsReader", e);
                            }
/* 118 */                   int i2 = 0;
/* 119 */                   if (strArrSplit == null) {
/* 121 */                       c = 1;
                            } else {
/* 126 */                       boolean z2 = false;
/* 127 */                       for (String str3 : strArrSplit) {
/* 143 */                           for (String str4 : map.keySet()) {
/* 155 */                               if (str3.contains(str4)) {
/* 169 */                                   String strM3784j = fm0.m3784j("[", (String) map.get(str4), "]");
/* 177 */                                   if (str3.contains(strM3784j)) {
/* 193 */                                       this.f5685a.m2615d("checkForDangerousProps", pm2.m7489l(str4, " = ", strM3784j, " detected!"), new Object[0]);
/* 196 */                                       z2 = true;
                                            }
                                        }
                                    }
                                }
/* 207 */                       c = 1;
/* 209 */                       if (!z2) {
                                }
                            }
                            try {
/* 221 */                       InputStream inputStream2 = Runtime.getRuntime().exec("mount").getInputStream();
/* 242 */                       strArrSplit2 = inputStream2 == null ? null : new Scanner(inputStream2).useDelimiter("\\A").next().split("\n");
                            } catch (IOException | NoSuchElementException e2) {
/* 254 */                       this.f5685a.m2612a("mountReader", e2);
                            }
/* 258 */                   char c3 = 2;
/* 259 */                   if (strArrSplit2 == null) {
/* 402 */                       str = Build.TAGS;
/* 404 */                       if (str != null || !str.contains("test-keys")) {
                                    try {
/* 416 */                               Runtime runtime = Runtime.getRuntime();
/* 421 */                               String[] strArr3 = new String[2];
/* 427 */                               strArr3[0] = "which";
/* 429 */                               strArr3[c] = "su";
/* 431 */                               processExec = runtime.exec(strArr3);
                                        try {
/* 453 */                                   if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null) {
/* 455 */                                       c2 = c;
                                            } else {
/* 458 */                                       c2 = 0;
                                            }
/* 459 */                                   processExec.destroy();
/* 462 */                                   if (c2 == 0) {
/* 475 */                                       if (QuagoRootDetectionNative.f5622b) {
/* 490 */                                           z = false;
/* 491 */                                           strArrM2581a = AbstractC0733h.m2581a();
/* 495 */                                           length = strArrM2581a.length;
/* 496 */                                           strArr = new String[length];
/* 499 */                                           for (i = 0; i < length; i++) {
/* 512 */                                               strArr[i] = fm0.m3789o(new StringBuilder(), strArrM2581a[i], "su");
                                                    }
/* 519 */                                           quagoRootDetectionNative = new QuagoRootDetectionNative();
                                                    try {
/* 530 */                                               quagoRootDetectionNative.setLogLevel(QuagoSettings.LogLevel.getByPriority(AbstractC0743k0.f5510b).priority);
/* 537 */                                               if (quagoRootDetectionNative.checkForRoot(strArr) <= 0) {
                                                        }
                                                    } catch (UnsatisfiedLinkError unused) {
                                                    }
                                                } else {
/* 479 */                                           z = false;
/* 486 */                                           this.f5685a.m2613b("checkForRootNative", "We could not load the native library to test for root", new Object[0]);
                                                }
/* 546 */                                       if (!m2663a("magisk")) {
/* 549 */                                           return z;
                                                }
                                            }
                                        } catch (Throwable unused2) {
/* 466 */                                   if (processExec != null) {
/* 468 */                                       processExec.destroy();
                                            }
                                        }
                                    } catch (Throwable unused3) {
/* 465 */                               processExec = null;
                                    }
                                }
                            } else {
/* 263 */                       int length2 = strArrSplit2.length;
/* 264 */                       int i3 = 0;
/* 265 */                       char c4 = 0;
/* 266 */                       while (i3 < length2) {
/* 268 */                           String str5 = strArrSplit2[i3];
/* 272 */                           String[] strArrSplit3 = str5.split(" ");
/* 280 */                           if (strArrSplit3.length < 6) {
/* 292 */                               this.f5685a.m2613b("checkForRWPaths", "Error formatting mount line: ".concat(str5), new Object[i2]);
                                    } else {
/* 298 */                               String str6 = strArrSplit3[c3];
/* 301 */                               String str7 = strArrSplit3[5];
/* 303 */                               String[] strArr4 = AbstractC0733h.f5446d;
/* 305 */                               int i4 = i2;
/* 307 */                               while (i4 < 7) {
/* 309 */                                   String str8 = strArr4[i4];
/* 315 */                                   if (str6.equalsIgnoreCase(str8)) {
/* 327 */                                       String strReplace = str7.replace("(", HttpUrl.FRAGMENT_ENCODE_SET).replace(")", HttpUrl.FRAGMENT_ENCODE_SET);
/* 333 */                                       String[] strArrSplit4 = strReplace.split(",");
/* 337 */                                       int length3 = strArrSplit4.length;
                                                while (true) {
/* 338 */                                           strArr2 = strArrSplit2;
/* 340 */                                           if (i2 >= length3) {
/* 380 */                                               str2 = strReplace;
                                                        break;
                                                    }
/* 344 */                                           str2 = strReplace;
/* 352 */                                           if (strArrSplit4[i2].equalsIgnoreCase("rw")) {
/* 365 */                                               this.f5685a.m2615d("checkForRWPaths", AbstractC0886en.m3508l(str8, " path is mounted with rw permissions! ", str5), new Object[0]);
/* 368 */                                               c4 = c;
                                                        break;
                                                    }
/* 373 */                                           i2++;
/* 375 */                                           strArrSplit2 = strArr2;
/* 377 */                                           strReplace = str2;
                                                }
/* 370 */                                       str7 = str2;
                                            } else {
/* 383 */                                       strArr2 = strArrSplit2;
                                            }
/* 385 */                                   i4++;
/* 387 */                                   strArrSplit2 = strArr2;
/* 390 */                                   i2 = 0;
                                        }
                                    }
/* 392 */                           i3++;
/* 394 */                           strArrSplit2 = strArrSplit2;
/* 396 */                           c3 = 2;
/* 397 */                           i2 = 0;
                                }
/* 400 */                       if (c4 == 0) {
/* 402 */                           str = Build.TAGS;
/* 404 */                           if (str != null) {
/* 416 */                               Runtime runtime2 = Runtime.getRuntime();
/* 421 */                               String[] strArr5 = new String[2];
/* 427 */                               strArr5[0] = "which";
/* 429 */                               strArr5[c] = "su";
/* 431 */                               processExec = runtime2.exec(strArr5);
/* 453 */                               if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null) {
/* 455 */                                   c2 = c;
                                        } else {
/* 458 */                                   c2 = 0;
                                        }
/* 459 */                               processExec.destroy();
/* 462 */                               if (c2 == 0) {
/* 475 */                                   if (QuagoRootDetectionNative.f5622b) {
/* 479 */                                       z = false;
/* 486 */                                       this.f5685a.m2613b("checkForRootNative", "We could not load the native library to test for root", new Object[0]);
                                            } else {
/* 490 */                                       z = false;
/* 491 */                                       strArrM2581a = AbstractC0733h.m2581a();
/* 495 */                                       length = strArrM2581a.length;
/* 496 */                                       strArr = new String[length];
/* 499 */                                       while (i < length) {
/* 512 */                                           strArr[i] = fm0.m3789o(new StringBuilder(), strArrM2581a[i], "su");
                                                }
/* 519 */                                       quagoRootDetectionNative = new QuagoRootDetectionNative();
/* 530 */                                       quagoRootDetectionNative.setLogLevel(QuagoSettings.LogLevel.getByPriority(AbstractC0743k0.f5510b).priority);
/* 537 */                                       if (quagoRootDetectionNative.checkForRoot(strArr) <= 0) {
                                                }
                                            }
/* 546 */                                   if (!m2663a("magisk")) {
/* 549 */                                       return z;
                                            }
                                        }
                                    } else {
/* 416 */                               Runtime runtime3 = Runtime.getRuntime();
/* 421 */                               String[] strArr6 = new String[2];
/* 427 */                               strArr6[0] = "which";
/* 429 */                               strArr6[c] = "su";
/* 431 */                               processExec = runtime3.exec(strArr6);
/* 453 */                               if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null) {
/* 455 */                                   c2 = c;
                                        } else {
/* 458 */                                   c2 = 0;
                                        }
/* 459 */                               processExec.destroy();
/* 462 */                               if (c2 == 0) {
/* 475 */                                   if (QuagoRootDetectionNative.f5622b) {
/* 479 */                                       z = false;
/* 486 */                                       this.f5685a.m2613b("checkForRootNative", "We could not load the native library to test for root", new Object[0]);
                                            } else {
/* 490 */                                       z = false;
/* 491 */                                       strArrM2581a = AbstractC0733h.m2581a();
/* 495 */                                       length = strArrM2581a.length;
/* 496 */                                       strArr = new String[length];
/* 499 */                                       while (i < length) {
/* 512 */                                           strArr[i] = fm0.m3789o(new StringBuilder(), strArrM2581a[i], "su");
                                                }
/* 519 */                                       quagoRootDetectionNative = new QuagoRootDetectionNative();
/* 530 */                                       quagoRootDetectionNative.setLogLevel(QuagoSettings.LogLevel.getByPriority(AbstractC0743k0.f5510b).priority);
/* 537 */                                       if (quagoRootDetectionNative.checkForRoot(strArr) <= 0) {
                                                }
                                            }
/* 546 */                                   if (!m2663a("magisk")) {
/* 549 */                                       return z;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 553 */           return c;
                }

                /* JADX INFO: renamed from: a */
/* 555 */       public final boolean m2663a(String str) {
                    boolean z = false;
                    for (String str2 : AbstractC0733h.m2581a()) {
/* 558 */               String strM3783i = fm0.m3783i(str2, str);
/* 560 */               if (new File(str2, str).exists()) {
/* 561 */                   this.f5685a.m2615d("checkForBinary", strM3783i.concat(" binary detected!"), new Object[0]);
                            z = true;
                        }
                    }
                    return z;
                }

                /* JADX INFO: renamed from: a */
/* 561 */       public final boolean m2664a(ArrayList arrayList) {
/* 562 */           PackageManager packageManager = this.f5686b.getPackageManager();
/* 563 */           Iterator it = arrayList.iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        try {
/* 564 */                   packageManager.getPackageInfo(str, 0);
/* 565 */                   this.f5685a.m2613b("isAnyPackageFromListInstalled", str + " ROOT management app detected!", new Object[0]);
                            z = true;
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
                    return z;
                }
            }
