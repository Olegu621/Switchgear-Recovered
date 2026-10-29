            package com.appsflyer.internal;

            import android.content.Context;
            import com.appsflyer.AFLogger;
            import com.miui.referrer.api.GetAppsReferrerClient;
            import com.miui.referrer.api.GetAppsReferrerDetails;
            import com.miui.referrer.api.GetAppsReferrerStateListener;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 44 */    public final class AFj1oSDK extends AFi1cSDK {
                public AFj1oSDK(AFc1oSDK aFc1oSDK, Runnable runnable) {
/* 5 */             super("store", "xiaomi", aFc1oSDK, runnable);
                }

                private boolean getMonetizationNetwork() {
/* 6 */             if (!getRevenue()) {
/* 5 */                 return false;
                    }
                    try {
/* 11 */                Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
/* 20 */                AFLogger.INSTANCE.m1810d(AFg1cSDK.REFERRER, "Xiaomi Install Referrer is allowed");
/* 23 */                return true;
                    } catch (ClassNotFoundException unused) {
/* 42 */                AFLogger.INSTANCE.m1816v(AFg1cSDK.REFERRER, "Class com.miui.referrer.api.GetAppsReferrerClient not found");
/* 5 */                 return false;
                    } catch (Throwable th) {
/* 32 */                AFLogger.INSTANCE.m1811e(AFg1cSDK.REFERRER, "An error occurred while trying to access GetAppsReferrerClient", th);
/* 5 */                 return false;
                    }
                }

                @Override // com.appsflyer.internal.AFj1tSDK
/* 45 */        public final void getMonetizationNetwork(final Context context) {
/* 46 */            if (getMonetizationNetwork()) {
/* 47 */                this.component1 = System.currentTimeMillis();
/* 48 */                this.component4 = AFj1tSDK.AFa1tSDK.STARTED;
/* 49 */                addObserver(new AFj1tSDK.C02871());
/* 50 */                final GetAppsReferrerClient getAppsReferrerClientBuild = GetAppsReferrerClient.Companion.newBuilder(context).build();
/* 51 */                getAppsReferrerClientBuild.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.internal.AFj1oSDK.5
                            public final void onGetAppsReferrerSetupFinished(int i) {
/* 19 */                        AFj1oSDK.this.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, "com.xiaomi.mipicks")));
/* 34 */                        AFj1oSDK.this.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, "com.xiaomi.mipicks"));
/* 40 */                        if (i == -1) {
/* 307 */                           AFLogger.INSTANCE.m1817w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer SERVICE_DISCONNECTED");
/* 316 */                           AFj1oSDK.this.getMediationNetwork.put("response", "SERVICE_DISCONNECTED");
                                } else if (i == 0) {
/* 145 */                           AFj1oSDK aFj1oSDK = AFj1oSDK.this;
/* 147 */                           GetAppsReferrerClient getAppsReferrerClient = getAppsReferrerClientBuild;
/* 153 */                           aFj1oSDK.getMediationNetwork.put("response", "OK");
                                    try {
/* 156 */                               AFLogger aFLogger = AFLogger.INSTANCE;
/* 158 */                               AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
/* 162 */                               aFLogger.m1810d(aFg1cSDK, "XiaomiInstallReferrer connected");
/* 169 */                               if (getAppsReferrerClient.isReady()) {
/* 171 */                                   GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
/* 175 */                                   String installReferrer2 = installReferrer.getInstallReferrer();
/* 179 */                                   if (installReferrer2 != null) {
/* 185 */                                       aFj1oSDK.getMediationNetwork.put("referrer", installReferrer2);
                                            }
/* 203 */                                   aFj1oSDK.getMediationNetwork.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
/* 218 */                                   aFj1oSDK.getMediationNetwork.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
/* 223 */                                   HashMap map = new HashMap();
/* 236 */                                   map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
/* 249 */                                   map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
/* 258 */                                   map.put("install_version", installReferrer.getInstallVersion());
/* 265 */                                   aFj1oSDK.getMediationNetwork.put("xiaomi_custom", map);
                                        } else {
/* 271 */                                   aFLogger.m1817w(aFg1cSDK, "XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                                        }
                                    } catch (Throwable th) {
/* 275 */                               AFLogger aFLogger2 = AFLogger.INSTANCE;
/* 277 */                               AFg1cSDK aFg1cSDK2 = AFg1cSDK.REFERRER;
/* 283 */                               StringBuilder sb = new StringBuilder("Failed to get Xiaomi install referrer: ");
/* 290 */                               sb.append(th.getMessage());
/* 297 */                               aFLogger2.m1817w(aFg1cSDK2, sb.toString());
                                    }
                                } else if (i == 1) {
/* 131 */                           AFj1oSDK.this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
/* 140 */                           AFLogger.INSTANCE.m1817w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer not supported");
                                } else if (i == 2) {
/* 111 */                           AFLogger.INSTANCE.m1817w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
/* 120 */                           AFj1oSDK.this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                                } else if (i == 3) {
/* 91 */                            AFLogger.INSTANCE.m1817w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
/* 100 */                           AFj1oSDK.this.getMediationNetwork.put("response", "DEVELOPER_ERROR");
                                } else if (i != 4) {
/* 64 */                            AFLogger.INSTANCE.m1817w(AFg1cSDK.REFERRER, "responseCode not found.");
                                } else {
/* 73 */                            AFLogger.INSTANCE.m1817w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
/* 82 */                            AFj1oSDK.this.getMediationNetwork.put("response", "PERMISSION_ERROR");
                                }
/* 325 */                       AFLogger.INSTANCE.m1810d(AFg1cSDK.REFERRER, "Xiaomi Install Referrer collected locally");
/* 330 */                       AFj1oSDK.this.getMediationNetwork();
/* 335 */                       getAppsReferrerClientBuild.endConnection();
                            }

                            public final void onGetAppsServiceDisconnected() {
                            }
                        });
                    }
                }
            }
