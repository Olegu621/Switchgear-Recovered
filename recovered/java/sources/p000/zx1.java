            package p000;

            import android.text.TextUtils;
            import java.util.ArrayList;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zx1 {

                /* JADX INFO: renamed from: a */
                public final String f20365a;

                /* JADX INFO: renamed from: b */
                public final JSONObject f20366b;

                /* JADX INFO: renamed from: c */
                public final String f20367c;

                /* JADX INFO: renamed from: d */
                public final String f20368d;

                /* JADX INFO: renamed from: e */
                public final String f20369e;

                /* JADX INFO: renamed from: f */
                public final String f20370f;

                /* JADX INFO: renamed from: g */
                public final String f20371g;

                /* JADX INFO: renamed from: h */
                public final String f20372h;

                /* JADX INFO: renamed from: i */
                public final String f20373i;

                /* JADX INFO: renamed from: j */
                public final ArrayList f20374j;

                /* JADX INFO: renamed from: k */
                public final ArrayList f20375k;

                public zx1(String str) throws JSONException {
/* 8 */             this.f20365a = str;
/* 12 */            JSONObject jSONObject = new JSONObject(str);
/* 15 */            this.f20366b = jSONObject;
/* 19 */            String strOptString = jSONObject.optString("productId");
/* 23 */            this.f20367c = strOptString;
/* 27 */            String strOptString2 = jSONObject.optString("type");
/* 31 */            this.f20368d = strOptString2;
/* 37 */            if (TextUtils.isEmpty(strOptString)) {
/* 404 */               C1951n4.m6859j("Product id cannot be empty.");
/* 407 */               throw null;
                    }
/* 43 */            if (TextUtils.isEmpty(strOptString2)) {
/* 397 */               C1951n4.m6859j("Product type cannot be empty.");
/* 400 */               throw null;
                    }
/* 51 */            this.f20369e = jSONObject.optString("title");
/* 59 */            this.f20370f = jSONObject.optString("name");
/* 67 */            this.f20371g = jSONObject.optString("description");
/* 71 */            jSONObject.optString("packageDisplayName");
/* 76 */            jSONObject.optString("iconUrl");
/* 85 */            this.f20372h = jSONObject.optString("skuDetailsToken");
/* 93 */            this.f20373i = jSONObject.optString("serializedDocid");
/* 97 */            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
/* 101 */           if (jSONArrayOptJSONArray != null) {
/* 105 */               ArrayList arrayList = new ArrayList();
/* 113 */               for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
/* 117 */                   JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
/* 123 */                   zb0 zb0Var = new zb0(26);
/* 128 */                   jSONObject2.optString("basePlanId");
/* 137 */                   jSONObject2.optString("offerId").getClass();
/* 142 */                   jSONObject2.getString("offerIdToken");
/* 147 */                   JSONArray jSONArray = jSONObject2.getJSONArray("pricingPhases");
/* 153 */                   ArrayList arrayList2 = new ArrayList();
/* 156 */                   if (jSONArray != null) {
/* 163 */                       for (int i2 = 0; i2 < jSONArray.length(); i2++) {
/* 165 */                           JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
/* 169 */                           if (jSONObjectOptJSONObject != null) {
/* 176 */                               arrayList2.add(new ec0(jSONObjectOptJSONObject));
                                    }
                                }
                            }
/* 184 */                   JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("installmentPlanDetails");
/* 188 */                   if (jSONObjectOptJSONObject2 != null) {
/* 193 */                       jSONObjectOptJSONObject2.getInt("commitmentPaymentsCount");
/* 198 */                       jSONObjectOptJSONObject2.optInt("subsequentCommitmentPaymentsCount");
                            }
/* 203 */                   JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("transitionPlanDetails");
/* 207 */                   if (jSONObjectOptJSONObject3 != null) {
/* 210 */                       jSONObjectOptJSONObject3.getString("productId");
/* 213 */                       jSONObjectOptJSONObject3.optString("title");
/* 216 */                       jSONObjectOptJSONObject3.optString("name");
/* 219 */                       jSONObjectOptJSONObject3.optString("description");
/* 222 */                       jSONObjectOptJSONObject3.optString("basePlanId");
/* 227 */                       JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("pricingPhase");
/* 231 */                       if (jSONObjectOptJSONObject4 != null) {
/* 235 */                           jSONObjectOptJSONObject4.optString("billingPeriod");
/* 240 */                           jSONObjectOptJSONObject4.optString("priceCurrencyCode");
/* 245 */                           jSONObjectOptJSONObject4.optString("formattedPrice");
/* 250 */                           jSONObjectOptJSONObject4.optLong("priceAmountMicros");
/* 255 */                           jSONObjectOptJSONObject4.optInt("recurrenceMode");
/* 260 */                           jSONObjectOptJSONObject4.optInt("billingCycleCount");
                                }
                            }
/* 265 */                   ArrayList arrayList3 = new ArrayList();
/* 270 */                   JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("offerTags");
/* 274 */                   if (jSONArrayOptJSONArray2 != null) {
/* 281 */                       for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
/* 287 */                           arrayList3.add(jSONArrayOptJSONArray2.getString(i3));
                                }
                            }
/* 293 */                   arrayList.add(zb0Var);
                        }
/* 300 */               this.f20374j = arrayList;
                    } else {
/* 327 */               this.f20374j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
                    }
/* 333 */           JSONObject jSONObjectOptJSONObject5 = this.f20366b.optJSONObject("oneTimePurchaseOfferDetails");
/* 341 */           JSONArray jSONArrayOptJSONArray3 = this.f20366b.optJSONArray("oneTimePurchaseOfferDetailsList");
/* 347 */           ArrayList arrayList4 = new ArrayList();
/* 350 */           if (jSONArrayOptJSONArray3 != null) {
/* 357 */               for (int i4 = 0; i4 < jSONArrayOptJSONArray3.length(); i4++) {
/* 368 */                   arrayList4.add(new yx1(jSONArrayOptJSONArray3.getJSONObject(i4)));
                        }
/* 374 */               this.f20375k = arrayList4;
/* 376 */               return;
                    }
/* 377 */           if (jSONObjectOptJSONObject5 == null) {
/* 391 */               this.f20375k = null;
                    } else {
/* 384 */               arrayList4.add(new yx1(jSONObjectOptJSONObject5));
/* 387 */               this.f20375k = arrayList4;
                    }
                }

                /* JADX INFO: renamed from: a */
                public final yx1 m10449a() {
/* 1 */             ArrayList arrayList = this.f20375k;
/* 3 */             if (arrayList == null || arrayList.isEmpty()) {
/* 19 */                return null;
                    }
/* 16 */            return (yx1) arrayList.get(0);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof zx1) {
/* 17 */                return TextUtils.equals(this.f20365a, ((zx1) obj).f20365a);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.f20365a.hashCode();
                }

                public final String toString() {
/* 3 */             String string = this.f20366b.toString();
/* 9 */             String strValueOf = String.valueOf(this.f20374j);
/* 17 */            StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
/* 26 */            fm0.m3796v(sb, this.f20365a, "', parsedJson=", string, ", productId='");
/* 31 */            sb.append(this.f20367c);
/* 36 */            sb.append("', productType='");
/* 41 */            sb.append(this.f20368d);
/* 46 */            sb.append("', title='");
/* 51 */            sb.append(this.f20369e);
/* 56 */            sb.append("', productDetailsToken='");
/* 65 */            return fm0.m3791q(sb, this.f20372h, "', subscriptionOfferDetails=", strValueOf, "}");
                }
            }
