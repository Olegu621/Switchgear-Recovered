            package com.appsflyer.internal;

            import android.adservices.measurement.MeasurementManager;
            import android.content.Context;
            import android.net.Uri;
            import android.p003os.OutcomeReceiver;
            import com.appsflyer.AFLogger;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import kotlin.Pair;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.AbstractC0954gh;
            import p000.h22;
            import p000.oc1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001c\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0019\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u001e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010,"}, m6176d2 = {"Lcom/appsflyer/internal/AFf1wSDK;", "Lcom/appsflyer/internal/AFe1mSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/appsflyer/internal/AFe1rSDK;", "p0", "Ljava/util/concurrent/Executor;", "p1", "Lcom/appsflyer/internal/AFc1oSDK;", "p2", "Lcom/appsflyer/internal/AFc1hSDK;", "p3", "Lcom/appsflyer/internal/AFg1nSDK;", "p4", "Lcom/appsflyer/internal/AFf1eSDK;", "p5", "Lkotlin/Function1;", "Lcom/appsflyer/internal/AFe1uSDK;", "p6", "<init>", "(Lcom/appsflyer/internal/AFe1rSDK;Ljava/util/concurrent/Executor;Lcom/appsflyer/internal/AFc1oSDK;Lcom/appsflyer/internal/AFc1hSDK;Lcom/appsflyer/internal/AFg1nSDK;Lcom/appsflyer/internal/AFf1eSDK;Lkotlin/jvm/functions/Function1;)V", HttpUrl.FRAGMENT_ENCODE_SET, "AFAdRevenueData", "()J", "getRevenue", "()Lcom/appsflyer/internal/AFe1uSDK;", "getCurrencyIso4217Code", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "getMonetizationNetwork", "()Z", "component3", "Ljava/util/concurrent/Executor;", "getMediationNetwork", "component4", "Lcom/appsflyer/internal/AFc1hSDK;", "component2", "Lcom/appsflyer/internal/AFe1rSDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFg1nSDK;", "component1", "Lcom/appsflyer/internal/AFc1oSDK;", "equals", "Lkotlin/jvm/functions/Function1;", "toString", "Lcom/appsflyer/internal/AFf1eSDK;"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class AFf1wSDK extends AFe1mSDK<Unit> {

                /* JADX INFO: renamed from: areAllFieldsValid, reason: from kotlin metadata */
                public AFg1nSDK getCurrencyIso4217Code;

                /* JADX INFO: renamed from: component1, reason: from kotlin metadata */
                public AFc1oSDK getRevenue;

                /* JADX INFO: renamed from: component2, reason: from kotlin metadata */
                public AFe1rSDK AFAdRevenueData;

                /* JADX INFO: renamed from: component3, reason: from kotlin metadata */
                public Executor getMediationNetwork;

                /* JADX INFO: renamed from: component4, reason: from kotlin metadata */
                public AFc1hSDK getMonetizationNetwork;

                /* JADX INFO: renamed from: equals, reason: from kotlin metadata */
                public Function1<AFe1uSDK, Unit> component4;

                /* JADX INFO: renamed from: toString, reason: from kotlin metadata */
                public AFf1eSDK component3;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class AFa1uSDK implements OutcomeReceiver {
                    private /* synthetic */ h22 AFAdRevenueData;
                    private /* synthetic */ CountDownLatch getCurrencyIso4217Code;
                    private /* synthetic */ AFf1wSDK getRevenue;

                    public AFa1uSDK(h22 h22Var, CountDownLatch countDownLatch, AFf1wSDK aFf1wSDK) {
/* 1 */                 this.AFAdRevenueData = h22Var;
/* 3 */                 this.getCurrencyIso4217Code = countDownLatch;
/* 5 */                 this.getRevenue = aFf1wSDK;
                    }

                    public final /* synthetic */ void onError(Throwable th) {
/* 1 */                 Exception exc = (Exception) th;
/* 3 */                 exc.getClass();
/* 6 */                 AFf1wSDK.getMediationNetwork(exc);
/* 11 */                this.getCurrencyIso4217Code.countDown();
                    }

                    public final void onResult(Object obj) {
/* 1 */                 obj.getClass();
/* 8 */                 this.AFAdRevenueData.f8873a = AFe1uSDK.SUCCESS;
/* 17 */                AFLogger.INSTANCE.mo1747d(AFg1cSDK.PRIVACY_SANDBOX, "Privacy Sandbox trigger has been registered successfully. ", true);
/* 22 */                this.getCurrencyIso4217Code.countDown();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AFf1wSDK(AFe1rSDK aFe1rSDK, Executor executor, AFc1oSDK aFc1oSDK, AFc1hSDK aFc1hSDK, AFg1nSDK aFg1nSDK, AFf1eSDK aFf1eSDK, Function1<? super AFe1uSDK, Unit> function1) {
/* 33 */            super(AFe1pSDK.REGISTER_TRIGGER, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, null);
/* 1 */             aFe1rSDK.getClass();
/* 4 */             executor.getClass();
/* 7 */             aFc1oSDK.getClass();
/* 10 */            aFc1hSDK.getClass();
/* 13 */            aFg1nSDK.getClass();
/* 16 */            aFf1eSDK.getClass();
/* 19 */            function1.getClass();
/* 36 */            this.AFAdRevenueData = aFe1rSDK;
/* 38 */            this.getMediationNetwork = executor;
/* 40 */            this.getRevenue = aFc1oSDK;
/* 42 */            this.getMonetizationNetwork = aFc1hSDK;
/* 44 */            this.getCurrencyIso4217Code = aFg1nSDK;
/* 46 */            this.component3 = aFf1eSDK;
/* 48 */            this.component4 = function1;
/* 52 */            if (aFe1rSDK instanceof AFe1rSDK.AFa1tSDK) {
/* 58 */                this.AFAdRevenueData.add(AFe1pSDK.CONVERSION);
                    }
/* 65 */            if (this.AFAdRevenueData instanceof AFe1rSDK.AFa1uSDK) {
/* 71 */                this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
                    }
/* 78 */            if (this.AFAdRevenueData instanceof AFe1rSDK.AFa1zSDK) {
/* 84 */                this.getCurrencyIso4217Code.add(AFe1pSDK.INAPP);
                    }
                }

                public static final /* synthetic */ void getMediationNetwork(Throwable th) {
/* 20 */            AFLogger.INSTANCE.mo1748e(AFg1cSDK.PRIVACY_SANDBOX, AbstractC0886en.m3507k("Error occurred: ", th.getMessage()), th, false, false, false, true);
                }

                @Override // com.appsflyer.internal.AFe1mSDK
                public final long AFAdRevenueData() {
/* 1 */             return 20000L;
                }

                @Override // com.appsflyer.internal.AFe1mSDK
                public final void getCurrencyIso4217Code() {
/* 1 */             super.getCurrencyIso4217Code();
/* 4 */             AFe1uSDK aFe1uSDK = this.getMonetizationNetwork;
/* 6 */             if (aFe1uSDK != null) {
/* 10 */                this.component4.invoke(aFe1uSDK);
                    }
                }

                @Override // com.appsflyer.internal.AFe1mSDK
                public final boolean getMonetizationNetwork() {
/* 1 */             return false;
                }

                @Override // com.appsflyer.internal.AFe1mSDK
                public final AFe1uSDK getRevenue() {
                    MeasurementManager measurementManagerM3928d;
/* 3 */             h22 h22Var = new h22();
/* 8 */             h22Var.f8873a = AFe1uSDK.FAILURE;
/* 13 */            CountDownLatch countDownLatch = new CountDownLatch(1);
                    try {
/* 18 */                Context context = this.getMonetizationNetwork.getMonetizationNetwork;
/* 20 */                if (context != null && (measurementManagerM3928d = AbstractC0954gh.m3928d(context.getSystemService(AbstractC0954gh.m3935k()))) != null) {
/* 42 */                    new AFj1cSDK(this.getRevenue, null, 2, null);
/* 53 */                    Uri.Builder builderBuildUpon = Uri.parse(AFj1cSDK.getMediationNetwork()).buildUpon();
/* 59 */                    String strAreAllFieldsValid = this.getRevenue.areAllFieldsValid();
/* 63 */                    if (strAreAllFieldsValid == null) {
/* 65 */                        strAreAllFieldsValid = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
/* 177 */                   LinkedHashMap linkedHashMapM7132f = oc1.m7132f(new Pair("event_name", this.AFAdRevenueData.getMediationNetwork), new Pair("app_id", this.getRevenue.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName()), new Pair("app_version", this.getRevenue.m1787n_().versionName), new Pair("sdk_version", AFc1oSDK.getMonetizationNetwork()), new Pair("api_version", AFc1oSDK.getCurrencyIso4217Code()), new Pair("timestamp", String.valueOf(this.getCurrencyIso4217Code.getCurrencyIso4217Code())), new Pair("request_id", AFc1oSDK.getMediationNetwork()), new Pair("gaid", strAreAllFieldsValid));
/* 185 */                   String currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(this.getRevenue.getMediationNetwork);
/* 189 */                   if (currencyIso4217Code != null) {
/* 193 */                       linkedHashMapM7132f.put("appsflyer_id", currencyIso4217Code);
                            }
/* 198 */                   Long monetizationNetwork = this.getCurrencyIso4217Code.getMonetizationNetwork();
/* 202 */                   if (monetizationNetwork != null) {
/* 214 */                       linkedHashMapM7132f.put("install_time", String.valueOf(monetizationNetwork.longValue()));
                            }
/* 217 */                   AFe1rSDK aFe1rSDK = this.AFAdRevenueData;
/* 221 */                   if (aFe1rSDK instanceof AFe1rSDK.AFa1zSDK) {
/* 225 */                       Float f = ((AFe1rSDK.AFa1zSDK) aFe1rSDK).getCurrencyIso4217Code;
/* 227 */                       if (f != null) {
/* 239 */                           linkedHashMapM7132f.put("event_revenue", String.valueOf(f.floatValue()));
                                }
/* 246 */                       Integer num = ((AFe1rSDK.AFa1zSDK) this.AFAdRevenueData).AFAdRevenueData;
/* 248 */                       if (num != null) {
/* 260 */                           linkedHashMapM7132f.put("event_count", String.valueOf(num.intValue()));
                                }
                            }
/* 275 */                   for (Map.Entry entry : linkedHashMapM7132f.entrySet()) {
/* 295 */                       builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                            }
/* 299 */                   Uri uriBuild = builderBuildUpon.build();
/* 303 */                   uriBuild.getClass();
/* 1 */                     measurementManagerM3928d.registerTrigger(uriBuild, this.getMediationNetwork, new AFa1uSDK(h22Var, countDownLatch, this));
                        }
/* 320 */               countDownLatch.await(4L, TimeUnit.SECONDS);
                    } catch (InterruptedException unused) {
/* 348 */               h22Var.f8873a = AFe1uSDK.TIMEOUT;
                    } catch (Throwable th) {
/* 342 */               AFLogger.INSTANCE.mo1748e(AFg1cSDK.PRIVACY_SANDBOX, AbstractC0886en.m3507k("Error occurred: ", th.getMessage()), th, false, false, false, true);
                    }
/* 352 */           return (AFe1uSDK) h22Var.f8873a;
                }
            }
