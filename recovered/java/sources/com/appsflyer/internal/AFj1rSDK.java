            package com.appsflyer.internal;

            import android.content.ContentProviderClient;
            import android.content.Context;
            import android.database.Cursor;
            import android.net.Uri;
            import com.appsflyer.AFLogger;
            import com.appsflyer.AdRevenueScheme;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Date;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.concurrent.ExecutorService;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 40 */    public final class AFj1rSDK extends AFi1cSDK {
                private final ExecutorService getCurrencyIso4217Code;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AFj1rSDK(ExecutorService executorService, AFc1oSDK aFc1oSDK, Runnable runnable) {
/* 14 */            super("preload", "samsung", aFc1oSDK, runnable);
/* 1 */             executorService.getClass();
/* 4 */             aFc1oSDK.getClass();
/* 7 */             runnable.getClass();
/* 17 */            this.getCurrencyIso4217Code = executorService;
                }

                private final boolean AFAdRevenueData(Context context) {
/* 6 */             if (!getRevenue()) {
/* 17 */                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
/* 5 */                 return false;
                    }
/* 25 */            if (getCurrencyIso4217Code(context)) {
/* 40 */                return true;
                    }
/* 36 */            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by missing content provider.", false, 4, null);
/* 5 */             return false;
                }

                /* JADX INFO: renamed from: C_ */
                private static boolean m1841C_(Cursor cursor) {
/* 3 */             int columnIndex = cursor.getColumnIndex("RESULT");
/* 8 */             if (columnIndex != -1) {
/* 14 */                return Boolean.parseBoolean(cursor.getString(columnIndex));
                    }
/* 28 */            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "No such column", false, 4, null);
/* 31 */            return false;
                }

                private static boolean getCurrencyIso4217Code(Context context) {
                    return context.getPackageManager().resolveContentProvider("com.samsung.android.mapsagent.providers.apptracking", 0) != null;
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code duplicated, block: B:45:0x0103  */
                /* JADX WARN: Code duplicated, block: B:48:0x0115  */
                /* JADX WARN: Code duplicated, block: B:55:0x012e  */
                /* JADX WARN: Code duplicated, block: B:57:0x0133  */
                public static final void getRevenue(AFj1rSDK aFj1rSDK, Context context) {
                    Throwable th;
                    ContentProviderClient contentProviderClient;
                    Cursor cursorQuery;
                    Date monetizationNetwork;
/* 3 */             aFj1rSDK.getClass();
/* 6 */             context.getClass();
/* 13 */            aFj1rSDK.component1 = System.currentTimeMillis();
/* 17 */            aFj1rSDK.component4 = AFj1tSDK.AFa1tSDK.STARTED;
/* 24 */            aFj1rSDK.addObserver(new AFj1tSDK.C02871());
/* 27 */            Cursor cursor = null;
/* 27 */            lValueOf = null;
/* 27 */            Long lValueOf = null;
/* 27 */            cursor = null;
                    try {
/* 30 */                Uri uri = Uri.parse("content://com.samsung.android.mapsagent.providers.apptracking/info");
/* 38 */                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
/* 42 */                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            try {
/* 56 */                        cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, context.getPackageName(), new String[]{"appsflyer001"}, null);
                            } catch (Throwable th2) {
/* 63 */                        th = th2;
/* 64 */                        contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                                try {
/* 298 */                           AFLogger.INSTANCE.mo1748e(AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th, false, false, true, true);
/* 301 */                           if (cursor != null) {
/* 303 */                               cursor.close();
                                    }
/* 306 */                           if (contentProviderClient != null) {
/* 308 */                               contentProviderClient.close();
                                    }
/* 311 */                           aFj1rSDK.getMediationNetwork();
                                } catch (Throwable th3) {
/* 317 */                           if (cursor != null) {
/* 319 */                               cursor.close();
                                    }
/* 322 */                           if (contentProviderClient == null) {
/* 327 */                               throw th3;
                                    }
/* 324 */                           contentProviderClient.close();
/* 327 */                           throw th3;
                                }
                            }
                        } else {
/* 67 */                    cursorQuery = null;
                        }
/* 68 */                if (cursorQuery != null) {
                            try {
/* 74 */                        if (cursorQuery.moveToFirst()) {
/* 82 */                            if (m1841C_(cursorQuery)) {
/* 86 */                                String strM1824P_ = AFj1eSDK.m1824P_(cursorQuery, "INSTALLED_TIME_TEXT");
/* 90 */                                if (strM1824P_ != null && (monetizationNetwork = AFj1jSDK.getMonetizationNetwork(strM1824P_, "yy:MM:dd:hh:mm")) != null) {
/* 107 */                                   lValueOf = Long.valueOf(monetizationNetwork.getTime() / 1000);
                                        }
/* 117 */                               if (lValueOf != null) {
/* 119 */                                   long jLongValue = lValueOf.longValue();
/* 123 */                                   Map<String, Object> map = aFj1rSDK.getMediationNetwork;
/* 125 */                                   map.getClass();
/* 134 */                                   map.put("install_begin_ts", Long.valueOf(jLongValue));
                                        }
/* 139 */                               LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 144 */                               String strM1824P_2 = AFj1eSDK.m1824P_(cursorQuery, "MAPS_ID");
/* 148 */                               if (strM1824P_2 != null) {
/* 152 */                                   linkedHashMap.put("maps_id", strM1824P_2);
                                        }
/* 157 */                               String strM1824P_3 = AFj1eSDK.m1824P_(cursorQuery, "DEVICE_NAME");
/* 161 */                               if (strM1824P_3 != null) {
/* 165 */                                   linkedHashMap.put("device_model", strM1824P_3);
                                        }
/* 170 */                               String strM1824P_4 = AFj1eSDK.m1824P_(cursorQuery, "COUNTRY");
/* 174 */                               if (strM1824P_4 != null) {
/* 178 */                                   linkedHashMap.put(AdRevenueScheme.COUNTRY, strM1824P_4);
                                        }
/* 183 */                               String strM1824P_5 = AFj1eSDK.m1824P_(cursorQuery, "CAMPAIGN_ID");
/* 187 */                               if (strM1824P_5 != null) {
/* 191 */                                   linkedHashMap.put(FirebaseAnalytics.Param.CAMPAIGN_ID, strM1824P_5);
                                        }
/* 198 */                               if (!linkedHashMap.isEmpty()) {
/* 200 */                                   Map<String, Object> map2 = aFj1rSDK.getMediationNetwork;
/* 202 */                                   map2.getClass();
/* 207 */                                   map2.put("samsung_custom", linkedHashMap);
                                        }
/* 210 */                               Map<String, Object> map3 = aFj1rSDK.getMediationNetwork;
/* 212 */                               map3.getClass();
/* 225 */                               map3.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, "com.samsung.android.mapsagent")));
/* 228 */                               Map<String, Object> map4 = aFj1rSDK.getMediationNetwork;
/* 230 */                               map4.getClass();
/* 239 */                               map4.put("api_ver_name", AFj1kSDK.getRevenue(context, "com.samsung.android.mapsagent"));
                                    } else {
/* 252 */                               AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "App was not installed via Samsung MAPS.", false, 4, null);
                                    }
