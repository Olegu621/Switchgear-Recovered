            package com.appsflyer.internal;

            import android.content.ContentProviderClient;
            import android.content.Context;
            import android.content.pm.PackageItemInfo;
            import android.content.pm.ProviderInfo;
            import android.database.Cursor;
            import android.net.Uri;
            import android.os.DeadObjectException;
            import android.os.RemoteException;
            import com.appsflyer.AFLogger;
            import com.google.firebase.analytics.FirebaseAnalytics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFj1uSDK extends AFj1tSDK {
                private final AFd1zSDK AFAdRevenueData;
                final ProviderInfo getCurrencyIso4217Code;

                public AFj1uSDK(ProviderInfo providerInfo, Runnable runnable, AFd1zSDK aFd1zSDK) {
/* 5 */             super("af_referrer", providerInfo.authority, runnable);
/* 8 */             this.AFAdRevenueData = aFd1zSDK;
/* 10 */            this.getCurrencyIso4217Code = providerInfo;
                }

                /* JADX INFO: renamed from: B_ */
                public static ContentProviderClient m1850B_(Context context, Uri uri) {
                    try {
/* 5 */                 return context.getContentResolver().acquireUnstableContentProviderClient(uri);
                    } catch (SecurityException e) {
/* 38 */                AFLogger.INSTANCE.m1814e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e, false, true, false);
/* 41 */                return null;
                    } catch (Throwable th) {
/* 22 */                AFLogger.INSTANCE.m1814e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th, false, true, false);
/* 41 */                return null;
                    }
                }

                @Override // com.appsflyer.internal.AFj1tSDK
                public final void getMonetizationNetwork(final Context context) {
/* 12 */            this.AFAdRevenueData.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1uSDK.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            Cursor cursorQuery;
/* 1 */                     AFj1uSDK aFj1uSDK = AFj1uSDK.this;
/* 7 */                     aFj1uSDK.component1 = System.currentTimeMillis();
/* 11 */                    aFj1uSDK.component4 = AFj1tSDK.AFa1tSDK.STARTED;
/* 18 */                    aFj1uSDK.addObserver(new AFj1tSDK.C02871());
/* 25 */                    StringBuilder sb = new StringBuilder("content://");
/* 34 */                    sb.append(AFj1uSDK.this.getCurrencyIso4217Code.authority);
/* 39 */                    sb.append("/transaction_id");
/* 46 */                    Uri uri = Uri.parse(sb.toString());
/* 52 */                    ContentProviderClient contentProviderClientM1850B_ = AFj1uSDK.m1850B_(context, uri);
                            try {
/* 56 */                        if (contentProviderClientM1850B_ != null) {
/* 62 */                            StringBuilder sb2 = new StringBuilder("app_id=");
/* 71 */                            sb2.append(context.getPackageName());
/* 81 */                            cursorQuery = contentProviderClientM1850B_.query(uri, null, sb2.toString(), null, null);
                                } else {
/* 147 */                           cursorQuery = null;
                                }
                            } catch (RemoteException e) {
/* 126 */                       AFLogger.INSTANCE.m1814e(AFg1cSDK.PREINSTALL, "Failed to query unstable content providerClient", e, false, true, false);
/* 147 */                       cursorQuery = null;
                            } catch (DeadObjectException e2) {
/* 139 */                       AFLogger.INSTANCE.m1814e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient", e2, false, true, false);
/* 147 */                       cursorQuery = null;
                            } catch (Throwable th) {
/* 107 */                       AFLogger.INSTANCE.m1814e(AFg1cSDK.PREINSTALL, "Error to get data from providerClient ", th, false, true, false);
/* 147 */                       cursorQuery = null;
                            } finally {
/* 143 */                       contentProviderClientM1850B_.close();
                            }
/* 150 */                   if (cursorQuery != null) {
/* 154 */                       int columnIndex = cursorQuery.getColumnIndex(FirebaseAnalytics.Param.TRANSACTION_ID);
/* 159 */                       if (columnIndex == -1) {
/* 167 */                           AFLogger.INSTANCE.m1817w(AFg1cSDK.PREINSTALL, "Wrong column name");
/* 176 */                           AFj1uSDK.this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                                } else {
/* 186 */                           AFj1uSDK.this.getMediationNetwork.put("response", "OK");
/* 193 */                           if (cursorQuery.moveToFirst()) {
/* 195 */                               String string = cursorQuery.getString(columnIndex);
/* 199 */                               cursorQuery.close();
/* 202 */                               if (string != null && !string.isEmpty()) {
/* 216 */                                   AFj1uSDK.this.getMediationNetwork.put("referrer", string);
                                        }
                                    }
                                }
/* 219 */                       cursorQuery.close();
                            } else {
/* 229 */                       AFLogger.INSTANCE.m1817w(AFg1cSDK.PREINSTALL, "ContentProvider query failed, got null Cursor");
/* 238 */                       AFj1uSDK.this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
                            }
/* 241 */                   AFj1uSDK aFj1uSDK2 = AFj1uSDK.this;
/* 261 */                   aFj1uSDK2.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1uSDK2.getCurrencyIso4217Code).packageName)));
/* 264 */                   AFj1uSDK aFj1uSDK3 = AFj1uSDK.this;
/* 280 */                   aFj1uSDK3.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, ((PackageItemInfo) aFj1uSDK3.getCurrencyIso4217Code).packageName));
/* 285 */                   AFj1uSDK.this.getMediationNetwork();
                        }
                    });
                }
            }
