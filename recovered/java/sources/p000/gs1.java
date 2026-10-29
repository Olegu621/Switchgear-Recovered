            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.net.ConnectivityManager;
            import android.net.NetworkInfo;
            import android.os.Looper;
            import android.util.Pair;
            import androidx.core.app.NotificationCompat;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.Tasks;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.lang.reflect.InvocationTargetException;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.List;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gs1 {

                /* JADX INFO: renamed from: a */
                public final long f8793a;

                /* JADX INFO: renamed from: b */
                public final long f8794b;

                /* JADX INFO: renamed from: c */
                public final dc0 f8795c;

                /* JADX INFO: renamed from: d */
                public final List f8796d;

                /* JADX INFO: renamed from: e */
                public final ns1 f8797e;

                /* JADX INFO: renamed from: f */
                public final Context f8798f;

                /* JADX INFO: renamed from: g */
                public final HashMap f8799g;

                /* JADX INFO: renamed from: h */
                public boolean f8800h;

                /* JADX INFO: renamed from: i */
                public long f8801i;

                /* JADX INFO: renamed from: j */
                public long f8802j;

                public gs1(List list, ns1 ns1Var, Context context) {
/* 4 */             dc0 dc0Var = new dc0(3);
/* 7 */             context.getClass();
/* 15 */            this.f8793a = 1000L;
/* 19 */            this.f8794b = 10000L;
/* 21 */            this.f8795c = dc0Var;
/* 23 */            this.f8796d = list;
/* 25 */            this.f8797e = ns1Var;
/* 27 */            this.f8798f = context;
/* 34 */            this.f8799g = new HashMap();
                }

                /* JADX INFO: renamed from: a */
                public static Object m4005a(Function0 function0, Function0 function1) {
                    return function0 == null ? function1.invoke() : function0.invoke();
                }

                /* JADX INFO: renamed from: b */
                public final void m4006b() {
                    NetworkInfo activeNetworkInfo;
/* 5 */             this.f8802j = System.currentTimeMillis();
/* 9 */             boolean zM4009e = m4009e(ms1.f14002b);
/* 15 */            boolean zM4009e2 = m4009e(ms1.f14004c);
/* 19 */            if (zM4009e || zM4009e2) {
/* 26 */                this.f8795c.getClass();
/* 29 */                Context context = this.f8798f;
/* 31 */                context.getClass();
/* 36 */                Object systemService = context.getSystemService("connectivity");
/* 42 */                NetworkInfo networkInfo = null;
/* 48 */                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
/* 49 */                if (connectivityManager != null) {
                            try {
/* 51 */                        activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException e) {
/* 81 */                        k50.m5980q("vq2", "Security exception getting NetworkInfo: %s", e.toString());
                            }
                        } else {
/* 58 */                    activeNetworkInfo = null;
                        }
/* 59 */                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
/* 67 */                    networkInfo = activeNetworkInfo;
                        }
/* 84 */                HashMap map = this.f8799g;
/* 86 */                ns1 ns1Var = this.f8797e;
/* 88 */                if (zM4009e) {
/* 104 */                   mn0.m6688d(map, "networkType", m4005a(ns1Var.f14425f, new es1(this, networkInfo, 0)));
                        }
/* 107 */               if (zM4009e2) {
/* 123 */                   mn0.m6688d(map, "networkTechnology", m4005a(ns1Var.f14426g, new es1(this, networkInfo, 1)));
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0034  */
                /* JADX INFO: renamed from: c */
                public final void m4007c() {
                    String str;
                    Pair pair;
/* 5 */             this.f8801i = System.currentTimeMillis();
/* 9 */             boolean zM4009e = m4009e(ms1.f14009v);
/* 15 */            boolean zM4009e2 = m4009e(ms1.f14008i);
/* 19 */            int i = 1;
/* 20 */            int i2 = 2;
/* 21 */            HashMap map = this.f8799g;
/* 23 */            ns1 ns1Var = this.f8797e;
/* 25 */            if (zM4009e || zM4009e2) {
/* 31 */                this.f8795c.getClass();
/* 34 */                Context context = this.f8798f;
/* 36 */                context.getClass();
/* 46 */                Integer num = null;
/* 47 */                Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
/* 51 */                if (intentRegisterReceiver == null) {
/* 53 */                    pair = null;
                        } else {
/* 58 */                    int intExtra = intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
/* 64 */                    int intExtra2 = intentRegisterReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
/* 70 */                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
/* 74 */                    if (intExtra == -1 || intExtra2 == -1 || intExtra3 == -1) {
/* 53 */                        pair = null;
                            } else {
/* 81 */                        if (intExtra == 1) {
/* 97 */                            str = null;
                                } else if (intExtra != 2) {
/* 91 */                            str = intExtra != 5 ? "unplugged" : "full";
                                } else {
/* 94 */                            str = "charging";
                                }
/* 110 */                       pair = new Pair(str, Integer.valueOf((int) ((intExtra2 * 100) / intExtra3)));
                            }
                        }
/* 113 */               if (zM4009e) {
/* 128 */                   mn0.m6688d(map, "batteryState", m4005a(ns1Var.f14433n, new ds1(pair, 2)));
                        }
/* 131 */               if (zM4009e2) {
/* 145 */                   Integer num2 = (Integer) m4005a(ns1Var.f14432m, new ds1(pair, 3));
/* 147 */                   if (num2 != null && num2.intValue() >= 0) {
/* 155 */                       num = num2;
                            }
/* 158 */                   mn0.m6688d(map, "batteryLevel", num);
                        }
                    }
/* 167 */           if (m4009e(ms1.f14007f)) {
/* 183 */               mn0.m6688d(map, "systemAvailableMemory", m4005a(ns1Var.f14431l, new fs1(this, 0)));
                    }
/* 192 */           if (m4009e(ms1.f14010w)) {
/* 207 */               mn0.m6688d(map, "availableStorage", m4005a(ns1Var.f14428i, new fs1(this, i)));
                    }
/* 216 */           if (m4009e(ms1.f13995V)) {
/* 231 */               mn0.m6688d(map, "isPortrait", m4005a(ns1Var.f14434o, new fs1(this, i2)));
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m4008d() {
                    Object objM2985b;
                    Object objM2985b2;
                    Object objM2985b3;
/* 1 */             ns1 ns1Var = this.f8797e;
/* 11 */            Object objM4005a = m4005a(ns1Var.f14420a, new fs1(this, 5));
/* 15 */            HashMap map = this.f8799g;
/* 19 */            mn0.m6688d(map, "osType", objM4005a);
/* 36 */            mn0.m6688d(map, "osVersion", m4005a(ns1Var.f14421b, new fs1(this, 6)));
/* 53 */            mn0.m6688d(map, "deviceModel", m4005a(ns1Var.f14423d, new fs1(this, 7)));
/* 71 */            mn0.m6688d(map, "deviceManufacturer", m4005a(ns1Var.f14422c, new fs1(this, 8)));
/* 80 */            if (m4009e(ms1.f14000a)) {
/* 97 */                mn0.m6688d(map, "carrier", m4005a(ns1Var.f14424e, new fs1(this, 9)));
                    }
/* 106 */           if (m4009e(ms1.f14006e)) {
/* 123 */               mn0.m6688d(map, "physicalMemory", m4005a(ns1Var.f14430k, new fs1(this, 10)));
                    }
/* 132 */           if (m4009e(ms1.f13994U)) {
/* 149 */               mn0.m6688d(map, "totalStorage", m4005a(ns1Var.f14429j, new fs1(this, 11)));
                    }
/* 158 */           if (m4009e(ms1.f13996W)) {
/* 175 */               mn0.m6688d(map, "resolution", m4005a(ns1Var.f14435p, new fs1(this, 12)));
                    }
/* 184 */           if (m4009e(ms1.f13997X)) {
/* 201 */               mn0.m6688d(map, "scale", m4005a(ns1Var.f14436q, new fs1(this, 13)));
                    }
/* 210 */           Pair pair = null;
/* 210 */           pair = null;
/* 210 */           pair = null;
/* 210 */           pair = null;
/* 210 */           pair = null;
/* 210 */           pair = null;
/* 210 */           pair = null;
/* 210 */           pair = null;
/* 210 */           pair = null;
/* 211 */           if (m4009e(ms1.f13998Y)) {
/* 225 */               String str = (String) m4005a(ns1Var.f14437r, new fs1(this, 3));
/* 237 */               mn0.m6688d(map, "language", str != null ? di2.m3089y(8, str) : null);
                    }
/* 246 */           if (m4009e(ms1.f14005d)) {
/* 262 */               mn0.m6688d(map, "androidIdfa", m4005a(ns1Var.f14427h, new fs1(this, 4)));
                    }
/* 267 */           boolean zM4009e = m4009e(ms1.f13999Z);
/* 273 */           boolean zM4009e2 = m4009e(ms1.f14001a0);
/* 278 */           if (zM4009e || zM4009e2) {
/* 284 */               hs1 hs1Var = ns1Var.f14438s;
/* 290 */               if (hs1Var == null || ns1Var.f14439t == null) {
/* 318 */                   this.f8795c.getClass();
/* 323 */                   Context context = this.f8798f;
/* 325 */                   context.getClass();
/* 341 */                   if (!Intrinsics.m6216a(Looper.myLooper(), Looper.getMainLooper())) {
                                try {
/* 345 */                           int i = dc0.f7102d;
/* 361 */                           Class<?> cls = Class.forName("com.google.android.gms.appset.AppSet");
/* 365 */                           Object[] objArrCopyOf = Arrays.copyOf(new Object[]{context}, 1);
/* 384 */                           Object objInvoke = cls.getMethod("getClient", (Class[]) Arrays.copyOf(new Class[]{Context.class}, 1)).invoke(null, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
/* 388 */                           if (objInvoke != null && (objM2985b = dc0.m2985b(objInvoke, "getAppSetIdInfo", new Object[0])) != null) {
/* 418 */                               Object[] objArrCopyOf2 = Arrays.copyOf(new Object[]{objM2985b}, 1);
/* 437 */                               Object objInvoke2 = Tasks.class.getMethod("await", (Class[]) Arrays.copyOf(new Class[]{Task.class}, 1)).invoke(null, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
/* 441 */                               if (objInvoke2 != null && (objM2985b2 = dc0.m2985b(objInvoke2, "getId", new Object[0])) != null && (objM2985b3 = dc0.m2985b(objInvoke2, "getScope", new Object[0])) != null) {
/* 483 */                                   pair = new Pair((String) objM2985b2, ((Integer) objM2985b3).intValue() == 1 ? "app" : "developer");
                                        }
                                    }
                                } catch (ClassNotFoundException unused) {
/* 508 */                           k50.m5968e("dc0", "AppSetID error: Google Play Services not found", new Object[0]);
                                } catch (InvocationTargetException unused2) {
/* 500 */                           k50.m5968e("dc0", "AppSetID error: Google Play Services not available", new Object[0]);
                                } catch (Exception unused3) {
/* 492 */                           k50.m5968e("dc0", "AppSetID error: couldn't connect to Google Play Services", new Object[0]);
                                }
                            }
/* 511 */                   if (zM4009e) {
/* 526 */                       mn0.m6688d(map, "appSetId", (String) m4005a(ns1Var.f14438s, new ds1(pair, 0)));
                            }
/* 529 */                   if (zM4009e2) {
/* 544 */                       mn0.m6688d(map, "appSetIdScope", (String) m4005a(ns1Var.f14439t, new ds1(pair, 1)));
                            }
                        } else {
/* 296 */                   if (zM4009e) {
/* 300 */                       mn0.m6688d(map, "appSetId", hs1Var.f9225b);
                            }
/* 303 */                   if (zM4009e2) {
/* 305 */                       hs1 hs1Var2 = ns1Var.f14439t;
/* 311 */                       mn0.m6688d(map, "appSetIdScope", hs1Var2 != null ? hs1Var2.f9225b : null);
                            }
                        }
                    }
/* 547 */           this.f8800h = true;
                }

                /* JADX INFO: renamed from: e */
                public final boolean m4009e(ms1 ms1Var) {
/* 1 */             List list = this.f8796d;
/* 3 */             if (list != null) {
/* 5 */                 return list.contains(ms1Var);
                    }
/* 10 */            return true;
                }
            }
