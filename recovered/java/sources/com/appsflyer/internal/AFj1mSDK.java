            package com.appsflyer.internal;

            import android.content.ContentResolver;
            import android.content.Context;
            import android.content.pm.PackageItemInfo;
            import android.database.Cursor;
            import android.net.Uri;
            import com.appsflyer.AFLogger;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFj1mSDK extends AFi1eSDK {
                private final AFd1zSDK getCurrencyIso4217Code;

                public AFj1mSDK(Runnable runnable, AFd1zSDK aFd1zSDK) {
/* 5 */             super("store", "samsung", runnable);
/* 8 */             this.getCurrencyIso4217Code = aFd1zSDK;
                }

                @Override // com.appsflyer.internal.AFj1tSDK
                public final void getMonetizationNetwork(Context context) {
/* 19 */            AFb1uSDK<Map<String, Object>> aFb1uSDK = new AFb1uSDK<Map<String, Object>>(context, this.getCurrencyIso4217Code.getMonetizationNetwork(), "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFj1mSDK.1
                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // com.appsflyer.internal.AFb1uSDK
                        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
                        public Map<String, Object> getRevenue() {
                            String string;
/* 5 */                     Cursor cursorQuery = null;
                            try {
                                try {
/* 8 */                             ContentResolver contentResolver = this.getMonetizationNetwork.getContentResolver();
/* 16 */                            StringBuilder sb = new StringBuilder("content://");
/* 21 */                            sb.append(this.getMediationNetwork);
/* 36 */                            cursorQuery = contentResolver.query(Uri.parse(sb.toString()), null, null, null, null);
/* 40 */                            if (cursorQuery != null) {
/* 42 */                                boolean zMoveToFirst = cursorQuery.moveToFirst();
/* 46 */                                AFj1mSDK aFj1mSDK = AFj1mSDK.this;
/* 48 */                                if (zMoveToFirst) {
/* 54 */                                    aFj1mSDK.getMediationNetwork.put("response", "OK");
/* 63 */                                    m1834E_("referrer", AFj1mSDK.this.getMediationNetwork, cursorQuery);
/* 72 */                                    m1833D_("click_ts", AFj1mSDK.this.getMediationNetwork, cursorQuery);
/* 81 */                                    m1833D_("install_begin_ts", AFj1mSDK.this.getMediationNetwork, cursorQuery);
/* 90 */                                    m1833D_("install_end_ts", AFj1mSDK.this.getMediationNetwork, cursorQuery);
/* 99 */                                    m1834E_("organic_keywords", AFj1mSDK.this.getMediationNetwork, cursorQuery);
/* 108 */                                   m1834E_("attr_type", AFj1mSDK.this.getMediationNetwork, cursorQuery);
/* 113 */                                   HashMap map = new HashMap();
/* 118 */                                   int columnIndex = cursorQuery.getColumnIndex("instant");
/* 123 */                                   if (columnIndex != -1 && (string = cursorQuery.getString(columnIndex)) != null) {
/* 139 */                                       map.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                                            }
/* 151 */                                   m1833D_("click_server_ts", map, cursorQuery);
/* 156 */                                   m1833D_("install_begin_server_ts", map, cursorQuery);
/* 161 */                                   m1834E_("install_version", map, cursorQuery);
/* 168 */                                   if (!map.isEmpty()) {
/* 176 */                                       AFj1mSDK.this.getMediationNetwork.put("custom", map);
                                            }
                                        } else {
/* 182 */                                   aFj1mSDK.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                                        }
                                    } else {
/* 192 */                               AFj1mSDK.this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
                                    }
/* 195 */                           if (cursorQuery != null) {
/* 197 */                               cursorQuery.close();
                                    }
                                } catch (Exception e) {
/* 205 */                           AFj1mSDK.this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
/* 214 */                           AFLogger.afErrorLog(e.getMessage(), e, false, true);
/* 217 */                           if (0 != 0) {
                                    }
                                }
/* 234 */                       String str = ((PackageItemInfo) this.getMonetizationNetwork.getPackageManager().resolveContentProvider(this.getMediationNetwork, 128)).packageName;
/* 252 */                       AFj1mSDK.this.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(this.getMonetizationNetwork, str)));
/* 267 */                       AFj1mSDK.this.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(this.getMonetizationNetwork, str));
/* 272 */                       AFj1mSDK.this.getMediationNetwork();
/* 277 */                       return AFj1mSDK.this.getMediationNetwork;
                            } catch (Throwable th) {
/* 280 */                       if (0 == 0) {
/* 285 */                           throw th;
                                }
/* 282 */                       cursorQuery.close();
/* 285 */                       throw th;
                            }
                        }

                        /* JADX INFO: renamed from: D_ */
                        private static void m1833D_(String str, Map<String, Object> map, Cursor cursor) {
/* 1 */                     int columnIndex = cursor.getColumnIndex(str);
/* 6 */                     if (columnIndex == -1) {
/* 19 */                        return;
                            }
/* 9 */                     long j = cursor.getLong(columnIndex);
/* 17 */                    if (j == 0) {
/* 19 */                        return;
                            }
/* 24 */                    map.put(str, Long.valueOf(j));
                        }

                        /* JADX INFO: renamed from: E_ */
                        private static void m1834E_(String str, Map<String, Object> map, Cursor cursor) {
                            String string;
/* 1 */                     int columnIndex = cursor.getColumnIndex(str);
/* 6 */                     if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
/* 15 */                        return;
                            }
/* 16 */                    map.put(str, string);
                        }
                    };
/* 24 */            AFc1qSDK aFc1qSDKComponent4 = this.getCurrencyIso4217Code.component4();
/* 28 */            AFa1ySDK.getRevenue();
/* 36 */            if (AFa1ySDK.getCurrencyIso4217Code(aFc1qSDKComponent4, false) > 0 || !aFb1uSDK.getCurrencyIso4217Code()) {
/* 70 */                return;
                    }
/* 49 */            aFb1uSDK.AFAdRevenueData.execute(aFb1uSDK.getRevenue);
/* 56 */            this.component1 = System.currentTimeMillis();
/* 60 */            this.component4 = AFj1tSDK.AFa1tSDK.STARTED;
/* 67 */            addObserver(new AFj1tSDK.C02871());
                }
            }
