            package com.appsflyer;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, m6176d2 = {"Lcom/appsflyer/AFPurchaseType;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", FirebaseAnalytics.Param.VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "SUBSCRIPTION", "ONE_TIME_PURCHASE"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public enum AFPurchaseType {
                SUBSCRIPTION("subscription"),
                ONE_TIME_PURCHASE("one_time_purchase");

                private final String value;

                AFPurchaseType(String str) {
/* 4 */             this.value = str;
                }

                public final String getValue() {
/* 1 */             return this.value;
                }
            }
