            package p000;

            import android.app.Activity;
            import android.bluetooth.BluetoothManager;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.location.LocationManager;
            import android.net.Uri;
            import android.os.Build;
            import android.provider.Settings;
            import android.telephony.TelephonyManager;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ti1 implements MethodChannel.MethodCallHandler {

                /* JADX INFO: renamed from: a */
                public final Context f17113a;

                /* JADX INFO: renamed from: b */
                public final vr1 f17114b;

                public ti1(Context context, dc0 dc0Var, vr1 vr1Var, q62 q62Var) {
/* 4 */             this.f17113a = context;
/* 6 */             this.f17114b = vr1Var;
                }

                /* JADX WARN: Code duplicated, block: B:164:0x0338  */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1, types: [int] */
                /* JADX WARN: Type inference failed for: r5v2 */
                /* JADX WARN: Type inference failed for: r5v6 */
                @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 12 */            ?? IsLocationEnabled = 1;
/* 22 */            String str = methodCall.method;
/* 24 */            str.getClass();
/* 32 */            byte b = -1;
                    switch (str.hashCode()) {
                        case -1544053025:
/* 87 */                    if (str.equals("checkServiceStatus")) {
/* 90 */                        b = 0;
                            }
                            break;
                        case -1017315255:
/* 76 */                    if (str.equals("shouldShowRequestPermissionRationale")) {
/* 79 */                        b = 1;
                            }
                            break;
                        case -576207927:
/* 65 */                    if (str.equals("checkPermissionStatus")) {
/* 68 */                        b = 2;
                            }
                            break;
                        case 347240634:
/* 54 */                    if (str.equals("openAppSettings")) {
/* 57 */                        b = 3;
                            }
                            break;
                        case 1669188213:
/* 43 */                    if (str.equals("requestPermissions")) {
/* 46 */                        b = 4;
                            }
                            break;
                    }
/* 93 */            Context context = this.f17113a;
/* 103 */           vr1 vr1Var = this.f17114b;
                    switch (b) {
                        case 0:
/* 643 */                   int i = Integer.parseInt(methodCall.arguments.toString());
/* 647 */                   Objects.requireNonNull(result);
/* 650 */                   if (context == null) {
/* 654 */                       result.error("PermissionHandler.ServiceManager", "Android context cannot be null.", null);
                            } else if (i == 3 || i == 4 || i == 5) {
/* 813 */                       if (Build.VERSION.SDK_INT >= 28) {
/* 821 */                           LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
/* 823 */                           if (locationManager == null) {
/* 825 */                               IsLocationEnabled = 0;
                                    } else {
/* 1 */                                 IsLocationEnabled = locationManager.isLocationEnabled();
                                    }
                                } else {
                                    try {
/* 842 */                               if (Settings.Secure.getInt(context.getContentResolver(), "location_mode") == 0) {
/* 825 */                                   IsLocationEnabled = 0;
                                        }
                                    } catch (Settings.SettingNotFoundException e) {
/* 846 */                               e.printStackTrace();
                                    }
                                }
/* 854 */                       result.success(Integer.valueOf((int) IsLocationEnabled));
                            } else if (i == 21) {
/* 693 */                       result.success(Integer.valueOf(((BluetoothManager) context.getSystemService("bluetooth")).getAdapter().isEnabled() ? 1 : 0));
                            } else if (i == 8) {
/* 702 */                       PackageManager packageManager = context.getPackageManager();
/* 712 */                       if (packageManager.hasSystemFeature("android.hardware.telephony")) {
/* 725 */                           TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
/* 727 */                           if (telephonyManager == null || telephonyManager.getPhoneType() == 0) {
/* 795 */                               result.success(2);
                                    } else {
/* 740 */                               Intent intent = new Intent("android.intent.action.CALL");
/* 749 */                               intent.setData(Uri.parse("tel:123123"));
/* 775 */                               if ((Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(intent, 0)).isEmpty()) {
/* 777 */                                   result.success(2);
                                        } else if (telephonyManager.getSimState() != 5) {
/* 787 */                                   result.success(0);
                                        } else {
/* 791 */                                   result.success(1);
                                        }
                                    }
                                } else {
/* 714 */                           result.success(2);
                                }
                            } else if (i == 16) {
/* 801 */                       result.success(1);
                            } else {
/* 805 */                       result.success(2);
                            }
                            break;
                        case 1:
/* 578 */                   int i2 = Integer.parseInt(methodCall.arguments.toString());
/* 582 */                   Objects.requireNonNull(result);
/* 585 */                   Activity activity = vr1Var.f18328c;
/* 587 */                   if (activity == null) {
/* 589 */                       result.error("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.", null);
                            } else {
/* 593 */                       ArrayList arrayListM9447q = w11.m9447q(activity, i2);
/* 597 */                       if (arrayListM9447q == null) {
/* 601 */                           result.success(Boolean.FALSE);
                                } else if (arrayListM9447q.isEmpty()) {
/* 613 */                           result.success(Boolean.FALSE);
                                } else {
/* 633 */                           result.success(Boolean.valueOf(AbstractC2353x2.m9684b(vr1Var.f18328c, (String) arrayListM9447q.get(0))));
                                }
                            }
                            break;
                        case 2:
/* 553 */                   int i3 = Integer.parseInt(methodCall.arguments.toString());
/* 557 */                   Objects.requireNonNull(result);
/* 568 */                   result.success(Integer.valueOf(vr1Var.m9337a(i3)));
                            break;
                        case 3:
/* 463 */                   Objects.requireNonNull(result);
/* 468 */                   if (context == null) {
/* 472 */                       result.error("PermissionHandler.AppSettingsManager", "Android context cannot be null.", null);
                            } else {
                                try {
/* 479 */                           Intent intent2 = new Intent();
/* 484 */                           intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
/* 489 */                           intent2.addCategory("android.intent.category.DEFAULT");
/* 512 */                           intent2.setData(Uri.parse("package:" + context.getPackageName()));
/* 517 */                           intent2.addFlags(268435456);
/* 522 */                           intent2.addFlags(1073741824);
/* 527 */                           intent2.addFlags(8388608);
/* 530 */                           context.startActivity(intent2);
/* 535 */                           result.success(Boolean.TRUE);
                                } catch (Exception unused) {
/* 542 */                           result.success(Boolean.FALSE);
/* 857 */                           return;
                                }
                            }
                            break;
                        case 4:
/* 117 */                   List<Integer> list = (List) methodCall.arguments();
/* 119 */                   Objects.requireNonNull(result);
/* 124 */                   si1 si1Var = new si1(result);
/* 129 */                   if (vr1Var.f18329d > 0) {
/* 133 */                       result.error("PermissionHandler.PermissionManager", "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).", null);
                                break;
                            } else if (vr1Var.f18328c == null) {
/* 141 */                       result.error("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.", null);
                                break;
                            } else {
/* 145 */                       vr1Var.f18327b = si1Var;
/* 152 */                       vr1Var.f18330e = new HashMap();
/* 154 */                       vr1Var.f18329d = 0;
/* 158 */                       ArrayList arrayList = new ArrayList();
/* 171 */                       for (Integer num : list) {
/* 187 */                           if (vr1Var.m9337a(num.intValue()) != 1) {
/* 209 */                               ArrayList arrayListM9447q2 = w11.m9447q(vr1Var.f18328c, num.intValue());
/* 217 */                               if (arrayListM9447q2 == null || arrayListM9447q2.isEmpty()) {
/* 397 */                                   if (!vr1Var.f18330e.containsKey(num)) {
/* 401 */                                       vr1Var.f18330e.put(num, 0);
/* 408 */                                       if (num.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
/* 423 */                                           vr1Var.f18330e.put(num, 0);
                                                } else {
/* 416 */                                           vr1Var.f18330e.put(num, 2);
                                                }
                                            }
                                        } else if (num.intValue() == 16) {
/* 237 */                                   vr1Var.m9339c(209, "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                                        } else {
/* 241 */                                   int i4 = Build.VERSION.SDK_INT;
/* 243 */                                   if (i4 >= 30 && num.intValue() == 22) {
/* 255 */                                       vr1Var.m9339c(210, "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                                            } else if (num.intValue() == 23) {
/* 271 */                                       vr1Var.m9339c(211, "android.settings.action.MANAGE_OVERLAY_PERMISSION");
                                            } else if (i4 >= 26 && num.intValue() == 24) {
/* 289 */                                       vr1Var.m9339c(212, "android.settings.MANAGE_UNKNOWN_APP_SOURCES");
                                            } else if (num.intValue() == 27) {
/* 305 */                                       vr1Var.m9339c(213, "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
                                            } else if (i4 >= 31 && num.intValue() == 34) {
/* 326 */                                       vr1Var.m9339c(214, "android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                                            } else if (num.intValue() != 37 && num.intValue() != 0) {
/* 346 */                                       arrayList.addAll(arrayListM9447q2);
/* 356 */                                       vr1Var.f18329d = arrayListM9447q2.size() + vr1Var.f18329d;
                                            } else if (vr1Var.m9338b()) {
/* 368 */                                       arrayList.add("android.permission.WRITE_CALENDAR");
/* 373 */                                       arrayList.add("android.permission.READ_CALENDAR");
/* 380 */                                       vr1Var.f18329d += 2;
                                            } else {
/* 386 */                                       vr1Var.f18330e.put(num, 0);
                                            }
                                        }
                                    } else if (!vr1Var.f18330e.containsKey(num)) {
/* 199 */                               vr1Var.f18330e.put(num, 1);
                                    }
                                }
/* 432 */                       if (arrayList.size() > 0) {
/* 444 */                           AbstractC2353x2.m9683a(vr1Var.f18328c, (String[]) arrayList.toArray(new String[0]), 24);
                                }
/* 447 */                       si1 si1Var2 = vr1Var.f18327b;
/* 449 */                       if (si1Var2 != null && vr1Var.f18329d == 0) {
/* 459 */                           si1Var2.f16646a.success(vr1Var.f18330e);
                                    break;
                                }
                            }
                            break;
                        default:
/* 109 */                   result.notImplemented();
                            break;
                    }
                }
            }
