            package p000;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.net.ConnectivityManager;
            import android.net.NetworkInfo;
            import android.os.Build;
            import android.telephony.TelephonyManager;
            import android.util.SparseArray;
            import com.appsflyer.AdRevenueScheme;
            import java.net.MalformedURLException;
            import java.net.URL;
            import java.util.Calendar;
            import java.util.HashMap;
            import java.util.Locale;
            import java.util.TimeZone;
            
            /* JADX INFO: renamed from: as */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0154as implements vr2 {

                /* JADX INFO: renamed from: a */
                public final fs0 f2065a;

                /* JADX INFO: renamed from: b */
                public final ConnectivityManager f2066b;

                /* JADX INFO: renamed from: c */
                public final Context f2067c;

                /* JADX INFO: renamed from: d */
                public final URL f2068d;

                /* JADX INFO: renamed from: e */
                public final InterfaceC2512yv f2069e;

                /* JADX INFO: renamed from: f */
                public final InterfaceC2512yv f2070f;

                /* JADX INFO: renamed from: g */
                public final int f2071g;

                public C0154as(Context context, InterfaceC2512yv interfaceC2512yv, InterfaceC2512yv interfaceC2512yv2) {
/* 6 */             i11 i11Var = new i11();
/* 9 */             C0988he c0988he = C0988he.f9024a;
/* 13 */            i11Var.m4415a(AbstractC2499yi.class, c0988he);
/* 18 */            i11Var.m4415a(C0214cf.class, c0988he);
/* 21 */            C1828ke c1828ke = C1828ke.f12704a;
/* 25 */            i11Var.m4415a(ea1.class, c1828ke);
/* 30 */            i11Var.m4415a(C0215cg.class, c1828ke);
/* 33 */            C1025ie c1025ie = C1025ie.f9557a;
/* 37 */            i11Var.m4415a(AbstractC2195sv.class, c1025ie);
/* 42 */            i11Var.m4415a(C1829kf.class, c1025ie);
/* 45 */            C0951ge c0951ge = C0951ge.f8556a;
/* 49 */            i11Var.m4415a(AbstractC2525z7.class, c0951ge);
/* 54 */            i11Var.m4415a(C2548ze.class, c0951ge);
/* 57 */            C1790je c1790je = C1790je.f12228a;
/* 61 */            i11Var.m4415a(ba1.class, c1790je);
/* 66 */            i11Var.m4415a(C0179bg.class, c1790je);
/* 69 */            C1887le c1887le = C1887le.f13202a;
/* 73 */            i11Var.m4415a(xm1.class, c1887le);
/* 78 */            i11Var.m4415a(C0879eg.class, c1887le);
/* 82 */            i11Var.f9398d = true;
/* 90 */            this.f2065a = new fs0(i11Var, 2);
/* 92 */            this.f2067c = context;
/* 102 */           this.f2066b = (ConnectivityManager) context.getSystemService("connectivity");
/* 110 */           this.f2068d = m1151b(C0959gm.f8706c);
/* 112 */           this.f2069e = interfaceC2512yv2;
/* 114 */           this.f2070f = interfaceC2512yv;
/* 119 */           this.f2071g = 130000;
                }

                /* JADX INFO: renamed from: b */
                public static URL m1151b(String str) {
                    try {
/* 3 */                 return new URL(str);
                    } catch (MalformedURLException e) {
/* 19 */                throw new IllegalArgumentException(AbstractC0886en.m3507k("Invalid url: ", str), e);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
                /* JADX WARN: Code duplicated, block: B:30:0x010b  */
                /* JADX INFO: renamed from: a */
                public final C2142rf m1152a(C2142rf c2142rf) {
                    int type;
                    int subtype;
                    HashMap map;
/* 3 */             NetworkInfo activeNetworkInfo = this.f2066b.getActiveNetworkInfo();
/* 7 */             xy1 xy1VarM8154c = c2142rf.m8154c();
/* 11 */            int i = Build.VERSION.SDK_INT;
/* 15 */            HashMap map2 = (HashMap) xy1VarM8154c.f19398f;
/* 20 */            if (map2 == null) {
/* 280 */               f42.m3656l("Property \"autoMetadata\" has not been set");
/* 17 */                return null;
                    }
/* 28 */            map2.put("sdk-version", String.valueOf(i));
/* 35 */            xy1VarM8154c.m10040c("model", Build.MODEL);
/* 42 */            xy1VarM8154c.m10040c("hardware", Build.HARDWARE);
/* 49 */            xy1VarM8154c.m10040c("device", Build.DEVICE);
/* 56 */            xy1VarM8154c.m10040c("product", Build.PRODUCT);
/* 63 */            xy1VarM8154c.m10040c("os-uild", Build.ID);
/* 70 */            xy1VarM8154c.m10040c("manufacturer", Build.MANUFACTURER);
/* 77 */            xy1VarM8154c.m10040c("fingerprint", Build.FINGERPRINT);
/* 80 */            Calendar.getInstance();
/* 99 */            long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
/* 104 */           HashMap map3 = (HashMap) xy1VarM8154c.f19398f;
/* 106 */           if (map3 == null) {
/* 276 */               f42.m3656l("Property \"autoMetadata\" has not been set");
/* 17 */                return null;
                    }
/* 114 */           map3.put("tz-offset", String.valueOf(offset));
/* 117 */           int i2 = -1;
/* 118 */           if (activeNetworkInfo == null) {
/* 120 */               SparseArray sparseArray = wm1.f18687a;
/* 122 */               type = -1;
                    } else {
/* 124 */               type = activeNetworkInfo.getType();
                    }
/* 130 */           HashMap map4 = (HashMap) xy1VarM8154c.f19398f;
/* 132 */           if (map4 == null) {
/* 272 */               f42.m3656l("Property \"autoMetadata\" has not been set");
/* 17 */                return null;
                    }
/* 140 */           map4.put("net-type", String.valueOf(type));
/* 144 */           if (activeNetworkInfo != null) {
/* 150 */               subtype = activeNetworkInfo.getSubtype();
/* 154 */               if (subtype == -1) {
/* 156 */                   SparseArray sparseArray2 = vm1.f18248a;
/* 158 */                   subtype = 100;
                        } else if (((vm1) vm1.f18248a.get(subtype)) == null) {
                        }
/* 173 */               map = (HashMap) xy1VarM8154c.f19398f;
/* 175 */               if (map != null) {
/* 268 */                   f42.m3656l("Property \"autoMetadata\" has not been set");
/* 17 */                    return null;
                        }
/* 183 */               map.put("mobile-subtype", String.valueOf(subtype));
/* 196 */               xy1VarM8154c.m10040c(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
/* 209 */               xy1VarM8154c.m10040c("locale", Locale.getDefault().getLanguage());
/* 214 */               Context context = this.f2067c;
/* 228 */               xy1VarM8154c.m10040c("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
                        try {
/* 243 */                   i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                        } catch (PackageManager.NameNotFoundException e) {
/* 251 */                   py0.m7595R("CctTransportBackend", "Unable to find version code for package", e);
                        }
/* 260 */               xy1VarM8154c.m10040c("application_build", Integer.toString(i2));
/* 263 */               return xy1VarM8154c.m10041d();
                    }
/* 146 */           SparseArray sparseArray3 = vm1.f18248a;
/* 148 */           subtype = 0;
/* 173 */           map = (HashMap) xy1VarM8154c.f19398f;
/* 175 */           if (map != null) {
/* 268 */               f42.m3656l("Property \"autoMetadata\" has not been set");
/* 17 */                return null;
                    }
/* 183 */           map.put("mobile-subtype", String.valueOf(subtype));
/* 196 */           xy1VarM8154c.m10040c(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
/* 209 */           xy1VarM8154c.m10040c("locale", Locale.getDefault().getLanguage());
/* 214 */           Context context2 = this.f2067c;
/* 228 */           xy1VarM8154c.m10040c("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
/* 243 */           i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
/* 260 */           xy1VarM8154c.m10040c("application_build", Integer.toString(i2));
/* 263 */           return xy1VarM8154c.m10041d();
                }
            }
