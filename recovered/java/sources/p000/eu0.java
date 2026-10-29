            package p000;

            import android.app.Application;
            import android.content.Context;
            import android.content.SharedPreferences;
            import android.os.Build;
            import android.os.Looper;
            import android.telephony.TelephonyManager;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import java.io.ByteArrayOutputStream;
            import java.io.File;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.OutputStream;
            import java.io.Serializable;
            import java.net.HttpURLConnection;
            import java.net.URL;
            import java.net.URLConnection;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.zip.GZIPOutputStream;
            import okhttp3.HttpUrl;
            import okio.Segment;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 27 */    public final class eu0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7877a = 1;

                /* JADX INFO: renamed from: b */
                public final String f7878b;

                /* JADX INFO: renamed from: c */
                public final Object f7879c;

                /* JADX INFO: renamed from: d */
                public final Serializable f7880d;

                /* JADX INFO: renamed from: e */
                public final Object f7881e;

                /* JADX INFO: renamed from: f */
                public final Map f7882f;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ Object f7883i;

                /* JADX WARN: Multi-variable type inference failed */
                public eu0(ci3 ci3Var, String str, URL url, byte[] bArr, Map map, yh3 yh3Var) {
/* 7 */             Objects.requireNonNull(ci3Var);
/* 10 */            this.f7883i = ci3Var;
/* 12 */            kb1.m6058k(str);
/* 15 */            kb1.m6061n(url);
/* 18 */            this.f7879c = url;
/* 20 */            this.f7880d = bArr;
/* 22 */            this.f7881e = yh3Var;
/* 24 */            this.f7878b = str;
/* 26 */            this.f7882f = map;
                }

                /* JADX INFO: renamed from: a */
                public void m3600a(int i, IOException iOException, byte[] bArr, Map map) {
/* 9 */             bj3 bj3Var = ((ij3) ((wl3) this.f7883i).f16749a).f9659i;
/* 11 */            ij3.m4555l(bj3Var);
/* 24 */            bj3Var.m1370I(new vl3(this, i, iOException, bArr, map));
                }

                /* JADX WARN: Code duplicated, block: B:127:0x024e A[Catch: all -> 0x0252, LOOP:2: B:125:0x0248->B:127:0x024e, LOOP_END, TryCatch #22 {all -> 0x0252, blocks: (B:124:0x0246, B:125:0x0248, B:127:0x024e, B:130:0x0254), top: B:295:0x0246 }] */
                /* JADX WARN: Code duplicated, block: B:166:0x02ce  */
                /* JADX WARN: Code duplicated, block: B:176:0x030a  */
                /* JADX WARN: Code duplicated, block: B:220:0x04db  */
                /* JADX WARN: Code duplicated, block: B:280:0x02f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:282:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:284:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:287:0x02b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:313:0x0254 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:81:0x0159  */
                /* JADX WARN: Code duplicated, block: B:91:0x017c  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r24v0, types: [eu0] */
                /* JADX WARN: Type inference failed for: r6v46 */
                /* JADX WARN: Type inference failed for: r6v47 */
                /* JADX WARN: Type inference failed for: r6v48, types: [java.util.Map] */
                /* JADX WARN: Type inference failed for: r6v49, types: [java.util.Map] */
                /* JADX WARN: Type inference failed for: r6v59 */
                /* JADX WARN: Type inference failed for: r6v60 */
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    boolean zBooleanValue;
                    Throwable th;
                    int responseCode;
                    HttpURLConnection httpURLConnection;
                    OutputStream outputStream;
                    Map map;
                    IOException iOException;
                    OutputStream outputStream2;
                    qh3 qh3Var;
                    bj3 bj3Var;
                    Map<String, List<String>> headerFields;
                    InputStream inputStream;
                    ByteArrayOutputStream byteArrayOutputStream;
                    byte[] bArr;
                    int i;
                    Throwable th2;
                    OutputStream outputStream3;
                    HttpURLConnection httpURLConnection2;
                    ?? r6;
                    IOException iOException2;
                    ?? r7;
                    Object obj;
                    Object obj2;
                    InputStream inputStream2;