/* 255 */                           cursorQuery.close();
/* 258 */                           if (contentProviderClientAcquireUnstableContentProviderClient != null) {
/* 260 */                               contentProviderClientAcquireUnstableContentProviderClient.close();
                                    }
                                } else {
/* 273 */                           AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Content provider returned no data", false, 4, null);
/* 276 */                           if (cursorQuery != null) {
/* 278 */                               cursorQuery.close();
                                    }
/* 281 */                           if (contentProviderClientAcquireUnstableContentProviderClient != null) {
/* 260 */                               contentProviderClientAcquireUnstableContentProviderClient.close();
                                    }
                                }
                            } catch (Throwable th4) {
/* 114 */                       th = th4;
/* 115 */                       cursor = cursorQuery;
/* 64 */                        contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
/* 298 */                       AFLogger.INSTANCE.mo1748e(AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th, false, false, true, true);
/* 301 */                       if (cursor != null) {
/* 303 */                           cursor.close();
                                }
/* 306 */                       if (contentProviderClient != null) {
/* 308 */                           contentProviderClient.close();
                                }
                            }
                        } else {
/* 273 */                   AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Content provider returned no data", false, 4, null);
/* 276 */                   if (cursorQuery != null) {
/* 278 */                       cursorQuery.close();
                            }
/* 281 */                   if (contentProviderClientAcquireUnstableContentProviderClient != null) {
/* 260 */                       contentProviderClientAcquireUnstableContentProviderClient.close();
                            }
                        }
                    } catch (Throwable th5) {
/* 286 */               th = th5;
/* 287 */               contentProviderClient = null;
                    }
/* 311 */           aFj1rSDK.getMediationNetwork();
                }

                @Override // com.appsflyer.internal.AFj1tSDK
                public final void getMonetizationNetwork(Context context) {
/* 1 */             context.getClass();
/* 8 */             if (AFAdRevenueData(context)) {
/* 19 */                this.getCurrencyIso4217Code.execute(new RunnableC0295g(3, this, context));
                    }
                }

                @Override // com.appsflyer.internal.AFj1tSDK
/* 41 */        public final void AFAdRevenueData() {
                }
            }
