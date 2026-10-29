            package io.sentry.android.core;

            import android.app.ActivityManager;
            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Environment;
            import android.os.LocaleList;
            import android.os.StatFs;
            import android.os.SystemClock;
            import android.util.DisplayMetrics;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.C1554m6;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.android.core.internal.util.C1219f;
            import io.sentry.android.core.internal.util.C1224k;
            import io.sentry.protocol.C1603h;
            import io.sentry.protocol.C1620q;
            import io.sentry.protocol.EnumC1601g;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1702a;
            import java.io.BufferedReader;
            import java.io.File;
            import java.io.FileReader;
            import java.io.IOException;
            import java.io.InputStreamReader;
            import java.util.ArrayList;
            import java.util.Calendar;
            import java.util.Collections;
            import java.util.Date;
            import java.util.Locale;
            import java.util.TimeZone;
            
            /* JADX INFO: renamed from: io.sentry.android.core.t0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1272t0 {

                /* JADX INFO: renamed from: i */
                public static volatile C1272t0 f10324i;

                /* JADX INFO: renamed from: j */
                public static final C1702a f10325j = new C1702a();

                /* JADX INFO: renamed from: a */
                public final Context f10326a;

                /* JADX INFO: renamed from: b */
                public final SentryAndroidOptions f10327b;

                /* JADX INFO: renamed from: c */
                public final C1248o0 f10328c;

                /* JADX INFO: renamed from: d */
                public final Boolean f10329d;

                /* JADX INFO: renamed from: e */
                public final C1242m0 f10330e;

                /* JADX INFO: renamed from: f */
                public final C1242m0 f10331f;

                /* JADX INFO: renamed from: g */
                public final C1620q f10332g;

                /* JADX INFO: renamed from: h */
                public final Long f10333h;

                /* JADX INFO: Removed unreachable split cross block B:125:0x0149 */
                /* JADX WARN: Code duplicated, block: B:61:0x010a A[PHI: r6
  0x010a: PHI (r6v11 java.lang.Process) = (r6v35 java.lang.Process), (r6v36 java.lang.Process) binds: [B:60:0x0108, B:65:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v20, types: [java.io.Serializable, java.lang.String[]] */
                /* JADX WARN: Type inference failed for: r6v14 */
                /* JADX WARN: Type inference failed for: r6v15 */
                /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.String[]] */
                /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r6v20 */
                /* JADX WARN: Type inference failed for: r6v22 */
                /* JADX WARN: Type inference failed for: r6v23 */
                /* JADX WARN: Type inference failed for: r6v24 */
                /* JADX WARN: Type inference failed for: r6v25 */
                /* JADX WARN: Type inference failed for: r6v26 */
                /* JADX WARN: Type inference failed for: r6v27 */
                /* JADX WARN: Type inference failed for: r6v28 */
                /* JADX WARN: Type inference failed for: r6v29 */
                /* JADX WARN: Type inference failed for: r6v30 */
                /* JADX WARN: Type inference failed for: r6v31 */
                /* JADX WARN: Type inference failed for: r6v6 */
                /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.String] */
                public C1272t0(Context context, SentryAndroidOptions sentryAndroidOptions) {
                    String str;
                    C1242m0 c1242m0;
                    C1242m0 c1242m1;
                    Bundle bundle;
                    Process process;
                    Process processExec;
                    Process process2;
                    Process process3;
                    boolean z;
                    boolean z2;
/* 8 */             this.f10326a = context;
/* 12 */            this.f10327b = sentryAndroidOptions;
/* 23 */            this.f10328c = new C1248o0(sentryAndroidOptions.getLogger());
/* 27 */            C1219f.f10159c.m4843a();
/* 32 */            C1620q c1620q = new C1620q();
/* 37 */            c1620q.f11436a = "Android";
/* 41 */            c1620q.f11437b = Build.VERSION.RELEASE;
/* 45 */            c1620q.f11439d = Build.DISPLAY;
/* 47 */            ILogger logger = sentryAndroidOptions.getLogger();
/* 53 */            String property = System.getProperty("os.version");
/* 61 */            File file = new File("/proc/version");
                    String str2 = property;
/* 68 */            if (file.canRead()) {
                        try {
/* 78 */                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                            try {
/* 81 */                        String line = bufferedReader.readLine();
/* 85 */                        bufferedReader.close();
/* 88 */                        str2 = line;
                            } catch (Throwable th) {
                                try {
/* 94 */                            bufferedReader.close();
/* 102 */                           throw th;
                                } catch (Throwable th2) {
/* 99 */                            th.addSuppressed(th2);
/* 102 */                           throw th;
                                }
                            }
                        } catch (IOException e) {
/* 107 */                   logger.mo4671d(EnumC1553m5.ERROR, "Exception while attempting to read kernel information", e);
                            str2 = property;
                        }
                    }
/* 110 */           if (str2 != 0) {
/* 112 */               c1620q.f11440e = str2;
                    }
/* 120 */           boolean z3 = false;
/* 122 */           if (sentryAndroidOptions.isEnableRootCheck()) {
/* 134 */               C1224k c1224k = new C1224k(this.f10326a, this.f10328c, sentryAndroidOptions.getLogger());
/* 139 */               c1224k.f10175b.getClass();
/* 142 */               String str3 = Build.TAGS;
/* 144 */               if (str3 == null || !str3.contains("test-keys")) {
/* 156 */                   String[] strArr = c1224k.f10177d;
/* 158 */                   int length = strArr.length;
/* 159 */                   int i = 0;
                            str2 = str2;
                            while (true) {
/* 160 */                       ILogger iLogger = c1224k.f10176c;
/* 162 */                       if (i >= length) {
/* 196 */                           process = "su";
                                    try {
                                        try {
/* 204 */                                   processExec = c1224k.f10179f.exec(new String[]{"/system/xbin/which", "su"});
                                            try {
/* 221 */                                       BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream(), C1224k.f10173g));
                                                try {
/* 232 */                                           z = bufferedReader2.readLine() != null;
/* 233 */                                           bufferedReader2.close();
/* 236 */                                           processExec.destroy();
                                                    str2 = processExec;
                                                } catch (Throwable th3) {
                                                    try {
/* 244 */                                               bufferedReader2.close();
/* 252 */                                               throw th3;
                                                    } catch (Throwable th4) {
/* 249 */                                               th3.addSuppressed(th4);
/* 252 */                                               throw th3;
                                                    }
                                                }
                                            } catch (IOException unused) {
/* 279 */                                       iLogger.mo4672k(EnumC1553m5.DEBUG, "SU isn't found on this Device.", new Object[0]);
                                                process3 = processExec;
                                                process2 = processExec;
/* 282 */                                       if (processExec != null) {
/* 267 */                                           process2.destroy();
                                                    process3 = process2;
                                                }
/* 285 */                                       z = false;
                                                str2 = process3;
                                            } catch (Throwable th5) {
/* 240 */                                       th = th5;
/* 262 */                                       iLogger.mo4671d(EnumC1553m5.DEBUG, "Error when trying to check if SU exists.", th);
                                                process3 = processExec;
                                                process2 = processExec;
/* 265 */                                       if (processExec != null) {
/* 267 */                                           process2.destroy();
                                                    process3 = process2;
                                                }
/* 285 */                                       z = false;
                                                str2 = process3;
                                            }
                                        } catch (Throwable th6) {
/* 338 */                                   if (process != 0) {
/* 340 */                                       process.destroy();
                                            }
/* 343 */                                   throw th6;
                                        }
                                    } catch (IOException unused2) {
/* 256 */                               processExec = null;
                                    } catch (Throwable th7) {
/* 253 */                               th = th7;
/* 254 */                               processExec = null;
                                    }
/* 286 */                           if (!z) {
/* 290 */                               AbstractC1704c.m5462q(iLogger, "The ILogger object is required.");
/* 295 */                               PackageManager packageManager = c1224k.f10174a.getPackageManager();
/* 299 */                               if (packageManager != null) {
/* 301 */                                   str2 = c1224k.f10178e;
/* 303 */                                   int length2 = str2.length;
/* 304 */                                   int i2 = 0;
                                            while (true) {
/* 305 */                                       if (i2 < length2) {
/* 307 */                                           String str4 = str2[i2];
                                                    try {
/* 311 */                                               if (Build.VERSION.SDK_INT >= 33) {
/* 1 */                                                     packageManager.getPackageInfo(str4, PackageManager.PackageInfoFlags.of(0L));
                                                        } else {
/* 321 */                                                   packageManager.getPackageInfo(str4, 0);
                                                        }
                                                    } catch (PackageManager.NameNotFoundException unused3) {
/* 325 */                                               i2++;
                                                    }
                                                }
                                            }
                                        }
/* 328 */                               z2 = false;
                                        process = str2;
                                        break;
                                    }
                                } else {
/* 164 */                           String str5 = strArr[i];
                                    try {
/* 175 */                               if (!new File(str5).exists()) {
/* 191 */                                   i++;
                                            str2 = str2;
                                        }
                                    } catch (RuntimeException e2) {
/* 182 */                               str2 = "Error when trying to check if root file %s exists.";
/* 188 */                               iLogger.mo4670b(EnumC1553m5.ERROR, e2, "Error when trying to check if root file %s exists.", str5);
                                    }
                                }
/* 330 */                       z2 = true;
                                process = str2;
                                break;
                            }
/* 335 */                   c1620q.f11441f = Boolean.valueOf(z2);
                        } else {
/* 330 */                   z2 = true;
                            process = str2;
/* 335 */                   c1620q.f11441f = Boolean.valueOf(z2);
                        }
                    }