/* 3 */             int i2 = this.f7877a;
/* 18 */            Object obj3 = this.f7880d;
/* 20 */            Map map2 = this.f7882f;
/* 22 */            Object obj4 = this.f7879c;
/* 24 */            Object obj5 = this.f7883i;
/* 26 */            int i3 = 0;
/* 27 */            String str = this.f7878b;
/* 29 */            Object obj6 = this.f7881e;
                    switch (i2) {
                        case 0:
/* 805 */                   HashMap map3 = (HashMap) map2;
/* 807 */                   rs0 rs0Var = (rs0) obj4;
/* 809 */                   C1773iy c1773iy = rs0Var.f16260e;
/* 811 */                   er0 er0Var = rs0Var.f16269n;
/* 813 */                   String str2 = (String) obj3;
/* 815 */                   c1773iy.getClass();
/* 821 */                   String[] strArrSplit = str2.split("\\.", 2);
/* 827 */                   er0 er0Var2 = (er0) c1773iy.f11955a;
/* 833 */                   er0Var2.m3595y("domain", strArrSplit[0]);
/* 842 */                   er0Var2.m3595y(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, strArrSplit[1]);
/* 847 */                   er0Var2.m3595y("platform_id", str);
/* 850 */                   Application application = (Application) obj6;
/* 863 */                   boolean z = (application.getApplicationInfo().flags & 2) != 0;
/* 866 */                   Object obj7 = map3.get("enableLogging");
/* 884 */                   boolean z2 = (obj7 instanceof Boolean) && ((Boolean) obj7).booleanValue();
/* 885 */                   rs0Var.f16259d = z2;
/* 889 */                   zr3 zr3Var = new zr3(z, z2);
/* 892 */                   String simCountryIso = HttpUrl.FRAGMENT_ENCODE_SET;
/* 894 */                   if (z && z2) {
/* 934 */                       zr3Var.f20312c = new aa1(application, System.currentTimeMillis() + HttpUrl.FRAGMENT_ENCODE_SET, Looper.getMainLooper().getThread().getId());
/* 945 */                       Thread.setDefaultUncaughtExceptionHandler(new it0(Thread.getDefaultUncaughtExceptionHandler()));
/* 948 */                       C0168b5 c0168b5 = rs0Var.f16263h;
/* 956 */                       zBooleanValue = true;
/* 960 */                       ((ra2) c0168b5.f2215f).m8115t(new dt0(c0168b5, 1));
                            } else {
/* 964 */                       zBooleanValue = true;
                            }
/* 965 */                   xe2.f19065h = zr3Var;
/* 971 */                   StringBuilder sbM3513q = AbstractC0886en.m3513q("Install called: Domain : ", str2, ", Config: ");
/* 977 */                   sbM3513q.append((HashMap) obj5);
/* 982 */                   sbM3513q.append(" SDK X Version: 10.2.0");
/* 987 */                   rs0Var.f16273r.getClass();
/* 997 */                   xe2.m9775m("Helpshift", sbM3513q.toString(), null);
/* 1000 */                  C0168b5 c0168b6 = rs0Var.f16263h;
/* 1002 */                  String packageName = application.getPackageName();
/* 1008 */                  Object obj8 = map3.get("notificationChannelId");
/* 1014 */                  if (obj8 instanceof String) {
/* 1022 */                      ((er0) c0168b6.f2213d).m3595y("notificationChannelId", (String) obj8);
                            }
/* 1027 */                  Object obj9 = map3.get("notificationSoundId");
/* 1033 */                  if (obj9 instanceof Integer) {
/* 1045 */                      ((er0) c0168b6.f2213d).m3594x(((Integer) obj9).intValue(), "notificationSoundId");
                            } else if (obj9 instanceof String) {
/* 1069 */                      ((er0) c0168b6.f2213d).m3594x(application.getResources().getIdentifier((String) obj9, "raw", packageName), "notificationSoundId");
                            }
/* 1074 */                  Object obj10 = map3.get("notificationIcon");
/* 1082 */                  if (obj10 instanceof Integer) {
/* 1094 */                      ((er0) c0168b6.f2213d).m3594x(((Integer) obj10).intValue(), "notificationIcon");
                            } else if (obj10 instanceof String) {
/* 1116 */                      ((er0) c0168b6.f2213d).m3594x(application.getResources().getIdentifier((String) obj10, "drawable", packageName), "notificationIcon");
                            }
/* 1121 */                  Object obj11 = map3.get("notificationLargeIcon");
/* 1127 */                  if (obj11 instanceof Integer) {
/* 1139 */                      ((er0) c0168b6.f2213d).m3594x(((Integer) obj11).intValue(), "notificationLargeIcon");
                            } else if (obj11 instanceof String) {
/* 1161 */                      ((er0) c0168b6.f2213d).m3594x(application.getResources().getIdentifier((String) obj11, "drawable", packageName), "notificationLargeIcon");
                            }
/* 1164 */                  ra2 ra2Var = rs0Var.f16264i;
/* 1168 */                  HashMap map4 = (HashMap) ra2Var.f15957c;
/* 1172 */                  HashMap map5 = (HashMap) ra2Var.f15958d;
/* 1176 */                  C0210cb c0210cb = (C0210cb) ra2Var.f15956b;
/* 1178 */                  c0210cb.getClass();
/* 1185 */                  map5.put("v", "10.2.0");
/* 1192 */                  map5.put("dm", Build.MODEL);
/* 1201 */                  map5.put("ln", c0210cb.m1601y());
/* 1210 */                  map5.put("av", c0210cb.m1593p());
/* 1217 */                  map5.put("os", Build.VERSION.RELEASE);
/* 1222 */                  Object obj12 = map3.get("sdkType");
/* 1230 */                  if (obj12 instanceof String) {
/* 1232 */                      String str3 = (String) obj12;
/* 1238 */                      if (b40.m1234r(str3)) {
/* 1240 */                          map5.put("s", str3);
                                } else {
/* 1246 */                          map5.put("s", "androidx");
                                }
                            } else {
/* 1246 */                      map5.put("s", "androidx");
                            }
/* 1259 */                  String strM3589r = ((er0) ((er0) ra2Var.f15955a).f7853b).m3589r("language");
/* 1267 */                  if (b40.m1234r(strM3589r)) {
/* 1271 */                      map5.put("dln", strM3589r);
                            }
/* 1276 */                  Object obj13 = map3.get("pluginVersion");
/* 1282 */                  if (obj13 instanceof String) {
/* 1284 */                      String str4 = (String) obj13;
/* 1290 */                      if (b40.m1234r(str4)) {
/* 1294 */                          map5.put("pv", str4);
                                }
                            }
/* 1299 */                  Object obj14 = map3.get("runtimeVersion");
/* 1305 */                  if (obj14 instanceof String) {
/* 1307 */                      String str5 = (String) obj14;
/* 1313 */                      if (b40.m1234r(str5)) {
/* 1317 */                          map5.put("rv", str5);
                                }
                            }
/* 1320 */                  map4.putAll(map5);
/* 1353 */                  map4.put("rs", System.getProperty("os.version") + ":" + Build.FINGERPRINT);
/* 1366 */                  TelephonyManager telephonyManager = (TelephonyManager) ((Context) c0210cb.f2804b).getSystemService("phone");
/* 1368 */                  if (telephonyManager != null) {
/* 1371 */                      simCountryIso = telephonyManager.getSimCountryIso();
                            }
/* 1379 */                  if (b40.m1234r(simCountryIso)) {
/* 1383 */                      map4.put("cc", simCountryIso);
                            }
/* 1388 */                  Object obj15 = map3.get("enableInAppNotification");
/* 1394 */                  if (obj15 instanceof Boolean) {
/* 1398 */                      zBooleanValue = ((Boolean) obj15).booleanValue();
                            }
/* 1410 */                  SharedPreferences.Editor editorEdit = ((SharedPreferences) ((er0) er0Var.f7853b).f7853b).edit();
/* 1416 */                  editorEdit.putBoolean("enable_inapp_notificaiton", zBooleanValue);
/* 1423 */                  if (!editorEdit.commit()) {
/* 1425 */                      editorEdit.commit();
                            }
/* 1430 */                  Object obj16 = map3.get("screenOrientation");
/* 1446 */                  er0Var.m3594x(obj16 instanceof Integer ? ((Integer) obj16).intValue() : -1, "screenOrientation");
/* 1451 */                  if (rs0Var.f16268m == null) {
/* 1470 */                      rs0Var.f16268m = new wc0(14, er0Var, rs0Var.f16279x.getCacheDir().getAbsolutePath());
                            }
/* 1472 */                  wc0 wc0Var = rs0Var.f16268m;
/* 1474 */                  wc0Var.getClass();
/* 1479 */                  er0 er0Var3 = (er0) wc0Var.f18577b;
/* 1481 */                  long jCurrentTimeMillis = System.currentTimeMillis();
/* 1491 */                  long jM3587p = ((er0) er0Var3.f7853b).m3587p("last_helpcenter_cache_eviction_time");
/* 1499 */                  if (jM3587p == 0) {
/* 1509 */                      SharedPreferences.Editor editorEdit2 = ((SharedPreferences) ((er0) er0Var3.f7853b).f7853b).edit();
/* 1513 */                      editorEdit2.putLong("last_helpcenter_cache_eviction_time", jCurrentTimeMillis);
/* 1520 */                      if (!editorEdit2.commit()) {
/* 1522 */                          editorEdit2.commit();
                                }
                            } else if (jCurrentTimeMillis - jM3587p >= 604800000) {
/* 1544 */                      SharedPreferences.Editor editorEdit3 = ((SharedPreferences) ((er0) er0Var3.f7853b).f7853b).edit();
/* 1548 */                      editorEdit3.putLong("last_helpcenter_cache_eviction_time", jCurrentTimeMillis);
/* 1555 */                      if (!editorEdit3.commit()) {
/* 1557 */                          editorEdit3.commit();
                                }
/* 1564 */                      StringBuilder sb = new StringBuilder();
/* 1571 */                      sb.append((String) wc0Var.f18578c);
/* 1574 */                      String str6 = File.separator;
/* 1580 */                      fm0.m3796v(sb, str6, "helpshift", str6, "resource_cache");
/* 1592 */                      File[] fileArrListFiles = new File(fm0.m3789o(sb, str6, "helpcenter")).listFiles();
/* 1596 */                      if (fileArrListFiles != null && fileArrListFiles.length != 0) {
/* 1602 */                          int length = fileArrListFiles.length;
/* 1603 */                          while (i3 < length) {
/* 1605 */                              File file = fileArrListFiles[i3];
/* 1607 */                              long jLastModified = file.lastModified();
/* 1613 */                              if (jLastModified != 0 && jCurrentTimeMillis - jLastModified > 2592000000L) {
/* 1626 */                                  file.delete();
                                        }
/* 1629 */                              i3++;
                                    }
                                }
                            }
/* 1634 */                  rs0Var.f16261f.m7000b();
/* 1637 */                  return;
                        case 1:
/* 389 */                   ci3 ci3Var = (ci3) obj5;
/* 393 */                   ij3 ij3Var = (ij3) ci3Var.f16749a;
/* 397 */                   ij3 ij3Var2 = (ij3) ci3Var.f16749a;
/* 399 */                   bj3 bj3Var2 = ij3Var.f9659i;
/* 401 */                   ij3.m4555l(bj3Var2);
/* 404 */                   bj3Var2.m1365D();
                            try {
/* 409 */                       URLConnection uRLConnectionOpenConnection = ((URL) obj4).openConnection();
/* 415 */                       if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
/* 687 */                           throw new IOException("Failed to obtain HTTP connection");
                                }
/* 418 */                       httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
/* 420 */                       httpURLConnection.setDefaultUseCaches(false);
/* 423 */                       ij3Var2.getClass();
/* 426 */                       httpURLConnection.setConnectTimeout(60000);
/* 432 */                       httpURLConnection.setReadTimeout(61000);
/* 435 */                       httpURLConnection.setInstanceFollowRedirects(false);
/* 439 */                       httpURLConnection.setDoInput(true);
/* 442 */                       if (map2 != null) {
                                    try {
/* 456 */                               for (Map.Entry entry : map2.entrySet()) {
/* 476 */                                   httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                        }
                                    } catch (IOException e) {
/* 673 */                               iOException = e;
/* 675 */                               responseCode = 0;
/* 666 */                               outputStream2 = null;
/* 560 */                               Map map6 = null;
/* 756 */                               if (outputStream2 != null) {
                                            try {
/* 758 */                                       outputStream2.close();
                                            } catch (IOException e2) {
/* 763 */                                       uh3 uh3Var = ij3Var2.f9655f;
/* 765 */                                       ij3.m4555l(uh3Var);
/* 774 */                                       uh3Var.f17538f.m8512c(uh3.m9013H(str), "Error closing HTTP compressed POST connection output stream. appId", e2);
                                            }
                                            break;
                                        }
/* 777 */                               if (httpURLConnection != null) {
/* 779 */                                   httpURLConnection.disconnect();
                                        }
/* 786 */                               bj3Var = ij3Var2.f9659i;
/* 788 */                               ij3.m4555l(bj3Var);
/* 799 */                               qh3Var = new qh3(this.f7878b, (yh3) obj6, responseCode, iOException, (byte[]) null, map6);
/* 629 */                               bj3Var.m1370I(qh3Var);
/* 804 */                               return;
                                    } catch (Throwable th3) {
/* 480 */                               th = th3;
/* 670 */                               responseCode = 0;
/* 658 */                               outputStream = null;
/* 660 */                               map = null;
/* 551 */                               th = th;
/* 696 */                               if (outputStream != null) {
                                            try {
/* 698 */                                       outputStream.close();
                                            } catch (IOException e3) {
/* 703 */                                       uh3 uh3Var2 = ij3Var2.f9655f;
/* 705 */                                       ij3.m4555l(uh3Var2);
/* 714 */                                       uh3Var2.f17538f.m8512c(uh3.m9013H(str), "Error closing HTTP compressed POST connection output stream. appId", e3);
                                            }
                                            break;
                                        }
/* 717 */                               if (httpURLConnection != null) {
/* 719 */                                   httpURLConnection.disconnect();
                                        }
/* 726 */                               bj3 bj3Var3 = ij3Var2.f9659i;
/* 728 */                               ij3.m4555l(bj3Var3);
/* 746 */                               bj3Var3.m1370I(new qh3(this.f7878b, (yh3) obj6, responseCode, (IOException) null, (byte[]) null, map));
/* 749 */                               throw th;
                                    }
                                }
/* 486 */                       byte[] bArr2 = (byte[]) obj3;
/* 488 */                       if (bArr2 != null) {
/* 492 */                           ci3 ci3Var2 = ci3Var.f15676b.f13923i;
/* 494 */                           mp3.m6728S(ci3Var2);
/* 497 */                           byte[] bArrM1695l0 = ci3Var2.m1695l0(bArr2);
/* 501 */                           uh3 uh3Var3 = ij3Var2.f9655f;
/* 503 */                           ij3.m4555l(uh3Var3);
/* 506 */                           sh3 sh3Var = uh3Var3.f17534Y;
/* 508 */                           int length2 = bArrM1695l0.length;
/* 513 */                           sh3Var.m8511b(Integer.valueOf(length2), "Uploading data. size");
/* 517 */                           httpURLConnection.setDoOutput(true);
/* 520 */                           httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
/* 523 */                           httpURLConnection.setFixedLengthStreamingMode(length2);
/* 526 */                           httpURLConnection.connect();
/* 529 */                           OutputStream outputStream4 = httpURLConnection.getOutputStream();
                                    try {
/* 533 */                               outputStream4.write(bArrM1695l0);
/* 536 */                               outputStream4.close();
/* 564 */                               responseCode = httpURLConnection.getResponseCode();
                                        try {
                                            try {
/* 568 */                                       headerFields = httpURLConnection.getHeaderFields();
                                                try {
/* 574 */                                           byteArrayOutputStream = new ByteArrayOutputStream();
/* 577 */                                           inputStream = httpURLConnection.getInputStream();
                                                    try {
/* 583 */                                               bArr = new byte[Segment.SHARE_MINIMUM];
                                                        while (true) {
/* 585 */                                                   i = inputStream.read(bArr);
/* 589 */                                                   if (i > 0) {
/* 591 */                                                       byteArrayOutputStream.write(bArr, 0, i);
                                                            } else {
/* 597 */                                                       byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 601 */                                                       inputStream.close();
/* 604 */                                                       httpURLConnection.disconnect();
/* 611 */                                                       bj3Var = ij3Var2.f9659i;
/* 613 */                                                       ij3.m4555l(bj3Var);
/* 624 */                                                       qh3Var = new qh3(this.f7878b, (yh3) obj6, responseCode, (IOException) null, byteArray, headerFields);
                                                            }
                                                        }
                                                    } catch (Throwable th4) {
/* 595 */                                               th = th4;
/* 640 */                                               if (inputStream != null) {
/* 642 */                                                   inputStream.close();
                                                        }
/* 645 */                                               throw th;
                                                    }
                                                } catch (Throwable th5) {
/* 638 */                                           th = th5;
/* 639 */                                           inputStream = null;
                                                }
                                            } catch (IOException e4) {
/* 650 */                                       iOException = e4;
/* 652 */                                       outputStream2 = null;
/* 756 */                                       if (outputStream2 != null) {
/* 758 */                                           outputStream2.close();
                                                }
/* 777 */                                       if (httpURLConnection != null) {
/* 779 */                                           httpURLConnection.disconnect();
                                                }
/* 786 */                                       bj3Var = ij3Var2.f9659i;
/* 788 */                                       ij3.m4555l(bj3Var);
/* 799 */                                       qh3Var = new qh3(this.f7878b, (yh3) obj6, responseCode, iOException, (byte[]) null, map6);
                                                break;
                                            } catch (Throwable th6) {
/* 634 */                                       th = th6;
/* 646 */                                       httpURLConnection = httpURLConnection;
/* 647 */                                       outputStream = null;
/* 551 */                                       th = th;
/* 696 */                                       if (outputStream != null) {
/* 698 */                                           outputStream.close();
                                                    break;
                                                }
/* 717 */                                       if (httpURLConnection != null) {
/* 719 */                                           httpURLConnection.disconnect();
                                                }
/* 726 */                                       bj3 bj3Var4 = ij3Var2.f9659i;
/* 728 */                                       ij3.m4555l(bj3Var4);
/* 746 */                                       bj3Var4.m1370I(new qh3(this.f7878b, (yh3) obj6, responseCode, (IOException) null, (byte[]) null, map));
/* 749 */                                       throw th;
                                            }
                                        } catch (IOException e5) {
/* 664 */                                   iOException = e5;
/* 666 */                                   outputStream2 = null;
/* 560 */                                   Map map7 = null;
/* 756 */                                   if (outputStream2 != null) {
/* 758 */                                       outputStream2.close();
                                            }
/* 777 */                                   if (httpURLConnection != null) {
/* 779 */                                       httpURLConnection.disconnect();
                                            }
/* 786 */                                   bj3Var = ij3Var2.f9659i;
/* 788 */                                   ij3.m4555l(bj3Var);
/* 799 */                                   qh3Var = new qh3(this.f7878b, (yh3) obj6, responseCode, iOException, (byte[]) null, map7);
                                            break;
                                        } catch (Throwable th7) {
/* 656 */                                   th = th7;
/* 658 */                                   outputStream = null;
/* 660 */                                   map = null;
/* 551 */                                   th = th;
/* 696 */                                   if (outputStream != null) {
/* 698 */                                       outputStream.close();
                                                break;
                                            }
/* 717 */                                   if (httpURLConnection != null) {
/* 719 */                                       httpURLConnection.disconnect();
                                            }
/* 726 */                                   bj3 bj3Var5 = ij3Var2.f9659i;
/* 728 */                                   ij3.m4555l(bj3Var5);
/* 746 */                                   bj3Var5.m1370I(new qh3(this.f7878b, (yh3) obj6, responseCode, (IOException) null, (byte[]) null, map));
/* 749 */                                   throw th;
                                        }
                                    } catch (IOException e6) {
/* 554 */                               iOException = e6;
/* 556 */                               outputStream2 = outputStream4;
/* 558 */                               responseCode = 0;
/* 560 */                               Map map8 = null;
/* 756 */                               if (outputStream2 != null) {
/* 758 */                                   outputStream2.close();
                                            break;
                                        }
/* 777 */                               if (httpURLConnection != null) {
/* 779 */                                   httpURLConnection.disconnect();
                                        }
/* 786 */                               bj3Var = ij3Var2.f9659i;
/* 788 */                               ij3.m4555l(bj3Var);
/* 799 */                               qh3Var = new qh3(this.f7878b, (yh3) obj6, responseCode, iOException, (byte[]) null, map8);
/* 629 */                               bj3Var.m1370I(qh3Var);
/* 804 */                               return;
                                    } catch (Throwable th8) {
/* 540 */                               th = th8;
/* 544 */                               outputStream = outputStream4;
/* 546 */                               responseCode = 0;
/* 548 */                               map = null;
/* 550 */                               httpURLConnection = httpURLConnection;
/* 551 */                               th = th;
/* 696 */                               if (outputStream != null) {
/* 698 */                                   outputStream.close();
                                            break;
                                        }
/* 717 */                               if (httpURLConnection != null) {
/* 719 */                                   httpURLConnection.disconnect();
                                        }
/* 726 */                               bj3 bj3Var6 = ij3Var2.f9659i;
/* 728 */                               ij3.m4555l(bj3Var6);
/* 746 */                               bj3Var6.m1370I(new qh3(this.f7878b, (yh3) obj6, responseCode, (IOException) null, (byte[]) null, map));
/* 749 */                               throw th;
                                    }
                                } else {
/* 564 */                           responseCode = httpURLConnection.getResponseCode();
/* 568 */                           headerFields = httpURLConnection.getHeaderFields();
/* 574 */                           byteArrayOutputStream = new ByteArrayOutputStream();
/* 577 */                           inputStream = httpURLConnection.getInputStream();
/* 583 */                           bArr = new byte[Segment.SHARE_MINIMUM];
                                    while (true) {
/* 585 */                               i = inputStream.read(bArr);
/* 589 */                               if (i > 0) {
/* 591 */                                   byteArrayOutputStream.write(bArr, 0, i);
                                        } else {
/* 597 */                                   byte[] byteArray2 = byteArrayOutputStream.toByteArray();
/* 601 */                                   inputStream.close();
/* 604 */                                   httpURLConnection.disconnect();
/* 611 */                                   bj3Var = ij3Var2.f9659i;
/* 613 */                                   ij3.m4555l(bj3Var);
/* 624 */                                   qh3Var = new qh3(this.f7878b, (yh3) obj6, responseCode, (IOException) null, byteArray2, headerFields);
                                        }
                                    }
                                }
/* 629 */                       bj3Var.m1370I(qh3Var);
/* 804 */                       return;
                            } catch (IOException e7) {
/* 750 */                       iOException = e7;
/* 752 */                       responseCode = 0;
/* 754 */                       httpURLConnection = null;
                            } catch (Throwable th9) {
/* 688 */                       th = th9;
/* 689 */                       responseCode = 0;
/* 691 */                       httpURLConnection = null;
/* 692 */                       outputStream = null;
/* 694 */                       map = null;
                            }
                            break;
                        default:
/* 35 */                    wl3 wl3Var = (wl3) obj5;
/* 39 */                    ij3 ij3Var3 = (ij3) wl3Var.f16749a;
/* 43 */                    ij3 ij3Var4 = (ij3) wl3Var.f16749a;
/* 45 */                    bj3 bj3Var7 = ij3Var3.f9659i;
/* 47 */                    ij3.m4555l(bj3Var7);
/* 50 */                    bj3Var7.m1365D();
                            try {
/* 55 */                        URLConnection uRLConnectionOpenConnection2 = ((URL) obj4).openConnection();
/* 61 */                        if (!(uRLConnectionOpenConnection2 instanceof HttpURLConnection)) {
/* 318 */                           throw new IOException("Failed to obtain HTTP connection");
                                }
/* 64 */                        httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection2;
/* 66 */                        httpURLConnection2.setDefaultUseCaches(false);
/* 69 */                        ij3Var4.getClass();
/* 72 */                        httpURLConnection2.setConnectTimeout(60000);
/* 78 */                        httpURLConnection2.setReadTimeout(61000);
/* 81 */                        httpURLConnection2.setInstanceFollowRedirects(false);
/* 84 */                        httpURLConnection2.setDoInput(true);
/* 87 */                        if (map2 != null) {
                                    try {
                                        try {
/* 101 */                                   for (Map.Entry entry2 : map2.entrySet()) {
/* 121 */                                       httpURLConnection2.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                            }
                                        } catch (IOException e8) {
/* 128 */                                   e = e8;
/* 303 */                                   outputStream3 = null;
/* 206 */                                   obj2 = null;
/* 207 */                                   iOException2 = e;
                                            r7 = obj2;
/* 358 */                                   if (outputStream3 != null) {
                                                try {
/* 360 */                                           outputStream3.close();
                                                } catch (IOException e9) {
/* 365 */                                           uh3 uh3Var4 = ij3Var4.f9655f;
/* 367 */                                           ij3.m4555l(uh3Var4);
/* 376 */                                           uh3Var4.f17538f.m8512c(uh3.m9013H(str), "Error closing HTTP compressed POST connection output stream. appId", e9);
                                                }
                                                break;
                                            }
/* 379 */                                   if (httpURLConnection2 != null) {
/* 381 */                                       httpURLConnection2.disconnect();
                                            }
/* 385 */                                   m3600a(i3, iOException2, null, r7);
/* 388 */                                   return;
                                        }
                                    } catch (Throwable th10) {
/* 125 */                               th = th10;
/* 298 */                               outputStream3 = null;
/* 201 */                               obj = null;
/* 202 */                               th2 = th;
                                        r6 = obj;
/* 323 */                               if (outputStream3 != null) {
                                            try {
/* 325 */                                       outputStream3.close();
                                            } catch (IOException e10) {
/* 330 */                                       uh3 uh3Var5 = ij3Var4.f9655f;
/* 332 */                                       ij3.m4555l(uh3Var5);
/* 341 */                                       uh3Var5.f17538f.m8512c(uh3.m9013H(str), "Error closing HTTP compressed POST connection output stream. appId", e10);
                                            }
                                            break;
                                        }
/* 344 */                               if (httpURLConnection2 != null) {
/* 346 */                                   httpURLConnection2.disconnect();
                                        }
/* 350 */                               m3600a(i3, null, null, r6);
/* 353 */                               throw th2;
                                    }
                                }
/* 131 */                       byte[] bArr3 = (byte[]) obj3;
/* 133 */                       if (bArr3 != null) {
                                    try {
/* 137 */                               ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
/* 142 */                               GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
/* 145 */                               gZIPOutputStream.write(bArr3);
/* 148 */                               gZIPOutputStream.close();
/* 151 */                               byteArrayOutputStream2.close();
/* 154 */                               byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
/* 158 */                               uh3 uh3Var6 = ij3Var4.f9655f;
/* 160 */                               ij3.m4555l(uh3Var6);
/* 163 */                               sh3 sh3Var2 = uh3Var6.f17534Y;
/* 165 */                               int length3 = byteArray3.length;
/* 170 */                               sh3Var2.m8511b(Integer.valueOf(length3), "Uploading data. size");
/* 173 */                               httpURLConnection2.setDoOutput(true);
/* 176 */                               httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
/* 179 */                               httpURLConnection2.setFixedLengthStreamingMode(length3);
/* 182 */                               httpURLConnection2.connect();
/* 185 */                               outputStream3 = httpURLConnection2.getOutputStream();
                                        try {
/* 189 */                                   outputStream3.write(byteArray3);
/* 192 */                                   outputStream3.close();
                                        } catch (IOException e11) {
/* 198 */                                   e = e11;
/* 205 */                                   httpURLConnection2 = httpURLConnection2;
/* 206 */                                   obj2 = null;
/* 207 */                                   iOException2 = e;
                                            r7 = obj2;
/* 358 */                                   if (outputStream3 != null) {
/* 360 */                                       outputStream3.close();
                                                break;
                                            }
/* 379 */                                   if (httpURLConnection2 != null) {
/* 381 */                                       httpURLConnection2.disconnect();
                                            }
/* 385 */                                   m3600a(i3, iOException2, null, r7);
/* 388 */                                   return;
                                        } catch (Throwable th11) {
/* 196 */                                   th = th11;
/* 200 */                                   httpURLConnection2 = httpURLConnection2;
/* 201 */                                   obj = null;
/* 202 */                                   th2 = th;
                                            r6 = obj;
/* 323 */                                   if (outputStream3 != null) {
/* 325 */                                       outputStream3.close();
                                                break;
                                            }
/* 344 */                                   if (httpURLConnection2 != null) {
/* 346 */                                       httpURLConnection2.disconnect();
                                            }
/* 350 */                                   m3600a(i3, null, null, r6);
/* 353 */                                   throw th2;
                                        }
                                    } catch (IOException e12) {
/* 211 */                               uh3 uh3Var7 = ij3Var4.f9655f;
/* 213 */                               ij3.m4555l(uh3Var7);
/* 220 */                               uh3Var7.f17538f.m8511b(e12, "Failed to gzip post request content");
/* 223 */                               throw e12;
                                    }
                                }
/* 224 */                       int responseCode2 = httpURLConnection2.getResponseCode();
                                try {
                                    try {
/* 228 */                               Map<String, List<String>> headerFields2 = httpURLConnection2.getHeaderFields();
                                        try {
/* 234 */                                   ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
/* 237 */                                   inputStream2 = httpURLConnection2.getInputStream();
                                            try {
/* 243 */                                       byte[] bArr4 = new byte[Segment.SHARE_MINIMUM];
                                                while (true) {
/* 245 */                                           int i4 = inputStream2.read(bArr4);
/* 249 */                                           if (i4 <= 0) {
/* 257 */                                               byte[] byteArray4 = byteArrayOutputStream3.toByteArray();
/* 261 */                                               inputStream2.close();
/* 264 */                                               httpURLConnection2.disconnect();
/* 268 */                                               m3600a(responseCode2, null, byteArray4, headerFields2);
/* 388 */                                               return;
                                                    }
/* 251 */                                           byteArrayOutputStream3.write(bArr4, 0, i4);
                                                }
                                            } catch (Throwable th12) {
/* 255 */                                       th = th12;
/* 279 */                                       if (inputStream2 != null) {
/* 281 */                                           inputStream2.close();
                                                }
/* 284 */                                       throw th;
                                            }
                                        } catch (Throwable th13) {
/* 277 */                                   th = th13;
/* 278 */                                   inputStream2 = null;
                                        }
                                    } catch (IOException e13) {
/* 300 */                               e = e13;
/* 302 */                               i3 = responseCode2;
/* 303 */                               outputStream3 = null;
/* 206 */                               obj2 = null;
/* 207 */                               iOException2 = e;
                                        r7 = obj2;
/* 358 */                               if (outputStream3 != null) {
/* 360 */                                   outputStream3.close();
                                            break;
                                        }
/* 379 */                               if (httpURLConnection2 != null) {
/* 381 */                                   httpURLConnection2.disconnect();
                                        }
/* 385 */                               m3600a(i3, iOException2, null, r7);
/* 388 */                               return;
                                    } catch (Throwable th14) {
/* 295 */                               th = th14;
/* 297 */                               i3 = responseCode2;
/* 298 */                               outputStream3 = null;
/* 201 */                               obj = null;
/* 202 */                               th2 = th;
                                        r6 = obj;
/* 323 */                               if (outputStream3 != null) {
/* 325 */                                   outputStream3.close();
                                            break;
                                        }
/* 344 */                               if (httpURLConnection2 != null) {
/* 346 */                                   httpURLConnection2.disconnect();
                                        }
/* 350 */                               m3600a(i3, null, null, r6);
/* 353 */                               throw th2;
                                    }
                                } catch (IOException e14) {
/* 275 */                           e = e14;
/* 290 */                           i3 = responseCode2;
/* 9 */                             obj2 = "Content-Encoding";
/* 292 */                           outputStream3 = null;
/* 293 */                           httpURLConnection2 = httpURLConnection2;
/* 207 */                           iOException2 = e;
                                    r7 = obj2;
/* 358 */                           if (outputStream3 != null) {
/* 360 */                               outputStream3.close();
                                        break;
                                    }
/* 379 */                           if (httpURLConnection2 != null) {
/* 381 */                               httpURLConnection2.disconnect();
                                    }
/* 385 */                           m3600a(i3, iOException2, null, r7);
/* 388 */                           return;
                                } catch (Throwable th15) {
/* 273 */                           th = th15;
/* 285 */                           i3 = responseCode2;
/* 9 */                             obj = "Content-Encoding";
/* 287 */                           outputStream3 = null;
/* 288 */                           httpURLConnection2 = httpURLConnection2;
/* 202 */                           th2 = th;
                                    r6 = obj;
/* 323 */                           if (outputStream3 != null) {
/* 325 */                               outputStream3.close();
                                        break;
                                    }
/* 344 */                           if (httpURLConnection2 != null) {
/* 346 */                               httpURLConnection2.disconnect();
                                    }
/* 350 */                           m3600a(i3, null, null, r6);
/* 353 */                           throw th2;
                                }
                            } catch (IOException e15) {
/* 354 */                       iOException2 = e15;
/* 355 */                       outputStream3 = null;
/* 356 */                       httpURLConnection2 = null;
/* 357 */                       r7 = 0;
                            } catch (Throwable th16) {
/* 319 */                       th2 = th16;
/* 320 */                       outputStream3 = null;
/* 321 */                       httpURLConnection2 = null;
/* 322 */                       r6 = 0;
                            }
                            break;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 28 */        public eu0(wl3 wl3Var, String str, URL url, byte[] bArr, HashMap map, ul3 ul3Var) {
                    Objects.requireNonNull(wl3Var);
                    this.f7883i = wl3Var;
/* 30 */            kb1.m6058k(str);
/* 31 */            this.f7879c = url;
                    this.f7880d = bArr;
                    this.f7881e = ul3Var;
                    this.f7878b = str;
                    this.f7882f = map;
                }

/* 31 */        public eu0(rs0 rs0Var, String str, String str2, Application application, HashMap map, HashMap map2) {
                    this.f7879c = rs0Var;
                    this.f7878b = str;
                    this.f7880d = str2;
                    this.f7881e = application;
                    this.f7882f = map;
                    this.f7883i = map2;
                }
            }
