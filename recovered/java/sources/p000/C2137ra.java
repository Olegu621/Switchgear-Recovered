            package p000;

            import android.content.Context;
            import android.content.IntentFilter;
            import android.location.Location;
            import android.location.LocationManager;
            import android.os.PowerManager;
            import java.util.Calendar;
            
            /* JADX INFO: renamed from: ra */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 22 */    public final class C2137ra extends AbstractC2211ta {

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f15936c = 1;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ LayoutInflaterFactory2C2324wa f15937d;

                /* JADX INFO: renamed from: e */
                public final Object f15938e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2137ra(LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa, Context context) {
/* 6 */             super(layoutInflaterFactory2C2324wa);
/* 4 */             this.f15937d = layoutInflaterFactory2C2324wa;
/* 21 */            this.f15938e = (PowerManager) context.getApplicationContext().getSystemService("power");
                }

                @Override // p000.AbstractC2211ta
                /* JADX INFO: renamed from: e */
                public final IntentFilter mo8095e() {
                    switch (this.f15936c) {
                        case 0:
/* 29 */                    IntentFilter intentFilter = new IntentFilter();
/* 34 */                    intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
/* 37 */                    return intentFilter;
                        default:
/* 8 */                     IntentFilter intentFilter2 = new IntentFilter();
/* 13 */                    intentFilter2.addAction("android.intent.action.TIME_SET");
/* 18 */                    intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
/* 23 */                    intentFilter2.addAction("android.intent.action.TIME_TICK");
/* 26 */                    return intentFilter2;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:14:0x003d  */
                @Override // p000.AbstractC2211ta
                /* JADX INFO: renamed from: h */
                public final int mo8096h() {
                    Location lastKnownLocation;
                    boolean z;
                    long j;
/* 3 */             int i = this.f15936c;
/* 7 */             Object obj = this.f15938e;
                    switch (i) {
                        case 0:
                            return AbstractC1920ma.m6631a((PowerManager) obj) ? 2 : 1;
                        default:
/* 12 */                    ac1 ac1Var = (ac1) obj;
/* 16 */                    fs2 fs2Var = (fs2) ac1Var.f179d;
/* 20 */                    LocationManager locationManager = (LocationManager) ac1Var.f178c;
/* 30 */                    if (fs2Var.f8343b > System.currentTimeMillis()) {
/* 32 */                        z = fs2Var.f8342a;
                            } else {
/* 38 */                        Context context = (Context) ac1Var.f177b;
/* 46 */                        Location lastKnownLocation2 = null;
/* 47 */                        if (qj3.m7891b(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                                    try {
/* 55 */                                if (locationManager.isProviderEnabled("network")) {
/* 57 */                                    lastKnownLocation = locationManager.getLastKnownLocation("network");
                                        } else {
/* 62 */                                    lastKnownLocation = null;
                                        }
                                        break;
                                    } catch (Exception unused) {
                                    }
                                } else {
/* 62 */                            lastKnownLocation = null;
                                }
/* 69 */                        if (qj3.m7891b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                                    try {
/* 77 */                                if (locationManager.isProviderEnabled("gps")) {
/* 79 */                                    lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                                        }
                                        break;
                                    } catch (Exception unused2) {
                                    }
                                }
/* 83 */                        if (lastKnownLocation2 == null || lastKnownLocation == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > lastKnownLocation.getTime()) {
/* 99 */                            lastKnownLocation = lastKnownLocation2;
                                }
/* 104 */                       z = false;
/* 105 */                       if (lastKnownLocation != null) {
/* 107 */                           long jCurrentTimeMillis = System.currentTimeMillis();
/* 113 */                           if (es2.f7866d == null) {
/* 120 */                               es2.f7866d = new es2();
                                    }
/* 122 */                           es2 es2Var = es2.f7866d;
/* 137 */                           es2Var.m3597a(jCurrentTimeMillis - 86400000, lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
/* 150 */                           es2Var.m3597a(jCurrentTimeMillis, lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
/* 156 */                           z = es2Var.f7869c == 1;
/* 159 */                           long j2 = es2Var.f7868b;
/* 161 */                           long j3 = es2Var.f7867a;
/* 181 */                           es2Var.m3597a(jCurrentTimeMillis + 86400000, lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
/* 184 */                           long j4 = es2Var.f7868b;
/* 190 */                           if (j2 == -1 || j3 == -1) {
/* 218 */                               j = jCurrentTimeMillis + 43200000;
                                    } else {
/* 199 */                               if (jCurrentTimeMillis <= j3) {
/* 209 */                                   j4 = jCurrentTimeMillis > j2 ? j3 : j2;
                                        }
/* 213 */                               j = j4 + 60000;
                                    }
/* 220 */                           fs2Var.f8342a = z;
/* 222 */                           fs2Var.f8343b = j;
                                } else {
/* 231 */                           int i2 = Calendar.getInstance().get(11);
/* 236 */                           if (i2 < 6 || i2 >= 22) {
/* 242 */                               z = true;
                                    }
                                }
                            }
                            return z ? 2 : 1;
                    }
                }

                @Override // p000.AbstractC2211ta
                /* JADX INFO: renamed from: n */
                public final void mo8097n() throws IllegalAccessException {
/* 1 */             int i = this.f15936c;
/* 4 */             LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = this.f15937d;
                    switch (i) {
                        case 0:
/* 13 */                    layoutInflaterFactory2C2324wa.m9500n(true, true);
                            break;
                        default:
/* 9 */                     layoutInflaterFactory2C2324wa.m9500n(true, true);
                            break;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 23 */        public C2137ra(LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa, ac1 ac1Var) {
                    super(layoutInflaterFactory2C2324wa);
/* 24 */            this.f15937d = layoutInflaterFactory2C2324wa;
/* 25 */            this.f15938e = ac1Var;
                }
            }
