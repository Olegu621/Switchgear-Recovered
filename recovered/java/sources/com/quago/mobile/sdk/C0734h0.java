            package com.quago.mobile.sdk;

            import android.os.Environment;
            import android.os.SystemClock;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.io.BufferedReader;
            import java.io.File;
            import java.io.FileReader;
            import java.io.InputStreamReader;
            import java.io.RandomAccessFile;
            import java.security.MessageDigest;
            import java.util.Locale;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.h0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 81 */    public final class C0734h0 {

                /* JADX INFO: renamed from: a */
                public final long f5447a;

                /* JADX INFO: renamed from: b */
                public final int f5448b;

                /* JADX INFO: renamed from: c */
                public final int f5449c;

                /* JADX INFO: renamed from: d */
                public final String f5450d;

                /* JADX INFO: renamed from: e */
                public final String f5451e;

                /* JADX INFO: renamed from: f */
                public final String f5452f;

                /* JADX INFO: renamed from: g */
                public final long f5453g;

                /* JADX INFO: renamed from: h */
                public String f5454h;

                /* JADX INFO: renamed from: i */
                public String f5455i;

                /* JADX INFO: renamed from: j */
                public String f5456j;

                /* JADX INFO: renamed from: k */
                public String f5457k;

                static {
/* 1 */             Locale locale = AbstractC0743k0.f5509a;
                }

                public C0734h0() {
/* 4 */             long jUptimeMillis = SystemClock.uptimeMillis();
/* 12 */            this.f5448b = m2593j();
/* 18 */            this.f5449c = m2598o();
/* 24 */            this.f5450d = m2592i();
/* 30 */            this.f5451e = m2594k();
/* 36 */            this.f5452f = m2591h();
/* 43 */            this.f5453g = SystemClock.uptimeMillis() - jUptimeMillis;
/* 125 */           this.f5447a = AbstractC0730g.m2575a(m2585b(), m2586c(), m2596m(), m2595l(), m2597n(), m2582a(), m2589f(), m2590g(), m2587d(), m2588e());
                }

                /* JADX INFO: renamed from: b */
                public static boolean m2585b() {
                    try {
/* 10 */                StringBuilder sb = new StringBuilder();
/* 21 */                sb.append(Environment.getExternalStorageDirectory().toString());
/* 24 */                char c = File.separatorChar;
/* 26 */                sb.append(c);
/* 29 */                sb.append("Android");
/* 32 */                sb.append(c);
/* 35 */                sb.append(SharedDataContentProvider.BASE_PATH);
/* 38 */                sb.append(c);
/* 43 */                sb.append("com.bluestacks.home");
/* 50 */                File file = new File(sb.toString());
/* 95 */                File file2 = new File(Environment.getExternalStorageDirectory().toString() + c + "Android" + c + SharedDataContentProvider.BASE_PATH + c + "com.bluestacks.gamepophome");
/* 102 */               StringBuilder sb2 = new StringBuilder();
/* 113 */               sb2.append(Environment.getExternalStorageDirectory().toString());
/* 116 */               sb2.append(c);
/* 119 */               sb2.append("Android");
/* 122 */               sb2.append(c);
/* 125 */               sb2.append(SharedDataContentProvider.BASE_PATH);
/* 128 */               sb2.append(c);
/* 133 */               sb2.append("com.bluestacks.settings");
                        return file.exists() || file2.exists() || new File(sb2.toString()).exists();
                    } catch (Exception unused) {
/* 5 */                 return false;
                    }
                }

                /* JADX INFO: renamed from: c */
                public static boolean m2586c() {
                    try {
/* 5 */                 StringBuilder sb = new StringBuilder();
/* 16 */                sb.append(Environment.getExternalStorageDirectory().toString());
/* 19 */                char c = File.separatorChar;
/* 21 */                sb.append(c);
/* 26 */                sb.append("windows");
/* 29 */                sb.append(c);
/* 34 */                sb.append("BstSharedFolder");
/* 44 */                return new File(sb.toString()).exists();
                    } catch (Exception unused) {
/* 49 */                return false;
                    }
                }

                /* JADX INFO: renamed from: d */
                public static boolean m2587d() {
/* 13 */            return m2584a(new String[]{"/system/bin/microvirtd", "/system/etc/init.microvirt.sh", "/system/bin/memud", "/system/lib/memuguest.ko"});
                }

                /* JADX INFO: renamed from: e */
                public static boolean m2588e() throws Throwable {
                    String line;
/* 1 */             BufferedReader bufferedReader = null;
/* 2 */             boolean z = false;
                    try {
                        try {
/* 12 */                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/system/bin/flash-archive.sh"));
/* 27 */                    do {
                                try {
/* 15 */                            line = bufferedReader2.readLine();
/* 19 */                            if (line != null) {
                                    }
/* 33 */                            bufferedReader2.close();
/* 36 */                            return z;
                                } catch (Exception unused) {
/* 40 */                            bufferedReader = bufferedReader2;
/* 49 */                            if (bufferedReader != null) {
/* 51 */                                bufferedReader.close();
                                    }
/* 2 */                             return false;
                                } catch (Throwable th) {
/* 37 */                            th = th;
/* 38 */                            bufferedReader = bufferedReader2;
/* 43 */                            if (bufferedReader != null) {
                                        try {
/* 45 */                                    bufferedReader.close();
                                        } catch (Exception unused2) {
                                        }
                                    }
/* 48 */                            throw th;
                                }
/* 27 */                    } while (!line.contains("microvirt"));
/* 29 */                    z = true;
/* 33 */                    bufferedReader2.close();
/* 36 */                    return z;
                        } catch (Exception unused3) {
/* 2 */                     return false;
                        }
                    } catch (Exception unused4) {
                    } catch (Throwable th2) {
/* 42 */                th = th2;
                    }
                }

                /* JADX INFO: renamed from: f */
                public static boolean m2589f() {
                    try {
                        return new File("/data/data/com.bignox.appcenter").isDirectory();
                    } catch (Exception unused) {
/* 16 */                return false;
                    }
                }

                /* JADX INFO: renamed from: g */
                public static boolean m2590g() {
/* 7 */             return m2583a("/lib/arm/", "check.xml", "noxgroup");
                }

                /* JADX INFO: renamed from: h */
                public static String m2591h() throws Throwable {
                    String line;
                    String lowerCase;
/* 1 */             String strTrim = HttpUrl.FRAGMENT_ENCODE_SET;
/* 3 */             BufferedReader bufferedReader = null;
                    try {
                        try {
/* 25 */                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("/system/bin/cat /proc/cpuinfo").getInputStream()));
/* 52 */                    do {
                                try {
/* 28 */                            line = bufferedReader2.readLine();
/* 32 */                            if (line != null) {
/* 34 */                                lowerCase = line.toLowerCase();
/* 44 */                                if (lowerCase.contains("vendor")) {
                                            break;
                                        }
                                    }
/* 74 */                            bufferedReader2.close();
/* 77 */                            return strTrim;
                                } catch (Exception unused) {
/* 78 */                            bufferedReader = bufferedReader2;
/* 87 */                            if (bufferedReader != null) {
/* 89 */                                bufferedReader.close();
                                    }
/* 1 */                             return HttpUrl.FRAGMENT_ENCODE_SET;
                                } catch (Throwable th) {
/* 71 */                            th = th;
/* 72 */                            bufferedReader = bufferedReader2;
/* 81 */                            if (bufferedReader != null) {
                                        try {
/* 83 */                                    bufferedReader.close();
                                        } catch (Exception unused2) {
                                        }
                                    }
/* 86 */                            throw th;
                                }
/* 52 */                    } while (!lowerCase.contains("hardware"));
/* 66 */                    strTrim = line.substring(line.indexOf(":") + 1).trim();
/* 74 */                    bufferedReader2.close();
/* 77 */                    return strTrim;
                        } catch (Exception unused3) {
/* 1 */                     return HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                    } catch (Exception unused4) {
                    } catch (Throwable th2) {
/* 80 */                th = th2;
                    }
                }

                /* JADX INFO: renamed from: i */
                public static String m2592i() {
                    try {
/* 3 */                 return System.getProperty("os.arch");
                    } catch (Exception unused) {
/* 8 */                 return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }

                /* JADX INFO: renamed from: j */
                public static int m2593j() {
                    try {
/* 5 */                 return Runtime.getRuntime().availableProcessors();
                    } catch (Exception unused) {
/* 10 */                return 1;
                    }
                }

                /* JADX INFO: renamed from: k */
                public static String m2594k() throws Throwable {
                    String line;
/* 1 */             String strTrim = HttpUrl.FRAGMENT_ENCODE_SET;
/* 3 */             BufferedReader bufferedReader = null;
                    try {
                        try {
/* 13 */                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/meminfo"));
/* 32 */                    do {
                                try {
/* 16 */                            line = bufferedReader2.readLine();
/* 20 */                            if (line != null) {
                                    }
/* 54 */                            bufferedReader2.close();
/* 57 */                            return strTrim;
                                } catch (Exception unused) {
/* 58 */                            bufferedReader = bufferedReader2;
/* 67 */                            if (bufferedReader != null) {
/* 69 */                                bufferedReader.close();
                                    }
/* 1 */                             return HttpUrl.FRAGMENT_ENCODE_SET;
                                } catch (Throwable th) {
/* 51 */                            th = th;
/* 52 */                            bufferedReader = bufferedReader2;
/* 61 */                            if (bufferedReader != null) {
                                        try {
/* 63 */                                    bufferedReader.close();
                                        } catch (Exception unused2) {
                                        }
                                    }
/* 66 */                            throw th;
                                }
/* 32 */                    } while (!line.toLowerCase().contains("memtotal"));
/* 46 */                    strTrim = line.substring(line.indexOf(":") + 1).trim();
/* 54 */                    bufferedReader2.close();
/* 57 */                    return strTrim;
                        } catch (Exception unused3) {
/* 1 */                     return HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                    } catch (Exception unused4) {
                    } catch (Throwable th2) {
/* 60 */                th = th2;
                    }
                }

                /* JADX INFO: renamed from: l */
                public static boolean m2595l() {
/* 7 */             return m2584a(new String[]{"/bin/50-bliss.sh"});
                }

                /* JADX INFO: renamed from: m */
                public static boolean m2596m() {
                    return m2583a("/sys/devices/virtual/dmi/id/", "product_name", "VirtualBox") || m2583a("/sys/devices/virtual/dmi/id/", "sys_vendor", "innotek");
                }

                /* JADX INFO: renamed from: n */
                public static boolean m2597n() {
                    return m2583a("/sys/devices/virtual/dmi/id/", "bios_version", "Youwave") || m2583a("/sys/devices/virtual/dmi/id/", "product_name", "Youwave");
                }

                /* JADX INFO: renamed from: o */
                public static int m2598o() {
                    RandomAccessFile randomAccessFile;
                    try {
                        try {
/* 17 */                    randomAccessFile = new RandomAccessFile(new File(Environment.getRootDirectory(), "lib/libc.so"), "r");
                            try {
/* 22 */                        randomAccessFile.seek(18L);
/* 26 */                        byte[] bArr = new byte[2];
/* 28 */                        randomAccessFile.readFully(bArr);
/* 42 */                        int i = ((bArr[1] & 255) << 8) | (bArr[0] & 255);
/* 43 */                        randomAccessFile.close();
/* 46 */                        return i;
                            } catch (Throwable unused) {
/* 48 */                        if (randomAccessFile != null) {
/* 50 */                            randomAccessFile.close();
                                }
/* 1 */                         return 0;
                            }
                        } catch (Exception unused2) {
/* 1 */                     return 0;
                        }
                    } catch (Throwable unused3) {
/* 47 */                randomAccessFile = null;
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m2599a(C0725e0 c0725e0) {
                    String string;
                    synchronized (C0725e0.f5415m) {
                        try {
                            try {
/* 16 */                        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(c0725e0.f5419c.array());
/* 25 */                        StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
/* 30 */                        for (byte b : bArrDigest) {
/* 50 */                            sb.append(String.format("%02x", Integer.valueOf(b & 255)));
                                }
/* 58 */                        string = sb.toString();
                            } catch (Exception unused) {
/* 65 */                        string = null;
                            }
                        } catch (Throwable th) {
/* 82 */                    throw th;
                        }
                    }
/* 66 */            this.f5454h = string;
/* 70 */            this.f5455i = c0725e0.f5423g;
/* 74 */            this.f5456j = c0725e0.f5425i;
/* 78 */            this.f5457k = c0725e0.f5424h;
                }

                /* JADX INFO: renamed from: a */
/* 82 */        public static boolean m2584a(String[] strArr) {
                    for (String str : strArr) {
                        try {
/* 84 */                    if (new File(str).exists()) {
                                return true;
                            }
                        } catch (Exception unused) {
                        }
                    }
                    return false;
                }

                /* JADX INFO: renamed from: a */
/* 84 */        public static boolean m2583a(String str, String str2, String str3) throws Throwable {
                    String line;
                    BufferedReader bufferedReader = null;
                    boolean z = false;
                    try {
                        try {
/* 85 */                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str.concat(str2)));
/* 87 */                    do {
                                try {
/* 86 */                            line = bufferedReader2.readLine();
                                    if (line != null) {
                                    }
/* 88 */                            bufferedReader2.close();
                                    return z;
                                } catch (Exception unused) {
                                    bufferedReader = bufferedReader2;
                                    if (bufferedReader != null) {
/* 91 */                                bufferedReader.close();
                                    }
                                    return false;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader = bufferedReader2;
                                    if (bufferedReader != null) {
                                        try {
/* 89 */                                    bufferedReader.close();
                                        } catch (Exception unused2) {
                                        }
                                    }
/* 90 */                            throw th;
                                }
/* 87 */                    } while (!line.contains(str3));
                            z = true;
/* 88 */                    bufferedReader2.close();
                            return z;
                        } catch (Exception unused3) {
                            return false;
                        }
                    } catch (Exception unused4) {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }

                /* JADX INFO: renamed from: a */
/* 91 */        public static boolean m2582a() {
/* 92 */            String[] strArr = {"/fstab.andy", "/init.andy.rc", "/ueventd.andy.rc"};
                    for (int i = 0; i < 3; i++) {
                        try {
/* 94 */                    if (new File(strArr[i]).exists()) {
                                return true;
                            }
                        } catch (Exception unused) {
                        }
                    }
                    return false;
                }
            }