/* 344 */           this.f10332g = c1620q;
/* 352 */           this.f10329d = this.f10328c.m4895a();
/* 354 */           ILogger logger2 = sentryAndroidOptions.getLogger();
                    try {
/* 360 */               PackageInfo packageInfoM4880h = AbstractC1245n0.m4880h(context, this.f10328c);
/* 364 */               PackageManager packageManager2 = context.getPackageManager();
/* 368 */               if (packageInfoM4880h == null || packageManager2 == null) {
/* 401 */                   c1242m0 = null;
                        } else {
/* 372 */                   str = packageInfoM4880h.packageName;
                            try {
/* 374 */                       String installerPackageName = packageManager2.getInstallerPackageName(str);
/* 385 */                       c1242m0 = new C1242m0(installerPackageName == null, installerPackageName);
                            } catch (IllegalArgumentException unused4) {
/* 398 */                       logger2.mo4672k(EnumC1553m5.DEBUG, "%s package isn't installed.", str);
/* 401 */                       c1242m0 = null;
                            }
                        }
                    } catch (IllegalArgumentException unused5) {
/* 389 */               str = null;
                    }
/* 402 */           this.f10330e = c1242m0;
/* 404 */           C1248o0 c1248o0 = this.f10328c;
/* 406 */           c1248o0.getClass();
/* 428 */           ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) AbstractC1245n0.f10220d.m1157c(context) : (ApplicationInfo) AbstractC1245n0.f10221e.m1157c(context);
/* 430 */           PackageInfo packageInfoM4880h2 = AbstractC1245n0.m4880h(context, c1248o0);
/* 434 */           if (packageInfoM4880h2 != null) {
/* 436 */               ?? r0 = packageInfoM4880h2.splitNames;
/* 438 */               if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
/* 446 */                   z3 = bundle.getBoolean("com.android.vending.splits.required");
                        }
