            package p000;

            import android.animation.ValueAnimator;
            import android.content.SharedPreferences;
            import android.os.Build;
            import android.os.Handler;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import android.view.Menu;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import android.view.animation.AnimationUtils;
            import android.view.inputmethod.InputMethodManager;
            import androidx.appcompat.widget.Toolbar;
            import androidx.constraintlayout.helper.widget.Carousel;
            import androidx.constraintlayout.motion.widget.MotionLayout;
            import androidx.drawerlayout.widget.C0085b;
            import androidx.drawerlayout.widget.DrawerLayout;
            import androidx.fragment.app.AbstractC0111w;
            import androidx.fragment.app.C0096h;
            import androidx.fragment.app.DialogInterfaceOnCancelListenerC0097i;
            import androidx.recyclerview.widget.StaggeredGridLayoutManager;
            import androidx.viewpager.widget.ViewPager;
            import com.google.android.material.bottomsheet.BottomSheetBehavior;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.Locale;
            import java.util.Map;
            import java.util.TimeZone;
            import java.util.UUID;
            import java.util.WeakHashMap;
            import java.util.concurrent.atomic.AtomicBoolean;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import org.json.JSONArray;
            import org.json.JSONObject;
            
            /* JADX INFO: renamed from: ye */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RunnableC2495ye implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19585a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f19586b;

                public /* synthetic */ RunnableC2495ye(Object obj, int i) {
/* 1 */             this.f19585a = i;
/* 3 */             this.f19586b = obj;
                }

                /* JADX WARN: Code duplicated, block: B:42:0x003a A[SYNTHETIC] */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
                
                    if (r1 == false) goto L47;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
                
                    r1 = r1 | java.lang.Thread.interrupted();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
                
                    r4.run();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
                
                    r2 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
                
                    p000.hu0.m4326U("SequentialExecutor", "Exception while executing runnable " + r4, r2);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
                
                    return;
                 */
                /* JADX INFO: renamed from: a */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void m10146a() {
                    Runnable runnable;
/* 1 */             boolean z = false;
/* 2 */             boolean zInterrupted = false;
                    while (true) {
                        try {
                            synchronized (((y92) this.f19586b).f19544a) {
/* 11 */                        if (z) {
/* 55 */                            runnable = (Runnable) ((y92) this.f19586b).f19544a.poll();
/* 57 */                            if (runnable == null) {
/* 63 */                                ((y92) this.f19586b).f19547d = 1;
                                    }
                                } else {
/* 15 */                            y92 y92Var = (y92) this.f19586b;
/* 20 */                            if (y92Var.f19547d != 4) {
/* 40 */                                y92Var.f19548e++;
/* 42 */                                y92Var.f19547d = 4;
/* 44 */                                z = true;
/* 55 */                                runnable = (Runnable) ((y92) this.f19586b).f19544a.poll();
/* 57 */                                if (runnable == null) {
/* 63 */                                    ((y92) this.f19586b).f19547d = 1;
                                        }
                                    }
                                }
                            }
/* 23 */                    if (zInterrupted) {
                                break;
                            } else {
/* 69 */                        return;
                            }
                        } catch (Throwable th) {
/* 108 */                   if (zInterrupted) {
/* 114 */                       Thread.currentThread().interrupt();
                            }
/* 117 */                   throw th;
                        }
                    }
/* 29 */            Thread.currentThread().interrupt();
                }

                @Override // java.lang.Runnable
                public final void run() {
                    View viewM612d;
                    int width;
                    Object obj;
                    AtomicBoolean atomicBoolean;
                    boolean z;
/* 15 */            boolean z2 = false;
                    switch (this.f19585a) {
                        case 0:
/* 1322 */                  r81 r81Var = (r81) this.f19586b;
/* 1324 */                  ra0 ra0Var = r81Var.f15924c;
/* 1326 */                  C2365xe c2365xe = r81Var.f15920a;
/* 1330 */                  if (r81Var.f15919Z) {
/* 1336 */                      if (r81Var.f15917X) {
/* 1339 */                          r81Var.f15917X = false;
/* 1341 */                          long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
/* 1345 */                          c2365xe.f19048e = jCurrentAnimationTimeMillis;
/* 1349 */                          c2365xe.f19050g = -1L;
/* 1351 */                          c2365xe.f19049f = jCurrentAnimationTimeMillis;
/* 1355 */                          c2365xe.f19051h = 0.5f;
                                }
/* 1361 */                      if ((c2365xe.f19050g > 0 && AnimationUtils.currentAnimationTimeMillis() > c2365xe.f19050g + ((long) c2365xe.f19052i)) || !r81Var.m8085e()) {
/* 1386 */                          r81Var.f15919Z = false;
/* 1465 */                          return;
                                }
/* 1392 */                      if (r81Var.f15918Y) {
/* 1394 */                          r81Var.f15918Y = false;
/* 1396 */                          long jUptimeMillis = SystemClock.uptimeMillis();
/* 1405 */                          MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
/* 1409 */                          ra0Var.onTouchEvent(motionEventObtain);
/* 1412 */                          motionEventObtain.recycle();
                                }
/* 1419 */                      if (c2365xe.f19049f == 0) {
/* 1462 */                          f42.m3663s("Cannot compute scroll delta before calling start()");
/* 1465 */                          return;
                                }
/* 1421 */                      long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
/* 1425 */                      float fM9755a = c2365xe.m9755a(jCurrentAnimationTimeMillis2);
/* 1439 */                      long j = jCurrentAnimationTimeMillis2 - c2365xe.f19049f;
/* 1441 */                      c2365xe.f19049f = jCurrentAnimationTimeMillis2;
/* 1451 */                      r81Var.f15923b0.scrollListBy((int) (j * ((fM9755a * 4.0f) + ((-4.0f) * fM9755a * fM9755a)) * c2365xe.f19047d));
/* 1454 */                      WeakHashMap weakHashMap = e33.f7494a;
/* 1456 */                      ra0Var.postOnAnimation(this);
/* 1465 */                      return;
                            }
/* 1465 */                  return;
                        case 1:
/* 1287 */                  C2258uk c2258uk = (C2258uk) this.f19586b;
/* 1290 */                  c2258uk.f17568b = false;
/* 1292 */                  BottomSheetBehavior bottomSheetBehavior = c2258uk.f17570d;
/* 1294 */                  j33 j33Var = bottomSheetBehavior.f4487K;
/* 1296 */                  if (j33Var != null && j33Var.m5677h()) {
/* 1306 */                      c2258uk.m9033a(c2258uk.f17567a);
/* 1319 */                      return;
                            } else {
/* 1312 */                      if (bottomSheetBehavior.f4486J == 2) {
/* 1316 */                          bottomSheetBehavior.m2255B(c2258uk.f17567a);
/* 1319 */                          return;
                                }
/* 1319 */                      return;
                            }
                        case 2:
/* 1281 */                  ((Carousel) this.f19586b).f821c0.setProgress(0.0f);
/* 1284 */                  throw null;
                        case 3:
                            try {
/* 1 */                         super/*android.app.Activity*/.onBackPressed();
/* 1273 */                      return;
                            } catch (IllegalStateException e) {
/* 1271 */                      if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
/* 1274 */                          throw e;
                                }
/* 1273 */                      return;
                            } catch (NullPointerException e2) {
/* 1257 */                      if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
/* 1260 */                          throw e2;
                                }
/* 1273 */                      return;
                            }
                        case 4:
