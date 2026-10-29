            package com.appsflyer.internal;

            import android.content.Context;
            import android.content.pm.PackageItemInfo;
            import android.database.Cursor;
            import android.net.Uri;
            import com.appsflyer.AFLogger;
            import java.util.HashMap;
            import java.util.Map;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFj1wSDK extends AFi1cSDK {
                private final AFd1zSDK getCurrencyIso4217Code;
                private final AFj1vSDK getMonetizationNetwork;

                public AFj1wSDK(Runnable runnable, AFd1zSDK aFd1zSDK, AFj1vSDK aFj1vSDK) {
/* 9 */             super("store", "huawei", aFd1zSDK.AFAdRevenueData(), runnable);
/* 12 */            this.getCurrencyIso4217Code = aFd1zSDK;
/* 14 */            this.getMonetizationNetwork = aFj1vSDK;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void getMediationNetwork(Context context) {
/* 9 */             this.component1 = System.currentTimeMillis();
/* 13 */            this.component4 = AFj1tSDK.AFa1tSDK.STARTED;
/* 20 */            addObserver(new AFj1tSDK.C02871());
/* 35 */            String str = ((PackageItemInfo) context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 128)).packageName;
/* 49 */            this.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, str)));
/* 60 */            this.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, str));
/* 63 */            Cursor cursorQuery = null;
                    try {
/* 85 */                cursorQuery = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
/* 89 */                if (cursorQuery != null) {
/* 91 */                    boolean zMoveToFirst = cursorQuery.moveToFirst();
/* 95 */                    Map<String, Object> map = this.getMediationNetwork;
/* 97 */                    if (zMoveToFirst) {
/* 101 */                       map.put("response", "OK");
/* 113 */                       this.getMediationNetwork.put("referrer", cursorQuery.getString(0));
/* 129 */                       this.getMediationNetwork.put("click_ts", Long.valueOf(cursorQuery.getLong(1)));
/* 145 */                       this.getMediationNetwork.put("install_end_ts", Long.valueOf(cursorQuery.getLong(2)));
/* 153 */                       if (cursorQuery.getColumnCount() > 3) {
/* 167 */                           this.getMediationNetwork.put("install_begin_ts", Long.valueOf(cursorQuery.getLong(3)));
/* 172 */                           HashMap map2 = new HashMap();
/* 176 */                           String string = cursorQuery.getString(4);
/* 180 */                           if (string != null) {
/* 184 */                               map2.put("track_id", string);
                                    }
/* 199 */                           map2.put("referrer_ex", cursorQuery.getString(5));
/* 206 */                           this.getMediationNetwork.put("huawei_custom", map2);
                                }
                            } else {
/* 210 */                       map.put("response", "FEATURE_NOT_SUPPORTED");
                            }
                        } else {
/* 218 */                   this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
                        }
/* 221 */               if (cursorQuery != null) {
/* 223 */                   cursorQuery.close();
                        }
                    } catch (Throwable th) {
                        try {
/* 229 */                   this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
/* 256 */                   AFLogger.INSTANCE.m1813e(AFg1cSDK.REFERRER, th.getMessage() != null ? th.getMessage() : HttpUrl.FRAGMENT_ENCODE_SET, th, false, true);
/* 259 */                   if (0 != 0) {
                            }
                        } catch (Throwable th2) {
/* 266 */                   if (0 == 0) {
/* 271 */                       throw th2;
                            }
/* 268 */                   cursorQuery.close();
/* 271 */                   throw th2;
                        }
                    }
/* 262 */           getMediationNetwork();
                }

                private boolean getRevenue(Context context) {
/* 6 */             if (!getRevenue()) {
/* 14 */                AFLogger.INSTANCE.m1810d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
/* 5 */                 return false;
                    }
/* 24 */            if (!this.getMonetizationNetwork.getCurrencyIso4217Code(context)) {
/* 32 */                AFLogger.INSTANCE.m1810d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
/* 5 */                 return false;
                    }
/* 42 */            if (this.getMonetizationNetwork.getRevenue(context)) {
/* 54 */                return true;
                    }
/* 50 */            AFLogger.INSTANCE.m1810d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
/* 5 */             return false;
                }

                @Override // com.appsflyer.internal.AFj1tSDK
                public final void getMonetizationNetwork(Context context) {
/* 5 */             if (getRevenue(context)) {
/* 20 */                this.getCurrencyIso4217Code.getMonetizationNetwork().execute(new RunnableC0295g(4, this, context));
                    }
                }
            }
