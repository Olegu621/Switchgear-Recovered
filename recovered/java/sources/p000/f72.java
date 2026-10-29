            package p000;

            import android.app.Activity;
            import android.content.SharedPreferences;
            import android.os.Process;
            import android.os.SystemClock;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.ImageView;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            import androidx.core.app.FrameMetricsAggregator;
            import androidx.lifecycle.ProcessLifecycleOwner;
            import androidx.recyclerview.widget.RecyclerView;
            import androidx.transition.Fade;
            import androidx.transition.Slide;
            import com.appsflyer.AFLogger;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.R;
            import com.supercell.titan.ScInfoBox;
            import com.supercell.titan.TitanWebView;
            import com.usercentrics.sdk.p008ui.components.UCControllerId;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.AbstractC1552m4;
            import io.sentry.C1469h4;
            import io.sentry.C1486i0;
            import io.sentry.C1576o6;
            import io.sentry.C1694u;
            import io.sentry.C1697u2;
            import io.sentry.C1745x3;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1567n6;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.android.core.C1163a;
            import io.sentry.android.core.C1181d;
            import io.sentry.android.core.C1188f0;
            import io.sentry.android.core.C1191g0;
            import io.sentry.android.core.C1193h;
            import io.sentry.android.core.C1246n1;
            import io.sentry.android.core.C1248o0;
            import io.sentry.android.core.C1249o1;
            import io.sentry.android.core.C1271t;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
            import io.sentry.android.core.anr.AnrProfilingIntegration;
            import io.sentry.android.ndk.C1291b;
            import io.sentry.android.replay.C1294a0;
            import io.sentry.android.replay.C1315e;
            import io.sentry.android.replay.C1319g;
            import io.sentry.android.replay.C1326k;
            import io.sentry.android.replay.C1327l;
            import io.sentry.android.replay.C1329n;
            import io.sentry.android.replay.C1346u;
            import io.sentry.android.replay.C1372x;
            import io.sentry.android.replay.ReplayIntegration;
            import io.sentry.android.replay.capture.AbstractC1310l;
            import io.sentry.android.replay.capture.C1307i;
            import io.sentry.android.replay.capture.C1308j;
            import io.sentry.android.replay.screenshot.C1342h;
            import io.sentry.cache.C1401f;
            import io.sentry.cache.tape.AbstractC1407f;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.internal.modules.C1513f;
            import io.sentry.ndk.NativeScope;
            import io.sentry.protocol.C1626w;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1708g;
            import java.io.BufferedReader;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.io.InputStreamReader;
            import java.io.StringReader;
            import java.lang.ref.WeakReference;
            import java.lang.reflect.Field;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedList;
            import java.util.List;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.Charsets;
            import kotlin.text.StringsKt;
            import kotlin.text.StringsKt__StringsKt;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import okio.Segment;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public final /* synthetic */ class f72 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8034a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f8035b;

                public /* synthetic */ f72(C1163a c1163a, C1697u2 c1697u2) {
/* 3 */             this.f8034a = 16;
/* 8 */             this.f8035b = c1163a;
                }

                /* JADX WARN: Code duplicated, block: B:109:0x020c  */
                /* JADX WARN: Code duplicated, block: B:141:0x02e2  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r22v4 */
                /* JADX WARN: Type inference failed for: r22v5, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r22v6 */
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    File file;
                    Throwable th;
                    Date dateM5174l;
                    EnumC1567n6 enumC1567n6ValueOf;
                    C1315e c1315e;
                    Iterable linkedList;
                    Field field;
                    switch (this.f8034a) {
                        case 0:
/* 1555 */                  ScInfoBox scInfoBox = (ScInfoBox) this.f8035b;
/* 1563 */                  CoordinatorLayout coordinatorLayout = (CoordinatorLayout) scInfoBox.f5913e.getParent();
/* 1565 */                  if (coordinatorLayout != null) {
/* 1569 */                      coordinatorLayout.removeView(scInfoBox.f5913e);
/* 1576 */                      if (coordinatorLayout.getChildCount() == 0) {
/* 1584 */                          ((ViewGroup) coordinatorLayout.getParent()).removeView(coordinatorLayout);
/* 1587 */                          return;
                                }
/* 1587 */                      return;
                            }
/* 1587 */                  return;
                        case 1:
/* 1482 */                  C0168b5 c0168b5 = (C0168b5) this.f8035b;
                            synchronized (((ArrayDeque) c0168b5.f2214e)) {
/* 1493 */                      SharedPreferences.Editor editorEdit = ((SharedPreferences) c0168b5.f2211b).edit();
/* 1499 */                      String str = (String) c0168b5.f2212c;
/* 1503 */                      StringBuilder sb = new StringBuilder();
/* 1510 */                      Iterator it = ((ArrayDeque) c0168b5.f2214e).iterator();
/* 1518 */                      while (it.hasNext()) {
/* 1526 */                          sb.append((String) it.next());
/* 1533 */                          sb.append((String) c0168b5.f2213d);
                                }
/* 1545 */                      editorEdit.putString(str, sb.toString()).commit();
                                break;
                            }
/* 1549 */                  return;
                        case 2:
/* 1451 */                  db0 db0Var = (db0) ((ac1) this.f8035b).f179d;
/* 1453 */                  if (db0Var != null) {
/* 1459 */                      Iterator it2 = db0Var.values().iterator();
/* 1467 */                      while (it2.hasNext()) {
/* 1475 */                          ((lj2) it2.next()).m6462b();
                                }
/* 1479 */                      return;
                            }
/* 1479 */                  return;
                        case 3:
/* 1441 */                  ((qm2) this.f8035b).m7952c();
/* 1444 */                  return;
                        case 4:
/* 1426 */                  Runnable runnable = (Runnable) this.f8035b;
/* 1430 */                  Process.setThreadPriority(10);
/* 1433 */                  runnable.run();
/* 1436 */                  return;
                        case 5:
/* 1396 */                  GameApp gameApp = (GameApp) this.f8035b;
/* 1400 */                  gameApp.setRequestedOrientation(gameApp.requestedOrientation);
/* 1413 */                  View viewFindViewById = GameApp.getInstance().getWindow().findViewById(R.id.stage);
/* 1417 */                  if (viewFindViewById != null) {
/* 1420 */                      viewFindViewById.setVisibility(0);
/* 1423 */                      return;
                            }
/* 1423 */                  return;
                        case 6:
/* 1390 */                  ((op2) this.f8035b).f14861a.onSwipeRight();
/* 1393 */                  return;
                        case 7:
/* 1352 */                  TitanWebView.TitanWebViewClient titanWebViewClient = (TitanWebView.TitanWebViewClient) this.f8035b;
/* 1354 */                  TitanWebView titanWebView = TitanWebView.this;
/* 1358 */                  boolean zCanGoBack = titanWebView.f5959o.canGoBack();
/* 1362 */                  titanWebView.f5945a = zCanGoBack;
/* 1364 */                  TitanWebView titanWebView2 = titanWebViewClient.f5973a;
/* 1366 */                  ImageView imageView = titanWebView2.f5950f;
/* 1368 */                  if (imageView != null) {
/* 1380 */                      imageView.setVisibility((titanWebView2.f5954j && zCanGoBack) ? 0 : 8);
/* 1383 */                      return;
                            }
/* 1383 */                  return;
                        case 8:
/* 1285 */                  bt2 bt2Var = (bt2) this.f8035b;
/* 1287 */                  bt2Var.getClass();
/* 1292 */                  Slide slide = new Slide();
/* 1297 */                  slide.f1883l0 = Slide.f1882t0;
/* 1301 */                  slide.m1079M(80);
/* 1306 */                  slide.f1897c = 300L;
/* 1308 */                  ys2 ys2Var = bt2Var.f2600d;
/* 1310 */                  slide.mo1091b(ys2Var);
/* 1313 */                  lr2.m6525a(ys2Var, slide);
/* 1317 */                  ys2Var.setVisibility(0);
/* 1323 */                  Fade fade = new Fade(1);
/* 1326 */                  fade.f1897c = 300L;
/* 1332 */                  fade.mo1091b(bt2Var.m1432a());
/* 1339 */                  lr2.m6525a(bt2Var.m1432a(), fade);
/* 1346 */                  bt2Var.m1432a().setVisibility(0);
/* 1349 */                  return;
                        case 9:
/* 1275 */                  UCControllerId uCControllerId = (UCControllerId) this.f8035b;
/* 1277 */                  bu2 bu2Var = UCControllerId.Companion;
/* 1279 */                  uCControllerId.m2787l();
/* 1282 */                  return;
                        case 10:
/* 1269 */                  ((RecyclerView) this.f8035b).requestLayout();
/* 1272 */                  return;
                        case 11:
/* 1 */                     wv2.setupView$lambda$0((wv2) this.f8035b);
/* 1264 */                  return;
                        case 12:
/* 1218 */                  b93 b93Var = (b93) this.f8035b;
/* 1247 */                  AbstractC1245n0.m4889q("FirebaseMessaging", "Service took too long to process intent: " + b93Var.f2331a.getAction() + " finishing.");
/* 1253 */                  b93Var.f2332b.trySetResult(null);
/* 1256 */                  return;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1199 */                  ra2 ra2Var = (ra2) this.f8035b;
/* 1212 */                  ((s52) ra2Var.f15958d).m8408k(new C2357x6(ra2Var, 22));
/* 1215 */                  return;
                        case 14:
/* 1 */                     AFLogger.getMonetizationNetwork((Function1) this.f8035b);
/* 1196 */                  return;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1155 */                  File[] fileArrListFiles = ((File) this.f8035b).listFiles();
/* 1159 */                  if (fileArrListFiles == null) {
/* 1188 */                      return;
                            }
/* 1164 */                  for (File file2 : fileArrListFiles) {
/* 1180 */                      if (file2.lastModified() < AbstractC1552m4.f11143f - 300000) {
/* 1182 */                          AbstractC1704c.m5451f(file2);
                                }
                            }
/* 1188 */                  return;
                        case 16:
/* 1136 */                  C1163a c1163a = (C1163a) this.f8035b;
/* 1142 */                  c1163a.f9926v = SystemClock.uptimeMillis();
/* 1147 */                  c1163a.f9927w.set(false);
/* 1150 */                  return;
                        case 17:
/* 1082 */                  ur3 ur3Var = ((FrameMetricsAggregator) ((C1708g) ((C1181d) this.f8035b).f9984a).m5471a()).f1234a;
/* 1086 */                  ArrayList arrayList = (ArrayList) ur3Var.f17705c;
/* 1096 */                  for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 1102 */                      WeakReference weakReference = (WeakReference) arrayList.get(size);
/* 1108 */                      Activity activity = (Activity) weakReference.get();
/* 1114 */                      if (weakReference.get() != null) {
/* 1124 */                          activity.getWindow().removeOnFrameMetricsAvailableListener((sn0) ur3Var.f17706d);
/* 1127 */                          arrayList.remove(size);
                                }
                            }