/* 1225 */                  DialogInterfaceOnCancelListenerC0097i dialogInterfaceOnCancelListenerC0097i = (DialogInterfaceOnCancelListenerC0097i) this.f19586b;
/* 1231 */                  dialogInterfaceOnCancelListenerC0097i.f1455d.onDismiss(dialogInterfaceOnCancelListenerC0097i.f1447W);
/* 1234 */                  return;
                        case 5:
/* 1085 */                  C0085b c0085b = (C0085b) this.f19586b;
/* 1087 */                  DrawerLayout drawerLayout = c0085b.f1335h;
/* 1091 */                  int i = c0085b.f1333f.f12054o;
/* 1093 */                  int i2 = c0085b.f1332e;
/* 1099 */                  boolean z3 = i2 == 3;
/* 1101 */                  if (z3) {
/* 1103 */                      viewM612d = drawerLayout.m612d(3);
/* 1116 */                      width = (viewM612d != null ? -viewM612d.getWidth() : 0) + i;
                            } else {
/* 1118 */                      viewM612d = drawerLayout.m612d(5);
/* 1126 */                      width = drawerLayout.getWidth() - i;
                            }
/* 1127 */                  if (viewM612d != null) {
/* 1129 */                      if (((!z3 || viewM612d.getLeft() >= width) && (z3 || viewM612d.getLeft() <= width)) || drawerLayout.m614f(viewM612d) != 0) {
/* 1222 */                          return;
                                }
/* 1155 */                      DrawerLayout.LayoutParams layoutParams = (DrawerLayout.LayoutParams) viewM612d.getLayoutParams();
/* 1163 */                      c0085b.f1333f.m5689u(viewM612d, width, viewM612d.getTop());
/* 1166 */                      layoutParams.f1325c = true;
/* 1168 */                      drawerLayout.invalidate();
/* 1174 */                      View viewM612d2 = drawerLayout.m612d(i2 == 3 ? 5 : 3);
/* 1178 */                      if (viewM612d2 != null) {
/* 1180 */                          drawerLayout.m610b(viewM612d2);
                                }
/* 1185 */                      if (drawerLayout.f1308e0) {
/* 1222 */                          return;
                                }
/* 1187 */                      long jUptimeMillis2 = SystemClock.uptimeMillis();
/* 1196 */                      MotionEvent motionEventObtain2 = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
/* 1200 */                      int childCount = drawerLayout.getChildCount();
/* 1205 */                      for (int i3 = 0; i3 < childCount; i3++) {
/* 1211 */                          drawerLayout.getChildAt(i3).dispatchTouchEvent(motionEventObtain2);
                                }
/* 1217 */                      motionEventObtain2.recycle();
/* 1220 */                      drawerLayout.f1308e0 = true;
/* 1222 */                      return;
                            }
