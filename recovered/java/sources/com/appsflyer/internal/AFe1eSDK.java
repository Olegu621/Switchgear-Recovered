            package com.appsflyer.internal;

            import android.content.Context;
            import com.appsflyer.AFLogger;
            import com.appsflyer.AppsFlyerProperties;
            import com.google.android.gms.ads.identifier.AdvertisingIdClient;
            import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
            import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
            import java.util.Map;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.collections.C1839a;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.C2085pw;
            import p000.b51;
            import p000.p51;
            import p000.pr0;
            import p000.qr0;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0012J\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0014\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u0016*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u000e\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u000e\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0013\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0015\u0010\u001e\u001a\u00020\u00188BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b&\u0010)R\u001b\u0010\u000e\u001a\u00020\u00078CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b'\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\t"}, m6176d2 = {"Lcom/appsflyer/internal/AFe1eSDK;", "Lcom/appsflyer/internal/AFe1mSDK;", "Lcom/appsflyer/internal/AFh1rSDK;", "Lcom/appsflyer/internal/AFd1zSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFd1zSDK;)V", HttpUrl.FRAGMENT_ENCODE_SET, "copydefault", "()Z", HttpUrl.FRAGMENT_ENCODE_SET, "getCurrencyIso4217Code", "(I)Z", "Landroid/content/Context;", "getRevenue", "(Landroid/content/Context;)I", "Lcom/appsflyer/internal/AFe1eSDK$AFa1uSDK;", "p1", "(Landroid/content/Context;Lcom/appsflyer/internal/AFe1eSDK$AFa1uSDK;)Z", "getMonetizationNetwork", "getMediationNetwork", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "(Lcom/appsflyer/internal/AFh1rSDK;Ljava/lang/String;)V", HttpUrl.FRAGMENT_ENCODE_SET, "AFAdRevenueData", "()J", "Lcom/appsflyer/internal/AFe1uSDK;", "()Lcom/appsflyer/internal/AFe1uSDK;", "Lcom/appsflyer/internal/AFc1hSDK;", "component4", "Lcom/appsflyer/internal/AFc1hSDK;", "Lcom/appsflyer/internal/AFc1oSDK;", "component1", "Lcom/appsflyer/internal/AFc1oSDK;", "Lcom/appsflyer/internal/AFc1eSDK;", "component2", "Lcom/appsflyer/internal/AFc1eSDK;", "areAllFieldsValid", "component3", "Lcom/appsflyer/internal/AFh1rSDK;", "Lp51;", "copy", "AFa1tSDK", "AFa1uSDK"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 4 */     public final class AFe1eSDK extends AFe1mSDK<AFh1rSDK> {

                /* JADX INFO: renamed from: areAllFieldsValid, reason: from kotlin metadata */
                private final p51 component4;

                /* JADX INFO: renamed from: component1, reason: from kotlin metadata */
                private final AFc1oSDK getMonetizationNetwork;

                /* JADX INFO: renamed from: component2, reason: from kotlin metadata */
                private final AFc1eSDK areAllFieldsValid;

                /* JADX INFO: renamed from: component3, reason: from kotlin metadata */
                private final AFh1rSDK AFAdRevenueData;

                /* JADX INFO: renamed from: component4, reason: from kotlin metadata */
                private final AFc1hSDK getCurrencyIso4217Code;

                /* JADX INFO: renamed from: copy, reason: from kotlin metadata */
                private final p51 getRevenue;

                /* JADX INFO: renamed from: com.appsflyer.internal.AFe1eSDK$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m6176d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "invoke", "()Ljava/lang/Boolean;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02581 extends b51 implements Function0<Boolean> {
                    public C02581() {
/* 4 */                 super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
/* 17 */                return Boolean.valueOf(Boolean.parseBoolean(AFe1eSDK.this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.enable_instant_plays")));
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.internal.AFe1eSDK$4 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m6176d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "invoke", "()Ljava/lang/Long;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02594 extends b51 implements Function0<Long> {
                    public C02594() {
/* 4 */                 super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Long invoke() {
                        Long lM6238N;
/* 9 */                 String currencyIso4217Code = AFe1eSDK.this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.fetch_ids.timeout");
/* 28 */                return Long.valueOf((currencyIso4217Code == null || (lM6238N = StringsKt.m6238N(currencyIso4217Code)) == null) ? 1000L : lM6238N.longValue());
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, m6176d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", HttpUrl.FRAGMENT_ENCODE_SET, "reason", HttpUrl.FRAGMENT_ENCODE_SET, "onSuccess", "kinds", HttpUrl.FRAGMENT_ENCODE_SET, "SDK_prodRelease"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class AFa1ySDK implements CloudDevCallback {
                    final /* synthetic */ AFa1uSDK $fetchGaidData;
                    final /* synthetic */ CountDownLatch $latch;

                    public AFa1ySDK(AFa1uSDK aFa1uSDK, CountDownLatch countDownLatch) {
/* 1 */                 this.$fetchGaidData = aFa1uSDK;
/* 3 */                 this.$latch = countDownLatch;
                    }

                    public final void onError(String reason) {
/* 1 */                 reason.getClass();
/* 17 */                AFh1ySDK.w$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, AbstractC0886en.m3507k("Could not fetch GAID using CloudDevSdk: ", reason), false, 4, null);
/* 22 */                StringBuilder gaidError = this.$fetchGaidData.getGaidError();
/* 26 */                gaidError.append(reason);
/* 31 */                gaidError.append(" |");
/* 36 */                this.$latch.countDown();
                    }

                    public final void onSuccess(Map<String, String> kinds) {
/* 1 */                 kinds.getClass();
/* 13 */                AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
/* 26 */                this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
/* 31 */                this.$latch.countDown();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AFe1eSDK(AFd1zSDK aFd1zSDK) {
/* 11 */            super(AFe1pSDK.FETCH_ADVERTISING_ID, new AFe1pSDK[0], "FetchAdvertisingIdTask");
/* 1 */             aFd1zSDK.getClass();
/* 14 */            AFc1hSDK aFc1hSDKAFInAppEventParameterName = aFd1zSDK.AFInAppEventParameterName();
/* 18 */            aFc1hSDKAFInAppEventParameterName.getClass();
/* 21 */            this.getCurrencyIso4217Code = aFc1hSDKAFInAppEventParameterName;
/* 23 */            AFc1oSDK aFc1oSDKAFAdRevenueData = aFd1zSDK.AFAdRevenueData();
/* 27 */            aFc1oSDKAFAdRevenueData.getClass();
/* 30 */            this.getMonetizationNetwork = aFc1oSDKAFAdRevenueData;
/* 32 */            AFc1eSDK aFc1eSDKForce = aFd1zSDK.force();
/* 36 */            aFc1eSDKForce.getClass();
/* 39 */            this.areAllFieldsValid = aFc1eSDKForce;
/* 57 */            this.AFAdRevenueData = new AFh1rSDK(null, null, null, null, null, null, null, null, 255, null);
/* 68 */            this.component4 = r51.m8065b(new C02594());
/* 79 */            this.getRevenue = r51.m8065b(new C02581());
                }

                private static boolean component2() {
                    try {
/* 3 */                 Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
/* 6 */                 return true;
                    } catch (Throwable th) {
/* 41 */                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, th instanceof ClassNotFoundException ? "CloudDevSdk not found" : AbstractC0886en.m3507k("Unexpected exception while checking if running in cloud environment: ", th.getMessage()), th, true, false, false, false, 112, null);
/* 44 */                return false;
                    }
                }

                private final boolean component3() {
/* 9 */             return ((Boolean) this.getRevenue.getValue()).booleanValue();
                }

                /* JADX WARN: Code duplicated, block: B:15:0x0045 A[LOOP:0: B:3:0x0005->B:15:0x0045, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:19:0x0048 A[EDGE_INSN: B:19:0x0048->B:16:0x0048 BREAK  A[LOOP:0: B:3:0x0005->B:15:0x0045], SYNTHETIC] */
                private final boolean copydefault() {
/* 5 */             boolean z = false;
/* 6 */             for (int i = 2; i > 0; i--) {
/* 13 */                if (component3() && getMonetizationNetwork(i)) {
/* 30 */                    AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using Samsung Cloud dev SDK", false, 4, null);
                        } else {
/* 39 */                    if (getCurrencyIso4217Code(i)) {
/* 50 */                        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using GMS", false, 4, null);
                            } else {
/* 64 */                        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Failed to fetch GAID", false, 4, null);
/* 67 */                        z = false;
                            }
/* 68 */                    if (!z) {
                                break;
                            }
                        }
/* 33 */                z = true;
/* 68 */                if (!z) {
                            break;
                            break;
                        }
                    }
/* 77 */            this.areAllFieldsValid.component3 = this.AFAdRevenueData;
/* 79 */            return z;
                }

                /* JADX WARN: Code duplicated, block: B:9:0x004d  */
                private final boolean getCurrencyIso4217Code(int p0) {
                    boolean z;
/* 10 */            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Trying to fetch GAID...", false, 4, null);
/* 22 */            AFa1uSDK aFa1uSDK = new AFa1uSDK(null, null, false, null, 15, null);
/* 27 */            Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
/* 29 */            context.getClass();
/* 32 */            int revenue = getRevenue(context);
/* 38 */            Context context2 = this.getCurrencyIso4217Code.getMonetizationNetwork;
/* 40 */            context2.getClass();
/* 49 */            if (!getCurrencyIso4217Code(context2, aFa1uSDK)) {
/* 61 */                if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
/* 65 */                    Context context3 = this.getCurrencyIso4217Code.getMonetizationNetwork;
/* 67 */                    context3.getClass();
/* 74 */                    if (getRevenue(context3, aFa1uSDK)) {
/* 76 */                        z = true;
                            } else {
/* 78 */                        z = false;
                            }
                        } else {
/* 78 */                    z = false;
                        }
/* 83 */                String string = aFa1uSDK.getGaidError().toString();
/* 91 */                if (!StringsKt.m6228D(string)) {
/* 118 */                   string = revenue + ": " + StringsKt.m6239O(string).toString();
                        }
/* 124 */               getRevenue(this.AFAdRevenueData, string);
/* 127 */               if (!z) {
/* 47 */                    return false;
                        }
                    }
/* 130 */           AFh1rSDK aFh1rSDK = this.AFAdRevenueData;
/* 136 */           aFh1rSDK.getMonetizationNetwork = aFa1uSDK.getAdvertisingId();
/* 142 */           aFh1rSDK.component2 = aFa1uSDK.isLimitAdTrackingEnabled();
/* 144 */           Boolean boolIsLimitAdTrackingEnabled = aFa1uSDK.isLimitAdTrackingEnabled();
/* 161 */           aFh1rSDK.AFAdRevenueData = boolIsLimitAdTrackingEnabled != null ? Boolean.valueOf(!boolIsLimitAdTrackingEnabled.booleanValue()) : null;
/* 171 */           aFh1rSDK.getRevenue = Boolean.valueOf(aFa1uSDK.getAdvertisingIdWithGps());
/* 175 */           aFh1rSDK.getCurrencyIso4217Code = Boolean.FALSE;
/* 185 */           aFh1rSDK.areAllFieldsValid = Boolean.valueOf(p0 != 2);
/* 48 */            return true;
                }

                private final boolean getMediationNetwork(int p0) {
                    String str;
/* 5 */             AFLogger aFLogger = AFLogger.INSTANCE;
/* 7 */             AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
/* 14 */            AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
/* 22 */            if (component2()) {
/* 24 */                CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
/* 28 */                Context context = this.getCurrencyIso4217Code.getMonetizationNetwork;
/* 30 */                context.getClass();
/* 37 */                if (cloudDevSdk.isCloudEnvironment(context)) {
/* 51 */                    AFa1uSDK aFa1uSDK = new AFa1uSDK(null, null, false, null, 15, null);
/* 57 */                    CountDownLatch countDownLatch = new CountDownLatch(1);
                            try {
/* 60 */                        CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
/* 64 */                        Context context2 = this.getCurrencyIso4217Code.getMonetizationNetwork;
/* 66 */                        context2.getClass();
/* 82 */                        cloudDevSdk2.request(context2, C1839a.m6210b("gaid"), new AFa1ySDK(aFa1uSDK, countDownLatch));
/* 99 */                        countDownLatch.await(((Number) this.component4.getValue()).longValue(), TimeUnit.MILLISECONDS);
/* 110 */                       if (aFa1uSDK.getGaidError().length() > 0) {
/* 122 */                           getRevenue(this.AFAdRevenueData, aFa1uSDK.getGaidError().toString());
                                }
                            } catch (Throwable th) {
                                try {
/* 131 */                           if (th instanceof InterruptedException) {
/* 133 */                               str = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                                    } else if (th instanceof ClassNotFoundException) {
/* 144 */                               str = "CloudDevSdk not found";
                                    } else {
/* 159 */                               str = "Unexpected exception while fetching GAID using Samsung Cloud Dev " + th.getMessage();
                                    }
/* 179 */                           AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, str, th, true, false, false, false, 112, null);
/* 182 */                           StringBuilder gaidError = aFa1uSDK.getGaidError();
/* 194 */                           gaidError.append(th.getClass().getSimpleName());
/* 199 */                           gaidError.append(" |");
/* 210 */                           if (aFa1uSDK.getGaidError().length() > 0) {
                                    }
                                } catch (Throwable th2) {
/* 268 */                           if (aFa1uSDK.getGaidError().length() > 0) {
/* 280 */                               getRevenue(this.AFAdRevenueData, aFa1uSDK.getGaidError().toString());
                                    }
/* 283 */                           throw th2;
                                }
                            }
/* 213 */                   String advertisingId = aFa1uSDK.getAdvertisingId();
/* 217 */                   if (advertisingId == null || advertisingId.length() == 0) {
/* 21 */                        return false;
                            }
/* 226 */                   AFh1rSDK aFh1rSDK = this.AFAdRevenueData;
/* 232 */                   aFh1rSDK.getMonetizationNetwork = aFa1uSDK.getAdvertisingId();
/* 234 */                   Boolean bool = Boolean.FALSE;
/* 236 */                   aFh1rSDK.component2 = bool;
/* 238 */                   Boolean bool2 = Boolean.TRUE;
/* 240 */                   aFh1rSDK.AFAdRevenueData = bool2;
/* 242 */                   aFh1rSDK.getRevenue = bool;
/* 244 */                   aFh1rSDK.getCurrencyIso4217Code = bool2;
/* 256 */                   aFh1rSDK.areAllFieldsValid = Boolean.valueOf(p0 != 2);
/* 56 */                    return true;
                        }
                    }
/* 289 */           AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
/* 21 */            return false;
                }

                private final boolean getMonetizationNetwork(int p0) {
/* 1 */             return getMediationNetwork(p0);
                }

                private final boolean getRevenue(Context p0, AFa1uSDK p1) throws IllegalStateException {
                    try {
/* 1 */                 AFb1vSDK.AFa1ySDK aFa1ySDKAFAdRevenueData = AFb1vSDK.AFAdRevenueData(p0);
/* 7 */                 p1.setAdvertisingId(aFa1ySDKAFAdRevenueData.getCurrencyIso4217Code);
/* 18 */                p1.setLimitAdTrackingEnabled(Boolean.valueOf(aFa1ySDKAFAdRevenueData.AFAdRevenueData()));
/* 21 */                String advertisingId = p1.getAdvertisingId();
/* 25 */                if (advertisingId == null || advertisingId.length() == 0) {
/* 44 */                    p1.getGaidError().append("emptyOrNull (bypass) |");
                        }
/* 49 */                if (Unit.f12910a != null) {
/* 51 */                    return true;
                        }
/* 59 */                p1.getGaidError().append("gpsAdInfo-null (bypass) |");
/* 69 */                throw new IllegalStateException("GpsAdInfo is null (bypass)");
                    } catch (Throwable th) {
/* 70 */                AFLogger aFLogger = AFLogger.INSTANCE;
/* 72 */                AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
/* 91 */                AFh1ySDK.e$default(aFLogger, aFg1cSDK, AbstractC0886en.m3507k("Failed to fetch GAID: ", th.getMessage()), th, true, false, false, false, 64, null);
/* 94 */                StringBuilder gaidError = p1.getGaidError();
/* 106 */               gaidError.append(th.getClass().getSimpleName());
/* 111 */               gaidError.append(" |");
/* 114 */               String localizedMessage = th.getLocalizedMessage();
/* 118 */               if (localizedMessage == null) {
/* 120 */                   localizedMessage = th.toString();
                        }
/* 130 */               AFh1ySDK.i$default(aFLogger, aFg1cSDK, localizedMessage, false, 4, null);
/* 133 */               return false;
                    }
                }

                @Override // com.appsflyer.internal.AFe1mSDK
                public final long AFAdRevenueData() {
/* 9 */             return ((Number) this.component4.getValue()).longValue();
                }

                @Override // com.appsflyer.internal.AFe1mSDK
/* 5 */         public final boolean getMonetizationNetwork() {
/* 6 */             return false;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00060\u0007j\u0002`\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010$R\u001e\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010'\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b(\u0010)"}, m6176d2 = {"Lcom/appsflyer/internal/AFe1eSDK$AFa1uSDK;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "advertisingId", HttpUrl.FRAGMENT_ENCODE_SET, "isLimitAdTrackingEnabled", "advertisingIdWithGps", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "gaidError", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "component4", "()Ljava/lang/StringBuilder;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFe1eSDK$AFa1uSDK;", "other", "equals", "(Ljava/lang/Object;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "Ljava/lang/StringBuilder;", "getGaidError", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 28 */        public static final /* data */ class AFa1uSDK {
                    private String advertisingId;
                    private boolean advertisingIdWithGps;
                    private final StringBuilder gaidError;
                    private Boolean isLimitAdTrackingEnabled;

                    public /* synthetic */ AFa1uSDK(String str, Boolean bool, boolean z, StringBuilder sb, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 26 */                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new StringBuilder() : sb);
                    }

                    public static /* synthetic */ AFa1uSDK copy$default(AFa1uSDK aFa1uSDK, String str, Boolean bool, boolean z, StringBuilder sb, int i, Object obj) {
/* 3 */                 if ((i & 1) != 0) {
/* 5 */                     str = aFa1uSDK.advertisingId;
                        }
/* 9 */                 if ((i & 2) != 0) {
/* 11 */                    bool = aFa1uSDK.isLimitAdTrackingEnabled;
                        }
/* 15 */                if ((i & 4) != 0) {
/* 17 */                    z = aFa1uSDK.advertisingIdWithGps;
                        }
/* 21 */                if ((i & 8) != 0) {
/* 23 */                    sb = aFa1uSDK.gaidError;
                        }
/* 25 */                return aFa1uSDK.copy(str, bool, z, sb);
                    }

                    /* JADX INFO: renamed from: component1, reason: from getter */
                    public final String getAdvertisingId() {
/* 1 */                 return this.advertisingId;
                    }

                    /* JADX INFO: renamed from: component2, reason: from getter */
                    public final Boolean getIsLimitAdTrackingEnabled() {
/* 1 */                 return this.isLimitAdTrackingEnabled;
                    }

                    /* JADX INFO: renamed from: component3, reason: from getter */
                    public final boolean getAdvertisingIdWithGps() {
/* 1 */                 return this.advertisingIdWithGps;
                    }

                    /* JADX INFO: renamed from: component4, reason: from getter */
                    public final StringBuilder getGaidError() {
/* 1 */                 return this.gaidError;
                    }

                    public final AFa1uSDK copy(String advertisingId, Boolean isLimitAdTrackingEnabled, boolean advertisingIdWithGps, StringBuilder gaidError) {
/* 1 */                 gaidError.getClass();
/* 6 */                 return new AFa1uSDK(advertisingId, isLimitAdTrackingEnabled, advertisingIdWithGps, gaidError);
                    }

                    public final boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
/* 8 */                 if (!(other instanceof AFa1uSDK)) {
/* 7 */                     return false;
                        }
/* 11 */                AFa1uSDK aFa1uSDK = (AFa1uSDK) other;
                        return Intrinsics.m6216a(this.advertisingId, aFa1uSDK.advertisingId) && Intrinsics.m6216a(this.isLimitAdTrackingEnabled, aFa1uSDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1uSDK.advertisingIdWithGps && Intrinsics.m6216a(this.gaidError, aFa1uSDK.gaidError);
                    }

                    public final String getAdvertisingId() {
/* 1 */                 return this.advertisingId;
                    }

                    public final boolean getAdvertisingIdWithGps() {
/* 1 */                 return this.advertisingIdWithGps;
                    }

                    public final StringBuilder getGaidError() {
/* 1 */                 return this.gaidError;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
                    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
                    /* JADX WARN: Type inference failed for: r1v4 */
                    /* JADX WARN: Type inference failed for: r1v6 */
                    public final int hashCode() {
/* 1 */                 String str = this.advertisingId;
/* 12 */                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
/* 14 */                Boolean bool = this.isLimitAdTrackingEnabled;
/* 24 */                int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
/* 26 */                boolean z = this.advertisingIdWithGps;
                        ?? r1 = z;
/* 28 */                if (z) {
/* 30 */                    r1 = 1;
                        }
/* 40 */                return this.gaidError.hashCode() + ((iHashCode2 + r1) * 31);
                    }

                    public final Boolean isLimitAdTrackingEnabled() {
/* 1 */                 return this.isLimitAdTrackingEnabled;
                    }

                    public final void setAdvertisingId(String str) {
/* 1 */                 this.advertisingId = str;
                    }

                    public final void setAdvertisingIdWithGps(boolean z) {
/* 1 */                 this.advertisingIdWithGps = z;
                    }

                    public final void setLimitAdTrackingEnabled(Boolean bool) {
/* 1 */                 this.isLimitAdTrackingEnabled = bool;
                    }

                    public final String toString() {
/* 48 */                return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
                    }

/* 29 */            public AFa1uSDK(String str, Boolean bool, boolean z, StringBuilder sb) {
                        sb.getClass();
/* 31 */                this.advertisingId = str;
/* 32 */                this.isLimitAdTrackingEnabled = bool;
/* 33 */                this.advertisingIdWithGps = z;
/* 34 */                this.gaidError = sb;
                    }

/* 34 */            public AFa1uSDK() {
/* 35 */                this(null, null, false, null, 15, null);
                    }
                }

/* 134 */       private static int getRevenue(Context p0) {
                    try {
/* 136 */               return pr0.f15259d.m8004c(p0, qr0.f15711a);
                    } catch (Throwable th) {
/* 137 */               AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th, false, false, false, false, 96, null);
                        return -1;
                    }
                }

                @Override // com.appsflyer.internal.AFe1mSDK
/* 137 */       public final AFe1uSDK getRevenue() {
                    AFe1uSDK aFe1uSDK;
/* 138 */           if (this.areAllFieldsValid.AFAdRevenueData()) {
/* 139 */               AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
/* 140 */               return AFe1uSDK.FAILURE;
                    }
/* 141 */           long jCurrentTimeMillis = System.currentTimeMillis();
/* 142 */           Boolean boolValueOf = Boolean.valueOf(copydefault());
                    Boolean bool = Boolean.FALSE;
                    if (C2085pw.m7566e(boolValueOf, bool, bool).contains(Boolean.TRUE)) {
/* 143 */               aFe1uSDK = AFe1uSDK.SUCCESS;
                    } else {
/* 144 */               aFe1uSDK = AFe1uSDK.FAILURE;
                    }
/* 145 */           AFc1eSDK aFc1eSDK = this.areAllFieldsValid;
/* 147 */           AFd1aSDK aFd1aSDK = new AFd1aSDK(System.currentTimeMillis() - jCurrentTimeMillis);
/* 148 */           AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: FetchAdvertisingIdTask: took " + aFd1aSDK.getMediationNetwork + "ms", false, 4, null);
/* 149 */           aFc1eSDK.getMediationNetwork(aFd1aSDK);
                    return aFe1uSDK;
                }

/* 149 */       private static void getRevenue(AFh1rSDK aFh1rSDK, String str) {
                    if (str == null) {
                        return;
                    }
/* 150 */           String str2 = aFh1rSDK.getMediationNetwork;
                    if (str2 != null) {
/* 152 */               str = AbstractC0886en.m3508l(str2, " | ", str);
                    }
/* 153 */           aFh1rSDK.getMediationNetwork = str;
                }

/* 188 */       private final boolean getCurrencyIso4217Code(Context p0, AFa1uSDK p1) throws IllegalStateException {
                    Unit unit;
                    try {
/* 189 */               AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(p0);
                        if (advertisingIdInfo != null) {
/* 190 */                   p1.setAdvertisingId(advertisingIdInfo.getId());
/* 191 */                   p1.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
/* 192 */                   p1.setAdvertisingIdWithGps(true);
/* 193 */                   String advertisingId = p1.getAdvertisingId();
                            if (advertisingId == null || advertisingId.length() == 0) {
/* 194 */                       p1.getGaidError().append("emptyOrNull |");
                            }
/* 195 */                   unit = Unit.f12910a;
                        } else {
                            unit = null;
                        }
                        if (unit != null) {
                            return true;
                        }
/* 196 */               p1.getGaidError().append("gpsAdInfo-null |");
/* 197 */               throw new IllegalStateException("GpsAdIndo is null");
                    } catch (Throwable th) {
/* 198 */               AFLogger aFLogger = AFLogger.INSTANCE;
/* 199 */               AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
/* 202 */               AFh1ySDK.e$default(aFLogger, aFg1cSDK, AbstractC0886en.m3507k("Google Play Services is missing ", th.getMessage()), th, false, false, false, false, 88, null);
/* 203 */               StringBuilder gaidError = p1.getGaidError();
                        gaidError.append(th.getClass().getSimpleName());
                        gaidError.append(" |");
/* 204 */               AFh1ySDK.i$default(aFLogger, aFg1cSDK, "WARNING: Google Play Services is missing.", false, 4, null);
                        return false;
                    }
                }
            }