/* 1133 */                  return;
                        case 18:
/* 1064 */                  ((C1193h) this.f8035b).m4800h(true);
/* 1067 */                  return;
                        case 19:
/* 1055 */                  ((C1271t) this.f8035b).m4934a(null, true);
/* 1058 */                  return;
                        case 20:
/* 1037 */                  C1188f0 c1188f0 = (C1188f0) this.f8035b;
/* 1039 */                  if (c1188f0 != null) {
/* 1045 */                      ProcessLifecycleOwner.f1535w.f1541f.mo4484b(c1188f0);
/* 1048 */                      return;
                            }
/* 1048 */                  return;
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 1000 */                  C2199sz c2199sz = ((C1249o1) this.f8035b).f10233g;
                            while (true) {
/* 1004 */                      C1246n1 c1246n1 = (C1246n1) c2199sz.f16876d;
/* 1006 */                      if (c1246n1 == null) {
/* 1027 */                          c2199sz.f16877e = null;
/* 1030 */                          c2199sz.f16873a = 0;
/* 1032 */                          c2199sz.f16874b = 0;
/* 1034 */                          return;
                                } else {
/* 1010 */                          c2199sz.f16876d = c1246n1.f10224c;
/* 1014 */                          C1248o0 c1248o0 = (C1248o0) c2199sz.f16875c;
/* 1020 */                          c1246n1.f10224c = (C1246n1) c1248o0.f10226a;
/* 1022 */                          c1248o0.f10226a = c1246n1;
                                }
                            }
                            break;
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 986 */                   SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.f8035b;
/* 990 */                   systemEventsBreadcrumbsIntegration.m4764h(systemEventsBreadcrumbsIntegration.f9899c);
/* 993 */                   return;
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 981 */                   ((AnrProfilingIntegration) this.f8035b).f9940e = SystemClock.uptimeMillis();
/* 983 */                   return;
                        case 24:
/* 969 */                   ((C1513f) this.f8035b).mo5302a();
/* 972 */                   return;
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 958 */                   ((C1291b) this.f8035b).f10406b.getClass();
/* 961 */                   NativeScope.nativeClearAttachments();
/* 964 */                   return;
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 142 */                   ReplayIntegration replayIntegration = (ReplayIntegration) this.f8035b;
/* 144 */                   String str2 = "options";
/* 146 */                   SentryAndroidOptions sentryAndroidOptions = replayIntegration.f10421d;
/* 148 */                   if (sentryAndroidOptions == null) {
/* 948 */                       Intrinsics.m6220e("options");
/* 951 */                       throw null;
                            }
/* 150 */                   C1401f c1401fFindPersistingScopeObserver = sentryAndroidOptions.findPersistingScopeObserver();
/* 154 */                   if (c1401fFindPersistingScopeObserver != null) {
/* 156 */                       SentryAndroidOptions sentryAndroidOptions2 = replayIntegration.f10421d;
/* 158 */                       if (sentryAndroidOptions2 == null) {
/* 936 */                           Intrinsics.m6220e("options");
/* 939 */                           throw null;
                                }
/* 168 */                       String str3 = (String) c1401fFindPersistingScopeObserver.m5128b(sentryAndroidOptions2, "replay.json", String.class);
/* 170 */                       if (str3 != null) {
/* 176 */                           C1626w c1626w = new C1626w(str3);
/* 185 */                           if (c1626w.equals(C1626w.f11478b)) {
/* 187 */                               replayIntegration.m4975m(HttpUrl.FRAGMENT_ENCODE_SET);
/* 943 */                               return;
                                    }
/* 192 */                           SentryAndroidOptions sentryAndroidOptions3 = replayIntegration.f10421d;
/* 194 */                           if (sentryAndroidOptions3 == null) {
/* 928 */                               Intrinsics.m6220e("options");
/* 931 */                               throw null;
                                    }
/* 196 */                           String cacheDirPath = sentryAndroidOptions3.getCacheDirPath();
/* 200 */                           if (cacheDirPath == null || cacheDirPath.length() == 0) {
/* 249 */                               sentryAndroidOptions3.getLogger().mo4672k(EnumC1553m5.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
/* 252 */                               file = null;
                                    } else {
/* 211 */                               String cacheDirPath2 = sentryAndroidOptions3.getCacheDirPath();
/* 215 */                               cacheDirPath2.getClass();
/* 232 */                               file = new File(cacheDirPath2, "replay_" + c1626w);
/* 235 */                               file.mkdirs();
                                    }
/* 257 */                           File file3 = new File(file, ".ongoing_segment");
/* 264 */                           if (file3.exists()) {
/* 293 */                               LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 312 */                               BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file3), Charsets.UTF_8), Segment.SIZE);
                                        try {
/* 326 */                                   Iterator it3 = new C1982nz(new C2066pd(bufferedReader, 2)).iterator();
/* 334 */                                   while (it3.hasNext()) {
/* 7 */                                         List listSplit$default = StringsKt__StringsKt.split$default((String) it3.next(), new String[]{"="}, false, 2, 2, null);
/* 366 */                                       linkedHashMap.put((String) listSplit$default.get(0), (String) listSplit$default.get(1));
                                            }
/* 374 */                                   th = null;
/* 376 */                                   bufferedReader.close();
/* 385 */                                   String str4 = (String) linkedHashMap.get("config.height");
/* 394 */                                   Integer intOrNull = str4 != null ? StringsKt.toIntOrNull(str4) : null;
/* 402 */                                   String str5 = (String) linkedHashMap.get("config.width");
/* 411 */                                   Integer intOrNull2 = str5 != null ? StringsKt.toIntOrNull(str5) : null;
/* 419 */                                   String str6 = (String) linkedHashMap.get("config.frame-rate");
/* 428 */                                   Integer intOrNull3 = str6 != null ? StringsKt.toIntOrNull(str6) : null;
/* 436 */                                   String str7 = (String) linkedHashMap.get("config.bit-rate");
/* 445 */                                   Integer intOrNull4 = str7 != null ? StringsKt.toIntOrNull(str7) : null;
/* 453 */                                   String str8 = (String) linkedHashMap.get("segment.id");
/* 462 */                                   Integer intOrNull5 = str8 != null ? StringsKt.toIntOrNull(str8) : null;
                                            try {
/* 470 */                                       String str9 = (String) linkedHashMap.get("segment.timestamp");
/* 472 */                                       if (str9 == null) {
/* 474 */                                           str9 = HttpUrl.FRAGMENT_ENCODE_SET;
                                                }
/* 475 */                                       dateM5174l = AbstractC1417a.m5174l(str9);
                                            } catch (Throwable unused) {
/* 480 */                                       dateM5174l = null;
                                            }
                                            try {
/* 488 */                                       String str10 = (String) linkedHashMap.get("replay.type");
/* 490 */                                       if (str10 == null) {
/* 492 */                                           str10 = HttpUrl.FRAGMENT_ENCODE_SET;
                                                }
/* 493 */                                       enumC1567n6ValueOf = EnumC1567n6.valueOf(str10);
                                            } catch (Throwable unused2) {
/* 498 */                                       enumC1567n6ValueOf = null;
                                            }
/* 500 */                                   if (intOrNull == null || intOrNull2 == null || intOrNull3 == null || intOrNull4 == null || intOrNull5 == null) {
/* 144 */                                       str2 = "options";
/* 785 */                                       sentryAndroidOptions3.getLogger().mo4672k(EnumC1553m5.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", c1626w);
/* 788 */                                       AbstractC1704c.m5451f(file);
/* 605 */                                       c1315e = null;
                                            } else {
/* 510 */                                       Integer num = intOrNull;
/* 516 */                                       Date date = dateM5174l;
/* 519 */                                       if (intOrNull5.intValue() == -1 || date == null || enumC1567n6ValueOf == null) {
/* 144 */                                           str2 = "options";
/* 785 */                                           sentryAndroidOptions3.getLogger().mo4672k(EnumC1553m5.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", c1626w);
/* 788 */                                           AbstractC1704c.m5451f(file);
                                                } else {
/* 551 */                                           C1372x c1372x = new C1372x(intOrNull2.intValue(), num.intValue(), 1.0f, 1.0f, intOrNull3.intValue(), intOrNull4.intValue());
/* 556 */                                           C1326k c1326k = new C1326k(sentryAndroidOptions3, c1626w);
/* 559 */                                           ArrayList arrayList2 = c1326k.f10560w;
/* 561 */                                           File fileM5015g = c1326k.m5015g();
/* 565 */                                           if (fileM5015g != null) {
/* 575 */                                               fileM5015g.listFiles(new C1694u(c1326k, 1));
                                                    }
/* 585 */                                           if (arrayList2.isEmpty()) {
/* 599 */                                               sentryAndroidOptions3.getLogger().mo4672k(EnumC1553m5.DEBUG, "No frames found for replay: %s, deleting the replay", c1626w);
/* 602 */                                               AbstractC1704c.m5451f(file);
                                                    } else {
/* 614 */                                               if (arrayList2.size() > 1) {
/* 619 */                                                   C1319g c1319g = new C1319g(0);
/* 626 */                                                   if (arrayList2.size() > 1) {
/* 628 */                                                       Collections.sort(arrayList2, c1319g);
                                                            }
                                                        }
/* 631 */                                               EnumC1567n6 enumC1567n6 = EnumC1567n6.SESSION;
/* 642 */                                               int iIntValue = enumC1567n6ValueOf == enumC1567n6 ? intOrNull5.intValue() : 0;
/* 659 */                                               Date date2 = enumC1567n6ValueOf == enumC1567n6 ? date : new Date(((C1327l) CollectionsKt.m6200u(arrayList2)).f10562b);
/* 685 */                                               long time = (((C1327l) CollectionsKt.m6204y(arrayList2)).f10562b - date2.getTime()) + ((long) (1000 / intOrNull3.intValue()));
/* 693 */                                               String str11 = (String) linkedHashMap.get("replay.recording");
/* 695 */                                               if (str11 != null) {
/* 712 */                                                   C1745x3 c1745x3 = (C1745x3) sentryAndroidOptions3.getSerializer().mo5064b(new StringReader(str11), C1745x3.class);
/* 721 */                                                   if ((c1745x3 != null ? c1745x3.f11810b : null) != null) {
/* 725 */                                                       List list = c1745x3.f11810b;
/* 727 */                                                       list.getClass();
/* 730 */                                                       linkedList = new LinkedList(list);
                                                            } else {
/* 734 */                                                       linkedList = null;
                                                            }
/* 736 */                                                   if (linkedList == null) {
/* 739 */                                                       linkedList = nd0.f14189a;
                                                            }
                                                        } else {
/* 739 */                                                   linkedList = nd0.f14189a;
                                                        }
/* 767 */                                               c1315e = new C1315e(c1372x, c1326k, date2, iIntValue, time, enumC1567n6ValueOf, (String) linkedHashMap.get("replay.screen-at-start"), CollectionsKt.m6186E(new C1319g(1), linkedList));
                                                    }
                                                }
/* 605 */                                       c1315e = null;
                                            }
                                            break;
                                        } catch (Throwable th2) {
                                            try {
/* 918 */                                       throw th2;
                                            } catch (Throwable th3) {
/* 920 */                                       jb1.m5754n(bufferedReader, th2);
/* 923 */                                       throw th3;
                                            }
                                        }
                                    } else {
/* 278 */                               sentryAndroidOptions3.getLogger().mo4672k(EnumC1553m5.DEBUG, "No ongoing segment found for replay: %s", c1626w);
/* 281 */                               AbstractC1704c.m5451f(file);
/* 144 */                               str2 = "options";
/* 286 */                               c1315e = null;
/* 287 */                               th = null;
                                    }
/* 793 */                           if (c1315e == null) {
/* 795 */                               replayIntegration.m4975m(HttpUrl.FRAGMENT_ENCODE_SET);
/* 943 */                               return;
                                    }
/* 800 */                           SentryAndroidOptions sentryAndroidOptions4 = replayIntegration.f10421d;
/* 802 */                           if (sentryAndroidOptions4 == null) {
/* 914 */                               Intrinsics.m6220e(str2);
/* 917 */                               throw th;
                                    }
/* 808 */                           Object objM5128b = c1401fFindPersistingScopeObserver.m5128b(sentryAndroidOptions4, "breadcrumbs.json", List.class);
/* 821 */                           ?? r22 = objM5128b instanceof List ? (List) objM5128b : th;
/* 823 */                           C1469h4 c1469h4 = replayIntegration.f10422e;
/* 825 */                           SentryAndroidOptions sentryAndroidOptions5 = replayIntegration.f10421d;
/* 827 */                           if (sentryAndroidOptions5 == null) {
/* 910 */                               Intrinsics.m6220e(str2);
/* 913 */                               throw th;
                                    }
/* 829 */                           long j = c1315e.f10510e;
/* 831 */                           Date date3 = c1315e.f10508c;
/* 833 */                           int i = c1315e.f10509d;
/* 835 */                           C1372x c1372x2 = c1315e.f10506a;
/* 874 */                           AbstractC1310l abstractC1310lM4999a = C1307i.m4999a(c1469h4, sentryAndroidOptions5, j, date3, c1626w, i, c1372x2.f10704b, c1372x2.f10703a, c1315e.f10511f, c1315e.f10507b, c1372x2.f10707e, c1372x2.f10708f, c1315e.f10512g, r22, new LinkedList(c1315e.f10513h), nd0.f14189a);
/* 880 */                           if (abstractC1310lM4999a instanceof C1308j) {
/* 887 */                               C1486i0 c1486i0M5450e = AbstractC1704c.m5450e(new C1329n());
/* 891 */                               C1308j c1308j = (C1308j) abstractC1310lM4999a;
/* 893 */                               C1469h4 c1469h5 = replayIntegration.f10422e;
/* 895 */                               if (c1469h5 != null) {
/* 897 */                                   C1576o6 c1576o6 = c1308j.f10493a;
/* 901 */                                   c1486i0M5450e.f11008h = c1308j.f10494b;
/* 903 */                                   c1469h5.mo5101u(c1576o6, c1486i0M5450e);
                                        }
                                    }
/* 906 */                           replayIntegration.m4975m(str3);
/* 943 */                           return;
                                }
                            }