/* 1222 */                  return;
                        case 6:
/* 1075 */                  ra0 ra0Var2 = (ra0) this.f19586b;
/* 1077 */                  ra0Var2.f15941W = null;
/* 1079 */                  ra0Var2.drawableStateChanged();
/* 1082 */                  return;
                        case 7:
/* 1027 */                  ah0 ah0Var = (ah0) this.f19586b;
/* 1029 */                  ValueAnimator valueAnimator = ah0Var.f285z;
/* 1031 */                  int i4 = ah0Var.f258A;
/* 1033 */                  if (i4 == 1) {
/* 1038 */                      valueAnimator.cancel();
                            } else if (i4 != 2) {
/* 1072 */                      return;
                            }
/* 1041 */                  ah0Var.f258A = 3;
/* 1061 */                  valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
/* 1066 */                  valueAnimator.setDuration(500L);
/* 1069 */                  valueAnimator.start();
/* 1072 */                  return;
                        case 8:
/* 1011 */                  C0096h c0096h = (C0096h) this.f19586b;
/* 1019 */                  if (c0096h.f1441b.isEmpty()) {
/* 1024 */                      return;
                            }
/* 1021 */                  c0096h.m659e();
/* 1024 */                  return;
                        case 9:
/* 1005 */                  ((AbstractC0111w) this.f19586b).m728z(true);
/* 1008 */                  return;
                        case 10:
/* 997 */                   ((s81) this.f19586b).cancel(true);
/* 1000 */                  return;
                        case 11:
/* 971 */                   C0875ec c0875ec = (C0875ec) this.f19586b;
/* 975 */                   mt0 mt0Var = (mt0) c0875ec.f7615d;
/* 983 */                   if (mt0Var.f14017a.getAndSet(null) != null) {
/* 989 */                       ((Handler) c0875ec.f7613b).removeCallbacks(mt0Var);
/* 992 */                       return;
                            }
/* 992 */                   return;
                        case 12:
/* 800 */                   C0168b5 c0168b5 = ((rs0) this.f19586b).f16276u;
/* 802 */                   c0168b5.getClass();
/* 805 */                   long jCurrentTimeMillis = System.currentTimeMillis();
/* 811 */                   er0 er0Var = (er0) c0168b5.f2211b;
/* 819 */                   long jM3587p = ((er0) er0Var.f7853b).m3587p("last_unread_count_api_access");
/* 837 */                   int i5 = ((C1969nm) c0168b5.f2213d).m7013p() ? 60000 : 300000;
/* 842 */                   if (jM3587p == 0 || jCurrentTimeMillis - jM3587p >= i5) {
/* 927 */                       SharedPreferences.Editor editorEdit = ((SharedPreferences) ((er0) er0Var.f7853b).f7853b).edit();
/* 931 */                       editorEdit.putLong("last_unread_count_api_access", jCurrentTimeMillis);
/* 938 */                       if (!editorEdit.commit()) {
/* 940 */                           editorEdit.commit();
                                }
/* 947 */                       xe2.m9775m("rqUnrdCntHdlr", "Fetching unread count from remote.", null);
/* 965 */                       ((fs0) ((ra2) c0168b5.f2215f).f15955a).m3826w(new RunnableC2495ye(c0168b5, 21));
/* 968 */                       return;
                            }
/* 855 */                   xe2.m9775m("rqUnrdCntHdlr", "Serving count from local cache.", null);
/* 860 */                   HashMap map = new HashMap();
/* 865 */                   C1969nm c1969nm = (C1969nm) c0168b5.f2213d;
/* 899 */                   map.put("count", Integer.valueOf(Math.max(c1969nm.m7006i(), ((Integer) c1969nm.m7008k(0, "push_unread_count")).intValue())));
/* 906 */                   map.put("fromCache", Boolean.TRUE);
/* 915 */                   ((wc0) c0168b5.f2214e).m9527D("receivedUnreadMessageCount", map);
/* 968 */                   return;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 793 */                   rs0.f16254y.f16272q.f18577b = (ec0) this.f19586b;
/* 795 */                   return;
                        case 14:
/* 778 */                   f81 f81Var = (f81) this.f19586b;
/* 780 */                   f81Var.f8040b = null;
/* 782 */                   f81Var.f8039a = null;
/* 784 */                   return;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                            synchronized (((a91) this.f19586b).f122a) {
/* 754 */                       obj = ((a91) this.f19586b).f127f;
/* 762 */                       ((a91) this.f19586b).f127f = a91.f121k;
                                break;
                            }
/* 769 */                   ((a91) this.f19586b).mo124j(obj);
/* 772 */                   return;
                        case 16:
