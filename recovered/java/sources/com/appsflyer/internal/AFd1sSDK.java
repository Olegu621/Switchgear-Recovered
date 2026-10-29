            package com.appsflyer.internal;

            import java.util.ArrayList;
            import kotlin.Metadata;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function1;
            import kotlin.text.C1852e;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.b51;
            import p000.jf0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFd1sSDK {

                /* JADX INFO: renamed from: com.appsflyer.internal.AFd1sSDK$4 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
                @Metadata(m6175d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, m6176d2 = {"Ljava/lang/StackTraceElement;", "p0", HttpUrl.FRAGMENT_ENCODE_SET, "getCurrencyIso4217Code", "(Ljava/lang/StackTraceElement;)Ljava/lang/CharSequence;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C02504 extends b51 implements Function1<StackTraceElement, CharSequence> {
                    public static final C02504 getCurrencyIso4217Code = new C02504();

                    public C02504() {
/* 2 */                 super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
                    public final CharSequence invoke(StackTraceElement stackTraceElement) {
/* 1 */                 stackTraceElement.getClass();
/* 14 */                return "at " + stackTraceElement;
                    }
                }

                private static String AFAdRevenueData(Throwable th) {
/* 1 */             th.getClass();
/* 4 */             StackTraceElement[] stackTrace = th.getStackTrace();
/* 8 */             stackTrace.getClass();
/* 13 */            ArrayList arrayList = new ArrayList();
/* 19 */            for (StackTraceElement stackTraceElement : stackTrace) {
/* 23 */                String className = stackTraceElement.getClassName();
/* 27 */                className.getClass();
/* 36 */                if (!C1852e.m6263m(className, "com.appsflyer", false)) {
/* 39 */                    stackTraceElement = null;
                        }
/* 40 */                if (stackTraceElement != null) {
/* 42 */                    arrayList.add(stackTraceElement);
                        }
                    }
/* 82 */            return AFd1rSDK.AFAdRevenueData(th + "\n" + CollectionsKt.m6203x(arrayList, "\n", null, null, C02504.getCurrencyIso4217Code, 30), "SHA-256");
                }

                public static final AFc1aSDK getRevenue(Throwable th, String str) {
/* 1 */             th.getClass();
/* 4 */             str.getClass();
/* 9 */             th.getClass();
/* 38 */            return new AFc1aSDK(AbstractC0886en.m3508l(th.getClass().getName(), ": ", str), AFAdRevenueData(th), jf0.m5799b(th), 0, 8, null);
                }
            }
