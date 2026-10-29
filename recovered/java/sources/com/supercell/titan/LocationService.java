            package com.supercell.titan;

            import android.location.Location;
            import android.location.LocationListener;
            import android.location.LocationManager;
            import android.os.Bundle;
            import android.provider.Settings;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.concurrent.FutureTask;
            import p000.CallableC2139rc;
            import p000.cp0;
            import p000.dp0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class LocationService implements LocationListener, GameApp.ActivityEventListener {

                /* JADX INFO: renamed from: e */
                public static Location f5820e;

                /* JADX INFO: renamed from: a */
                public final String[] f5821a = {"android.permission.ACCESS_FINE_LOCATION"};

                /* JADX INFO: renamed from: b */
                public final LocationManager f5822b;

                /* JADX INFO: renamed from: c */
                public final GameApp f5823c;

                /* JADX INFO: renamed from: d */
                public long f5824d;

                public LocationService() {
/* 12 */            GameApp gameApp = GameApp.getInstance();
/* 16 */            this.f5823c = gameApp;
/* 26 */            this.f5822b = (LocationManager) gameApp.getSystemService(FirebaseAnalytics.Param.LOCATION);
                }

                /* JADX INFO: renamed from: a */
                public static boolean m2734a(Location location, Location location2) {
                    boolean zEquals;
/* 2 */             if (location2 == null && location != null) {
/* 1 */                 return true;
                    }
/* 8 */             if (location != null) {
/* 20 */                long time = location.getTime() - location2.getTime();
/* 30 */                boolean z = time > 120000;
/* 40 */                boolean z2 = time < -120000;
/* 49 */                boolean z3 = time > 0;
/* 50 */                if (!z) {
/* 53 */                    if (!z2) {
/* 65 */                        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
/* 70 */                        boolean z4 = accuracy > 0;
/* 75 */                        boolean z5 = accuracy < 0;
/* 82 */                        boolean z6 = accuracy > 200;
/* 83 */                        String provider = location.getProvider();
/* 87 */                        String provider2 = location2.getProvider();
/* 91 */                        if (provider == null) {
/* 97 */                            zEquals = provider2 == null;
                                } else {
/* 99 */                            zEquals = provider.equals(provider2);
                                }
/* 103 */                       if (!z5 && ((!z3 || z4) && (!z3 || z6 || !zEquals))) {
                                }
                            }
                        }
/* 1 */                 return true;
                    }
/* 7 */             return false;
                }

                public static native void locationChanged(long j, double d, double d2);

                public void init(long j) {
/* 1 */             this.f5824d = j;
                }

                public boolean isEnabled() {
                    int i;
                    try {
/* 10 */                i = Settings.Secure.getInt(this.f5823c.getContentResolver(), "location_mode");
                    } catch (Settings.SettingNotFoundException e) {
/* 20 */                AbstractC1245n0.m4891s("LocationService", "Error checking location mode", e);
/* 23 */                i = 0;
                    }
                    return i != 0;
                }

                @Override // android.location.LocationListener
                public void onLocationChanged(Location location) {
/* 1 */             f5820e = location;
/* 13 */            this.f5823c.runOnView(new cp0(this, location, 17, false));
                }

                @Override // android.location.LocationListener
                public void onProviderDisabled(String str) {
                }

                @Override // android.location.LocationListener
                public void onProviderEnabled(String str) {
                }

                @Override // com.supercell.titan.GameApp.ActivityEventListener
                public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
/* 2 */             if (i == 1) {
/* 6 */                 this.f5823c.removeActivityEventListener(this);
/* 12 */                boolean z = false;
/* 14 */                for (String str : this.f5821a) {
/* 18 */                    int i2 = 0;
                            while (true) {
/* 20 */                        if (i2 >= strArr.length) {
/* 56 */                            AbstractC1245n0.m4889q("LocationService", "Did not get permissions, can't listen for location. Permission:");
/* 59 */                            AbstractC1245n0.m4889q("LocationService", str);
                                    break;
                                } else {
/* 28 */                            if (strArr[i2].equals(str) && iArr[i2] == 0) {
/* 45 */                                GameApp.getInstance().runOnUiThread(new dp0(this, this, 17, z));
                                        break;
                                    }
/* 49 */                            i2++;
                                }
                            }
                        }
                    }
                }

                @Override // android.location.LocationListener
                public void onStatusChanged(String str, int i, Bundle bundle) {
                }

                public boolean showSystemSettings() {
                    try {
/* 9 */                 FutureTask futureTask = new FutureTask(new CallableC2139rc(this, 3));
/* 14 */                this.f5823c.runOnUiThread(futureTask);
                        try {
/* 23 */                    return ((Boolean) futureTask.get()).booleanValue();
                        } catch (Exception e) {
/* 37 */                    AbstractC1245n0.m4877e("LocationService", "Call has thrown an exception", e.getCause());
/* 40 */                    return false;
                        }
                    } catch (Exception unused) {
/* 40 */                return false;
                    }
                }

                public void startUpdatingLocation() {
/* 10 */            GameApp.getInstance().runOnUiThread(new RunnableC0798e(this, this));
                }

                public void stopUpdatingLocation() {
/* 10 */            GameApp.getInstance().runOnUiThread(new RunnableC0799f(this, this));
                }
            }