/* 331 */                   wi1 wi1Var = (wi1) this.f19586b;
/* 333 */                   SharedPreferences sharedPreferences = wi1Var.f18648a;
/* 335 */                   er0 er0Var2 = wi1Var.f18650c;
/* 337 */                   C0210cb c0210cb = wi1Var.f18651d;
                            try {
                                try {
/* 339 */                           atomicBoolean = wi1.f18647f;
/* 345 */                           if (!atomicBoolean.get()) {
/* 352 */                               atomicBoolean.set(true);
/* 355 */                               String string = sharedPreferences.getString("failure_logs", HttpUrl.FRAGMENT_ENCODE_SET);
/* 363 */                               if (!b40.m1232p(string)) {
/* 368 */                                   JSONObject jSONObject = new JSONObject(string);
/* 373 */                                   JSONArray jSONArray = new JSONArray();
/* 376 */                                   jSONArray.put(jSONObject);
/* 379 */                                   String strM1592o = c0210cb.m1592o();
/* 383 */                                   String strM1593p = c0210cb.m1593p();
/* 389 */                                   ArrayList arrayList = new ArrayList();
/* 439 */                                   arrayList.add(new JSONObject().put("domain", ((er0) er0Var2.f7853b).m3589r("domain") + "." + ((er0) er0Var2.f7853b).m3589r(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST)));
/* 444 */                                   c0210cb.getClass();
/* 458 */                                   arrayList.add(new JSONObject().put("dm", Build.MODEL));
/* 476 */                                   arrayList.add(new JSONObject().put("did", c0210cb.m1599v()));
/* 481 */                                   c0210cb.getClass();
/* 495 */                                   arrayList.add(new JSONObject().put("os", Build.VERSION.RELEASE));
/* 502 */                                   if (!b40.m1232p(strM1592o)) {
/* 515 */                                       arrayList.add(new JSONObject().put("an", strM1592o));
                                            }
/* 530 */                                   if (!b40.m1232p(strM1593p)) {
/* 543 */                                       arrayList.add(new JSONObject().put("av", strM1593p));
                                            }
/* 560 */                                   JSONArray jSONArray2 = arrayList.size() == 0 ? new JSONArray() : new JSONArray((Collection) arrayList);
/* 565 */                                   HashMap map2 = new HashMap();
/* 578 */                                   map2.put("id", UUID.randomUUID().toString());
/* 585 */                                   map2.put("v", "1");
/* 594 */                                   SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH);
/* 603 */                                   simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
/* 617 */                                   map2.put("ctime", simpleDateFormat.format(new Date()));
/* 624 */                                   map2.put("src", "sdkx.android.10.2.0");
/* 633 */                                   map2.put("logs", jSONArray.toString());
/* 642 */                                   map2.put("md", jSONArray2.toString());
/* 651 */                                   map2.put("platform-id", er0Var2.m3588q());
/* 684 */                                   int i6 = new lp0(wi1Var.f18649b, wi1.m9581a(wi1Var), 1).m8750l(new wc0(13, jb1.m5750j(c0210cb, er0Var2.m3588q()), map2)).f12324a;
/* 688 */                                   if (i6 >= 200 && i6 < 300) {
/* 704 */                                       sharedPreferences.edit().putBoolean("failure_logs_synced", true).apply();
/* 715 */                                       sharedPreferences.edit().putString("failure_logs", HttpUrl.FRAGMENT_ENCODE_SET).commit();
                                                break;
                                            }
/* 718 */                                   z2 = false;
/* 736 */                                   return;
                                        }
/* 739 */                               wi1.f18647f.set(false);
                                    }
/* 736 */                           return;
                                } catch (Exception e3) {
/* 727 */                           xe2.m9777o("MgrFailLog", "Migration failure logs synced failed", e3);
/* 730 */                           atomicBoolean = wi1.f18647f;
/* 732 */                           z2 = false;
/* 736 */                           return;
                                }
                            } finally {
/* 739 */                       wi1.f18647f.set(false);
                            }
                        case 17:
/* 319 */                   ((ViewGroup) this.f19586b).setNestedScrollingEnabled(true);
/* 322 */                   return;
                        case 18:
/* 311 */                   ((MotionLayout) this.f19586b).f911h1.m3770a();
/* 314 */                   return;
                        case 19:
/* 293 */                   jt1 jt1Var = (jt1) this.f19586b;
/* 301 */                   jt1Var.m5897a(jt1Var.f12478a.m5613h());
/* 304 */                   return;
                        case 20:
/* 287 */                   hu0.m4340k0((Map) this.f19586b);
/* 290 */                   return;
                        case io.flutter.Build.API_LEVELS.API_21 /* 21 */:
