            package com.quago.mobile.sdk;

            import android.content.ContentResolver;
            import android.content.Context;
            import android.os.Environment;
            import android.os.StatFs;
            import android.os.StrictMode;
            import android.provider.Settings;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.BufferedReader;
            import java.io.File;
            import java.io.FileReader;
            import java.io.IOException;
            import java.io.InputStreamReader;
            import java.net.InetSocketAddress;
            import java.net.Socket;
            import java.util.ArrayList;
            import java.util.TreeMap;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.n */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 214 */   public abstract class AbstractC0749n {

                /* JADX INFO: renamed from: a */
                public static final Pattern f5565a = Pattern.compile("^([^:]+):\\s*(.+)$");

                /* JADX INFO: renamed from: b */
                public static final Pattern f5566b = Pattern.compile("^([^:]+):\\s*(.+)$");

                /* JADX INFO: renamed from: c */
                public static final Pattern f5567c = Pattern.compile("^\\[([^\\]]+)\\]:\\s*\\[(.*)\\]$");

                /* JADX INFO: renamed from: a */
                public static void m2631a(TreeMap treeMap, String str) {
/* 141 */           String strM3507k = AbstractC0886en.m3507k("/sys/block/", str);
/* 147 */           String strConcat = strM3507k.concat("/device");
/* 155 */           String strConcat2 = strM3507k.concat("/queue");
/* 163 */           File file = new File(strM3507k);
/* 170 */           if (file.exists() && file.isDirectory()) {
                        try {
/* 186 */                   m2632a(treeMap, "size_blocks", strM3507k.concat("/size"));
/* 195 */                   m2632a(treeMap, "uevent_block", strM3507k.concat("/uevent"));
/* 204 */                   m2632a(treeMap, "stat", strM3507k.concat("/stat"));
/* 213 */                   m2632a(treeMap, "inflight", strM3507k.concat("/inflight"));
/* 222 */                   m2632a(treeMap, "alignment_offset", strM3507k.concat("/alignment_offset"));
/* 231 */                   m2632a(treeMap, "name", strConcat.concat("/name"));
/* 240 */                   m2632a(treeMap, "manfid", strConcat.concat("/manfid"));
/* 249 */                   m2632a(treeMap, "oemid", strConcat.concat("/oemid"));
/* 258 */                   m2632a(treeMap, "fwrev", strConcat.concat("/fwrev"));
/* 267 */                   m2632a(treeMap, "prv", strConcat.concat("/prv"));
/* 276 */                   m2632a(treeMap, "date", strConcat.concat("/date"));
/* 285 */                   m2632a(treeMap, "cid", strConcat.concat("/cid"));
/* 296 */                   m2632a(treeMap, "csd", strConcat.concat("/csd"));
/* 307 */                   m2632a(treeMap, "ext_csd_rev", strConcat.concat("/ext_csd_rev"));
/* 318 */                   m2632a(treeMap, "serial", strConcat.concat("/serial"));
/* 329 */                   m2632a(treeMap, "hwrev", strConcat.concat("/hwrev"));
/* 340 */                   m2632a(treeMap, "type", strConcat.concat("/type"));
/* 351 */                   m2632a(treeMap, FirebaseAnalytics.Param.INDEX, strConcat.concat("/index"));
/* 362 */                   m2632a(treeMap, "model", strConcat.concat("/model"));
/* 373 */                   m2632a(treeMap, "vendor", strConcat.concat("/vendor"));
/* 384 */                   m2632a(treeMap, "rev", strConcat.concat("/rev"));
/* 395 */                   m2632a(treeMap, "id", strConcat.concat("/id"));
/* 406 */                   m2632a(treeMap, "wlun", strConcat.concat("/wlun"));
/* 415 */                   m2632a(treeMap, "uevent_device", strConcat.concat("/uevent"));
/* 428 */                   m2632a(treeMap, "logical_block_size", strConcat2.concat("/logical_block_size"));
/* 439 */                   m2632a(treeMap, "physical_block_size", strConcat2.concat("/physical_block_size"));
/* 450 */                   m2632a(treeMap, "minimum_io_size", strConcat2.concat("/minimum_io_size"));
/* 461 */                   m2632a(treeMap, "optimal_io_size", strConcat2.concat("/optimal_io_size"));
/* 472 */                   m2632a(treeMap, "hw_sector_size", strConcat2.concat("/hw_sector_size"));
/* 483 */                   m2632a(treeMap, "max_hw_sectors_kb", strConcat2.concat("/max_hw_sectors_kb"));
/* 494 */                   m2632a(treeMap, "max_sectors_kb", strConcat2.concat("/max_sectors_kb"));
/* 505 */                   m2632a(treeMap, "read_ahead_kb", strConcat2.concat("/read_ahead_kb"));
/* 516 */                   m2632a(treeMap, "write_cache", strConcat2.concat("/write_cache"));
/* 527 */                   m2632a(treeMap, "discard_granularity", strConcat2.concat("/discard_granularity"));
/* 538 */                   m2632a(treeMap, "discard_max_bytes", strConcat2.concat("/discard_max_bytes"));
/* 549 */                   m2632a(treeMap, "nr_requests", strConcat2.concat("/nr_requests"));
/* 560 */                   m2632a(treeMap, "depth", strConcat2.concat("/depth"));
/* 571 */                   m2632a(treeMap, "iostats", strConcat2.concat("/iostats"));
/* 582 */                   m2632a(treeMap, "rotational", strConcat2.concat("/rotational"));
/* 593 */                   m2632a(treeMap, "write_zeroes_max_bytes", strConcat2.concat("/write_zeroes_max_bytes"));
/* 604 */                   m2632a(treeMap, "disallow_write_zeroes", strConcat2.concat("/disallow_write_zeroes"));
                        } catch (Throwable th) {
/* 615 */                   treeMap.put("error", th.getMessage());
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public static TreeMap m2635b() {
/* 5 */             TreeMap treeMap = new TreeMap();
                    try {
/* 19 */                int i = 0;
/* 20 */                TreeMap treeMap2 = null;
/* 21 */                int i2 = 0;
/* 26 */                for (String str : m2634b("/proc/cpuinfo")) {
/* 38 */                    if (str.isEmpty()) {
/* 40 */                        treeMap2 = null;
                            } else {
/* 44 */                        Matcher matcher = f5565a.matcher(str);
/* 52 */                        if (matcher.matches()) {
/* 108 */                           String strTrim = matcher.group(1).trim();
/* 113 */                           String strGroup = matcher.group(2);
/* 121 */                           if ("processor".equals(strTrim)) {
/* 125 */                               treeMap2 = new TreeMap();
/* 143 */                               treeMap.put("processor" + i, treeMap2);
/* 146 */                               i++;
                                    } else if ("Features".equals(strTrim) || "flags".equals(strTrim)) {
/* 180 */                               String[] strArrSplit = strGroup.split("\\s+");
/* 184 */                               if (treeMap2 != null) {
/* 186 */                                   treeMap2.put(strTrim, strArrSplit);
                                        } else {
/* 191 */                                   treeMap.put(strTrim, strArrSplit);
                                        }
                                    } else if (treeMap2 != null) {
/* 168 */                               treeMap2.put(strTrim, strGroup);
                                    } else {
/* 173 */                               treeMap.put(strTrim, strGroup);
                                    }
                                } else if (treeMap2 != null) {
/* 60 */                            StringBuilder sb = new StringBuilder();
/* 63 */                            sb.append("_R-");
/* 66 */                            i2++;
/* 68 */                            sb.append(i2);
/* 75 */                            treeMap2.put(sb.toString(), str);
                                } else {
/* 84 */                            StringBuilder sb2 = new StringBuilder();
/* 87 */                            sb2.append("_R-");
/* 90 */                            i2++;
/* 92 */                            sb2.append(i2);
/* 99 */                            treeMap.put(sb2.toString(), str);
                                }
                            }
                        }
/* 202 */               treeMap.put("processor_count", Integer.valueOf(i));
/* 205 */               return treeMap;
                    } catch (Exception e) {
/* 212 */               treeMap.put("Error", e.getMessage());
/* 215 */               return treeMap;
                    }
                }

                /* JADX INFO: renamed from: c */
                public static TreeMap m2636c() {
/* 3 */             TreeMap treeMap = new TreeMap();
                    try {
/* 16 */                int i = 0;
/* 21 */                for (String str : m2634b("/proc/meminfo")) {
/* 31 */                    Matcher matcher = f5566b.matcher(str);
/* 39 */                    if (matcher.matches()) {
/* 55 */                        treeMap.put(matcher.group(1).trim(), matcher.group(2));
                            } else {
/* 63 */                        StringBuilder sb = new StringBuilder();
/* 68 */                        sb.append("_R-");
/* 71 */                        i++;
/* 73 */                        sb.append(i);
/* 80 */                        treeMap.put(sb.toString(), str);
                            }
                        }
/* 84 */                return treeMap;
                    } catch (Exception e) {
/* 91 */                treeMap.put("Error", e.getMessage());
/* 94 */                return treeMap;
                    }
                }

                /* JADX INFO: renamed from: d */
                public static TreeMap m2637d() throws InterruptedException, IOException {
/* 3 */             TreeMap treeMap = new TreeMap();
/* 12 */            Process processExec = Runtime.getRuntime().exec("getprop");
/* 27 */            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
/* 30 */            int i = 0;
                    while (true) {
/* 31 */                String line = bufferedReader.readLine();
/* 35 */                if (line == null) {
/* 86 */                    bufferedReader.close();
/* 89 */                    processExec.waitFor();
/* 92 */                    return treeMap;
                        }
                        try {
/* 39 */                    Matcher matcher = f5567c.matcher(line);
/* 47 */                    if (matcher.matches()) {
/* 59 */                        treeMap.put(matcher.group(1), matcher.group(2));
                            } else {
/* 65 */                        StringBuilder sb = new StringBuilder();
/* 70 */                        sb.append("_R-");
/* 73 */                        i++;
/* 75 */                        sb.append(i);
/* 82 */                        treeMap.put(sb.toString(), line);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
/* 215 */       public static ArrayList m2634b(String str) throws Throwable {
/* 216 */           ArrayList arrayList = new ArrayList();
                    BufferedReader bufferedReader = null;
                    try {
                        try {
/* 217 */                   BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
                            while (true) {
                                try {
/* 218 */                           String line = bufferedReader2.readLine();
                                    if (line != null) {
/* 219 */                               arrayList.add(line);
                                    } else {
/* 220 */                               bufferedReader2.close();
                                        return arrayList;
                                    }
                                } catch (IOException unused) {
                                    bufferedReader = bufferedReader2;
                                    if (bufferedReader != null) {
/* 223 */                               bufferedReader.close();
                                    }
                                    return arrayList;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader = bufferedReader2;
                                    if (bufferedReader != null) {
                                        try {
/* 221 */                                   bufferedReader.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
/* 222 */                           throw th;
                                }
                            }
                        } catch (IOException unused3) {
                            return arrayList;
                        }
                    } catch (IOException unused4) {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }

                /* JADX INFO: renamed from: a */
/* 618 */       public static String m2628a(String str) {
/* 619 */           String line = HttpUrl.FRAGMENT_ENCODE_SET;
                    try {
/* 621 */               BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ".concat(str)).getInputStream()));
/* 622 */               line = bufferedReader.readLine();
/* 623 */               bufferedReader.close();
                        return line;
                    } catch (IOException unused) {
                        return line;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v1 */
                /* JADX WARN: Type inference failed for: r3v3 */
                /* JADX INFO: renamed from: a */
/* 623 */       public static boolean m2633a(int i) {
/* 624 */           Socket socket = new Socket();
/* 625 */           InetSocketAddress inetSocketAddress = new InetSocketAddress("10.0.2.2", i);
                    boolean z = 1000;
                    try {
                        try {
/* 626 */                   socket.connect(inetSocketAddress, 1000);
/* 627 */                   socket.close();
                            return true;
                        } catch (IOException unused) {
                            z = 0;
/* 630 */                   socket.close();
                            return z;
                        } catch (Throwable th) {
                            try {
/* 628 */                       socket.close();
                            } catch (IOException unused2) {
                            }
/* 629 */                   throw th;
                        }
                    } catch (IOException unused3) {
                        return z;
                    }
                }

                /* JADX INFO: renamed from: a */
/* 630 */       public static TreeMap m2629a() {
/* 631 */           TreeMap treeMap = new TreeMap();
/* 632 */           ArrayList arrayList = new ArrayList();
                    for (int i = 0; i <= 7; i++) {
                        arrayList.add("mmcblk" + i);
                        arrayList.add("mmcblk" + i + "p1");
                    }
/* 635 */           arrayList.add("mmcblk0boot0");
/* 636 */           arrayList.add("mmcblk0boot1");
/* 637 */           arrayList.add("mmcblk0rpmb");
                    for (char c = 'a'; c <= 'h'; c = (char) (c + 1)) {
                        String str = "sd" + c;
/* 639 */               arrayList.add(str);
/* 640 */               arrayList.add(str.concat("1"));
                    }
/* 641 */           arrayList.add("nvme0n1");
/* 642 */           arrayList.add("nvme0n1p1");
                    for (int i2 = 0; i2 <= 15; i2++) {
                        arrayList.add("dm-" + i2);
                    }
                    for (int i3 = 0; i3 <= 15; i3++) {
                        arrayList.add("loop" + i3);
                    }
                    for (int i4 = 0; i4 <= 3; i4++) {
                        arrayList.add("ram" + i4);
                        arrayList.add("zram" + i4);
                    }
/* 647 */           arrayList.add("vda");
/* 648 */           arrayList.add("vdb");
/* 649 */           arrayList.add("vda1");
/* 650 */           arrayList.add("vdb1");
                    for (String str2 : (String[]) arrayList.toArray(new String[0])) {
                        try {
/* 653 */                   File file = new File("/sys/block/" + str2);
/* 654 */                   if (file.exists() && file.isDirectory()) {
/* 655 */                       TreeMap treeMap2 = new TreeMap();
/* 656 */                       m2631a(treeMap2, str2);
/* 657 */                       if (!treeMap2.isEmpty()) {
                                    treeMap.put(str2, treeMap2);
                                }
                            }
                        } catch (Exception e) {
/* 660 */                   treeMap.put(AbstractC0886en.m3507k("Error-", str2), e.getMessage());
                        }
                    }
                    try {
/* 662 */               StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
/* 663 */               long blockSizeLong = statFs.getBlockSizeLong();
/* 664 */               long blockCountLong = statFs.getBlockCountLong();
/* 665 */               long availableBlocksLong = statFs.getAvailableBlocksLong();
/* 666 */               long freeBlocksLong = statFs.getFreeBlocksLong();
/* 667 */               treeMap.put("totalBytes", Long.valueOf(blockCountLong * blockSizeLong));
                        long j = availableBlocksLong * blockSizeLong;
/* 668 */               treeMap.put("availableBytes", Long.valueOf(j));
                        long j2 = blockSizeLong * freeBlocksLong;
/* 669 */               treeMap.put("freeBytes", Long.valueOf(j2));
/* 670 */               treeMap.put("reservedBytes", Long.valueOf(j2 - j));
                    } catch (Exception e2) {
/* 671 */               treeMap.put("Error", e2.getMessage());
                    }
                    return treeMap;
                }

                /* JADX INFO: renamed from: a */
/* 671 */       public static TreeMap m2630a(Context context) {
                    TreeMap treeMap = new TreeMap();
/* 673 */           TreeMap treeMap2 = new TreeMap();
                    try {
/* 675 */               StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
                        boolean z = false;
                        try {
/* 676 */                   ContentResolver contentResolver = context.getContentResolver();
                            try {
/* 677 */                       treeMap2.put("ADB_ENABLED", Integer.valueOf(Settings.Global.getInt(contentResolver, "adb_enabled", 0)));
                            } catch (Exception e) {
/* 678 */                       treeMap2.put("ADB_ENABLED", e.getMessage());
                            }
                            try {
/* 679 */                       treeMap2.put("WIFI_ON", Integer.valueOf(Settings.Global.getInt(contentResolver, "wifi_on", 0)));
                            } catch (Exception e2) {
/* 680 */                       treeMap2.put("WIFI_ON", e2.getMessage());
                            }
                            try {
/* 681 */                       treeMap2.put("DEVELOPMENT_SETTINGS_ENABLED", Integer.valueOf(Settings.Global.getInt(contentResolver, "development_settings_enabled", 0)));
                            } catch (Exception e3) {
/* 682 */                       treeMap2.put("DEVELOPMENT_SETTINGS_ENABLED", e3.getMessage());
                            }
                        } catch (Exception unused) {
                        }
/* 684 */               String strM2628a = m2628a("sys.usb.state");
/* 685 */               if (strM2628a != null && strM2628a.contains("adb")) {
                            z = true;
                        }
/* 683 */               treeMap2.put("isUsbAdbFunctionEnabled", Boolean.valueOf(z));
/* 687 */               treeMap2.put("EmuClientPort", Boolean.valueOf(m2633a(5555)));
/* 688 */               treeMap2.put("EmuServerPort", Boolean.valueOf(m2633a(5037)));
/* 690 */               String strM2628a2 = m2628a("service.adb.tcp.port");
/* 691 */               if (strM2628a2 == null || strM2628a2.isEmpty()) {
                            strM2628a2 = null;
                        }
/* 692 */               treeMap2.put("WifiPort", strM2628a2);
                    } catch (Exception e4) {
/* 693 */               treeMap2.put("Error", e4.getMessage());
                    }
/* 694 */           treeMap.put("ADB", treeMap2);
                    try {
/* 672 */               treeMap.put("Storage", m2629a());
                    } catch (Exception e5) {
/* 672 */               treeMap.put("Storage", e5.getMessage());
                    }
                    try {
/* 697 */               treeMap.put("CpuInfo", m2635b());
                    } catch (Exception unused2) {
                    }
                    try {
/* 698 */               treeMap.put("MemoryInfo", m2636c());
                    } catch (Exception unused3) {
                    }
                    try {
/* 699 */               treeMap.put("SystemProperties", m2637d());
                    } catch (Exception unused4) {
                    }
                    return treeMap;
                }

                /* JADX INFO: renamed from: a */
/* 699 */       public static void m2632a(TreeMap treeMap, String str, String str2) {
                    BufferedReader bufferedReader;
                    try {
                        try {
/* 700 */                   File file = new File(str2);
/* 701 */                   if (file.exists() && file.canRead()) {
/* 702 */                       bufferedReader = new BufferedReader(new FileReader(file));
                                try {
/* 703 */                           String line = bufferedReader.readLine();
                                    if (line != null) {
/* 704 */                               treeMap.put(str, line.trim());
                                    }
/* 705 */                           bufferedReader.close();
                                } catch (Throwable unused) {
                                    if (bufferedReader != null) {
/* 706 */                               bufferedReader.close();
                                    }
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    } catch (Throwable unused3) {
                        bufferedReader = null;
                    }
                }
            }
