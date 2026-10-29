            package p000;

            import android.app.Activity;
            import android.app.AlarmManager;
            import android.app.NotificationManager;
            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Environment;
            import android.os.PowerManager;
            import android.provider.Settings;
            import androidx.core.app.NotificationCompat;
            import com.appsflyer.attribution.RequestError;
            import io.flutter.plugin.common.PluginRegistry;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.List;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vr1 implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {

                /* JADX INFO: renamed from: a */
                public final Context f18326a;

                /* JADX INFO: renamed from: b */
                public si1 f18327b;

                /* JADX INFO: renamed from: c */
                public Activity f18328c;

                /* JADX INFO: renamed from: d */
                public int f18329d;

                /* JADX INFO: renamed from: e */
                public HashMap f18330e;

                public vr1(Context context) {
/* 4 */             this.f18326a = context;
                }

                /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
                
                    if (p000.zo1.m10416a(new p000.ap1(r6).f2052a) != false) goto L8;
                 */
                /* JADX INFO: renamed from: a */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int m9337a(int i) {
                    int i2;
/* 5 */             int i3 = 1;
/* 13 */            Context context = this.f18326a;
/* 15 */            if (i == 17) {
/* 21 */                if (Build.VERSION.SDK_INT >= 33) {
/* 46 */                    if (context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
/* 51 */                        return w11.m9437k(this.f18328c, "android.permission.POST_NOTIFICATIONS");
                            }
                        }
/* 5 */                 return 1;
                    }
/* 58 */            if (i == 21) {
/* 60 */                ArrayList arrayListM9447q = w11.m9447q(context, 21);
                        return (arrayListM9447q == null || arrayListM9447q.isEmpty()) ? 0 : 1;
                    }
/* 79 */            if ((i == 30 || i == 28 || i == 29) && Build.VERSION.SDK_INT < 31) {
/* 93 */                ArrayList arrayListM9447q2 = w11.m9447q(context, 21);
                        return (arrayListM9447q2 == null || arrayListM9447q2.isEmpty()) ? 0 : 1;
                    }
/* 110 */           if ((i != 37 && i != 0) || m9338b()) {
/* 121 */               ArrayList<String> arrayListM9447q3 = w11.m9447q(context, i);
/* 125 */               if (arrayListM9447q3 != null) {
/* 135 */                   if (arrayListM9447q3.size() == 0) {
/* 137 */                       arrayListM9447q3.toString();
/* 140 */                       if (i == 22 && Build.VERSION.SDK_INT < 30) {
/* 132 */                           return 2;
                                }
                            } else if (context.getApplicationInfo().targetSdkVersion >= 23) {
/* 160 */                       HashSet hashSet = new HashSet();
/* 171 */                       for (String str : arrayListM9447q3) {
/* 181 */                           if (i == 16) {
/* 183 */                               String packageName = context.getPackageName();
/* 193 */                               PowerManager powerManager = (PowerManager) context.getSystemService("power");
/* 195 */                               if (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) {
/* 211 */                                   hashSet.add(0);
                                        } else {
/* 203 */                                   hashSet.add(1);
                                        }
                                    } else if (i == 22) {
/* 222 */                               if (Build.VERSION.SDK_INT < 30) {
/* 228 */                                   hashSet.add(2);
                                        }
/* 239 */                               hashSet.add(Integer.valueOf(Environment.isExternalStorageManager() ? 1 : 0));
                                    } else if (i == 23) {
/* 253 */                               hashSet.add(Integer.valueOf(Settings.canDrawOverlays(context) ? 1 : 0));
                                    } else if (i == 24) {
/* 265 */                               if (Build.VERSION.SDK_INT >= 26) {
/* 279 */                                   hashSet.add(Integer.valueOf(context.getPackageManager().canRequestPackageInstalls() ? 1 : 0));
                                        }
                                    } else if (i == 27) {
/* 303 */                               hashSet.add(Integer.valueOf(((NotificationManager) context.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0));
                                    } else if (i != 34) {
/* 341 */                               if (i == 9 || i == 32) {
/* 369 */                                   int iCheckSelfPermission = v00.checkSelfPermission(context, str);
/* 373 */                                   i2 = i3;
/* 387 */                                   if ((Build.VERSION.SDK_INT >= 34 ? v00.checkSelfPermission(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") : iCheckSelfPermission) == 0 && iCheckSelfPermission == -1) {
/* 397 */                                       hashSet.add(3);
                                            } else if (iCheckSelfPermission == 0) {
/* 403 */                                       hashSet.add(1);
                                            } else {
/* 417 */                                       hashSet.add(Integer.valueOf(w11.m9437k(this.f18328c, str)));
                                            }
                                        } else if (v00.checkSelfPermission(context, str) != 0) {
/* 364 */                                   hashSet.add(Integer.valueOf(w11.m9437k(this.f18328c, str)));
                                        }
/* 420 */                               i3 = i2;
                                    } else if (Build.VERSION.SDK_INT >= 31) {
/* 331 */                               hashSet.add(Integer.valueOf(((AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)).canScheduleExactAlarms() ? 1 : 0));
                                    } else {
/* 335 */                               hashSet.add(1);
                                    }
/* 214 */                           i2 = i3;
/* 420 */                           i3 = i2;
                                }
                                return !hashSet.isEmpty() ? w11.m9397G(hashSet).intValue() : i3;
                            }
                        }
/* 5 */                 return 1;
                    }
/* 12 */            return 0;
                }

                /* JADX INFO: renamed from: b */
                public final boolean m9338b() {
/* 5 */             ArrayList arrayListM9447q = w11.m9447q(this.f18326a, 37);
                    return (arrayListM9447q != null && arrayListM9447q.contains("android.permission.WRITE_CALENDAR")) && (arrayListM9447q != null && arrayListM9447q.contains("android.permission.READ_CALENDAR"));
                }

                /* JADX INFO: renamed from: c */
                public final void m9339c(int i, String str) {
/* 3 */             if (this.f18328c == null) {
/* 5 */                 return;
                    }
/* 8 */             Intent intent = new Intent(str);
/* 17 */            if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
/* 43 */                intent.setData(Uri.parse("package:" + this.f18328c.getPackageName()));
                    }
/* 48 */            this.f18328c.startActivityForResult(intent, i);
/* 55 */            this.f18329d++;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener, com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.ActivityResultListener
                public final boolean onActivityResult(int i, int i2, Intent intent) {
                    int i3;
                    int iCanScheduleExactAlarms;
/* 1 */             Activity activity = this.f18328c;
/* 3 */             boolean z = false;
/* 3 */             z = false;
/* 4 */             if (activity != null) {
/* 10 */                if (this.f18330e == null) {
/* 12 */                    this.f18329d = 0;
/* 3 */                     return false;
                        }
/* 18 */                if (i == 209) {
/* 20 */                    Context context = this.f18326a;
/* 22 */                    String packageName = context.getPackageName();
/* 32 */                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
/* 34 */                    if (powerManager != null && powerManager.isIgnoringBatteryOptimizations(packageName)) {
/* 42 */                        z = true;
                            }
/* 43 */                    i3 = 16;
                            iCanScheduleExactAlarms = z;
                        } else if (i == 210) {
/* 54 */                    if (Build.VERSION.SDK_INT >= 30) {
/* 60 */                        i3 = 22;
/* 1 */                         iCanScheduleExactAlarms = Environment.isExternalStorageManager();
                            }
                        } else if (i == 211) {
/* 71 */                    i3 = 23;
/* 67 */                    iCanScheduleExactAlarms = Settings.canDrawOverlays(activity);
                        } else if (i == 212) {
/* 82 */                    if (Build.VERSION.SDK_INT >= 26) {
/* 92 */                        i3 = 24;
/* 1 */                         iCanScheduleExactAlarms = activity.getPackageManager().canRequestPackageInstalls();
                            }
                        } else if (i == 213) {
/* 111 */                   i3 = 27;
/* 107 */                   iCanScheduleExactAlarms = ((NotificationManager) activity.getSystemService("notification")).isNotificationPolicyAccessGranted();
                        } else if (i == 214) {
/* 139 */                   i3 = 34;
/* 138 */                   iCanScheduleExactAlarms = Build.VERSION.SDK_INT >= 31 ? ((AlarmManager) activity.getSystemService(NotificationCompat.CATEGORY_ALARM)).canScheduleExactAlarms() : true;
                        }
/* 151 */               this.f18330e.put(Integer.valueOf(i3), Integer.valueOf(iCanScheduleExactAlarms));
/* 156 */               int i4 = this.f18329d - 1;
/* 157 */               this.f18329d = i4;
/* 159 */               si1 si1Var = this.f18327b;
/* 161 */               if (si1Var != null && i4 == 0) {
/* 169 */                   si1Var.f16646a.success(this.f18330e);
                        }
/* 17 */                return true;
                    }
/* 3 */             return false;
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
                public final boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
                    int i2;
/* 18 */            int i3 = 8;
/* 39 */            if (i != 24) {
/* 41 */                this.f18329d = 0;
/* 34 */                return false;
                    }
/* 46 */            if (this.f18330e == null) {
/* 34 */                return false;
                    }
/* 50 */            if (strArr.length == 0 && iArr.length == 0) {
/* 55 */                this.f18329d = 0;
/* 61 */                AbstractC1245n0.m4889q("permissions_handler", "onRequestPermissionsResult is called without results. This is probably caused by interfering request codes. If you see this error, please file an issue in flutter-permission-handler, including a list of plugins used by this application: https://github.com/Baseflow/flutter-permission-handler/issues");
/* 34 */                return false;
                    }
/* 65 */            List listAsList = Arrays.asList(strArr);
/* 71 */            int iIndexOf = listAsList.indexOf("android.permission.WRITE_CALENDAR");
/* 83 */            if (iIndexOf >= 0) {
/* 89 */                int iM9398H = w11.m9398H(this.f18328c, "android.permission.WRITE_CALENDAR", iArr[iIndexOf]);
/* 103 */               this.f18330e.put(36, Integer.valueOf(iM9398H));
/* 106 */               int iIndexOf2 = listAsList.indexOf("android.permission.READ_CALENDAR");
/* 110 */               if (iIndexOf2 >= 0) {
/* 116 */                   int iM9398H2 = w11.m9398H(this.f18328c, "android.permission.READ_CALENDAR", iArr[iIndexOf2]);
/* 120 */                   Integer numValueOf = Integer.valueOf(iM9398H);
/* 124 */                   Integer numValueOf2 = Integer.valueOf(iM9398H2);
/* 130 */                   HashSet hashSet = new HashSet();
/* 133 */                   hashSet.add(numValueOf);
/* 136 */                   hashSet.add(numValueOf2);
/* 139 */                   Integer numM9397G = w11.m9397G(hashSet);
/* 149 */                   this.f18330e.put(37, numM9397G);
/* 158 */                   this.f18330e.put(0, numM9397G);
                        }
                    }
/* 161 */           int i4 = 0;
/* 164 */           while (i4 < strArr.length) {
/* 166 */               String str = strArr[i4];
/* 172 */               if (!str.equals("android.permission.WRITE_CALENDAR") && !str.equals("android.permission.READ_CALENDAR")) {
/* 199 */                   int i5 = -1;
                            switch (str.hashCode()) {
                                case -2062386608:
/* 754 */                           if (str.equals("android.permission.READ_SMS")) {
/* 757 */                               i5 = 0;
                                    }
                                    break;
                                case -1928411001:
/* 742 */                           if (str.equals("android.permission.READ_CALENDAR")) {
/* 745 */                               i5 = 1;
                                    }
                                    break;
                                case -1925850455:
/* 732 */                           if (str.equals("android.permission.POST_NOTIFICATIONS")) {
/* 735 */                               i5 = 2;
                                    }
                                    break;
                                case -1921431796:
/* 720 */                           if (str.equals("android.permission.READ_CALL_LOG")) {
/* 723 */                               i5 = 3;
                                    }
                                    break;
                                case -1888586689:
/* 708 */                           if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
/* 711 */                               i5 = 4;
                                    }
                                    break;
                                case -1813079487:
/* 696 */                           if (str.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
/* 699 */                               i5 = 5;
                                    }
                                    break;
                                case -1783097621:
/* 684 */                           if (str.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
/* 687 */                               i5 = 6;
                                    }
                                    break;
                                case -1561629405:
/* 672 */                           if (str.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
/* 675 */                               i5 = 7;
                                    }
                                    break;
                                case -1479758289:
/* 658 */                           if (str.equals("android.permission.RECEIVE_WAP_PUSH")) {
/* 662 */                               i5 = i3;
                                    }
                                    break;
                                case -1238066820:
/* 644 */                           if (str.equals("android.permission.BODY_SENSORS")) {
/* 648 */                               i5 = 9;
                                    }
                                    break;
                                case -1164582768:
/* 630 */                           if (str.equals("android.permission.READ_PHONE_NUMBERS")) {
/* 634 */                               i5 = 10;
                                    }
                                    break;
                                case -909527021:
/* 616 */                           if (str.equals("android.permission.NEARBY_WIFI_DEVICES")) {
/* 620 */                               i5 = 11;
                                    }
                                    break;
                                case -895679497:
/* 602 */                           if (str.equals("android.permission.RECEIVE_MMS")) {
/* 606 */                               i5 = 12;
                                    }
                                    break;
                                case -895673731:
/* 588 */                           if (str.equals("android.permission.RECEIVE_SMS")) {
/* 592 */                               i5 = 13;
                                    }
                                    break;
                                case -798669607:
/* 574 */                           if (str.equals("android.permission.BLUETOOTH_CONNECT")) {
/* 578 */                               i5 = 14;
                                    }
                                    break;
                                case -406040016:
/* 560 */                           if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
/* 564 */                               i5 = 15;
                                    }
                                    break;
                                case -63024214:
/* 546 */                           if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
/* 550 */                               i5 = 16;
                                    }
                                    break;
                                case -5573545:
/* 532 */                           if (str.equals("android.permission.READ_PHONE_STATE")) {
/* 536 */                               i5 = 17;
                                    }
                                    break;
                                case 52602690:
/* 518 */                           if (str.equals("android.permission.SEND_SMS")) {
/* 522 */                               i5 = 18;
                                    }
                                    break;
                                case 112197485:
/* 504 */                           if (str.equals("android.permission.CALL_PHONE")) {
/* 508 */                               i5 = 19;
                                    }
                                    break;
                                case 175802396:
/* 490 */                           if (str.equals("android.permission.READ_MEDIA_IMAGES")) {
/* 494 */                               i5 = 20;
                                    }
                                    break;
                                case 214526995:
/* 476 */                           if (str.equals("android.permission.WRITE_CONTACTS")) {
/* 480 */                               i5 = 21;
                                    }
                                    break;
                                case 361658321:
/* 462 */                           if (str.equals("android.permission.BODY_SENSORS_BACKGROUND")) {
/* 466 */                               i5 = 22;
                                    }
                                    break;
                                case 463403621:
/* 448 */                           if (str.equals("android.permission.CAMERA")) {
/* 452 */                               i5 = 23;
                                    }
                                    break;
                                case 603653886:
/* 434 */                           if (str.equals("android.permission.WRITE_CALENDAR")) {
/* 438 */                               i5 = 24;
                                    }
                                    break;
                                case 610633091:
/* 422 */                           if (str.equals("android.permission.WRITE_CALL_LOG")) {
/* 426 */                               i5 = 25;
                                    }
                                    break;
                                case 691260818:
/* 408 */                           if (str.equals("android.permission.READ_MEDIA_AUDIO")) {
/* 412 */                               i5 = 26;
                                    }
                                    break;
                                case 710297143:
/* 394 */                           if (str.equals("android.permission.READ_MEDIA_VIDEO")) {
/* 398 */                               i5 = 27;
                                    }
                                    break;
                                case 784519842:
/* 380 */                           if (str.equals("android.permission.USE_SIP")) {
/* 384 */                               i5 = 28;
                                    }
                                    break;
                                case 970694249:
/* 366 */                           if (str.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
/* 370 */                               i5 = 29;
                                    }
                                    break;
                                case 1166454870:
/* 352 */                           if (str.equals("android.permission.BLUETOOTH_ADVERTISE")) {
/* 356 */                               i5 = 30;
                                    }
                                    break;
                                case 1271781903:
/* 338 */                           if (str.equals("android.permission.GET_ACCOUNTS")) {
/* 342 */                               i5 = 31;
                                    }
                                    break;
                                case 1365911975:
/* 324 */                           if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
/* 328 */                               i5 = 32;
                                    }
                                    break;
                                case 1777263169:
/* 310 */                           if (str.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
/* 314 */                               i5 = 33;
                                    }
                                    break;
                                case 1780337063:
/* 296 */                           if (str.equals("android.permission.ACTIVITY_RECOGNITION")) {
/* 300 */                               i5 = 34;
                                    }
                                    break;
                                case 1831139720:
/* 282 */                           if (str.equals("android.permission.RECORD_AUDIO")) {
/* 286 */                               i5 = 35;
                                    }
                                    break;
                                case 1977429404:
/* 268 */                           if (str.equals("android.permission.READ_CONTACTS")) {
/* 272 */                               i5 = 36;
                                    }
                                    break;
                                case 2024715147:
/* 254 */                           if (str.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
/* 258 */                               i5 = 37;
                                    }
                                    break;
                                case 2062356686:
/* 240 */                           if (str.equals("android.permission.BLUETOOTH_SCAN")) {
/* 244 */                               i5 = 38;
                                    }
                                    break;
                                case 2114579147:
/* 226 */                           if (str.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
/* 230 */                               i5 = 39;
                                    }
                                    break;
                                case 2133799037:
/* 212 */                           if (str.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
/* 216 */                               i5 = 40;
                                    }
                                    break;
                            }
                            switch (i5) {
                                case 0:
                                case 8:
                                case 12:
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
                                case 18:
/* 837 */                           i2 = 13;
                                    break;
                                case 1:
                                case 24:
/* 834 */                           i2 = 0;
                                    break;
                                case 2:
/* 831 */                           i2 = 17;
                                    break;
                                case 3:
                                case 10:
                                case 17:
                                case 19:
                                case io.flutter.Build.API_LEVELS.API_25 /* 25 */:
                                case io.flutter.Build.API_LEVELS.API_28 /* 28 */:
                                case RequestError.NETWORK_FAILURE /* 40 */:
/* 829 */                           i2 = i3;
                                    break;
                                case 4:
                                case 16:
/* 827 */                           i2 = 3;
                                    break;
                                case 5:
/* 824 */                           i2 = 22;
                                    break;
                                case 6:
/* 821 */                           i2 = 27;
                                    break;
                                case 7:
/* 818 */                           i2 = 23;
                                    break;
                                case 9:
/* 815 */                           i2 = 12;
                                    break;
                                case 11:
/* 812 */                           i2 = 31;
                                    break;
                                case 14:
/* 809 */                           i2 = 30;
                                    break;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                                case 32:
/* 806 */                           i2 = 15;
                                    break;
                                case 20:
/* 803 */                           i2 = 9;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_21 /* 21 */:
                                case io.flutter.Build.API_LEVELS.API_31 /* 31 */:
                                case io.flutter.Build.API_LEVELS.API_36 /* 36 */:
/* 800 */                           i2 = 2;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_22 /* 22 */:
/* 797 */                           i2 = 35;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_23 /* 23 */:
/* 794 */                           i2 = 1;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_26 /* 26 */:
/* 791 */                           i2 = 33;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_27 /* 27 */:
/* 788 */                           i2 = 32;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_29 /* 29 */:
/* 785 */                           i2 = 34;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_30 /* 30 */:
/* 782 */                           i2 = 29;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_33 /* 33 */:
/* 779 */                           i2 = 24;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_34 /* 34 */:
/* 776 */                           i2 = 19;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_35 /* 35 */:
/* 774 */                           i2 = 7;
                                    break;
                                case 37:
/* 772 */                           i2 = 4;
                                    break;
                                case 38:
/* 769 */                           i2 = 28;
                                    break;
                                case 39:
/* 765 */                           i2 = 18;
                                    break;
                                default:
/* 762 */                           i2 = 20;
                                    break;
                            }
/* 839 */                   if (i2 != 20) {
/* 843 */                       int i6 = iArr[i4];
/* 845 */                       if (i2 == i3) {
/* 853 */                           Integer num = (Integer) this.f18330e.get(8);
/* 861 */                           Integer numValueOf3 = Integer.valueOf(w11.m9398H(this.f18328c, str, i6));
/* 867 */                           HashSet hashSet2 = new HashSet();
/* 870 */                           hashSet2.add(num);
/* 873 */                           hashSet2.add(numValueOf3);
/* 882 */                           this.f18330e.put(8, w11.m9397G(hashSet2));
                                } else if (i2 == 7) {
/* 896 */                           if (!this.f18330e.containsKey(7)) {
/* 910 */                               this.f18330e.put(7, Integer.valueOf(w11.m9398H(this.f18328c, str, i6)));
                                    }
/* 919 */                           if (!this.f18330e.containsKey(14)) {
/* 933 */                               this.f18330e.put(14, Integer.valueOf(w11.m9398H(this.f18328c, str, i6)));
                                    }
                                } else if (i2 == 4) {
/* 943 */                           int iM9398H3 = w11.m9398H(this.f18328c, str, i6);
/* 953 */                           if (!this.f18330e.containsKey(4)) {
/* 961 */                               this.f18330e.put(4, Integer.valueOf(iM9398H3));
                                    }
                                } else if (i2 == 3) {
/* 970 */                           int iM9398H4 = w11.m9398H(this.f18328c, str, i6);
/* 978 */                           if (Build.VERSION.SDK_INT < 29 && !this.f18330e.containsKey(4)) {
/* 994 */                               this.f18330e.put(4, Integer.valueOf(iM9398H4));
                                    }
/* 1003 */                          if (!this.f18330e.containsKey(5)) {
/* 1011 */                              this.f18330e.put(5, Integer.valueOf(iM9398H4));
                                    }
/* 1024 */                          this.f18330e.put(Integer.valueOf(i2), Integer.valueOf(iM9398H4));
                                } else if (i2 == 9 || i2 == 32) {
/* 1083 */                          this.f18330e.put(Integer.valueOf(i2), Integer.valueOf(m9337a(i2)));
                                } else if (!this.f18330e.containsKey(Integer.valueOf(i2))) {
/* 1065 */                          this.f18330e.put(Integer.valueOf(i2), Integer.valueOf(w11.m9398H(this.f18328c, str, i6)));
                                }
                            }
                        }
/* 1086 */              i4++;
/* 1088 */              i3 = 8;
                    }
/* 1097 */          int length = this.f18329d - iArr.length;
/* 1098 */          this.f18329d = length;
/* 1100 */          si1 si1Var = this.f18327b;
/* 1102 */          if (si1Var != null && length == 0) {
/* 1110 */              si1Var.f16646a.success(this.f18330e);
                    }
/* 1092 */          return true;
                }
            }