/* 940 */                   replayIntegration.m4975m(HttpUrl.FRAGMENT_ENCODE_SET);
/* 943 */                   return;
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 85 */                    C1346u c1346u = (C1346u) this.f8035b;
/* 93 */                    if (c1346u.f10640a.get()) {
/* 137 */                       return;
                            }
/* 100 */                   C1983o c1983o = new C1983o(c1346u, 29);
                            try {
/* 105 */                       Object value = C1294a0.f10437b.getValue();
/* 109 */                       if (value == null || (field = (Field) C1294a0.f10438c.getValue()) == null) {
/* 137 */                           return;
                                }
/* 121 */                       Object obj = field.get(value);
/* 125 */                       obj.getClass();
/* 134 */                       field.set(value, c1983o.invoke((ArrayList) obj));
/* 137 */                       return;
                            } catch (Throwable unused3) {
/* 137 */                       return;
                            }
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 44 */                    C1342h c1342h = (C1342h) this.f8035b;
/* 52 */                    if (!c1342h.f10618g.isRecycled()) {
                                synchronized (c1342h.f10618g) {
/* 63 */                            if (!c1342h.f10618g.isRecycled()) {
/* 67 */                                c1342h.f10618g.recycle();
                                    }
                                    break;
                                }
                            }
/* 79 */                    c1342h.f10621j.close();
/* 82 */                    return;
                        default:
/* 13 */                    C1401f c1401f = (C1401f) this.f8035b;
                            try {
/* 23 */                        ((AbstractC1407f) c1401f.f10810b.m5471a()).clear();
/* 41 */                        return;
                            } catch (IOException e) {
/* 38 */                        c1401f.f10809a.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to clear breadcrumbs from file queue", e);
/* 41 */                        return;
                            }
                    }
                }

/* 10 */        public /* synthetic */ f72(C1191g0 c1191g0, C1188f0 c1188f0) {
/* 11 */            this.f8034a = 20;
                    this.f8035b = c1188f0;
                }

/* 11 */        public /* synthetic */ f72(Object obj, int i) {
/* 12 */            this.f8034a = i;
                    this.f8035b = obj;
                }
            }
