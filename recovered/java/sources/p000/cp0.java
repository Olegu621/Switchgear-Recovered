            package p000;

            import android.R;
            import android.app.Activity;
            import android.app.AlertDialog;
            import android.app.NotificationManager;
            import android.app.PendingIntent;
            import android.content.Context;
            import android.content.DialogInterface;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.content.SharedPreferences;
            import android.graphics.Typeface;
            import android.location.Location;
            import android.os.Bundle;
            import android.webkit.WebView;
            import android.widget.AutoCompleteTextView;
            import android.widget.EditText;
            import android.widget.ProgressBar;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.common.api.GoogleApiActivity;
            import com.google.android.gms.common.api.internal.zabx;
            import com.google.android.gms.internal.base.zao;
            import com.google.android.gms.internal.measurement.zzbq;
            import com.google.android.gms.internal.measurement.zzcu;
            import com.google.android.gms.internal.play_billing.zze;
            import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
            import com.google.android.gms.measurement.internal.zzah;
            import com.google.android.gms.measurement.internal.zzjc;
            import com.google.android.gms.measurement.internal.zzog;
            import com.google.android.gms.measurement.internal.zzpk;
            import com.google.android.gms.measurement.internal.zzr;
            import com.helpshift.activities.HSMainActivity;
            import com.supercell.titan.C0801h;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.HelpshiftTitan;
            import com.supercell.titan.KeyboardDialog;
            import com.supercell.titan.LocationService;
            import com.supercell.titan.ScExternalWebView;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.ref.WeakReference;
            import java.lang.reflect.Method;
            import java.util.HashMap;
            import java.util.Objects;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Future;
            import kotlin.Unit;
            import kotlin.coroutines.C1846g;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import org.json.JSONArray;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public final class cp0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f6867a;

                /* JADX INFO: renamed from: b */
                public Object f6868b;

                /* JADX INFO: renamed from: c */
                public final Object f6869c;

                public cp0(zzjc zzjcVar, zzah zzahVar) {
/* 3 */             this.f6867a = 27;
/* 8 */             this.f6868b = zzahVar;
/* 10 */            Objects.requireNonNull(zzjcVar);
/* 13 */            this.f6869c = zzjcVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
                /* JADX WARN: Type inference failed for: r6v3, types: [int] */
                @Override // java.lang.Runnable
                public final void run() {
/* 7 */             int i = 22;
/* 9 */             int i2 = 16;
/* 12 */            int i3 = 0;
                    switch (this.f6867a) {
                        case 0:
/* 1617 */                  we2 we2Var = (we2) this.f6869c;
                            try {
/* 1623 */                      k50.m5982s((s81) this.f6868b);
/* 1628 */                      sl3 sl3Var = (sl3) we2Var.f18595b;
/* 1630 */                      sl3Var.mo1375y();
/* 1633 */                      we2Var.m9568s();
/* 1636 */                      sl3Var.f16696w = false;
/* 1638 */                      sl3Var.f16676U = 1;
/* 1644 */                      uh3 uh3Var = ((ij3) sl3Var.f16749a).f9655f;
/* 1646 */                      ij3.m4555l(uh3Var);
/* 1659 */                      uh3Var.f17533X.m8511b(((zzog) we2Var.f18596c).f4215a, "Successfully registered trigger URI");
/* 1662 */                      sl3Var.m8573X();
/* 1681 */                      return;
                            } catch (Error e) {
/* 1666 */                      e = e;
/* 1669 */                      we2Var.onFailure(e);
/* 1681 */                      return;
                            } catch (RuntimeException e2) {
/* 1668 */                      e = e2;
/* 1669 */                      we2Var.onFailure(e);
/* 1681 */                      return;
                            } catch (ExecutionException e3) {
/* 1678 */                      we2Var.onFailure(e3.getCause());
/* 1681 */                      return;
                            }
                        case 1:
/* 1367 */                  if (((ya3) this.f6869c).f19556a) {
/* 1375 */                      ConnectionResult connectionResult = ((dc3) this.f6868b).f7118b;
/* 1387 */                      Object[] objArr = (connectionResult.f3416b == 0 || connectionResult.f3417c == null) ? false : true;
/* 1390 */                      ya3 ya3Var = (ya3) this.f6869c;
/* 1392 */                      if (objArr == true) {
/* 1394 */                          e71 e71Var = ya3Var.mLifecycleFragment;
/* 1396 */                          Activity activity = ya3Var.getActivity();
/* 1400 */                          PendingIntent pendingIntent = connectionResult.f3417c;
/* 1402 */                          kb1.m6061n(pendingIntent);
/* 1409 */                          int i4 = ((dc3) this.f6868b).f7117a;
/* 1411 */                          int i5 = GoogleApiActivity.f3436b;
/* 1417 */                          Intent intent = new Intent(activity, (Class<?>) GoogleApiActivity.class);
/* 1422 */                          intent.putExtra("pending_intent", pendingIntent);
/* 1427 */                          intent.putExtra("failing_client_id", i4);
/* 1432 */                          intent.putExtra("notify_manager", false);
/* 1435 */                          e71Var.startActivityForResult(intent, 1);
/* 1613 */                          return;
                                }
/* 1452 */                      if (ya3Var.f19559d.m8003a(ya3Var.getActivity(), null, connectionResult.f3416b) != null) {
/* 1456 */                          ya3 ya3Var2 = (ya3) this.f6869c;
/* 1472 */                          ya3Var2.f19559d.m7544h(ya3Var2.getActivity(), ya3Var2.mLifecycleFragment, connectionResult.f3416b, (ya3) this.f6869c);
/* 1613 */                          return;
                                }
/* 1477 */                      int i6 = connectionResult.f3416b;
/* 1481 */                      ya3 ya3Var3 = (ya3) this.f6869c;
/* 1485 */                      if (i6 != 18) {
/* 1601 */                          int i7 = ((dc3) this.f6868b).f7117a;
/* 1605 */                          ya3Var3.f19557b.set(null);
/* 1610 */                          ya3Var3.f19561f.m9131i(connectionResult, i7);
/* 1613 */                          return;
                                }
/* 1487 */                      pr0 pr0Var = ya3Var3.f19559d;
/* 1489 */                      Activity activity2 = ya3Var3.getActivity();
/* 1493 */                      pr0Var.getClass();
/* 1501 */                      ProgressBar progressBar = new ProgressBar(activity2, null, R.attr.progressBarStyleLarge);
/* 1504 */                      progressBar.setIndeterminate(true);
/* 1507 */                      progressBar.setVisibility(0);
/* 1512 */                      AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
/* 1515 */                      builder.setView(progressBar);
/* 1522 */                      builder.setMessage(hb3.m4159b(activity2, 18));
/* 1527 */                      builder.setPositiveButton(HttpUrl.FRAGMENT_ENCODE_SET, (DialogInterface.OnClickListener) null);
/* 1530 */                      AlertDialog alertDialogCreate = builder.create();
/* 1536 */                      pr0.m7540f(activity2, alertDialogCreate, "GooglePlayServicesUpdatingDialog", ya3Var3);
/* 1541 */                      ya3 ya3Var4 = (ya3) this.f6869c;
/* 1547 */                      Context applicationContext = ya3Var4.getActivity().getApplicationContext();
/* 1553 */                      ec3 ec3Var = new ec3(this, alertDialogCreate);
/* 1558 */                      ya3Var4.f19559d.getClass();
/* 1565 */                      IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
/* 1570 */                      intentFilter.addDataScheme("package");
/* 1575 */                      zabx zabxVar = new zabx(ec3Var);
/* 1578 */                      zao.zaa(applicationContext, zabxVar, intentFilter);
/* 1581 */                      zabxVar.m2009a(applicationContext);
/* 1588 */                      if (wr0.m9607b(applicationContext)) {
/* 1613 */                          return;
                                }
/* 1590 */                      ec3Var.mo3408a();
/* 1593 */                      zabxVar.m2010b();
/* 1613 */                      return;
                            }
/* 1613 */                  return;
                        case 2:
/* 1358 */                  ((C0005a3) this.f6868b).f61a = this.f6869c;
/* 1360 */                  return;
                        case 3:
/* 1281 */                  Object obj = this.f6869c;
/* 1283 */                  Object obj2 = this.f6868b;
                            try {
/* 1285 */                      Method method = AbstractC0166b3.f2188d;
/* 1287 */                      if (method != null) {
/* 1297 */                          method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                                } else {
/* 1309 */                          AbstractC0166b3.f2189e.invoke(obj2, obj, Boolean.FALSE);
                                }
/* 1351 */                      return;
                            } catch (RuntimeException e4) {
/* 1329 */                      if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
/* 1350 */                          throw e4;
                                }
/* 1351 */                      return;
                            } catch (Throwable th) {
/* 1318 */                      AbstractC1245n0.m4877e("ActivityRecreator", "Exception while invoking performStopActivity", th);
/* 1351 */                      return;
                            }
                        case 4:
/* 1265 */                  ts0 ts0Var = (ts0) this.f6868b;
/* 1269 */                  Typeface typeface = (Typeface) this.f6869c;
/* 1273 */                  de3 de3Var = (de3) ts0Var.f17248a;
/* 1275 */                  if (de3Var != null) {
/* 1277 */                      de3Var.mo1401B(typeface);
/* 1280 */                      return;
                            }
/* 1280 */                  return;
                        case 5:
/* 1244 */                  EditText editText = (EditText) this.f6868b;
/* 1252 */                  C2121qv c2121qv = (C2121qv) ((C1978nv) this.f6869c).f14463b;
/* 1256 */                  editText.removeTextChangedListener(c2121qv.f15764e);
/* 1259 */                  c2121qv.m8019e(true);
/* 1262 */                  return;
                        case 6:
/* 1238 */                  ((AutoCompleteTextView) this.f6868b).removeTextChangedListener(((za0) ((C1978nv) this.f6869c).f14463b).f20019e);
/* 1241 */                  return;
                        case 7:
                            try {
/* 1211 */                      xy1.m10036a((xy1) this.f6869c, (JSONArray) this.f6868b, false);
/* 1223 */                      return;
                            } catch (gt0 e5) {
/* 1220 */                      xe2.m9777o("analyticsMngr", "Failed to send quit event", e5);
/* 1223 */                      return;
                            }
                        case 8:
/* 1189 */                  ls0 ls0Var = (ls0) ((WeakReference) ((eq2) this.f6869c).f7838i).get();
/* 1191 */                  if (ls0Var != null) {
/* 1199 */                      ls0Var.f13480e.addView((WebView) this.f6868b);
/* 1202 */                      return;
                            }
/* 1202 */                  return;
                        case 9:
/* 1156 */                  xs0 xs0Var = (xs0) ((WeakReference) ((ra2) this.f6869c).f15955a).get();
/* 1158 */                  if (xs0Var != null) {
                                try {
/* 1164 */                          xs0Var.startActivity((Intent) this.f6868b);
/* 1176 */                          return;
                                } catch (Exception e6) {
/* 1173 */                          xe2.m9777o("HelpCenter", "Unable to resolve the activity for this intent", e6);
/* 1176 */                          return;
                                }
                            }
/* 1176 */                  return;
                        case 10:
/* 1140 */                  C0168b5.m1243f((C0168b5) this.f6869c, (String) this.f6868b, HSMainActivity.class);
/* 1143 */                  return;
                        case 11:
/* 1126 */                  ((C0890er) this.f6868b).m3553E((kt0) this.f6869c, Unit.f12910a);
/* 1129 */                  return;
                        case 12:
/* 849 */                   C1969nm c1969nm = ((rs0) this.f6868b).f16261f;
/* 853 */                   er0 er0Var = (er0) c1969nm.f14373a;
/* 857 */                   er0 er0Var2 = (er0) c1969nm.f14373a;
/* 875 */                   if (((SharedPreferences) ((er0) er0Var.f7853b).f7853b).getBoolean("clear_anonymous_user", false)) {
/* 883 */                       ((er0) er0Var2.f7853b).m3596z("anon_user_id_map");
/* 888 */                       er0Var2.m3595y("anon_user_data", "{}");
/* 891 */                       c1969nm.m7000b();
                            }
/* 896 */                   HashMap map = (HashMap) this.f6869c;
/* 902 */                   if (b40.m1233q(map)) {
/* 908 */                       xe2.m9777o("UsrMngr", "Empty data for user login", null);
/* 1115 */                      return;
                            }
/* 921 */                   HashMap mapM1239w = b40.m1239w(((er0) er0Var2.f7853b).m3589r("active_user"));
/* 929 */                   if (b40.m1233q(mapM1239w) || !mapM1239w.equals(map)) {
/* 943 */                       if (b40.m1233q(mapM1239w)) {
/* 945 */                           mapM1239w = c1969nm.m7003f();
                                }
/* 953 */                       ((C0210cb) c1969nm.f14376d).m1577L();
/* 960 */                       if (c1969nm.m7010m()) {
/* 977 */                           ((qi1) c1969nm.f14375c).m7862i("unreg", c1969nm.m7007j(mapM1239w), true, new er0(c1969nm, i));
                                }
/* 984 */                       ((er0) er0Var2.f7853b).m3596z("active_user");
/* 989 */                       er0Var2.m3595y("active_user_data", "{}");
/* 997 */                       er0Var2.m3578A(new JSONArray());
/* 1006 */                      Context context = (Context) ((C0168b5) c1969nm.f14379g).f2211b;
/* 1012 */                      xe2.m9775m("AppUtil", "Cancelling notification", null);
/* 1015 */                      NotificationManager notificationManagerM1230n = b40.m1230n(context);
/* 1019 */                      if (notificationManagerM1230n != null) {
/* 1025 */                          notificationManagerM1230n.cancel("hsft_notification_tag", 121);
                                }
/* 1037 */                      er0Var2.m3595y("active_user", new JSONObject(map).toString());
/* 1048 */                      if (((WeakReference) c1969nm.f14380h).get() != null) {
/* 1058 */                          ls0 ls0Var2 = (ls0) ((WeakReference) c1969nm.f14380h).get();
/* 1060 */                          ls0Var2.getClass();
/* 1094 */                          ls0Var2.m6529g("window.helpshiftConfig = JSON.parse(JSON.stringify(" + rs0.f16254y.f16260e.m5618m(false).toString() + "));Helpshift('updateHelpshiftConfig')", null);
                                }
/* 1112 */                      ((fs0) ((ra2) c1969nm.f14378f).f15955a).m3826w(new RunnableC2495ye(c1969nm, 26));
/* 1115 */                      return;
                            }
/* 1115 */                  return;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 715 */                   C1969nm c1969nm2 = ((rs0) this.f6868b).f16261f;
/* 719 */                   String str = (String) this.f6869c;
/* 723 */                   er0 er0Var3 = (er0) c1969nm2.f14373a;
/* 725 */                   String strM3584m = er0Var3.m3584m();
/* 733 */                   if (!b40.m1232p(strM3584m) && strM3584m.equals(str) && c1969nm2.m7010m()) {
/* 844 */                       return;
                            }
/* 755 */                   boolean z = b40.m1234r(str) && !str.equals(er0Var3.m3584m());
/* 775 */                   ((er0) ((qi1) c1969nm2.f14375c).f15572a).m3595y("current_push_token", str);
/* 782 */                   c1969nm2.m7011n(Boolean.FALSE, "push_token_synced");
/* 797 */                   HashMap mapM1239w2 = b40.m1239w(((er0) ((er0) c1969nm2.f14373a).f7853b).m3589r("active_user"));
/* 805 */                   if (b40.m1233q(mapM1239w2)) {
/* 807 */                       mapM1239w2 = c1969nm2.m7003f();
                            }
/* 815 */                   if (!b40.m1233q(mapM1239w2) && z && c1969nm2.m7013p()) {
/* 841 */                       ((fs0) ((ra2) c1969nm2.f14378f).f15955a).m3826w(new cp0(c1969nm2, str, 20, i3));
/* 844 */                       return;
                            }
/* 844 */                   return;
                        case 14:
                            try {
/* 684 */                       HelpshiftTitan.f5803j = true;
/* 698 */                       hu0.m4308C0(GameApp.getInstance(), (String) this.f6868b, (HashMap) this.f6869c);
/* 710 */                       return;
                            } catch (Exception e7) {
/* 707 */                       AbstractC1245n0.m4877e("HelpshiftTitan", "HelpshiftTitan.showSingleFAQ", e7);
/* 710 */                       return;
                            }
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 680 */                   ((KeyboardDialog) ((dp0) this.f6869c).f7359c).f5816d.setTypeface((Typeface) this.f6868b);
/* 683 */                   return;
                        case 16:
/* 626 */                   m71 m71Var = (m71) this.f6869c;
/* 628 */                   s10 s10Var = m71Var.f13642c;
                            while (true) {
                                try {
/* 634 */                           ((Runnable) this.f6868b).run();
                                } catch (Throwable th2) {
/* 641 */                           b40.m1231o(th2, C1846g.f12919a);
                                }
/* 644 */                       Runnable runnableM6615l = m71Var.m6615l();
/* 648 */                       if (runnableM6615l == null) {
/* 665 */                           return;
                                }
/* 651 */                       this.f6868b = runnableM6615l;
/* 653 */                       i3++;
/* 654 */                       if (i3 >= 16 && s10Var.mo6281i()) {
/* 662 */                           s10Var.mo1539g(m71Var, this);
/* 665 */                           return;
                                }
                                break;
                            }
                            break;
                        case 17:
/* 604 */                   long j = ((LocationService) this.f6869c).f5824d;
/* 608 */                   Location location = (Location) this.f6868b;
/* 619 */                   LocationService.locationChanged(j, location.getLatitude(), location.getLongitude());
/* 622 */                   return;
                        case 18:
/* 596 */                   ((ac0) this.f6868b).accept(this.f6869c);
/* 599 */                   return;
                        case 19:
/* 536 */                   AbstractC1245n0.m4889q("ScExternalWebView", "ScExternalWebView timeout after " + ((ScExternalWebView) this.f6869c).f5898g + "ms");
/* 553 */                   GameApp.getInstance().runOnView(new ji1(7, this, (String) this.f6868b));
                            try {
/* 563 */                       GameApp.getInstance().finishActivity(41036);
/* 589 */                       return;
                            } catch (Exception e8) {
/* 586 */                       AbstractC1245n0.m4889q("ScExternalWebView", "Could not close Custom Tab on timeout: " + e8.getMessage());
/* 589 */                       return;
                            }
                        case 20:
/* 473 */                   C1969nm c1969nm3 = (C1969nm) this.f6869c;
/* 479 */                   ((C1773iy) c1969nm3.f14377e).m5613h();
/* 486 */                   if (c1969nm3.m7013p()) {
/* 505 */                       ((qi1) c1969nm3.f14375c).m7862i((String) this.f6868b, c1969nm3.m7002e(), false, new er0(c1969nm3, i));
/* 508 */                       return;
                            }
/* 508 */                   return;
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 448 */                   v81 v81Var = (v81) this.f6868b;
/* 452 */                   u81 u81Var = (u81) this.f6869c;
/* 454 */                   Object obj3 = v81Var.f17915b;
/* 456 */                   if (obj3 == null) {
/* 458 */                       u81Var.onNotifyListenerFailed();
/* 465 */                       return;
                            }
                            try {
/* 462 */                       u81Var.notifyListener(obj3);
/* 465 */                       return;
                            } catch (RuntimeException e9) {
/* 467 */                       u81Var.onNotifyListenerFailed();
/* 470 */                       throw e9;
                            }
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 427 */                   C0882ej c0882ej = (C0882ej) this.f6868b;
/* 431 */                   C0801h c0801h = (C0801h) this.f6869c;
/* 433 */                   C1833kj c1833kj = kf3.f12733k;
/* 439 */                   c0882ej.m3470x(24, 8, c1833kj);
/* 442 */                   c0801h.m2754a(c1833kj, null);
/* 445 */                   return;
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 391 */                   Future future = (Future) this.f6868b;
/* 397 */                   if (future.isDone() || future.isCancelled()) {
/* 424 */                       return;
                            }
/* 407 */                   Runnable runnable = (Runnable) this.f6869c;
/* 409 */                   future.cancel(true);
/* 416 */                   zze.zzl("BillingClient", "Async task is taking too long, cancel it!");
/* 419 */                   if (runnable != null) {
/* 421 */                       runnable.run();
/* 424 */                       return;
                            }
/* 424 */                   return;
                        case 24:
/* 349 */                   jk3 jk3Var = (jk3) this.f6868b;
/* 351 */                   jk3Var.mo4559c();
/* 358 */                   if (q62.m7734g()) {
/* 364 */                       jk3Var.mo4558b().m1370I(this);
/* 388 */                       return;
                            }
/* 370 */                   be3 be3Var = (be3) this.f6869c;
/* 378 */                   Object[] objArr2 = be3Var.f2395c != 0 ? 1 : 0;
/* 381 */                   be3Var.f2395c = 0L;
/* 383 */                   if (objArr2 != 0) {
/* 385 */                       be3Var.mo1347a();
/* 388 */                       return;
                            }
/* 388 */                   return;
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 265 */                   mi3 mi3Var = (mi3) this.f6869c;
/* 269 */                   ij3 ij3Var = mi3Var.f13797b.f14773b;
/* 271 */                   bj3 bj3Var = ij3Var.f9659i;
/* 273 */                   ij3.m4555l(bj3Var);
/* 276 */                   bj3Var.mo1375y();
/* 281 */                   Bundle bundle = new Bundle();
/* 288 */                   bundle.putString("package_name", mi3Var.f13796a);
                            try {
/* 299 */                       if (((zzbq) this.f6868b).zze(bundle) == null) {
/* 301 */                           uh3 uh3Var2 = ij3Var.f9655f;
/* 303 */                           ij3.m4555l(uh3Var2);
/* 310 */                           uh3Var2.f17538f.m8510a("Install Referrer Service returned a null response");
                                }
                                break;
                            } catch (Exception e10) {
/* 315 */                       uh3 uh3Var3 = ij3Var.f9655f;
/* 317 */                       ij3.m4555l(uh3Var3);
/* 328 */                       uh3Var3.f17538f.m8511b(e10.getMessage(), "Exception occurred while retrieving the Install Referrer");
                            }
/* 331 */                   bj3 bj3Var2 = ij3Var.f9659i;
/* 333 */                   ij3.m4555l(bj3Var2);
/* 336 */                   bj3Var2.mo1375y();
/* 346 */                   throw new IllegalStateException("Unexpected call on client side");
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 236 */                   pn3 pn3VarM4567o = ((AppMeasurementDynamiteService) this.f6869c).f4190a.m4567o();
/* 242 */                   zzcu zzcuVar = (zzcu) this.f6868b;
/* 244 */                   pn3VarM4567o.mo1375y();
/* 247 */                   pn3VarM4567o.m9576A();
/* 259 */                   pn3VarM4567o.m7518N(new js0(i2, pn3VarM4567o, pn3VarM4567o.m7520P(false), zzcuVar));
/* 262 */                   return;
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 173 */                   zzjc zzjcVar = (zzjc) this.f6869c;
/* 177 */                   zzjcVar.f4212a.m6731A();
/* 182 */                   zzah zzahVar = (zzah) this.f6868b;
/* 186 */                   Object objM2197D1 = zzahVar.f4199c.m2197D1();
/* 190 */                   mp3 mp3Var = zzjcVar.f4212a;
/* 192 */                   if (objM2197D1 == null) {
/* 194 */                       mp3Var.getClass();
/* 197 */                       String str2 = zzahVar.f4197a;
/* 199 */                       kb1.m6061n(str2);
/* 202 */                       zzr zzrVarM6742O = mp3Var.m6742O(str2);
/* 206 */                       if (zzrVarM6742O != null) {
/* 208 */                           mp3Var.m6748Y(zzahVar, zzrVarM6742O);
/* 229 */                           return;
                                }
/* 229 */                       return;
                            }
/* 212 */                   mp3Var.getClass();
/* 215 */                   String str3 = zzahVar.f4197a;
/* 217 */                   kb1.m6061n(str3);
/* 220 */                   zzr zzrVarM6742O2 = mp3Var.m6742O(str3);
/* 224 */                   if (zzrVarM6742O2 != null) {
/* 226 */                       mp3Var.m6747X(zzahVar, zzrVarM6742O2);
/* 229 */                       return;
                            }
/* 229 */                   return;
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 35 */                    sl3 sl3Var2 = (sl3) this.f6869c;
/* 37 */                    sl3Var2.mo1375y();
/* 40 */                    sl3Var2.m9576A();
/* 45 */                    Bundle bundle2 = (Bundle) this.f6868b;
/* 49 */                    String string = bundle2.getString("name");
/* 53 */                    kb1.m6058k(string);
/* 58 */                    ij3 ij3Var2 = (ij3) sl3Var2.f16749a;
/* 64 */                    if (!ij3Var2.m4560d()) {
/* 66 */                        uh3 uh3Var4 = ij3Var2.f9655f;
/* 68 */                        ij3.m4555l(uh3Var4);
/* 75 */                        uh3Var4.f17534Y.m8510a("Conditional property not cleared since app measurement is disabled");
/* 170 */                       return;
                            } else {
/* 86 */                        zzpk zzpkVar = new zzpk(0L, null, string, HttpUrl.FRAGMENT_ENCODE_SET);
                                try {
/* 89 */                            up3 up3Var = ij3Var2.f9668w;
/* 91 */                            ij3.m4553j(up3Var);
/* 94 */                            bundle2.getString("app_id");
/* 167 */                           ij3Var2.m4567o().m7523S(new zzah(bundle2.getString("app_id"), HttpUrl.FRAGMENT_ENCODE_SET, zzpkVar, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), up3Var.m9100b0(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), HttpUrl.FRAGMENT_ENCODE_SET, bundle2.getLong("creation_timestamp"), true)));
/* 170 */                           return;
                                } catch (IllegalArgumentException unused) {
/* 170 */                           return;
                                }
                            }
                        default:
/* 25 */                    ((sl3) this.f6869c).m8565P((Boolean) this.f6868b, true);
/* 28 */                    return;
                    }
                }

                public String toString() {
                    switch (this.f6867a) {
                        case 0:
/* 19 */                    ac1 ac1Var = new ac1(cp0.class.getSimpleName());
/* 24 */                    we2 we2Var = (we2) this.f6869c;
/* 31 */                    wc0 wc0Var = new wc0(20, false);
/* 38 */                    ((wc0) ac1Var.f179d).f18578c = wc0Var;
/* 40 */                    ac1Var.f179d = wc0Var;
/* 42 */                    wc0Var.f18577b = we2Var;
/* 44 */                    return ac1Var.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 15 */        public /* synthetic */ cp0(Object obj, Object obj2, int i, boolean z) {
/* 16 */            this.f6867a = i;
                    this.f6869c = obj;
                    this.f6868b = obj2;
                }

/* 16 */        public /* synthetic */ cp0(int i, Object obj, Object obj2) {
/* 17 */            this.f6867a = i;
                    this.f6868b = obj;
                    this.f6869c = obj2;
                }

/* 17 */        public cp0(mi3 mi3Var, zzbq zzbqVar, mi3 mi3Var2) {
                    this.f6867a = 25;
                    this.f6868b = zzbqVar;
                    this.f6869c = mi3Var;
                }
            }
