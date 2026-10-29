            package com.google.android.gms.ads.identifier;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import com.google.android.gms.internal.ads_identifier.zze;
            import com.google.android.gms.internal.ads_identifier.zzf;
            import java.io.IOException;
            import java.util.HashMap;
            import p000.C2515yy;
            import p000.ServiceConnectionC2500yj;
            import p000.kb1;
            import p000.le3;
            import p000.qr0;
            import p000.vr0;
            import p000.wi0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 29 */    public class AdvertisingIdClient {

                /* JADX INFO: renamed from: a */
                public ServiceConnectionC2500yj f3213a;

                /* JADX INFO: renamed from: b */
                public zzf f3214b;

                /* JADX INFO: renamed from: c */
                public boolean f3215c;

                /* JADX INFO: renamed from: d */
                public final Object f3216d;

                /* JADX INFO: renamed from: e */
                public le3 f3217e;

                /* JADX INFO: renamed from: f */
                public final Context f3218f;

                /* JADX INFO: renamed from: g */
                public final long f3219g;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class Info {

                    /* JADX INFO: renamed from: a */
                    public final String f3220a;

                    /* JADX INFO: renamed from: b */
                    public final boolean f3221b;

                    @Deprecated
                    public Info(String str, boolean z) {
/* 4 */                 this.f3220a = str;
/* 6 */                 this.f3221b = z;
                    }

                    public String getId() {
/* 1 */                 return this.f3220a;
                    }

                    public boolean isLimitAdTrackingEnabled() {
/* 1 */                 return this.f3221b;
                    }

                    public String toString() {
/* 1 */                 String str = this.f3220a;
/* 15 */                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
/* 20 */                sb.append("{");
/* 23 */                sb.append(str);
/* 28 */                sb.append("}");
/* 33 */                sb.append(this.f3221b);
/* 36 */                return sb.toString();
                    }
                }

                public AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
                    Context applicationContext;
/* 9 */             this.f3216d = new Object();
/* 11 */            kb1.m6061n(context);
/* 14 */            if (z && (applicationContext = context.getApplicationContext()) != null) {
/* 22 */                context = applicationContext;
                    }
/* 23 */            this.f3218f = context;
/* 26 */            this.f3215c = false;
/* 28 */            this.f3219g = j;
                }

                /* JADX INFO: renamed from: b */
                public static void m1985b(Info info, long j, Throwable th) {
/* 9 */             if (Math.random() <= 0.0d) {
/* 13 */                HashMap map = new HashMap();
/* 20 */                map.put("app_context", "1");
/* 23 */                if (info != null) {
/* 36 */                    map.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
/* 39 */                    String id = info.getId();
/* 43 */                    if (id != null) {
/* 55 */                        map.put("ad_id_size", Integer.toString(id.length()));
                            }
                        }
/* 58 */                if (th != null) {
/* 70 */                    map.put("error", th.getClass().getName());
                        }
/* 77 */                map.put("tag", "AdvertisingIdClient");
/* 86 */                map.put("time_spent", Long.toString(j));
/* 94 */                new C0317a(map).start();
                    }
                }

                public static Info getAdvertisingIdInfo(Context context) throws IllegalStateException, vr0, IOException, wi0 {
/* 8 */             AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
                    try {
/* 12 */                long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 17 */                advertisingIdClient.m1986a(false);
/* 20 */                Info infoM1987c = advertisingIdClient.m1987c();
/* 29 */                m1985b(infoM1987c, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
/* 32 */                advertisingIdClient.zza();
/* 35 */                return infoM1987c;
                    } catch (Throwable th) {
                        try {
/* 39 */                    m1985b(null, -1L, th);
/* 42 */                    throw th;
                        } catch (Throwable th2) {
/* 45 */                    advertisingIdClient.zza();
/* 48 */                    throw th2;
                        }
                    }
                }

                public static boolean getIsAdIdFakeForDebugLogging(Context context) throws vr0, IOException, wi0 {
                    boolean zZzd;
/* 8 */             AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
                    try {
/* 12 */                advertisingIdClient.m1986a(false);
/* 17 */                kb1.m6060m("Calling this from your main thread can lead to deadlock");
                        synchronized (advertisingIdClient) {
                            try {
/* 23 */                        if (!advertisingIdClient.f3215c) {
                                    synchronized (advertisingIdClient.f3216d) {
/* 28 */                                le3 le3Var = advertisingIdClient.f3217e;
/* 30 */                                if (le3Var == null || !le3Var.f13217d) {
/* 76 */                                    throw new IOException("AdvertisingIdClient is not connected.");
                                        }
                                    }
                                    try {
/* 37 */                                advertisingIdClient.m1986a(false);
/* 42 */                                if (!advertisingIdClient.f3215c) {
/* 52 */                                    throw new IOException("AdvertisingIdClient cannot reconnect.");
                                        }
                                    } catch (Exception e) {
/* 65 */                                throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                                    }
                                }
/* 81 */                        kb1.m6061n(advertisingIdClient.f3213a);
/* 86 */                        kb1.m6061n(advertisingIdClient.f3214b);
                                try {
/* 91 */                            zZzd = advertisingIdClient.f3214b.zzd();
                                } catch (RemoteException unused) {
/* 113 */                           throw new IOException("Remote exception");
                                }
                            } catch (Throwable th) {
/* 115 */                       throw th;
                            }
                        }
/* 96 */                advertisingIdClient.m1988d();
/* 99 */                advertisingIdClient.zza();
/* 102 */               return zZzd;
                    } catch (Throwable th2) {
/* 116 */               advertisingIdClient.zza();
/* 119 */               throw th2;
                    }
                }

                public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
                }

                /* JADX INFO: renamed from: a */
                public final void m1986a(boolean z) {
/* 3 */             kb1.m6060m("Calling this from your main thread can lead to deadlock");
                    synchronized (this) {
                        try {
/* 9 */                     if (this.f3215c) {
/* 11 */                        zza();
                            }
/* 18 */                    Context context = this.f3218f;
                            try {
/* 27 */                        context.getPackageManager().getPackageInfo("com.android.vending", 0);
/* 35 */                        int iM8004c = qr0.f15712b.m8004c(context, 12451000);
/* 39 */                        if (iM8004c != 0 && iM8004c != 2) {
/* 52 */                            throw new IOException("Google Play services not available");
                                }
/* 55 */                        ServiceConnectionC2500yj serviceConnectionC2500yj = new ServiceConnectionC2500yj();
/* 62 */                        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
/* 67 */                        intent.setPackage("com.google.android.gms");
                                try {
/* 79 */                            if (!C2515yy.m10190b().m10191a(context, intent, serviceConnectionC2500yj, 1)) {
/* 124 */                               throw new IOException("Connection failure");
                                    }
/* 81 */                            this.f3213a = serviceConnectionC2500yj;
                                    try {
/* 91 */                                this.f3214b = zze.zza(serviceConnectionC2500yj.m10152a());
/* 93 */                                this.f3215c = true;
/* 95 */                                if (z) {
/* 97 */                                    m1988d();
                                        }
                                    } catch (InterruptedException unused) {
/* 116 */                               throw new IOException("Interrupted exception");
                                    } catch (Throwable th) {
/* 108 */                               throw new IOException(th);
                                    }
                                } catch (Throwable th2) {
/* 131 */                           throw new IOException(th2);
                                }
                            } catch (PackageManager.NameNotFoundException unused2) {
/* 137 */                       throw new vr0();
                            }
                        } catch (Throwable th3) {
/* 139 */                   throw th3;
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public final Info m1987c() {
                    Info info;
/* 3 */             kb1.m6060m("Calling this from your main thread can lead to deadlock");
                    synchronized (this) {
                        try {
/* 9 */                     if (!this.f3215c) {
                                synchronized (this.f3216d) {
/* 14 */                            le3 le3Var = this.f3217e;
/* 16 */                            if (le3Var == null || !le3Var.f13217d) {
/* 60 */                                throw new IOException("AdvertisingIdClient is not connected.");
                                    }
                                }
                                try {
/* 24 */                            m1986a(false);
/* 29 */                            if (!this.f3215c) {
/* 39 */                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                                    }
                                } catch (Exception e) {
/* 50 */                            throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                                }
                            }
/* 65 */                    kb1.m6061n(this.f3213a);
/* 70 */                    kb1.m6061n(this.f3214b);
                            try {
/* 88 */                        info = new Info(this.f3214b.zzc(), this.f3214b.zze(true));
                            } catch (RemoteException unused) {
/* 103 */                       throw new IOException("Remote exception");
                            }
                        } catch (Throwable th) {
/* 105 */                   throw th;
                        }
                    }
/* 92 */            m1988d();
/* 95 */            return info;
                }

                /* JADX INFO: renamed from: d */
                public final void m1988d() {
                    synchronized (this.f3216d) {
/* 4 */                 le3 le3Var = this.f3217e;
/* 6 */                 if (le3Var != null) {
/* 10 */                    le3Var.f13216c.countDown();
                            try {
/* 15 */                        this.f3217e.join();
                            } catch (InterruptedException unused) {
                            }
                        }
/* 21 */                long j = this.f3219g;
/* 27 */                if (j > 0) {
/* 34 */                    this.f3217e = new le3(this, j);
                        }
                    }
                }

                public final void finalize() throws Throwable {
/* 1 */             zza();
/* 4 */             super.finalize();
                }

                public Info getInfo() throws IOException {
/* 1 */             return m1987c();
                }

                public void start() throws IllegalStateException, vr0, IOException, wi0 {
/* 2 */             m1986a(true);
                }

                public final void zza() {
/* 3 */             kb1.m6060m("Calling this from your main thread can lead to deadlock");
                    synchronized (this) {
                        try {
/* 9 */                     if (this.f3218f == null || this.f3213a == null) {
/* 44 */                        return;
                            }
                            try {
/* 18 */                        if (this.f3215c) {
/* 28 */                            C2515yy.m10190b().m10193d(this.f3218f, this.f3213a);
                                }
                            } catch (Throwable unused) {
                            }
/* 32 */                    this.f3215c = false;
/* 35 */                    this.f3214b = null;
/* 37 */                    this.f3213a = null;
                        } catch (Throwable th) {
/* 46 */                    throw th;
                        }
                    }
                }

/* 30 */        public AdvertisingIdClient(Context context) {
/* 31 */            this(context, 30000L, false, false);
                }
            }
