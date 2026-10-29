            package com.appsflyer.internal;

            import android.content.Context;
            import android.content.pm.PackageItemInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.ProviderInfo;
            import com.appsflyer.AFLogger;
            import java.security.NoSuchAlgorithmException;
            import java.security.cert.CertificateException;
            import java.util.Arrays;
            import java.util.concurrent.Callable;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.FutureTask;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AFb1uSDK<T> {
                public final Executor AFAdRevenueData;
                private final String[] getCurrencyIso4217Code;
                public final String getMediationNetwork;
                public final Context getMonetizationNetwork;
                public final FutureTask<T> getRevenue = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.AFb1uSDK.1
                    @Override // java.util.concurrent.Callable
                    public final T call() {
/* 7 */                 if (AFb1uSDK.this.getCurrencyIso4217Code()) {
/* 11 */                    return (T) AFb1uSDK.this.getRevenue();
                        }
/* 16 */                return null;
                    }
                });

                public AFb1uSDK(Context context, Executor executor, String str, String... strArr) {
/* 16 */            this.getMonetizationNetwork = context;
/* 18 */            this.getMediationNetwork = str;
/* 20 */            this.getCurrencyIso4217Code = strArr;
/* 22 */            this.AFAdRevenueData = executor;
                }

                public final boolean getCurrencyIso4217Code() {
                    try {
/* 13 */                ProviderInfo providerInfoResolveContentProvider = this.getMonetizationNetwork.getPackageManager().resolveContentProvider(this.getMediationNetwork, 128);
                        return providerInfoResolveContentProvider != null && Arrays.asList(this.getCurrencyIso4217Code).contains(AFj1kSDK.m1831N_(this.getMonetizationNetwork.getPackageManager(), ((PackageItemInfo) providerInfoResolveContentProvider).packageName));
                    } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e) {
/* 55 */                AFLogger.afErrorLog(e.getMessage(), e, false, true);
/* 2 */                 return false;
                    }
                }

                public T getMonetizationNetwork() {
                    try {
/* 9 */                 return this.getRevenue.get(500L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
/* 16 */                e = e;
/* 25 */                AFLogger.afErrorLog(e.getMessage(), e, false, true);
/* 1 */                 return null;
                    } catch (ExecutionException e2) {
/* 14 */                e = e2;
/* 25 */                AFLogger.afErrorLog(e.getMessage(), e, false, true);
/* 1 */                 return null;
                    } catch (TimeoutException e3) {
/* 33 */                AFLogger.afErrorLog(e3.getMessage(), e3, false, false);
/* 1 */                 return null;
                    }
                }

                public abstract T getRevenue();
            }
