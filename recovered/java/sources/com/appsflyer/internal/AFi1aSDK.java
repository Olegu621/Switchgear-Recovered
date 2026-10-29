            package com.appsflyer.internal;

            import android.content.Context;
            import androidx.core.app.NotificationCompat;
            import com.android.installreferrer.api.InstallReferrerClient;
            import com.android.installreferrer.api.InstallReferrerStateListener;
            import com.android.installreferrer.api.ReferrerDetails;
            import com.appsflyer.AFLogger;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.concurrent.ExecutorService;
            import kotlin.Pair;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 404 */   public class AFi1aSDK extends AFi1cSDK {
                final ExecutorService AFAdRevenueData;
                public final Map<String, Object> getMonetizationNetwork;

                /* JADX INFO: renamed from: com.appsflyer.internal.AFi1aSDK$3 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class C02773 implements InstallReferrerStateListener {
                    final /* synthetic */ Context val$context;
                    final /* synthetic */ InstallReferrerClient val$referrerClient;

                    public C02773(InstallReferrerClient installReferrerClient, Context context) {
/* 3 */                 this.val$referrerClient = installReferrerClient;
/* 5 */                 this.val$context = context;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i) {
/* 3 */                 AFi1aSDK.this.getMonetizationNetwork(installReferrerClient, context, i);
                    }

                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public final void onInstallReferrerServiceDisconnected() {
/* 7 */                 AFLogger.INSTANCE.m1810d(AFg1cSDK.REFERRER, "Install Referrer service disconnected");
                    }

                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public final void onInstallReferrerSetupFinished(final int i) {
/* 3 */                 ExecutorService executorService = AFi1aSDK.this.AFAdRevenueData;
/* 5 */                 final InstallReferrerClient installReferrerClient = this.val$referrerClient;
/* 7 */                 final Context context = this.val$context;
/* 14 */                executorService.execute(new Runnable() { // from class: com.appsflyer.internal.p
                            @Override // java.lang.Runnable
                            public final void run() {
/* 1 */                         this.f3114a.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i);
                            }
                        });
                    }
                }

                public AFi1aSDK(Runnable runnable, ExecutorService executorService, AFc1oSDK aFc1oSDK) {
/* 5 */             super("store", "google", aFc1oSDK, runnable);
/* 13 */            this.getMonetizationNetwork = new HashMap();
/* 15 */            this.AFAdRevenueData = executorService;
                }

                private boolean getMediationNetwork(Context context) {
/* 6 */             if (!getRevenue()) {
/* 5 */                 return false;
                    }
                    try {
/* 15 */                if (AFj1kSDK.getMonetizationNetwork(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
/* 23 */                    AFLogger.INSTANCE.m1810d(AFg1cSDK.REFERRER, "Install referrer is allowed");
/* 26 */                    return true;
                        }
/* 38 */                AFLogger.INSTANCE.m1810d(AFg1cSDK.REFERRER, "Install referrer is not allowed");
/* 5 */                 return false;
                    } catch (ClassNotFoundException e) {
/* 60 */                AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e);
/* 69 */                AFLogger.INSTANCE.m1816v(AFg1cSDK.REFERRER, "Class com.android.installreferrer.api.InstallReferrerClient not found");
/* 5 */                 return false;
                    } catch (Throwable th) {
/* 54 */                AFLogger.INSTANCE.m1811e(AFg1cSDK.REFERRER, "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
/* 5 */                 return false;
                    }
                }

                public final void getMonetizationNetwork(InstallReferrerClient installReferrerClient, Context context, int i) {
/* 15 */            this.getMonetizationNetwork.put("code", String.valueOf(i));
/* 20 */            Pair<Long, String> mediationNetwork = AFj1kSDK.getMediationNetwork(context, "com.android.vending");
/* 30 */            this.getMediationNetwork.put("api_ver", mediationNetwork.f12908a);
/* 39 */            this.getMediationNetwork.put("api_ver_name", mediationNetwork.f12909b);
/* 45 */            if (i == -1) {
/* 383 */               AFLogger.INSTANCE.m1817w(AFg1cSDK.REFERRER, "InstallReferrer SERVICE_DISCONNECTED");
/* 390 */               this.getMediationNetwork.put("response", "SERVICE_DISCONNECTED");
                    } else if (i == 0) {
/* 127 */               this.getMediationNetwork.put("response", "OK");
                        try {
/* 130 */                   AFLogger aFLogger = AFLogger.INSTANCE;
/* 132 */                   AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
/* 136 */                   aFLogger.m1810d(aFg1cSDK, "InstallReferrer connected");
/* 143 */                   if (installReferrerClient.isReady()) {
/* 145 */                       ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
/* 149 */                       String installReferrer2 = installReferrer.getInstallReferrer();
/* 153 */                       if (installReferrer2 != null) {
/* 159 */                           this.getMonetizationNetwork.put("val", installReferrer2);
/* 166 */                           this.getMediationNetwork.put("referrer", installReferrer2);
                                }
/* 175 */                       long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
/* 187 */                       this.getMonetizationNetwork.put("clk", Long.toString(referrerClickTimestampSeconds));
/* 198 */                       this.getMediationNetwork.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
/* 201 */                       long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
/* 213 */                       this.getMonetizationNetwork.put("install", Long.toString(installBeginTimestampSeconds));
/* 224 */                       this.getMediationNetwork.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
/* 229 */                       HashMap map = new HashMap();
                                try {
/* 232 */                           boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
/* 242 */                           this.getMonetizationNetwork.put("instant", Boolean.valueOf(googlePlayInstantParam));
/* 249 */                           map.put("instant", Boolean.valueOf(googlePlayInstantParam));
                                } catch (NoSuchMethodError e) {
/* 256 */                           AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e);
                                }
                                try {
/* 269 */                           map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
/* 282 */                           map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
/* 291 */                           map.put("install_version", installReferrer.getInstallVersion());
                                } catch (NoSuchMethodError e2) {
/* 306 */                           AFLogger.INSTANCE.m1813e(AFg1cSDK.REFERRER, "some method not exist", e2, false, false);
                                }
/* 313 */                       if (!map.isEmpty()) {
/* 319 */                           this.getMediationNetwork.put("google_custom", map);
                                }
/* 322 */                       installReferrerClient.endConnection();
                            } else {
/* 326 */                       aFLogger.m1817w(aFg1cSDK, "ReferrerClient: InstallReferrer is not ready");
/* 331 */                       this.getMonetizationNetwork.put(NotificationCompat.CATEGORY_ERROR, "ReferrerClient: InstallReferrer is not ready");
                            }
                        } catch (Throwable th) {
/* 335 */                   AFLogger aFLogger2 = AFLogger.INSTANCE;
/* 337 */                   AFg1cSDK aFg1cSDK2 = AFg1cSDK.REFERRER;
/* 343 */                   StringBuilder sb = new StringBuilder("Failed to get install referrer: ");
/* 350 */                   sb.append(th.getMessage());
/* 357 */                   aFLogger2.m1817w(aFg1cSDK2, sb.toString());
/* 366 */                   this.getMonetizationNetwork.put(NotificationCompat.CATEGORY_ERROR, th.getMessage());
/* 373 */                   aFLogger2.m1813e(aFg1cSDK2, "Failed to get install referrer", th, false, false);
                        }
                    } else if (i == 1) {
/* 109 */               this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
/* 118 */               AFLogger.INSTANCE.m1817w(AFg1cSDK.REFERRER, "InstallReferrer not supported");
                    } else if (i == 2) {
/* 93 */                AFLogger.INSTANCE.m1817w(AFg1cSDK.REFERRER, "InstallReferrer FEATURE_NOT_SUPPORTED");
/* 100 */               this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                    } else if (i != 3) {
/* 64 */                AFLogger.INSTANCE.m1817w(AFg1cSDK.REFERRER, "responseCode not found.");
                    } else {
/* 75 */                AFLogger.INSTANCE.m1817w(AFg1cSDK.REFERRER, "InstallReferrer DEVELOPER_ERROR");
/* 82 */                this.getMediationNetwork.put("response", "DEVELOPER_ERROR");
                    }
/* 399 */           AFLogger.INSTANCE.m1810d(AFg1cSDK.REFERRER, "Install Referrer collected locally");
/* 402 */           getMediationNetwork();
                }

                @Override // com.appsflyer.internal.AFj1tSDK
/* 405 */       public final void getMonetizationNetwork(Context context) {
/* 406 */           if (getMediationNetwork(context)) {
/* 407 */               this.component1 = System.currentTimeMillis();
/* 408 */               this.component4 = AFj1tSDK.AFa1tSDK.STARTED;
/* 409 */               addObserver(new AFj1tSDK.C02871());
                        try {
/* 410 */                   InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
/* 411 */                   AFLogger.INSTANCE.m1810d(AFg1cSDK.REFERRER, "Connecting to Install Referrer Library...");
/* 412 */                   installReferrerClientBuild.startConnection(new C02773(installReferrerClientBuild, context));
                        } catch (Throwable th) {
/* 413 */                   AFLogger.INSTANCE.m1811e(AFg1cSDK.REFERRER, "referrerClient -> startConnection", th);
                        }
                    }
                }
            }
