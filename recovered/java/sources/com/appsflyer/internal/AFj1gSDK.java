            package com.appsflyer.internal;

            import android.content.Intent;
            import android.os.Parcelable;
            import com.appsflyer.AFLogger;
            import java.util.ConcurrentModificationException;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function0;
            import okhttp3.HttpUrl;
            import p000.C2103qd;
            import p000.b51;
            import p000.fm0;
            import p000.j22;
            import p000.m42;
            import p000.n42;
            import p000.o21;
            import p000.o42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 100 */   public final class AFj1gSDK {
                final Intent getCurrencyIso4217Code;

                /* JADX INFO: Add missing generic type declarations: [T] */
                /* JADX INFO: renamed from: com.appsflyer.internal.AFj1gSDK$2 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m6176d2 = {"Landroid/os/Parcelable;", "T", "J_", "()Landroid/os/Parcelable;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02792<T> extends b51 implements Function0<T> {
                    private /* synthetic */ String $AFAdRevenueData;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C02792(String str) {
/* 6 */                 super(0);
/* 3 */                 this.$AFAdRevenueData = str;
                    }

                    /* JADX WARN: Incorrect return type in method signature: ()TT; */
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: J_, reason: merged with bridge method [inline-methods] */
                    public final Parcelable invoke() {
/* 7 */                 return AFj1gSDK.this.getCurrencyIso4217Code.getParcelableExtra(this.$AFAdRevenueData);
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.internal.AFj1gSDK$3 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m6176d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "getMediationNetwork", "()Ljava/lang/String;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02803 extends b51 implements Function0<String> {
                    private /* synthetic */ String $AFAdRevenueData;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C02803(String str) {
/* 6 */                 super(0);
/* 3 */                 this.$AFAdRevenueData = str;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
/* 7 */                 return AFj1gSDK.this.getCurrencyIso4217Code.getStringExtra(this.$AFAdRevenueData);
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.internal.AFj1gSDK$4 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m6176d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "getCurrencyIso4217Code", "()Ljava/lang/Boolean;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02814 extends b51 implements Function0<Boolean> {
                    private /* synthetic */ String $getMonetizationNetwork;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C02814(String str) {
/* 6 */                 super(0);
/* 3 */                 this.$getMonetizationNetwork = str;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke() {
/* 11 */                return Boolean.valueOf(AFj1gSDK.this.getCurrencyIso4217Code.hasExtra(this.$getMonetizationNetwork));
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.internal.AFj1gSDK$5 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m6176d2 = {"Landroid/content/Intent;", "K_", "()Landroid/content/Intent;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02825 extends b51 implements Function0<Intent> {
                    private /* synthetic */ long $AFAdRevenueData;
                    private /* synthetic */ String $getMonetizationNetwork;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C02825(String str, long j) {
/* 8 */                 super(0);
/* 3 */                 this.$getMonetizationNetwork = str;
/* 5 */                 this.$AFAdRevenueData = j;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: K_, reason: merged with bridge method [inline-methods] */
                    public final Intent invoke() {
/* 9 */                 return AFj1gSDK.this.getCurrencyIso4217Code.putExtra(this.$getMonetizationNetwork, this.$AFAdRevenueData);
                    }
                }

                public AFj1gSDK(Intent intent) {
/* 1 */             intent.getClass();
/* 7 */             this.getCurrencyIso4217Code = intent;
                }

                private final <T> T getMediationNetwork(Function0<? extends T> function0, String str, T t, boolean z) {
                    Object n42Var;
                    Object mediationNetwork;
                    synchronized (this.getCurrencyIso4217Code) {
                        try {
/* 4 */                     m42 m42Var = o42.f14612b;
/* 6 */                     n42Var = function0.invoke();
                        } catch (Throwable th) {
/* 12 */                    m42 m42Var2 = o42.f14612b;
/* 16 */                    n42Var = new n42(th);
                        }
/* 33 */                o21[] o21VarArr = {j22.m5667a(ConcurrentModificationException.class), j22.m5667a(ArrayIndexOutOfBoundsException.class)};
/* 41 */                Throwable thM7099a = o42.m7099a(n42Var);
/* 45 */                if (thM7099a != null) {
                            try {
/* 60 */                        if (!C2103qd.m7772g(o21VarArr, j22.m5667a(thM7099a.getClass()))) {
/* 77 */                            throw thM7099a;
                                }
/* 62 */                        if (z) {
/* 64 */                            mediationNetwork = getMediationNetwork(function0, str, t, false);
                                } else {
/* 71 */                            AFLogger.afErrorLog(str, thM7099a, false, false);
/* 74 */                            mediationNetwork = t;
                                }
/* 75 */                        n42Var = mediationNetwork;
                            } catch (Throwable th2) {
/* 78 */                        m42 m42Var3 = o42.f14612b;
/* 82 */                        n42Var = new n42(th2);
                            }
                        }
/* 86 */                Throwable thM7099a2 = o42.m7099a(n42Var);
/* 90 */                if (thM7099a2 == null) {
/* 92 */                    t = (T) n42Var;
                        } else {
/* 94 */                    AFLogger.afErrorLog(str, thM7099a2, false, false);
                        }
                    }
                    return t;
                }

                public final String AFAdRevenueData(String str) {
/* 1 */             str.getClass();
/* 23 */            return (String) getMediationNetwork(new C02803(str), fm0.m3784j("Error while trying to read ", str, " extra from intent"), null, true);
                }

                /* JADX INFO: renamed from: H_ */
                public final <T extends Parcelable> T m1825H_(String str) {
/* 1 */             str.getClass();
/* 23 */            return (T) getMediationNetwork(new C02792(str), fm0.m3784j("Error while trying to read ", str, " extra from intent"), null, true);
                }

                /* JADX INFO: renamed from: I_ */
                public final Intent m1826I_(String str, long j) {
/* 1 */             str.getClass();
/* 23 */            return (Intent) getMediationNetwork(new C02825(str, j), fm0.m3784j("Error while trying to write ", str, " extra to intent"), null, true);
                }

/* 101 */       public final boolean getMediationNetwork(String str) {
                    str.getClass();
/* 107 */           Boolean bool = (Boolean) getMediationNetwork(new C02814(str), fm0.m3784j("Error while trying to check presence of ", str, " extra from intent"), Boolean.TRUE, true);
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    return true;
                }
            }
