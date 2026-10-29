            package com.quago.mobile.sdk;

            import android.app.Application;
            import android.content.Context;
            import android.content.SharedPreferences;
            import android.hardware.Sensor;
            import android.os.Handler;
            import android.os.Looper;
            import android.os.Message;
            import android.os.SystemClock;
            import android.util.Base64;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.zip.GZIPOutputStream;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.n0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 89 */    public final class HandlerC0750n0 extends Handler {

                /* JADX INFO: renamed from: a */
                public final C0752o0 f5568a;

                public HandlerC0750n0(Looper looper, C0752o0 c0752o0) {
/* 1 */             super(looper);
/* 4 */             this.f5568a = c0752o0;
                }

                /* JADX INFO: renamed from: a */
                public final void m2640a(C0714a1 c0714a1, long j, long j2, int i, int i2) {
                    char c;
                    char c2;
                    String strM2550c;
                    List list;
/* 12 */            c0714a1.f5350e = j;
/* 16 */            c0714a1.f5352g = j2;
/* 24 */            C0745l c0745lM2600a = this.f5568a.f5597r.m2600a(c0714a1, c0714a1.f5351f, j2);
/* 36 */            c0745lM2600a.f5528a = this.f5568a.f5583d.getAppToken();
/* 38 */            C0752o0 c0752o0 = this.f5568a;
/* 42 */            c0745lM2600a.f5535h = c0752o0.f5586g;
/* 46 */            c0745lM2600a.f5536i = c0752o0.f5604y;
/* 50 */            c0745lM2600a.f5537j = c0752o0.f5605z;
/* 58 */            c0745lM2600a.f5538k = String.valueOf(c0752o0.f5573A);
/* 62 */            c0745lM2600a.f5539l = "1.15.0";
/* 72 */            c0745lM2600a.f5531d = this.f5568a.f5583d.getWrapper();
/* 82 */            c0745lM2600a.f5532e = this.f5568a.f5583d.getWrapperVersion();
/* 86 */            c0745lM2600a.f5512A = i;
/* 90 */            c0745lM2600a.f5542o = i2;
/* 102 */           c0745lM2600a.f5543p = this.f5568a.f5583d.getFlavor().value;
/* 106 */           QuagoSettings.SensoryType[] sensoryTypeArr = this.f5568a.f5578F;
/* 117 */           if (sensoryTypeArr != null) {
/* 121 */               boolean[] zArr = new boolean[10];
/* 123 */               c = 7;
/* 127 */               c2 = 3;
/* 129 */               for (QuagoSettings.SensoryType sensoryType : sensoryTypeArr) {
                            switch (AbstractC0748m0.f5564a[sensoryType.ordinal()]) {
                                case 1:
/* 172 */                           zArr[9] = true;
                                    break;
                                case 2:
/* 169 */                           zArr[8] = true;
                                    break;
                                case 3:
/* 166 */                           zArr[7] = true;
                                    break;
                                case 4:
/* 163 */                           zArr[6] = true;
                                    break;
                                case 5:
/* 160 */                           zArr[5] = true;
                                    break;
                                case 6:
/* 157 */                           zArr[4] = true;
                                    break;
                                case 7:
/* 154 */                           zArr[3] = true;
                                    break;
                                case 8:
/* 151 */                           zArr[2] = true;
                                    break;
                                case 9:
/* 148 */                           zArr[1] = true;
                                    break;
                                case 10:
/* 145 */                           zArr[0] = true;
                                    break;
                            }
                        }
/* 181 */               c0745lM2600a.f5544q = AbstractC0730g.m2575a(zArr);
                    } else {
/* 184 */               c = 7;
/* 186 */               c2 = 3;
                    }
/* 190 */           C0724e c0724e = this.f5568a.f5596q;
/* 192 */           if (c0724e != null && (list = c0724e.f5407d) != null) {
/* 198 */               boolean[] zArr2 = new boolean[9];
/* 200 */               Iterator it = list.iterator();
/* 208 */               while (it.hasNext()) {
/* 216 */                   int type = ((Sensor) it.next()).getType();
/* 220 */                   if (type == 1) {
/* 269 */                       zArr2[8] = true;
                            } else if (type == 2) {
/* 266 */                       zArr2[c] = true;
                            } else if (type == 8) {
/* 263 */                       zArr2[c2] = true;
                            } else if (type == 13) {
/* 260 */                       zArr2[1] = true;
                            } else if (type == 18) {
/* 257 */                       zArr2[2] = true;
                            } else if (type == 20) {
/* 254 */                       zArr2[0] = true;
                            } else if (type == 4) {
/* 251 */                       zArr2[6] = true;
                            } else if (type == 5) {
/* 248 */                       zArr2[5] = true;
                            } else if (type == 6) {
/* 245 */                       zArr2[4] = true;
                            }
                        }
/* 276 */               c0745lM2600a.f5545r = AbstractC0730g.m2575a(zArr2);
                    }
/* 280 */           c0745lM2600a.f5533f = c0714a1.f5346a;
/* 284 */           c0745lM2600a.f5534g = c0714a1.f5347b;
/* 288 */           c0745lM2600a.f5529b = c0714a1.f5355j;
/* 290 */           String str = c0714a1.f5356k;
/* 292 */           if (str == null) {
/* 302 */               c0745lM2600a.f5530c = this.f5568a.f5583d.getDefaultAdditionalId();
                    } else {
/* 305 */               c0745lM2600a.f5530c = str;
                    }
/* 309 */           c0745lM2600a.f5540m = c0714a1.f5357l;
/* 313 */           c0745lM2600a.f5541n = c0714a1.f5358m;
/* 320 */           c0745lM2600a.f5553z = new ArrayList();
/* 336 */           for (Map.Entry entry : c0714a1.f5348c.entrySet()) {
/* 362 */               c0745lM2600a.f5553z.add(new String[]{(String) entry.getKey(), (String) entry.getValue()});
                    }
/* 368 */           long j3 = c0714a1.f5349d;
/* 370 */           long j4 = c0714a1.f5350e;
/* 372 */           long j5 = c0714a1.f5351f;
/* 374 */           C0752o0 c0752o1 = this.f5568a;
/* 376 */           long j6 = c0752o1.f5574B;
/* 395 */           c0745lM2600a.f5547t = new C0735h1(j3, j4, j5 - j6, c0714a1.f5352g - j6, c0752o1.f5575C);
/* 397 */           C0732g1 c0732g1 = c0714a1.f5354i;
/* 399 */           if (c0732g1 != null) {
/* 410 */               c0745lM2600a.f5552y = new C0712a(c0732g1.f5441f, c0732g1.f5442g);
/* 414 */               c0745lM2600a.f5548u = c0732g1.f5437b;
/* 418 */               c0745lM2600a.f5549v = c0732g1.f5438c;
/* 422 */               c0745lM2600a.f5550w = c0732g1.f5439d;
/* 426 */               c0745lM2600a.f5551x = c0732g1.f5440e;
                    }
/* 430 */           c0745lM2600a.f5513B = c0752o1.f5592m;
/* 438 */           if (c0752o1.f5583d.getCallback() != null) {
                        try {
/* 442 */                   HashMap map = new HashMap();
/* 449 */                   map.put("app_token", c0745lM2600a.f5528a);
/* 454 */                   map.put("platform", 1);
/* 461 */                   map.put("seg_name", c0745lM2600a.f5533f);
/* 472 */                   map.put("seg_count", Integer.valueOf(c0745lM2600a.f5540m));
/* 483 */                   map.put("user_seg_count", Integer.valueOf(c0745lM2600a.f5541n));
/* 490 */                   map.put("user_id", c0745lM2600a.f5529b);
/* 497 */                   map.put("additional_id", c0745lM2600a.f5530c);
/* 504 */                   map.put("sdk_version_name", c0745lM2600a.f5539l);
/* 515 */                   map.put("mode", Integer.valueOf(c0745lM2600a.f5542o));
/* 522 */                   QuagoSettings.QuagoCallback callback = this.f5568a.f5583d.getCallback();
/* 528 */                   C0717b1 c0717b1 = this.f5568a.f5584e;
                            synchronized (c0717b1) {
/* 531 */                       strM2550c = c0717b1.m2550c(map);
                            }
/* 548 */                   callback.onJsonSegment(strM2550c, this.f5568a.f5584e.m2549b(c0745lM2600a.m2623a()));
/* 551 */                   return;
                        } catch (Exception e) {
/* 560 */                   C0752o0.f5572H.m2612a("handleSegmentChange_json_sendoff", e);
/* 563 */                   return;
                        }
                    }
                    try {
/* 568 */               if (this.f5568a.f5599t == null) {
/* 579 */                   C0752o0.f5572H.m2613b("handleSegmentChange_server_sendoff", "quagoNetworkModule is null", new Object[0]);
/* 582 */                   return;
                        }
/* 585 */               HashMap map2 = new HashMap();
/* 592 */               map2.put("app_token", c0745lM2600a.f5528a);
/* 610 */               map2.put(SharedDataContentProvider.QUERY_PARAM_ENV, c0745lM2600a.f5543p == QuagoSettings.QuagoFlavor.PRODUCTION.value ? "prod" : "stage");
/* 617 */               map2.put("sdk_version", c0745lM2600a.f5539l);
/* 634 */               byte[] bytes = this.f5568a.f5584e.m2549b(c0745lM2600a.m2623a()).getBytes();
                        try {
/* 640 */                   ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 645 */                   GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
/* 648 */                   gZIPOutputStream.write(bytes);
/* 651 */                   gZIPOutputStream.close();
/* 663 */                   map2.put("payload", Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
/* 668 */                   int size = c0745lM2600a.f5515D.size();
/* 712 */                   long jDoubleValue = size >= 2 ? ((long) (((Double[]) c0745lM2600a.f5515D.get(size - 1))[0].doubleValue() - ((Double[]) c0745lM2600a.f5515D.get(0))[0].doubleValue())) / 1000 : 0L;
/* 714 */                   C0735h1 c0735h1 = c0745lM2600a.f5547t;
/* 721 */                   long j7 = (c0735h1.f5461d - c0735h1.f5460c) / 1000;
/* 724 */                   map2.put("platform", 1);
/* 731 */                   map2.put("user_id", c0745lM2600a.f5529b);
/* 742 */                   map2.put("device_id", c0745lM2600a.f5546s.f5609c.f5688a);
/* 749 */                   map2.put("session_id", c0745lM2600a.f5535h);
/* 760 */                   map2.put("seg_count", Integer.valueOf(c0745lM2600a.f5540m));
/* 771 */                   map2.put("user_seg_count", Integer.valueOf(c0745lM2600a.f5541n));
/* 778 */                   map2.put("app_version", c0745lM2600a.f5537j);
/* 785 */                   map2.put("seg_name", c0745lM2600a.f5533f);
/* 794 */                   map2.put("seg_duration", Long.valueOf(j7));
/* 803 */                   map2.put("cnt_motion", Integer.valueOf(size));
/* 812 */                   map2.put("motion_duration", Long.valueOf(jDoubleValue));
/* 823 */                   map2.put("model", c0745lM2600a.f5546s.f5607a.f5386m);
/* 834 */                   map2.put("is_new", Boolean.valueOf(c0745lM2600a.f5513B));
/* 841 */                   String strM2549b = this.f5568a.f5584e.m2549b(map2);
/* 845 */                   boolean z = c0714a1.f5359n;
/* 847 */                   C0752o0 c0752o2 = this.f5568a;
/* 849 */                   if (!z) {
/* 917 */                       C0759s0 c0759s0 = c0752o2.f5599t;
/* 924 */                       C0763u0 c0763u0 = new C0763u0(c0759s0.f5626b, strM2549b, false);
/* 927 */                       HandlerC0757r0 handlerC0757r0 = c0759s0.f5627c;
/* 933 */                       handlerC0757r0.sendMessage(Message.obtain(handlerC0757r0, 1, c0763u0));
/* 936 */                       return;
                            }
/* 857 */                   if (c0752o2.f5583d.getTokenCallback() == null || !"INIT".equals(c0745lM2600a.f5533f)) {
/* 898 */                       C0759s0 c0759s1 = this.f5568a.f5599t;
/* 904 */                       C0763u0 c0763u1 = new C0763u0(c0759s1.f5626b, strM2549b, true);
/* 907 */                       HandlerC0757r0 handlerC0757r1 = c0759s1.f5627c;
/* 913 */                       handlerC0757r1.sendMessage(Message.obtain(handlerC0757r1, 1, c0763u1));
/* 916 */                       return;
                            }
/* 871 */                   C0759s0 c0759s2 = this.f5568a.f5599t;
/* 883 */                   C0765v0 c0765v0 = new C0765v0(c0759s2.f5626b, strM2549b, c0745lM2600a.f5535h, c0745lM2600a.f5533f, c0745lM2600a.f5534g);
/* 886 */                   HandlerC0757r0 handlerC0757r2 = c0759s2.f5627c;
/* 892 */                   handlerC0757r2.sendMessage(Message.obtain(handlerC0757r2, 1, c0765v0));
                        } catch (IOException e2) {
/* 943 */                   throw new RuntimeException(e2);
                        }
                    } catch (Exception e3) {
/* 949 */               C0752o0.f5572H.m2612a("handleSegmentChange_server_sendoff", e3);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m2641b() {
                    int i;
/* 1 */             C0752o0 c0752o0 = this.f5568a;
/* 8 */             if (c0752o0.f5576D == null) {
/* 16 */                C0752o0.f5572H.m2614c("Handler", "EndSegment called without an active segment.", new Object[0]);
/* 19 */                return;
                    }
/* 27 */            if (c0752o0.f5583d.getMaxSegments() <= -1 || this.f5568a.f5583d.getMaxSegments() > this.f5568a.f5576D.f5357l) {
/* 63 */                C0752o0.f5572H.m2614c("Handler", "Segment ended.", new Object[0]);
/* 66 */                i = 1;
                    } else {
/* 51 */                C0752o0.f5572H.m2614c("Handler", "Ending last segment", new Object[0]);
/* 54 */                i = 2;
                    }
/* 82 */            m2640a(this.f5568a.f5576D, System.currentTimeMillis(), SystemClock.uptimeMillis(), i, 2);
/* 88 */            this.f5568a.f5576D = null;
                }

                /* JADX WARN: Code duplicated, block: B:267:? A[RETURN, SYNTHETIC] */
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    long j;
                    String str;
                    boolean z;
                    Context applicationContext;
/* 9 */             int i = 0;
                    try {
/* 16 */                C0752o0 c0752o0 = this.f5568a;
/* 18 */                if (c0752o0 != null && c0752o0.f5580a) {
/* 26 */                    QuagoSettings quagoSettings = c0752o0.f5583d;
/* 28 */                    if (quagoSettings == null) {
/* 36 */                        C0752o0.f5572H.m2613b("Handler", "Settings is null", new Object[0]);
/* 39 */                        return;
                            }
/* 43 */                    int i2 = message.what;
/* 49 */                    int i3 = 1;
/* 50 */                    if (i2 == 1) {
/* 1514 */                      C0740j0 c0740j0 = C0752o0.f5572H;
/* 1520 */                      c0740j0.m2614c("Handler", "Quago SDK Initialized", new Object[0]);
/* 1539 */                      c0740j0.m2614c("Handler", "SDK Version = %s, AppToken = %s", "1.15.0", this.f5568a.f5583d.getAppToken());
/* 1550 */                      if (this.f5568a.f5583d.getDefaultAdditionalId() != null) {
/* 1566 */                          c0740j0.m2614c("Handler", "DefaultAdditionalId = %s", this.f5568a.f5583d.getDefaultAdditionalId());
                                }
/* 1569 */                      C0752o0 c0752o1 = this.f5568a;
/* 1571 */                      C0754p0 c0754p0 = c0752o1.f5598s;
/* 1573 */                      if (c0754p0 == null || c0754p0.f5610d == null) {
/* 1779 */                          c0740j0.m2613b("Handler", "QuagoMetaData failed to initialize!", new Object[0]);
/* 1782 */                          return;
                                }
                                try {
/* 1583 */                          boolean zM2662a = c0752o1.f5593n.m2662a();
/* 1593 */                          this.f5568a.f5598s.f5609c.f5690c = zM2662a;
/* 1605 */                          c0740j0.m2611a("Handler-root", "isRooted = %s", Boolean.valueOf(zM2662a));
                                } catch (Exception e) {
/* 1612 */                          C0752o0.f5572H.m2612a("Handler-root", e);
                                }
                                try {
/* 1615 */                          C0740j0 c0740j1 = C0752o0.f5572H;
/* 1621 */                          c0740j1.m2611a("Handler", "QuagoDetector Launched", new Object[0]);
/* 1635 */                          this.f5568a.f5598s.f5610d.m2599a(new C0725e0());
/* 1638 */                          C0725e0.m2558a();
/* 1645 */                          c0740j1.m2611a("Handler", "QuagoDetector Complete", new Object[0]);
                                } catch (Exception e2) {
/* 1652 */                          C0752o0.f5572H.m2612a("Handler", e2);
                                }
                                try {
/* 1655 */                          SharedPreferences sharedPreferencesM2638a = m2638a();
/* 1659 */                          C0752o0 c0752o2 = this.f5568a;
/* 1661 */                          if (sharedPreferencesM2638a != null) {
/* 1669 */                              c0752o2.f5592m = !sharedPreferencesM2638a.contains("touch_checked");
                                    } else {
/* 1675 */                              c0752o2.f5592m = true;
/* 1683 */                              C0752o0.f5572H.m2611a("Handler", "sharedPref = null for TouchSegment check.", new Object[0]);
                                    }
/* 1686 */                          C0740j0 c0740j2 = C0752o0.f5572H;
/* 1702 */                          c0740j2.m2611a("Handler", "is_new = %s", Boolean.valueOf(this.f5568a.f5592m));
/* 1723 */                          c0740j2.m2611a("Handler", "isTouchSegmentDisabled = %s", Boolean.valueOf(this.f5568a.f5583d.isTouchSegmentDisabled()));
/* 1744 */                          c0740j2.m2611a("Handler", "getTouchSegmentDurationMillis = %s", Long.valueOf(this.f5568a.f5583d.getTouchSegmentDurationMillis()));
/* 1755 */                          if (this.f5568a.f5583d.isTouchSegmentDisabled()) {
/* 1788 */                              return;
                                    }
/* 1765 */                          sendEmptyMessageDelayed(16, this.f5568a.f5583d.getTouchSegmentDurationMillis());
/* 1788 */                          return;
                                } catch (Exception e3) {
/* 1771 */                          C0752o0.f5572H.m2612a("Handler", e3);
/* 1788 */                          return;
                                }
                            }
                            switch (i2) {
                                case 5:
/* 1510 */                          m2639a((C0714a1) message.obj);
/* 1513 */                          return;
                                case 6:
/* 1502 */                          m2641b();
/* 1505 */                          return;
                                case 7:
/* 1160 */                          if (c0752o0.f5591l) {
/* 1176 */                              C0752o0.f5572H.m2614c("Handler", "MaxTrackingSegment of %s reached!", Integer.valueOf(quagoSettings.getMaxSegments()));
/* 1179 */                              return;
                                    }
/* 1182 */                          if (c0752o0.f5577E != null) {
/* 1190 */                              C0752o0.f5572H.m2616e("Handler", "beginTracking() was called while already tracking, ignoring call!", new Object[0]);
/* 1193 */                              return;
                                    }
/* 1196 */                          C0714a1 c0714a1 = (C0714a1) message.obj;
/* 1198 */                          long jCurrentTimeMillis = System.currentTimeMillis();
/* 1202 */                          long jUptimeMillis = SystemClock.uptimeMillis();
/* 1206 */                          C0752o0 c0752o3 = this.f5568a;
/* 1212 */                          c0752o3.f5587h++;
/* 1218 */                          c0752o3.f5589j++;
/* 1226 */                          if (c0752o3.f5583d.getMaxSegments() > -1) {
/* 1232 */                              int maxSegments = this.f5568a.f5583d.getMaxSegments();
/* 1236 */                              C0752o0 c0752o4 = this.f5568a;
/* 1238 */                              int i4 = c0752o4.f5587h;
/* 1240 */                              if (maxSegments < i4) {
/* 1244 */                                  if (c0752o4.f5577E != null) {
/* 1252 */                                      C0752o0.f5572H.m2614c("Handler", "Ending Tracking last segment", new Object[0]);
/* 1269 */                                      m2640a(this.f5568a.f5577E, System.currentTimeMillis(), SystemClock.uptimeMillis(), 2, 1);
/* 1274 */                                      this.f5568a.f5577E = null;
                                            }
/* 1294 */                                  C0752o0.f5572H.m2614c("Handler", "MaxTrackingSegment of %s reached!", Integer.valueOf(this.f5568a.f5583d.getMaxSegments()));
/* 1301 */                                  this.f5568a.f5591l = true;
/* 1303 */                                  return;
                                        }
/* 1304 */                              String str2 = c0714a1.f5355j;
/* 1306 */                              if (str2 == null) {
/* 1332 */                                  C0752o0.f5572H.m2614c("Handler", "Begin Tracking [%s/%s]", Integer.valueOf(i4), Integer.valueOf(this.f5568a.f5583d.getMaxSegments()));
                                        } else {
/* 1360 */                                  C0752o0.f5572H.m2614c("Handler", "Begin Tracking userId = %s [%s/%s]", str2, Integer.valueOf(i4), Integer.valueOf(this.f5568a.f5583d.getMaxSegments()));
                                        }
                                    } else {
/* 1364 */                              String str3 = c0714a1.f5355j;
/* 1366 */                              if (str3 == null) {
/* 1374 */                                  C0752o0.f5572H.m2614c("Handler", "Begin Tracking", new Object[0]);
                                        } else {
/* 1386 */                                  C0752o0.f5572H.m2614c("Handler", "Begin Tracking userId = %s", str3);
                                        }
                                    }
/* 1389 */                          c0714a1.m2545a(jCurrentTimeMillis, jUptimeMillis);
/* 1392 */                          C0752o0 c0752o5 = this.f5568a;
/* 1396 */                          c0714a1.f5357l = c0752o5.f5587h;
/* 1400 */                          c0714a1.f5358m = c0752o5.f5589j;
/* 1402 */                          c0752o5.f5577E = c0714a1;
/* 1416 */                          sendMessageDelayed(Message.obtain(this, 8), this.f5568a.f5583d.getAutoMotionIntervalMillis());
/* 1419 */                          String str4 = c0714a1.f5355j;
/* 1421 */                          if (str4 != null) {
/* 1425 */                              String str5 = this.f5568a.f5579G;
/* 1427 */                              if (str5 == null || !str5.equals(str4)) {
/* 1435 */                                  C0752o0 c0752o6 = this.f5568a;
/* 1437 */                                  String str6 = c0714a1.f5355j;
/* 1439 */                                  c0752o6.f5579G = str6;
/* 1447 */                                  String strM2551a = c0752o6.f5585f.m2551a();
/* 1451 */                                  C0752o0 c0752o7 = this.f5568a;
/* 1462 */                                  C0714a1 c0714a2 = new C0714a1("USERID", str6, strM2551a, c0752o7.f5598s, new C0732g1(c0752o7.f5603x));
/* 1467 */                                  c0714a2.f5359n = true;
/* 1469 */                                  long jCurrentTimeMillis2 = System.currentTimeMillis();
/* 1473 */                                  long jUptimeMillis2 = SystemClock.uptimeMillis();
/* 1477 */                                  c0714a2.f5349d = jCurrentTimeMillis2;
/* 1479 */                                  c0714a2.f5351f = jUptimeMillis2;
/* 1493 */                                  C0752o0.f5572H.m2614c("Handler", "handle USERID Segment for UserId = %s", String.valueOf(c0714a2.f5355j));
/* 1498 */                                  m2640a(c0714a2, jCurrentTimeMillis2, jUptimeMillis2, 1, 2);
/* 1501 */                                  return;
                                        }
/* 1788 */                              return;
                                    }
/* 1788 */                          return;
                                case 8:
/* 946 */                           C0740j0 c0740j3 = C0752o0.f5572H;
/* 952 */                           c0740j3.m2615d("Handler", "TRACKING_CHECK", new Object[0]);
/* 959 */                           if (this.f5568a.f5577E == null) {
/* 1788 */                              return;
                                    }
/* 963 */                           long jCurrentTimeMillis3 = System.currentTimeMillis();
/* 967 */                           long jUptimeMillis3 = SystemClock.uptimeMillis();
/* 971 */                           C0752o0 c0752o8 = this.f5568a;
/* 987 */                           if (jUptimeMillis3 - c0752o8.f5577E.f5351f >= c0752o8.f5583d.getAutoMaxDurationMillis()) {
/* 993 */                               c0740j3.m2611a("Handler", "Tracking Condition met = Duration", new Object[0]);
/* 996 */                               i = 4;
/* 999 */                               j = jUptimeMillis3;
                                    } else {
/* 1002 */                              C0752o0 c0752o9 = this.f5568a;
/* 1024 */                              j = jUptimeMillis3;
/* 1039 */                              if (AbstractC0729f1.m2568a(c0752o9.f5597r.f5465c, c0752o9.f5577E.f5351f, jUptimeMillis3, c0752o9.f5583d.getAutoMotionAmount()) >= this.f5568a.f5583d.getAutoMotionAmount()) {
/* 1045 */                                  c0740j3.m2611a("Handler", "Tracking Condition met = Amount", new Object[0]);
/* 1048 */                                  i = 3;
                                        }
                                    }
/* 1049 */                          if (i != 0) {
/* 1051 */                              C0752o0 c0752o10 = this.f5568a;
/* 1057 */                              c0752o10.f5587h++;
/* 1063 */                              c0752o10.f5589j++;
/* 1067 */                              C0714a1 c0714a3 = c0752o10.f5577E;
/* 1069 */                              String str7 = c0714a3.f5346a;
/* 1071 */                              String str8 = c0714a3.f5355j;
/* 1075 */                              String strM2551a2 = c0752o10.f5585f.m2551a();
/* 1079 */                              C0752o0 c0752o11 = this.f5568a;
/* 1098 */                              C0714a1 c0714a4 = new C0714a1(str7, str8, strM2551a2, c0752o11.f5598s, new C0732g1(c0752o11.f5603x));
/* 1101 */                              c0714a4.m2545a(jCurrentTimeMillis3, j);
/* 1104 */                              C0752o0 c0752o12 = this.f5568a;
/* 1108 */                              c0714a4.f5357l = c0752o12.f5587h;
/* 1112 */                              c0714a4.f5358m = c0752o12.f5589j;
/* 1114 */                              C0714a1 c0714a5 = c0752o12.f5577E;
/* 1116 */                              if (c0714a5 != null && (str = c0714a5.f5356k) != null) {
/* 1122 */                                  c0714a4.f5356k = str;
                                        }
/* 1130 */                              m2640a(c0714a5, jCurrentTimeMillis3, j, i, 1);
/* 1135 */                              this.f5568a.f5577E = c0714a4;
                                    }
/* 1149 */                          sendMessageDelayed(Message.obtain(this, 8), this.f5568a.f5583d.getAutoMotionIntervalMillis());
/* 1788 */                          return;
                                case 9:
/* 860 */                           if (c0752o0.f5577E == null) {
/* 868 */                               C0752o0.f5572H.m2616e("Handler", "End Tracking called without an active tracking segment.", new Object[0]);
/* 871 */                               return;
                                    }
/* 872 */                           removeMessages(8);
/* 883 */                           if (this.f5568a.f5583d.getMaxSegments() <= -1 || this.f5568a.f5583d.getMaxSegments() > this.f5568a.f5577E.f5357l) {
/* 919 */                               C0752o0.f5572H.m2614c("Handler", "Segment tracking ended.", new Object[0]);
                                    } else {
/* 907 */                               C0752o0.f5572H.m2614c("Handler", "Ending last tracking segment", new Object[0]);
/* 910 */                               i3 = 2;
                                    }
/* 936 */                           m2640a(this.f5568a.f5577E, System.currentTimeMillis(), SystemClock.uptimeMillis(), i3, 1);
/* 939 */                           C0752o0 c0752o13 = this.f5568a;
/* 941 */                           c0752o13.f5577E = null;
/* 943 */                           c0752o13.f5589j = 0;
/* 945 */                           return;
                                case 10:
/* 756 */                           C0740j0 c0740j4 = C0752o0.f5572H;
/* 762 */                           c0740j4.m2611a("Handler", "SET_KEY_VALUE", new Object[0]);
/* 765 */                           C0752o0 c0752o14 = this.f5568a;
/* 767 */                           C0714a1 c0714a6 = c0752o14.f5576D;
/* 773 */                           boolean z2 = c0714a6 != null;
/* 780 */                           boolean z3 = c0752o14.f5577E != null;
/* 781 */                           if (!z2 && !z3) {
/* 789 */                               c0740j4.m2613b("Handler", "setKeyValue() ignored due to not having an active Segment.", new Object[0]);
/* 792 */                               return;
                                    }
/* 795 */                           String[] strArr = (String[]) message.obj;
/* 797 */                           if (z2) {
/* 803 */                               c0714a6.m2546a(strArr[0], strArr[1]);
/* 828 */                               c0740j4.m2614c("Handler", "KeyValues for Segment %s = [%s,%s]", String.valueOf(this.f5568a.f5576D.m2544a()), strArr[0], strArr[1]);
                                    }
/* 831 */                           if (z3) {
/* 841 */                               this.f5568a.f5577E.m2546a(strArr[0], strArr[1]);
/* 854 */                               c0740j4.m2614c("Handler", "KeyValues for Tracking Segment = [%s,%s]", strArr[0], strArr[1]);
/* 857 */                               return;
                                    }
/* 1788 */                          return;
                                case 11:
/* 745 */                           C0752o0.f5572H.m2611a("Handler", "ON_RELEASE", new Object[0]);
/* 750 */                           this.f5568a.f5580a = false;
/* 752 */                           removeCallbacksAndMessages(null);
/* 755 */                           return;
                                case 12:
/* 534 */                           C0740j0 c0740j5 = C0752o0.f5572H;
/* 540 */                           c0740j5.m2611a("Handler", "SET_USER_ID", new Object[0]);
/* 543 */                           C0752o0 c0752o15 = this.f5568a;
/* 545 */                           C0714a1 c0714a7 = c0752o15.f5576D;
/* 551 */                           boolean z4 = c0714a7 != null;
/* 558 */                           boolean z5 = c0752o15.f5577E != null;
/* 559 */                           if (!z4 && !z5) {
/* 567 */                               c0740j5.m2613b("Handler", "setUserId() ignored due to not having an active Segment.", new Object[0]);
/* 570 */                               return;
                                    }
/* 571 */                           Object obj = message.obj;
/* 575 */                           if (!(obj instanceof String)) {
/* 581 */                               c0740j5.m2613b("Handler", "userId object must be String", new Object[0]);
/* 584 */                               return;
                                    }
/* 585 */                           String str9 = (String) obj;
/* 587 */                           if (z4) {
/* 589 */                               c0714a7.f5355j = str9;
/* 615 */                               c0740j5.m2614c("Handler", "UserId for Segment %s = %s", String.valueOf(c0714a7.m2544a()), String.valueOf(this.f5568a.f5576D.f5355j));
/* 618 */                               z = true;
                                    } else {
/* 620 */                               z = false;
                                    }
/* 621 */                           if (z5) {
/* 625 */                               C0714a1 c0714a8 = this.f5568a.f5577E;
/* 629 */                               if (c0714a8.f5355j == null) {
/* 631 */                                   c0714a8.f5355j = str9;
/* 639 */                                   c0740j5.m2614c("Handler", "Set UserId for Tracking Segment = %s", str9);
                                        } else {
/* 647 */                                   c0740j5.m2613b("Handler", "UserId was already set, end then begin Tracking with the new UserId.", new Object[0]);
/* 650 */                                   if (!z) {
/* 1788 */                                      return;
                                            }
                                        }
                                    } else if (!z) {
/* 1788 */                              return;
                                    }
/* 654 */                           String str10 = this.f5568a.f5579G;
/* 656 */                           if (str10 == null || !str10.equals(str9)) {
/* 664 */                               C0752o0 c0752o16 = this.f5568a;
/* 666 */                               c0752o16.f5579G = str9;
/* 668 */                               if (z4) {
/* 670 */                                   c0752o16.f5588i = 1;
/* 674 */                                   c0752o16.f5576D.f5358m = 1;
                                        }
/* 683 */                               String strM2551a3 = c0752o16.f5585f.m2551a();
/* 687 */                               C0752o0 c0752o17 = this.f5568a;
/* 700 */                               C0714a1 c0714a9 = new C0714a1("USERID", str9, strM2551a3, c0752o17.f5598s, new C0732g1(c0752o17.f5603x));
/* 703 */                               c0714a9.f5359n = true;
/* 705 */                               long jCurrentTimeMillis4 = System.currentTimeMillis();
/* 709 */                               long jUptimeMillis4 = SystemClock.uptimeMillis();
/* 713 */                               c0714a9.f5349d = jCurrentTimeMillis4;
/* 715 */                               c0714a9.f5351f = jUptimeMillis4;
/* 727 */                               c0740j5.m2614c("Handler", "handle USERID Segment for UserId = %s", String.valueOf(c0714a9.f5355j));
/* 735 */                               m2640a(c0714a9, jCurrentTimeMillis4, jUptimeMillis4, 1, 2);
/* 738 */                               return;
                                    }
/* 1788 */                          return;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 437 */                           C0740j0 c0740j6 = C0752o0.f5572H;
/* 443 */                           c0740j6.m2611a("Handler", "SET_ADDITIONAL_ID", new Object[0]);
/* 446 */                           C0752o0 c0752o18 = this.f5568a;
/* 448 */                           C0714a1 c0714a10 = c0752o18.f5576D;
/* 454 */                           boolean z6 = c0714a10 != null;
/* 457 */                           if (c0752o18.f5577E == null) {
/* 460 */                               i3 = 0;
                                    }
/* 461 */                           if (!z6 && i3 == 0) {
/* 469 */                               c0740j6.m2613b("Handler", "setAdditionalId() ignored due to not having an active Segment.", new Object[0]);
/* 472 */                               return;
                                    }
/* 473 */                           Object obj2 = message.obj;
/* 477 */                           if (!(obj2 instanceof String)) {
/* 483 */                               c0740j6.m2613b("Handler", "AdditionalId object must be String", new Object[0]);
/* 486 */                               return;
                                    }
/* 487 */                           String str11 = (String) obj2;
/* 489 */                           if (z6) {
/* 491 */                               c0714a10.f5356k = str11;
/* 513 */                               c0740j6.m2614c("Handler", "AdditionalId for Segment %s = %s", String.valueOf(c0714a10.m2544a()), this.f5568a.f5576D.f5356k);
                                    }
/* 516 */                           if (i3 != 0) {
/* 522 */                               this.f5568a.f5577E.f5356k = str11;
/* 530 */                               c0740j6.m2614c("Handler", "AdditionalId for Tracking Segment = %s", str11);
/* 533 */                               return;
                                    }
/* 1788 */                          return;
                                case 14:
/* 312 */                           C0714a1 c0714a11 = (C0714a1) message.obj;
/* 314 */                           m2639a(c0714a11);
                                    try {
/* 317 */                               SharedPreferences sharedPreferencesM2638a2 = m2638a();
/* 321 */                               if (sharedPreferencesM2638a2 != null) {
/* 327 */                                   if (sharedPreferencesM2638a2.getBoolean("image_checked", false)) {
/* 335 */                                       C0752o0.f5572H.m2611a("Handler", "Emu was already checked.", new Object[0]);
                                            } else {
/* 347 */                                       C0752o0.f5572H.m2611a("Handler", "Emu wasn't checked yet.", new Object[0]);
/* 358 */                                       Application application = (Application) this.f5568a.f5600u.get();
/* 360 */                                       if (application != null && (applicationContext = application.getApplicationContext()) != null) {
/* 384 */                                           for (Map.Entry entry : AbstractC0749n.m2630a(applicationContext).entrySet()) {
/* 411 */                                               c0714a11.m2546a((String) entry.getKey(), new C0717b1().m2549b(entry.getValue()));
                                                    }
                                                }
/* 423 */                                       sharedPreferencesM2638a2.edit().putBoolean("image_checked", true).apply();
                                            }
                                        }
                                    } catch (Exception e4) {
/* 429 */                               C0752o0.f5572H.m2612a("Handler", e4);
                                    }
/* 432 */                           m2641b();
/* 1788 */                          return;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 150 */                           C0740j0 c0740j7 = C0752o0.f5572H;
/* 156 */                           c0740j7.m2611a("Handler", "CHANGE_APP_TOKEN", new Object[0]);
/* 159 */                           Object obj3 = message.obj;
/* 163 */                           if (!(obj3 instanceof String)) {
/* 169 */                               c0740j7.m2613b("Handler", "newAppToken object must be String", new Object[0]);
/* 172 */                               return;
                                    }
/* 173 */                           String str12 = (String) obj3;
/* 175 */                           C0752o0 c0752o19 = this.f5568a;
/* 183 */                           boolean z7 = c0752o19.f5576D != null;
/* 190 */                           boolean z8 = c0752o19.f5577E != null;
/* 191 */                           if (!z7 && !z8) {
/* 198 */                               c0752o19.f5583d.setAppToken(str12);
/* 215 */                               c0740j7.m2614c("Handler", "AppToken is now changed to = %s", this.f5568a.f5583d.getAppToken());
/* 220 */                               this.f5568a.f5587h = 0;
/* 228 */                               c0740j7.m2611a("Handler", "segmentCounter reset to = %d", 0);
/* 233 */                               this.f5568a.f5589j = 0;
/* 241 */                               c0740j7.m2611a("Handler", "userSegmentCounterA reset to = %d", 0);
/* 246 */                               this.f5568a.f5588i = 0;
/* 254 */                               c0740j7.m2611a("Handler", "userSegmentCounterM reset to = %d", 0);
/* 265 */                               if (this.f5568a.f5583d.isInitSegmentDisabled()) {
/* 1788 */                                  return;
                                        }
/* 273 */                               String strM2551a4 = this.f5568a.f5585f.m2551a();
/* 277 */                               C0752o0 c0752o20 = this.f5568a;
/* 288 */                               C0714a1 c0714a12 = new C0714a1(strM2551a4, c0752o20.f5598s, new C0732g1(c0752o20.f5603x));
/* 291 */                               c0714a12.f5359n = true;
/* 293 */                               m2639a(c0714a12);
/* 296 */                               m2641b();
/* 299 */                               return;
                                    }
/* 306 */                           c0740j7.m2613b("Handler", "changeAppToken() to = %s, ignored due to having an active Segment,\nplease call endTracking()/endSegment() before trying to change AppToken.", str12);
/* 309 */                           return;
                                case 16:
/* 69 */                            C0752o0.f5572H.m2615d("Handler", "TOUCH_CHECK", new Object[0]);
/* 72 */                            C0752o0 c0752o21 = this.f5568a;
/* 80 */                            if (c0752o21.f5582c == 0) {
/* 145 */                               sendEmptyMessageDelayed(16, c0752o21.f5583d.getTouchSegmentDurationMillis());
/* 1788 */                              return;
                                    }
                                    try {
/* 82 */                                SharedPreferences sharedPreferencesM2638a3 = m2638a();
/* 86 */                                if (sharedPreferencesM2638a3 != null) {
/* 96 */                                    sharedPreferencesM2638a3.edit().putBoolean("touch_checked", true).apply();
                                        }
                                        break;
                                    } catch (Exception e5) {
/* 103 */                               C0752o0.f5572H.m2612a("Handler", e5);
                                    }
/* 110 */                           C0752o0 c0752o22 = this.f5568a;
/* 112 */                           String str13 = c0752o22.f5579G;
/* 116 */                           String strM2551a5 = c0752o22.f5585f.m2551a();
/* 120 */                           C0752o0 c0752o23 = this.f5568a;
/* 134 */                           m2642b(new C0714a1("TOUCH", str13, strM2551a5, c0752o23.f5598s, new C0732g1(c0752o23.f5603x)));
/* 1788 */                          return;
                                default:
/* 1788 */                          return;
                            }
/* 1785 */                  C0752o0.f5572H.m2612a("Handler", e);
                        }
                    } catch (Exception e6) {
/* 1785 */              C0752o0.f5572H.m2612a("Handler", e6);
                    }
                }

                /* JADX INFO: renamed from: b */
/* 90 */        public final void m2642b(C0714a1 c0714a1) {
/* 91 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 92 */            long jUptimeMillis = SystemClock.uptimeMillis();
/* 93 */            C0752o0 c0752o0 = this.f5568a;
                    long j = c0752o0.f5581b;
                    long j2 = c0752o0.f5582c;
/* 94 */            c0714a1.f5349d = j;
/* 95 */            c0714a1.f5351f = j2;
/* 96 */            C0752o0.f5572H.m2614c("Handler", "handle TOUCH Segment", new Object[0]);
/* 97 */            m2640a(c0714a1, jCurrentTimeMillis, jUptimeMillis, 1, 2);
                }

                /* JADX INFO: renamed from: a */
/* 952 */       public final SharedPreferences m2638a() {
/* 953 */           WeakReference weakReference = this.f5568a.f5600u;
/* 954 */           Application application = weakReference != null ? (Application) weakReference.get() : null;
                    if (application == null) {
                        return null;
                    }
/* 955 */           return application.getApplicationContext().getSharedPreferences("Quago_temp_shared_preferences", 0);
                }

                /* JADX INFO: renamed from: a */
/* 955 */       public final void m2639a(C0714a1 c0714a1) {
                    HandlerC0750n0 handlerC0750n0;
                    HandlerC0750n0 handlerC0750n1;
/* 956 */           C0752o0 c0752o0 = this.f5568a;
                    if (c0752o0.f5590k) {
/* 959 */               C0752o0.f5572H.m2614c("Handler", "MaxSegment of %s reached!", Integer.valueOf(c0752o0.f5583d.getMaxSegments()));
                        return;
                    }
/* 960 */           long jCurrentTimeMillis = System.currentTimeMillis();
/* 961 */           long jUptimeMillis = SystemClock.uptimeMillis();
/* 962 */           C0752o0 c0752o1 = this.f5568a;
                    c0752o1.f5587h++;
/* 963 */           c0752o1.f5588i++;
/* 964 */           if (c0752o1.f5583d.getMaxSegments() > -1) {
/* 965 */               int maxSegments = this.f5568a.f5583d.getMaxSegments();
                        C0752o0 c0752o2 = this.f5568a;
                        if (maxSegments < c0752o2.f5587h) {
/* 966 */                   if (c0752o2.f5576D != null) {
/* 967 */                       C0752o0.f5572H.m2614c("Handler", "Ending last segment", new Object[0]);
                                handlerC0750n1 = this;
/* 970 */                       handlerC0750n1.m2640a(this.f5568a.f5576D, System.currentTimeMillis(), SystemClock.uptimeMillis(), 2, 2);
/* 971 */                       handlerC0750n1.f5568a.f5576D = null;
                            } else {
                                handlerC0750n1 = this;
                            }
/* 974 */                   C0752o0.f5572H.m2614c("Handler", "MaxSegment of %s reached!", Integer.valueOf(handlerC0750n1.f5568a.f5583d.getMaxSegments()));
/* 975 */                   handlerC0750n1.f5568a.f5590k = true;
                            return;
                        }
                        handlerC0750n0 = this;
/* 981 */               C0752o0.f5572H.m2614c("Handler", "SegmentBegin Name = %s [%s/%s]", String.valueOf(c0714a1.f5346a), Integer.valueOf(handlerC0750n0.f5568a.f5587h), Integer.valueOf(handlerC0750n0.f5568a.f5583d.getMaxSegments()));
                    } else {
                        handlerC0750n0 = this;
/* 985 */               C0752o0.f5572H.m2614c("Handler", "SegmentBegin Name = %s", String.valueOf(c0714a1.f5346a));
                    }
/* 986 */           C0714a1 c0714a2 = handlerC0750n0.f5568a.f5576D;
                    if (c0714a2 != null) {
                        HandlerC0750n0 handlerC0750n2 = handlerC0750n0;
/* 987 */               handlerC0750n2.m2640a(c0714a2, jCurrentTimeMillis, jUptimeMillis, 1, 2);
                        handlerC0750n0 = handlerC0750n2;
                    }
/* 988 */           c0714a1.f5349d = jCurrentTimeMillis;
/* 989 */           c0714a1.f5351f = jUptimeMillis;
/* 990 */           C0752o0 c0752o3 = handlerC0750n0.f5568a;
                    c0714a1.f5357l = c0752o3.f5587h;
/* 991 */           c0714a1.f5358m = c0752o3.f5588i;
/* 992 */           c0752o3.f5576D = c0714a1;
                }
            }
