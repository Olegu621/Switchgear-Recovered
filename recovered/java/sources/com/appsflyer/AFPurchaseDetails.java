            package com.appsflyer;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0017\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\n"}, m6176d2 = {"Lcom/appsflyer/AFPurchaseDetails;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/appsflyer/AFPurchaseType;", "purchaseType", HttpUrl.FRAGMENT_ENCODE_SET, "purchaseToken", "productId", "<init>", "(Lcom/appsflyer/AFPurchaseType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/appsflyer/AFPurchaseType;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/appsflyer/AFPurchaseType;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/AFPurchaseDetails;", "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "()I", "toString", "Ljava/lang/String;", "getProductId", "getPurchaseToken", "Lcom/appsflyer/AFPurchaseType;", "getPurchaseType"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final /* data */ class AFPurchaseDetails {
                private final String productId;
                private final String purchaseToken;
                private final AFPurchaseType purchaseType;

                public AFPurchaseDetails(AFPurchaseType aFPurchaseType, String str, String str2) {
/* 1 */             aFPurchaseType.getClass();
/* 4 */             str.getClass();
/* 7 */             str2.getClass();
/* 13 */            this.purchaseType = aFPurchaseType;
/* 15 */            this.purchaseToken = str;
/* 17 */            this.productId = str2;
                }

                public static /* synthetic */ AFPurchaseDetails copy$default(AFPurchaseDetails aFPurchaseDetails, AFPurchaseType aFPurchaseType, String str, String str2, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 aFPurchaseType = aFPurchaseDetails.purchaseType;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str = aFPurchaseDetails.purchaseToken;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                str2 = aFPurchaseDetails.productId;
                    }
/* 19 */            return aFPurchaseDetails.copy(aFPurchaseType, str, str2);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final AFPurchaseType getPurchaseType() {
/* 1 */             return this.purchaseType;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getPurchaseToken() {
/* 1 */             return this.purchaseToken;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final String getProductId() {
/* 1 */             return this.productId;
                }

                public final AFPurchaseDetails copy(AFPurchaseType purchaseType, String purchaseToken, String productId) {
/* 1 */             purchaseType.getClass();
/* 4 */             purchaseToken.getClass();
/* 7 */             productId.getClass();
/* 12 */            return new AFPurchaseDetails(purchaseType, purchaseToken, productId);
                }

                public final boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof AFPurchaseDetails)) {
/* 7 */                 return false;
                    }
/* 11 */            AFPurchaseDetails aFPurchaseDetails = (AFPurchaseDetails) other;
                    return this.purchaseType == aFPurchaseDetails.purchaseType && Intrinsics.m6216a(this.purchaseToken, aFPurchaseDetails.purchaseToken) && Intrinsics.m6216a(this.productId, aFPurchaseDetails.productId);
                }

                public final String getProductId() {
/* 1 */             return this.productId;
                }

                public final String getPurchaseToken() {
/* 1 */             return this.purchaseToken;
                }

                public final AFPurchaseType getPurchaseType() {
/* 1 */             return this.purchaseType;
                }

                public final int hashCode() {
/* 24 */            return this.productId.hashCode() + ((this.purchaseToken.hashCode() + (this.purchaseType.hashCode() * 31)) * 31);
                }

                public final String toString() {
/* 1 */             AFPurchaseType aFPurchaseType = this.purchaseType;
/* 3 */             String str = this.purchaseToken;
/* 5 */             String str2 = this.productId;
/* 11 */            StringBuilder sb = new StringBuilder("AFPurchaseDetails(purchaseType=");
/* 14 */            sb.append(aFPurchaseType);
/* 19 */            sb.append(", purchaseToken=");
/* 22 */            sb.append(str);
/* 27 */            sb.append(", productId=");
/* 32 */            return fm0.m3789o(sb, str2, ")");
                }
            }