/* 216 */                   C0168b5 c0168b6 = (C0168b5) this.f19586b;
                            try {
/* 222 */                       int iM5613h = ((C1773iy) c0168b6.f2212c).m5613h();
/* 226 */                       if (iM5613h >= 200 && iM5613h < 300) {
/* 230 */                           z = true;
                                }
/* 233 */                       HashMap map3 = new HashMap();
/* 250 */                       map3.put("count", Integer.valueOf(((C1969nm) c0168b6.f2213d).m7006i()));
/* 261 */                       map3.put("fromCache", Boolean.valueOf(!z));
/* 270 */                       ((wc0) c0168b6.f2214e).m9527D("receivedUnreadMessageCount", map3);
/* 282 */                       return;
                            } catch (Exception e4) {
/* 279 */                       xe2.m9777o("rqUnrdCntHdlr", "Error in fetching unread count from remote", e4);
/* 282 */                       return;
                            }
                        case io.flutter.Build.API_LEVELS.API_22 /* 22 */:
                            try {
/* 191 */                       m10146a();
/* 194 */                       return;
                            } catch (Error e5) {
                                synchronized (((y92) this.f19586b).f19544a) {
/* 207 */                           ((y92) this.f19586b).f19547d = 1;
/* 210 */                           throw e5;
                                }
                            }
                        case io.flutter.Build.API_LEVELS.API_23 /* 23 */:
/* 187 */                   ((StaggeredGridLayoutManager) this.f19586b).m902L0();
/* 190 */                   return;
                        case 24:
/* 179 */                   ((Toolbar) this.f19586b).m415u();
/* 182 */                   return;
                        case io.flutter.Build.API_LEVELS.API_25 /* 25 */:
/* 120 */                   xp2 xp2Var = (xp2) this.f19586b;
/* 122 */                   Window.Callback callback = xp2Var.f19303b;
/* 124 */                   Menu menuM10013v = xp2Var.m10013v();
/* 136 */                   jg1 jg1Var = menuM10013v instanceof jg1 ? (jg1) menuM10013v : null;
/* 137 */                   if (jg1Var != null) {
/* 139 */                       jg1Var.m5817y();
                            }
                            try {
/* 142 */                       menuM10013v.clear();
/* 149 */                       if (!callback.onCreatePanelMenu(0, menuM10013v) || !callback.onPreparePanel(0, null, menuM10013v)) {
/* 160 */                           menuM10013v.clear();
                                }
/* 163 */                       if (jg1Var != null) {
/* 168 */                           return;
                                } else {
/* 168 */                           return;
                                }
                            } finally {
/* 169 */                       if (jg1Var != null) {
/* 171 */                           jg1Var.m5816x();
                                }
                            }
                            break;
                        case io.flutter.Build.API_LEVELS.API_26 /* 26 */:
/* 61 */                    C1969nm c1969nm2 = (C1969nm) this.f19586b;
/* 67 */                    ((C1773iy) c1969nm2.f14377e).m5613h();
/* 74 */                    if (c1969nm2.m7013p()) {
/* 81 */                        String strM3584m = ((er0) c1969nm2.f14373a).m3584m();
/* 89 */                        if (b40.m1232p(strM3584m)) {
/* 95 */                            ((C0210cb) c1969nm2.f14376d).m1576K();
/* 117 */                           return;
                                } else {
/* 114 */                           ((qi1) c1969nm2.f14375c).m7862i(strM3584m, c1969nm2.m7002e(), false, new er0(c1969nm2, 22));
/* 117 */                           return;
                                }
                            }
/* 117 */                   return;
                        case io.flutter.Build.API_LEVELS.API_27 /* 27 */:
/* 55 */                    ((j33) this.f19586b).m5686r(0);
/* 58 */                    return;
                        case io.flutter.Build.API_LEVELS.API_28 /* 28 */:
/* 42 */                    ViewPager viewPager = (ViewPager) this.f19586b;
/* 44 */                    viewPager.setScrollState(0);
/* 47 */                    viewPager.m1134p();
/* 50 */                    return;
                        default:
/* 22 */                    View view = (View) this.f19586b;
/* 36 */                    ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
/* 39 */                    return;
                    }
                }
            }