/* 452 */               c1242m1 = new C1242m0(z3, r0);
                    } else {
/* 456 */               c1242m1 = null;
                    }
/* 457 */           this.f10331f = c1242m1;
/* 463 */           ActivityManager.MemoryInfo memoryInfoM4879g = AbstractC1245n0.m4879g(context, sentryAndroidOptions.getLogger());
/* 467 */           if (memoryInfoM4879g != null) {
/* 475 */               this.f10333h = Long.valueOf(memoryInfoM4879g.totalMem);
                    } else {
/* 478 */               this.f10333h = null;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static Float m4937b(Intent intent, C1554m6 c1554m6) {
                    try {
/* 5 */                 int intExtra = intent.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
/* 11 */                int intExtra2 = intent.getIntExtra("scale", -1);
/* 15 */                if (intExtra != -1 && intExtra2 != -1) {
/* 26 */                    return Float.valueOf((intExtra / intExtra2) * 100.0f);
                        }
/* 1 */                 return null;
                    } catch (Throwable th) {
/* 42 */                c1554m6.getLogger().mo4671d(EnumC1553m5.ERROR, "Error getting device battery level.", th);
/* 1 */                 return null;
                    }
                }

                /* JADX INFO: renamed from: c */
                public static C1272t0 m4938c(Context context, SentryAndroidOptions sentryAndroidOptions) {
/* 3 */             if (f10324i == null) {
/* 5 */                 C1702a c1702a = f10325j;
/* 7 */                 c1702a.m5443c();
                        try {
/* 12 */                    if (f10324i == null) {
/* 16 */                        Context applicationContext = context.getApplicationContext();
/* 20 */                        if (applicationContext != null) {
/* 22 */                            context = applicationContext;
                                }
/* 26 */                        f10324i = new C1272t0(context, sentryAndroidOptions);
                            }
/* 31 */                    c1702a.close();
                        } catch (Throwable th) {
                            try {
/* 35 */                        c1702a.close();
                            } catch (Throwable th2) {
/* 40 */                        th.addSuppressed(th2);
                            }
/* 43 */                    throw th;
                        }
                    }
/* 44 */            return f10324i;
                }

                /* JADX INFO: renamed from: d */
                public static Boolean m4939d(Intent intent, C1554m6 c1554m6) {
                    try {
/* 4 */                 int intExtra = intent.getIntExtra("plugged", -1);
/* 8 */                 boolean z = true;
/* 9 */                 if (intExtra != 1 && intExtra != 2) {
/* 15 */                    z = false;
                        }
/* 16 */                return Boolean.valueOf(z);
                    } catch (Throwable th) {
/* 30 */                c1554m6.getLogger().mo4671d(EnumC1553m5.ERROR, "Error getting device charging state.", th);
/* 33 */                return null;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:101:0x0244  */
                /* JADX WARN: Code duplicated, block: B:104:0x024e A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:105:0x0250 A[Catch: all -> 0x028f, TryCatch #11 {all -> 0x028f, blocks: (B:102:0x0248, B:105:0x0250, B:107:0x0256, B:109:0x025a, B:118:0x0272, B:113:0x0261, B:116:0x0268, B:122:0x0285, B:119:0x0275), top: B:164:0x0248 }] */
                /* JADX WARN: Code duplicated, block: B:106:0x0255  */
                /* JADX WARN: Code duplicated, block: B:109:0x025a A[Catch: all -> 0x028f, TryCatch #11 {all -> 0x028f, blocks: (B:102:0x0248, B:105:0x0250, B:107:0x0256, B:109:0x025a, B:118:0x0272, B:113:0x0261, B:116:0x0268, B:122:0x0285, B:119:0x0275), top: B:164:0x0248 }] */
                /* JADX WARN: Code duplicated, block: B:111:0x025e  */
                /* JADX WARN: Code duplicated, block: B:112:0x025f  */
                /* JADX WARN: Code duplicated, block: B:113:0x0261 A[Catch: all -> 0x028f, TryCatch #11 {all -> 0x028f, blocks: (B:102:0x0248, B:105:0x0250, B:107:0x0256, B:109:0x025a, B:118:0x0272, B:113:0x0261, B:116:0x0268, B:122:0x0285, B:119:0x0275), top: B:164:0x0248 }] */
                /* JADX WARN: Code duplicated, block: B:119:0x0275 A[Catch: all -> 0x028f, TryCatch #11 {all -> 0x028f, blocks: (B:102:0x0248, B:105:0x0250, B:107:0x0256, B:109:0x025a, B:118:0x0272, B:113:0x0261, B:116:0x0268, B:122:0x0285, B:119:0x0275), top: B:164:0x0248 }] */
                /* JADX WARN: Code duplicated, block: B:122:0x0285 A[Catch: all -> 0x028f, TRY_LEAVE, TryCatch #11 {all -> 0x028f, blocks: (B:102:0x0248, B:105:0x0250, B:107:0x0256, B:109:0x025a, B:118:0x0272, B:113:0x0261, B:116:0x0268, B:122:0x0285, B:119:0x0275), top: B:164:0x0248 }] */
                /* JADX WARN: Code duplicated, block: B:125:0x029c  */
                /* JADX WARN: Code duplicated, block: B:139:0x02dc  */
                /* JADX WARN: Code duplicated, block: B:156:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:160:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:162:0x029f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:166:0x0283 A[ADDED_TO_REGION, EDGE_INSN: B:166:0x0283->B:121:0x0283 BREAK  A[LOOP:0: B:108:0x0258->B:118:0x0272], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:169:0x0282 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:26:0x0094  */
                /* JADX WARN: Code duplicated, block: B:33:0x00ae  */
                /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
                /* JADX WARN: Code duplicated, block: B:42:0x0106  */
                /* JADX WARN: Code duplicated, block: B:44:0x0112  */
                /* JADX WARN: Code duplicated, block: B:45:0x011b  */
                /* JADX WARN: Code duplicated, block: B:55:0x0141  */
                /* JADX WARN: Code duplicated, block: B:58:0x0153  */
                /* JADX WARN: Code duplicated, block: B:61:0x0173  */
                /* JADX WARN: Code duplicated, block: B:65:0x0188  */
                /* JADX WARN: Code duplicated, block: B:66:0x018d  */
                /* JADX WARN: Code duplicated, block: B:68:0x0193  */
                /* JADX WARN: Code duplicated, block: B:71:0x01a8 A[Catch: all -> 0x01b1, TRY_LEAVE, TryCatch #0 {all -> 0x01b1, blocks: (B:69:0x019f, B:71:0x01a8), top: B:141:0x019f }] */
                /* JADX WARN: Code duplicated, block: B:75:0x01bd  */
                /* JADX WARN: Code duplicated, block: B:79:0x01d2 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:80:0x01d4  */
                /* JADX WARN: Code duplicated, block: B:81:0x01d6  */
                /* JADX WARN: Code duplicated, block: B:82:0x01d9  */
                /* JADX WARN: Code duplicated, block: B:85:0x01e7 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:89:0x01ff  */
                /* JADX INFO: renamed from: a */
                public final C1603h m4940a(boolean z, boolean z2) {
                    EnumC1601g enumC1601g;
                    Boolean bool;
                    ILogger logger;
                    DisplayMetrics displayMetrics;
                    Date date;
                    TimeZone timeZone;
                    String strM4963a;
                    Locale locale;
                    ArrayList arrayListM4843a;
                    boolean zIsCollectExternalStorageContext;
                    IntentFilter intentFilter;
                    Intent intentRegisterReceiver;
                    int i;
                    Boolean bool2;
                    ActivityManager.MemoryInfo memoryInfoM4879g;
                    File dataDirectory;
                    File externalFilesDir;
                    StatFs statFs;
                    Long lValueOf;
                    File[] externalFilesDirs;
                    File file;
                    String absolutePath;
                    int length;
                    int i2;
                    Long lValueOf2;
                    Long lValueOf3;
                    Float fValueOf;
                    int intExtra;
                    LocaleList locales;
                    Locale locale2;
/* 1 */             Context context = this.f10326a;
/* 5 */             C1603h c1603h = new C1603h();
/* 10 */            c1603h.f11327b = Build.MANUFACTURER;
/* 14 */            c1603h.f11329c = Build.BRAND;
/* 16 */            SentryAndroidOptions sentryAndroidOptions = this.f10327b;
/* 26 */            c1603h.f11331d = AbstractC1245n0.m4878f(sentryAndroidOptions.getLogger());
/* 30 */            c1603h.f11333e = Build.MODEL;
/* 34 */            c1603h.f11335f = Build.ID;
/* 38 */            c1603h.f11339i = Build.SUPPORTED_ABIS;
/* 42 */            this.f10328c.getClass();
/* 49 */            if (Build.VERSION.SDK_INT >= 31) {
/* 79 */                c1603h.f11350s0 = Build.SOC_MANUFACTURER + " " + Build.SOC_MODEL;
                    }
/* 84 */            Long lValueOf4 = null;
                    try {
/* 93 */                int i3 = context.getResources().getConfiguration().orientation;
                        try {
                            try {
                                try {
/* 95 */                            if (i3 != 1) {
/* 97 */                                if (i3 != 2) {
/* 99 */                                    enumC1601g = null;
                                        } else {
/* 101 */                                   enumC1601g = EnumC1601g.LANDSCAPE;
                                        }
/* 108 */                               if (enumC1601g == null) {
                                            try {
/* 120 */                                       sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
/* 123 */                                       enumC1601g = null;
                                            } catch (Throwable th) {
/* 125 */                                       th = th;
/* 140 */                                       sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Error getting device orientation.", th);
                                            }
                                        }
/* 143 */                               c1603h.f11320V = enumC1601g;
/* 145 */                               bool = this.f10329d;
/* 147 */                               if (bool != null) {
/* 149 */                                   c1603h.f11321W = bool;
                                        }
/* 151 */                               logger = sentryAndroidOptions.getLogger();
/* 159 */                               displayMetrics = context.getResources().getDisplayMetrics();
/* 173 */                               if (displayMetrics != null) {
/* 181 */                                   c1603h.f11336f0 = Integer.valueOf(displayMetrics.widthPixels);
/* 189 */                                   c1603h.f11337g0 = Integer.valueOf(displayMetrics.heightPixels);
/* 197 */                                   c1603h.f11338h0 = Float.valueOf(displayMetrics.density);
/* 205 */                                   c1603h.f11340i0 = Integer.valueOf(displayMetrics.densityDpi);
                                        }
/* 218 */                               date = new Date(System.currentTimeMillis() - SystemClock.elapsedRealtime());
/* 237 */                               c1603h.f11341j0 = date;
/* 243 */                               if (Build.VERSION.SDK_INT >= 33) {
/* 253 */                                   locales = context.getResources().getConfiguration().getLocales();
/* 261 */                                   if (locales.isEmpty()) {
/* 284 */                                       timeZone = TimeZone.getDefault();
                                            } else {
/* 263 */                                       locale2 = locales.get(0);
/* 273 */                                       if (locale2.getUnicodeLocaleType("tz") != null) {
/* 279 */                                           timeZone = Calendar.getInstance(locale2).getTimeZone();
                                                } else {
/* 284 */                                           timeZone = TimeZone.getDefault();
                                                }
                                            }
                                        } else {
/* 284 */                                   timeZone = TimeZone.getDefault();
                                        }
/* 288 */                               c1603h.f11342k0 = timeZone;
/* 292 */                               if (c1603h.f11343l0 == null) {
                                            try {
/* 294 */                                       strM4963a = AbstractC1287y0.m4963a(context);
                                            } catch (Throwable th2) {
/* 308 */                                       sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Error getting installationId.", th2);
/* 311 */                                       strM4963a = null;
                                            }
/* 312 */                                   c1603h.f11343l0 = strM4963a;
                                        }
/* 314 */                               locale = Locale.getDefault();
/* 320 */                               if (c1603h.f11344m0 == null) {
/* 326 */                                   c1603h.f11344m0 = locale.toString();
                                        }
/* 330 */                               arrayListM4843a = C1219f.f10159c.m4843a();
/* 338 */                               if (!arrayListM4843a.isEmpty()) {
/* 354 */                                   c1603h.f11348q0 = Double.valueOf(((Integer) Collections.max(arrayListM4843a)).doubleValue());
/* 364 */                                   c1603h.f11347p0 = Integer.valueOf(arrayListM4843a.size());
                                        }
/* 368 */                               c1603h.f11322X = this.f10333h;
/* 370 */                               if (z && sentryAndroidOptions.isCollectAdditionalContext()) {
/* 378 */                                   zIsCollectExternalStorageContext = sentryAndroidOptions.isCollectExternalStorageContext();
/* 386 */                                   intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
/* 391 */                                   if (Build.VERSION.SDK_INT >= 33) {
/* 7 */                                         intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null, 4);
                                            } else {
/* 398 */                                       intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null);
                                            }
/* 402 */                                   if (intentRegisterReceiver != null) {
/* 408 */                                       c1603h.f11352v = m4937b(intentRegisterReceiver, sentryAndroidOptions);
/* 414 */                                       c1603h.f11353w = m4939d(intentRegisterReceiver, sentryAndroidOptions);
                                                try {
/* 419 */                                           intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
/* 423 */                                           if (intExtra != -1) {
/* 429 */                                               fValueOf = Float.valueOf(intExtra / 10.0f);
                                                    } else {
/* 446 */                                               fValueOf = null;
                                                    }
                                                } catch (Throwable th3) {
/* 443 */                                           sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Error getting battery temperature.", th3);
                                                }
/* 447 */                                       c1603h.f11346o0 = fValueOf;
                                            }
/* 463 */                                   i = AbstractC1269s0.f10302a[sentryAndroidOptions.getConnectionStatusProvider().mo4835r0().ordinal()];
/* 465 */                                   if (i == 1) {
/* 474 */                                       bool2 = Boolean.FALSE;
                                            } else if (i != 2) {
/* 469 */                                       bool2 = null;
                                            } else {
/* 471 */                                       bool2 = Boolean.TRUE;
                                            }
/* 476 */                                   c1603h.f11319U = bool2;
/* 482 */                                   memoryInfoM4879g = AbstractC1245n0.m4879g(context, sentryAndroidOptions.getLogger());
/* 486 */                                   if (memoryInfoM4879g != null && z2) {
/* 496 */                                       c1603h.f11323Y = Long.valueOf(memoryInfoM4879g.availMem);
/* 504 */                                       c1603h.f11326a0 = Boolean.valueOf(memoryInfoM4879g.lowMemory);
                                            }
/* 506 */                                   dataDirectory = Environment.getDataDirectory();
/* 510 */                                   if (dataDirectory != null) {
/* 518 */                                       StatFs statFs2 = new StatFs(dataDirectory.getPath());
                                                try {
/* 530 */                                           lValueOf2 = Long.valueOf(statFs2.getBlockCountLong() * statFs2.getBlockSizeLong());
                                                } catch (Throwable th4) {
/* 544 */                                           sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Error getting total internal storage amount.", th4);
/* 547 */                                           lValueOf2 = null;
                                                }
/* 548 */                                       c1603h.f11328b0 = lValueOf2;
                                                try {
/* 559 */                                           lValueOf3 = Long.valueOf(statFs2.getAvailableBlocksLong() * statFs2.getBlockSizeLong());
                                                } catch (Throwable th5) {
/* 573 */                                           sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Error getting unused internal storage amount.", th5);
/* 576 */                                           lValueOf3 = null;
                                                }
/* 577 */                                       c1603h.f11330c0 = lValueOf3;
                                            }
/* 579 */                                   if (zIsCollectExternalStorageContext) {
/* 581 */                                       externalFilesDir = context.getExternalFilesDir(null);
                                                try {
/* 585 */                                           externalFilesDirs = context.getExternalFilesDirs(null);
/* 589 */                                           if (externalFilesDirs != null) {
/* 591 */                                               if (externalFilesDir != null) {
/* 593 */                                                   absolutePath = externalFilesDir.getAbsolutePath();
                                                        } else {
/* 598 */                                                   absolutePath = null;
                                                        }
/* 599 */                                               length = externalFilesDirs.length;
/* 600 */                                               i2 = 0;
                                                        while (true) {
/* 601 */                                                   if (i2 < length) {
/* 603 */                                                       file = externalFilesDirs[i2];
/* 605 */                                                       if (file != null) {
/* 608 */                                                           if (absolutePath != null || absolutePath.isEmpty() || !file.getAbsolutePath().contains(absolutePath)) {
                                                                        break;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
/* 627 */                                                       i2++;
                                                            }
                                                        }
/* 644 */                                               if (file != null) {
/* 652 */                                                   statFs = new StatFs(file.getPath());
                                                        } else {
/* 669 */                                                   statFs = null;
                                                        }
/* 670 */                                               if (statFs != null) {
                                                            try {
/* 681 */                                                       lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                                            } catch (Throwable th6) {
/* 695 */                                                       sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Error getting total external storage amount.", th6);
/* 698 */                                                       lValueOf = null;
                                                            }
/* 699 */                                                   c1603h.f11332d0 = lValueOf;
                                                            try {
/* 710 */                                                       lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                                            } catch (Throwable th7) {
/* 724 */                                                       sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Error getting unused external storage amount.", th7);
                                                            }
/* 727 */                                                   c1603h.f11334e0 = lValueOf4;
                                                        }
                                                    } else {
/* 640 */                                               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                                                    }
/* 643 */                                           file = null;
/* 644 */                                           if (file != null) {
/* 652 */                                               statFs = new StatFs(file.getPath());
                                                    } else {
/* 669 */                                               statFs = null;
                                                    }
                                                } catch (Throwable unused) {
/* 666 */                                           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Not possible to read external files directory", new Object[0]);
                                                }
/* 670 */                                       if (statFs != null) {
/* 681 */                                           lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
/* 699 */                                           c1603h.f11332d0 = lValueOf;
/* 710 */                                           lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
/* 727 */                                           c1603h.f11334e0 = lValueOf4;
                                                }
                                            }
/* 731 */                                   if (c1603h.f11345n0 == null) {
/* 741 */                                       c1603h.f11345n0 = sentryAndroidOptions.getConnectionStatusProvider().mo4836u();
                                            }
                                        }
/* 743 */                               return c1603h;
                                    }
/* 106 */                           enumC1601g = EnumC1601g.PORTRAIT;
/* 218 */                           date = new Date(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                                } catch (IllegalArgumentException e) {
/* 233 */                           sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.ERROR, e, "Error getting the device's boot time.", new Object[0]);
/* 236 */                           date = null;
                                }
/* 108 */                       if (enumC1601g == null) {
/* 120 */                           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
/* 123 */                           enumC1601g = null;
                                }
                            } catch (Throwable th8) {
/* 127 */                       th = th8;
/* 128 */                       enumC1601g = null;
/* 140 */                       sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Error getting device orientation.", th);
/* 143 */                       c1603h.f11320V = enumC1601g;
/* 145 */                       bool = this.f10329d;
/* 147 */                       if (bool != null) {
/* 149 */                           c1603h.f11321W = bool;
                                }
/* 151 */                       logger = sentryAndroidOptions.getLogger();
/* 159 */                       displayMetrics = context.getResources().getDisplayMetrics();
/* 173 */                       if (displayMetrics != null) {
/* 181 */                           c1603h.f11336f0 = Integer.valueOf(displayMetrics.widthPixels);
/* 189 */                           c1603h.f11337g0 = Integer.valueOf(displayMetrics.heightPixels);
/* 197 */                           c1603h.f11338h0 = Float.valueOf(displayMetrics.density);
/* 205 */                           c1603h.f11340i0 = Integer.valueOf(displayMetrics.densityDpi);
                                }
/* 218 */                       date = new Date(System.currentTimeMillis() - SystemClock.elapsedRealtime());
/* 237 */                       c1603h.f11341j0 = date;
/* 243 */                       if (Build.VERSION.SDK_INT >= 33) {
/* 253 */                           locales = context.getResources().getConfiguration().getLocales();
/* 261 */                           if (locales.isEmpty()) {
/* 263 */                               locale2 = locales.get(0);
/* 273 */                               if (locale2.getUnicodeLocaleType("tz") != null) {
/* 279 */                                   timeZone = Calendar.getInstance(locale2).getTimeZone();
                                        } else {
/* 284 */                                   timeZone = TimeZone.getDefault();
                                        }
                                    } else {
/* 284 */                               timeZone = TimeZone.getDefault();
                                    }
                                } else {
/* 284 */                           timeZone = TimeZone.getDefault();
                                }
/* 288 */                       c1603h.f11342k0 = timeZone;
/* 292 */                       if (c1603h.f11343l0 == null) {
/* 294 */                           strM4963a = AbstractC1287y0.m4963a(context);
/* 312 */                           c1603h.f11343l0 = strM4963a;
                                }
/* 314 */                       locale = Locale.getDefault();
/* 320 */                       if (c1603h.f11344m0 == null) {
/* 326 */                           c1603h.f11344m0 = locale.toString();
                                }
/* 330 */                       arrayListM4843a = C1219f.f10159c.m4843a();
/* 338 */                       if (!arrayListM4843a.isEmpty()) {
/* 354 */                           c1603h.f11348q0 = Double.valueOf(((Integer) Collections.max(arrayListM4843a)).doubleValue());
/* 364 */                           c1603h.f11347p0 = Integer.valueOf(arrayListM4843a.size());
                                }
/* 368 */                       c1603h.f11322X = this.f10333h;
/* 370 */                       if (z) {
/* 378 */                           zIsCollectExternalStorageContext = sentryAndroidOptions.isCollectExternalStorageContext();
/* 386 */                           intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
/* 391 */                           if (Build.VERSION.SDK_INT >= 33) {
/* 7 */                                 intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null, 4);
                                    } else {
/* 398 */                               intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null);
                                    }
/* 402 */                           if (intentRegisterReceiver != null) {
/* 408 */                               c1603h.f11352v = m4937b(intentRegisterReceiver, sentryAndroidOptions);
/* 414 */                               c1603h.f11353w = m4939d(intentRegisterReceiver, sentryAndroidOptions);
/* 419 */                               intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
/* 423 */                               if (intExtra != -1) {
/* 429 */                                   fValueOf = Float.valueOf(intExtra / 10.0f);
                                        } else {
/* 446 */                                   fValueOf = null;
                                        }
/* 447 */                               c1603h.f11346o0 = fValueOf;
                                    }
/* 463 */                           i = AbstractC1269s0.f10302a[sentryAndroidOptions.getConnectionStatusProvider().mo4835r0().ordinal()];
/* 465 */                           if (i == 1) {
/* 474 */                               bool2 = Boolean.FALSE;
                                    } else if (i != 2) {
/* 469 */                               bool2 = null;
                                    } else {
/* 471 */                               bool2 = Boolean.TRUE;
                                    }
/* 476 */                           c1603h.f11319U = bool2;
/* 482 */                           memoryInfoM4879g = AbstractC1245n0.m4879g(context, sentryAndroidOptions.getLogger());
/* 486 */                           if (memoryInfoM4879g != null) {
/* 496 */                               c1603h.f11323Y = Long.valueOf(memoryInfoM4879g.availMem);
/* 504 */                               c1603h.f11326a0 = Boolean.valueOf(memoryInfoM4879g.lowMemory);
                                    }
/* 506 */                           dataDirectory = Environment.getDataDirectory();
/* 510 */                           if (dataDirectory != null) {
/* 518 */                               StatFs statFs3 = new StatFs(dataDirectory.getPath());
/* 530 */                               lValueOf2 = Long.valueOf(statFs3.getBlockCountLong() * statFs3.getBlockSizeLong());
/* 548 */                               c1603h.f11328b0 = lValueOf2;
/* 559 */                               lValueOf3 = Long.valueOf(statFs3.getAvailableBlocksLong() * statFs3.getBlockSizeLong());
/* 577 */                               c1603h.f11330c0 = lValueOf3;
                                    }
/* 579 */                           if (zIsCollectExternalStorageContext) {
/* 581 */                               externalFilesDir = context.getExternalFilesDir(null);
/* 585 */                               externalFilesDirs = context.getExternalFilesDirs(null);
/* 589 */                               if (externalFilesDirs != null) {
/* 591 */                                   if (externalFilesDir != null) {
/* 593 */                                       absolutePath = externalFilesDir.getAbsolutePath();
                                            } else {
/* 598 */                                       absolutePath = null;
                                            }
/* 599 */                                   length = externalFilesDirs.length;
/* 600 */                                   i2 = 0;
                                            while (true) {
/* 601 */                                       if (i2 < length) {
/* 603 */                                           file = externalFilesDirs[i2];
/* 605 */                                           if (file != null) {
/* 608 */                                               if (absolutePath != null) {
                                                            break;
                                                        }
                                                    }
/* 627 */                                           i2++;
                                                }
                                            }
/* 644 */                                   if (file != null) {
/* 652 */                                       statFs = new StatFs(file.getPath());
                                            } else {
/* 669 */                                       statFs = null;
                                            }
/* 670 */                                   if (statFs != null) {
/* 681 */                                       lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
/* 699 */                                       c1603h.f11332d0 = lValueOf;
/* 710 */                                       lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
/* 727 */                                       c1603h.f11334e0 = lValueOf4;
                                            }
                                        } else {
/* 640 */                                   sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                                        }
/* 643 */                               file = null;
/* 644 */                               if (file != null) {
/* 652 */                                   statFs = new StatFs(file.getPath());
                                        } else {
/* 669 */                                   statFs = null;
                                        }
/* 670 */                               if (statFs != null) {
/* 681 */                                   lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
/* 699 */                                   c1603h.f11332d0 = lValueOf;
/* 710 */                                   lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
/* 727 */                                   c1603h.f11334e0 = lValueOf4;
                                        }
                                    }
/* 731 */                           if (c1603h.f11345n0 == null) {
/* 741 */                               c1603h.f11345n0 = sentryAndroidOptions.getConnectionStatusProvider().mo4836u();
                                    }
                                }
/* 743 */                       return c1603h;
                            }
/* 159 */                   displayMetrics = context.getResources().getDisplayMetrics();
                        } catch (Throwable th9) {
/* 169 */                   logger.mo4671d(EnumC1553m5.ERROR, "Error getting DisplayMetrics.", th9);
/* 172 */                   displayMetrics = null;
                        }
                    } catch (Throwable th10) {
/* 130 */               th = th10;
                    }
/* 143 */           c1603h.f11320V = enumC1601g;
/* 145 */           bool = this.f10329d;
/* 147 */           if (bool != null) {
/* 149 */               c1603h.f11321W = bool;
                    }
/* 151 */           logger = sentryAndroidOptions.getLogger();
/* 173 */           if (displayMetrics != null) {
/* 181 */               c1603h.f11336f0 = Integer.valueOf(displayMetrics.widthPixels);
/* 189 */               c1603h.f11337g0 = Integer.valueOf(displayMetrics.heightPixels);
/* 197 */               c1603h.f11338h0 = Float.valueOf(displayMetrics.density);
/* 205 */               c1603h.f11340i0 = Integer.valueOf(displayMetrics.densityDpi);
                    }
/* 237 */           c1603h.f11341j0 = date;
/* 243 */           if (Build.VERSION.SDK_INT >= 33) {
/* 253 */               locales = context.getResources().getConfiguration().getLocales();
/* 261 */               if (locales.isEmpty()) {
/* 263 */                   locale2 = locales.get(0);
/* 273 */                   if (locale2.getUnicodeLocaleType("tz") != null) {
/* 279 */                       timeZone = Calendar.getInstance(locale2).getTimeZone();
                            } else {
/* 284 */                       timeZone = TimeZone.getDefault();
                            }
                        } else {
/* 284 */                   timeZone = TimeZone.getDefault();
                        }
                    } else {
/* 284 */               timeZone = TimeZone.getDefault();
                    }
/* 288 */           c1603h.f11342k0 = timeZone;
/* 292 */           if (c1603h.f11343l0 == null) {
/* 294 */               strM4963a = AbstractC1287y0.m4963a(context);
/* 312 */               c1603h.f11343l0 = strM4963a;
                    }
/* 314 */           locale = Locale.getDefault();
/* 320 */           if (c1603h.f11344m0 == null) {
/* 326 */               c1603h.f11344m0 = locale.toString();
                    }
/* 330 */           arrayListM4843a = C1219f.f10159c.m4843a();
/* 338 */           if (!arrayListM4843a.isEmpty()) {
/* 354 */               c1603h.f11348q0 = Double.valueOf(((Integer) Collections.max(arrayListM4843a)).doubleValue());
/* 364 */               c1603h.f11347p0 = Integer.valueOf(arrayListM4843a.size());
                    }
/* 368 */           c1603h.f11322X = this.f10333h;
/* 370 */           if (z) {
/* 378 */               zIsCollectExternalStorageContext = sentryAndroidOptions.isCollectExternalStorageContext();
/* 386 */               intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
/* 391 */               if (Build.VERSION.SDK_INT >= 33) {
/* 7 */                     intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null, 4);
                        } else {
/* 398 */                   intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null);
                        }
/* 402 */               if (intentRegisterReceiver != null) {
/* 408 */                   c1603h.f11352v = m4937b(intentRegisterReceiver, sentryAndroidOptions);
/* 414 */                   c1603h.f11353w = m4939d(intentRegisterReceiver, sentryAndroidOptions);
/* 419 */                   intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
/* 423 */                   if (intExtra != -1) {
/* 429 */                       fValueOf = Float.valueOf(intExtra / 10.0f);
                            } else {
/* 446 */                       fValueOf = null;
                            }
/* 447 */                   c1603h.f11346o0 = fValueOf;
                        }
/* 463 */               i = AbstractC1269s0.f10302a[sentryAndroidOptions.getConnectionStatusProvider().mo4835r0().ordinal()];
/* 465 */               if (i == 1) {
/* 474 */                   bool2 = Boolean.FALSE;
                        } else if (i != 2) {
/* 469 */                   bool2 = null;
                        } else {
/* 471 */                   bool2 = Boolean.TRUE;
                        }
/* 476 */               c1603h.f11319U = bool2;
/* 482 */               memoryInfoM4879g = AbstractC1245n0.m4879g(context, sentryAndroidOptions.getLogger());
/* 486 */               if (memoryInfoM4879g != null) {
/* 496 */                   c1603h.f11323Y = Long.valueOf(memoryInfoM4879g.availMem);
/* 504 */                   c1603h.f11326a0 = Boolean.valueOf(memoryInfoM4879g.lowMemory);
                        }
/* 506 */               dataDirectory = Environment.getDataDirectory();
/* 510 */               if (dataDirectory != null) {
/* 518 */                   StatFs statFs4 = new StatFs(dataDirectory.getPath());
/* 530 */                   lValueOf2 = Long.valueOf(statFs4.getBlockCountLong() * statFs4.getBlockSizeLong());
/* 548 */                   c1603h.f11328b0 = lValueOf2;
/* 559 */                   lValueOf3 = Long.valueOf(statFs4.getAvailableBlocksLong() * statFs4.getBlockSizeLong());
/* 577 */                   c1603h.f11330c0 = lValueOf3;
                        }
/* 579 */               if (zIsCollectExternalStorageContext) {
/* 581 */                   externalFilesDir = context.getExternalFilesDir(null);
/* 585 */                   externalFilesDirs = context.getExternalFilesDirs(null);
/* 589 */                   if (externalFilesDirs != null) {
/* 591 */                       if (externalFilesDir != null) {
/* 593 */                           absolutePath = externalFilesDir.getAbsolutePath();
                                } else {
/* 598 */                           absolutePath = null;
                                }
/* 599 */                       length = externalFilesDirs.length;
/* 600 */                       i2 = 0;
                                while (true) {
/* 601 */                           if (i2 < length) {
/* 603 */                               file = externalFilesDirs[i2];
/* 605 */                               if (file != null) {
/* 608 */                                   if (absolutePath != null) {
                                                break;
                                                break;
                                            }
                                        }
/* 627 */                               i2++;
                                    }
                                }
/* 644 */                       if (file != null) {
/* 652 */                           statFs = new StatFs(file.getPath());
                                } else {
/* 669 */                           statFs = null;
                                }
/* 670 */                       if (statFs != null) {
/* 681 */                           lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
/* 699 */                           c1603h.f11332d0 = lValueOf;
/* 710 */                           lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
/* 727 */                           c1603h.f11334e0 = lValueOf4;
                                }
                            } else {
/* 640 */                       sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                            }
/* 643 */                   file = null;
/* 644 */                   if (file != null) {
/* 652 */                       statFs = new StatFs(file.getPath());
                            } else {
/* 669 */                       statFs = null;
                            }
/* 670 */                   if (statFs != null) {
/* 681 */                       lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
/* 699 */                       c1603h.f11332d0 = lValueOf;
/* 710 */                       lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
/* 727 */                       c1603h.f11334e0 = lValueOf4;
                            }
                        }
/* 731 */               if (c1603h.f11345n0 == null) {
/* 741 */                   c1603h.f11345n0 = sentryAndroidOptions.getConnectionStatusProvider().mo4836u();
                        }
                    }
/* 743 */           return c1603h;
                }
            }
